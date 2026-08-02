package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.ql3;
import defpackage.tl3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class Group extends ql3 {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.ql3
    public final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    @Override // defpackage.ql3
    public final void j() {
        tl3 tl3Var = (tl3) getLayoutParams();
        tl3Var.p0.S(0);
        tl3Var.p0.N(0);
    }

    @Override // defpackage.ql3, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        d();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        d();
    }
}
