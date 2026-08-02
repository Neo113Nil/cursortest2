package i8;

import X7.a;
import com.google.crypto.tink.internal.H;
import g8.C6659a;
import g8.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: i8.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7019a extends n {

    /* renamed from: h, reason: collision with root package name */
    public static final a.EnumC0605a f66037h = a.EnumC0605a.ALGORITHM_NOT_FIPS;

    /* renamed from: a, reason: collision with root package name */
    private final int f66038a;

    /* renamed from: b, reason: collision with root package name */
    private final String f66039b;

    /* renamed from: c, reason: collision with root package name */
    private final int f66040c;

    /* renamed from: d, reason: collision with root package name */
    private final int f66041d;

    /* renamed from: e, reason: collision with root package name */
    private final int f66042e;

    /* renamed from: f, reason: collision with root package name */
    private final String f66043f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f66044g;

    /* renamed from: i8.a$a, reason: collision with other inner class name */
    class C1085a implements r {

        /* renamed from: a, reason: collision with root package name */
        private SecretKeySpec f66045a;

        /* renamed from: b, reason: collision with root package name */
        private SecretKeySpec f66046b;

        /* renamed from: c, reason: collision with root package name */
        private Cipher f66047c;

        /* renamed from: d, reason: collision with root package name */
        private Mac f66048d;

        /* renamed from: e, reason: collision with root package name */
        private byte[] f66049e;

        C1085a() {
        }

        @Override // i8.r
        public final synchronized void a(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
            if (byteBuffer.remaining() != C7019a.this.e()) {
                throw new InvalidAlgorithmParameterException("Invalid header length");
            }
            if (byteBuffer.get() != C7019a.this.e()) {
                throw new GeneralSecurityException("Invalid ciphertext");
            }
            this.f66049e = new byte[7];
            byte[] bArr2 = new byte[C7019a.this.f66038a];
            byteBuffer.get(bArr2);
            byteBuffer.get(this.f66049e);
            byte[] l11 = C7019a.l(C7019a.this, bArr2, bArr);
            this.f66045a = C7019a.m(C7019a.this, l11);
            this.f66046b = C7019a.n(C7019a.this, l11);
            this.f66047c = k.f66115b.a("AES/CTR/NoPadding");
            this.f66048d = C7019a.i(C7019a.this);
        }

        @Override // i8.r
        public final synchronized void b(ByteBuffer byteBuffer, int i11, boolean z11, ByteBuffer byteBuffer2) throws GeneralSecurityException {
            int position = byteBuffer.position();
            byte[] o11 = C7019a.o(C7019a.this, this.f66049e, i11, z11);
            int remaining = byteBuffer.remaining();
            if (remaining < C7019a.this.f66040c) {
                throw new GeneralSecurityException("Ciphertext too short");
            }
            int i12 = (remaining - C7019a.this.f66040c) + position;
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.limit(i12);
            ByteBuffer duplicate2 = byteBuffer.duplicate();
            duplicate2.position(i12);
            this.f66048d.init(this.f66046b);
            this.f66048d.update(o11);
            this.f66048d.update(duplicate);
            byte[] copyOf = Arrays.copyOf(this.f66048d.doFinal(), C7019a.this.f66040c);
            byte[] bArr = new byte[C7019a.this.f66040c];
            duplicate2.get(bArr);
            if (!MessageDigest.isEqual(bArr, copyOf)) {
                throw new GeneralSecurityException("Tag mismatch");
            }
            byteBuffer.limit(i12);
            this.f66047c.init(1, this.f66045a, new IvParameterSpec(o11));
            this.f66047c.doFinal(byteBuffer, byteBuffer2);
        }
    }

    /* renamed from: i8.a$b */
    class b implements s {

        /* renamed from: a, reason: collision with root package name */
        private final SecretKeySpec f66051a;

        /* renamed from: b, reason: collision with root package name */
        private final SecretKeySpec f66052b;

        /* renamed from: c, reason: collision with root package name */
        private final Cipher f66053c = k.f66115b.a("AES/CTR/NoPadding");

        /* renamed from: d, reason: collision with root package name */
        private final Mac f66054d;

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f66055e;

        /* renamed from: f, reason: collision with root package name */
        private ByteBuffer f66056f;

        /* renamed from: g, reason: collision with root package name */
        private long f66057g;

        public b(byte[] bArr) throws GeneralSecurityException {
            this.f66057g = 0L;
            this.f66054d = C7019a.i(C7019a.this);
            this.f66057g = 0L;
            byte[] k11 = C7019a.k(C7019a.this);
            byte[] a11 = H.a(7);
            this.f66055e = a11;
            ByteBuffer allocate = ByteBuffer.allocate(C7019a.this.e());
            this.f66056f = allocate;
            allocate.put((byte) C7019a.this.e());
            allocate.put(k11);
            allocate.put(a11);
            allocate.flip();
            byte[] l11 = C7019a.l(C7019a.this, k11, bArr);
            this.f66051a = C7019a.m(C7019a.this, l11);
            this.f66052b = C7019a.n(C7019a.this, l11);
        }

        @Override // i8.s
        public final synchronized void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) throws GeneralSecurityException {
            int position = byteBuffer3.position();
            byte[] o11 = C7019a.o(C7019a.this, this.f66055e, this.f66057g, false);
            this.f66053c.init(1, this.f66051a, new IvParameterSpec(o11));
            this.f66057g++;
            this.f66053c.update(byteBuffer, byteBuffer3);
            this.f66053c.doFinal(byteBuffer2, byteBuffer3);
            ByteBuffer duplicate = byteBuffer3.duplicate();
            duplicate.flip();
            duplicate.position(position);
            this.f66054d.init(this.f66052b);
            this.f66054d.update(o11);
            this.f66054d.update(duplicate);
            byteBuffer3.put(this.f66054d.doFinal(), 0, C7019a.this.f66040c);
        }

        @Override // i8.s
        public final synchronized void b(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
            int position = byteBuffer2.position();
            byte[] o11 = C7019a.o(C7019a.this, this.f66055e, this.f66057g, true);
            this.f66053c.init(1, this.f66051a, new IvParameterSpec(o11));
            this.f66057g++;
            this.f66053c.doFinal(byteBuffer, byteBuffer2);
            ByteBuffer duplicate = byteBuffer2.duplicate();
            duplicate.flip();
            duplicate.position(position);
            this.f66054d.init(this.f66052b);
            this.f66054d.update(o11);
            this.f66054d.update(duplicate);
            byteBuffer2.put(this.f66054d.doFinal(), 0, C7019a.this.f66040c);
        }

        @Override // i8.s
        public final ByteBuffer getHeader() {
            return this.f66056f.asReadOnlyBuffer();
        }
    }

    private C7019a(C6659a c6659a) throws GeneralSecurityException {
        if (!f66037h.a()) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC streaming in FIPS-mode.");
        }
        this.f66044g = c6659a.f().d(S7.e.a());
        d.b d11 = c6659a.g().d();
        d.b bVar = d.b.f63985b;
        boolean equals = d11.equals(bVar);
        d.b bVar2 = d.b.f63987d;
        d.b bVar3 = d.b.f63986c;
        String str = "HmacSha512";
        this.f66043f = equals ? "HmacSha1" : c6659a.g().d().equals(bVar3) ? "HmacSha256" : c6659a.g().d().equals(bVar2) ? "HmacSha512" : "";
        this.f66038a = c6659a.g().c();
        if (c6659a.g().e().equals(bVar)) {
            str = "HmacSha1";
        } else if (c6659a.g().e().equals(bVar3)) {
            str = "HmacSha256";
        } else if (!c6659a.g().e().equals(bVar2)) {
            str = "";
        }
        this.f66039b = str;
        int f7 = c6659a.g().f();
        this.f66040c = f7;
        int b11 = c6659a.g().b();
        this.f66041d = b11;
        this.f66042e = b11 - f7;
    }

    static Mac i(C7019a c7019a) throws GeneralSecurityException {
        c7019a.getClass();
        return k.f66116c.a(c7019a.f66039b);
    }

    static byte[] k(C7019a c7019a) {
        return H.a(c7019a.f66038a);
    }

    static byte[] l(C7019a c7019a, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return m.a(c7019a.f66043f, c7019a.f66044g, bArr, bArr2, c7019a.f66038a + 32);
    }

    static SecretKeySpec m(C7019a c7019a, byte[] bArr) throws GeneralSecurityException {
        c7019a.getClass();
        return new SecretKeySpec(bArr, 0, c7019a.f66038a, "AES");
    }

    static SecretKeySpec n(C7019a c7019a, byte[] bArr) throws GeneralSecurityException {
        c7019a.getClass();
        return new SecretKeySpec(bArr, c7019a.f66038a, 32, c7019a.f66039b);
    }

    static byte[] o(C7019a c7019a, byte[] bArr, long j11, boolean z11) throws GeneralSecurityException {
        c7019a.getClass();
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.put(bArr);
        if (0 > j11 || j11 >= 4294967296L) {
            throw new GeneralSecurityException("Index out of range");
        }
        allocate.putInt((int) j11);
        allocate.put(z11 ? (byte) 1 : (byte) 0);
        allocate.putInt(0);
        return allocate.array();
    }

    public static C7019a q(C6659a c6659a) throws GeneralSecurityException {
        return new C7019a(c6659a);
    }

    @Override // S7.s
    public final OutputStream a(OutputStream outputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        return new u(this, outputStream, bArr);
    }

    @Override // S7.s
    public final InputStream b(InputStream inputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        return new t(this, inputStream, bArr);
    }

    @Override // i8.n
    public final int c() {
        return e();
    }

    @Override // i8.n
    public final int d() {
        return this.f66041d;
    }

    @Override // i8.n
    public final int e() {
        return this.f66038a + 8;
    }

    @Override // i8.n
    public final int f() {
        return this.f66042e;
    }

    @Override // i8.n
    public final r g() throws GeneralSecurityException {
        return new C1085a();
    }

    @Override // i8.n
    public final s h(byte[] bArr) throws GeneralSecurityException {
        return new b(bArr);
    }
}
