package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x8l implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ d9l a;
    public final /* synthetic */ x9l b;
    public final /* synthetic */ x9l c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public x8l(d9l d9lVar, x9l x9lVar, x9l x9lVar2, int i, View view) {
        this.a = d9lVar;
        this.b = x9lVar;
        this.c = x9lVar2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        d9l d9lVar = this.a;
        c9l c9lVar = d9lVar.a;
        c9lVar.e(animatedFraction);
        float c = c9lVar.c();
        PathInterpolator pathInterpolator = z8l.e;
        int i = Build.VERSION.SDK_INT;
        x9l x9lVar = this.b;
        l9l k9lVar = i >= 36 ? new k9l(x9lVar) : i >= 35 ? new j9l(x9lVar) : i >= 34 ? new i9l(x9lVar) : i >= 31 ? new h9l(x9lVar) : i >= 30 ? new g9l(x9lVar) : i >= 29 ? new f9l(x9lVar) : new e9l(x9lVar);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            u9l u9lVar = x9lVar.a;
            if (i3 == 0) {
                k9lVar.d(i2, u9lVar.i(i2));
            } else {
                u4a i4 = u9lVar.i(i2);
                u4a i5 = this.c.a.i(i2);
                float f = 1.0f - c;
                k9lVar.d(i2, x9l.e(i4, (int) (((i4.a - i5.a) * f) + 0.5d), (int) (((i4.b - i5.b) * f) + 0.5d), (int) (((i4.c - i5.c) * f) + 0.5d), (int) (((i4.d - i5.d) * f) + 0.5d)));
            }
        }
        z8l.h(this.e, k9lVar.b(), Collections.singletonList(d9lVar));
    }
}
