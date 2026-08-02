package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.view;

import android.content.Context;
import android.widget.LinearLayout;
import com.google.android.material.imageview.ShapeableImageView;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.FlightOrderDetailsV2VO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import y7.k;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/view/AirlineInfoView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "iconSize", "", "horizontalMarginText", "imageRadius", "", "iconView", "Lcom/google/android/material/imageview/ShapeableImageView;", "textAtomView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "smallButtonView", "Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/SmallBorderlessButtonView;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment$AirlineInfo;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AirlineInfoView extends LinearLayout {
    private final int horizontalMarginText;
    private final int iconSize;

    @NotNull
    private final ShapeableImageView iconView;
    private final float imageRadius;

    @NotNull
    private final SmallBorderlessButtonView smallButtonView;

    @NotNull
    private final TextAtomView textAtomView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AirlineInfoView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(28, context);
        this.iconSize = px;
        int px2 = ResourceExtKt.toPx(12, context);
        this.horizontalMarginText = px2;
        float pxF = ResourceExtKt.toPxF(14, context);
        this.imageRadius = pxF;
        ShapeableImageView shapeableImageView = new ShapeableImageView(context);
        shapeableImageView.setLayoutParams(new LinearLayout.LayoutParams(px, px));
        shapeableImageView.setShapeAppearanceModel(new k().o(pxF));
        this.iconView = shapeableImageView;
        q qVar = q.f64554a;
        TextAtomView textAtomView = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        textAtomView.setPadding(px2, textAtomView.getPaddingTop(), px2, textAtomView.getPaddingBottom());
        textAtomView.setLayoutParams(layoutParams);
        this.textAtomView = textAtomView;
        SmallBorderlessButtonView smallBorderlessButtonView = (SmallBorderlessButtonView) qVar.g(N.b(SmallBorderlessButtonView.class), context);
        smallBorderlessButtonView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.smallButtonView = smallBorderlessButtonView;
        setOrientation(0);
        setGravity(16);
        addView(shapeableImageView);
        addView(textAtomView);
        addView(smallBorderlessButtonView);
    }

    public final void bind(@NotNull FlightOrderDetailsV2VO.Segment.AirlineInfo item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextAtomHolderKt.bind$default(this.textAtomView, item.getTitle(), null, 2, null);
        ImageViewExtKt.load$default(this.iconView, item.getImageLink(), null, null, null, null, false, null, 126, null);
        WrappedBorderlessButtonHolderKt.bind(this.smallButtonView, item.getSmallButton(), actionHandler);
    }
}
