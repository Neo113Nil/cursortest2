package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainSeatInfo.v2.view;

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
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainSeatInfo.v2.presentation.TravelTrainSeatInfoV2VO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/view/TravelTrainSeatInfoV2SeatDiscountView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "iconIV", "Lru/ozon/uni/android/atom/icon/IconView;", "discountTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "infoIconIB", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "bind", "", "state", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/presentation/TravelTrainSeatInfoV2VO$SeatDiscountVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelTrainSeatInfoV2SeatDiscountView extends LinearLayout {
    public static final int $stable = (IconButtonV3View.$stable | TextAtomV2View.$stable) | IconView.$stable;

    @NotNull
    private final TextAtomV2View discountTAV;

    @NotNull
    private final IconView iconIV;

    @NotNull
    private final IconButtonV3View infoIconIB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelTrainSeatInfoV2SeatDiscountView(@NotNull Context context) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        q qVar = q.f64554a;
        IconView iconView = (IconView) qVar.i(N.b(IconView.class), context);
        if (iconView == null) {
            context2 = context;
            iconView = new IconView(context2, null, 0, 6, null);
        } else {
            context2 = context;
        }
        iconView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.iconIV = iconView;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context2);
        a.d(-2, -2, textAtomV2View);
        this.discountTAV = textAtomV2View;
        IconButtonV3View iconButtonV3View = (IconButtonV3View) qVar.i(N.b(IconButtonV3View.class), context2);
        iconButtonV3View = iconButtonV3View == null ? new IconButtonV3View(context2, null, 0, 0, 14, null) : iconButtonV3View;
        iconButtonV3View.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.infoIconIB = iconButtonV3View;
        setOrientation(0);
        setGravity(16);
        addView(iconView);
        addView(textAtomV2View);
        addView(iconButtonV3View);
    }

    public final void bind(@NotNull TravelTrainSeatInfoV2VO.SeatDiscountVO state, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        IconHolderKt.bind$default(this.iconIV, state.getDiscountIcon(), null, 2, null);
        TextHolderKt.bind$default(this.discountTAV, state.getDiscount(), null, 2, null);
        IconButtonV3HolderKt.bind(this.infoIconIB, state.getInfoIcon(), actionHandler);
    }
}
