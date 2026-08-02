package ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.monetization.flags.CellHorizontalScrollComposeFlag;
import ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.data.CellHorizontalScrollDTO;
import ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.di.CellHorizontalScrollComponent;
import ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.presentation.singleCell.SingleCellHorizontalScrollVI;
import ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.presentation.singleCell.SingleCellHorizontalScrollViewHolder;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/core/SingleCellHorizontalScrollViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/data/CellHorizontalScrollDTO;", "Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/presentation/singleCell/SingleCellHorizontalScrollVI;", "Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/di/CellHorizontalScrollComponent;", "component", "<init>", "(Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/di/CellHorizontalScrollComponent;)V", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/data/CellHorizontalScrollDTO;Ll20/d;)Ljava/util/List;", "Landroid/view/ViewGroup;", "parent", "Landroid/widget/FrameLayout;", "createView", "(Landroid/view/ViewGroup;)Landroid/widget/FrameLayout;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/di/CellHorizontalScrollComponent;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SingleCellHorizontalScrollViewMapper extends g<CellHorizontalScrollDTO, SingleCellHorizontalScrollVI> {

    @NotNull
    private final CellHorizontalScrollComponent component;

    public SingleCellHorizontalScrollViewMapper(@NotNull CellHorizontalScrollComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof CellHorizontalScrollDTO) && ((CellHorizontalScrollDTO) state).getCells().size() == 1 && !this.component.getFeatureChecker().isEnabled(CellHorizontalScrollComposeFlag.INSTANCE);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<SingleCellHorizontalScrollVI> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new SingleCellHorizontalScrollViewHolder(container, (FrameLayout) view, this.component.getTokenizedAnalytics(), this.component.getActionHandlerComponentApi());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public FrameLayout createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FrameLayout frameLayout = new FrameLayout(parent.getContext());
        Context context = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        frameLayout.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        Dimens dimens = Dimens.INSTANCE;
        frameLayout.setPadding(dimens.getDP_16(), 0, dimens.getDP_16(), 0);
        return frameLayout;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<SingleCellHorizontalScrollVI> map(@NotNull CellHorizontalScrollDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        CellDTO cellDTO = (CellDTO) C7714v.K(state.getCells());
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new SingleCellHorizontalScrollVI(hashCode, cellDTO, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, state.getTestInfo()));
    }
}
