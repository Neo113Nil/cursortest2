package ru.ozon.app.android.travel.feature.general.common.widgets.navBarOnboarding.presentation;

import Kk.C3532b;
import Lh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\b\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/navBarOnboarding/presentation/NavBarOnboardingVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "tabNumber", "", "isReverseOrder", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "<init>", "(JLjava/lang/Integer;ZLru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/Integer;", "getTabNumber", "()Ljava/lang/Integer;", "Z", "()Z", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NavBarOnboardingVO implements c {
    private final long id;
    private final boolean isReverseOrder;

    @NotNull
    private final OnBoardingDTO onboarding;
    private final Integer tabNumber;

    public NavBarOnboardingVO(long j11, Integer num, boolean z11, @NotNull OnBoardingDTO onboarding) {
        Intrinsics.checkNotNullParameter(onboarding, "onboarding");
        this.id = j11;
        this.tabNumber = num;
        this.isReverseOrder = z11;
        this.onboarding = onboarding;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavBarOnboardingVO)) {
            return false;
        }
        NavBarOnboardingVO navBarOnboardingVO = (NavBarOnboardingVO) other;
        return this.id == navBarOnboardingVO.id && Intrinsics.d(this.tabNumber, navBarOnboardingVO.tabNumber) && this.isReverseOrder == navBarOnboardingVO.isReverseOrder && Intrinsics.d(this.onboarding, navBarOnboardingVO.onboarding);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final Integer getTabNumber() {
        return this.tabNumber;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Integer num = this.tabNumber;
        return this.onboarding.hashCode() + C3532b.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.isReverseOrder);
    }

    /* renamed from: isReverseOrder, reason: from getter */
    public final boolean getIsReverseOrder() {
        return this.isReverseOrder;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Integer num = this.tabNumber;
        boolean z11 = this.isReverseOrder;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        StringBuilder c11 = a.c("NavBarOnboardingVO(id=", j11, ", tabNumber=", num);
        c11.append(", isReverseOrder=");
        c11.append(z11);
        c11.append(", onboarding=");
        c11.append(onBoardingDTO);
        c11.append(")");
        return c11.toString();
    }
}
