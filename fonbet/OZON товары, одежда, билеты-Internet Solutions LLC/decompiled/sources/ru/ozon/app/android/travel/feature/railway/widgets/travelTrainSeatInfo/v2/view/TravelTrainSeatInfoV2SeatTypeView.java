package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainSeatInfo.v2.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainSeatInfo.v2.presentation.TravelTrainSeatInfoV2VO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/view/TravelTrainSeatInfoV2SeatTypeView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp4", "", "dp16", "indicatorView", "Landroid/view/View;", "priceTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "bind", "", "state", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/presentation/TravelTrainSeatInfoV2VO$SeatPriceVO;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelTrainSeatInfoV2SeatTypeView extends LinearLayout {
    private final int dp16;
    private final int dp4;

    @NotNull
    private final View indicatorView;

    @NotNull
    private final TextAtomV2View priceTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelTrainSeatInfoV2SeatTypeView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(4, context);
        this.dp4 = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.dp16 = px2;
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(px2, px2));
        view.setBackground(new RoundedBackgroundProducer().produce(0, ThemeExtKt.themeColor(context, R$attr.graphicTertiary), ResourceExtKt.toPx(1, context), px));
        this.indicatorView = view;
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.g(N.b(TextAtomV2View.class), context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(px);
        textAtomV2View.setLayoutParams(layoutParams);
        this.priceTav = textAtomV2View;
        setOrientation(0);
        setGravity(16);
        addView(view);
        addView(textAtomV2View);
        setPadding(0, px, 0, px);
    }

    public final void bind(@NotNull TravelTrainSeatInfoV2VO.SeatPriceVO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Drawable background = this.indicatorView.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, state.getColor());
            gradientDrawable.setColor(parseColor != null ? parseColor.intValue() : 0);
        }
        TextHolderKt.bind$default(this.priceTav, state.getPrice(), null, 2, null);
    }
}
