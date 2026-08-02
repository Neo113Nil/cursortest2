package ru.ozon.tracker.performance;

import B0.A0;
import Qj0.L;
import Qj0.N;
import Qj0.O;
import Qj0.U;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.b;

/* loaded from: classes7.dex */
public final class ServerTimingsParser {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final List<String> f97773c = C7714v.b0(ServerTimeKeys.ST_KEY_CDN_CACHE.getValue(), ServerTimeKeys.ST_KEY_EDGE_CACHE.getValue(), ServerTimeKeys.ST_KEY_EDGE_CENTER.getValue());

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Uj0.a f97774a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final A0 f97775b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/tracker/performance/ServerTimingsParser$ServerTimeKeys;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ST_KEY_RESOLVE", "ST_KEY_WIDGETS", "ST_KEY_TOTAL", "ST_KEY_INTERNAL", "ST_KEY_COMPOSER_FB", "ST_KEY_CDN_CACHE", "ST_KEY_EDGE", "ST_KEY_IMG_CACHE", "ST_KEY_IMG_RESIZE", "ST_KEY_EDGE_IP", "ST_KEY_EDGE_CACHE", "ST_KEY_EDGE_CENTER", "REQUEST_ID", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ServerTimeKeys {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ ServerTimeKeys[] $VALUES;

        @NotNull
        private final String value;
        public static final ServerTimeKeys ST_KEY_RESOLVE = new ServerTimeKeys("ST_KEY_RESOLVE", 0, "Resolve");
        public static final ServerTimeKeys ST_KEY_WIDGETS = new ServerTimeKeys("ST_KEY_WIDGETS", 1, "Widgets");
        public static final ServerTimeKeys ST_KEY_TOTAL = new ServerTimeKeys("ST_KEY_TOTAL", 2, "Total");
        public static final ServerTimeKeys ST_KEY_INTERNAL = new ServerTimeKeys("ST_KEY_INTERNAL", 3, "Internal");
        public static final ServerTimeKeys ST_KEY_COMPOSER_FB = new ServerTimeKeys("ST_KEY_COMPOSER_FB", 4, "FirstByte");
        public static final ServerTimeKeys ST_KEY_CDN_CACHE = new ServerTimeKeys("ST_KEY_CDN_CACHE", 5, "cdn-cache");
        public static final ServerTimeKeys ST_KEY_EDGE = new ServerTimeKeys("ST_KEY_EDGE", 6, "edge");
        public static final ServerTimeKeys ST_KEY_IMG_CACHE = new ServerTimeKeys("ST_KEY_IMG_CACHE", 7, "o3_img_cache");
        public static final ServerTimeKeys ST_KEY_IMG_RESIZE = new ServerTimeKeys("ST_KEY_IMG_RESIZE", 8, "o3_img_resize");
        public static final ServerTimeKeys ST_KEY_EDGE_IP = new ServerTimeKeys("ST_KEY_EDGE_IP", 9, "edge_ip");
        public static final ServerTimeKeys ST_KEY_EDGE_CACHE = new ServerTimeKeys("ST_KEY_EDGE_CACHE", 10, "cdn_edge_cache");
        public static final ServerTimeKeys ST_KEY_EDGE_CENTER = new ServerTimeKeys("ST_KEY_EDGE_CENTER", 11, "ec_cache");
        public static final ServerTimeKeys REQUEST_ID = new ServerTimeKeys("REQUEST_ID", 12, "RequestID");

        private static final /* synthetic */ ServerTimeKeys[] $values() {
            return new ServerTimeKeys[]{ST_KEY_RESOLVE, ST_KEY_WIDGETS, ST_KEY_TOTAL, ST_KEY_INTERNAL, ST_KEY_COMPOSER_FB, ST_KEY_CDN_CACHE, ST_KEY_EDGE, ST_KEY_IMG_CACHE, ST_KEY_IMG_RESIZE, ST_KEY_EDGE_IP, ST_KEY_EDGE_CACHE, ST_KEY_EDGE_CENTER, REQUEST_ID};
        }

