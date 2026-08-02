package com.google.android.gms.internal.measurement;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q implements Iterable, n {

    /* renamed from: a, reason: collision with root package name */
    public final String f5186a;

    public q(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f5186a = str;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean c() {
        return Boolean.valueOf(!this.f5186a.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double d() {
        String str = this.f5186a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator e() {
        return new p(0, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return this.f5186a.equals(((q) obj).f5186a);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02ea, code lost:
    
        if (r4[r1].isEmpty() == false) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n f(String str, com.google.firebase.messaging.x xVar, ArrayList arrayList) {
        String str2;
        String str3;
        int i5;
        int i10;
        int i11;
        com.google.firebase.messaging.x xVar2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                throw new IllegalArgumentException(str.concat(" is not a String function"));
            }
        }
        int hashCode = str.hashCode();
        String str4 = StringUtils.UNDEFINED;
        String str5 = this.f5186a;
        r7 = false;
        boolean z5 = false;
        switch (hashCode) {
            case -1789698943:
                String str6 = str2;
                if (str.equals(str6)) {
                    ci.c.f0(str6, arrayList, 1);
                    n c2 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(0));
                    boolean equals = "length".equals(c2.h());
                    e eVar = n.f5144a0;
                    if (equals) {
                        return eVar;
                    }
                    double doubleValue = c2.d().doubleValue();
                    return (doubleValue != Math.floor(doubleValue) || (i5 = (int) doubleValue) < 0 || i5 >= str5.length()) ? n.f5145b0 : eVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1776922004:
                if (str.equals("toString")) {
                    ci.c.f0("toString", arrayList, 0);
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    ci.c.f0("toLocaleLowerCase", arrayList, 0);
                    return new q(str5.toLowerCase());
                }
                throw new IllegalArgumentException("Command not supported");
            case -1361633751:
                if (str.equals("charAt")) {
                    ci.c.h0(1, "charAt", arrayList);
                    int m02 = arrayList.isEmpty() ? 0 : (int) ci.c.m0(((t) xVar.f6183b).c(xVar, (n) arrayList.get(0)).d().doubleValue());
                    return (m02 < 0 || m02 >= str5.length()) ? n.f5146c0 : new q(String.valueOf(str5.charAt(m02)));
                }
                throw new IllegalArgumentException("Command not supported");
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb2 = new StringBuilder(str5);
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            sb2.append(((t) xVar.f6183b).c(xVar, (n) arrayList.get(i12)).h());
                        }
                        return new q(sb2.toString());
                    }
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    ci.c.f0("toLowerCase", arrayList, 0);
                    return new q(str5.toLowerCase(Locale.ENGLISH));
                }
                throw new IllegalArgumentException("Command not supported");
            case -906336856:
                if (str.equals("search")) {
                    ci.c.h0(1, "search", arrayList);
                    if (!arrayList.isEmpty()) {
                        str4 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(0)).h();
                    }
                    return Pattern.compile(str4).matcher(str5).find() ? new g(Double.valueOf(r0.start())) : new g(Double.valueOf(-1.0d));
                }
                throw new IllegalArgumentException("Command not supported");
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    ci.c.f0("toLocaleUpperCase", arrayList, 0);
                    return new q(str5.toUpperCase());
                }
                throw new IllegalArgumentException("Command not supported");
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    ci.c.h0(2, "lastIndexOf", arrayList);
                    if (arrayList.size() > 0) {
                        str4 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(0)).h();
                    }
                    String str7 = str4;
                    return new g(Double.valueOf(str5.lastIndexOf(str7, (int) (Double.isNaN(arrayList.size() < 2 ? Double.NaN : ((t) xVar.f6183b).c(xVar, (n) arrayList.get(1)).d().doubleValue()) ? Double.POSITIVE_INFINITY : ci.c.m0(r1)))));
                }
                throw new IllegalArgumentException("Command not supported");
            case -399551817:
                if (str.equals("toUpperCase")) {
                    ci.c.f0("toUpperCase", arrayList, 0);
                    return new q(str5.toUpperCase(Locale.ENGLISH));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3568674:
                if (str.equals(str3)) {
                    ci.c.f0("toUpperCase", arrayList, 0);
                    return new q(str5.trim());
                }
                throw new IllegalArgumentException("Command not supported");
            case 103668165:
                if (str.equals("match")) {
                    ci.c.h0(1, "match", arrayList);
                    Matcher matcher = Pattern.compile(arrayList.size() <= 0 ? "" : ((t) xVar.f6183b).c(xVar, (n) arrayList.get(0)).h()).matcher(str5);
                    return matcher.find() ? new d(Arrays.asList(new q(matcher.group()))) : n.T;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109526418:
                if (str.equals("slice")) {
                    ci.c.h0(2, "slice", arrayList);
                    double m03 = ci.c.m0(!arrayList.isEmpty() ? ((t) xVar.f6183b).c(xVar, (n) arrayList.get(0)).d().doubleValue() : 0.0d);
                    double max = m03 < 0.0d ? Math.max(str5.length() + m03, 0.0d) : Math.min(m03, str5.length());
                    double m04 = ci.c.m0(arrayList.size() > 1 ? ((t) xVar.f6183b).c(xVar, (n) arrayList.get(1)).d().doubleValue() : str5.length());
                    int i13 = (int) max;
                    return new q(str5.substring(i13, Math.max(0, ((int) (m04 < 0.0d ? Math.max(str5.length() + m04, 0.0d) : Math.min(m04, str5.length()))) - i13) + i13));
                }
                throw new IllegalArgumentException("Command not supported");
            case 109648666:
                if (str.equals("split")) {
                    ci.c.h0(2, "split", arrayList);
                    if (str5.length() == 0) {
                        return new d(Arrays.asList(this));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        String h10 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(0)).h();
                        long l02 = arrayList.size() > 1 ? ci.c.l0(((t) xVar.f6183b).c(xVar, (n) arrayList.get(1)).d().doubleValue()) & 4294967295L : 2147483647L;
                        if (l02 == 0) {
                            return new d();
                        }
                        String[] split = str5.split(Pattern.quote(h10), ((int) l02) + 1);
                        int length = split.length;
                        if (h10.isEmpty() && length > 0) {
                            boolean isEmpty = split[0].isEmpty();
                            i10 = length - 1;
                            i11 = isEmpty;
                            z5 = isEmpty;
                            break;
                        }
                        i10 = length;
                        i11 = z5;
                        if (length > l02) {
                            i10--;
                        }
                        while (i11 < i10) {
                            arrayList2.add(new q(split[i11]));
                            i11++;
                        }
                    }
                    return new d(arrayList2);
                }
                throw new IllegalArgumentException("Command not supported");
            case 530542161:
                if (str.equals("substring")) {
                    ci.c.h0(2, "substring", arrayList);
                    int m05 = !arrayList.isEmpty() ? (int) ci.c.m0(((t) xVar.f6183b).c(xVar, (n) arrayList.get(0)).d().doubleValue()) : 0;
                    int m06 = arrayList.size() > 1 ? (int) ci.c.m0(((t) xVar.f6183b).c(xVar, (n) arrayList.get(1)).d().doubleValue()) : str5.length();
                    int min = Math.min(Math.max(m05, 0), str5.length());
                    int min2 = Math.min(Math.max(m06, 0), str5.length());
                    return new q(str5.substring(Math.min(min, min2), Math.max(min, min2)));
                }
                throw new IllegalArgumentException("Command not supported");
            case 1094496948:
                if (str.equals("replace")) {
                    ci.c.h0(2, "replace", arrayList);
                    boolean isEmpty2 = arrayList.isEmpty();
                    n nVar = n.S;
                    if (!isEmpty2) {
                        str4 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(0)).h();
                        if (arrayList.size() > 1) {
                            nVar = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(1));
                        }
                    }
                    String str8 = str4;
                    int indexOf = str5.indexOf(str8);
                    if (indexOf >= 0) {
                        if (nVar instanceof h) {
                            nVar = ((h) nVar).j(xVar, Arrays.asList(new q(str8), new g(Double.valueOf(indexOf)), this));
                        }
                        String substring = str5.substring(0, indexOf);
                        String h11 = nVar.h();
                        String substring2 = str5.substring(str8.length() + indexOf);
                        return new q(d9.e.m(new StringBuilder(String.valueOf(substring).length() + String.valueOf(h11).length() + String.valueOf(substring2).length()), substring, h11, substring2));
                    }
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case 1943291465:
                if (str.equals("indexOf")) {
                    ci.c.h0(2, "indexOf", arrayList);
                    if (arrayList.size() <= 0) {
                        xVar2 = xVar;
                    } else {
                        xVar2 = xVar;
                        str4 = ((t) xVar2.f6183b).c(xVar2, (n) arrayList.get(0)).h();
                    }
                    return new g(Double.valueOf(str5.indexOf(str4, (int) ci.c.m0(arrayList.size() < 2 ? 0.0d : ((t) xVar2.f6183b).c(xVar2, (n) arrayList.get(1)).d().doubleValue()))));
                }
                throw new IllegalArgumentException("Command not supported");
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String h() {
        return this.f5186a;
    }

    public final int hashCode() {
        return this.f5186a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n i() {
        return new q(this.f5186a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new p(1, this);
    }

    public final String toString() {
        String str = this.f5186a;
        return d9.e.m(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }
}
