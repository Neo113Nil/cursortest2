package y1;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import com.google.android.gms.internal.measurement.d5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f25532f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f25533a;

    /* renamed from: b, reason: collision with root package name */
    public final b2.m f25534b;

    /* renamed from: c, reason: collision with root package name */
    public d0 f25535c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f25536d;

    /* renamed from: e, reason: collision with root package name */
    public final s.o f25537e;

    static {
        new LinkedHashMap();
    }

    public b0(t0 navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        LinkedHashMap linkedHashMap = u0.f25638b;
        String navigatorName = d5.w(navigator.getClass());
        Intrinsics.checkNotNullParameter(navigatorName, "navigatorName");
        this.f25533a = navigatorName;
        this.f25534b = new b2.m(this);
        this.f25537e = new s.o(0);
    }

    public final Bundle a(Bundle from) {
        Object obj;
        LinkedHashMap linkedHashMap = this.f25534b.f3016d;
        if (from == null && linkedHashMap.isEmpty()) {
            return null;
        }
        kotlin.collections.n0.c().getClass();
        Bundle source = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Intrinsics.checkNotNullParameter(source, "source");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String name = (String) entry.getKey();
            k kVar = (k) entry.getValue();
            kVar.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(source, "bundle");
            if (kVar.f25580c && (obj = kVar.f25581d) != null) {
                kVar.f25578a.e(source, name, obj);
            }
        }
        if (from != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(from, "from");
            source.putAll(from);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String name2 = (String) entry2.getKey();
                k kVar2 = (k) entry2.getValue();
                kVar2.getClass();
                q0 q0Var = kVar2.f25578a;
                Intrinsics.checkNotNullParameter(name2, "name");
                Intrinsics.checkNotNullParameter(source, "bundle");
                if (!kVar2.f25579b) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    if (d5.k(source, name2) && d5.B(source, name2)) {
                        StringBuilder p10 = d9.e.p("Wrong argument type for '", name2, "' in argument savedState. ");
                        p10.append(q0Var.b());
                        p10.append(" expected.");
                        throw new IllegalArgumentException(p10.toString().toString());
                    }
                }
                try {
                    q0Var.a(source, name2);
                } catch (IllegalStateException unused) {
                }
            }
        }
        return source;
    }

    public final int[] c(b0 b0Var) {
        kotlin.collections.l lVar = new kotlin.collections.l();
        b0 b0Var2 = this;
        while (true) {
            b2.m mVar = b0Var2.f25534b;
            Intrinsics.checkNotNull(b0Var2);
            d0 d0Var = b0Var2.f25535c;
            if ((b0Var != null ? b0Var.f25535c : null) != null) {
                d0 d0Var2 = b0Var.f25535c;
                Intrinsics.checkNotNull(d0Var2);
                if (d0Var2.i(mVar.f3017e) == b0Var2) {
                    lVar.addFirst(b0Var2);
                    break;
                }
            }
            if (d0Var == null || d0Var.f25543g.f3078a != mVar.f3017e) {
                lVar.addFirst(b0Var2);
            }
            if (Intrinsics.areEqual(d0Var, b0Var) || d0Var == null) {
                break;
            }
            b0Var2 = d0Var;
        }
        List W = CollectionsKt.W(lVar);
        ArrayList arrayList = new ArrayList(kotlin.collections.v.k(W, 10));
        Iterator it = W.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((b0) it.next()).f25534b.f3017e));
        }
        return CollectionsKt.V(arrayList);
    }

    public final h d(int i5) {
        s.o oVar = this.f25537e;
        h hVar = oVar.g() == 0 ? null : (h) oVar.d(i5);
        if (hVar != null) {
            return hVar;
        }
        d0 d0Var = this.f25535c;
        if (d0Var != null) {
            return d0Var.d(i5);
        }
        return null;
    }

    public final Map e() {
        return kotlin.collections.n0.i(this.f25534b.f3016d);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z5;
        boolean z7;
        if (this != obj) {
            if (obj != null && (obj instanceof b0)) {
                b2.m mVar = this.f25534b;
                ArrayList arrayList = mVar.f3015c;
                b0 b0Var = (b0) obj;
                s.o oVar = b0Var.f25537e;
                b2.m mVar2 = b0Var.f25534b;
                boolean areEqual = Intrinsics.areEqual(arrayList, mVar2.f3015c);
                s.o oVar2 = this.f25537e;
                if (oVar2.g() == oVar.g()) {
                    Intrinsics.checkNotNullParameter(oVar2, "<this>");
                    Iterator it = bg.n.a(new s.p(oVar2)).iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (!Intrinsics.areEqual(oVar2.d(intValue), oVar.d(intValue))) {
                        }
                    }
                    z5 = true;
                    if (e().size() == b0Var.e().size()) {
                        Map e7 = e();
                        Intrinsics.checkNotNullParameter(e7, "<this>");
                        for (Map.Entry entry : (Iterable) CollectionsKt.z(e7.entrySet()).f3220b) {
                            if (b0Var.e().containsKey(entry.getKey()) && Intrinsics.areEqual(b0Var.e().get(entry.getKey()), entry.getValue())) {
                            }
                        }
                        z7 = true;
                        if (mVar.f3017e == mVar2.f3017e || !Intrinsics.areEqual(mVar.f3018f, mVar2.f3018f) || !areEqual || !z5 || !z7) {
                        }
                    }
                    z7 = false;
                    if (mVar.f3017e == mVar2.f3017e) {
                    }
                }
                z5 = false;
                if (e().size() == b0Var.e().size()) {
                }
                z7 = false;
                if (mVar.f3017e == mVar2.f3017e) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0331 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02b2  */
    /* JADX WARN: Type inference failed for: r15v15, types: [gf.i, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a0 f(kh.g gVar) {
        boolean d10;
        boolean z5;
        Iterator it;
        gf.t tVar;
        Bundle bundle;
        int i5;
        int i10;
        a0 a0Var;
        Regex regex;
        kotlin.text.n c2;
        List list;
        int i11;
        List list2;
        Bundle bundle2;
        Bundle bundle3;
        kotlin.text.n c8;
        int i12;
        String str;
        String s8;
        boolean d11;
        kh.g deepLinkRequest = gVar;
        Uri deepLink = (Uri) deepLinkRequest.f19115b;
        Intrinsics.checkNotNullParameter(deepLinkRequest, "navDeepLinkRequest");
        b2.m mVar = this.f25534b;
        LinkedHashMap arguments = mVar.f3016d;
        Intrinsics.checkNotNullParameter(deepLinkRequest, "navDeepLinkRequest");
        ArrayList arrayList = mVar.f3015c;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it2 = arrayList.iterator();
        a0 a0Var2 = null;
        while (it2.hasNext()) {
            x xVar = (x) it2.next();
            String mimeType = (String) deepLinkRequest.f19117d;
            String str2 = (String) deepLinkRequest.f19116c;
            xVar.getClass();
            gf.t tVar2 = xVar.f25666o;
            gf.t tVar3 = xVar.f25658f;
            String mimeType2 = xVar.f25655c;
            String str3 = xVar.f25654b;
            Intrinsics.checkNotNullParameter(deepLinkRequest, "deepLinkRequest");
            if (((Regex) tVar3.getValue()) == null) {
                d10 = true;
            } else if (deepLink == null) {
                d10 = false;
            } else {
                Regex regex2 = (Regex) tVar3.getValue();
                Intrinsics.checkNotNull(regex2);
                d10 = regex2.d(deepLink.toString());
            }
            if (d10) {
                if (str3 == null ? true : str2 == null ? false : Intrinsics.areEqual(str3, str2)) {
                    if (mimeType2 == null) {
                        d11 = true;
                    } else if (mimeType == null) {
                        d11 = false;
                    } else {
                        Regex regex3 = (Regex) tVar2.getValue();
                        Intrinsics.checkNotNull(regex3);
                        d11 = regex3.d(mimeType);
                    }
                    if (d11) {
                        z5 = true;
                        if (z5) {
                            it = it2;
                        } else {
                            if (deepLink != null) {
                                xVar.getClass();
                                Intrinsics.checkNotNullParameter(deepLink, "deepLink");
                                Intrinsics.checkNotNullParameter(arguments, "arguments");
                                Regex regex4 = (Regex) xVar.f25658f.getValue();
                                if (regex4 != null) {
                                    bundle2 = null;
                                    kotlin.text.n c10 = regex4.c(deepLink.toString());
                                    if (c10 != null) {
                                        kotlin.collections.n0.c().getClass();
                                        final Bundle source = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                                        Intrinsics.checkNotNullParameter(source, "source");
                                        if (xVar.c(c10, source, arguments) && (!((Boolean) xVar.f25659g.getValue()).booleanValue() || xVar.d(deepLink, source, arguments))) {
                                            String fragment = deepLink.getFragment();
                                            Regex regex5 = (Regex) xVar.f25664m.getValue();
                                            if (regex5 == null || (c8 = regex5.c(String.valueOf(fragment))) == null) {
                                                it = it2;
                                            } else {
                                                List list3 = (List) xVar.f25662k.getValue();
                                                it = it2;
                                                ArrayList arrayList2 = new ArrayList(kotlin.collections.v.k(list3, 10));
                                                Iterator it3 = list3.iterator();
                                                int i13 = 0;
                                                while (it3.hasNext()) {
                                                    Object next = it3.next();
                                                    Iterator it4 = it3;
                                                    int i14 = i13 + 1;
                                                    if (i13 < 0) {
                                                        kotlin.collections.u.j();
                                                        throw null;
                                                    }
                                                    String str4 = (String) next;
                                                    tVar = tVar2;
                                                    MatchGroup a7 = c8.f19282c.a(i14);
                                                    if (a7 == null || (s8 = a7.f19244a) == null) {
                                                        i12 = i14;
                                                        str = null;
                                                    } else {
                                                        i12 = i14;
                                                        Intrinsics.checkNotNullParameter(s8, "s");
                                                        str = Uri.decode(s8);
                                                        Intrinsics.checkNotNullExpressionValue(str, "decode(...)");
                                                    }
                                                    if (str == null) {
                                                        str = "";
                                                    }
                                                    try {
                                                        x.e(source, str4, str, (k) arguments.get(str4));
                                                        arrayList2.add(Unit.f19194a);
                                                        tVar2 = tVar;
                                                        it3 = it4;
                                                        i13 = i12;
                                                    } catch (IllegalArgumentException unused) {
                                                    }
                                                }
                                            }
                                            tVar = tVar2;
                                            final int i15 = 1;
                                            if (rh.g.C(arguments, new Function1() { // from class: b2.l
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    boolean k6;
                                                    String key = (String) obj;
                                                    switch (i15) {
                                                        case 0:
                                                            Intrinsics.checkNotNullParameter(key, "key");
                                                            Bundle source2 = source;
                                                            Intrinsics.checkNotNullParameter(source2, "source");
                                                            k6 = d5.k(source2, key);
                                                            break;
                                                        default:
                                                            Intrinsics.checkNotNullParameter(key, "argName");
                                                            Bundle source3 = source;
                                                            Intrinsics.checkNotNullParameter(source3, "source");
                                                            k6 = d5.k(source3, key);
                                                            break;
                                                    }
                                                    return Boolean.valueOf(!k6);
                                                }
                                            }).isEmpty()) {
                                                bundle3 = source;
                                                bundle = bundle3;
                                            }
                                        }
                                    }
                                    it = it2;
                                    tVar = tVar2;
                                } else {
                                    it = it2;
                                    tVar = tVar2;
                                    bundle2 = null;
                                }
                                bundle3 = bundle2;
                                bundle = bundle3;
                            } else {
                                it = it2;
                                tVar = tVar2;
                                bundle = null;
                            }
                            String uriString = xVar.f25653a;
                            if (deepLink == null || uriString == null) {
                                i5 = 0;
                            } else {
                                List<String> pathSegments = deepLink.getPathSegments();
                                Intrinsics.checkNotNullParameter(uriString, "uriString");
                                Uri parse = Uri.parse(uriString);
                                Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                                i5 = CollectionsKt.H(pathSegments, parse.getPathSegments()).size();
                            }
                            int i16 = i5;
                            boolean z7 = str2 != null && Intrinsics.areEqual(str2, str3);
                            if (mimeType != null) {
                                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                                if (mimeType2 != null) {
                                    Regex regex6 = (Regex) tVar.getValue();
                                    Intrinsics.checkNotNull(regex6);
                                    if (regex6.d(mimeType)) {
                                        Intrinsics.checkNotNullParameter(mimeType2, "mimeType");
                                        List e7 = new Regex("/").e(mimeType2);
                                        if (!e7.isEmpty()) {
                                            ListIterator listIterator = e7.listIterator(e7.size());
                                            while (listIterator.hasPrevious()) {
                                                if (((String) listIterator.previous()).length() != 0) {
                                                    list = CollectionsKt.S(listIterator.nextIndex() + 1, e7);
                                                    break;
                                                }
                                            }
                                        }
                                        list = kotlin.collections.e0.f19204a;
                                        String str5 = (String) list.get(0);
                                        String str6 = (String) list.get(1);
                                        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                                        v other = new v();
                                        List e9 = new Regex("/").e(mimeType);
                                        if (!e9.isEmpty()) {
                                            ListIterator listIterator2 = e9.listIterator(e9.size());
                                            while (listIterator2.hasPrevious()) {
                                                if (((String) listIterator2.previous()).length() != 0) {
                                                    i11 = 1;
                                                    list2 = CollectionsKt.S(listIterator2.nextIndex() + 1, e9);
                                                    break;
                                                }
                                            }
                                        }
                                        i11 = 1;
                                        list2 = kotlin.collections.e0.f19204a;
                                        String str7 = (String) list2.get(0);
                                        other.f25640a = str7;
                                        String str8 = (String) list2.get(i11);
                                        other.f25641b = str8;
                                        Intrinsics.checkNotNullParameter(other, "other");
                                        i10 = Intrinsics.areEqual(str5, str7) ? 2 : 0;
                                        if (Intrinsics.areEqual(str6, str8)) {
                                            i10++;
                                        }
                                        if (bundle == null) {
                                            if (z7 || i10 > -1) {
                                                Intrinsics.checkNotNullParameter(arguments, "arguments");
                                                kotlin.collections.n0.c().getClass();
                                                final Bundle source2 = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                                                Intrinsics.checkNotNullParameter(source2, "source");
                                                if (deepLink != null && (regex = (Regex) tVar3.getValue()) != null && (c2 = regex.c(deepLink.toString())) != null) {
                                                    xVar.c(c2, source2, arguments);
                                                    if (((Boolean) xVar.f25659g.getValue()).booleanValue()) {
                                                        xVar.d(deepLink, source2, arguments);
                                                    }
                                                }
                                                final int i17 = 0;
                                                if (!rh.g.C(arguments, new Function1() { // from class: b2.l
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        boolean k6;
                                                        String key = (String) obj;
                                                        switch (i17) {
                                                            case 0:
                                                                Intrinsics.checkNotNullParameter(key, "key");
                                                                Bundle source22 = source2;
                                                                Intrinsics.checkNotNullParameter(source22, "source");
                                                                k6 = d5.k(source22, key);
                                                                break;
                                                            default:
                                                                Intrinsics.checkNotNullParameter(key, "argName");
                                                                Bundle source3 = source2;
                                                                Intrinsics.checkNotNullParameter(source3, "source");
                                                                k6 = d5.k(source3, key);
                                                                break;
                                                        }
                                                        return Boolean.valueOf(!k6);
                                                    }
                                                }).isEmpty()) {
                                                }
                                            }
                                        }
                                        a0Var = new a0(mVar.f3013a, bundle, xVar.f25667p, i16, z7, i10);
                                        if (a0Var2 != null || a0Var.compareTo(a0Var2) > 0) {
                                            a0Var2 = a0Var;
                                            it2 = it;
                                            deepLinkRequest = gVar;
                                        }
                                    }
                                }
                            }
                            i10 = -1;
                            if (bundle == null) {
                            }
                            a0Var = new a0(mVar.f3013a, bundle, xVar.f25667p, i16, z7, i10);
                            if (a0Var2 != null) {
                            }
                            a0Var2 = a0Var;
                            it2 = it;
                            deepLinkRequest = gVar;
                        }
                        deepLinkRequest = gVar;
                        it2 = it;
                    }
                }
            }
            z5 = false;
            if (z5) {
            }
            deepLinkRequest = gVar;
            it2 = it;
        }
        return a0Var2;
    }

    public void g(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, z1.a.f25882e);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "obtainAttributes(...)");
        String string = obtainAttributes.getString(2);
        int i5 = 1;
        char c2 = 0;
        b2.m mVar = this.f25534b;
        if (string == null) {
            mVar.f3017e = 0;
            mVar.f3014b = null;
        } else {
            mVar.getClass();
            if (StringsKt.H(string)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String uriPattern = "android-app://androidx.navigation/".concat(string);
            Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
            ArrayList C = rh.g.C(mVar.f3016d, new b2.k(new x(uriPattern, null, null), i5));
            if (!C.isEmpty()) {
                StringBuilder p10 = d9.e.p("Cannot set route \"", string, "\" for destination ");
                p10.append(mVar.f3013a);
                p10.append(". Following required arguments are missing: ");
                p10.append(C);
                throw new IllegalArgumentException(p10.toString().toString());
            }
            gf.k.b(new a2.q(4, uriPattern));
            mVar.f3017e = uriPattern.hashCode();
            mVar.f3014b = null;
        }
        mVar.f3018f = string;
        if (obtainAttributes.hasValue(1)) {
            int resourceId = obtainAttributes.getResourceId(1, 0);
            mVar.f3017e = resourceId;
            mVar.f3014b = null;
            mVar.f3014b = z.a(new b2.e(context, c2), resourceId);
        }
        this.f25536d = obtainAttributes.getText(0);
        Unit unit = Unit.f19194a;
        obtainAttributes.recycle();
    }

    public int hashCode() {
        b2.m mVar = this.f25534b;
        int i5 = mVar.f3017e * 31;
        String str = mVar.f3018f;
        int hashCode = i5 + (str != null ? str.hashCode() : 0);
        Iterator it = mVar.f3015c.iterator();
        while (it.hasNext()) {
            x xVar = (x) it.next();
            int i10 = hashCode * 31;
            String str2 = xVar.f25653a;
            int hashCode2 = (i10 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = xVar.f25654b;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = xVar.f25655c;
            hashCode = hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        s.o oVar = this.f25537e;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        int i11 = 0;
        while (true) {
            if (!(i11 < oVar.g())) {
                break;
            }
            int i12 = i11 + 1;
            h hVar = (h) oVar.h(i11);
            int i13 = ((hashCode * 31) + hVar.f25550a) * 31;
            i0 i0Var = hVar.f25551b;
            hashCode = i13 + (i0Var != null ? i0Var.hashCode() : 0);
            Bundle source = hVar.f25552c;
            if (source != null) {
                Intrinsics.checkNotNullParameter(source, "source");
                hashCode = f3.x.K(source) + (hashCode * 31);
            }
            i11 = i12;
        }
        for (String str5 : e().keySet()) {
            int j = r4.k.j(hashCode * 31, 31, str5);
            Object obj = e().get(str5);
            hashCode = j + (obj != null ? obj.hashCode() : 0);
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        b2.m mVar = this.f25534b;
        String str = mVar.f3014b;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(mVar.f3017e));
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        String str2 = mVar.f3018f;
        if (str2 != null && !StringsKt.H(str2)) {
            sb2.append(" route=");
            sb2.append(mVar.f3018f);
        }
        if (this.f25536d != null) {
            sb2.append(" label=");
            sb2.append(this.f25536d);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
