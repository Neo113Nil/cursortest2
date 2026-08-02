package pf;

import P4.f;
import java.math.BigInteger;
import java.net.InetAddress;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import rf.h;
import rf.i;
import rf.j;
import rf.k;
import rf.l;
import rf.m;
import rf.q;
import rf.r;
import rf.s;
import rf.u;
import rf.v;
import rf.w;
import sf.C9681g;
import sf.C9684j;

/* renamed from: pf.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8917b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final KeyPair f80494a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final X509Certificate f80495b;

    /* renamed from: pf.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f80496a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f80497b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private int f80498c = -1;

        /* renamed from: d, reason: collision with root package name */
        private String f80499d = "EC";

        /* renamed from: e, reason: collision with root package name */
        private int f80500e = 256;

        @NotNull
        public final void a(@NotNull String altName) {
            Intrinsics.checkNotNullParameter(altName, "altName");
            this.f80497b.add(altName);
        }

        @NotNull
        public final C8917b b() {
            Pair pair;
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(this.f80499d);
            keyPairGenerator.initialize(this.f80500e, new SecureRandom());
            KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
            Intrinsics.checkNotNullExpressionValue(generateKeyPair, "KeyPairGenerator.getInst…generateKeyPair()\n      }");
            int i11 = m.f83425i;
            j g10 = m.g();
            C9684j c9684j = C9684j.f98719d;
            PublicKey publicKey = generateKeyPair.getPublic();
            Intrinsics.checkNotNullExpressionValue(publicKey, "subjectKeyPair.public");
            byte[] encoded = publicKey.getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "subjectKeyPair.public.encoded");
            C9684j byteString = C9684j.a.d(encoded);
            g10.getClass();
            Intrinsics.checkNotNullParameter(byteString, "byteString");
            Intrinsics.checkNotNullParameter(byteString, "byteString");
            C9681g c9681g = new C9681g();
            c9681g.X(byteString);
            u uVar = (u) g10.d(new q(c9681g));
            ArrayList arrayList = new ArrayList();
            String str = this.f80496a;
            if (str == null) {
                str = f.b("UUID.randomUUID().toString()");
            }
            arrayList.add(C7714v.a0(new h("2.5.4.3", str)));
            rf.f fVar = generateKeyPair.getPrivate() instanceof RSAPrivateKey ? new rf.f("1.2.840.113549.1.1.11", null) : new rf.f("1.2.840.10045.4.3.2", C9684j.f98719d);
            BigInteger bigInteger = BigInteger.ONE;
            Intrinsics.checkNotNullExpressionValue(bigInteger, "serialNumber ?: BigInteger.ONE");
            long currentTimeMillis = System.currentTimeMillis();
            w wVar = new w(currentTimeMillis, 86400000 + currentTimeMillis);
            ArrayList arrayList2 = new ArrayList();
            int i12 = this.f80498c;
            if (i12 != -1) {
                arrayList2.add(new s(new i(true, Long.valueOf(i12)), "2.5.29.19", true));
            }
            ArrayList arrayList3 = this.f80497b;
            if (!arrayList3.isEmpty()) {
                ArrayList arrayList4 = new ArrayList(C7714v.z(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (Ye.b.b(str2)) {
                        int i13 = m.f83425i;
                        j e11 = m.e();
                        C9684j c9684j2 = C9684j.f98719d;
                        InetAddress byName = InetAddress.getByName(str2);
                        Intrinsics.checkNotNullExpressionValue(byName, "InetAddress.getByName(it)");
                        byte[] address = byName.getAddress();
                        Intrinsics.checkNotNullExpressionValue(address, "InetAddress.getByName(it).address");
                        pair = new Pair(e11, C9684j.a.d(address));
                    } else {
                        int i14 = m.f83425i;
                        pair = new Pair(m.d(), str2);
                    }
                    arrayList4.add(pair);
                }
                arrayList2.add(new s(arrayList4, "2.5.29.17", true));
            }
            v vVar = new v(2L, bigInteger, fVar, arrayList, wVar, arrayList, uVar, null, null, arrayList2);
            Signature signature = Signature.getInstance(vVar.f());
            signature.initSign(generateKeyPair.getPrivate());
            int i15 = m.f83425i;
            j h11 = m.h();
            h11.getClass();
            C9681g c9681g2 = new C9681g();
            h11.b(new r(c9681g2), vVar);
            signature.update(c9681g2.v0().G());
            C9684j c9684j3 = C9684j.f98719d;
            byte[] sign = signature.sign();
            Intrinsics.checkNotNullExpressionValue(sign, "sign()");
            l lVar = new l(vVar, fVar, new k(0, C9684j.a.d(sign)));
            j c11 = m.c();
            c11.getClass();
            C9681g c9681g3 = new C9681g();
            c11.b(new r(c9681g3), lVar);
            C9684j v02 = c9681g3.v0();
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                C9681g c9681g4 = new C9681g();
                c9681g4.X(v02);
                Collection<? extends Certificate> certificates = certificateFactory.generateCertificates(c9681g4.a2());
                Intrinsics.checkNotNullExpressionValue(certificates, "certificates");
                Object A02 = C7714v.A0(certificates);
                if (A02 != null) {
                    return new C8917b(generateKeyPair, (X509Certificate) A02);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            } catch (IllegalArgumentException e12) {
                throw new IllegalArgumentException("failed to decode certificate", e12);
            } catch (GeneralSecurityException e13) {
                throw new IllegalArgumentException("failed to decode certificate", e13);
            } catch (NoSuchElementException e14) {
                throw new IllegalArgumentException("failed to decode certificate", e14);
            }
        }

        @NotNull
        public final void c() {
            Intrinsics.checkNotNullParameter("localhost", "cn");
            this.f80496a = "localhost";
        }
    }

    static {
        new Regex("-----BEGIN ([!-,.-~ ]*)-----([^-]*)-----END \\1-----");
    }

    public C8917b(@NotNull KeyPair keyPair, @NotNull X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(keyPair, "keyPair");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        this.f80494a = keyPair;
        this.f80495b = certificate;
    }

    @NotNull
    public final X509Certificate a() {
        return this.f80495b;
    }

    @NotNull
    public final KeyPair b() {
        return this.f80494a;
    }
}
