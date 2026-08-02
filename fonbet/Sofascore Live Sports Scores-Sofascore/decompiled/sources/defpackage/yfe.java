package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yfe implements Runnable {
    public final float a;
    public final float b;
    public final long c = System.currentTimeMillis();
    public final float d;
    public final float e;
    public final /* synthetic */ zfe f;

    public yfe(zfe zfeVar, float f, float f2, float f3, float f4) {
        this.f = zfeVar;
        this.a = f3;
        this.b = f4;
        this.d = f;
        this.e = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zfe zfeVar = this.f;
        float interpolation = zfeVar.a.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.c) * 1.0f) / zfeVar.b));
        float f = this.d;
        zfeVar.x.l(me4.b(this.e, f, interpolation, f) / zfeVar.d(), this.a, this.b);
        if (interpolation < 1.0f) {
            zfeVar.h.postOnAnimation(this);
        }
    }
}
