package ru.ozon.app.android.travel.feature.general.order.widgets.paymentDetails.view;

import Am.C2438a;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.general.order.widgets.paymentDetails.presentation.PaymentDetailsVO;
import ru.ozon.app.android.travel.feature.general.order.widgets.paymentDetails.presentation.adapter.PaymentDetailAdapter;
import ru.ozon.app.android.travel.feature.general.order.widgets.paymentDetails.presentation.adapter.PaymentDetailItemDecoration;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u00100R\u001b\u00104\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b3\u00100R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b7\u00108R\u0014\u0010:\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010&R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/view/PaymentsDetailsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "addViews", "()V", "setupConstraints", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "setupAdapter", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO;", "item", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO;Lkotlin/jvm/functions/Function1;)V", "", "dp1", "I", "dp4", "dp12", "dp16", "dp24", "dp32", "", "backgroundRadius", "F", "Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/adapter/PaymentDetailAdapter;", "paymentDetailAdapter", "Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/adapter/PaymentDetailAdapter;", "Landroid/view/View;", "iconBackgroundView", "Landroid/view/View;", "Landroidx/appcompat/widget/AppCompatImageView;", "iconAciv$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getIconAciv", "()Landroidx/appcompat/widget/AppCompatImageView;", "iconAciv", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTav$delegate", "getTitleTav", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTav", "errorTav$delegate", "getErrorTav", "errorTav", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonView;", "payButton$delegate", "getPayButton", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonView;", "payButton", "separatorView", "Landroidx/recyclerview/widget/RecyclerView;", "detailsRv", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/constraintlayout/widget/Group;", "detailsGroup", "Landroidx/constraintlayout/widget/Group;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentsDetailsView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(PaymentsDetailsView.class, "iconAciv", "getIconAciv()Landroidx/appcompat/widget/AppCompatImageView;", 0), C2438a.c(PaymentsDetailsView.class, "titleTav", "getTitleTav()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(PaymentsDetailsView.class, "errorTav", "getErrorTav()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(PaymentsDetailsView.class, "payButton", "getPayButton()Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonView;", 0)};
    public static final int $stable = 8;
    private final float backgroundRadius;

    @NotNull
    private final Group detailsGroup;

    @NotNull
    private final RecyclerView detailsRv;
    private final int dp1;
    private final int dp12;
    private final int dp16;
    private final int dp24;
    private final int dp32;
    private final int dp4;

    /* renamed from: errorTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate errorTav;

    /* renamed from: iconAciv$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate iconAciv;

    @NotNull
    private final View iconBackgroundView;

    /* renamed from: payButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate payButton;
    private PaymentDetailAdapter paymentDetailAdapter;

    @NotNull
    private final View separatorView;

    /* renamed from: titleTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentsDetailsView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(1, context);
        this.dp1 = px;
        this.dp4 = ResourceExtKt.toPx(4, context);
        int px2 = ResourceExtKt.toPx(12, context);
        this.dp12 = px2;
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.dp24 = ResourceExtKt.toPx(24, context);
        int px3 = ResourceExtKt.toPx(32, context);
        this.dp32 = px3;
        float pxF = ResourceExtKt.toPxF(32, context);
        this.backgroundRadius = pxF;
        View view = new View(context);
        view.setId(View.generateViewId());
        view.setLayoutParams(new ConstraintLayout.b(px3, px3));
        ViewExtensionsKt.applyRoundedOutline(view, pxF);
        this.iconBackgroundView = view;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.iconAciv = new PreCreationViewPoolDelegate(context2, N.b(AppCompatImageView.class), new PaymentsDetailsView$special$$inlined$preCreationViewPool$default$1(this), new PaymentsDetailsView$special$$inlined$preCreationViewPool$default$2(this));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.titleTav = new PreCreationViewPoolDelegate(context3, N.b(TextAtomView.class), new PaymentsDetailsView$special$$inlined$preCreationViewPool$default$3(this), new PaymentsDetailsView$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.errorTav = new PreCreationViewPoolDelegate(context4, N.b(TextAtomView.class), new PaymentsDetailsView$special$$inlined$preCreationViewPool$default$5(this), new PaymentsDetailsView$special$$inlined$preCreationViewPool$default$6());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.payButton = new PreCreationViewPoolDelegate(context5, N.b(SmallButtonView.class), new PaymentsDetailsView$special$$inlined$preCreationViewPool$default$7(this), new PaymentsDetailsView$special$$inlined$preCreationViewPool$default$8());
        View view2 = new View(context);
        view2.setId(View.generateViewId());
        view2.setLayoutParams(new ConstraintLayout.b(0, px));
        view2.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        this.separatorView = view2;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(View.generateViewId());
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.addItemDecoration(new PaymentDetailItemDecoration(px2));
        this.detailsRv = recyclerView;
        Group group = new Group(context);
        group.setId(View.generateViewId());
        group.setReferencedIds(new int[]{view2.getId(), recyclerView.getId()});
        this.detailsGroup = group;
        addViews();
        setupConstraints();
    }

    private final void addViews() {
        addView(this.iconBackgroundView);
        addView(getIconAciv());
        addView(getTitleTav());
        addView(getErrorTav());
        addView(getPayButton());
        addView(this.separatorView);
        addView(this.detailsRv);
        addView(this.detailsGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomView getErrorTav() {
        return (TextAtomView) this.errorTav.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatImageView getIconAciv() {
        return (AppCompatImageView) this.iconAciv.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SmallButtonView getPayButton() {
        return (SmallButtonView) this.payButton.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomView getTitleTav() {
        return (TextAtomView) this.titleTav.getValue(this, $$delegatedProperties[1]);
    }

    private final void setupConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new PaymentsDetailsView$setupConstraints$1(this));
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
            this.iconBackgroundView.setBackgroundColor(parseColor.intValue());
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
        this.detailsGroup.setVisibility(item.getArePaymentDetailsVisible() ? 0 : 8);
        PaymentDetailAdapter paymentDetailAdapter = this.paymentDetailAdapter;
        if (paymentDetailAdapter != null) {
            paymentDetailAdapter.submitList(item.getPaymentDetails());
        }
    }

    public final void setupAdapter(@NotNull J lifecycleOwner, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        PaymentDetailAdapter paymentDetailAdapter = new PaymentDetailAdapter(lifecycleOwner, onAction);
        this.paymentDetailAdapter = paymentDetailAdapter;
        this.detailsRv.setAdapter(paymentDetailAdapter);
    }
}
