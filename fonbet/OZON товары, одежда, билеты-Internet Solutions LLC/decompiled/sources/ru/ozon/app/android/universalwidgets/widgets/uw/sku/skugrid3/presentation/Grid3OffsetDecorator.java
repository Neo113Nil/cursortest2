package ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid3.presentation;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.decorators.GridCellsOffsetDecorator;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid3/presentation/Grid3OffsetDecorator;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/decorators/GridCellsOffsetDecorator;", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "Landroidx/recyclerview/widget/RecyclerView$C;", "vhClass", "<init>", "(Landroid/content/Context;Ljava/lang/Class;)V", "", "spanPosition", "Landroid/view/View;", "view", "Landroid/graphics/Rect;", "outRect", "", "itemOffsetWithSpanPosition", "(ILandroid/view/View;Landroid/graphics/Rect;)V", "decoratedVhClass", "", "needDecorate", "(Ljava/lang/Class;)Z", "Ljava/lang/Class;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Grid3OffsetDecorator extends GridCellsOffsetDecorator {

    @NotNull
    private final Class<? extends RecyclerView.C> vhClass;
    private static final int screenOffset = ResourceExtKt.toPx(16);
    private static final int itemOffset = ResourceExtKt.toPx(8);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Grid3OffsetDecorator(@NotNull Context context, @NotNull Class<? extends RecyclerView.C> vhClass) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vhClass, "vhClass");
        this.vhClass = vhClass;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.decorators.GridCellsOffsetDecorator
    public void itemOffsetWithSpanPosition(int spanPosition, @NotNull View view, @NotNull Rect outRect) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        if (spanPosition == 0) {
            GridCellsOffsetDecorator.updateRect$default(this, outRect, Integer.valueOf(screenOffset), null, null, null, 14, null);
            return;
        }
        if (spanPosition == 1) {
            int i11 = itemOffset;
            GridCellsOffsetDecorator.updateRect$default(this, outRect, Integer.valueOf(i11), Integer.valueOf(i11), null, null, 12, null);
        } else {
            if (spanPosition != 2) {
                return;
            }
            GridCellsOffsetDecorator.updateRect$default(this, outRect, null, Integer.valueOf(screenOffset), null, null, 13, null);
        }
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.decorators.GridCellsOffsetDecorator
    public boolean needDecorate(@NotNull Class<? extends RecyclerView.C> decoratedVhClass) {
        Intrinsics.checkNotNullParameter(decoratedVhClass, "decoratedVhClass");
        return Intrinsics.d(decoratedVhClass, this.vhClass);
    }
}
