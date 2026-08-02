package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.sofascore.results.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class f61 extends hoi implements ct8 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ Object t;
    public Object u;
    public Object v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f61(rq3 rq3Var, od7 od7Var, List list, Map map) {
        super(3, rq3Var);
        this.r = 2;
        this.v = od7Var;
        this.w = list;
        this.x = map;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.r;
        Object obj4 = this.x;
        switch (i) {
            case 0:
                f61 f61Var = new f61((Context) this.v, (kch) this.w, (Function1) obj4, (rq3) obj3, 0);
                f61Var.u = (Bitmap) obj;
                f61Var.t = obj2;
                return f61Var.invokeSuspend(Unit.a);
            case 1:
                f61 f61Var2 = new f61((vh9) obj4, (rq3) obj3);
                f61Var2.w = (ghe) obj;
                f61Var2.t = (ik9) obj2;
                return f61Var2.invokeSuspend(Unit.a);
            case 2:
                f61 f61Var3 = new f61((rq3) obj3, (od7) this.v, (List) this.w, (Map) obj4);
                f61Var3.u = (b98) obj;
                f61Var3.t = obj2;
                return f61Var3.invokeSuspend(Unit.a);
            default:
                f61 f61Var4 = new f61((Long) this.v, (Long) this.w, (Long) obj4, (rq3) obj3, 3);
                f61Var4.u = (k4h) obj;
                f61Var4.t = (yj9) obj2;
                return f61Var4.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x03d9, code lost:
    
        if (kotlin.text.c.o(r9, r3.c, true) != false) goto L143;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x044b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[LOOP:0: B:151:0x03f1->B:161:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04c6  */
    /* JADX WARN: Type inference failed for: r7v11, types: [ik9] */
    /* JADX WARN: Type inference failed for: r7v18, types: [ik9] */
    /* JADX WARN: Type inference failed for: r7v20, types: [ik9] */
    /* JADX WARN: Type inference failed for: r7v22, types: [ik9] */
    /* JADX WARN: Type inference failed for: r7v27, types: [ik9] */
    /* JADX WARN: Type inference failed for: r7v7, types: [ik9] */
    /* JADX WARN: Type inference failed for: r7v9, types: [ik9] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ghe gheVar;
        h5k h5kVar;
        Object Q;
        ghe gheVar2;
        h5k h5kVar2;
        boolean z;
        Object d;
        h5k h5kVar3;
        boolean z2;
        Object d2;
        Object d3;
        Object V;
        ghe gheVar3;
        Object Q2;
        ghe gheVar4;
        h5k h5kVar4;
        Object d4;
        Object d5;
        Object d6;
        Object d7;
        h5k h5kVar5;
        rq3 rq3Var;
        int i = this.r;
        Object obj2 = this.x;
        int i2 = 1;
        rq3 rq3Var2 = null;
        switch (i) {
            case 0:
                Context context = (Context) this.v;
                Bitmap bitmap = (Bitmap) this.u;
                Object obj3 = this.t;
                Object obj4 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    nv.x(context, ((kch) this.w).a, null, ((Number) ((Function1) obj2).invoke(obj3)).intValue(), null);
                    this.u = null;
                    this.t = null;
                    this.s = 1;
                    hs4 hs4Var = z45.a;
                    Object R = xw3.R(hq4.c, new rch(context, bitmap, rq3Var2, 1), this);
                    Object obj5 = R;
                    if (R != obj4) {
                        obj5 = Unit.a;
                    }
                    if (obj5 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Calendar calendar = ke0.a;
                ke0.f(R.string.save_image_confirmation, context);
                return Unit.a;
            case 1:
                lu3 lu3Var = lu3.a;
                int i4 = 7;
                int i5 = 3;
                switch (this.s) {
                    case 0:
                        y6a.M(obj);
                        gheVar = (ghe) this.w;
                        ik9 ik9Var = (ik9) this.t;
                        h5kVar = ik9Var.a;
                        Object obj6 = ik9Var.b;
                        if (!(obj6 instanceof db2)) {
                            return Unit.a;
                        }
                        Object obj7 = gheVar.a;
                        aq4 d8 = ((xh9) obj7).d();
                        KClass kClass = h5kVar.a;
                        fuf fufVar = duf.a;
                        if (Intrinsics.c(kClass, fufVar.getOrCreateKotlinClass(Unit.class))) {
                            fkf.y((db2) obj6);
                            ik9 ik9Var2 = new ik9(h5kVar, Unit.a);
                            this.w = gheVar;
                            this.t = h5kVar;
                            this.s = 1;
                            d4 = gheVar.d(this, ik9Var2);
                            if (d4 != lu3Var) {
                                h5kVar3 = h5kVar;
                                rq3Var = (ik9) d4;
                                h5kVar = h5kVar3;
                                rq3Var2 = rq3Var;
                                if (rq3Var2 != null) {
                                    lu4.a.l("Transformed with default transformers response body for " + ((xh9) gheVar.a).c().getUrl() + " to " + h5kVar.a);
                                }
                                return Unit.a;
                            }
                        } else if (Intrinsics.c(kClass, fufVar.getOrCreateKotlinClass(Integer.TYPE))) {
                            this.w = gheVar;
                            this.t = h5kVar;
                            this.u = gheVar;
                            this.v = h5kVar;
                            this.s = 2;
                            Q2 = l6g.Q((db2) obj6, this);
                            if (Q2 != lu3Var) {
                                gheVar4 = gheVar;
                                h5kVar4 = h5kVar;
                                bwh bwhVar = (bwh) Q2;
                                bwhVar.getClass();
                                ik9 ik9Var3 = new ik9(h5kVar4, new Integer(Integer.parseInt(qha.P(bwhVar))));
                                this.w = gheVar;
                                this.t = h5kVar;
                                this.u = null;
                                this.v = null;
                                this.s = 3;
                                d5 = gheVar4.d(this, ik9Var3);
                                if (d5 != lu3Var) {
                                    h5kVar3 = h5kVar;
                                    rq3Var = (ik9) d5;
                                    h5kVar = h5kVar3;
                                    rq3Var2 = rq3Var;
                                    if (rq3Var2 != null) {
                                    }
                                    return Unit.a;
                                }
                            }
                        } else if (Intrinsics.c(kClass, fufVar.getOrCreateKotlinClass(bwh.class)) || Intrinsics.c(kClass, fufVar.getOrCreateKotlinClass(bwh.class))) {
                            this.w = gheVar;
                            this.t = h5kVar;
                            this.u = gheVar;
                            this.v = h5kVar;
                            this.s = 4;
                            Q = l6g.Q((db2) obj6, this);
                            if (Q != lu3Var) {
                                gheVar2 = gheVar;
                                h5kVar2 = h5kVar;
                                ik9 ik9Var4 = new ik9(h5kVar2, Q);
                                this.w = gheVar;
                                this.t = h5kVar;
                                this.u = null;
                                this.v = null;
                                this.s = 5;
                                d6 = gheVar2.d(this, ik9Var4);
                                if (d6 != lu3Var) {
                                    h5kVar3 = h5kVar;
                                    rq3Var = (ik9) d6;
                                    h5kVar = h5kVar3;
                                    rq3Var2 = rq3Var;
                                    if (rq3Var2 != null) {
                                    }
                                    return Unit.a;
                                }
                            }
                        } else {
                            int i6 = 6;
                            if (Intrinsics.c(kClass, fufVar.getOrCreateKotlinClass(byte[].class))) {
                                this.w = gheVar;
                                this.t = h5kVar;
                                this.s = 6;
                                V = l6g.V((db2) obj6, this);
                                if (V != lu3Var) {
                                    gheVar3 = gheVar;
                                    i2a.t(xw3.B(((xh9) gheVar3.a).d()), r2.length, ((xh9) gheVar3.a).c().getMethod());
                                    ik9 ik9Var5 = new ik9(h5kVar, (byte[]) V);
                                    this.w = gheVar3;
                                    this.t = h5kVar;
                                    this.s = 7;
                                    d7 = gheVar3.d(this, ik9Var5);
                                    if (d7 != lu3Var) {
                                        h5kVar5 = h5kVar;
                                        h5kVar = h5kVar5;
                                        gheVar = gheVar3;
                                        rq3Var2 = (ik9) d7;
                                        if (rq3Var2 != null) {
                                        }
                                        return Unit.a;
                                    }
                                }
                            } else if (Intrinsics.c(kClass, fufVar.getOrCreateKotlinClass(db2.class))) {
                                aea aeaVar = new aea((yda) d8.getCoroutineContext().get(uic.g));
                                CoroutineContext coroutineContext = ((vh9) obj2).d;
                                rh4 rh4Var = new rh4(obj6, d8, rq3Var2, i5);
                                jc2 jc2Var = kc2.a;
                                coroutineContext.getClass();
                                va2 va2Var = new va2();
                                g9i L = xw3.L(gheVar, coroutineContext, null, new u1(rh4Var, va2Var, rq3Var2, i6), 2);
                                L.n(new ic2(va2Var, 0));
                                L.n(new kz3(aeaVar, i4));
                                ik9 ik9Var6 = new ik9(h5kVar, va2Var);
                                this.w = gheVar;
                                this.t = h5kVar;
                                this.s = 8;
                                d3 = gheVar.d(this, ik9Var6);
                                if (d3 != lu3Var) {
                                    h5kVar3 = h5kVar;
                                    rq3Var = (ik9) d3;
                                    h5kVar = h5kVar3;
                                    rq3Var2 = rq3Var;
                                    if (rq3Var2 != null) {
                                    }
                                    return Unit.a;
                                }
                            } else {
                                if (!Intrinsics.c(kClass, fufVar.getOrCreateKotlinClass(zk9.class))) {
                                    if (Intrinsics.c(kClass, fufVar.getOrCreateKotlinClass(ad2.class))) {
                                        xh9 xh9Var = (xh9) obj7;
                                        o89 a = xh9Var.d().a();
                                        List list = zi9.a;
                                        String str = a.get("Content-Type");
                                        if (str == null) {
                                            a70.r("No content type provided for multipart");
                                            return null;
                                        }
                                        up3 up3Var = up3.e;
                                        up3 G = yqo.G(str);
                                        up3 up3Var2 = sp3.a;
                                        G.getClass();
                                        up3Var2.getClass();
                                        String str2 = up3Var2.c;
                                        String str3 = up3Var2.d;
                                        if (!Intrinsics.c(str2, "*")) {
                                            z = true;
                                            break;
                                        } else {
                                            z = true;
                                        }
                                        if (Intrinsics.c(str3, "*") || c.o(str3, G.d, z)) {
                                            for (h89 h89Var : up3Var2.b) {
                                                String str4 = h89Var.a;
                                                String str5 = h89Var.b;
                                                if (Intrinsics.c(str4, "*")) {
                                                    if (Intrinsics.c(str5, "*")) {
                                                        z2 = true;
                                                    } else {
                                                        List list2 = G.b;
                                                        if (list2 == null || !list2.isEmpty()) {
                                                            Iterator it = list2.iterator();
                                                            while (it.hasNext()) {
                                                                z2 = true;
                                                                if (c.o(((h89) it.next()).b, str5, true)) {
                                                                }
                                                            }
                                                        }
                                                        z2 = false;
                                                    }
                                                    if (!z2) {
                                                    }
                                                } else {
                                                    z2 = true;
                                                    String a2 = G.a(str4);
                                                    if (Intrinsics.c(str5, "*")) {
                                                        if (a2 != null) {
                                                        }
                                                        z2 = false;
                                                    } else {
                                                        z2 = c.o(a2, str5, true);
                                                    }
                                                    if (!z2) {
                                                    }
                                                }
                                            }
                                            o89 a3 = xh9Var.d().a();
                                            List list3 = zi9.a;
                                            String str6 = a3.get("Content-Length");
                                            ik9 ik9Var7 = new ik9(h5kVar, new ad2(gheVar.getCoroutineContext(), (db2) obj6, str, str6 != null ? new Long(Long.parseLong(str6)) : null));
                                            this.w = gheVar;
                                            this.t = h5kVar;
                                            this.s = 10;
                                            d = gheVar.d(this, ik9Var7);
                                            if (d != lu3Var) {
                                                h5kVar3 = h5kVar;
                                                rq3Var = (ik9) d;
                                                h5kVar = h5kVar3;
                                                rq3Var2 = rq3Var;
                                            }
                                        }
                                        i3c.i(G, "Expected multipart/form-data, got ");
                                        return null;
                                    }
                                    if (rq3Var2 != null) {
                                    }
                                    return Unit.a;
                                }
                                fkf.y((db2) obj6);
                                ik9 ik9Var8 = new ik9(h5kVar, d8.d());
                                this.w = gheVar;
                                this.t = h5kVar;
                                this.s = 9;
                                d2 = gheVar.d(this, ik9Var8);
                                if (d2 != lu3Var) {
                                    h5kVar3 = h5kVar;
                                    rq3Var = (ik9) d2;
                                    h5kVar = h5kVar3;
                                    rq3Var2 = rq3Var;
                                    if (rq3Var2 != null) {
                                    }
                                    return Unit.a;
                                }
                            }
                        }
                        return lu3Var;
                    case 1:
                        h5kVar3 = (h5k) this.t;
                        ghe gheVar5 = (ghe) this.w;
                        y6a.M(obj);
                        gheVar = gheVar5;
                        d4 = obj;
                        rq3Var = (ik9) d4;
                        h5kVar = h5kVar3;
                        rq3Var2 = rq3Var;
                        if (rq3Var2 != null) {
                        }
                        return Unit.a;
                    case 2:
                        h5k h5kVar6 = (h5k) this.v;
                        ghe gheVar6 = (ghe) this.u;
                        h5k h5kVar7 = (h5k) this.t;
                        ghe gheVar7 = (ghe) this.w;
                        y6a.M(obj);
                        h5kVar = h5kVar7;
                        gheVar = gheVar7;
                        gheVar4 = gheVar6;
                        h5kVar4 = h5kVar6;
                        Q2 = obj;
                        bwh bwhVar2 = (bwh) Q2;
                        bwhVar2.getClass();
                        ik9 ik9Var32 = new ik9(h5kVar4, new Integer(Integer.parseInt(qha.P(bwhVar2))));
                        this.w = gheVar;
                        this.t = h5kVar;
                        this.u = null;
                        this.v = null;
                        this.s = 3;
                        d5 = gheVar4.d(this, ik9Var32);
                        if (d5 != lu3Var) {
                        }
                        return lu3Var;
                    case 3:
                        h5kVar3 = (h5k) this.t;
                        ghe gheVar8 = (ghe) this.w;
                        y6a.M(obj);
                        gheVar = gheVar8;
                        d5 = obj;
                        rq3Var = (ik9) d5;
                        h5kVar = h5kVar3;
                        rq3Var2 = rq3Var;
                        if (rq3Var2 != null) {
                        }
                        return Unit.a;
                    case 4:
                        h5k h5kVar8 = (h5k) this.v;
                        ghe gheVar9 = (ghe) this.u;
                        h5k h5kVar9 = (h5k) this.t;
                        ghe gheVar10 = (ghe) this.w;
                        y6a.M(obj);
                        h5kVar = h5kVar9;
                        gheVar = gheVar10;
                        gheVar2 = gheVar9;
                        h5kVar2 = h5kVar8;
                        Q = obj;
                        ik9 ik9Var42 = new ik9(h5kVar2, Q);
                        this.w = gheVar;
                        this.t = h5kVar;
                        this.u = null;
                        this.v = null;
                        this.s = 5;
                        d6 = gheVar2.d(this, ik9Var42);
                        if (d6 != lu3Var) {
                        }
                        return lu3Var;
                    case 5:
                        h5kVar3 = (h5k) this.t;
                        ghe gheVar11 = (ghe) this.w;
                        y6a.M(obj);
                        gheVar = gheVar11;
                        d6 = obj;
                        rq3Var = (ik9) d6;
                        h5kVar = h5kVar3;
                        rq3Var2 = rq3Var;
                        if (rq3Var2 != null) {
                        }
                        return Unit.a;
                    case 6:
                        h5k h5kVar10 = (h5k) this.t;
                        gheVar3 = (ghe) this.w;
                        y6a.M(obj);
                        h5kVar = h5kVar10;
                        V = obj;
                        i2a.t(xw3.B(((xh9) gheVar3.a).d()), r2.length, ((xh9) gheVar3.a).c().getMethod());
                        ik9 ik9Var52 = new ik9(h5kVar, (byte[]) V);
                        this.w = gheVar3;
                        this.t = h5kVar;
                        this.s = 7;
                        d7 = gheVar3.d(this, ik9Var52);
                        if (d7 != lu3Var) {
                        }
                        return lu3Var;
                    case 7:
                        h5kVar5 = (h5k) this.t;
                        ghe gheVar12 = (ghe) this.w;
                        y6a.M(obj);
                        gheVar3 = gheVar12;
                        d7 = obj;
                        h5kVar = h5kVar5;
                        gheVar = gheVar3;
                        rq3Var2 = (ik9) d7;
                        if (rq3Var2 != null) {
                        }
                        return Unit.a;
                    case 8:
                        h5kVar3 = (h5k) this.t;
                        ghe gheVar13 = (ghe) this.w;
                        y6a.M(obj);
                        gheVar = gheVar13;
                        d3 = obj;
                        rq3Var = (ik9) d3;
                        h5kVar = h5kVar3;
                        rq3Var2 = rq3Var;
                        if (rq3Var2 != null) {
                        }
                        return Unit.a;
                    case 9:
                        h5kVar3 = (h5k) this.t;
                        ghe gheVar14 = (ghe) this.w;
                        y6a.M(obj);
                        gheVar = gheVar14;
                        d2 = obj;
                        rq3Var = (ik9) d2;
                        h5kVar = h5kVar3;
                        rq3Var2 = rq3Var;
                        if (rq3Var2 != null) {
                        }
                        return Unit.a;
                    case 10:
                        h5kVar3 = (h5k) this.t;
                        ghe gheVar15 = (ghe) this.w;
                        y6a.M(obj);
                        gheVar = gheVar15;
                        d = obj;
                        rq3Var = (ik9) d;
                        h5kVar = h5kVar3;
                        rq3Var2 = rq3Var;
                        if (rq3Var2 != null) {
                        }
                        return Unit.a;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 2:
                b98 b98Var = (b98) this.u;
                Object obj8 = this.t;
                lu3 lu3Var2 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    z88 z88Var = ((g5e) obj8).a;
                    this.u = null;
                    this.t = null;
                    this.s = 1;
                    kik.n(b98Var);
                    Object collect = z88Var.collect(new yn2(b98Var, (od7) this.v, (List) this.w, (Map) obj2), this);
                    if (collect != lu3Var2) {
                        collect = Unit.a;
                    }
                    if (collect != lu3Var2) {
                        collect = Unit.a;
                    }
                    if (collect == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            default:
                Long l = (Long) obj2;
                Long l2 = (Long) this.w;
                Long l3 = (Long) this.v;
                lu3 lu3Var3 = lu3.a;
                int i8 = this.s;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                k4h k4hVar = (k4h) this.u;
                yj9 yj9Var = (yj9) this.t;
                bjb bjbVar = dl9.a;
                o8k c = yj9Var.a.c();
                c.getClass();
                String str7 = c.a;
                boolean z3 = (str7.equals("ws") || str7.equals("wss")) ? false : true;
                Map map = (Map) yj9Var.f.d(ei9.a);
                rq3 rq3Var3 = null;
                bl9 bl9Var = (bl9) (map != null ? map.get(al9.a) : null);
                if (bl9Var == null && ((z3 && l3 != null) || l2 != null || l != null)) {
                    bl9Var = new bl9();
                    yj9Var.c(bl9Var);
                }
                if (bl9Var != null) {
                    Long l4 = bl9Var.b;
                    if (l4 != null) {
                        l2 = l4;
                    }
                    bl9.a(l2);
                    bl9Var.b = l2;
                    Long l5 = bl9Var.c;
                    if (l5 != null) {
                        l = l5;
                    }
                    bl9.a(l);
                    bl9Var.c = l;
                    if (z3) {
                        Long l6 = bl9Var.a;
                        if (l6 != null) {
                            l3 = l6;
                        }
                        bl9Var.b(l3);
                        Long l7 = bl9Var.a;
                        if (l7 != null && l7.longValue() != Long.MAX_VALUE) {
                            yj9Var.e.n(new cw2(xw3.L(k4hVar, new gu3("request-timeout"), null, new zi7(l7, yj9Var, yj9Var.e, rq3Var3, 12), 2), i2));
                        }
                    }
                }
                this.u = null;
                this.s = 1;
                Object a4 = k4hVar.a.a(yj9Var, this);
                return a4 == lu3Var3 ? lu3Var3 : a4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f61(vh9 vh9Var, rq3 rq3Var) {
        super(3, rq3Var);
        this.r = 1;
        this.x = vh9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f61(Object obj, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(3, rq3Var);
        this.r = i;
        this.v = obj;
        this.w = obj2;
        this.x = obj3;
    }
}
