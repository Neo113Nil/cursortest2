package j2;

import B90.C2603e;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import k2.C7468a;
import k2.h;
import k2.i;
import m2.j;

/* loaded from: classes8.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private C2603e f68891a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f68892b = true;

    /* renamed from: c, reason: collision with root package name */
    protected HashMap<Object, j2.e> f68893c;

    /* renamed from: d, reason: collision with root package name */
    protected HashMap<Object, j2.d> f68894d;

    /* renamed from: e, reason: collision with root package name */
    HashMap<String, ArrayList<String>> f68895e;

    /* renamed from: f, reason: collision with root package name */
    public final C7241a f68896f;

    /* renamed from: g, reason: collision with root package name */
    private int f68897g;

    /* renamed from: h, reason: collision with root package name */
    ArrayList<Object> f68898h;

    /* renamed from: i, reason: collision with root package name */
    ArrayList<m2.e> f68899i;

    /* renamed from: j, reason: collision with root package name */
    boolean f68900j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a PACKED;
        public static final a SPREAD;
        public static final a SPREAD_INSIDE;
        public static Map<String, a> chainMap;
        public static Map<String, Integer> valueMap;

        static {
            a aVar = new a("SPREAD", 0);
            SPREAD = aVar;
            a aVar2 = new a("SPREAD_INSIDE", 1);
            SPREAD_INSIDE = aVar2;
            a aVar3 = new a("PACKED", 2);
            PACKED = aVar3;
            $VALUES = new a[]{aVar, aVar2, aVar3};
            chainMap = new HashMap();
            valueMap = new HashMap();
            chainMap.put("packed", aVar3);
            chainMap.put("spread_inside", aVar2);
            chainMap.put("spread", aVar);
            valueMap.put("packed", 2);
            valueMap.put("spread_inside", 1);
            valueMap.put("spread", 0);
        }

        private a() {
            throw null;
        }

        public static int a(String str) {
            if (valueMap.containsKey(str)) {
                return valueMap.get(str).intValue();
            }
            return -1;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b BASELINE_TO_BASELINE;
        public static final b BASELINE_TO_BOTTOM;
        public static final b BASELINE_TO_TOP;
        public static final b BOTTOM_TO_BASELINE;
        public static final b BOTTOM_TO_BOTTOM;
        public static final b BOTTOM_TO_TOP;
        public static final b CENTER_HORIZONTALLY;
        public static final b CENTER_VERTICALLY;
        public static final b CIRCULAR_CONSTRAINT;
        public static final b END_TO_END;
        public static final b END_TO_START;
        public static final b LEFT_TO_LEFT;
        public static final b LEFT_TO_RIGHT;
        public static final b RIGHT_TO_LEFT;
        public static final b RIGHT_TO_RIGHT;
        public static final b START_TO_END;
        public static final b START_TO_START;
        public static final b TOP_TO_BASELINE;
        public static final b TOP_TO_BOTTOM;
        public static final b TOP_TO_TOP;

        static {
            b bVar = new b("LEFT_TO_LEFT", 0);
            LEFT_TO_LEFT = bVar;
            b bVar2 = new b("LEFT_TO_RIGHT", 1);
            LEFT_TO_RIGHT = bVar2;
            b bVar3 = new b("RIGHT_TO_LEFT", 2);
            RIGHT_TO_LEFT = bVar3;
            b bVar4 = new b("RIGHT_TO_RIGHT", 3);
            RIGHT_TO_RIGHT = bVar4;
            b bVar5 = new b("START_TO_START", 4);
            START_TO_START = bVar5;
            b bVar6 = new b("START_TO_END", 5);
            START_TO_END = bVar6;
            b bVar7 = new b("END_TO_START", 6);
            END_TO_START = bVar7;
            b bVar8 = new b("END_TO_END", 7);
            END_TO_END = bVar8;
            b bVar9 = new b("TOP_TO_TOP", 8);
            TOP_TO_TOP = bVar9;
            b bVar10 = new b("TOP_TO_BOTTOM", 9);
            TOP_TO_BOTTOM = bVar10;
            b bVar11 = new b("TOP_TO_BASELINE", 10);
            TOP_TO_BASELINE = bVar11;
            b bVar12 = new b("BOTTOM_TO_TOP", 11);
            BOTTOM_TO_TOP = bVar12;
            b bVar13 = new b("BOTTOM_TO_BOTTOM", 12);
            BOTTOM_TO_BOTTOM = bVar13;
            b bVar14 = new b("BOTTOM_TO_BASELINE", 13);
            BOTTOM_TO_BASELINE = bVar14;
            b bVar15 = new b("BASELINE_TO_BASELINE", 14);
            BASELINE_TO_BASELINE = bVar15;
            b bVar16 = new b("BASELINE_TO_TOP", 15);
            BASELINE_TO_TOP = bVar16;
            b bVar17 = new b("BASELINE_TO_BOTTOM", 16);
            BASELINE_TO_BOTTOM = bVar17;
            b bVar18 = new b("CENTER_HORIZONTALLY", 17);
            CENTER_HORIZONTALLY = bVar18;
            b bVar19 = new b("CENTER_VERTICALLY", 18);
            CENTER_VERTICALLY = bVar19;
            b bVar20 = new b("CIRCULAR_CONSTRAINT", 19);
            CIRCULAR_CONSTRAINT = bVar20;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, bVar20};
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c BOTTOM;
        public static final c END;
        public static final c LEFT;
        public static final c RIGHT;
        public static final c START;
        public static final c TOP;

        static {
            c cVar = new c("LEFT", 0);
            LEFT = cVar;
            c cVar2 = new c("RIGHT", 1);
            RIGHT = cVar2;
            c cVar3 = new c("START", 2);
            START = cVar3;
            c cVar4 = new c("END", 3);
            END = cVar4;
            c cVar5 = new c("TOP", 4);
            TOP = cVar5;
            c cVar6 = new c("BOTTOM", 5);
            BOTTOM = cVar6;
            $VALUES = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
        }

        private c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        private static final /* synthetic */ d[] $VALUES;
        public static final d ALIGN_HORIZONTALLY;
        public static final d ALIGN_VERTICALLY;
        public static final d BARRIER;
        public static final d COLUMN;
        public static final d FLOW;
        public static final d GRID;
        public static final d HORIZONTAL_CHAIN;
        public static final d HORIZONTAL_FLOW;
        public static final d LAYER;
        public static final d ROW;
        public static final d VERTICAL_CHAIN;
        public static final d VERTICAL_FLOW;

        static {
            d dVar = new d("HORIZONTAL_CHAIN", 0);
            HORIZONTAL_CHAIN = dVar;
            d dVar2 = new d("VERTICAL_CHAIN", 1);
            VERTICAL_CHAIN = dVar2;
            d dVar3 = new d("ALIGN_HORIZONTALLY", 2);
            ALIGN_HORIZONTALLY = dVar3;
            d dVar4 = new d("ALIGN_VERTICALLY", 3);
            ALIGN_VERTICALLY = dVar4;
            d dVar5 = new d("BARRIER", 4);
            BARRIER = dVar5;
            d dVar6 = new d("LAYER", 5);
            LAYER = dVar6;
            d dVar7 = new d("HORIZONTAL_FLOW", 6);
            HORIZONTAL_FLOW = dVar7;
            d dVar8 = new d("VERTICAL_FLOW", 7);
            VERTICAL_FLOW = dVar8;
            d dVar9 = new d("GRID", 8);
            GRID = dVar9;
            d dVar10 = new d("ROW", 9);
            ROW = dVar10;
            d dVar11 = new d("COLUMN", 10);
            COLUMN = dVar11;
            d dVar12 = new d("FLOW", 11);
            FLOW = dVar12;
            $VALUES = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12};
        }

        private d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e {
        private static final /* synthetic */ e[] $VALUES;
        public static final e ALIGNED;
        public static final e CHAIN;
        public static final e NONE;
        public static Map<String, Integer> valueMap;
        public static Map<String, e> wrapMap;

        static {
            e eVar = new e("NONE", 0);
            NONE = eVar;
            e eVar2 = new e("CHAIN", 1);
            CHAIN = eVar2;
            e eVar3 = new e("ALIGNED", 2);
            ALIGNED = eVar3;
            $VALUES = new e[]{eVar, eVar2, eVar3};
            wrapMap = new HashMap();
            valueMap = new HashMap();
            wrapMap.put(DevicePublicKeyStringDef.NONE, eVar);
            wrapMap.put("chain", eVar2);
            wrapMap.put("aligned", eVar3);
            valueMap.put(DevicePublicKeyStringDef.NONE, 0);
            valueMap.put("chain", 3);
            valueMap.put("aligned", 2);
        }

        private e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    public f() {
        HashMap<Object, j2.e> hashMap = new HashMap<>();
        this.f68893c = hashMap;
        this.f68894d = new HashMap<>();
        this.f68895e = new HashMap<>();
        C7241a c7241a = new C7241a(this);
        this.f68896f = c7241a;
        this.f68897g = 0;
        this.f68898h = new ArrayList<>();
        this.f68899i = new ArrayList<>();
        this.f68900j = true;
        c7241a.y(0);
        hashMap.put(0, c7241a);
    }

    public final void a(m2.f fVar) {
        HashMap<Object, j2.e> hashMap;
        j2.d dVar;
        j J11;
        j J12;
        fVar.f74253v0.clear();
        C7241a c7241a = this.f68896f;
        c7241a.f68837e0.a(fVar, 0);
        c7241a.f68839f0.a(fVar, 1);
        HashMap<Object, j2.d> hashMap2 = this.f68894d;
        Iterator<Object> it = hashMap2.keySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = this.f68893c;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            j J13 = hashMap2.get(next).J();
            if (J13 != null) {
                j2.e eVar = hashMap.get(next);
                if (eVar == null) {
                    eVar = c(next);
                }
                eVar.a(J13);
            }
        }
        for (Object obj : hashMap.keySet()) {
            j2.e eVar2 = hashMap.get(obj);
            if (eVar2 != c7241a && (eVar2.c() instanceof j2.d) && (J12 = ((j2.d) eVar2.c()).J()) != null) {
                j2.e eVar3 = hashMap.get(obj);
                if (eVar3 == null) {
                    eVar3 = c(obj);
                }
                eVar3.a(J12);
            }
        }
        Iterator<Object> it2 = hashMap.keySet().iterator();
        while (it2.hasNext()) {
            j2.e eVar4 = hashMap.get(it2.next());
            if (eVar4 != c7241a) {
                m2.e b11 = eVar4.b();
                b11.r0(eVar4.getKey().toString());
                b11.f74116W = null;
                if (eVar4.c() instanceof h) {
                    eVar4.apply();
                }
                fVar.b(b11);
            } else {
                eVar4.a(fVar);
            }
        }
        Iterator<Object> it3 = hashMap2.keySet().iterator();
        while (it3.hasNext()) {
            j2.d dVar2 = hashMap2.get(it3.next());
            if (dVar2.J() != null) {
                Iterator<Object> it4 = dVar2.f68890m0.iterator();
                while (it4.hasNext()) {
                    dVar2.J().b(hashMap.get(it4.next()).b());
                }
                dVar2.apply();
            } else {
                dVar2.apply();
            }
        }
        Iterator<Object> it5 = hashMap.keySet().iterator();
        while (it5.hasNext()) {
            j2.e eVar5 = hashMap.get(it5.next());
            if (eVar5 != c7241a && (eVar5.c() instanceof j2.d) && (J11 = (dVar = (j2.d) eVar5.c()).J()) != null) {
                Iterator<Object> it6 = dVar.f68890m0.iterator();
                while (it6.hasNext()) {
                    Object next2 = it6.next();
                    j2.e eVar6 = hashMap.get(next2);
                    if (eVar6 != null) {
                        J11.b(eVar6.b());
                    } else if (next2 instanceof j2.e) {
                        J11.b(((j2.e) next2).b());
                    } else {
                        System.out.println("couldn't find reference for " + next2);
                    }
                }
                eVar5.apply();
            }
        }
        for (Object obj2 : hashMap.keySet()) {
            j2.e eVar7 = hashMap.get(obj2);
            eVar7.apply();
            m2.e b12 = eVar7.b();
            if (b12 != null && obj2 != null) {
                b12.f74140k = obj2.toString();
            }
        }
    }

    public final void b(Object obj) {
        this.f68898h.add(obj);
        this.f68900j = true;
    }

    public final C7241a c(Object obj) {
        HashMap<Object, j2.e> hashMap = this.f68893c;
        j2.e eVar = hashMap.get(obj);
        j2.e eVar2 = eVar;
        if (eVar == null) {
            C7241a c7241a = new C7241a(this);
            hashMap.put(obj, c7241a);
            c7241a.y(obj);
            eVar2 = c7241a;
        }
        if (eVar2 instanceof C7241a) {
            return (C7241a) eVar2;
        }
        return null;
    }

    public int d(Float f7) {
        return Math.round(f7.floatValue());
    }

    final C2603e e() {
        return this.f68891a;
    }

    public final h f(int i11, String str) {
        C7241a c11 = c(str);
        Object obj = c11.f68832c;
        if (obj == null || !(obj instanceof h)) {
            h hVar = new h(this);
            hVar.g(i11);
            hVar.f(str);
            c11.f68832c = hVar;
            c11.a(hVar.b());
        }
        return (h) c11.f68832c;
    }

    public final void g(j2.c cVar) {
        this.f68896f.f68839f0 = cVar;
    }

    public final j2.d h(d dVar) {
        StringBuilder sb2 = new StringBuilder("__HELPER_KEY_");
        int i11 = this.f68897g;
        this.f68897g = i11 + 1;
        String e11 = K00.b.e(i11, "__", sb2);
        HashMap<Object, j2.d> hashMap = this.f68894d;
        j2.d dVar2 = hashMap.get(e11);
        if (dVar2 == null) {
            switch (dVar.ordinal()) {
                case 0:
                    dVar2 = new i(this, d.HORIZONTAL_CHAIN);
                    break;
                case 1:
                    dVar2 = new k2.j(this, d.VERTICAL_CHAIN);
                    break;
                case 2:
                    dVar2 = new C7468a(this);
                    break;
                case 3:
                    dVar2 = new k2.b(this);
                    break;
                case 4:
                    dVar2 = new k2.c(this);
                    break;
                case 5:
                default:
                    dVar2 = new j2.d(this, dVar);
                    break;
                case 6:
                case 7:
                    dVar2 = new k2.f(this, dVar);
                    break;
                case 8:
                case 9:
                case 10:
                    dVar2 = new k2.g(this, dVar);
                    break;
            }
            dVar2.y(e11);
            hashMap.put(e11, dVar2);
        }
        return dVar2;
    }

    public final boolean i(m2.e eVar) {
        boolean z11 = this.f68900j;
        ArrayList<m2.e> arrayList = this.f68899i;
        if (z11) {
            arrayList.clear();
            Iterator<Object> it = this.f68898h.iterator();
            while (it.hasNext()) {
                m2.e b11 = this.f68893c.get(it.next()).b();
                if (b11 != null) {
                    arrayList.add(b11);
                }
            }
            this.f68900j = false;
        }
        return arrayList.contains(eVar);
    }

    public final boolean j() {
        return !this.f68892b;
    }

    public final void k() {
        HashMap<Object, j2.e> hashMap = this.f68893c;
        Iterator<Object> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            hashMap.get(it.next()).b().i0();
        }
        hashMap.clear();
        hashMap.put(0, this.f68896f);
        this.f68894d.clear();
        this.f68895e.clear();
        this.f68898h.clear();
        this.f68900j = true;
    }

    public final void l(C2603e c2603e) {
        this.f68891a = c2603e;
    }

    public final void m(boolean z11) {
        this.f68892b = !z11;
    }

    public final void n(String str, String str2) {
        ArrayList<String> arrayList;
        if (c(str) != null) {
            HashMap<String, ArrayList<String>> hashMap = this.f68895e;
            if (hashMap.containsKey(str2)) {
                arrayList = hashMap.get(str2);
            } else {
                arrayList = new ArrayList<>();
                hashMap.put(str2, arrayList);
            }
            arrayList.add(str);
        }
    }

    public final void o(j2.c cVar) {
        this.f68896f.f68837e0 = cVar;
    }
}
