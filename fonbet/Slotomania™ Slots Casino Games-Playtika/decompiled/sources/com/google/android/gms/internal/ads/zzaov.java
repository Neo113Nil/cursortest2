package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ironsource.M6;
import com.ironsource.X3;
import io.ktor.sse.ServerSentEventKt;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzaov {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzc = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzd = Collections.unmodifiableMap(hashMap2);
    }

    public static zzaop zza(zzes zzesVar, List list) {
        String zzN = zzesVar.zzN(StandardCharsets.UTF_8);
        if (zzN != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(zzN);
            if (matcher.matches()) {
                return zzd(null, matcher, zzesVar, list);
            }
            String zzN2 = zzesVar.zzN(StandardCharsets.UTF_8);
            if (zzN2 != null) {
                Matcher matcher2 = pattern.matcher(zzN2);
                if (matcher2.matches()) {
                    return zzd(zzN.trim(), matcher2, zzesVar, list);
                }
            }
        }
        return null;
    }

    static zzcw zzb(String str) {
        zzaou zzaouVar = new zzaou();
        zze(str, zzaouVar);
        return zzaouVar.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static SpannedString zzc(String str, String str2, List list) {
        char c;
        char c2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            int i2 = i + 1;
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                int indexOf = str2.indexOf(59, i2);
                int indexOf2 = str2.indexOf(32, i2);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    String substring = str2.substring(i2, indexOf);
                    int hashCode = substring.hashCode();
                    if (hashCode == 3309) {
                        if (substring.equals("gt")) {
                            c2 = 1;
                            if (c2 != 0) {
                            }
                            if (indexOf == indexOf2) {
                            }
                            i = indexOf + 1;
                        }
                        c2 = 65535;
                        if (c2 != 0) {
                        }
                        if (indexOf == indexOf2) {
                        }
                        i = indexOf + 1;
                    } else if (hashCode == 3464) {
                        if (substring.equals("lt")) {
                            c2 = 0;
                            if (c2 != 0) {
                            }
                            if (indexOf == indexOf2) {
                            }
                            i = indexOf + 1;
                        }
                        c2 = 65535;
                        if (c2 != 0) {
                        }
                        if (indexOf == indexOf2) {
                        }
                        i = indexOf + 1;
                    } else if (hashCode != 96708) {
                        if (hashCode == 3374865 && substring.equals("nbsp")) {
                            c2 = 2;
                            if (c2 != 0) {
                                spannableStringBuilder.append(Typography.less);
                            } else if (c2 == 1) {
                                spannableStringBuilder.append(Typography.greater);
                            } else if (c2 == 2) {
                                spannableStringBuilder.append(' ');
                            } else if (c2 != 3) {
                                StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 33);
                                sb.append("ignoring unsupported entity: '&");
                                sb.append(substring);
                                sb.append(";'");
                                zzef.zzc("WebvttCueParser", sb.toString());
                            } else {
                                spannableStringBuilder.append(Typography.amp);
                            }
                            if (indexOf == indexOf2) {
                                spannableStringBuilder.append((CharSequence) ServerSentEventKt.SPACE);
                            }
                            i = indexOf + 1;
                        }
                        c2 = 65535;
                        if (c2 != 0) {
                        }
                        if (indexOf == indexOf2) {
                        }
                        i = indexOf + 1;
                    } else {
                        if (substring.equals("amp")) {
                            c2 = 3;
                            if (c2 != 0) {
                            }
                            if (indexOf == indexOf2) {
                            }
                            i = indexOf + 1;
                        }
                        c2 = 65535;
                        if (c2 != 0) {
                        }
                        if (indexOf == indexOf2) {
                        }
                        i = indexOf + 1;
                    }
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
            } else if (i2 < str2.length()) {
                char charAt2 = str2.charAt(i2);
                int indexOf3 = str2.indexOf(62, i2);
                i2 = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                int i3 = i2 - 2;
                boolean z = str2.charAt(i3) == '/';
                int i4 = i + (charAt2 == '/' ? 2 : 1);
                if (!z) {
                    i3 = i2 - 1;
                }
                String substring2 = str2.substring(i4, i3);
                if (!substring2.trim().isEmpty()) {
                    String trim = substring2.trim();
                    zzgsw.zza(!trim.isEmpty());
                    String str3 = zzfk.zza;
                    String str4 = trim.split("[ \\.]", 2)[0];
                    int hashCode2 = str4.hashCode();
                    if (hashCode2 == 98) {
                        if (str4.equals("b")) {
                            c = 0;
                            switch (c) {
                            }
                        }
                        c = 65535;
                        switch (c) {
                        }
                    } else if (hashCode2 == 99) {
                        if (str4.equals("c")) {
                            c = 1;
                            switch (c) {
                            }
                        }
                        c = 65535;
                        switch (c) {
                        }
                    } else if (hashCode2 == 105) {
                        if (str4.equals("i")) {
                            c = 2;
                            switch (c) {
                            }
                        }
                        c = 65535;
                        switch (c) {
                        }
                    } else if (hashCode2 == 3650) {
                        if (str4.equals("rt")) {
                            c = 5;
                            switch (c) {
                            }
                        }
                        c = 65535;
                        switch (c) {
                        }
                    } else if (hashCode2 == 3314158) {
                        if (str4.equals(M6.q)) {
                            c = 3;
                            switch (c) {
                            }
                        }
                        c = 65535;
                        switch (c) {
                        }
                    } else if (hashCode2 == 3511770) {
                        if (str4.equals(TtmlNode.ATTR_TTS_RUBY)) {
                            c = 4;
                            switch (c) {
                            }
                        }
                        c = 65535;
                        switch (c) {
                        }
                    } else if (hashCode2 != 117) {
                        if (hashCode2 == 118 && str4.equals("v")) {
                            c = 7;
                            switch (c) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    if (charAt2 != '/') {
                                        if (!z) {
                                            arrayDeque.push(zzaos.zza(substring2, spannableStringBuilder.length()));
                                            break;
                                        }
                                    } else {
                                        while (!arrayDeque.isEmpty()) {
                                            zzaos zzaosVar = (zzaos) arrayDeque.pop();
                                            zzf(str, zzaosVar, arrayList, spannableStringBuilder, list);
                                            if (arrayDeque.isEmpty()) {
                                                arrayList.clear();
                                            } else {
                                                arrayList.add(new zzaor(zzaosVar, spannableStringBuilder.length(), null));
                                            }
                                            if (zzaosVar.zza.equals(str4)) {
                                                break;
                                            }
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                        c = 65535;
                        switch (c) {
                        }
                    } else {
                        if (str4.equals("u")) {
                            c = 6;
                            switch (c) {
                            }
                        }
                        c = 65535;
                        switch (c) {
                        }
                    }
                }
            }
            i = i2;
        }
        while (!arrayDeque.isEmpty()) {
            zzf(str, (zzaos) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        zzf(str, zzaos.zzb(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static zzaop zzd(String str, Matcher matcher, zzes zzesVar, List list) {
        zzaou zzaouVar = new zzaou();
        try {
            String group = matcher.group(1);
            if (group == null) {
                throw null;
            }
            String str2 = group;
            zzaouVar.zza = zzaox.zza(group);
            String group2 = matcher.group(2);
            if (group2 == null) {
                throw null;
            }
            String str3 = group2;
            zzaouVar.zzb = zzaox.zza(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            zze(group3, zzaouVar);
            StringBuilder sb = new StringBuilder();
            String zzN = zzesVar.zzN(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(zzN)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(zzN.trim());
                zzN = zzesVar.zzN(StandardCharsets.UTF_8);
            }
            zzaouVar.zzc = zzc(str, sb.toString(), list);
            return new zzaop(zzaouVar.zza().zzr(), zzaouVar.zza, zzaouVar.zzb);
        } catch (IllegalArgumentException unused) {
            String group4 = matcher.group();
            String.valueOf(group4);
            zzef.zzc("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(group4)));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void zze(String str, zzaou zzaouVar) {
        char c;
        char c2;
        char c3;
        Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String group = matcher.group(1);
            group.getClass();
            int i2 = 2;
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    char c4 = 65535;
                    if (indexOf != -1) {
                        String substring = group2.substring(indexOf + 1);
                        switch (substring.hashCode()) {
                            case -1364013995:
                                if (substring.equals(TtmlNode.CENTER)) {
                                    c4 = 1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring.equals("middle")) {
                                    c4 = 2;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring.equals(TtmlNode.END)) {
                                    c4 = 3;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring.equals(TtmlNode.START)) {
                                    c4 = 0;
                                    break;
                                }
                                break;
                        }
                        if (c4 == 0) {
                            i2 = 0;
                        } else if (c4 == 1 || c4 == 2) {
                            i2 = 1;
                        } else if (c4 != 3) {
                            String.valueOf(substring);
                            zzef.zzc("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(substring)));
                            i2 = Integer.MIN_VALUE;
                        }
                        zzaouVar.zzg = i2;
                        group2 = group2.substring(0, indexOf);
                    }
                    if (group2.endsWith("%")) {
                        zzaouVar.zze = zzaox.zzb(group2);
                        zzaouVar.zzf = 0;
                    } else {
                        zzaouVar.zze = Integer.parseInt(group2);
                        zzaouVar.zzf = 1;
                    }
                } else if ("align".equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals(TtmlNode.CENTER)) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 100571:
                            if (group2.equals(TtmlNode.END)) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 108511772:
                            if (group2.equals(TtmlNode.RIGHT)) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 109757538:
                            if (group2.equals(TtmlNode.START)) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            if (c != 2 && c != 3) {
                                if (c == 4) {
                                    i = 3;
                                } else if (c != 5) {
                                    zzef.zzc("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                } else {
                                    i = 5;
                                }
                            }
                            i = 2;
                        } else {
                            i = 4;
                        }
                    }
                    zzaouVar.zzd = i;
                } else if (X3.i.L.equals(group)) {
                    int indexOf2 = group2.indexOf(44);
                    if (indexOf2 != -1) {
                        String substring2 = group2.substring(indexOf2 + 1);
                        switch (substring2.hashCode()) {
                            case -1842484672:
                                if (substring2.equals("line-left")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1364013995:
                                if (substring2.equals(TtmlNode.CENTER)) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1276788989:
                                if (substring2.equals("line-right")) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1074341483:
                                if (substring2.equals("middle")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 100571:
                                if (substring2.equals(TtmlNode.END)) {
                                    c3 = 5;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 109757538:
                                if (substring2.equals(TtmlNode.START)) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        if (c3 == 0 || c3 == 1) {
                            i = 0;
                        } else if (c3 != 2 && c3 != 3) {
                            if (c3 == 4 || c3 == 5) {
                                i = 2;
                            } else {
                                String.valueOf(substring2);
                                zzef.zzc("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(substring2)));
                                i = Integer.MIN_VALUE;
                            }
                        }
                        zzaouVar.zzi = i;
                        group2 = group2.substring(0, indexOf2);
                    }
                    zzaouVar.zzh = zzaox.zzb(group2);
                } else if ("size".equals(group)) {
                    zzaouVar.zzj = zzaox.zzb(group2);
                } else if ("vertical".equals(group)) {
                    int hashCode = group2.hashCode();
                    if (hashCode != 3462) {
                        if (hashCode == 3642 && group2.equals("rl")) {
                            c2 = 0;
                        }
                        c2 = 65535;
                    } else {
                        if (group2.equals("lr")) {
                            c2 = 1;
                        }
                        c2 = 65535;
                    }
                    if (c2 != 0) {
                        if (c2 != 1) {
                            zzef.zzc("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i = Integer.MIN_VALUE;
                        } else {
                            i = 2;
                        }
                    }
                    zzaouVar.zzk = i;
                } else {
                    StringBuilder sb = new StringBuilder(group.length() + 21 + group2.length());
                    sb.append("Unknown cue setting ");
                    sb.append(group);
                    sb.append(":");
                    sb.append(group2);
                    zzef.zzc("WebvttCueParser", sb.toString());
                }
            } catch (NumberFormatException unused) {
                String group3 = matcher.group();
                String.valueOf(group3);
                zzef.zzc("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(group3)));
            }
        }
    }

    private static void zzf(String str, zzaos zzaosVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c;
        Comparator comparator;
        int i = zzaosVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzaosVar.zza;
        int hashCode = str2.hashCode();
        int i2 = -1;
        if (hashCode == 0) {
            if (str2.equals("")) {
                c = 7;
            }
            c = 65535;
        } else if (hashCode == 105) {
            if (str2.equals("i")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode == 3314158) {
            if (str2.equals(M6.q)) {
                c = 6;
            }
            c = 65535;
        } else if (hashCode == 3511770) {
            if (str2.equals(TtmlNode.ATTR_TTS_RUBY)) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode == 98) {
            if (str2.equals("b")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode == 99) {
            if (str2.equals("c")) {
                c = 4;
            }
            c = 65535;
        } else if (hashCode != 117) {
            if (hashCode == 118 && str2.equals("v")) {
                c = 5;
            }
            c = 65535;
        } else {
            if (str2.equals("u")) {
                c = 3;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case 2:
                int zzg = zzg(list2, str, zzaosVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                comparator = zzaor.zza;
                Collections.sort(arrayList, comparator);
                int i3 = i;
                int i4 = 0;
                int i5 = 0;
                while (i4 < arrayList.size()) {
                    if ("rt".equals(((zzaor) arrayList.get(i4)).zzc().zza)) {
                        zzaor zzaorVar = (zzaor) arrayList.get(i4);
                        int zzg2 = zzg(list2, str, zzaorVar.zzc());
                        if (zzg2 == i2) {
                            zzg2 = zzg != i2 ? zzg : 1;
                        }
                        int i6 = zzaorVar.zzc().zzb - i5;
                        int zzd2 = zzaorVar.zzd() - i5;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i6, zzd2);
                        spannableStringBuilder.delete(i6, zzd2);
                        spannableStringBuilder.setSpan(new zzdc(subSequence.toString(), zzg2), i3, i6, 33);
                        i5 += subSequence.length();
                        i3 = i6;
                    }
                    i4++;
                    i2 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case 4:
                for (String str3 : zzaosVar.zzd) {
                    Map map = zzc;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                    } else {
                        Map map2 = zzd;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
                        }
                    }
                }
                break;
            case 5:
                spannableStringBuilder.setSpan(new zzdf(zzaosVar.zzc), i, length, 33);
                break;
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List zzh = zzh(list2, str, zzaosVar);
        for (int i7 = 0; i7 < zzh.size(); i7++) {
            zzaoo zzaooVar = ((zzaot) zzh.get(i7)).zzb;
            if (zzaooVar != null) {
                if (zzaooVar.zzf() != -1) {
                    zzdd.zza(spannableStringBuilder, new StyleSpan(zzaooVar.zzf()), i, length, 33);
                }
                if (zzaooVar.zzg()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                }
                if (zzaooVar.zzo()) {
                    zzdd.zza(spannableStringBuilder, new ForegroundColorSpan(zzaooVar.zzm()), i, length, 33);
                }
                if (zzaooVar.zzr()) {
                    zzdd.zza(spannableStringBuilder, new BackgroundColorSpan(zzaooVar.zzp()), i, length, 33);
                }
                if (zzaooVar.zzk() != null) {
                    zzdd.zza(spannableStringBuilder, new TypefaceSpan(zzaooVar.zzk()), i, length, 33);
                }
                int zzu = zzaooVar.zzu();
                if (zzu == 1) {
                    zzdd.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzaooVar.zzv(), true), i, length, 33);
                } else if (zzu == 2) {
                    zzdd.zza(spannableStringBuilder, new RelativeSizeSpan(zzaooVar.zzv()), i, length, 33);
                } else if (zzu == 3) {
                    zzdd.zza(spannableStringBuilder, new RelativeSizeSpan(zzaooVar.zzv() / 100.0f), i, length, 33);
                }
                if (zzaooVar.zzz()) {
                    spannableStringBuilder.setSpan(new zzdb(), i, length, 33);
                }
            }
        }
    }

    private static int zzg(List list, String str, zzaos zzaosVar) {
        List zzh = zzh(list, str, zzaosVar);
        for (int i = 0; i < zzh.size(); i++) {
            zzaoo zzaooVar = ((zzaot) zzh.get(i)).zzb;
            if (zzaooVar.zzx() != -1) {
                return zzaooVar.zzx();
            }
        }
        return -1;
    }

    private static List zzh(List list, String str, zzaos zzaosVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            zzaoo zzaooVar = (zzaoo) list.get(i);
            int zze = zzaooVar.zze(str, zzaosVar.zza, zzaosVar.zzd, zzaosVar.zzc);
            if (zze > 0) {
                arrayList.add(new zzaot(zze, zzaooVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
