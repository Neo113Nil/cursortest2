package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"ru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/allDone/AviaSearchResultV4AllDoneViewModel$OnboardingEvent$Onboarding", "", "", "recipientId", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "<init>", "(JLru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getRecipientId", "()J", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AviaSearchResultV4AllDoneViewModel$OnboardingEvent$Onboarding {

    @NotNull
    private final OnBoardingDTO onboarding;
    private final long recipientId;

    public AviaSearchResultV4AllDoneViewModel$OnboardingEvent$Onboarding(long j11, @NotNull OnBoardingDTO onboarding) {
        Intrinsics.checkNotNullParameter(onboarding, "onboarding");
        this.recipientId = j11;
        this.onboarding = onboarding;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AviaSearchResultV4AllDoneViewModel$OnboardingEvent$Onboarding)) {
            return false;
        }
        AviaSearchResultV4AllDoneViewModel$OnboardingEvent$Onboarding aviaSearchResultV4AllDoneViewModel$OnboardingEvent$Onboarding = (AviaSearchResultV4AllDoneViewModel$OnboardingEvent$Onboarding) other;
        return this.recipientId == aviaSearchResultV4AllDoneViewModel$OnboardingEvent$Onboarding.recipientId && Intrinsics.d(this.onboarding, aviaSearchResultV4AllDoneViewModel$OnboardingEvent$Onboarding.onboarding);
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
        return "Onboarding(recipientId=" + this.recipientId + ", onboarding=" + this.onboarding + ")";
    }
}
