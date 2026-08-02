package y7;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.Response;

/* loaded from: classes2.dex */
public final class d extends Exception {

    /* renamed from: c, reason: collision with root package name */
    public static final a f68297c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Integer f68298a;

    /* renamed from: b, reason: collision with root package name */
    public final Headers f68299b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(Response response) {
            Intrinsics.checkNotNullParameter(response, "response");
            Response networkResponse = response.networkResponse();
            Integer valueOf = networkResponse != null ? Integer.valueOf(networkResponse.code()) : null;
            Response networkResponse2 = response.networkResponse();
            return new d(valueOf, networkResponse2 != null ? networkResponse2.headers() : null);
        }

        public a() {
        }
    }

    public d(Integer num, Headers headers) {
        this.f68298a = num;
        this.f68299b = headers;
    }
}
