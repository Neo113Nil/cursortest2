package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nvk extends mvk {
    @Override // defpackage.tz9
    public final float F(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.tz9
    public final void M(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.mvk
    public final void o0(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.mvk
    public final void p0(int i, View view) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.mvk
    public final void q0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.mvk
    public final void r0(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }
}
