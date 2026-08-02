package com.nimbusds.jose.jwk.gen;

import com.google.crypto.tink.subtle.Ed25519Sign;
import com.google.crypto.tink.subtle.X25519;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.OctetKeyPair;
import com.nimbusds.jose.util.Base64URL;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes8.dex */
public class OctetKeyPairGenerator extends JWKGenerator<OctetKeyPair> {
    public static final Set<Curve> SUPPORTED_CURVES;
    private final Curve crv;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(Curve.X25519);
        linkedHashSet.add(Curve.Ed25519);
        SUPPORTED_CURVES = Collections.unmodifiableSet(linkedHashSet);
    }

    public OctetKeyPairGenerator(Curve curve) {
        if (curve == null) {
            throw new IllegalArgumentException("The curve must not be null");
        }
        if (!SUPPORTED_CURVES.contains(curve)) {
            throw new IllegalArgumentException("Curve not supported for OKP generation");
        }
        this.crv = curve;
    }

    @Override // com.nimbusds.jose.jwk.gen.JWKGenerator
    public OctetKeyPair generate() throws JOSEException {
        Base64URL encode;
        Base64URL encode2;
        if (this.crv.equals(Curve.X25519)) {
            try {
                byte[] generatePrivateKey = X25519.generatePrivateKey();
                byte[] publicFromPrivate = X25519.publicFromPrivate(generatePrivateKey);
                encode = Base64URL.encode(generatePrivateKey);
                encode2 = Base64URL.encode(publicFromPrivate);
            } catch (InvalidKeyException e) {
                throw new JOSEException(e.getMessage(), e);
            }
        } else if (this.crv.equals(Curve.Ed25519)) {
            try {
                Ed25519Sign.KeyPair newKeyPair = Ed25519Sign.KeyPair.newKeyPair();
                Base64URL encode3 = Base64URL.encode(newKeyPair.getPrivateKey());
                encode2 = Base64URL.encode(newKeyPair.getPublicKey());
                encode = encode3;
            } catch (GeneralSecurityException e2) {
                throw new JOSEException(e2.getMessage(), e2);
            }
        } else {
            throw new JOSEException("Curve not supported");
        }
        OctetKeyPair.Builder issueTime = new OctetKeyPair.Builder(this.crv, encode2).d(encode).keyUse(this.use).keyOperations(this.ops).algorithm(this.alg).expirationTime(this.exp).notBeforeTime(this.nbf).issueTime(this.iat);
        if (this.x5tKid) {
            issueTime.keyIDFromThumbprint();
        } else {
            issueTime.keyID(this.kid);
        }
        return issueTime.build();
    }
}
