package io.sentry.hints;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import androidx.lifecycle.p1;
import androidx.lifecycle.r;
import com.google.android.gms.appset.zza;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import com.sports.insider.data.repository.room.metric.MetricsDatabase;
import e5.p;
import eb.m;
import eg.c0;
import eg.y;
import io.sentry.ILogger;
import io.sentry.android.core.w0;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.r4;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import la.c1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements androidx.customview.widget.c, t1.b, ba.a, e6.k, g5.b, n2.a, i2.e, io.sentry.clientreport.g, kotlin.coroutines.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16483a;

    public /* synthetic */ j(int i5) {
        this.f16483a = i5;
    }

    public static Class A(String str, ILogger iLogger) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            if (iLogger == null) {
                return null;
            }
            iLogger.h(b5.INFO, "Class not available: ".concat(str), new Object[0]);
            return null;
        } catch (UnsatisfiedLinkError e7) {
            if (iLogger == null) {
                return null;
            }
            iLogger.e(b5.ERROR, "Failed to load (UnsatisfiedLinkError) ".concat(str), e7);
            return null;
        } catch (Throwable th2) {
            if (iLogger == null) {
                return null;
            }
            iLogger.e(b5.ERROR, "Failed to initialize ".concat(str), th2);
            return null;
        }
    }

    public static final Object r(j jVar, mf.i iVar) {
        jVar.getClass();
        return x().d(iVar);
    }

    public static final m s(j jVar) {
        jVar.getClass();
        return (m) y3.m(m.class, null, 6);
    }

    public static n1 t(p1 owner, m1 factory) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        t1.c extras = owner instanceof r ? ((r) owner).getDefaultViewModelCreationExtras() : t1.a.f23739b;
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new n1(owner.getViewModelStore(), factory, extras);
    }

    public static cg.g u(int i5, long j) {
        long j6 = i5;
        long j10 = j6 / 1000000000;
        if ((j6 ^ 1000000000) < 0 && j10 * 1000000000 != j6) {
            j10--;
        }
        long j11 = j + j10;
        if ((j ^ j11) < 0 && (j10 ^ j) >= 0) {
            return j > 0 ? cg.g.f3927e : cg.g.f3926d;
        }
        if (j11 < -31557014167219200L) {
            return cg.g.f3926d;
        }
        if (j11 > 31556889864403199L) {
            return cg.g.f3927e;
        }
        long j12 = j6 % 1000000000;
        return new cg.g(j11, (int) (j12 + ((((j12 ^ 1000000000) & ((-j12) | j12)) >> 63) & 1000000000)));
    }

    public static za.e v() {
        return (za.e) y3.m(za.e.class, null, 6);
    }

    public static c1 x() {
        return (c1) y3.m(c1.class, null, 6);
    }

    public static boolean y(b6 b6Var, String str) {
        return z(str, b6Var != null ? b6Var.getLogger() : null);
    }

    public static boolean z(String str, ILogger iLogger) {
        return A(str, iLogger) != null;
    }

    public void B(Context context, int i5, String str) {
        if (context == null || str == null || i5 < 0) {
            return;
        }
        c0.t(MyApp.f6830c, null, null, new ld.b(this, i5, null, 0), 3);
        zc.e.e(str, new WeakReference(context), null);
    }

    public void C(int i5) {
        if (i5 < 0) {
            return;
        }
        c0.t(MyApp.f6830c, null, null, new ld.b(this, i5, null, 1), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object D(mf.c cVar) {
        ld.c cVar2;
        int i5;
        if (cVar instanceof ld.c) {
            cVar2 = (ld.c) cVar;
            int i10 = cVar2.f19686c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f19686c = i10 - Integer.MIN_VALUE;
                Object obj = cVar2.f19684a;
                lf.a aVar = lf.a.f20034a;
                i5 = cVar2.f19686c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    cVar2.f19686c = 1;
                    obj = x().e(cVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return ((Pair) obj).f19193b;
            }
        }
        cVar2 = new ld.c(this, cVar);
        Object obj2 = cVar2.f19684a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = cVar2.f19686c;
        if (i5 != 0) {
        }
        return ((Pair) obj2).f19193b;
    }

    public void E(String str) {
        c0.t(MyApp.f6830c, new y("AppsFlyerUseCase"), null, new cd.c(this, str, null, 0), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r11 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object F(String str, String str2, mf.c cVar) {
        jd.e eVar;
        lf.a aVar;
        int i5;
        if (cVar instanceof jd.e) {
            eVar = (jd.e) cVar;
            int i10 = eVar.f18460d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f18460d = i10 - Integer.MIN_VALUE;
                Object obj = eVar.f18458b;
                aVar = lf.a.f20034a;
                i5 = eVar.f18460d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    if (str2 != null) {
                        yb.m mVar = (yb.m) y3.m(yb.m.class, null, 6);
                        eVar.f18457a = str;
                        eVar.f18460d = 1;
                        obj = mVar.d(str2, eVar);
                    }
                    yb.m mVar2 = (yb.m) y3.m(yb.m.class, null, 6);
                    eVar.f18457a = null;
                    eVar.f18460d = 2;
                    Object c2 = mVar2.c(str, eVar);
                    return c2 == aVar ? aVar : c2;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                str = eVar.f18457a;
                h8.b.B(obj);
                ((Boolean) obj).getClass();
                yb.m mVar22 = (yb.m) y3.m(yb.m.class, null, 6);
                eVar.f18457a = null;
                eVar.f18460d = 2;
                Object c22 = mVar22.c(str, eVar);
                if (c22 == aVar) {
                }
            }
        }
        eVar = new jd.e(this, cVar);
        Object obj2 = eVar.f18458b;
        aVar = lf.a.f20034a;
        i5 = eVar.f18460d;
        if (i5 != 0) {
        }
        ((Boolean) obj2).getClass();
        yb.m mVar222 = (yb.m) y3.m(yb.m.class, null, 6);
        eVar.f18457a = null;
        eVar.f18460d = 2;
        Object c222 = mVar222.c(str, eVar);
        if (c222 == aVar) {
        }
    }

    @Override // ba.a
    public void a(CharSequence charSequence) {
        Log.v("LogRocket", charSequence.toString());
    }

    @Override // e6.k
    public void accept(Object obj, Object obj2) {
        d7.c cVar = (d7.c) ((d7.b) obj).m();
        zza zzaVar = new zza(null, null);
        d7.f fVar = new d7.f(0, (w7.g) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i5 = d7.a.f8264a;
        obtain.writeInt(1);
        zzaVar.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(fVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            cVar.f8265a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // ba.a
    public void d(CharSequence charSequence) {
        Log.e("LogRocket", charSequence.toString());
    }

    @Override // ba.a
    public void e(CharSequence charSequence, Throwable th2) {
        Log.e("LogRocket", charSequence.toString(), th2);
    }

    @Override // ba.a
    public void f(CharSequence charSequence, Throwable th2) {
        Log.w("LogRocket", charSequence.toString(), th2);
    }

    @Override // ba.a
    public void g(CharSequence charSequence, Throwable th2) {
        Log.d("LogRocket", charSequence.toString(), th2);
    }

    @Override // ff.a
    public Object get() {
        int i5 = 0;
        switch (this.f16483a) {
            case 12:
                return new p(i5, Executors.newSingleThreadExecutor());
            default:
                m8.a aVar = new m8.a(1);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(b5.d.f3026a, new k5.b(30000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(b5.d.f3028c, new k5.b(1000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(k5.c.f18815b)));
                if (unmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(b5.d.f3027b, new k5.b(86400000L, 86400000L, unmodifiableSet));
                if (hashMap.keySet().size() < b5.d.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new k5.a(aVar, hashMap);
        }
    }

    @Override // ba.a
    public void h(CharSequence charSequence) {
        Log.i("LogRocket", charSequence.toString());
    }

    @Override // i2.e
    public void i() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // ba.a
    public void j(CharSequence charSequence) {
        Log.w("LogRocket", charSequence.toString());
    }

    @Override // i2.e
    public void k(int i5, Object obj) {
        String str;
        switch (i5) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i5 == 6 || i5 == 7 || i5 == 8) {
            w0.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // ba.a
    public void o(CharSequence charSequence) {
        Log.d("LogRocket", charSequence.toString());
    }

    @Override // ba.a
    public void p(CharSequence charSequence, Throwable th2) {
        Log.v("LogRocket", charSequence.toString(), th2);
    }

    @Override // n2.a
    public void q(t2.a db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.p("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }

    public MetricsDatabase w(Context context) {
        MetricsDatabase metricsDatabase;
        Intrinsics.checkNotNullParameter(context, "context");
        MetricsDatabase metricsDatabase2 = MetricsDatabase.f6849m;
        if (metricsDatabase2 != null) {
            return metricsDatabase2;
        }
        synchronized (this) {
            metricsDatabase = MetricsDatabase.f6849m;
            if (metricsDatabase == null) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                metricsDatabase = (MetricsDatabase) h8.b.i(applicationContext, MetricsDatabase.class, "metrics").b();
                MetricsDatabase.f6849m = metricsDatabase;
            }
        }
        return metricsDatabase;
    }

    public /* synthetic */ j(d7.g gVar) {
        this.f16483a = 10;
    }

    @Override // io.sentry.clientreport.g
    public l1.a n(l1.a aVar) {
        return aVar;
    }

    @Override // io.sentry.clientreport.g
    public void b(io.sentry.clientreport.e eVar, io.sentry.l lVar) {
    }

    @Override // io.sentry.clientreport.g
    public void c(io.sentry.clientreport.e eVar, l1.a aVar) {
    }

    @Override // io.sentry.clientreport.g
    public void m(io.sentry.clientreport.e eVar, r4 r4Var) {
    }

    @Override // io.sentry.clientreport.g
    public void l(io.sentry.clientreport.e eVar, io.sentry.l lVar, long j) {
    }
}
