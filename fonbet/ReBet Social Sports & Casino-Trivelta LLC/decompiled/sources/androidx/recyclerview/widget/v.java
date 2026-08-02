package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class v {
    public static int a(RecyclerView.B b10, s sVar, View view, View view2, RecyclerView.q qVar, boolean z10) {
        if (qVar.Z() == 0 || b10.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(qVar.s0(view) - qVar.s0(view2)) + 1;
        }
        return Math.min(sVar.n(), sVar.d(view2) - sVar.g(view));
    }

    public static int b(RecyclerView.B b10, s sVar, View view, View view2, RecyclerView.q qVar, boolean z10, boolean z11) {
        if (qVar.Z() == 0 || b10.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z11 ? Math.max(0, (b10.b() - Math.max(qVar.s0(view), qVar.s0(view2))) - 1) : Math.max(0, Math.min(qVar.s0(view), qVar.s0(view2)));
        if (z10) {
            return Math.round((max * (Math.abs(sVar.d(view2) - sVar.g(view)) / (Math.abs(qVar.s0(view) - qVar.s0(view2)) + 1))) + (sVar.m() - sVar.g(view)));
        }
        return max;
    }

    public static int c(RecyclerView.B b10, s sVar, View view, View view2, RecyclerView.q qVar, boolean z10) {
        if (qVar.Z() == 0 || b10.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return b10.b();
        }
        return (int) (((sVar.d(view2) - sVar.g(view)) / (Math.abs(qVar.s0(view) - qVar.s0(view2)) + 1)) * b10.b());
    }
}
