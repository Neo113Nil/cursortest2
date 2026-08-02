package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzas implements Iterable, zzao {
    private final String zza;

    public zzas(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.zza.equals(((zzas) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzar(this);
    }

    public final String toString() {
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append("\"");
        sb2.append(str);
        sb2.append("\"");
        return sb2.toString();
    }

    public final /* synthetic */ String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return this.zza;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x02d6, code lost:
    
        if (r1[r4].isEmpty() == false) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzao zzcA(String str, zzg zzgVar, List list) {
        String str2;
        String str3;
        String str4;
        int i10;
        zzas zzasVar;
        int i11;
        int i12;
        zzg zzgVar2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                throw new IllegalArgumentException(String.format("%s is not a String function", str));
            }
        }
        str4 = "undefined";
        r10 = false;
        boolean z10 = false;
        switch (str.hashCode()) {
            case -1789698943:
                String str5 = str2;
                if (str.equals(str5)) {
                    zzh.zza(str5, 1, list);
                    String str6 = this.zza;
                    zzao zza = zzgVar.zza((zzao) list.get(0));
                    if ("length".equals(zza.zzc())) {
                        return zzao.zzk;
                    }
                    double doubleValue = zza.zzd().doubleValue();
                    return (doubleValue != Math.floor(doubleValue) || (i10 = (int) doubleValue) < 0 || i10 >= str6.length()) ? zzao.zzl : zzao.zzk;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1776922004:
                if (str.equals("toString")) {
                    zzh.zza("toString", 0, list);
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    zzh.zza("toLocaleLowerCase", 0, list);
                    return new zzas(this.zza.toLowerCase());
                }
                throw new IllegalArgumentException("Command not supported");
            case -1361633751:
                if (str.equals("charAt")) {
                    zzh.zzc("charAt", 1, list);
                    int zzi = list.isEmpty() ? 0 : (int) zzh.zzi(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue());
                    String str7 = this.zza;
                    return (zzi < 0 || zzi >= str7.length()) ? zzao.zzm : new zzas(String.valueOf(str7.charAt(zzi)));
                }
                throw new IllegalArgumentException("Command not supported");
            case -1354795244:
                zzasVar = this;
                if (str.equals("concat")) {
                    if (!list.isEmpty()) {
                        StringBuilder sb2 = new StringBuilder(zzasVar.zza);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            sb2.append(zzgVar.zza((zzao) list.get(i13)).zzc());
                        }
                        return new zzas(sb2.toString());
                    }
                    return zzasVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    zzh.zza("toLowerCase", 0, list);
                    return new zzas(this.zza.toLowerCase(Locale.ENGLISH));
                }
                throw new IllegalArgumentException("Command not supported");
            case -906336856:
                if (str.equals("search")) {
                    zzh.zzc("search", 1, list);
                    return Pattern.compile(list.isEmpty() ? "undefined" : zzgVar.zza((zzao) list.get(0)).zzc()).matcher(this.zza).find() ? new zzah(Double.valueOf(r1.start())) : new zzah(Double.valueOf(-1.0d));
                }
                throw new IllegalArgumentException("Command not supported");
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    zzh.zza("toLocaleUpperCase", 0, list);
                    return new zzas(this.zza.toUpperCase());
                }
                throw new IllegalArgumentException("Command not supported");
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    zzh.zzc("lastIndexOf", 2, list);
                    String str8 = this.zza;
                    String zzc = list.size() > 0 ? zzgVar.zza((zzao) list.get(0)).zzc() : "undefined";
                    return new zzah(Double.valueOf(str8.lastIndexOf(zzc, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()) ? Double.POSITIVE_INFINITY : zzh.zzi(r3)))));
                }
                throw new IllegalArgumentException("Command not supported");
            case -399551817:
                if (str.equals("toUpperCase")) {
                    zzh.zza("toUpperCase", 0, list);
                    return new zzas(this.zza.toUpperCase(Locale.ENGLISH));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3568674:
                if (str.equals(str3)) {
                    zzh.zza("toUpperCase", 0, list);
                    return new zzas(this.zza.trim());
                }
                throw new IllegalArgumentException("Command not supported");
            case 103668165:
                if (str.equals("match")) {
                    zzh.zzc("match", 1, list);
                    Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : zzgVar.zza((zzao) list.get(0)).zzc()).matcher(this.zza);
                    return matcher.find() ? new zzae(Arrays.asList(new zzas(matcher.group()))) : zzao.zzg;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109526418:
                if (str.equals("slice")) {
                    zzh.zzc("slice", 2, list);
                    String str9 = this.zza;
                    double zzi2 = zzh.zzi(!list.isEmpty() ? zzgVar.zza((zzao) list.get(0)).zzd().doubleValue() : 0.0d);
                    double max = zzi2 < 0.0d ? Math.max(str9.length() + zzi2, 0.0d) : Math.min(zzi2, str9.length());
                    double zzi3 = zzh.zzi(list.size() > 1 ? zzgVar.zza((zzao) list.get(1)).zzd().doubleValue() : str9.length());
                    int i14 = (int) max;
                    return new zzas(str9.substring(i14, Math.max(0, ((int) (zzi3 < 0.0d ? Math.max(str9.length() + zzi3, 0.0d) : Math.min(zzi3, str9.length()))) - i14) + i14));
                }
                throw new IllegalArgumentException("Command not supported");
            case 109648666:
                if (str.equals("split")) {
                    zzh.zzc("split", 2, list);
                    String str10 = this.zza;
                    if (str10.length() == 0) {
                        return new zzae(Arrays.asList(this));
                    }
                    ArrayList arrayList = new ArrayList();
                    if (list.isEmpty()) {
                        arrayList.add(this);
                    } else {
                        String zzc2 = zzgVar.zza((zzao) list.get(0)).zzc();
                        long zzh = list.size() > 1 ? zzh.zzh(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()) : 2147483647L;
                        if (zzh == 0) {
                            return new zzae();
                        }
                        String[] split = str10.split(Pattern.quote(zzc2), ((int) zzh) + 1);
                        int length = split.length;
                        if (zzc2.isEmpty() && length > 0) {
                            boolean isEmpty = split[0].isEmpty();
                            i11 = length - 1;
                            i12 = isEmpty;
                            z10 = isEmpty;
                            break;
                        }
                        i11 = length;
                        i12 = z10;
                        if (length > zzh) {
                            i11--;
                        }
                        while (i12 < i11) {
                            arrayList.add(new zzas(split[i12]));
                            i12++;
                        }
                    }
                    return new zzae(arrayList);
                }
                throw new IllegalArgumentException("Command not supported");
            case 530542161:
                if (str.equals("substring")) {
                    zzh.zzc("substring", 2, list);
                    String str11 = this.zza;
                    int zzi4 = !list.isEmpty() ? (int) zzh.zzi(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue()) : 0;
                    int zzi5 = list.size() > 1 ? (int) zzh.zzi(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()) : str11.length();
                    int min = Math.min(Math.max(zzi4, 0), str11.length());
                    int min2 = Math.min(Math.max(zzi5, 0), str11.length());
                    return new zzas(str11.substring(Math.min(min, min2), Math.max(min, min2)));
                }
                throw new IllegalArgumentException("Command not supported");
            case 1094496948:
                zzasVar = this;
                if (str.equals("replace")) {
                    zzh.zzc("replace", 2, list);
                    zzao zzaoVar = zzao.zzf;
                    if (!list.isEmpty()) {
                        str4 = zzgVar.zza((zzao) list.get(0)).zzc();
                        if (list.size() > 1) {
                            zzaoVar = zzgVar.zza((zzao) list.get(1));
                        }
                    }
                    String str12 = str4;
                    String str13 = zzasVar.zza;
                    int indexOf = str13.indexOf(str12);
                    if (indexOf >= 0) {
                        if (zzaoVar instanceof zzai) {
                            zzaoVar = ((zzai) zzaoVar).zza(zzgVar, Arrays.asList(new zzas(str12), new zzah(Double.valueOf(indexOf)), zzasVar));
                        }
                        String substring = str13.substring(0, indexOf);
                        String zzc3 = zzaoVar.zzc();
                        String substring2 = str13.substring(indexOf + str12.length());
                        StringBuilder sb3 = new StringBuilder(String.valueOf(substring).length() + String.valueOf(zzc3).length() + String.valueOf(substring2).length());
                        sb3.append(substring);
                        sb3.append(zzc3);
                        sb3.append(substring2);
                        return new zzas(sb3.toString());
                    }
                    return zzasVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case 1943291465:
                if (str.equals("indexOf")) {
                    zzh.zzc("indexOf", 2, list);
                    String str14 = this.zza;
                    if (list.size() <= 0) {
                        zzgVar2 = zzgVar;
                    } else {
                        zzgVar2 = zzgVar;
                        str4 = zzgVar2.zza((zzao) list.get(0)).zzc();
                    }
                    return new zzah(Double.valueOf(str14.indexOf(str4, (int) zzh.zzi(list.size() < 2 ? 0.0d : zzgVar2.zza((zzao) list.get(1)).zzd().doubleValue()))));
                }
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        String str = this.zza;
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
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return new zzaq(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        return new zzas(this.zza);
    }
}
