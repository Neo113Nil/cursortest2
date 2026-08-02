package defpackage;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class p0i implements zli {
    public static final Pattern g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean a;
    public final he5 b;
    public LinkedHashMap d;
    public float e = -3.4028235E38f;
    public float f = -3.4028235E38f;
    public final j9e c = new j9e();

    public p0i(List list) {
        if (list == null || list.isEmpty()) {
            this.a = false;
            this.b = null;
            return;
        }
        this.a = true;
        String r = nik.r((byte[]) list.get(0));
        z1a.s(r.startsWith("Format:"));
        he5 a = he5.a(r);
        a.getClass();
        this.b = a;
        b(new j9e((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    public static int a(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    public static long c(String str) {
        Matcher matcher = g.matcher(str.trim());
        if (!matcher.matches()) {
            return C.TIME_UNSET;
        }
        String group = matcher.group(1);
        String str2 = nik.a;
        return (Long.parseLong(matcher.group(4)) * Ua.s) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(j9e j9eVar, Charset charset) {
        int i;
        u0i u0iVar;
        while (true) {
            String n = j9eVar.n(charset);
            if (n == null) {
                return;
            }
            int i2 = 2;
            int i3 = 0;
            if ("[Script Info]".equalsIgnoreCase(n)) {
                while (true) {
                    String n2 = j9eVar.n(charset);
                    if (n2 == null) {
                        break;
                    }
                    if (j9eVar.a() != 0) {
                        if ((j9eVar.h(charset) != 0 ? jaa.s(r2 >>> 8) : 1114112) == 91) {
                            break;
                        }
                    }
                    String[] split = n2.split(":");
                    if (split.length == 2) {
                        String W = rz8.W(split[0].trim());
                        W.getClass();
                        if (W.equals("playresx")) {
                            this.e = Float.parseFloat(split[1].trim());
                        } else if (W.equals("playresy")) {
                            try {
                                this.f = Float.parseFloat(split[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(n)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    q0i q0iVar = null;
                    while (true) {
                        String n3 = j9eVar.n(charset);
                        if (n3 != null) {
                            if (j9eVar.a() != 0) {
                                if ((j9eVar.h(charset) != 0 ? jaa.s(r0 >>> 8) : 1114112) == 91) {
                                }
                            }
                            int i4 = -1;
                            if (n3.startsWith("Format:")) {
                                String[] split2 = TextUtils.split(n3.substring(7), BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                                int i5 = -1;
                                int i6 = -1;
                                int i7 = -1;
                                int i8 = -1;
                                int i9 = -1;
                                int i10 = -1;
                                int i11 = -1;
                                int i12 = -1;
                                int i13 = -1;
                                int i14 = -1;
                                for (int i15 = i3; i15 < split2.length; i15++) {
                                    String W2 = rz8.W(split2[i15].trim());
                                    W2.getClass();
                                    switch (W2.hashCode()) {
                                        case -1178781136:
                                            if (W2.equals(TtmlNode.ITALIC)) {
                                                i = i3;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case -1026963764:
                                            if (W2.equals(TtmlNode.UNDERLINE)) {
                                                i = 1;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case -192095652:
                                            if (W2.equals("strikeout")) {
                                                i = i2;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case -70925746:
                                            if (W2.equals("primarycolour")) {
                                                i = 3;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 3029637:
                                            if (W2.equals(TtmlNode.BOLD)) {
                                                i = 4;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 3373707:
                                            if (W2.equals("name")) {
                                                i = 5;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 366554320:
                                            if (W2.equals("fontsize")) {
                                                i = 6;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 767321349:
                                            if (W2.equals("borderstyle")) {
                                                i = 7;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 1767875043:
                                            if (W2.equals("alignment")) {
                                                i = 8;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 1988365454:
                                            if (W2.equals("outlinecolour")) {
                                                i = 9;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        default:
                                            i = -1;
                                            break;
                                    }
                                    switch (i) {
                                        case 0:
                                            i11 = i15;
                                            break;
                                        case 1:
                                            i12 = i15;
                                            break;
                                        case 2:
                                            i13 = i15;
                                            break;
                                        case 3:
                                            i7 = i15;
                                            break;
                                        case 4:
                                            i10 = i15;
                                            break;
                                        case 5:
                                            i5 = i15;
                                            break;
                                        case 6:
                                            i9 = i15;
                                            break;
                                        case 7:
                                            i14 = i15;
                                            break;
                                        case 8:
                                            i6 = i15;
                                            break;
                                        case 9:
                                            i8 = i15;
                                            break;
                                    }
                                }
                                if (i5 != -1) {
                                    q0iVar = new q0i(i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, split2.length);
                                }
                            } else {
                                if (n3.startsWith("Style:")) {
                                    if (q0iVar == null) {
                                        tgj.d0("Skipping 'Style:' line before 'Format:' line: ".concat(n3));
                                    } else {
                                        z1a.s(n3.startsWith("Style:"));
                                        String[] split3 = TextUtils.split(n3.substring(6), BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                                        int length = split3.length;
                                        int i16 = q0iVar.k;
                                        if (length != i16) {
                                            int length2 = split3.length;
                                            String str = nik.a;
                                            Locale locale = Locale.US;
                                            StringBuilder s = lnb.s(i16, length2, "Skipping malformed 'Style:' line (expected ", " values, found ", "): '");
                                            s.append(n3);
                                            s.append("'");
                                            tgj.d0(s.toString());
                                        } else {
                                            try {
                                                String trim = split3[q0iVar.a].trim();
                                                int i17 = q0iVar.b;
                                                int a = i17 != -1 ? u0i.a(split3[i17].trim()) : -1;
                                                int i18 = q0iVar.c;
                                                Integer c = i18 != -1 ? u0i.c(split3[i18].trim()) : null;
                                                int i19 = q0iVar.d;
                                                Integer c2 = i19 != -1 ? u0i.c(split3[i19].trim()) : null;
                                                int i20 = q0iVar.e;
                                                float f = -3.4028235E38f;
                                                if (i20 != -1) {
                                                    String trim2 = split3[i20].trim();
                                                    try {
                                                        f = Float.parseFloat(trim2);
                                                    } catch (NumberFormatException e) {
                                                        tgj.e0("Failed to parse font size: '" + trim2 + "'", e);
                                                    }
                                                }
                                                float f2 = f;
                                                int i21 = q0iVar.f;
                                                boolean z = i21 != -1 && u0i.b(split3[i21].trim());
                                                int i22 = q0iVar.g;
                                                boolean z2 = i22 != -1 && u0i.b(split3[i22].trim());
                                                int i23 = q0iVar.h;
                                                boolean z3 = i23 != -1 && u0i.b(split3[i23].trim());
                                                int i24 = q0iVar.i;
                                                boolean z4 = i24 != -1 && u0i.b(split3[i24].trim());
                                                int i25 = q0iVar.j;
                                                if (i25 != -1) {
                                                    String trim3 = split3[i25].trim();
                                                    try {
                                                        int parseInt = Integer.parseInt(trim3.trim());
                                                        if (parseInt == 1 || parseInt == 3) {
                                                            i4 = parseInt;
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                    tgj.d0("Ignoring unknown BorderStyle: " + trim3);
                                                }
                                                u0iVar = new u0i(trim, a, c, c2, f2, z, z2, z3, z4, i4);
                                            } catch (RuntimeException e2) {
                                                tgj.e0("Skipping malformed 'Style:' line: '" + n3 + "'", e2);
                                            }
                                            if (u0iVar != null) {
                                                linkedHashMap.put(u0iVar.a, u0iVar);
                                            }
                                        }
                                        u0iVar = null;
                                        if (u0iVar != null) {
                                        }
                                    }
                                }
                                i2 = 2;
                                i3 = 0;
                            }
                        }
                    }
                }
                this.d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(n)) {
                tgj.O("[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(n)) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    @Override // defpackage.zli
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(byte[] bArr, int i, int i2, yli yliVar, wn3 wn3Var) {
        Charset charset;
        long j;
        he5 he5Var;
        j9e j9eVar;
        int parseInt;
        long c;
        float f;
        float f2;
        int i3;
        float f3;
        int i4;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i5;
        int i6;
        int i7;
        float f4;
        float f5;
        float f6;
        boolean z;
        int i8;
        int i9;
        float f7;
        int i10;
        int i11;
        float f8;
        int i12;
        int i13;
        int i14;
        p0i p0iVar = this;
        long j2 = yliVar.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        j9e j9eVar2 = p0iVar.c;
        j9eVar2.L(bArr, i + i2);
        j9eVar2.N(i);
        Charset J = j9eVar2.J();
        if (J == null) {
            J = StandardCharsets.UTF_8;
        }
        boolean z2 = p0iVar.a;
        if (!z2) {
            p0iVar.b(j9eVar2, J);
        }
        he5 he5Var2 = z2 ? p0iVar.b : null;
        while (true) {
            String n = j9eVar2.n(J);
            if (n == null) {
                long j3 = j2;
                ArrayList arrayList3 = (j3 == C.TIME_UNSET || !yliVar.a) ? null : new ArrayList();
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    List list = (List) arrayList.get(i15);
                    if (!list.isEmpty() || i15 == 0) {
                        if (i15 == arrayList.size() - 1) {
                            zzl.s();
                            return;
                        }
                        long longValue = ((Long) arrayList2.get(i15)).longValue();
                        long longValue2 = ((Long) arrayList2.get(i15 + 1)).longValue();
                        q74 q74Var = new q74(list, longValue, longValue2 - longValue);
                        if (j3 == C.TIME_UNSET || longValue2 >= j3) {
                            wn3Var.accept(q74Var);
                        } else if (arrayList3 != null) {
                            arrayList3.add(q74Var);
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        wn3Var.accept((q74) it.next());
                    }
                    return;
                }
                return;
            }
            if (n.startsWith("Format:")) {
                he5Var2 = he5.a(n);
            } else {
                if (n.startsWith("Dialogue:")) {
                    if (he5Var2 == null) {
                        tgj.d0("Skipping dialogue line before complete format: ".concat(n));
                    } else {
                        int i16 = he5Var2.f;
                        z1a.s(n.startsWith("Dialogue:"));
                        String substring = n.substring(9);
                        int i17 = he5Var2.a;
                        String[] split = substring.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, i16);
                        if (split.length != i16) {
                            tgj.d0("Skipping dialogue line with fewer columns than format: ".concat(n));
                        } else {
                            if (i17 != -1) {
                                try {
                                    parseInt = Integer.parseInt(split[i17].trim());
                                } catch (RuntimeException unused) {
                                    tgj.d0("Fail to parse layer: " + split[i17]);
                                }
                                c = c(split[he5Var2.b]);
                                if (c != C.TIME_UNSET) {
                                    tgj.d0("Skipping invalid timing: ".concat(n));
                                } else {
                                    j = j2;
                                    long c2 = c(split[he5Var2.c]);
                                    if (c2 == C.TIME_UNSET || c2 <= c) {
                                        charset = J;
                                        he5Var = he5Var2;
                                        j9eVar = j9eVar2;
                                        tgj.d0("Skipping invalid timing: ".concat(n));
                                    } else {
                                        LinkedHashMap linkedHashMap = p0iVar.d;
                                        u0i u0iVar = (linkedHashMap == null || (i14 = he5Var2.d) == -1) ? null : (u0i) linkedHashMap.get(split[i14].trim());
                                        String str = split[he5Var2.e];
                                        Matcher matcher = s0i.a.matcher(str);
                                        charset = J;
                                        PointF pointF = null;
                                        int i18 = -1;
                                        while (matcher.find()) {
                                            he5 he5Var3 = he5Var2;
                                            j9e j9eVar3 = j9eVar2;
                                            String group = matcher.group(1);
                                            group.getClass();
                                            try {
                                                PointF a = s0i.a(group);
                                                if (a != null) {
                                                    pointF = a;
                                                }
                                            } catch (RuntimeException unused2) {
                                            }
                                            try {
                                                Matcher matcher2 = s0i.d.matcher(group);
                                                if (matcher2.find()) {
                                                    String group2 = matcher2.group(1);
                                                    group2.getClass();
                                                    i13 = u0i.a(group2);
                                                } else {
                                                    i13 = -1;
                                                }
                                                if (i13 != -1) {
                                                    i18 = i13;
                                                }
                                            } catch (RuntimeException unused3) {
                                            }
                                            he5Var2 = he5Var3;
                                            j9eVar2 = j9eVar3;
                                        }
                                        he5Var = he5Var2;
                                        j9eVar = j9eVar2;
                                        String replace = s0i.a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f9 = p0iVar.e;
                                        float f10 = p0iVar.f;
                                        SpannableString spannableString = new SpannableString(replace);
                                        if (u0iVar != null) {
                                            boolean z3 = u0iVar.g;
                                            Integer num = u0iVar.d;
                                            Integer num2 = u0iVar.c;
                                            if (num2 != null) {
                                                z = z3;
                                                f = f9;
                                                f2 = f10;
                                                i8 = 33;
                                                i9 = 0;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                z = z3;
                                                f = f9;
                                                f2 = f10;
                                                i8 = 33;
                                                i9 = 0;
                                            }
                                            if (u0iVar.j == 3 && num != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i9, spannableString.length(), i8);
                                            }
                                            float f11 = u0iVar.e;
                                            if (f11 == -3.4028235E38f || f2 == -3.4028235E38f) {
                                                f7 = -3.4028235E38f;
                                                i10 = Integer.MIN_VALUE;
                                            } else {
                                                f7 = f11 / f2;
                                                i10 = 1;
                                            }
                                            boolean z4 = u0iVar.f;
                                            if (z4 && z) {
                                                i11 = i10;
                                                f8 = f7;
                                                i12 = 33;
                                                i3 = 0;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                i11 = i10;
                                                f8 = f7;
                                                i12 = 33;
                                                i3 = 0;
                                                if (z4) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (z) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (u0iVar.h) {
                                                spannableString.setSpan(new UnderlineSpan(), i3, spannableString.length(), i12);
                                            }
                                            if (u0iVar.i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i3, spannableString.length(), i12);
                                            }
                                            i4 = i11;
                                            f3 = f8;
                                        } else {
                                            f = f9;
                                            f2 = f10;
                                            i3 = 0;
                                            f3 = -3.4028235E38f;
                                            i4 = Integer.MIN_VALUE;
                                        }
                                        if (i18 == -1) {
                                            i18 = u0iVar != null ? u0iVar.b : -1;
                                        }
                                        switch (i18) {
                                            case 0:
                                            default:
                                                fn0.r(i18, "Unknown alignment: ");
                                            case -1:
                                                alignment2 = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                alignment2 = alignment;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                alignment2 = alignment;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                alignment2 = alignment;
                                                break;
                                        }
                                        int i19 = Integer.MIN_VALUE;
                                        switch (i18) {
                                            case 0:
                                            default:
                                                fn0.r(i18, "Unknown alignment: ");
                                            case -1:
                                                i5 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i5 = i3;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i5 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i5 = 2;
                                                break;
                                        }
                                        switch (i18) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                fn0.r(i18, "Unknown alignment: ");
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i19 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i19 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                i19 = i3;
                                                break;
                                        }
                                        if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
                                            float f12 = 0.95f;
                                            if (i5 != 0) {
                                                i7 = 1;
                                                if (i5 != 1) {
                                                    i6 = 2;
                                                    f4 = i5 != 2 ? -3.4028235E38f : 0.95f;
                                                } else {
                                                    i6 = 2;
                                                    f4 = 0.5f;
                                                }
                                            } else {
                                                i6 = 2;
                                                i7 = 1;
                                                f4 = 0.05f;
                                            }
                                            if (i19 == 0) {
                                                f12 = 0.05f;
                                            } else if (i19 == i7) {
                                                f12 = 0.5f;
                                            } else if (i19 != i6) {
                                                f12 = -3.4028235E38f;
                                            }
                                            f5 = f12;
                                            f6 = f4;
                                        } else {
                                            f6 = pointF.x / f;
                                            f5 = pointF.y / f2;
                                        }
                                        m74 m74Var = new m74(spannableString, alignment2, null, null, f5, i3, i19, f6, i5, i4, f3, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, parseInt);
                                        int a2 = a(c2, arrayList2, arrayList);
                                        for (int a3 = a(c, arrayList2, arrayList); a3 < a2; a3++) {
                                            ((List) arrayList.get(a3)).add(m74Var);
                                        }
                                    }
                                    p0iVar = this;
                                    j2 = j;
                                    J = charset;
                                    he5Var2 = he5Var;
                                    j9eVar2 = j9eVar;
                                }
                            }
                            parseInt = 0;
                            c = c(split[he5Var2.b]);
                            if (c != C.TIME_UNSET) {
                            }
                        }
                    }
                }
                charset = J;
                j = j2;
                he5Var = he5Var2;
                j9eVar = j9eVar2;
                p0iVar = this;
                j2 = j;
                J = charset;
                he5Var2 = he5Var;
                j9eVar2 = j9eVar;
            }
        }
    }

    @Override // defpackage.zli
    public final int l() {
        return 1;
    }
}
