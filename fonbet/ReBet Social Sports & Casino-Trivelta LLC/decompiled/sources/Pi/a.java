package Pi;

import Oi.e;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.asn1.InterfaceC5927e;
import org.spongycastle.asn1.j0;
import org.spongycastle.asn1.r;

/* loaded from: classes5.dex */
public abstract class a implements e {
    public static Hashtable f(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }

    @Override // Oi.e
    public int a(Oi.c cVar) {
        Oi.b[] f10 = cVar.f();
        int i10 = 0;
        for (int i11 = 0; i11 != f10.length; i11++) {
            if (f10[i11].g()) {
                Oi.a[] f11 = f10[i11].f();
                for (int i12 = 0; i12 != f11.length; i12++) {
                    i10 = (i10 ^ f11[i12].e().hashCode()) ^ e(f11[i12].f());
                }
            } else {
                i10 = (i10 ^ f10[i11].c().e().hashCode()) ^ e(f10[i11].c().f());
            }
        }
        return i10;
    }

    @Override // Oi.e
    public boolean b(Oi.c cVar, Oi.c cVar2) {
        Oi.b[] f10 = cVar.f();
        Oi.b[] f11 = cVar2.f();
        if (f10.length != f11.length) {
            return false;
        }
        boolean z10 = (f10[0].c() == null || f11[0].c() == null) ? false : !f10[0].c().e().equals(f11[0].c().e());
        for (int i10 = 0; i10 != f10.length; i10++) {
            if (!h(z10, f10[i10], f11)) {
                return false;
            }
        }
        return true;
    }

    @Override // Oi.e
    public InterfaceC5927e c(C5936n c5936n, String str) {
        if (str.length() == 0 || str.charAt(0) != '#') {
            if (str.length() != 0 && str.charAt(0) == '\\') {
                str = str.substring(1);
            }
            return g(c5936n, str);
        }
        try {
            return c.p(str, 1);
        } catch (IOException unused) {
            throw new r("can't recode value for oid " + c5936n.o());
        }
    }

    public final int e(InterfaceC5927e interfaceC5927e) {
        return c.e(c.q(interfaceC5927e)).hashCode();
    }

    public InterfaceC5927e g(C5936n c5936n, String str) {
        return new j0(str);
    }

    public final boolean h(boolean z10, Oi.b bVar, Oi.b[] bVarArr) {
        if (z10) {
            for (int length = bVarArr.length - 1; length >= 0; length--) {
                Oi.b bVar2 = bVarArr[length];
                if (bVar2 != null && i(bVar, bVar2)) {
                    bVarArr[length] = null;
                    return true;
                }
            }
        } else {
            for (int i10 = 0; i10 != bVarArr.length; i10++) {
                Oi.b bVar3 = bVarArr[i10];
                if (bVar3 != null && i(bVar, bVar3)) {
                    bVarArr[i10] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean i(Oi.b bVar, Oi.b bVar2) {
        return c.j(bVar, bVar2);
    }
}
