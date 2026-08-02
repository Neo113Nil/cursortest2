package K8;

import K8.b;
import X9.m;
import android.net.Uri;
import com.giphy.sdk.core.models.enums.LangType;
import com.giphy.sdk.core.models.enums.MediaType;
import com.giphy.sdk.core.models.enums.RatingType;
import com.giphy.sdk.core.network.response.ChannelsSearchResponse;
import com.giphy.sdk.core.network.response.ListMediaResponse;
import com.giphy.sdk.core.network.response.MediaResponse;
import com.giphy.sdk.core.network.response.TrendingSearchesResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import zendesk.core.Constants;

/* loaded from: classes2.dex */
public final class k implements c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f6399d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f6400a;

    /* renamed from: b, reason: collision with root package name */
    public final L8.d f6401b;

    /* renamed from: c, reason: collision with root package name */
    public final F8.a f6402c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public enum b {
        GET,
        POST,
        PUT,
        DELETE
    }

    public k(String apiKey, L8.d networkSession, F8.a analyticsId) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(networkSession, "networkSession");
        Intrinsics.checkNotNullParameter(analyticsId, "analyticsId");
        this.f6400a = apiKey;
        this.f6401b = networkSession;
        this.f6402c = analyticsId;
    }

    public static final void n(k this$0, final K8.a completionHandler) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(completionHandler, "$completionHandler");
        this$0.f6401b.b().execute(new Runnable() { // from class: K8.j
            @Override // java.lang.Runnable
            public final void run() {
                k.o(a.this);
            }
        });
    }

    public static final void o(K8.a completionHandler) {
        Intrinsics.checkNotNullParameter(completionHandler, "$completionHandler");
        completionHandler.a(null, new IllegalArgumentException("gifId must not be blank"));
    }

    public static final void q(k this$0, final K8.a completionHandler) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(completionHandler, "$completionHandler");
        this$0.f6401b.b().execute(new Runnable() { // from class: K8.h
            @Override // java.lang.Runnable
            public final void run() {
                k.r(a.this);
            }
        });
    }

    public static final void r(K8.a completionHandler) {
        Intrinsics.checkNotNullParameter(completionHandler, "$completionHandler");
        completionHandler.a(null, new IllegalArgumentException("gifIds must not be empty"));
    }

    public static final void s(k this$0, final K8.a completionHandler) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(completionHandler, "$completionHandler");
        this$0.f6401b.b().execute(new Runnable() { // from class: K8.i
            @Override // java.lang.Runnable
            public final void run() {
                k.t(a.this);
            }
        });
    }

    public static final void t(K8.a completionHandler) {
        Intrinsics.checkNotNullParameter(completionHandler, "$completionHandler");
        completionHandler.a(null, new IllegalArgumentException("gifId must not be blank"));
    }

    public static final Object w(k this$0, Map map, Uri serverUrl, String path, b method, Class responseClass) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(serverUrl, "$serverUrl");
        Intrinsics.checkNotNullParameter(path, "$path");
        Intrinsics.checkNotNullParameter(method, "$method");
        Intrinsics.checkNotNullParameter(responseClass, "$responseClass");
        String c10 = this$0.f6402c.c();
        if (map != null) {
        }
        J8.d dVar = J8.d.f5962a;
        Map mutableMap = MapsKt.toMutableMap(dVar.c());
        mutableMap.put(Constants.USER_AGENT_HEADER_KEY, "Android " + dVar.e() + " v" + dVar.f());
        return this$0.f6401b.c(serverUrl, path, method, responseClass, map, mutableMap).q();
    }

    @Override // K8.c
    public Future a(String searchQuery, int i10, int i11, K8.a completionHandler) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("api_key", this.f6400a), TuplesKt.to("q", searchQuery));
        hashMapOf.put("limit", String.valueOf(i10));
        hashMapOf.put("offset", String.valueOf(i11));
        return v(K8.b.f6359a.e(), b.C0135b.f6371a.b(), b.GET, ChannelsSearchResponse.class, hashMapOf).l(completionHandler);
    }

    public Future i(String query, LangType langType, K8.a completionHandler) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("api_key", this.f6400a), TuplesKt.to(m.f13664a, query), TuplesKt.to("pingback_id", E8.a.f3012a.e().i().b()));
        if (langType != null) {
            hashMapOf.put("lang", langType.getLang());
        }
        return v(K8.b.f6359a.e(), b.C0135b.f6371a.a(), b.GET, ListMediaResponse.class, hashMapOf).l(completionHandler);
    }

    public Future j(Integer num, Integer num2, RatingType ratingType, K8.a completionHandler) {
        Unit unit;
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("api_key", this.f6400a));
        if (num != null) {
            hashMapOf.put("limit", String.valueOf(num.intValue()));
        }
        if (num2 != null) {
            hashMapOf.put("offset", String.valueOf(num2.intValue()));
        }
        if (ratingType != null) {
            hashMapOf.put("rating", ratingType.getRating());
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            hashMapOf.put("rating", RatingType.pg13.getRating());
        }
        return v(K8.b.f6359a.e(), b.C0135b.f6371a.c(), b.GET, ListMediaResponse.class, hashMapOf).l(N8.a.c(completionHandler, true, false, false, 6, null));
    }

    public Future k(String id2, K8.a completionHandler) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("api_key", this.f6400a));
        Uri e10 = K8.b.f6359a.e();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(b.C0135b.f6371a.d(), Arrays.copyOf(new Object[]{id2}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return v(e10, format, b.GET, ListMediaResponse.class, hashMapOf).l(N8.a.c(completionHandler, true, false, false, 6, null));
    }

    public final String l() {
        return this.f6400a;
    }

    public Future m(String gifId, final K8.a completionHandler) {
        Intrinsics.checkNotNullParameter(gifId, "gifId");
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        if (StringsKt.isBlank(gifId)) {
            Future<?> submit = this.f6401b.d().submit(new Runnable() { // from class: K8.d
                @Override // java.lang.Runnable
                public final void run() {
                    k.n(k.this, completionHandler);
                }
            });
            Intrinsics.checkNotNullExpressionValue(submit, "networkSession.networkRe…          }\n            }");
            return submit;
        }
        HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("api_key", this.f6400a));
        Uri e10 = K8.b.f6359a.e();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(b.C0135b.f6371a.e(), Arrays.copyOf(new Object[]{gifId}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return v(e10, format, b.GET, MediaResponse.class, hashMapOf).l(completionHandler);
    }

    public Future p(List gifIds, final K8.a completionHandler, String str) {
        Intrinsics.checkNotNullParameter(gifIds, "gifIds");
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        if (gifIds.isEmpty()) {
            Future<?> submit = this.f6401b.d().submit(new Runnable() { // from class: K8.f
                @Override // java.lang.Runnable
                public final void run() {
                    k.q(k.this, completionHandler);
                }
            });
            Intrinsics.checkNotNullExpressionValue(submit, "networkSession.networkRe…          }\n            }");
            return submit;
        }
        HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("api_key", this.f6400a));
        if (str != null) {
            hashMapOf.put("context", str);
        }
        StringBuilder sb2 = new StringBuilder();
        int size = gifIds.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (StringsKt.isBlank((CharSequence) gifIds.get(i10))) {
                Future<?> submit2 = this.f6401b.d().submit(new Runnable() { // from class: K8.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.s(k.this, completionHandler);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(submit2, "networkSession.networkRe…      }\n                }");
                return submit2;
            }
            sb2.append((String) gifIds.get(i10));
            if (i10 < gifIds.size() - 1) {
                sb2.append(",");
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "str.toString()");
        hashMapOf.put("ids", sb3);
        return v(K8.b.f6359a.e(), b.C0135b.f6371a.f(), b.GET, ListMediaResponse.class, hashMapOf).l(completionHandler);
    }

    public final String u(MediaType mediaType) {
        return mediaType == MediaType.sticker ? "stickers" : mediaType == MediaType.text ? "text" : mediaType == MediaType.video ? "videos" : "gifs";
    }

    public final M8.e v(final Uri serverUrl, final String path, final b method, final Class responseClass, final Map map) {
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(responseClass, "responseClass");
        return new M8.e(new Callable() { // from class: K8.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object w10;
                w10 = k.w(k.this, map, serverUrl, path, method, responseClass);
                return w10;
            }
        }, this.f6401b.d(), this.f6401b.b());
    }

    public Future x(String searchQuery, MediaType mediaType, Integer num, Integer num2, RatingType ratingType, LangType langType, K8.a completionHandler) {
        Unit unit;
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("api_key", this.f6400a), TuplesKt.to("q", searchQuery), TuplesKt.to("pingback_id", E8.a.f3012a.e().i().b()));
        if (num != null) {
            hashMapOf.put("limit", String.valueOf(num.intValue()));
        }
        if (num2 != null) {
            hashMapOf.put("offset", String.valueOf(num2.intValue()));
        }
        if (ratingType != null) {
            hashMapOf.put("rating", ratingType.getRating());
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            hashMapOf.put("rating", RatingType.pg13.getRating());
        }
        if (langType != null) {
            hashMapOf.put("lang", langType.getLang());
        }
        Uri e10 = K8.b.f6359a.e();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(b.C0135b.f6371a.h(), Arrays.copyOf(new Object[]{u(mediaType)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return v(e10, format, b.GET, ListMediaResponse.class, hashMapOf).l(N8.a.c(completionHandler, false, mediaType == MediaType.text, false, 5, null));
    }

    public Future y(MediaType mediaType, Integer num, Integer num2, RatingType ratingType, K8.a completionHandler) {
        Unit unit;
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("api_key", this.f6400a), TuplesKt.to("pingback_id", E8.a.f3012a.e().i().b()));
        if (num != null) {
            hashMapOf.put("limit", String.valueOf(num.intValue()));
        }
        if (num2 != null) {
            hashMapOf.put("offset", String.valueOf(num2.intValue()));
        }
        if (ratingType != null) {
            hashMapOf.put("rating", ratingType.getRating());
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            hashMapOf.put("rating", RatingType.pg13.getRating());
        }
        Uri e10 = K8.b.f6359a.e();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(b.C0135b.f6371a.i(), Arrays.copyOf(new Object[]{u(mediaType)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return v(e10, format, b.GET, ListMediaResponse.class, hashMapOf).l(N8.a.c(completionHandler, false, mediaType == MediaType.text, false, 5, null));
    }

    public Future z(K8.a completionHandler) {
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        return v(K8.b.f6359a.e(), b.C0135b.f6371a.j(), b.GET, TrendingSearchesResponse.class, MapsKt.hashMapOf(TuplesKt.to("api_key", this.f6400a))).l(completionHandler);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ k(String str, L8.d dVar, F8.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, dVar, aVar);
        String str2;
        dVar = (i10 & 2) != 0 ? new L8.c() : dVar;
        if ((i10 & 4) != 0) {
            str2 = str;
            aVar = new F8.a(str2, false, false, 6, null);
        } else {
            str2 = str;
        }
    }
}
