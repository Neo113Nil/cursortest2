package com.nimbusds.jose.crypto;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEEncrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.crypto.impl.AAD;
import com.nimbusds.jose.crypto.impl.ECDH1PU;
import com.nimbusds.jose.crypto.impl.ECDH1PUCryptoProvider;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.OctetKeyPair;
import com.nimbusds.jose.jwk.gen.OctetKeyPairGenerator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import javax.crypto.SecretKey;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
/* loaded from: classes8.dex */
public class ECDH1PUX25519Encrypter extends ECDH1PUCryptoProvider implements JWEEncrypter {
    private final OctetKeyPair privateKey;
    private final OctetKeyPair publicKey;

    public ECDH1PUX25519Encrypter(OctetKeyPair octetKeyPair, OctetKeyPair octetKeyPair2) throws JOSEException {
        this(octetKeyPair, octetKeyPair2, null);
    }

    public ECDH1PUX25519Encrypter(OctetKeyPair octetKeyPair, OctetKeyPair octetKeyPair2, SecretKey secretKey) throws JOSEException {
        super(octetKeyPair2.getCurve(), secretKey);
        this.publicKey = octetKeyPair2;
        this.privateKey = octetKeyPair;
    }

    @Override // com.nimbusds.jose.crypto.impl.ECDH1PUCryptoProvider
    public Set<Curve> supportedEllipticCurves() {
        return Collections.singleton(Curve.X25519);
    }

    public OctetKeyPair getPublicKey() {
        return this.publicKey;
    }

    public OctetKeyPair getPrivateKey() {
        return this.privateKey;
    }

    @Deprecated
    public JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr) throws JOSEException {
        return encrypt(jWEHeader, bArr, AAD.compute(jWEHeader));
    }

    @Override // com.nimbusds.jose.JWEEncrypter
    public JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr, byte[] bArr2) throws JOSEException {
        OctetKeyPair generate = new OctetKeyPairGenerator(getCurve()).generate();
        JWEHeader build = new JWEHeader.Builder(jWEHeader).ephemeralPublicKey(generate.toPublicJWK()).build();
        SecretKey deriveSenderZ = ECDH1PU.deriveSenderZ(this.privateKey, this.publicKey, generate);
        if (Arrays.equals(AAD.compute(jWEHeader), bArr2)) {
            bArr2 = AAD.compute(build);
        }
        return encryptWithZ(build, deriveSenderZ, bArr, bArr2);
    }
}
