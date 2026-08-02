package y1;

import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.widget.c1;
import com.google.android.gms.internal.measurement.d5;
import io.sentry.b6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x {
    public static final Regex q = new Regex("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: r, reason: collision with root package name */
    public static final Regex f25648r = new Regex("\\{(.+?)\\}");

    /* renamed from: s, reason: collision with root package name */
    public static final Regex f25649s = new Regex("http[s]?://");

    /* renamed from: t, reason: collision with root package name */
    public static final Regex f25650t = new Regex(b6.DEFAULT_PROPAGATION_TARGETS);

    /* renamed from: u, reason: collision with root package name */
    public static final Regex f25651u = new Regex("([^/]*?|)");

    /* renamed from: v, reason: collision with root package name */
    public static final Regex f25652v = new Regex("^[^?#]+\\?([^#]*).*");

    /* renamed from: a, reason: collision with root package name */
    public final String f25653a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25654b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25655c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f25656d;

    /* renamed from: e, reason: collision with root package name */
    public final String f25657e;

    /* renamed from: f, reason: collision with root package name */
    public final gf.t f25658f;

    /* renamed from: g, reason: collision with root package name */
    public final gf.t f25659g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f25660h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25661i;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f25662k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f25663l;

    /* renamed from: m, reason: collision with root package name */
    public final gf.t f25664m;

    /* renamed from: n, reason: collision with root package name */
    public final String f25665n;

    /* renamed from: o, reason: collision with root package name */
    public final gf.t f25666o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f25667p;

    public x(String input, String str, String mimeType) {
        List list;
        boolean z5;
        this.f25653a = input;
        this.f25654b = str;
        this.f25655c = mimeType;
        ArrayList arrayList = new ArrayList();
        this.f25656d = arrayList;
        final int i5 = 0;
        this.f25658f = gf.k.b(new Function0(this) { // from class: y1.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f25637b;

            {
                this.f25637b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [gf.i, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v27, types: [gf.i, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v34, types: [gf.i, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list2;
                switch (i5) {
                    case 0:
                        String str2 = this.f25637b.f25657e;
                        if (str2 != null) {
                            return new Regex(str2, kotlin.text.r.f19287b);
                        }
                        return null;
                    case 1:
                        String str3 = this.f25637b.f25653a;
                        return Boolean.valueOf(str3 != null && x.f25652v.d(str3));
                    case 2:
                        x xVar = this.f25637b;
                        String uriString = xVar.f25653a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) xVar.f25659g.getValue()).booleanValue()) {
                            Intrinsics.checkNotNull(uriString);
                            Intrinsics.checkNotNullParameter(uriString, "uriString");
                            Uri parse = Uri.parse(uriString);
                            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str4 + " must only be present once in " + uriString + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str5 = (String) CollectionsKt.firstOrNull(queryParameters);
                                if (str5 == null) {
                                    xVar.f25661i = true;
                                    str5 = str4;
                                }
                                w wVar = new w();
                                int i10 = 0;
                                for (kotlin.text.n a7 = Regex.a(x.f25648r, str5); a7 != null; a7 = a7.c()) {
                                    MatchGroup a10 = a7.f19282c.a(1);
                                    Intrinsics.checkNotNull(a10);
                                    String name = a10.f19244a;
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    wVar.f25644b.add(name);
                                    if (a7.b().f19234a > i10) {
                                        String substring = str5.substring(i10, a7.b().f19234a);
                                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                        Regex.f19246b.getClass();
                                        sb2.append(kotlin.text.o.a(substring));
                                    }
                                    sb2.append("([\\s\\S]+?)?");
                                    i10 = a7.b().f19235b + 1;
                                }
                                if (i10 < str5.length()) {
                                    kotlin.text.o oVar = Regex.f19246b;
                                    String substring2 = str5.substring(i10);
                                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                                    oVar.getClass();
                                    sb2.append(kotlin.text.o.a(substring2));
                                }
                                sb2.append("$");
                                String sb3 = sb2.toString();
                                Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                                wVar.f25643a = x.g(sb3);
                                linkedHashMap.put(str4, wVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String uriString2 = this.f25637b.f25653a;
                        if (uriString2 != null) {
                            Intrinsics.checkNotNullParameter(uriString2, "uriString");
                            Uri parse2 = Uri.parse(uriString2);
                            Intrinsics.checkNotNullExpressionValue(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Intrinsics.checkNotNullParameter(uriString2, "uriString");
                                Uri parse3 = Uri.parse(uriString2);
                                Intrinsics.checkNotNullExpressionValue(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb4 = new StringBuilder();
                                Intrinsics.checkNotNull(fragment);
                                x.a(fragment, arrayList2, sb4);
                                return new Pair(arrayList2, sb4.toString());
                            }
                        }
                        return null;
                    case 4:
                        Pair pair = (Pair) this.f25637b.j.getValue();
                        return (pair == null || (list2 = (List) pair.f19192a) == null) ? new ArrayList() : list2;
                    case 5:
                        Pair pair2 = (Pair) this.f25637b.j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f19193b;
                        }
                        return null;
                    case 6:
                        String str6 = (String) this.f25637b.f25663l.getValue();
                        if (str6 != null) {
                            return new Regex(str6, kotlin.text.r.f19287b);
                        }
                        return null;
                    default:
                        String str7 = this.f25637b.f25665n;
                        if (str7 != null) {
                            return new Regex(str7);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f25659g = gf.k.b(new Function0(this) { // from class: y1.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f25637b;

            {
                this.f25637b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [gf.i, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v27, types: [gf.i, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v34, types: [gf.i, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list2;
                switch (i10) {
                    case 0:
                        String str2 = this.f25637b.f25657e;
                        if (str2 != null) {
                            return new Regex(str2, kotlin.text.r.f19287b);
                        }
                        return null;
                    case 1:
                        String str3 = this.f25637b.f25653a;
                        return Boolean.valueOf(str3 != null && x.f25652v.d(str3));
                    case 2:
                        x xVar = this.f25637b;
                        String uriString = xVar.f25653a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) xVar.f25659g.getValue()).booleanValue()) {
                            Intrinsics.checkNotNull(uriString);
                            Intrinsics.checkNotNullParameter(uriString, "uriString");
                            Uri parse = Uri.parse(uriString);
                            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str4 + " must only be present once in " + uriString + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str5 = (String) CollectionsKt.firstOrNull(queryParameters);
                                if (str5 == null) {
                                    xVar.f25661i = true;
                                    str5 = str4;
                                }
                                w wVar = new w();
                                int i102 = 0;
                                for (kotlin.text.n a7 = Regex.a(x.f25648r, str5); a7 != null; a7 = a7.c()) {
                                    MatchGroup a10 = a7.f19282c.a(1);
                                    Intrinsics.checkNotNull(a10);
                                    String name = a10.f19244a;
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    wVar.f25644b.add(name);
                                    if (a7.b().f19234a > i102) {
                                        String substring = str5.substring(i102, a7.b().f19234a);
                                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                        Regex.f19246b.getClass();
                                        sb2.append(kotlin.text.o.a(substring));
                                    }
                                    sb2.append("([\\s\\S]+?)?");
                                    i102 = a7.b().f19235b + 1;
                                }
                                if (i102 < str5.length()) {
                                    kotlin.text.o oVar = Regex.f19246b;
                                    String substring2 = str5.substring(i102);
                                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                                    oVar.getClass();
                                    sb2.append(kotlin.text.o.a(substring2));
                                }
                                sb2.append("$");
                                String sb3 = sb2.toString();
                                Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                                wVar.f25643a = x.g(sb3);
                                linkedHashMap.put(str4, wVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String uriString2 = this.f25637b.f25653a;
                        if (uriString2 != null) {
                            Intrinsics.checkNotNullParameter(uriString2, "uriString");
                            Uri parse2 = Uri.parse(uriString2);
                            Intrinsics.checkNotNullExpressionValue(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Intrinsics.checkNotNullParameter(uriString2, "uriString");
                                Uri parse3 = Uri.parse(uriString2);
                                Intrinsics.checkNotNullExpressionValue(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb4 = new StringBuilder();
                                Intrinsics.checkNotNull(fragment);
                                x.a(fragment, arrayList2, sb4);
                                return new Pair(arrayList2, sb4.toString());
                            }
                        }
                        return null;
                    case 4:
                        Pair pair = (Pair) this.f25637b.j.getValue();
                        return (pair == null || (list2 = (List) pair.f19192a) == null) ? new ArrayList() : list2;
                    case 5:
                        Pair pair2 = (Pair) this.f25637b.j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f19193b;
                        }
                        return null;
                    case 6:
                        String str6 = (String) this.f25637b.f25663l.getValue();
                        if (str6 != null) {
                            return new Regex(str6, kotlin.text.r.f19287b);
                        }
                        return null;
                    default:
                        String str7 = this.f25637b.f25665n;
                        if (str7 != null) {
                            return new Regex(str7);
                        }
                        return null;
                }
            }
        });
        gf.l lVar = gf.l.f10028b;
        final int i11 = 2;
        this.f25660h = gf.k.a(lVar, new Function0(this) { // from class: y1.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f25637b;

            {
                this.f25637b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [gf.i, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v27, types: [gf.i, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v34, types: [gf.i, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list2;
                switch (i11) {
                    case 0:
                        String str2 = this.f25637b.f25657e;
                        if (str2 != null) {
                            return new Regex(str2, kotlin.text.r.f19287b);
                        }
                        return null;
                    case 1:
                        String str3 = this.f25637b.f25653a;
                        return Boolean.valueOf(str3 != null && x.f25652v.d(str3));
                    case 2:
                        x xVar = this.f25637b;
                        String uriString = xVar.f25653a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) xVar.f25659g.getValue()).booleanValue()) {
                            Intrinsics.checkNotNull(uriString);
                            Intrinsics.checkNotNullParameter(uriString, "uriString");
                            Uri parse = Uri.parse(uriString);
                            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str4 + " must only be present once in " + uriString + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str5 = (String) CollectionsKt.firstOrNull(queryParameters);
                                if (str5 == null) {
                                    xVar.f25661i = true;
                                    str5 = str4;
                                }
                                w wVar = new w();
                                int i102 = 0;
                                for (kotlin.text.n a7 = Regex.a(x.f25648r, str5); a7 != null; a7 = a7.c()) {
                                    MatchGroup a10 = a7.f19282c.a(1);
                                    Intrinsics.checkNotNull(a10);
                                    String name = a10.f19244a;
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    wVar.f25644b.add(name);
                                    if (a7.b().f19234a > i102) {
                                        String substring = str5.substring(i102, a7.b().f19234a);
                                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                        Regex.f19246b.getClass();
                                        sb2.append(kotlin.text.o.a(substring));
                                    }
                                    sb2.append("([\\s\\S]+?)?");
                                    i102 = a7.b().f19235b + 1;
                                }
                                if (i102 < str5.length()) {
                                    kotlin.text.o oVar = Regex.f19246b;
                                    String substring2 = str5.substring(i102);
                                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                                    oVar.getClass();
                                    sb2.append(kotlin.text.o.a(substring2));
                                }
                                sb2.append("$");
                                String sb3 = sb2.toString();
                                Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                                wVar.f25643a = x.g(sb3);
                                linkedHashMap.put(str4, wVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String uriString2 = this.f25637b.f25653a;
                        if (uriString2 != null) {
                            Intrinsics.checkNotNullParameter(uriString2, "uriString");
                            Uri parse2 = Uri.parse(uriString2);
                            Intrinsics.checkNotNullExpressionValue(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Intrinsics.checkNotNullParameter(uriString2, "uriString");
                                Uri parse3 = Uri.parse(uriString2);
                                Intrinsics.checkNotNullExpressionValue(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb4 = new StringBuilder();
                                Intrinsics.checkNotNull(fragment);
                                x.a(fragment, arrayList2, sb4);
                                return new Pair(arrayList2, sb4.toString());
                            }
                        }
                        return null;
                    case 4:
                        Pair pair = (Pair) this.f25637b.j.getValue();
                        return (pair == null || (list2 = (List) pair.f19192a) == null) ? new ArrayList() : list2;
                    case 5:
                        Pair pair2 = (Pair) this.f25637b.j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f19193b;
                        }
                        return null;
                    case 6:
                        String str6 = (String) this.f25637b.f25663l.getValue();
                        if (str6 != null) {
                            return new Regex(str6, kotlin.text.r.f19287b);
                        }
                        return null;
                    default:
                        String str7 = this.f25637b.f25665n;
                        if (str7 != null) {
                            return new Regex(str7);
                        }
                        return null;
                }
            }
        });
        final int i12 = 3;
        this.j = gf.k.a(lVar, new Function0(this) { // from class: y1.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f25637b;

            {
                this.f25637b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [gf.i, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v27, types: [gf.i, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v34, types: [gf.i, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list2;
                switch (i12) {
                    case 0:
                        String str2 = this.f25637b.f25657e;
                        if (str2 != null) {
                            return new Regex(str2, kotlin.text.r.f19287b);
                        }
                        return null;
                    case 1:
                        String str3 = this.f25637b.f25653a;
                        return Boolean.valueOf(str3 != null && x.f25652v.d(str3));
                    case 2:
                        x xVar = this.f25637b;
                        String uriString = xVar.f25653a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) xVar.f25659g.getValue()).booleanValue()) {
                            Intrinsics.checkNotNull(uriString);
                            Intrinsics.checkNotNullParameter(uriString, "uriString");
                            Uri parse = Uri.parse(uriString);
                            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str4 + " must only be present once in " + uriString + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str5 = (String) CollectionsKt.firstOrNull(queryParameters);
                                if (str5 == null) {
                                    xVar.f25661i = true;
                                    str5 = str4;
                                }
                                w wVar = new w();
                                int i102 = 0;
                                for (kotlin.text.n a7 = Regex.a(x.f25648r, str5); a7 != null; a7 = a7.c()) {
                                    MatchGroup a10 = a7.f19282c.a(1);
                                    Intrinsics.checkNotNull(a10);
                                    String name = a10.f19244a;
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    wVar.f25644b.add(name);
                                    if (a7.b().f19234a > i102) {
                                        String substring = str5.substring(i102, a7.b().f19234a);
                                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                        Regex.f19246b.getClass();
                                        sb2.append(kotlin.text.o.a(substring));
                                    }
                                    sb2.append("([\\s\\S]+?)?");
                                    i102 = a7.b().f19235b + 1;
                                }
                                if (i102 < str5.length()) {
                                    kotlin.text.o oVar = Regex.f19246b;
                                    String substring2 = str5.substring(i102);
                                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                                    oVar.getClass();
                                    sb2.append(kotlin.text.o.a(substring2));
                                }
                                sb2.append("$");
                                String sb3 = sb2.toString();
                                Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                                wVar.f25643a = x.g(sb3);
                                linkedHashMap.put(str4, wVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String uriString2 = this.f25637b.f25653a;
                        if (uriString2 != null) {
                            Intrinsics.checkNotNullParameter(uriString2, "uriString");
                            Uri parse2 = Uri.parse(uriString2);
                            Intrinsics.checkNotNullExpressionValue(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Intrinsics.checkNotNullParameter(uriString2, "uriString");
                                Uri parse3 = Uri.parse(uriString2);
                                Intrinsics.checkNotNullExpressionValue(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb4 = new StringBuilder();
                                Intrinsics.checkNotNull(fragment);
                                x.a(fragment, arrayList2, sb4);
                                return new Pair(arrayList2, sb4.toString());
                            }
                        }
                        return null;
                    case 4:
                        Pair pair = (Pair) this.f25637b.j.getValue();
                        return (pair == null || (list2 = (List) pair.f19192a) == null) ? new ArrayList() : list2;
                    case 5:
                        Pair pair2 = (Pair) this.f25637b.j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f19193b;
                        }
                        return null;
                    case 6:
                        String str6 = (String) this.f25637b.f25663l.getValue();
                        if (str6 != null) {
                            return new Regex(str6, kotlin.text.r.f19287b);
                        }
                        return null;
                    default:
                        String str7 = this.f25637b.f25665n;
                        if (str7 != null) {
                            return new Regex(str7);
                        }
                        return null;
                }
            }
        });
        final int i13 = 4;
        this.f25662k = gf.k.a(lVar, new Function0(this) { // from class: y1.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f25637b;

            {
                this.f25637b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [gf.i, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v27, types: [gf.i, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v34, types: [gf.i, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list2;
                switch (i13) {
                    case 0:
                        String str2 = this.f25637b.f25657e;
                        if (str2 != null) {
                            return new Regex(str2, kotlin.text.r.f19287b);
                        }
                        return null;
                    case 1:
                        String str3 = this.f25637b.f25653a;
                        return Boolean.valueOf(str3 != null && x.f25652v.d(str3));
                    case 2:
                        x xVar = this.f25637b;
                        String uriString = xVar.f25653a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) xVar.f25659g.getValue()).booleanValue()) {
                            Intrinsics.checkNotNull(uriString);
                            Intrinsics.checkNotNullParameter(uriString, "uriString");
                            Uri parse = Uri.parse(uriString);
                            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str4 + " must only be present once in " + uriString + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str5 = (String) CollectionsKt.firstOrNull(queryParameters);
                                if (str5 == null) {
                                    xVar.f25661i = true;
                                    str5 = str4;
                                }
                                w wVar = new w();
                                int i102 = 0;
                                for (kotlin.text.n a7 = Regex.a(x.f25648r, str5); a7 != null; a7 = a7.c()) {
                                    MatchGroup a10 = a7.f19282c.a(1);
                                    Intrinsics.checkNotNull(a10);
                                    String name = a10.f19244a;
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    wVar.f25644b.add(name);
                                    if (a7.b().f19234a > i102) {
                                        String substring = str5.substring(i102, a7.b().f19234a);
                                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                        Regex.f19246b.getClass();
                                        sb2.append(kotlin.text.o.a(substring));
                                    }
                                    sb2.append("([\\s\\S]+?)?");
                                    i102 = a7.b().f19235b + 1;
                                }
                                if (i102 < str5.length()) {
                                    kotlin.text.o oVar = Regex.f19246b;
                                    String substring2 = str5.substring(i102);
                                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                                    oVar.getClass();
                                    sb2.append(kotlin.text.o.a(substring2));
                                }
                                sb2.append("$");
                                String sb3 = sb2.toString();
                                Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                                wVar.f25643a = x.g(sb3);
                                linkedHashMap.put(str4, wVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String uriString2 = this.f25637b.f25653a;
                        if (uriString2 != null) {
                            Intrinsics.checkNotNullParameter(uriString2, "uriString");
                            Uri parse2 = Uri.parse(uriString2);
                            Intrinsics.checkNotNullExpressionValue(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Intrinsics.checkNotNullParameter(uriString2, "uriString");
                                Uri parse3 = Uri.parse(uriString2);
                                Intrinsics.checkNotNullExpressionValue(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb4 = new StringBuilder();
                                Intrinsics.checkNotNull(fragment);
                                x.a(fragment, arrayList2, sb4);
                                return new Pair(arrayList2, sb4.toString());
                            }
                        }
                        return null;
                    case 4:
                        Pair pair = (Pair) this.f25637b.j.getValue();
                        return (pair == null || (list2 = (List) pair.f19192a) == null) ? new ArrayList() : list2;
                    case 5:
                        Pair pair2 = (Pair) this.f25637b.j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f19193b;
                        }
                        return null;
                    case 6:
                        String str6 = (String) this.f25637b.f25663l.getValue();
                        if (str6 != null) {
                            return new Regex(str6, kotlin.text.r.f19287b);
                        }
                        return null;
                    default:
                        String str7 = this.f25637b.f25665n;
                        if (str7 != null) {
                            return new Regex(str7);
                        }
                        return null;
                }
            }
        });
        final int i14 = 5;
        this.f25663l = gf.k.a(lVar, new Function0(this) { // from class: y1.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f25637b;

            {
                this.f25637b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [gf.i, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v27, types: [gf.i, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v34, types: [gf.i, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list2;
                switch (i14) {
                    case 0:
                        String str2 = this.f25637b.f25657e;
                        if (str2 != null) {
                            return new Regex(str2, kotlin.text.r.f19287b);
                        }
                        return null;
                    case 1:
                        String str3 = this.f25637b.f25653a;
                        return Boolean.valueOf(str3 != null && x.f25652v.d(str3));
                    case 2:
                        x xVar = this.f25637b;
                        String uriString = xVar.f25653a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) xVar.f25659g.getValue()).booleanValue()) {
                            Intrinsics.checkNotNull(uriString);
                            Intrinsics.checkNotNullParameter(uriString, "uriString");
                            Uri parse = Uri.parse(uriString);
                            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str4 + " must only be present once in " + uriString + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str5 = (String) CollectionsKt.firstOrNull(queryParameters);
                                if (str5 == null) {
                                    xVar.f25661i = true;
                                    str5 = str4;
                                }
                                w wVar = new w();
                                int i102 = 0;
                                for (kotlin.text.n a7 = Regex.a(x.f25648r, str5); a7 != null; a7 = a7.c()) {
                                    MatchGroup a10 = a7.f19282c.a(1);
                                    Intrinsics.checkNotNull(a10);
                                    String name = a10.f19244a;
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    wVar.f25644b.add(name);
                                    if (a7.b().f19234a > i102) {
                                        String substring = str5.substring(i102, a7.b().f19234a);
                                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                        Regex.f19246b.getClass();
                                        sb2.append(kotlin.text.o.a(substring));
                                    }
                                    sb2.append("([\\s\\S]+?)?");
                                    i102 = a7.b().f19235b + 1;
                                }
                                if (i102 < str5.length()) {
                                    kotlin.text.o oVar = Regex.f19246b;
                                    String substring2 = str5.substring(i102);
                                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                                    oVar.getClass();
                                    sb2.append(kotlin.text.o.a(substring2));
                                }
                                sb2.append("$");
                                String sb3 = sb2.toString();
                                Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                                wVar.f25643a = x.g(sb3);
                                linkedHashMap.put(str4, wVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String uriString2 = this.f25637b.f25653a;
                        if (uriString2 != null) {
                            Intrinsics.checkNotNullParameter(uriString2, "uriString");
                            Uri parse2 = Uri.parse(uriString2);
                            Intrinsics.checkNotNullExpressionValue(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Intrinsics.checkNotNullParameter(uriString2, "uriString");
                                Uri parse3 = Uri.parse(uriString2);
                                Intrinsics.checkNotNullExpressionValue(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb4 = new StringBuilder();
                                Intrinsics.checkNotNull(fragment);
                                x.a(fragment, arrayList2, sb4);
                                return new Pair(arrayList2, sb4.toString());
                            }
                        }
                        return null;
                    case 4:
                        Pair pair = (Pair) this.f25637b.j.getValue();
                        return (pair == null || (list2 = (List) pair.f19192a) == null) ? new ArrayList() : list2;
                    case 5:
                        Pair pair2 = (Pair) this.f25637b.j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f19193b;
                        }
                        return null;
                    case 6:
                        String str6 = (String) this.f25637b.f25663l.getValue();
                        if (str6 != null) {
                            return new Regex(str6, kotlin.text.r.f19287b);
                        }
                        return null;
                    default:
                        String str7 = this.f25637b.f25665n;
                        if (str7 != null) {
                            return new Regex(str7);
                        }
                        return null;
                }
            }
        });
        final int i15 = 6;
        this.f25664m = gf.k.b(new Function0(this) { // from class: y1.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f25637b;

            {
                this.f25637b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [gf.i, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v27, types: [gf.i, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v34, types: [gf.i, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list2;
                switch (i15) {
                    case 0:
                        String str2 = this.f25637b.f25657e;
                        if (str2 != null) {
                            return new Regex(str2, kotlin.text.r.f19287b);
                        }
                        return null;
                    case 1:
                        String str3 = this.f25637b.f25653a;
                        return Boolean.valueOf(str3 != null && x.f25652v.d(str3));
                    case 2:
                        x xVar = this.f25637b;
                        String uriString = xVar.f25653a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) xVar.f25659g.getValue()).booleanValue()) {
                            Intrinsics.checkNotNull(uriString);
                            Intrinsics.checkNotNullParameter(uriString, "uriString");
                            Uri parse = Uri.parse(uriString);
                            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str4 + " must only be present once in " + uriString + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str5 = (String) CollectionsKt.firstOrNull(queryParameters);
                                if (str5 == null) {
                                    xVar.f25661i = true;
                                    str5 = str4;
                                }
                                w wVar = new w();
                                int i102 = 0;
                                for (kotlin.text.n a7 = Regex.a(x.f25648r, str5); a7 != null; a7 = a7.c()) {
                                    MatchGroup a10 = a7.f19282c.a(1);
                                    Intrinsics.checkNotNull(a10);
                                    String name = a10.f19244a;
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    wVar.f25644b.add(name);
                                    if (a7.b().f19234a > i102) {
                                        String substring = str5.substring(i102, a7.b().f19234a);
                                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                        Regex.f19246b.getClass();
                                        sb2.append(kotlin.text.o.a(substring));
                                    }
                                    sb2.append("([\\s\\S]+?)?");
                                    i102 = a7.b().f19235b + 1;
                                }
                                if (i102 < str5.length()) {
                                    kotlin.text.o oVar = Regex.f19246b;
                                    String substring2 = str5.substring(i102);
                                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                                    oVar.getClass();
                                    sb2.append(kotlin.text.o.a(substring2));
                                }
                                sb2.append("$");
                                String sb3 = sb2.toString();
                                Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                                wVar.f25643a = x.g(sb3);
                                linkedHashMap.put(str4, wVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String uriString2 = this.f25637b.f25653a;
                        if (uriString2 != null) {
                            Intrinsics.checkNotNullParameter(uriString2, "uriString");
                            Uri parse2 = Uri.parse(uriString2);
                            Intrinsics.checkNotNullExpressionValue(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Intrinsics.checkNotNullParameter(uriString2, "uriString");
                                Uri parse3 = Uri.parse(uriString2);
                                Intrinsics.checkNotNullExpressionValue(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb4 = new StringBuilder();
                                Intrinsics.checkNotNull(fragment);
                                x.a(fragment, arrayList2, sb4);
                                return new Pair(arrayList2, sb4.toString());
                            }
                        }
                        return null;
                    case 4:
                        Pair pair = (Pair) this.f25637b.j.getValue();
                        return (pair == null || (list2 = (List) pair.f19192a) == null) ? new ArrayList() : list2;
                    case 5:
                        Pair pair2 = (Pair) this.f25637b.j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f19193b;
                        }
                        return null;
                    case 6:
                        String str6 = (String) this.f25637b.f25663l.getValue();
                        if (str6 != null) {
                            return new Regex(str6, kotlin.text.r.f19287b);
                        }
                        return null;
                    default:
                        String str7 = this.f25637b.f25665n;
                        if (str7 != null) {
                            return new Regex(str7);
                        }
                        return null;
                }
            }
        });
        final int i16 = 7;
        this.f25666o = gf.k.b(new Function0(this) { // from class: y1.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f25637b;

            {
                this.f25637b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [gf.i, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v27, types: [gf.i, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v34, types: [gf.i, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list2;
                switch (i16) {
                    case 0:
                        String str2 = this.f25637b.f25657e;
                        if (str2 != null) {
                            return new Regex(str2, kotlin.text.r.f19287b);
                        }
                        return null;
                    case 1:
                        String str3 = this.f25637b.f25653a;
                        return Boolean.valueOf(str3 != null && x.f25652v.d(str3));
                    case 2:
                        x xVar = this.f25637b;
                        String uriString = xVar.f25653a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) xVar.f25659g.getValue()).booleanValue()) {
                            Intrinsics.checkNotNull(uriString);
                            Intrinsics.checkNotNullParameter(uriString, "uriString");
                            Uri parse = Uri.parse(uriString);
                            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str4 + " must only be present once in " + uriString + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str5 = (String) CollectionsKt.firstOrNull(queryParameters);
                                if (str5 == null) {
                                    xVar.f25661i = true;
                                    str5 = str4;
                                }
                                w wVar = new w();
                                int i102 = 0;
                                for (kotlin.text.n a7 = Regex.a(x.f25648r, str5); a7 != null; a7 = a7.c()) {
                                    MatchGroup a10 = a7.f19282c.a(1);
                                    Intrinsics.checkNotNull(a10);
                                    String name = a10.f19244a;
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    wVar.f25644b.add(name);
                                    if (a7.b().f19234a > i102) {
                                        String substring = str5.substring(i102, a7.b().f19234a);
                                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                        Regex.f19246b.getClass();
                                        sb2.append(kotlin.text.o.a(substring));
                                    }
                                    sb2.append("([\\s\\S]+?)?");
                                    i102 = a7.b().f19235b + 1;
                                }
                                if (i102 < str5.length()) {
                                    kotlin.text.o oVar = Regex.f19246b;
                                    String substring2 = str5.substring(i102);
                                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                                    oVar.getClass();
                                    sb2.append(kotlin.text.o.a(substring2));
                                }
                                sb2.append("$");
                                String sb3 = sb2.toString();
                                Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                                wVar.f25643a = x.g(sb3);
                                linkedHashMap.put(str4, wVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String uriString2 = this.f25637b.f25653a;
                        if (uriString2 != null) {
                            Intrinsics.checkNotNullParameter(uriString2, "uriString");
                            Uri parse2 = Uri.parse(uriString2);
                            Intrinsics.checkNotNullExpressionValue(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Intrinsics.checkNotNullParameter(uriString2, "uriString");
                                Uri parse3 = Uri.parse(uriString2);
                                Intrinsics.checkNotNullExpressionValue(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb4 = new StringBuilder();
                                Intrinsics.checkNotNull(fragment);
                                x.a(fragment, arrayList2, sb4);
                                return new Pair(arrayList2, sb4.toString());
                            }
                        }
                        return null;
                    case 4:
                        Pair pair = (Pair) this.f25637b.j.getValue();
                        return (pair == null || (list2 = (List) pair.f19192a) == null) ? new ArrayList() : list2;
                    case 5:
                        Pair pair2 = (Pair) this.f25637b.j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f19193b;
                        }
                        return null;
                    case 6:
                        String str6 = (String) this.f25637b.f25663l.getValue();
                        if (str6 != null) {
                            return new Regex(str6, kotlin.text.r.f19287b);
                        }
                        return null;
                    default:
                        String str7 = this.f25637b.f25665n;
                        if (str7 != null) {
                            return new Regex(str7);
                        }
                        return null;
                }
            }
        });
        if (input != null) {
            StringBuilder input2 = new StringBuilder("^");
            Regex regex = q;
            regex.getClass();
            Intrinsics.checkNotNullParameter(input, "input");
            if (!regex.f19247a.matcher(input).find()) {
                String pattern = f25649s.f19247a.pattern();
                Intrinsics.checkNotNullExpressionValue(pattern, "pattern(...)");
                input2.append(pattern);
            }
            kotlin.text.n a7 = Regex.a(new Regex("(\\?|#|$)"), input);
            if (a7 != null) {
                String substring = input.substring(0, a7.b().f19234a);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                a(substring, arrayList, input2);
                Regex regex2 = f25650t;
                regex2.getClass();
                Intrinsics.checkNotNullParameter(input2, "input");
                if (!regex2.f19247a.matcher(input2).find()) {
                    Regex regex3 = f25651u;
                    regex3.getClass();
                    Intrinsics.checkNotNullParameter(input2, "input");
                    if (!regex3.f19247a.matcher(input2).find()) {
                        z5 = true;
                        this.f25667p = z5;
                        input2.append("($|(\\?(.)*)|(#(.)*))");
                    }
                }
                z5 = false;
                this.f25667p = z5;
                input2.append("($|(\\?(.)*)|(#(.)*))");
            }
            String sb2 = input2.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            this.f25657e = g(sb2);
        }
        if (mimeType == null) {
            return;
        }
        if (!new Regex("^[\\s\\S]+/[\\s\\S]+$").d(mimeType)) {
            throw new IllegalArgumentException(c1.n("The given mimeType ", mimeType, " does not match to required \"type/subtype\" format").toString());
        }
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        List e7 = new Regex("/").e(mimeType);
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
        this.f25665n = kotlin.text.z.m("^(" + ((String) list.get(0)) + "|[*]+)/(" + ((String) list.get(1)) + "|[*]+)$", "*|[*]", "[\\s\\S]");
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb2) {
        int i5 = 0;
        for (kotlin.text.n a7 = Regex.a(f25648r, str); a7 != null; a7 = a7.c()) {
            MatchGroup a10 = a7.f19282c.a(1);
            Intrinsics.checkNotNull(a10);
            arrayList.add(a10.f19244a);
            if (a7.b().f19234a > i5) {
                kotlin.text.o oVar = Regex.f19246b;
                String substring = str.substring(i5, a7.b().f19234a);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                oVar.getClass();
                sb2.append(kotlin.text.o.a(substring));
            }
            String pattern = f25651u.f19247a.pattern();
            Intrinsics.checkNotNullExpressionValue(pattern, "pattern(...)");
            sb2.append(pattern);
            i5 = a7.b().f19235b + 1;
        }
        if (i5 < str.length()) {
            kotlin.text.o oVar2 = Regex.f19246b;
            String substring2 = str.substring(i5);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            oVar2.getClass();
            sb2.append(kotlin.text.o.a(substring2));
        }
    }

    public static void e(Bundle source, String key, String value, k kVar) {
        if (kVar == null) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            source.putString(key, value);
            return;
        }
        q0 q0Var = kVar.f25578a;
        Intrinsics.checkNotNullParameter(source, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(q0Var, "<this>");
        Intrinsics.checkNotNullParameter(source, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        q0Var.e(source, key, q0Var.d(value));
    }

    public static boolean f(Bundle source, String key, String str, k kVar) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!source.containsKey(key)) {
            return true;
        }
        if (kVar == null) {
            return false;
        }
        q0 q0Var = kVar.f25578a;
        Object a7 = q0Var.a(source, key);
        Intrinsics.checkNotNullParameter(source, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(q0Var, "<this>");
        Intrinsics.checkNotNullParameter(source, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!source.containsKey(key)) {
            throw new IllegalArgumentException("There is no previous value in this savedState.");
        }
        q0Var.e(source, key, q0Var.c(a7, str));
        return false;
    }

    public static String g(String str) {
        return (StringsKt.A(str, "\\Q", false) && StringsKt.A(str, "\\E", false)) ? kotlin.text.z.m(str, b6.DEFAULT_PROPAGATION_TARGETS, "\\E.*\\Q") : StringsKt.A(str, "\\.\\*", false) ? kotlin.text.z.m(str, "\\.\\*", b6.DEFAULT_PROPAGATION_TARGETS) : str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gf.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [gf.i, java.lang.Object] */
    public final ArrayList b() {
        Collection values = ((Map) this.f25660h.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            kotlin.collections.z.n(((w) it.next()).f25644b, arrayList);
        }
        return CollectionsKt.N(CollectionsKt.N(this.f25656d, arrayList), (List) this.f25662k.getValue());
    }

    public final boolean c(kotlin.text.n nVar, Bundle bundle, Map map) {
        String s8;
        ArrayList arrayList = this.f25656d;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.v.k(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i10 = i5 + 1;
            String str = null;
            if (i5 < 0) {
                kotlin.collections.u.j();
                throw null;
            }
            String str2 = (String) next;
            MatchGroup a7 = nVar.f19282c.a(i10);
            if (a7 != null && (s8 = a7.f19244a) != null) {
                Intrinsics.checkNotNullParameter(s8, "s");
                str = Uri.decode(s8);
                Intrinsics.checkNotNullExpressionValue(str, "decode(...)");
            }
            if (str == null) {
                str = "";
            }
            try {
                e(bundle, str2, str, (k) map.get(str2));
                arrayList2.add(Unit.f19194a);
                i5 = i10;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [gf.i, java.lang.Object] */
    public final boolean d(Uri uri, Bundle source, Map map) {
        Object obj;
        Object obj2;
        String query;
        for (Map.Entry entry : ((Map) this.f25660h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            w wVar = (w) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.f25661i && (query = uri.getQuery()) != null && !Intrinsics.areEqual(query, uri.toString())) {
                queryParameters = kotlin.collections.t.c(query);
            }
            kotlin.collections.n0.c().getClass();
            boolean z5 = false;
            Bundle from = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
            Intrinsics.checkNotNullParameter(from, "source");
            Iterator it = wVar.f25644b.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                k kVar = (k) map.get(str2);
                q0 q0Var = kVar != null ? kVar.f25578a : null;
                if ((q0Var instanceof e) && !kVar.f25580c) {
                    e eVar = (e) q0Var;
                    switch (eVar.f25544r) {
                        case 0:
                            obj2 = new boolean[0];
                            break;
                        case 1:
                            obj2 = kotlin.collections.e0.f19204a;
                            break;
                        case 2:
                            obj2 = new float[0];
                            break;
                        case 3:
                            obj2 = kotlin.collections.e0.f19204a;
                            break;
                        case 4:
                            obj2 = new int[0];
                            break;
                        case 5:
                            obj2 = kotlin.collections.e0.f19204a;
                            break;
                        case 6:
                            obj2 = new long[0];
                            break;
                        case 7:
                            obj2 = kotlin.collections.e0.f19204a;
                            break;
                        case 8:
                            obj2 = new String[0];
                            break;
                        default:
                            obj2 = kotlin.collections.e0.f19204a;
                            break;
                    }
                    eVar.e(from, str2, obj2);
                }
            }
            for (String str3 : queryParameters) {
                String str4 = wVar.f25643a;
                kotlin.text.n c2 = str4 != null ? new Regex(str4).c(str3) : null;
                if (c2 == null) {
                    return z5;
                }
                ArrayList arrayList = wVar.f25644b;
                ArrayList arrayList2 = new ArrayList(kotlin.collections.v.k(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                ?? r14 = z5;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i5 = r14 + 1;
                    if (r14 < 0) {
                        kotlin.collections.u.j();
                        throw null;
                    }
                    String str5 = (String) next;
                    MatchGroup a7 = c2.f19282c.a(i5);
                    String str6 = a7 != null ? a7.f19244a : null;
                    if (str6 == null) {
                        str6 = "";
                    }
                    k kVar2 = (k) map.get(str5);
                    try {
                        Intrinsics.checkNotNullParameter(from, "source");
                        if (d5.k(from, str5)) {
                            obj = Boolean.valueOf(f(from, str5, str6, kVar2));
                        } else {
                            e(from, str5, str6, kVar2);
                            obj = Unit.f19194a;
                        }
                    } catch (IllegalArgumentException unused) {
                        obj = Unit.f19194a;
                    }
                    arrayList2.add(obj);
                    r14 = i5;
                    z5 = false;
                }
            }
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(from, "from");
            source.putAll(from);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof x)) {
            x xVar = (x) obj;
            if (Intrinsics.areEqual(this.f25653a, xVar.f25653a) && Intrinsics.areEqual(this.f25654b, xVar.f25654b) && Intrinsics.areEqual(this.f25655c, xVar.f25655c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f25653a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f25654b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f25655c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
