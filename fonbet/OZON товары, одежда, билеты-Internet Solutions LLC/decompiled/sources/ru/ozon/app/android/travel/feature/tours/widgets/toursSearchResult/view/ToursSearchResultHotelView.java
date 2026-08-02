package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.view;

import Il.a;
import WZ.l;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.R$layout;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultVO;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.adapter.images.ToursSearchResultItemImagesAdapter;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.adapter.images.ToursSearchResultItemImagesDecoration;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.travel.utils.utils.OnSnapPositionChangeListener;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 Q2\u00020\u0001:\u0001QB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ9\u0010\u0015\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u000ej\u0002`\u00102\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\bJ\r\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010%\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R\u0014\u0010&\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010'\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\"R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R*\u0010-\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000ej\u0004\u0018\u0001`\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u0010/\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010IR\u0014\u0010K\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010FR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010IR\u0014\u0010P\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010I¨\u0006R"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/view/ToursSearchResultHotelView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "addViews", "()V", "setConstraints", "setupRoot", "setupViews", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$HotelVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "analytics", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$HotelVO;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "Landroidx/recyclerview/widget/RecyclerView$u;", "recycledViewPool", "setRecycledViewPool", "(Landroidx/recyclerview/widget/RecyclerView$u;)V", "attachScrollListener", "detachScrollListener", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dsProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "", "dp4", "I", "dp6", "dp8", "dp12", "dp16", "dp164", "", "dpf20", "F", "boundedData", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$HotelVO;", "onAction", "Lkotlin/jvm/functions/Function1;", "tokenizedAnalytics", "LWZ/l;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "badgesAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "hotelFeaturesAdapter", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/adapter/images/ToursSearchResultItemImagesAdapter;", "imagesAdapter", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/adapter/images/ToursSearchResultItemImagesAdapter;", "Landroidx/recyclerview/widget/x;", "snapHelper", "Landroidx/recyclerview/widget/x;", "Lru/ozon/app/android/travel/utils/utils/OnSnapPositionChangeListener;", "onPositionChangeListener", "Lru/ozon/app/android/travel/utils/utils/OnSnapPositionChangeListener;", "Landroidx/recyclerview/widget/RecyclerView;", "galleryRV", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/tinkoff/scrollingpagerindicator/ScrollingPagerIndicator;", "dotsSPI", "Lru/tinkoff/scrollingpagerindicator/ScrollingPagerIndicator;", "Lru/ozon/uni/atoms/af/layout/HorizontalFlexAtomsLayout;", "badgesHFAL", "Lru/ozon/uni/atoms/af/layout/HorizontalFlexAtomsLayout;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTAV", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "descriptionTAV", "hotelFeaturesHFAL", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/view/ToursSearchResultOptionsListView;", "variantsLV", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/view/ToursSearchResultOptionsListView;", "priceTAV", "datesTAV", "Companion", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursSearchResultHotelView extends ConstraintLayout {

    @NotNull
    private final AtomsAdapter badgesAdapter;

    @NotNull
    private final HorizontalFlexAtomsLayout badgesHFAL;
    private ToursSearchResultVO.HotelVO boundedData;

    @NotNull
    private final TextAtomView datesTAV;

    @NotNull
    private final TextAtomView descriptionTAV;

    @NotNull
    private final ScrollingPagerIndicator dotsSPI;
    private final int dp12;
    private final int dp16;
    private final int dp164;
    private final int dp4;
    private final int dp6;
    private final int dp8;
    private final float dpf20;

    @NotNull
    private final DesignSystemDimensProvider dsProvider;

    @NotNull
    private final RecyclerView galleryRV;

    @NotNull
    private final AtomsAdapter hotelFeaturesAdapter;

    @NotNull
    private final HorizontalFlexAtomsLayout hotelFeaturesHFAL;

    @NotNull
    private final ToursSearchResultItemImagesAdapter imagesAdapter;
    private Function1<? super AtomAction, Unit> onAction;

    @NotNull
    private final OnSnapPositionChangeListener onPositionChangeListener;

    @NotNull
    private final TextAtomView priceTAV;

    @NotNull
    private final x snapHelper;

    @NotNull
    private final TextAtomView titleTAV;
    private l tokenizedAnalytics;

    @NotNull
    private final ToursSearchResultOptionsListView variantsLV;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/view/ToursSearchResultHotelView$Companion;", "", "<init>", "()V", "LOCATOR_ROOT_VIEW", "", "LOCATOR_GALLERY_VIEW", "LOCATOR_TITLE_VIEW", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ToursSearchResultHotelView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dsProvider = dimens$default;
        this.dp4 = dimens$default.getMargin4();
        this.dp6 = dimens$default.getMargin6();
        int margin8 = dimens$default.getMargin8();
        this.dp8 = margin8;
        this.dp12 = dimens$default.getMargin12();
        this.dp16 = dimens$default.getMargin16();
        int px = ResourceExtKt.toPx(164, context);
        this.dp164 = px;
        this.dpf20 = dimens$default.getRadius20();
        Map map = null;
        Map map2 = null;
        this.badgesAdapter = new AtomsAdapter(null, map, map2, null, 15, null);
        Object[] objArr = 0 == true ? 1 : 0;
        this.hotelFeaturesAdapter = new AtomsAdapter(map, map2, objArr, null, 15, null);
        this.imagesAdapter = new ToursSearchResultItemImagesAdapter(new ToursSearchResultHotelView$imagesAdapter$1(this));
        x xVar = new x();
        this.snapHelper = xVar;
        this.onPositionChangeListener = new OnSnapPositionChangeListener(xVar, 0, new ToursSearchResultHotelView$onPositionChangeListener$1(this));
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(View.generateViewId());
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, px));
        recyclerView.setClipToPadding(false);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setPadding(margin8, 0, margin8, 0);
        recyclerView.setItemAnimator(null);
        recyclerView.setContentDescription("toursSearchResultGalleryView");
        this.galleryRV = recyclerView;
        View inflate = ViewGroupExtKt.inflate(this, R$layout.view_tours_pager_indicator);
        Intrinsics.g(inflate, "null cannot be cast to non-null type ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator");
        ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) inflate;
        scrollingPagerIndicator.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41660x = 0;
        scrollingPagerIndicator.setLayoutParams(bVar);
        this.dotsSPI = scrollingPagerIndicator;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = new HorizontalFlexAtomsLayout(context, null, 0, 6, null);
        horizontalFlexAtomsLayout.setId(View.generateViewId());
        horizontalFlexAtomsLayout.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.badgesHFAL = horizontalFlexAtomsLayout;
        TextAtomView textAtomView = new TextAtomView(context, null, 0, 6, null);
        textAtomView.setId(View.generateViewId());
        textAtomView.setLayoutParams(new ConstraintLayout.b(0, -2));
        textAtomView.setContentDescription("toursSearchResultHotelTitleView");
        this.titleTAV = textAtomView;
        TextAtomView textAtomView2 = new TextAtomView(context, null, 0, 6, null);
        textAtomView2.setId(View.generateViewId());
        textAtomView2.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.descriptionTAV = textAtomView2;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout2 = new HorizontalFlexAtomsLayout(context, null, 0, 6, null);
        horizontalFlexAtomsLayout2.setId(View.generateViewId());
        horizontalFlexAtomsLayout2.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.hotelFeaturesHFAL = horizontalFlexAtomsLayout2;
        ToursSearchResultOptionsListView toursSearchResultOptionsListView = new ToursSearchResultOptionsListView(context, null, 0, 0, 14, null);
        toursSearchResultOptionsListView.setId(View.generateViewId());
        toursSearchResultOptionsListView.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.variantsLV = toursSearchResultOptionsListView;
        TextAtomView textAtomView3 = new TextAtomView(context, null, 0, 6, null);
        textAtomView3.setId(View.generateViewId());
        textAtomView3.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.priceTAV = textAtomView3;
        TextAtomView textAtomView4 = new TextAtomView(context, null, 0, 6, null);
        textAtomView4.setId(View.generateViewId());
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.f41616W = true;
        bVar2.f41598E = 0.0f;
        textAtomView4.setLayoutParams(bVar2);
        this.datesTAV = textAtomView4;
        addViews();
        setConstraints();
        setupRoot();
        setupViews();
        setContentDescription("toursSearchResultHotelView");
    }

    private final void addViews() {
        addView(this.galleryRV);
        addView(this.dotsSPI);
        addView(this.badgesHFAL);
        addView(this.titleTAV);
        addView(this.descriptionTAV);
        addView(this.hotelFeaturesHFAL);
        addView(this.variantsLV);
        addView(this.priceTAV);
        addView(this.datesTAV);
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new ToursSearchResultHotelView$setConstraints$1(this));
    }

    private final void setupRoot() {
        int i11 = this.dp16;
        setPadding(0, i11, 0, i11);
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackground(roundedBackgroundProducer.produce(ThemeExtKt.themeColor(context, R$attr.layerFloor1), this.dpf20));
        setClickable(true);
        setOnClickListener(new a(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupRoot$lambda$14(ToursSearchResultHotelView toursSearchResultHotelView, View view) {
        AtomAction selectAction;
        Function1<? super AtomAction, Unit> function1;
        ToursSearchResultVO.HotelVO hotelVO = toursSearchResultHotelView.boundedData;
        if (hotelVO == null || (selectAction = hotelVO.getSelectAction()) == null || (function1 = toursSearchResultHotelView.onAction) == null) {
            return;
        }
        function1.invoke(selectAction);
    }

    private final void setupViews() {
        RecyclerView recyclerView = this.galleryRV;
        recyclerView.setAdapter(this.imagesAdapter);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new ToursSearchResultItemImagesDecoration(context));
        recyclerView.setHasFixedSize(true);
        this.snapHelper.attachToRecyclerView(this.galleryRV);
        this.dotsSPI.d(this.galleryRV);
        this.badgesHFAL.setAdapter(this.badgesAdapter);
        this.hotelFeaturesHFAL.setAdapter(this.hotelFeaturesAdapter);
    }

    public final void attachScrollListener() {
        this.galleryRV.addOnScrollListener(this.onPositionChangeListener);
    }

    public final void bind(@NotNull ToursSearchResultVO.HotelVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l analytics) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.boundedData = item;
        this.onAction = actionHandler;
        this.tokenizedAnalytics = analytics;
        this.badgesHFAL.setVisibility(item.getIsBadgesVisible() ? 0 : 8);
        List<Badge> badges = item.getBadges();
        if (badges != null) {
            AtomsAdapter atomsAdapter = this.badgesAdapter;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            atomsAdapter.bind(context, badges);
        }
        TextAtomHolderKt.bind$default(this.titleTAV, item.getTitle(), null, 2, null);
        TextAtomHolderKt.bindOrGone$default(this.descriptionTAV, item.getDescription(), null, 2, null);
        this.hotelFeaturesHFAL.setVisibility(item.getIsHotelFeaturesVisible() ? 0 : 8);
        List<Badge> hotelFeatures = item.getHotelFeatures();
        if (hotelFeatures != null) {
            AtomsAdapter atomsAdapter2 = this.hotelFeaturesAdapter;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            atomsAdapter2.bind(context2, hotelFeatures);
        }
        this.variantsLV.bindOrGone(item.getTourOptions(), actionHandler);
        TextAtomHolderKt.bind$default(this.priceTAV, item.getPrice(), null, 2, null);
        TextAtomHolderKt.bind$default(this.datesTAV, item.getDates(), null, 2, null);
        this.onPositionChangeListener.resetPosition();
        this.imagesAdapter.setItems(item.getImages());
    }

    public final void detachScrollListener() {
        this.galleryRV.removeOnScrollListener(this.onPositionChangeListener);
    }

    public final void setRecycledViewPool(@NotNull RecyclerView.u recycledViewPool) {
        Intrinsics.checkNotNullParameter(recycledViewPool, "recycledViewPool");
        this.galleryRV.setRecycledViewPool(recycledViewPool);
    }
}
