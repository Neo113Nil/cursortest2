package defpackage;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import com.ironsource.L6;
import com.mbridge.msdk.foundation.controller.a;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.setting.i;
import com.sofascore.model.mvvm.model.Incident;
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
public abstract class f2l {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(String str, a2l a2lVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c2;
        int i;
        int i2;
        int i3;
        int i4 = a2lVar.b;
        int length = spannableStringBuilder.length();
        String str2 = a2lVar.a;
        str2.getClass();
        int i5 = -1;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 98:
                if (str2.equals("b")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 99:
                if (str2.equals(a.q)) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 105:
                if (str2.equals(i.a)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case ASSET_FAILED_STATUS_CODE_VALUE:
                if (str2.equals("u")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                if (str2.equals("v")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 3314158:
                if (str2.equals(L6.q)) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 6:
                break;
            case 1:
                mz1.u(1, spannableStringBuilder, i4, length, 33);
                break;
            case 2:
                for (String str3 : a2lVar.d) {
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
                break;
            case 3:
                mz1.u(2, spannableStringBuilder, i4, length, 33);
                break;
            case 4:
                mz1.w(spannableStringBuilder, i4, length, 33);
                break;
            case 5:
                spannableStringBuilder.setSpan(new mwk(a2lVar.c), i4, length, 33);
                break;
            case 7:
                int c3 = c(list2, str, a2lVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, y1l.c);
                int i6 = a2lVar.b;
                int i7 = 0;
                int i8 = 0;
                while (i7 < arrayList.size()) {
                    if ("rt".equals(((y1l) arrayList.get(i7)).a.a)) {
                        y1l y1lVar = (y1l) arrayList.get(i7);
                        int c4 = c(list2, str, y1lVar.a);
                        if (c4 == i5) {
                            c4 = c3 != i5 ? c3 : 1;
                        }
                        int i9 = y1lVar.a.b - i8;
                        int i10 = y1lVar.b - i8;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i9, i10);
                        spannableStringBuilder.delete(i9, i10);
                        spannableStringBuilder.setSpan(new i9g(subSequence.toString(), c4), i6, i9, 33);
                        i8 = subSequence.length() + i8;
                        i6 = i9;
                    }
                    i7++;
                    i5 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b2 = b(list2, str, a2lVar);
        for (int i11 = 0; i11 < b2.size(); i11++) {
            t1l t1lVar = ((c2l) b2.get(i11)).b;
            int i12 = t1lVar.l;
            if (i12 == -1 && t1lVar.m == -1) {
                i = -1;
            } else {
                i = (t1lVar.m == 1 ? (char) 2 : (char) 0) | (i12 == 1 ? (char) 1 : (char) 0);
            }
            if (i != -1) {
                int i13 = t1lVar.l;
                if (i13 == -1 && t1lVar.m == -1) {
                    i3 = -1;
                    i2 = 1;
                } else {
                    i2 = 1;
                    i3 = (i13 == 1 ? 1 : 0) | (t1lVar.m == 1 ? 2 : 0);
                }
                wba.n(spannableStringBuilder, new StyleSpan(i3), i4, length);
            } else {
                i2 = 1;
            }
            if (t1lVar.j == i2) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i4, length, 33);
            }
            if (t1lVar.k == i2) {
                mz1.w(spannableStringBuilder, i4, length, 33);
            }
            if (t1lVar.g) {
                if (!t1lVar.g) {
                    a70.r("Font color not defined");
                    return;
                }
                wba.n(spannableStringBuilder, new ForegroundColorSpan(t1lVar.f), i4, length);
            }
            if (t1lVar.i) {
                if (!t1lVar.i) {
                    a70.r("Background color not defined.");
                    return;
                }
                wba.n(spannableStringBuilder, new BackgroundColorSpan(t1lVar.h), i4, length);
            }
            if (t1lVar.e != null) {
                wba.n(spannableStringBuilder, new TypefaceSpan(t1lVar.e), i4, length);
            }
            int i14 = t1lVar.n;
            if (i14 == 1) {
                wba.n(spannableStringBuilder, new AbsoluteSizeSpan((int) t1lVar.o, true), i4, length);
            } else if (i14 == 2) {
                wba.n(spannableStringBuilder, new RelativeSizeSpan(t1lVar.o), i4, length);
            } else if (i14 == 3) {
                wba.n(spannableStringBuilder, new RelativeSizeSpan(t1lVar.o / 100.0f), i4, length);
            }
            if (t1lVar.q) {
                spannableStringBuilder.setSpan(new lf9(), i4, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, a2l a2lVar) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            t1l t1lVar = (t1l) list.get(i);
            String str2 = a2lVar.a;
            Set set = a2lVar.d;
            String str3 = a2lVar.c;
            if (t1lVar.a.isEmpty() && t1lVar.b.isEmpty() && t1lVar.c.isEmpty() && t1lVar.d.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int a2 = t1l.a(t1l.a(t1l.a(0, t1lVar.a, str, 1073741824), t1lVar.b, str2, 2), t1lVar.d, str3, 4);
                size = (a2 == -1 || !set.containsAll(t1lVar.c)) ? 0 : a2 + (t1lVar.c.size() * 4);
            }
            if (size > 0) {
                arrayList.add(new c2l(size, t1lVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, a2l a2lVar) {
        ArrayList b2 = b(list, str, a2lVar);
        for (int i = 0; i < b2.size(); i++) {
            int i2 = ((c2l) b2.get(i)).b.p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    public static v1l d(String str, Matcher matcher, j9e j9eVar, ArrayList arrayList) {
        d2l d2lVar = new d2l();
        try {
            String group = matcher.group(1);
            group.getClass();
            d2lVar.a = j2l.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            d2lVar.b = j2l.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, d2lVar);
            StringBuilder sb = new StringBuilder();
            String n = j9eVar.n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(n)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(n.trim());
                n = j9eVar.n(StandardCharsets.UTF_8);
            }
            d2lVar.c = f(str, sb.toString(), arrayList);
            return new v1l(d2lVar.b().a(), d2lVar.a, d2lVar.b);
        } catch (IllegalArgumentException unused) {
            tgj.d0("Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00be, code lost:
    
        if (r6.equals("start") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x007f, code lost:
    
        if (r5.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.CENTER) == false) goto L14;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(String str, d2l d2lVar) {
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    g(group2, d2lVar);
                } else {
                    char c2 = 5;
                    boolean z = false;
                    if ("align".equals(group)) {
                        switch (group2.hashCode()) {
                            case -1364013995:
                                break;
                            case -1074341483:
                                if (group2.equals("middle")) {
                                    z = true;
                                    break;
                                }
                                z = -1;
                                break;
                            case 100571:
                                if (group2.equals(TtmlNode.END)) {
                                    z = 2;
                                    break;
                                }
                                z = -1;
                                break;
                            case 3317767:
                                if (group2.equals("left")) {
                                    z = 3;
                                    break;
                                }
                                z = -1;
                                break;
                            case 108511772:
                                if (group2.equals("right")) {
                                    z = 4;
                                    break;
                                }
                                z = -1;
                                break;
                            case 109757538:
                                if (group2.equals("start")) {
                                    z = 5;
                                    break;
                                }
                                z = -1;
                                break;
                            default:
                                z = -1;
                                break;
                        }
                        switch (z) {
                            case false:
                            case true:
                                i = 2;
                                break;
                            case true:
                                i = 3;
                                break;
                            case true:
                                i = 4;
                                break;
                            case true:
                                i = 5;
                                break;
                            case true:
                                break;
                            default:
                                tgj.d0("Invalid alignment value: ".concat(group2));
                                i = 2;
                                break;
                        }
                        d2lVar.d = i;
                    } else if ("position".equals(group)) {
                        int indexOf = group2.indexOf(44);
                        if (indexOf != -1) {
                            String substring = group2.substring(indexOf + 1);
                            switch (substring.hashCode()) {
                                case -1842484672:
                                    if (substring.equals("line-left")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1364013995:
                                    if (substring.equals(TtmlNode.CENTER)) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1276788989:
                                    if (substring.equals("line-right")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1074341483:
                                    if (substring.equals("middle")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 100571:
                                    if (substring.equals(TtmlNode.END)) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 109757538:
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                case 5:
                                    i = 0;
                                    break;
                                case 1:
                                case 3:
                                    break;
                                case 2:
                                case 4:
                                    i = 2;
                                    break;
                                default:
                                    tgj.d0("Invalid anchor value: ".concat(substring));
                                    i = Integer.MIN_VALUE;
                                    break;
                            }
                            d2lVar.i = i;
                            group2 = group2.substring(0, indexOf);
                        }
                        d2lVar.h = j2l.b(group2);
                    } else if ("size".equals(group)) {
                        d2lVar.j = j2l.b(group2);
                    } else if ("vertical".equals(group)) {
                        if (group2.equals("lr")) {
                            i = 2;
                        } else if (!group2.equals("rl")) {
                            tgj.d0("Invalid 'vertical' value: ".concat(group2));
                            i = Integer.MIN_VALUE;
                        }
                        d2lVar.k = i;
                    } else {
                        tgj.d0("Unknown cue setting " + group + ":" + group2);
                    }
                }
            } catch (NumberFormatException unused) {
                tgj.d0("Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static SpannedString f(String str, String str2, List list) {
        char c2;
        char c3;
        String substring;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String str3 = "";
            if (i >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (a2l) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new a2l("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    substring = str2.substring(i, indexOf);
                    switch (substring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            tgj.d0("ignoring unsupported entity: '&" + substring + ";'");
                            break;
                    }
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    boolean z = str2.charAt(i2) == '/';
                    int indexOf3 = str2.indexOf(62, i2);
                    i2 = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                    int i3 = i2 - 2;
                    boolean z2 = str2.charAt(i3) == '/';
                    int i4 = i + (z ? 2 : 1);
                    if (!z2) {
                        i3 = i2 - 1;
                    }
                    String substring2 = str2.substring(i4, i3);
                    if (!substring2.trim().isEmpty()) {
                        String trim = substring2.trim();
                        z1a.s(!trim.isEmpty());
                        String str4 = nik.a;
                        String str5 = trim.split("[ \\.]", 2)[0];
                        str5.getClass();
                        switch (str5.hashCode()) {
                            case 98:
                                if (str5.equals("b")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 99:
                                if (str5.equals(a.q)) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 105:
                                if (str5.equals(i.a)) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case ASSET_FAILED_STATUS_CODE_VALUE:
                                if (str5.equals("u")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                if (str5.equals("v")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3650:
                                if (str5.equals("rt")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3314158:
                                if (str5.equals(L6.q)) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3511770:
                                if (str5.equals("ruby")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                if (z) {
                                    while (!arrayDeque.isEmpty()) {
                                        a2l a2lVar = (a2l) arrayDeque.pop();
                                        a(str, a2lVar, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new y1l(a2lVar, spannableStringBuilder.length()));
                                        }
                                        if (a2lVar.a.equals(str5)) {
                                            break;
                                        }
                                    }
                                    break;
                                } else if (!z2) {
                                    int length = spannableStringBuilder.length();
                                    String trim2 = substring2.trim();
                                    z1a.s(!trim2.isEmpty());
                                    int indexOf4 = trim2.indexOf(" ");
                                    if (indexOf4 == -1) {
                                        c3 = 0;
                                    } else {
                                        str3 = trim2.substring(indexOf4).trim();
                                        c3 = 0;
                                        trim2 = trim2.substring(0, indexOf4);
                                    }
                                    String[] split = trim2.split("\\.", -1);
                                    String str6 = split[c3];
                                    HashSet hashSet = new HashSet();
                                    for (int i5 = 1; i5 < split.length; i5++) {
                                        hashSet.add(split[i5]);
                                    }
                                    arrayDeque.push(new a2l(str6, length, str3, hashSet));
                                    break;
                                }
                                break;
                        }
                    }
                }
                i = i2;
            }
        }
    }

    public static void g(String str, d2l d2lVar) {
        String substring;
        int i;
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            substring = str.substring(indexOf + 1);
            i = 2;
            switch (substring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    tgj.d0("Invalid anchor value: ".concat(substring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            d2lVar.g = i;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            d2lVar.e = j2l.b(str);
            d2lVar.f = 0;
        } else {
            d2lVar.e = Integer.parseInt(str);
            d2lVar.f = 1;
        }
    }
}
