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
import com.google.android.gms.internal.ads.zzcx;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzde;
import com.google.android.gms.internal.ads.zzdf;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzfm;
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
public final class gin {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final nin f;
    public final String[] g;
    public final String h;
    public final String i;
    public final gin j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public gin(String str, String str2, long j, long j2, nin ninVar, String[] strArr, String str3, String str4, gin ginVar) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = ninVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        str3.getClass();
        this.h = str3;
        this.j = ginVar;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static gin a(String str) {
        return new gin(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), C.TIME_UNSET, C.TIME_UNSET, null, null, "", null, null);
    }

    public static gin b(String str, long j, long j2, nin ninVar, String[] strArr, String str2, String str3, gin ginVar) {
        return new gin(str, null, j, j2, ninVar, strArr, str2, str3, ginVar);
    }

    public static SpannableStringBuilder i(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            zzcx zzcxVar = new zzcx();
            zzcxVar.a(new SpannableStringBuilder());
            treeMap.put(str, zzcxVar);
        }
        CharSequence charSequence = ((zzcx) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final boolean c(long j) {
        long j2 = this.d;
        long j3 = this.e;
        if (j2 == C.TIME_UNSET) {
            if (j3 == C.TIME_UNSET) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        if (j2 <= j && j3 == C.TIME_UNSET) {
            return true;
        }
        if (j2 != C.TIME_UNSET || j >= j3) {
            return j2 <= j && j < j3;
        }
        return true;
    }

    public final gin d(int i) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (gin) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int e() {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void f(TreeSet treeSet, boolean z) {
        String str = this.a;
        boolean equals = TtmlNode.TAG_P.equals(str);
        if (z || equals || (TtmlNode.TAG_DIV.equals(str) && this.i != null)) {
            long j = this.d;
            if (j != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m != null) {
            for (int i = 0; i < this.m.size(); i++) {
                gin ginVar = (gin) this.m.get(i);
                boolean z2 = true;
                if (!z && !equals) {
                    z2 = false;
                }
                ginVar.f(treeSet, z2);
            }
        }
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.h;
        boolean equals = "".equals(str3);
        boolean c = c(j);
        if (true != equals) {
            str = str3;
        }
        if (c && TtmlNode.TAG_DIV.equals(this.a) && (str2 = this.i) != null) {
            dmi.x(arrayList, str, str2);
            return;
        }
        for (int i = 0; i < e(); i++) {
            d(i).g(j, str, arrayList);
        }
    }

    public final void h(long j, boolean z, String str, TreeMap treeMap) {
        long j2;
        boolean z2;
        HashMap hashMap = this.k;
        hashMap.clear();
        HashMap hashMap2 = this.l;
        hashMap2.clear();
        String str2 = this.a;
        if (TtmlNode.TAG_METADATA.equals(str2)) {
            return;
        }
        String str3 = this.h;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.c && z) {
            SpannableStringBuilder i = i(str4, treeMap);
            String str5 = this.b;
            str5.getClass();
            i.append((CharSequence) str5);
            return;
        }
        if (TtmlNode.TAG_BR.equals(str2) && z) {
            i(str4, treeMap).append('\n');
            return;
        }
        if (c(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((zzcx) entry.getValue()).a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = TtmlNode.TAG_P.equals(str2);
            for (int i2 = 0; i2 < e(); i2++) {
                gin d = d(i2);
                if (z || equals) {
                    j2 = j;
                    z2 = true;
                } else {
                    j2 = j;
                    z2 = false;
                }
                d.h(j2, z2, str4, treeMap);
            }
            if (equals) {
                SpannableStringBuilder i3 = i(str4, treeMap);
                int length = i3.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (i3.charAt(length) == ' ');
                if (length >= 0 && i3.charAt(length) != '\n') {
                    i3.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((zzcx) entry2.getValue()).a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(long j, Map map, HashMap hashMap, String str, TreeMap treeMap) {
        int i;
        int i2;
        gin ginVar;
        int i3;
        int i4;
        int i5;
        nin J;
        int i6;
        Iterator it;
        float f;
        int i7;
        float f2;
        int i8;
        int i9;
        Map map2 = map;
        if (c(j)) {
            String str2 = this.h;
            int i10 = 1;
            String str3 = true != "".equals(str2) ? str2 : str;
            Iterator it2 = this.l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap hashMap2 = this.k;
                int intValue = hashMap2.containsKey(str4) ? ((Integer) hashMap2.get(str4)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    zzcx zzcxVar = (zzcx) treeMap.get(str4);
                    zzcxVar.getClass();
                    min minVar = (min) hashMap.get(str3);
                    minVar.getClass();
                    int i11 = minVar.j;
                    nin J2 = v7a.J(this.f, this.g, map2);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzcxVar.a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzcxVar.a(spannableStringBuilder);
                    }
                    if (J2 == null) {
                        continue;
                    } else {
                        int i12 = J2.h;
                        if (((i12 == -1 && J2.i == -1) ? -1 : (i12 == i10 ? i10 : 0) | (J2.i == i10 ? 2 : 0)) != -1) {
                            int i13 = J2.h;
                            if (i13 == -1) {
                                if (J2.i == -1) {
                                    i9 = -1;
                                    i10 = 1;
                                    StyleSpan styleSpan = new StyleSpan(i9);
                                    i = 33;
                                    spannableStringBuilder.setSpan(styleSpan, intValue, intValue2, 33);
                                } else {
                                    i10 = 1;
                                }
                            }
                            i9 = (i13 == i10 ? i10 : 0) | (J2.i == i10 ? 2 : 0);
                            StyleSpan styleSpan2 = new StyleSpan(i9);
                            i = 33;
                            spannableStringBuilder.setSpan(styleSpan2, intValue, intValue2, 33);
                        } else {
                            i = 33;
                        }
                        if (J2.f == i10) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, i);
                        }
                        if (J2.g == i10) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, i);
                        }
                        if (J2.c) {
                            if (!J2.c) {
                                a70.r("Font color has not been defined.");
                                return;
                            }
                            zzde.a(spannableStringBuilder, new ForegroundColorSpan(J2.b), intValue, intValue2);
                        }
                        if (J2.e) {
                            if (!J2.e) {
                                a70.r("Background color has not been defined.");
                                return;
                            }
                            zzde.a(spannableStringBuilder, new BackgroundColorSpan(J2.d), intValue, intValue2);
                        }
                        if (J2.a != null) {
                            zzde.a(spannableStringBuilder, new TypefaceSpan(J2.a), intValue, intValue2);
                        }
                        fin finVar = J2.r;
                        if (finVar != null) {
                            int i14 = finVar.a;
                            if (i14 == -1) {
                                i2 = -1;
                                i14 = (i11 == 2 || i11 == 1) ? 3 : 1;
                                i8 = 1;
                            } else {
                                i2 = -1;
                                i8 = finVar.b;
                            }
                            int i15 = finVar.c;
                            if (i15 == -2) {
                                i15 = 1;
                            }
                            zzde.a(spannableStringBuilder, new zzdf(i14, i8, i15), intValue, intValue2);
                        } else {
                            i2 = -1;
                        }
                        int i16 = J2.m;
                        if (i16 == 2) {
                            gin ginVar2 = this.j;
                            while (true) {
                                if (ginVar2 == null) {
                                    ginVar2 = null;
                                    break;
                                }
                                nin J3 = v7a.J(ginVar2.f, ginVar2.g, map2);
                                if (J3 != null && J3.m == 1) {
                                    break;
                                } else {
                                    ginVar2 = ginVar2.j;
                                }
                            }
                            if (ginVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(ginVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        ginVar = null;
                                        break;
                                    }
                                    gin ginVar3 = (gin) arrayDeque.pop();
                                    nin J4 = v7a.J(ginVar3.f, ginVar3.g, map2);
                                    if (J4 != null && J4.m == 3) {
                                        ginVar = ginVar3;
                                        break;
                                    }
                                    for (int e = ginVar3.e() - 1; e >= 0; e--) {
                                        arrayDeque.push(ginVar3.d(e));
                                    }
                                }
                                if (ginVar != null) {
                                    if (ginVar.e() == 1) {
                                        i3 = 0;
                                        if (ginVar.d(0).b != null) {
                                            String str5 = ginVar.d(0).b;
                                            String str6 = zzfm.a;
                                            nin J5 = v7a.J(ginVar.f, ginVar.g, map2);
                                            if (J5 != null) {
                                                i4 = J5.n;
                                                i5 = i2;
                                            } else {
                                                i4 = i2;
                                                i5 = i4;
                                            }
                                            if (i4 == i5 && (J = v7a.J(ginVar2.f, ginVar2.g, map2)) != null) {
                                                i4 = J.n;
                                            }
                                            spannableStringBuilder.setSpan(new zzdd(str5, i4), intValue, intValue2, 33);
                                            if (J2.q == 1) {
                                                zzde.a(spannableStringBuilder, new zzdc(), intValue, intValue2);
                                            }
                                            i6 = J2.j;
                                            float f3 = 100.0f;
                                            if (i6 != 1) {
                                                if (i6 == 2) {
                                                    it = it2;
                                                    f = 100.0f;
                                                    zzde.a(spannableStringBuilder, new RelativeSizeSpan(J2.k), intValue, intValue2);
                                                } else if (i6 != 3) {
                                                    it = it2;
                                                    f = 100.0f;
                                                } else {
                                                    float f4 = J2.k / 100.0f;
                                                    RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(intValue, intValue2, RelativeSizeSpan.class);
                                                    int length = relativeSizeSpanArr.length;
                                                    while (i3 < length) {
                                                        float f5 = f3;
                                                        RelativeSizeSpan relativeSizeSpan = relativeSizeSpanArr[i3];
                                                        Iterator it3 = it2;
                                                        if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= intValue2) {
                                                            f4 = relativeSizeSpan.getSizeChange() * f4;
                                                        }
                                                        if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) == intValue2) {
                                                            f2 = f4;
                                                            if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                                                spannableStringBuilder.removeSpan(relativeSizeSpan);
                                                            }
                                                        } else {
                                                            f2 = f4;
                                                        }
                                                        i3++;
                                                        f3 = f5;
                                                        it2 = it3;
                                                        f4 = f2;
                                                    }
                                                    it = it2;
                                                    f = f3;
                                                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f4), intValue, intValue2, 33);
                                                }
                                                i7 = 1;
                                            } else {
                                                it = it2;
                                                f = 100.0f;
                                                i7 = 1;
                                                zzde.a(spannableStringBuilder, new AbsoluteSizeSpan((int) J2.k, true), intValue, intValue2);
                                            }
                                            if (TtmlNode.TAG_P.equals(this.a)) {
                                                float f6 = J2.s;
                                                if (f6 != Float.MAX_VALUE) {
                                                    zzcxVar.o = (f6 * (-90.0f)) / f;
                                                }
                                                Layout.Alignment alignment = J2.o;
                                                if (alignment != null) {
                                                    zzcxVar.c = alignment;
                                                }
                                                Layout.Alignment alignment2 = J2.p;
                                                if (alignment2 != null) {
                                                    zzcxVar.d = alignment2;
                                                }
                                            }
                                            i10 = i7;
                                            it2 = it;
                                        }
                                    } else {
                                        i3 = 0;
                                    }
                                    zzeh.b("Skipping rubyText node without exactly one text child.");
                                    if (J2.q == 1) {
                                    }
                                    i6 = J2.j;
                                    float f32 = 100.0f;
                                    if (i6 != 1) {
                                    }
                                    if (TtmlNode.TAG_P.equals(this.a)) {
                                    }
                                    i10 = i7;
                                    it2 = it;
                                }
                            }
                        } else if (i16 == 3 || i16 == 4) {
                            spannableStringBuilder.setSpan(new ein(), intValue, intValue2, 33);
                        }
                        i3 = 0;
                        if (J2.q == 1) {
                        }
                        i6 = J2.j;
                        float f322 = 100.0f;
                        if (i6 != 1) {
                        }
                        if (TtmlNode.TAG_P.equals(this.a)) {
                        }
                        i10 = i7;
                        it2 = it;
                    }
                }
            }
            int i17 = 0;
            while (i17 < e()) {
                d(i17).j(j, map2, hashMap, str3, treeMap);
                i17++;
                map2 = map;
            }
        }
    }
}
