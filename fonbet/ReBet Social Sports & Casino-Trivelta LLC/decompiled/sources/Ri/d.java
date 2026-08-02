package Ri;

/* loaded from: classes5.dex */
public abstract class d {
    public static h a(String str) {
        h b10 = f.b(str);
        if (b10 == null) {
            b10 = Mi.b.h(str);
        }
        if (b10 == null) {
            b10 = Ii.a.b(str);
        }
        if (b10 == null) {
            b10 = Ni.a.d(str);
        }
        return b10 == null ? Bi.a.f(str) : b10;
    }
}
