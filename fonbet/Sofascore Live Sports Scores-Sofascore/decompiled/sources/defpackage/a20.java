package defpackage;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import com.unity3d.services.UnityAdsConstants;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a20 implements e8e {
    public final String a;
    public final dfj b;
    public final List c;
    public final List d;
    public final sf8 e;
    public final kx4 f;
    public final f40 g;
    public final CharSequence h;
    public final lma i;
    public sx2 j;
    public final boolean k;
    public final int l;

    /* JADX WARN: Code restructure failed: missing block: B:451:0x0099, code lost:
    
        if (r7 == 1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0864 A[LOOP:6: B:276:0x0862->B:277:0x0864, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0150 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:429:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a20(String str, dfj dfjVar, List list, List list2, sf8 sf8Var, kx4 kx4Var) {
        boolean booleanValue;
        Locale locale;
        int i;
        int i2;
        int size;
        int i3;
        Object obj;
        wg8 wg8Var;
        rg8 rg8Var;
        String str2;
        eib eibVar;
        zcj zcjVar;
        long j;
        long b;
        boolean z;
        tf8 tf8Var;
        boolean z2;
        i6k c;
        Typeface typeface;
        pwh pwhVar;
        List list3;
        String str3;
        float textSize;
        dfj dfjVar2;
        List list4;
        kx4 kx4Var2;
        boolean z3;
        CharSequence charSequence;
        pwh pwhVar2;
        g8e g8eVar;
        long j2;
        tje tjeVar;
        float P;
        int i4;
        bdj bdjVar;
        g8e g8eVar2;
        ArrayList arrayList;
        int size2;
        int i5;
        ArrayList arrayList2;
        pwh pwhVar3;
        int i6;
        int size3;
        int i7;
        boolean z4;
        bdj bdjVar2;
        int size4;
        int i8;
        int size5;
        int i9;
        long j3;
        int i10;
        List list5;
        int i11;
        int i12;
        int i13;
        List list6;
        boolean z5;
        Spannable spannable;
        g8e g8eVar3;
        int i14;
        aje ajeVar;
        aje ajeVar2;
        this.a = str;
        this.b = dfjVar;
        this.c = list;
        this.d = list2;
        this.e = sf8Var;
        this.f = kx4Var;
        float j4 = kx4Var.j();
        f40 f40Var = new f40(1);
        ((TextPaint) f40Var).density = j4;
        f40Var.b = v8j.b;
        f40Var.c = 3;
        f40Var.d = qah.d;
        this.g = f40Var;
        boolean C = yso.C(dfjVar);
        pwh pwhVar4 = dfjVar.a;
        g8e g8eVar4 = dfjVar.b;
        if (C) {
            sz8 sz8Var = hl5.a;
            sz8 sz8Var2 = hl5.a;
            cdi cdiVar = (cdi) sz8Var2.b;
            if (cdiVar == null) {
                if (cl5.d()) {
                    cdiVar = sz8Var2.u();
                    sz8Var2.b = cdiVar;
                } else {
                    cdiVar = iz8.h;
                }
            }
            booleanValue = ((Boolean) cdiVar.getValue()).booleanValue();
        } else {
            booleanValue = false;
        }
        this.k = booleanValue;
        int i15 = g8eVar4.b;
        eib eibVar2 = pwhVar4.k;
        int i16 = 2;
        if (i15 != 4) {
            if (i15 != 5) {
                if (i15 == 1) {
                    i = 0;
                } else if (i15 == 2) {
                    i = 1;
                } else {
                    if (i15 != 3 && i15 != 0) {
                        a70.r("Invalid TextDirection.");
                        throw null;
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((eibVar2 == null || (locale = eibVar2.c().a) == null) ? Locale.getDefault() : locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                }
                this.l = i;
                jw5 jw5Var = new jw5(this, i16);
                lej lejVar = g8eVar4.i;
                lejVar = lejVar == null ? lej.c : lejVar;
                f40Var.setFlags(lejVar.b ? f40Var.getFlags() | 128 : f40Var.getFlags() & (-129));
                i2 = lejVar.a;
                if (i2 == 1) {
                    f40Var.setFlags(f40Var.getFlags() | 64);
                    f40Var.setHinting(0);
                } else if (i2 == 2) {
                    f40Var.getFlags();
                    f40Var.setHinting(1);
                } else if (i2 == 3) {
                    f40Var.getFlags();
                    f40Var.setHinting(0);
                } else {
                    f40Var.getFlags();
                }
                size = list.size();
                i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i3);
                    if (((p80) obj).a instanceof pwh) {
                        break;
                    } else {
                        i3++;
                    }
                }
                boolean z6 = obj != null;
                long j5 = pwhVar4.b;
                wg8Var = pwhVar4.c;
                rg8Var = pwhVar4.d;
                str2 = pwhVar4.g;
                eibVar = pwhVar4.k;
                ycj ycjVar = pwhVar4.a;
                zcjVar = pwhVar4.j;
                j = pwhVar4.h;
                b = lfj.b(j5);
                z = z6;
                if (mfj.a(b, 4294967296L)) {
                    f40Var.setTextSize(kx4Var.h0(j5));
                } else if (mfj.a(b, 8589934592L)) {
                    f40Var.setTextSize(lfj.c(j5) * f40Var.getTextSize());
                }
                tf8Var = pwhVar4.f;
                if (tf8Var != null && rg8Var == null && wg8Var == null) {
                    z2 = z;
                } else {
                    wg8 wg8Var2 = wg8Var == null ? wg8.g : wg8Var;
                    int i17 = rg8Var != null ? rg8Var.a : 0;
                    sg8 sg8Var = pwhVar4.e;
                    int i18 = sg8Var != null ? sg8Var.a : 65535;
                    a20 a20Var = (a20) jw5Var.b;
                    z2 = z;
                    c = ((vf8) a20Var.e).c(tf8Var, wg8Var2, i17, i18);
                    if (c instanceof h6k) {
                        Object obj2 = ((h6k) c).a;
                        obj2.getClass();
                        typeface = (Typeface) obj2;
                    } else {
                        sx2 sx2Var = new sx2(c, a20Var.j);
                        a20Var.j = sx2Var;
                        Object obj3 = sx2Var.c;
                        obj3.getClass();
                        typeface = (Typeface) obj3;
                    }
                    f40Var.setTypeface(typeface);
                }
                if (eibVar != null) {
                    eib eibVar3 = eib.c;
                    if (!eibVar.equals(pie.a.P())) {
                        ArrayList arrayList3 = new ArrayList(k13.r(eibVar, 10));
                        Iterator it = eibVar.a.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((dib) it.next()).a);
                        }
                        Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                        f40Var.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
                    }
                }
                if (str2 != null && !str2.equals("")) {
                    f40Var.setFontFeatureSettings(str2);
                }
                if (zcjVar != null && !zcjVar.equals(zcj.c)) {
                    f40Var.setTextScaleX(f40Var.getTextScaleX() * zcjVar.a);
                    f40Var.setTextSkewX(f40Var.getTextSkewX() + zcjVar.b);
                }
                f40Var.d(ycjVar.b());
                f40Var.c(ycjVar.c(), 9205357640488583168L, ycjVar.a());
                f40Var.f(pwhVar4.n);
                f40Var.g(pwhVar4.m);
                f40Var.e(pwhVar4.p);
                if (!mfj.a(lfj.b(j), 4294967296L) && lfj.c(j) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float textScaleX = f40Var.getTextScaleX() * f40Var.getTextSize();
                    float h0 = kx4Var.h0(j);
                    if (textScaleX != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f40Var.setLetterSpacing(h0 / textScaleX);
                    }
                } else if (mfj.a(lfj.b(j), 8589934592L)) {
                    f40Var.setLetterSpacing(lfj.c(j));
                }
                long j6 = pwhVar4.l;
                sn1 sn1Var = pwhVar4.i;
                boolean z7 = (z2 || !mfj.a(lfj.b(j), 4294967296L) || lfj.c(j) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? false : true;
                long j7 = r13.i;
                boolean z8 = e8k.a(j6, j7) && !e8k.a(j6, r13.h);
                boolean z9 = sn1Var == null && Float.compare(sn1Var.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0;
                pwhVar = (!z7 || z8 || z9) ? new pwh(0L, 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, z7 ? j : lfj.c, z9 ? sn1Var : null, (zcj) null, (eib) null, z8 ? j6 : j7, (v8j) null, (qah) null, 63103) : null;
                list3 = this.c;
                if (pwhVar != null) {
                    int size6 = list3.size() + 1;
                    ArrayList arrayList4 = new ArrayList(size6);
                    int i19 = 0;
                    while (i19 < size6) {
                        arrayList4.add(i19 == 0 ? new p80(pwhVar, 0, this.a.length()) : (p80) this.c.get(i19 - 1));
                        i19++;
                    }
                    list3 = arrayList4;
                }
                str3 = this.a;
                textSize = this.g.getTextSize();
                dfjVar2 = this.b;
                list4 = this.d;
                kx4Var2 = this.f;
                z3 = this.k;
                y10 y10Var = z10.a;
                if (z3 || !cl5.d()) {
                    charSequence = str3;
                } else {
                    tje tjeVar2 = dfjVar2.c;
                    rl5 rl5Var = (tjeVar2 == null || (ajeVar2 = tjeVar2.b) == null) ? null : new rl5(ajeVar2.b);
                    charSequence = cl5.a().g(0, str3.length(), rl5Var == null ? 0 : rl5Var.a == 2 ? 1 : 0, str3);
                    charSequence.getClass();
                }
                if (list3.isEmpty() || !list4.isEmpty() || !Intrinsics.c(dfjVar2.b.d, bdj.c) || (dfjVar2.b.c & 1095216660480L) != 0) {
                    Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
                    pwhVar2 = dfjVar2.a;
                    g8eVar = dfjVar2.b;
                    if (Intrinsics.c(pwhVar2.m, v8j.c)) {
                        j2 = 0;
                        spannableString.setSpan(z10.a, 0, str3.length(), 33);
                    } else {
                        j2 = 0;
                    }
                    tjeVar = dfjVar2.c;
                    if (((tjeVar != null || (ajeVar = tjeVar.b) == null) ? false : ajeVar.a) || g8eVar.f != null) {
                        r7b r7bVar = g8eVar.f;
                        r7bVar = r7bVar == null ? r7b.d : r7bVar;
                        P = jca.P(g8eVar.c, textSize, kx4Var2);
                        if (!Float.isNaN(P)) {
                            int length = (spannableString.length() == 0 || iii.G(spannableString) == '\n') ? spannableString.length() + 1 : spannableString.length();
                            int i20 = r7bVar.b;
                            i4 = 0;
                            spannableString.setSpan(new s7b(P, length, (i20 & 1) > 0, (i20 & 16) > 0, r7bVar.a, r7bVar.c), 0, spannableString.length(), 33);
                            bdjVar = g8eVar.d;
                            if (bdjVar == null) {
                                int i21 = i4;
                                long j8 = bdjVar.a;
                                long j9 = bdjVar.b;
                                if ((lfj.a(j8, v8a.v(i21)) && lfj.a(j9, v8a.v(i21))) || (j8 & 1095216660480L) == j2 || (j9 & 1095216660480L) == j2) {
                                    g8eVar2 = g8eVar;
                                } else {
                                    long b2 = lfj.b(j8);
                                    g8eVar2 = g8eVar;
                                    float h02 = mfj.a(b2, 4294967296L) ? kx4Var2.h0(j8) : mfj.a(b2, 8589934592L) ? lfj.c(j8) * textSize : 0.0f;
                                    long b3 = lfj.b(j9);
                                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(h02), (int) Math.ceil(mfj.a(b3, 4294967296L) ? kx4Var2.h0(j9) : mfj.a(b3, 8589934592L) ? lfj.c(j9) * textSize : 0.0f)), 0, spannableString.length(), 33);
                                }
                            } else {
                                g8eVar2 = g8eVar;
                            }
                            arrayList = new ArrayList(list3.size());
                            size2 = list3.size();
                            for (i5 = 0; i5 < size2; i5++) {
                                p80 p80Var = (p80) list3.get(i5);
                                Object obj4 = p80Var.a;
                                if (obj4 instanceof pwh) {
                                    pwh pwhVar5 = (pwh) obj4;
                                    if (pwhVar5.f != null || pwhVar5.d != null || pwhVar5.c != null || ((pwh) obj4).e != null) {
                                        arrayList.add(p80Var);
                                    }
                                }
                            }
                            pwh pwhVar6 = dfjVar2.a;
                            tf8 tf8Var2 = pwhVar6.f;
                            pwh pwhVar7 = (tf8Var2 != null && pwhVar6.d == null && pwhVar6.c == null && pwhVar6.e == null) ? null : new pwh(0L, 0L, pwhVar6.c, pwhVar6.d, pwhVar6.e, tf8Var2, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65475);
                            yya yyaVar = new yya(28, spannableString, jw5Var);
                            if (arrayList.size() <= 1) {
                                int size7 = arrayList.size();
                                int i22 = size7 * 2;
                                int[] iArr = new int[i22];
                                int size8 = arrayList.size();
                                for (int i23 = 0; i23 < size8; i23++) {
                                    p80 p80Var2 = (p80) arrayList.get(i23);
                                    iArr[i23] = p80Var2.b;
                                    iArr[i23 + size7] = p80Var2.c;
                                }
                                if (i22 > 1) {
                                    Arrays.sort(iArr);
                                }
                                int y = ph0.y(iArr);
                                int i24 = 0;
                                while (i24 < i22) {
                                    int i25 = iArr[i24];
                                    if (i25 == y) {
                                        arrayList2 = arrayList;
                                        pwhVar3 = pwhVar7;
                                        i6 = i24;
                                    } else {
                                        int size9 = arrayList.size();
                                        pwh pwhVar8 = pwhVar7;
                                        int i26 = 0;
                                        while (i26 < size9) {
                                            ArrayList arrayList5 = arrayList;
                                            p80 p80Var3 = (p80) arrayList.get(i26);
                                            pwh pwhVar9 = pwhVar7;
                                            int i27 = p80Var3.b;
                                            int i28 = i24;
                                            int i29 = p80Var3.c;
                                            if (i27 != i29 && r80.b(y, i25, i27, i29)) {
                                                pwh pwhVar10 = (pwh) p80Var3.a;
                                                pwhVar8 = pwhVar8 != null ? pwhVar8.d(pwhVar10) : pwhVar10;
                                            }
                                            i26++;
                                            arrayList = arrayList5;
                                            pwhVar7 = pwhVar9;
                                            i24 = i28;
                                        }
                                        arrayList2 = arrayList;
                                        pwhVar3 = pwhVar7;
                                        i6 = i24;
                                        if (pwhVar8 != null) {
                                            yyaVar.invoke(pwhVar8, Integer.valueOf(y), Integer.valueOf(i25));
                                        }
                                        y = i25;
                                    }
                                    i24 = i6 + 1;
                                    arrayList = arrayList2;
                                    pwhVar7 = pwhVar3;
                                }
                            } else if (!arrayList.isEmpty()) {
                                pwh pwhVar11 = (pwh) ((p80) arrayList.get(0)).a;
                                yyaVar.invoke(pwhVar7 != null ? pwhVar7.d(pwhVar11) : pwhVar11, Integer.valueOf(((p80) arrayList.get(0)).b), Integer.valueOf(((p80) arrayList.get(0)).c));
                            }
                            size3 = list3.size();
                            i7 = 0;
                            z4 = false;
                            while (i7 < size3) {
                                p80 p80Var4 = (p80) list3.get(i7);
                                Object obj5 = p80Var4.a;
                                if (obj5 instanceof pwh) {
                                    int i30 = p80Var4.b;
                                    int i31 = p80Var4.c;
                                    if (i30 >= 0 && i30 < spannableString.length() && i31 > i30 && i31 <= spannableString.length()) {
                                        pwh pwhVar12 = (pwh) obj5;
                                        long j10 = pwhVar12.h;
                                        sn1 sn1Var2 = pwhVar12.i;
                                        ycj ycjVar2 = pwhVar12.a;
                                        if (sn1Var2 != null) {
                                            i12 = size3;
                                            spannableString.setSpan(new tn1(sn1Var2.a, 0), i30, i31, 33);
                                        } else {
                                            i12 = size3;
                                        }
                                        i13 = i7;
                                        jca.Q(spannableString, ycjVar2.b(), i30, i31);
                                        n52 c2 = ycjVar2.c();
                                        float a = ycjVar2.a();
                                        if (c2 != null) {
                                            if (c2 instanceof pvh) {
                                                jca.Q(spannableString, ((pvh) c2).a, i30, i31);
                                            } else {
                                                spannableString.setSpan(new pah((oah) c2, a), i30, i31, 33);
                                            }
                                        }
                                        v8j v8jVar = pwhVar12.m;
                                        if (v8jVar != null) {
                                            int i32 = v8jVar.a;
                                            w8j w8jVar = new w8j((i32 | 1) == i32, (i32 | 2) == i32);
                                            i14 = 33;
                                            spannableString.setSpan(w8jVar, i30, i31, 33);
                                        } else {
                                            i14 = 33;
                                        }
                                        int i33 = i14;
                                        g8eVar3 = g8eVar2;
                                        jca.R(spannableString, pwhVar12.b, kx4Var2, i30, i31);
                                        spannable = spannableString;
                                        String str4 = pwhVar12.g;
                                        if (str4 != null) {
                                            spannable.setSpan(new xf8(str4, 0), i30, i31, i33);
                                        }
                                        zcj zcjVar2 = pwhVar12.j;
                                        if (zcjVar2 != null) {
                                            spannable.setSpan(new ScaleXSpan(zcjVar2.a), i30, i31, i33);
                                            spannable.setSpan(new tn1(zcjVar2.b, 1), i30, i31, i33);
                                        }
                                        jca.T(spannable, pwhVar12.k, i30, i31);
                                        long j11 = pwhVar12.l;
                                        if (j11 != 16) {
                                            spannable.setSpan(new BackgroundColorSpan(hkg.s0(j11)), i30, i31, i33);
                                        }
                                        qah qahVar = pwhVar12.n;
                                        if (qahVar != null) {
                                            long j12 = qahVar.b;
                                            list6 = list3;
                                            int s0 = hkg.s0(qahVar.a);
                                            z5 = z4;
                                            float intBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
                                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L));
                                            float f = qahVar.c;
                                            tah tahVar = new tah(intBitsToFloat, intBitsToFloat2, f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.MIN_VALUE : f, s0);
                                            i33 = 33;
                                            spannable.setSpan(tahVar, i30, i31, 33);
                                        } else {
                                            list6 = list3;
                                            z5 = z4;
                                        }
                                        ja5 ja5Var = pwhVar12.p;
                                        if (ja5Var != null) {
                                            spannable.setSpan(new ka5(ja5Var), i30, i31, i33);
                                        }
                                        if (mfj.a(lfj.b(j10), 4294967296L) || mfj.a(lfj.b(j10), 8589934592L)) {
                                            z4 = true;
                                            i7 = i13 + 1;
                                            list3 = list6;
                                            g8eVar2 = g8eVar3;
                                            spannableString = spannable;
                                            size3 = i12;
                                        }
                                        z4 = z5;
                                        i7 = i13 + 1;
                                        list3 = list6;
                                        g8eVar2 = g8eVar3;
                                        spannableString = spannable;
                                        size3 = i12;
                                    }
                                }
                                i12 = size3;
                                i13 = i7;
                                list6 = list3;
                                z5 = z4;
                                spannable = spannableString;
                                g8eVar3 = g8eVar2;
                                z4 = z5;
                                i7 = i13 + 1;
                                list3 = list6;
                                g8eVar2 = g8eVar3;
                                spannableString = spannable;
                                size3 = i12;
                            }
                            List list7 = list3;
                            Spannable spannable2 = spannableString;
                            g8e g8eVar5 = g8eVar2;
                            if (z4) {
                                int size10 = list7.size();
                                int i34 = 0;
                                while (i34 < size10) {
                                    List list8 = list7;
                                    p80 p80Var5 = (p80) list8.get(i34);
                                    m80 m80Var = (m80) p80Var5.a;
                                    if (m80Var instanceof pwh) {
                                        int i35 = p80Var5.b;
                                        int i36 = p80Var5.c;
                                        if (i35 >= 0 && i35 < spannable2.length() && i36 > i35 && i36 <= spannable2.length()) {
                                            long j13 = ((pwh) m80Var).h;
                                            long b4 = lfj.b(j13);
                                            list5 = list4;
                                            i11 = i34;
                                            Object z5bVar = mfj.a(b4, 4294967296L) ? new z5b(kx4Var2.h0(j13)) : mfj.a(b4, 8589934592L) ? new y5b(lfj.c(j13)) : null;
                                            if (z5bVar != null) {
                                                spannable2.setSpan(z5bVar, i35, i36, 33);
                                            }
                                            i34 = i11 + 1;
                                            list7 = list8;
                                            list4 = list5;
                                        }
                                    }
                                    list5 = list4;
                                    i11 = i34;
                                    i34 = i11 + 1;
                                    list7 = list8;
                                    list4 = list5;
                                }
                            }
                            List list9 = list7;
                            List list10 = list4;
                            bdjVar2 = g8eVar5.d;
                            if (bdjVar2 != null) {
                                long j14 = bdjVar2.a;
                                long b5 = lfj.b(j14);
                                if (mfj.a(b5, 4294967296L)) {
                                    kx4Var2.h0(j14);
                                } else if (mfj.a(b5, 8589934592L)) {
                                    lfj.c(j14);
                                }
                            }
                            size4 = list9.size();
                            for (i8 = 0; i8 < size4; i8++) {
                                Object obj6 = ((p80) list9.get(i8)).a;
                            }
                            size5 = list10.size();
                            i9 = 0;
                            while (i9 < size5) {
                                p80 p80Var6 = (p80) list10.get(i9);
                                the theVar = (the) p80Var6.a;
                                int i37 = p80Var6.b;
                                int i38 = p80Var6.c;
                                for (Object obj7 : spannable2.getSpans(i37, i38, e6k.class)) {
                                    spannable2.removeSpan((e6k) obj7);
                                }
                                long j15 = theVar.a;
                                long j16 = theVar.b;
                                float c3 = lfj.c(j15);
                                int i39 = size5;
                                int i40 = i9;
                                long b6 = lfj.b(theVar.a);
                                List list11 = list10;
                                if (mfj.a(b6, 4294967296L)) {
                                    j3 = j16;
                                    i10 = 0;
                                } else if (mfj.a(b6, 8589934592L)) {
                                    j3 = j16;
                                    i10 = 1;
                                } else {
                                    j3 = j16;
                                    i10 = 2;
                                }
                                kx4 kx4Var3 = kx4Var2;
                                float c4 = lfj.c(j3);
                                long b7 = lfj.b(j3);
                                xhe xheVar = new xhe(c3, i10, c4, mfj.a(b7, 4294967296L) ? 0 : mfj.a(b7, 8589934592L) ? 1 : 2, kx4Var3, 3);
                                kx4Var2 = kx4Var3;
                                spannable2.setSpan(xheVar, i37, i38, 33);
                                size5 = i39;
                                i9 = i40 + 1;
                                list10 = list11;
                            }
                            charSequence = spannable2;
                        }
                    } else {
                        float P2 = jca.P(g8eVar.c, textSize, kx4Var2);
                        if (!Float.isNaN(P2)) {
                            spannableString.setSpan(new n7b(P2), 0, spannableString.length(), 33);
                        }
                    }
                    i4 = 0;
                    bdjVar = g8eVar.d;
                    if (bdjVar == null) {
                    }
                    arrayList = new ArrayList(list3.size());
                    size2 = list3.size();
                    while (i5 < size2) {
                    }
                    pwh pwhVar62 = dfjVar2.a;
                    tf8 tf8Var22 = pwhVar62.f;
                    if (tf8Var22 != null) {
                    }
                    yya yyaVar2 = new yya(28, spannableString, jw5Var);
                    if (arrayList.size() <= 1) {
                    }
                    size3 = list3.size();
                    i7 = 0;
                    z4 = false;
                    while (i7 < size3) {
                    }
                    List list72 = list3;
                    Spannable spannable22 = spannableString;
                    g8e g8eVar52 = g8eVar2;
                    if (z4) {
                    }
                    List list92 = list72;
                    List list102 = list4;
                    bdjVar2 = g8eVar52.d;
                    if (bdjVar2 != null) {
                    }
                    size4 = list92.size();
                    while (i8 < size4) {
                    }
                    size5 = list102.size();
                    i9 = 0;
                    while (i9 < size5) {
                    }
                    charSequence = spannable22;
                }
                this.h = charSequence;
                this.i = new lma(charSequence, this.g, this.l);
            }
            i = 3;
            this.l = i;
            jw5 jw5Var2 = new jw5(this, i16);
            lej lejVar2 = g8eVar4.i;
            if (lejVar2 == null) {
            }
            f40Var.setFlags(lejVar2.b ? f40Var.getFlags() | 128 : f40Var.getFlags() & (-129));
            i2 = lejVar2.a;
            if (i2 == 1) {
            }
            size = list.size();
            i3 = 0;
            while (true) {
                if (i3 >= size) {
                }
                i3++;
            }
            if (obj != null) {
            }
            long j52 = pwhVar4.b;
            wg8Var = pwhVar4.c;
            rg8Var = pwhVar4.d;
            str2 = pwhVar4.g;
            eibVar = pwhVar4.k;
            ycj ycjVar3 = pwhVar4.a;
            zcjVar = pwhVar4.j;
            j = pwhVar4.h;
            b = lfj.b(j52);
            z = z6;
            if (mfj.a(b, 4294967296L)) {
            }
            tf8Var = pwhVar4.f;
            if (tf8Var != null) {
            }
            if (wg8Var == null) {
            }
            if (rg8Var != null) {
            }
            sg8 sg8Var2 = pwhVar4.e;
            if (sg8Var2 != null) {
            }
            a20 a20Var2 = (a20) jw5Var2.b;
            z2 = z;
            c = ((vf8) a20Var2.e).c(tf8Var, wg8Var2, i17, i18);
            if (c instanceof h6k) {
            }
            f40Var.setTypeface(typeface);
            if (eibVar != null) {
            }
            if (str2 != null) {
                f40Var.setFontFeatureSettings(str2);
            }
            if (zcjVar != null) {
                f40Var.setTextScaleX(f40Var.getTextScaleX() * zcjVar.a);
                f40Var.setTextSkewX(f40Var.getTextSkewX() + zcjVar.b);
            }
            f40Var.d(ycjVar3.b());
            f40Var.c(ycjVar3.c(), 9205357640488583168L, ycjVar3.a());
            f40Var.f(pwhVar4.n);
            f40Var.g(pwhVar4.m);
            f40Var.e(pwhVar4.p);
            if (!mfj.a(lfj.b(j), 4294967296L)) {
            }
            if (mfj.a(lfj.b(j), 8589934592L)) {
            }
            long j62 = pwhVar4.l;
            sn1 sn1Var3 = pwhVar4.i;
            if (z2) {
            }
            long j72 = r13.i;
            if (e8k.a(j62, j72)) {
            }
            if (sn1Var3 == null) {
            }
            if (z7) {
            }
            list3 = this.c;
            if (pwhVar != null) {
            }
            str3 = this.a;
            textSize = this.g.getTextSize();
            dfjVar2 = this.b;
            list4 = this.d;
            kx4Var2 = this.f;
            z3 = this.k;
            y10 y10Var2 = z10.a;
            if (z3) {
            }
            charSequence = str3;
            if (list3.isEmpty()) {
            }
            if (charSequence instanceof Spannable) {
            }
            pwhVar2 = dfjVar2.a;
            g8eVar = dfjVar2.b;
            if (Intrinsics.c(pwhVar2.m, v8j.c)) {
            }
            tjeVar = dfjVar2.c;
            if ((tjeVar != null || (ajeVar = tjeVar.b) == null) ? false : ajeVar.a) {
            }
            r7b r7bVar2 = g8eVar.f;
            if (r7bVar2 == null) {
            }
            P = jca.P(g8eVar.c, textSize, kx4Var2);
            if (!Float.isNaN(P)) {
            }
            i4 = 0;
            bdjVar = g8eVar.d;
            if (bdjVar == null) {
            }
            arrayList = new ArrayList(list3.size());
            size2 = list3.size();
            while (i5 < size2) {
            }
            pwh pwhVar622 = dfjVar2.a;
            tf8 tf8Var222 = pwhVar622.f;
            if (tf8Var222 != null) {
            }
            yya yyaVar22 = new yya(28, spannableString, jw5Var2);
            if (arrayList.size() <= 1) {
            }
            size3 = list3.size();
            i7 = 0;
            z4 = false;
            while (i7 < size3) {
            }
            List list722 = list3;
            Spannable spannable222 = spannableString;
            g8e g8eVar522 = g8eVar2;
            if (z4) {
            }
            List list922 = list722;
            List list1022 = list4;
            bdjVar2 = g8eVar522.d;
            if (bdjVar2 != null) {
            }
            size4 = list922.size();
            while (i8 < size4) {
            }
            size5 = list1022.size();
            i9 = 0;
            while (i9 < size5) {
            }
            charSequence = spannable222;
            this.h = charSequence;
            this.i = new lma(charSequence, this.g, this.l);
        }
        i = 2;
        this.l = i;
        jw5 jw5Var22 = new jw5(this, i16);
        lej lejVar22 = g8eVar4.i;
        if (lejVar22 == null) {
        }
        f40Var.setFlags(lejVar22.b ? f40Var.getFlags() | 128 : f40Var.getFlags() & (-129));
        i2 = lejVar22.a;
        if (i2 == 1) {
        }
        size = list.size();
        i3 = 0;
        while (true) {
            if (i3 >= size) {
            }
            i3++;
        }
        if (obj != null) {
        }
        long j522 = pwhVar4.b;
        wg8Var = pwhVar4.c;
        rg8Var = pwhVar4.d;
        str2 = pwhVar4.g;
        eibVar = pwhVar4.k;
        ycj ycjVar32 = pwhVar4.a;
        zcjVar = pwhVar4.j;
        j = pwhVar4.h;
        b = lfj.b(j522);
        z = z6;
        if (mfj.a(b, 4294967296L)) {
        }
        tf8Var = pwhVar4.f;
        if (tf8Var != null) {
        }
        if (wg8Var == null) {
        }
        if (rg8Var != null) {
        }
        sg8 sg8Var22 = pwhVar4.e;
        if (sg8Var22 != null) {
        }
        a20 a20Var22 = (a20) jw5Var22.b;
        z2 = z;
        c = ((vf8) a20Var22.e).c(tf8Var, wg8Var2, i17, i18);
        if (c instanceof h6k) {
        }
        f40Var.setTypeface(typeface);
        if (eibVar != null) {
        }
        if (str2 != null) {
        }
        if (zcjVar != null) {
        }
        f40Var.d(ycjVar32.b());
        f40Var.c(ycjVar32.c(), 9205357640488583168L, ycjVar32.a());
        f40Var.f(pwhVar4.n);
        f40Var.g(pwhVar4.m);
        f40Var.e(pwhVar4.p);
        if (!mfj.a(lfj.b(j), 4294967296L)) {
        }
        if (mfj.a(lfj.b(j), 8589934592L)) {
        }
        long j622 = pwhVar4.l;
        sn1 sn1Var32 = pwhVar4.i;
        if (z2) {
        }
        long j722 = r13.i;
        if (e8k.a(j622, j722)) {
        }
        if (sn1Var32 == null) {
        }
        if (z7) {
        }
        list3 = this.c;
        if (pwhVar != null) {
        }
        str3 = this.a;
        textSize = this.g.getTextSize();
        dfjVar2 = this.b;
        list4 = this.d;
        kx4Var2 = this.f;
        z3 = this.k;
        y10 y10Var22 = z10.a;
        if (z3) {
        }
        charSequence = str3;
        if (list3.isEmpty()) {
        }
        if (charSequence instanceof Spannable) {
        }
        pwhVar2 = dfjVar2.a;
        g8eVar = dfjVar2.b;
        if (Intrinsics.c(pwhVar2.m, v8j.c)) {
        }
        tjeVar = dfjVar2.c;
        if ((tjeVar != null || (ajeVar = tjeVar.b) == null) ? false : ajeVar.a) {
        }
        r7b r7bVar22 = g8eVar.f;
        if (r7bVar22 == null) {
        }
        P = jca.P(g8eVar.c, textSize, kx4Var2);
        if (!Float.isNaN(P)) {
        }
        i4 = 0;
        bdjVar = g8eVar.d;
        if (bdjVar == null) {
        }
        arrayList = new ArrayList(list3.size());
        size2 = list3.size();
        while (i5 < size2) {
        }
        pwh pwhVar6222 = dfjVar2.a;
        tf8 tf8Var2222 = pwhVar6222.f;
        if (tf8Var2222 != null) {
        }
        yya yyaVar222 = new yya(28, spannableString, jw5Var22);
        if (arrayList.size() <= 1) {
        }
        size3 = list3.size();
        i7 = 0;
        z4 = false;
        while (i7 < size3) {
        }
        List list7222 = list3;
        Spannable spannable2222 = spannableString;
        g8e g8eVar5222 = g8eVar2;
        if (z4) {
        }
        List list9222 = list7222;
        List list10222 = list4;
        bdjVar2 = g8eVar5222.d;
        if (bdjVar2 != null) {
        }
        size4 = list9222.size();
        while (i8 < size4) {
        }
        size5 = list10222.size();
        i9 = 0;
        while (i9 < size5) {
        }
        charSequence = spannable2222;
        this.h = charSequence;
        this.i = new lma(charSequence, this.g, this.l);
    }

    @Override // defpackage.e8e
    public final boolean a() {
        sx2 sx2Var = this.j;
        if (sx2Var != null ? sx2Var.H() : false) {
            return true;
        }
        if (!this.k && yso.C(this.b)) {
            sz8 sz8Var = hl5.a;
            sz8 sz8Var2 = hl5.a;
            cdi cdiVar = (cdi) sz8Var2.b;
            if (cdiVar == null) {
                if (cl5.d()) {
                    cdiVar = sz8Var2.u();
                    sz8Var2.b = cdiVar;
                } else {
                    cdiVar = iz8.h;
                }
            }
            if (((Boolean) cdiVar.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.e8e
    public final float c() {
        return this.i.c();
    }

    @Override // defpackage.e8e
    public final float d() {
        lma lmaVar = this.i;
        float f = lmaVar.e;
        TextPaint textPaint = lmaVar.b;
        if (!Float.isNaN(f)) {
            return lmaVar.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = lmaVar.a;
        lineInstance.setText(new pp2(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, qx9.d);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new IntRange(i, next, 1));
            } else {
                IntRange intRange = (IntRange) priorityQueue.peek();
                if (intRange != null && intRange.b - intRange.a < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new IntRange(i, next, 1));
                }
            }
            i = next;
        }
        boolean isEmpty = priorityQueue.isEmpty();
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (!isEmpty) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                yhk.d();
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            IntRange intRange2 = (IntRange) it.next();
            f2 = Layout.getDesiredWidth(lmaVar.b(), intRange2.a, intRange2.b, textPaint);
            while (it.hasNext()) {
                IntRange intRange3 = (IntRange) it.next();
                f2 = Math.max(f2, Layout.getDesiredWidth(lmaVar.b(), intRange3.a, intRange3.b, textPaint));
            }
        }
        lmaVar.e = f2;
        return f2;
    }
}
