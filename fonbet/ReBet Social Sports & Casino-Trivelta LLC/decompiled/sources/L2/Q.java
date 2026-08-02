package L2;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public class Q extends P {
    @Override // L2.I
    public float b(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // L2.N, L2.I
    public void d(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // L2.I
    public void e(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // L2.P, L2.I
    public void f(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // L2.L, L2.I
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // L2.L, L2.I
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
