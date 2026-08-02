package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.view;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.luggageCell.AviaCheckTariffsLuggageCellVO;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u0013J$\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00162\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/view/AviaCheckTariffsLuggageCellView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp56", "", "dpf16", "", "cell", "Lru/ozon/uni/android/cell/CellView;", "shimmerView", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "bind", "", "data", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/luggageCell/AviaCheckTariffsLuggageCellVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "showContent", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "showShimmer", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaCheckTariffsLuggageCellView extends FrameLayout {
    public static final int $stable = RoundedShimmerView.$stable | CellView.$stable;

    @NotNull
    private final CellView cell;
    private final int dp56;
    private final float dpf16;

    @NotNull
    private final RoundedShimmerView shimmerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaCheckTariffsLuggageCellView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(56, context);
        this.dp56 = px;
        float pxF = ResourceExtKt.toPxF(16, context);
        this.dpf16 = pxF;
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        cellView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        cellView.setVisibility(8);
        addView(cellView);
        this.cell = cellView;
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView.setLayoutParams(new FrameLayout.LayoutParams(-1, px));
        roundedShimmerView.setCornerRadius(pxF);
        roundedShimmerView.setVisibility(8);
        addView(roundedShimmerView);
        this.shimmerView = roundedShimmerView;
    }

    private final void showContent(CellDTO data, Function1<? super AtomAction, Unit> actionHandler) {
        ViewExtKt.gone(this.shimmerView);
        ViewExtKt.show(this.cell);
        CellHolderKt.bind(this.cell, data, actionHandler);
    }

    private final void showShimmer() {
        ViewExtKt.show(this.shimmerView);
        ViewExtKt.gone(this.cell);
    }

    public final void bind(@NotNull AviaCheckTariffsLuggageCellVO data, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (data.getShouldShowLuggageCellShimmer() || data.getLuggageCell() == null) {
            showShimmer();
        } else {
            showContent(data.getLuggageCell(), actionHandler);
        }
    }
}
