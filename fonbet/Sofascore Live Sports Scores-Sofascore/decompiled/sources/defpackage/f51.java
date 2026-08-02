package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class f51 {
    public final Context a;
    public final ExtendedFloatingActionButton b;
    public final ArrayList c = new ArrayList();
    public final j0l d;
    public cwc e;
    public cwc f;

    public f51(ExtendedFloatingActionButton extendedFloatingActionButton, j0l j0lVar) {
        this.b = extendedFloatingActionButton;
        this.a = extendedFloatingActionButton.getContext();
        this.d = j0lVar;
    }

    public AnimatorSet a() {
        cwc cwcVar = this.f;
        if (cwcVar == null) {
            cwcVar = this.e;
            if (cwcVar == null) {
                cwcVar = cwc.b(c(), this.a);
                this.e = cwcVar;
            }
            cwcVar.getClass();
        }
        return b(cwcVar);
    }

    public final AnimatorSet b(cwc cwcVar) {
        ArrayList arrayList = new ArrayList();
        boolean g = cwcVar.g("opacity");
        ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        if (g) {
            arrayList.add(cwcVar.d("opacity", extendedFloatingActionButton, View.ALPHA));
        }
        if (cwcVar.g("scale")) {
            arrayList.add(cwcVar.d("scale", extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(cwcVar.d("scale", extendedFloatingActionButton, View.SCALE_X));
        }
        if (cwcVar.g("width")) {
            arrayList.add(cwcVar.d("width", extendedFloatingActionButton, ExtendedFloatingActionButton.j0));
        }
        if (cwcVar.g("height")) {
            arrayList.add(cwcVar.d("height", extendedFloatingActionButton, ExtendedFloatingActionButton.k0));
        }
        if (cwcVar.g("paddingStart")) {
            arrayList.add(cwcVar.d("paddingStart", extendedFloatingActionButton, ExtendedFloatingActionButton.l0));
        }
        if (cwcVar.g("paddingEnd")) {
            arrayList.add(cwcVar.d("paddingEnd", extendedFloatingActionButton, ExtendedFloatingActionButton.m0));
        }
        if (cwcVar.g("labelOpacity")) {
            arrayList.add(cwcVar.d("labelOpacity", extendedFloatingActionButton, new e51(0, "LABEL_OPACITY_PROPERTY", Float.class)));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        zm2.B(animatorSet, arrayList);
        return animatorSet;
    }

    public abstract int c();

    public void d() {
        this.d.b = null;
    }

    public abstract void e();

    public abstract void f(Animator animator);

    public abstract void g();

    public abstract boolean h();
}
