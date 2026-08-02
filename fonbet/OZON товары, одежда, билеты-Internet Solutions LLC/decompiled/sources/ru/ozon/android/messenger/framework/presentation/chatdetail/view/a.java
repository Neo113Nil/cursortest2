package ru.ozon.android.messenger.framework.presentation.chatdetail.view;

import E0.C2942q;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.utils.e;

/* loaded from: classes10.dex */
public final class a extends RecyclerView.n {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f89949a;

    public a(boolean z11) {
        this.f89949a = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.A a11) {
        int i11;
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView.g a12 = C2942q.a(recyclerView, "parent", a11, "state");
        ru.ozon.android.messenger.blocks.buttons.presentation.c cVar = a12 instanceof ru.ozon.android.messenger.blocks.buttons.presentation.c ? (ru.ozon.android.messenger.blocks.buttons.presentation.c) a12 : null;
        if (cVar == null) {
            return;
        }
        List<ru.ozon.android.messenger.blocks.buttons.a> currentList = cVar.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        int P11 = C7714v.P(currentList);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (this.f89949a) {
            i14 = e.f91907d;
            outRect.top = i14;
        }
        if (childAdapterPosition <= 0) {
            i13 = e.f91911h;
            outRect.left = i13;
        }
        if (childAdapterPosition == P11) {
            i12 = e.f91911h;
            outRect.right = i12;
        } else {
            i11 = e.f91907d;
            outRect.right = i11;
        }
    }
}
