package c;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* renamed from: c.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2462q {

    /* renamed from: b, reason: collision with root package name */
    public static final Ac.f f26654b = new Ac.f(null);

    /* renamed from: a, reason: collision with root package name */
    public final ECPublicKey f26655a;

    public C2462q(byte[] derPublicKey) {
        Intrinsics.checkNotNullParameter(derPublicKey, "derPublicKey");
        PublicKey generatePublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(derPublicKey));
        Intrinsics.checkNotNull(generatePublic, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
        this.f26655a = (ECPublicKey) generatePublic;
    }

    public final String a(byte[] plaintext) {
        byte[] d10;
        byte[] e10;
        Intrinsics.checkNotNullParameter(plaintext, "plaintext");
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        PublicKey publicKey = generateKeyPair.getPublic();
        Intrinsics.checkNotNull(publicKey, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
        Ac.f fVar = f26654b;
        d10 = fVar.d((ECPublicKey) publicKey);
        KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
        keyAgreement.init(generateKeyPair.getPrivate());
        keyAgreement.doPhase(this.f26655a, true);
        byte[] generateSecret = keyAgreement.generateSecret();
        Intrinsics.checkNotNull(generateSecret);
        byte[] bytes = "surt-transit-v1".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        e10 = fVar.e(generateSecret, d10, bytes, 32);
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, new SecretKeySpec(e10, "AES"), new GCMParameterSpec(128, bArr));
        byte[] doFinal = cipher.doFinal(plaintext);
        byte[] bArr2 = new byte[doFinal.length + 78];
        bArr2[0] = 1;
        System.arraycopy(d10, 0, bArr2, 1, 65);
        System.arraycopy(bArr, 0, bArr2, 66, 12);
        System.arraycopy(doFinal, 0, bArr2, 78, doFinal.length);
        String encodeToString = Base64.encodeToString(bArr2, 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        return encodeToString;
    }
}
