package og;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class l {
    public static final boolean a(RecyclerView recyclerView) {
        RecyclerView.n itemAnimator;
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        return recyclerView.F0() || recyclerView.isLayoutRequested() || recyclerView.x0() || ((itemAnimator = recyclerView.getItemAnimator()) != null && itemAnimator.p());
    }
}
