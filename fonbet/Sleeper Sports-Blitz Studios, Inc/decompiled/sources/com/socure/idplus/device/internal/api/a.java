package com.socure.idplus.device.internal.api;

import com.socure.idplus.device.internal.behavior.model.SessionDataRequest;
import com.socure.idplus.device.internal.behavior.model.SessionDataResponse;
import com.socure.idplus.device.internal.sigmaDeviceV2.model.CreateCustomerSession;
import com.socure.idplus.device.internal.sigmaDeviceV2.model.CreateSessionWindowRequest;
import com.socure.idplus.device.internal.sigmaDeviceV2.model.CreateSessionWindowResponse;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import org.mp4parser.boxes.threegpp.ts26244.AuthorBox;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'J\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH'J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\rH'¨\u0006\u000f"}, d2 = {"Lcom/socure/idplus/device/internal/api/a;", "", "", AuthorBox.TYPE, "Lcom/socure/idplus/device/internal/behavior/model/SessionDataRequest;", "uploadSessionData", "Lretrofit2/Call;", "Lcom/socure/idplus/device/internal/behavior/model/SessionDataResponse;", "a", "Lokhttp3/ResponseBody;", "Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/CreateSessionWindowRequest;", "createSessionWindowRequest", "Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/CreateSessionWindowResponse;", "Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/CreateCustomerSession;", "createCustomerSession", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public interface a {
    @Headers({"Content-Type: application/json"})
    @POST("api/v1/capture")
    Call<ResponseBody> a(@Header("Authorization") String auth);

    @Headers({"Content-Type: application/json"})
    @POST("api/v1/session-data")
    Call<SessionDataResponse> a(@Header("Authorization") String auth, @Body SessionDataRequest uploadSessionData);

    @Headers({"Content-Type: application/json"})
    @POST("api/v1/customer-session")
    Call<ResponseBody> a(@Header("Authorization") String auth, @Body CreateCustomerSession createCustomerSession);

    @Headers({"Content-Type: application/json"})
    @POST("api/v1/session-window")
    Call<CreateSessionWindowResponse> a(@Header("Authorization") String auth, @Body CreateSessionWindowRequest createSessionWindowRequest);
}
