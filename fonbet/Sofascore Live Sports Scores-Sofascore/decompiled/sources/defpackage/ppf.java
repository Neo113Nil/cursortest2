package defpackage;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ppf implements hkh {
    public final ImageView a;

    public ppf(ImageView imageView) {
        this.a = imageView;
    }

    public static s02 a(int i, int i2, int i3) {
        if (i == -2) {
            return w25.j;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            return new u25(i4);
        }
        int i5 = i2 - i3;
        if (i5 > 0) {
            return new u25(i5);
        }
        return null;
    }

    public jjh b() {
        ImageView imageView = this.a;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        s02 a = a(layoutParams != null ? layoutParams.width : -1, imageView.getWidth(), imageView.getPaddingRight() + imageView.getPaddingLeft());
        if (a == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        s02 a2 = a(layoutParams2 != null ? layoutParams2.height : -1, imageView.getHeight(), imageView.getPaddingBottom() + imageView.getPaddingTop());
        if (a2 == null) {
            return null;
        }
        return new jjh(a, a2);
    }

    @Override // defpackage.hkh
    public Object c(rq3 rq3Var) {
        jjh b = b();
        if (b != null) {
            return b;
        }
        lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
        lj2Var.t();
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        yuk yukVar = new yuk(this, viewTreeObserver, lj2Var, 1);
        viewTreeObserver.addOnPreDrawListener(yukVar);
        lj2Var.v(new x40(9, this, viewTreeObserver, yukVar));
        Object q = lj2Var.q();
        lu3 lu3Var = lu3.a;
        return q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ppf) {
            return this.a.equals(((ppf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }
}
