package ru.ozon.app.android.action.analytics;

import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/action/analytics/ActionUsageAnalyticsTracking;", "", "<init>", "()V", "Directly", "ByComponentStorage", "Lru/ozon/app/android/action/analytics/ActionUsageAnalyticsTracking$ByComponentStorage;", "Lru/ozon/app/android/action/analytics/ActionUsageAnalyticsTracking$Directly;", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ActionUsageAnalyticsTracking {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/action/analytics/ActionUsageAnalyticsTracking$ByComponentStorage;", "Lru/ozon/app/android/action/analytics/ActionUsageAnalyticsTracking;", "Lk20/g;", "componentStorage", "<init>", "(Lk20/g;)V", "Lk20/g;", "getComponentStorage", "()Lk20/g;", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ByComponentStorage extends ActionUsageAnalyticsTracking {

        @NotNull
        private final C7475g componentStorage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ByComponentStorage(@NotNull C7475g componentStorage) {
            super(null);
            Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
            this.componentStorage = componentStorage;
        }

        @NotNull
        public final C7475g getComponentStorage() {
            return this.componentStorage;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/action/analytics/ActionUsageAnalyticsTracking$Directly;", "Lru/ozon/app/android/action/analytics/ActionUsageAnalyticsTracking;", "actionUsageAnalytics", "Lru/ozon/app/android/action/analytics/ActionUsageAnalytics;", "<init>", "(Lru/ozon/app/android/action/analytics/ActionUsageAnalytics;)V", "getActionUsageAnalytics", "()Lru/ozon/app/android/action/analytics/ActionUsageAnalytics;", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Directly extends ActionUsageAnalyticsTracking {

        @NotNull
        private final ActionUsageAnalytics actionUsageAnalytics;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Directly(@NotNull ActionUsageAnalytics actionUsageAnalytics) {
            super(null);
            Intrinsics.checkNotNullParameter(actionUsageAnalytics, "actionUsageAnalytics");
            this.actionUsageAnalytics = actionUsageAnalytics;
        }

        @NotNull
        public final ActionUsageAnalytics getActionUsageAnalytics() {
            return this.actionUsageAnalytics;
        }
    }

    public /* synthetic */ ActionUsageAnalyticsTracking(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ActionUsageAnalyticsTracking() {
    }
}
