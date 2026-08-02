package i8;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.crypto.tink.internal.H;
import g8.h;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes9.dex */
public final class d extends n {

    /* renamed from: a, reason: collision with root package name */
    private final int f66070a;

    /* renamed from: b, reason: collision with root package name */
    private final int f66071b;

    /* renamed from: c, reason: collision with root package name */
    private final int f66072c;

    /* renamed from: d, reason: collision with root package name */
    private final String f66073d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f66074e;

    class a implements r {

        /* renamed from: a, reason: collision with root package name */
        private SecretKeySpec f66075a;

        /* renamed from: b, reason: collision with root package name */
        private Cipher f66076b;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f66077c;

        a() {
        }

        @Override // i8.r
        public final synchronized void a(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
            if (byteBuffer.remaining() != d.this.e()) {
                throw new InvalidAlgorithmParameterException("Invalid header length");
            }
            if (byteBuffer.get() != d.this.e()) {
                throw new GeneralSecurityException("Invalid ciphertext");
            }
            this.f66077c = new byte[7];
            byte[] bArr2 = new byte[d.this.f66070a];
            byteBuffer.get(bArr2);
            byteBuffer.get(this.f66077c);
            this.f66075a = d.j(d.this, bArr2, bArr);
            this.f66076b = k.f66115b.a("AES/GCM/NoPadding");
        }

        @Override // i8.r
        public final synchronized void b(ByteBuffer byteBuffer, int i11, boolean z11, ByteBuffer byteBuffer2) throws GeneralSecurityException {
            this.f66076b.init(2, this.f66075a, d.k(this.f66077c, i11, z11));
            this.f66076b.doFinal(byteBuffer, byteBuffer2);
        }
    }

    class b implements s {

        /* renamed from: a, reason: collision with root package name */
        private final SecretKeySpec f66079a;

        /* renamed from: b, reason: collision with root package name */
        private final Cipher f66080b = k.f66115b.a("AES/GCM/NoPadding");

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f66081c;

        /* renamed from: d, reason: collision with root package name */
        private final ByteBuffer f66082d;

        /* renamed from: e, reason: collision with root package name */
        private long f66083e;

        public b(d dVar, byte[] bArr) throws GeneralSecurityException {
            this.f66083e = 0L;
            this.f66083e = 0L;
            byte[] i11 = d.i(dVar);
            byte[] a11 = H.a(7);
            this.f66081c = a11;
            ByteBuffer allocate = ByteBuffer.allocate(dVar.e());
            this.f66082d = allocate;
            allocate.put((byte) dVar.e());
            allocate.put(i11);
            allocate.put(a11);
            allocate.flip();
            this.f66079a = d.j(dVar, i11, bArr);
        }

        @Override // i8.s
        public final synchronized void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) throws GeneralSecurityException {
            try {
                this.f66080b.init(1, this.f66079a, d.k(this.f66081c, this.f66083e, false));
                this.f66083e++;
                if (byteBuffer2.hasRemaining()) {
                    this.f66080b.update(byteBuffer, byteBuffer3);
                    this.f66080b.doFinal(byteBuffer2, byteBuffer3);
                } else {
                    this.f66080b.doFinal(byteBuffer, byteBuffer3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // i8.s
        public final synchronized void b(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
            this.f66080b.init(1, this.f66079a, d.k(this.f66081c, this.f66083e, true));
            this.f66083e++;
            this.f66080b.doFinal(byteBuffer, byteBuffer2);
        }

        @Override // i8.s
        public final ByteBuffer getHeader() {
            return this.f66082d.asReadOnlyBuffer();
        }
    }

    private d(g8.e eVar) throws GeneralSecurityException {
        String str;
        this.f66074e = eVar.f().d(S7.e.a());
        if (eVar.g().d().equals(h.b.f64003b)) {
            str = "HmacSha1";
        } else if (eVar.g().d().equals(h.b.f64004c)) {
            str = "HmacSha256";
        } else {
            if (!eVar.g().d().equals(h.b.f64005d)) {
                throw new GeneralSecurityException("Unknown HKDF algorithm " + eVar.g().d());
            }
            str = "HmacSha512";
        }
        this.f66073d = str;
        this.f66070a = eVar.g().c();
        int b11 = eVar.g().b();
        this.f66071b = b11;
        this.f66072c = b11 - 16;
    }

    static byte[] i(d dVar) {
        return H.a(dVar.f66070a);
    }

    static SecretKeySpec j(d dVar, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return new SecretKeySpec(m.a(dVar.f66073d, dVar.f66074e, bArr, bArr2, dVar.f66070a), "AES");
    }

    static GCMParameterSpec k(byte[] bArr, long j11, boolean z11) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.put(bArr);
        if (0 > j11 || j11 >= 4294967296L) {
            throw new GeneralSecurityException("Index out of range");
        }
        allocate.putInt((int) j11);
        allocate.put(z11 ? (byte) 1 : (byte) 0);
        return new GCMParameterSpec(UserVerificationMethods.USER_VERIFY_PATTERN, allocate.array());
    }

    public static d m(g8.e eVar) throws GeneralSecurityException {
        return new d(eVar);
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
        return this.f66071b;
    }

    @Override // i8.n
    public final int e() {
        return this.f66070a + 8;
    }

    @Override // i8.n
    public final int f() {
        return this.f66072c;
    }

    @Override // i8.n
    public final r g() throws GeneralSecurityException {
        return new a();
    }

    @Override // i8.n
    public final s h(byte[] bArr) throws GeneralSecurityException {
        return new b(this, bArr);
    }
}
