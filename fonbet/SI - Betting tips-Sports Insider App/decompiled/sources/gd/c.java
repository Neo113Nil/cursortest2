package gd;

import com.google.android.gms.internal.measurement.y3;
import eg.c0;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLContext;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import zc.d;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, mf.c cVar2) {
        b bVar;
        int i5;
        try {
            if (cVar2 instanceof b) {
                bVar = (b) cVar2;
                int i10 = bVar.f9956c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar.f9956c = i10 - Integer.MIN_VALUE;
                    Object obj = bVar.f9954a;
                    lf.a aVar = lf.a.f20034a;
                    i5 = bVar.f9956c;
                    Continuation continuation = null;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        gc.a aVar2 = (gc.a) y3.m(gc.a.class, null, 6);
                        bVar.f9956c = 1;
                        aVar2.getClass();
                        obj = c0.i(new ad.a(aVar2, continuation, 7), bVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return ((SSLContext) ((Pair) obj).f19192a).getSocketFactory();
                }
            }
            if (i5 != 0) {
            }
            return ((SSLContext) ((Pair) obj).f19192a).getSocketFactory();
        } catch (CancellationException unused) {
            return null;
        } catch (Exception e7) {
            d.b(4, "socketFactoryWithCert", e7);
            return null;
        }
        bVar = new b(cVar, cVar2);
        Object obj2 = bVar.f9954a;
        lf.a aVar3 = lf.a.f20034a;
        i5 = bVar.f9956c;
        Continuation continuation2 = null;
    }
}
