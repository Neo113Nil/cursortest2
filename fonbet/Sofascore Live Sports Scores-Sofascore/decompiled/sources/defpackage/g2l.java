package defpackage;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.mvvm.model.Season;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class g2l extends qhh {
    public final nkk m = new nkk(4, false);
    public final q1l n = new q1l();

    /* JADX WARN: Code restructure failed: missing block: B:222:0x0121, code lost:
    
        r22 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x039c, code lost:
    
        r2.addAll(r12);
        r0 = r19;
        r5 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0112, code lost:
    
        if (")".equals(defpackage.q1l.b(r8, r7)) == false) goto L39;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r22v5, types: [kli] */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49, types: [int] */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.regex.Matcher] */
    @Override // defpackage.qhh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kli b(byte[] bArr, int i, boolean z) {
        String str;
        String str2;
        ?? r22;
        ?? r4;
        String sb;
        char c;
        Object obj;
        g2l g2lVar = this;
        nkk nkkVar = g2lVar.m;
        nkkVar.C(bArr, i);
        ArrayList arrayList = new ArrayList();
        try {
            int i2 = i2l.a;
            int i3 = nkkVar.b;
            String g = nkkVar.g();
            String str3 = null;
            if (g == null || !g.startsWith("WEBVTT")) {
                nkkVar.E(i3);
                throw r9e.a("Expected WEBVTT. Got " + nkkVar.g(), null);
            }
            while (!TextUtils.isEmpty(nkkVar.g())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z2 = false;
                int i4 = -1;
                int i5 = 0;
                char c2 = 65535;
                while (true) {
                    ?? r10 = 1;
                    if (c2 == 65535) {
                        i5 = nkkVar.b;
                        String g2 = nkkVar.g();
                        c2 = g2 == null ? (char) 0 : "STYLE".equals(g2) ? (char) 2 : g2.startsWith("NOTE") ? (char) 1 : (char) 3;
                    } else {
                        nkkVar.E(i5);
                        if (c2 == 0) {
                            return new k2l(arrayList2, 0);
                        }
                        if (c2 == 1) {
                            while (!TextUtils.isEmpty(nkkVar.g())) {
                            }
                        } else if (c2 != 2) {
                            String str4 = str3;
                            if (c2 == 3) {
                                Pattern pattern = e2l.a;
                                String g3 = nkkVar.g();
                                if (g3 == null) {
                                    obj = str4;
                                } else {
                                    Pattern pattern2 = e2l.a;
                                    Matcher matcher = pattern2.matcher(g3);
                                    if (matcher.matches()) {
                                        obj = e2l.d(str4, matcher, nkkVar, arrayList);
                                    } else {
                                        String g4 = nkkVar.g();
                                        if (g4 != null) {
                                            Matcher matcher2 = pattern2.matcher(g4);
                                            if (matcher2.matches()) {
                                                obj = e2l.d(g3.trim(), matcher2, nkkVar, arrayList);
                                            }
                                        }
                                        obj = null;
                                    }
                                }
                                if (obj != null) {
                                    arrayList2.add(obj);
                                }
                            }
                            g2lVar = this;
                            str3 = null;
                        } else {
                            if (!arrayList2.isEmpty()) {
                                throw new oli("A style block was found after the first cue.");
                            }
                            nkkVar.g();
                            q1l q1lVar = g2lVar.n;
                            nkk nkkVar2 = q1lVar.a;
                            StringBuilder sb2 = q1lVar.b;
                            sb2.setLength(0);
                            int i6 = nkkVar.b;
                            while (!TextUtils.isEmpty(nkkVar.g())) {
                            }
                            nkkVar2.C(nkkVar.a, nkkVar.b);
                            nkkVar2.E(i6);
                            ArrayList arrayList3 = new ArrayList();
                            while (true) {
                                q1l.c(nkkVar2);
                                if (nkkVar2.c() >= 5 && "::cue".equals(nkkVar2.q(5, xp2.c))) {
                                    int i7 = nkkVar2.b;
                                    String b = q1l.b(nkkVar2, sb2);
                                    if (b != null) {
                                        if ("{".equals(b)) {
                                            nkkVar2.E(i7);
                                            str = "";
                                        } else if ("(".equals(b)) {
                                            int i8 = nkkVar2.b;
                                            int i9 = nkkVar2.c;
                                            boolean z3 = z2 ? 1 : 0;
                                            while (i8 < i9 && z3 == 0) {
                                                int i10 = i8 + 1;
                                                z3 = ((char) nkkVar2.a[i8]) == ')' ? r10 : z2 ? 1 : 0;
                                                i8 = i10;
                                            }
                                            str = nkkVar2.q((i8 - 1) - nkkVar2.b, xp2.c).trim();
                                        } else {
                                            str = str3;
                                        }
                                        if (str == null && "{".equals(q1l.b(nkkVar2, sb2))) {
                                            s1l s1lVar = new s1l();
                                            s1lVar.a = "";
                                            s1lVar.b = "";
                                            s1lVar.c = Collections.EMPTY_SET;
                                            s1lVar.d = "";
                                            s1lVar.e = str3;
                                            s1lVar.g = z2;
                                            s1lVar.i = z2;
                                            s1lVar.j = i4;
                                            s1lVar.k = i4;
                                            s1lVar.l = i4;
                                            s1lVar.m = i4;
                                            s1lVar.n = i4;
                                            s1lVar.p = i4;
                                            s1lVar.q = z2;
                                            if ("".equals(str)) {
                                                r22 = str3;
                                            } else {
                                                int indexOf = str.indexOf(91);
                                                if (indexOf != i4) {
                                                    str2 = str3;
                                                    ?? matcher3 = q1l.c.matcher(str.substring(indexOf));
                                                    if (matcher3.matches()) {
                                                        String group = matcher3.group(r10);
                                                        group.getClass();
                                                        s1lVar.d = group;
                                                    }
                                                    str = str.substring(z2 ? 1 : 0, indexOf);
                                                } else {
                                                    str2 = str3;
                                                }
                                                int i11 = lik.a;
                                                String[] split = str.split("\\.", i4);
                                                String str5 = split[z2 ? 1 : 0];
                                                int indexOf2 = str5.indexOf(35);
                                                if (indexOf2 != i4) {
                                                    s1lVar.b = str5.substring(z2 ? 1 : 0, indexOf2);
                                                    s1lVar.a = str5.substring(indexOf2 + 1);
                                                } else {
                                                    s1lVar.b = str5;
                                                }
                                                r22 = str2;
                                                if (split.length > r10) {
                                                    int length = split.length;
                                                    qx9.r(length <= split.length ? r10 : z2 ? 1 : 0);
                                                    s1lVar.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, (int) r10, length)));
                                                    r22 = str2;
                                                }
                                            }
                                            String str6 = r22;
                                            boolean z4 = z2 ? 1 : 0;
                                            boolean z5 = r10;
                                            while (z4 == 0) {
                                                int i12 = nkkVar2.b;
                                                String b2 = q1l.b(nkkVar2, sb2);
                                                boolean z6 = (b2 == null || "}".equals(b2)) ? z5 : z2;
                                                if (z6 == 0) {
                                                    nkkVar2.E(i12);
                                                    q1l.c(nkkVar2);
                                                    String a = q1l.a(nkkVar2, sb2);
                                                    if (!"".equals(a) && ":".equals(q1l.b(nkkVar2, sb2))) {
                                                        q1l.c(nkkVar2);
                                                        StringBuilder sb3 = new StringBuilder();
                                                        boolean z7 = false;
                                                        while (true) {
                                                            if (z7) {
                                                                sb = sb3.toString();
                                                            } else {
                                                                int i13 = nkkVar2.b;
                                                                boolean z8 = z7;
                                                                String b3 = q1l.b(nkkVar2, sb2);
                                                                if (b3 == null) {
                                                                    sb = r22;
                                                                } else if ("}".equals(b3) || ";".equals(b3)) {
                                                                    nkkVar2.E(i13);
                                                                    z7 = true;
                                                                } else {
                                                                    sb3.append(b3);
                                                                    z7 = z8;
                                                                }
                                                            }
                                                        }
                                                        if (sb != null && !"".equals(sb)) {
                                                            int i14 = nkkVar2.b;
                                                            String b4 = q1l.b(nkkVar2, sb2);
                                                            if (!";".equals(b4)) {
                                                                if ("}".equals(b4)) {
                                                                    nkkVar2.E(i14);
                                                                }
                                                            }
                                                            if ("color".equals(a)) {
                                                                r4 = 1;
                                                                s1lVar.f = a23.a(sb, true);
                                                                s1lVar.g = true;
                                                            } else {
                                                                r4 = 1;
                                                                if ("background-color".equals(a)) {
                                                                    s1lVar.h = a23.a(sb, true);
                                                                    s1lVar.i = true;
                                                                } else if ("ruby-position".equals(a)) {
                                                                    if ("over".equals(sb)) {
                                                                        s1lVar.p = 1;
                                                                    } else if ("under".equals(sb)) {
                                                                        s1lVar.p = 2;
                                                                        r4 = 1;
                                                                        z5 = r4;
                                                                        str6 = b2;
                                                                        z4 = z6;
                                                                        z2 = false;
                                                                    }
                                                                } else if ("text-combine-upright".equals(a)) {
                                                                    s1lVar.q = Season.YEAR_ALL_TIME.equals(sb) || sb.startsWith("digits");
                                                                } else if ("text-decoration".equals(a)) {
                                                                    if (TtmlNode.UNDERLINE.equals(sb)) {
                                                                        r4 = 1;
                                                                        s1lVar.k = 1;
                                                                    }
                                                                } else if ("font-family".equals(a)) {
                                                                    s1lVar.e = rz8.W(sb);
                                                                } else if (!"font-weight".equals(a)) {
                                                                    r4 = 1;
                                                                    if ("font-style".equals(a)) {
                                                                        if (TtmlNode.ITALIC.equals(sb)) {
                                                                            s1lVar.m = 1;
                                                                        }
                                                                    } else if ("font-size".equals(a)) {
                                                                        ?? matcher4 = q1l.d.matcher(rz8.W(sb));
                                                                        if (matcher4.matches()) {
                                                                            String group2 = matcher4.group(2);
                                                                            group2.getClass();
                                                                            switch (group2.hashCode()) {
                                                                                case 37:
                                                                                    if (group2.equals("%")) {
                                                                                        c = 0;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                case 3240:
                                                                                    if (group2.equals("em")) {
                                                                                        c = 1;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                case 3592:
                                                                                    if (group2.equals("px")) {
                                                                                        c = 2;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            c = 65535;
                                                                            switch (c) {
                                                                                case 0:
                                                                                    r4 = 1;
                                                                                    s1lVar.n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    r4 = 1;
                                                                                    s1lVar.n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    r4 = 1;
                                                                                    s1lVar.n = 1;
                                                                                    break;
                                                                                default:
                                                                                    zzl.s();
                                                                                    return r22;
                                                                            }
                                                                            String group3 = matcher4.group(r4);
                                                                            group3.getClass();
                                                                            s1lVar.o = Float.parseFloat(group3);
                                                                            z5 = r4;
                                                                            str6 = b2;
                                                                            z4 = z6;
                                                                            z2 = false;
                                                                        } else {
                                                                            m6k.f0();
                                                                        }
                                                                    }
                                                                } else if (TtmlNode.BOLD.equals(sb)) {
                                                                    r4 = 1;
                                                                    s1lVar.l = 1;
                                                                }
                                                            }
                                                            z5 = r4;
                                                            str6 = b2;
                                                            z4 = z6;
                                                            z2 = false;
                                                        }
                                                        r4 = 1;
                                                        z5 = r4;
                                                        str6 = b2;
                                                        z4 = z6;
                                                        z2 = false;
                                                    }
                                                }
                                                r4 = z5;
                                                z5 = r4;
                                                str6 = b2;
                                                z4 = z6;
                                                z2 = false;
                                            }
                                            boolean z9 = z5;
                                            if ("}".equals(str6)) {
                                                arrayList3.add(s1lVar);
                                            }
                                            str3 = r22;
                                            r10 = z9;
                                            z2 = false;
                                            i4 = -1;
                                        }
                                    }
                                }
                                str = str3;
                                if (str == null) {
                                }
                            }
                        }
                    }
                }
            }
        } catch (r9e e) {
            throw new oli(e);
        }
    }
}
