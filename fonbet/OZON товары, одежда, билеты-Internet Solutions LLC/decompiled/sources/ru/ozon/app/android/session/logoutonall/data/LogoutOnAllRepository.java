package ru.ozon.app.android.session.logoutonall.data;

import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllRepository;", "", "Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesApi;", "api", "<init>", "(Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesApi;)V", "", "actionName", "Lio/reactivex/y;", "logoutOnAll", "(Ljava/lang/String;)Lio/reactivex/y;", "Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesApi;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LogoutOnAllRepository {

    @NotNull
    private final LogoutOnAllDevicesApi api;

    public LogoutOnAllRepository(@NotNull LogoutOnAllDevicesApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    @NotNull
    public final y<Object> logoutOnAll(@NotNull String actionName) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        return this.api.logoutOnAll(actionName);
    }
}
