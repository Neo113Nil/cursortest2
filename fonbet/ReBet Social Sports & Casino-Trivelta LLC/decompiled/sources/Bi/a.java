package Bi;

import Ri.h;
import Ri.i;
import Ri.j;
import java.math.BigInteger;
import java.util.Hashtable;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.math.ec.d;
import org.spongycastle.util.encoders.f;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static i f1018a = new C0026a();

    /* renamed from: b, reason: collision with root package name */
    public static final Hashtable f1019b = new Hashtable();

    /* renamed from: c, reason: collision with root package name */
    public static final Hashtable f1020c = new Hashtable();

    /* renamed from: d, reason: collision with root package name */
    public static final Hashtable f1021d = new Hashtable();

    /* renamed from: Bi.a$a, reason: collision with other inner class name */
    public static class C0026a extends i {
        @Override // Ri.i
        public h a() {
            BigInteger e10 = a.e("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03");
            BigInteger e11 = a.e("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00");
            BigInteger e12 = a.e("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F");
            BigInteger e13 = a.e("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1");
            BigInteger valueOf = BigInteger.valueOf(1L);
            d c10 = a.c(new d.e(e10, e11, e12, e13, valueOf));
            return new h(c10, new j(c10, f.a("04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB")), e13, valueOf, null);
        }
    }

    static {
        d("FRP256v1", b.f1022a, f1018a);
    }

    public static void d(String str, C5936n c5936n, i iVar) {
        f1019b.put(str.toLowerCase(), c5936n);
        f1021d.put(c5936n, str);
        f1020c.put(c5936n, iVar);
    }

    public static BigInteger e(String str) {
        return new BigInteger(1, f.a(str));
    }

    public static h f(String str) {
        C5936n h10 = h(str);
        if (h10 == null) {
            return null;
        }
        return g(h10);
    }

    public static h g(C5936n c5936n) {
        i iVar = (i) f1020c.get(c5936n);
        if (iVar == null) {
            return null;
        }
        return iVar.b();
    }

    public static C5936n h(String str) {
        return (C5936n) f1019b.get(Aj.h.g(str));
    }

    public static d c(d dVar) {
        return dVar;
    }
}
