package defpackage;

import androidx.media3.common.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ami implements vsj {
    public final vsj a;
    public final xli b;
    public zli g;
    public b h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = nik.b;
    public final j9e c = new j9e();

    public ami(vsj vsjVar, xli xliVar) {
        this.a = vsjVar;
        this.b = xliVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.vsj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j, int i, int i2, int i3, tsj tsjVar) {
        int i4;
        int i5;
        if (this.g == null) {
            this.a.a(j, i, i2, i3, tsjVar);
            return;
        }
        z1a.r("DRM on subtitles is not supported", tsjVar == null);
        int i6 = (this.e - i3) - i2;
        try {
            i4 = i6;
        } catch (RuntimeException e) {
            e = e;
            i4 = i6;
        }
        try {
            this.g.h(this.f, i4, i2, yli.c, new wm4(this, j, i));
        } catch (RuntimeException e2) {
            e = e2;
            RuntimeException runtimeException = e;
            if (!this.i) {
                throw runtimeException;
            }
            tgj.e0("Parsing subtitles failed, ignoring sample.", runtimeException);
            i5 = i4 + i2;
            this.d = i5;
            if (i5 != this.e) {
            }
        }
        i5 = i4 + i2;
        this.d = i5;
        if (i5 != this.e) {
            this.d = 0;
            this.e = 0;
        }
    }

    @Override // defpackage.vsj
    public final void b(j9e j9eVar, int i, int i2) {
        if (this.g == null) {
            this.a.b(j9eVar, i, i2);
            return;
        }
        h(i);
        j9eVar.k(this.f, this.e, i);
        this.e += i;
    }

    @Override // defpackage.vsj
    public final void d(b bVar) {
        bVar.o.getClass();
        String str = bVar.o;
        z1a.s(sjc.i(str) == 3);
        boolean equals = bVar.equals(this.h);
        xli xliVar = this.b;
        if (!equals) {
            this.h = bVar;
            this.g = xliVar.i(bVar) ? xliVar.g(bVar) : null;
        }
        zli zliVar = this.g;
        vsj vsjVar = this.a;
        if (zliVar == null) {
            vsjVar.d(bVar);
            return;
        }
        qm8 a = bVar.a();
        a.n = sjc.p("application/x-media3-cues");
        a.j = str;
        a.s = Long.MAX_VALUE;
        a.L = xliVar.f(bVar);
        w1l.r(a, vsjVar);
    }

    @Override // defpackage.vsj
    public final int e(ge4 ge4Var, int i, boolean z) {
        if (this.g == null) {
            return this.a.e(ge4Var, i, z);
        }
        h(i);
        int read = ge4Var.read(this.f, this.e, i);
        if (read != -1) {
            this.e += read;
            return read;
        }
        if (z) {
            return -1;
        }
        a70.q();
        return 0;
    }

    public final void h(int i) {
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int max = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.d, bArr2, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr2;
    }
}
