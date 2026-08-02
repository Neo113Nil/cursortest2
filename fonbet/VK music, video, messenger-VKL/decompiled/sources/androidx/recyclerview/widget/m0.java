package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollbarHelper.java */
/* loaded from: classes12.dex */
public final class m0 {
    public static int a(RecyclerView.a0 a0Var, f0 f0Var, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.getChildCount() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.getPosition(view) - oVar.getPosition(view2)) + 1;
        }
        return Math.min(f0Var.l(), f0Var.b(view2) - f0Var.e(view));
    }

    public static int b(RecyclerView.a0 a0Var, f0 f0Var, View view, View view2, RecyclerView.o oVar, boolean z, boolean z2) {
        if (oVar.getChildCount() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (a0Var.b() - Math.max(oVar.getPosition(view), oVar.getPosition(view2))) - 1) : Math.max(0, Math.min(oVar.getPosition(view), oVar.getPosition(view2)));
        if (z) {
            return Math.round((max * (Math.abs(f0Var.b(view2) - f0Var.e(view)) / (Math.abs(oVar.getPosition(view) - oVar.getPosition(view2)) + 1))) + (f0Var.k() - f0Var.e(view)));
        }
        return max;
    }

    public static int c(RecyclerView.a0 a0Var, f0 f0Var, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.getChildCount() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return a0Var.b();
        }
        return (int) (((f0Var.b(view2) - f0Var.e(view)) / (Math.abs(oVar.getPosition(view) - oVar.getPosition(view2)) + 1)) * a0Var.b());
    }
}
