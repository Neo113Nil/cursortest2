package q3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import m3.N;
import q3.InterfaceC8980a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final q f81395a;

    /* renamed from: b, reason: collision with root package name */
    private final long f81396b;

    /* renamed from: c, reason: collision with root package name */
    private final int f81397c;

    /* renamed from: d, reason: collision with root package name */
    private p3.i f81398d;

    /* renamed from: e, reason: collision with root package name */
    private long f81399e;

    /* renamed from: f, reason: collision with root package name */
    private File f81400f;

    /* renamed from: g, reason: collision with root package name */
    private OutputStream f81401g;

    /* renamed from: h, reason: collision with root package name */
    private long f81402h;

    /* renamed from: i, reason: collision with root package name */
    private long f81403i;

    /* renamed from: j, reason: collision with root package name */
    private o f81404j;

    public static final class a extends InterfaceC8980a.C1373a {
    }

    /* renamed from: q3.b$b, reason: collision with other inner class name */
    public static final class C1374b {

        /* renamed from: a, reason: collision with root package name */
        private q f81405a;

        public final b a() {
            q qVar = this.f81405a;
            qVar.getClass();
            return new b(qVar);
        }

        public final void b(q qVar) {
            this.f81405a = qVar;
        }
    }

    public b(q qVar) {
        qVar.getClass();
        this.f81395a = qVar;
        this.f81396b = 5242880L;
        this.f81397c = 20480;
    }

    private void b() throws IOException {
        OutputStream outputStream = this.f81401g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            N.g(this.f81401g);
            this.f81401g = null;
            File file = this.f81400f;
            this.f81400f = null;
            this.f81395a.j(file, this.f81402h);
        } catch (Throwable th2) {
            N.g(this.f81401g);
            this.f81401g = null;
            File file2 = this.f81400f;
            this.f81400f = null;
            file2.delete();
            throw th2;
        }
    }

    private void d(p3.i iVar) throws IOException {
        long j11 = iVar.f80072g;
        long min = j11 != -1 ? Math.min(j11 - this.f81403i, this.f81399e) : -1L;
        int i11 = N.f74289a;
        this.f81400f = this.f81395a.s(iVar.f80073h, iVar.f80071f + this.f81403i, min);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f81400f);
        int i12 = this.f81397c;
        if (i12 > 0) {
            o oVar = this.f81404j;
            if (oVar == null) {
                this.f81404j = new o(fileOutputStream, i12);
            } else {
                oVar.c(fileOutputStream);
            }
            this.f81401g = this.f81404j;
        } else {
            this.f81401g = fileOutputStream;
        }
        this.f81402h = 0L;
    }

    public final void a() throws a {
        if (this.f81398d == null) {
            return;
        }
        try {
            b();
        } catch (IOException e11) {
            throw new a(e11);
        }
    }

    public final void c(p3.i iVar) throws a {
        iVar.f80073h.getClass();
        if (iVar.f80072g == -1 && iVar.c(2)) {
            this.f81398d = null;
            return;
        }
        this.f81398d = iVar;
        this.f81399e = iVar.c(4) ? this.f81396b : Long.MAX_VALUE;
        this.f81403i = 0L;
        try {
            d(iVar);
        } catch (IOException e11) {
            throw new a(e11);
        }
    }

    public final void e(byte[] bArr, int i11, int i12) throws a {
        p3.i iVar = this.f81398d;
        if (iVar == null) {
            return;
        }
        int i13 = 0;
        while (i13 < i12) {
            try {
                if (this.f81402h == this.f81399e) {
                    b();
                    d(iVar);
                }
                int min = (int) Math.min(i12 - i13, this.f81399e - this.f81402h);
                OutputStream outputStream = this.f81401g;
                int i14 = N.f74289a;
                outputStream.write(bArr, i11 + i13, min);
                i13 += min;
                long j11 = min;
                this.f81402h += j11;
                this.f81403i += j11;
            } catch (IOException e11) {
                throw new a(e11);
            }
        }
    }
}
