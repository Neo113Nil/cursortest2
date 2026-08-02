package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.view;

import Am.C2438a;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.TravelRailwaySearchResultsV3TrainVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.adapter.RailwaySearchResultsV3TypePriceAdapter;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.adapter.decoration.TravelRailwaySearchResultsV3TrainBadgesDecoration;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.adapter.decoration.TravelRailwaySearchResultsV3TrainServisesDecoration;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.adapter.decoration.TravelRailwaySearchResultsV3TypePriceDecoration;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000¿\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b*\u0001@\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010!\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u00142\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b!\u0010\"J#\u0010&\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u00112\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0013¢\u0006\u0004\b&\u0010\u0017J\u001b\u0010)\u001a\u00020\u000b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0013¢\u0006\u0004\b)\u0010*J\u001f\u0010.\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000bH\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000bH\u0002¢\u0006\u0004\b2\u00101R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010H\u001a\u0004\bN\u0010OR\u001b\u0010U\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010H\u001a\u0004\bS\u0010TR\u001b\u0010X\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010H\u001a\u0004\bW\u0010OR\u001b\u0010[\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010H\u001a\u0004\bZ\u0010OR\u001b\u0010^\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010H\u001a\u0004\b]\u0010OR\u001b\u0010a\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010H\u001a\u0004\b`\u0010OR\u001b\u0010d\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010H\u001a\u0004\bc\u0010OR\u001b\u0010g\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010H\u001a\u0004\bf\u0010OR\u001b\u0010j\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010H\u001a\u0004\bi\u0010TR\u0014\u0010k\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010ER\u0014\u0010m\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010o\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u001b\u0010u\u001a\u00020q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\br\u0010H\u001a\u0004\bs\u0010tR\u001b\u0010x\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010H\u001a\u0004\bw\u0010T¨\u0006y"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/view/RailwaySearchResultsV3TrainView;", "Lru/ozon/app/android/travel/utils/view/constraintLayoutWithBorder/ConstraintLayoutWithBorder;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/View;", "getOnboardingView", "()Landroid/view/View;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Landroidx/recyclerview/widget/RecyclerView$u;", "viewPool", "setupView", "(Lkotlin/jvm/functions/Function1;Landroidx/recyclerview/widget/RecyclerView$u;)V", "", "hasBadges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "promotionBadges", "bindPromotionBadges", "(ZLjava/util/List;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO$TrainInfo;", "trainInfo", "bindTrainInfo", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO$TrainInfo;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO$TimeInfo;", "timeInfo", "bindTimeInfo", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO$TimeInfo;)V", "badge", "bindNotificationBadge", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lkotlin/jvm/functions/Function1;)V", "isVisible", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", ResultDTO.CONTENT_TYPE_SERVICES, "bindServices", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO$CarriageTypeVO;", "carriageTypes", "bindCarriageTypes", "(Ljava/util/List;)V", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "milesBadge", "bindPriceInfo", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "addViews", "()V", "setConstrains", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dsDimensProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "", "dp1", "I", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/adapter/RailwaySearchResultsV3TypePriceAdapter;", "carriageTypesAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/adapter/RailwaySearchResultsV3TypePriceAdapter;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "badgesAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "servicesAdapter", "ru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/view/RailwaySearchResultsV3TrainView$touchListener$1", "touchListener", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/view/RailwaySearchResultsV3TrainView$touchListener$1;", "Lru/ozon/app/android/atoms/af/layout/HorizontalAtomsLayout;", "promotionBadgesHAL", "Lru/ozon/app/android/atoms/af/layout/HorizontalAtomsLayout;", "Lru/ozon/uni/android/atom/icon/IconView;", "trainIconIV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getTrainIconIV", "()Lru/ozon/uni/android/atom/icon/IconView;", "trainIconIV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "trainNameTAV$delegate", "getTrainNameTAV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "trainNameTAV", "Lru/ozon/uni/android/atom/badge/BadgeView;", "routeBadge$delegate", "getRouteBadge", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "routeBadge", "travelTimeTAV$delegate", "getTravelTimeTAV", "travelTimeTAV", "travelTimeCaptionTAV$delegate", "getTravelTimeCaptionTAV", "travelTimeCaptionTAV", "departureArrivalTimesTAV$delegate", "getDepartureArrivalTimesTAV", "departureArrivalTimesTAV", "dayDifferenceTAV$delegate", "getDayDifferenceTAV", "dayDifferenceTAV", "departureStationTAV$delegate", "getDepartureStationTAV", "departureStationTAV", "arrivalStationTAV$delegate", "getArrivalStationTAV", "arrivalStationTAV", "notificationBadgeBV$delegate", "getNotificationBadgeBV", "notificationBadgeBV", "servicesHAL", "Landroidx/recyclerview/widget/RecyclerView;", "carriageTypesRV", "Landroidx/recyclerview/widget/RecyclerView;", "separatorV", "Landroid/view/View;", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "pricePAV$delegate", "getPricePAV", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "pricePAV", "milesBadgeBV$delegate", "getMilesBadgeBV", "milesBadgeBV", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RailwaySearchResultsV3TrainView extends ConstraintLayoutWithBorder {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(RailwaySearchResultsV3TrainView.class, "trainIconIV", "getTrainIconIV()Lru/ozon/uni/android/atom/icon/IconView;", 0), C2438a.c(RailwaySearchResultsV3TrainView.class, "trainNameTAV", "getTrainNameTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(RailwaySearchResultsV3TrainView.class, "routeBadge", "getRouteBadge()Lru/ozon/uni/android/atom/badge/BadgeView;", 0), C2438a.c(RailwaySearchResultsV3TrainView.class, "travelTimeTAV", "getTravelTimeTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(RailwaySearchResultsV3TrainView.class, "travelTimeCaptionTAV", "getTravelTimeCaptionTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(RailwaySearchResultsV3TrainView.class, "departureArrivalTimesTAV", "getDepartureArrivalTimesTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(RailwaySearchResultsV3TrainView.class, "dayDifferenceTAV", "getDayDifferenceTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(RailwaySearchResultsV3TrainView.class, "departureStationTAV", "getDepartureStationTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(RailwaySearchResultsV3TrainView.class, "arrivalStationTAV", "getArrivalStationTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(RailwaySearchResultsV3TrainView.class, "notificationBadgeBV", "getNotificationBadgeBV()Lru/ozon/uni/android/atom/badge/BadgeView;", 0), C2438a.c(RailwaySearchResultsV3TrainView.class, "pricePAV", "getPricePAV()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", 0), C2438a.c(RailwaySearchResultsV3TrainView.class, "milesBadgeBV", "getMilesBadgeBV()Lru/ozon/uni/android/atom/badge/BadgeView;", 0)};
    public static final int $stable = 8;

    /* renamed from: arrivalStationTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate arrivalStationTAV;

    @NotNull
    private final AtomsAdapter badgesAdapter;

    @NotNull
    private final RailwaySearchResultsV3TypePriceAdapter carriageTypesAdapter;

    @NotNull
    private final RecyclerView carriageTypesRV;

    /* renamed from: dayDifferenceTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate dayDifferenceTAV;

    /* renamed from: departureArrivalTimesTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate departureArrivalTimesTAV;

    /* renamed from: departureStationTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate departureStationTAV;
    private final int dp1;

    @NotNull
    private final DesignSystemDimensProvider dsDimensProvider;

    /* renamed from: milesBadgeBV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate milesBadgeBV;

    /* renamed from: notificationBadgeBV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate notificationBadgeBV;

    /* renamed from: pricePAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate pricePAV;

    @NotNull
    private final HorizontalAtomsLayout promotionBadgesHAL;

    /* renamed from: routeBadge$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate routeBadge;

    @NotNull
    private final View separatorV;

    @NotNull
    private final AtomsAdapter servicesAdapter;

    @NotNull
    private final HorizontalAtomsLayout servicesHAL;

    @NotNull
    private final RailwaySearchResultsV3TrainView$touchListener$1 touchListener;

    /* renamed from: trainIconIV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate trainIconIV;

    /* renamed from: trainNameTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate trainNameTAV;

    /* renamed from: travelTimeCaptionTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate travelTimeCaptionTAV;

    /* renamed from: travelTimeTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate travelTimeTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [androidx.recyclerview.widget.RecyclerView$s, ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.view.RailwaySearchResultsV3TrainView$touchListener$1] */
    public RailwaySearchResultsV3TrainView(@NotNull Context context) {
        super(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dsDimensProvider = dimens$default;
        int px = ResourceExtKt.toPx(1, context);
        this.dp1 = px;
        RailwaySearchResultsV3TypePriceAdapter railwaySearchResultsV3TypePriceAdapter = new RailwaySearchResultsV3TypePriceAdapter();
        this.carriageTypesAdapter = railwaySearchResultsV3TypePriceAdapter;
        Map map = null;
        Map map2 = null;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, map2, map, null, 15, null);
        this.badgesAdapter = atomsAdapter;
        AtomsAdapter atomsAdapter2 = new AtomsAdapter(map2, map, 0 == true ? 1 : 0, null, 15, null);
        this.servicesAdapter = atomsAdapter2;
        ?? r13 = new RecyclerView.s() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.view.RailwaySearchResultsV3TrainView$touchListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.s
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e11) {
                Intrinsics.checkNotNullParameter(rv, "rv");
                Intrinsics.checkNotNullParameter(e11, "e");
                RailwaySearchResultsV3TrainView.this.onTouchEvent(e11);
                return false;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.s
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.s
            public void onTouchEvent(RecyclerView rv, MotionEvent e11) {
                Intrinsics.checkNotNullParameter(rv, "rv");
                Intrinsics.checkNotNullParameter(e11, "e");
            }
        };
        this.touchListener = r13;
        HorizontalAtomsLayout horizontalAtomsLayout = new HorizontalAtomsLayout(context, null, 0, 6, null);
        horizontalAtomsLayout.setId(View.generateViewId());
        horizontalAtomsLayout.setLayoutParams(new ConstraintLayout.b(-2, -2));
        setMinHeight(ResourceExtKt.toPx(20, context));
        horizontalAtomsLayout.setAdapter(atomsAdapter);
        horizontalAtomsLayout.setDecorator(new TravelRailwaySearchResultsV3TrainBadgesDecoration(context));
        this.promotionBadgesHAL = horizontalAtomsLayout;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.trainIconIV = new PreCreationViewPoolDelegate(context2, N.b(IconView.class), new RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$1(this), new RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$2(this));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.trainNameTAV = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$3(this), new RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.routeBadge = new PreCreationViewPoolDelegate(context4, N.b(BadgeView.class), new RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$5(this), new RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$6());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.travelTimeTAV = new PreCreationViewPoolDelegate(context5, N.b(TextAtomV2View.class), new RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$7(this), new RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$8());
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        this.travelTimeCaptionTAV = new PreCreationViewPoolDelegate(context6, N.b(TextAtomV2View.class), new RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$9(this), new RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$10());
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        this.departureArrivalTimesTAV = new PreCreationViewPoolDelegate(context7, N.b(TextAtomV2View.class), new RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$11(this), new RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$12());
        Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        this.dayDifferenceTAV = new PreCreationViewPoolDelegate(context8, N.b(TextAtomV2View.class), new RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$13(this), new RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$14());
        Context context9 = getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
        this.departureStationTAV = new PreCreationViewPoolDelegate(context9, N.b(TextAtomV2View.class), new RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$15(this), new RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$16());
        Context context10 = getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
        this.arrivalStationTAV = new PreCreationViewPoolDelegate(context10, N.b(TextAtomV2View.class), new RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$17(this), new RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$18());
        Context context11 = getContext();
        Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
        this.notificationBadgeBV = new PreCreationViewPoolDelegate(context11, N.b(BadgeView.class), new RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$19(this), new RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$20());
        HorizontalAtomsLayout horizontalAtomsLayout2 = new HorizontalAtomsLayout(context, null, 0, 6, null);
        horizontalAtomsLayout2.setId(View.generateViewId());
        horizontalAtomsLayout2.setLayoutParams(new ConstraintLayout.b(0, -2));
        horizontalAtomsLayout2.setAdapter(atomsAdapter2);
        horizontalAtomsLayout2.setDecorator(new TravelRailwaySearchResultsV3TrainServisesDecoration(context));
        this.servicesHAL = horizontalAtomsLayout2;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(View.generateViewId());
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView.setAdapter(railwaySearchResultsV3TypePriceAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.addItemDecoration(new TravelRailwaySearchResultsV3TypePriceDecoration(context));
        recyclerView.setItemAnimator(null);
        recyclerView.addOnItemTouchListener(r13);
        this.carriageTypesRV = recyclerView;
        View view = new View(context);
        view.setId(View.generateViewId());
        view.setLayoutParams(new ConstraintLayout.b(0, px));
        view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        this.separatorV = view;
        Context context12 = getContext();
        Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
        this.pricePAV = new PreCreationViewPoolDelegate(context12, N.b(PriceAtomView.class), new RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$21(this), new RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$22());
        Context context13 = getContext();
        Intrinsics.checkNotNullExpressionValue(context13, "getContext(...)");
        this.milesBadgeBV = new PreCreationViewPoolDelegate(context13, N.b(BadgeView.class), new RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$23(this), new RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$24());
        setPadding(dimens$default.getMargin16(), dimens$default.getMargin16(), dimens$default.getMargin16(), dimens$default.getMargin16());
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setRadius(dimens$default.getRadius24());
        addViews();
        setConstrains();
    }

    private final void addViews() {
        addView(this.promotionBadgesHAL);
        addView(getTrainIconIV());
        addView(getTrainNameTAV());
        addView(getRouteBadge());
        addView(getTravelTimeTAV());
        addView(getTravelTimeCaptionTAV());
        addView(getDepartureArrivalTimesTAV());
        addView(getDayDifferenceTAV());
        addView(getDepartureStationTAV());
        addView(getArrivalStationTAV());
        addView(getNotificationBadgeBV());
        addView(this.servicesHAL);
        addView(this.carriageTypesRV);
        addView(this.separatorV);
        addView(getPricePAV());
        addView(getMilesBadgeBV());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getArrivalStationTAV() {
        return (TextAtomV2View) this.arrivalStationTAV.getValue(this, $$delegatedProperties[8]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getDayDifferenceTAV() {
        return (TextAtomV2View) this.dayDifferenceTAV.getValue(this, $$delegatedProperties[6]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getDepartureArrivalTimesTAV() {
        return (TextAtomV2View) this.departureArrivalTimesTAV.getValue(this, $$delegatedProperties[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getDepartureStationTAV() {
        return (TextAtomV2View) this.departureStationTAV.getValue(this, $$delegatedProperties[7]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BadgeView getMilesBadgeBV() {
        return (BadgeView) this.milesBadgeBV.getValue(this, $$delegatedProperties[11]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BadgeView getNotificationBadgeBV() {
        return (BadgeView) this.notificationBadgeBV.getValue(this, $$delegatedProperties[9]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PriceAtomView getPricePAV() {
        return (PriceAtomView) this.pricePAV.getValue(this, $$delegatedProperties[10]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BadgeView getRouteBadge() {
        return (BadgeView) this.routeBadge.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IconView getTrainIconIV() {
        return (IconView) this.trainIconIV.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getTrainNameTAV() {
        return (TextAtomV2View) this.trainNameTAV.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getTravelTimeCaptionTAV() {
        return (TextAtomV2View) this.travelTimeCaptionTAV.getValue(this, $$delegatedProperties[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getTravelTimeTAV() {
        return (TextAtomV2View) this.travelTimeTAV.getValue(this, $$delegatedProperties[3]);
    }

    private final void setConstrains() {
        ConstraintLayoutExtKt.updateConstraints(this, new RailwaySearchResultsV3TrainView$setConstrains$1(this));
    }

    public final void bindCarriageTypes(@NotNull List<TravelRailwaySearchResultsV3TrainVO.CarriageTypeVO> carriageTypes) {
        Intrinsics.checkNotNullParameter(carriageTypes, "carriageTypes");
        this.carriageTypesAdapter.submitList(carriageTypes);
    }

    public final void bindNotificationBadge(BadgeDTO badge, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        BadgeHolderKt.bindOrGone(getNotificationBadgeBV(), badge, actionHandler);
    }

    public final void bindPriceInfo(@NotNull PriceDTO price, BadgeDTO milesBadge) {
        Intrinsics.checkNotNullParameter(price, "price");
        PriceAtomHolderKt.bind$default(getPricePAV(), price, null, 2, null);
        BadgeHolderKt.bindOrGone$default(getMilesBadgeBV(), milesBadge, (Function1) null, 2, (Object) null);
    }

    public final void bindPromotionBadges(boolean hasBadges, @NotNull List<BadgeDTO> promotionBadges) {
        Intrinsics.checkNotNullParameter(promotionBadges, "promotionBadges");
        this.promotionBadgesHAL.setVisibility(hasBadges ? 0 : 8);
        AtomsAdapter atomsAdapter = this.badgesAdapter;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, promotionBadges);
    }

    public final void bindServices(boolean isVisible, @NotNull List<IconButtonV3DTO> services) {
        Intrinsics.checkNotNullParameter(services, "services");
        this.servicesHAL.setVisibility(isVisible ? 0 : 8);
        AtomsAdapter atomsAdapter = this.servicesAdapter;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, services);
    }

    public final void bindTimeInfo(@NotNull TravelRailwaySearchResultsV3TrainVO.TimeInfo timeInfo) {
        Intrinsics.checkNotNullParameter(timeInfo, "timeInfo");
        TextHolderKt.bind$default(getTravelTimeTAV(), timeInfo.getTravelTime(), null, 2, null);
        TextHolderKt.bind$default(getTravelTimeCaptionTAV(), timeInfo.getTravelTimeCaption(), null, 2, null);
        TextHolderKt.bind$default(getDepartureArrivalTimesTAV(), timeInfo.getDepartureArrivalTimes(), null, 2, null);
        TextHolderKt.bindOrGone$default(getDayDifferenceTAV(), timeInfo.getDayDifference(), null, 2, null);
    }

    public final void bindTrainInfo(@NotNull TravelRailwaySearchResultsV3TrainVO.TrainInfo trainInfo, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(trainInfo, "trainInfo");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        IconHolderKt.bindOrGone$default(getTrainIconIV(), trainInfo.getTrainIcon(), null, 2, null);
        TextHolderKt.bind(getTrainNameTAV(), trainInfo.getTrainName(), actionHandler);
        BadgeHolderKt.bindOrGone$default(getRouteBadge(), trainInfo.getRoute(), (Function1) null, 2, (Object) null);
        TextHolderKt.bindOrGone$default(getDepartureStationTAV(), trainInfo.getDepartureStation(), null, 2, null);
        TextHolderKt.bindOrGone$default(getArrivalStationTAV(), trainInfo.getArrivalStation(), null, 2, null);
    }

    @NotNull
    public final View getOnboardingView() {
        return getPricePAV();
    }

    public final void setupView(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull RecyclerView.u viewPool) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(viewPool, "viewPool");
        this.badgesAdapter.setOnAction(actionHandler);
        this.servicesAdapter.setOnAction(actionHandler);
        this.carriageTypesRV.setRecycledViewPool(viewPool);
    }
}
