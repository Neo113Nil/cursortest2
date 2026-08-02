package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h2k {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final m2k f;
    public final String[] g;
    public final String h;
    public final String i;
    public final h2k j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public h2k(String str, String str2, long j, long j2, m2k m2kVar, String[] strArr, String str3, String str4, h2k h2kVar) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = m2kVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        str3.getClass();
        this.h = str3;
        this.j = h2kVar;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static h2k a(String str) {
        return new h2k(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), C.TIME_UNSET, C.TIME_UNSET, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            k74 k74Var = new k74();
            k74Var.a = new SpannableStringBuilder();
            k74Var.b = null;
            treeMap.put(str, k74Var);
        }
        CharSequence charSequence = ((k74) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final h2k b(int i) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (h2k) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z) {
        String str = this.a;
        boolean equals = TtmlNode.TAG_P.equals(str);
        boolean equals2 = TtmlNode.TAG_DIV.equals(str);
        if (z || equals || (equals2 && this.i != null)) {
            long j = this.d;
            if (j != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            ((h2k) this.m.get(i)).d(treeSet, z || equals);
        }
    }

    public final boolean f(long j) {
        long j2 = this.d;
        long j3 = this.e;
        if (j2 == C.TIME_UNSET && j3 == C.TIME_UNSET) {
            return true;
        }
        if (j2 <= j && j3 == C.TIME_UNSET) {
            return true;
        }
        if (j2 != C.TIME_UNSET || j >= j3) {
            return j2 <= j && j < j3;
        }
        return true;
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j) && TtmlNode.TAG_DIV.equals(this.a) && (str2 = this.i) != null) {
            dmi.x(arrayList, str, str2);
            return;
        }
        for (int i = 0; i < c(); i++) {
            b(i).g(j, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(long j, Map map, HashMap hashMap, String str, TreeMap treeMap) {
        Iterator it;
        int i;
        h2k h2kVar;
        int i2;
        m2k I;
        int i3;
        float f;
        int i4;
        int i5;
        int i6;
        Map map2 = map;
        if (f(j)) {
            String str2 = this.h;
            String str3 = "".equals(str2) ? str : str2;
            Iterator it2 = this.l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap hashMap2 = this.k;
                int intValue = hashMap2.containsKey(str4) ? ((Integer) hashMap2.get(str4)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    k74 k74Var = (k74) treeMap.get(str4);
                    k74Var.getClass();
                    k2k k2kVar = (k2k) hashMap.get(str3);
                    k2kVar.getClass();
                    int i7 = k2kVar.j;
                    m2k I2 = vha.I(this.f, this.g, map2);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) k74Var.a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        k74Var.a = spannableStringBuilder;
                        k74Var.b = null;
                    }
                    if (I2 != null) {
                        int i8 = I2.h;
                        int i9 = 1;
                        if (((i8 == -1 && I2.i == -1) ? -1 : (i8 == 1 ? (char) 1 : (char) 0) | (I2.i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i10 = I2.h;
                            if (i10 == -1) {
                                if (I2.i == -1) {
                                    i6 = -1;
                                    i9 = 1;
                                    StyleSpan styleSpan = new StyleSpan(i6);
                                    i = 33;
                                    spannableStringBuilder.setSpan(styleSpan, intValue, intValue2, 33);
                                } else {
                                    i9 = 1;
                                }
                            }
                            i6 = (i10 == i9 ? i9 : 0) | (I2.i == i9 ? 2 : 0);
                            StyleSpan styleSpan2 = new StyleSpan(i6);
                            i = 33;
                            spannableStringBuilder.setSpan(styleSpan2, intValue, intValue2, 33);
                        } else {
                            i = 33;
                        }
                        if (I2.f == i9) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, i);
                        }
                        if (I2.g == i9) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, i);
                        }
                        if (I2.c) {
                            if (!I2.c) {
                                a70.r("Font color has not been defined.");
                                return;
                            }
                            wba.n(spannableStringBuilder, new ForegroundColorSpan(I2.b), intValue, intValue2);
                        }
                        if (I2.e) {
                            if (!I2.e) {
                                a70.r("Background color has not been defined.");
                                return;
                            }
                            wba.n(spannableStringBuilder, new BackgroundColorSpan(I2.d), intValue, intValue2);
                        }
                        if (I2.a != null) {
                            wba.n(spannableStringBuilder, new TypefaceSpan(I2.a), intValue, intValue2);
                        }
                        h9j h9jVar = I2.r;
                        if (h9jVar != null) {
                            int i11 = h9jVar.a;
                            if (i11 == -1) {
                                i11 = (i7 == 2 || i7 == 1) ? 3 : 1;
                                i5 = 1;
                            } else {
                                i5 = h9jVar.b;
                            }
                            int i12 = h9jVar.c;
                            if (i12 == -2) {
                                i12 = 1;
                            }
                            wba.n(spannableStringBuilder, new j9j(i11, i5, i12), intValue, intValue2);
                        }
                        int i13 = I2.m;
                        if (i13 == 2) {
                            h2k h2kVar2 = this.j;
                            while (true) {
                                if (h2kVar2 == null) {
                                    h2kVar2 = null;
                                    break;
                                }
                                m2k I3 = vha.I(h2kVar2.f, h2kVar2.g, map2);
                                if (I3 != null && I3.m == 1) {
                                    break;
                                } else {
                                    h2kVar2 = h2kVar2.j;
                                }
                            }
                            if (h2kVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(h2kVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        h2kVar = null;
                                        break;
                                    }
                                    h2k h2kVar3 = (h2k) arrayDeque.pop();
                                    m2k I4 = vha.I(h2kVar3.f, h2kVar3.g, map2);
                                    if (I4 != null && I4.m == 3) {
                                        h2kVar = h2kVar3;
                                        break;
                                    }
                                    for (int c = h2kVar3.c() - 1; c >= 0; c--) {
                                        arrayDeque.push(h2kVar3.b(c));
                                    }
                                }
                                if (h2kVar != null) {
                                    if (h2kVar.c() == 1) {
                                        i2 = 0;
                                        if (h2kVar.b(0).b != null) {
                                            String str5 = h2kVar.b(0).b;
                                            String str6 = nik.a;
                                            m2k I5 = vha.I(h2kVar.f, h2kVar.g, map2);
                                            int i14 = I5 != null ? I5.n : -1;
                                            if (i14 == -1 && (I = vha.I(h2kVar2.f, h2kVar2.g, map2)) != null) {
                                                i14 = I.n;
                                            }
                                            spannableStringBuilder.setSpan(new i9g(str5, i14), intValue, intValue2, 33);
                                            if (I2.q == 1) {
                                                wba.n(spannableStringBuilder, new lf9(), intValue, intValue2);
                                            }
                                            i3 = I2.j;
                                            float f2 = 100.0f;
                                            if (i3 == 1) {
                                                it = it2;
                                                f = 100.0f;
                                                wba.n(spannableStringBuilder, new AbsoluteSizeSpan((int) I2.k, true), intValue, intValue2);
                                            } else if (i3 == 2) {
                                                it = it2;
                                                f = 100.0f;
                                                wba.n(spannableStringBuilder, new RelativeSizeSpan(I2.k), intValue, intValue2);
                                            } else if (i3 != 3) {
                                                it = it2;
                                                f = 100.0f;
                                            } else {
                                                float f3 = I2.k / 100.0f;
                                                RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(intValue, intValue2, RelativeSizeSpan.class);
                                                int length = relativeSizeSpanArr.length;
                                                int i15 = i2;
                                                float f4 = f3;
                                                int i16 = i15;
                                                while (i16 < length) {
                                                    float f5 = f2;
                                                    RelativeSizeSpan relativeSizeSpan = relativeSizeSpanArr[i16];
                                                    Iterator it3 = it2;
                                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= intValue2) {
                                                        f4 = relativeSizeSpan.getSizeChange() * f4;
                                                    }
                                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) == intValue2) {
                                                        i4 = i16;
                                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                                        }
                                                    } else {
                                                        i4 = i16;
                                                    }
                                                    i16 = i4 + 1;
                                                    f2 = f5;
                                                    it2 = it3;
                                                }
                                                it = it2;
                                                f = f2;
                                                spannableStringBuilder.setSpan(new RelativeSizeSpan(f4), intValue, intValue2, 33);
                                            }
                                            if (TtmlNode.TAG_P.equals(this.a)) {
                                                float f6 = I2.s;
                                                if (f6 != Float.MAX_VALUE) {
                                                    k74Var.q = (f6 * (-90.0f)) / f;
                                                }
                                                Layout.Alignment alignment = I2.o;
                                                if (alignment != null) {
                                                    k74Var.c = alignment;
                                                }
                                                Layout.Alignment alignment2 = I2.p;
                                                if (alignment2 != null) {
                                                    k74Var.d = alignment2;
                                                }
                                            }
                                            it2 = it;
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    tgj.O("Skipping rubyText node without exactly one text child.");
                                    if (I2.q == 1) {
                                    }
                                    i3 = I2.j;
                                    float f22 = 100.0f;
                                    if (i3 == 1) {
                                    }
                                    if (TtmlNode.TAG_P.equals(this.a)) {
                                    }
                                    it2 = it;
                                }
                            }
                        } else if (i13 == 3 || i13 == 4) {
                            spannableStringBuilder.setSpan(new cx4(), intValue, intValue2, 33);
                        }
                        i2 = 0;
                        if (I2.q == 1) {
                        }
                        i3 = I2.j;
                        float f222 = 100.0f;
                        if (i3 == 1) {
                        }
                        if (TtmlNode.TAG_P.equals(this.a)) {
                        }
                        it2 = it;
                    }
                }
                it = it2;
                it2 = it;
            }
            int i17 = 0;
            while (i17 < c()) {
                b(i17).h(j, map2, hashMap, str3, treeMap);
                i17++;
                map2 = map;
            }
        }
    }

    public final void i(long j, boolean z, String str, TreeMap treeMap) {
        HashMap hashMap = this.k;
        hashMap.clear();
        HashMap hashMap2 = this.l;
        hashMap2.clear();
        String str2 = this.a;
        if (TtmlNode.TAG_METADATA.equals(str2)) {
            return;
        }
        String str3 = this.h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.c && z) {
            SpannableStringBuilder e = e(str4, treeMap);
            String str5 = this.b;
            str5.getClass();
            e.append((CharSequence) str5);
            return;
        }
        if (TtmlNode.TAG_BR.equals(str2) && z) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((k74) entry.getValue()).a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = TtmlNode.TAG_P.equals(str2);
            for (int i = 0; i < c(); i++) {
                b(i).i(j, z || equals, str4, treeMap);
            }
            if (equals) {
                SpannableStringBuilder e2 = e(str4, treeMap);
                int length = e2.length() - 1;
                while (length >= 0 && e2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && e2.charAt(length) != '\n') {
                    e2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((k74) entry2.getValue()).a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
