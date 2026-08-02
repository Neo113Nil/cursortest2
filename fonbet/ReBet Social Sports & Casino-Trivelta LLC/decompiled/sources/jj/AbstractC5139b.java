package jj;

import Aj.h;
import Li.f;
import ej.AbstractC4217a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.crypto.o;

/* renamed from: jj.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5139b {

    /* renamed from: a, reason: collision with root package name */
    public static Set f53981a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static Set f53982b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static Set f53983c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public static Set f53984d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public static Set f53985e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static Set f53986f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public static Set f53987g = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    public static Set f53988h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    public static Set f53989i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public static Set f53990j = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    public static Set f53991k = new HashSet();

    /* renamed from: l, reason: collision with root package name */
    public static Set f53992l = new HashSet();

    /* renamed from: m, reason: collision with root package name */
    public static Map f53993m = new HashMap();

    static {
        f53981a.add("MD5");
        Set set = f53981a;
        C5936n c5936n = f.f7239H0;
        set.add(c5936n.o());
        f53982b.add("SHA1");
        f53982b.add(McElieceCCA2KeyGenParameterSpec.SHA1);
        Set set2 = f53982b;
        C5936n c5936n2 = Ki.b.f6658i;
        set2.add(c5936n2.o());
        f53983c.add("SHA224");
        f53983c.add(McElieceCCA2KeyGenParameterSpec.SHA224);
        Set set3 = f53983c;
        C5936n c5936n3 = Ii.b.f5820f;
        set3.add(c5936n3.o());
        f53984d.add("SHA256");
        f53984d.add("SHA-256");
        Set set4 = f53984d;
        C5936n c5936n4 = Ii.b.f5814c;
        set4.add(c5936n4.o());
        f53985e.add("SHA384");
        f53985e.add(McElieceCCA2KeyGenParameterSpec.SHA384);
        Set set5 = f53985e;
        C5936n c5936n5 = Ii.b.f5816d;
        set5.add(c5936n5.o());
        f53986f.add("SHA512");
        f53986f.add("SHA-512");
        Set set6 = f53986f;
        C5936n c5936n6 = Ii.b.f5818e;
        set6.add(c5936n6.o());
        f53987g.add("SHA512(224)");
        f53987g.add("SHA-512(224)");
        Set set7 = f53987g;
        C5936n c5936n7 = Ii.b.f5822g;
        set7.add(c5936n7.o());
        f53988h.add("SHA512(256)");
        f53988h.add("SHA-512(256)");
        Set set8 = f53988h;
        C5936n c5936n8 = Ii.b.f5824h;
        set8.add(c5936n8.o());
        f53989i.add("SHA3-224");
        Set set9 = f53989i;
        C5936n c5936n9 = Ii.b.f5826i;
        set9.add(c5936n9.o());
        f53990j.add("SHA3-256");
        Set set10 = f53990j;
        C5936n c5936n10 = Ii.b.f5828j;
        set10.add(c5936n10.o());
        f53991k.add("SHA3-384");
        Set set11 = f53991k;
        C5936n c5936n11 = Ii.b.f5829k;
        set11.add(c5936n11.o());
        f53992l.add("SHA3-512");
        Set set12 = f53992l;
        C5936n c5936n12 = Ii.b.f5830l;
        set12.add(c5936n12.o());
        f53993m.put("MD5", c5936n);
        f53993m.put(c5936n.o(), c5936n);
        f53993m.put("SHA1", c5936n2);
        f53993m.put(McElieceCCA2KeyGenParameterSpec.SHA1, c5936n2);
        f53993m.put(c5936n2.o(), c5936n2);
        f53993m.put("SHA224", c5936n3);
        f53993m.put(McElieceCCA2KeyGenParameterSpec.SHA224, c5936n3);
        f53993m.put(c5936n3.o(), c5936n3);
        f53993m.put("SHA256", c5936n4);
        f53993m.put("SHA-256", c5936n4);
        f53993m.put(c5936n4.o(), c5936n4);
        f53993m.put("SHA384", c5936n5);
        f53993m.put(McElieceCCA2KeyGenParameterSpec.SHA384, c5936n5);
        f53993m.put(c5936n5.o(), c5936n5);
        f53993m.put("SHA512", c5936n6);
        f53993m.put("SHA-512", c5936n6);
        f53993m.put(c5936n6.o(), c5936n6);
        f53993m.put("SHA512(224)", c5936n7);
        f53993m.put("SHA-512(224)", c5936n7);
        f53993m.put(c5936n7.o(), c5936n7);
        f53993m.put("SHA512(256)", c5936n8);
        f53993m.put("SHA-512(256)", c5936n8);
        f53993m.put(c5936n8.o(), c5936n8);
        f53993m.put("SHA3-224", c5936n9);
        f53993m.put(c5936n9.o(), c5936n9);
        f53993m.put("SHA3-256", c5936n10);
        f53993m.put(c5936n10.o(), c5936n10);
        f53993m.put("SHA3-384", c5936n11);
        f53993m.put(c5936n11.o(), c5936n11);
        f53993m.put("SHA3-512", c5936n12);
        f53993m.put(c5936n12.o(), c5936n12);
    }

    public static o a(String str) {
        String k10 = h.k(str);
        if (f53982b.contains(k10)) {
            return AbstractC4217a.b();
        }
        if (f53981a.contains(k10)) {
            return AbstractC4217a.a();
        }
        if (f53983c.contains(k10)) {
            return AbstractC4217a.c();
        }
        if (f53984d.contains(k10)) {
            return AbstractC4217a.d();
        }
        if (f53985e.contains(k10)) {
            return AbstractC4217a.e();
        }
        if (f53986f.contains(k10)) {
            return AbstractC4217a.j();
        }
        if (f53987g.contains(k10)) {
            return AbstractC4217a.k();
        }
        if (f53988h.contains(k10)) {
            return AbstractC4217a.l();
        }
        if (f53989i.contains(k10)) {
            return AbstractC4217a.f();
        }
        if (f53990j.contains(k10)) {
            return AbstractC4217a.g();
        }
        if (f53991k.contains(k10)) {
            return AbstractC4217a.h();
        }
        if (f53992l.contains(k10)) {
            return AbstractC4217a.i();
        }
        return null;
    }
}
