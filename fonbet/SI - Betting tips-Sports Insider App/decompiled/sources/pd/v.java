package pd;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import io.appmetrica.analytics.impl.C0122e9;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.ServiceConfigurationError;
import kotlin.jvm.functions.Function0;
import ve.u0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21802a;

    public /* synthetic */ v(int i5) {
        this.f21802a = i5;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [gf.i, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Class<?> returnType;
        ServiceConfigurationError serviceConfigurationError;
        switch (this.f21802a) {
            case 0:
                return new u0(7, 2, false);
            case 1:
                return new u0(5, 6, false);
            case 2:
                return new u0(1, 4, false);
            case 3:
                return new u0(9, 6, false);
            case 4:
                return new u0(8, 6, false);
            case 5:
                return new u0(2, 6, false);
            case 6:
                return new u0(6, 6, false);
            case 7:
                return new u0(3, 6, false);
            case 8:
                mc.a aVar = pe.s.F;
                return new sc.b();
            case 9:
                return new zc.k();
            case 10:
                return new rc.r();
            case 11:
                return new zc.k();
            case 12:
                return new md.a();
            case 13:
                return tg.d0.f23941b;
            case 14:
                return tg.w.f23962b;
            case 15:
                return tg.t.f23960b;
            case 16:
                return tg.a0.f23935b;
            case 17:
                return tg.g.f23947b;
            case 18:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 19:
                try {
                    Method method = (Method) u2.c.f24019d.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class<?> cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 20:
                try {
                    return ci.c.a0(bg.q.h(bg.n.a(Arrays.asList(new x4.b(), new p4.c()).iterator())));
                } finally {
                }
            case 21:
                try {
                    return ci.c.a0(bg.q.h(bg.n.a(Arrays.asList(new x4.c(), new h4.b()).iterator())));
                } finally {
                }
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return new zc.k();
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                return new rc.g();
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return new zc.k();
            case C0122e9.F /* 25 */:
                return new rc.g();
            case C0122e9.G /* 26 */:
                return new zc.k();
            case C0122e9.H /* 27 */:
                return new zc.k();
            case 28:
                return new yd.a();
            default:
                return new yd.b();
        }
    }
}
