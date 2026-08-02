package ru.ozon.app.android.marketing.widgets.notificationssettings.presentation;

import A10.h;
import a20.C4926e;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m10.C8042d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.title.NotificationsSettingsTitleViewHolder;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "dp1", "F", "dp16", "", "dp28", "I", "Landroid/graphics/Paint;", "line", "Landroid/graphics/Paint;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationsSettingsDecoration extends RecyclerView.n {
    private final float dp1;
    private final float dp16;
    private final int dp28;

    @NotNull
    private final Paint line;

    public NotificationsSettingsDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        float px = ResourceExtKt.toPx(1);
        this.dp1 = px;
        this.dp16 = ResourceExtKt.toPx(16);
        this.dp28 = ResourceExtKt.toPx(28);
        Paint paint = new Paint();
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        paint.setStrokeWidth(px);
        this.line = paint;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        if (r7 == 0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        boolean z11;
        RecyclerView.g adapter;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        if (parent.getChildAdapterPosition(view) == -1) {
            return;
        }
        RecyclerView.C childViewHolder = parent.getChildViewHolder(view);
        boolean z12 = childViewHolder instanceof NotificationsSettingsTitleViewHolder;
        boolean z13 = false;
        if (childViewHolder.getAdapterPosition() != 0) {
            View view2 = childViewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            Intrinsics.checkNotNullParameter(view2, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            if (h.a(parent)) {
                RecyclerView.g adapter2 = parent.getAdapter();
                C8042d c8042d = adapter2 instanceof C8042d ? (C8042d) adapter2 : null;
                if (c8042d == null) {
                    throw new IllegalStateException("Only composer recyclerView is supported");
                }
                RecyclerView.o layoutManager = parent.getLayoutManager();
                GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                if (gridLayoutManager == null) {
                    throw new IllegalStateException("Only GridLayoutManager is supported");
                }
                int childAdapterPosition = parent.getChildAdapterPosition(view2);
                if (childAdapterPosition != -1 && childAdapterPosition != 0 && childAdapterPosition <= gridLayoutManager.g()) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    GridLayoutManager.b bVar = layoutParams instanceof GridLayoutManager.b ? (GridLayoutManager.b) layoutParams : null;
                    if (bVar == null) {
                        throw new IllegalStateException("Unsupported LayoutParams type");
                    }
                    int i11 = childAdapterPosition - 1;
                    int c11 = bVar.c();
                    while (c11 > 0 && i11 > 0) {
                        c11 -= c8042d.h(i11).p().a();
                        i11--;
                    }
                }
            }
            z11 = true;
            adapter = parent.getAdapter();
            if (adapter != null) {
                if (childViewHolder.getAdapterPosition() == adapter.getShimmersCount() - 1) {
                    z13 = true;
                }
            }
            if (z12 && z11) {
                outRect.top = this.dp28;
            }
            if (z13) {
                return;
            }
            outRect.bottom = this.dp28;
            return;
        }
        z11 = false;
        adapter = parent.getAdapter();
        if (adapter != null) {
        }
        if (z12) {
            outRect.top = this.dp28;
        }
        if (z13) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(canvas, parent, state);
        int childCount = parent.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = parent.getChildAt(i11);
            int childAdapterPosition = parent.getChildAdapterPosition(childAt);
            RecyclerView.C childViewHolder = parent.getChildViewHolder(childAt);
            if (childAdapterPosition != -1) {
                Intrinsics.f(childViewHolder);
                Intrinsics.checkNotNullParameter(childViewHolder, "<this>");
                if (!(childViewHolder instanceof C4926e)) {
                    canvas2 = canvas;
                    canvas2.drawRect(this.dp16, childAt.getBottom(), parent.getWidth(), childAt.getBottom() + this.dp1, this.line);
                    i11++;
                    canvas = canvas2;
                }
            }
            canvas2 = canvas;
            i11++;
            canvas = canvas2;
        }
    }
}
