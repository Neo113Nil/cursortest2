package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzany implements zzane {
    private static final Pattern zza = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final Pattern zzb = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder zzc = new StringBuilder();
    private final ArrayList zzd = new ArrayList();
    private final zzes zze = new zzes();

    public static float zzb(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long zzc(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong2 = parseLong + (Long.parseLong(group2) * 60000);
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong3 = parseLong2 + (Long.parseLong(group3) * 1000);
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzane
    public final void zza(byte[] bArr, int i, int i2, zzand zzandVar, zzds zzdsVar) {
        zzes zzesVar;
        String str;
        char c;
        char c2;
        int i3;
        zzcx zzr;
        zzany zzanyVar = this;
        zzes zzesVar2 = zzanyVar.zze;
        zzesVar2.zzb(bArr, i + i2);
        zzesVar2.zzh(i);
        Charset zzR = zzesVar2.zzR();
        if (zzR == null) {
            zzR = StandardCharsets.UTF_8;
        }
        while (true) {
            String zzN = zzesVar2.zzN(zzR);
            if (zzN == null) {
                return;
            }
            if (zzN.isEmpty()) {
                zzesVar = zzesVar2;
            } else {
                try {
                    Integer.parseInt(zzN);
                    zzes zzesVar3 = zzanyVar.zze;
                    String zzN2 = zzesVar3.zzN(zzR);
                    if (zzN2 == null) {
                        zzef.zzc("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = zza.matcher(zzN2);
                    if (matcher.matches()) {
                        long zzc = zzc(matcher, 1);
                        long zzc2 = zzc(matcher, 6);
                        StringBuilder sb = zzanyVar.zzc;
                        int i4 = 0;
                        sb.setLength(0);
                        ArrayList arrayList = zzanyVar.zzd;
                        arrayList.clear();
                        String zzN3 = zzesVar3.zzN(zzR);
                        while (!TextUtils.isEmpty(zzN3)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String trim = zzN3.trim();
                            StringBuilder sb2 = new StringBuilder(trim);
                            Matcher matcher2 = zzb.matcher(trim);
                            int i5 = i4;
                            while (matcher2.find()) {
                                String group = matcher2.group();
                                arrayList.add(group);
                                int start = matcher2.start() - i5;
                                int length = group.length();
                                sb2.replace(start, start + length, "");
                                i5 += length;
                                zzesVar2 = zzesVar2;
                            }
                            sb.append(sb2.toString());
                            zzN3 = zzesVar3.zzN(zzR);
                            i4 = 0;
                        }
                        zzesVar = zzesVar2;
                        Spanned fromHtml = Html.fromHtml(sb.toString());
                        int i6 = 0;
                        while (true) {
                            if (i6 < arrayList.size()) {
                                str = (String) arrayList.get(i6);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i6++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        zzcw zzcwVar = new zzcw();
                        zzcwVar.zza(fromHtml);
                        if (str == null) {
                            zzr = zzcwVar.zzr();
                        } else {
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (str.equals("{\\an1}")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -685620648:
                                    if (str.equals("{\\an3}")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -685620617:
                                    if (str.equals("{\\an4}")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -685620555:
                                    if (str.equals("{\\an6}")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -685620524:
                                    if (str.equals("{\\an7}")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -685620462:
                                    if (str.equals("{\\an9}")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0 || c == 1 || c == 2) {
                                zzcwVar.zzj(0);
                            } else if (c == 3 || c == 4 || c == 5) {
                                zzcwVar.zzj(2);
                            } else {
                                zzcwVar.zzj(1);
                            }
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (str.equals("{\\an1}")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -685620679:
                                    if (str.equals("{\\an2}")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -685620648:
                                    if (str.equals("{\\an3}")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -685620524:
                                    if (str.equals("{\\an7}")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -685620493:
                                    if (str.equals("{\\an8}")) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -685620462:
                                    if (str.equals("{\\an9}")) {
                                        c2 = 5;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            if (c2 == 0 || c2 == 1) {
                                i3 = 2;
                            } else if (c2 != 2) {
                                if (c2 == 3 || c2 == 4 || c2 == 5) {
                                    zzcwVar.zzg(0);
                                } else {
                                    zzcwVar.zzg(1);
                                }
                                zzcwVar.zzi(zzb(zzcwVar.zzk()));
                                zzcwVar.zzf(zzb(zzcwVar.zzh()), 0);
                                zzr = zzcwVar.zzr();
                            } else {
                                i3 = 2;
                            }
                            zzcwVar.zzg(i3);
                            zzcwVar.zzi(zzb(zzcwVar.zzk()));
                            zzcwVar.zzf(zzb(zzcwVar.zzh()), 0);
                            zzr = zzcwVar.zzr();
                        }
                        zzdsVar.zza(new zzamw(zzgvz.zzj(zzr), zzc, zzc2 - zzc));
                    } else {
                        zzesVar = zzesVar2;
                        zzef.zzc("SubripParser", "Skipping invalid timing: ".concat(zzN2));
                    }
                } catch (NumberFormatException unused) {
                    zzesVar = zzesVar2;
                    zzef.zzc("SubripParser", "Skipping invalid index: ".concat(zzN));
                }
            }
            zzanyVar = this;
            zzesVar2 = zzesVar;
        }
    }
}
