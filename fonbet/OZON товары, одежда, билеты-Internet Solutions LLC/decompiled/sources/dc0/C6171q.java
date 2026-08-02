package dc0;

import C.o0;
import Hb0.f;
import Sc.InterfaceC4008j;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import ve.EnumC10311b;

/* renamed from: dc0.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6171q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f61577a = Sc.k.b(a.f61579b);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f61578b = 0;

    /* renamed from: dc0.q$a */
    static final class a extends AbstractC7737t implements Function0<SimpleDateFormat> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f61579b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("EEE, dd MMM yyyy HH':'mm':'ss 'GMT'", Locale.ENGLISH);
        }
    }

    @NotNull
    public static final Map A(@NotNull ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return U.i(new Pair("Set-Cookie", F(arrayList)));
    }

    @NotNull
    public static final ArrayList B(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        List m11 = kotlin.text.h.m(str, new String[]{";"}, 0, 6);
        ArrayList arrayList = new ArrayList(C7714v.z(m11, 10));
        Iterator it = m11.iterator();
        while (it.hasNext()) {
            String value = kotlin.text.h.z0((String) it.next()).toString();
            Intrinsics.checkNotNullParameter(value, "value");
            arrayList.add(C6153Q.a(value));
        }
        return arrayList;
    }

    @NotNull
    public static final C6154S C(@NotNull ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return v(E(arrayList));
    }

    @NotNull
    public static final C6154S D(@NotNull ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return v(F(arrayList));
    }

    private static final ArrayList E(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C6153Q) it.next()).b());
        }
        return arrayList2;
    }

    private static final ArrayList F(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6179y) it.next()).b());
        }
        return arrayList;
    }

    public static final boolean a(String str) {
        return q(str);
    }

    @NotNull
    public static final String b(@NotNull String str, @NotNull String domain) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(domain, "domain");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return o0.c(sb2, "; domain=.", domain);
    }

    @NotNull
    public static final String c(@NotNull String key, @NotNull String value, @NotNull String domain, Date date, boolean z11) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(domain, "domain");
        String value2 = b(key + "=" + value + "; path=/; Secure", domain);
        if (date != null) {
            value2 = G.g.c(value2, "; Expires=", ((SimpleDateFormat) f61577a.getValue()).format(date));
        }
        if (z11) {
            value2 = U7.d.e(value2, "; HttpOnly");
        }
        Intrinsics.checkNotNullParameter(value2, "value");
        return value2;
    }

    @NotNull
    public static final ArrayList d(@NotNull String domain, @NotNull ArrayList cookies) {
        String c11;
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        Intrinsics.checkNotNullParameter(domain, "domain");
        ArrayList E11 = E(cookies);
        ArrayList arrayList = new ArrayList();
        Iterator it = E11.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String m02 = kotlin.text.h.m0(str, "=");
            String obj = kotlin.text.h.z0(kotlin.text.h.m0(kotlin.text.h.i0(str, "="), ";")).toString();
            if (kotlin.text.h.K(obj)) {
                obj = null;
            }
            if (obj == null) {
                c11 = null;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                b.Companion companion = kotlin.time.b.INSTANCE;
                c11 = c(m02, obj, domain, new Date(kotlin.time.b.h(kotlin.time.c.g(365, EnumC10311b.DAYS)) + currentTimeMillis), true);
            }
            C6179y a11 = c11 != null ? C6179y.a(c11) : null;
            if (a11 != null) {
                arrayList.add(a11);
            }
        }
        return arrayList;
    }

    private static final String e(String str, ArrayList arrayList) {
        Object obj;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.text.h.e0((String) obj, str, true)) {
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 == null) {
            return null;
        }
        String obj2 = kotlin.text.h.z0(kotlin.text.h.m0(kotlin.text.h.i0(str2, "="), ";")).toString();
        if (kotlin.text.h.K(obj2)) {
            return null;
        }
        return obj2;
    }

    public static final String f(@NotNull String key, @NotNull ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return e(key, E(arrayList));
    }

    public static final String g(@NotNull ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter("x-o3-language", "key");
        return e("x-o3-language", F(arrayList));
    }

    @NotNull
    public static final ArrayList h(@NotNull String cookieHost, @NotNull ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(cookieHost, "cookieHost");
        return i(arrayList, cookieHost, C6172r.f61580b);
    }

    private static final ArrayList i(ArrayList arrayList, String str, Function1 function1) {
        Kb0.K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        String host = k11.V().getValue().getHost();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String b11 = ((C6179y) obj).b();
            if (((Boolean) function1.invoke(C6179y.a(b11))).booleanValue()) {
                Intrinsics.f(host);
                if (u(str, host) && s(b11, str)) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    private static final ArrayList j(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (kotlin.text.h.D((String) entry.getKey(), str, true)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            C7714v.p((Iterable) ((Map.Entry) it.next()).getValue(), arrayList);
        }
        return arrayList;
    }

    @NotNull
    public static final ArrayList k(@NotNull Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return x(j("Set-Cookie", map));
    }

    @NotNull
    public static final ArrayList l(@NotNull String cookieHost, @NotNull ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(cookieHost, "cookieHost");
        return i(arrayList, cookieHost, C6173s.f61581b);
    }

    @NotNull
    public static final ArrayList m(@NotNull Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        ArrayList j11 = j("Cookie", map);
        ArrayList arrayList = new ArrayList(C7714v.z(j11, 10));
        Iterator it = j11.iterator();
        while (it.hasNext()) {
            String value = (String) it.next();
            Intrinsics.checkNotNullParameter(value, "value");
            arrayList.add(C6153Q.a(value));
        }
        return arrayList;
    }

    public static final Long n(@NotNull ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return o(E(arrayList));
    }

    public static final Long o(@NotNull ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Kb0.K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        if (((Boolean) k11.z().getValue().b(f.o.f10813a)).booleanValue()) {
            Intrinsics.checkNotNullParameter(arrayList, "<this>");
            String e11 = e("__Secure-idp-user-id", arrayList);
            Long y02 = e11 != null ? kotlin.text.h.y0(e11) : null;
            if (y02 != null) {
                return y02;
            }
            Intrinsics.checkNotNullParameter(arrayList, "<this>");
            String e12 = e("__Secure-user-id", arrayList);
            if (e12 != null) {
                return kotlin.text.h.y0(e12);
            }
            return null;
        }
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        String e13 = e("__Secure-user-id", arrayList);
        Long y03 = e13 != null ? kotlin.text.h.y0(e13) : null;
        if (y03 != null) {
            return y03;
        }
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        String e14 = e("__Secure-idp-user-id", arrayList);
        if (e14 != null) {
            return kotlin.text.h.y0(e14);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[LOOP:0: B:6:0x002b->B:28:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean p(@NotNull String cookieHost, @NotNull ArrayList arrayList) {
        boolean t2;
        boolean z11;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(cookieHost, "cookieHost");
        Kb0.K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        String host = k11.V().getValue().getHost();
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String isSso2Cookie = ((C6179y) it.next()).b();
                Kb0.K k12 = Tb0.a.f26975d;
                if (k12 == null) {
                    throw new Lb0.a();
                }
                if (((Boolean) k12.z().getValue().b(f.o.f10813a)).booleanValue()) {
                    Intrinsics.checkNotNullParameter(isSso2Cookie, "$this$isSso2Cookie");
                    Set<String> c11 = C6167m.c();
                    if (!(c11 instanceof Collection) || !c11.isEmpty()) {
                        Iterator<T> it2 = c11.iterator();
                        while (it2.hasNext()) {
                            if (kotlin.text.h.e0(isSso2Cookie, (String) it2.next(), true)) {
                                t2 = true;
                                break;
                            }
                        }
                    }
                    t2 = false;
                } else {
                    t2 = t(isSso2Cookie);
                }
                if (t2) {
                    Intrinsics.f(host);
                    if (u(cookieHost, host) && s(isSso2Cookie, cookieHost)) {
                        z11 = true;
                        if (!z11) {
                            return true;
                        }
                    }
                }
                z11 = false;
                if (!z11) {
                }
            }
        }
        return false;
    }

    private static final boolean q(String str) {
        LinkedHashSet a11 = C6167m.a();
        if (a11 != null && a11.isEmpty()) {
            return false;
        }
        Iterator it = a11.iterator();
        while (it.hasNext()) {
            if (kotlin.text.h.e0(str, (String) it.next(), true)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean r(@NotNull String isAuthCookie) {
        Intrinsics.checkNotNullParameter(isAuthCookie, "$this$isAuthCookie");
        return q(isAuthCookie);
    }

    private static final boolean s(String str, String str2) {
        String str3 = "domain=";
        int J11 = kotlin.text.h.J(str, "domain=", 0, true, 2);
        if (J11 == -1) {
            str3 = "domain =";
            J11 = kotlin.text.h.J(str, "domain =", 0, true, 2);
        }
        if (J11 == -1) {
            return true;
        }
        return u(str2, kotlin.text.h.S(kotlin.text.h.m0(kotlin.text.h.i0(str, str3), ";"), "."));
    }

    public static final boolean t(@NotNull String isOldFormatCookie) {
        Intrinsics.checkNotNullParameter(isOldFormatCookie, "$this$isOldFormatCookie");
        Set<String> b11 = C6167m.b();
        if ((b11 instanceof Collection) && b11.isEmpty()) {
            return false;
        }
        Iterator<T> it = b11.iterator();
        while (it.hasNext()) {
            if (kotlin.text.h.e0(isOldFormatCookie, (String) it.next(), true)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean u(String str, String str2) {
        if (Intrinsics.d(str, str2)) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder(".");
        sb2.append(str2);
        return kotlin.text.h.A(str, sb2.toString(), false);
    }

    private static final C6154S v(ArrayList arrayList) {
        String e11;
        List l11;
        List l12;
        Long o11 = o(arrayList);
        String e12 = e("__Secure-access-token", arrayList);
        String e13 = e("__Secure-refresh-token", arrayList);
        String e14 = e("__Secure-idp-token", arrayList);
        String e15 = e("__Secure-access-token", arrayList);
        Long l13 = null;
        String str = (e15 == null || (l12 = kotlin.text.h.l(e15, new char[]{'.'}, 0, 6)) == null) ? null : (String) C7714v.Q(2, l12);
        Kb0.K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        Hb0.c value = k11.z().getValue();
        f.o oVar = f.o.f10813a;
        if (((Boolean) value.b(oVar)).booleanValue()) {
            String e16 = e("__Secure-sid", arrayList);
            String str2 = (e16 == null || (l11 = kotlin.text.h.l(e16, new char[]{'.'}, 0, 6)) == null) ? null : (String) C7714v.Q(1, l11);
            if (str2 != null) {
                str = str2;
            }
        }
        String e17 = e("__Secure-sid", arrayList);
        String e18 = e("__Secure-token", arrayList);
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Kb0.K k12 = Tb0.a.f26975d;
        if (k12 == null) {
            throw new Lb0.a();
        }
        if (((Boolean) k12.z().getValue().b(oVar)).booleanValue() && (e11 = e("__Secure-product-user-id", arrayList)) != null) {
            l13 = kotlin.text.h.y0(e11);
        }
        return new C6154S(o11, e12, e13, e14, str, e17, e18, l13);
    }

    @NotNull
    public static final String w(@NotNull ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        String V11 = C7714v.V(F(arrayList), "<>", null, null, null, 62);
        C6156b.a(V11);
        return V11;
    }

    @NotNull
    public static final ArrayList x(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (String value : list2) {
            Intrinsics.checkNotNullParameter(value, "value");
            arrayList.add(C6179y.a(value));
        }
        return arrayList;
    }

    @NotNull
    public static final ArrayList y(@NotNull String toFullFormatCookies) {
        Intrinsics.checkNotNullParameter(toFullFormatCookies, "$this$toFullFormatCookies");
        return x(kotlin.text.h.m(toFullFormatCookies, new String[]{"<>"}, 0, 6));
    }

    @NotNull
    public static final Map z(@NotNull ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return U.i(new Pair("Cookie", E(arrayList)));
    }
}
