package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p6d {
    public static final Regex q = new Regex("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final Regex r = new Regex("\\{(.+?)\\}");
    public static final Regex s = new Regex("http[s]?://");
    public static final Regex t = new Regex(".*");
    public static final Regex u = new Regex("([^/]*?|)");
    public static final Regex v = new Regex("^[^?#]+\\?([^#]*).*");
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final String e;
    public final mqi f;
    public final mqi g;
    public final joa h;
    public boolean i;
    public final joa j;
    public final joa k;
    public final joa l;
    public final mqi m;
    public final String n;
    public final mqi o;
    public final boolean p;

    public p6d(String str, String str2, String str3) {
        List list;
        this.a = str;
        this.b = str2;
        this.c = str3;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        final int i = 0;
        this.f = ypa.b(new Function0(this) { // from class: n6d
            public final /* synthetic */ p6d b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list2;
                int i2 = i;
                p6d p6dVar = this.b;
                switch (i2) {
                    case 0:
                        String str4 = p6dVar.e;
                        if (str4 != null) {
                            return new Regex(str4, uuf.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = p6dVar.a;
                        return Boolean.valueOf(str5 != null && p6d.v.f(str5));
                    case 2:
                        String str6 = p6dVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) p6dVar.g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    ogj.h(bf3.k("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) CollectionsKt.firstOrNull(queryParameters);
                                if (str8 == null) {
                                    p6dVar.i = true;
                                    str8 = str7;
                                }
                                o6d o6dVar = new o6d();
                                int i3 = 0;
                                for (txb b = p6d.r.b(str8); b != null; b = b.next()) {
                                    MatchGroup c = b.c.c(1);
                                    c.getClass();
                                    String str9 = c.a;
                                    str9.getClass();
                                    o6dVar.b.add(str9);
                                    if (b.b().a > i3) {
                                        String substring = str8.substring(i3, b.b().a);
                                        Regex.b.getClass();
                                        String quote = Pattern.quote(substring);
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = b.b().b + 1;
                                }
                                if (i3 < str8.length()) {
                                    quf qufVar = Regex.b;
                                    String substring2 = str8.substring(i3);
                                    qufVar.getClass();
                                    String quote2 = Pattern.quote(substring2);
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                o6dVar.a = p6d.h(sb.toString());
                                linkedHashMap.put(str7, o6dVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = p6dVar.a;
                        if (str10 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str10);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str10);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        p6d.a(fragment, arrayList2, sb2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) p6dVar.j.getValue();
                        return (pair == null || (list2 = (List) pair.a) == null) ? new ArrayList() : list2;
                    case 5:
                        Pair pair2 = (Pair) p6dVar.j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.b;
                        }
                        return null;
                    case 6:
                        String str11 = (String) p6dVar.l.getValue();
                        if (str11 != null) {
                            return new Regex(str11, uuf.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str12 = p6dVar.n;
                        if (str12 != null) {
                            return new Regex(str12);
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.g = ypa.b(new Function0(this) { // from class: n6d
            public final /* synthetic */ p6d b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list2;
                int i22 = i2;
                p6d p6dVar = this.b;
                switch (i22) {
                    case 0:
                        String str4 = p6dVar.e;
                        if (str4 != null) {
                            return new Regex(str4, uuf.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = p6dVar.a;
                        return Boolean.valueOf(str5 != null && p6d.v.f(str5));
                    case 2:
                        String str6 = p6dVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) p6dVar.g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    ogj.h(bf3.k("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) CollectionsKt.firstOrNull(queryParameters);
                                if (str8 == null) {
                                    p6dVar.i = true;
                                    str8 = str7;
                                }
                                o6d o6dVar = new o6d();
                                int i3 = 0;
                                for (txb b = p6d.r.b(str8); b != null; b = b.next()) {
                                    MatchGroup c = b.c.c(1);
                                    c.getClass();
                                    String str9 = c.a;
                                    str9.getClass();
                                    o6dVar.b.add(str9);
                                    if (b.b().a > i3) {
                                        String substring = str8.substring(i3, b.b().a);
                                        Regex.b.getClass();
                                        String quote = Pattern.quote(substring);
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = b.b().b + 1;
                                }
                                if (i3 < str8.length()) {
                                    quf qufVar = Regex.b;
                                    String substring2 = str8.substring(i3);
                                    qufVar.getClass();
                                    String quote2 = Pattern.quote(substring2);
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                o6dVar.a = p6d.h(sb.toString());
                                linkedHashMap.put(str7, o6dVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = p6dVar.a;
                        if (str10 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str10);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str10);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        p6d.a(fragment, arrayList2, sb2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) p6dVar.j.getValue();
                        return (pair == null || (list2 = (List) pair.a) == null) ? new ArrayList() : list2;
                    case 5:
                        Pair pair2 = (Pair) p6dVar.j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.b;
                        }
                        return null;
                    case 6:
                        String str11 = (String) p6dVar.l.getValue();
                        if (str11 != null) {
                            return new Regex(str11, uuf.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str12 = p6dVar.n;
                        if (str12 != null) {
                            return new Regex(str12);
                        }
                        return null;
                }
            }
        });
        ysa ysaVar = ysa.c;
        final int i3 = 2;
        this.h = ypa.a(ysaVar, new Function0(this) { // from class: n6d
            public final /* synthetic */ p6d b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list2;
                int i22 = i3;
                p6d p6dVar = this.b;
                switch (i22) {
                    case 0:
                        String str4 = p6dVar.e;
                        if (str4 != null) {
                            return new Regex(str4, uuf.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = p6dVar.a;
                        return Boolean.valueOf(str5 != null && p6d.v.f(str5));
                    case 2:
                        String str6 = p6dVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) p6dVar.g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    ogj.h(bf3.k("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) CollectionsKt.firstOrNull(queryParameters);
                                if (str8 == null) {
                                    p6dVar.i = true;
                                    str8 = str7;
                                }
                                o6d o6dVar = new o6d();
                                int i32 = 0;
                                for (txb b = p6d.r.b(str8); b != null; b = b.next()) {
                                    MatchGroup c = b.c.c(1);
                                    c.getClass();
                                    String str9 = c.a;
                                    str9.getClass();
                                    o6dVar.b.add(str9);
                                    if (b.b().a > i32) {
                                        String substring = str8.substring(i32, b.b().a);
                                        Regex.b.getClass();
                                        String quote = Pattern.quote(substring);
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = b.b().b + 1;
                                }
                                if (i32 < str8.length()) {
                                    quf qufVar = Regex.b;
                                    String substring2 = str8.substring(i32);
                                    qufVar.getClass();
                                    String quote2 = Pattern.quote(substring2);
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                o6dVar.a = p6d.h(sb.toString());
                                linkedHashMap.put(str7, o6dVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = p6dVar.a;
                        if (str10 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str10);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str10);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        p6d.a(fragment, arrayList2, sb2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) p6dVar.j.getValue();
                        return (pair == null || (list2 = (List) pair.a) == null) ? new ArrayList() : list2;
                    case 5:
                        Pair pair2 = (Pair) p6dVar.j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.b;
                        }
                        return null;
                    case 6:
                        String str11 = (String) p6dVar.l.getValue();
                        if (str11 != null) {
                            return new Regex(str11, uuf.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str12 = p6dVar.n;
                        if (str12 != null) {
                            return new Regex(str12);
                        }
                        return null;
                }
            }
        });
        final int i4 = 3;
        this.j = ypa.a(ysaVar, new Function0(this) { // from class: n6d
            public final /* synthetic */ p6d b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list2;
                int i22 = i4;
                p6d p6dVar = this.b;
                switch (i22) {
                    case 0:
                        String str4 = p6dVar.e;
                        if (str4 != null) {
                            return new Regex(str4, uuf.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = p6dVar.a;
                        return Boolean.valueOf(str5 != null && p6d.v.f(str5));
                    case 2:
                        String str6 = p6dVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) p6dVar.g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    ogj.h(bf3.k("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) CollectionsKt.firstOrNull(queryParameters);
                                if (str8 == null) {
                                    p6dVar.i = true;
                                    str8 = str7;
                                }
                                o6d o6dVar = new o6d();
                                int i32 = 0;
                                for (txb b = p6d.r.b(str8); b != null; b = b.next()) {
                                    MatchGroup c = b.c.c(1);
                                    c.getClass();
                                    String str9 = c.a;
                                    str9.getClass();
                                    o6dVar.b.add(str9);
                                    if (b.b().a > i32) {
                                        String substring = str8.substring(i32, b.b().a);
                                        Regex.b.getClass();
                                        String quote = Pattern.quote(substring);
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = b.b().b + 1;
                                }
                                if (i32 < str8.length()) {
                                    quf qufVar = Regex.b;
                                    String substring2 = str8.substring(i32);
                                    qufVar.getClass();
                                    String quote2 = Pattern.quote(substring2);
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                o6dVar.a = p6d.h(sb.toString());
                                linkedHashMap.put(str7, o6dVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = p6dVar.a;
                        if (str10 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str10);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str10);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        p6d.a(fragment, arrayList2, sb2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) p6dVar.j.getValue();
                        return (pair == null || (list2 = (List) pair.a) == null) ? new ArrayList() : list2;
                    case 5:
                        Pair pair2 = (Pair) p6dVar.j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.b;
                        }
                        return null;
                    case 6:
                        String str11 = (String) p6dVar.l.getValue();
                        if (str11 != null) {
                            return new Regex(str11, uuf.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str12 = p6dVar.n;
                        if (str12 != null) {
                            return new Regex(str12);
                        }
                        return null;
                }
            }
        });
        final int i5 = 4;
        this.k = ypa.a(ysaVar, new Function0(this) { // from class: n6d
            public final /* synthetic */ p6d b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list2;
                int i22 = i5;
                p6d p6dVar = this.b;
                switch (i22) {
                    case 0:
                        String str4 = p6dVar.e;
                        if (str4 != null) {
                            return new Regex(str4, uuf.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = p6dVar.a;
                        return Boolean.valueOf(str5 != null && p6d.v.f(str5));
                    case 2:
                        String str6 = p6dVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) p6dVar.g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    ogj.h(bf3.k("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) CollectionsKt.firstOrNull(queryParameters);
                                if (str8 == null) {
                                    p6dVar.i = true;
                                    str8 = str7;
                                }
                                o6d o6dVar = new o6d();
                                int i32 = 0;
                                for (txb b = p6d.r.b(str8); b != null; b = b.next()) {
                                    MatchGroup c = b.c.c(1);
                                    c.getClass();
                                    String str9 = c.a;
                                    str9.getClass();
                                    o6dVar.b.add(str9);
                                    if (b.b().a > i32) {
                                        String substring = str8.substring(i32, b.b().a);
                                        Regex.b.getClass();
                                        String quote = Pattern.quote(substring);
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = b.b().b + 1;
                                }
                                if (i32 < str8.length()) {
                                    quf qufVar = Regex.b;
                                    String substring2 = str8.substring(i32);
                                    qufVar.getClass();
                                    String quote2 = Pattern.quote(substring2);
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                o6dVar.a = p6d.h(sb.toString());
                                linkedHashMap.put(str7, o6dVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = p6dVar.a;
                        if (str10 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str10);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str10);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        p6d.a(fragment, arrayList2, sb2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) p6dVar.j.getValue();
                        return (pair == null || (list2 = (List) pair.a) == null) ? new ArrayList() : list2;
                    case 5:
                        Pair pair2 = (Pair) p6dVar.j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.b;
                        }
                        return null;
                    case 6:
                        String str11 = (String) p6dVar.l.getValue();
                        if (str11 != null) {
                            return new Regex(str11, uuf.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str12 = p6dVar.n;
                        if (str12 != null) {
                            return new Regex(str12);
                        }
                        return null;
                }
            }
        });
        final int i6 = 5;
        this.l = ypa.a(ysaVar, new Function0(this) { // from class: n6d
            public final /* synthetic */ p6d b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list2;
                int i22 = i6;
                p6d p6dVar = this.b;
                switch (i22) {
                    case 0:
                        String str4 = p6dVar.e;
                        if (str4 != null) {
                            return new Regex(str4, uuf.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = p6dVar.a;
                        return Boolean.valueOf(str5 != null && p6d.v.f(str5));
                    case 2:
                        String str6 = p6dVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) p6dVar.g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    ogj.h(bf3.k("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) CollectionsKt.firstOrNull(queryParameters);
                                if (str8 == null) {
                                    p6dVar.i = true;
                                    str8 = str7;
                                }
                                o6d o6dVar = new o6d();
                                int i32 = 0;
                                for (txb b = p6d.r.b(str8); b != null; b = b.next()) {
                                    MatchGroup c = b.c.c(1);
                                    c.getClass();
                                    String str9 = c.a;
                                    str9.getClass();
                                    o6dVar.b.add(str9);
                                    if (b.b().a > i32) {
                                        String substring = str8.substring(i32, b.b().a);
                                        Regex.b.getClass();
                                        String quote = Pattern.quote(substring);
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = b.b().b + 1;
                                }
                                if (i32 < str8.length()) {
                                    quf qufVar = Regex.b;
                                    String substring2 = str8.substring(i32);
                                    qufVar.getClass();
                                    String quote2 = Pattern.quote(substring2);
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                o6dVar.a = p6d.h(sb.toString());
                                linkedHashMap.put(str7, o6dVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = p6dVar.a;
                        if (str10 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str10);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str10);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        p6d.a(fragment, arrayList2, sb2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) p6dVar.j.getValue();
                        return (pair == null || (list2 = (List) pair.a) == null) ? new ArrayList() : list2;
                    case 5:
                        Pair pair2 = (Pair) p6dVar.j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.b;
                        }
                        return null;
                    case 6:
                        String str11 = (String) p6dVar.l.getValue();
                        if (str11 != null) {
                            return new Regex(str11, uuf.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str12 = p6dVar.n;
                        if (str12 != null) {
                            return new Regex(str12);
                        }
                        return null;
                }
            }
        });
        final int i7 = 6;
        this.m = ypa.b(new Function0(this) { // from class: n6d
            public final /* synthetic */ p6d b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list2;
                int i22 = i7;
                p6d p6dVar = this.b;
                switch (i22) {
                    case 0:
                        String str4 = p6dVar.e;
                        if (str4 != null) {
                            return new Regex(str4, uuf.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = p6dVar.a;
                        return Boolean.valueOf(str5 != null && p6d.v.f(str5));
                    case 2:
                        String str6 = p6dVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) p6dVar.g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    ogj.h(bf3.k("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) CollectionsKt.firstOrNull(queryParameters);
                                if (str8 == null) {
                                    p6dVar.i = true;
                                    str8 = str7;
                                }
                                o6d o6dVar = new o6d();
                                int i32 = 0;
                                for (txb b = p6d.r.b(str8); b != null; b = b.next()) {
                                    MatchGroup c = b.c.c(1);
                                    c.getClass();
                                    String str9 = c.a;
                                    str9.getClass();
                                    o6dVar.b.add(str9);
                                    if (b.b().a > i32) {
                                        String substring = str8.substring(i32, b.b().a);
                                        Regex.b.getClass();
                                        String quote = Pattern.quote(substring);
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = b.b().b + 1;
                                }
                                if (i32 < str8.length()) {
                                    quf qufVar = Regex.b;
                                    String substring2 = str8.substring(i32);
                                    qufVar.getClass();
                                    String quote2 = Pattern.quote(substring2);
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                o6dVar.a = p6d.h(sb.toString());
                                linkedHashMap.put(str7, o6dVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = p6dVar.a;
                        if (str10 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str10);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str10);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        p6d.a(fragment, arrayList2, sb2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) p6dVar.j.getValue();
                        return (pair == null || (list2 = (List) pair.a) == null) ? new ArrayList() : list2;
                    case 5:
                        Pair pair2 = (Pair) p6dVar.j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.b;
                        }
                        return null;
                    case 6:
                        String str11 = (String) p6dVar.l.getValue();
                        if (str11 != null) {
                            return new Regex(str11, uuf.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str12 = p6dVar.n;
                        if (str12 != null) {
                            return new Regex(str12);
                        }
                        return null;
                }
            }
        });
        final int i8 = 7;
        this.o = ypa.b(new Function0(this) { // from class: n6d
            public final /* synthetic */ p6d b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list2;
                int i22 = i8;
                p6d p6dVar = this.b;
                switch (i22) {
                    case 0:
                        String str4 = p6dVar.e;
                        if (str4 != null) {
                            return new Regex(str4, uuf.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = p6dVar.a;
                        return Boolean.valueOf(str5 != null && p6d.v.f(str5));
                    case 2:
                        String str6 = p6dVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) p6dVar.g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    ogj.h(bf3.k("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) CollectionsKt.firstOrNull(queryParameters);
                                if (str8 == null) {
                                    p6dVar.i = true;
                                    str8 = str7;
                                }
                                o6d o6dVar = new o6d();
                                int i32 = 0;
                                for (txb b = p6d.r.b(str8); b != null; b = b.next()) {
                                    MatchGroup c = b.c.c(1);
                                    c.getClass();
                                    String str9 = c.a;
                                    str9.getClass();
                                    o6dVar.b.add(str9);
                                    if (b.b().a > i32) {
                                        String substring = str8.substring(i32, b.b().a);
                                        Regex.b.getClass();
                                        String quote = Pattern.quote(substring);
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = b.b().b + 1;
                                }
                                if (i32 < str8.length()) {
                                    quf qufVar = Regex.b;
                                    String substring2 = str8.substring(i32);
                                    qufVar.getClass();
                                    String quote2 = Pattern.quote(substring2);
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                o6dVar.a = p6d.h(sb.toString());
                                linkedHashMap.put(str7, o6dVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = p6dVar.a;
                        if (str10 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str10);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str10);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        p6d.a(fragment, arrayList2, sb2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) p6dVar.j.getValue();
                        return (pair == null || (list2 = (List) pair.a) == null) ? new ArrayList() : list2;
                    case 5:
                        Pair pair2 = (Pair) p6dVar.j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.b;
                        }
                        return null;
                    case 6:
                        String str11 = (String) p6dVar.l.getValue();
                        if (str11 != null) {
                            return new Regex(str11, uuf.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str12 = p6dVar.n;
                        if (str12 != null) {
                            return new Regex(str12);
                        }
                        return null;
                }
            }
        });
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            if (!q.a(str)) {
                String pattern = s.a.pattern();
                pattern.getClass();
                sb.append(pattern);
            }
            txb b = new Regex("(\\?|#|$)").b(str);
            if (b != null) {
                a(str.substring(0, b.b().a), arrayList, sb);
                this.p = (t.a(sb) || u.a(sb)) ? false : true;
                sb.append("($|(\\?(.)*)|(#(.)*))");
            }
            this.e = h(sb.toString());
        }
        if (str3 == null) {
            return;
        }
        if (!new Regex("^[\\s\\S]+/[\\s\\S]+$").f(str3)) {
            ogj.h(lnb.o("The given mimeType ", str3, " does not match to required \"type/subtype\" format"));
            throw null;
        }
        List h = new Regex("/").h(str3);
        if (!h.isEmpty()) {
            ListIterator listIterator = h.listIterator(h.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    list = CollectionsKt.L0(h, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        list = km5.a;
        this.n = c.r(bf3.k("^(", (String) list.get(0), "|[*]+)/(", (String) list.get(1), "|[*]+)$"), "*|[*]", "[\\s\\S]", false);
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        int i = 0;
        for (txb b = r.b(str); b != null; b = b.next()) {
            MatchGroup c = b.c.c(1);
            c.getClass();
            arrayList.add(c.a);
            if (b.b().a > i) {
                quf qufVar = Regex.b;
                String substring = str.substring(i, b.b().a);
                qufVar.getClass();
                String quote = Pattern.quote(substring);
                quote.getClass();
                sb.append(quote);
            }
            String pattern = u.a.pattern();
            pattern.getClass();
            sb.append(pattern);
            i = b.b().b + 1;
        }
        if (i < str.length()) {
            quf qufVar2 = Regex.b;
            String substring2 = str.substring(i);
            qufVar2.getClass();
            String quote2 = Pattern.quote(substring2);
            quote2.getClass();
            sb.append(quote2);
        }
    }

    public static void g(Bundle bundle, String str, String str2, a6d a6dVar) {
        if (a6dVar == null) {
            r4a.H(str, bundle, str2);
            return;
        }
        b8d b8dVar = a6dVar.a;
        str.getClass();
        b8dVar.e(bundle, str, b8dVar.d(str2));
    }

    public static String h(String str) {
        return (StringsKt.J(str, "\\Q", false) && StringsKt.J(str, "\\E", false)) ? c.r(str, ".*", "\\E.*\\Q", false) : StringsKt.J(str, "\\.\\*", false) ? c.r(str, "\\.\\*", ".*", false) : str;
    }

    public final int b(Uri uri) {
        String str;
        if (uri == null || (str = this.a) == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri parse = Uri.parse(str);
        parse.getClass();
        return CollectionsKt.d0(pathSegments, parse.getPathSegments()).size();
    }

    public final ArrayList c() {
        Collection values = ((Map) this.h.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            o13.v(((o6d) it.next()).b, arrayList);
        }
        return CollectionsKt.w0((List) this.k.getValue(), CollectionsKt.w0(arrayList, this.d));
    }

    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        txb e;
        txb e2;
        String str;
        String str2;
        uri.getClass();
        Regex regex = (Regex) this.f.getValue();
        if (regex != null && (e = regex.e(uri.toString())) != null) {
            lm5.a.getClass();
            int i = 0;
            Bundle E = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
            if (e(e, E, linkedHashMap) && (!((Boolean) this.g.getValue()).booleanValue() || f(uri, E, linkedHashMap))) {
                String fragment = uri.getFragment();
                Regex regex2 = (Regex) this.m.getValue();
                if (regex2 != null && (e2 = regex2.e(String.valueOf(fragment))) != null) {
                    List list = (List) this.k.getValue();
                    ArrayList arrayList = new ArrayList(k13.r(list, 10));
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            b.q();
                            throw null;
                        }
                        String str3 = (String) obj;
                        MatchGroup c = e2.c.c(i2);
                        if (c == null || (str2 = c.a) == null) {
                            str = null;
                        } else {
                            str = Uri.decode(str2);
                            str.getClass();
                        }
                        if (str == null) {
                            str = "";
                        }
                        try {
                            g(E, str3, str, (a6d) linkedHashMap.get(str3));
                            arrayList.add(Unit.a);
                            i = i2;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (i2a.D(linkedHashMap, new e0c(1, E)).isEmpty()) {
                    return E;
                }
            }
        }
        return null;
    }

    public final boolean e(txb txbVar, Bundle bundle, LinkedHashMap linkedHashMap) {
        String str;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            String str2 = null;
            if (i < 0) {
                b.q();
                throw null;
            }
            String str3 = (String) next;
            MatchGroup c = txbVar.c.c(i2);
            if (c != null && (str = c.a) != null) {
                str2 = Uri.decode(str);
                str2.getClass();
            }
            if (str2 == null) {
                str2 = "";
            }
            try {
                g(bundle, str3, str2, (a6d) linkedHashMap.get(str3));
                arrayList2.add(Unit.a);
                i = i2;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof p6d)) {
            p6d p6dVar = (p6d) obj;
            if (Intrinsics.c(this.a, p6dVar.a) && Intrinsics.c(this.b, p6dVar.b) && Intrinsics.c(this.c, p6dVar.c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.LinkedHashMap] */
    public final boolean f(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        Object obj;
        boolean z;
        String query;
        for (Map.Entry entry : ((Map) this.h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            o6d o6dVar = (o6d) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.i && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = a.c(query);
            }
            lm5.a.getClass();
            boolean z2 = false;
            Bundle E = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
            Iterator it = o6dVar.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                a6d a6dVar = (a6d) linkedHashMap.get(str2);
                b8d b8dVar = a6dVar != null ? a6dVar.a : null;
                if ((b8dVar instanceof i13) && !a6dVar.c) {
                    i13 i13Var = (i13) b8dVar;
                    i13Var.e(E, str2, i13Var.g());
                }
            }
            for (String str3 : queryParameters) {
                String str4 = o6dVar.a;
                txb e = str4 != null ? new Regex(str4).e(str3) : null;
                if (e == null) {
                    return z2;
                }
                ArrayList arrayList = o6dVar.b;
                ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                ?? r13 = z2;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i = r13 + 1;
                    if (r13 < 0) {
                        b.q();
                        throw null;
                    }
                    String str5 = (String) next;
                    MatchGroup c = e.c.c(i);
                    String str6 = c != null ? c.a : null;
                    if (str6 == null) {
                        str6 = "";
                    }
                    a6d a6dVar2 = (a6d) linkedHashMap.get(str5);
                    try {
                        if (o3a.r(E, str5)) {
                            if (E.containsKey(str5)) {
                                if (a6dVar2 != null) {
                                    b8d b8dVar2 = a6dVar2.a;
                                    Object a = b8dVar2.a(E, str5);
                                    if (!E.containsKey(str5)) {
                                        throw new IllegalArgumentException("There is no previous value in this savedState.");
                                    }
                                    b8dVar2.e(E, str5, b8dVar2.c(a, str6));
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            obj = Boolean.valueOf(z);
                        } else {
                            g(E, str5, str6, a6dVar2);
                            obj = Unit.a;
                        }
                    } catch (IllegalArgumentException unused) {
                        obj = Unit.a;
                    }
                    arrayList2.add(obj);
                    r13 = i;
                    z2 = false;
                }
            }
            bundle.putAll(E);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
