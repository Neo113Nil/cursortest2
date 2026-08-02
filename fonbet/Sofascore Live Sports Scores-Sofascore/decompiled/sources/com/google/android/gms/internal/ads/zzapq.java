package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import com.ironsource.L6;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.mvvm.model.Incident;
import defpackage.a70;
import defpackage.d2l;
import defpackage.mz1;
import defpackage.pin;
import defpackage.qin;
import defpackage.rin;
import defpackage.v4n;
import defpackage.w1l;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzapq {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    static {
        HashMap hashMap = new HashMap();
        w1l.p(255, 255, 255, hashMap, "white");
        w1l.p(0, 255, 0, hashMap, "lime");
        w1l.p(0, 255, 255, hashMap, "cyan");
        w1l.p(255, 0, 0, hashMap, Incident.CardIncident.CARD_RED);
        w1l.p(255, 255, 0, hashMap, Incident.CardIncident.CARD_YELLOW);
        w1l.p(255, 0, 255, hashMap, "magenta");
        w1l.p(0, 0, 255, hashMap, "blue");
        w1l.p(0, 0, 0, hashMap, "black");
        c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        w1l.p(255, 255, 255, hashMap2, "bg_white");
        w1l.p(0, 255, 0, hashMap2, "bg_lime");
        w1l.p(0, 255, 255, hashMap2, "bg_cyan");
        w1l.p(255, 0, 0, hashMap2, "bg_red");
        w1l.p(255, 255, 0, hashMap2, "bg_yellow");
        w1l.p(255, 0, 255, hashMap2, "bg_magenta");
        w1l.p(0, 0, 255, hashMap2, "bg_blue");
        w1l.p(0, 0, 0, hashMap2, "bg_black");
        d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SpannedString a(String str, String str2, List list) {
        int i;
        int i2;
        int i3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String str3 = "";
            if (i5 >= str2.length()) {
                break;
            }
            int i6 = i5 + 1;
            char charAt = str2.charAt(i5);
            if (charAt == '&') {
                int indexOf = str2.indexOf(59, i6);
                int indexOf2 = str2.indexOf(32, i6);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    String substring = str2.substring(i6, indexOf);
                    int hashCode = substring.hashCode();
                    if (hashCode == 3309) {
                        if (substring.equals("gt")) {
                            spannableStringBuilder.append('>');
                            if (indexOf == indexOf2) {
                            }
                            i5 = indexOf + 1;
                            i4 = 0;
                        }
                        StringBuilder sb = new StringBuilder(substring.length() + 33);
                        sb.append("ignoring unsupported entity: '&");
                        sb.append(substring);
                        sb.append(";'");
                        zzeh.c(sb.toString());
                        if (indexOf == indexOf2) {
                        }
                        i5 = indexOf + 1;
                        i4 = 0;
                    } else if (hashCode == 3464) {
                        if (substring.equals("lt")) {
                            spannableStringBuilder.append('<');
                            if (indexOf == indexOf2) {
                            }
                            i5 = indexOf + 1;
                            i4 = 0;
                        }
                        StringBuilder sb2 = new StringBuilder(substring.length() + 33);
                        sb2.append("ignoring unsupported entity: '&");
                        sb2.append(substring);
                        sb2.append(";'");
                        zzeh.c(sb2.toString());
                        if (indexOf == indexOf2) {
                        }
                        i5 = indexOf + 1;
                        i4 = 0;
                    } else if (hashCode != 96708) {
                        if (hashCode == 3374865 && substring.equals("nbsp")) {
                            spannableStringBuilder.append(' ');
                            if (indexOf == indexOf2) {
                                spannableStringBuilder.append((CharSequence) " ");
                            }
                            i5 = indexOf + 1;
                            i4 = 0;
                        }
                        StringBuilder sb22 = new StringBuilder(substring.length() + 33);
                        sb22.append("ignoring unsupported entity: '&");
                        sb22.append(substring);
                        sb22.append(";'");
                        zzeh.c(sb22.toString());
                        if (indexOf == indexOf2) {
                        }
                        i5 = indexOf + 1;
                        i4 = 0;
                    } else {
                        if (substring.equals("amp")) {
                            spannableStringBuilder.append('&');
                            if (indexOf == indexOf2) {
                            }
                            i5 = indexOf + 1;
                            i4 = 0;
                        }
                        StringBuilder sb222 = new StringBuilder(substring.length() + 33);
                        sb222.append("ignoring unsupported entity: '&");
                        sb222.append(substring);
                        sb222.append(";'");
                        zzeh.c(sb222.toString());
                        if (indexOf == indexOf2) {
                        }
                        i5 = indexOf + 1;
                        i4 = 0;
                    }
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
            } else if (i6 < str2.length()) {
                char charAt2 = str2.charAt(i6);
                int indexOf3 = str2.indexOf(62, i6);
                int length = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                int i7 = length - 2;
                if (str2.charAt(i7) == '/') {
                    i2 = i4;
                    i = 1;
                } else {
                    i = i4;
                    i2 = i;
                }
                int i8 = i5 + (charAt2 == '/' ? 2 : 1);
                if (i == 0) {
                    i7 = length - 1;
                }
                String substring2 = str2.substring(i8, i7);
                if (!substring2.trim().isEmpty()) {
                    String trim = substring2.trim();
                    zzguk.a(!trim.isEmpty());
                    String str4 = zzfm.a;
                    String str5 = trim.split("[ \\.]", 2)[i2];
                    int hashCode2 = str5.hashCode();
                    if (hashCode2 == 98 ? str5.equals("b") : !(hashCode2 == 99 ? !str5.equals(com.mbridge.msdk.foundation.controller.a.q) : hashCode2 == 105 ? !str5.equals(com.mbridge.msdk.setting.i.a) : hashCode2 == 3650 ? !str5.equals("rt") : hashCode2 == 3314158 ? !str5.equals(L6.q) : hashCode2 == 3511770 ? !str5.equals("ruby") : hashCode2 == 117 ? !str5.equals("u") : hashCode2 != 118 || !str5.equals("v"))) {
                        if (charAt2 == '/') {
                            while (!arrayDeque.isEmpty()) {
                                qin qinVar = (qin) arrayDeque.pop();
                                d(str, qinVar, arrayList, spannableStringBuilder, list);
                                if (arrayDeque.isEmpty()) {
                                    arrayList.clear();
                                } else {
                                    arrayList.add(new pin(qinVar, spannableStringBuilder.length()));
                                }
                                if (qinVar.a.equals(str5)) {
                                    break;
                                }
                            }
                        } else if (i == 0) {
                            int length2 = spannableStringBuilder.length();
                            String trim2 = substring2.trim();
                            zzguk.a(!trim2.isEmpty());
                            int indexOf4 = trim2.indexOf(" ");
                            if (indexOf4 == -1) {
                                i3 = i2;
                            } else {
                                str3 = trim2.substring(indexOf4).trim();
                                i3 = i2;
                                trim2 = trim2.substring(i3, indexOf4);
                            }
                            String[] split = trim2.split("\\.", -1);
                            String str6 = split[i3];
                            HashSet hashSet = new HashSet();
                            for (int i9 = 1; i9 < split.length; i9++) {
                                hashSet.add(split[i9]);
                            }
                            arrayDeque.push(new qin(str6, length2, str3, hashSet));
                            i5 = length;
                            i4 = i3;
                        }
                    }
                }
                i3 = i2;
                i5 = length;
                i4 = i3;
            }
            i5 = i6;
            i4 = 0;
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (qin) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, new qin("", i4, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    public static zzapk b(String str, Matcher matcher, zzeu zzeuVar, ArrayList arrayList) {
        d2l d2lVar = new d2l();
        try {
            String group = matcher.group(1);
            if (group == null) {
                throw null;
            }
            d2lVar.a = zzaps.a(group);
            String group2 = matcher.group(2);
            if (group2 == null) {
                throw null;
            }
            d2lVar.b = zzaps.a(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            c(group3, d2lVar);
            StringBuilder sb = new StringBuilder();
            String n = zzeuVar.n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(n)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(n.trim());
                n = zzeuVar.n(StandardCharsets.UTF_8);
            }
            d2lVar.c = a(str, sb.toString(), arrayList);
            return new zzapk(d2lVar.c().b(), d2lVar.a, d2lVar.b);
        } catch (IllegalArgumentException unused) {
            zzeh.c("Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0073, code lost:
    
        if (r7.equals("middle") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x007a, code lost:
    
        if (r7.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.CENTER) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0180, code lost:
    
        if (r8.equals("middle") != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0189, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0187, code lost:
    
        if (r8.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.CENTER) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0115, code lost:
    
        if (r8.equals("start") != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013f, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011c, code lost:
    
        if (r8.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.END) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012e, code lost:
    
        r4 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0123, code lost:
    
        if (r8.equals("middle") != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012c, code lost:
    
        if (r8.equals("line-right") != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0134, code lost:
    
        if (r8.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.CENTER) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013d, code lost:
    
        if (r8.equals("line-left") != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00be, code lost:
    
        if (r7.equals("rl") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0050, code lost:
    
        if (r7.equals("start") != false) goto L33;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(String str, d2l d2lVar) {
        int i;
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            int i2 = 1;
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    if (indexOf != -1) {
                        String substring = group2.substring(indexOf + 1);
                        switch (substring.hashCode()) {
                            case -1364013995:
                                break;
                            case -1074341483:
                                break;
                            case 100571:
                                if (substring.equals(TtmlNode.END)) {
                                    i = 2;
                                    break;
                                }
                                zzeh.c("Invalid anchor value: ".concat(substring));
                                i = Integer.MIN_VALUE;
                                break;
                            case 109757538:
                                if (substring.equals("start")) {
                                    i = 0;
                                    break;
                                }
                                zzeh.c("Invalid anchor value: ".concat(substring));
                                i = Integer.MIN_VALUE;
                                break;
                            default:
                                zzeh.c("Invalid anchor value: ".concat(substring));
                                i = Integer.MIN_VALUE;
                                break;
                        }
                        d2lVar.g = i;
                        group2 = group2.substring(0, indexOf);
                    }
                    if (group2.endsWith("%")) {
                        d2lVar.e = zzaps.b(group2);
                        d2lVar.f = 0;
                    } else {
                        d2lVar.e = Integer.parseInt(group2);
                        d2lVar.f = 1;
                    }
                } else if ("align".equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            break;
                        case -1074341483:
                            break;
                        case 100571:
                            if (group2.equals(TtmlNode.END)) {
                                i2 = 3;
                                break;
                            }
                            zzeh.c("Invalid alignment value: ".concat(group2));
                            i2 = 2;
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                i2 = 4;
                                break;
                            }
                            zzeh.c("Invalid alignment value: ".concat(group2));
                            i2 = 2;
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                i2 = 5;
                                break;
                            }
                            zzeh.c("Invalid alignment value: ".concat(group2));
                            i2 = 2;
                            break;
                        case 109757538:
                            break;
                        default:
                            zzeh.c("Invalid alignment value: ".concat(group2));
                            i2 = 2;
                            break;
                    }
                    d2lVar.d = i2;
                } else if ("position".equals(group)) {
                    int indexOf2 = group2.indexOf(44);
                    if (indexOf2 != -1) {
                        String substring2 = group2.substring(indexOf2 + 1);
                        switch (substring2.hashCode()) {
                            case -1842484672:
                                break;
                            case -1364013995:
                                break;
                            case -1276788989:
                                break;
                            case -1074341483:
                                break;
                            case 100571:
                                break;
                            case 109757538:
                                break;
                            default:
                                zzeh.c("Invalid anchor value: ".concat(substring2));
                                i2 = Integer.MIN_VALUE;
                                break;
                        }
                        d2lVar.i = i2;
                        group2 = group2.substring(0, indexOf2);
                    }
                    d2lVar.h = zzaps.b(group2);
                } else if ("size".equals(group)) {
                    d2lVar.j = zzaps.b(group2);
                } else if ("vertical".equals(group)) {
                    int hashCode = group2.hashCode();
                    if (hashCode != 3462) {
                        if (hashCode == 3642) {
                        }
                        zzeh.c("Invalid 'vertical' value: ".concat(group2));
                        i2 = Integer.MIN_VALUE;
                    } else {
                        if (group2.equals("lr")) {
                            i2 = 2;
                        }
                        zzeh.c("Invalid 'vertical' value: ".concat(group2));
                        i2 = Integer.MIN_VALUE;
                    }
                    d2lVar.k = i2;
                } else {
                    StringBuilder sb = new StringBuilder(group.length() + 21 + group2.length());
                    sb.append("Unknown cue setting ");
                    sb.append(group);
                    sb.append(":");
                    sb.append(group2);
                    zzeh.c(sb.toString());
                }
            } catch (NumberFormatException unused) {
                zzeh.c("Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }

    public static void d(String str, qin qinVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i;
        int i2;
        int i3;
        int i4 = qinVar.b;
        int length = spannableStringBuilder.length();
        String str2 = qinVar.a;
        int hashCode = str2.hashCode();
        int i5 = -1;
        if (hashCode != 0) {
            if (hashCode != 105) {
                if (hashCode != 3314158) {
                    if (hashCode == 3511770) {
                        if (!str2.equals("ruby")) {
                            return;
                        }
                        int e = e(list2, str, qinVar);
                        ArrayList arrayList = new ArrayList(list.size());
                        arrayList.addAll(list);
                        Collections.sort(arrayList, v4n.k);
                        int i6 = i4;
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < arrayList.size()) {
                            if ("rt".equals(((pin) arrayList.get(i7)).a.a)) {
                                pin pinVar = (pin) arrayList.get(i7);
                                int e2 = e(list2, str, pinVar.a);
                                if (e2 == i5) {
                                    e2 = e != i5 ? e : 1;
                                }
                                int i9 = pinVar.a.b - i8;
                                int i10 = pinVar.b - i8;
                                CharSequence subSequence = spannableStringBuilder.subSequence(i9, i10);
                                spannableStringBuilder.delete(i9, i10);
                                spannableStringBuilder.setSpan(new zzdd(subSequence.toString(), e2), i6, i9, 33);
                                i8 += subSequence.length();
                                i6 = i9;
                            }
                            i7++;
                            i5 = -1;
                        }
                    } else if (hashCode != 98) {
                        if (hashCode == 99) {
                            if (!str2.equals(com.mbridge.msdk.foundation.controller.a.q)) {
                                return;
                            }
                            for (String str3 : qinVar.d) {
                                Map map = c;
                                if (map.containsKey(str3)) {
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i4, length, 33);
                                } else {
                                    Map map2 = d;
                                    if (map2.containsKey(str3)) {
                                        spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i4, length, 33);
                                    }
                                }
                            }
                        } else if (hashCode != 117) {
                            if (hashCode != 118 || !str2.equals("v")) {
                                return;
                            } else {
                                spannableStringBuilder.setSpan(new zzdg(qinVar.c), i4, length, 33);
                            }
                        } else if (!str2.equals("u")) {
                            return;
                        } else {
                            mz1.w(spannableStringBuilder, i4, length, 33);
                        }
                    } else if (!str2.equals("b")) {
                        return;
                    } else {
                        mz1.u(1, spannableStringBuilder, i4, length, 33);
                    }
                } else if (!str2.equals(L6.q)) {
                    return;
                }
            } else if (!str2.equals(com.mbridge.msdk.setting.i.a)) {
                return;
            } else {
                mz1.u(2, spannableStringBuilder, i4, length, 33);
            }
        } else if (!str2.equals("")) {
            return;
        }
        ArrayList f = f(list2, str, qinVar);
        for (int i11 = 0; i11 < f.size(); i11++) {
            zzapj zzapjVar = ((rin) f.get(i11)).b;
            int i12 = zzapjVar.k;
            if (i12 == -1 && zzapjVar.l == -1) {
                i = -1;
            } else {
                i = (zzapjVar.l == 1 ? (char) 2 : (char) 0) | (i12 == 1 ? (char) 1 : (char) 0);
            }
            if (i != -1) {
                int i13 = zzapjVar.k;
                if (i13 == -1 && zzapjVar.l == -1) {
                    i3 = -1;
                    i2 = 1;
                } else {
                    i2 = 1;
                    i3 = (i13 == 1 ? 1 : 0) | (zzapjVar.l == 1 ? 2 : 0);
                }
                zzde.a(spannableStringBuilder, new StyleSpan(i3), i4, length);
            } else {
                i2 = 1;
            }
            if (zzapjVar.j == i2) {
                mz1.w(spannableStringBuilder, i4, length, 33);
            }
            if (zzapjVar.g) {
                if (!zzapjVar.g) {
                    a70.r("Font color not defined");
                    return;
                }
                zzde.a(spannableStringBuilder, new ForegroundColorSpan(zzapjVar.f), i4, length);
            }
            if (zzapjVar.i) {
                if (!zzapjVar.i) {
                    a70.r("Background color not defined.");
                    return;
                }
                zzde.a(spannableStringBuilder, new BackgroundColorSpan(zzapjVar.h), i4, length);
            }
            if (zzapjVar.e != null) {
                zzde.a(spannableStringBuilder, new TypefaceSpan(zzapjVar.e), i4, length);
            }
            int i14 = zzapjVar.m;
            if (i14 == 1) {
                zzde.a(spannableStringBuilder, new AbsoluteSizeSpan((int) zzapjVar.n, true), i4, length);
            } else if (i14 == 2) {
                zzde.a(spannableStringBuilder, new RelativeSizeSpan(zzapjVar.n), i4, length);
            } else if (i14 == 3) {
                zzde.a(spannableStringBuilder, new RelativeSizeSpan(zzapjVar.n / 100.0f), i4, length);
            }
            if (zzapjVar.p) {
                spannableStringBuilder.setSpan(new zzdc(), i4, length, 33);
            }
        }
    }

    public static int e(List list, String str, qin qinVar) {
        ArrayList f = f(list, str, qinVar);
        for (int i = 0; i < f.size(); i++) {
            int i2 = ((rin) f.get(i)).b.o;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    public static ArrayList f(List list, String str, qin qinVar) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            zzapj zzapjVar = (zzapj) list.get(i);
            String str2 = qinVar.a;
            Set set = qinVar.d;
            String str3 = qinVar.c;
            if (zzapjVar.a.isEmpty() && zzapjVar.b.isEmpty() && zzapjVar.c.isEmpty() && zzapjVar.d.isEmpty()) {
                if (TextUtils.isEmpty(str2)) {
                    size = 1;
                }
                size = 0;
            } else {
                int a2 = zzapj.a(zzapj.a(zzapj.a(0, 1073741824, zzapjVar.a, str), 2, zzapjVar.b, str2), 4, zzapjVar.d, str3);
                if (a2 != -1 && set.containsAll(zzapjVar.c)) {
                    size = a2 + (zzapjVar.c.size() * 4);
                }
                size = 0;
            }
            if (size > 0) {
                arrayList.add(new rin(size, zzapjVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
