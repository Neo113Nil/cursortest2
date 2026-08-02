package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class u60 implements e1g {
    public final AnimatedImageDrawable a;

    public u60(AnimatedImageDrawable animatedImageDrawable) {
        this.a = animatedImageDrawable;
    }

    @Override // defpackage.e1g
    public final int a() {
        return kik.s(Bitmap.Config.ARGB_8888) * this.a.getIntrinsicHeight() * this.a.getIntrinsicWidth() * 2;
    }

    @Override // defpackage.e1g
    public final void c() {
        this.a.stop();
        this.a.clearAnimationCallbacks();
    }

    @Override // defpackage.e1g
    public final Class d() {
        return Drawable.class;
    }

    @Override // defpackage.e1g
    public final Object get() {
        return this.a;
    }
}
