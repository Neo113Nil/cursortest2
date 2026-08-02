package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.selectedSeat;

import Am.C2438a;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.SelectedSeatVO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001b0\u001fJ\b\u0010!\u001a\u00020\u001bH\u0002J\b\u0010\"\u001a\u00020\u001bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0018\u0010\f¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/selectedSeat/SelectedSeatView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp16", "seatPassengerTypeTav", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getSeatPassengerTypeTav", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "seatPassengerTypeTav$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "seatDescriptionTav", "getSeatDescriptionTav", "seatDescriptionTav$delegate", "seatInfoSibv", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "getSeatInfoSibv", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "seatInfoSibv$delegate", "seatPriceTav", "getSeatPriceTav", "seatPriceTav$delegate", "bind", "", "item", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/SelectedSeatVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "addViews", "setupConstraints", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SelectedSeatView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(SelectedSeatView.class, "seatPassengerTypeTav", "getSeatPassengerTypeTav()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(SelectedSeatView.class, "seatDescriptionTav", "getSeatDescriptionTav()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(SelectedSeatView.class, "seatInfoSibv", "getSeatInfoSibv()Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", 0), C2438a.c(SelectedSeatView.class, "seatPriceTav", "getSeatPriceTav()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0)};
    public static final int $stable;
    private final int dp16;
    private final int dp8;

    /* renamed from: seatDescriptionTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate seatDescriptionTav;

    /* renamed from: seatInfoSibv$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate seatInfoSibv;

    /* renamed from: seatPassengerTypeTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate seatPassengerTypeTav;

    /* renamed from: seatPriceTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate seatPriceTav;

    static {
        int i11 = TextAtomView.$stable;
        int i12 = PreCreationViewPoolDelegate.$stable;
        $stable = i11 | i11 | i12 | SmallIconButtonView.$stable | i12 | i11 | i12 | i12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectedSeatView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.seatPassengerTypeTav = new PreCreationViewPoolDelegate(context2, N.b(TextAtomView.class), new SelectedSeatView$special$$inlined$preCreationViewPool$default$1(this), new SelectedSeatView$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.seatDescriptionTav = new PreCreationViewPoolDelegate(context3, N.b(TextAtomView.class), new SelectedSeatView$special$$inlined$preCreationViewPool$default$3(this), new SelectedSeatView$special$$inlined$preCreationViewPool$default$4(this));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.seatInfoSibv = new PreCreationViewPoolDelegate(context4, N.b(SmallIconButtonView.class), new SelectedSeatView$special$$inlined$preCreationViewPool$default$5(this), new SelectedSeatView$special$$inlined$preCreationViewPool$default$6(this));
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.seatPriceTav = new PreCreationViewPoolDelegate(context5, N.b(TextAtomView.class), new SelectedSeatView$special$$inlined$preCreationViewPool$default$7(this), new SelectedSeatView$special$$inlined$preCreationViewPool$default$8());
        addViews();
        setupConstraints();
    }

    private final void addViews() {
        addView(getSeatPassengerTypeTav());
        addView(getSeatDescriptionTav());
        addView(getSeatInfoSibv());
        addView(getSeatPriceTav());
    }

    private final TextAtomView getSeatDescriptionTav() {
        return (TextAtomView) this.seatDescriptionTav.getValue(this, $$delegatedProperties[1]);
    }

    private final SmallIconButtonView getSeatInfoSibv() {
        return (SmallIconButtonView) this.seatInfoSibv.getValue(this, $$delegatedProperties[2]);
    }

    private final TextAtomView getSeatPassengerTypeTav() {
        return (TextAtomView) this.seatPassengerTypeTav.getValue(this, $$delegatedProperties[0]);
    }

    private final TextAtomView getSeatPriceTav() {
        return (TextAtomView) this.seatPriceTav.getValue(this, $$delegatedProperties[3]);
    }

    private final void setupConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintLayoutExtensionsKt.startToParent(dVar, getSeatPassengerTypeTav());
        ConstraintLayoutExtensionsKt.topToParent(dVar, getSeatPassengerTypeTav());
        ConstraintLayoutExtensionsKt.baselineToBaseline(dVar, getSeatDescriptionTav(), getSeatPassengerTypeTav());
        ConstraintLayoutExtensionsKt.endToStart(dVar, getSeatDescriptionTav(), getSeatInfoSibv());
        dVar.c0(0.0f, getSeatDescriptionTav().getId());
        dVar.d0(getSeatDescriptionTav().getId(), 2);
        ConstraintLayoutExtensionsKt.startToEnd(dVar, getSeatDescriptionTav(), getSeatPassengerTypeTav());
        ConstraintLayoutExtensionsKt.topToTop(dVar, getSeatInfoSibv(), getSeatDescriptionTav());
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, getSeatInfoSibv(), getSeatDescriptionTav());
        ConstraintLayoutExtensionsKt.startToEnd(dVar, getSeatInfoSibv(), getSeatDescriptionTav());
        ConstraintLayoutExtensionsKt.endToStart(dVar, getSeatInfoSibv(), getSeatPriceTav());
        ConstraintLayoutExtensionsKt.endToParent(dVar, getSeatPriceTav());
        ConstraintLayoutExtensionsKt.baselineToBaseline(dVar, getSeatPriceTav(), getSeatPassengerTypeTav());
        dVar.f(this);
    }

    public final void bind(@NotNull SelectedSeatVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextAtomHolderKt.bind$default(getSeatPassengerTypeTav(), item.getPassengerType(), null, 2, null);
        TextAtomHolderKt.bindOrGone$default(getSeatDescriptionTav(), item.getDescription(), null, 2, null);
        WrappedIconButtonHolderKt.bindOrGone(getSeatInfoSibv(), item.getInfoButton(), actionHandler);
        TextAtomHolderKt.bind$default(getSeatPriceTav(), item.getPrice(), null, 2, null);
    }
}
