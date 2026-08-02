package com.google.android.gms.internal.measurement;

import com.google.android.gms.ads.AdError;
import defpackage.a70;
import defpackage.wt3;
import defpackage.xin;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzas implements Iterable, zzao {
    public final String a;

    public zzas(String str) {
        if (str != null) {
            this.a = str;
        } else {
            a70.p("StringValue cannot be null.");
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02d1, code lost:
    
        if (r4[r1].isEmpty() == false) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzao c(String str, zzg zzgVar, ArrayList arrayList) {
        String str2;
        String str3;
        int i;
        int i2;
        int i3;
        zzg zzgVar2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                a70.p(str.concat(" is not a String function"));
                return null;
            }
        }
        int hashCode = str.hashCode();
        String str4 = AdError.UNDEFINED_DOMAIN;
        String str5 = this.a;
        r8 = false;
        boolean z = false;
        switch (hashCode) {
            case -1789698943:
                String str6 = str2;
                if (str.equals(str6)) {
                    zzh.a(1, str6, arrayList);
                    zzao b = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0));
                    boolean equals = "length".equals(b.zzc());
                    zzaf zzafVar = zzao.N7;
                    if (equals) {
                        return zzafVar;
                    }
                    double doubleValue = b.zzd().doubleValue();
                    return (doubleValue != Math.floor(doubleValue) || (i = (int) doubleValue) < 0 || i >= str5.length()) ? zzao.O7 : zzafVar;
                }
                a70.p("Command not supported");
                return null;
            case -1776922004:
                if (str.equals("toString")) {
                    zzh.a(0, "toString", arrayList);
                    return this;
                }
                a70.p("Command not supported");
                return null;
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    zzh.a(0, "toLocaleLowerCase", arrayList);
                    return new zzas(str5.toLowerCase());
                }
                a70.p("Command not supported");
                return null;
            case -1361633751:
                if (str.equals("charAt")) {
                    zzh.c(1, "charAt", arrayList);
                    int h = arrayList.isEmpty() ? 0 : (int) zzh.h(zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzd().doubleValue());
                    return (h < 0 || h >= str5.length()) ? zzao.P7 : new zzas(String.valueOf(str5.charAt(h)));
                }
                a70.p("Command not supported");
                return null;
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb = new StringBuilder(str5);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            sb.append(zzgVar.b.b(zzgVar, (zzao) arrayList.get(i4)).zzc());
                        }
                        return new zzas(sb.toString());
                    }
                    return this;
                }
                a70.p("Command not supported");
                return null;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    zzh.a(0, "toLowerCase", arrayList);
                    return new zzas(str5.toLowerCase(Locale.ENGLISH));
                }
                a70.p("Command not supported");
                return null;
            case -906336856:
                if (str.equals("search")) {
                    zzh.c(1, "search", arrayList);
                    if (!arrayList.isEmpty()) {
                        str4 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzc();
                    }
                    return Pattern.compile(str4).matcher(str5).find() ? new zzah(Double.valueOf(r0.start())) : new zzah(Double.valueOf(-1.0d));
                }
                a70.p("Command not supported");
                return null;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    zzh.a(0, "toLocaleUpperCase", arrayList);
                    return new zzas(str5.toUpperCase());
                }
                a70.p("Command not supported");
                return null;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    zzh.c(2, "lastIndexOf", arrayList);
                    if (arrayList.size() > 0) {
                        str4 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzc();
                    }
                    String str7 = str4;
                    return new zzah(Double.valueOf(str5.lastIndexOf(str7, (int) (Double.isNaN(arrayList.size() < 2 ? Double.NaN : zzgVar.b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue()) ? Double.POSITIVE_INFINITY : zzh.h(r2)))));
                }
                a70.p("Command not supported");
                return null;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    zzh.a(0, "toUpperCase", arrayList);
                    return new zzas(str5.toUpperCase(Locale.ENGLISH));
                }
                a70.p("Command not supported");
                return null;
            case 3568674:
                if (str.equals(str3)) {
                    zzh.a(0, "toUpperCase", arrayList);
                    return new zzas(str5.trim());
                }
                a70.p("Command not supported");
                return null;
            case 103668165:
                if (str.equals("match")) {
                    zzh.c(1, "match", arrayList);
                    Matcher matcher = Pattern.compile(arrayList.size() <= 0 ? "" : zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzc()).matcher(str5);
                    return matcher.find() ? new zzae(Arrays.asList(new zzas(matcher.group()))) : zzao.J7;
                }
                a70.p("Command not supported");
                return null;
            case 109526418:
                if (str.equals("slice")) {
                    zzh.c(2, "slice", arrayList);
                    double h2 = zzh.h(!arrayList.isEmpty() ? zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzd().doubleValue() : 0.0d);
                    double max = h2 < 0.0d ? Math.max(str5.length() + h2, 0.0d) : Math.min(h2, str5.length());
                    double h3 = zzh.h(arrayList.size() > 1 ? zzgVar.b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue() : str5.length());
                    int i5 = (int) max;
                    return new zzas(str5.substring(i5, Math.max(0, ((int) (h3 < 0.0d ? Math.max(str5.length() + h3, 0.0d) : Math.min(h3, str5.length()))) - i5) + i5));
                }
                a70.p("Command not supported");
                return null;
            case 109648666:
                if (str.equals("split")) {
                    zzh.c(2, "split", arrayList);
                    if (str5.length() == 0) {
                        return new zzae(Arrays.asList(this));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        String zzc = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzc();
                        long g = arrayList.size() > 1 ? zzh.g(zzgVar.b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue()) & 4294967295L : 2147483647L;
                        if (g == 0) {
                            return new zzae();
                        }
                        String[] split = str5.split(Pattern.quote(zzc), ((int) g) + 1);
                        int length = split.length;
                        if (zzc.isEmpty() && length > 0) {
                            boolean isEmpty = split[0].isEmpty();
                            i2 = length - 1;
                            i3 = isEmpty;
                            z = isEmpty;
                            break;
                        }
                        i2 = length;
                        i3 = z;
                        if (length > g) {
                            i2--;
                        }
                        while (i3 < i2) {
                            arrayList2.add(new zzas(split[i3]));
                            i3++;
                        }
                    }
                    return new zzae(arrayList2);
                }
                a70.p("Command not supported");
                return null;
            case 530542161:
                if (str.equals("substring")) {
                    zzh.c(2, "substring", arrayList);
                    int h4 = !arrayList.isEmpty() ? (int) zzh.h(zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzd().doubleValue()) : 0;
                    int h5 = arrayList.size() > 1 ? (int) zzh.h(zzgVar.b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue()) : str5.length();
                    int min = Math.min(Math.max(h4, 0), str5.length());
                    int min2 = Math.min(Math.max(h5, 0), str5.length());
                    return new zzas(str5.substring(Math.min(min, min2), Math.max(min, min2)));
                }
                a70.p("Command not supported");
                return null;
            case 1094496948:
                if (str.equals("replace")) {
                    zzh.c(2, "replace", arrayList);
                    boolean isEmpty2 = arrayList.isEmpty();
                    zzao zzaoVar = zzao.I7;
                    if (!isEmpty2) {
                        str4 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzc();
                        if (arrayList.size() > 1) {
                            zzaoVar = zzgVar.b.b(zzgVar, (zzao) arrayList.get(1));
                        }
                    }
                    String str8 = str4;
                    int indexOf = str5.indexOf(str8);
                    if (indexOf >= 0) {
                        if (zzaoVar instanceof zzai) {
                            zzaoVar = ((zzai) zzaoVar).d(zzgVar, Arrays.asList(new zzas(str8), new zzah(Double.valueOf(indexOf)), this));
                        }
                        String substring = str5.substring(0, indexOf);
                        String zzc2 = zzaoVar.zzc();
                        String substring2 = str5.substring(str8.length() + indexOf);
                        return new zzas(wt3.m(substring, zzc2, new StringBuilder(substring.length() + String.valueOf(zzc2).length() + substring2.length()), substring2));
                    }
                    return this;
                }
                a70.p("Command not supported");
                return null;
            case 1943291465:
                if (str.equals("indexOf")) {
                    zzh.c(2, "indexOf", arrayList);
                    if (arrayList.size() <= 0) {
                        zzgVar2 = zzgVar;
                    } else {
                        zzgVar2 = zzgVar;
                        str4 = zzgVar2.b.b(zzgVar2, (zzao) arrayList.get(0)).zzc();
                    }
                    return new zzah(Double.valueOf(str5.indexOf(str4, (int) zzh.h(arrayList.size() < 2 ? 0.0d : zzgVar2.b.b(zzgVar2, (zzao) arrayList.get(1)).zzd().doubleValue()))));
                }
                a70.p("Command not supported");
                return null;
            default:
                a70.p("Command not supported");
                return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.a.equals(((zzas) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new xin(this, 1);
    }

    public final String toString() {
        String str = this.a;
        return wt3.m("\"", str, new StringBuilder(str.length() + 2), "\"");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        String str = this.a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        return Boolean.valueOf(!this.a.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return new xin(this, 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        return new zzas(this.a);
    }
}
