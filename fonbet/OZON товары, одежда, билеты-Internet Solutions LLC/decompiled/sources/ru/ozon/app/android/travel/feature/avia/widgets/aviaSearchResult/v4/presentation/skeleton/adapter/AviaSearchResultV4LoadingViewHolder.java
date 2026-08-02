package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.skeleton.adapter;

import android.graphics.Rect;
import android.view.View;
import fd.InterfaceC6511n;
import java.util.List;
import java.util.Map;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4FlightVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4ListItemVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view.AviaSearchResultV4FlightView;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view.AviaSearchResultV4Payload;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%Bc\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\t\u0012\u001e\u0010\u0010\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R,\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R,\u0010\u0010\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/skeleton/adapter/AviaSearchResultV4LoadingViewHolder;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4ListItemVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/AviaSearchResultV4FlightView;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lkotlin/Function3;", "Landroid/view/View;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onBoardingCallback", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackViewEvent", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/AviaSearchResultV4FlightView;Lkotlin/jvm/functions/Function1;Lfd/n;Lkotlin/jvm/functions/Function1;)V", "item", "", "", "payloads", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4ListItemVO;Ljava/util/List;)V", "onViewInVisibleBounds", "()V", "Ljk0/q;", "info", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/AviaSearchResultV4FlightView;", "Lkotlin/jvm/functions/Function1;", "Lfd/n;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO;", "boundedData", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO;", "Companion", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV4LoadingViewHolder extends BaseViewHolder<AviaSearchResultV4ListItemVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private AviaSearchResultV4FlightVO boundedData;

    @NotNull
    private final InterfaceC6511n<View, View, OnBoardingDTO, Unit> onBoardingCallback;

    @NotNull
    private final Function1<Map<String, TokenizedTrackingInfo>, Unit> trackViewEvent;

    @NotNull
    private final AviaSearchResultV4FlightView view;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/skeleton/adapter/AviaSearchResultV4LoadingViewHolder$Companion;", "", "<init>", "()V", "FULL_VISIBLE_VIEW_PERCENT", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AviaSearchResultV4LoadingViewHolder(@NotNull AviaSearchResultV4FlightView view, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull InterfaceC6511n<? super View, ? super View, ? super OnBoardingDTO, Unit> onBoardingCallback, @NotNull Function1<? super Map<String, TokenizedTrackingInfo>, Unit> trackViewEvent) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onBoardingCallback, "onBoardingCallback");
        Intrinsics.checkNotNullParameter(trackViewEvent, "trackViewEvent");
        this.view = view;
        this.actionHandler = actionHandler;
        this.onBoardingCallback = onBoardingCallback;
        this.trackViewEvent = trackViewEvent;
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder
    public /* bridge */ /* synthetic */ void bind(AviaSearchResultV4ListItemVO aviaSearchResultV4ListItemVO, List list) {
        bind2(aviaSearchResultV4ListItemVO, (List<? extends Object>) list);
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        Map<String, TokenizedTrackingInfo> viewTrackingInfo;
        super.onViewInVisibleBounds();
        onVisibleAreaChanged(new q());
        AviaSearchResultV4FlightVO aviaSearchResultV4FlightVO = this.boundedData;
        if (aviaSearchResultV4FlightVO == null || (viewTrackingInfo = aviaSearchResultV4FlightVO.getViewTrackingInfo()) == null) {
            return;
        }
        this.trackViewEvent.invoke(viewTrackingInfo);
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        final OnBoardingDTO onboardingApp;
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        AviaSearchResultV4FlightVO aviaSearchResultV4FlightVO = this.boundedData;
        if (aviaSearchResultV4FlightVO == null || (onboardingApp = aviaSearchResultV4FlightVO.getOnboardingApp()) == null) {
            return;
        }
        AviaSearchResultV4FlightView aviaSearchResultV4FlightView = this.view;
        if (!aviaSearchResultV4FlightView.isLaidOut() || aviaSearchResultV4FlightView.isLayoutRequested()) {
            aviaSearchResultV4FlightView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.skeleton.adapter.AviaSearchResultV4LoadingViewHolder$onVisibleAreaChanged$lambda$3$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    AviaSearchResultV4LoadingViewHolder.this.view.getGlobalVisibleRect(new Rect());
                    if ((AviaSearchResultV4LoadingViewHolder.this.view.getMeasuredHeight() * AviaSearchResultV4LoadingViewHolder.this.view.getMeasuredWidth()) / (r1.height() * r1.width()) >= 1.0f) {
                        AviaSearchResultV4LoadingViewHolder.this.onBoardingCallback.invoke(AviaSearchResultV4LoadingViewHolder.this.view.getPricePAV(), AviaSearchResultV4LoadingViewHolder.this.view, onboardingApp);
                    }
                }
            });
            return;
        }
        this.view.getGlobalVisibleRect(new Rect());
        if ((this.view.getMeasuredHeight() * this.view.getMeasuredWidth()) / (r0.height() * r0.width()) >= 1.0f) {
            this.onBoardingCallback.invoke(this.view.getPricePAV(), this.view, onboardingApp);
        }
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull AviaSearchResultV4ListItemVO item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if ((item instanceof AviaSearchResultV4FlightVO ? (AviaSearchResultV4FlightVO) item : null) != null) {
            AviaSearchResultV4FlightVO aviaSearchResultV4FlightVO = (AviaSearchResultV4FlightVO) item;
            this.boundedData = aviaSearchResultV4FlightVO;
            if (payloads.isEmpty()) {
                this.view.bind(aviaSearchResultV4FlightVO, this.actionHandler);
                return;
            }
            for (Object obj : payloads) {
                if (obj == AviaSearchResultV4Payload.BACKGROUND) {
                    this.view.bindBackground(this.actionHandler, aviaSearchResultV4FlightVO.getCardClickAction(), aviaSearchResultV4FlightVO.getBackgroundColor(), aviaSearchResultV4FlightVO.getBorderColor());
                } else if (obj == AviaSearchResultV4Payload.BADGES) {
                    this.view.bindBadges(aviaSearchResultV4FlightVO.getBadges(), aviaSearchResultV4FlightVO.getIsBadgesVisible());
                } else if (obj == AviaSearchResultV4Payload.PRICE) {
                    this.view.bindPrice(aviaSearchResultV4FlightVO.getPrice(), aviaSearchResultV4FlightVO.getPremiumBadge());
                } else if (obj == AviaSearchResultV4Payload.AIRLINE) {
                    this.view.bindAirlineIcons(aviaSearchResultV4FlightVO.getAirlineIcons());
                    this.view.bindAirlineText(aviaSearchResultV4FlightVO.getAirlinesText());
                } else if (obj == AviaSearchResultV4Payload.LUGGAGE) {
                    this.view.bindLuggageText(aviaSearchResultV4FlightVO.getLuggageText());
                } else if (obj == AviaSearchResultV4Payload.THERE_DETAILS) {
                    this.view.bindThereDetails(aviaSearchResultV4FlightVO.getWayThereDetails());
                } else if (obj == AviaSearchResultV4Payload.BACK_DETAILS) {
                    this.view.bindBackDetails(aviaSearchResultV4FlightVO.getWayBackDetails());
                } else if (obj == AviaSearchResultV4Payload.ADDITIONAL_INFO) {
                    this.view.bindOrGoneAdditionalInfo(aviaSearchResultV4FlightVO.getAdditionalInfo());
                }
            }
        }
    }
}
