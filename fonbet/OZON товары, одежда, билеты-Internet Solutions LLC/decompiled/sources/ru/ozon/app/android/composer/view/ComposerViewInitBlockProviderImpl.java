package ru.ozon.app.android.composer.view;

import Hh.C3140a;
import Ih.b;
import RZ.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.app.Application;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.eventstorage.ViewEventStorage;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.view.performance.ViewHoldersPerformanceTracker;
import ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHoldersRumTracker;
import ru.ozon.app.android.debug.WidgetsDebugToolsInteractor;
import ru.ozon.app.android.storage.debug.DebugToolsStorage;
import ru.ozon.app.android.storage.user.test.TestUserStorage;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001Bw\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fH\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010(R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010*R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010+R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010,R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010-R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010.R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010/R\u001b\u00103\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/ozon/app/android/composer/view/ComposerViewInitBlockProviderImpl;", "Lru/ozon/app/android/composer/view/ComposerViewInitBlockProvider;", "Lru/ozon/app/android/storage/user/test/TestUserStorage;", "testUserStorage", "Landroid/app/Application;", "application", "LRZ/a;", "analytics", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "LHh/a;", "fpsTracker", "Lru/ozon/app/android/composer/view/performance/vhlisteners/ViewHoldersRumTracker;", "viewHoldersRumTracker", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "Lru/ozon/app/android/composer/view/performance/ViewHoldersPerformanceTracker;", "viewHoldersPerformanceTracker", "Lru/ozon/app/android/debug/WidgetsDebugToolsInteractor;", "debugTools", "Lru/ozon/app/android/storage/debug/DebugToolsStorage;", "debugToolsStorage", "LPc/a;", "Lru/ozon/app/android/composer/view/ComposerNotificationController;", "notificationControllerProvider", "Lru/ozon/app/android/analytics/eventstorage/ViewEventStorage;", "viewEventStorage", "LIh/b;", "pagePerformanceTracker", "<init>", "(Lru/ozon/app/android/storage/user/test/TestUserStorage;Landroid/app/Application;LRZ/a;Lru/ozon/app/android/composer/ComposerNavigator;LHh/a;Lru/ozon/app/android/composer/view/performance/vhlisteners/ViewHoldersRumTracker;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;Lru/ozon/app/android/composer/view/performance/ViewHoldersPerformanceTracker;Lru/ozon/app/android/debug/WidgetsDebugToolsInteractor;Lru/ozon/app/android/storage/debug/DebugToolsStorage;LPc/a;Lru/ozon/app/android/analytics/eventstorage/ViewEventStorage;LIh/b;)V", "Lkotlin/Function1;", "Ll10/i;", "", "provide", "()Lkotlin/jvm/functions/Function1;", "Landroid/app/Application;", "LRZ/a;", "Lru/ozon/app/android/composer/ComposerNavigator;", "LHh/a;", "Lru/ozon/app/android/composer/view/performance/vhlisteners/ViewHoldersRumTracker;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "Lru/ozon/app/android/composer/view/performance/ViewHoldersPerformanceTracker;", "Lru/ozon/app/android/debug/WidgetsDebugToolsInteractor;", "Lru/ozon/app/android/storage/debug/DebugToolsStorage;", "LPc/a;", "Lru/ozon/app/android/analytics/eventstorage/ViewEventStorage;", "LIh/b;", "", "isTestUser$delegate", "LSc/j;", "isTestUser", "()Z", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerViewInitBlockProviderImpl implements ComposerViewInitBlockProvider {

    @NotNull
    private final a analytics;

    @NotNull
    private final Application application;

    @NotNull
    private final WidgetsDebugToolsInteractor debugTools;

    @NotNull
    private final DebugToolsStorage debugToolsStorage;

    @NotNull
    private final C3140a fpsTracker;

    /* renamed from: isTestUser$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isTestUser;

    @NotNull
    private final ComposerNavigator navigator;

    @NotNull
    private final Pc.a<ComposerNotificationController> notificationControllerProvider;

    @NotNull
    private final b pagePerformanceTracker;

    @NotNull
    private final PerformanceTrackerDelegate performanceTrackerDelegate;

    @NotNull
    private final ViewEventStorage viewEventStorage;

    @NotNull
    private final ViewHoldersPerformanceTracker viewHoldersPerformanceTracker;

    @NotNull
    private final ViewHoldersRumTracker viewHoldersRumTracker;

    public ComposerViewInitBlockProviderImpl(@NotNull TestUserStorage testUserStorage, @NotNull Application application, @NotNull a analytics, @NotNull ComposerNavigator navigator, @NotNull C3140a fpsTracker, @NotNull ViewHoldersRumTracker viewHoldersRumTracker, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull ViewHoldersPerformanceTracker viewHoldersPerformanceTracker, @NotNull WidgetsDebugToolsInteractor debugTools, @NotNull DebugToolsStorage debugToolsStorage, @NotNull Pc.a<ComposerNotificationController> notificationControllerProvider, @NotNull ViewEventStorage viewEventStorage, @NotNull b pagePerformanceTracker) {
        Intrinsics.checkNotNullParameter(testUserStorage, "testUserStorage");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(fpsTracker, "fpsTracker");
        Intrinsics.checkNotNullParameter(viewHoldersRumTracker, "viewHoldersRumTracker");
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        Intrinsics.checkNotNullParameter(viewHoldersPerformanceTracker, "viewHoldersPerformanceTracker");
        Intrinsics.checkNotNullParameter(debugTools, "debugTools");
        Intrinsics.checkNotNullParameter(debugToolsStorage, "debugToolsStorage");
        Intrinsics.checkNotNullParameter(notificationControllerProvider, "notificationControllerProvider");
        Intrinsics.checkNotNullParameter(viewEventStorage, "viewEventStorage");
        Intrinsics.checkNotNullParameter(pagePerformanceTracker, "pagePerformanceTracker");
        this.application = application;
        this.analytics = analytics;
        this.navigator = navigator;
        this.fpsTracker = fpsTracker;
        this.viewHoldersRumTracker = viewHoldersRumTracker;
        this.performanceTrackerDelegate = performanceTrackerDelegate;
        this.viewHoldersPerformanceTracker = viewHoldersPerformanceTracker;
        this.debugTools = debugTools;
        this.debugToolsStorage = debugToolsStorage;
        this.notificationControllerProvider = notificationControllerProvider;
        this.viewEventStorage = viewEventStorage;
        this.pagePerformanceTracker = pagePerformanceTracker;
        this.isTestUser = k.b(new ComposerViewInitBlockProviderImpl$isTestUser$2(testUserStorage));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isTestUser() {
        return ((Boolean) this.isTestUser.getValue()).booleanValue();
    }

    @Override // ru.ozon.app.android.composer.view.ComposerViewInitBlockProvider
    @NotNull
    public Function1<i, Unit> provide() {
        return new ComposerViewInitBlockProviderImpl$provide$1(this);
    }
}
