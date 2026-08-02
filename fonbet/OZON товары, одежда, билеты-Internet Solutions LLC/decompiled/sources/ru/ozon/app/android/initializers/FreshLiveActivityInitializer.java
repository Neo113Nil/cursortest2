package ru.ozon.app.android.initializers;

import bh0.InterfaceC5666b;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.push.OzonPushManager;
import ru.ozon.app.android.startup.initializers.ActionInitializer;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/initializers/FreshLiveActivityInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "Lru/ozon/app/android/push/OzonPushManager;", "ozonPushManager", "", "Lbh0/b;", "listeners", "<init>", "(Lru/ozon/app/android/push/OzonPushManager;Ljava/util/Set;)V", "", "init", "()V", "Lru/ozon/app/android/push/OzonPushManager;", "Ljava/util/Set;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FreshLiveActivityInitializer implements ActionInitializer {

    @NotNull
    private final Set<InterfaceC5666b> listeners;

    @NotNull
    private final OzonPushManager ozonPushManager;

    public FreshLiveActivityInitializer(@NotNull OzonPushManager ozonPushManager, @NotNull Set<InterfaceC5666b> listeners) {
        Intrinsics.checkNotNullParameter(ozonPushManager, "ozonPushManager");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        this.ozonPushManager = ozonPushManager;
        this.listeners = listeners;
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            this.ozonPushManager.getLiveActivityInteractor().b((InterfaceC5666b) it.next());
        }
    }
}
