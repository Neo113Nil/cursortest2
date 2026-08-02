package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.view;

import Am.C2438a;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.general.booking.R$id;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3VO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u001a\u0010-\u001a\u0016\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020*\u0018\u00010.j\u0004\u0018\u0001`0J,\u00101\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\u001a\u0010-\u001a\u0016\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020*\u0018\u00010.j\u0004\u0018\u0001`0J\b\u00102\u001a\u00020*H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0016\u001a\u0004\b%\u0010\"R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/view/AddNewPassengerFormV3DisclaimerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp2", "", "dp6", "dp8", "dp10", "dp12", "dp24", "dpf16", "", "iconV", "Landroidx/appcompat/widget/AppCompatImageView;", "titleTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTAV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTAV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "subtitleTAV", "getSubtitleTAV", "subtitleTAV$delegate", "iconButtonIBV", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getIconButtonIBV", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "iconButtonIBV$delegate", "yesButtonButtonBV", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getYesButtonButtonBV", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "yesButtonButtonBV$delegate", "noButtonButtonBV", "getNoButtonButtonBV", "noButtonButtonBV$delegate", "viewBackground", "Landroid/graphics/drawable/ShapeDrawable;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$TextInputItem$DisclaimerVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "bindOrGone", "setConstraints", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddNewPassengerFormV3DisclaimerView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(AddNewPassengerFormV3DisclaimerView.class, "titleTAV", "getTitleTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(AddNewPassengerFormV3DisclaimerView.class, "subtitleTAV", "getSubtitleTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(AddNewPassengerFormV3DisclaimerView.class, "iconButtonIBV", "getIconButtonIBV()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", 0), C2438a.c(AddNewPassengerFormV3DisclaimerView.class, "yesButtonButtonBV", "getYesButtonButtonBV()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", 0), C2438a.c(AddNewPassengerFormV3DisclaimerView.class, "noButtonButtonBV", "getNoButtonButtonBV()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", 0)};
    private final int dp10;
    private final int dp12;
    private final int dp2;
    private final int dp24;
    private final int dp6;
    private final int dp8;
    private final float dpf16;

    /* renamed from: iconButtonIBV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate iconButtonIBV;

    @NotNull
    private final AppCompatImageView iconV;

    /* renamed from: noButtonButtonBV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate noButtonButtonBV;

    /* renamed from: subtitleTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate subtitleTAV;

    /* renamed from: titleTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTAV;

    @NotNull
    private final ShapeDrawable viewBackground;

    /* renamed from: yesButtonButtonBV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate yesButtonButtonBV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddNewPassengerFormV3DisclaimerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp2 = UiExtKt.toPx(2, context);
        this.dp6 = UiExtKt.toPx(6, context);
        this.dp8 = UiExtKt.toPx(8, context);
        this.dp10 = UiExtKt.toPx(10, context);
        int px = UiExtKt.toPx(12, context);
        this.dp12 = px;
        int px2 = UiExtKt.toPx(24, context);
        this.dp24 = px2;
        float pxF = ResourceExtKt.toPxF(16, context);
        this.dpf16 = pxF;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.addNewPassengerFormV3DisclaimerIcon);
        appCompatImageView.setLayoutParams(new ConstraintLayout.b(px2, px2));
        this.iconV = appCompatImageView;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.titleTAV = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new AddNewPassengerFormV3DisclaimerView$special$$inlined$preCreationViewPool$default$1(this), new AddNewPassengerFormV3DisclaimerView$special$$inlined$preCreationViewPool$default$2(this));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.subtitleTAV = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new AddNewPassengerFormV3DisclaimerView$special$$inlined$preCreationViewPool$default$3(this), new AddNewPassengerFormV3DisclaimerView$special$$inlined$preCreationViewPool$default$4(this));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.iconButtonIBV = new PreCreationViewPoolDelegate(context4, N.b(IconButtonV3View.class), new AddNewPassengerFormV3DisclaimerView$special$$inlined$preCreationViewPool$default$5(this), new AddNewPassengerFormV3DisclaimerView$special$$inlined$preCreationViewPool$default$6());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.yesButtonButtonBV = new PreCreationViewPoolDelegate(context5, N.b(ButtonV3View.class), new AddNewPassengerFormV3DisclaimerView$special$$inlined$preCreationViewPool$default$7(this), new AddNewPassengerFormV3DisclaimerView$special$$inlined$preCreationViewPool$default$8(this));
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        this.noButtonButtonBV = new PreCreationViewPoolDelegate(context6, N.b(ButtonV3View.class), new AddNewPassengerFormV3DisclaimerView$special$$inlined$preCreationViewPool$default$9(this), new AddNewPassengerFormV3DisclaimerView$special$$inlined$preCreationViewPool$default$10(this));
        ShapeDrawable produce = new RoundedBackgroundProducer().produce(0, pxF);
        this.viewBackground = produce;
        setBackground(produce);
        addView(appCompatImageView);
        addView(getTitleTAV());
        addView(getSubtitleTAV());
        addView(getIconButtonIBV());
        addView(getYesButtonButtonBV());
        addView(getNoButtonButtonBV());
        setConstraints();
        setPadding(0, 0, 0, px);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IconButtonV3View getIconButtonIBV() {
        return (IconButtonV3View) this.iconButtonIBV.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ButtonV3View getNoButtonButtonBV() {
        return (ButtonV3View) this.noButtonButtonBV.getValue(this, $$delegatedProperties[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getSubtitleTAV() {
        return (TextAtomV2View) this.subtitleTAV.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getTitleTAV() {
        return (TextAtomV2View) this.titleTAV.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ButtonV3View getYesButtonButtonBV() {
        return (ButtonV3View) this.yesButtonButtonBV.getValue(this, $$delegatedProperties[3]);
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new AddNewPassengerFormV3DisclaimerView$setConstraints$1(this));
    }

    public final void bind(@NotNull TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem.DisclaimerVO item, Function1<? super AtomAction, Unit> actionHandler) {
        Paint paint;
        Intrinsics.checkNotNullParameter(item, "item");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor());
        if (parseColor != null) {
            int intValue = parseColor.intValue();
            Drawable background = getBackground();
            ShapeDrawable shapeDrawable = background instanceof ShapeDrawable ? (ShapeDrawable) background : null;
            if (shapeDrawable != null && (paint = shapeDrawable.getPaint()) != null) {
                paint.setColor(intValue);
            }
        }
        this.iconV.setVisibility(item.getIcon() != null ? 0 : 8);
        AppCompatImageView appCompatImageView = this.iconV;
        CommonAtomIconDTO icon = item.getIcon();
        ImageViewExtKt.load$default(appCompatImageView, icon != null ? icon.getIcon() : null, null, null, null, null, false, null, 126, null);
        AppCompatImageView appCompatImageView2 = this.iconV;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        CommonAtomIconDTO icon2 = item.getIcon();
        ThemeExtKt.tint(appCompatImageView2, styleParser.parseColor(context2, icon2 != null ? icon2.getTintColor() : null));
        TextHolderKt.bind$default(getTitleTAV(), item.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(getSubtitleTAV(), item.getSubtitle(), null, 2, null);
        IconButtonV3HolderKt.bindOrGone(getIconButtonIBV(), item.getCloseButton(), actionHandler);
        ButtonV3HolderKt.bindOrGone(getYesButtonButtonBV(), item.getYesButton(), actionHandler);
        ButtonV3HolderKt.bindOrGone(getNoButtonButtonBV(), item.getNoButton(), actionHandler);
        if (actionHandler != null) {
            actionHandler.invoke(new AtomAction.ViewAction(item.getTrackingInfo(), null, 2, null));
        }
    }

    public final void bindOrGone(TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem.DisclaimerVO item, Function1<? super AtomAction, Unit> actionHandler) {
        if (item == null) {
            ViewExtKt.gone(this);
        } else {
            ViewExtKt.show(this);
            bind(item, actionHandler);
        }
    }
}
