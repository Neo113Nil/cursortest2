package ru.ozon.app.android.pdp.ui.configurators.ugc.rateItems;

import L9.c;
import android.os.SystemClock;
import io.reactivex.p;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.navBar.NavBarDTO;
import ve.EnumC10311b;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010!\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u000b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b%\u0010$J\u0017\u0010&\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\r¢\u0006\u0004\b(\u0010\u0003R\"\u0010+\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010\r0\r0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010-\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010\t0\t0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\t018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\u0014\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00104R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/rateItems/RateItemsDelegate;", "", "<init>", "()V", "", "widgetPageKey", "Lru/ozon/app/android/pdp/ui/configurators/ugc/rateItems/RateItemsState;", "getStateByKey", "(Ljava/lang/String;)Lru/ozon/app/android/pdp/ui/configurators/ugc/rateItems/RateItemsState;", "", "productId", "", "withRefresh", "", "onReviewSuccess", "(Ljava/lang/Long;Z)V", "Lio/reactivex/p;", "observeReviewResult", "()Lio/reactivex/p;", "observeReviewResultWithId", "isClearStateOnAppRestartEnabled", "", "clearDismissTimeoutHours", "setupDelegate", "(ZI)V", "dismiss", "(Ljava/lang/String;)V", "behaviorState", "changeBehaviorState", "(Ljava/lang/String;I)V", NavBarDTO.NESTED_PLACEHOLDER_EXPANDED, "", "itemIds", "setRateItemsExpandedState", "(Ljava/lang/String;ZLjava/util/List;)V", "isDismissed", "(Ljava/lang/String;)Z", "isExpanded", "isReviewed", "(Ljava/lang/Long;)Z", "clear", "LL9/c;", "kotlin.jvm.PlatformType", "reviewSuccess", "LL9/c;", "reviewSuccessWithId", "Ljava/util/concurrent/ConcurrentHashMap;", "rateItemsStates", "Ljava/util/concurrent/ConcurrentHashMap;", "", "lastReviewedProductIds", "Ljava/util/Set;", "Z", "I", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RateItemsDelegate {
    public static final int $stable;

    @NotNull
    public static final RateItemsDelegate INSTANCE = new RateItemsDelegate();
    private static int clearDismissTimeoutHours;
    private static boolean isClearStateOnAppRestartEnabled;

    @NotNull
    private static final Set<Long> lastReviewedProductIds;

    @NotNull
    private static final ConcurrentHashMap<String, RateItemsState> rateItemsStates;

    @NotNull
    private static final c<Unit> reviewSuccess;

    @NotNull
    private static final c<Long> reviewSuccessWithId;

    static {
        c<Unit> c11 = c.c();
        Intrinsics.checkNotNullExpressionValue(c11, "create(...)");
        reviewSuccess = c11;
        c<Long> c12 = c.c();
        Intrinsics.checkNotNullExpressionValue(c12, "create(...)");
        reviewSuccessWithId = c12;
        rateItemsStates = new ConcurrentHashMap<>();
        lastReviewedProductIds = new LinkedHashSet();
        $stable = 8;
    }

    private RateItemsDelegate() {
    }

    private final RateItemsState getStateByKey(String widgetPageKey) {
        ConcurrentHashMap<String, RateItemsState> concurrentHashMap = rateItemsStates;
        if (widgetPageKey == null) {
            widgetPageKey = "main";
        }
        RateItemsState rateItemsState = concurrentHashMap.get(widgetPageKey);
        return rateItemsState == null ? new RateItemsState(false, false, null, 0, null, 31, null) : rateItemsState;
    }

    public final void changeBehaviorState(String widgetPageKey, int behaviorState) {
        rateItemsStates.put(widgetPageKey == null ? "main" : widgetPageKey, RateItemsState.copy$default(getStateByKey(widgetPageKey), false, false, null, behaviorState, null, 23, null));
    }

    public final void clear() {
        if (isClearStateOnAppRestartEnabled) {
            rateItemsStates.clear();
        }
    }

    public final void dismiss(String widgetPageKey) {
        rateItemsStates.put(widgetPageKey == null ? "main" : widgetPageKey, RateItemsState.copy$default(getStateByKey(widgetPageKey), true, false, null, 0, Long.valueOf(SystemClock.elapsedRealtime()), 14, null));
    }

    public final boolean isDismissed(String widgetPageKey) {
        RateItemsState stateByKey = getStateByKey(widgetPageKey);
        if (!stateByKey.getRateItemsDismissed()) {
            return false;
        }
        if (clearDismissTimeoutHours == 0 || stateByKey.getDismissedAt() == null) {
            return true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - stateByKey.getDismissedAt().longValue();
        b.Companion companion = b.INSTANCE;
        boolean z11 = elapsedRealtime > b.h(kotlin.time.c.g(clearDismissTimeoutHours, EnumC10311b.HOURS));
        if (z11) {
            if (widgetPageKey == null) {
                widgetPageKey = "main";
            }
            rateItemsStates.replace(widgetPageKey, stateByKey, RateItemsState.copy$default(stateByKey, false, false, null, 0, null, 14, null));
        }
        return !z11;
    }

    public final boolean isExpanded(String widgetPageKey) {
        return getStateByKey(widgetPageKey).getRateItemsExpandedState();
    }

    public final boolean isReviewed(Long productId) {
        return productId != null && lastReviewedProductIds.contains(productId);
    }

    @NotNull
    public final p<Unit> observeReviewResult() {
        p<Unit> hide = reviewSuccess.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "hide(...)");
        return hide;
    }

    @NotNull
    public final p<Long> observeReviewResultWithId() {
        p<Long> hide = reviewSuccessWithId.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "hide(...)");
        return hide;
    }

    public final void onReviewSuccess(Long productId, boolean withRefresh) {
        Object obj;
        if (productId != null) {
            lastReviewedProductIds.add(Long.valueOf(productId.longValue()));
        }
        if (productId == null) {
            reviewSuccess.accept(Unit.f71690a);
            return;
        }
        if (withRefresh) {
            reviewSuccessWithId.accept(productId);
        }
        Set<Map.Entry<String, RateItemsState>> entrySet = rateItemsStates.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
        Iterator<T> it = entrySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Map.Entry entry = (Map.Entry) obj;
            Intrinsics.f(entry);
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "component2(...)");
            if (((RateItemsState) value).getItemIds().contains(productId)) {
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) obj;
        if (entry2 == null) {
            return;
        }
        boolean z11 = ((RateItemsState) entry2.getValue()).getItemIds().size() == 1;
        rateItemsStates.put(entry2.getKey(), RateItemsState.copy$default((RateItemsState) entry2.getValue(), z11, false, null, z11 ? 5 : ((RateItemsState) entry2.getValue()).getBehaviorState(), z11 ? Long.valueOf(SystemClock.elapsedRealtime()) : ((RateItemsState) entry2.getValue()).getDismissedAt(), 6, null));
    }

    public final void setRateItemsExpandedState(String widgetPageKey, boolean expanded, @NotNull List<Long> itemIds) {
        Intrinsics.checkNotNullParameter(itemIds, "itemIds");
        rateItemsStates.put(widgetPageKey == null ? "main" : widgetPageKey, RateItemsState.copy$default(getStateByKey(widgetPageKey), false, expanded, itemIds, 0, null, 25, null));
    }

    public final void setupDelegate(boolean isClearStateOnAppRestartEnabled2, int clearDismissTimeoutHours2) {
        isClearStateOnAppRestartEnabled = isClearStateOnAppRestartEnabled2;
        clearDismissTimeoutHours = clearDismissTimeoutHours2;
    }
}
