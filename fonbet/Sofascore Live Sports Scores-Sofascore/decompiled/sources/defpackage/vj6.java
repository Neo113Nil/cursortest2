package defpackage;

import android.animation.Animator;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vj6 extends f51 {
    public boolean g;
    public final /* synthetic */ ExtendedFloatingActionButton h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj6(ExtendedFloatingActionButton extendedFloatingActionButton, j0l j0lVar) {
        super(extendedFloatingActionButton, j0lVar);
        this.h = extendedFloatingActionButton;
    }

    @Override // defpackage.f51
    public final int c() {
        return R.animator.mtrl_extended_fab_hide_motion_spec;
    }

    @Override // defpackage.f51
    public final void d() {
        super.d();
        this.g = true;
    }

    @Override // defpackage.f51
    public final void e() {
        this.d.b = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.h;
        extendedFloatingActionButton.Q = 0;
        if (this.g) {
            return;
        }
        extendedFloatingActionButton.setVisibility(8);
    }

    @Override // defpackage.f51
    public final void f(Animator animator) {
        j0l j0lVar = this.d;
        Animator animator2 = (Animator) j0lVar.b;
        if (animator2 != null) {
            animator2.cancel();
        }
        j0lVar.b = animator;
        this.g = false;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.h;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.Q = 1;
    }

    @Override // defpackage.f51
    public final void g() {
        this.h.setVisibility(8);
    }

    @Override // defpackage.f51
    public final boolean h() {
        e51 e51Var = ExtendedFloatingActionButton.j0;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.h;
        int visibility = extendedFloatingActionButton.getVisibility();
        int i = extendedFloatingActionButton.Q;
        if (visibility == 0) {
            if (i != 1) {
                return false;
            }
        } else if (i == 2) {
            return false;
        }
        return true;
    }
}
