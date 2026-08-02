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
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class o0i extends qhh {
    public static final Pattern r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean m;
    public final k12 n;
    public LinkedHashMap o;
    public float p = -3.4028235E38f;
    public float q = -3.4028235E38f;

    public o0i(List list) {
        if (list == null || list.isEmpty()) {
            this.m = false;
            this.n = null;
            return;
        }
        this.m = true;
        byte[] bArr = (byte[]) list.get(0);
        int i = lik.a;
        String str = new String(bArr, xp2.c);
        qx9.r(str.startsWith("Format:"));
        k12 b = k12.b(str);
        b.getClass();
        this.n = b;
        f(new nkk((byte[]) list.get(1)));
    }

    public static int e(long j, ArrayList arrayList, ArrayList arrayList2) {
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

    public static long g(String str) {
        Matcher matcher = r.matcher(str.trim());
        if (!matcher.matches()) {
            return C.TIME_UNSET;
        }
        String group = matcher.group(1);
        int i = lik.a;
        return (Long.parseLong(matcher.group(4)) * Ua.s) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    @Override // defpackage.qhh
    public final kli b(byte[] bArr, int i, boolean z) {
        nkk nkkVar;
        k12 k12Var;
        int i2;
        float f;
        int i3;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i4;
        int i5;
        int i6;
        float f2;
        float f3;
        float f4;
        boolean z2;
        int i7;
        int i8;
        float f5;
        int i9;
        float f6;
        int i10;
        int i11;
        int i12;
        int i13;
        o0i o0iVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        nkk nkkVar2 = new nkk(bArr, i);
        boolean z3 = o0iVar.m;
        if (!z3) {
            o0iVar.f(nkkVar2);
        }
        k12 k12Var2 = z3 ? o0iVar.n : null;
        while (true) {
            String g = nkkVar2.g();
            if (g == null) {
                lm8 lm8Var = new lm8();
                lm8Var.a = arrayList;
                lm8Var.b = arrayList2;
                return lm8Var;
            }
            if (g.startsWith("Format:")) {
                k12Var2 = k12.b(g);
            } else {
                if (g.startsWith("Dialogue:")) {
                    if (k12Var2 == null) {
                        "Skipping dialogue line before complete format: ".concat(g);
                        m6k.f0();
                    } else {
                        int i14 = k12Var2.e;
                        qx9.r(g.startsWith("Dialogue:"));
                        String[] split = g.substring(9).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, i14);
                        if (split.length != i14) {
                            "Skipping dialogue line with fewer columns than format: ".concat(g);
                            m6k.f0();
                        } else {
                            long g2 = g(split[k12Var2.a]);
                            if (g2 == C.TIME_UNSET) {
                                "Skipping invalid timing: ".concat(g);
                                m6k.f0();
                            } else {
                                long g3 = g(split[k12Var2.b]);
                                if (g3 == C.TIME_UNSET) {
                                    "Skipping invalid timing: ".concat(g);
                                    m6k.f0();
                                } else {
                                    LinkedHashMap linkedHashMap = o0iVar.o;
                                    t0i t0iVar = (linkedHashMap == null || (i13 = k12Var2.c) == -1) ? null : (t0i) linkedHashMap.get(split[i13].trim());
                                    String str = split[k12Var2.d];
                                    Matcher matcher = r0i.a.matcher(str);
                                    int i15 = -1;
                                    PointF pointF = null;
                                    while (matcher.find()) {
                                        String group = matcher.group(1);
                                        group.getClass();
                                        try {
                                            PointF a = r0i.a(group);
                                            if (a != null) {
                                                pointF = a;
                                            }
                                        } catch (RuntimeException unused) {
                                        }
                                        try {
                                            Matcher matcher2 = r0i.d.matcher(group);
                                            if (matcher2.find()) {
                                                String group2 = matcher2.group(1);
                                                group2.getClass();
                                                i12 = t0i.a(group2);
                                            } else {
                                                i12 = -1;
                                            }
                                            if (i12 != -1) {
                                                i15 = i12;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                    }
                                    String replace = r0i.a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f7 = o0iVar.p;
                                    float f8 = o0iVar.q;
                                    SpannableString spannableString = new SpannableString(replace);
                                    float f9 = -3.4028235E38f;
                                    if (t0iVar != null) {
                                        boolean z4 = t0iVar.g;
                                        Integer num = t0iVar.d;
                                        Integer num2 = t0iVar.c;
                                        if (num2 != null) {
                                            nkkVar = nkkVar2;
                                            k12Var = k12Var2;
                                            z2 = z4;
                                            i7 = 33;
                                            i8 = 0;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            nkkVar = nkkVar2;
                                            k12Var = k12Var2;
                                            z2 = z4;
                                            i7 = 33;
                                            i8 = 0;
                                        }
                                        if (t0iVar.j == 3 && num != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i8, spannableString.length(), i7);
                                        }
                                        float f10 = t0iVar.e;
                                        if (f10 == -3.4028235E38f || f8 == -3.4028235E38f) {
                                            f5 = -3.4028235E38f;
                                            i9 = Integer.MIN_VALUE;
                                        } else {
                                            f5 = f10 / f8;
                                            i9 = 1;
                                        }
                                        boolean z5 = t0iVar.f;
                                        if (z5 && z2) {
                                            f6 = f5;
                                            i10 = i9;
                                            i11 = 33;
                                            i2 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            f6 = f5;
                                            i10 = i9;
                                            i11 = 33;
                                            i2 = 0;
                                            if (z5) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z2) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (t0iVar.h) {
                                            spannableString.setSpan(new UnderlineSpan(), i2, spannableString.length(), i11);
                                        }
                                        if (t0iVar.i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i2, spannableString.length(), i11);
                                        }
                                        f = f6;
                                        i3 = i10;
                                    } else {
                                        nkkVar = nkkVar2;
                                        k12Var = k12Var2;
                                        i2 = 0;
                                        f = -3.4028235E38f;
                                        i3 = Integer.MIN_VALUE;
                                    }
                                    int i16 = -1;
                                    if (i15 != -1) {
                                        i16 = i15;
                                    } else if (t0iVar != null) {
                                        i16 = t0iVar.b;
                                    }
                                    switch (i16) {
                                        case 0:
                                        default:
                                            m6k.f0();
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
                                    int i17 = Integer.MIN_VALUE;
                                    switch (i16) {
                                        case 0:
                                        default:
                                            m6k.f0();
                                        case -1:
                                            i4 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i4 = i2;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i4 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i4 = 2;
                                            break;
                                    }
                                    switch (i16) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            m6k.f0();
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i17 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i17 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i17 = i2;
                                            break;
                                    }
                                    if (pointF == null || f8 == -3.4028235E38f || f7 == -3.4028235E38f) {
                                        if (i4 != 0) {
                                            i5 = 1;
                                            if (i4 != 1) {
                                                i6 = 2;
                                                f2 = i4 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i6 = 2;
                                                f2 = 0.5f;
                                            }
                                        } else {
                                            i5 = 1;
                                            i6 = 2;
                                            f2 = 0.05f;
                                        }
                                        if (i17 == 0) {
                                            f9 = 0.05f;
                                        } else if (i17 == i5) {
                                            f9 = 0.5f;
                                        } else if (i17 == i6) {
                                            f9 = 0.95f;
                                        }
                                        f3 = f2;
                                        f4 = f9;
                                    } else {
                                        f3 = pointF.x / f7;
                                        f4 = pointF.y / f8;
                                    }
                                    l74 l74Var = new l74(spannableString, alignment2, null, null, f4, i2, i17, f3, i4, i3, f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    int e = e(g3, arrayList2, arrayList);
                                    for (int e2 = e(g2, arrayList2, arrayList); e2 < e; e2++) {
                                        ((List) arrayList.get(e2)).add(l74Var);
                                    }
                                    o0iVar = this;
                                    nkkVar2 = nkkVar;
                                    k12Var2 = k12Var;
                                }
                            }
                        }
                    }
                }
                nkkVar = nkkVar2;
                k12Var = k12Var2;
                o0iVar = this;
                nkkVar2 = nkkVar;
                k12Var2 = k12Var;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(nkk nkkVar) {
        int i;
        t0i t0iVar;
        while (true) {
            String g = nkkVar.g();
            if (g == null) {
                return;
            }
            int i2 = 2;
            int i3 = 0;
            char c = '[';
            if ("[Script Info]".equalsIgnoreCase(g)) {
                while (true) {
                    String g2 = nkkVar.g();
                    if (g2 != null && (nkkVar.c() == 0 || (nkkVar.a[nkkVar.b] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) != 91)) {
                        String[] split = g2.split(":");
                        if (split.length == 2) {
                            String W = rz8.W(split[0].trim());
                            W.getClass();
                            if (W.equals("playresx")) {
                                this.p = Float.parseFloat(split[1].trim());
                            } else if (W.equals("playresy")) {
                                try {
                                    this.q = Float.parseFloat(split[1].trim());
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(g)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    q0i q0iVar = null;
                    while (true) {
                        String g3 = nkkVar.g();
                        if (g3 != null && (nkkVar.c() == 0 || (nkkVar.a[nkkVar.b] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) != c)) {
                            int i4 = -1;
                            if (g3.startsWith("Format:")) {
                                String[] split2 = TextUtils.split(g3.substring(7), BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
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
                                if (g3.startsWith("Style:")) {
                                    if (q0iVar == null) {
                                        "Skipping 'Style:' line before 'Format:' line: ".concat(g3);
                                        m6k.f0();
                                    } else {
                                        qx9.r(g3.startsWith("Style:"));
                                        String[] split3 = TextUtils.split(g3.substring(6), BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                                        if (split3.length != q0iVar.k) {
                                            int i16 = lik.a;
                                            Locale locale = Locale.US;
                                            m6k.f0();
                                        } else {
                                            try {
                                                String trim = split3[q0iVar.a].trim();
                                                int i17 = q0iVar.b;
                                                int a = i17 != -1 ? t0i.a(split3[i17].trim()) : -1;
                                                int i18 = q0iVar.c;
                                                Integer c2 = i18 != -1 ? t0i.c(split3[i18].trim()) : null;
                                                int i19 = q0iVar.d;
                                                Integer c3 = i19 != -1 ? t0i.c(split3[i19].trim()) : null;
                                                int i20 = q0iVar.e;
                                                float f = -3.4028235E38f;
                                                if (i20 != -1) {
                                                    String trim2 = split3[i20].trim();
                                                    try {
                                                        f = Float.parseFloat(trim2);
                                                    } catch (NumberFormatException e) {
                                                        m6k.g0("Failed to parse font size: '" + trim2 + "'", e);
                                                    }
                                                }
                                                float f2 = f;
                                                int i21 = q0iVar.f;
                                                boolean z = i21 != -1 && t0i.b(split3[i21].trim());
                                                int i22 = q0iVar.g;
                                                boolean z2 = i22 != -1 && t0i.b(split3[i22].trim());
                                                int i23 = q0iVar.h;
                                                boolean z3 = i23 != -1 && t0i.b(split3[i23].trim());
                                                int i24 = q0iVar.i;
                                                boolean z4 = i24 != -1 && t0i.b(split3[i24].trim());
                                                int i25 = q0iVar.j;
                                                if (i25 != -1) {
                                                    try {
                                                        int parseInt = Integer.parseInt(split3[i25].trim().trim());
                                                        if (parseInt == 1 || parseInt == 3) {
                                                            i4 = parseInt;
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                    m6k.f0();
                                                }
                                                t0iVar = new t0i(trim, a, c2, c3, f2, z, z2, z3, z4, i4);
                                            } catch (RuntimeException e2) {
                                                m6k.g0("Skipping malformed 'Style:' line: '" + g3 + "'", e2);
                                            }
                                            if (t0iVar != null) {
                                                linkedHashMap.put(t0iVar.a, t0iVar);
                                            }
                                        }
                                        t0iVar = null;
                                        if (t0iVar != null) {
                                        }
                                    }
                                }
                                i2 = 2;
                                i3 = 0;
                                c = '[';
                            }
                        }
                    }
                }
                this.o = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(g)) {
                m6k.Q();
            } else if ("[Events]".equalsIgnoreCase(g)) {
                return;
            }
        }
    }
}
