package r3;

import bet.prediction.response.GamesInfoData;
import bet.prediction.response.PredictionApi;
import bet.prediction.response.PredictionsApi;
import bet.prediction.response.SportsApi;
import bet.prediction.response.news.PostNews;
import bet.prediction.response.news.PostsNews;
import bet.prediction.response.support.SupportFrequentQuestionsApi;
import bet.prediction.response.support.SupportMessageApi;
import bet.prediction.response.support.SupportMessagesApi;
import bet.prediction.response.vtenth.AdvertApi;
import bet.prediction.response.vtenth.IdentifyApi;
import com.sports.insider.data.repository.room.billing.PricesTable;
import com.sports.insider.data.repository.room.sports.db.impl.SportsTable;
import com.sports.insider.data.room.general.table.AccountTable;
import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import eg.f0;
import gh.m0;
import gh.r0;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJQ\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022$\b\u0001\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\tj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001`\nH'¢\u0006\u0004\b\r\u0010\u000eJQ\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022$\b\u0001\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\tj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001`\nH'¢\u0006\u0004\b\u000f\u0010\u000eJQ\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022$\b\u0001\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\tj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001`\nH'¢\u0006\u0004\b\u0010\u0010\u000eJ7\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0012\u0010\u0013JQ\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022$\b\u0001\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\tj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001`\nH'¢\u0006\u0004\b\u0015\u0010\u000eJO\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022$\b\u0001\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\tj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001`\nH'¢\u0006\u0004\b\u0016\u0010\u000eJ)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0017\u0010\bJ5\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0018H'¢\u0006\u0004\b\u001b\u0010\u001cJO\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022$\b\u0001\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\tj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001`\nH'¢\u0006\u0004\b\u001d\u0010\u000eJO\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022$\b\u0001\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\tj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001`\nH'¢\u0006\u0004\b\u001e\u0010\u000eJ+\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0018H'¢\u0006\u0004\b\u001f\u0010 J+\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0018H'¢\u0006\u0004\b!\u0010 JO\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022$\b\u0001\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\tj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001`\nH'¢\u0006\u0004\b#\u0010\u000eJA\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0001\u0010'\u001a\u0004\u0018\u00010&H'¢\u0006\u0004\b)\u0010*JO\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022$\b\u0001\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\tj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001`\nH'¢\u0006\u0004\b,\u0010\u000eJ)\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b.\u0010\bJ)\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b/\u0010\bJO\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022$\b\u0001\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\tj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001`\nH'¢\u0006\u0004\b1\u0010\u000eJ3\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u00102\u001a\u00020\u0018H'¢\u0006\u0004\b4\u00105JM\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u00106\u001a\u0004\u0018\u00010\u00182\n\b\u0001\u00107\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u00108\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b:\u0010;J5\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b=\u0010\u0013J5\u0010>\u001a\b\u0012\u0004\u0012\u00020<0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b>\u0010\u0013J5\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b@\u0010\u0013J5\u0010A\u001a\b\u0012\u0004\u0012\u00020<0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\bA\u0010\u0013J[\u0010B\u001a\b\u0012\u0004\u0012\u00020<0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00022$\b\u0001\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\tj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001`\nH'¢\u0006\u0004\bB\u0010CJO\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00140\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022$\b\u0001\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\tj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001`\nH'¢\u0006\u0004\bD\u0010\u000e¨\u0006EÀ\u0006\u0003"}, d2 = {"Lr3/c;", "", "", "acceptLanguage", AccountTable.tokenColumn, "Leg/f0;", "Lbet/prediction/response/SportsApi;", "g", "(Ljava/lang/String;Ljava/lang/String;)Leg/f0;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "fields", "Lv3/e;", "v", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)Leg/f0;", "t", "q", "devId", "w", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Leg/f0;", "Lbet/prediction/response/vtenth/IdentifyApi;", "n", "f", "x", "", "id", "Lgh/r0;", "s", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Leg/f0;", "e", "p", "d", "(Ljava/lang/String;Ljava/lang/Integer;)Leg/f0;", "y", "Lbet/prediction/response/vtenth/AdvertApi;", "l", "Lgh/m0;", "msg", "Lgh/d0;", "file", "Lbet/prediction/response/support/SupportMessageApi;", "A", "(Ljava/lang/String;Ljava/lang/String;Lgh/m0;Lgh/d0;)Leg/f0;", "Lbet/prediction/response/support/SupportMessagesApi;", "o", "Lbet/prediction/response/support/SupportFrequentQuestionsApi;", "b", "k", "Lbet/prediction/response/news/PostsNews;", "z", "news", "Lbet/prediction/response/news/PostNews;", "m", "(Ljava/lang/String;Ljava/lang/String;I)Leg/f0;", SportsTable.ID_COLUMN, PredictionTable.startTimeColumn, PricesTable.endTimeColumn, "Lbet/prediction/response/PredictionsApi;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Leg/f0;", "Lbet/prediction/response/PredictionApi;", "r", "a", "Lbet/prediction/response/GamesInfoData;", "j", "u", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)Leg/f0;", "i", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface c {
    @qi.o("v10/support")
    @NotNull
    @qi.l
    f0<SupportMessageApi> A(@qi.i("Accept-Language") @NotNull String acceptLanguage, @qi.i("token") @NotNull String token, @qi.q("message") @Nullable m0 msg, @qi.q @Nullable gh.d0 file);

    @qi.f("v10/forecasts/{forecast}")
    @NotNull
    f0<PredictionApi> a(@qi.i("Accept-Language") @NotNull String acceptLanguage, @qi.i("token") @NotNull String token, @qi.s(encoded = true, value = "forecast") @Nullable String id2);

    @qi.f("v10/support/faq")
    @NotNull
    f0<SupportFrequentQuestionsApi> b(@qi.i("Accept-Language") @NotNull String acceptLanguage, @qi.i("token") @NotNull String token);

    @qi.f("v10/forecasts")
    @NotNull
    f0<PredictionsApi> c(@qi.i("Accept-Language") @NotNull String acceptLanguage, @qi.i("token") @NotNull String token, @Nullable @qi.t("sport_type_id") Integer idCategory, @Nullable @qi.t("start_time") String startTime, @Nullable @qi.t("end_time") String endTime);

    @qi.o("v10/advert/{id}/click")
    @NotNull
    f0<r0> d(@qi.i("token") @NotNull String token, @qi.s(encoded = true, value = "id") @Nullable Integer id2);

    @qi.e
    @qi.o("v10/rating")
    @NotNull
    f0<r0> e(@qi.i("Accept-Language") @NotNull String acceptLanguage, @qi.i("token") @NotNull String token, @NotNull @qi.d HashMap<String, Object> fields);

    @qi.e
    @qi.o("v10/user/identify/google")
    @NotNull
    f0<IdentifyApi> f(@qi.i("Accept-Language") @NotNull String acceptLanguage, @qi.i("token") @NotNull String token, @NotNull @qi.d HashMap<String, Object> fields);

    @qi.f("v10/sports")
    @NotNull
    f0<SportsApi> g(@qi.i("Accept-Language") @NotNull String acceptLanguage, @qi.i("token") @Nullable String token);

    @qi.e
    @qi.o("v10/purchase/google/forecasts/{forecast}")
    @NotNull
    f0<PredictionApi> h(@qi.i("Accept-Language") @NotNull String acceptLanguage, @qi.i("token") @NotNull String token, @qi.s(encoded = true, value = "forecast") @Nullable String id2, @NotNull @qi.d HashMap<String, Object> fields);

    @qi.e
    @qi.o("v11/purchase/google/subscription")
    @NotNull
    f0<IdentifyApi> i(@qi.i("Accept-Language") @NotNull String acceptLanguage, @qi.i("token") @NotNull String token, @NotNull @qi.d HashMap<String, Object> fields);

    @qi.f("v10/forecasts/{forecast}/games")
    @NotNull
    f0<GamesInfoData> j(@qi.i("Accept-Language") @NotNull String acceptLanguage, @qi.i("token") @NotNull String token, @qi.s(encoded = true, value = "forecast") @Nullable String id2);

    @qi.f("v10/support/active-subscribe-push")
    @NotNull
    f0<r0> k(@qi.i("Accept-Language") @NotNull String acceptLanguage, @qi.i("token") @NotNull String token);

    @qi.e
    @qi.o("v10/advert")
    @NotNull
    f0<AdvertApi> l(@qi.i("Accept-Language") @NotNull String acceptLanguage, @qi.i("token") @NotNull String token, @NotNull @qi.d HashMap<String, Object> fields);

    @qi.f("v10/news/{id}")
    @NotNull
    f0<PostNews> m(@qi.i("Accept-Language") @NotNull String acceptLanguage, @qi.i("token") @NotNull String token, @qi.s(encoded = true, value = "id") int news);

    @qi.e
    @qi.o("v10/user/identify")
    @NotNull
    f0<IdentifyApi> n(@qi.i("Accept-Language") @NotNull String acceptLanguage, @qi.i("token") @Nullable String token, @NotNull @qi.d HashMap<String, Object> fields);

    @qi.e
    @qi.o("v10/support/messages")
    @NotNull
    f0<SupportMessagesApi> o(@qi.i("Accept-Language") @NotNull String acceptLanguage, @qi.i("token") @NotNull String token, @NotNull @qi.d HashMap<String, Object> fields);

    @qi.e
    @qi.o("v10/rating/exist")
    @NotNull
    f0<r0> p(@qi.i("Accept-Language") @NotNull String acceptLanguage, @qi.i("token") @NotNull String token, @NotNull @qi.d HashMap<String, Object> fields);

    @qi.e
    @qi.o("v10/live/view")
    @NotNull
    f0<v3.e> q(@qi.i("Accept-Language") @NotNull String acceptLanguage, @qi.i("token") @Nullable String token, @NotNull @qi.d HashMap<String, Object> fields);

    @qi.f("v10/forecasts/{forecast}/preview")
    @NotNull
    f0<PredictionApi> r(@qi.i("Accept-Language") @NotNull String acceptLanguage, @qi.i("token") @NotNull String token, @qi.s(encoded = true, value = "forecast") @Nullable String id2);

    @qi.f("v10/announcements/{id}")
    @NotNull
    f0<r0> s(@qi.i("Accept-Language") @NotNull String acceptLanguage, @qi.i("token") @NotNull String token, @qi.s(encoded = true, value = "id") @Nullable Integer id2);

    @qi.e
    @qi.o("v10/metrics")
    @NotNull
    f0<v3.e> t(@qi.i("Accept-Language") @NotNull String acceptLanguage, @qi.i("token") @Nullable String token, @NotNull @qi.d HashMap<String, Object> fields);

    @qi.o("v10/purchase/bonus/forecasts/{forecast}")
    @NotNull
    f0<PredictionApi> u(@qi.i("Accept-Language") @NotNull String acceptLanguage, @qi.i("token") @NotNull String token, @qi.s(encoded = true, value = "forecast") @Nullable String id2);

    @qi.e
    @qi.o("v10/pushes")
    @NotNull
    f0<v3.e> v(@qi.i("Accept-Language") @NotNull String acceptLanguage, @qi.i("token") @Nullable String token, @NotNull @qi.d HashMap<String, Object> fields);

    @NotNull
    @qi.p("v10/isLive")
    f0<v3.e> w(@qi.i("Accept-Language") @NotNull String acceptLanguage, @qi.i("token") @Nullable String token, @qi.i("devId") @Nullable String devId);

    @qi.o("v10/user/identify/google/logout")
    @NotNull
    f0<IdentifyApi> x(@qi.i("Accept-Language") @NotNull String acceptLanguage, @qi.i("token") @NotNull String token);

    @qi.o("v10/advert/{id}/view")
    @NotNull
    f0<r0> y(@qi.i("token") @NotNull String token, @qi.s(encoded = true, value = "id") @Nullable Integer id2);

    @qi.e
    @qi.o("v10/news")
    @NotNull
    f0<PostsNews> z(@qi.i("Accept-Language") @NotNull String acceptLanguage, @qi.i("token") @NotNull String token, @NotNull @qi.d HashMap<String, Object> fields);
}
