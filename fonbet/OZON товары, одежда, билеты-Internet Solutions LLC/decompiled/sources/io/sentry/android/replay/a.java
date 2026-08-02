package io.sentry.android.replay;

import com.google.android.gms.common.internal.ImagesContract;
import io.sentry.C7141f;
import io.sentry.E;
import io.sentry.I2;
import io.sentry.InterfaceC7179o1;
import io.sentry.W2;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a implements InterfaceC7179o1 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Object f67439c = Sc.k.a(Sc.n.NONE, C1105a.f67443b);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final HashSet<String> f67440d;

    /* renamed from: a, reason: collision with root package name */
    private String f67441a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<C7141f, io.sentry.util.network.a> f67442b;

    /* renamed from: io.sentry.android.replay.a$a, reason: collision with other inner class name */
    static final class C1105a extends AbstractC7737t implements Function0<Regex> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1105a f67443b = new C1105a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Regex invoke() {
            return new Regex("_[a-z]");
        }
    }

    private final class b implements W2.a {

        /* renamed from: a, reason: collision with root package name */
        private final W2.a f67444a;

        public b(W2.a aVar) {
            this.f67444a = aVar;
        }

        @Override // io.sentry.W2.a
        public final C7141f a(@NotNull C7141f breadcrumb, @NotNull E hint) {
            Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
            Intrinsics.checkNotNullParameter(hint, "hint");
            W2.a aVar = this.f67444a;
            if (aVar != null) {
                breadcrumb = aVar.a(breadcrumb, hint);
            }
            if (breadcrumb != null) {
                io.sentry.util.network.a aVar2 = null;
                if (Intrinsics.d(breadcrumb.m(), "http") || Intrinsics.d(breadcrumb.h(), "http")) {
                    Object d11 = hint.d("sentry:replayNetworkDetails");
                    if (d11 instanceof io.sentry.util.network.a) {
                        aVar2 = (io.sentry.util.network.a) d11;
                    }
                }
                if (aVar2 != null) {
                    Map map = a.this.f67442b;
                    Intrinsics.checkNotNullExpressionValue(map, "access$getHttpNetworkDetails$p(...)");
                    map.put(breadcrumb, aVar2);
                }
            }
            return breadcrumb;
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("status_code");
        hashSet.add("method");
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add("http.response_content_length");
        hashSet.add("http.request_content_length");
        f67440d = hashSet;
    }

    public a(@NotNull SentryAndroidOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f67442b = Collections.synchronizedMap(new io.sentry.android.replay.b());
        if (options == null) {
            return;
        }
        options.setBeforeBreadcrumb(new b(options.getBeforeBreadcrumb()));
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01ee  */
    @Override // io.sentry.InterfaceC7179o1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.sentry.rrweb.b a(@NotNull C7141f breadcrumb) {
        String k11;
        I2 j11;
        Object obj;
        String str;
        double longValue;
        double longValue2;
        Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (Intrinsics.d(breadcrumb.h(), "http")) {
            Object obj2 = breadcrumb.i().get(ImagesContract.URL);
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 != null && str2.length() != 0) {
                Map<String, Object> i11 = breadcrumb.i();
                Intrinsics.checkNotNullExpressionValue(i11, "getData(...)");
                if (i11.containsKey("http.start_timestamp")) {
                    Map<String, Object> i12 = breadcrumb.i();
                    Intrinsics.checkNotNullExpressionValue(i12, "getData(...)");
                    if (i12.containsKey("http.end_timestamp")) {
                        Object obj3 = breadcrumb.i().get("http.start_timestamp");
                        Object obj4 = breadcrumb.i().get("http.end_timestamp");
                        io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
                        iVar.f(breadcrumb.l().getTime());
                        iVar.q();
                        Object obj5 = breadcrumb.i().get(ImagesContract.URL);
                        Intrinsics.g(obj5, "null cannot be cast to non-null type kotlin.String");
                        iVar.o((String) obj5);
                        if (obj3 instanceof Double) {
                            longValue = ((Number) obj3).doubleValue();
                        } else {
                            Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.Long");
                            longValue = ((Long) obj3).longValue();
                        }
                        iVar.s(longValue / 1000.0d);
                        if (obj4 instanceof Double) {
                            longValue2 = ((Number) obj4).doubleValue();
                        } else {
                            Intrinsics.g(obj4, "null cannot be cast to non-null type kotlin.Long");
                            longValue2 = ((Long) obj4).longValue();
                        }
                        iVar.p(longValue2 / 1000.0d);
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        this.f67442b.remove(breadcrumb);
                        Map<String, Object> i13 = breadcrumb.i();
                        Intrinsics.checkNotNullExpressionValue(i13, "getData(...)");
                        for (Map.Entry<String, Object> entry : i13.entrySet()) {
                            String key = entry.getKey();
                            Object value = entry.getValue();
                            if (f67440d.contains(key)) {
                                Intrinsics.f(key);
                                linkedHashMap2.put(((Regex) f67439c.getValue()).g(kotlin.text.h.i0(kotlin.text.h.X(key, "content_length", "body_size", false), "."), c.f67446b), value);
                            }
                        }
                        iVar.m(linkedHashMap2);
                        return iVar;
                    }
                }
            }
        } else {
            String str3 = "navigation";
            if (Intrinsics.d(breadcrumb.m(), "navigation") && Intrinsics.d(breadcrumb.h(), "app.lifecycle")) {
                str3 = "app." + breadcrumb.i().get("state");
            } else {
                if (Intrinsics.d(breadcrumb.m(), "navigation") && Intrinsics.d(breadcrumb.h(), "device.orientation")) {
                    str3 = breadcrumb.h();
                    Intrinsics.f(str3);
                    Object obj6 = breadcrumb.i().get("position");
                    if (Intrinsics.d(obj6, "landscape") || Intrinsics.d(obj6, "portrait")) {
                        linkedHashMap.put("position", obj6);
                    }
                } else if (Intrinsics.d(breadcrumb.m(), "navigation")) {
                    if (Intrinsics.d(breadcrumb.i().get("state"), "resumed")) {
                        Object obj7 = breadcrumb.i().get("screen");
                        String str4 = obj7 instanceof String ? (String) obj7 : null;
                        if (str4 != null) {
                            str = kotlin.text.h.j0('.', str4, str4);
                            if (str != null) {
                                linkedHashMap.put("to", str);
                            }
                        }
                        str = null;
                        if (str != null) {
                        }
                    } else {
                        Map<String, Object> i14 = breadcrumb.i();
                        Intrinsics.checkNotNullExpressionValue(i14, "getData(...)");
                        if (i14.containsKey("to")) {
                            Object obj8 = breadcrumb.i().get("to");
                            if (obj8 instanceof String) {
                                str = (String) obj8;
                                if (str != null) {
                                }
                            }
                        }
                        str = null;
                        if (str != null) {
                        }
                    }
                } else if (Intrinsics.d(breadcrumb.h(), "ui.click")) {
                    Object obj9 = breadcrumb.i().get("view.id");
                    if (obj9 == null && (obj9 = breadcrumb.i().get("view.tag")) == null) {
                        obj9 = breadcrumb.i().get("view.class");
                    }
                    k11 = obj9 instanceof String ? (String) obj9 : null;
                    if (k11 != null) {
                        Map<String, Object> i15 = breadcrumb.i();
                        Intrinsics.checkNotNullExpressionValue(i15, "getData(...)");
                        linkedHashMap.putAll(i15);
                        str3 = "ui.tap";
                        j11 = null;
                    }
                } else if (Intrinsics.d(breadcrumb.m(), "system") && Intrinsics.d(breadcrumb.h(), "network.event")) {
                    if (!Intrinsics.d(breadcrumb.i().get("action"), "NETWORK_LOST")) {
                        Map<String, Object> i16 = breadcrumb.i();
                        Intrinsics.checkNotNullExpressionValue(i16, "getData(...)");
                        if (i16.containsKey("network_type")) {
                            Object obj10 = breadcrumb.i().get("network_type");
                            String str5 = obj10 instanceof String ? (String) obj10 : null;
                            obj = (str5 == null || str5.length() == 0) ? "offline" : breadcrumb.i().get("network_type");
                        }
                    }
                    linkedHashMap.put("state", obj);
                    if (!Intrinsics.d(this.f67441a, linkedHashMap.get("state"))) {
                        Object obj11 = linkedHashMap.get("state");
                        this.f67441a = obj11 instanceof String ? (String) obj11 : null;
                        str3 = "device.connectivity";
                    }
                } else if (Intrinsics.d(breadcrumb.i().get("action"), "BATTERY_CHANGED")) {
                    Map<String, Object> i17 = breadcrumb.i();
                    Intrinsics.checkNotNullExpressionValue(i17, "getData(...)");
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Map.Entry<String, Object> entry2 : i17.entrySet()) {
                        String key2 = entry2.getKey();
                        if (Intrinsics.d(key2, "level") || Intrinsics.d(key2, "charging")) {
                            linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    linkedHashMap.putAll(linkedHashMap3);
                    str3 = "device.battery";
                } else {
                    str3 = breadcrumb.h();
                    k11 = breadcrumb.k();
                    j11 = breadcrumb.j();
                    Map<String, Object> i18 = breadcrumb.i();
                    Intrinsics.checkNotNullExpressionValue(i18, "getData(...)");
                    linkedHashMap.putAll(i18);
                }
                if (str3 != null && str3.length() != 0) {
                    io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
                    aVar.f(breadcrumb.l().getTime());
                    aVar.p(breadcrumb.l().getTime() / 1000.0d);
                    aVar.q();
                    aVar.r(str3);
                    aVar.v(k11);
                    aVar.u(j11);
                    aVar.s(linkedHashMap);
                    return aVar;
                }
            }
            k11 = null;
            j11 = null;
            if (str3 != null) {
                io.sentry.rrweb.a aVar2 = new io.sentry.rrweb.a();
                aVar2.f(breadcrumb.l().getTime());
                aVar2.p(breadcrumb.l().getTime() / 1000.0d);
                aVar2.q();
                aVar2.r(str3);
                aVar2.v(k11);
                aVar2.u(j11);
                aVar2.s(linkedHashMap);
                return aVar2;
            }
        }
        return null;
    }
}
