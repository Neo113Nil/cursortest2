package Jd;

import com.zoho.livechat.android.modules.brand.data.remote.entities.BrandStatus;
import com.zoho.livechat.android.modules.brand.data.remote.entities.FormResponse;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQRestResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J?\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0091\u0001\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0014H§@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"LJd/a;", "", "", "screenName", "appId", "components", "Lretrofit2/Response;", "Lcom/zoho/livechat/android/modules/common/data/remote/responses/SalesIQRestResponse;", "Lcom/zoho/livechat/android/modules/brand/data/remote/entities/BrandStatus;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "avuid", "", "clearContext", "appStatus", "visitorQuestion", "fetchAllFields", "", "version", "visibility", "", "lastSyncTime", "Lcom/zoho/livechat/android/modules/brand/data/remote/entities/FormResponse;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {
    static /* synthetic */ Object b(a aVar, String str, String str2, String str3, boolean z10, String str4, String str5, Boolean bool, Integer num, String str6, Long l10, Continuation continuation, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getForms");
        }
        if ((i10 & 16) != 0) {
            str4 = null;
        }
        if ((i10 & 32) != 0) {
            str5 = null;
        }
        if ((i10 & 64) != 0) {
            bool = null;
        }
        if ((i10 & 128) != 0) {
            num = null;
        }
        if ((i10 & 256) != 0) {
            str6 = null;
        }
        if ((i10 & 512) != 0) {
            l10 = null;
        }
        return aVar.c(str, str2, str3, z10, str4, str5, bool, num, str6, l10, continuation);
    }

    @GET("visitor/v2/{screen_name}/apps/{app_id}/presence")
    @Nullable
    Object a(@Path("screen_name") @NotNull String str, @Path("app_id") @NotNull String str2, @NotNull @Query("components") String str3, @NotNull Continuation<? super Response<SalesIQRestResponse<BrandStatus>>> continuation);

    @GET("visitor/v2/{screen_name}/apps/{app_id}/forms/prechat")
    @Nullable
    Object c(@Path("screen_name") @NotNull String str, @Path("app_id") @NotNull String str2, @NotNull @Query("avuid") String str3, @Query("clear_context") boolean z10, @Nullable @Query("app_status") String str4, @Nullable @Query("visitor_question") String str5, @Nullable @Query("fetchallfields") Boolean bool, @Nullable @Query("version") Integer num, @Nullable @Query("visibility") String str6, @Nullable @Query("last_sync_time") Long l10, @NotNull Continuation<? super Response<SalesIQRestResponse<FormResponse>>> continuation);
}
