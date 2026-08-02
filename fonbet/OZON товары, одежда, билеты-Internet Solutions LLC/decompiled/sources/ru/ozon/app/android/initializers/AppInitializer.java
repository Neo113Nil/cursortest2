package ru.ozon.app.android.initializers;

import Xh0.c;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/initializers/AppInitializer;", "", "", "", "Lru/ozon/app/android/startup/initializers/NamedActionInitializerProvider;", "initializerActions", "LXh0/c;", "startupTimeTracker", "<init>", "(Ljava/util/Map;LXh0/c;)V", "", "initialize", "()V", "Ljava/util/Map;", "LXh0/c;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppInitializer {

    @NotNull
    private final Map<Integer, NamedActionInitializerProvider> initializerActions;

    @NotNull
    private final c startupTimeTracker;

    public AppInitializer(@NotNull Map<Integer, NamedActionInitializerProvider> initializerActions, @NotNull c startupTimeTracker) {
        Intrinsics.checkNotNullParameter(initializerActions, "initializerActions");
        Intrinsics.checkNotNullParameter(startupTimeTracker, "startupTimeTracker");
        this.initializerActions = initializerActions;
        this.startupTimeTracker = startupTimeTracker;
    }

    public final void initialize() {
        Map<Integer, NamedActionInitializerProvider> map = this.initializerActions;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Iterator it = new TreeMap(map).entrySet().iterator();
        while (it.hasNext()) {
            NamedActionInitializerProvider namedActionInitializerProvider = (NamedActionInitializerProvider) ((Map.Entry) it.next()).getValue();
            this.startupTimeTracker.a(namedActionInitializerProvider.getTag());
            namedActionInitializerProvider.getProvider().get().init();
        }
    }
}
