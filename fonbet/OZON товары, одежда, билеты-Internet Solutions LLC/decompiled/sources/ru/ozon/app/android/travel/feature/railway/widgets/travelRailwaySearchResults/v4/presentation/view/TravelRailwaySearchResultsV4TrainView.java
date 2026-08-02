package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.view;

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
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train.TravelRailwaySearchResultsV4TrainVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train.adapter.decoration.TravelRailwaySearchResultsV4TrainBadgesDecoration;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train.adapter.decoration.TravelRailwaySearchResultsV4TrainDecoration;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train.adapter.decoration.TravelRailwaySearchResultsV4TrainNamesDecoration;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train.adapter.decoration.TravelRailwaySearchResultsV4TrainServicesDecoration;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train.adapter.price.TravelRailwaySearchResultsV4TypePriceAdapter;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train.adapter.route.TravelRailwaySearchResultsV4RouteAdapter;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000ß\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b*\u0001L\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010#\u001a\u00020\u000b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00132\u0006\u0010\"\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$J+\u0010&\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u00142\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b&\u0010'J#\u0010*\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00112\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0013¢\u0006\u0004\b*\u0010\u0017J#\u0010.\u001a\u00020\u000b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00132\u0006\u0010-\u001a\u00020\u0011¢\u0006\u0004\b.\u0010$J\u001f\u00102\u001a\u00020\u000b2\u0006\u00100\u001a\u00020/2\b\u00101\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u000bH\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000bH\u0002¢\u0006\u0004\b6\u00105R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010;\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00109R\u0014\u0010<\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00109R\u0014\u0010=\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00109R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010FR\u0014\u0010H\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010FR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u001b\u0010]\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001b\u0010b\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010Z\u001a\u0004\b`\u0010aR\u001b\u0010e\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010Z\u001a\u0004\bd\u0010aR\u001b\u0010h\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010Z\u001a\u0004\bg\u0010aR\u0014\u0010j\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u001b\u0010p\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010Z\u001a\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010QR\u0014\u0010r\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010kR\u0014\u0010s\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u001b\u0010y\u001a\u00020u8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010Z\u001a\u0004\bw\u0010xR\u001b\u0010|\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010Z\u001a\u0004\b{\u0010o¨\u0006}"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/view/TravelRailwaySearchResultsV4TrainView;", "Lru/ozon/app/android/travel/utils/view/constraintLayoutWithBorder/ConstraintLayoutWithBorder;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/View;", "getOnboardingView", "()Landroid/view/View;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Landroidx/recyclerview/widget/RecyclerView$u;", "viewPool", "setupView", "(Lkotlin/jvm/functions/Function1;Landroidx/recyclerview/widget/RecyclerView$u;)V", "", "hasBadges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "promotionBadges", "bindPromotionBadges", "(ZLjava/util/List;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$TrainSummaryVO;", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "bindTrainSummary", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$TrainSummaryVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$TimeInfoVO;", "timeInfo", "bindTimeInfo", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$TimeInfoVO;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$RouteInfoVO;", "routeInfo", "isVisible", "bindRouteInfo", "(Ljava/util/List;Z)V", "badge", "bindNotificationBadge", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", ResultDTO.CONTENT_TYPE_SERVICES, "bindServices", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$CarriageTypeVO;", "carriageTypes", "isCarriageTypesVisible", "bindCarriageTypes", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "milesBadge", "bindPriceInfo", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "bindViews", "()V", "setConstrains", "", "dp1", "I", "dp4", "dp8", "dp12", "dp16", "", "dpf24", "F", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/adapter/price/TravelRailwaySearchResultsV4TypePriceAdapter;", "carriageTypesAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/adapter/price/TravelRailwaySearchResultsV4TypePriceAdapter;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "badgesAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "servicesAdapter", "namesAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/adapter/route/TravelRailwaySearchResultsV4RouteAdapter;", "routeAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/adapter/route/TravelRailwaySearchResultsV4RouteAdapter;", "ru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/view/TravelRailwaySearchResultsV4TrainView$touchListener$1", "touchListener", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/view/TravelRailwaySearchResultsV4TrainView$touchListener$1;", "Lru/ozon/app/android/atoms/af/layout/HorizontalAtomsLayout;", "promotionBadgesHAL", "Lru/ozon/app/android/atoms/af/layout/HorizontalAtomsLayout;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/view/TravelRailwaySearchResultsV4IconsView;", "trainIconIV", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/view/TravelRailwaySearchResultsV4IconsView;", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "trainNamesVAL", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "routeButtonBV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getRouteButtonBV", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "routeButtonBV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "travelTimeTAV$delegate", "getTravelTimeTAV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "travelTimeTAV", "departureArrivalTimesTAV$delegate", "getDepartureArrivalTimesTAV", "departureArrivalTimesTAV", "dayDifferenceTAV$delegate", "getDayDifferenceTAV", "dayDifferenceTAV", "Landroidx/recyclerview/widget/RecyclerView;", "routeInfoListRV", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "notificationBadgeBV$delegate", "getNotificationBadgeBV", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "notificationBadgeBV", "servicesHAL", "carriageTypesRV", "separatorV", "Landroid/view/View;", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "pricePAV$delegate", "getPricePAV", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "pricePAV", "milesBadgeBV$delegate", "getMilesBadgeBV", "milesBadgeBV", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySearchResultsV4TrainView extends ConstraintLayoutWithBorder {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(TravelRailwaySearchResultsV4TrainView.class, "routeButtonBV", "getRouteButtonBV()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", 0), C2438a.c(TravelRailwaySearchResultsV4TrainView.class, "travelTimeTAV", "getTravelTimeTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(TravelRailwaySearchResultsV4TrainView.class, "departureArrivalTimesTAV", "getDepartureArrivalTimesTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(TravelRailwaySearchResultsV4TrainView.class, "dayDifferenceTAV", "getDayDifferenceTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(TravelRailwaySearchResultsV4TrainView.class, "notificationBadgeBV", "getNotificationBadgeBV()Lru/ozon/uni/android/atom/badge/BadgeView;", 0), C2438a.c(TravelRailwaySearchResultsV4TrainView.class, "pricePAV", "getPricePAV()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", 0), C2438a.c(TravelRailwaySearchResultsV4TrainView.class, "milesBadgeBV", "getMilesBadgeBV()Lru/ozon/uni/android/atom/badge/BadgeView;", 0)};
    public static final int $stable = 8;

    @NotNull
    private final AtomsAdapter badgesAdapter;

    @NotNull
    private final TravelRailwaySearchResultsV4TypePriceAdapter carriageTypesAdapter;

    @NotNull
    private final RecyclerView carriageTypesRV;

    /* renamed from: dayDifferenceTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate dayDifferenceTAV;

    /* renamed from: departureArrivalTimesTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate departureArrivalTimesTAV;
    private final int dp1;
    private final int dp12;
    private final int dp16;
    private final int dp4;
    private final int dp8;
    private final float dpf24;

    /* renamed from: milesBadgeBV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate milesBadgeBV;

    @NotNull
    private final AtomsAdapter namesAdapter;

    /* renamed from: notificationBadgeBV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate notificationBadgeBV;

    /* renamed from: pricePAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate pricePAV;

    @NotNull
    private final HorizontalAtomsLayout promotionBadgesHAL;

    @NotNull
    private final TravelRailwaySearchResultsV4RouteAdapter routeAdapter;

    /* renamed from: routeButtonBV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate routeButtonBV;

    @NotNull
    private final RecyclerView routeInfoListRV;

    @NotNull
    private final View separatorV;

    @NotNull
    private final AtomsAdapter servicesAdapter;

    @NotNull
    private final HorizontalAtomsLayout servicesHAL;

    @NotNull
    private final TravelRailwaySearchResultsV4TrainView$touchListener$1 touchListener;

    @NotNull
    private final TravelRailwaySearchResultsV4IconsView trainIconIV;

    @NotNull
    private final VerticalAtomsLayout trainNamesVAL;

    /* renamed from: travelTimeTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate travelTimeTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.recyclerview.widget.RecyclerView$s, ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.view.TravelRailwaySearchResultsV4TrainView$touchListener$1] */
    public TravelRailwaySearchResultsV4TrainView(@NotNull Context context) {
        super(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(1, context);
        this.dp1 = px;
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp12 = ResourceExtKt.toPx(12, context);
        int px2 = ResourceExtKt.toPx(16, context);
        this.dp16 = px2;
        float pxF = ResourceExtKt.toPxF(24, context);
        this.dpf24 = pxF;
        TravelRailwaySearchResultsV4TypePriceAdapter travelRailwaySearchResultsV4TypePriceAdapter = new TravelRailwaySearchResultsV4TypePriceAdapter();
        this.carriageTypesAdapter = travelRailwaySearchResultsV4TypePriceAdapter;
        Map map = null;
        Map map2 = null;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, map2, map, null, 15, null);
        this.badgesAdapter = atomsAdapter;
        AtomsAdapter atomsAdapter2 = new AtomsAdapter(map2, map, 0 == true ? 1 : 0, null, 15, null);
        this.servicesAdapter = atomsAdapter2;
        AtomsAdapter atomsAdapter3 = new AtomsAdapter(map, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 15, null);
        this.namesAdapter = atomsAdapter3;
        TravelRailwaySearchResultsV4RouteAdapter travelRailwaySearchResultsV4RouteAdapter = new TravelRailwaySearchResultsV4RouteAdapter();
        this.routeAdapter = travelRailwaySearchResultsV4RouteAdapter;
        ?? r15 = new RecyclerView.s() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.view.TravelRailwaySearchResultsV4TrainView$touchListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.s
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e11) {
                Intrinsics.checkNotNullParameter(rv, "rv");
                Intrinsics.checkNotNullParameter(e11, "e");
                TravelRailwaySearchResultsV4TrainView.this.onTouchEvent(e11);
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
        this.touchListener = r15;
        HorizontalAtomsLayout horizontalAtomsLayout = new HorizontalAtomsLayout(context, null, 0, 6, null);
        horizontalAtomsLayout.setId(View.generateViewId());
        horizontalAtomsLayout.setLayoutParams(new ConstraintLayout.b(-2, -2));
        setMinHeight(ResourceExtKt.toPx(20, context));
        horizontalAtomsLayout.setAdapter(atomsAdapter);
        horizontalAtomsLayout.setDecorator(new TravelRailwaySearchResultsV4TrainBadgesDecoration(context));
        this.promotionBadgesHAL = horizontalAtomsLayout;
        TravelRailwaySearchResultsV4IconsView travelRailwaySearchResultsV4IconsView = new TravelRailwaySearchResultsV4IconsView(context);
        travelRailwaySearchResultsV4IconsView.setId(View.generateViewId());
        travelRailwaySearchResultsV4IconsView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.trainIconIV = travelRailwaySearchResultsV4IconsView;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setId(View.generateViewId());
        verticalAtomsLayout.setLayoutParams(new ConstraintLayout.b(0, -2));
        verticalAtomsLayout.setAdapter(atomsAdapter3);
        verticalAtomsLayout.setDecorator(new TravelRailwaySearchResultsV4TrainNamesDecoration(context));
        this.trainNamesVAL = verticalAtomsLayout;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.routeButtonBV = new PreCreationViewPoolDelegate(context2, N.b(ButtonV3View.class), new TravelRailwaySearchResultsV4TrainView$special$$inlined$preCreationViewPool$default$1(this), new TravelRailwaySearchResultsV4TrainView$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.travelTimeTAV = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new TravelRailwaySearchResultsV4TrainView$special$$inlined$preCreationViewPool$default$3(this), new TravelRailwaySearchResultsV4TrainView$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.departureArrivalTimesTAV = new PreCreationViewPoolDelegate(context4, N.b(TextAtomV2View.class), new TravelRailwaySearchResultsV4TrainView$special$$inlined$preCreationViewPool$default$5(this), new TravelRailwaySearchResultsV4TrainView$special$$inlined$preCreationViewPool$default$6());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.dayDifferenceTAV = new PreCreationViewPoolDelegate(context5, N.b(TextAtomV2View.class), new TravelRailwaySearchResultsV4TrainView$special$$inlined$preCreationViewPool$default$7(this), new TravelRailwaySearchResultsV4TrainView$special$$inlined$preCreationViewPool$default$8());
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(View.generateViewId());
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView.setAdapter(travelRailwaySearchResultsV4RouteAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.addItemDecoration(new TravelRailwaySearchResultsV4TrainDecoration(context));
        recyclerView.setItemAnimator(null);
        recyclerView.addOnItemTouchListener(r15);
        this.routeInfoListRV = recyclerView;
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        this.notificationBadgeBV = new PreCreationViewPoolDelegate(context6, N.b(BadgeView.class), new TravelRailwaySearchResultsV4TrainView$special$$inlined$preCreationViewPool$default$9(this), new TravelRailwaySearchResultsV4TrainView$special$$inlined$preCreationViewPool$default$10());
        HorizontalAtomsLayout horizontalAtomsLayout2 = new HorizontalAtomsLayout(context, null, 0, 6, null);
        horizontalAtomsLayout2.setId(View.generateViewId());
        horizontalAtomsLayout2.setLayoutParams(new ConstraintLayout.b(0, -2));
        horizontalAtomsLayout2.setAdapter(atomsAdapter2);
        horizontalAtomsLayout2.setDecorator(new TravelRailwaySearchResultsV4TrainServicesDecoration(context));
        this.servicesHAL = horizontalAtomsLayout2;
        RecyclerView recyclerView2 = new RecyclerView(context);
        recyclerView2.setId(View.generateViewId());
        recyclerView2.setNestedScrollingEnabled(false);
        recyclerView2.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView2.setAdapter(travelRailwaySearchResultsV4TypePriceAdapter);
        recyclerView2.setLayoutManager(new LinearLayoutManager(context));
        recyclerView2.addItemDecoration(new TravelRailwaySearchResultsV4TrainDecoration(context));
        recyclerView2.setItemAnimator(null);
        recyclerView2.addOnItemTouchListener(r15);
        this.carriageTypesRV = recyclerView2;
        View view = new View(context);
        view.setId(View.generateViewId());
        view.setLayoutParams(new ConstraintLayout.b(0, px));
        view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        this.separatorV = view;
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        this.pricePAV = new PreCreationViewPoolDelegate(context7, N.b(PriceAtomView.class), new TravelRailwaySearchResultsV4TrainView$special$$inlined$preCreationViewPool$default$11(this), new TravelRailwaySearchResultsV4TrainView$special$$inlined$preCreationViewPool$default$12());
        Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        this.milesBadgeBV = new PreCreationViewPoolDelegate(context8, N.b(BadgeView.class), new TravelRailwaySearchResultsV4TrainView$special$$inlined$preCreationViewPool$default$13(this), new TravelRailwaySearchResultsV4TrainView$special$$inlined$preCreationViewPool$default$14());
        setPadding(px2, px2, px2, px2);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setRadius(pxF);
        bindViews();
        setConstrains();
    }

    private final void bindViews() {
        addView(this.promotionBadgesHAL);
        addView(this.trainIconIV);
        addView(this.trainNamesVAL);
        addView(getRouteButtonBV());
        addView(getTravelTimeTAV());
        addView(getDepartureArrivalTimesTAV());
        addView(getDayDifferenceTAV());
        addView(this.routeInfoListRV);
        addView(getNotificationBadgeBV());
        addView(this.servicesHAL);
        addView(this.carriageTypesRV);
        addView(this.separatorV);
        addView(getPricePAV());
        addView(getMilesBadgeBV());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getDayDifferenceTAV() {
        return (TextAtomV2View) this.dayDifferenceTAV.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getDepartureArrivalTimesTAV() {
        return (TextAtomV2View) this.departureArrivalTimesTAV.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BadgeView getMilesBadgeBV() {
        return (BadgeView) this.milesBadgeBV.getValue(this, $$delegatedProperties[6]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BadgeView getNotificationBadgeBV() {
        return (BadgeView) this.notificationBadgeBV.getValue(this, $$delegatedProperties[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PriceAtomView getPricePAV() {
        return (PriceAtomView) this.pricePAV.getValue(this, $$delegatedProperties[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ButtonV3View getRouteButtonBV() {
        return (ButtonV3View) this.routeButtonBV.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getTravelTimeTAV() {
        return (TextAtomV2View) this.travelTimeTAV.getValue(this, $$delegatedProperties[1]);
    }

    private final void setConstrains() {
        ConstraintLayoutExtKt.updateConstraints(this, new TravelRailwaySearchResultsV4TrainView$setConstrains$1(this));
    }

    public final void bindCarriageTypes(@NotNull List<TravelRailwaySearchResultsV4TrainVO.CarriageTypeVO> carriageTypes, boolean isCarriageTypesVisible) {
        Intrinsics.checkNotNullParameter(carriageTypes, "carriageTypes");
        this.carriageTypesAdapter.submitList(carriageTypes);
        this.carriageTypesRV.setVisibility(isCarriageTypesVisible ? 0 : 8);
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

    public final void bindRouteInfo(@NotNull List<TravelRailwaySearchResultsV4TrainVO.RouteInfoVO> routeInfo, boolean isVisible) {
        Intrinsics.checkNotNullParameter(routeInfo, "routeInfo");
        this.routeInfoListRV.setVisibility(isVisible ? 0 : 8);
        this.routeAdapter.submitList(routeInfo);
    }

    public final void bindServices(boolean isVisible, @NotNull List<IconButtonV3DTO> services) {
        Intrinsics.checkNotNullParameter(services, "services");
        this.servicesHAL.setVisibility(isVisible ? 0 : 8);
        AtomsAdapter atomsAdapter = this.servicesAdapter;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, services);
    }

    public final void bindTimeInfo(@NotNull TravelRailwaySearchResultsV4TrainVO.TimeInfoVO timeInfo) {
        Intrinsics.checkNotNullParameter(timeInfo, "timeInfo");
        TextHolderKt.bind$default(getTravelTimeTAV(), timeInfo.getTravelTime(), null, 2, null);
        TextHolderKt.bind$default(getDepartureArrivalTimesTAV(), timeInfo.getDepartureArrivalTimes(), null, 2, null);
        TextHolderKt.bindOrGone$default(getDayDifferenceTAV(), timeInfo.getDayDifference(), null, 2, null);
    }

    public final void bindTrainSummary(@NotNull TravelRailwaySearchResultsV4TrainVO.TrainSummaryVO summary, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.trainIconIV.setIcons(summary.getTrainIcons());
        AtomsAdapter atomsAdapter = this.namesAdapter;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, summary.getTrainNames());
        ButtonV3HolderKt.bind(getRouteButtonBV(), summary.getRouteButton(), actionHandler);
        for (View view : ViewGroupExtKt.children(this.trainNamesVAL)) {
            TextAtomV2View textAtomV2View = view instanceof TextAtomV2View ? (TextAtomV2View) view : null;
            if (textAtomV2View != null) {
                textAtomV2View.setTextIsSelectable(false);
            }
        }
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
        this.namesAdapter.setOnAction(actionHandler);
        this.carriageTypesRV.setRecycledViewPool(viewPool);
        this.routeInfoListRV.setRecycledViewPool(viewPool);
    }
}
