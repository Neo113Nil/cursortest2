package ru.ozon.app.android.overlayIslandSeparator;

import android.content.Context;
import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorVO;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/overlayIslandSeparator/OverlayIslandSeparatorViewHolder;", "Ld20/a;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorVO;", "Ll10/i;", "container", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "islandSeparatorView", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;Ld20/e;)V", "", "getOverlapSize", "(Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorVO;)I", "item", "", "bind", "(Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorVO;)V", "onWidgetDestroyed", "()V", "Ll10/i;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "island-separator_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OverlayIslandSeparatorViewHolder extends AbstractC6064a<IslandSeparatorVO> {

    @NotNull
    private final i container;

    @NotNull
    private final IslandSeparatorView islandSeparatorView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayIslandSeparatorViewHolder(@NotNull i container, @NotNull IslandSeparatorView islandSeparatorView, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(islandSeparatorView, "islandSeparatorView");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.islandSeparatorView = islandSeparatorView;
    }

    private final int getOverlapSize(IslandSeparatorVO islandSeparatorVO) {
        int corner_height_px = (int) IslandSeparatorView.INSTANCE.getCORNER_HEIGHT_PX();
        if (islandSeparatorVO.getHasBottomCorners() && islandSeparatorVO.getHasTopCorners()) {
            return (corner_height_px * 2) + islandSeparatorVO.getPhysicalPartHeight();
        }
        if (islandSeparatorVO.getHasBottomCorners()) {
            return islandSeparatorVO.getPhysicalPartHeight() + corner_height_px;
        }
        if (islandSeparatorVO.getHasTopCorners()) {
            return corner_height_px;
        }
        return 0;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        i iVar = this.container;
        int i11 = i.f72380h0;
        iVar.k0(0, 0);
        super.onWidgetDestroyed();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull IslandSeparatorVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        IslandSeparatorView islandSeparatorView = this.islandSeparatorView;
        int physicalPartHeight = item.getPhysicalPartHeight();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context L11 = this.container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        islandSeparatorView.setViewState(new IslandSeparatorView.ViewState(item.getHasTopCorners(), item.getHasBottomCorners(), physicalPartHeight, styleParser.parseColor(L11, item.getBackgroundColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_PRIMARY)));
        i iVar = this.container;
        int overlapSize = getOverlapSize(item);
        iVar.k0(overlapSize, overlapSize);
    }
}
