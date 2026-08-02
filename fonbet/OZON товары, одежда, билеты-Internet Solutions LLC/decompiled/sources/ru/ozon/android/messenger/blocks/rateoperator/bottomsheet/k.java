package ru.ozon.android.messenger.blocks.rateoperator.bottomsheet;

import E0.C2942q;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class k extends RecyclerView.n {
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.A a11) {
        int i11;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView.g a12 = C2942q.a(recyclerView, "parent", a11, "state");
        m mVar = a12 instanceof m ? (m) a12 : null;
        if (mVar == null) {
            return;
        }
        outRect.right = recyclerView.getChildAdapterPosition(view) == mVar.getCardsCount() + (-1) ? 0 : ru.ozon.android.messenger.utils.e.f91908e;
        i11 = ru.ozon.android.messenger.utils.e.f91910g;
        outRect.bottom = i11;
    }
}
