package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class opf implements gkh {
    public final View a;

    public opf(View view) {
        this.a = view;
    }

    public static a35 a(int i, int i2, int i3) {
        if (i == -2) {
            return v25.a;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            t25.a(i4);
            return new t25(i4);
        }
        int i5 = i2 - i3;
        if (i5 <= 0) {
            return null;
        }
        t25.a(i5);
        return new t25(i5);
    }

    public final kjh b() {
        View view = this.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        a35 a = a(layoutParams != null ? layoutParams.width : -1, view.getWidth(), view.getPaddingRight() + view.getPaddingLeft());
        if (a == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        a35 a2 = a(layoutParams2 != null ? layoutParams2.height : -1, view.getHeight(), view.getPaddingBottom() + view.getPaddingTop());
        if (a2 == null) {
            return null;
        }
        return new kjh(a, a2);
    }

    @Override // defpackage.gkh
    public final Object c(rq3 rq3Var) {
        kjh b = b();
        if (b != null) {
            return b;
        }
        lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
        lj2Var.t();
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        yuk yukVar = new yuk(this, viewTreeObserver, lj2Var, 0);
        viewTreeObserver.addOnPreDrawListener(yukVar);
        lj2Var.v(new tx5(3, this, viewTreeObserver, yukVar));
        Object q = lj2Var.q();
        lu3 lu3Var = lu3.a;
        return q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof opf) && Intrinsics.c(this.a, ((opf) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RealViewSizeResolver(view=" + this.a + ", subtractPadding=true)";
    }
}
