package ru.ozon.app.android.thirdpartylibs.config;

import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/thirdpartylibs/config/ThirdPartyLibrariesConfigApi;", "", "Lio/reactivex/y;", "Lru/ozon/app/android/thirdpartylibs/config/ThirdPartyLibrariesConfigResponse;", "getThirdPartyLibrariesConfig", "()Lio/reactivex/y;", "third-party-libs-config_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ThirdPartyLibrariesConfigApi {
    @GET("composer-api.bx/_action/get3rdPartyConfig")
    @NotNull
    y<ThirdPartyLibrariesConfigResponse> getThirdPartyLibrariesConfig();
}
