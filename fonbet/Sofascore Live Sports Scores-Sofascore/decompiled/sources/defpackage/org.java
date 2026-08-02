package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class org implements dwk {
    public boolean a;

    public static ObjectAnimator c(View view, float f, float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f, scaleX * f2), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f * scaleY, f2 * scaleY));
        ofPropertyValuesHolder.addListener(new nrg(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    @Override // defpackage.dwk
    public final Animator a(View view) {
        if (this.a) {
            return c(view, 1.0f, 1.1f);
        }
        return null;
    }

    @Override // defpackage.dwk
    public final Animator b(View view) {
        return c(view, 0.8f, 1.0f);
    }
}
