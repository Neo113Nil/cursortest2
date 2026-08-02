package Ii;

import Mi.c;
import Ri.h;
import java.util.Hashtable;
import org.spongycastle.asn1.C5936n;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Hashtable f5782a = new Hashtable();

    /* renamed from: b, reason: collision with root package name */
    public static final Hashtable f5783b = new Hashtable();

    static {
        a("B-571", c.f7710F);
        a("B-409", c.f7708D);
        a("B-283", c.f7743n);
        a("B-233", c.f7749t);
        a("B-163", c.f7741l);
        a("K-571", c.f7709E);
        a("K-409", c.f7707C);
        a("K-283", c.f7742m);
        a("K-233", c.f7748s);
        a("K-163", c.f7731b);
        a("P-521", c.f7706B);
        a("P-384", c.f7705A);
        a("P-256", c.f7712H);
        a("P-224", c.f7755z);
        a("P-192", c.f7711G);
    }

    public static void a(String str, C5936n c5936n) {
        f5782a.put(str, c5936n);
        f5783b.put(c5936n, str);
    }

    public static h b(String str) {
        C5936n c5936n = (C5936n) f5782a.get(Aj.h.k(str));
        if (c5936n != null) {
            return c(c5936n);
        }
        return null;
    }

    public static h c(C5936n c5936n) {
        return Mi.b.i(c5936n);
    }
}