        static {
            ServerTimeKeys[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private ServerTimeKeys(String str, int i11, String str2) {
            this.value = str2;
        }

        @NotNull
        public static Xc.a<ServerTimeKeys> getEntries() {
            return $ENTRIES;
        }

        public static ServerTimeKeys valueOf(String str) {
            return (ServerTimeKeys) Enum.valueOf(ServerTimeKeys.class, str);
        }

        public static ServerTimeKeys[] values() {
            return (ServerTimeKeys[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public ServerTimingsParser(int i11) {
        this.f97774a = new Uj0.a();
        this.f97775b = new A0(3);
    }

    public static String a(@NotNull String header, @NotNull ServerTimeKeys paramKey) {
        List m11;
        Object Q11;
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(paramKey, "paramKey");
        Iterator it = h.m(header, new String[]{","}, 0, 6).iterator();
        do {
            if (!it.hasNext()) {
                return null;
            }
            m11 = h.m((String) it.next(), new String[]{";"}, 0, 6);
            Q11 = C7714v.Q(0, m11);
        } while (((String) (Intrinsics.d((String) Q11, paramKey.getValue()) ? Q11 : null)) == null);
        return b(m11);
    }

    private static String b(List list) {
        String substring;
        String str = (String) C7714v.Q(1, list);
        if (str != null) {
            int J11 = h.J(str, "=", 0, false, 6);
            if (J11 == -1) {
                substring = null;
            } else {
                substring = str.substring(J11 + 1, str.length());
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            }
            if (substring != null) {
                return h.B0(substring, '\"');
            }
        }
        return null;
    }

    private final void d(List<String> list, U u11) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        String i02;
        String i03;
        U trace = u11;
        ArrayList arrayList = new ArrayList();
        List<String> list2 = list;
        ArrayList arrayList2 = new ArrayList(C7714v.z(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            int i11 = 6;
            List m11 = h.m((String) it.next(), new String[]{","}, 0, 6);
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = m11.iterator();
            while (it2.hasNext()) {
                List m12 = h.m((String) it2.next(), new String[]{";"}, 0, i11);
                String obj5 = h.z0((String) C7714v.K(m12)).toString();
                List list3 = m12;
                Iterator it3 = list3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj3 = null;
                        break;
                    } else {
                        obj3 = it3.next();
                        if (h.e0((String) obj3, "dur=", false)) {
                            break;
                        }
                    }
                }
                String str = (String) obj3;
                Double u02 = (str == null || (i03 = h.i0(str, "=")) == null) ? null : h.u0(i03);
                Iterator it4 = list3.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj4 = null;
                        break;
                    } else {
                        obj4 = it4.next();
                        if (h.e0((String) obj4, "desc=", false)) {
                            break;
                        }
                    }
                }
                String str2 = (String) obj4;
                arrayList.add(new b.a(obj5, u02, (str2 == null || (i02 = h.i0(str2, "=")) == null) ? null : h.B0(i02, '\"')));
                String b11 = b(m12);
                Pair pair = b11 != null ? new Pair(obj5, b11) : null;
                if (pair != null) {
                    arrayList3.add(pair);
                }
                i11 = 6;
            }
            arrayList2.add(arrayList3);
        }
        ArrayList N11 = C7714v.N(arrayList2);
        Iterator it5 = N11.iterator();
        while (it5.hasNext()) {
            Pair pair2 = (Pair) it5.next();
            String name = (String) pair2.e();
            String value = (String) pair2.f();
            if (value.length() != 0) {
                this.f97775b.getClass();
                Uj0.a ServerTimingsParserInterceptor = this.f97774a;
                Intrinsics.checkNotNullParameter(ServerTimingsParserInterceptor, "$this$ServerTimingsParserInterceptor");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(trace, "trace");
                ServerTimingsParserInterceptor.getClass();
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(trace, "trace");
                if (Intrinsics.d(name, ServerTimeKeys.ST_KEY_RESOLVE.getValue())) {
                    U.p(trace, MetricType.ST_RESOLVE, (long) Double.parseDouble(value), false, 4);
                    trace = u11;
                } else if (Intrinsics.d(name, ServerTimeKeys.ST_KEY_WIDGETS.getValue())) {
                    trace = u11;
                    U.p(trace, MetricType.ST_WIDGETS, (long) Double.parseDouble(value), false, 4);
                } else if (Intrinsics.d(name, ServerTimeKeys.ST_KEY_TOTAL.getValue())) {
                    trace = u11;
                    U.p(trace, MetricType.ST_TOTAL, (long) Double.parseDouble(value), false, 4);
                } else if (Intrinsics.d(name, ServerTimeKeys.ST_KEY_INTERNAL.getValue())) {
                    trace = u11;
                    U.p(trace, MetricType.ST_INTERNAL, (long) Double.parseDouble(value), false, 4);
                } else if (Intrinsics.d(name, ServerTimeKeys.ST_KEY_COMPOSER_FB.getValue())) {
                    trace = u11;
                    U.p(trace, MetricType.ST_COMPOSER_FB, (long) Double.parseDouble(value), false, 4);
                } else if (Intrinsics.d(name, ServerTimeKeys.ST_KEY_EDGE.getValue())) {
                    trace = u11;
                    U.p(trace, MetricType.EDGE_TIME, (long) Double.parseDouble(value), false, 4);
                } else if (Intrinsics.d(name, ServerTimeKeys.ST_KEY_IMG_RESIZE.getValue())) {
                    trace = u11;
                    U.p(trace, MetricType.IMG_RESIZE_TIME, (long) Double.parseDouble(value), false, 4);
                } else {
                    trace = u11;
                    if (Intrinsics.d(name, ServerTimeKeys.ST_KEY_EDGE_IP.getValue())) {
                        O o11 = new O(value);
                        int i12 = U.f23535i;
                        trace.n(o11, true);
                    } else if (Intrinsics.d(name, ServerTimeKeys.REQUEST_ID.getValue())) {
                        L l11 = new L(value);
                        int i13 = U.f23535i;
                        trace.n(l11, true);
                    }
                }
            }
        }
        Iterator it6 = N11.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it6.next();
                if (f97773c.contains(((Pair) obj).e())) {
                    break;
                }
            }
        }
        Pair pair3 = (Pair) obj;
        String str3 = pair3 != null ? (String) pair3.f() : null;
        Iterator it7 = N11.iterator();
        while (true) {
            if (!it7.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it7.next();
                if (Intrinsics.d(((Pair) obj2).e(), ServerTimeKeys.ST_KEY_IMG_CACHE.getValue())) {
                    break;
                }
            }
        }
        Pair pair4 = (Pair) obj2;
        String str4 = pair4 != null ? (String) pair4.f() : null;
        N n11 = new N((Intrinsics.d(str3, "MISS") && Intrinsics.d(str4, "HIT")) ? CacheResult.NGINX : Intrinsics.d(str3, "HIT") ? CacheResult.CDN : (str3 == null && Intrinsics.d(str4, "HIT")) ? CacheResult.CDN : (Intrinsics.d(str3, "MISS") && Intrinsics.d(str4, "MISS")) ? CacheResult.MISS_ALL : (str3 == null && Intrinsics.d(str4, "MISS")) ? CacheResult.MISS_ALL : CacheResult.CACHE_TYPE_UNKNOWN);
        int i14 = U.f23535i;
        trace.n(n11, true);
        trace.n(new b(arrayList), true);
    }

    public final void c(@NotNull We.L response, @NotNull U trace) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(trace, "trace");
        d(response.s("server-timing"), trace);
    }

    public final void e(@NotNull Map<String, ? extends List<String>> headers, @NotNull U trace) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(trace, "trace");
        List<String> list = headers.get("server-timing");
        if (list == null) {
            return;
        }
        d(list, trace);
    }

    public ServerTimingsParser() {
        this(0);
    }
}
