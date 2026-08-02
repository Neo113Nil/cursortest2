package ru.ozon.app.android.travel.feature.general.order.widgets.paymentDetails.view.perfVersion;

import Am.C2438a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
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
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)R\u001b\u0010-\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010)R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\"\u001a\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/view/perfVersion/PaymentDetailItemPerfView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO$PaymentDetail;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bind", "(Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO$PaymentDetail;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dsDimensProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "iconSize", "I", "Landroidx/appcompat/widget/AppCompatImageView;", "iconAciv$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getIconAciv", "()Landroidx/appcompat/widget/AppCompatImageView;", "iconAciv", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTav$delegate", "getTitleTav", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTav", "descriptionTav$delegate", "getDescriptionTav", "descriptionTav", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "iconButton$delegate", "getIconButton", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "iconButton", "Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;", "informerDV$delegate", "getInformerDV", "()Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;", "informerDV", "lastItem", "Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO$PaymentDetail;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentDetailItemPerfView extends ViewGroup {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(PaymentDetailItemPerfView.class, "iconAciv", "getIconAciv()Landroidx/appcompat/widget/AppCompatImageView;", 0), C2438a.c(PaymentDetailItemPerfView.class, "titleTav", "getTitleTav()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(PaymentDetailItemPerfView.class, "descriptionTav", "getDescriptionTav()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(PaymentDetailItemPerfView.class, "iconButton", "getIconButton()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", 0), C2438a.c(PaymentDetailItemPerfView.class, "informerDV", "getInformerDV()Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;", 0)};
    public static final int $stable = 8;

    /* renamed from: descriptionTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate descriptionTav;

    @NotNull
    private final DesignSystemDimensProvider dsDimensProvider;

    /* renamed from: iconAciv$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate iconAciv;

    /* renamed from: iconButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate iconButton;
    private final int iconSize;

    /* renamed from: informerDV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate informerDV;
    private PaymentDetailsVO.PaymentDetail lastItem;

    /* renamed from: titleTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentDetailItemPerfView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dsDimensProvider = dimens$default;
        this.iconSize = dimens$default.getMargin24();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.iconAciv = new PreCreationViewPoolDelegate(context2, N.b(AppCompatImageView.class), new PaymentDetailItemPerfView$special$$inlined$preCreationViewPool$default$1(this), new PaymentDetailItemPerfView$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.titleTav = new PreCreationViewPoolDelegate(context3, N.b(TextAtomView.class), new PaymentDetailItemPerfView$special$$inlined$preCreationViewPool$default$3(this), new PaymentDetailItemPerfView$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.descriptionTav = new PreCreationViewPoolDelegate(context4, N.b(TextAtomView.class), new PaymentDetailItemPerfView$special$$inlined$preCreationViewPool$default$5(this), new PaymentDetailItemPerfView$special$$inlined$preCreationViewPool$default$6());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.iconButton = new PreCreationViewPoolDelegate(context5, N.b(IconButtonV3View.class), new PaymentDetailItemPerfView$special$$inlined$preCreationViewPool$default$7(this), new PaymentDetailItemPerfView$special$$inlined$preCreationViewPool$default$8());
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        this.informerDV = new PreCreationViewPoolDelegate(context6, N.b(DisclaimerContainer.class), new PaymentDetailItemPerfView$special$$inlined$preCreationViewPool$default$9(this), new PaymentDetailItemPerfView$special$$inlined$preCreationViewPool$default$10());
        addView(getIconAciv());
        addView(getTitleTav());
        addView(getDescriptionTav());
        addView(getIconButton());
        addView(getInformerDV());
    }

    private final TextAtomView getDescriptionTav() {
        return (TextAtomView) this.descriptionTav.getValue(this, $$delegatedProperties[2]);
    }

    private final AppCompatImageView getIconAciv() {
        return (AppCompatImageView) this.iconAciv.getValue(this, $$delegatedProperties[0]);
    }

    private final IconButtonV3View getIconButton() {
        return (IconButtonV3View) this.iconButton.getValue(this, $$delegatedProperties[3]);
    }

    private final DisclaimerContainer getInformerDV() {
        return (DisclaimerContainer) this.informerDV.getValue(this, $$delegatedProperties[4]);
    }

    private final TextAtomView getTitleTav() {
        return (TextAtomView) this.titleTav.getValue(this, $$delegatedProperties[1]);
    }

    public final void bind(@NotNull PaymentDetailsVO.PaymentDetail item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        if (Intrinsics.d(this.lastItem, item)) {
            return;
        }
        this.lastItem = item;
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

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int margin12 = this.dsDimensProvider.getMargin12() + this.iconSize;
        int margin4 = this.dsDimensProvider.getMargin4();
        if (getIconAciv().getVisibility() == 0) {
            AppCompatImageView iconAciv = getIconAciv();
            int i11 = this.iconSize;
            iconAciv.layout(0, 0, i11, i11);
        }
        if (getTitleTav().getVisibility() == 0) {
            getTitleTav().layout(margin12, margin4, getTitleTav().getMeasuredWidth() + margin12, getTitleTav().getMeasuredHeight() + margin4);
            margin4 += getTitleTav().getMeasuredHeight();
        }
        if ((getDescriptionTav().getVisibility() == 0 || getIconButton().getVisibility() == 0) && getTitleTav().getVisibility() == 0) {
            margin4 += this.dsDimensProvider.getMargin4();
        }
        if (getDescriptionTav().getVisibility() == 0) {
            getDescriptionTav().layout(margin12, margin4, getDescriptionTav().getMeasuredWidth() + margin12, getDescriptionTav().getMeasuredHeight() + margin4);
        }
        if (getIconButton().getVisibility() == 0) {
            int margin42 = getDescriptionTav().getVisibility() == 0 ? this.dsDimensProvider.getMargin4() + getDescriptionTav().getMeasuredWidth() + margin12 : margin12;
            int measuredHeight = getDescriptionTav().getVisibility() == 0 ? ((getDescriptionTav().getMeasuredHeight() - getIconButton().getMeasuredHeight()) / 2) + margin4 : margin4;
            getIconButton().layout(margin42, measuredHeight, getIconButton().getMeasuredWidth() + margin42, getIconButton().getMeasuredHeight() + measuredHeight);
        }
        int max = Math.max(getDescriptionTav().getVisibility() == 0 ? getDescriptionTav().getMeasuredHeight() : 0, getIconButton().getVisibility() == 0 ? getIconButton().getMeasuredHeight() : 0) + margin4;
        if (getInformerDV().getVisibility() == 0) {
            int margin122 = this.dsDimensProvider.getMargin12() + max;
            getInformerDV().layout(margin12, margin122, getInformerDV().getMeasuredWidth() + margin12, getInformerDV().getMeasuredHeight() + margin122);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i11;
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.iconSize, 1073741824);
        getIconAciv().measure(makeMeasureSpec, makeMeasureSpec);
        int margin12 = this.dsDimensProvider.getMargin12() + this.iconSize;
        if (mode != 0) {
            i11 = size - margin12;
            if (i11 < 0) {
                i11 = 0;
            }
        } else {
            i11 = Integer.MAX_VALUE;
        }
        if (getIconButton().getVisibility() == 0) {
            getIconButton().measure(View.MeasureSpec.makeMeasureSpec(i11, LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(0, 0));
            i12 = getIconButton().getMeasuredWidth();
            i13 = getIconButton().getMeasuredHeight();
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (getTitleTav().getVisibility() == 0) {
            getTitleTav().measure(View.MeasureSpec.makeMeasureSpec(i11, LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(0, 0));
            i14 = getTitleTav().getMeasuredHeight() + this.dsDimensProvider.getMargin4();
        } else {
            i14 = 0;
        }
        int margin4 = (i11 - i12) - this.dsDimensProvider.getMargin4();
        if (margin4 < 0) {
            margin4 = 0;
        }
        if (getDescriptionTav().getVisibility() != 8) {
            getDescriptionTav().measure(View.MeasureSpec.makeMeasureSpec(margin4, LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(0, 0));
            i14 += this.dsDimensProvider.getMargin4() + Math.max(getDescriptionTav().getMeasuredHeight(), i13);
        } else if (i13 > 0) {
            i14 += this.dsDimensProvider.getMargin4() + i13;
        }
        if (getInformerDV().getVisibility() == 0) {
            getInformerDV().measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i14 += getInformerDV().getMeasuredHeight() + this.dsDimensProvider.getMargin12();
        }
        int max = Math.max(i14, this.iconSize);
        if (mode != 1073741824) {
            size = margin12 + i11;
        }
        setMeasuredDimension(size, max);
    }
}
