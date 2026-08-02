package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card;

import Ae.B0;
import Ae.C2399j;
import Ae.E0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7704k;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 A2\u00020\u0001:\u0002ABB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\b¢\u0006\u0004\b%\u0010$J\u0015\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020 ¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020 2\u0006\u0010)\u001a\u00020\u0010¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020,2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u0006018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00106R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u001c078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020 0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0010018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00103R\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u0010018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00103¨\u0006C"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "<init>", "(Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "", "id", "", "addVisibleCardId", "(J)V", "deleteVisibleCardId", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "setUpOnboarding", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "", "traceId", "addLayoutTraceId", "(Ljava/lang/String;)V", "Lkotlin/collections/k;", "getTraceIds", "()Lkotlin/collections/k;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;", "vo", "onCardIsOnTheScreen", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;)V", "LAe/B0;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardViewModel$OnboardingEvent;", "getOnboardingSharedFlow", "()LAe/B0;", "LAe/M0;", "", "getFreezeLayoutStateFlow", "()LAe/M0;", "onOnboardingRequested", "()V", "onOnboardingUnbind", "isAccuratelyShown", "onOnboardingShown", "(Z)V", "asyncData", "shouldSendRequest", "(Ljava/lang/String;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "", "visibleCardId", "Ljava/util/Set;", "isOnboardingShown", "Z", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "LAe/w0;", "onboardingSharedFlow", "LAe/w0;", "LAe/x0;", "freezeLayoutStateFlow", "LAe/x0;", "asyncDataSet", "cardsVHTraceIdsStack", "Lkotlin/collections/k;", "pendingTraceIds", "Companion", "OnboardingEvent", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsSearchResultsV5CardViewModel extends w0 {

    @NotNull
    private final Set<String> asyncDataSet;

    @NotNull
    private C7704k<String> cardsVHTraceIdsStack;

    @NotNull
    private final x0<Boolean> freezeLayoutStateFlow;

    @NotNull
    private final HandlersInhibitor handlersInhibitor;
    private boolean isOnboardingShown;
    private OnBoardingDTO onboarding;

    @NotNull
    private final Ae.w0<OnboardingEvent> onboardingSharedFlow;

    @NotNull
    private final Set<String> pendingTraceIds;

    @NotNull
    private final Set<Long> visibleCardId;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardViewModel$Companion;", "", "<init>", "()V", "THROTTLE_TIME", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardViewModel$OnboardingEvent;", "", "", "recipientId", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "<init>", "(JLru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getRecipientId", "()J", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnboardingEvent {

        @NotNull
        private final OnBoardingDTO onboarding;
        private final long recipientId;

        public OnboardingEvent(long j11, @NotNull OnBoardingDTO onboarding) {
            Intrinsics.checkNotNullParameter(onboarding, "onboarding");
            this.recipientId = j11;
            this.onboarding = onboarding;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnboardingEvent)) {
                return false;
            }
            OnboardingEvent onboardingEvent = (OnboardingEvent) other;
            return this.recipientId == onboardingEvent.recipientId && Intrinsics.d(this.onboarding, onboardingEvent.onboarding);
        }

        @NotNull
        public final OnBoardingDTO getOnboarding() {
            return this.onboarding;
        }

        public final long getRecipientId() {
            return this.recipientId;
        }

        public int hashCode() {
            return this.onboarding.hashCode() + (Long.hashCode(this.recipientId) * 31);
        }

        @NotNull
        public String toString() {
            return "OnboardingEvent(recipientId=" + this.recipientId + ", onboarding=" + this.onboarding + ")";
        }
    }

    public HotelsSearchResultsV5CardViewModel(@NotNull HandlersInhibitor handlersInhibitor) {
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        this.handlersInhibitor = handlersInhibitor;
        this.visibleCardId = new LinkedHashSet();
        this.onboardingSharedFlow = E0.b(0, 0, null, 7);
        this.freezeLayoutStateFlow = O0.a(Boolean.FALSE);
        this.asyncDataSet = new LinkedHashSet();
        this.cardsVHTraceIdsStack = new C7704k<>();
        this.pendingTraceIds = new LinkedHashSet();
    }

    public final void addLayoutTraceId(@NotNull String traceId) {
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        if (this.pendingTraceIds.add(traceId)) {
            this.handlersInhibitor.run(100L, new HotelsSearchResultsV5CardViewModel$addLayoutTraceId$1(this, traceId));
        }
    }

    public final void addVisibleCardId(long id2) {
        this.visibleCardId.add(Long.valueOf(id2));
    }

    public final void deleteVisibleCardId(long id2) {
        this.visibleCardId.remove(Long.valueOf(id2));
    }

    @NotNull
    public final M0<Boolean> getFreezeLayoutStateFlow() {
        return C2399j.b(this.freezeLayoutStateFlow);
    }

    @NotNull
    public final B0<OnboardingEvent> getOnboardingSharedFlow() {
        return C2399j.a(this.onboardingSharedFlow);
    }

    @NotNull
    public final C7704k<String> getTraceIds() {
        return this.cardsVHTraceIdsStack;
    }

    public final void onCardIsOnTheScreen(@NotNull HotelsSearchResultsV5CardVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        OnBoardingDTO onBoardingDTO = this.onboarding;
        if (this.isOnboardingShown || onBoardingDTO == null || !vo.getCanShowOnboarding() || this.freezeLayoutStateFlow.getValue().booleanValue()) {
            return;
        }
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new HotelsSearchResultsV5CardViewModel$onCardIsOnTheScreen$1(this, vo, onBoardingDTO, null), 3);
    }

    public final void onOnboardingRequested() {
        this.freezeLayoutStateFlow.setValue(Boolean.TRUE);
    }

    public final void onOnboardingShown(boolean isAccuratelyShown) {
        this.isOnboardingShown = isAccuratelyShown;
        this.freezeLayoutStateFlow.setValue(Boolean.FALSE);
    }

    public final void onOnboardingUnbind() {
        this.freezeLayoutStateFlow.setValue(Boolean.FALSE);
    }

    @NotNull
    public final AtomAction processAction(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof AtomAction.ComposerAction)) {
            return action;
        }
        AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
        Map<String, String> params = composerAction.getParams();
        return AtomAction.ComposerAction.copy$default(composerAction, null, null, U.n(params != null ? U.u(params) : new LinkedHashMap(), new Pair("visibleIds", C7714v.V(this.visibleCardId, ",", null, null, null, 62))), null, null, 27, null);
    }

    public final void setUpOnboarding(OnBoardingDTO onboarding) {
        this.onboarding = onboarding;
    }

    public final boolean shouldSendRequest(@NotNull String asyncData) {
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        return this.asyncDataSet.add(asyncData);
    }
}
