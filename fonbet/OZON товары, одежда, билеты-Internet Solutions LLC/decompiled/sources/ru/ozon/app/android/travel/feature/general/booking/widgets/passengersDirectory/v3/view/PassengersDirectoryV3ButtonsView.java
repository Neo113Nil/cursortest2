package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.buttons.PassengersDirectoryV3ButtonsVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011J\b\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/view/PassengersDirectoryV3ButtonsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp12", "selectButtonBV", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "addDocumentButtonBV", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/buttons/PassengersDirectoryV3ButtonsVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "produceBackground", "Landroid/graphics/drawable/Drawable;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassengersDirectoryV3ButtonsView extends LinearLayout {

    @NotNull
    private final ButtonV3View addDocumentButtonBV;
    private final int dp12;
    private final int dp8;

    @NotNull
    private final ButtonV3View selectButtonBV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassengersDirectoryV3ButtonsView(@NotNull Context context) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(8, context);
        this.dp8 = px;
        int px2 = ResourceExtKt.toPx(12, context);
        this.dp12 = px2;
        q qVar = q.f64554a;
        ButtonV3View buttonV3View = (ButtonV3View) qVar.i(N.b(ButtonV3View.class), context);
        if (buttonV3View == null) {
            context2 = context;
            buttonV3View = new ButtonV3View(context2, null, 0, 0, 14, null);
        } else {
            context2 = context;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = px2;
        buttonV3View.setLayoutParams(layoutParams);
        this.selectButtonBV = buttonV3View;
        ButtonV3View buttonV3View2 = (ButtonV3View) qVar.i(N.b(ButtonV3View.class), context2);
        buttonV3View2 = buttonV3View2 == null ? new ButtonV3View(context2, null, 0, 0, 14, null) : buttonV3View2;
        buttonV3View2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.addDocumentButtonBV = buttonV3View2;
        setBackground(produceBackground());
        setPadding(px, px, px, px);
        setOrientation(1);
        addView(buttonV3View);
        addView(buttonV3View2);
    }

    private final Drawable produceBackground() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float pxF = ResourceExtKt.toPxF(20, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px = ResourceExtKt.toPx(-2, context2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int px2 = ResourceExtKt.toPx(1, context3);
        int color = getContext().getColor(UniColors.GRAPHIC_STROKE_STICKY.getResId());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        int themeColor = ThemeExtKt.themeColor(context4, R$attr.layerFloor1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(themeColor);
        gradientDrawable.setStroke(px2, color);
        gradientDrawable.setCornerRadii(new float[]{pxF, pxF, pxF, pxF, 0.0f, 0.0f, 0.0f, 0.0f});
        return new InsetDrawable((Drawable) gradientDrawable, px, 0, px, px);
    }

    public final void bind(@NotNull PassengersDirectoryV3ButtonsVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ButtonV3HolderKt.bindOrGone(this.selectButtonBV, item.getSelectButton(), actionHandler);
        ButtonV3HolderKt.bind(this.addDocumentButtonBV, item.getAddDocumentButton(), actionHandler);
    }
}
