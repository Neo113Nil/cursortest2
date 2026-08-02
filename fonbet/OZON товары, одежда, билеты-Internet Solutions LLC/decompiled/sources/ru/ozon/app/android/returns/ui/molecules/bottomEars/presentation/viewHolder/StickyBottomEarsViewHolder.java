package ru.ozon.app.android.returns.ui.molecules.bottomEars.presentation.viewHolder;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import d20.AbstractC6067d;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.returns.ui.molecules.bottomEars.presentation.viewItem.StickyBottomEarsVI;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/bottomEars/presentation/viewHolder/StickyBottomEarsViewHolder;", "Ld20/d;", "Lru/ozon/app/android/returns/ui/molecules/bottomEars/presentation/viewItem/StickyBottomEarsVI;", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Ld20/e;)V", "item", "", "bind", "(Lru/ozon/app/android/returns/ui/molecules/bottomEars/presentation/viewItem/StickyBottomEarsVI;)V", "onWidgetCreated", "()V", "onWidgetDestroyed", "Ll10/i;", "Lru/ozon/app/android/returns/ui/molecules/bottomEars/presentation/viewHolder/StickyBottomEarsItemDecoration;", "decoration", "Lru/ozon/app/android/returns/ui/molecules/bottomEars/presentation/viewHolder/StickyBottomEarsItemDecoration;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StickyBottomEarsViewHolder extends AbstractC6067d<StickyBottomEarsVI> {

    @NotNull
    private final i container;

    @NotNull
    private final StickyBottomEarsItemDecoration decoration;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyBottomEarsViewHolder(@NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.decoration = new StickyBottomEarsItemDecoration((int) IslandSeparatorView.INSTANCE.getCORNER_HEIGHT_PX());
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        ComposerViewExtensionKt.composerRecyclerView(this.container.Y()).addItemDecoration(this.decoration);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        ComposerViewExtensionKt.composerRecyclerView(this.container.Y()).removeItemDecoration(this.decoration);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull StickyBottomEarsVI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        View view = getView();
        IslandSeparatorView islandSeparatorView = view instanceof IslandSeparatorView ? (IslandSeparatorView) view : null;
        if (islandSeparatorView != null) {
            int physicalPartHeight = item.getIslandSeparator().getPhysicalPartHeight();
            StyleParser styleParser = StyleParser.INSTANCE;
            Context L11 = this.container.L();
            Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
            String backgroundColor = item.getIslandSeparator().getBackgroundColor();
            AppTokensProvider.Colors colors = AppTokensProvider.Colors.INSTANCE;
            Context L12 = this.container.L();
            Intrinsics.checkNotNullExpressionValue(L12, "<get-context>(...)");
            islandSeparatorView.setViewState(new IslandSeparatorView.ViewState(item.getIslandSeparator().getHasTopCorners(), item.getIslandSeparator().getHasBottomCorners(), physicalPartHeight, styleParser.parseColor(L11, backgroundColor, colors.layerFloor0(L12).getResId())));
        }
    }
}
