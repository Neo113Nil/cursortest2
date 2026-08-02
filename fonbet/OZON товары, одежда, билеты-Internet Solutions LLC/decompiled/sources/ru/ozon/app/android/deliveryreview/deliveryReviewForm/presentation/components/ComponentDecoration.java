package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentAdapter;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "", "currentPosition", "", "shouldDraw", "(Landroidx/recyclerview/widget/RecyclerView;I)Z", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "leftMargin", "I", "separatorHeight", "Landroid/graphics/Paint;", "separatorPaint", "Landroid/graphics/Paint;", "Landroid/graphics/Rect;", "rect", "Landroid/graphics/Rect;", "", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;", "items", "Ljava/util/List;", "getItems$deliveryreview_prodGoogleAllVendorsRelease", "()Ljava/util/List;", "setItems$deliveryreview_prodGoogleAllVendorsRelease", "(Ljava/util/List;)V", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComponentDecoration extends RecyclerView.n {

    @NotNull
    private List<ComponentVO> items;
    private final int leftMargin;

    @NotNull
    private Rect rect;
    private final int separatorHeight;

    @NotNull
    private final Paint separatorPaint;

    public ComponentDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.leftMargin = ResourceExtKt.toPx(16, context);
        this.separatorHeight = ResourceExtKt.toPx(1, context);
        Paint paint = new Paint();
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        this.separatorPaint = paint;
        this.rect = new Rect();
        this.items = K.f71697a;
    }

    private final boolean shouldDraw(RecyclerView parent, int currentPosition) {
        RecyclerView.g adapter = parent.getAdapter();
        ComponentAdapter componentAdapter = adapter instanceof ComponentAdapter ? (ComponentAdapter) adapter : null;
        if (1 <= currentPosition && currentPosition < this.items.size()) {
            Integer valueOf = componentAdapter != null ? Integer.valueOf(componentAdapter.getItemViewType(currentPosition)) : null;
            int id2 = ComponentAdapter.ElementType.CHECKBOX.getId();
            if (valueOf == null || valueOf.intValue() != id2) {
                int id3 = ComponentAdapter.ElementType.RADIO.getId();
                if (valueOf == null || valueOf.intValue() != id3) {
                    return false;
                }
            }
            if (!this.items.get(currentPosition).getHidden()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        for (View view : ViewGroupExtKt.children(parent)) {
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            parent.getDecoratedBoundsWithMargins(view, this.rect);
            if (shouldDraw(parent, childAdapterPosition)) {
                Rect rect = this.rect;
                rect.bottom = rect.top + this.separatorHeight;
                rect.left = this.leftMargin;
                c11.drawRect(rect, this.separatorPaint);
            }
        }
    }

    public final void setItems$deliveryreview_prodGoogleAllVendorsRelease(@NotNull List<ComponentVO> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.items = list;
    }
}
