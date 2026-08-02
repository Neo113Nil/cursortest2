package ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.views;

import Bi.a;
import android.content.Context;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.presentation.footer.SegmentedTrainRouteFooterVI;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/views/SegmentedTrainRouteFooterView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp10", "", "dp12", "dp16", "dpf16", "", "localTimeInfoTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "toggleDetailsButtonCV", "Lru/ozon/uni/android/cell/CellView;", "bind", "", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/footer/SegmentedTrainRouteFooterVI;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SegmentedTrainRouteFooterView extends LinearLayout {
    public static final int $stable = CellView.$stable | TextAtomV2View.$stable;
    private final int dp10;
    private final int dp12;
    private final int dp16;
    private final float dpf16;

    @NotNull
    private final TextAtomV2View localTimeInfoTAV;

    @NotNull
    private final CellView toggleDetailsButtonCV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedTrainRouteFooterView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(10, context);
        this.dp10 = px;
        int px2 = ResourceExtKt.toPx(12, context);
        this.dp12 = px2;
        int px3 = ResourceExtKt.toPx(16, context);
        this.dp16 = px3;
        float pxF = ResourceExtKt.toPxF(16, context);
        this.dpf16 = pxF;
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.g(N.b(TextAtomV2View.class), context);
        a.d(-1, -2, textAtomV2View);
        this.localTimeInfoTAV = textAtomV2View;
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = px;
        cellView.setLayoutParams(layoutParams);
        this.toggleDetailsButtonCV = cellView;
        setPadding(px2, px3, px2, px2);
        setOrientation(1);
        setBackground(new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.bgPrimary), 0.0f, 0.0f, pxF, pxF));
        addView(textAtomV2View);
        addView(cellView);
    }

    public final void bind(@NotNull SegmentedTrainRouteFooterVI footer, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextHolderKt.bind$default(this.localTimeInfoTAV, footer.getLocalTimeInfo(), null, 2, null);
        CellHolderKt.bindOrGone(this.toggleDetailsButtonCV, footer.getToggleDetailsButton(), actionHandler);
    }
}
