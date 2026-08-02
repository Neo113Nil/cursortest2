package com.google.android.gms.internal.ads;

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
import defpackage.bm2;
import defpackage.cin;
import defpackage.din;
import defpackage.fn0;
import defpackage.he5;
import defpackage.lnb;
import defpackage.q0i;
import defpackage.x5n;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zzaop implements zzanz {
    public static final Pattern g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean a;
    public final he5 b;
    public final zzeu c;
    public LinkedHashMap d;
    public float e;
    public float f;

    public zzaop(List list) {
        this.e = -3.4028235E38f;
        this.f = -3.4028235E38f;
        this.c = new zzeu();
        if (list == null || list.isEmpty()) {
            this.a = false;
            this.b = null;
            return;
        }
        this.a = true;
        byte[] bArr = (byte[]) list.get(0);
        String str = zzfm.a;
        Charset charset = StandardCharsets.UTF_8;
        String str2 = new String(bArr, charset);
        zzguk.a(str2.startsWith("Format:"));
        he5 b = he5.b(str2);
        b.getClass();
        this.b = b;
        b(new zzeu((byte[]) list.get(1)), charset);
    }

    public static long c(String str) {
        Matcher matcher = g.matcher(str.trim());
        if (!matcher.matches()) {
            return C.TIME_UNSET;
        }
        String group = matcher.group(1);
        String str2 = zzfm.a;
        long parseLong = Long.parseLong(group) * 3600000000L;
        long parseLong2 = Long.parseLong(matcher.group(2)) * 60000000;
        return parseLong + parseLong2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * Ua.s);
    }

    public static int d(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size();
        while (true) {
            size--;
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
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:76:0x01b2. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a3 A[Catch: RuntimeException -> 0x01d4, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x01d4, blocks: (B:66:0x0197, B:68:0x01a3, B:75:0x01aa, B:70:0x01c1, B:77:0x01b5), top: B:65:0x0197 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c6  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.ads.zzanz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, int i2, bm2 bm2Var, byte[] bArr) {
        he5 he5Var;
        Charset charset;
        he5 he5Var2;
        zzeu zzeuVar;
        int parseInt;
        long c;
        float f;
        Layout.Alignment alignment;
        int i3;
        int i4;
        Integer num;
        zzeu zzeuVar2;
        Matcher matcher;
        Matcher matcher2;
        int i5;
        Matcher matcher3;
        Matcher matcher4;
        boolean find;
        boolean find2;
        PointF pointF;
        String str;
        String str2;
        int i6;
        zzaop zzaopVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        zzeu zzeuVar3 = zzaopVar.c;
        zzeuVar3.z(i + i2, bArr);
        zzeuVar3.D(i);
        Charset q = zzeuVar3.q();
        if (q == null) {
            q = StandardCharsets.UTF_8;
        }
        if (zzaopVar.a) {
            he5Var = zzaopVar.b;
        } else {
            zzaopVar.b(zzeuVar3, q);
            he5Var = null;
        }
        while (true) {
            String n = zzeuVar3.n(q);
            int i7 = 1;
            if (n == null) {
                int i8 = 0;
                while (i8 < arrayList.size()) {
                    List list = (List) arrayList.get(i8);
                    if (list.isEmpty()) {
                        if (i8 != 0) {
                            i8++;
                        } else {
                            i8 = 0;
                        }
                    }
                    if (i8 == arrayList.size() - 1) {
                        defpackage.zzl.s();
                        return;
                    } else {
                        long longValue = ((Long) arrayList2.get(i8)).longValue();
                        bm2Var.mo13zza(new zzanr(list, longValue, ((Long) arrayList2.get(i8 + 1)).longValue() - longValue));
                        i8++;
                    }
                }
                return;
            }
            if (n.startsWith("Format:")) {
                he5Var = he5.b(n);
            } else {
                if (n.startsWith("Dialogue:")) {
                    if (he5Var == null) {
                        zzeh.c("Skipping dialogue line before complete format: ".concat(n));
                    } else {
                        int i9 = he5Var.a;
                        zzguk.a(n.startsWith("Dialogue:"));
                        String substring = n.substring(9);
                        int i10 = he5Var.f;
                        String[] split = substring.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, i10);
                        if (split.length != i10) {
                            zzeh.c("Skipping dialogue line with fewer columns than format: ".concat(n));
                        } else {
                            if (i9 != -1) {
                                try {
                                    parseInt = Integer.parseInt(split[i9].trim());
                                } catch (RuntimeException unused) {
                                    x5n.r(split[i9], "Fail to parse layer: ");
                                }
                                c = c(split[he5Var.b]);
                                if (c != C.TIME_UNSET) {
                                    zzeh.c("Skipping invalid timing: ".concat(n));
                                    charset = q;
                                    he5Var2 = he5Var;
                                    zzeuVar = zzeuVar3;
                                } else {
                                    long c2 = c(split[he5Var.c]);
                                    if (c2 == C.TIME_UNSET || c2 <= c) {
                                        charset = q;
                                        he5Var2 = he5Var;
                                        zzeuVar = zzeuVar3;
                                        zzeh.c("Skipping invalid timing: ".concat(n));
                                    } else {
                                        LinkedHashMap linkedHashMap = zzaopVar.d;
                                        din dinVar = (linkedHashMap == null || (i6 = he5Var.d) == -1) ? null : (din) linkedHashMap.get(split[i6].trim());
                                        String str3 = split[he5Var.e];
                                        Matcher matcher5 = cin.a.matcher(str3);
                                        PointF pointF2 = null;
                                        int i11 = -1;
                                        while (matcher5.find()) {
                                            String group = matcher5.group(i7);
                                            group.getClass();
                                            Charset charset2 = q;
                                            he5 he5Var3 = he5Var;
                                            try {
                                                matcher3 = cin.b.matcher(group);
                                                zzeuVar2 = zzeuVar3;
                                            } catch (RuntimeException unused2) {
                                                zzeuVar2 = zzeuVar3;
                                            }
                                            try {
                                                matcher4 = cin.c.matcher(group);
                                                find = matcher3.find();
                                                find2 = matcher4.find();
                                            } catch (RuntimeException unused3) {
                                                matcher = matcher5;
                                                try {
                                                    matcher2 = cin.d.matcher(group);
                                                    if (matcher2.find()) {
                                                    }
                                                    i5 = -1;
                                                    if (i5 != -1) {
                                                    }
                                                } catch (RuntimeException unused4) {
                                                }
                                                q = charset2;
                                                he5Var = he5Var3;
                                                zzeuVar3 = zzeuVar2;
                                                matcher5 = matcher;
                                                i7 = 1;
                                            }
                                            if (find) {
                                                if (find2) {
                                                    matcher = matcher5;
                                                    try {
                                                        StringBuilder sb = new StringBuilder(group.length() + 82);
                                                        sb.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                                                        sb.append(group);
                                                        sb.append("'");
                                                        zzeh.b(sb.toString());
                                                    } catch (RuntimeException unused5) {
                                                    }
                                                } else {
                                                    matcher = matcher5;
                                                }
                                                str = matcher3.group(1);
                                                str2 = matcher3.group(2);
                                            } else {
                                                matcher = matcher5;
                                                if (find2) {
                                                    String group2 = matcher4.group(1);
                                                    String group3 = matcher4.group(2);
                                                    str = group2;
                                                    str2 = group3;
                                                } else {
                                                    pointF = null;
                                                    if (pointF != null) {
                                                        pointF2 = pointF;
                                                    }
                                                    matcher2 = cin.d.matcher(group);
                                                    if (matcher2.find()) {
                                                        String group4 = matcher2.group(1);
                                                        if (group4 == null) {
                                                            throw null;
                                                        }
                                                        try {
                                                            i5 = Integer.parseInt(group4.trim());
                                                        } catch (NumberFormatException unused6) {
                                                        }
                                                        switch (i5) {
                                                            case 1:
                                                            case 2:
                                                            case 3:
                                                            case 4:
                                                            case 5:
                                                            case 6:
                                                            case 7:
                                                            case 8:
                                                            case 9:
                                                                break;
                                                            default:
                                                                zzeh.c("Ignoring unknown alignment: ".concat(group4));
                                                                break;
                                                        }
                                                        if (i5 != -1) {
                                                            i11 = i5;
                                                            q = charset2;
                                                            he5Var = he5Var3;
                                                            zzeuVar3 = zzeuVar2;
                                                            matcher5 = matcher;
                                                            i7 = 1;
                                                        }
                                                        q = charset2;
                                                        he5Var = he5Var3;
                                                        zzeuVar3 = zzeuVar2;
                                                        matcher5 = matcher;
                                                        i7 = 1;
                                                    }
                                                    i5 = -1;
                                                    if (i5 != -1) {
                                                    }
                                                    q = charset2;
                                                    he5Var = he5Var3;
                                                    zzeuVar3 = zzeuVar2;
                                                    matcher5 = matcher;
                                                    i7 = 1;
                                                }
                                            }
                                            if (str == null) {
                                                throw null;
                                            }
                                            float parseFloat = Float.parseFloat(str.trim());
                                            if (str2 == null) {
                                                throw null;
                                            }
                                            pointF = new PointF(parseFloat, Float.parseFloat(str2.trim()));
                                            if (pointF != null) {
                                            }
                                            matcher2 = cin.d.matcher(group);
                                            if (matcher2.find()) {
                                            }
                                            i5 = -1;
                                            if (i5 != -1) {
                                            }
                                            q = charset2;
                                            he5Var = he5Var3;
                                            zzeuVar3 = zzeuVar2;
                                            matcher5 = matcher;
                                            i7 = 1;
                                        }
                                        charset = q;
                                        he5Var2 = he5Var;
                                        zzeuVar = zzeuVar3;
                                        String replace = cin.a.matcher(str3).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f2 = zzaopVar.e;
                                        float f3 = zzaopVar.f;
                                        SpannableString spannableString = new SpannableString(replace);
                                        zzcx zzcxVar = new zzcx();
                                        zzcxVar.a(spannableString);
                                        zzcxVar.p = parseInt;
                                        if (dinVar != null) {
                                            boolean z = dinVar.g;
                                            Integer num2 = dinVar.c;
                                            f = -3.4028235E38f;
                                            if (num2 != null) {
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            }
                                            if (dinVar.j == 3 && (num = dinVar.d) != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                            }
                                            float f4 = dinVar.e;
                                            if (f4 != -3.4028235E38f && f3 != -3.4028235E38f) {
                                                zzcxVar.k = f4 / f3;
                                                zzcxVar.j = 1;
                                            }
                                            boolean z2 = dinVar.f;
                                            if (z2 && z) {
                                                i4 = 0;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                i4 = 0;
                                                if (z2) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (z) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (dinVar.h) {
                                                spannableString.setSpan(new UnderlineSpan(), i4, spannableString.length(), 33);
                                            }
                                            if (dinVar.i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i4, spannableString.length(), 33);
                                            }
                                        } else {
                                            f = -3.4028235E38f;
                                        }
                                        int i12 = i11;
                                        if (i12 == -1) {
                                            i12 = dinVar != null ? dinVar.b : -1;
                                        }
                                        switch (i12) {
                                            case 0:
                                            default:
                                                x5n.o(fn0.a(i12, 19), i12, "Unknown alignment: ");
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
                                        zzcxVar.c = alignment;
                                        int i13 = Integer.MIN_VALUE;
                                        switch (i12) {
                                            case 0:
                                            default:
                                                x5n.o(fn0.a(i12, 19), i12, "Unknown alignment: ");
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
                                        zzcxVar.i = i3;
                                        switch (i12) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                x5n.o(fn0.a(i12, 19), i12, "Unknown alignment: ");
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i13 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i13 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                i13 = 0;
                                                break;
                                        }
                                        zzcxVar.g = i13;
                                        PointF pointF3 = pointF2;
                                        if (pointF3 == null || f3 == f || f2 == f) {
                                            int i14 = zzcxVar.i;
                                            zzcxVar.h = i14 != 0 ? i14 != 1 ? i14 != 2 ? f : 0.95f : 0.5f : 0.05f;
                                            zzcxVar.e = i13 != 0 ? i13 != 1 ? i13 != 2 ? f : 0.95f : 0.5f : 0.05f;
                                            zzcxVar.f = 0;
                                        } else {
                                            zzcxVar.h = pointF3.x / f2;
                                            zzcxVar.e = pointF3.y / f3;
                                            zzcxVar.f = 0;
                                        }
                                        zzcy b = zzcxVar.b();
                                        int d = d(c2, arrayList2, arrayList);
                                        for (int d2 = d(c, arrayList2, arrayList); d2 < d; d2++) {
                                            ((List) arrayList.get(d2)).add(b);
                                        }
                                    }
                                }
                                zzaopVar = this;
                                q = charset;
                                he5Var = he5Var2;
                                zzeuVar3 = zzeuVar;
                            }
                            parseInt = 0;
                            c = c(split[he5Var.b]);
                            if (c != C.TIME_UNSET) {
                            }
                            zzaopVar = this;
                            q = charset;
                            he5Var = he5Var2;
                            zzeuVar3 = zzeuVar;
                        }
                    }
                }
                charset = q;
                he5Var2 = he5Var;
                zzeuVar = zzeuVar3;
                zzaopVar = this;
                q = charset;
                he5Var = he5Var2;
                zzeuVar3 = zzeuVar;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(zzeu zzeuVar, Charset charset) {
        din dinVar;
        String trim;
        int i;
        Integer a;
        Integer a2;
        float f;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        int parseInt;
        int i4;
        while (true) {
            String n = zzeuVar.n(charset);
            if (n == null) {
                return;
            }
            int i5 = 91;
            int i6 = 0;
            if ("[Script Info]".equalsIgnoreCase(n)) {
                while (true) {
                    String n2 = zzeuVar.n(charset);
                    if (n2 == null) {
                        break;
                    }
                    if (zzeuVar.B() != 0) {
                        if ((zzeuVar.t(charset) != 0 ? zzhbj.a(r2 >>> 8) : 1114112) == 91) {
                            break;
                        }
                    }
                    String[] split = n2.split(":");
                    if (split.length == 2) {
                        String a3 = zzgts.a(split[0].trim());
                        switch (a3.hashCode()) {
                            case 1879649548:
                                if (!a3.equals("playresx")) {
                                    break;
                                } else {
                                    this.e = Float.parseFloat(split[1].trim());
                                    break;
                                }
                            case 1879649549:
                                if (!a3.equals("playresy")) {
                                    break;
                                } else {
                                    try {
                                        this.f = Float.parseFloat(split[1].trim());
                                        break;
                                    } catch (NumberFormatException unused) {
                                        break;
                                    }
                                }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(n)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    q0i q0iVar = null;
                    while (true) {
                        String n3 = zzeuVar.n(charset);
                        if (n3 != null) {
                            if (zzeuVar.B() != 0) {
                                if ((zzeuVar.t(charset) != 0 ? zzhbj.a(r0 >>> 8) : 1114112) == i5) {
                                }
                            }
                            if (n3.startsWith("Format:")) {
                                String[] split2 = TextUtils.split(n3.substring(7), BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                                int i7 = i6;
                                int i8 = -1;
                                int i9 = -1;
                                int i10 = -1;
                                int i11 = -1;
                                int i12 = -1;
                                int i13 = -1;
                                int i14 = -1;
                                int i15 = -1;
                                int i16 = -1;
                                int i17 = -1;
                                while (true) {
                                    int length = split2.length;
                                    if (i7 < length) {
                                        String a4 = zzgts.a(split2[i7].trim());
                                        switch (a4.hashCode()) {
                                            case -1178781136:
                                                if (!a4.equals(TtmlNode.ITALIC)) {
                                                    break;
                                                } else {
                                                    i14 = i7;
                                                    break;
                                                }
                                            case -1026963764:
                                                if (!a4.equals(TtmlNode.UNDERLINE)) {
                                                    break;
                                                } else {
                                                    i15 = i7;
                                                    break;
                                                }
                                            case -192095652:
                                                if (!a4.equals("strikeout")) {
                                                    break;
                                                } else {
                                                    i16 = i7;
                                                    break;
                                                }
                                            case -70925746:
                                                if (!a4.equals("primarycolour")) {
                                                    break;
                                                } else {
                                                    i10 = i7;
                                                    break;
                                                }
                                            case 3029637:
                                                if (!a4.equals(TtmlNode.BOLD)) {
                                                    break;
                                                } else {
                                                    i13 = i7;
                                                    break;
                                                }
                                            case 3373707:
                                                if (!a4.equals("name")) {
                                                    break;
                                                } else {
                                                    i8 = i7;
                                                    break;
                                                }
                                            case 366554320:
                                                if (!a4.equals("fontsize")) {
                                                    break;
                                                } else {
                                                    i12 = i7;
                                                    break;
                                                }
                                            case 767321349:
                                                if (!a4.equals("borderstyle")) {
                                                    break;
                                                } else {
                                                    i17 = i7;
                                                    break;
                                                }
                                            case 1767875043:
                                                if (!a4.equals("alignment")) {
                                                    break;
                                                } else {
                                                    i9 = i7;
                                                    break;
                                                }
                                            case 1988365454:
                                                if (!a4.equals("outlinecolour")) {
                                                    break;
                                                } else {
                                                    i11 = i7;
                                                    break;
                                                }
                                        }
                                        i7++;
                                    } else if (i8 != -1) {
                                        q0iVar = new q0i(i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, length);
                                    }
                                }
                            } else {
                                if (n3.startsWith("Style:")) {
                                    if (q0iVar == null) {
                                        zzeh.c("Skipping 'Style:' line before 'Format:' line: ".concat(n3));
                                    } else {
                                        zzguk.a(n3.startsWith("Style:"));
                                        String[] split3 = TextUtils.split(n3.substring(6), BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                                        int length2 = split3.length;
                                        int i18 = q0iVar.k;
                                        if (length2 != i18) {
                                            String str = zzfm.a;
                                            Locale locale = Locale.US;
                                            StringBuilder s = lnb.s(i18, length2, "Skipping malformed 'Style:' line (expected ", " values, found ", "): '");
                                            s.append(n3);
                                            s.append("'");
                                            zzeh.c(s.toString());
                                        } else {
                                            try {
                                                trim = split3[q0iVar.a].trim();
                                                int i19 = q0iVar.b;
                                                if (i19 != -1) {
                                                    String trim2 = split3[i19].trim();
                                                    try {
                                                        i4 = Integer.parseInt(trim2.trim());
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                    switch (i4) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            break;
                                                        default:
                                                            zzeh.c("Ignoring unknown alignment: ".concat(String.valueOf(trim2)));
                                                            i4 = -1;
                                                            break;
                                                    }
                                                    i = i4;
                                                } else {
                                                    i = -1;
                                                }
                                                int i20 = q0iVar.c;
                                                a = i20 != -1 ? din.a(split3[i20].trim()) : null;
                                                int i21 = q0iVar.d;
                                                a2 = i21 != -1 ? din.a(split3[i21].trim()) : null;
                                                int i22 = q0iVar.e;
                                                float f2 = -3.4028235E38f;
                                                if (i22 != -1) {
                                                    String trim3 = split3[i22].trim();
                                                    try {
                                                        f2 = Float.parseFloat(trim3);
                                                    } catch (NumberFormatException e) {
                                                        StringBuilder sb = new StringBuilder(String.valueOf(trim3).length() + 29);
                                                        sb.append("Failed to parse font size: '");
                                                        sb.append(trim3);
                                                        sb.append("'");
                                                        zzeh.d(sb.toString(), e);
                                                    }
                                                }
                                                f = f2;
                                                int i23 = q0iVar.f;
                                                z = i23 != -1 && din.b(split3[i23].trim());
                                                int i24 = q0iVar.g;
                                                z2 = i24 != -1 && din.b(split3[i24].trim());
                                                int i25 = q0iVar.h;
                                                z3 = i25 != -1 && din.b(split3[i25].trim());
                                                int i26 = q0iVar.i;
                                                z4 = i26 != -1 && din.b(split3[i26].trim());
                                                i2 = q0iVar.j;
                                            } catch (RuntimeException e2) {
                                                StringBuilder sb2 = new StringBuilder(n3.length() + 36);
                                                sb2.append("Skipping malformed 'Style:' line: '");
                                                sb2.append(n3);
                                                sb2.append("'");
                                                zzeh.d(sb2.toString(), e2);
                                            }
                                            if (i2 != -1) {
                                                String trim4 = split3[i2].trim();
                                                try {
                                                    parseInt = Integer.parseInt(trim4.trim());
                                                } catch (NumberFormatException unused3) {
                                                }
                                                if (parseInt == 1 || parseInt == 3) {
                                                    i3 = parseInt;
                                                    dinVar = new din(trim, i, a, a2, f, z, z2, z3, z4, i3);
                                                    if (dinVar != null) {
                                                        linkedHashMap.put(dinVar.a, dinVar);
                                                    }
                                                }
                                                zzeh.c("Ignoring unknown BorderStyle: ".concat(String.valueOf(trim4)));
                                            }
                                            i3 = -1;
                                            dinVar = new din(trim, i, a, a2, f, z, z2, z3, z4, i3);
                                            if (dinVar != null) {
                                            }
                                        }
                                        dinVar = null;
                                        if (dinVar != null) {
                                        }
                                    }
                                }
                                i5 = 91;
                                i6 = 0;
                            }
                        }
                    }
                }
                this.d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(n)) {
                zzeh.b("[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(n)) {
                return;
            }
        }
    }

    public zzaop() {
        this(null);
    }
}
