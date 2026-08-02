package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.multiFrameBinding;

import EX.a;
import Go.b;
import Go.c;
import androidx.recyclerview.widget.RecyclerView;
import cT.C5784a;
import cT.C5785b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.TravelRailwaySearchResultsV3TrainVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.view.RailwaySearchResultsV3TrainView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ)\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\r0\u0018¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/multiFrameBinding/TravelRailwaySearchResultsV3MultiFrameBindDelegate;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/multiFrameBinding/ViewHolderLifecycle;", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/multiFrameBinding/TravelRailwaySearchResultsV3ViewStateBinder;", "viewStateBinder", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/view/RailwaySearchResultsV3TrainView;", "itemView", "<init>", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/multiFrameBinding/TravelRailwaySearchResultsV3ViewStateBinder;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/view/RailwaySearchResultsV3TrainView;)V", "", "onAttach", "()V", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "onDetach", "onRecycle", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO;", "vo", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/multiFrameBinding/TravelRailwaySearchResultsV3ViewStateBinder;", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "bindSteps", "Ljava/util/List;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySearchResultsV3MultiFrameBindDelegate implements ViewHolderLifecycle {

    @NotNull
    private final List<BindStep> bindSteps;

    @NotNull
    private final FrameBinder frameBinder;

    @NotNull
    private final TravelRailwaySearchResultsV3ViewStateBinder viewStateBinder;

    public TravelRailwaySearchResultsV3MultiFrameBindDelegate(@NotNull TravelRailwaySearchResultsV3ViewStateBinder viewStateBinder, @NotNull FrameBinder frameBinder, RecyclerView recyclerView, @NotNull RailwaySearchResultsV3TrainView itemView) {
        Intrinsics.checkNotNullParameter(viewStateBinder, "viewStateBinder");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.viewStateBinder = viewStateBinder;
        this.frameBinder = frameBinder;
        int i11 = 2;
        int i12 = 1;
        this.bindSteps = C7714v.b0(new b(this, i11), new c(this, i11), new a(this, i12), new EX.b(this, i12), new C5784a(this, i12), new C5785b(this, i12), new cT.c(this, i11));
        frameBinder.init(itemView);
        frameBinder.applyRecycler(recyclerView);
        viewStateBinder.init(itemView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindSteps$lambda$0(TravelRailwaySearchResultsV3MultiFrameBindDelegate travelRailwaySearchResultsV3MultiFrameBindDelegate) {
        travelRailwaySearchResultsV3MultiFrameBindDelegate.viewStateBinder.bindTrainInfo();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindSteps$lambda$1(TravelRailwaySearchResultsV3MultiFrameBindDelegate travelRailwaySearchResultsV3MultiFrameBindDelegate) {
        travelRailwaySearchResultsV3MultiFrameBindDelegate.viewStateBinder.bindTimeInfo();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindSteps$lambda$2(TravelRailwaySearchResultsV3MultiFrameBindDelegate travelRailwaySearchResultsV3MultiFrameBindDelegate) {
        travelRailwaySearchResultsV3MultiFrameBindDelegate.viewStateBinder.bindNotificationBadge();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindSteps$lambda$3(TravelRailwaySearchResultsV3MultiFrameBindDelegate travelRailwaySearchResultsV3MultiFrameBindDelegate) {
        travelRailwaySearchResultsV3MultiFrameBindDelegate.viewStateBinder.bindCarriageTypes();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindSteps$lambda$4(TravelRailwaySearchResultsV3MultiFrameBindDelegate travelRailwaySearchResultsV3MultiFrameBindDelegate) {
        travelRailwaySearchResultsV3MultiFrameBindDelegate.viewStateBinder.bindServices();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindSteps$lambda$5(TravelRailwaySearchResultsV3MultiFrameBindDelegate travelRailwaySearchResultsV3MultiFrameBindDelegate) {
        travelRailwaySearchResultsV3MultiFrameBindDelegate.viewStateBinder.bindPromotionBadges();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindSteps$lambda$6(TravelRailwaySearchResultsV3MultiFrameBindDelegate travelRailwaySearchResultsV3MultiFrameBindDelegate) {
        travelRailwaySearchResultsV3MultiFrameBindDelegate.viewStateBinder.bindPriceInfo();
        return Unit.f71690a;
    }

    public final void bind(@NotNull TravelRailwaySearchResultsV3TrainVO vo, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TravelRailwaySearchResultsV3ViewStateBinder travelRailwaySearchResultsV3ViewStateBinder = this.viewStateBinder;
        travelRailwaySearchResultsV3ViewStateBinder.prepare(vo, actionHandler);
        travelRailwaySearchResultsV3ViewStateBinder.bindCarriageTypes();
        this.frameBinder.bind(this.bindSteps, vo.getViewItemKey());
    }

    public void onAttach() {
        this.frameBinder.onAttach(new TravelRailwaySearchResultsV3MultiFrameBindDelegate$onAttach$1(this.viewStateBinder));
    }

    public void onDetach() {
        this.frameBinder.onDetach();
        this.viewStateBinder.onDetach();
    }

    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        this.frameBinder.onOffscreenPositionChanged(offscreenOffsetPercent);
        this.viewStateBinder.onOffscreenPositionChanged(offscreenOffsetPercent);
    }

    public void onRecycle() {
        this.frameBinder.onRecycle();
        this.viewStateBinder.onRecycle();
    }
}
