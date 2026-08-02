package q1;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Build;
import e1.Z;
import h1.C4401D;
import h1.C4416l;
import h1.C4418n;
import h1.C4428x;
import h1.InterfaceC4411g;
import java.util.List;
import java.util.Map;
import q1.C6099h;

/* loaded from: classes.dex */
public abstract class x {

    public static final class a {
        public static boolean a(Throwable th2) {
            return th2 instanceof MediaDrmResetException;
        }
    }

    public static byte[] a(InterfaceC4411g interfaceC4411g, String str, byte[] bArr, Map map) {
        C4401D c4401d = new C4401D(interfaceC4411g);
        C4418n a10 = new C4418n.b().j(str).e(map).d(2).c(bArr).b(1).a();
        int i10 = 0;
        C4418n c4418n = a10;
        while (true) {
            try {
                C4416l c4416l = new C4416l(c4401d, c4418n);
                try {
                    byte[] d10 = Sa.a.d(c4416l);
                    Z.m(c4416l);
                    return d10;
                } catch (C4428x e10) {
                    try {
                        String c10 = c(e10, i10);
                        if (c10 == null) {
                            throw e10;
                        }
                        i10++;
                        c4418n = c4418n.a().j(c10).a();
                        Z.m(c4416l);
                    } catch (Throwable th2) {
                        Z.m(c4416l);
                        throw th2;
                    }
                }
            } catch (Exception e11) {
                throw new N(a10, c4401d.p(), c4401d.f(), c4401d.o(), e11);
            }
        }
    }

    public static int b(Throwable th2, int i10) {
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            return Z.f0(Z.g0(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        }
        if (a.a(th2)) {
            return 6006;
        }
        if ((th2 instanceof NotProvisionedException) || d(th2)) {
            return 6002;
        }
        if (th2 instanceof DeniedByServerException) {
            return 6007;
        }
        if (th2 instanceof O) {
            return 6001;
        }
        if (th2 instanceof C6099h.e) {
            return 6003;
        }
        if (th2 instanceof L) {
            return 6008;
        }
        if (i10 == 1) {
            return 6006;
        }
        if (i10 == 2) {
            return 6004;
        }
        if (i10 == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }

    public static String c(C4428x c4428x, int i10) {
        Map map;
        List list;
        int i11 = c4428x.f47621d;
        if ((i11 != 307 && i11 != 308) || i10 >= 5 || (map = c4428x.f47623f) == null || (list = (List) map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    public static boolean d(Throwable th2) {
        return Build.VERSION.SDK_INT == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean e(Throwable th2) {
        return Build.VERSION.SDK_INT == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
