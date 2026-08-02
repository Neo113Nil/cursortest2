package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xh6 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ji6 c;
    public final /* synthetic */ ExpandableBehavior d;

    public xh6(ExpandableBehavior expandableBehavior, View view, int i, ji6 ji6Var) {
        this.d = expandableBehavior;
        this.a = view;
        this.b = i;
        this.c = ji6Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.d;
        if (expandableBehavior.a == this.b) {
            Object obj = this.c;
            expandableBehavior.w((View) obj, view, ((FloatingActionButton) obj).o.b, false);
        }
        return false;
    }
}
