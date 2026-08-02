package ru.ozon.android.messenger.framework.core.initialization.di;

import gi.C6740b;
import gi.InterfaceC6741c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.di.B;

/* loaded from: classes6.dex */
public final class b implements InterfaceC6741c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6740b f87308a;

    public b(@NotNull ru.ozon.android.messenger.framework.core.initialization.d messengerConfig) {
        Intrinsics.checkNotNullParameter(messengerConfig, "messengerConfig");
        this.f87308a = B.a().a(messengerConfig.getAppContext(), messengerConfig.getNetworkConfig(), messengerConfig.getOkHttpClient(), messengerConfig, messengerConfig.getFeatureProvider(), messengerConfig.getNonFatalLogger(), messengerConfig.getMoshiAdapters(), messengerConfig.getBlocks(), messengerConfig.getUnreadMsgCountChangedListener(), messengerConfig.getMessengerLifecycleCallback(), messengerConfig.getTrackerAnalyticsAdapter(), messengerConfig.getMessengerExternalActionHandler(), messengerConfig.getBlockCustomSettings(), messengerConfig.getComposerDependencies().getAppVersionConfig(), messengerConfig.getComposerDependencies().getOzonTracker()).getComponentStorage();
    }

    @Override // gi.InterfaceC6741c
    @NotNull
    public final C6740b getDependencyStorage() {
        return this.f87308a;
    }
}
