package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.mvvm.model.Season;
import defpackage.a70;
import defpackage.bm2;
import defpackage.ilg;
import defpackage.k2l;
import defpackage.oin;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzapr implements zzanz {
    public final zzeu a = new zzeu();
    public final oin b = new oin();

    /* JADX WARN: Code restructure failed: missing block: B:195:0x0382, code lost:
    
        r1.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x011f, code lost:
    
        if (")".equals(defpackage.oin.b(r6, r8)) == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03cd  */
    @Override // com.google.android.gms.internal.ads.zzanz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, int i2, bm2 bm2Var, byte[] bArr) {
        int i3;
        char c;
        zzapk zzapkVar;
        String str;
        char c2;
        String sb;
        int i4;
        zzapr zzaprVar = this;
        zzeu zzeuVar = zzaprVar.a;
        zzeuVar.z(i + i2, bArr);
        zzeuVar.D(i);
        ArrayList arrayList = new ArrayList();
        try {
            int i5 = zzeuVar.b;
            Charset charset = StandardCharsets.UTF_8;
            String n = zzeuVar.n(charset);
            if (n == null || !n.startsWith("WEBVTT")) {
                zzeuVar.D(i5);
                throw zzat.a(null, "Expected WEBVTT. Got ".concat(String.valueOf(zzeuVar.n(charset))));
            }
            while (!TextUtils.isEmpty(zzeuVar.n(StandardCharsets.UTF_8))) {
                zzaprVar = this;
            }
            ArrayList arrayList2 = new ArrayList();
            loop1: while (true) {
                int i6 = -1;
                int i7 = 0;
                char c3 = 65535;
                int i8 = 0;
                while (true) {
                    i3 = 1;
                    c = 2;
                    if (c3 != 65535) {
                        break;
                    }
                    i8 = zzeuVar.b;
                    String n2 = zzeuVar.n(StandardCharsets.UTF_8);
                    c3 = n2 == null ? (char) 0 : "STYLE".equals(n2) ? (char) 2 : n2.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                zzeuVar.D(i8);
                if (c3 == 0) {
                    zzant.a(new k2l(arrayList2, 1), bm2Var);
                    return;
                }
                if (c3 == 1) {
                    while (!TextUtils.isEmpty(zzeuVar.n(StandardCharsets.UTF_8))) {
                    }
                } else {
                    if (c3 == 2) {
                        if (!arrayList2.isEmpty()) {
                            a70.p("A style block was found after the first cue.");
                            return;
                        }
                        zzeuVar.n(StandardCharsets.UTF_8);
                        oin oinVar = zzaprVar.b;
                        StringBuilder sb2 = oinVar.b;
                        sb2.setLength(0);
                        int i9 = zzeuVar.b;
                        while (!TextUtils.isEmpty(zzeuVar.n(StandardCharsets.UTF_8))) {
                        }
                        zzeu zzeuVar2 = oinVar.a;
                        zzeuVar2.z(zzeuVar.b, zzeuVar.a);
                        zzeuVar2.D(i9);
                        ArrayList arrayList3 = new ArrayList();
                        while (true) {
                            oin.a(zzeuVar2);
                            if (zzeuVar2.B() >= 5 && "::cue".equals(zzeuVar2.k(5, StandardCharsets.UTF_8))) {
                                int i10 = zzeuVar2.b;
                                String b = oin.b(zzeuVar2, sb2);
                                if (b != null) {
                                    if ("{".equals(b)) {
                                        zzeuVar2.D(i10);
                                        str = "";
                                    } else if ("(".equals(b)) {
                                        int i11 = zzeuVar2.b;
                                        int i12 = zzeuVar2.c;
                                        int i13 = i7;
                                        while (i11 < i12 && i13 == 0) {
                                            int i14 = i11 + 1;
                                            int i15 = ((char) zzeuVar2.a[i11]) == ')' ? i3 : i7;
                                            i11 = i14;
                                            i13 = i15;
                                        }
                                        str = zzeuVar2.k((i11 - 1) - zzeuVar2.b, StandardCharsets.UTF_8).trim();
                                    } else {
                                        str = null;
                                    }
                                    if (str == null || !"{".equals(oin.b(zzeuVar2, sb2))) {
                                        break;
                                    }
                                    zzapj zzapjVar = new zzapj();
                                    if (!str.isEmpty()) {
                                        int indexOf = str.indexOf(91);
                                        if (indexOf != i6) {
                                            Matcher matcher = oin.c.matcher(str.substring(indexOf));
                                            if (matcher.matches()) {
                                                String group = matcher.group(i3);
                                                group.getClass();
                                                zzapjVar.d = group;
                                            }
                                            str = str.substring(i7, indexOf);
                                        }
                                        String str2 = zzfm.a;
                                        String[] split = str.split("\\.", i6);
                                        String str3 = split[i7];
                                        int indexOf2 = str3.indexOf(35);
                                        if (indexOf2 != i6) {
                                            zzapjVar.b = str3.substring(i7, indexOf2);
                                            zzapjVar.a = str3.substring(indexOf2 + 1);
                                        } else {
                                            zzapjVar.b = str3;
                                        }
                                        int length = split.length;
                                        if (length > i3) {
                                            zzapjVar.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, i3, length)));
                                        }
                                    }
                                    int i16 = i7;
                                    String str4 = null;
                                    while (i16 == 0) {
                                        int i17 = zzeuVar2.b;
                                        String b2 = oin.b(zzeuVar2, sb2);
                                        int i18 = (b2 == null || "}".equals(b2)) ? i3 : i7;
                                        if (i18 == 0) {
                                            zzeuVar2.D(i17);
                                            oin.a(zzeuVar2);
                                            String c4 = oin.c(zzeuVar2, sb2);
                                            if (!c4.isEmpty() && ":".equals(oin.b(zzeuVar2, sb2))) {
                                                oin.a(zzeuVar2);
                                                StringBuilder sb3 = new StringBuilder();
                                                boolean z = false;
                                                while (true) {
                                                    if (z) {
                                                        sb = sb3.toString();
                                                        break;
                                                    }
                                                    int i19 = zzeuVar2.b;
                                                    String b3 = oin.b(zzeuVar2, sb2);
                                                    if (b3 == null) {
                                                        sb = null;
                                                        break;
                                                    } else if ("}".equals(b3) || ";".equals(b3)) {
                                                        zzeuVar2.D(i19);
                                                        z = true;
                                                    } else {
                                                        sb3.append(b3);
                                                    }
                                                }
                                                if (sb != null && !sb.isEmpty()) {
                                                    int i20 = zzeuVar2.b;
                                                    String b4 = oin.b(zzeuVar2, sb2);
                                                    if (!";".equals(b4)) {
                                                        if ("}".equals(b4)) {
                                                            zzeuVar2.D(i20);
                                                        }
                                                    }
                                                    if ("color".equals(c4)) {
                                                        zzapjVar.f = zzds.a(sb, true);
                                                        zzapjVar.g = true;
                                                    } else if ("background-color".equals(c4)) {
                                                        zzapjVar.h = zzds.a(sb, true);
                                                        zzapjVar.i = true;
                                                    } else if ("ruby-position".equals(c4)) {
                                                        if ("over".equals(sb)) {
                                                            zzapjVar.o = 1;
                                                        } else if ("under".equals(sb)) {
                                                            c2 = 2;
                                                            zzapjVar.o = 2;
                                                            c = c2;
                                                            str4 = b2;
                                                            i16 = i18;
                                                            i7 = 0;
                                                            i3 = 1;
                                                        }
                                                    } else if ("text-combine-upright".equals(c4)) {
                                                        zzapjVar.p = Season.YEAR_ALL_TIME.equals(sb) || sb.startsWith("digits");
                                                    } else if ("text-decoration".equals(c4)) {
                                                        if (TtmlNode.UNDERLINE.equals(sb)) {
                                                            zzapjVar.j = 1;
                                                        }
                                                    } else if ("font-family".equals(c4)) {
                                                        zzapjVar.e = zzgts.a(sb);
                                                    } else if ("font-weight".equals(c4)) {
                                                        if (TtmlNode.BOLD.equals(sb)) {
                                                            zzapjVar.k = 1;
                                                        }
                                                    } else if ("font-style".equals(c4)) {
                                                        if (TtmlNode.ITALIC.equals(sb)) {
                                                            zzapjVar.l = 1;
                                                        }
                                                    } else if ("font-size".equals(c4)) {
                                                        Matcher matcher2 = oin.d.matcher(zzgts.a(sb));
                                                        if (matcher2.matches()) {
                                                            String group2 = matcher2.group(2);
                                                            group2.getClass();
                                                            int hashCode = group2.hashCode();
                                                            if (hashCode == 37) {
                                                                c2 = 2;
                                                                if (!group2.equals("%")) {
                                                                    break loop1;
                                                                }
                                                                zzapjVar.m = 3;
                                                                i4 = 1;
                                                            } else if (hashCode == 3240) {
                                                                if (!group2.equals("em")) {
                                                                    break loop1;
                                                                }
                                                                c2 = 2;
                                                                zzapjVar.m = 2;
                                                                i4 = 1;
                                                            } else {
                                                                if (hashCode != 3592 || !group2.equals("px")) {
                                                                    break loop1;
                                                                }
                                                                zzapjVar.m = 1;
                                                                i4 = 1;
                                                                c2 = 2;
                                                            }
                                                            String group3 = matcher2.group(i4);
                                                            group3.getClass();
                                                            zzapjVar.n = Float.parseFloat(group3);
                                                            c = c2;
                                                            str4 = b2;
                                                            i16 = i18;
                                                            i7 = 0;
                                                            i3 = 1;
                                                        } else {
                                                            StringBuilder sb4 = new StringBuilder(sb.length() + 22);
                                                            sb4.append("Invalid font-size: '");
                                                            sb4.append(sb);
                                                            sb4.append("'.");
                                                            zzeh.c(sb4.toString());
                                                        }
                                                    }
                                                }
                                                c2 = 2;
                                                c = c2;
                                                str4 = b2;
                                                i16 = i18;
                                                i7 = 0;
                                                i3 = 1;
                                            }
                                        }
                                        c2 = c;
                                        c = c2;
                                        str4 = b2;
                                        i16 = i18;
                                        i7 = 0;
                                        i3 = 1;
                                    }
                                    char c5 = c;
                                    if ("}".equals(str4)) {
                                        arrayList3.add(zzapjVar);
                                    }
                                    c = c5;
                                    i6 = -1;
                                    i7 = 0;
                                    i3 = 1;
                                }
                            }
                            str = null;
                            if (str == null) {
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                    Pattern pattern = zzapq.a;
                    Charset charset2 = StandardCharsets.UTF_8;
                    String n3 = zzeuVar.n(charset2);
                    if (n3 != null) {
                        Pattern pattern2 = zzapq.a;
                        Matcher matcher3 = pattern2.matcher(n3);
                        if (matcher3.matches()) {
                            zzapkVar = zzapq.b(null, matcher3, zzeuVar, arrayList);
                        } else {
                            String n4 = zzeuVar.n(charset2);
                            if (n4 != null) {
                                Matcher matcher4 = pattern2.matcher(n4);
                                if (matcher4.matches()) {
                                    zzapkVar = zzapq.b(n3.trim(), matcher4, zzeuVar, arrayList);
                                }
                            }
                        }
                        if (zzapkVar != null) {
                            arrayList2.add(zzapkVar);
                        }
                    }
                    zzapkVar = null;
                    if (zzapkVar != null) {
                    }
                    zzaprVar = this;
                }
            }
            defpackage.zzl.s();
        } catch (zzat e) {
            ilg.k(e);
        }
    }
}
