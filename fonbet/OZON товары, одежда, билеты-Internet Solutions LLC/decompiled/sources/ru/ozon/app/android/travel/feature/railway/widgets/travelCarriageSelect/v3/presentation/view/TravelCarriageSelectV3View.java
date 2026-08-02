package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.view;

import Bi.b;
import De.C2860c;
import F3.G;
import Im.a;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.app.android.travel.feature.railway.R$id;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.TravelCarriageSelectV3VO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.adapter.TravelCarriageSelectV3StoreyAdapter;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.adapter.TravelCarriageSelectV3StoreysDecoration;
import ru.ozon.app.android.travel.molecules.view.priceCard.PriceCardView;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0010\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001c\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u00020\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0018¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u00122\u0006\u0010#\u001a\u00020\u0012¢\u0006\u0004\b$\u0010%J!\u0010*\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J3\u0010.\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010,2\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\bH\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\bH\u0002¢\u0006\u0004\b2\u00101J\u000f\u00103\u001a\u00020\bH\u0002¢\u0006\u0004\b3\u00101J\u000f\u00104\u001a\u00020\bH\u0002¢\u0006\u0004\b4\u00101R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u00109\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R\u0014\u0010:\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00107R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010?\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010LR\u0014\u0010N\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010LR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010LR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010LR\u0014\u0010W\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010LR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010]R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010e\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010d¨\u0006f"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/view/TravelCarriageSelectV3View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/recyclerview/widget/RecyclerView$u;", "recycledViewPool", "", "setRecycledViewPool", "(Landroidx/recyclerview/widget/RecyclerView$u;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "selectSeatAction", "Lkotlin/Function1;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "bindActions", "(Lru/ozon/uni/atoms/af/AtomAction;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "type", "serviceType", "number", "bindTexts", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO$StoreyVO;", "storeys", "additionalInfo", "bindStoreys", "(Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", ResultDTO.CONTENT_TYPE_SERVICES, "bindServices", "(Ljava/util/List;)V", "seatsDetails", "seatsCount", "bindSeats", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO$PriceBlockVO;", "priceBlock", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "originalPrice", "bindPrices", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO$PriceBlockVO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "premiumBadge", "bindPremiumBadge", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lkotlin/jvm/functions/Function1;)V", "addViews", "()V", "setConstraints", "setupRoot", "setupViews", "", "dp4", "I", "dp8", "dp12", "dp16", "", "dpf24", "F", "Lkotlin/Function0;", "onClick", "Lkotlin/jvm/functions/Function0;", "Landroid/graphics/drawable/ShapeDrawable;", "viewBackground", "Landroid/graphics/drawable/ShapeDrawable;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "railwayServicesAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/adapter/TravelCarriageSelectV3StoreyAdapter;", "carriageAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/adapter/TravelCarriageSelectV3StoreyAdapter;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "numberTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "typeTAV", "serviceTypeTAV", "Landroidx/recyclerview/widget/RecyclerView;", "storeysRV", "Landroidx/recyclerview/widget/RecyclerView;", "additionalInfoTAV", "Lru/ozon/app/android/atoms/af/layout/HorizontalAtomsLayout;", "railwayServicesHAL", "Lru/ozon/app/android/atoms/af/layout/HorizontalAtomsLayout;", "seatsCountTAV", "seatsDetailsTAV", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "originalPricePV", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardView;", "discountPriceCardPCV", "Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardView;", "originalPriceCardPCV", "Lru/ozon/uni/android/atom/badge/BadgeView;", "premiumBadgeBV", "Lru/ozon/uni/android/atom/badge/BadgeView;", "Landroidx/constraintlayout/widget/Barrier;", "priceTopBarrier", "Landroidx/constraintlayout/widget/Barrier;", "priceBottomBarrier", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCarriageSelectV3View extends ConstraintLayout {

    @NotNull
    private final TextAtomV2View additionalInfoTAV;

    @NotNull
    private final TravelCarriageSelectV3StoreyAdapter carriageAdapter;

    @NotNull
    private final PriceCardView discountPriceCardPCV;
    private final int dp12;
    private final int dp16;
    private final int dp4;
    private final int dp8;
    private final float dpf24;

    @NotNull
    private final TextAtomV2View numberTAV;
    private Function0<Unit> onClick;

    @NotNull
    private final PriceCardView originalPriceCardPCV;

    @NotNull
    private final PriceAtomView originalPricePV;

    @NotNull
    private final BadgeView premiumBadgeBV;

    @NotNull
    private final Barrier priceBottomBarrier;

    @NotNull
    private final Barrier priceTopBarrier;

    @NotNull
    private final AtomsAdapter railwayServicesAdapter;

    @NotNull
    private final HorizontalAtomsLayout railwayServicesHAL;

    @NotNull
    private final TextAtomV2View seatsCountTAV;

    @NotNull
    private final TextAtomV2View seatsDetailsTAV;

    @NotNull
    private final TextAtomV2View serviceTypeTAV;

    @NotNull
    private final RecyclerView storeysRV;

    @NotNull
    private final TextAtomV2View typeTAV;

    @NotNull
    private final ShapeDrawable viewBackground;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelCarriageSelectV3View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp12 = ResourceExtKt.toPx(12, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        float pxF = ResourceExtKt.toPxF(24, context);
        this.dpf24 = pxF;
        this.viewBackground = new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.layerFloor1), pxF);
        this.railwayServicesAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.carriageAdapter = new TravelCarriageSelectV3StoreyAdapter(new TravelCarriageSelectV3View$carriageAdapter$1(this));
        int i11 = 0;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        G.g(textAtomV2View, R$id.travelCarriageSelectV3NumberTAV, -2, -2);
        this.numberTAV = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        G.g(textAtomV2View2, R$id.travelCarriageSelectV3TypeTAV, -2, -2);
        this.typeTAV = textAtomV2View2;
        TextAtomV2View textAtomV2View3 = new TextAtomV2View(context, null, 0, 6, null);
        G.g(textAtomV2View3, R$id.travelCarriageSelectV3ServiceTypeTAV, -2, -2);
        this.serviceTypeTAV = textAtomV2View3;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.travelCarriageSelectV3StoreysRV);
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView.setNestedScrollingEnabled(false);
        this.storeysRV = recyclerView;
        AttributeSet attributeSet = null;
        TextAtomV2View textAtomV2View4 = new TextAtomV2View(context, null, 0, 6, null);
        G.g(textAtomV2View4, R$id.travelCarriageSelectV3AdditionalInfoTAV, 0, -2);
        this.additionalInfoTAV = textAtomV2View4;
        HorizontalAtomsLayout horizontalAtomsLayout = new HorizontalAtomsLayout(context, null, 0, 6, null);
        horizontalAtomsLayout.setId(R$id.travelCarriageSelectV3RailwayServicesHAL);
        horizontalAtomsLayout.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.railwayServicesHAL = horizontalAtomsLayout;
        TextAtomV2View textAtomV2View5 = new TextAtomV2View(context, null, 0, 6, null);
        G.g(textAtomV2View5, R$id.travelCarriageSelectV3SeatsCountTAV, -2, -2);
        this.seatsCountTAV = textAtomV2View5;
        TextAtomV2View textAtomV2View6 = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View6, R$id.travelCarriageSelectV3SeatsDetailsTAV, -2, -2);
        d11.f41616W = true;
        d11.f41598E = 0.0f;
        textAtomV2View6.setLayoutParams(d11);
        this.seatsDetailsTAV = textAtomV2View6;
        PriceAtomView priceAtomView = new PriceAtomView(context, null, 0, 6, null);
        ConstraintLayout.b b11 = C2860c.b(priceAtomView, R$id.travelCarriageSelectV3OriginalPricePV, -2, -2);
        b11.f41616W = true;
        b11.f41598E = 0.0f;
        ViewExtKt.gone(priceAtomView);
        priceAtomView.setLayoutParams(b11);
        this.originalPricePV = priceAtomView;
        int i12 = 0;
        int i13 = 14;
        DefaultConstructorMarker defaultConstructorMarker = null;
        PriceCardView priceCardView = new PriceCardView(context, attributeSet, i11, i12, i13, defaultConstructorMarker);
        priceCardView.setId(R$id.travelCarriageSelectV3DiscountPriceCardPCV);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41598E = 0.0f;
        priceCardView.setLayoutParams(bVar);
        this.discountPriceCardPCV = priceCardView;
        PriceCardView priceCardView2 = new PriceCardView(context, attributeSet, i11, i12, i13, defaultConstructorMarker);
        priceCardView2.setId(R$id.travelCarriageSelectV3OriginalPriceCardPCV);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.f41616W = true;
        bVar2.f41598E = 0.0f;
        priceCardView2.setLayoutParams(bVar2);
        this.originalPriceCardPCV = priceCardView2;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        a.c(badgeView, R$id.travelCarriageSelectV3PremiumBadgeBV, -2, -2);
        this.premiumBadgeBV = badgeView;
        Barrier barrier = new Barrier(context);
        barrier.setId(R$id.travelCarriageSelectV3PriceTopBarrier);
        barrier.f(2);
        barrier.setReferencedIds(new int[]{priceCardView.getId(), priceAtomView.getId(), priceCardView2.getId()});
        this.priceTopBarrier = barrier;
        Barrier barrier2 = new Barrier(context);
        barrier2.setId(R$id.travelCarriageSelectV3PriceBottomBarrier);
        barrier2.f(3);
        barrier2.setReferencedIds(new int[]{priceCardView.getId(), priceAtomView.getId(), priceCardView2.getId()});
        this.priceBottomBarrier = barrier2;
        addViews();
        setConstraints();
        setupRoot();
        setupViews();
    }

    private final void addViews() {
        addView(this.numberTAV);
        addView(this.typeTAV);
        addView(this.serviceTypeTAV);
        addView(this.storeysRV);
        addView(this.additionalInfoTAV);
        addView(this.railwayServicesHAL);
        addView(this.seatsCountTAV);
        addView(this.seatsDetailsTAV);
        addView(this.originalPricePV);
        addView(this.discountPriceCardPCV);
        addView(this.originalPriceCardPCV);
        addView(this.premiumBadgeBV);
        addView(this.priceTopBarrier);
        addView(this.priceBottomBarrier);
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new TravelCarriageSelectV3View$setConstraints$1(this));
    }

    private final void setupRoot() {
        int i11 = this.dp16;
        setPadding(i11, i11, i11, i11);
        setClickable(true);
        ViewExtKt.setOnClickListenerThrottle$default(this, 0L, new TravelCarriageSelectV3View$setupRoot$1(this), 1, null);
        setBackground(this.viewBackground);
    }

    private final void setupViews() {
        RecyclerView recyclerView = this.storeysRV;
        recyclerView.setAdapter(this.carriageAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new TravelCarriageSelectV3StoreysDecoration(context));
        recyclerView.setItemAnimator(null);
        this.railwayServicesHAL.setAdapter(this.railwayServicesAdapter);
        this.numberTAV.setTextIsSelectable(false);
        this.typeTAV.setTextIsSelectable(false);
        this.serviceTypeTAV.setTextIsSelectable(false);
        this.additionalInfoTAV.setTextIsSelectable(false);
        this.seatsCountTAV.setTextIsSelectable(false);
        this.seatsDetailsTAV.setTextIsSelectable(false);
    }

    public final void bindActions(AtomAction selectSeatAction, Function1<? super AtomAction, Unit> actionHandler) {
        this.railwayServicesAdapter.setOnAction(actionHandler);
        this.onClick = new TravelCarriageSelectV3View$bindActions$1(selectSeatAction, actionHandler);
    }

    public final void bindPremiumBadge(BadgeDTO premiumBadge, Function1<? super AtomAction, Unit> actionHandler) {
        BadgeHolderKt.bindOrGone(this.premiumBadgeBV, premiumBadge, actionHandler);
    }

    public final void bindPrices(TravelCarriageSelectV3VO.PriceBlockVO priceBlock, PriceDTO originalPrice) {
        this.discountPriceCardPCV.bindOrGone(priceBlock != null ? priceBlock.getDiscountPriceCard() : null);
        this.originalPriceCardPCV.bindOrGone(priceBlock != null ? priceBlock.getOriginalPriceCard() : null);
        PriceAtomHolderKt.bindOrGone$default(this.originalPricePV, originalPrice, null, 2, null);
    }

    public final void bindSeats(TextDTO seatsDetails, @NotNull TextDTO seatsCount) {
        Intrinsics.checkNotNullParameter(seatsCount, "seatsCount");
        TextHolderKt.bindOrGone$default(this.seatsDetailsTAV, seatsDetails, null, 2, null);
        TextHolderKt.bind$default(this.seatsCountTAV, seatsCount, null, 2, null);
    }

    public final void bindServices(@NotNull List<IconButtonV3DTO> services) {
        Intrinsics.checkNotNullParameter(services, "services");
        this.railwayServicesHAL.setVisibility(services.isEmpty() ? 8 : 0);
        AtomsAdapter atomsAdapter = this.railwayServicesAdapter;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, services);
    }

    public final void bindStoreys(@NotNull List<TravelCarriageSelectV3VO.StoreyVO> storeys, TextDTO additionalInfo) {
        Intrinsics.checkNotNullParameter(storeys, "storeys");
        this.carriageAdapter.submitList(storeys);
        TextHolderKt.bindOrGone$default(this.additionalInfoTAV, additionalInfo, null, 2, null);
    }

    public final void bindTexts(@NotNull TextDTO type, @NotNull TextDTO serviceType, @NotNull TextDTO number) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        Intrinsics.checkNotNullParameter(number, "number");
        TextHolderKt.bind$default(this.typeTAV, type, null, 2, null);
        TextHolderKt.bind$default(this.serviceTypeTAV, serviceType, null, 2, null);
        TextHolderKt.bind$default(this.numberTAV, number, null, 2, null);
    }

    public final void setRecycledViewPool(@NotNull RecyclerView.u recycledViewPool) {
        Intrinsics.checkNotNullParameter(recycledViewPool, "recycledViewPool");
        this.storeysRV.setRecycledViewPool(recycledViewPool);
    }
}
