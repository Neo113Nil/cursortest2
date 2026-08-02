package O0;

import O0.h;
import android.util.AndroidRuntimeException;

/* loaded from: classes.dex */
public final class l extends h {

    /* renamed from: B, reason: collision with root package name */
    public m f8293B;

    /* renamed from: C, reason: collision with root package name */
    public float f8294C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f8295D;

    public l(j jVar) {
        super(jVar);
        this.f8293B = null;
        this.f8294C = Float.MAX_VALUE;
        this.f8295D = false;
    }

    @Override // O0.h
    public void q() {
        w();
        this.f8293B.i(g());
        super.q();
    }

    @Override // O0.h
    public boolean s(long j10) {
        if (this.f8295D) {
            float f10 = this.f8294C;
            if (f10 != Float.MAX_VALUE) {
                this.f8293B.g(f10);
                this.f8294C = Float.MAX_VALUE;
            }
            this.f8275b = this.f8293B.b();
            this.f8274a = 0.0f;
            this.f8295D = false;
            return true;
        }
        if (this.f8294C != Float.MAX_VALUE) {
            long j11 = j10 / 2;
            h.p j12 = this.f8293B.j(this.f8275b, this.f8274a, j11);
            this.f8293B.g(this.f8294C);
            this.f8294C = Float.MAX_VALUE;
            h.p j13 = this.f8293B.j(j12.f8289a, j12.f8290b, j11);
            this.f8275b = j13.f8289a;
            this.f8274a = j13.f8290b;
        } else {
            h.p j14 = this.f8293B.j(this.f8275b, this.f8274a, j10);
            this.f8275b = j14.f8289a;
            this.f8274a = j14.f8290b;
        }
        float max = Math.max(this.f8275b, this.f8281h);
        this.f8275b = max;
        float min = Math.min(max, this.f8280g);
        this.f8275b = min;
        if (!v(min, this.f8274a)) {
            return false;
        }
        this.f8275b = this.f8293B.b();
        this.f8274a = 0.0f;
        return true;
    }

    public void t(float f10) {
        if (h()) {
            this.f8294C = f10;
            return;
        }
        if (this.f8293B == null) {
            this.f8293B = new m(f10);
        }
        this.f8293B.g(f10);
        q();
    }

    public boolean u() {
        return this.f8293B.f8297b > 0.0d;
    }

    public boolean v(float f10, float f11) {
        return this.f8293B.e(f10, f11);
    }

    public final void w() {
        m mVar = this.f8293B;
        if (mVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double b10 = mVar.b();
        if (b10 > this.f8280g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (b10 < this.f8281h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    public l x(m mVar) {
        this.f8293B = mVar;
        return this;
    }

    public void y() {
        if (!u()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!e().j()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f8279f) {
            this.f8295D = true;
        }
    }

    public l(Object obj, i iVar) {
        super(obj, iVar);
        this.f8293B = null;
        this.f8294C = Float.MAX_VALUE;
        this.f8295D = false;
    }

    public l(Object obj, i iVar, float f10) {
        super(obj, iVar);
        this.f8293B = null;
        this.f8294C = Float.MAX_VALUE;
        this.f8295D = false;
        this.f8293B = new m(f10);
    }

    @Override // O0.h
    public void p(float f10) {
    }
}
