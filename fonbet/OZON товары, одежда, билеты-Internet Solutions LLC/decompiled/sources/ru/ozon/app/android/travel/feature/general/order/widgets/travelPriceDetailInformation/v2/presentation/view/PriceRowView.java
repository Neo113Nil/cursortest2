package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.view;

import Am.C2438a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.view.Y;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.travel.feature.general.order.R$id;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.TravelPriceDetailInformationV2VO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ(\u0010 \u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\u001f2\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aj\u0002`\u001dJ(\u0010\"\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001f2\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aj\u0002`\u001dH\u0002J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001fH\u0002J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001fH\u0002J\b\u0010%\u001a\u00020\u001cH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001aj\u0004\u0018\u0001`\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/view/PriceRowView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "smallIconButton", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "price", "button", "Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/SmallBorderlessButtonView;", "priceIcon", "Lru/ozon/uni/android/atom/icon/IconView;", "getPriceIcon", "()Lru/ozon/uni/android/atom/icon/IconView;", "priceIcon$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "dp2", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "boundData", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO$PriceRowVO;", "bindOrGone", "data", "bind", "setupClickableSIBBox", "setupSIBGap", "setupConstraints", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceRowView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(PriceRowView.class, "priceIcon", "getPriceIcon()Lru/ozon/uni/android/atom/icon/IconView;", 0)};
    public static final int $stable = 8;
    private Function1<? super AtomAction, Unit> actionHandler;
    private TravelPriceDetailInformationV2VO.PriceRowVO boundData;

    @NotNull
    private final SmallBorderlessButtonView button;
    private final int dp2;

    @NotNull
    private final TextAtomView price;

    /* renamed from: priceIcon$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate priceIcon;

    @NotNull
    private final SmallIconButtonView smallIconButton;

    @NotNull
    private final TextAtomView title;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.view.PriceRowView$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            AtomAction atomAction;
            Function1 function1;
            Intrinsics.checkNotNullParameter(it, "it");
            TravelPriceDetailInformationV2VO.PriceRowVO priceRowVO = PriceRowView.this.boundData;
            if (priceRowVO == null || (atomAction = priceRowVO.getAtomAction()) == null || (function1 = PriceRowView.this.actionHandler) == null) {
                return;
            }
            function1.invoke(atomAction);
        }
    }

    public /* synthetic */ PriceRowView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void bind(TravelPriceDetailInformationV2VO.PriceRowVO data, Function1<? super AtomAction, Unit> actionHandler) {
        this.actionHandler = actionHandler;
        this.boundData = data;
        TextAtomHolderKt.bind$default(this.title, data.getTitle(), null, 2, null);
        TextAtomHolderKt.bindOrGone$default(this.price, data.getRightText(), null, 2, null);
        WrappedBorderlessButtonHolderKt.bindOrGone(this.button, data.getButton(), actionHandler);
        WrappedIconButtonHolderKt.bindOrGone(this.smallIconButton, data.getSmallIconButton(), actionHandler);
        this.smallIconButton.setPadding(0, 0, 0, 0);
        IconHolderKt.bindOrGone$default(getPriceIcon(), data.getMilesIcon(), null, 2, null);
        setupClickableSIBBox(data);
        setupSIBGap(data);
    }

    private final IconView getPriceIcon() {
        return (IconView) this.priceIcon.getValue(this, $$delegatedProperties[0]);
    }

    private final void setupClickableSIBBox(TravelPriceDetailInformationV2VO.PriceRowVO data) {
        TouchDelegate createNewHitAreaDelegate;
        if (data.getAtomAction() != null || data.getSmallIconButton() == null) {
            this.smallIconButton.setClickable(false);
            setTouchDelegate(null);
            return;
        }
        this.smallIconButton.setClickable(true);
        int i11 = Y.f42258g;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.view.PriceRowView$setupClickableSIBBox$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    TouchDelegate createNewHitAreaDelegate2;
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    PriceRowView priceRowView = PriceRowView.this;
                    createNewHitAreaDelegate2 = PriceRowViewKt.createNewHitAreaDelegate(priceRowView.smallIconButton);
                    priceRowView.setTouchDelegate(createNewHitAreaDelegate2);
                }
            });
        } else {
            createNewHitAreaDelegate = PriceRowViewKt.createNewHitAreaDelegate(this.smallIconButton);
            setTouchDelegate(createNewHitAreaDelegate);
        }
    }

    private final void setupConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintLayoutExtensionsKt.topToParent(dVar, this.title);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.title);
        ConstraintLayoutExtensionsKt.endToStart(dVar, this.title, this.smallIconButton);
        dVar.C(this.title.getId(), true);
        dVar.c0(0.0f, this.title.getId());
        dVar.d0(this.title.getId(), 2);
        ConstraintLayoutExtensionsKt.topToTop(dVar, this.smallIconButton, this.title);
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, this.smallIconButton, this.title);
        ConstraintLayoutExtensionsKt.startToEnd(dVar, this.smallIconButton, this.title);
        ConstraintLayoutExtensionsKt.endToStart(dVar, this.smallIconButton, this.price);
        ConstraintLayoutExtensionsKt.baselineToBaseline(dVar, this.price, this.title);
        ConstraintLayoutExtensionsKt.endToStart(dVar, this.price, getPriceIcon(), this.dp2);
        dVar.Z(this.price.getId(), 7, 0);
        ConstraintLayoutExtensionsKt.startToStart(dVar, this.button, this.title);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.button, this.title);
        ConstraintLayoutExtensionsKt.endToParent(dVar, getPriceIcon());
        ConstraintLayoutExtensionsKt.topToParent(dVar, getPriceIcon());
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, getPriceIcon());
        dVar.f(this);
    }

    private final void setupSIBGap(TravelPriceDetailInformationV2VO.PriceRowVO data) {
        ViewGroup.LayoutParams layoutParams = this.smallIconButton.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        if (((ConstraintLayout.b) layoutParams).getMarginStart() != data.getSmallIconGap()) {
            d dVar = new d();
            dVar.p(this);
            ConstraintLayoutExtensionsKt.startToEnd(dVar, this.smallIconButton, this.title, data.getSmallIconGap());
            dVar.f(this);
        }
    }

    public final void bindOrGone(TravelPriceDetailInformationV2VO.PriceRowVO data, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (data == null) {
            ViewExtKt.gone(this);
        } else {
            ViewExtKt.show(this);
            bind(data, actionHandler);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceRowView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        q qVar = q.f64554a;
        View g10 = qVar.g(N.b(TextAtomView.class), context);
        TextAtomView textAtomView = (TextAtomView) g10;
        C2438a.e(textAtomView, R$id.travelPriceDetailInfoPriceRowTitle, -2, -2);
        addView(g10);
        this.title = textAtomView;
        View g11 = qVar.g(N.b(SmallIconButtonView.class), context);
        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) g11;
        smallIconButtonView.setId(R$id.travelPriceDetailInfoPriceRowSIB);
        smallIconButtonView.setLayoutParams(new ConstraintLayout.b(ResourceExtKt.toPx(16, context), ResourceExtKt.toPx(16, context)));
        addView(g11);
        this.smallIconButton = smallIconButtonView;
        View g12 = qVar.g(N.b(TextAtomView.class), context);
        TextAtomView textAtomView2 = (TextAtomView) g12;
        C2438a.e(textAtomView2, R$id.travelPriceDetailInfoPriceRowPrice, -2, -2);
        addView(g12);
        this.price = textAtomView2;
        View g13 = qVar.g(N.b(SmallBorderlessButtonView.class), context);
        SmallBorderlessButtonView smallBorderlessButtonView = (SmallBorderlessButtonView) g13;
        smallBorderlessButtonView.setId(R$id.travelPriceDetailInfoPriceRowButton);
        smallBorderlessButtonView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        addView(g13);
        this.button = smallBorderlessButtonView;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.priceIcon = new PreCreationViewPoolDelegate(context2, N.b(IconView.class), new PriceRowView$special$$inlined$preCreationViewPool$default$1(this), new PriceRowView$special$$inlined$preCreationViewPool$default$2(this));
        this.dp2 = ResourceExtKt.toPx(2, context);
        setupConstraints();
        ViewExtKt.setOnClickListenerThrottle$default(this, 0L, new AnonymousClass1(), 1, null);
    }
}
