package za;

import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import eg.b2;
import eg.c0;
import eg.y1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q4.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {
    public static String b(long j) {
        fa.a c2 = c();
        c2.getClass();
        Intrinsics.checkNotNullParameter("advertising_id_saved_at", "key");
        long j6 = c2.f9541a.getLong("advertising_id_saved_at", 0L);
        if (j6 == 0 || System.currentTimeMillis() - j6 > j) {
            return null;
        }
        return c().a("gaid");
    }

    public static fa.a c() {
        return (fa.a) y3.m(fa.a.class, null, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, long j6, mf.c cVar) {
        a aVar;
        int i5;
        try {
            if (cVar instanceof a) {
                aVar = (a) cVar;
                int i10 = aVar.f25891c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f25891c = i10 - Integer.MIN_VALUE;
                    a aVar2 = aVar;
                    Object obj = aVar2.f25889a;
                    lf.a aVar3 = lf.a.f20034a;
                    i5 = aVar2.f25891c;
                    Continuation continuation = null;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        String b10 = b(j6);
                        if (b10 != null) {
                            return b10;
                        }
                        jd.c cVar2 = new jd.c(c0.t(MyApp.f6830c, null, null, new r(this, continuation, 15), 3), this, j6, null);
                        aVar2.f25891c = 1;
                        obj = b2.b(j, cVar2, aVar2);
                        if (obj == aVar3) {
                            return aVar3;
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
        aVar = new a(this, cVar);
        a aVar22 = aVar;
        Object obj2 = aVar22.f25889a;
        lf.a aVar32 = lf.a.f20034a;
        i5 = aVar22.f25891c;
        Continuation continuation2 = null;
    }
}
