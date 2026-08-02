package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone;

import Ae.C2399j;
import Ae.E0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4AllDoneVO;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u0003R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/allDone/AviaSearchResultV4AllDoneViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "visiblePercent", "", "id", "", "startCalculateDelay", "(FJ)V", "stopCalculateDelay", "LAe/B0;", "", "getOnboardingSharedFlow", "()LAe/B0;", "", "isAccuratelyShown", "onOnboardingShown", "(Z)V", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4AllDoneVO;", "vo", "onCardIsOnTheScreen", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4AllDoneVO;F)V", "isOnboardingShown", "()Ljava/lang/Boolean;", "unbindOnboarding", "Ljava/lang/Boolean;", "pendingId", "Ljava/lang/Long;", "pendingVisiblePercent", "F", "pendingCalculateDelay", "Z", "LAe/w0;", "onboardingSharedFlow", "LAe/w0;", "Lxe/B0;", "delayJob", "Lxe/B0;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV4AllDoneViewModel extends w0 {
    private B0 delayJob;
    private Boolean isOnboardingShown;

    @NotNull
    private final Ae.w0<Object> onboardingSharedFlow = E0.b(0, 0, null, 7);
    private boolean pendingCalculateDelay;
    private Long pendingId;
    private float pendingVisiblePercent;

    private final void startCalculateDelay(float visiblePercent, long id2) {
        this.pendingCalculateDelay = true;
        this.pendingId = Long.valueOf(id2);
        this.pendingVisiblePercent = visiblePercent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopCalculateDelay() {
        this.pendingCalculateDelay = false;
        this.pendingId = null;
        this.pendingVisiblePercent = 0.0f;
    }

    @NotNull
    public final Ae.B0<Object> getOnboardingSharedFlow() {
        return C2399j.a(this.onboardingSharedFlow);
    }

    /* renamed from: isOnboardingShown, reason: from getter */
    public final Boolean getIsOnboardingShown() {
        return this.isOnboardingShown;
    }

    public final void onCardIsOnTheScreen(@NotNull AviaSearchResultV4AllDoneVO vo, float visiblePercent) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        OnBoardingDTO onboardingApp = vo.getFlight().getOnboardingApp();
        long id2 = vo.getId();
        Long l11 = this.pendingId;
        if (l11 != null && id2 == l11.longValue() && visiblePercent < this.pendingVisiblePercent) {
            B0 b02 = this.delayJob;
            if (b02 != null) {
                b02.j(null);
            }
            stopCalculateDelay();
            return;
        }
        if (!Intrinsics.d(this.isOnboardingShown, Boolean.FALSE) || onboardingApp == null || visiblePercent < 1.0f || this.pendingCalculateDelay) {
            return;
        }
        startCalculateDelay(visiblePercent, vo.getId());
        this.delayJob = C10727i.c(x0.a(this), null, null, new AviaSearchResultV4AllDoneViewModel$onCardIsOnTheScreen$1(this, vo, onboardingApp, null), 3);
    }

    public final void onOnboardingShown(boolean isAccuratelyShown) {
        this.isOnboardingShown = Boolean.valueOf(isAccuratelyShown);
    }

    public final void unbindOnboarding() {
        C10727i.c(x0.a(this), null, null, new AviaSearchResultV4AllDoneViewModel$unbindOnboarding$1(this, null), 3);
    }
}
