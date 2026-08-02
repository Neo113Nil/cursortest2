package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzanu implements zzane {
    private static final Pattern zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;
    private final zzant zzc;
    private final zzes zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    public zzanu() {
        this(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0050, code lost:
    
        if (r3.equals("playresx") != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzb(zzes zzesVar, Charset charset) {
        while (true) {
            String zzN = zzesVar.zzN(charset);
            if (zzN == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(zzN)) {
                while (true) {
                    String zzN2 = zzesVar.zzN(charset);
                    if (zzN2 != null && (zzesVar.zzd() == 0 || zzesVar.zzp(charset) != 91)) {
                        String[] split = zzN2.split(":");
                        if (split.length == 2) {
                            char c = 0;
                            String zza2 = zzgsf.zza(split[0].trim());
                            switch (zza2.hashCode()) {
                                case 1879649548:
                                    break;
                                case 1879649549:
                                    if (zza2.equals("playresy")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                this.zzf = Float.parseFloat(split[1].trim());
                            } else if (c == 1) {
                                try {
                                    this.zzg = Float.parseFloat(split[1].trim());
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(zzN)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                zzanv zzanvVar = null;
                while (true) {
                    String zzN3 = zzesVar.zzN(charset);
                    if (zzN3 != null && (zzesVar.zzd() == 0 || zzesVar.zzp(charset) != 91)) {
                        if (zzN3.startsWith("Format:")) {
                            zzanvVar = zzanv.zza(zzN3);
                        } else if (zzN3.startsWith("Style:")) {
                            if (zzanvVar == null) {
                                zzef.zzc("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(zzN3));
                            } else {
                                zzanx zza3 = zzanx.zza(zzN3, zzanvVar);
                                if (zza3 != null) {
                                    linkedHashMap.put(zza3.zza, zza3);
                                }
                            }
                        }
                    }
                }
                this.zze = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(zzN)) {
                zzef.zzb("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(zzN)) {
                return;
            }
        }
    }

    private static long zzc(String str) {
        Matcher matcher = zza.matcher(str.trim());
        if (!matcher.matches()) {
            return C.TIME_UNSET;
        }
        String group = matcher.group(1);
        String str2 = zzfk.zza;
        long parseLong = Long.parseLong(group) * 3600000000L;
        long parseLong2 = Long.parseLong(matcher.group(2)) * 60000000;
        return parseLong + parseLong2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    private static float zzd(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int zze(long j, List list, List list2) {
        int i;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i - 1)));
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    @Override // com.google.android.gms.internal.ads.zzane
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(byte[] bArr, int i, int i2, zzand zzandVar, zzds zzdsVar) {
        zzant zzantVar;
        Charset charset;
        zzant zzantVar2;
        zzes zzesVar;
        int parseInt;
        long zzc;
        float f;
        Layout.Alignment alignment;
        int i3;
        int i4;
        int i5;
        Integer num;
        int i6;
        zzanu zzanuVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        zzes zzesVar2 = zzanuVar.zzd;
        zzesVar2.zzb(bArr, i + i2);
        zzesVar2.zzh(i);
        Charset zzR = zzesVar2.zzR();
        if (zzR == null) {
            zzR = StandardCharsets.UTF_8;
        }
        if (zzanuVar.zzb) {
            zzantVar = zzanuVar.zzc;
        } else {
            zzanuVar.zzb(zzesVar2, zzR);
            zzantVar = null;
        }
        while (true) {
            String zzN = zzesVar2.zzN(zzR);
            if (zzN == null) {
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    List list = (List) arrayList.get(i7);
                    if (list.isEmpty()) {
                        if (i7 != 0) {
                            i7++;
                        } else {
                            i7 = 0;
                        }
                    }
                    if (i7 == arrayList.size() - 1) {
                        throw new IllegalStateException();
                    }
                    long longValue = ((Long) arrayList2.get(i7)).longValue();
                    zzdsVar.zza(new zzamw(list, longValue, ((Long) arrayList2.get(i7 + 1)).longValue() - longValue));
                    i7++;
                }
                return;
            }
            if (zzN.startsWith("Format:")) {
                zzantVar = zzant.zza(zzN);
            } else {
                if (zzN.startsWith("Dialogue:")) {
                    if (zzantVar == null) {
                        zzef.zzc("SsaParser", "Skipping dialogue line before complete format: ".concat(zzN));
                    } else {
                        zzgsw.zza(zzN.startsWith("Dialogue:"));
                        String substring = zzN.substring(9);
                        int i8 = zzantVar.zzf;
                        String[] split = substring.split(",", i8);
                        if (split.length != i8) {
                            zzef.zzc("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(zzN));
                        } else {
                            int i9 = zzantVar.zza;
                            if (i9 != -1) {
                                try {
                                    parseInt = Integer.parseInt(split[i9].trim());
                                } catch (RuntimeException unused) {
                                    String str = split[zzantVar.zza];
                                    String.valueOf(str);
                                    zzef.zzc("SsaParser", "Fail to parse layer: ".concat(String.valueOf(str)));
                                }
                                zzc = zzc(split[zzantVar.zzb]);
                                if (zzc != C.TIME_UNSET) {
                                    zzef.zzc("SsaParser", "Skipping invalid timing: ".concat(zzN));
                                } else {
                                    long zzc2 = zzc(split[zzantVar.zzc]);
                                    if (zzc2 == C.TIME_UNSET || zzc2 <= zzc) {
                                        charset = zzR;
                                        zzantVar2 = zzantVar;
                                        zzesVar = zzesVar2;
                                        zzef.zzc("SsaParser", "Skipping invalid timing: ".concat(zzN));
                                    } else {
                                        Map map = zzanuVar.zze;
                                        zzanx zzanxVar = (map == null || (i6 = zzantVar.zzd) == -1) ? null : (zzanx) map.get(split[i6].trim());
                                        String str2 = split[zzantVar.zze];
                                        zzanw zza2 = zzanw.zza(str2);
                                        charset = zzR;
                                        String replace = zzanw.zzb(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f2 = zzanuVar.zzf;
                                        float f3 = zzanuVar.zzg;
                                        SpannableString spannableString = new SpannableString(replace);
                                        zzcw zzcwVar = new zzcw();
                                        zzcwVar.zza(spannableString);
                                        zzcwVar.zzq(parseInt);
                                        if (zzanxVar != null) {
                                            Integer num2 = zzanxVar.zzc;
                                            zzantVar2 = zzantVar;
                                            if (num2 != null) {
                                                zzesVar = zzesVar2;
                                                f = f2;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                zzesVar = zzesVar2;
                                                f = f2;
                                            }
                                            if (zzanxVar.zzj == 3 && (num = zzanxVar.zzd) != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                            }
                                            float f4 = zzanxVar.zze;
                                            if (f4 != -3.4028235E38f && f3 != -3.4028235E38f) {
                                                zzcwVar.zzl(f4 / f3, 1);
                                            }
                                            boolean z = zzanxVar.zzf;
                                            if (z && zzanxVar.zzg) {
                                                i4 = 0;
                                                i5 = 33;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                i4 = 0;
                                                i5 = 33;
                                                if (z) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (zzanxVar.zzg) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (zzanxVar.zzh) {
                                                spannableString.setSpan(new UnderlineSpan(), i4, spannableString.length(), i5);
                                            }
                                            if (zzanxVar.zzi) {
                                                spannableString.setSpan(new StrikethroughSpan(), i4, spannableString.length(), i5);
                                            }
                                        } else {
                                            zzantVar2 = zzantVar;
                                            zzesVar = zzesVar2;
                                            f = f2;
                                        }
                                        int i10 = zza2.zza;
                                        if (i10 == -1) {
                                            i10 = zzanxVar != null ? zzanxVar.zzb : -1;
                                        }
                                        switch (i10) {
                                            case 0:
                                            default:
                                                StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 19);
                                                sb.append("Unknown alignment: ");
                                                sb.append(i10);
                                                zzef.zzc("SsaParser", sb.toString());
                                            case -1:
                                                alignment = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                break;
                                        }
                                        zzcwVar.zzd(alignment);
                                        int i11 = Integer.MIN_VALUE;
                                        switch (i10) {
                                            case 0:
                                            default:
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 19);
                                                sb2.append("Unknown alignment: ");
                                                sb2.append(i10);
                                                zzef.zzc("SsaParser", sb2.toString());
                                            case -1:
                                                i3 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i3 = 0;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i3 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i3 = 2;
                                                break;
                                        }
                                        zzcwVar.zzj(i3);
                                        switch (i10) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 19);
                                                sb3.append("Unknown alignment: ");
                                                sb3.append(i10);
                                                zzef.zzc("SsaParser", sb3.toString());
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i11 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i11 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                i11 = 0;
                                                break;
                                        }
                                        zzcwVar.zzg(i11);
                                        PointF pointF = zza2.zzb;
                                        if (pointF == null || f3 == -3.4028235E38f || f == -3.4028235E38f) {
                                            zzcwVar.zzi(zzd(zzcwVar.zzk()));
                                            zzcwVar.zzf(zzd(zzcwVar.zzh()), 0);
                                        } else {
                                            zzcwVar.zzi(pointF.x / f);
                                            zzcwVar.zzf(pointF.y / f3, 0);
                                        }
                                        zzcx zzr = zzcwVar.zzr();
                                        int zze = zze(zzc2, arrayList2, arrayList);
                                        for (int zze2 = zze(zzc, arrayList2, arrayList); zze2 < zze; zze2++) {
                                            ((List) arrayList.get(zze2)).add(zzr);
                                        }
                                    }
                                    zzanuVar = this;
                                    zzR = charset;
                                    zzantVar = zzantVar2;
                                    zzesVar2 = zzesVar;
                                }
                            }
                            parseInt = 0;
                            zzc = zzc(split[zzantVar.zzb]);
                            if (zzc != C.TIME_UNSET) {
                            }
                        }
                    }
                }
                charset = zzR;
                zzantVar2 = zzantVar;
                zzesVar = zzesVar2;
                zzanuVar = this;
                zzR = charset;
                zzantVar = zzantVar2;
                zzesVar2 = zzesVar;
            }
        }
    }

    public zzanu(List list) {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new zzes();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        String zzj = zzfk.zzj((byte[]) list.get(0));
        zzgsw.zza(zzj.startsWith("Format:"));
        zzant zza2 = zzant.zza(zzj);
        zza2.getClass();
        this.zzc = zza2;
        zzb(new zzes((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }
}
