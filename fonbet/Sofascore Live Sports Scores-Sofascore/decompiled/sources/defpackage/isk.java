package defpackage;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class isk implements Interpolator {
    public final /* synthetic */ jsk a;

    public isk(jsk jskVar) {
        this.a = jskVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.a.u.getInterpolation(f);
    }
}
