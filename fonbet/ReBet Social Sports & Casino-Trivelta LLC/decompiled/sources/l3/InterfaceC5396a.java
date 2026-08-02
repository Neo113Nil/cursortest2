package l3;

import java.util.HashMap;
import k3.C5151c;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* renamed from: l3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5396a {
    @FormUrlEncoded
    @POST("/charge/mobile_charge")
    Call<C5151c> a(@FieldMap HashMap<String, String> hashMap);

    @FormUrlEncoded
    @POST("/charge/validate")
    Call<C5151c> b(@FieldMap HashMap<String, String> hashMap);

    @GET("/requery/{trans}")
    Call<C5151c> c(@Path("trans") String str);

    @FormUrlEncoded
    @POST("/charge/avs")
    Call<C5151c> d(@FieldMap HashMap<String, String> hashMap);
}
