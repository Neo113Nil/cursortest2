package defpackage;

import android.animation.Animator;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wj6 extends f51 {
    public final /* synthetic */ ExtendedFloatingActionButton g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj6(ExtendedFloatingActionButton extendedFloatingActionButton, j0l j0lVar) {
        super(extendedFloatingActionButton, j0lVar);
        this.g = extendedFloatingActionButton;
    }

    @Override // defpackage.f51
    public final int c() {
        return R.animator.mtrl_extended_fab_show_motion_spec;
    }

    @Override // defpackage.f51
    public final void e() {
        this.d.b = null;
        this.g.Q = 0;
    }

    @Override // defpackage.f51
    public final void f(Animator animator) {
        j0l j0lVar = this.d;
        Animator animator2 = (Animator) j0lVar.b;
        if (animator2 != null) {
            animator2.cancel();
        }
        j0lVar.b = animator;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.Q = 2;
    }

    @Override // defpackage.f51
    public final void g() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.setAlpha(1.0f);
        extendedFloatingActionButton.setScaleY(1.0f);
        extendedFloatingActionButton.setScaleX(1.0f);
    }

    @Override // defpackage.f51
    public final boolean h() {
        e51 e51Var = ExtendedFloatingActionButton.j0;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        int visibility = extendedFloatingActionButton.getVisibility();
        int i = extendedFloatingActionButton.Q;
        if (visibility != 0) {
            if (i != 2) {
                return false;
            }
        } else if (i == 1) {
            return false;
        }
        return true;
    }
}
