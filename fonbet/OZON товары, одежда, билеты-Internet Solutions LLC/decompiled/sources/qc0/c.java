package qc0;

import Sc.InterfaceC4008j;
import Sc.k;
import Vb0.b;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.crossApp.data.AccountSignatureData;
import td0.C9862b;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C9022a> f81818a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f81819b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f81820a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f81821b;

        /* renamed from: c, reason: collision with root package name */
        private final long f81822c;

        public a(@NotNull String publicKey, @NotNull String privateKey, long j11) {
            Intrinsics.checkNotNullParameter(publicKey, "publicKey");
            Intrinsics.checkNotNullParameter(privateKey, "privateKey");
            this.f81820a = publicKey;
            this.f81821b = privateKey;
            this.f81822c = j11;
        }

        public final long a() {
            return this.f81822c;
        }

        @NotNull
        public final String b() {
            return this.f81821b;
        }

        @NotNull
        public final String c() {
            return this.f81820a;
        }
    }

    static final class b extends AbstractC7737t implements Function0<KeyPairGenerator> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f81823b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final KeyPairGenerator invoke() {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
            keyPairGenerator.initialize(new ECGenParameterSpec("prime256v1"));
            return keyPairGenerator;
        }
    }

    public c(@NotNull InterfaceC4008j<C9022a> accountSharedStoreDataSource) {
        Intrinsics.checkNotNullParameter(accountSharedStoreDataSource, "accountSharedStoreDataSource");
        this.f81818a = accountSharedStoreDataSource;
        this.f81819b = k.b(b.f81823b);
    }

    @NotNull
    public final a a() {
        KeyPair generateKeyPair = ((KeyPairGenerator) this.f81819b.getValue()).generateKeyPair();
        byte[] encoded = generateKeyPair.getPublic().getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "getEncoded(...)");
        String a11 = C9862b.a(0, encoded);
        byte[] encoded2 = generateKeyPair.getPrivate().getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded2, "getEncoded(...)");
        return new a(a11, C9862b.a(0, encoded2), System.currentTimeMillis());
    }

    public final String b(@NotNull String publicKey, @NotNull String data) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(data, "data");
        if (h.K(data)) {
            b.a.b(Vb0.b.f28514a, "Trying to sign empty challenge");
            return null;
        }
        AccountSignatureData f7 = this.f81818a.getValue().f(publicKey);
        if (f7 != null) {
            try {
                PrivateKey generatePrivate = KeyFactory.getInstance("EC").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(f7.getPrivateKey(), 0)));
                if (generatePrivate == null) {
                    b.a.b(Vb0.b.f28514a, "Failed to convert private key from string");
                    return null;
                }
                Signature signature = Signature.getInstance("SHA256withECDSA");
                signature.initSign(generatePrivate);
                byte[] bytes = data.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                signature.update(bytes);
                byte[] sign = signature.sign();
                Intrinsics.f(sign);
                return C9862b.a(0, sign);
            } catch (SignatureException e11) {
                b.a.c(Vb0.b.f28514a, e11);
            }
        }
        return null;
    }
}
