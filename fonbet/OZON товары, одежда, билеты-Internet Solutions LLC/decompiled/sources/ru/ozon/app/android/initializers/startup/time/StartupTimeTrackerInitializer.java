package ru.ozon.app.android.initializers.startup.time;

import Xh0.c;
import ei0.InterfaceC6369b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.flags.StartupTrackerSendStepsBatched;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.startup.initializers.ActionInitializer;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/initializers/startup/time/StartupTimeTrackerInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "LXh0/c;", "startupTimeTracker", "Lei0/b;", "ozonTracker", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(LXh0/c;Lei0/b;Lru/ozon/app/android/network/abtool/FeatureService;)V", "", "init", "()V", "LXh0/c;", "Lei0/b;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StartupTimeTrackerInitializer implements ActionInitializer {
    private static c.b configuration;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final InterfaceC6369b ozonTracker;

    @NotNull
    private final c startupTimeTracker;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/initializers/startup/time/StartupTimeTrackerInitializer$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "", "updateConfiguration$main_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/network/abtool/FeatureService;)V", "updateConfiguration", "LXh0/c$b;", "configuration", "LXh0/c$b;", "getConfiguration$main_prodGoogleAllVendorsRelease", "()LXh0/c$b;", "setConfiguration$main_prodGoogleAllVendorsRelease", "(LXh0/c$b;)V", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c.b getConfiguration$main_prodGoogleAllVendorsRelease() {
            return StartupTimeTrackerInitializer.configuration;
        }

        public final void setConfiguration$main_prodGoogleAllVendorsRelease(c.b bVar) {
            StartupTimeTrackerInitializer.configuration = bVar;
        }

        public final void updateConfiguration$main_prodGoogleAllVendorsRelease(@NotNull FeatureService featureService) {
            Intrinsics.checkNotNullParameter(featureService, "featureService");
            c.b configuration$main_prodGoogleAllVendorsRelease = getConfiguration$main_prodGoogleAllVendorsRelease();
            if (configuration$main_prodGoogleAllVendorsRelease != null) {
                configuration$main_prodGoogleAllVendorsRelease.e(featureService.getBooleanKey(StartupTrackerSendStepsBatched.INSTANCE));
            }
        }

        private Companion() {
        }
    }

    public StartupTimeTrackerInitializer(@NotNull c startupTimeTracker, @NotNull InterfaceC6369b ozonTracker, @NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(startupTimeTracker, "startupTimeTracker");
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.startupTimeTracker = startupTimeTracker;
        this.ozonTracker = ozonTracker;
        this.featureService = featureService;
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        INSTANCE.updateConfiguration$main_prodGoogleAllVendorsRelease(this.featureService);
        this.startupTimeTracker.c(this.ozonTracker);
    }
}
