package defpackage;

import android.view.View;
import android.view.animation.Animation;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class an6 implements Animation.AnimationListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ Function0 b;

    public an6(View view, Function0 function0) {
        this.a = view;
        this.b = function0;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        View view = this.a;
        view.setVisibility(8);
        Function0 function0 = this.b;
        if (function0 != null) {
            function0.invoke();
        }
        view.clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
    }
}
