package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v0 extends u0 {
    @Override // androidx.transition.u0, a.a
    public final void A(View view, int i5) {
        view.setTransitionVisibility(i5);
    }

    @Override // androidx.transition.u0
    public final void H(View view, int i5, int i10, int i11, int i12) {
        view.setLeftTopRightBottom(i5, i10, i11, i12);
    }

    @Override // androidx.transition.u0
    public final void I(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.u0
    public final void J(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // a.a
    public final float s(View view) {
        return view.getTransitionAlpha();
    }

    @Override // a.a
    public final void z(View view, float f6) {
        view.setTransitionAlpha(f6);
    }
}
