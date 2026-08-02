package ru.ozon.app.android.di.component;

import Hg0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.hosts.CoreHosts;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/di/component/BaseApiUrlProvider;", "", "hosts", "Lru/ozon/app/android/storage/hosts/CoreHosts;", "<init>", "(Lru/ozon/app/android/storage/hosts/CoreHosts;)V", "getApiBaseUrl", "", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BaseApiUrlProvider {

    @NotNull
    private final CoreHosts hosts;
    public static final int $stable = 8;

    public BaseApiUrlProvider(@NotNull CoreHosts hosts) {
        Intrinsics.checkNotNullParameter(hosts, "hosts");
        this.hosts = hosts;
    }

    @NotNull
    public final String getApiBaseUrl() {
        Intrinsics.checkNotNullParameter("debug.ozon.useAutoTestApi", "propName");
        Boolean b11 = a.b("debug.ozon.useAutoTestApi");
        return b11 != null ? b11.booleanValue() : false ? "https://bx-app-wiremock-latest.stg.a.o3.ru/" : this.hosts.getBaseUrl();
    }
}
