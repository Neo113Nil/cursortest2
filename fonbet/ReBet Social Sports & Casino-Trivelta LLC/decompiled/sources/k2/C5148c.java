package k2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import d1.C3985a;
import e1.AbstractC4134a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: k2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5148c {

    /* renamed from: a, reason: collision with root package name */
    public final String f54140a;

    /* renamed from: b, reason: collision with root package name */
    public final String f54141b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f54142c;

    /* renamed from: d, reason: collision with root package name */
    public final long f54143d;

    /* renamed from: e, reason: collision with root package name */
    public final long f54144e;

    /* renamed from: f, reason: collision with root package name */
    public final g f54145f;

    /* renamed from: g, reason: collision with root package name */
    public final String f54146g;

    /* renamed from: h, reason: collision with root package name */
    public final String f54147h;

    /* renamed from: i, reason: collision with root package name */
    public final C5148c f54148i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f54149j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f54150k;

    /* renamed from: l, reason: collision with root package name */
    public List f54151l;
    private final String[] styleIds;

    public C5148c(String str, String str2, long j10, long j11, g gVar, String[] strArr, String str3, String str4, C5148c c5148c) {
        this.f54140a = str;
        this.f54141b = str2;
        this.f54147h = str4;
        this.f54145f = gVar;
        this.styleIds = strArr;
        this.f54142c = str2 != null;
        this.f54143d = j10;
        this.f54144e = j11;
        this.f54146g = (String) AbstractC4134a.e(str3);
        this.f54148i = c5148c;
        this.f54149j = new HashMap();
        this.f54150k = new HashMap();
    }

    public static C5148c c(String str, long j10, long j11, g gVar, String[] strArr, String str2, String str3, C5148c c5148c) {
        return new C5148c(str, null, j10, j11, gVar, strArr, str2, str3, c5148c);
    }

    public static C5148c d(String str) {
        return new C5148c(null, f.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static void e(SpannableStringBuilder spannableStringBuilder) {
        for (C5146a c5146a : (C5146a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C5146a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c5146a), spannableStringBuilder.getSpanEnd(c5146a), "");
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    public static SpannableStringBuilder k(String str, Map map) {
        if (!map.containsKey(str)) {
            C3985a.b bVar = new C3985a.b();
            bVar.o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) AbstractC4134a.e(((C3985a.b) map.get(str)).e());
    }

    public void a(C5148c c5148c) {
        if (this.f54151l == null) {
            this.f54151l = new ArrayList();
        }
        this.f54151l.add(c5148c);
    }

    public final void b(Map map, C3985a.b bVar, int i10, int i11, int i12) {
        g f10 = f.f(this.f54145f, this.styleIds, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (f10 != null) {
            f.a(spannableStringBuilder2, i10, i11, f10, this.f54148i, map, i12);
            if ("p".equals(this.f54140a)) {
                if (f10.m() != Float.MAX_VALUE) {
                    bVar.m((f10.m() * (-90.0f)) / 100.0f);
                }
                if (f10.o() != null) {
                    bVar.p(f10.o());
                }
                if (f10.i() != null) {
                    bVar.j(f10.i());
                }
            }
        }
    }

    public C5148c f(int i10) {
        List list = this.f54151l;
        if (list != null) {
            return (C5148c) list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List list = this.f54151l;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List h(long j10, Map map, Map map2, Map map3) {
        List<Pair> arrayList = new ArrayList();
        n(j10, this.f54146g, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j10, false, this.f54146g, treeMap);
        o(j10, map, map2, this.f54146g, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                e eVar = (e) AbstractC4134a.e((e) map2.get(pair.first));
                arrayList2.add(new C3985a.b().f(decodeByteArray).k(eVar.f54167b).l(0).h(eVar.f54168c, 0).i(eVar.f54170e).n(eVar.f54171f).g(eVar.f54172g).r(eVar.f54175j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) AbstractC4134a.e((e) map2.get(entry.getKey()));
            C3985a.b bVar = (C3985a.b) entry.getValue();
            e((SpannableStringBuilder) AbstractC4134a.e(bVar.e()));
            bVar.h(eVar2.f54168c, eVar2.f54169d);
            bVar.i(eVar2.f54170e);
            bVar.k(eVar2.f54167b);
            bVar.n(eVar2.f54171f);
            bVar.q(eVar2.f54174i, eVar2.f54173h);
            bVar.r(eVar2.f54175j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    public final void i(TreeSet treeSet, boolean z10) {
        boolean equals = "p".equals(this.f54140a);
        boolean equals2 = "div".equals(this.f54140a);
        if (z10 || equals || (equals2 && this.f54147h != null)) {
            long j10 = this.f54143d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f54144e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f54151l == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f54151l.size(); i10++) {
            ((C5148c) this.f54151l.get(i10)).i(treeSet, z10 || equals);
        }
    }

    public long[] j() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public String[] l() {
        return this.styleIds;
    }

    public boolean m(long j10) {
        long j11 = this.f54143d;
        if (j11 == -9223372036854775807L && this.f54144e == -9223372036854775807L) {
            return true;
        }
        if (j11 <= j10 && this.f54144e == -9223372036854775807L) {
            return true;
        }
        if (j11 != -9223372036854775807L || j10 >= this.f54144e) {
            return j11 <= j10 && j10 < this.f54144e;
        }
        return true;
    }

    public final void n(long j10, String str, List list) {
        if (!"".equals(this.f54146g)) {
            str = this.f54146g;
        }
        if (m(j10) && "div".equals(this.f54140a) && this.f54147h != null) {
            list.add(new Pair(str, this.f54147h));
            return;
        }
        for (int i10 = 0; i10 < g(); i10++) {
            f(i10).n(j10, str, list);
        }
    }

    public final void o(long j10, Map map, Map map2, String str, Map map3) {
        if (m(j10)) {
            String str2 = "".equals(this.f54146g) ? str : this.f54146g;
            Iterator it = this.f54150k.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                int intValue = this.f54149j.containsKey(str3) ? ((Integer) this.f54149j.get(str3)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    b(map, (C3985a.b) AbstractC4134a.e((C3985a.b) map3.get(str3)), intValue, intValue2, ((e) AbstractC4134a.e((e) map2.get(str2))).f54175j);
                }
            }
            for (int i10 = 0; i10 < g(); i10++) {
                f(i10).o(j10, map, map2, str2, map3);
            }
        }
    }

    public final void p(long j10, boolean z10, String str, Map map) {
        boolean z11;
        Map map2;
        long j11;
        this.f54149j.clear();
        this.f54150k.clear();
        if ("metadata".equals(this.f54140a)) {
            return;
        }
        if (!"".equals(this.f54146g)) {
            str = this.f54146g;
        }
        String str2 = str;
        if (this.f54142c && z10) {
            k(str2, map).append((CharSequence) AbstractC4134a.e(this.f54141b));
            return;
        }
        if ("br".equals(this.f54140a) && z10) {
            k(str2, map).append('\n');
            return;
        }
        if (m(j10)) {
            for (Map.Entry entry : map.entrySet()) {
                this.f54149j.put((String) entry.getKey(), Integer.valueOf(((CharSequence) AbstractC4134a.e(((C3985a.b) entry.getValue()).e())).length()));
            }
            boolean equals = "p".equals(this.f54140a);
            int i10 = 0;
            while (i10 < g()) {
                C5148c f10 = f(i10);
                if (z10 || equals) {
                    z11 = true;
                    map2 = map;
                    j11 = j10;
                } else {
                    z11 = false;
                    j11 = j10;
                    map2 = map;
                }
                f10.p(j11, z11, str2, map2);
                i10++;
                j10 = j11;
                map = map2;
            }
            Map map3 = map;
            if (equals) {
                f.c(k(str2, map3));
            }
            for (Map.Entry entry2 : map3.entrySet()) {
                this.f54150k.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) AbstractC4134a.e(((C3985a.b) entry2.getValue()).e())).length()));
            }
        }
    }
}
