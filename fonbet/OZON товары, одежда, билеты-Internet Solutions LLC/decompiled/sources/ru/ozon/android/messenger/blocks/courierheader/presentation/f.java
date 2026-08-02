package ru.ozon.android.messenger.blocks.courierheader.presentation;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class f extends RecyclerView.n {

    /* renamed from: a, reason: collision with root package name */
    private final int f84965a;

    /* renamed from: b, reason: collision with root package name */
    private final int f84966b;

    public f(int i11, int i12) {
        this.f84965a = i11;
        this.f84966b = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.A a11) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        int a12 = Nh.a.a(recyclerView, "parent", a11, "state", view);
        int i11 = this.f84965a;
        if (a12 == 0) {
            outRect.left = i11;
            return;
        }
        if (recyclerView.getAdapter() != null) {
            if (recyclerView.getChildAdapterPosition(view) == r6.getItemCount() - 1) {
                outRect.right = i11;
                return;
            }
        }
        outRect.left = this.f84966b;
    }
}
