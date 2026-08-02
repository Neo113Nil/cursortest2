package G1;

import androidx.media3.exoplayer.q;
import e1.J;
import e1.Z;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends androidx.media3.exoplayer.c {

    /* renamed from: r, reason: collision with root package name */
    public final k1.f f3784r;

    /* renamed from: s, reason: collision with root package name */
    public final J f3785s;

    /* renamed from: t, reason: collision with root package name */
    public a f3786t;

    /* renamed from: u, reason: collision with root package name */
    public long f3787u;

    public b() {
        super(6);
        this.f3784r = new k1.f(1);
        this.f3785s = new J();
    }

    @Override // androidx.media3.exoplayer.q
    public int a(androidx.media3.common.a aVar) {
        return "application/x-camera-motion".equals(aVar.f20543o) ? q.r(4) : q.r(0);
    }

    @Override // androidx.media3.exoplayer.p
    public boolean b() {
        return i();
    }

    @Override // androidx.media3.exoplayer.p
    public boolean c() {
        return true;
    }

    @Override // androidx.media3.exoplayer.c
    public void d0() {
        s0();
    }

    @Override // androidx.media3.exoplayer.c
    public void g0(long j10, boolean z10) {
        this.f3787u = Long.MIN_VALUE;
        s0();
    }

    @Override // androidx.media3.exoplayer.p, androidx.media3.exoplayer.q
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.p
    public void h(long j10, long j11) {
        while (!i() && this.f3787u < 100000 + j10) {
            this.f3784r.f();
            if (o0(V(), this.f3784r, 0) != -4 || this.f3784r.i()) {
                return;
            }
            long j12 = this.f3784r.f54110f;
            this.f3787u = j12;
            boolean z10 = j12 < X();
            if (this.f3786t != null && !z10) {
                this.f3784r.q();
                float[] r02 = r0((ByteBuffer) Z.i(this.f3784r.f54108d));
                if (r02 != null) {
                    ((a) Z.i(this.f3786t)).a(this.f3787u - a0(), r02);
                }
            }
        }
    }

    public final float[] r0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f3785s.Z(byteBuffer.array(), byteBuffer.limit());
        this.f3785s.b0(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f3785s.z());
        }
        return fArr;
    }

    public final void s0() {
        a aVar = this.f3786t;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // androidx.media3.exoplayer.c, androidx.media3.exoplayer.o.b
    public void t(int i10, Object obj) {
        if (i10 == 8) {
            this.f3786t = (a) obj;
        } else {
            super.t(i10, obj);
        }
    }
}
