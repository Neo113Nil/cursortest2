package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.o;
import Sc.r;
import Sc.s;
import Tg.b;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.domain.MatchShoppingCardsImagesPrefetcher;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.domain.MatchShoppingCardsInteractor;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.domain.RequestCardsResponse;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsVI;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsViewIntent;
import ru.ozon.app.android.pdp.ui.configurators.NotificationsKt;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;
import ru.ozon.app.android.uikit.utils.NotificationBarHelperKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.B0;
import xe.C10727i;
import z00.g;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 S2\u00020\u0001:\u0001SB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u0002*\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u001d\u0010\u001d\u001a\u00020\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000eH\u0014¢\u0006\u0004\b#\u0010\u0012J\u0015\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R0\u00101\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u000e\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R0\u00108\u001a\u0010\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u000e\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u00106R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n <*\u0004\u0018\u00010\u00140\u00140;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020K0N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI;", "initialWidgetState", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/domain/MatchShoppingCardsInteractor;", "matchShoppingCardsInteractor", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/domain/MatchShoppingCardsImagesPrefetcher;", "matchShoppingCardsImagePrefetcher", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "teensModeStorage", "<init>", "(Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI;Lru/ozon/app/android/monetization/widgets/matchShoppingCards/domain/MatchShoppingCardsInteractor;Lru/ozon/app/android/monetization/widgets/matchShoppingCards/domain/MatchShoppingCardsImagesPrefetcher;Lru/ozon/app/android/storage/teensMode/TeensModeStorage;)V", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/SwipeDirection;", "direction", "", "handleSwipeOutStart", "(Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/SwipeDirection;)V", "handleSwipeOutEnd", "()V", "handleSwipeAttempt", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Card;", "card", "withCardShareAction", "(Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI;Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Card;)Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI;", "loadMoreCardsIfNeeded", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "refreshWidget", "", "cards", "prefetchCardsImages", "(Ljava/util/List;)V", "", "error", "handleRequestError", "(Ljava/lang/Throwable;)V", "onCleared", "widgetState", "onUpdateWidgetState", "(Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI;)V", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsViewIntent;", "viewIntent", "onViewIntent", "(Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsViewIntent;)V", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/domain/MatchShoppingCardsInteractor;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/domain/MatchShoppingCardsImagesPrefetcher;", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "Lkotlin/Function1;", "LTg/b;", "onAtomAction", "Lkotlin/jvm/functions/Function1;", "getOnAtomAction", "()Lkotlin/jvm/functions/Function1;", "setOnAtomAction", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "onNotificationRequested", "getOnNotificationRequested", "setOnNotificationRequested", "Ljava/util/LinkedList;", "kotlin.jvm.PlatformType", "Ljava/util/LinkedList;", "", "isTeensModeEnabled", "Z", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "requestMoreCardsAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "Lxe/B0;", "currentSwipeAction", "Lxe/B0;", "", "nextCardSwipeAttempts", "I", "LAe/x0;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsViewState;", "mutableViewState", "LAe/x0;", "LAe/M0;", "viewState", "LAe/M0;", "getViewState", "()LAe/M0;", "Companion", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MatchShoppingCardsViewModel extends w0 {

    @NotNull
    private final LinkedList<MatchShoppingCardsVI.Card> cards;
    private B0 currentSwipeAction;

    @NotNull
    private MatchShoppingCardsVI initialWidgetState;
    private final boolean isTeensModeEnabled;

    @NotNull
    private final MatchShoppingCardsImagesPrefetcher matchShoppingCardsImagePrefetcher;

    @NotNull
    private final MatchShoppingCardsInteractor matchShoppingCardsInteractor;

    @NotNull
    private final x0<MatchShoppingCardsViewState> mutableViewState;
    private int nextCardSwipeAttempts;
    private Function1<? super b, Unit> onAtomAction;
    private Function1<? super NotificationDTO, Unit> onNotificationRequested;
    private AtomActionDTO requestMoreCardsAction;

    @NotNull
    private final TeensModeStorage teensModeStorage;

    @NotNull
    private final M0<MatchShoppingCardsViewState> viewState;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsViewModel$Companion;", "", "<init>", "()V", "NEXT_CARD_SWIPE_ATTEMPTS_LIMIT", "", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MatchShoppingCardsViewModel(@NotNull MatchShoppingCardsVI initialWidgetState, @NotNull MatchShoppingCardsInteractor matchShoppingCardsInteractor, @NotNull MatchShoppingCardsImagesPrefetcher matchShoppingCardsImagePrefetcher, @NotNull TeensModeStorage teensModeStorage) {
        Intrinsics.checkNotNullParameter(initialWidgetState, "initialWidgetState");
        Intrinsics.checkNotNullParameter(matchShoppingCardsInteractor, "matchShoppingCardsInteractor");
        Intrinsics.checkNotNullParameter(matchShoppingCardsImagePrefetcher, "matchShoppingCardsImagePrefetcher");
        Intrinsics.checkNotNullParameter(teensModeStorage, "teensModeStorage");
        this.initialWidgetState = initialWidgetState;
        this.matchShoppingCardsInteractor = matchShoppingCardsInteractor;
        this.matchShoppingCardsImagePrefetcher = matchShoppingCardsImagePrefetcher;
        this.teensModeStorage = teensModeStorage;
        LinkedList<MatchShoppingCardsVI.Card> linkedList = new LinkedList<>(this.initialWidgetState.getCards());
        this.cards = linkedList;
        boolean isTeensModeEnabled = teensModeStorage.isTeensModeEnabled();
        this.isTeensModeEnabled = isTeensModeEnabled;
        this.requestMoreCardsAction = this.initialWidgetState.getRequestCardsAction();
        x0<MatchShoppingCardsViewState> a11 = O0.a(new MatchShoppingCardsViewState(withCardShareAction(this.initialWidgetState, (MatchShoppingCardsVI.Card) C7714v.M(linkedList)), false, false, false, false, null, isTeensModeEnabled, 62, null));
        this.mutableViewState = a11;
        this.viewState = C2399j.b(a11);
        prefetchCardsImages(C7714v.D(linkedList, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRequestError(Throwable error) {
        Function1<? super NotificationDTO, Unit> function1 = this.onNotificationRequested;
        if (function1 != null) {
            function1.invoke(g.c(error) ? NotificationBarHelperKt.createNetworkErrorNotificationDTO$default(false, 1, null) : NotificationsKt.createUnknownErrorNotification());
        }
    }

    private final void handleSwipeAttempt() {
        int i11;
        Function1<? super NotificationDTO, Unit> function1;
        if (this.currentSwipeAction == null || (i11 = this.nextCardSwipeAttempts) >= 3) {
            return;
        }
        int i12 = i11 + 1;
        this.nextCardSwipeAttempts = i12;
        if (i12 != 3 || (function1 = this.onNotificationRequested) == null) {
            return;
        }
        function1.invoke(NotificationsKt.createUnknownErrorNotification());
    }

    private final void handleSwipeOutEnd() {
        MatchShoppingCardsViewState value;
        MatchShoppingCardsViewState matchShoppingCardsViewState;
        List K02;
        this.cards.removeFirst();
        x0<MatchShoppingCardsViewState> x0Var = this.mutableViewState;
        do {
            value = x0Var.getValue();
            matchShoppingCardsViewState = value;
            K02 = C7714v.K0(this.cards, 2);
        } while (!x0Var.b(value, MatchShoppingCardsViewState.copy$default(matchShoppingCardsViewState, withCardShareAction(matchShoppingCardsViewState.getWidgetState(), (MatchShoppingCardsVI.Card) C7714v.M(K02)), false, true, false, false, K02, false, 90, null)));
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new MatchShoppingCardsViewModel$handleSwipeOutEnd$2(this, null), 3);
    }

    private final void handleSwipeOutStart(SwipeDirection direction) {
        MatchShoppingCardsViewState value;
        x0<MatchShoppingCardsViewState> x0Var = this.mutableViewState;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, MatchShoppingCardsViewState.copy$default(value, null, false, false, false, false, null, false, 99, null)));
        this.currentSwipeAction = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new MatchShoppingCardsViewModel$handleSwipeOutStart$2(direction, this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadMoreCardsIfNeeded(d<? super Unit> dVar) {
        MatchShoppingCardsViewModel$loadMoreCardsIfNeeded$1 matchShoppingCardsViewModel$loadMoreCardsIfNeeded$1;
        int i11;
        Object mo809requestCardsgIAlus;
        MatchShoppingCardsViewModel matchShoppingCardsViewModel;
        Throwable b11;
        if (dVar instanceof MatchShoppingCardsViewModel$loadMoreCardsIfNeeded$1) {
            matchShoppingCardsViewModel$loadMoreCardsIfNeeded$1 = (MatchShoppingCardsViewModel$loadMoreCardsIfNeeded$1) dVar;
            int i12 = matchShoppingCardsViewModel$loadMoreCardsIfNeeded$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                matchShoppingCardsViewModel$loadMoreCardsIfNeeded$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = matchShoppingCardsViewModel$loadMoreCardsIfNeeded$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = matchShoppingCardsViewModel$loadMoreCardsIfNeeded$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    AtomActionDTO atomActionDTO = this.requestMoreCardsAction;
                    if (atomActionDTO != null) {
                        if (this.cards.size() > 2) {
                            atomActionDTO = null;
                        }
                        if (atomActionDTO != null) {
                            MatchShoppingCardsInteractor matchShoppingCardsInteractor = this.matchShoppingCardsInteractor;
                            matchShoppingCardsViewModel$loadMoreCardsIfNeeded$1.L$0 = this;
                            matchShoppingCardsViewModel$loadMoreCardsIfNeeded$1.label = 1;
                            mo809requestCardsgIAlus = matchShoppingCardsInteractor.mo809requestCardsgIAlus(atomActionDTO, matchShoppingCardsViewModel$loadMoreCardsIfNeeded$1);
                            if (mo809requestCardsgIAlus == aVar) {
                                return aVar;
                            }
                            matchShoppingCardsViewModel = this;
                        }
                    }
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                matchShoppingCardsViewModel = (MatchShoppingCardsViewModel) matchShoppingCardsViewModel$loadMoreCardsIfNeeded$1.L$0;
                s.b(obj);
                mo809requestCardsgIAlus = ((r) obj).getF26106a();
                b11 = r.b(mo809requestCardsgIAlus);
                if (b11 != null) {
                    RequestCardsResponse requestCardsResponse = (RequestCardsResponse) mo809requestCardsgIAlus;
                    if (!requestCardsResponse.getCards().isEmpty()) {
                        matchShoppingCardsViewModel.cards.addAll(requestCardsResponse.getCards());
                        matchShoppingCardsViewModel.requestMoreCardsAction = requestCardsResponse.getNextPageAction();
                        matchShoppingCardsViewModel.prefetchCardsImages(requestCardsResponse.getCards());
                    }
                } else {
                    matchShoppingCardsViewModel.handleRequestError(b11);
                }
                return Unit.f71690a;
            }
        }
        matchShoppingCardsViewModel$loadMoreCardsIfNeeded$1 = new MatchShoppingCardsViewModel$loadMoreCardsIfNeeded$1(this, dVar);
        Object obj2 = matchShoppingCardsViewModel$loadMoreCardsIfNeeded$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = matchShoppingCardsViewModel$loadMoreCardsIfNeeded$1.label;
        if (i11 != 0) {
        }
        b11 = r.b(mo809requestCardsgIAlus);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }

    private final void prefetchCardsImages(List<MatchShoppingCardsVI.Card> cards) {
        MatchShoppingCardsImagesPrefetcher matchShoppingCardsImagesPrefetcher = this.matchShoppingCardsImagePrefetcher;
        List<MatchShoppingCardsVI.Card> list = cards;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((MatchShoppingCardsVI.Card) it.next()).getProductInfo().getImage());
        }
        matchShoppingCardsImagesPrefetcher.prefetch(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshWidget() {
        Function1<? super b, Unit> function1 = this.onAtomAction;
        if (function1 != null) {
            function1.invoke(AtomActionMapperKt.toAtomAction(this.viewState.getValue().getWidgetState().getRefreshAction(), null));
        }
    }

    private final MatchShoppingCardsVI withCardShareAction(MatchShoppingCardsVI matchShoppingCardsVI, MatchShoppingCardsVI.Card card) {
        MatchShoppingCardsVI.Card.TrackingInfo trackingInfo;
        TokenizedTrackingInfo share;
        MatchShoppingCardsVI.Header header = matchShoppingCardsVI.getHeader();
        IconButtonV3DTO rightIcon = matchShoppingCardsVI.getHeader().getRightIcon();
        CommonControlSettings common = matchShoppingCardsVI.getHeader().getRightIcon().getCommon();
        CommonControlSettings commonControlSettings = common == null ? new CommonControlSettings(null, null, null, 7, null) : common;
        Map map = null;
        AtomActionDTO shareAction = card != null ? card.getShareAction() : null;
        if (card != null && (trackingInfo = card.getTrackingInfo()) != null && (share = trackingInfo.getShare()) != null) {
            map = U.i(new Pair(share.getActionType(), share));
        }
        return MatchShoppingCardsVI.copy$default(matchShoppingCardsVI, 0L, MatchShoppingCardsVI.Header.copy$default(header, null, false, null, IconButtonV3DTO.copy$default(rightIcon, null, null, null, null, null, null, null, CommonControlSettings.copy$default(commonControlSettings, shareAction, map, null, 4, null), null, null, null, null, null, null, 16255, null), null, 23, null), null, null, null, null, null, 125, null);
    }

    public final Function1<b, Unit> getOnAtomAction() {
        return this.onAtomAction;
    }

    public final Function1<NotificationDTO, Unit> getOnNotificationRequested() {
        return this.onNotificationRequested;
    }

    @NotNull
    public final M0<MatchShoppingCardsViewState> getViewState() {
        return this.viewState;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.matchShoppingCardsImagePrefetcher.clear();
    }

    public final void onUpdateWidgetState(@NotNull MatchShoppingCardsVI widgetState) {
        Intrinsics.checkNotNullParameter(widgetState, "widgetState");
        if (Intrinsics.d(widgetState, this.initialWidgetState)) {
            return;
        }
        this.initialWidgetState = widgetState;
        this.cards.clear();
        this.cards.addAll(widgetState.getCards());
        this.requestMoreCardsAction = widgetState.getRequestCardsAction();
        x0<MatchShoppingCardsViewState> x0Var = this.mutableViewState;
        do {
        } while (!x0Var.b(x0Var.getValue(), new MatchShoppingCardsViewState(withCardShareAction(widgetState, (MatchShoppingCardsVI.Card) C7714v.M(this.cards)), false, false, false, false, null, this.isTeensModeEnabled, 62, null)));
        prefetchCardsImages(C7714v.D(this.cards, 2));
    }

    public final void onViewIntent(@NotNull MatchShoppingCardsViewIntent viewIntent) {
        Intrinsics.checkNotNullParameter(viewIntent, "viewIntent");
        if (viewIntent instanceof MatchShoppingCardsViewIntent.HandleAtomAction) {
            Function1<? super b, Unit> function1 = this.onAtomAction;
            if (function1 != null) {
                function1.invoke(((MatchShoppingCardsViewIntent.HandleAtomAction) viewIntent).getAction());
                return;
            }
            return;
        }
        if (viewIntent instanceof MatchShoppingCardsViewIntent.SwipeAttempt) {
            handleSwipeAttempt();
        } else if (viewIntent instanceof MatchShoppingCardsViewIntent.SwipeOutStart) {
            handleSwipeOutStart(((MatchShoppingCardsViewIntent.SwipeOutStart) viewIntent).getDirection());
        } else {
            if (!(viewIntent instanceof MatchShoppingCardsViewIntent.SwipeOutEnd)) {
                throw new o();
            }
            handleSwipeOutEnd();
        }
    }

    public final void setOnAtomAction(Function1<? super b, Unit> function1) {
        this.onAtomAction = function1;
    }

    public final void setOnNotificationRequested(Function1<? super NotificationDTO, Unit> function1) {
        this.onNotificationRequested = function1;
    }
}
