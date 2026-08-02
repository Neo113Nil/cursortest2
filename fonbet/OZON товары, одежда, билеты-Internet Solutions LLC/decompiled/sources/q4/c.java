package q4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import l3.C7855a;
import l3.C7858d;
import l3.C7860f;
import l3.C7861g;
import m3.N;
import m3.s;

/* loaded from: classes8.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f81559a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81560b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f81561c;

    /* renamed from: d, reason: collision with root package name */
    public final long f81562d;

    /* renamed from: e, reason: collision with root package name */
    public final long f81563e;

    /* renamed from: f, reason: collision with root package name */
    public final g f81564f;

    /* renamed from: g, reason: collision with root package name */
    private final String[] f81565g;

    /* renamed from: h, reason: collision with root package name */
    public final String f81566h;

    /* renamed from: i, reason: collision with root package name */
    public final String f81567i;

    /* renamed from: j, reason: collision with root package name */
    public final c f81568j;

    /* renamed from: k, reason: collision with root package name */
    private final HashMap<String, Integer> f81569k;

    /* renamed from: l, reason: collision with root package name */
    private final HashMap<String, Integer> f81570l;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList f81571m;

    private c(String str, String str2, long j11, long j12, g gVar, String[] strArr, String str3, String str4, c cVar) {
        this.f81559a = str;
        this.f81560b = str2;
        this.f81567i = str4;
        this.f81564f = gVar;
        this.f81565g = strArr;
        this.f81561c = str2 != null;
        this.f81562d = j11;
        this.f81563e = j12;
        str3.getClass();
        this.f81566h = str3;
        this.f81568j = cVar;
        this.f81569k = new HashMap<>();
        this.f81570l = new HashMap<>();
    }

    public static c b(String str, long j11, long j12, g gVar, String[] strArr, String str2, String str3, c cVar) {
        return new c(str, null, j11, j12, gVar, strArr, str2, str3, cVar);
    }

    public static c c(String str) {
        return new c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private void g(TreeSet<Long> treeSet, boolean z11) {
        String str = this.f81559a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z11 || equals || (equals2 && this.f81567i != null)) {
            long j11 = this.f81562d;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
            long j12 = this.f81563e;
            if (j12 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j12));
            }
        }
        if (this.f81571m == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f81571m.size(); i11++) {
            ((c) this.f81571m.get(i11)).g(treeSet, z11 || equals);
        }
    }

    private static SpannableStringBuilder i(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C7855a.C1210a c1210a = new C7855a.C1210a();
            c1210a.o(new SpannableStringBuilder());
            treeMap.put(str, c1210a);
        }
        CharSequence e11 = ((C7855a.C1210a) treeMap.get(str)).e();
        e11.getClass();
        return (SpannableStringBuilder) e11;
    }

    private void k(long j11, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f81566h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (j(j11) && "div".equals(this.f81559a) && (str2 = this.f81567i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i11 = 0; i11 < e(); i11++) {
            d(i11).k(j11, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ce A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void l(long j11, Map map, HashMap hashMap, String str, TreeMap treeMap) {
        Iterator<Map.Entry<String, Integer>> it;
        int i11;
        c cVar;
        int i12;
        int i13;
        g a11;
        int g10;
        float f7;
        int i14;
        Map map2 = map;
        int i15 = -1;
        if (j(j11)) {
            String str2 = this.f81566h;
            String str3 = "".equals(str2) ? str : str2;
            Iterator<Map.Entry<String, Integer>> it2 = this.f81570l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<String, Integer> next = it2.next();
                String key = next.getKey();
                HashMap<String, Integer> hashMap2 = this.f81569k;
                int intValue = hashMap2.containsKey(key) ? hashMap2.get(key).intValue() : 0;
                int intValue2 = next.getValue().intValue();
                if (intValue != intValue2) {
                    C7855a.C1210a c1210a = (C7855a.C1210a) treeMap.get(key);
                    c1210a.getClass();
                    e eVar = (e) hashMap.get(str3);
                    eVar.getClass();
                    g a12 = f.a(this.f81564f, this.f81565g, map2);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c1210a.e();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        c1210a.o(spannableStringBuilder);
                    }
                    if (a12 != null) {
                        if (a12.n() != i15) {
                            spannableStringBuilder.setSpan(new StyleSpan(a12.n()), intValue, intValue2, 33);
                        }
                        if (a12.t()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, 33);
                        }
                        if (a12.u()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, 33);
                        }
                        if (a12.s()) {
                            Gf.d.a(spannableStringBuilder, new ForegroundColorSpan(a12.d()), intValue, intValue2);
                        }
                        if (a12.r()) {
                            Gf.d.a(spannableStringBuilder, new BackgroundColorSpan(a12.b()), intValue, intValue2);
                        }
                        if (a12.e() != null) {
                            Gf.d.a(spannableStringBuilder, new TypefaceSpan(a12.e()), intValue, intValue2);
                        }
                        if (a12.q() != null) {
                            b q11 = a12.q();
                            q11.getClass();
                            int i16 = q11.f81556a;
                            if (i16 == i15) {
                                int i17 = eVar.f81595j;
                                i16 = (i17 == 2 || i17 == 1) ? 3 : 1;
                                i14 = 1;
                            } else {
                                i14 = q11.f81557b;
                            }
                            i11 = i15;
                            int i18 = q11.f81558c;
                            if (i18 == -2) {
                                i18 = 1;
                            }
                            Gf.d.a(spannableStringBuilder, new C7861g(i16, i14, i18), intValue, intValue2);
                        } else {
                            i11 = i15;
                        }
                        int l11 = a12.l();
                        if (l11 == 2) {
                            c cVar2 = this.f81568j;
                            while (true) {
                                if (cVar2 == null) {
                                    cVar2 = null;
                                    break;
                                }
                                g a13 = f.a(cVar2.f81564f, cVar2.f81565g, map2);
                                if (a13 != null && a13.l() == 1) {
                                    break;
                                } else {
                                    cVar2 = cVar2.f81568j;
                                }
                            }
                            if (cVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(cVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        cVar = null;
                                        break;
                                    }
                                    c cVar3 = (c) arrayDeque.pop();
                                    g a14 = f.a(cVar3.f81564f, cVar3.f81565g, map2);
                                    if (a14 != null && a14.l() == 3) {
                                        cVar = cVar3;
                                        break;
                                    }
                                    for (int e11 = cVar3.e() - 1; e11 >= 0; e11--) {
                                        arrayDeque.push(cVar3.d(e11));
                                    }
                                }
                                if (cVar != null) {
                                    if (cVar.e() != 1 || cVar.d(0).f81560b == null) {
                                        s.e("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str4 = cVar.d(0).f81560b;
                                        int i19 = N.f74289a;
                                        g a15 = f.a(cVar.f81564f, cVar.f81565g, map2);
                                        if (a15 != null) {
                                            i12 = a15.k();
                                            i13 = i11;
                                        } else {
                                            i12 = i11;
                                            i13 = i12;
                                        }
                                        if (i12 == i13 && (a11 = f.a(cVar2.f81564f, cVar2.f81565g, map2)) != null) {
                                            i12 = a11.k();
                                        }
                                        spannableStringBuilder.setSpan(new C7860f(str4, i12), intValue, intValue2, 33);
                                    }
                                    if (a12.p()) {
                                        Gf.d.a(spannableStringBuilder, new C7858d(), intValue, intValue2);
                                    }
                                    g10 = a12.g();
                                    if (g10 != 1) {
                                        it = it2;
                                        f7 = 100.0f;
                                        Gf.d.a(spannableStringBuilder, new AbsoluteSizeSpan((int) a12.f(), true), intValue, intValue2);
                                    } else if (g10 == 2) {
                                        it = it2;
                                        f7 = 100.0f;
                                        Gf.d.a(spannableStringBuilder, new RelativeSizeSpan(a12.f()), intValue, intValue2);
                                    } else if (g10 != 3) {
                                        it = it2;
                                        f7 = 100.0f;
                                    } else {
                                        float f11 = a12.f() / 100.0f;
                                        RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(intValue, intValue2, RelativeSizeSpan.class);
                                        int length = relativeSizeSpanArr.length;
                                        f7 = 100.0f;
                                        int i21 = 0;
                                        while (i21 < length) {
                                            RelativeSizeSpan relativeSizeSpan = relativeSizeSpanArr[i21];
                                            Iterator<Map.Entry<String, Integer>> it3 = it2;
                                            if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= intValue2) {
                                                f11 = relativeSizeSpan.getSizeChange() * f11;
                                            }
                                            if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) == intValue2) {
                                                if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                                    spannableStringBuilder.removeSpan(relativeSizeSpan);
                                                }
                                            }
                                            i21++;
                                            it2 = it3;
                                        }
                                        it = it2;
                                        spannableStringBuilder.setSpan(new RelativeSizeSpan(f11), intValue, intValue2, 33);
                                    }
                                    if ("p".equals(this.f81559a)) {
                                        if (a12.m() != Float.MAX_VALUE) {
                                            c1210a.m((a12.m() * (-90.0f)) / f7);
                                        }
                                        if (a12.o() != null) {
                                            c1210a.p(a12.o());
                                        }
                                        if (a12.i() != null) {
                                            c1210a.j(a12.i());
                                        }
                                    }
                                    map2 = map;
                                    it2 = it;
                                    i15 = -1;
                                }
                            }
                        } else if (l11 == 3 || l11 == 4) {
                            spannableStringBuilder.setSpan(new C8983a(), intValue, intValue2, 33);
                        }
                        if (a12.p()) {
                        }
                        g10 = a12.g();
                        if (g10 != 1) {
                        }
                        if ("p".equals(this.f81559a)) {
                        }
                        map2 = map;
                        it2 = it;
                        i15 = -1;
                    }
                }
                it = it2;
                map2 = map;
                it2 = it;
                i15 = -1;
            }
            for (int i22 = 0; i22 < e(); i22++) {
                d(i22).l(j11, map, hashMap, str3, treeMap);
            }
        }
    }

    private void m(long j11, boolean z11, String str, TreeMap treeMap) {
        boolean z12;
        TreeMap treeMap2;
        long j12;
        HashMap<String, Integer> hashMap = this.f81569k;
        hashMap.clear();
        HashMap<String, Integer> hashMap2 = this.f81570l;
        hashMap2.clear();
        String str2 = this.f81559a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f81566h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f81561c && z11) {
            SpannableStringBuilder i11 = i(str4, treeMap);
            String str5 = this.f81560b;
            str5.getClass();
            i11.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z11) {
            i(str4, treeMap).append('\n');
            return;
        }
        if (j(j11)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence e11 = ((C7855a.C1210a) entry.getValue()).e();
                e11.getClass();
                hashMap.put(str6, Integer.valueOf(e11.length()));
            }
            boolean equals = "p".equals(str2);
            for (int i12 = 0; i12 < e(); i12++) {
                c d11 = d(i12);
                if (z11 || equals) {
                    z12 = true;
                    treeMap2 = treeMap;
                    j12 = j11;
                } else {
                    z12 = false;
                    j12 = j11;
                    treeMap2 = treeMap;
                }
                d11.m(j12, z12, str4, treeMap2);
            }
            if (equals) {
                SpannableStringBuilder i13 = i(str4, treeMap);
                int length = i13.length() - 1;
                while (length >= 0 && i13.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && i13.charAt(length) != '\n') {
                    i13.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence e12 = ((C7855a.C1210a) entry2.getValue()).e();
                e12.getClass();
                hashMap2.put(str7, Integer.valueOf(e12.length()));
            }
        }
    }

    public final void a(c cVar) {
        if (this.f81571m == null) {
            this.f81571m = new ArrayList();
        }
        this.f81571m.add(cVar);
    }

    public final c d(int i11) {
        ArrayList arrayList = this.f81571m;
        if (arrayList != null) {
            return (c) arrayList.get(i11);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int e() {
        ArrayList arrayList = this.f81571m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final ArrayList f(long j11, Map map, HashMap hashMap, HashMap hashMap2) {
        ArrayList arrayList = new ArrayList();
        k(j11, this.f81566h, arrayList);
        TreeMap treeMap = new TreeMap();
        m(j11, false, this.f81566h, treeMap);
        l(j11, map, hashMap, this.f81566h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                e eVar = (e) hashMap.get(pair.first);
                eVar.getClass();
                C7855a.C1210a c1210a = new C7855a.C1210a();
                c1210a.f(decodeByteArray);
                c1210a.k(eVar.f81587b);
                c1210a.l(0);
                c1210a.h(eVar.f81588c, 0);
                c1210a.i(eVar.f81590e);
                c1210a.n(eVar.f81591f);
                c1210a.g(eVar.f81592g);
                c1210a.r(eVar.f81595j);
                arrayList2.add(c1210a.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) hashMap.get(entry.getKey());
            eVar2.getClass();
            C7855a.C1210a c1210a2 = (C7855a.C1210a) entry.getValue();
            CharSequence e11 = c1210a2.e();
            e11.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) e11;
            for (C8983a c8983a : (C8983a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C8983a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c8983a), spannableStringBuilder.getSpanEnd(c8983a), (CharSequence) "");
            }
            for (int i11 = 0; i11 < spannableStringBuilder.length(); i11++) {
                if (spannableStringBuilder.charAt(i11) == ' ') {
                    int i12 = i11 + 1;
                    int i13 = i12;
                    while (i13 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i13) == ' ') {
                        i13++;
                    }
                    int i14 = i13 - i12;
                    if (i14 > 0) {
                        spannableStringBuilder.delete(i11, i14 + i11);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i15 = 0; i15 < spannableStringBuilder.length() - 1; i15++) {
                if (spannableStringBuilder.charAt(i15) == '\n') {
                    int i16 = i15 + 1;
                    if (spannableStringBuilder.charAt(i16) == ' ') {
                        spannableStringBuilder.delete(i16, i15 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i17 = 0; i17 < spannableStringBuilder.length() - 1; i17++) {
                if (spannableStringBuilder.charAt(i17) == ' ') {
                    int i18 = i17 + 1;
                    if (spannableStringBuilder.charAt(i18) == '\n') {
                        spannableStringBuilder.delete(i17, i18);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c1210a2.h(eVar2.f81588c, eVar2.f81589d);
            c1210a2.i(eVar2.f81590e);
            c1210a2.k(eVar2.f81587b);
            c1210a2.n(eVar2.f81591f);
            c1210a2.q(eVar2.f81594i, eVar2.f81593h);
            c1210a2.r(eVar2.f81595j);
            arrayList2.add(c1210a2.a());
        }
        return arrayList2;
    }

    public final long[] h() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i11 = 0;
        g(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i11] = it.next().longValue();
            i11++;
        }
        return jArr;
    }

    public final boolean j(long j11) {
        long j12 = this.f81562d;
        long j13 = this.f81563e;
        if (j12 == -9223372036854775807L && j13 == -9223372036854775807L) {
            return true;
        }
        if (j12 <= j11 && j13 == -9223372036854775807L) {
            return true;
        }
        if (j12 != -9223372036854775807L || j11 >= j13) {
            return j12 <= j11 && j11 < j13;
        }
        return true;
    }
}
