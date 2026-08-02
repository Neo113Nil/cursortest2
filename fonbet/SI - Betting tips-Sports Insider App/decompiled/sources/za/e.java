package za;

import android.content.Context;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import eg.b2;
import eg.c0;
import eg.y1;
import kotlin.coroutines.Continuation;
import q4.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public Context f25898a;

    public static bc.a a() {
        return (bc.a) y3.m(bc.a.class, null, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, mf.c cVar) {
        c cVar2;
        int i5;
        try {
            if (cVar instanceof c) {
                cVar2 = (c) cVar;
                int i10 = cVar2.f25894c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    cVar2.f25894c = i10 - Integer.MIN_VALUE;
                    Object obj = cVar2.f25892a;
                    lf.a aVar = lf.a.f20034a;
                    i5 = cVar2.f25894c;
                    Continuation continuation = null;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        d dVar = new d(c0.e(MyApp.f6830c, null, new r(this, continuation, 16), 3), continuation, 0);
                        cVar2.f25894c = 1;
                        obj = b2.b(j, dVar, cVar2);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return (String) obj;
                }
            }
            if (i5 != 0) {
            }
            return (String) obj;
        } catch (y1 unused) {
            return null;
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f25892a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = cVar2.f25894c;
        Continuation continuation2 = null;
    }
}
