package ru.ozon.app.android.session.logoutonall.data;

import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.POST;
import retrofit2.http.Path;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesApi;", "", "", "actionName", "Lio/reactivex/y;", "logoutOnAll", "(Ljava/lang/String;)Lio/reactivex/y;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface LogoutOnAllDevicesApi {
    @POST("composer-api.bx/_action/{actionName}")
    @NotNull
    y<Object> logoutOnAll(@Path("actionName") @NotNull String actionName);
}
