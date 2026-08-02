package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c37 extends hoi implements ct8 {
    public final /* synthetic */ int r;
    public Object s;
    public int t;
    public /* synthetic */ Object u;
    public /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c37(rq3 rq3Var, j67 j67Var, e37 e37Var) {
        super(3, rq3Var);
        this.r = 0;
        this.v = j67Var;
        this.w = e37Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.r;
        Object obj4 = this.w;
        switch (i) {
            case 0:
                c37 c37Var = new c37((rq3) obj3, (j67) this.v, (e37) obj4);
                c37Var.s = (b98) obj;
                c37Var.u = obj2;
                return c37Var.invokeSuspend(Unit.a);
            case 1:
                c37 c37Var2 = new c37((Function2) obj4, (rq3) obj3, 1);
                c37Var2.v = (b98) obj;
                c37Var2.u = obj2;
                return c37Var2.invokeSuspend(Unit.a);
            case 2:
                c37 c37Var3 = new c37((rq3) obj3, (et8) obj4, 2);
                c37Var3.u = (b98) obj;
                c37Var3.v = (Object[]) obj2;
                return c37Var3.invokeSuspend(Unit.a);
            case 3:
                c37 c37Var4 = new c37((rq3) obj3, (mr7) obj4, 3);
                c37Var4.u = (b98) obj;
                c37Var4.v = (Object[]) obj2;
                return c37Var4.invokeSuspend(Unit.a);
            case 4:
                c37 c37Var5 = new c37((rq3) obj3, (gt8) obj4, 4);
                c37Var5.u = (b98) obj;
                c37Var5.v = (Object[]) obj2;
                return c37Var5.invokeSuspend(Unit.a);
            case 5:
                c37 c37Var6 = new c37((ct8) obj4, (rq3) obj3, 5);
                c37Var6.u = (b98) obj;
                c37Var6.v = (Object[]) obj2;
                return c37Var6.invokeSuspend(Unit.a);
            case 6:
                c37 c37Var7 = new c37((vh9) this.v, (cy) obj4, (rq3) obj3, 6);
                c37Var7.s = (ghe) obj;
                c37Var7.u = obj2;
                return c37Var7.invokeSuspend(Unit.a);
            case 7:
                c37 c37Var8 = new c37((tk9) this.v, (vh9) obj4, (rq3) obj3, 7);
                c37Var8.s = (ghe) obj;
                c37Var8.u = obj2;
                return c37Var8.invokeSuspend(Unit.a);
            default:
                c37 c37Var9 = new c37((ct8) this.v, (vh9) obj4, (rq3) obj3, 8);
                c37Var9.s = (m4h) obj;
                c37Var9.u = (yj9) obj2;
                return c37Var9.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x02fb, code lost:
    
        if (r0.emit(r1, r5) == r9) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02ec, code lost:
    
        if (r1 == r9) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x035a, code lost:
    
        if (r9.emit(r0, r5) == r10) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x034b, code lost:
    
        if (r0 == r10) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03b2, code lost:
    
        if (r9.emit(r0, r5) == r10) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03a3, code lost:
    
        if (r0 == r10) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0403, code lost:
    
        if (r0.emit(r1, r5) == r9) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03f4, code lost:
    
        if (r1 == r9) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x044c, code lost:
    
        if (r0.emit(r1, r5) == r2) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x043d, code lost:
    
        if (r1 == r2) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c1, code lost:
    
        if (r2.d(r5, (defpackage.xh9) r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
    
        if (r0 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0284, code lost:
    
        if (r4.d(r5, r6) == r2) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0223, code lost:
    
        if (r3 == r2) goto L86;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object invoke;
        Object invoke2;
        Object invoke3;
        Object invoke4;
        Object invoke5;
        ghe gheVar;
        KType kType;
        zj9 zj9Var;
        Object z;
        KType kType2;
        ghe gheVar2;
        Object a;
        c37 c37Var = this;
        int i = c37Var.r;
        Object obj2 = c37Var.w;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                e37 e37Var = (e37) obj2;
                b98 b98Var = (b98) c37Var.s;
                Object obj3 = c37Var.u;
                lu3 lu3Var = lu3.a;
                int i2 = c37Var.t;
                if (i2 == 0) {
                    y6a.M(obj);
                    k4e k4eVar = new k4e(new ej(new gi(10, (j67) c37Var.v, (fo1) obj3, e37Var), rq3Var, 6), new k9(30, 58));
                    c37Var.s = null;
                    c37Var.u = null;
                    c37Var.t = 1;
                    kik.n(b98Var);
                    Object collect = k4eVar.e.collect(new nk0(8, b98Var, e37Var), c37Var);
                    if (collect != lu3Var) {
                        collect = Unit.a;
                    }
                    if (collect != lu3Var) {
                        collect = Unit.a;
                    }
                    if (collect == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 1:
                b98 b98Var2 = (b98) c37Var.v;
                Object obj4 = c37Var.u;
                lu3 lu3Var2 = lu3.a;
                int i3 = c37Var.t;
                if (i3 == 0) {
                    y6a.M(obj);
                    c37Var.v = null;
                    c37Var.u = null;
                    c37Var.s = b98Var2;
                    c37Var.t = 1;
                    invoke = ((Function2) obj2).invoke(obj4, c37Var);
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b98Var2 = (b98) c37Var.s;
                    y6a.M(obj);
                    invoke = obj;
                }
                c37Var.v = null;
                c37Var.u = null;
                c37Var.s = null;
                c37Var.t = 2;
                break;
            case 2:
                b98 b98Var3 = (b98) c37Var.u;
                Object[] objArr = (Object[]) c37Var.v;
                lu3 lu3Var3 = lu3.a;
                int i4 = c37Var.t;
                if (i4 == 0) {
                    y6a.M(obj);
                    Object obj5 = objArr[0];
                    Object obj6 = objArr[1];
                    Object obj7 = objArr[2];
                    c37Var.u = null;
                    c37Var.v = null;
                    c37Var.s = b98Var3;
                    c37Var.t = 1;
                    invoke2 = ((et8) obj2).invoke(obj5, obj6, obj7, c37Var);
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b98Var3 = (b98) c37Var.s;
                    y6a.M(obj);
                    invoke2 = obj;
                }
                c37Var.u = null;
                c37Var.v = null;
                c37Var.s = null;
                c37Var.t = 2;
                break;
            case 3:
                b98 b98Var4 = (b98) c37Var.u;
                Object[] objArr2 = (Object[]) c37Var.v;
                lu3 lu3Var4 = lu3.a;
                int i5 = c37Var.t;
                if (i5 == 0) {
                    y6a.M(obj);
                    mr7 mr7Var = (mr7) obj2;
                    Object obj8 = objArr2[0];
                    Object obj9 = objArr2[1];
                    Object obj10 = objArr2[2];
                    Object obj11 = objArr2[3];
                    c37Var.u = null;
                    c37Var.v = null;
                    c37Var.s = b98Var4;
                    c37Var.t = 1;
                    invoke3 = mr7Var.invoke(obj8, obj9, obj10, obj11, c37Var);
                    break;
                } else {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b98Var4 = (b98) c37Var.s;
                    y6a.M(obj);
                    invoke3 = obj;
                }
                c37Var.u = null;
                c37Var.v = null;
                c37Var.s = null;
                c37Var.t = 2;
                break;
            case 4:
                b98 b98Var5 = (b98) c37Var.u;
                Object[] objArr3 = (Object[]) c37Var.v;
                lu3 lu3Var5 = lu3.a;
                int i6 = c37Var.t;
                if (i6 == 0) {
                    y6a.M(obj);
                    gt8 gt8Var = (gt8) obj2;
                    Object obj12 = objArr3[0];
                    Object obj13 = objArr3[1];
                    Object obj14 = objArr3[2];
                    Object obj15 = objArr3[3];
                    Object obj16 = objArr3[4];
                    c37Var.u = null;
                    c37Var.v = null;
                    c37Var.s = b98Var5;
                    c37Var.t = 1;
                    invoke4 = gt8Var.invoke(obj12, obj13, obj14, obj15, obj16, c37Var);
                    c37Var = c37Var;
                    break;
                } else {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b98Var5 = (b98) c37Var.s;
                    y6a.M(obj);
                    invoke4 = obj;
                }
                c37Var.u = null;
                c37Var.v = null;
                c37Var.s = null;
                c37Var.t = 2;
                break;
            case 5:
                b98 b98Var6 = (b98) c37Var.u;
                Object[] objArr4 = (Object[]) c37Var.v;
                lu3 lu3Var6 = lu3.a;
                int i7 = c37Var.t;
                if (i7 == 0) {
                    y6a.M(obj);
                    Object obj17 = objArr4[0];
                    Object obj18 = objArr4[1];
                    c37Var.u = null;
                    c37Var.v = null;
                    c37Var.s = b98Var6;
                    c37Var.t = 1;
                    invoke5 = ((ct8) obj2).invoke(obj17, obj18, c37Var);
                    break;
                } else {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b98Var6 = (b98) c37Var.s;
                    y6a.M(obj);
                    invoke5 = obj;
                }
                c37Var.u = null;
                c37Var.v = null;
                c37Var.s = null;
                c37Var.t = 2;
                break;
            case 6:
                cy cyVar = (cy) obj2;
                vh9 vh9Var = (vh9) c37Var.v;
                de0 de0Var = vh9Var.j;
                lu3 lu3Var7 = lu3.a;
                int i8 = c37Var.t;
                if (i8 == 0) {
                    y6a.M(obj);
                    gheVar = (ghe) c37Var.s;
                    Object obj19 = c37Var.u;
                    yj9 yj9Var = new yj9();
                    yj9 yj9Var2 = (yj9) gheVar.a;
                    yj9Var2.getClass();
                    yj9Var.e = yj9Var2.e;
                    yj9Var.e(yj9Var2);
                    if (obj19 == null) {
                        yj9Var.d = kid.a;
                        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Object.class);
                        try {
                            kType2 = duf.b(Object.class);
                        } catch (Throwable unused) {
                            kType2 = null;
                        }
                        yj9Var.b(new h5k(orCreateKotlinClass, kType2));
                    } else if (obj19 instanceof swd) {
                        yj9Var.d = obj19;
                        yj9Var.b(null);
                    } else {
                        yj9Var.d = obj19;
                        KClass orCreateKotlinClass2 = duf.a.getOrCreateKotlinClass(Object.class);
                        try {
                            kType = duf.b(Object.class);
                        } catch (Throwable unused2) {
                            kType = null;
                        }
                        yj9Var.b(new h5k(orCreateKotlinClass2, kType));
                    }
                    de0Var.B(n4o.b);
                    lek b = yj9Var.a.b();
                    ij9 ij9Var = yj9Var.b;
                    w89 w89Var = new w89((Map) yj9Var.c.b);
                    Object obj20 = yj9Var.d;
                    swd swdVar = obj20 instanceof swd ? (swd) obj20 : null;
                    if (swdVar == null) {
                        pvd.z(yj9Var.d, "No request transformation found: ");
                        return null;
                    }
                    smi smiVar = yj9Var.e;
                    xh3 xh3Var = yj9Var.f;
                    zj9Var = new zj9(b, ij9Var, w89Var, swdVar, smiVar, xh3Var);
                    xh3Var.e(gi9.b, vh9Var.k);
                    Set keySet = w89Var.c.keySet();
                    keySet.getClass();
                    Set unmodifiableSet = Collections.unmodifiableSet(keySet);
                    unmodifiableSet.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj21 : unmodifiableSet) {
                        if (zi9.a.contains((String) obj21)) {
                            arrayList.add(obj21);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        String obj22 = arrayList.toString();
                        obj22.getClass();
                        throw new gk4("Header(s) " + obj22 + " are controlled by the engine and cannot be set explicitly");
                    }
                    for (di9 di9Var : zj9Var.g) {
                        if (!cyVar.e.contains(di9Var)) {
                            hg6.e(di9Var, "Engine doesn't support ");
                            return null;
                        }
                    }
                    c37Var.s = gheVar;
                    c37Var.u = zj9Var;
                    c37Var.t = 1;
                    z = ao2.z(cyVar, zj9Var, c37Var);
                    break;
                } else {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zj9 zj9Var2 = (zj9) c37Var.u;
                    gheVar = (ghe) c37Var.s;
                    y6a.M(obj);
                    zj9Var = zj9Var2;
                    z = obj;
                }
                jk9 jk9Var = (jk9) z;
                zj9Var.getClass();
                jk9Var.getClass();
                xh9 xh9Var = new xh9(vh9Var);
                xh9Var.b = new zp4(xh9Var, zj9Var);
                xh9Var.c = new aq4(xh9Var, jk9Var);
                xh3 attributes = xh9Var.getAttributes();
                pm0 pm0Var = xh9.e;
                attributes.getClass();
                pm0Var.getClass();
                attributes.c().remove(pm0Var);
                Object obj23 = jk9Var.e;
                if (!(obj23 instanceof db2)) {
                    xh9Var.getAttributes().e(pm0Var, obj23);
                }
                aq4 d = xh9Var.d();
                de0Var.B(n4o.c);
                bea.x(d.getCoroutineContext()).n(new th9(vh9Var, d));
                c37Var.s = null;
                c37Var.u = null;
                c37Var.t = 2;
                break;
            case 7:
                tk9 tk9Var = (tk9) c37Var.v;
                lu3 lu3Var8 = lu3.a;
                int i9 = c37Var.t;
                if (i9 == 0) {
                    y6a.M(obj);
                    gheVar2 = (ghe) c37Var.s;
                    Object obj24 = c37Var.u;
                    if (!(obj24 instanceof swd)) {
                        hc5.f(dii.d("\n|Fail to prepare request body for sending. \n|The body type is: " + duf.a.getOrCreateKotlinClass(obj24.getClass()) + ", with Content-Type: " + xw3.C((hj9) gheVar2.a) + ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header."));
                        return null;
                    }
                    yj9 yj9Var3 = (yj9) gheVar2.a;
                    yj9Var3.getClass();
                    yj9Var3.d = obj24;
                    yj9Var3.b(null);
                    m4h rk9Var = new rk9((vh9) obj2);
                    Iterator it = CollectionsKt.B0(tk9Var.a).iterator();
                    while (it.hasNext()) {
                        rk9Var = new sk9((ct8) it.next(), rk9Var);
                    }
                    yj9 yj9Var4 = (yj9) gheVar2.a;
                    c37Var.s = gheVar2;
                    c37Var.t = 1;
                    a = rk9Var.a(yj9Var4, c37Var);
                    break;
                } else {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ghe gheVar3 = (ghe) c37Var.s;
                    y6a.M(obj);
                    gheVar2 = gheVar3;
                    a = obj;
                }
                c37Var.s = null;
                c37Var.t = 2;
                break;
            default:
                lu3 lu3Var9 = lu3.a;
                int i10 = c37Var.t;
                if (i10 != 0) {
                    if (i10 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                m4h m4hVar = (m4h) c37Var.s;
                yj9 yj9Var5 = (yj9) c37Var.u;
                ct8 ct8Var = (ct8) c37Var.v;
                k4h k4hVar = new k4h(m4hVar, ((vh9) obj2).d);
                c37Var.s = null;
                c37Var.t = 1;
                Object invoke6 = ct8Var.invoke(k4hVar, yj9Var5, c37Var);
                return invoke6 == lu3Var9 ? lu3Var9 : invoke6;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c37(rq3 rq3Var, dt8 dt8Var, int i) {
        super(3, rq3Var);
        this.r = i;
        this.w = dt8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c37(dt8 dt8Var, rq3 rq3Var, int i) {
        super(3, rq3Var);
        this.r = i;
        this.w = dt8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c37(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(3, rq3Var);
        this.r = i;
        this.v = obj;
        this.w = obj2;
    }
}
