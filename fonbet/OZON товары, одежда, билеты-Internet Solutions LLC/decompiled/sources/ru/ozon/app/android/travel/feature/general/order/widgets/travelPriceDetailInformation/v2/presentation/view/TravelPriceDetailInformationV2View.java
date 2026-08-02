package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.view;

import Am.C2438a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.R$id;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.adapter.PriceRowDecorator;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u001dH\u0002J\b\u00106\u001a\u000203H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010*\u001a\u00020+8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0014\u001a\u0004\b,\u0010-R\u001b\u0010/\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0014\u001a\u0004\b0\u0010\u0012¨\u00067"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/view/TravelPriceDetailInformationV2View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp1", "", "dp8", "dp6", "dp12", "dp12F", "", "dp14", "dp16", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getTitle", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "title$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "subtitle", "getSubtitle", "subtitle$delegate", "priceRows", "Landroidx/recyclerview/widget/RecyclerView;", "getPriceRows", "()Landroidx/recyclerview/widget/RecyclerView;", "separatorView", "Landroid/view/View;", "priceDetailTotal", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/view/PriceRowView;", "getPriceDetailTotal", "()Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/view/PriceRowView;", "underTotal", "getUnderTotal", "bonusTotal", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/view/TravelPriceDetailInformationV2BonusView;", "getBonusTotal", "()Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/view/TravelPriceDetailInformationV2BonusView;", "barrier", "Landroidx/constraintlayout/widget/Barrier;", "button", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "getButton", "()Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "button$delegate", "additionalInfo", "getAdditionalInfo", "additionalInfo$delegate", "setUpRoot", "", "addToLayout", "view", "setupConstraints", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPriceDetailInformationV2View extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(TravelPriceDetailInformationV2View.class, SelectionItemFormDTO.TITLE_FIELD_NAME, "getTitle()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(TravelPriceDetailInformationV2View.class, "subtitle", "getSubtitle()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(TravelPriceDetailInformationV2View.class, "button", "getButton()Lru/ozon/uni/atoms/v3/containers/SingleAtom;", 0), C2438a.c(TravelPriceDetailInformationV2View.class, "additionalInfo", "getAdditionalInfo()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0)};
    public static final int $stable = 8;

    /* renamed from: additionalInfo$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate additionalInfo;

    @NotNull
    private final Barrier barrier;

    @NotNull
    private final TravelPriceDetailInformationV2BonusView bonusTotal;

    /* renamed from: button$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate button;
    private final int dp1;
    private final int dp12;
    private final float dp12F;
    private final int dp14;
    private final int dp16;
    private final int dp6;
    private final int dp8;

    @NotNull
    private final PriceRowView priceDetailTotal;

    @NotNull
    private final RecyclerView priceRows;

    @NotNull
    private final View separatorView;

    /* renamed from: subtitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate subtitle;

    /* renamed from: title$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate title;

    @NotNull
    private final PriceRowView underTotal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelPriceDetailInformationV2View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(1, context);
        this.dp1 = px;
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp6 = ResourceExtKt.toPx(6, context);
        this.dp12 = ResourceExtKt.toPx(12, context);
        this.dp12F = ResourceExtKt.toPxF(12, context);
        this.dp14 = ResourceExtKt.toPx(14, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.title = new PreCreationViewPoolDelegate(context2, N.b(TextAtomView.class), new TravelPriceDetailInformationV2View$special$$inlined$preCreationViewPool$default$1(this), new TravelPriceDetailInformationV2View$special$$inlined$preCreationViewPool$default$2(this));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.subtitle = new PreCreationViewPoolDelegate(context3, N.b(TextAtomView.class), new TravelPriceDetailInformationV2View$special$$inlined$preCreationViewPool$default$3(this), new TravelPriceDetailInformationV2View$special$$inlined$preCreationViewPool$default$4(this));
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.travelPriceDetailInfoPriceRows);
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.addItemDecoration(new PriceRowDecorator(context));
        addToLayout(recyclerView);
        this.priceRows = recyclerView;
        View view = new View(context);
        view.setId(R$id.travelPriceDetailInfoSeparator);
        view.setLayoutParams(new ConstraintLayout.b(0, px));
        view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        addToLayout(view);
        this.separatorView = view;
        int i11 = 0;
        int i12 = 0;
        AttributeSet attributeSet = null;
        int i13 = 14;
        DefaultConstructorMarker defaultConstructorMarker = null;
        PriceRowView priceRowView = new PriceRowView(context, attributeSet, i11, i12, i13, defaultConstructorMarker);
        priceRowView.setId(R$id.travelPriceDetailInfoTotal);
        priceRowView.setLayoutParams(new ConstraintLayout.b(0, -2));
        addToLayout(priceRowView);
        this.priceDetailTotal = priceRowView;
        PriceRowView priceRowView2 = new PriceRowView(context, attributeSet, i11, i12, i13, defaultConstructorMarker);
        priceRowView2.setId(R$id.travelPriceDetailInfoRowUnderTotal);
        priceRowView2.setLayoutParams(new ConstraintLayout.b(0, -2));
        addToLayout(priceRowView2);
        this.underTotal = priceRowView2;
        TravelPriceDetailInformationV2BonusView travelPriceDetailInformationV2BonusView = new TravelPriceDetailInformationV2BonusView(context);
        travelPriceDetailInformationV2BonusView.setId(R$id.travelPriceDetailInfoBonusTotal);
        travelPriceDetailInformationV2BonusView.setLayoutParams(new ConstraintLayout.b(0, -2));
        ViewExtKt.gone(travelPriceDetailInformationV2BonusView);
        addToLayout(travelPriceDetailInformationV2BonusView);
        this.bonusTotal = travelPriceDetailInformationV2BonusView;
        Barrier barrier = new Barrier(context);
        barrier.setId(R$id.travelPriceDetailInfoBarrier);
        barrier.setLayoutParams(new ConstraintLayout.b(0, -2));
        barrier.f(3);
        barrier.setReferencedIds(new int[]{R$id.travelPriceDetailInfoTotal, R$id.travelPriceDetailInfoRowUnderTotal, R$id.travelPriceDetailInfoBonusTotal});
        addToLayout(barrier);
        this.barrier = barrier;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.button = new PreCreationViewPoolDelegate(context4, N.b(SingleAtom.class), new TravelPriceDetailInformationV2View$special$$inlined$preCreationViewPool$default$5(this), new TravelPriceDetailInformationV2View$special$$inlined$preCreationViewPool$default$6(this));
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.additionalInfo = new PreCreationViewPoolDelegate(context5, N.b(TextAtomView.class), new TravelPriceDetailInformationV2View$special$$inlined$preCreationViewPool$default$7(this), new TravelPriceDetailInformationV2View$special$$inlined$preCreationViewPool$default$8(this));
        setUpRoot();
        setupConstraints();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addToLayout(View view) {
        addView(view);
    }

    private final void setUpRoot() {
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        float f7 = this.dp12F;
        setBackground(RoundedBackgroundProducer.produce$default(roundedBackgroundProducer, themeColor, f7, f7, 0.0f, 0.0f, 24, null));
    }

    private final void setupConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new TravelPriceDetailInformationV2View$setupConstraints$1(this));
    }

    @NotNull
    public final TextAtomView getAdditionalInfo() {
        return (TextAtomView) this.additionalInfo.getValue(this, $$delegatedProperties[3]);
    }

    @NotNull
    public final TravelPriceDetailInformationV2BonusView getBonusTotal() {
        return this.bonusTotal;
    }

    @NotNull
    public final SingleAtom getButton() {
        return (SingleAtom) this.button.getValue(this, $$delegatedProperties[2]);
    }

    @NotNull
    public final PriceRowView getPriceDetailTotal() {
        return this.priceDetailTotal;
    }

    @NotNull
    public final RecyclerView getPriceRows() {
        return this.priceRows;
    }

    @NotNull
    public final TextAtomView getSubtitle() {
        return (TextAtomView) this.subtitle.getValue(this, $$delegatedProperties[1]);
    }

    @NotNull
    public final TextAtomView getTitle() {
        return (TextAtomView) this.title.getValue(this, $$delegatedProperties[0]);
    }

    @NotNull
    public final PriceRowView getUnderTotal() {
        return this.underTotal;
    }
}
