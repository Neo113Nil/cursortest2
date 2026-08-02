package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train.multiFrameBinding;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train.TravelRailwaySearchResultsV4TrainVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train.multiFrameBinding.ViewHolderLifecycle;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.view.TravelRailwaySearchResultsV4TrainView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u0015\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR$\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/multiFrameBinding/TravelRailwaySearchResultsV4ViewStateBinder;", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/multiFrameBinding/ViewHolderLifecycle;", "<init>", "()V", "", "bindPromotionBadges", "bindTrainSummary", "bindTimeInfo", "bindRouteInfo", "bindNotificationBadge", "bindServices", "bindCarriageTypes", "bindPriceInfo", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/view/TravelRailwaySearchResultsV4TrainView;", "itemView", "init", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/view/TravelRailwaySearchResultsV4TrainView;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO;", "vo", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "prepare", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO;Lkotlin/jvm/functions/Function1;)V", "item", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/view/TravelRailwaySearchResultsV4TrainView;", "Lkotlin/jvm/functions/Function1;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySearchResultsV4ViewStateBinder implements ViewHolderLifecycle {
    private Function1<? super AtomAction, Unit> actionHandler;
    private TravelRailwaySearchResultsV4TrainVO item;
    private TravelRailwaySearchResultsV4TrainView itemView;

    public void bindCarriageTypes() {
        TravelRailwaySearchResultsV4TrainView travelRailwaySearchResultsV4TrainView;
        TravelRailwaySearchResultsV4TrainVO travelRailwaySearchResultsV4TrainVO = this.item;
        if (travelRailwaySearchResultsV4TrainVO == null || (travelRailwaySearchResultsV4TrainView = this.itemView) == null) {
            return;
        }
        travelRailwaySearchResultsV4TrainView.bindCarriageTypes(travelRailwaySearchResultsV4TrainVO.getCarriageTypes(), travelRailwaySearchResultsV4TrainVO.getIsCarriageTypesVisible());
    }

    public void bindNotificationBadge() {
        Function1<? super AtomAction, Unit> function1;
        TravelRailwaySearchResultsV4TrainView travelRailwaySearchResultsV4TrainView;
        TravelRailwaySearchResultsV4TrainVO travelRailwaySearchResultsV4TrainVO = this.item;
        if (travelRailwaySearchResultsV4TrainVO == null || (function1 = this.actionHandler) == null || (travelRailwaySearchResultsV4TrainView = this.itemView) == null) {
            return;
        }
        travelRailwaySearchResultsV4TrainView.bindNotificationBadge(travelRailwaySearchResultsV4TrainVO.getNotificationBadge(), function1);
    }

    public void bindPriceInfo() {
        TravelRailwaySearchResultsV4TrainView travelRailwaySearchResultsV4TrainView;
        TravelRailwaySearchResultsV4TrainVO travelRailwaySearchResultsV4TrainVO = this.item;
        if (travelRailwaySearchResultsV4TrainVO == null || (travelRailwaySearchResultsV4TrainView = this.itemView) == null) {
            return;
        }
        travelRailwaySearchResultsV4TrainView.bindPriceInfo(travelRailwaySearchResultsV4TrainVO.getPrice(), travelRailwaySearchResultsV4TrainVO.getMilesBadge());
    }

    public void bindPromotionBadges() {
        TravelRailwaySearchResultsV4TrainView travelRailwaySearchResultsV4TrainView;
        TravelRailwaySearchResultsV4TrainVO travelRailwaySearchResultsV4TrainVO = this.item;
        if (travelRailwaySearchResultsV4TrainVO == null || (travelRailwaySearchResultsV4TrainView = this.itemView) == null) {
            return;
        }
        travelRailwaySearchResultsV4TrainView.bindPromotionBadges(travelRailwaySearchResultsV4TrainVO.getHasBadges(), travelRailwaySearchResultsV4TrainVO.getPromotionBadges());
    }

    public void bindRouteInfo() {
        TravelRailwaySearchResultsV4TrainView travelRailwaySearchResultsV4TrainView;
        TravelRailwaySearchResultsV4TrainVO travelRailwaySearchResultsV4TrainVO = this.item;
        if (travelRailwaySearchResultsV4TrainVO == null || (travelRailwaySearchResultsV4TrainView = this.itemView) == null) {
            return;
        }
        travelRailwaySearchResultsV4TrainView.bindRouteInfo(travelRailwaySearchResultsV4TrainVO.getRouteInfo(), travelRailwaySearchResultsV4TrainVO.getIsRouteInfoVisible());
    }

    public void bindServices() {
        TravelRailwaySearchResultsV4TrainView travelRailwaySearchResultsV4TrainView;
        TravelRailwaySearchResultsV4TrainVO travelRailwaySearchResultsV4TrainVO = this.item;
        if (travelRailwaySearchResultsV4TrainVO == null || (travelRailwaySearchResultsV4TrainView = this.itemView) == null) {
            return;
        }
        travelRailwaySearchResultsV4TrainView.bindServices(travelRailwaySearchResultsV4TrainVO.getIsServiceVisible(), travelRailwaySearchResultsV4TrainVO.getServices());
    }

    public void bindTimeInfo() {
        TravelRailwaySearchResultsV4TrainView travelRailwaySearchResultsV4TrainView;
        TravelRailwaySearchResultsV4TrainVO travelRailwaySearchResultsV4TrainVO = this.item;
        if (travelRailwaySearchResultsV4TrainVO == null || (travelRailwaySearchResultsV4TrainView = this.itemView) == null) {
            return;
        }
        travelRailwaySearchResultsV4TrainView.bindTimeInfo(travelRailwaySearchResultsV4TrainVO.getTimeInfo());
    }

    public void bindTrainSummary() {
        Function1<? super AtomAction, Unit> function1;
        TravelRailwaySearchResultsV4TrainView travelRailwaySearchResultsV4TrainView;
        TravelRailwaySearchResultsV4TrainVO travelRailwaySearchResultsV4TrainVO = this.item;
        if (travelRailwaySearchResultsV4TrainVO == null || (function1 = this.actionHandler) == null || (travelRailwaySearchResultsV4TrainView = this.itemView) == null) {
            return;
        }
        travelRailwaySearchResultsV4TrainView.bindTrainSummary(travelRailwaySearchResultsV4TrainVO.getSummary(), function1);
    }

    public final void init(@NotNull TravelRailwaySearchResultsV4TrainView itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.itemView = itemView;
    }

    public void onAttach() {
        ViewHolderLifecycle.DefaultImpls.onAttach(this);
    }

    public void onDetach() {
        ViewHolderLifecycle.DefaultImpls.onDetach(this);
    }

    public void onOffscreenPositionChanged(float f7) {
        ViewHolderLifecycle.DefaultImpls.onOffscreenPositionChanged(this, f7);
    }

    public void onRecycle() {
        ViewHolderLifecycle.DefaultImpls.onRecycle(this);
    }

    public final void prepare(@NotNull TravelRailwaySearchResultsV4TrainVO vo, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.item = vo;
        this.actionHandler = actionHandler;
    }
}
