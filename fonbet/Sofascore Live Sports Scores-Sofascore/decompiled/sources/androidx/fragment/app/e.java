package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import defpackage.fp4;
import defpackage.ixh;
import defpackage.nx0;
import defpackage.vs4;
import defpackage.ws4;
import defpackage.xs4;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e extends ixh {
    public final d c;
    public AnimatorSet d;

    public e(d dVar) {
        this.c = dVar;
    }

    @Override // defpackage.ixh
    public final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        AnimatorSet animatorSet = this.d;
        y yVar = this.c.a;
        if (animatorSet == null) {
            yVar.c(this);
            return;
        }
        if (yVar.g) {
            xs4.a.a(animatorSet);
        } else {
            animatorSet.end();
        }
        if (s.O(2)) {
            yVar.toString();
        }
    }

    @Override // defpackage.ixh
    public final void c(ViewGroup viewGroup) {
        viewGroup.getClass();
        y yVar = this.c.a;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            yVar.c(this);
            return;
        }
        animatorSet.start();
        if (s.O(2)) {
            Objects.toString(yVar);
        }
    }

    @Override // defpackage.ixh
    public final void d(nx0 nx0Var, ViewGroup viewGroup) {
        viewGroup.getClass();
        y yVar = this.c.a;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            yVar.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !yVar.c.mTransitioning) {
            return;
        }
        if (s.O(2)) {
            yVar.toString();
        }
        long a = ws4.a.a(animatorSet);
        long j = (long) (nx0Var.c * a);
        if (j == 0) {
            j = 1;
        }
        if (j == a) {
            j = a - 1;
        }
        if (s.O(2)) {
            animatorSet.toString();
            yVar.toString();
        }
        xs4.a.b(animatorSet, j);
    }

    @Override // defpackage.ixh
    public final void e(ViewGroup viewGroup) {
        e eVar;
        viewGroup.getClass();
        d dVar = this.c;
        if (dVar.a()) {
            return;
        }
        Context context = viewGroup.getContext();
        context.getClass();
        fp4 b = dVar.b(context);
        this.d = b != null ? (AnimatorSet) b.c : null;
        y yVar = dVar.a;
        Fragment fragment = yVar.c;
        boolean z = yVar.a == 3;
        View view = fragment.mView;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            eVar = this;
            animatorSet.addListener(new vs4(viewGroup, view, z, yVar, eVar));
        } else {
            eVar = this;
        }
        AnimatorSet animatorSet2 = eVar.d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
