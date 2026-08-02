package ru.ozon.android.messenger.blocks.input.attachments.presentation;

import E0.C2942q;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

/* loaded from: classes10.dex */
public final class d extends RecyclerView.n {

    /* renamed from: a, reason: collision with root package name */
    private final int f85494a;

    /* renamed from: b, reason: collision with root package name */
    private final int f85495b;

    public d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f85494a = UiExtKt.toPx(12);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i11 = (int) ((((displayMetrics.widthPixels / displayMetrics.density) - 12) - 308.0d) / 5);
        this.f85495b = UiExtKt.toPx(((i11 >= 12 ? i11 : 12) > 24 ? 24 : r0) - 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.A a11) {
        int childAdapterPosition;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        if (C2942q.a(recyclerView, "parent", a11, "state") != null && (childAdapterPosition = recyclerView.getChildAdapterPosition(view)) >= 0) {
            int i11 = this.f85494a;
            if (childAdapterPosition == 0) {
                outRect.left = i11;
            }
            if (childAdapterPosition != r6.getItemCount() - 1) {
                i11 = this.f85495b;
            }
            outRect.right = i11;
        }
    }
}
