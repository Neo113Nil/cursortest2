package N1;

import H1.C1171d;
import H1.O;
import N1.e;
import androidx.media3.common.a;
import e1.J;
import f1.AbstractC4230h;

/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: b, reason: collision with root package name */
    public final J f7876b;

    /* renamed from: c, reason: collision with root package name */
    public final J f7877c;

    /* renamed from: d, reason: collision with root package name */
    public int f7878d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7879e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7880f;

    /* renamed from: g, reason: collision with root package name */
    public int f7881g;

    public f(O o10) {
        super(o10);
        this.f7876b = new J(AbstractC4230h.NAL_START_CODE);
        this.f7877c = new J(4);
    }

    @Override // N1.e
    public boolean b(J j10) {
        int M10 = j10.M();
        int i10 = (M10 >> 4) & 15;
        int i11 = M10 & 15;
        if (i11 == 7) {
            this.f7881g = i10;
            return i10 != 5;
        }
        throw new e.a("Video format not supported: " + i11);
    }

    @Override // N1.e
    public boolean c(J j10, long j11) {
        int M10 = j10.M();
        long w10 = j11 + (j10.w() * 1000);
        if (M10 == 0 && !this.f7879e) {
            J j12 = new J(new byte[j10.a()]);
            j10.q(j12.f(), 0, j10.a());
            C1171d b10 = C1171d.b(j12);
            this.f7878d = b10.f4400b;
            this.f7875a.c(new a.b().W("video/x-flv").y0("video/avc").U(b10.f4410l).F0(b10.f4401c).h0(b10.f4402d).u0(b10.f4409k).k0(b10.f4399a).P());
            this.f7879e = true;
            return false;
        }
        if (M10 != 1 || !this.f7879e) {
            return false;
        }
        int i10 = this.f7881g == 1 ? 1 : 0;
        if (!this.f7880f && i10 == 0) {
            return false;
        }
        byte[] f10 = this.f7877c.f();
        f10[0] = 0;
        f10[1] = 0;
        f10[2] = 0;
        int i11 = 4 - this.f7878d;
        int i12 = 0;
        while (j10.a() > 0) {
            j10.q(this.f7877c.f(), i11, this.f7878d);
            this.f7877c.b0(0);
            int Q10 = this.f7877c.Q();
            this.f7876b.b0(0);
            this.f7875a.a(this.f7876b, 4);
            this.f7875a.a(j10, Q10);
            i12 = i12 + 4 + Q10;
        }
        this.f7875a.g(w10, i10, i12, 0, null);
        this.f7880f = true;
        return true;
    }
}
