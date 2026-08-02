package ru.ozon.app.android.pdp.widgets.cashbackPoints.presentation;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.cashbackPoints.presentation.CashbackPointsVO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cashbackPoints/presentation/CashbackPointDoubleBlockView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "firstBlockView", "Lru/ozon/app/android/pdp/widgets/cashbackPoints/presentation/CashbackPointSingleBlockView;", "secondBlockView", "bind", "", "blocks", "Lkotlin/Pair;", "Lru/ozon/app/android/pdp/widgets/cashbackPoints/presentation/CashbackPointsVO$Block;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CashbackPointDoubleBlockView extends LinearLayout {

    @NotNull
    private final CashbackPointSingleBlockView firstBlockView;

    @NotNull
    private final CashbackPointSingleBlockView secondBlockView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashbackPointDoubleBlockView(@NotNull Context context) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        CashbackPointSingleBlockView cashbackPointSingleBlockView = new CashbackPointSingleBlockView(context);
        addView(cashbackPointSingleBlockView);
        this.firstBlockView = cashbackPointSingleBlockView;
        CashbackPointSingleBlockView cashbackPointSingleBlockView2 = new CashbackPointSingleBlockView(context);
        ViewGroup.LayoutParams layoutParams = cashbackPointSingleBlockView2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        Dimens dimens = Dimens.INSTANCE;
        layoutParams2.leftMargin = dimens.getDP_8();
        cashbackPointSingleBlockView2.setLayoutParams(layoutParams2);
        addView(cashbackPointSingleBlockView2);
        this.secondBlockView = cashbackPointSingleBlockView2;
        setId(R$id.cashbackPointDoubleBlockV);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = dimens.getDP_16();
        layoutParams3.rightMargin = dimens.getDP_16();
        setLayoutParams(layoutParams3);
        setOrientation(0);
    }

    public final void bind(@NotNull Pair<CashbackPointsVO.Block, CashbackPointsVO.Block> blocks) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.firstBlockView.bind(blocks.e(), true);
        this.secondBlockView.bind(blocks.f(), true);
    }
}
