package com.google.android.gms.internal.measurement;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.fo8;
import xsna.pzl;
import xsna.zr;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes12.dex */
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
        return zr.a("\"", this.zza, "\"");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v119 */
    /* JADX WARN: Type inference failed for: r1v120, types: [int] */
    /* JADX WARN: Type inference failed for: r1v152 */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.Object, java.lang.String] */
    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbR(String str, zzg zzgVar, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        char c;
        int i;
        int i2;
        int i3;
        boolean z;
        zzg zzgVar2;
        int i4;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                throw new IllegalArgumentException(fo8.a(str, " is not a String function"));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                if (str.equals(str4)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1776922004:
                str5 = "charAt";
                str6 = "toString";
                if (str.equals(str6)) {
                    c = 14;
                    str4 = str2;
                    break;
                } else {
                    str4 = str2;
                    c = 65535;
                    break;
                }
            case -1464939364:
                str5 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    c = '\f';
                    str4 = str2;
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str6 = "toString";
                c = 65535;
                break;
            case -1361633751:
                str5 = "charAt";
                if (str.equals(str5)) {
                    str4 = str2;
                    str6 = "toString";
                    c = 0;
                    break;
                }
                str4 = str2;
                str6 = "toString";
                c = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    c = 1;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    c = '\r';
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            case -906336856:
                if (str.equals("search")) {
                    c = 7;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    c = 11;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c = 4;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    c = 15;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            case 3568674:
                if (str.equals(str3)) {
                    c = 16;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            case 103668165:
                if (str.equals("match")) {
                    c = 5;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c = '\b';
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            case 109648666:
                if (str.equals("split")) {
                    c = '\t';
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            case 530542161:
                if (str.equals("substring")) {
                    c = '\n';
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    c = 6;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    c = 3;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
            default:
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c = 65535;
                break;
        }
        String str7 = StringUtils.UNDEFINED;
        String str8 = str5;
        double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        switch (c) {
            case 0:
                zzh.zzj(str8, 1, list);
                int zza = !list.isEmpty() ? (int) zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue()) : 0;
                String str9 = this.zza;
                return (zza < 0 || zza >= str9.length()) ? zzap.zzm : new zzat(String.valueOf(str9.charAt(zza)));
            case 1:
                if (list.isEmpty()) {
                    return this;
                }
                StringBuilder sb = new StringBuilder(this.zza);
                for (int i5 = 0; i5 < list.size(); i5++) {
                    sb.append(zzgVar.zzb((zzap) list.get(i5)).zzi());
                }
                return new zzat(sb.toString());
            case 2:
                zzh.zzh(str4, 1, list);
                String str10 = this.zza;
                zzap zzb = zzgVar.zzb((zzap) list.get(0));
                if ("length".equals(zzb.zzi())) {
                    return zzap.zzk;
                }
                double doubleValue = zzb.zzh().doubleValue();
                return (doubleValue != Math.floor(doubleValue) || (i = (int) doubleValue) < 0 || i >= str10.length()) ? zzap.zzl : zzap.zzk;
            case 3:
                zzh.zzj("indexOf", 2, list);
                String str11 = this.zza;
                if (list.size() > 0) {
                    str7 = zzgVar.zzb((zzap) list.get(0)).zzi();
                }
                String str12 = str7;
                if (list.size() >= 2) {
                    d = zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue();
                }
                return new zzah(Double.valueOf(str11.indexOf(str12, (int) zzh.zza(d))));
            case 4:
                zzh.zzj("lastIndexOf", 2, list);
                String str13 = this.zza;
                if (list.size() > 0) {
                    str7 = zzgVar.zzb((zzap) list.get(0)).zzi();
                }
                String str14 = str7;
                return new zzah(Double.valueOf(str13.lastIndexOf(str14, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) ? Double.POSITIVE_INFINITY : zzh.zza(r1)))));
            case 5:
                zzh.zzj("match", 1, list);
                Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : zzgVar.zzb((zzap) list.get(0)).zzi()).matcher(this.zza);
                return matcher.find() ? new zzae(Arrays.asList(new zzat(matcher.group()))) : zzap.zzg;
            case 6:
                zzh.zzj("replace", 2, list);
                zzap zzapVar = zzap.zzf;
                if (!list.isEmpty()) {
                    str7 = zzgVar.zzb((zzap) list.get(0)).zzi();
                    if (list.size() > 1) {
                        zzapVar = zzgVar.zzb((zzap) list.get(1));
                    }
                }
                String str15 = str7;
                String str16 = this.zza;
                int indexOf = str16.indexOf(str15);
                if (indexOf < 0) {
                    return this;
                }
                if (zzapVar instanceof zzai) {
                    i2 = 0;
                    zzapVar = ((zzai) zzapVar).zza(zzgVar, Arrays.asList(new zzat(str15), new zzah(Double.valueOf(indexOf)), this));
                } else {
                    i2 = 0;
                }
                return new zzat(pzl.b(str16.substring(i2, indexOf), zzapVar.zzi(), str16.substring(str15.length() + indexOf)));
            case 7:
                zzh.zzj("search", 1, list);
                if (!list.isEmpty()) {
                    str7 = zzgVar.zzb((zzap) list.get(0)).zzi();
                }
                return Pattern.compile(str7).matcher(this.zza).find() ? new zzah(Double.valueOf(r0.start())) : new zzah(Double.valueOf(-1.0d));
            case '\b':
                zzh.zzj("slice", 2, list);
                String str17 = this.zza;
                double zza2 = zzh.zza(!list.isEmpty() ? zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue() : 0.0d);
                int max = (int) (zza2 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? Math.max(str17.length() + zza2, ConnectivityTracker.DEFAULT_UPLINK_BITRATE) : Math.min(zza2, str17.length()));
                double zza3 = zzh.zza(list.size() > 1 ? zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() : str17.length());
                return new zzat(str17.substring(max, Math.max(0, ((int) (zza3 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? Math.max(str17.length() + zza3, ConnectivityTracker.DEFAULT_UPLINK_BITRATE) : Math.min(zza3, str17.length()))) - max) + max));
            case '\t':
                zzh.zzj("split", 2, list);
                String str18 = this.zza;
                if (str18.length() == 0) {
                    return new zzae(Arrays.asList(this));
                }
                ArrayList arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    String zzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                    long zzd = list.size() > 1 ? zzh.zzd(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) : 2147483647L;
                    if (zzd == 0) {
                        return new zzae();
                    }
                    String[] split = str18.split(Pattern.quote(zzi), ((int) zzd) + 1);
                    int length = split.length;
                    if (!zzi.isEmpty() || length <= 0) {
                        i3 = length;
                        z = false;
                    } else {
                        boolean isEmpty = split[0].isEmpty();
                        i3 = length - 1;
                        if (!split[i3].isEmpty()) {
                            i3 = length;
                        }
                        z = isEmpty;
                    }
                    if (length > zzd) {
                        i3--;
                    }
                    for (?? r1 = z; r1 < i3; r1++) {
                        arrayList.add(new zzat(split[r1]));
                    }
                }
                return new zzae(arrayList);
            case '\n':
                zzh.zzj("substring", 2, list);
                String str19 = this.zza;
                if (list.isEmpty()) {
                    zzgVar2 = zzgVar;
                    i4 = 0;
                } else {
                    zzgVar2 = zzgVar;
                    i4 = (int) zzh.zza(zzgVar2.zzb((zzap) list.get(0)).zzh().doubleValue());
                }
                int zza4 = list.size() > 1 ? (int) zzh.zza(zzgVar2.zzb((zzap) list.get(1)).zzh().doubleValue()) : str19.length();
                int min = Math.min(Math.max(i4, 0), str19.length());
                int min2 = Math.min(Math.max(zza4, 0), str19.length());
                return new zzat(str19.substring(Math.min(min, min2), Math.max(min, min2)));
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
                zzh.zzh(str6, 0, list);
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
            return Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
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
