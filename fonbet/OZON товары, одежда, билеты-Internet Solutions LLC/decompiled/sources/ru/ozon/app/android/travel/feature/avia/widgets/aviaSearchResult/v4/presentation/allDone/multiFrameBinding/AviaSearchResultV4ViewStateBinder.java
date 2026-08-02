package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.multiFrameBinding;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.multiFrameBinding.ViewHolderLifecycle;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4FlightVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view.AviaSearchResultV4FlightView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u0015\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR*\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015j\u0004\u0018\u0001`\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/allDone/multiFrameBinding/AviaSearchResultV4ViewStateBinder;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/allDone/multiFrameBinding/ViewHolderLifecycle;", "<init>", "()V", "", "bindBackground", "bindBadges", "bindPrice", "bindLuggageText", "bindAirlineIcons", "bindAirlineText", "bindThereDetails", "bindBackDetails", "bindAdditionalInfo", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/AviaSearchResultV4FlightView;", "itemView", "init", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/AviaSearchResultV4FlightView;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO;", "vo", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "prepare", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO;Lkotlin/jvm/functions/Function1;)V", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/AviaSearchResultV4FlightView;", "Lkotlin/jvm/functions/Function1;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV4ViewStateBinder implements ViewHolderLifecycle {
    private Function1<? super AtomAction, Unit> actionHandler;
    private AviaSearchResultV4FlightVO item;
    private AviaSearchResultV4FlightView itemView;

    public void bindAdditionalInfo() {
        AviaSearchResultV4FlightView aviaSearchResultV4FlightView;
        AviaSearchResultV4FlightVO aviaSearchResultV4FlightVO = this.item;
        if (aviaSearchResultV4FlightVO == null || (aviaSearchResultV4FlightView = this.itemView) == null) {
            return;
        }
        aviaSearchResultV4FlightView.bindOrGoneAdditionalInfo(aviaSearchResultV4FlightVO.getAdditionalInfo());
    }

    public void bindAirlineIcons() {
        AviaSearchResultV4FlightView aviaSearchResultV4FlightView;
        AviaSearchResultV4FlightVO aviaSearchResultV4FlightVO = this.item;
        if (aviaSearchResultV4FlightVO == null || (aviaSearchResultV4FlightView = this.itemView) == null) {
            return;
        }
        aviaSearchResultV4FlightView.bindAirlineIcons(aviaSearchResultV4FlightVO.getAirlineIcons());
    }

    public void bindAirlineText() {
        AviaSearchResultV4FlightView aviaSearchResultV4FlightView;
        AviaSearchResultV4FlightVO aviaSearchResultV4FlightVO = this.item;
        if (aviaSearchResultV4FlightVO == null || (aviaSearchResultV4FlightView = this.itemView) == null) {
            return;
        }
        aviaSearchResultV4FlightView.bindAirlineText(aviaSearchResultV4FlightVO.getAirlinesText());
    }

    public void bindBackDetails() {
        AviaSearchResultV4FlightView aviaSearchResultV4FlightView;
        AviaSearchResultV4FlightVO aviaSearchResultV4FlightVO = this.item;
        if (aviaSearchResultV4FlightVO == null || (aviaSearchResultV4FlightView = this.itemView) == null) {
            return;
        }
        aviaSearchResultV4FlightView.bindBackDetails(aviaSearchResultV4FlightVO.getWayBackDetails());
    }

    public void bindBackground() {
        AviaSearchResultV4FlightView aviaSearchResultV4FlightView;
        AviaSearchResultV4FlightVO aviaSearchResultV4FlightVO = this.item;
        if (aviaSearchResultV4FlightVO == null || (aviaSearchResultV4FlightView = this.itemView) == null) {
            return;
        }
        aviaSearchResultV4FlightView.bindBackground(this.actionHandler, aviaSearchResultV4FlightVO.getCardClickAction(), aviaSearchResultV4FlightVO.getBackgroundColor(), aviaSearchResultV4FlightVO.getBorderColor());
    }

    public void bindBadges() {
        AviaSearchResultV4FlightView aviaSearchResultV4FlightView;
        AviaSearchResultV4FlightVO aviaSearchResultV4FlightVO = this.item;
        if (aviaSearchResultV4FlightVO == null || (aviaSearchResultV4FlightView = this.itemView) == null) {
            return;
        }
        aviaSearchResultV4FlightView.bindBadges(aviaSearchResultV4FlightVO.getBadges(), aviaSearchResultV4FlightVO.getIsBadgesVisible());
    }

    public void bindLuggageText() {
        AviaSearchResultV4FlightView aviaSearchResultV4FlightView;
        AviaSearchResultV4FlightVO aviaSearchResultV4FlightVO = this.item;
        if (aviaSearchResultV4FlightVO == null || (aviaSearchResultV4FlightView = this.itemView) == null) {
            return;
        }
        aviaSearchResultV4FlightView.bindLuggageText(aviaSearchResultV4FlightVO.getLuggageText());
    }

    public void bindPrice() {
        AviaSearchResultV4FlightView aviaSearchResultV4FlightView;
        AviaSearchResultV4FlightVO aviaSearchResultV4FlightVO = this.item;
        if (aviaSearchResultV4FlightVO == null || (aviaSearchResultV4FlightView = this.itemView) == null) {
            return;
        }
        aviaSearchResultV4FlightView.bindPrice(aviaSearchResultV4FlightVO.getPrice(), aviaSearchResultV4FlightVO.getPremiumBadge());
    }

    public void bindThereDetails() {
        AviaSearchResultV4FlightView aviaSearchResultV4FlightView;
        AviaSearchResultV4FlightVO aviaSearchResultV4FlightVO = this.item;
        if (aviaSearchResultV4FlightVO == null || (aviaSearchResultV4FlightView = this.itemView) == null) {
            return;
        }
        aviaSearchResultV4FlightView.bindThereDetails(aviaSearchResultV4FlightVO.getWayThereDetails());
    }

    public final void init(@NotNull AviaSearchResultV4FlightView itemView) {
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

    public final void prepare(@NotNull AviaSearchResultV4FlightVO vo, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        AviaSearchResultV4FlightView aviaSearchResultV4FlightView = this.itemView;
        if (aviaSearchResultV4FlightView != null) {
            aviaSearchResultV4FlightView.bindActionHandler(actionHandler);
        }
        this.item = vo;
        this.actionHandler = actionHandler;
    }
}
