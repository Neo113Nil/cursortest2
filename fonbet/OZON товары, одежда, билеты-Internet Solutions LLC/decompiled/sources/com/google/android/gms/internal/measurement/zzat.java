package com.google.android.gms.internal.measurement;

import B0.A0;
import G.g;
import U7.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public final class zzat implements Iterable, zzap {
    private final String zza;

    public zzat(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzat) {
            return this.zza.equals(((zzat) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzas(this);
    }

    public final String toString() {
        return A0.b("\"", this.zza, "\"");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbQ(String str, zzg zzgVar, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        char c11;
        int i11;
        String str6;
        int i12;
        int i13;
        int i14;
        zzg zzgVar2;
        int i15;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                throw new IllegalArgumentException(d.e(str, " is not a String function"));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                str4 = str2;
                str5 = "charAt";
                if (str.equals(str4)) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -1776922004:
                str5 = "charAt";
                if (str.equals("toString")) {
                    c11 = 14;
                    str4 = str2;
                    break;
                }
                str4 = str2;
                c11 = 65535;
                break;
            case -1464939364:
                str5 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    c11 = '\f';
                    str4 = str2;
                    break;
                }
                str4 = str2;
                c11 = 65535;
                break;
            case -1361633751:
                str5 = "charAt";
                if (str.equals(str5)) {
                    str4 = str2;
                    c11 = 0;
                    break;
                }
                str4 = str2;
                c11 = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str4 = str2;
                    str5 = "charAt";
                    c11 = 1;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c11 = 65535;
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    c11 = '\r';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c11 = 65535;
                break;
            case -906336856:
                if (str.equals("search")) {
                    c11 = 7;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c11 = 65535;
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    c11 = 11;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c11 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c11 = 4;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c11 = 65535;
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    c11 = 15;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c11 = 65535;
                break;
            case 3568674:
                if (str.equals(str3)) {
                    c11 = 16;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c11 = 65535;
                break;
            case 103668165:
                if (str.equals("match")) {
                    c11 = 5;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c11 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c11 = '\b';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c11 = 65535;
                break;
            case 109648666:
                if (str.equals("split")) {
                    c11 = '\t';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c11 = 65535;
                break;
            case 530542161:
                if (str.equals("substring")) {
                    c11 = '\n';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c11 = 65535;
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    c11 = 6;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c11 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    str4 = str2;
                    str5 = "charAt";
                    c11 = 3;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c11 = 65535;
                break;
            default:
                str4 = str2;
                str5 = "charAt";
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
                zzh.zzj(str5, 1, list);
                int zza = !list.isEmpty() ? (int) zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue()) : 0;
                String str7 = this.zza;
                return (zza < 0 || zza >= str7.length()) ? zzap.zzm : new zzat(String.valueOf(str7.charAt(zza)));
            case 1:
                if (list.isEmpty()) {
                    return this;
                }
                StringBuilder sb2 = new StringBuilder(this.zza);
                for (int i16 = 0; i16 < list.size(); i16++) {
                    sb2.append(zzgVar.zzb((zzap) list.get(i16)).zzi());
                }
                return new zzat(sb2.toString());
            case 2:
                zzh.zzh(str4, 1, list);
                String str8 = this.zza;
                zzap zzb = zzgVar.zzb((zzap) list.get(0));
                if ("length".equals(zzb.zzi())) {
                    return zzap.zzk;
                }
                double doubleValue = zzb.zzh().doubleValue();
                return (doubleValue != Math.floor(doubleValue) || (i11 = (int) doubleValue) < 0 || i11 >= str8.length()) ? zzap.zzl : zzap.zzk;
            case 3:
                zzh.zzj("indexOf", 2, list);
                return new zzah(Double.valueOf(this.zza.indexOf(list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzi() : "undefined", (int) zzh.zza(list.size() >= 2 ? zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() : 0.0d))));
            case 4:
                zzh.zzj("lastIndexOf", 2, list);
                String str9 = this.zza;
                String zzi = list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzi() : "undefined";
                return new zzah(Double.valueOf(str9.lastIndexOf(zzi, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) ? Double.POSITIVE_INFINITY : zzh.zza(r3)))));
            case 5:
                zzh.zzj("match", 1, list);
                Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : zzgVar.zzb((zzap) list.get(0)).zzi()).matcher(this.zza);
                return matcher.find() ? new zzae(Arrays.asList(new zzat(matcher.group()))) : zzap.zzg;
            case 6:
                zzh.zzj("replace", 2, list);
                zzap zzapVar = zzap.zzf;
                if (!list.isEmpty()) {
                    str6 = zzgVar.zzb((zzap) list.get(0)).zzi();
                    if (list.size() > 1) {
                        zzapVar = zzgVar.zzb((zzap) list.get(1));
                    }
                }
                String str10 = str6;
                String str11 = this.zza;
                int indexOf = str11.indexOf(str10);
                if (indexOf < 0) {
                    return this;
                }
                if (zzapVar instanceof zzai) {
                    i12 = 0;
                    zzapVar = ((zzai) zzapVar).zza(zzgVar, Arrays.asList(new zzat(str10), new zzah(Double.valueOf(indexOf)), this));
                } else {
                    i12 = 0;
                }
                return new zzat(g.c(str11.substring(i12, indexOf), zzapVar.zzi(), str11.substring(str10.length() + indexOf)));
            case 7:
                zzh.zzj("search", 1, list);
                return Pattern.compile(list.isEmpty() ? "undefined" : zzgVar.zzb((zzap) list.get(0)).zzi()).matcher(this.zza).find() ? new zzah(Double.valueOf(r0.start())) : new zzah(Double.valueOf(-1.0d));
            case '\b':
                zzh.zzj("slice", 2, list);
                String str12 = this.zza;
                double zza2 = zzh.zza(!list.isEmpty() ? zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue() : 0.0d);
                int max = (int) (zza2 < 0.0d ? Math.max(str12.length() + zza2, 0.0d) : Math.min(zza2, str12.length()));
                double zza3 = zzh.zza(list.size() > 1 ? zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() : str12.length());
                return new zzat(str12.substring(max, Math.max(0, ((int) (zza3 < 0.0d ? Math.max(str12.length() + zza3, 0.0d) : Math.min(zza3, str12.length()))) - max) + max));
            case '\t':
                zzh.zzj("split", 2, list);
                String str13 = this.zza;
                if (str13.length() == 0) {
                    return new zzae(Arrays.asList(this));
                }
                ArrayList arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    String zzi2 = zzgVar.zzb((zzap) list.get(0)).zzi();
                    long zzd = list.size() > 1 ? zzh.zzd(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) : 2147483647L;
                    if (zzd == 0) {
                        return new zzae();
                    }
                    String[] split = str13.split(Pattern.quote(zzi2), ((int) zzd) + 1);
                    int length = split.length;
                    if (!zzi2.isEmpty() || length <= 0) {
                        i13 = length;
                        i14 = 0;
                    } else {
                        boolean isEmpty = split[0].isEmpty();
                        i13 = length - 1;
                        i14 = isEmpty;
                        if (!split[i13].isEmpty()) {
                            i13 = length;
                            i14 = isEmpty;
                        }
                    }
                    if (length > zzd) {
                        i13--;
                    }
                    while (i14 < i13) {
                        arrayList.add(new zzat(split[i14]));
                        i14++;
                    }
                }
                return new zzae(arrayList);
            case '\n':
                zzh.zzj("substring", 2, list);
                String str14 = this.zza;
                if (list.isEmpty()) {
                    zzgVar2 = zzgVar;
                    i15 = 0;
                } else {
                    zzgVar2 = zzgVar;
                    i15 = (int) zzh.zza(zzgVar2.zzb((zzap) list.get(0)).zzh().doubleValue());
                }
                int zza4 = list.size() > 1 ? (int) zzh.zza(zzgVar2.zzb((zzap) list.get(1)).zzh().doubleValue()) : str14.length();
                int min = Math.min(Math.max(i15, 0), str14.length());
                int min2 = Math.min(Math.max(zza4, 0), str14.length());
                return new zzat(str14.substring(Math.min(min, min2), Math.max(min, min2)));
            case 11:
                zzh.zzh("toLocaleUpperCase", 0, list);
                return new zzat(this.zza.toUpperCase());
            case '\f':
                zzh.zzh("toLocaleLowerCase", 0, list);
                return new zzat(this.zza.toLowerCase());
            case '\r':
                zzh.zzh("toLowerCase", 0, list);
                return new zzat(this.zza.toLowerCase(Locale.ENGLISH));
            case 14:
                zzh.zzh("toString", 0, list);
                return this;
            case 15:
                zzh.zzh("toUpperCase", 0, list);
                return new zzat(this.zza.toUpperCase(Locale.ENGLISH));
            case 16:
                zzh.zzh("toUpperCase", 0, list);
                return new zzat(this.zza.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzat(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new zzar(this);
    }
}
