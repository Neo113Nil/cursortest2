package s7;

import android.content.Context;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.d7;
import com.google.android.gms.internal.measurement.h8;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.internal.measurement.r9;
import com.google.android.gms.internal.measurement.s7;
import com.google.android.gms.internal.measurement.v7;
import com.google.android.gms.internal.measurement.x6;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.data.repository.room.billing.PurchaseSubsTable;
import com.sports.insider.data.room.general.AppDatabase;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements p, u6.e {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ s f23011b = new s(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ s f23012c = new s(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ s f23013d = new s(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ s f23014e = new s(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ s f23015f = new s(4);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ s f23016g = new s(5);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ s f23017h = new s(6);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ s f23018i = new s(7);
    public static final /* synthetic */ s j = new s(8);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ s f23019k = new s(9);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ s f23020l = new s(10);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ s f23021m = new s(11);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ s f23022n = new s(12);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ s f23023o = new s(13);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ s f23024p = new s(14);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23025a;

    public /* synthetic */ s(int i5) {
        this.f23025a = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (r5.h(r4, r0) != r6) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(s sVar, ha.a aVar, mf.c cVar) {
        tc.a aVar2;
        int i5;
        ha.a aVar3;
        u uVar;
        if (cVar instanceof tc.a) {
            aVar2 = (tc.a) cVar;
            int i10 = aVar2.f23837e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.f23837e = i10 - Integer.MIN_VALUE;
                Object obj = aVar2.f23835c;
                lf.a aVar4 = lf.a.f20034a;
                i5 = aVar2.f23837e;
                if (i5 != 0) {
                    h8.b.B(obj);
                    u uVar2 = new u(15);
                    ha.d dVar = aVar.f10433c;
                    aVar2.f23833a = aVar;
                    aVar2.f23834b = uVar2;
                    aVar2.f23837e = 1;
                    if (uVar2.i(dVar, aVar2) != aVar4) {
                        aVar3 = aVar;
                        uVar = uVar2;
                    }
                    return aVar4;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return Unit.f19194a;
                }
                uVar = aVar2.f23834b;
                aVar3 = aVar2.f23833a;
                h8.b.B(obj);
                ha.c cVar2 = aVar3.f10434d;
                aVar2.f23833a = null;
                aVar2.f23834b = null;
                aVar2.f23837e = 2;
            }
        }
        aVar2 = new tc.a(sVar, cVar);
        Object obj2 = aVar2.f23835c;
        lf.a aVar42 = lf.a.f20034a;
        i5 = aVar2.f23837e;
        if (i5 != 0) {
        }
        ha.c cVar22 = aVar3.f10434d;
        aVar2.f23833a = null;
        aVar2.f23834b = null;
        aVar2.f23837e = 2;
    }

    public static AppDatabase c(Context context) {
        k2.s i5 = h8.b.i(context, AppDatabase.class, "predictions");
        lg.e eVar = eg.m0.f9201a;
        lg.d context2 = lg.d.f20063c;
        Intrinsics.checkNotNullParameter(context2, "context");
        if (i5.f18760f != null || i5.f18761g != null) {
            throw new IllegalArgumentException("This builder has already been configured with an Executor. A RoomDatabase canonly be configured with either an Executor or a CoroutineContext.");
        }
        if (context2.r(kotlin.coroutines.d.f19226f0) == null) {
            throw new IllegalArgumentException("It is required that the coroutine context contain a dispatcher.");
        }
        i5.f18771s = context2;
        i5.a(new eb.f(1, 2, 9));
        i5.a(new eb.f(2, 3, 10));
        i5.a(new eb.f(3, 4, 11));
        i5.a(new eb.f(4, 5, 12));
        i5.a(new eb.f(5, 6, 13));
        i5.a(new eb.f(6, 7, 14));
        i5.a(new eb.f(7, 8, 15));
        i5.a(new eb.f(8, 9, 16));
        i5.a(new eb.f(9, 10, 17));
        i5.a(new eb.f(10, 11, 5));
        i5.a(new eb.f(11, 12, 6));
        i5.a(new eb.f(12, 13, 7));
        i5.a(new eb.f(13, 14, 8));
        i5.f18769p = false;
        i5.q = true;
        i5.f18770r = true;
        return (AppDatabase) i5.b();
    }

    @Override // s7.p
    public Object a() {
        switch (this.f23025a) {
            case 0:
                List list = x.f23173a;
                b7.f4937b.get();
                return (String) d7.f4972a0.b();
            case 1:
                List list2 = x.f23173a;
                b7.f4937b.get();
                return (String) d7.f5011w0.b();
            case 2:
                List list3 = x.f23173a;
                b7.f4937b.get();
                return Integer.valueOf((int) ((Long) d7.f5001r0.b()).longValue());
            case 3:
                List list4 = x.f23173a;
                b7.f4937b.get();
                return Integer.valueOf((int) ((Long) d7.X.b()).longValue());
            case 4:
                List list5 = x.f23173a;
                b7.f4937b.get();
                Boolean bool = (Boolean) d7.f4975c.b();
                bool.getClass();
                return bool;
            case 5:
                List list6 = x.f23173a;
                Boolean bool2 = (Boolean) v7.f5288b.b();
                bool2.getClass();
                return bool2;
            case 6:
                List list7 = x.f23173a;
                Boolean bool3 = (Boolean) v7.f5289c.b();
                bool3.getClass();
                return bool3;
            case 7:
                List list8 = x.f23173a;
                Boolean bool4 = (Boolean) r9.f5232a.b();
                bool4.getClass();
                return bool4;
            case 8:
                List list9 = x.f23173a;
                Boolean bool5 = (Boolean) s7.f5239b.b();
                bool5.getClass();
                return bool5;
            case 9:
                List list10 = x.f23173a;
                o8.f5169b.get();
                Boolean bool6 = (Boolean) q8.f5211f.b();
                bool6.getClass();
                return bool6;
            case 10:
                List list11 = x.f23173a;
                o8.f5169b.get();
                Boolean bool7 = (Boolean) q8.f5213h.b();
                bool7.getClass();
                return bool7;
            case 11:
                List list12 = x.f23173a;
                o8.f5169b.get();
                Boolean bool8 = (Boolean) q8.f5210e.b();
                bool8.getClass();
                return bool8;
            case 12:
                List list13 = x.f23173a;
                Boolean bool9 = (Boolean) x6.f5360a.b();
                bool9.getClass();
                return bool9;
            case 13:
                List list14 = x.f23173a;
                b7.f4937b.get();
                return Integer.valueOf((int) ((Long) d7.f4994n0.b()).longValue());
            default:
                return new Boolean(((Boolean) h8.f5079a.b()).booleanValue());
        }
    }

    @Override // u6.e
    public u6.d d(Context context, String str, u6.c cVar) {
        u6.d dVar = new u6.d();
        int c2 = cVar.c(context, str);
        dVar.f24051a = c2;
        if (c2 != 0) {
            dVar.f24053c = -1;
            return dVar;
        }
        int b10 = cVar.b(context, str, true);
        dVar.f24052b = b10;
        if (b10 != 0) {
            dVar.f24053c = 1;
        }
        return dVar;
    }

    public AppDatabase e(Context context) {
        AppDatabase appDatabase;
        Intrinsics.checkNotNullParameter(context, "context");
        AppDatabase appDatabase2 = AppDatabase.f6867m;
        if (appDatabase2 != null) {
            return appDatabase2;
        }
        synchronized (this) {
            appDatabase = AppDatabase.f6867m;
            if (appDatabase == null) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                appDatabase = c(applicationContext);
                AppDatabase.f6867m = appDatabase;
            }
        }
        return appDatabase;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:(1:(7:12|13|14|(1:16)|18|(1:20)|21)(2:23|24))(5:25|26|27|(6:30|14|(0)|18|(0)|21)|29))(1:31))(3:42|43|(2:45|29))|32|(3:34|(2:38|(2:40|29)(4:41|27|(0)|29))|(0))|18|(0)|21))|72|6|7|(0)(0)|32|(0)|18|(0)|21) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0033, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ae, code lost:
    
        if ((r10 instanceof java.util.concurrent.CancellationException) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00dd, code lost:
    
        zc.d.b(4, "sendUserData", r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a9 A[Catch: Exception -> 0x0033, TRY_LEAVE, TryCatch #0 {Exception -> 0x0033, blocks: (B:13:0x002e, B:16:0x00a9, B:26:0x0046, B:27:0x0092, B:31:0x004c, B:32:0x0065, B:34:0x006a, B:38:0x0074, B:43:0x0053), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:13:0x002e, B:16:0x00a9, B:26:0x0046, B:27:0x0092, B:31:0x004c, B:32:0x0065, B:34:0x006a, B:38:0x0074, B:43:0x0053), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(mf.c cVar) {
        sc.k kVar;
        int i5;
        Integer num;
        ha.a aVar;
        u uVar;
        ha.a aVar2;
        int i10;
        ha.c cVar2;
        ha.a aVar3;
        if (cVar instanceof sc.k) {
            kVar = (sc.k) cVar;
            int i11 = kVar.f23465g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f23465g = i11 - Integer.MIN_VALUE;
                Object obj = kVar.f23463e;
                lf.a aVar4 = lf.a.f20034a;
                i5 = kVar.f23465g;
                int i12 = 400;
                if (i5 != 0) {
                    h8.b.B(obj);
                    la.m mVar = (la.m) y3.m(la.m.class, null, 6);
                    kVar.f23465g = 1;
                    obj = mVar.a(kVar);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar3 = kVar.f23459a;
                            h8.b.B(obj);
                            aVar = aVar3;
                            if (aVar != null) {
                                i12 = aVar.f10431a;
                            }
                            num = new Integer(i12);
                            if (num.intValue() == 401) {
                                da.r.b(401);
                            }
                            return num;
                        }
                        i10 = kVar.f23462d;
                        uVar = kVar.f23461c;
                        ha.a aVar5 = kVar.f23460b;
                        ha.a aVar6 = kVar.f23459a;
                        h8.b.B(obj);
                        aVar2 = aVar5;
                        aVar = aVar6;
                        cVar2 = aVar2.f10434d;
                        kVar.f23459a = aVar;
                        kVar.f23460b = null;
                        kVar.f23461c = null;
                        kVar.f23462d = i10;
                        kVar.f23465g = 3;
                        if (uVar.h(cVar2, kVar) != aVar4) {
                            aVar3 = aVar;
                            aVar = aVar3;
                            if (aVar != null) {
                            }
                            num = new Integer(i12);
                            if (num.intValue() == 401) {
                            }
                            return num;
                        }
                        return aVar4;
                    }
                    h8.b.B(obj);
                }
                aVar = (ha.a) obj;
                if (aVar != null) {
                    int i13 = aVar.f10431a;
                    if (200 <= i13 && i13 < 300) {
                        u uVar2 = new u(15);
                        ha.d dVar = aVar.f10433c;
                        kVar.f23459a = aVar;
                        kVar.f23460b = aVar;
                        kVar.f23461c = uVar2;
                        kVar.f23462d = 0;
                        kVar.f23465g = 2;
                        if (uVar2.i(dVar, kVar) == aVar4) {
                            return aVar4;
                        }
                        uVar = uVar2;
                        aVar2 = aVar;
                        i10 = 0;
                        cVar2 = aVar2.f10434d;
                        kVar.f23459a = aVar;
                        kVar.f23460b = null;
                        kVar.f23461c = null;
                        kVar.f23462d = i10;
                        kVar.f23465g = 3;
                        if (uVar.h(cVar2, kVar) != aVar4) {
                        }
                        return aVar4;
                    }
                    if (aVar != null) {
                    }
                }
                num = new Integer(i12);
                if (num.intValue() == 401) {
                }
                return num;
            }
        }
        kVar = new sc.k(this, cVar);
        Object obj2 = kVar.f23463e;
        lf.a aVar42 = lf.a.f20034a;
        i5 = kVar.f23465g;
        int i122 = 400;
        if (i5 != 0) {
        }
        aVar = (ha.a) obj2;
        if (aVar != null) {
        }
        num = new Integer(i122);
        if (num.intValue() == 401) {
        }
        return num;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x01ce, code lost:
    
        if (r0 == r4) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01a1, code lost:
    
        if (r1 != r4) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0147, code lost:
    
        if (r1 == r4) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0119, code lost:
    
        if (r1 != r4) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(ha.c cVar, mf.c cVar2) {
        wc.x0 x0Var;
        int i5;
        la.t0 t0Var;
        Object A;
        ha.c cVar3;
        int i10;
        Object A2;
        ha.c cVar4;
        Object A3;
        ha.c cVar5 = cVar;
        if (cVar2 instanceof wc.x0) {
            x0Var = (wc.x0) cVar2;
            int i11 = x0Var.f25222f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                x0Var.f25222f = i11 - Integer.MIN_VALUE;
                Object obj = x0Var.f25220d;
                Object obj2 = lf.a.f20034a;
                int i12 = 5;
                int i13 = 3;
                int i14 = 2;
                int i15 = 1;
                int i16 = 6;
                Continuation continuation = null;
                switch (x0Var.f25222f) {
                    case 0:
                        h8.b.B(obj);
                        if (cVar5 == null) {
                            return Unit.f19194a;
                        }
                        la.t0 t0Var2 = (la.t0) y3.m(la.t0.class, null, 6);
                        ha.b bVar = cVar5.f10444b;
                        x0Var.f25217a = cVar5;
                        x0Var.f25218b = t0Var2;
                        i5 = 0;
                        x0Var.f25219c = 0;
                        x0Var.f25222f = 1;
                        t0Var2.getClass();
                        y8.d dVar = new y8.d();
                        lg.e eVar = eg.m0.f9201a;
                        Object A4 = eg.c0.A(lg.d.f20063c, new eb.n(dVar, bVar, continuation, i5), x0Var);
                        if (A4 != obj2) {
                            A4 = Unit.f19194a;
                        }
                        if (A4 != obj2) {
                            A4 = Unit.f19194a;
                        }
                        if (A4 != obj2) {
                            t0Var = t0Var2;
                            ha.b bVar2 = cVar5.f10446d;
                            x0Var.f25217a = cVar5;
                            x0Var.f25218b = t0Var;
                            x0Var.f25219c = i5;
                            x0Var.f25222f = 2;
                            t0Var.getClass();
                            y8.d dVar2 = new y8.d();
                            lg.e eVar2 = eg.m0.f9201a;
                            A = eg.c0.A(lg.d.f20063c, new eb.n(dVar2, bVar2, continuation, i15), x0Var);
                            if (A != obj2) {
                                A = Unit.f19194a;
                            }
                            if (A != obj2) {
                                A = Unit.f19194a;
                            }
                            if (A != obj2) {
                                cVar3 = cVar5;
                                i10 = i5;
                                ha.b bVar3 = cVar3.f10448f;
                                x0Var.f25217a = cVar3;
                                x0Var.f25218b = t0Var;
                                x0Var.f25219c = i10;
                                x0Var.f25222f = 3;
                                t0Var.getClass();
                                y8.d dVar3 = new y8.d();
                                lg.e eVar3 = eg.m0.f9201a;
                                A2 = eg.c0.A(lg.d.f20063c, new eb.n(dVar3, bVar3, continuation, i12), x0Var);
                                if (A2 != obj2) {
                                    A2 = Unit.f19194a;
                                }
                                if (A2 != obj2) {
                                    A2 = Unit.f19194a;
                                    break;
                                }
                            }
                        }
                        return obj2;
                    case 1:
                        int i17 = x0Var.f25219c;
                        t0Var = x0Var.f25218b;
                        ha.c cVar6 = x0Var.f25217a;
                        h8.b.B(obj);
                        i5 = i17;
                        cVar5 = cVar6;
                        ha.b bVar22 = cVar5.f10446d;
                        x0Var.f25217a = cVar5;
                        x0Var.f25218b = t0Var;
                        x0Var.f25219c = i5;
                        x0Var.f25222f = 2;
                        t0Var.getClass();
                        y8.d dVar22 = new y8.d();
                        lg.e eVar22 = eg.m0.f9201a;
                        A = eg.c0.A(lg.d.f20063c, new eb.n(dVar22, bVar22, continuation, i15), x0Var);
                        if (A != obj2) {
                        }
                        if (A != obj2) {
                        }
                        if (A != obj2) {
                        }
                        return obj2;
                    case 2:
                        i10 = x0Var.f25219c;
                        t0Var = x0Var.f25218b;
                        cVar3 = x0Var.f25217a;
                        h8.b.B(obj);
                        ha.b bVar32 = cVar3.f10448f;
                        x0Var.f25217a = cVar3;
                        x0Var.f25218b = t0Var;
                        x0Var.f25219c = i10;
                        x0Var.f25222f = 3;
                        t0Var.getClass();
                        y8.d dVar32 = new y8.d();
                        lg.e eVar32 = eg.m0.f9201a;
                        A2 = eg.c0.A(lg.d.f20063c, new eb.n(dVar32, bVar32, continuation, i12), x0Var);
                        if (A2 != obj2) {
                        }
                        if (A2 != obj2) {
                        }
                        break;
                    case 3:
                        i10 = x0Var.f25219c;
                        t0Var = x0Var.f25218b;
                        cVar3 = x0Var.f25217a;
                        h8.b.B(obj);
                        ha.b bVar4 = cVar3.f10449g;
                        x0Var.f25217a = cVar3;
                        x0Var.f25218b = t0Var;
                        x0Var.f25219c = i10;
                        x0Var.f25222f = 4;
                        t0Var.getClass();
                        y8.d dVar4 = new y8.d();
                        lg.e eVar4 = eg.m0.f9201a;
                        Object A5 = eg.c0.A(lg.d.f20063c, new eb.n(dVar4, bVar4, continuation, 4), x0Var);
                        if (A5 != obj2) {
                            A5 = Unit.f19194a;
                        }
                        if (A5 != obj2) {
                            A5 = Unit.f19194a;
                            break;
                        }
                        break;
                    case 4:
                        i10 = x0Var.f25219c;
                        t0Var = x0Var.f25218b;
                        cVar3 = x0Var.f25217a;
                        h8.b.B(obj);
                        ha.b bVar5 = cVar3.f10450h;
                        x0Var.f25217a = cVar3;
                        x0Var.f25218b = t0Var;
                        x0Var.f25219c = i10;
                        x0Var.f25222f = 5;
                        t0Var.getClass();
                        y8.d dVar5 = new y8.d();
                        lg.e eVar5 = eg.m0.f9201a;
                        Object A6 = eg.c0.A(lg.d.f20063c, new eb.n(dVar5, bVar5, continuation, i13), x0Var);
                        if (A6 != obj2) {
                            A6 = Unit.f19194a;
                        }
                        if (A6 != obj2) {
                            A6 = Unit.f19194a;
                        }
                        if (A6 != obj2) {
                            cVar4 = cVar3;
                            ha.b bVar6 = cVar4.f10445c;
                            x0Var.f25217a = cVar4;
                            x0Var.f25218b = t0Var;
                            x0Var.f25219c = i10;
                            x0Var.f25222f = 6;
                            t0Var.getClass();
                            y8.d dVar6 = new y8.d();
                            lg.e eVar6 = eg.m0.f9201a;
                            A3 = eg.c0.A(lg.d.f20063c, new eb.n(dVar6, bVar6, continuation, i14), x0Var);
                            if (A3 != obj2) {
                                A3 = Unit.f19194a;
                            }
                            if (A3 != obj2) {
                                A3 = Unit.f19194a;
                                break;
                            }
                        }
                        return obj2;
                    case 5:
                        i10 = x0Var.f25219c;
                        t0Var = x0Var.f25218b;
                        cVar4 = x0Var.f25217a;
                        h8.b.B(obj);
                        ha.b bVar62 = cVar4.f10445c;
                        x0Var.f25217a = cVar4;
                        x0Var.f25218b = t0Var;
                        x0Var.f25219c = i10;
                        x0Var.f25222f = 6;
                        t0Var.getClass();
                        y8.d dVar62 = new y8.d();
                        lg.e eVar62 = eg.m0.f9201a;
                        A3 = eg.c0.A(lg.d.f20063c, new eb.n(dVar62, bVar62, continuation, i14), x0Var);
                        if (A3 != obj2) {
                        }
                        if (A3 != obj2) {
                        }
                        break;
                    case 6:
                        i10 = x0Var.f25219c;
                        t0Var = x0Var.f25218b;
                        cVar4 = x0Var.f25217a;
                        h8.b.B(obj);
                        ha.b bVar7 = cVar4.f10447e;
                        x0Var.f25217a = null;
                        x0Var.f25218b = null;
                        x0Var.f25219c = i10;
                        x0Var.f25222f = 7;
                        t0Var.getClass();
                        y8.d dVar7 = new y8.d();
                        lg.e eVar7 = eg.m0.f9201a;
                        Object A7 = eg.c0.A(lg.d.f20063c, new eb.n(dVar7, bVar7, continuation, i16), x0Var);
                        if (A7 != obj2) {
                            A7 = Unit.f19194a;
                        }
                        if (A7 != obj2) {
                            A7 = Unit.f19194a;
                            break;
                        }
                        break;
                    case 7:
                        h8.b.B(obj);
                        return Unit.f19194a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        x0Var = new wc.x0(this, cVar2);
        Object obj3 = x0Var.f25220d;
        Object obj22 = lf.a.f20034a;
        int i122 = 5;
        int i132 = 3;
        int i142 = 2;
        int i152 = 1;
        int i162 = 6;
        Continuation continuation2 = null;
        switch (x0Var.f25222f) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(int i5, e3.j jVar, mf.c cVar) {
        wc.d dVar;
        int i10;
        int intValue;
        Object tVar;
        try {
            if (cVar instanceof wc.d) {
                dVar = (wc.d) cVar;
                int i11 = dVar.f25072c;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    dVar.f25072c = i11 - Integer.MIN_VALUE;
                    Object obj = dVar.f25070a;
                    lf.a aVar = lf.a.f20034a;
                    i10 = dVar.f25072c;
                    if (i10 != 0) {
                        h8.b.B(obj);
                        if (i5 > 5) {
                            e3.s sVar = new e3.s();
                            Intrinsics.checkNotNullExpressionValue(sVar, "failure(...)");
                            return sVar;
                        }
                        String b10 = jVar.b(PurchaseSubsTable.skuColumn);
                        String b11 = jVar.b("purchaseToken");
                        String b12 = jVar.b("subscriptionId");
                        if (b10 == null) {
                            e3.s sVar2 = new e3.s();
                            Intrinsics.checkNotNullExpressionValue(sVar2, "failure(...)");
                            return sVar2;
                        }
                        if (b11 == null) {
                            e3.s sVar3 = new e3.s();
                            Intrinsics.checkNotNullExpressionValue(sVar3, "failure(...)");
                            return sVar3;
                        }
                        wc.c cVar2 = new wc.c();
                        dVar.f25072c = 1;
                        obj = cVar2.a(b10, b12, b11, dVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    intValue = ((Number) obj).intValue();
                    if (200 <= intValue || intValue >= 400) {
                        if (intValue != 400 && intValue != 429 && intValue != 502) {
                            tVar = new e3.s();
                        }
                        tVar = new e3.t();
                    } else {
                        tVar = new e3.u();
                    }
                    Intrinsics.checkNotNull(tVar);
                    return tVar;
                }
            }
            if (i10 != 0) {
            }
            intValue = ((Number) obj).intValue();
            if (200 <= intValue) {
            }
            if (intValue != 400) {
                tVar = new e3.s();
                Intrinsics.checkNotNull(tVar);
                return tVar;
            }
            tVar = new e3.t();
            Intrinsics.checkNotNull(tVar);
            return tVar;
        } catch (Exception unused) {
            e3.t tVar2 = new e3.t();
            Intrinsics.checkNotNull(tVar2);
            return tVar2;
        }
        dVar = new wc.d(this, cVar);
        Object obj2 = dVar.f25070a;
        lf.a aVar2 = lf.a.f20034a;
        i10 = dVar.f25072c;
    }
}
