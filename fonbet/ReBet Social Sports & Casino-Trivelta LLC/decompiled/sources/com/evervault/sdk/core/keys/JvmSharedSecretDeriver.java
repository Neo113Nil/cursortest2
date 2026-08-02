package com.evervault.sdk.core.keys;

import com.evervault.sdk.core.exceptions.Asn1EncodingException;
import com.evervault.sdk.core.models.Secp256r1Constants;
import com.evervault.sdk.core.services.DEREncoder;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.ECGenParameterSpec;
import javax.crypto.KeyAgreement;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey;
import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECPublicKeySpec;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/evervault/sdk/core/keys/JvmSharedSecretDeriver;", "Lcom/evervault/sdk/core/keys/SharedSecretDeriver;", "()V", "provider", "Lorg/bouncycastle/jce/provider/BouncyCastleProvider;", "deriveSharedSecret", "Lcom/evervault/sdk/core/keys/GeneratedSharedKey;", "cageKey", "Lcom/evervault/sdk/core/keys/CageKey;", "generateNewKeyPair", "Ljava/security/KeyPair;", "generateSharedKeyBasedOn", "teamCagePublicKey", "Ljava/security/PublicKey;", "getEllipticCurvePublicKeyFrom", "base64key", "", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class JvmSharedSecretDeriver implements SharedSecretDeriver {

    @NotNull
    private final BouncyCastleProvider provider = new BouncyCastleProvider();

    private final KeyPair generateNewKeyPair() {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", this.provider);
        keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"), new SecureRandom());
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        Intrinsics.checkNotNullExpressionValue(generateKeyPair, "keyPairGenerator.generateKeyPair()");
        return generateKeyPair;
    }

    private final GeneratedSharedKey generateSharedKeyBasedOn(PublicKey teamCagePublicKey) {
        KeyPair generateNewKeyPair = generateNewKeyPair();
        KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH", this.provider);
        Intrinsics.checkNotNullExpressionValue(keyAgreement, "getInstance(\"ECDH\", provider)");
        keyAgreement.init(generateNewKeyPair.getPrivate());
        keyAgreement.doPhase(teamCagePublicKey, true);
        PublicKey publicKey = generateNewKeyPair.getPublic();
        Intrinsics.checkNotNull(publicKey, "null cannot be cast to non-null type org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey");
        byte[] generatedPublicKey = ((BCECPublicKey) publicKey).getQ().getEncoded(true);
        byte[] generateSecret = keyAgreement.generateSecret();
        byte[] array = ByteBuffer.allocate(4).putInt(1).array();
        PublicKey publicKey2 = generateNewKeyPair.getPublic();
        Intrinsics.checkNotNull(publicKey2, "null cannot be cast to non-null type org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey");
        byte[] uncompressedKey = ((BCECPublicKey) publicKey2).getQ().getEncoded(false);
        DEREncoder dEREncoder = new DEREncoder(new Secp256r1Constants(null, null, null, null, null, null, null, 127, null));
        try {
            Intrinsics.checkNotNullExpressionValue(uncompressedKey, "uncompressedKey");
            byte[] publicKeyToDer = dEREncoder.publicKeyToDer(uncompressedKey);
            byte[] array2 = ByteBuffer.allocate(generateSecret.length + array.length + publicKeyToDer.length).put(generateSecret).put(array).put(publicKeyToDer).array();
            SHA256Digest sHA256Digest = new SHA256Digest();
            byte[] bArr = new byte[sHA256Digest.getDigestSize()];
            sHA256Digest.update(array2, 0, array2.length);
            sHA256Digest.doFinal(bArr, 0);
            Intrinsics.checkNotNullExpressionValue(generatedPublicKey, "generatedPublicKey");
            return new GeneratedSharedKey(generatedPublicKey, bArr);
        } catch (Exception unused) {
            throw Asn1EncodingException.INSTANCE;
        }
    }

    private final PublicKey getEllipticCurvePublicKeyFrom(String base64key) {
        byte[] decode$default = Base64.decode$default(Base64.INSTANCE, base64key, 0, 0, 6, (Object) null);
        ECNamedCurveParameterSpec parameterSpec = ECNamedCurveTable.getParameterSpec("secp256r1");
        PublicKey generatePublic = KeyFactory.getInstance("ECDH", this.provider).generatePublic(new ECPublicKeySpec(parameterSpec.getCurve().decodePoint(decode$default), parameterSpec));
        Intrinsics.checkNotNullExpressionValue(generatePublic, "keyFactory.generatePublic(publicKeySpec)");
        return generatePublic;
    }

    @Override // com.evervault.sdk.core.keys.SharedSecretDeriver
    @NotNull
    public GeneratedSharedKey deriveSharedSecret(@NotNull CageKey cageKey) {
        Intrinsics.checkNotNullParameter(cageKey, "cageKey");
        return generateSharedKeyBasedOn(getEllipticCurvePublicKeyFrom(cageKey.getEcdhP256KeyUncompressed()));
    }
}
