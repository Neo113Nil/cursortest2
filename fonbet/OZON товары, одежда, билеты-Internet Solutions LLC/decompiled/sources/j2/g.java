package j2;

import g2.C6614a;
import java.util.HashMap;
import m2.d;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public m2.e f68901a;

    /* renamed from: b, reason: collision with root package name */
    public int f68902b;

    /* renamed from: c, reason: collision with root package name */
    public int f68903c;

    /* renamed from: d, reason: collision with root package name */
    public int f68904d;

    /* renamed from: e, reason: collision with root package name */
    public int f68905e;

    /* renamed from: f, reason: collision with root package name */
    public float f68906f;

    /* renamed from: g, reason: collision with root package name */
    public float f68907g;

    /* renamed from: h, reason: collision with root package name */
    public float f68908h;

    /* renamed from: i, reason: collision with root package name */
    public float f68909i;

    /* renamed from: j, reason: collision with root package name */
    public float f68910j;

    /* renamed from: k, reason: collision with root package name */
    public float f68911k;

    /* renamed from: l, reason: collision with root package name */
    public float f68912l;

    /* renamed from: m, reason: collision with root package name */
    public float f68913m;

    /* renamed from: n, reason: collision with root package name */
    public float f68914n;

    /* renamed from: o, reason: collision with root package name */
    public float f68915o;

    /* renamed from: p, reason: collision with root package name */
    public float f68916p;

    /* renamed from: q, reason: collision with root package name */
    public int f68917q;

    /* renamed from: r, reason: collision with root package name */
    private final HashMap<String, C6614a> f68918r;

    public g() {
        this.f68901a = null;
        this.f68902b = 0;
        this.f68903c = 0;
        this.f68904d = 0;
        this.f68905e = 0;
        this.f68906f = Float.NaN;
        this.f68907g = Float.NaN;
        this.f68908h = Float.NaN;
        this.f68909i = Float.NaN;
        this.f68910j = Float.NaN;
        this.f68911k = Float.NaN;
        this.f68912l = Float.NaN;
        this.f68913m = Float.NaN;
        this.f68914n = Float.NaN;
        this.f68915o = Float.NaN;
        this.f68916p = Float.NaN;
        this.f68917q = 0;
        this.f68918r = new HashMap<>();
    }

    private static void a(float f7, String str, StringBuilder sb2) {
        if (Float.isNaN(f7)) {
            return;
        }
        sb2.append(str);
        sb2.append(": ");
        sb2.append(f7);
        sb2.append(",\n");
    }

    private static void b(int i11, String str, StringBuilder sb2) {
        Pk0.g.d(i11, str, ": ", ",\n", sb2);
    }

    public final void c(StringBuilder sb2) {
        sb2.append("{\n");
        b(this.f68902b, "left", sb2);
        b(this.f68903c, "top", sb2);
        b(this.f68904d, "right", sb2);
        b(this.f68905e, "bottom", sb2);
        a(this.f68906f, "pivotX", sb2);
        a(this.f68907g, "pivotY", sb2);
        a(this.f68908h, "rotationX", sb2);
        a(this.f68909i, "rotationY", sb2);
        a(this.f68910j, "rotationZ", sb2);
        a(this.f68911k, "translationX", sb2);
        a(this.f68912l, "translationY", sb2);
        a(this.f68913m, "translationZ", sb2);
        a(this.f68914n, "scaleX", sb2);
        a(this.f68915o, "scaleY", sb2);
        a(this.f68916p, "alpha", sb2);
        b(this.f68917q, "visibility", sb2);
        a(Float.NaN, "interpolatedPos", sb2);
        m2.e eVar = this.f68901a;
        if (eVar != null) {
            for (d.a aVar : d.a.values()) {
                m2.d n11 = eVar.n(aVar);
                if (n11 != null && n11.f74090f != null) {
                    sb2.append("Anchor");
                    sb2.append(aVar.name());
                    sb2.append(": ['");
                    String str = n11.f74090f.f74088d.f74140k;
                    if (str == null) {
                        str = "#PARENT";
                    }
                    sb2.append(str);
                    sb2.append("', '");
                    sb2.append(n11.f74090f.f74089e.name());
                    sb2.append("', '");
                    sb2.append(n11.f74091g);
                    sb2.append("'],\n");
                }
            }
        }
        a(Float.NaN, "phone_orientation", sb2);
        a(Float.NaN, "phone_orientation", sb2);
        HashMap<String, C6614a> hashMap = this.f68918r;
        if (hashMap.size() != 0) {
            sb2.append("custom : {\n");
            for (String str2 : hashMap.keySet()) {
                C6614a c6614a = hashMap.get(str2);
                sb2.append(str2);
                sb2.append(": ");
                switch (c6614a.f()) {
                    case EDITION_LEGACY_VALUE:
                        sb2.append(c6614a.d());
                        sb2.append(",\n");
                        break;
                    case 901:
                        sb2.append(c6614a.c());
                        sb2.append(",\n");
                        break;
                    case 902:
                        sb2.append("'");
                        sb2.append(C6614a.a(c6614a.d()));
                        sb2.append("',\n");
                        break;
                    case 903:
                        sb2.append("'");
                        sb2.append((String) null);
                        sb2.append("',\n");
                        break;
                }
            }
            sb2.append("}\n");
        }
        sb2.append("}\n");
    }

    public final void d(int i11, String str) {
        HashMap<String, C6614a> hashMap = this.f68918r;
        if (hashMap.containsKey(str)) {
            hashMap.get(str).h(i11);
        } else {
            hashMap.put(str, new C6614a(str, i11));
        }
    }

    public final void e(String str, float f7) {
        HashMap<String, C6614a> hashMap = this.f68918r;
        if (hashMap.containsKey(str)) {
            hashMap.get(str).g(f7);
        } else {
            hashMap.put(str, new C6614a(str, f7));
        }
    }

    public final void f(g gVar) {
        if (gVar == null) {
            return;
        }
        this.f68906f = gVar.f68906f;
        this.f68907g = gVar.f68907g;
        this.f68908h = gVar.f68908h;
        this.f68909i = gVar.f68909i;
        this.f68910j = gVar.f68910j;
        this.f68911k = gVar.f68911k;
        this.f68912l = gVar.f68912l;
        this.f68913m = gVar.f68913m;
        this.f68914n = gVar.f68914n;
        this.f68915o = gVar.f68915o;
        this.f68916p = gVar.f68916p;
        this.f68917q = gVar.f68917q;
        HashMap<String, C6614a> hashMap = this.f68918r;
        hashMap.clear();
        for (C6614a c6614a : gVar.f68918r.values()) {
            hashMap.put(c6614a.e(), c6614a.b());
        }
    }

    public g(m2.e eVar) {
        this.f68901a = null;
        this.f68902b = 0;
        this.f68903c = 0;
        this.f68904d = 0;
        this.f68905e = 0;
        this.f68906f = Float.NaN;
        this.f68907g = Float.NaN;
        this.f68908h = Float.NaN;
        this.f68909i = Float.NaN;
        this.f68910j = Float.NaN;
        this.f68911k = Float.NaN;
        this.f68912l = Float.NaN;
        this.f68913m = Float.NaN;
        this.f68914n = Float.NaN;
        this.f68915o = Float.NaN;
        this.f68916p = Float.NaN;
        this.f68917q = 0;
        this.f68918r = new HashMap<>();
        this.f68901a = eVar;
    }

    public g(g gVar) {
        this.f68901a = null;
        this.f68902b = 0;
        this.f68903c = 0;
        this.f68904d = 0;
        this.f68905e = 0;
        this.f68906f = Float.NaN;
        this.f68907g = Float.NaN;
        this.f68908h = Float.NaN;
        this.f68909i = Float.NaN;
        this.f68910j = Float.NaN;
        this.f68911k = Float.NaN;
        this.f68912l = Float.NaN;
        this.f68913m = Float.NaN;
        this.f68914n = Float.NaN;
        this.f68915o = Float.NaN;
        this.f68916p = Float.NaN;
        this.f68917q = 0;
        this.f68918r = new HashMap<>();
        this.f68901a = gVar.f68901a;
        this.f68902b = gVar.f68902b;
        this.f68903c = gVar.f68903c;
        this.f68904d = gVar.f68904d;
        this.f68905e = gVar.f68905e;
        f(gVar);
    }
}
