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
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g2k {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final l2k f;
    public final String[] g;
    public final String h;
    public final String i;
    public final g2k j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public g2k(String str, String str2, long j, long j2, l2k l2kVar, String[] strArr, String str3, String str4, g2k g2kVar) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = l2kVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        str3.getClass();
        this.h = str3;
        this.j = g2kVar;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static g2k a(String str) {
        return new g2k(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), C.TIME_UNSET, C.TIME_UNSET, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            j74 j74Var = new j74();
            j74Var.a = new SpannableStringBuilder();
            treeMap.put(str, j74Var);
        }
        CharSequence charSequence = ((j74) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final g2k b(int i) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (g2k) arrayList.get(i);
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
            ((g2k) this.m.get(i)).d(treeSet, z || equals);
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

    public final void h(long j, Map map, HashMap hashMap, String str, TreeMap treeMap) {
        int i;
        g2k g2kVar;
        l2k O;
        int i2;
        int i3;
        Map map2 = map;
        if (f(j)) {
            String str2 = this.h;
            String str3 = "".equals(str2) ? str : str2;
            for (Map.Entry entry : this.l.entrySet()) {
                String str4 = (String) entry.getKey();
                HashMap hashMap2 = this.k;
                int intValue = hashMap2.containsKey(str4) ? ((Integer) hashMap2.get(str4)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    j74 j74Var = (j74) treeMap.get(str4);
                    j74Var.getClass();
                    j2k j2kVar = (j2k) hashMap.get(str3);
                    j2kVar.getClass();
                    int i4 = j2kVar.j;
                    l2k O2 = sha.O(this.f, this.g, map2);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) j74Var.a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        j74Var.a = spannableStringBuilder;
                    }
                    if (O2 != null) {
                        int i5 = O2.h;
                        int i6 = 1;
                        if (((i5 == -1 && O2.i == -1) ? -1 : (i5 == 1 ? (char) 1 : (char) 0) | (O2.i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i7 = O2.h;
                            if (i7 == -1) {
                                if (O2.i == -1) {
                                    i3 = -1;
                                    i6 = 1;
                                    StyleSpan styleSpan = new StyleSpan(i3);
                                    i = 33;
                                    spannableStringBuilder.setSpan(styleSpan, intValue, intValue2, 33);
                                } else {
                                    i6 = 1;
                                }
                            }
                            i3 = (i7 == i6 ? i6 : 0) | (O2.i == i6 ? 2 : 0);
                            StyleSpan styleSpan2 = new StyleSpan(i3);
                            i = 33;
                            spannableStringBuilder.setSpan(styleSpan2, intValue, intValue2, 33);
                        } else {
                            i = 33;
                        }
                        if (O2.f == i6) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, i);
                        }
                        if (O2.g == i6) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, i);
                        }
                        if (O2.c) {
                            if (!O2.c) {
                                a70.r("Font color has not been defined.");
                                return;
                            }
                            tba.h(spannableStringBuilder, new ForegroundColorSpan(O2.b), intValue, intValue2);
                        }
                        if (O2.e) {
                            if (!O2.e) {
                                a70.r("Background color has not been defined.");
                                return;
                            }
                            tba.h(spannableStringBuilder, new BackgroundColorSpan(O2.d), intValue, intValue2);
                        }
                        if (O2.a != null) {
                            tba.h(spannableStringBuilder, new TypefaceSpan(O2.a), intValue, intValue2);
                        }
                        g9j g9jVar = O2.r;
                        if (g9jVar != null) {
                            int i8 = g9jVar.a;
                            if (i8 == -1) {
                                i8 = (i4 == 2 || i4 == 1) ? 3 : 1;
                                i2 = 1;
                            } else {
                                i2 = g9jVar.b;
                            }
                            int i9 = g9jVar.c;
                            if (i9 == -2) {
                                i9 = 1;
                            }
                            tba.h(spannableStringBuilder, new i9j(i8, i2, i9), intValue, intValue2);
                        }
                        int i10 = O2.m;
                        if (i10 == 2) {
                            g2k g2kVar2 = this.j;
                            while (true) {
                                if (g2kVar2 == null) {
                                    g2kVar2 = null;
                                    break;
                                }
                                l2k O3 = sha.O(g2kVar2.f, g2kVar2.g, map2);
                                if (O3 != null && O3.m == 1) {
                                    break;
                                } else {
                                    g2kVar2 = g2kVar2.j;
                                }
                            }
                            if (g2kVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(g2kVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        g2kVar = null;
                                        break;
                                    }
                                    g2k g2kVar3 = (g2k) arrayDeque.pop();
                                    l2k O4 = sha.O(g2kVar3.f, g2kVar3.g, map2);
                                    if (O4 != null && O4.m == 3) {
                                        g2kVar = g2kVar3;
                                        break;
                                    }
                                    for (int c = g2kVar3.c() - 1; c >= 0; c--) {
                                        arrayDeque.push(g2kVar3.b(c));
                                    }
                                }
                                if (g2kVar != null) {
                                    if (g2kVar.c() != 1 || g2kVar.b(0).b == null) {
                                        m6k.Q();
                                    } else {
                                        String str5 = g2kVar.b(0).b;
                                        int i11 = lik.a;
                                        l2k O5 = sha.O(g2kVar.f, g2kVar.g, map2);
                                        int i12 = O5 != null ? O5.n : -1;
                                        if (i12 == -1 && (O = sha.O(g2kVar2.f, g2kVar2.g, map2)) != null) {
                                            i12 = O.n;
                                        }
                                        spannableStringBuilder.setSpan(new h9g(str5, i12), intValue, intValue2, 33);
                                    }
                                }
                            }
                        } else if (i10 == 3 || i10 == 4) {
                            spannableStringBuilder.setSpan(new bx4(), intValue, intValue2, 33);
                        }
                        if (O2.q == 1) {
                            tba.h(spannableStringBuilder, new kf9(), intValue, intValue2);
                        }
                        int i13 = O2.j;
                        if (i13 == 1) {
                            tba.h(spannableStringBuilder, new AbsoluteSizeSpan((int) O2.k, true), intValue, intValue2);
                        } else if (i13 == 2) {
                            tba.h(spannableStringBuilder, new RelativeSizeSpan(O2.k), intValue, intValue2);
                        } else if (i13 == 3) {
                            tba.h(spannableStringBuilder, new RelativeSizeSpan(O2.k / 100.0f), intValue, intValue2);
                        }
                        if (TtmlNode.TAG_P.equals(this.a)) {
                            float f = O2.s;
                            if (f != Float.MAX_VALUE) {
                                j74Var.q = (f * (-90.0f)) / 100.0f;
                            }
                            Layout.Alignment alignment = O2.o;
                            if (alignment != null) {
                                j74Var.c = alignment;
                            }
                            Layout.Alignment alignment2 = O2.p;
                            if (alignment2 != null) {
                                j74Var.d = alignment2;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            int i14 = 0;
            while (i14 < c()) {
                b(i14).h(j, map2, hashMap, str3, treeMap);
                i14++;
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
                CharSequence charSequence = ((j74) entry.getValue()).a;
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
                CharSequence charSequence2 = ((j74) entry2.getValue()).a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
