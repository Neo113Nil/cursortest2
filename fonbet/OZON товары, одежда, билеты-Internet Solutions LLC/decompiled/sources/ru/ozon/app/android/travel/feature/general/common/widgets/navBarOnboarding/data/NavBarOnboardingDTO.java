package ru.ozon.app.android.travel.feature.general.common.widgets.navBarOnboarding.data;

import Kk.C3532b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J.\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/navBarOnboarding/data/NavBarOnboardingDTO;", "", "tabNumber", "", "isReverseOrder", "", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "<init>", "(Ljava/lang/Integer;ZLru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "getTabNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;ZLru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/navBarOnboarding/data/NavBarOnboardingDTO;", "equals", "other", "hashCode", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NavBarOnboardingDTO {
    public static final int $stable = 0;
    private final boolean isReverseOrder;

    @NotNull
    private final OnBoardingDTO onboarding;
    private final Integer tabNumber;

    public NavBarOnboardingDTO(Integer num, boolean z11, @NotNull OnBoardingDTO onboarding) {
        Intrinsics.checkNotNullParameter(onboarding, "onboarding");
        this.tabNumber = num;
        this.isReverseOrder = z11;
        this.onboarding = onboarding;
    }

    public static /* synthetic */ NavBarOnboardingDTO copy$default(NavBarOnboardingDTO navBarOnboardingDTO, Integer num, boolean z11, OnBoardingDTO onBoardingDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = navBarOnboardingDTO.tabNumber;
        }
        if ((i11 & 2) != 0) {
            z11 = navBarOnboardingDTO.isReverseOrder;
        }
        if ((i11 & 4) != 0) {
            onBoardingDTO = navBarOnboardingDTO.onboarding;
        }
        return navBarOnboardingDTO.copy(num, z11, onBoardingDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getTabNumber() {
        return this.tabNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsReverseOrder() {
        return this.isReverseOrder;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    @NotNull
    public final NavBarOnboardingDTO copy(Integer tabNumber, boolean isReverseOrder, @NotNull OnBoardingDTO onboarding) {
        Intrinsics.checkNotNullParameter(onboarding, "onboarding");
        return new NavBarOnboardingDTO(tabNumber, isReverseOrder, onboarding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavBarOnboardingDTO)) {
            return false;
        }
        NavBarOnboardingDTO navBarOnboardingDTO = (NavBarOnboardingDTO) other;
        return Intrinsics.d(this.tabNumber, navBarOnboardingDTO.tabNumber) && this.isReverseOrder == navBarOnboardingDTO.isReverseOrder && Intrinsics.d(this.onboarding, navBarOnboardingDTO.onboarding);
    }

    @NotNull
    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    public final Integer getTabNumber() {
        return this.tabNumber;
    }

    public int hashCode() {
        Integer num = this.tabNumber;
        return this.onboarding.hashCode() + C3532b.a((num == null ? 0 : num.hashCode()) * 31, 31, this.isReverseOrder);
    }

    public final boolean isReverseOrder() {
        return this.isReverseOrder;
    }

    @NotNull
    public String toString() {
        return "NavBarOnboardingDTO(tabNumber=" + this.tabNumber + ", isReverseOrder=" + this.isReverseOrder + ", onboarding=" + this.onboarding + ")";
    }

    public /* synthetic */ NavBarOnboardingDTO(Integer num, boolean z11, OnBoardingDTO onBoardingDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, (i11 & 2) != 0 ? false : z11, onBoardingDTO);
    }
}
