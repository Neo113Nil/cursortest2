package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.multiFrameBinding;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.TravelRailwaySearchResultsV3TrainVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.multiFrameBinding.ViewHolderLifecycle;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.view.RailwaySearchResultsV3TrainView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u0015\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR$\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/multiFrameBinding/TravelRailwaySearchResultsV3ViewStateBinder;", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/multiFrameBinding/ViewHolderLifecycle;", "<init>", "()V", "", "bindPromotionBadges", "bindTrainInfo", "bindTimeInfo", "bindNotificationBadge", "bindServices", "bindCarriageTypes", "bindPriceInfo", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/view/RailwaySearchResultsV3TrainView;", "itemView", "init", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/view/RailwaySearchResultsV3TrainView;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO;", "vo", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "prepare", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO;Lkotlin/jvm/functions/Function1;)V", "item", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/view/RailwaySearchResultsV3TrainView;", "Lkotlin/jvm/functions/Function1;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySearchResultsV3ViewStateBinder implements ViewHolderLifecycle {
    private Function1<? super AtomAction, Unit> actionHandler;
    private TravelRailwaySearchResultsV3TrainVO item;
    private RailwaySearchResultsV3TrainView itemView;

    public void bindCarriageTypes() {
        RailwaySearchResultsV3TrainView railwaySearchResultsV3TrainView;
        TravelRailwaySearchResultsV3TrainVO travelRailwaySearchResultsV3TrainVO = this.item;
        if (travelRailwaySearchResultsV3TrainVO == null || (railwaySearchResultsV3TrainView = this.itemView) == null) {
            return;
        }
        railwaySearchResultsV3TrainView.bindCarriageTypes(travelRailwaySearchResultsV3TrainVO.getCarriageTypes());
    }

    public void bindNotificationBadge() {
        Function1<? super AtomAction, Unit> function1;
        RailwaySearchResultsV3TrainView railwaySearchResultsV3TrainView;
        TravelRailwaySearchResultsV3TrainVO travelRailwaySearchResultsV3TrainVO = this.item;
        if (travelRailwaySearchResultsV3TrainVO == null || (function1 = this.actionHandler) == null || (railwaySearchResultsV3TrainView = this.itemView) == null) {
            return;
        }
        railwaySearchResultsV3TrainView.bindNotificationBadge(travelRailwaySearchResultsV3TrainVO.getNotificationBadge(), function1);
    }

    public void bindPriceInfo() {
        RailwaySearchResultsV3TrainView railwaySearchResultsV3TrainView;
        TravelRailwaySearchResultsV3TrainVO travelRailwaySearchResultsV3TrainVO = this.item;
        if (travelRailwaySearchResultsV3TrainVO == null || (railwaySearchResultsV3TrainView = this.itemView) == null) {
            return;
        }
        railwaySearchResultsV3TrainView.bindPriceInfo(travelRailwaySearchResultsV3TrainVO.getPrice(), travelRailwaySearchResultsV3TrainVO.getMilesBadge());
    }

    public void bindPromotionBadges() {
        RailwaySearchResultsV3TrainView railwaySearchResultsV3TrainView;
        TravelRailwaySearchResultsV3TrainVO travelRailwaySearchResultsV3TrainVO = this.item;
        if (travelRailwaySearchResultsV3TrainVO == null || (railwaySearchResultsV3TrainView = this.itemView) == null) {
            return;
        }
        railwaySearchResultsV3TrainView.bindPromotionBadges(travelRailwaySearchResultsV3TrainVO.getHasBadges(), travelRailwaySearchResultsV3TrainVO.getPromotionBadges());
    }

    public void bindServices() {
        RailwaySearchResultsV3TrainView railwaySearchResultsV3TrainView;
        TravelRailwaySearchResultsV3TrainVO travelRailwaySearchResultsV3TrainVO = this.item;
        if (travelRailwaySearchResultsV3TrainVO == null || (railwaySearchResultsV3TrainView = this.itemView) == null) {
            return;
        }
        railwaySearchResultsV3TrainView.bindServices(travelRailwaySearchResultsV3TrainVO.getIsServiceVisible(), travelRailwaySearchResultsV3TrainVO.getServices());
    }

    public void bindTimeInfo() {
        RailwaySearchResultsV3TrainView railwaySearchResultsV3TrainView;
        TravelRailwaySearchResultsV3TrainVO travelRailwaySearchResultsV3TrainVO = this.item;
        if (travelRailwaySearchResultsV3TrainVO == null || (railwaySearchResultsV3TrainView = this.itemView) == null) {
            return;
        }
        railwaySearchResultsV3TrainView.bindTimeInfo(travelRailwaySearchResultsV3TrainVO.getTimeInfo());
    }

    public void bindTrainInfo() {
        Function1<? super AtomAction, Unit> function1;
        RailwaySearchResultsV3TrainView railwaySearchResultsV3TrainView;
        TravelRailwaySearchResultsV3TrainVO travelRailwaySearchResultsV3TrainVO = this.item;
        if (travelRailwaySearchResultsV3TrainVO == null || (function1 = this.actionHandler) == null || (railwaySearchResultsV3TrainView = this.itemView) == null) {
            return;
        }
        railwaySearchResultsV3TrainView.bindTrainInfo(travelRailwaySearchResultsV3TrainVO.getTrainInfo(), function1);
    }

    public final void init(@NotNull RailwaySearchResultsV3TrainView itemView) {
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

    public final void prepare(@NotNull TravelRailwaySearchResultsV3TrainVO vo, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.item = vo;
        this.actionHandler = actionHandler;
    }
}
