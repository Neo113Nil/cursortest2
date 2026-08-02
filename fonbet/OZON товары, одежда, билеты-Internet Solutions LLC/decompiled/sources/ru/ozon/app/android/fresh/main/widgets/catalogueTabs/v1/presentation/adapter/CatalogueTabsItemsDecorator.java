package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.presentation.adapter;

import Nh.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.data.CatalogueTabsDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u001b\u0010 \u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010#\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u001b\u0010&\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u001b\u0010)\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u001b\u0010,\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\u001f¨\u0006-"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/presentation/adapter/CatalogueTabsItemsDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "tabsGapPadding", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO$CatalogueTabsPaddings;", "recyclerViewMargins", "<init>", "(Landroid/content/Context;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO$CatalogueTabsPaddings;)V", "padding", "", "getDimension", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)I", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/content/Context;", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO$CatalogueTabsPaddings;", "topOffsetPx$delegate", "LSc/j;", "getTopOffsetPx", "()I", "topOffsetPx", "bottomOffsetPx$delegate", "getBottomOffsetPx", "bottomOffsetPx", "leftOffsetPx$delegate", "getLeftOffsetPx", "leftOffsetPx", "rightOffsetPx$delegate", "getRightOffsetPx", "rightOffsetPx", "halfMiddleOffsetPx$delegate", "getHalfMiddleOffsetPx", "halfMiddleOffsetPx", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogueTabsItemsDecorator extends RecyclerView.n {

    /* renamed from: bottomOffsetPx$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bottomOffsetPx;

    @NotNull
    private final Context context;

    /* renamed from: halfMiddleOffsetPx$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j halfMiddleOffsetPx;

    /* renamed from: leftOffsetPx$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j leftOffsetPx;

    @NotNull
    private final CatalogueTabsDTO.CatalogueTabsPaddings recyclerViewMargins;

    /* renamed from: rightOffsetPx$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j rightOffsetPx;

    @NotNull
    private final CommonCellSettings.LayoutPadding tabsGapPadding;

    /* renamed from: topOffsetPx$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j topOffsetPx;

    public CatalogueTabsItemsDecorator(@NotNull Context context, @NotNull CommonCellSettings.LayoutPadding tabsGapPadding, @NotNull CatalogueTabsDTO.CatalogueTabsPaddings recyclerViewMargins) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tabsGapPadding, "tabsGapPadding");
        Intrinsics.checkNotNullParameter(recyclerViewMargins, "recyclerViewMargins");
        this.context = context;
        this.tabsGapPadding = tabsGapPadding;
        this.recyclerViewMargins = recyclerViewMargins;
        this.topOffsetPx = k.b(new CatalogueTabsItemsDecorator$topOffsetPx$2(this));
        this.bottomOffsetPx = k.b(new CatalogueTabsItemsDecorator$bottomOffsetPx$2(this));
        this.leftOffsetPx = k.b(new CatalogueTabsItemsDecorator$leftOffsetPx$2(this));
        this.rightOffsetPx = k.b(new CatalogueTabsItemsDecorator$rightOffsetPx$2(this));
        this.halfMiddleOffsetPx = k.b(new CatalogueTabsItemsDecorator$halfMiddleOffsetPx$2(this));
    }

    private final int getBottomOffsetPx() {
        return ((Number) this.bottomOffsetPx.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDimension(CommonCellSettings.LayoutPadding padding) {
        return (int) this.context.getResources().getDimension(padding.getCellLayoutPadding());
    }

    private final int getHalfMiddleOffsetPx() {
        return ((Number) this.halfMiddleOffsetPx.getValue()).intValue();
    }

    private final int getLeftOffsetPx() {
        return ((Number) this.leftOffsetPx.getValue()).intValue();
    }

    private final int getRightOffsetPx() {
        return ((Number) this.rightOffsetPx.getValue()).intValue();
    }

    private final int getTopOffsetPx() {
        return ((Number) this.topOffsetPx.getValue()).intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        int a11 = a.a(parent, "parent", state, "state", view);
        if (a11 == -1) {
            return;
        }
        outRect.set(a11 == 0 ? getLeftOffsetPx() : getHalfMiddleOffsetPx(), getTopOffsetPx(), state.b() - 1 == a11 ? getRightOffsetPx() : getHalfMiddleOffsetPx(), getBottomOffsetPx());
    }
}
