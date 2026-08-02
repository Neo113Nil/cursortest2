package i1;

import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.Z;
import h1.C4418n;
import h1.InterfaceC4410f;
import i1.InterfaceC4517a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4518b implements InterfaceC4410f {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4517a f47914a;

    /* renamed from: b, reason: collision with root package name */
    public final long f47915b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47916c;

    /* renamed from: d, reason: collision with root package name */
    public C4418n f47917d;

    /* renamed from: e, reason: collision with root package name */
    public long f47918e;

    /* renamed from: f, reason: collision with root package name */
    public File f47919f;

    /* renamed from: g, reason: collision with root package name */
    public OutputStream f47920g;

    /* renamed from: h, reason: collision with root package name */
    public long f47921h;

    /* renamed from: i, reason: collision with root package name */
    public long f47922i;

    /* renamed from: j, reason: collision with root package name */
    public q f47923j;

    /* renamed from: i1.b$a */
    public static final class a extends InterfaceC4517a.C0721a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    /* renamed from: i1.b$b, reason: collision with other inner class name */
    public static final class C0722b implements InterfaceC4410f.a {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC4517a f47924a;

        /* renamed from: b, reason: collision with root package name */
        public long f47925b = 5242880;

        /* renamed from: c, reason: collision with root package name */
        public int f47926c = 20480;

        @Override // h1.InterfaceC4410f.a
        public InterfaceC4410f a() {
            return new C4518b((InterfaceC4517a) AbstractC4134a.e(this.f47924a), this.f47925b, this.f47926c);
        }

        public C0722b b(InterfaceC4517a interfaceC4517a) {
            this.f47924a = interfaceC4517a;
            return this;
        }
    }

    public C4518b(InterfaceC4517a interfaceC4517a, long j10, int i10) {
        AbstractC4134a.h(j10 > 0 || j10 == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j10 != -1 && j10 < 2097152) {
            AbstractC4156x.i("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.f47914a = (InterfaceC4517a) AbstractC4134a.e(interfaceC4517a);
        this.f47915b = j10 == -1 ? LongCompanionObject.MAX_VALUE : j10;
        this.f47916c = i10;
    }

    public final void a() {
        OutputStream outputStream = this.f47920g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            Z.m(this.f47920g);
            this.f47920g = null;
            File file = (File) Z.i(this.f47919f);
            this.f47919f = null;
            this.f47914a.h(file, this.f47921h);
        } catch (Throwable th2) {
            Z.m(this.f47920g);
            this.f47920g = null;
            File file2 = (File) Z.i(this.f47919f);
            this.f47919f = null;
            file2.delete();
            throw th2;
        }
    }

    @Override // h1.InterfaceC4410f
    public void b(C4418n c4418n) {
        AbstractC4134a.e(c4418n.f47561h);
        if (c4418n.f47560g == -1 && c4418n.d(2)) {
            this.f47917d = null;
            return;
        }
        this.f47917d = c4418n;
        this.f47918e = c4418n.d(4) ? this.f47915b : LongCompanionObject.MAX_VALUE;
        this.f47922i = 0L;
        try {
            c(c4418n);
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    public final void c(C4418n c4418n) {
        long j10 = c4418n.f47560g;
        this.f47919f = this.f47914a.a((String) Z.i(c4418n.f47561h), c4418n.f47559f + this.f47922i, j10 != -1 ? Math.min(j10 - this.f47922i, this.f47918e) : -1L);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f47919f);
        if (this.f47916c > 0) {
            q qVar = this.f47923j;
            if (qVar == null) {
                this.f47923j = new q(fileOutputStream, this.f47916c);
            } else {
                qVar.d(fileOutputStream);
            }
            this.f47920g = this.f47923j;
        } else {
            this.f47920g = fileOutputStream;
        }
        this.f47921h = 0L;
    }

    @Override // h1.InterfaceC4410f
    public void close() {
        if (this.f47917d == null) {
            return;
        }
        try {
            a();
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    @Override // h1.InterfaceC4410f
    public void write(byte[] bArr, int i10, int i11) {
        C4418n c4418n = this.f47917d;
        if (c4418n == null) {
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            try {
                if (this.f47921h == this.f47918e) {
                    a();
                    c(c4418n);
                }
                int min = (int) Math.min(i11 - i12, this.f47918e - this.f47921h);
                ((OutputStream) Z.i(this.f47920g)).write(bArr, i10 + i12, min);
                i12 += min;
                long j10 = min;
                this.f47921h += j10;
                this.f47922i += j10;
            } catch (IOException e10) {
                throw new a(e10);
            }
        }
    }
}
