package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainSeatInfo.v2.view;

import Am.C2438a;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.google.android.flexbox.FlexboxLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.R$id;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainSeatInfo.v2.presentation.TravelTrainSeatInfoV2VO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.disclaimer.DisclaimerView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.disclaimer.DSDisclaimerHolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010#\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010'R\u001b\u0010+\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b*\u0010\u001fR\u001b\u0010.\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001d\u001a\u0004\b-\u0010\u001fR\u001b\u00101\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001d\u001a\u0004\b0\u0010\u001fR\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u001d\u001a\u0004\b4\u00105R\u001b\u00109\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u001d\u001a\u0004\b8\u0010\u001fR\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\n0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/view/TravelTrainSeatInfoV2View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "setConstraints", "()V", "addViews", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/view/TravelTrainSeatInfoV2SeatTypeView;", "getAndAddPoolTravelTrainSeatInfoV2SeatTypeView", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/view/TravelTrainSeatInfoV2SeatTypeView;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/presentation/TravelTrainSeatInfoV2VO;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/presentation/TravelTrainSeatInfoV2VO;Lkotlin/jvm/functions/Function1;)V", "", "dp4", "I", "dp6", "dp8", "dp12", "dp16", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "typeTAV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getTypeTAV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "typeTAV", "serviceTypeTAV$delegate", "getServiceTypeTAV", "serviceTypeTAV", "Lru/ozon/uni/android/atom/badge/BadgeView;", "typeBadgeBV$delegate", "getTypeBadgeBV", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "typeBadgeBV", "carriageNumberTAV$delegate", "getCarriageNumberTAV", "carriageNumberTAV", "seatsCountTAV$delegate", "getSeatsCountTAV", "seatsCountTAV", "seatsDetailedTAV$delegate", "getSeatsDetailedTAV", "seatsDetailedTAV", "Lru/ozon/uni/android/atom/disclaimer/DisclaimerView;", "disclaimerViewDV$delegate", "getDisclaimerViewDV", "()Lru/ozon/uni/android/atom/disclaimer/DisclaimerView;", "disclaimerViewDV", "selectionTitleTAV$delegate", "getSelectionTitleTAV", "selectionTitleTAV", "Lcom/google/android/flexbox/FlexboxLayout;", "seatPricesFL", "Lcom/google/android/flexbox/FlexboxLayout;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/view/TravelTrainSeatInfoV2SeatDiscountView;", "discountV$delegate", "LSc/j;", "getDiscountV", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/view/TravelTrainSeatInfoV2SeatDiscountView;", "discountV", "", "seatTypeViewPool", "Ljava/util/List;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelTrainSeatInfoV2View extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(TravelTrainSeatInfoV2View.class, "typeTAV", "getTypeTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(TravelTrainSeatInfoV2View.class, "serviceTypeTAV", "getServiceTypeTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(TravelTrainSeatInfoV2View.class, "typeBadgeBV", "getTypeBadgeBV()Lru/ozon/uni/android/atom/badge/BadgeView;", 0), C2438a.c(TravelTrainSeatInfoV2View.class, "carriageNumberTAV", "getCarriageNumberTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(TravelTrainSeatInfoV2View.class, "seatsCountTAV", "getSeatsCountTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(TravelTrainSeatInfoV2View.class, "seatsDetailedTAV", "getSeatsDetailedTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(TravelTrainSeatInfoV2View.class, "disclaimerViewDV", "getDisclaimerViewDV()Lru/ozon/uni/android/atom/disclaimer/DisclaimerView;", 0), C2438a.c(TravelTrainSeatInfoV2View.class, "selectionTitleTAV", "getSelectionTitleTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    public static final int $stable = 8;

    /* renamed from: carriageNumberTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate carriageNumberTAV;

    /* renamed from: disclaimerViewDV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate disclaimerViewDV;

    /* renamed from: discountV$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j discountV;
    private final int dp12;
    private final int dp16;
    private final int dp4;
    private final int dp6;
    private final int dp8;

    @NotNull
    private final FlexboxLayout seatPricesFL;

    @NotNull
    private final List<TravelTrainSeatInfoV2SeatTypeView> seatTypeViewPool;

    /* renamed from: seatsCountTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate seatsCountTAV;

    /* renamed from: seatsDetailedTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate seatsDetailedTAV;

    /* renamed from: selectionTitleTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate selectionTitleTAV;

    /* renamed from: serviceTypeTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate serviceTypeTAV;

    /* renamed from: typeBadgeBV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate typeBadgeBV;

    /* renamed from: typeTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate typeTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelTrainSeatInfoV2View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(4, context);
        this.dp4 = px;
        this.dp6 = ResourceExtKt.toPx(6, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        int px2 = ResourceExtKt.toPx(12, context);
        this.dp12 = px2;
        int px3 = ResourceExtKt.toPx(16, context);
        this.dp16 = px3;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.typeTAV = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new TravelTrainSeatInfoV2View$special$$inlined$preCreationViewPool$default$1(this), new TravelTrainSeatInfoV2View$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.serviceTypeTAV = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new TravelTrainSeatInfoV2View$special$$inlined$preCreationViewPool$default$3(this), new TravelTrainSeatInfoV2View$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.typeBadgeBV = new PreCreationViewPoolDelegate(context4, N.b(BadgeView.class), new TravelTrainSeatInfoV2View$special$$inlined$preCreationViewPool$default$5(this), new TravelTrainSeatInfoV2View$special$$inlined$preCreationViewPool$default$6());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.carriageNumberTAV = new PreCreationViewPoolDelegate(context5, N.b(TextAtomV2View.class), new TravelTrainSeatInfoV2View$special$$inlined$preCreationViewPool$default$7(this), new TravelTrainSeatInfoV2View$special$$inlined$preCreationViewPool$default$8());
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        this.seatsCountTAV = new PreCreationViewPoolDelegate(context6, N.b(TextAtomV2View.class), new TravelTrainSeatInfoV2View$special$$inlined$preCreationViewPool$default$9(this), new TravelTrainSeatInfoV2View$special$$inlined$preCreationViewPool$default$10());
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        this.seatsDetailedTAV = new PreCreationViewPoolDelegate(context7, N.b(TextAtomV2View.class), new TravelTrainSeatInfoV2View$special$$inlined$preCreationViewPool$default$11(this), new TravelTrainSeatInfoV2View$special$$inlined$preCreationViewPool$default$12());
        Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        this.disclaimerViewDV = new PreCreationViewPoolDelegate(context8, N.b(DisclaimerView.class), new TravelTrainSeatInfoV2View$special$$inlined$preCreationViewPool$default$13(this), new TravelTrainSeatInfoV2View$special$$inlined$preCreationViewPool$default$14());
        Context context9 = getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
        this.selectionTitleTAV = new PreCreationViewPoolDelegate(context9, N.b(TextAtomV2View.class), new TravelTrainSeatInfoV2View$special$$inlined$preCreationViewPool$default$15(this), new TravelTrainSeatInfoV2View$special$$inlined$preCreationViewPool$default$16());
        FlexboxLayout flexboxLayout = new FlexboxLayout(context);
        flexboxLayout.setId(R$id.travelTrainSeatInfoV2SeatPricesFL);
        flexboxLayout.setLayoutParams(new ConstraintLayout.b(0, -2));
        flexboxLayout.setFlexWrap(1);
        flexboxLayout.setShowDivider(2);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(0);
        shapeDrawable.setIntrinsicHeight(px);
        shapeDrawable.setIntrinsicWidth(px3);
        flexboxLayout.setDividerDrawable(shapeDrawable);
        this.seatPricesFL = flexboxLayout;
        this.discountV = LazyUtilsKt.unsafeLazy(new TravelTrainSeatInfoV2View$discountV$2(context));
        this.seatTypeViewPool = new ArrayList();
        setPadding(px3, px2, px3, 0);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        shapeDrawable2.getPaint().setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setBackground(shapeDrawable2);
        for (int i11 = 0; i11 < 4; i11++) {
            getAndAddPoolTravelTrainSeatInfoV2SeatTypeView();
        }
        addViews();
        setConstraints();
    }

    private final void addViews() {
        addView(getTypeTAV());
        addView(getServiceTypeTAV());
        addView(getTypeBadgeBV());
        addView(getCarriageNumberTAV());
        addView(getSeatsCountTAV());
        addView(getSeatsDetailedTAV());
        addView(getDisclaimerViewDV());
        addView(getSelectionTitleTAV());
        addView(this.seatPricesFL);
    }

    private final TravelTrainSeatInfoV2SeatTypeView getAndAddPoolTravelTrainSeatInfoV2SeatTypeView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TravelTrainSeatInfoV2SeatTypeView travelTrainSeatInfoV2SeatTypeView = new TravelTrainSeatInfoV2SeatTypeView(context);
        travelTrainSeatInfoV2SeatTypeView.setLayoutParams(new FlexboxLayout.a(-2, -2));
        this.seatTypeViewPool.add(travelTrainSeatInfoV2SeatTypeView);
        return travelTrainSeatInfoV2SeatTypeView;
    }

    private final TextAtomV2View getCarriageNumberTAV() {
        return (TextAtomV2View) this.carriageNumberTAV.getValue(this, $$delegatedProperties[3]);
    }

    private final DisclaimerView getDisclaimerViewDV() {
        return (DisclaimerView) this.disclaimerViewDV.getValue(this, $$delegatedProperties[6]);
    }

    private final TravelTrainSeatInfoV2SeatDiscountView getDiscountV() {
        return (TravelTrainSeatInfoV2SeatDiscountView) this.discountV.getValue();
    }

    private final TextAtomV2View getSeatsCountTAV() {
        return (TextAtomV2View) this.seatsCountTAV.getValue(this, $$delegatedProperties[4]);
    }

    private final TextAtomV2View getSeatsDetailedTAV() {
        return (TextAtomV2View) this.seatsDetailedTAV.getValue(this, $$delegatedProperties[5]);
    }

    private final TextAtomV2View getSelectionTitleTAV() {
        return (TextAtomV2View) this.selectionTitleTAV.getValue(this, $$delegatedProperties[7]);
    }

    private final TextAtomV2View getServiceTypeTAV() {
        return (TextAtomV2View) this.serviceTypeTAV.getValue(this, $$delegatedProperties[1]);
    }

    private final BadgeView getTypeBadgeBV() {
        return (BadgeView) this.typeBadgeBV.getValue(this, $$delegatedProperties[2]);
    }

    private final TextAtomV2View getTypeTAV() {
        return (TextAtomV2View) this.typeTAV.getValue(this, $$delegatedProperties[0]);
    }

    private final void setConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintLayoutExtensionsKt.topToParent(dVar, getTypeTAV());
        ConstraintLayoutExtensionsKt.startToParent(dVar, getTypeTAV());
        ConstraintLayoutExtensionsKt.startToEnd(dVar, getServiceTypeTAV(), getTypeTAV());
        ConstraintLayoutExtensionsKt.baselineToBaseline(dVar, getServiceTypeTAV(), getTypeTAV());
        ConstraintLayoutExtensionsKt.startToEnd(dVar, getTypeBadgeBV(), getServiceTypeTAV(), this.dp6);
        ConstraintLayoutExtensionsKt.endToStart(dVar, getTypeBadgeBV(), getCarriageNumberTAV(), this.dp8);
        ConstraintLayoutExtensionsKt.topToTop(dVar, getTypeBadgeBV(), getTypeTAV());
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, getTypeBadgeBV(), getTypeTAV());
        dVar.c0(0.0f, getTypeBadgeBV().getId());
        ConstraintLayoutExtensionsKt.topToParent(dVar, getCarriageNumberTAV());
        ConstraintLayoutExtensionsKt.endToParent(dVar, getCarriageNumberTAV());
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getSeatsCountTAV(), getTypeTAV(), this.dp4);
        ConstraintLayoutExtensionsKt.startToParent(dVar, getSeatsCountTAV());
        ConstraintLayoutExtensionsKt.startToEnd(dVar, getSeatsDetailedTAV(), getSeatsCountTAV(), this.dp8);
        ConstraintLayoutExtensionsKt.baselineToBaseline(dVar, getSeatsDetailedTAV(), getSeatsCountTAV());
        ConstraintLayoutExtensionsKt.endToParent(dVar, getSeatsDetailedTAV());
        dVar.c0(0.0f, getSeatsDetailedTAV().getId());
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getDisclaimerViewDV(), getSeatsDetailedTAV(), this.dp16);
        ConstraintLayoutExtensionsKt.startToParent(dVar, getDisclaimerViewDV());
        ConstraintLayoutExtensionsKt.endToParent(dVar, getDisclaimerViewDV());
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getSelectionTitleTAV(), getDisclaimerViewDV(), this.dp16);
        ConstraintLayoutExtensionsKt.startToParent(dVar, getSelectionTitleTAV());
        ConstraintLayoutExtensionsKt.endToParent(dVar, getSelectionTitleTAV());
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.seatPricesFL, getSelectionTitleTAV(), this.dp8);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.seatPricesFL);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.seatPricesFL);
        dVar.f(this);
    }

    public final void bind(@NotNull TravelTrainSeatInfoV2VO state, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextHolderKt.bind$default(getTypeTAV(), state.getType(), null, 2, null);
        TextHolderKt.bindOrGone$default(getServiceTypeTAV(), state.getServiceType(), null, 2, null);
        BadgeHolderKt.bindOrGone$default(getTypeBadgeBV(), state.getTypeBadge(), (Function1) null, 2, (Object) null);
        TextHolderKt.bind$default(getCarriageNumberTAV(), state.getCarriageNumber(), null, 2, null);
        TextHolderKt.bind$default(getSeatsCountTAV(), state.getSeatsCount(), null, 2, null);
        TextHolderKt.bind$default(getSeatsDetailedTAV(), state.getSeatsDetailed(), null, 2, null);
        DSDisclaimerHolderKt.bindOrGone(getDisclaimerViewDV(), state.getAnnotation(), actionHandler);
        TextHolderKt.bind$default(getSelectionTitleTAV(), state.getSelectionTitle(), null, 2, null);
        this.seatPricesFL.removeAllViews();
        int i11 = 0;
        for (Object obj : state.getSeatPrices()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            TravelTrainSeatInfoV2VO.SeatPriceVO seatPriceVO = (TravelTrainSeatInfoV2VO.SeatPriceVO) obj;
            TravelTrainSeatInfoV2SeatTypeView travelTrainSeatInfoV2SeatTypeView = (TravelTrainSeatInfoV2SeatTypeView) C7714v.Q(i11, this.seatTypeViewPool);
            if (travelTrainSeatInfoV2SeatTypeView == null) {
                travelTrainSeatInfoV2SeatTypeView = getAndAddPoolTravelTrainSeatInfoV2SeatTypeView();
            }
            travelTrainSeatInfoV2SeatTypeView.bind(seatPriceVO);
            this.seatPricesFL.addView(travelTrainSeatInfoV2SeatTypeView);
            i11 = i12;
        }
        TravelTrainSeatInfoV2VO.SeatDiscountVO seatDiscount = state.getSeatDiscount();
        if (seatDiscount != null) {
            getDiscountV().bind(seatDiscount, actionHandler);
            this.seatPricesFL.addView(getDiscountV());
        }
    }
}
