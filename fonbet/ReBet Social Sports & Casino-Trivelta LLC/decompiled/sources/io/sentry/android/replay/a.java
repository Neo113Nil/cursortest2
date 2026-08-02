package io.sentry.android.replay;

import com.facebook.hermes.intl.Constants;
import com.facebook.react.uimanager.ViewProps;
import com.twilio.voice.EventKeys;
import io.sentry.C4744f;
import io.sentry.EnumC4788n3;
import io.sentry.F1;
import io.sentry.F3;
import io.sentry.J;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public class a implements F1 {

    /* renamed from: d, reason: collision with root package name */
    public static final b f51443d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f51444e = 8;

    /* renamed from: f, reason: collision with root package name */
    public static final Lazy f51445f = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) C0748a.f51450d);

    /* renamed from: g, reason: collision with root package name */
    public static final HashSet f51446g;

    /* renamed from: a, reason: collision with root package name */
    public F3 f51447a;

    /* renamed from: b, reason: collision with root package name */
    public String f51448b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f51449c;

    /* renamed from: io.sentry.android.replay.a$a, reason: collision with other inner class name */
    public static final class C0748a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C0748a f51450d = new C0748a();

        public C0748a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Regex invoke() {
            return new Regex("_[a-z]");
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Regex b() {
            return (Regex) a.f51445f.getValue();
        }

        public b() {
        }
    }

    public final class c implements F3.a {

        /* renamed from: a, reason: collision with root package name */
        public final F3.a f51451a;

        public c(F3.a aVar) {
            this.f51451a = aVar;
        }

        @Override // io.sentry.F3.a
        public C4744f a(C4744f breadcrumb, J hint) {
            Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
            Intrinsics.checkNotNullParameter(hint, "hint");
            F3.a aVar = this.f51451a;
            if (aVar != null) {
                breadcrumb = aVar.a(breadcrumb, hint);
            }
            if (breadcrumb != null) {
                b(breadcrumb, hint);
            }
            return breadcrumb;
        }

        public final io.sentry.util.network.a b(C4744f c4744f, J j10) {
            if (!Intrinsics.areEqual(c4744f.r(), "http") && !Intrinsics.areEqual(c4744f.j(), "http")) {
                return null;
            }
            j10.d("sentry:replayNetworkDetails");
            return null;
        }
    }

    public static final class d extends LinkedHashMap {
        public /* bridge */ boolean a(C4744f c4744f) {
            return super.containsKey(c4744f);
        }

        public /* bridge */ io.sentry.util.network.a b(C4744f c4744f) {
            android.support.v4.media.session.b.a(super.get(c4744f));
            return null;
        }

        public /* bridge */ Set c() {
            return super.entrySet();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof C4744f) {
                return a((C4744f) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            return false;
        }

        public /* bridge */ Set d() {
            return super.keySet();
        }

        public /* bridge */ io.sentry.util.network.a e(C4744f c4744f, io.sentry.util.network.a aVar) {
            android.support.v4.media.session.b.a(super.getOrDefault(c4744f, aVar));
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set entrySet() {
            return c();
        }

        public /* bridge */ int f() {
            return super.size();
        }

        public /* bridge */ Collection g() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof C4744f)) {
                return null;
            }
            b((C4744f) obj);
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof C4744f)) {
                return obj2;
            }
            android.support.v4.media.session.b.a(obj2);
            e((C4744f) obj, null);
            return null;
        }

        public /* bridge */ io.sentry.util.network.a h(C4744f c4744f) {
            android.support.v4.media.session.b.a(super.remove(c4744f));
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set keySet() {
            return d();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            return false;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > 32;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return f();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection values() {
            return g();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (!(obj instanceof C4744f)) {
                return null;
            }
            h((C4744f) obj);
            return null;
        }
    }

    public static final class e extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final e f51453d = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(MatchResult it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String upperCase = String.valueOf(StringsKt.last(it.getValue())).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return upperCase;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("status_code");
        hashSet.add("method");
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add("http.response_content_length");
        hashSet.add("http.request_content_length");
        f51446g = hashSet;
    }

    public a() {
        this.f51449c = Collections.synchronizedMap(new d());
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    @Override // io.sentry.F1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public io.sentry.rrweb.b a(C4744f breadcrumb) {
        String n10;
        EnumC4788n3 m10;
        Object obj;
        String str;
        Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (Intrinsics.areEqual(breadcrumb.j(), "http")) {
            if (c(breadcrumb)) {
                return e(breadcrumb);
            }
            return null;
        }
        String str2 = "navigation";
        if (Intrinsics.areEqual(breadcrumb.r(), "navigation") && Intrinsics.areEqual(breadcrumb.j(), "app.lifecycle")) {
            str2 = "app." + breadcrumb.l().get("state");
        } else if (Intrinsics.areEqual(breadcrumb.r(), "navigation") && Intrinsics.areEqual(breadcrumb.j(), "device.orientation")) {
            str2 = breadcrumb.j();
            Intrinsics.checkNotNull(str2);
            Object obj2 = breadcrumb.l().get(ViewProps.POSITION);
            if (!Intrinsics.areEqual(obj2, "landscape") && !Intrinsics.areEqual(obj2, "portrait")) {
                return null;
            }
            linkedHashMap.put(ViewProps.POSITION, obj2);
        } else {
            if (!Intrinsics.areEqual(breadcrumb.r(), "navigation")) {
                if (Intrinsics.areEqual(breadcrumb.j(), "ui.click")) {
                    Object obj3 = breadcrumb.l().get("view.id");
                    if (obj3 == null && (obj3 = breadcrumb.l().get("view.tag")) == null) {
                        obj3 = breadcrumb.l().get("view.class");
                    }
                    n10 = obj3 instanceof String ? (String) obj3 : null;
                    if (n10 == null) {
                        return null;
                    }
                    Map l10 = breadcrumb.l();
                    Intrinsics.checkNotNullExpressionValue(l10, "getData(...)");
                    linkedHashMap.putAll(l10);
                    str2 = "ui.tap";
                    m10 = null;
                } else if (Intrinsics.areEqual(breadcrumb.r(), "system") && Intrinsics.areEqual(breadcrumb.j(), "network.event")) {
                    if (!Intrinsics.areEqual(breadcrumb.l().get("action"), "NETWORK_LOST")) {
                        Map l11 = breadcrumb.l();
                        Intrinsics.checkNotNullExpressionValue(l11, "getData(...)");
                        if (l11.containsKey("network_type")) {
                            Object obj4 = breadcrumb.l().get("network_type");
                            String str3 = obj4 instanceof String ? (String) obj4 : null;
                            obj = (str3 == null || str3.length() == 0) ? "offline" : breadcrumb.l().get("network_type");
                        }
                        return null;
                    }
                    linkedHashMap.put("state", obj);
                    if (Intrinsics.areEqual(this.f51448b, linkedHashMap.get("state"))) {
                        return null;
                    }
                    Object obj5 = linkedHashMap.get("state");
                    this.f51448b = obj5 instanceof String ? (String) obj5 : null;
                    str2 = "device.connectivity";
                } else if (Intrinsics.areEqual(breadcrumb.l().get("action"), "BATTERY_CHANGED")) {
                    Map l12 = breadcrumb.l();
                    Intrinsics.checkNotNullExpressionValue(l12, "getData(...)");
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : l12.entrySet()) {
                        String str4 = (String) entry.getKey();
                        if (Intrinsics.areEqual(str4, "level") || Intrinsics.areEqual(str4, "charging")) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    linkedHashMap.putAll(linkedHashMap2);
                    str2 = "device.battery";
                } else {
                    str2 = breadcrumb.j();
                    n10 = breadcrumb.n();
                    m10 = breadcrumb.m();
                    Map l13 = breadcrumb.l();
                    Intrinsics.checkNotNullExpressionValue(l13, "getData(...)");
                    linkedHashMap.putAll(l13);
                }
                if (str2 == null && str2.length() != 0) {
                    io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
                    aVar.f(breadcrumb.q().getTime());
                    aVar.r(breadcrumb.q().getTime() / 1000.0d);
                    aVar.s(Constants.COLLATION_DEFAULT);
                    aVar.t(str2);
                    aVar.x(n10);
                    aVar.w(m10);
                    aVar.u(linkedHashMap);
                    return aVar;
                }
            }
            if (Intrinsics.areEqual(breadcrumb.l().get("state"), "resumed")) {
                Object obj6 = breadcrumb.l().get("screen");
                String str5 = obj6 instanceof String ? (String) obj6 : null;
                if (str5 != null) {
                    str = StringsKt.substringAfterLast$default(str5, '.', (String) null, 2, (Object) null);
                    if (str != null) {
                        return null;
                    }
                    linkedHashMap.put("to", str);
                }
                str = null;
                if (str != null) {
                }
            } else {
                Map l14 = breadcrumb.l();
                Intrinsics.checkNotNullExpressionValue(l14, "getData(...)");
                if (l14.containsKey("to")) {
                    Object obj7 = breadcrumb.l().get("to");
                    if (obj7 instanceof String) {
                        str = (String) obj7;
                        if (str != null) {
                        }
                    }
                }
                str = null;
                if (str != null) {
                }
            }
        }
        n10 = null;
        m10 = null;
        return str2 == null ? null : null;
    }

    public final boolean c(C4744f c4744f) {
        Object obj = c4744f.l().get(EventKeys.URL);
        String str = obj instanceof String ? (String) obj : null;
        if (str == null || str.length() == 0) {
            return false;
        }
        Map l10 = c4744f.l();
        Intrinsics.checkNotNullExpressionValue(l10, "getData(...)");
        if (!l10.containsKey("http.start_timestamp")) {
            return false;
        }
        Map l11 = c4744f.l();
        Intrinsics.checkNotNullExpressionValue(l11, "getData(...)");
        return l11.containsKey("http.end_timestamp");
    }

    public final String d(String str) {
        return f51443d.b().replace(str, e.f51453d);
    }

    public final io.sentry.rrweb.i e(C4744f c4744f) {
        double longValue;
        double longValue2;
        Object obj = c4744f.l().get("http.start_timestamp");
        Object obj2 = c4744f.l().get("http.end_timestamp");
        io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
        iVar.f(c4744f.q().getTime());
        iVar.s("resource.http");
        Object obj3 = c4744f.l().get(EventKeys.URL);
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
        iVar.q((String) obj3);
        if (obj instanceof Double) {
            longValue = ((Number) obj).doubleValue();
        } else {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
            longValue = ((Long) obj).longValue();
        }
        iVar.u(longValue / 1000.0d);
        if (obj2 instanceof Double) {
            longValue2 = ((Number) obj2).doubleValue();
        } else {
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
            longValue2 = ((Long) obj2).longValue();
        }
        iVar.r(longValue2 / 1000.0d);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        android.support.v4.media.session.b.a(this.f51449c.remove(c4744f));
        Map l10 = c4744f.l();
        Intrinsics.checkNotNullExpressionValue(l10, "getData(...)");
        for (Map.Entry entry : l10.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (f51446g.contains(str)) {
                Intrinsics.checkNotNull(str);
                linkedHashMap.put(d(StringsKt.substringAfter$default(StringsKt.replace$default(str, "content_length", "body_size", false, 4, (Object) null), ".", (String) null, 2, (Object) null)), value);
            }
        }
        iVar.o(linkedHashMap);
        return iVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(F3 options) {
        this();
        Intrinsics.checkNotNullParameter(options, "options");
        this.f51447a = options;
        if (options == null) {
            return;
        }
        options.setBeforeBreadcrumb(new c(options.getBeforeBreadcrumb()));
    }
}
