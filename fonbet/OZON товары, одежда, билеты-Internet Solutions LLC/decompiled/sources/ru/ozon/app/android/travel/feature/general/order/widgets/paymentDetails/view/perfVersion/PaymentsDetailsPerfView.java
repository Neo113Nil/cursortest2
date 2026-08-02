package ru.ozon.app.android.travel.feature.general.order.widgets.paymentDetails.view.perfVersion;

import Am.C2438a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.general.order.widgets.paymentDetails.presentation.PaymentDetailsVO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010)\u001a\u00020*H\u0014J\u0010\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0014J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\tH\u0014J0\u00102\u001a\u00020/2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020\t2\u0006\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\tH\u0014J\"\u00109\u001a\u00020/2\u0006\u0010:\u001a\u00020;2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020/0=J*\u0010?\u001a\u00020/2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020B0A2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020/0=H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001d\u0010\u001aR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b!\u0010\"R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/view/perfVersion/PaymentsDetailsPerfView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dsDimensProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dp1", "", "dp4", "dp12", "dp24", "dp32", "backgroundRadius", "", "iconPadding", "iconAciv", "Landroidx/appcompat/widget/AppCompatImageView;", "getIconAciv", "()Landroidx/appcompat/widget/AppCompatImageView;", "iconAciv$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "titleTav", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getTitleTav", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTav$delegate", "errorTav", "getErrorTav", "errorTav$delegate", "payButton", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonView;", "getPayButton", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonView;", "payButton$delegate", "separatorView", "Landroid/view/View;", "detailViews", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/view/perfVersion/PaymentDetailItemPerfView;", "generateDefaultLayoutParams", "Landroid/view/ViewGroup$MarginLayoutParams;", "generateLayoutParams", "params", "Landroid/view/ViewGroup$LayoutParams;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "left", "top", "right", "bottom", "bind", "item", "Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "bindDetails", "details", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO$PaymentDetail;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentsDetailsPerfView extends ViewGroup {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(PaymentsDetailsPerfView.class, "iconAciv", "getIconAciv()Landroidx/appcompat/widget/AppCompatImageView;", 0), C2438a.c(PaymentsDetailsPerfView.class, "titleTav", "getTitleTav()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(PaymentsDetailsPerfView.class, "errorTav", "getErrorTav()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(PaymentsDetailsPerfView.class, "payButton", "getPayButton()Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonView;", 0)};
    public static final int $stable = 8;
    private final float backgroundRadius;

    @NotNull
    private final List<PaymentDetailItemPerfView> detailViews;
    private final int dp1;
    private final int dp12;
    private final int dp24;
    private final int dp32;
    private final int dp4;

    @NotNull
    private final DesignSystemDimensProvider dsDimensProvider;

    /* renamed from: errorTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate errorTav;

    /* renamed from: iconAciv$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate iconAciv;
    private final int iconPadding;

    /* renamed from: payButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate payButton;

    @NotNull
    private final View separatorView;

    /* renamed from: titleTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentsDetailsPerfView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dsDimensProvider = dimens$default;
        int px = ResourceExtKt.toPx(1, context);
        this.dp1 = px;
        this.dp4 = dimens$default.getMargin4();
        this.dp12 = dimens$default.getMargin12();
        int margin24 = dimens$default.getMargin24();
        this.dp24 = margin24;
        int margin32 = dimens$default.getMargin32();
        this.dp32 = margin32;
        this.backgroundRadius = dimens$default.getRadius32();
        this.iconPadding = (margin32 - margin24) / 2;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.iconAciv = new PreCreationViewPoolDelegate(context2, N.b(AppCompatImageView.class), new PaymentsDetailsPerfView$special$$inlined$preCreationViewPool$default$1(this), new PaymentsDetailsPerfView$special$$inlined$preCreationViewPool$default$2(this));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.titleTav = new PreCreationViewPoolDelegate(context3, N.b(TextAtomView.class), new PaymentsDetailsPerfView$special$$inlined$preCreationViewPool$default$3(this), new PaymentsDetailsPerfView$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.errorTav = new PreCreationViewPoolDelegate(context4, N.b(TextAtomView.class), new PaymentsDetailsPerfView$special$$inlined$preCreationViewPool$default$5(this), new PaymentsDetailsPerfView$special$$inlined$preCreationViewPool$default$6());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.payButton = new PreCreationViewPoolDelegate(context5, N.b(SmallButtonView.class), new PaymentsDetailsPerfView$special$$inlined$preCreationViewPool$default$7(this), new PaymentsDetailsPerfView$special$$inlined$preCreationViewPool$default$8());
        View view = new View(context);
        view.setId(View.generateViewId());
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, px));
        view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        view.setVisibility(8);
        this.separatorView = view;
        this.detailViews = new ArrayList();
        addView(getIconAciv());
        addView(getTitleTav());
        addView(getErrorTav());
        addView(getPayButton());
        addView(view);
        for (int i11 = 0; i11 < 3; i11++) {
            PaymentDetailItemPerfView paymentDetailItemPerfView = new PaymentDetailItemPerfView(context);
            paymentDetailItemPerfView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
            paymentDetailItemPerfView.setVisibility(8);
            this.detailViews.add(paymentDetailItemPerfView);
            addView(paymentDetailItemPerfView);
        }
    }

    private final void bindDetails(List<PaymentDetailsVO.PaymentDetail> details, Function1<? super AtomAction, Unit> actionHandler) {
        PaymentDetailItemPerfView paymentDetailItemPerfView;
        if (this.detailViews.size() > details.size()) {
            int size = this.detailViews.size();
            for (int size2 = details.size(); size2 < size; size2++) {
                this.detailViews.get(size2).setVisibility(8);
            }
        }
        int i11 = 0;
        for (Object obj : details) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            PaymentDetailsVO.PaymentDetail paymentDetail = (PaymentDetailsVO.PaymentDetail) obj;
            if (i11 < this.detailViews.size()) {
                paymentDetailItemPerfView = this.detailViews.get(i11);
                if (paymentDetailItemPerfView.getVisibility() != 0) {
                    paymentDetailItemPerfView.setVisibility(0);
                }
            } else {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                paymentDetailItemPerfView = new PaymentDetailItemPerfView(context);
                paymentDetailItemPerfView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                this.detailViews.add(paymentDetailItemPerfView);
                addView(paymentDetailItemPerfView);
            }
            paymentDetailItemPerfView.bind(paymentDetail, actionHandler);
            i11 = i12;
        }
    }

    private final TextAtomView getErrorTav() {
        return (TextAtomView) this.errorTav.getValue(this, $$delegatedProperties[2]);
    }

    private final AppCompatImageView getIconAciv() {
        return (AppCompatImageView) this.iconAciv.getValue(this, $$delegatedProperties[0]);
    }

    private final SmallButtonView getPayButton() {
        return (SmallButtonView) this.payButton.getValue(this, $$delegatedProperties[3]);
    }

    private final TextAtomView getTitleTav() {
        return (TextAtomView) this.titleTav.getValue(this, $$delegatedProperties[1]);
    }

    public final void bind(@NotNull PaymentDetailsVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        PaymentDetailsVO.PaymentStatus paymentStatus = item.getPaymentStatus();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, paymentStatus.getStatusIcon().getBgColor());
        if (parseColor != null) {
            getIconAciv().setBackgroundColor(parseColor.intValue());
        }
        ImageViewExtKt.load$default(getIconAciv(), paymentStatus.getStatusIcon().getIcon().getImage(), null, null, null, null, false, null, 126, null);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer parseColor2 = styleParser.parseColor(context2, paymentStatus.getStatusIcon().getIcon().getTintColor());
        if (parseColor2 != null) {
            ThemeExtKt.tint(getIconAciv(), parseColor2);
        }
        TextAtomHolderKt.bind$default(getTitleTav(), paymentStatus.getTitle(), null, 2, null);
        TextAtomHolderKt.bindOrGone$default(getErrorTav(), paymentStatus.getErrorMessage(), null, 2, null);
        WrappedButtonHolderKt.bindOrGone(getPayButton(), paymentStatus.getPaymentButton(), actionHandler);
        boolean arePaymentDetailsVisible = item.getArePaymentDetailsVisible();
        this.separatorView.setVisibility(arePaymentDetailsVisible ? 0 : 8);
        if (arePaymentDetailsVisible) {
            bindDetails(item.getPaymentDetails(), actionHandler);
        } else {
            Iterator<T> it = this.detailViews.iterator();
            while (it.hasNext()) {
                ((PaymentDetailItemPerfView) it.next()).setVisibility(8);
            }
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i11 = this.dp32 + paddingLeft + this.dp12;
        AppCompatImageView iconAciv = getIconAciv();
        int i12 = this.dp32;
        iconAciv.layout(paddingLeft, paddingTop, paddingLeft + i12, i12 + paddingTop);
        int i13 = this.dp4 + paddingTop;
        getTitleTav().layout(i11, i13, getTitleTav().getMeasuredWidth() + i11, getTitleTav().getMeasuredHeight() + i13);
        int measuredHeight = getTitleTav().getMeasuredHeight() + i13;
        if (getErrorTav().getVisibility() == 0) {
            int i14 = measuredHeight + this.dp4;
            getErrorTav().layout(i11, i14, getErrorTav().getMeasuredWidth() + i11, getErrorTav().getMeasuredHeight() + i14);
            measuredHeight = i14 + getErrorTav().getMeasuredHeight();
        }
        if (getPayButton().getVisibility() == 0) {
            int i15 = measuredHeight + this.dp12;
            getPayButton().layout(i11, i15, getPayButton().getMeasuredWidth() + i11, getPayButton().getMeasuredHeight() + i15);
            measuredHeight = i15 + getPayButton().getMeasuredHeight();
        }
        int max = Math.max(paddingTop + this.dp32, measuredHeight);
        List<PaymentDetailItemPerfView> list = this.detailViews;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((PaymentDetailItemPerfView) it.next()).getVisibility() == 0) {
                int i16 = max + this.dp12;
                if (this.separatorView.getVisibility() == 0) {
                    int measuredWidth = getMeasuredWidth() - getPaddingRight();
                    View view = this.separatorView;
                    view.layout(paddingLeft, i16, measuredWidth, view.getMeasuredHeight() + i16);
                    i16 += this.separatorView.getMeasuredHeight();
                }
                int i17 = i16 + this.dp12;
                int i18 = 0;
                for (Object obj : this.detailViews) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    PaymentDetailItemPerfView paymentDetailItemPerfView = (PaymentDetailItemPerfView) obj;
                    if (paymentDetailItemPerfView.getVisibility() == 0) {
                        if (i18 > 0) {
                            i17 += this.dp12;
                        }
                        paymentDetailItemPerfView.layout(paddingLeft, i17, paymentDetailItemPerfView.getMeasuredWidth() + paddingLeft, paymentDetailItemPerfView.getMeasuredHeight() + i17);
                        i17 = paymentDetailItemPerfView.getMeasuredHeight() + i17;
                    }
                    i18 = i19;
                }
                return;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        measureChildWithMargins(getIconAciv(), widthMeasureSpec, 0, heightMeasureSpec, 0);
        int i11 = paddingLeft - (this.dp32 + this.dp12);
        int i12 = 0;
        if (i11 < 0) {
            i11 = 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, LinearLayoutManager.INVALID_OFFSET);
        getTitleTav().measure(makeMeasureSpec, heightMeasureSpec);
        if (getErrorTav().getVisibility() == 0) {
            getErrorTav().measure(makeMeasureSpec, heightMeasureSpec);
        }
        if (getPayButton().getVisibility() == 0) {
            getPayButton().measure(makeMeasureSpec, heightMeasureSpec);
        }
        if (this.separatorView.getVisibility() == 0) {
            measureChildWithMargins(this.separatorView, widthMeasureSpec, 0, heightMeasureSpec, 0);
        }
        int i13 = 0;
        for (Object obj : this.detailViews) {
            int i14 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            PaymentDetailItemPerfView paymentDetailItemPerfView = (PaymentDetailItemPerfView) obj;
            if (paymentDetailItemPerfView.getVisibility() == 0) {
                measureChildWithMargins(paymentDetailItemPerfView, widthMeasureSpec, 0, heightMeasureSpec, 0);
                int measuredHeight = paymentDetailItemPerfView.getMeasuredHeight() + i13;
                if (i12 > 0) {
                    measuredHeight += this.dp12;
                }
                i13 = measuredHeight;
            }
            i12 = i14;
        }
        int measuredHeight2 = getTitleTav().getMeasuredHeight() + getPaddingTop() + this.dp4;
        if (getErrorTav().getVisibility() == 0) {
            measuredHeight2 += getErrorTav().getMeasuredHeight() + this.dp4;
        }
        if (getPayButton().getVisibility() == 0) {
            measuredHeight2 += getPayButton().getMeasuredHeight() + this.dp12;
        }
        int max = Math.max(getPaddingTop() + this.dp32, measuredHeight2);
        List<PaymentDetailItemPerfView> list = this.detailViews;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((PaymentDetailItemPerfView) it.next()).getVisibility() == 0) {
                    int i15 = max + this.dp12;
                    if (this.separatorView.getVisibility() == 0) {
                        i15 += this.separatorView.getMeasuredHeight();
                    }
                    max = i15 + this.dp12 + i13;
                }
            }
        }
        setMeasuredDimension(size, getPaddingBottom() + max);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    @NotNull
    public ViewGroup.MarginLayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    @NotNull
    public ViewGroup.MarginLayoutParams generateLayoutParams(@NotNull ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new ViewGroup.MarginLayoutParams(params);
    }
}
