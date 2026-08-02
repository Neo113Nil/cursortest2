package ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete;

import Sc.s;
import Wc.a;
import android.content.SharedPreferences;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.coordinator.GroupSwipeCoordinator;
import xe.Y;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bH\u0086@¢\u0006\u0004\b\r\u0010\nJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/SwipeOnboarding;", "", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/coordinator/GroupSwipeCoordinator;", "swipeCoordinator", "<init>", "(Landroid/content/SharedPreferences;Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/coordinator/GroupSwipeCoordinator;)V", "", "showOnboardingAnimation", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "updateOnboardingStats", "()V", "startOnboarding", "", "shouldShowOnboarding", "()Z", "Landroid/content/SharedPreferences;", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/coordinator/GroupSwipeCoordinator;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SwipeOnboarding {
    private final SharedPreferences sharedPreferences;
    private final GroupSwipeCoordinator swipeCoordinator;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/SwipeOnboarding$Companion;", "", "<init>", "()V", "PREF_ONBOARDING_SHOW_COUNT", "", "PREF_ONBOARDING_LAST_SHOW_TIME", "MAX_SHOW_COUNT", "", "SHOW_DELAY_MS", "", "BETWEEN_DELAY_MS", "SHOW_INTERVAL_MS", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SwipeOnboarding(SharedPreferences sharedPreferences, GroupSwipeCoordinator groupSwipeCoordinator) {
        this.sharedPreferences = sharedPreferences;
        this.swipeCoordinator = groupSwipeCoordinator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showOnboardingAnimation(d<? super Unit> dVar) {
        SwipeOnboarding$showOnboardingAnimation$1 swipeOnboarding$showOnboardingAnimation$1;
        int i11;
        GroupSwipeCoordinator groupSwipeCoordinator;
        if (dVar instanceof SwipeOnboarding$showOnboardingAnimation$1) {
            swipeOnboarding$showOnboardingAnimation$1 = (SwipeOnboarding$showOnboardingAnimation$1) dVar;
            int i12 = swipeOnboarding$showOnboardingAnimation$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                swipeOnboarding$showOnboardingAnimation$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = swipeOnboarding$showOnboardingAnimation$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = swipeOnboarding$showOnboardingAnimation$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    GroupSwipeCoordinator groupSwipeCoordinator2 = this.swipeCoordinator;
                    if (groupSwipeCoordinator2 == null) {
                        return Unit.f71690a;
                    }
                    GroupSwipeCoordinator.openFirstGroup$default(groupSwipeCoordinator2, false, 1, null);
                    swipeOnboarding$showOnboardingAnimation$1.L$0 = groupSwipeCoordinator2;
                    swipeOnboarding$showOnboardingAnimation$1.label = 1;
                    if (Y.b(1000L, swipeOnboarding$showOnboardingAnimation$1) == aVar) {
                        return aVar;
                    }
                    groupSwipeCoordinator = groupSwipeCoordinator2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    groupSwipeCoordinator = (GroupSwipeCoordinator) swipeOnboarding$showOnboardingAnimation$1.L$0;
                    s.b(obj);
                }
                GroupSwipeCoordinator.closeFirstGroup$default(groupSwipeCoordinator, false, 1, null);
                return Unit.f71690a;
            }
        }
        swipeOnboarding$showOnboardingAnimation$1 = new SwipeOnboarding$showOnboardingAnimation$1(this, dVar);
        Object obj2 = swipeOnboarding$showOnboardingAnimation$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = swipeOnboarding$showOnboardingAnimation$1.label;
        if (i11 != 0) {
        }
        GroupSwipeCoordinator.closeFirstGroup$default(groupSwipeCoordinator, false, 1, null);
        return Unit.f71690a;
    }

    private final void updateOnboardingStats() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences == null) {
            return;
        }
        int i11 = sharedPreferences.getInt("swipe_onboarding_show_count", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("swipe_onboarding_show_count", i11 + 1);
        edit.putLong("swipe_onboarding_last_show_time", System.currentTimeMillis());
        edit.apply();
    }

    public final boolean shouldShowOnboarding() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences == null || sharedPreferences.getInt("swipe_onboarding_show_count", 0) >= 2) {
            return false;
        }
        long j11 = sharedPreferences.getLong("swipe_onboarding_last_show_time", 0L);
        return System.currentTimeMillis() - j11 >= 86400000 || j11 == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startOnboarding(@NotNull d<? super Unit> dVar) {
        SwipeOnboarding$startOnboarding$1 swipeOnboarding$startOnboarding$1;
        int i11;
        SwipeOnboarding swipeOnboarding;
        SwipeOnboarding swipeOnboarding2;
        if (dVar instanceof SwipeOnboarding$startOnboarding$1) {
            swipeOnboarding$startOnboarding$1 = (SwipeOnboarding$startOnboarding$1) dVar;
            int i12 = swipeOnboarding$startOnboarding$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                swipeOnboarding$startOnboarding$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = swipeOnboarding$startOnboarding$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = swipeOnboarding$startOnboarding$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    if (this.sharedPreferences == null || this.swipeCoordinator == null) {
                        return Unit.f71690a;
                    }
                    if (!shouldShowOnboarding()) {
                        return Unit.f71690a;
                    }
                    swipeOnboarding$startOnboarding$1.L$0 = this;
                    swipeOnboarding$startOnboarding$1.label = 1;
                    if (Y.b(3000L, swipeOnboarding$startOnboarding$1) != aVar) {
                        swipeOnboarding = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    swipeOnboarding2 = (SwipeOnboarding) swipeOnboarding$startOnboarding$1.L$0;
                    s.b(obj);
                    swipeOnboarding2.updateOnboardingStats();
                    return Unit.f71690a;
                }
                swipeOnboarding = (SwipeOnboarding) swipeOnboarding$startOnboarding$1.L$0;
                s.b(obj);
                if (swipeOnboarding.shouldShowOnboarding()) {
                    swipeOnboarding$startOnboarding$1.L$0 = swipeOnboarding;
                    swipeOnboarding$startOnboarding$1.label = 2;
                    if (swipeOnboarding.showOnboardingAnimation(swipeOnboarding$startOnboarding$1) != aVar) {
                        swipeOnboarding2 = swipeOnboarding;
                        swipeOnboarding2.updateOnboardingStats();
                    }
                    return aVar;
                }
                return Unit.f71690a;
            }
        }
        swipeOnboarding$startOnboarding$1 = new SwipeOnboarding$startOnboarding$1(this, dVar);
        Object obj2 = swipeOnboarding$startOnboarding$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = swipeOnboarding$startOnboarding$1.label;
        if (i11 != 0) {
        }
        if (swipeOnboarding.shouldShowOnboarding()) {
        }
        return Unit.f71690a;
    }
}
