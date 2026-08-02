package ru.ozon.app.android.marketing.domain;

import io.reactivex.AbstractC7094b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/marketing/domain/NotificationSettingsApi;", "", "Lru/ozon/app/android/marketing/domain/ChangeSettingRequest;", "request", "Lio/reactivex/b;", "changeSetting", "(Lru/ozon/app/android/marketing/domain/ChangeSettingRequest;)Lio/reactivex/b;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface NotificationSettingsApi {
    @POST("composer-api.bx/_action/settings/v1/setting")
    @NotNull
    AbstractC7094b changeSetting(@Body @NotNull ChangeSettingRequest request);
}
