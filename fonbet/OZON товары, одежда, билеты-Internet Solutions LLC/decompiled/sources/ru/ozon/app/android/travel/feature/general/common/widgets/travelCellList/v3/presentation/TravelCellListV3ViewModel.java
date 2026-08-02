package ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation;

import Ae.B0;
import Ae.C2399j;
import Ae.E0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import xe.C10727i;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0003R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3ViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "showOnboarding", "setIsModalShown", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO;", "vo", "onCellIsOnTheScreen", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO;)V", "LAe/B0;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3ViewModel$OnboardingEvent;", "getOnboardingSharedFlow", "()LAe/B0;", "", "isAccuratelyShown", "onOnboardingShown", "(Z)V", "onModalDismiss", "isOnboardingShown", "Z", "isModalShown", "itemVO", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO;", "LAe/w0;", "onboardingSharedFlow", "LAe/w0;", "OnboardingEvent", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCellListV3ViewModel extends w0 {
    private boolean isModalShown;
    private boolean isOnboardingShown;
    private TravelCellListV3VO itemVO;

    @NotNull
    private final Ae.w0<OnboardingEvent> onboardingSharedFlow = E0.b(0, 0, null, 7);

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3ViewModel$OnboardingEvent;", "", "", "recipientId", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "<init>", "(JLru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getRecipientId", "()J", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    private final void showOnboarding() {
        TravelCellListV3VO travelCellListV3VO = this.itemVO;
        if (travelCellListV3VO == null || this.isOnboardingShown || travelCellListV3VO.getOnboardingApp() == null) {
            return;
        }
        C10727i.c(x0.a(this), null, null, new TravelCellListV3ViewModel$showOnboarding$1$1(this, travelCellListV3VO, null), 3);
    }

    @NotNull
    public final B0<OnboardingEvent> getOnboardingSharedFlow() {
        return C2399j.a(this.onboardingSharedFlow);
    }

    public final void onCellIsOnTheScreen(@NotNull TravelCellListV3VO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.itemVO = vo;
        showOnboarding();
    }

    public final void onModalDismiss() {
        if (this.isModalShown) {
            showOnboarding();
            this.isModalShown = false;
        }
    }

    public final void onOnboardingShown(boolean isAccuratelyShown) {
        this.isOnboardingShown = isAccuratelyShown;
    }

    public final void setIsModalShown() {
        this.isModalShown = true;
    }
}
