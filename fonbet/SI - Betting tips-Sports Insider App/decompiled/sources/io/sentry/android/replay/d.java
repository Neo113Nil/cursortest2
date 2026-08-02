package io.sentry.android.replay;

import androidx.appcompat.app.v0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b5;
import io.sentry.l3;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements l3 {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f16019c = gf.k.a(gf.l.f10028b, a.f15938f);

    /* renamed from: d, reason: collision with root package name */
    public static final HashSet f16020d;

    /* renamed from: a, reason: collision with root package name */
    public String f16021a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f16022b;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("status_code");
        hashSet.add("method");
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add("http.response_content_length");
        hashSet.add("http.request_content_length");
        f16020d = hashSet;
    }

    public d(SentryAndroidOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f16022b = DesugarCollections.synchronizedMap(new b());
        if (options == null) {
            return;
        }
        options.setBeforeBreadcrumb(new io.sentry.internal.debugmeta.c(10, (Object) this, (Object) options.getBeforeBreadcrumb(), false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0319  */
    /* JADX WARN: Type inference failed for: r4v6, types: [gf.i, java.lang.Object] */
    @Override // io.sentry.l3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.sentry.rrweb.b a(io.sentry.e breadcrumb) {
        String str;
        b5 b5Var;
        Object obj;
        String str2;
        double longValue;
        double longValue2;
        String sb2;
        Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (Intrinsics.areEqual(breadcrumb.f16336g, "http")) {
            V v5 = breadcrumb.f16335f.get("url");
            String str3 = v5 instanceof String ? (String) v5 : null;
            if (str3 != null) {
                if (str3.length() != 0) {
                    ConcurrentHashMap concurrentHashMap = breadcrumb.f16335f;
                    Intrinsics.checkNotNullExpressionValue(concurrentHashMap, "getData(...)");
                    if (concurrentHashMap.containsKey("http.start_timestamp")) {
                        ConcurrentHashMap concurrentHashMap2 = breadcrumb.f16335f;
                        Intrinsics.checkNotNullExpressionValue(concurrentHashMap2, "getData(...)");
                        if (concurrentHashMap2.containsKey("http.end_timestamp")) {
                            V v10 = breadcrumb.f16335f.get("http.start_timestamp");
                            V v11 = breadcrumb.f16335f.get("http.end_timestamp");
                            io.sentry.rrweb.l lVar = new io.sentry.rrweb.l();
                            lVar.f17005b = breadcrumb.b().getTime();
                            lVar.f17030d = "resource.http";
                            V v12 = breadcrumb.f16335f.get("url");
                            Intrinsics.checkNotNull(v12, "null cannot be cast to non-null type kotlin.String");
                            lVar.f17031e = (String) v12;
                            if (v10 instanceof Double) {
                                longValue = ((Number) v10).doubleValue();
                            } else {
                                Intrinsics.checkNotNull(v10, "null cannot be cast to non-null type kotlin.Long");
                                longValue = ((Long) v10).longValue();
                            }
                            lVar.f17032f = longValue / 1000.0d;
                            if (v11 instanceof Double) {
                                longValue2 = ((Number) v11).doubleValue();
                            } else {
                                Intrinsics.checkNotNull(v11, "null cannot be cast to non-null type kotlin.Long");
                                longValue2 = ((Long) v11).longValue();
                            }
                            lVar.f17033g = longValue2 / 1000.0d;
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            io.sentry.util.network.f fVar = (io.sentry.util.network.f) this.f16022b.remove(breadcrumb);
                            if (fVar != null) {
                                String str4 = fVar.f17181a;
                                if (str4 != null) {
                                    linkedHashMap2.put("method", str4);
                                }
                                Integer num = fVar.f17182b;
                                if (num != null) {
                                    linkedHashMap2.put("statusCode", num);
                                }
                                Long l6 = fVar.f17183c;
                                if (l6 != null) {
                                    linkedHashMap2.put("requestBodySize", l6);
                                }
                                Long l10 = fVar.f17184d;
                                if (l10 != null) {
                                    linkedHashMap2.put("responseBodySize", l10);
                                }
                                v0 v0Var = fVar.f17185e;
                                if (v0Var != null) {
                                    LinkedHashMap linkedHashMap3 = (LinkedHashMap) v0Var.f366d;
                                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                    Long l11 = (Long) v0Var.f364b;
                                    if (l11 != null) {
                                        linkedHashMap4.put("size", l11);
                                    }
                                    io.sentry.util.network.b bVar = (io.sentry.util.network.b) v0Var.f365c;
                                    if (bVar != null) {
                                        linkedHashMap4.put("body", bVar.f17176b);
                                        List list = (List) bVar.f17177c;
                                        if (list != null) {
                                            Intrinsics.checkNotNull(list);
                                            ArrayList arrayList = new ArrayList(kotlin.collections.v.k(list, 10));
                                            Iterator it = list.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(((io.sentry.util.network.a) it.next()).getValue());
                                            }
                                            linkedHashMap4.put("warnings", arrayList);
                                        }
                                    }
                                    Intrinsics.checkNotNullExpressionValue(linkedHashMap3, "getHeaders(...)");
                                    if (!linkedHashMap3.isEmpty()) {
                                        linkedHashMap4.put("headers", linkedHashMap3);
                                    }
                                    if (!linkedHashMap4.isEmpty()) {
                                        linkedHashMap2.put("request", linkedHashMap4);
                                    }
                                }
                                v0 v0Var2 = fVar.f17186f;
                                if (v0Var2 != null) {
                                    LinkedHashMap linkedHashMap5 = (LinkedHashMap) v0Var2.f366d;
                                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                    Long l12 = (Long) v0Var2.f364b;
                                    if (l12 != null) {
                                        linkedHashMap6.put("size", l12);
                                    }
                                    io.sentry.util.network.b bVar2 = (io.sentry.util.network.b) v0Var2.f365c;
                                    if (bVar2 != null) {
                                        linkedHashMap6.put("body", bVar2.f17176b);
                                        List list2 = (List) bVar2.f17177c;
                                        if (list2 != null) {
                                            Intrinsics.checkNotNull(list2);
                                            ArrayList arrayList2 = new ArrayList(kotlin.collections.v.k(list2, 10));
                                            Iterator it2 = list2.iterator();
                                            while (it2.hasNext()) {
                                                arrayList2.add(((io.sentry.util.network.a) it2.next()).getValue());
                                            }
                                            linkedHashMap6.put("warnings", arrayList2);
                                        }
                                    }
                                    Intrinsics.checkNotNullExpressionValue(linkedHashMap5, "getHeaders(...)");
                                    if (!linkedHashMap5.isEmpty()) {
                                        linkedHashMap6.put("headers", linkedHashMap5);
                                    }
                                    if (!linkedHashMap6.isEmpty()) {
                                        linkedHashMap2.put("response", linkedHashMap6);
                                    }
                                }
                            }
                            ConcurrentHashMap concurrentHashMap3 = breadcrumb.f16335f;
                            Intrinsics.checkNotNullExpressionValue(concurrentHashMap3, "getData(...)");
                            Iterator it3 = concurrentHashMap3.entrySet().iterator();
                            while (it3.hasNext()) {
                                Map.Entry entry = (Map.Entry) it3.next();
                                String str5 = (String) entry.getKey();
                                Object value = entry.getValue();
                                if (f16020d.contains(str5)) {
                                    Intrinsics.checkNotNull(str5);
                                    String m6 = kotlin.text.z.m(str5, "content_length", "body_size");
                                    String input = StringsKt.U(m6, ".", m6);
                                    Regex regex = (Regex) f16019c.getValue();
                                    c transform = c.f15951f;
                                    regex.getClass();
                                    Intrinsics.checkNotNullParameter(input, "input");
                                    Intrinsics.checkNotNullParameter(transform, "transform");
                                    kotlin.text.n a7 = Regex.a(regex, input);
                                    if (a7 == null) {
                                        sb2 = input.toString();
                                    } else {
                                        int length = input.length();
                                        StringBuilder sb3 = new StringBuilder(length);
                                        int i5 = 0;
                                        do {
                                            sb3.append((CharSequence) input, i5, a7.b().f19234a);
                                            sb3.append((CharSequence) transform.invoke(a7));
                                            i5 = a7.b().f19235b + 1;
                                            a7 = a7.c();
                                            if (i5 >= length) {
                                                break;
                                            }
                                        } while (a7 != null);
                                        if (i5 < length) {
                                            sb3.append((CharSequence) input, i5, length);
                                        }
                                        sb2 = sb3.toString();
                                        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                                    }
                                    linkedHashMap2.put(sb2, value);
                                }
                            }
                            lVar.f17034h = new ConcurrentHashMap(linkedHashMap2);
                            return lVar;
                        }
                    }
                }
            }
        } else {
            String str6 = "navigation";
            if (Intrinsics.areEqual(breadcrumb.f16334e, "navigation") && Intrinsics.areEqual(breadcrumb.f16336g, "app.lifecycle")) {
                str6 = "app." + breadcrumb.f16335f.get("state");
            } else {
                if (Intrinsics.areEqual(breadcrumb.f16334e, "navigation") && Intrinsics.areEqual(breadcrumb.f16336g, "device.orientation")) {
                    str6 = breadcrumb.f16336g;
                    Intrinsics.checkNotNull(str6);
                    V v13 = breadcrumb.f16335f.get("position");
                    if (Intrinsics.areEqual(v13, "landscape") || Intrinsics.areEqual(v13, "portrait")) {
                        linkedHashMap.put("position", v13);
                    }
                } else if (Intrinsics.areEqual(breadcrumb.f16334e, "navigation")) {
                    if (Intrinsics.areEqual(breadcrumb.f16335f.get("state"), "resumed")) {
                        V v14 = breadcrumb.f16335f.get("screen");
                        String str7 = v14 instanceof String ? (String) v14 : null;
                        if (str7 != null) {
                            str2 = StringsKt.V('.', str7, str7);
                            if (str2 != null) {
                                linkedHashMap.put("to", str2);
                            }
                        }
                        str2 = null;
                        if (str2 != null) {
                        }
                    } else {
                        ConcurrentHashMap concurrentHashMap4 = breadcrumb.f16335f;
                        Intrinsics.checkNotNullExpressionValue(concurrentHashMap4, "getData(...)");
                        if (concurrentHashMap4.containsKey("to")) {
                            V v15 = breadcrumb.f16335f.get("to");
                            if (v15 instanceof String) {
                                str2 = (String) v15;
                                if (str2 != null) {
                                }
                            }
                        }
                        str2 = null;
                        if (str2 != null) {
                        }
                    }
                } else if (Intrinsics.areEqual(breadcrumb.f16336g, "ui.click")) {
                    Object obj2 = breadcrumb.f16335f.get("view.id");
                    if (obj2 == null && (obj2 = breadcrumb.f16335f.get("view.tag")) == null) {
                        obj2 = breadcrumb.f16335f.get("view.class");
                    }
                    String str8 = obj2 instanceof String ? (String) obj2 : null;
                    if (str8 != null) {
                        ConcurrentHashMap concurrentHashMap5 = breadcrumb.f16335f;
                        Intrinsics.checkNotNullExpressionValue(concurrentHashMap5, "getData(...)");
                        linkedHashMap.putAll(concurrentHashMap5);
                        str6 = "ui.tap";
                        str = str8;
                        b5Var = null;
                    }
                } else {
                    if (Intrinsics.areEqual(breadcrumb.f16334e, "system") && Intrinsics.areEqual(breadcrumb.f16336g, "network.event")) {
                        if (!Intrinsics.areEqual(breadcrumb.f16335f.get("action"), "NETWORK_LOST")) {
                            ConcurrentHashMap concurrentHashMap6 = breadcrumb.f16335f;
                            Intrinsics.checkNotNullExpressionValue(concurrentHashMap6, "getData(...)");
                            if (concurrentHashMap6.containsKey("network_type")) {
                                V v16 = breadcrumb.f16335f.get("network_type");
                                String str9 = v16 instanceof String ? (String) v16 : null;
                                obj = (str9 == null || str9.length() == 0) ? "offline" : breadcrumb.f16335f.get("network_type");
                            }
                        }
                        linkedHashMap.put("state", obj);
                        if (!Intrinsics.areEqual(this.f16021a, linkedHashMap.get("state"))) {
                            Object obj3 = linkedHashMap.get("state");
                            this.f16021a = obj3 instanceof String ? (String) obj3 : null;
                            str6 = "device.connectivity";
                        }
                    } else if (Intrinsics.areEqual(breadcrumb.f16335f.get("action"), "BATTERY_CHANGED")) {
                        ConcurrentHashMap concurrentHashMap7 = breadcrumb.f16335f;
                        Intrinsics.checkNotNullExpressionValue(concurrentHashMap7, "getData(...)");
                        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                        Iterator it4 = concurrentHashMap7.entrySet().iterator();
                        while (it4.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it4.next();
                            String str10 = (String) entry2.getKey();
                            if (Intrinsics.areEqual(str10, "level") || Intrinsics.areEqual(str10, "charging")) {
                                linkedHashMap7.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        linkedHashMap.putAll(linkedHashMap7);
                        str6 = "device.battery";
                    } else {
                        str6 = breadcrumb.f16336g;
                        str = breadcrumb.f16333d;
                        b5Var = breadcrumb.f16338i;
                        ConcurrentHashMap concurrentHashMap8 = breadcrumb.f16335f;
                        Intrinsics.checkNotNullExpressionValue(concurrentHashMap8, "getData(...)");
                        linkedHashMap.putAll(concurrentHashMap8);
                    }
                    str = null;
                    b5Var = null;
                }
                if (str6 != null && str6.length() != 0) {
                    io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
                    aVar.f17005b = breadcrumb.b().getTime();
                    aVar.f16996d = breadcrumb.b().getTime() / 1000.0d;
                    aVar.f16997e = "default";
                    aVar.f16998f = str6;
                    aVar.f16999g = str;
                    aVar.f17000h = b5Var;
                    aVar.f17001i = new ConcurrentHashMap(linkedHashMap);
                    return aVar;
                }
            }
            str = null;
            b5Var = null;
            if (str6 != null) {
                io.sentry.rrweb.a aVar2 = new io.sentry.rrweb.a();
                aVar2.f17005b = breadcrumb.b().getTime();
                aVar2.f16996d = breadcrumb.b().getTime() / 1000.0d;
                aVar2.f16997e = "default";
                aVar2.f16998f = str6;
                aVar2.f16999g = str;
                aVar2.f17000h = b5Var;
                aVar2.f17001i = new ConcurrentHashMap(linkedHashMap);
                return aVar2;
            }
        }
        return null;
    }
}
