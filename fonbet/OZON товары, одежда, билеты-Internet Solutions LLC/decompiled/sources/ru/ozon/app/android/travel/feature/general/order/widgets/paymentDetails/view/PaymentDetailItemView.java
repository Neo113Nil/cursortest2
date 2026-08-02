package ru.ozon.app.android.travel.feature.general.order.widgets.paymentDetails.view;

import Am.C2438a;
import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.disclaimer.DisclaimerHolderKt;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.general.order.widgets.paymentDetails.presentation.PaymentDetailsVO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010#\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001fR\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/view/PaymentDetailItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "addViews", "()V", "setupConstraints", "Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO$PaymentDetail;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bind", "(Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO$PaymentDetail;Lkotlin/jvm/functions/Function1;)V", "", "dp4", "I", "dp12", "dp24", "Landroidx/appcompat/widget/AppCompatImageView;", "iconAciv$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getIconAciv", "()Landroidx/appcompat/widget/AppCompatImageView;", "iconAciv", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTav$delegate", "getTitleTav", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTav", "descriptionTav$delegate", "getDescriptionTav", "descriptionTav", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "iconButton$delegate", "getIconButton", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "iconButton", "Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;", "informerDV$delegate", "getInformerDV", "()Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;", "informerDV", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentDetailItemView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(PaymentDetailItemView.class, "iconAciv", "getIconAciv()Landroidx/appcompat/widget/AppCompatImageView;", 0), C2438a.c(PaymentDetailItemView.class, "titleTav", "getTitleTav()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(PaymentDetailItemView.class, "descriptionTav", "getDescriptionTav()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(PaymentDetailItemView.class, "iconButton", "getIconButton()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", 0), C2438a.c(PaymentDetailItemView.class, "informerDV", "getInformerDV()Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;", 0)};
    public static final int $stable = 8;

    /* renamed from: descriptionTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate descriptionTav;
    private final int dp12;
    private final int dp24;
    private final int dp4;

    /* renamed from: iconAciv$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate iconAciv;

    /* renamed from: iconButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate iconButton;

    /* renamed from: informerDV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate informerDV;

    /* renamed from: titleTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentDetailItemView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp4 = UiExtKt.toPx(4, context);
        this.dp12 = UiExtKt.toPx(12, context);
        this.dp24 = UiExtKt.toPx(24, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.iconAciv = new PreCreationViewPoolDelegate(context2, N.b(AppCompatImageView.class), new PaymentDetailItemView$special$$inlined$preCreationViewPool$default$1(this), new PaymentDetailItemView$special$$inlined$preCreationViewPool$default$2(this));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.titleTav = new PreCreationViewPoolDelegate(context3, N.b(TextAtomView.class), new PaymentDetailItemView$special$$inlined$preCreationViewPool$default$3(this), new PaymentDetailItemView$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.descriptionTav = new PreCreationViewPoolDelegate(context4, N.b(TextAtomView.class), new PaymentDetailItemView$special$$inlined$preCreationViewPool$default$5(this), new PaymentDetailItemView$special$$inlined$preCreationViewPool$default$6());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.iconButton = new PreCreationViewPoolDelegate(context5, N.b(IconButtonV3View.class), new PaymentDetailItemView$special$$inlined$preCreationViewPool$default$7(this), new PaymentDetailItemView$special$$inlined$preCreationViewPool$default$8());
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        this.informerDV = new PreCreationViewPoolDelegate(context6, N.b(DisclaimerContainer.class), new PaymentDetailItemView$special$$inlined$preCreationViewPool$default$9(this), new PaymentDetailItemView$special$$inlined$preCreationViewPool$default$10());
        addViews();
        setupConstraints();
    }

    private final void addViews() {
        addView(getIconAciv());
        addView(getTitleTav());
        addView(getDescriptionTav());
        addView(getIconButton());
        addView(getInformerDV());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomView getDescriptionTav() {
        return (TextAtomView) this.descriptionTav.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatImageView getIconAciv() {
        return (AppCompatImageView) this.iconAciv.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IconButtonV3View getIconButton() {
        return (IconButtonV3View) this.iconButton.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DisclaimerContainer getInformerDV() {
        return (DisclaimerContainer) this.informerDV.getValue(this, $$delegatedProperties[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomView getTitleTav() {
        return (TextAtomView) this.titleTav.getValue(this, $$delegatedProperties[1]);
    }

    private final void setupConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new PaymentDetailItemView$setupConstraints$1(this));
    }

    public final void bind(@NotNull PaymentDetailsVO.PaymentDetail item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        AppCompatImageView iconAciv = getIconAciv();
        Icon icon = item.getIcon();
        ImageViewExtKt.loadImageOrGone(iconAciv, icon != null ? icon.getImage() : null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Icon icon2 = item.getIcon();
        Integer parseColor = styleParser.parseColor(context, icon2 != null ? icon2.getTintColor() : null);
        if (parseColor != null) {
            ThemeExtKt.tint(getIconAciv(), parseColor);
        }
        TextAtomHolderKt.bind(getTitleTav(), item.getTitle(), onAction);
        TextAtomHolderKt.bindOrGone(getDescriptionTav(), item.getDescription(), onAction);
        IconButtonV3HolderKt.bindOrGone(getIconButton(), item.getDescriptionIconButton(), onAction);
        DisclaimerHolderKt.bindOrGone$default(getInformerDV(), item.getInformer(), null, 2, null);
    }
}
