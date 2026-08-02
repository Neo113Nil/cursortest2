package ff;

import W9.d;
import com.appsflyer.AppsFlyerProperties;
import com.bumptech.glide.gifdecoder.e;
import com.google.crypto.tink.integration.android.b;
import com.twilio.voice.Constants;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQRestResponse;
import com.zoho.livechat.android.modules.knowledgebase.data.datasources.remote.entities.ArticleActionResponse;
import com.zoho.livechat.android.modules.knowledgebase.data.datasources.remote.entities.ArticleCategoryResponse;
import com.zoho.livechat.android.modules.knowledgebase.data.datasources.remote.entities.SalesIQArticleResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JK\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0095\u0001\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001a0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\u0015\u001a\u00020\u00132\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ[\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001a0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006 À\u0006\u0001"}, d2 = {"Lff/a;", "", "", "screenName", "articleId", "languageCode", "appId", "Lretrofit2/Response;", "Lcom/zoho/livechat/android/modules/common/data/remote/responses/SalesIQRestResponse;", "Lcom/zoho/livechat/android/modules/knowledgebase/data/datasources/remote/entities/SalesIQArticleResponse;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/RequestBody;", "requestBody", "Lcom/zoho/livechat/android/modules/knowledgebase/data/datasources/remote/entities/ArticleActionResponse;", d.f13160a, "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "departmentId", "categoryId", "", "page", "limit", "searchQuery", "", "includeChildCategoryArticles", AppsFlyerProperties.CHANNEL, "", b.f37029b, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zoho/livechat/android/modules/knowledgebase/data/datasources/remote/entities/ArticleCategoryResponse;", e.f29601m, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ff.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4281a {
    static /* synthetic */ Object a(InterfaceC4281a interfaceC4281a, String str, String str2, String str3, String str4, int i10, int i11, String str5, String str6, Boolean bool, String str7, Continuation continuation, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getArticles");
        }
        if ((i12 & 4) != 0) {
            str3 = null;
        }
        if ((i12 & 8) != 0) {
            str4 = null;
        }
        if ((i12 & 16) != 0) {
            i10 = 1;
        }
        if ((i12 & 32) != 0) {
            i11 = 99;
        }
        if ((i12 & 64) != 0) {
            str5 = null;
        }
        if ((i12 & 128) != 0) {
            str6 = null;
        }
        if ((i12 & 256) != 0) {
            bool = null;
        }
        if ((i12 & 512) != 0) {
            str7 = Constants.PLATFORM_ANDROID;
        }
        return interfaceC4281a.b(str, str2, str3, str4, i10, i11, str5, str6, bool, str7, continuation);
    }

    @GET("/visitor/v2/{screen_name}/articles")
    @Nullable
    Object b(@Path("screen_name") @NotNull String str, @NotNull @Query("app_id") String str2, @Nullable @Query("department_id") String str3, @Nullable @Query("category_id") String str4, @Query("page") int i10, @Query("limit") int i11, @Nullable @Query("search_query") String str5, @Nullable @Query("language_code") String str6, @Nullable @Query("include_child_category_articles") Boolean bool, @Nullable @Query("channel") String str7, @NotNull Continuation<? super Response<SalesIQRestResponse<List<SalesIQArticleResponse>>>> continuation);

    @GET("/visitor/v2/{screen_name}/articles/{article_id}/translations/{language_code}")
    @Nullable
    Object c(@Path("screen_name") @NotNull String str, @Path("article_id") @Nullable String str2, @Path("language_code") @Nullable String str3, @NotNull @Query("app_id") String str4, @NotNull Continuation<? super Response<SalesIQRestResponse<SalesIQArticleResponse>>> continuation);

    @POST("/visitor/v2/{screen_name}/articles/{article_id}/vote")
    @Nullable
    Object d(@Path("screen_name") @NotNull String str, @Path("article_id") @Nullable String str2, @Body @NotNull RequestBody requestBody, @NotNull Continuation<? super Response<SalesIQRestResponse<ArticleActionResponse>>> continuation);

    @GET("/visitor/v3/{screen_name}/articlecategories")
    @Nullable
    Object e(@Path("screen_name") @NotNull String str, @NotNull @Query("app_id") String str2, @NotNull @Query("language_code") String str3, @Nullable @Query("department_id") String str4, @Nullable @Query("parent_category_id") String str5, @NotNull Continuation<? super Response<SalesIQRestResponse<List<ArticleCategoryResponse>>>> continuation);
}
