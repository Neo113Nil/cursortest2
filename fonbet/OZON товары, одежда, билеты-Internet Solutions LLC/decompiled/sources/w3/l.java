package w3;

import android.os.Build;
import java.util.List;
import java.util.Map;
import m3.N;
import p3.C8848h;
import p3.InterfaceC8846f;
import p3.i;
import p3.x;

/* loaded from: classes8.dex */
public final class l {
    public static byte[] a(InterfaceC8846f interfaceC8846f, String str, byte[] bArr, Map<String, String> map) throws v {
        Map<String, List<String>> map2;
        List<String> list;
        x xVar = new x(interfaceC8846f);
        i.a aVar = new i.a();
        aVar.j(str);
        aVar.e(map);
        aVar.d();
        aVar.c(bArr);
        aVar.b(1);
        p3.i a11 = aVar.a();
        int i11 = 0;
        int i12 = 0;
        p3.i iVar = a11;
        while (true) {
            try {
                C8848h c8848h = new C8848h(xVar, iVar);
                try {
                    byte[] b11 = P7.a.b(c8848h);
                    N.g(c8848h);
                    return b11;
                } catch (p3.s e11) {
                    try {
                        int i13 = e11.f80119d;
                        String str2 = null;
                        if ((i13 == 307 || i13 == 308) && i12 < 5 && (map2 = e11.f80120e) != null && (list = map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = list.get(i11);
                        }
                        if (str2 == null) {
                            throw e11;
                        }
                        i12++;
                        i.a a12 = iVar.a();
                        a12.j(str2);
                        iVar = a12.a();
                        N.g(c8848h);
                    } catch (Throwable th2) {
                        N.g(c8848h);
                        throw th2;
                    }
                }
            } catch (Exception e12) {
                throw new v(a11, xVar.j(), xVar.getResponseHeaders(), xVar.i(), e12);
            }
        }
    }

    public static boolean b(Throwable th2) {
        return Build.VERSION.SDK_INT == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean c(Throwable th2) {
        return Build.VERSION.SDK_INT == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
