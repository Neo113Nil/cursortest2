package ru.ozon.android.messenger.blocks.ratemessenger.recycler.decoration;

import E0.C2942q;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.utils.e;

/* loaded from: classes10.dex */
public final class a extends RecyclerView.n {
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.A a11) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        int itemCount = C2942q.a(recyclerView, "parent", a11, "state") != null ? r6.getItemCount() - 1 : 0;
        i11 = e.f91911h;
        outRect.left = i11;
        if (recyclerView.getChildAdapterPosition(view) == itemCount) {
            i12 = e.f91911h;
            outRect.right = i12;
        }
    }
}
