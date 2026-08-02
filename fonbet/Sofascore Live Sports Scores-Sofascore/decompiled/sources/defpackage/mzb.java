package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mzb extends bwk {
    public final fn6 G;
    public final org H;
    public final ArrayList I = new ArrayList();

    public mzb(fn6 fn6Var, org orgVar) {
        this.G = fn6Var;
        this.H = orgVar;
    }

    public static void U(ArrayList arrayList, dwk dwkVar, ViewGroup viewGroup, View view, boolean z) {
        if (dwkVar == null) {
            return;
        }
        Animator b = z ? dwkVar.b(view) : dwkVar.a(view);
        if (b != null) {
            arrayList.add(b);
        }
    }

    @Override // defpackage.bwk
    public final Animator R(ViewGroup viewGroup, View view, oxj oxjVar) {
        return V(viewGroup, view, true);
    }

    @Override // defpackage.bwk
    public final Animator S(ViewGroup viewGroup, View view, oxj oxjVar, oxj oxjVar2) {
        return V(viewGroup, view, false);
    }

    public final AnimatorSet V(ViewGroup viewGroup, View view, boolean z) {
        int M;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        U(arrayList, this.G, viewGroup, view, z);
        U(arrayList, this.H, viewGroup, view, z);
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            U(arrayList, (dwk) it.next(), viewGroup, view, z);
        }
        Context context = viewGroup.getContext();
        int i = z ? R.attr.motionDurationMedium4 : R.attr.motionDurationShort3;
        int i2 = mxj.a;
        if (this.c == -1 && (M = x2a.M(context, i, -1)) != -1) {
            this.c = M;
        }
        int i3 = z ? R.attr.motionEasingEmphasizedDecelerateInterpolator : R.attr.motionEasingEmphasizedAccelerateInterpolator;
        LinearInterpolator linearInterpolator = e80.a;
        if (this.d == null) {
            this.d = yfa.E(context, i3, linearInterpolator);
        }
        zm2.B(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // defpackage.xwj
    public final boolean t() {
        return true;
    }
}
