package zendesk.core;

import com.google.gson.h;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

/* loaded from: classes5.dex */
interface SdkSettingsService {
    @GET("/api/private/mobile_sdk/settings/{applicationId}.json")
    Call<Map<String, h>> getSettings(@Header("Accept-Language") String str, @Path("applicationId") String str2);
}
