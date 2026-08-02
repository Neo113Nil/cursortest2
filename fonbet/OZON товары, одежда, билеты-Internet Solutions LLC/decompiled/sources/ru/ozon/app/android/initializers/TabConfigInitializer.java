package ru.ozon.app.android.initializers;

import Kr.d;
import Kr.e;
import Lm0.a;
import android.annotation.SuppressLint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.startup.initializers.ActionInitializer;
import ru.ozon.app.android.tabbar.data.local.TabConfigCache;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/initializers/TabConfigInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "cache", "Lru/ozon/app/android/tabbar/data/local/TabConfigCache;", "<init>", "(Lru/ozon/app/android/tabbar/data/local/TabConfigCache;)V", "init", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TabConfigInitializer implements ActionInitializer {

    @NotNull
    private final TabConfigCache cache;

    public TabConfigInitializer(@NotNull TabConfigCache cache) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.cache = cache;
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    @SuppressLint({"CheckResult"})
    public void init() {
        this.cache.retrieveCacheTabConfigs().h(new d(TabConfigInitializer$init$1.INSTANCE, 1), new e(new TabConfigInitializer$init$2(a.f17149a), 2));
    }
}
