package s7;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.c9;
import com.google.android.gms.internal.measurement.d7;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.k8;
import com.google.android.gms.internal.measurement.m7;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.internal.measurement.t8;
import com.google.android.gms.internal.measurement.v7;
import com.google.android.gms.internal.measurement.y3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements p, t2.c, u6.e {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ t f23071b = new t(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ t f23072c = new t(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ t f23073d = new t(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ t f23074e = new t(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ t f23075f = new t(4);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ t f23076g = new t(5);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ t f23077h = new t(6);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ t f23078i = new t(7);
    public static final /* synthetic */ t j = new t(8);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ t f23079k = new t(9);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ t f23080l = new t(10);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ t f23081m = new t(11);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ t f23082n = new t(12);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ t f23083o = new t(13);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ t f23084p = new t(14);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23085a;

    public /* synthetic */ t(int i5) {
        this.f23085a = i5;
    }

    public static la.u0 f() {
        return (la.u0) y3.m(la.u0.class, null, 6);
    }

    public static boolean g(double d10, float f6, float f10) {
        return d10 >= ((double) f6) && d10 < ((double) f10);
    }

    public static final Object i(JSONArray jSONArray, Function2 function2, wc.y0 y0Var) {
        if (jSONArray == null) {
            return Unit.f19194a;
        }
        int length = jSONArray.length();
        if (length == 0) {
            return Unit.f19194a;
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < length; i5++) {
            String string = jSONArray.getString(i5);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            arrayList.add(string);
        }
        Object invoke = function2.invoke((String[]) arrayList.toArray(new String[0]), y0Var);
        return invoke == lf.a.f20034a ? invoke : Unit.f19194a;
    }

    @Override // s7.p
    public Object a() {
        switch (this.f23085a) {
            case 0:
                List list = x.f23173a;
                b7.f4937b.get();
                Long l6 = (Long) d7.j.b();
                l6.getClass();
                return l6;
            case 1:
                List list2 = x.f23173a;
                b7.f4937b.get();
                return (String) d7.f4988k.b();
            case 2:
                List list3 = x.f23173a;
                b7.f4937b.get();
                Long l10 = (Long) d7.Z.b();
                l10.getClass();
                return l10;
            case 3:
                List list4 = x.f23173a;
                b7.f4937b.get();
                return Integer.valueOf((int) ((Long) d7.f5010w.b()).longValue());
            case 4:
                List list5 = x.f23173a;
                b7.f4937b.get();
                Boolean bool = (Boolean) d7.C.b();
                bool.getClass();
                return bool;
            case 5:
                List list6 = x.f23173a;
                Boolean bool2 = (Boolean) v7.f5287a.b();
                bool2.getClass();
                return bool2;
            case 6:
                List list7 = x.f23173a;
                Boolean bool3 = (Boolean) k8.f5115a.b();
                bool3.getClass();
                return bool3;
            case 7:
                List list8 = x.f23173a;
                return Integer.valueOf((int) ((Long) g7.f5064a.b()).longValue());
            case 8:
                List list9 = x.f23173a;
                Boolean bool4 = (Boolean) c9.f4956a.b();
                bool4.getClass();
                return bool4;
            case 9:
                List list10 = x.f23173a;
                b7.f4937b.get();
                return Integer.valueOf((int) ((Long) d7.f4992m0.b()).longValue());
            case 10:
                List list11 = x.f23173a;
                o8.f5169b.get();
                Boolean bool5 = (Boolean) q8.f5212g.b();
                bool5.getClass();
                return bool5;
            case 11:
                List list12 = x.f23173a;
                Boolean bool6 = (Boolean) m7.f5141b.b();
                bool6.getClass();
                return bool6;
            case 12:
                List list13 = x.f23173a;
                o8.f5169b.get();
                Boolean bool7 = (Boolean) q8.f5209d.b();
                bool7.getClass();
                return bool7;
            case 13:
                List list14 = x.f23173a;
                b7.f4937b.get();
                Long l11 = (Long) d7.f4971a.b();
                l11.getClass();
                return l11;
            default:
                return new Boolean(((Boolean) t8.f5260a.b()).booleanValue());
        }
    }

    @Override // t2.c
    public t2.d b(t2.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return io.sentry.android.sqlite.g.c(new u2.h(configuration.f23744a, configuration.f23745b, configuration.f23746c, configuration.f23747d, configuration.f23748e));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(int i5, mf.c cVar) {
        sc.l lVar;
        int i10;
        int intValue;
        if (cVar instanceof sc.l) {
            lVar = (sc.l) cVar;
            int i11 = lVar.f23468c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lVar.f23468c = i11 - Integer.MIN_VALUE;
                Object obj = lVar.f23466a;
                lf.a aVar = lf.a.f20034a;
                i10 = lVar.f23468c;
                if (i10 != 0) {
                    h8.b.B(obj);
                    if (i5 > 5) {
                        e3.s sVar = new e3.s();
                        Intrinsics.checkNotNullExpressionValue(sVar, "failure(...)");
                        return sVar;
                    }
                    s sVar2 = new s(16);
                    lVar.f23468c = 1;
                    obj = sVar2.f(lVar);
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
                if (intValue != 200 || intValue == 204) {
                    e3.u uVar = new e3.u();
                    Intrinsics.checkNotNullExpressionValue(uVar, "success(...)");
                    return uVar;
                }
                if (intValue != 429 && intValue != 502) {
                    if (intValue == 400) {
                        e3.t tVar = new e3.t();
                        Intrinsics.checkNotNullExpressionValue(tVar, "retry(...)");
                        return tVar;
                    }
                    if (intValue != 401) {
                        switch (intValue) {
                            case 403:
                            case 404:
                            case 405:
                                break;
                            default:
                                e3.s sVar3 = new e3.s();
                                Intrinsics.checkNotNullExpressionValue(sVar3, "failure(...)");
                                return sVar3;
                        }
                    }
                }
                e3.s sVar4 = new e3.s();
                Intrinsics.checkNotNullExpressionValue(sVar4, "failure(...)");
                return sVar4;
            }
        }
        lVar = new sc.l(this, cVar);
        Object obj2 = lVar.f23466a;
        lf.a aVar2 = lf.a.f20034a;
        i10 = lVar.f23468c;
        if (i10 != 0) {
        }
        intValue = ((Number) obj2).intValue();
        if (intValue != 200) {
        }
        e3.u uVar2 = new e3.u();
        Intrinsics.checkNotNullExpressionValue(uVar2, "success(...)");
        return uVar2;
    }

    @Override // u6.e
    public u6.d d(Context context, String str, u6.c cVar) {
        u6.d dVar = new u6.d();
        dVar.f24051a = cVar.c(context, str);
        int i5 = 1;
        int b10 = cVar.b(context, str, true);
        dVar.f24052b = b10;
        int i10 = dVar.f24051a;
        if (i10 == 0) {
            i10 = 0;
            if (b10 == 0) {
                i5 = 0;
                dVar.f24053c = i5;
                return dVar;
            }
        }
        if (i10 >= b10) {
            i5 = -1;
        }
        dVar.f24053c = i5;
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(mf.c cVar) {
        tc.b bVar;
        int i5;
        try {
            if (cVar instanceof tc.b) {
                bVar = (tc.b) cVar;
                int i10 = bVar.f23840c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar.f23840c = i10 - Integer.MIN_VALUE;
                    Object obj = bVar.f23838a;
                    Object obj2 = lf.a.f20034a;
                    i5 = bVar.f23840c;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        id.c cVar2 = new id.c(1);
                        bVar.f23840c = 1;
                        lg.e eVar = eg.m0.f9201a;
                        Object A = eg.c0.A(lg.d.f20063c, new tc.f(cVar2, null, 0), bVar);
                        if (A != obj2) {
                            A = Unit.f19194a;
                        }
                        if (A == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    e3.u uVar = new e3.u();
                    Intrinsics.checkNotNull(uVar);
                    return uVar;
                }
            }
            if (i5 != 0) {
            }
            e3.u uVar2 = new e3.u();
            Intrinsics.checkNotNull(uVar2);
            return uVar2;
        } catch (Exception unused) {
            e3.s sVar = new e3.s();
            Intrinsics.checkNotNull(sVar);
            return sVar;
        }
        bVar = new tc.b(this, cVar);
        Object obj3 = bVar.f23838a;
        Object obj22 = lf.a.f20034a;
        i5 = bVar.f23840c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0154, code lost:
    
        if (i(r13, r2, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x012c, code lost:
    
        if (i(r13, r3, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0105, code lost:
    
        if (i(r13, r3, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00de, code lost:
    
        if (i(r13, r3, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b6, code lost:
    
        if (i(r13, r3, r0) != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(String str, mf.c cVar) {
        wc.y0 y0Var;
        JSONObject jSONObject;
        int i5;
        if (cVar instanceof wc.y0) {
            y0Var = (wc.y0) cVar;
            int i10 = y0Var.f25230e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                y0Var.f25230e = i10 - Integer.MIN_VALUE;
                Object obj = y0Var.f25228c;
                lf.a aVar = lf.a.f20034a;
                switch (y0Var.f25230e) {
                    case 0:
                        h8.b.B(obj);
                        if (str == null || str.length() == 0) {
                            return Unit.f19194a;
                        }
                        jSONObject = new JSONObject(str);
                        JSONArray optJSONArray = jSONObject.optJSONArray("diamondSubs");
                        k2.v vVar = new k2.v(2, f(), la.u0.class, "skuSubsDiamond", "skuSubsDiamond([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 6);
                        y0Var.f25226a = jSONObject;
                        y0Var.f25227b = 0;
                        y0Var.f25230e = 1;
                        if (i(optJSONArray, vVar, y0Var) != aVar) {
                            i5 = 0;
                            JSONArray optJSONArray2 = jSONObject.optJSONArray("liveSubs");
                            k2.v vVar2 = new k2.v(2, f(), la.u0.class, "skuSubsLive", "skuSubsLive([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 7);
                            y0Var.f25226a = jSONObject;
                            y0Var.f25227b = i5;
                            y0Var.f25230e = 2;
                            break;
                        }
                        return aVar;
                    case 1:
                        i5 = y0Var.f25227b;
                        jSONObject = y0Var.f25226a;
                        h8.b.B(obj);
                        JSONArray optJSONArray22 = jSONObject.optJSONArray("liveSubs");
                        k2.v vVar22 = new k2.v(2, f(), la.u0.class, "skuSubsLive", "skuSubsLive([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 7);
                        y0Var.f25226a = jSONObject;
                        y0Var.f25227b = i5;
                        y0Var.f25230e = 2;
                        break;
                    case 2:
                        i5 = y0Var.f25227b;
                        jSONObject = y0Var.f25226a;
                        h8.b.B(obj);
                        JSONArray optJSONArray3 = jSONObject.optJSONArray("premiumSubs");
                        k2.v vVar3 = new k2.v(2, f(), la.u0.class, "skuSubsPremium", "skuSubsPremium([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 8);
                        y0Var.f25226a = jSONObject;
                        y0Var.f25227b = i5;
                        y0Var.f25230e = 3;
                        break;
                    case 3:
                        i5 = y0Var.f25227b;
                        jSONObject = y0Var.f25226a;
                        h8.b.B(obj);
                        JSONArray optJSONArray4 = jSONObject.optJSONArray("expressSubs");
                        k2.v vVar4 = new k2.v(2, f(), la.u0.class, "skuSubsExpress", "skuSubsExpress([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 9);
                        y0Var.f25226a = jSONObject;
                        y0Var.f25227b = i5;
                        y0Var.f25230e = 4;
                        break;
                    case 4:
                        i5 = y0Var.f25227b;
                        jSONObject = y0Var.f25226a;
                        h8.b.B(obj);
                        JSONArray optJSONArray5 = jSONObject.optJSONArray("premiumItem");
                        k2.v vVar5 = new k2.v(2, f(), la.u0.class, "skuItemPremium", "skuItemPremium([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 10);
                        y0Var.f25226a = jSONObject;
                        y0Var.f25227b = i5;
                        y0Var.f25230e = 5;
                        break;
                    case 5:
                        i5 = y0Var.f25227b;
                        jSONObject = y0Var.f25226a;
                        h8.b.B(obj);
                        JSONArray optJSONArray6 = jSONObject.optJSONArray("expressItem");
                        k2.v vVar6 = new k2.v(2, f(), la.u0.class, "skuItemExpress", "skuItemExpress([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 11);
                        y0Var.f25226a = null;
                        y0Var.f25227b = i5;
                        y0Var.f25230e = 6;
                        break;
                    case 6:
                        h8.b.B(obj);
                        return Unit.f19194a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        y0Var = new wc.y0(this, cVar);
        Object obj2 = y0Var.f25228c;
        lf.a aVar2 = lf.a.f20034a;
        switch (y0Var.f25230e) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(int i5, mf.c cVar) {
        sc.i iVar;
        Object obj;
        int i10;
        if (cVar instanceof sc.i) {
            iVar = (sc.i) cVar;
            int i11 = iVar.f23454c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f23454c = i11 - Integer.MIN_VALUE;
                obj = iVar.f23452a;
                lf.a aVar = lf.a.f20034a;
                i10 = iVar.f23454c;
                if (i10 != 0) {
                    h8.b.B(obj);
                    if (i5 > 20) {
                        e3.s sVar = new e3.s();
                        Intrinsics.checkNotNullExpressionValue(sVar, "failure(...)");
                        return sVar;
                    }
                    sc.h hVar = new sc.h();
                    iVar.f23454c = 1;
                    lg.e eVar = eg.m0.f9201a;
                    obj = eg.c0.A(lg.d.f20063c, new oe.j(hVar, null, 23), iVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                if (obj != null) {
                    e3.t tVar = new e3.t();
                    Intrinsics.checkNotNullExpressionValue(tVar, "retry(...)");
                    return tVar;
                }
                e3.u uVar = new e3.u();
                Intrinsics.checkNotNullExpressionValue(uVar, "success(...)");
                return uVar;
            }
        }
        iVar = new sc.i(this, cVar);
        obj = iVar.f23452a;
        lf.a aVar2 = lf.a.f20034a;
        i10 = iVar.f23454c;
        if (i10 != 0) {
        }
        if (obj != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object k(e3.j jVar, Context context, int i5, mf.c cVar) {
        vc.b bVar;
        int i10;
        int a7;
        int intValue;
        Object uVar;
        try {
            if (cVar instanceof vc.b) {
                bVar = (vc.b) cVar;
                int i11 = bVar.f24552e;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    bVar.f24552e = i11 - Integer.MIN_VALUE;
                    Object obj = bVar.f24550c;
                    lf.a aVar = lf.a.f20034a;
                    i10 = bVar.f24552e;
                    if (i10 != 0) {
                        h8.b.B(obj);
                        if (i5 > 10) {
                            e3.s sVar = new e3.s();
                            Intrinsics.checkNotNullExpressionValue(sVar, "failure(...)");
                            return sVar;
                        }
                        a7 = jVar.a("AnnouncementId", 0);
                        if (a7 <= 0) {
                            e3.s sVar2 = new e3.s();
                            Intrinsics.checkNotNullExpressionValue(sVar2, "failure(...)");
                            return sVar2;
                        }
                        bVar.f24548a = context;
                        bVar.f24549b = a7;
                        bVar.f24552e = 1;
                        la.d dVar = (la.d) y3.m(la.d.class, null, 6);
                        dVar.getClass();
                        lg.e eVar = eg.m0.f9201a;
                        obj = eg.c0.A(lg.d.f20063c, new bd.i(a7, 5, dVar, (Continuation) null), bVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a7 = bVar.f24549b;
                        context = bVar.f24548a;
                        h8.b.B(obj);
                    }
                    intValue = ((Number) obj).intValue();
                    if (intValue != 200) {
                        if (intValue == 401) {
                            uVar = new e3.t();
                        } else if (intValue != 404) {
                            uVar = new e3.s();
                        }
                        Intrinsics.checkNotNull(uVar);
                        return uVar;
                    }
                    x1.b.a(context).b(new Intent("Announcement").putExtra("AnnouncementId", a7));
                    uVar = new e3.u();
                    Intrinsics.checkNotNull(uVar);
                    return uVar;
                }
            }
            if (i10 != 0) {
            }
            intValue = ((Number) obj).intValue();
            if (intValue != 200) {
            }
            x1.b.a(context).b(new Intent("Announcement").putExtra("AnnouncementId", a7));
            uVar = new e3.u();
            Intrinsics.checkNotNull(uVar);
            return uVar;
        } catch (Exception unused) {
            e3.t tVar = new e3.t();
            Intrinsics.checkNotNull(tVar);
            return tVar;
        }
        bVar = new vc.b(this, cVar);
        Object obj2 = bVar.f24550c;
        lf.a aVar2 = lf.a.f20034a;
        i10 = bVar.f24552e;
    }
}
