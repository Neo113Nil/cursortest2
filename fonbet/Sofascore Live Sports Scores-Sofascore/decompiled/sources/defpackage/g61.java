package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g61 extends hoi implements ct8 {
    public final /* synthetic */ int r = 0;
    public Object s;
    public int t;
    public Object u;
    public Object v;
    public /* synthetic */ Object w;
    public /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g61(Context context, kch kchVar, Function1 function1, Function1 function12, rq3 rq3Var) {
        super(3, rq3Var);
        this.v = context;
        this.w = kchVar;
        this.x = function1;
        this.y = function12;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.r;
        Object obj4 = this.y;
        switch (i) {
            case 0:
                g61 g61Var = new g61((Context) this.v, (kch) this.w, (Function1) this.x, (Function1) obj4, (rq3) obj3);
                g61Var.u = (Bitmap) obj;
                g61Var.s = obj2;
                return g61Var.invokeSuspend(Unit.a);
            default:
                g61 g61Var2 = new g61((k4e) obj4, (rq3) obj3);
                g61Var2.w = (f4e) obj;
                g61Var2.x = (g4e) obj2;
                return g61Var2.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x00ef, code lost:
    
        if (r11 == r4) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0261 A[LOOP:0: B:17:0x025b->B:19:0x0261, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013c  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        f4e f4eVar;
        g4e g4eVar;
        Object a;
        Object a2;
        f4e f4eVar2;
        fsf fsfVar;
        Object b;
        g4e g4eVar2;
        a7e a7eVar;
        fsf fsfVar2;
        Object a3;
        Pair pair;
        a7e a7eVar2;
        Object f;
        fsf fsfVar3;
        a7e a7eVar3;
        Object obj2;
        Object f2;
        fsf fsfVar4;
        Object obj3;
        c7e c7eVar;
        List list;
        Iterator it;
        int i = this.r;
        Object obj4 = this.y;
        switch (i) {
            case 0:
                Context context = (Context) this.v;
                Bitmap bitmap = (Bitmap) this.u;
                Object obj5 = this.s;
                lu3 lu3Var = lu3.a;
                int i2 = this.t;
                if (i2 == 0) {
                    y6a.M(obj);
                    nv.t0(context, ((kch) this.w).a, null, ((Number) ((Function1) this.x).invoke(obj5)).intValue(), null);
                    zic zicVar = zic.g;
                    String str = (String) ((Function1) obj4).invoke(obj5);
                    this.u = null;
                    this.s = null;
                    this.t = 1;
                    if (zicVar.L(context, bitmap, str, this) == lu3Var) {
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
            default:
                k4e k4eVar = (k4e) obj4;
                k9 k9Var = k4eVar.b;
                lu3 lu3Var2 = lu3.a;
                int i3 = 0;
                switch (this.t) {
                    case 0:
                        y6a.M(obj);
                        f4eVar = (f4e) this.w;
                        g4eVar = (g4e) this.x;
                        if (g4eVar != null) {
                            if (f4eVar != null) {
                                a7e a7eVar4 = f4eVar.a.b;
                                this.w = f4eVar;
                                this.x = g4eVar;
                                this.t = 2;
                                a = k4eVar.a(a7eVar4, this);
                                break;
                            } else {
                                this.w = null;
                                this.t = 1;
                                a2 = k4eVar.a(null, this);
                                if (a2 != lu3Var2) {
                                    f4eVar2 = null;
                                    k9 k9Var2 = k4eVar.b;
                                    return new f4e(new x4e(f4eVar2, (a7e) a2, k9Var2, (sj3) k4eVar.d.c, k9Var2.c, null, new y34(0, k4eVar, k4e.class, ToolBar.REFRESH, "refresh(Ljava/lang/Object;)V", 0, 1)), null, bea.a());
                                }
                            }
                        } else {
                            if (f4eVar == null) {
                                a70.p("Append or Prepend request should be sent after a Refresh. This error indicates a bug in the Paging library. Please file a bug report in Buganizer.");
                                return null;
                            }
                            x4e x4eVar = f4eVar.a;
                            g4eVar.getClass();
                            sfb sfbVar = sfb.a;
                            this.w = f4eVar;
                            this.t = 6;
                            if (x4eVar.e(sfbVar, this) != lu3Var2) {
                                return f4eVar;
                            }
                        }
                        return lu3Var2;
                    case 1:
                        f4e f4eVar3 = (f4e) this.w;
                        y6a.M(obj);
                        f4eVar2 = f4eVar3;
                        a2 = obj;
                        k9 k9Var22 = k4eVar.b;
                        return new f4e(new x4e(f4eVar2, (a7e) a2, k9Var22, (sj3) k4eVar.d.c, k9Var22.c, null, new y34(0, k4eVar, k4e.class, ToolBar.REFRESH, "refresh(Ljava/lang/Object;)V", 0, 1)), null, bea.a());
                    case 2:
                        g4eVar = (g4e) this.x;
                        f4eVar = (f4e) this.w;
                        y6a.M(obj);
                        a = obj;
                        g4e g4eVar3 = g4eVar;
                        a7e a7eVar5 = (a7e) a;
                        fsfVar = new fsf();
                        x4e x4eVar2 = f4eVar.a;
                        this.w = f4eVar;
                        this.x = g4eVar3;
                        this.s = a7eVar5;
                        this.u = fsfVar;
                        this.v = fsfVar;
                        this.t = 3;
                        b = x4eVar2.b(this);
                        if (b != lu3Var2) {
                            g4eVar2 = g4eVar3;
                            a7eVar = a7eVar5;
                            fsfVar2 = fsfVar;
                            fsfVar2.a = b;
                            if (((c7e) fsfVar.a).a.isEmpty() && (c7eVar = f4eVar.b) != null && (list = c7eVar.a) != null && (!list.isEmpty())) {
                                fsfVar.a = f4eVar.b;
                            }
                            if (((c7e) fsfVar.a).b == null) {
                                c7e c7eVar2 = f4eVar.b;
                                if ((c7eVar2 != null ? c7eVar2.b : null) != null) {
                                    fsfVar.a = c7eVar2;
                                }
                            }
                            if (!g4eVar2.a.equals(h4e.h) || (((c7e) fsfVar.a).a.isEmpty() && ((c7e) fsfVar.a).b == null)) {
                                a3 = a7eVar.a((c7e) fsfVar.a);
                                if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                                    Objects.toString(a3);
                                    a7eVar.toString();
                                }
                                pair = new Pair(a3, new Integer(k9Var.c));
                                a7eVar2 = a7eVar;
                                int intValue = ((Number) pair.b).intValue();
                                f4eVar.a.j.e(null);
                                f4eVar.c.e(null);
                                return new f4e(new x4e(pair.a, a7eVar2, k4eVar.b, (sj3) k4eVar.d.c, intValue, (c7e) fsfVar.a, new y34(0, k4eVar, k4e.class, ToolBar.REFRESH, "refresh(Ljava/lang/Object;)V", 0, 2)), (c7e) fsfVar.a, bea.a());
                            }
                            q5a q5aVar = g4eVar2.a;
                            if (q5aVar instanceof i4e) {
                                Iterator it2 = ((c7e) fsfVar.a).a.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj2 = it2.next();
                                        if (CollectionsKt.R(((z6e) obj2).a, null)) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                z6e z6eVar = (z6e) obj2;
                                if (z6eVar == null) {
                                    StringBuilder sb = new StringBuilder("Invalid Refresh item. Item ");
                                    sb.append((Object) null);
                                    sb.append(" not found in ");
                                    Iterator it3 = ((c7e) fsfVar.a).a.iterator();
                                    while (it3.hasNext()) {
                                        i3 += ((z6e) it3.next()).a.size();
                                    }
                                    ogj.h(fc6.h(i3, " loaded items.", sb));
                                    return null;
                                }
                                x4e x4eVar3 = f4eVar.a;
                                this.w = f4eVar;
                                this.x = a7eVar;
                                this.s = fsfVar;
                                this.u = null;
                                this.v = null;
                                this.t = 4;
                                f2 = x4eVar3.f(z6eVar, this);
                                if (f2 != lu3Var2) {
                                    fsfVar4 = fsfVar;
                                    obj3 = null;
                                    a7eVar2 = a7eVar;
                                    if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                                        Objects.toString(f2);
                                        Objects.toString(obj3);
                                    }
                                    pair = new Pair(f2, new Integer(k9Var.c));
                                    fsfVar = fsfVar4;
                                    int intValue2 = ((Number) pair.b).intValue();
                                    f4eVar.a.j.e(null);
                                    f4eVar.c.e(null);
                                    return new f4e(new x4e(pair.a, a7eVar2, k4eVar.b, (sj3) k4eVar.d.c, intValue2, (c7e) fsfVar.a, new y34(0, k4eVar, k4e.class, ToolBar.REFRESH, "refresh(Ljava/lang/Object;)V", 0, 2)), (c7e) fsfVar.a, bea.a());
                                }
                            } else {
                                if (!q5aVar.equals(h4e.g)) {
                                    a70.r("should not get here");
                                    return null;
                                }
                                x4e x4eVar4 = f4eVar.a;
                                z6e z6eVar2 = (z6e) CollectionsKt.Y(((c7e) fsfVar.a).a);
                                this.w = f4eVar;
                                this.x = a7eVar;
                                this.s = fsfVar;
                                this.u = null;
                                this.v = null;
                                this.t = 5;
                                f = x4eVar4.f(z6eVar2, this);
                                if (f != lu3Var2) {
                                    fsfVar3 = fsfVar;
                                    a7eVar3 = a7eVar;
                                    if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                                        Objects.toString(f);
                                        Objects.toString(CollectionsKt.X((Iterable) CollectionsKt.Y(((c7e) fsfVar3.a).a)));
                                    }
                                    it = ((c7e) fsfVar3.a).a.iterator();
                                    while (it.hasNext()) {
                                        i3 += ((z6e) it.next()).a.size();
                                    }
                                    a7e a7eVar6 = a7eVar3;
                                    fsfVar = fsfVar3;
                                    pair = new Pair(f, new Integer(i3));
                                    a7eVar2 = a7eVar6;
                                    int intValue22 = ((Number) pair.b).intValue();
                                    f4eVar.a.j.e(null);
                                    f4eVar.c.e(null);
                                    return new f4e(new x4e(pair.a, a7eVar2, k4eVar.b, (sj3) k4eVar.d.c, intValue22, (c7e) fsfVar.a, new y34(0, k4eVar, k4e.class, ToolBar.REFRESH, "refresh(Ljava/lang/Object;)V", 0, 2)), (c7e) fsfVar.a, bea.a());
                                }
                            }
                        }
                        return lu3Var2;
                    case 3:
                        fsf fsfVar5 = (fsf) this.v;
                        fsf fsfVar6 = (fsf) this.u;
                        a7e a7eVar7 = (a7e) this.s;
                        g4e g4eVar4 = (g4e) this.x;
                        f4e f4eVar4 = (f4e) this.w;
                        y6a.M(obj);
                        g4eVar2 = g4eVar4;
                        a7eVar = a7eVar7;
                        fsfVar2 = fsfVar5;
                        fsfVar = fsfVar6;
                        f4eVar = f4eVar4;
                        b = obj;
                        fsfVar2.a = b;
                        if (((c7e) fsfVar.a).a.isEmpty()) {
                            fsfVar.a = f4eVar.b;
                            break;
                        }
                        if (((c7e) fsfVar.a).b == null) {
                        }
                        if (g4eVar2.a.equals(h4e.h)) {
                            break;
                        }
                        a3 = a7eVar.a((c7e) fsfVar.a);
                        if (Build.ID != null) {
                            Objects.toString(a3);
                            a7eVar.toString();
                            break;
                        }
                        pair = new Pair(a3, new Integer(k9Var.c));
                        a7eVar2 = a7eVar;
                        int intValue222 = ((Number) pair.b).intValue();
                        f4eVar.a.j.e(null);
                        f4eVar.c.e(null);
                        return new f4e(new x4e(pair.a, a7eVar2, k4eVar.b, (sj3) k4eVar.d.c, intValue222, (c7e) fsfVar.a, new y34(0, k4eVar, k4e.class, ToolBar.REFRESH, "refresh(Ljava/lang/Object;)V", 0, 2)), (c7e) fsfVar.a, bea.a());
                    case 4:
                        obj3 = this.u;
                        fsfVar4 = (fsf) this.s;
                        a7eVar2 = (a7e) this.x;
                        f4e f4eVar5 = (f4e) this.w;
                        y6a.M(obj);
                        f4eVar = f4eVar5;
                        f2 = obj;
                        if (Build.ID != null) {
                            Objects.toString(f2);
                            Objects.toString(obj3);
                            break;
                        }
                        pair = new Pair(f2, new Integer(k9Var.c));
                        fsfVar = fsfVar4;
                        int intValue2222 = ((Number) pair.b).intValue();
                        f4eVar.a.j.e(null);
                        f4eVar.c.e(null);
                        return new f4e(new x4e(pair.a, a7eVar2, k4eVar.b, (sj3) k4eVar.d.c, intValue2222, (c7e) fsfVar.a, new y34(0, k4eVar, k4e.class, ToolBar.REFRESH, "refresh(Ljava/lang/Object;)V", 0, 2)), (c7e) fsfVar.a, bea.a());
                    case 5:
                        fsfVar3 = (fsf) this.s;
                        a7eVar3 = (a7e) this.x;
                        f4e f4eVar6 = (f4e) this.w;
                        y6a.M(obj);
                        f4eVar = f4eVar6;
                        f = obj;
                        if (Build.ID != null) {
                            Objects.toString(f);
                            Objects.toString(CollectionsKt.X((Iterable) CollectionsKt.Y(((c7e) fsfVar3.a).a)));
                            break;
                        }
                        it = ((c7e) fsfVar3.a).a.iterator();
                        while (it.hasNext()) {
                        }
                        a7e a7eVar62 = a7eVar3;
                        fsfVar = fsfVar3;
                        pair = new Pair(f, new Integer(i3));
                        a7eVar2 = a7eVar62;
                        int intValue22222 = ((Number) pair.b).intValue();
                        f4eVar.a.j.e(null);
                        f4eVar.c.e(null);
                        return new f4e(new x4e(pair.a, a7eVar2, k4eVar.b, (sj3) k4eVar.d.c, intValue22222, (c7e) fsfVar.a, new y34(0, k4eVar, k4e.class, ToolBar.REFRESH, "refresh(Ljava/lang/Object;)V", 0, 2)), (c7e) fsfVar.a, bea.a());
                    case 6:
                        f4e f4eVar7 = (f4e) this.w;
                        y6a.M(obj);
                        return f4eVar7;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g61(k4e k4eVar, rq3 rq3Var) {
        super(3, rq3Var);
        this.y = k4eVar;
    }
}
