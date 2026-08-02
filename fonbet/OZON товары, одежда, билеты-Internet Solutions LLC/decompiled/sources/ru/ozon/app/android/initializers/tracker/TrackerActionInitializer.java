package ru.ozon.app.android.initializers.tracker;

import Kr.d;
import Kr.e;
import Qj0.C3891k;
import Qj0.U;
import android.annotation.SuppressLint;
import ei0.InterfaceC6369b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.startup.initializers.ActionInitializer;
import ru.ozon.app.android.storage.debug.DebugToolsService;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/initializers/tracker/TrackerActionInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "Lei0/b;", "tracker", "Lru/ozon/app/android/initializers/tracker/TrackerDynamicSettingsModifier;", "settingsModifier", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "debugToolsService", "<init>", "(Lei0/b;Lru/ozon/app/android/initializers/tracker/TrackerDynamicSettingsModifier;Lru/ozon/app/android/storage/debug/DebugToolsService;)V", "", "observeCommitHash", "()V", "", "hash", "putHash", "(Ljava/lang/String;)V", "init", "Lei0/b;", "Lru/ozon/app/android/initializers/tracker/TrackerDynamicSettingsModifier;", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TrackerActionInitializer implements ActionInitializer {

    @NotNull
    private final DebugToolsService debugToolsService;

    @NotNull
    private final TrackerDynamicSettingsModifier settingsModifier;

    @NotNull
    private final InterfaceC6369b tracker;

    public TrackerActionInitializer(@NotNull InterfaceC6369b tracker, @NotNull TrackerDynamicSettingsModifier settingsModifier, @NotNull DebugToolsService debugToolsService) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(settingsModifier, "settingsModifier");
        Intrinsics.checkNotNullParameter(debugToolsService, "debugToolsService");
        this.tracker = tracker;
        this.settingsModifier = settingsModifier;
        this.debugToolsService = debugToolsService;
    }

    @SuppressLint({"CheckResult"})
    private final void observeCommitHash() {
        this.debugToolsService.onCommitHashSaved().subscribe(new d(new TrackerActionInitializer$observeCommitHash$1(this), 2), new e(TrackerActionInitializer$observeCommitHash$2.INSTANCE, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void putHash(String hash) {
        Long x02;
        U u11;
        if (hash == null || (x02 = h.x0(16, hash)) == null) {
            return;
        }
        long longValue = x02.longValue();
        u11 = U.f23534h;
        u11.n(new C3891k(String.valueOf(longValue)), true);
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        this.tracker.b(false);
        this.tracker.g();
        observeCommitHash();
        this.settingsModifier.observeFeatureFlagChanged();
    }
}
