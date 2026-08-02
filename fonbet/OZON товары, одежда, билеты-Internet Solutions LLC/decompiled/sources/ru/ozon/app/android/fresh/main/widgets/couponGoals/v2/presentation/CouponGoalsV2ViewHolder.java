package ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.presentation;

import Pc.a;
import W10.c;
import WZ.l;
import WZ.t;
import androidx.core.view.G;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7740w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.mapper.CouponGoalsV2VO;
import ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.presentation.adapter.CouponGoalItemsAdapter;
import ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.presentation.adapter.CouponGoalItemsAdapterFactory;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 42\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00014B9\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a2\u000e\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00130*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/presentation/CouponGoalsV2ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/mapper/CouponGoalsV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroidx/recyclerview/widget/RecyclerView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LPc/a;", "Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/presentation/adapter/CouponGoalItemsAdapterFactory;", "couponsAdapterFactory", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;LVg/d;LPc/a;)V", "item", "", "setupRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/mapper/CouponGoalsV2VO;)V", "", "isSingleCoupon", "()Z", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/mapper/CouponGoalsV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/mapper/CouponGoalsV2VO;Ll20/d;)V", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "widgetInfo", "Ll20/d;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/presentation/adapter/CouponGoalItemsAdapter;", "couponsAdapter", "Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/presentation/adapter/CouponGoalItemsAdapter;", "Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/presentation/CouponGoalItemDecoration;", "itemDecor", "Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/presentation/CouponGoalItemDecoration;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CouponGoalsV2ViewHolder extends k<CouponGoalsV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final RecyclerView containerView;

    @NotNull
    private final CouponGoalItemsAdapter couponsAdapter;

    @NotNull
    private final CouponGoalItemDecoration itemDecor;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;
    private d widgetInfo;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int ITEM_SPACING = ResourceExtKt.toPx(8);
    private static final int EDGE_SPACING = ResourceExtKt.toPx(16);
    private static final int VERTICAL_SPACING = ResourceExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/presentation/CouponGoalsV2ViewHolder$Companion;", "", "<init>", "()V", "", "COUPON_GOALS_V2_LOCATOR", "Ljava/lang/String;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CouponGoalsV2ViewHolder(@NotNull RecyclerView containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull Vg.d customActionHandlersStoreFactory, @NotNull a<CouponGoalItemsAdapterFactory> couponsAdapterFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(couponsAdapterFactory, "couponsAdapterFactory");
        this.containerView = containerView;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new CouponGoalsV2ViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        this.couponsAdapter = couponsAdapterFactory.get().create(this, refs, new CouponGoalsV2ViewHolder$couponsAdapter$1(new C7740w(this) { // from class: ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.presentation.CouponGoalsV2ViewHolder$couponsAdapter$2
            @Override // kotlin.reflect.n
            public Object get() {
                d dVar;
                dVar = ((CouponGoalsV2ViewHolder) this.receiver).widgetInfo;
                return dVar;
            }

            @Override // kotlin.reflect.j
            public void set(Object obj) {
                ((CouponGoalsV2ViewHolder) this.receiver).widgetInfo = (d) obj;
            }
        }), buildHandler, new CouponGoalsV2ViewHolder$couponsAdapter$3(this));
        this.itemDecor = new CouponGoalItemDecoration(ITEM_SPACING, EDGE_SPACING, VERTICAL_SPACING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSingleCoupon() {
        List<CouponGoalsV2VO.CouponGoalItemVO> items;
        CouponGoalsV2VO boundedData = getBoundedData();
        return ((boundedData == null || (items = boundedData.getItems()) == null) ? 0 : items.size()) < 2;
    }

    private final void setupRecyclerView(RecyclerView recyclerView, CouponGoalsV2VO couponGoalsV2VO) {
        this.itemDecor.setSeveralItems(couponGoalsV2VO.getItems().size() > 1);
        recyclerView.addItemDecoration(this.itemDecor);
        recyclerView.setAdapter(this.couponsAdapter);
        this.couponsAdapter.submitList(couponGoalsV2VO.getItems());
        recyclerView.setOverScrollMode(isSingleCoupon() ? 2 : 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CouponGoalsV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.widgetInfo = info;
        final RecyclerView recyclerView = this.containerView;
        G.a(recyclerView, new Runnable() { // from class: ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.presentation.CouponGoalsV2ViewHolder$bind$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                RecyclerView recyclerView2;
                recyclerView2 = this.containerView;
                recyclerView2.setContentDescription("couponGoalsV2");
            }
        });
        setupRecyclerView(this.containerView, item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CouponGoalsV2VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((CouponGoalsV2ViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
