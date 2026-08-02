package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yhd {
    public final thd a;

    public yhd(thd thdVar) {
        thdVar.getClass();
        this.a = thdVar;
    }

    public static Object c(Context context, sq3 sq3Var) {
        Object r = s9a.r(new qa7(context, (rq3) null, 27), sq3Var);
        return r == lu3.a ? r : Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (c(r9, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004c, code lost:
    
        if (r11 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, List list, sq3 sq3Var) {
        vhd vhdVar;
        int i;
        List list2;
        Iterator it;
        if (sq3Var instanceof vhd) {
            vhdVar = (vhd) sq3Var;
            int i2 = vhdVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vhdVar.u = i2 - Integer.MIN_VALUE;
                Object obj = vhdVar.s;
                lu3 lu3Var = lu3.a;
                i = vhdVar.u;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    vhdVar.r = context;
                    vhdVar.u = 1;
                    thd thdVar = this.a;
                    obj = gz8.U(vhdVar, thdVar.a, false, true, new shd(thdVar, list, i3));
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context = vhdVar.r;
                    y6a.M(obj);
                }
                list2 = (List) obj;
                if (list2 != null || !list2.isEmpty()) {
                    it = list2.iterator();
                    while (it.hasNext()) {
                        if (((Number) it.next()).longValue() != -1) {
                            vhdVar.r = null;
                            vhdVar.u = 2;
                        }
                    }
                }
                return Unit.a;
            }
        }
        vhdVar = new vhd(this, sq3Var);
        Object obj2 = vhdVar.s;
        lu3 lu3Var2 = lu3.a;
        i = vhdVar.u;
        int i32 = 1;
        if (i != 0) {
        }
        list2 = (List) obj2;
        if (list2 != null) {
        }
        it = list2.iterator();
        while (it.hasNext()) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (c(r7, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, List list, sq3 sq3Var) {
        whd whdVar;
        int i;
        if (sq3Var instanceof whd) {
            whdVar = (whd) sq3Var;
            int i2 = whdVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                whdVar.u = i2 - Integer.MIN_VALUE;
                Object obj = whdVar.s;
                Object obj2 = lu3.a;
                i = whdVar.u;
                int i3 = 2;
                if (i != 0) {
                    y6a.M(obj);
                    whdVar.r = context;
                    whdVar.u = 1;
                    thd thdVar = this.a;
                    Object U = gz8.U(whdVar, thdVar.a, false, true, new shd(thdVar, list, i3));
                    if (U != obj2) {
                        U = Unit.a;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context = whdVar.r;
                    y6a.M(obj);
                }
                whdVar.r = null;
                whdVar.u = 2;
            }
        }
        whdVar = new whd(this, sq3Var);
        Object obj3 = whdVar.s;
        Object obj22 = lu3.a;
        i = whdVar.u;
        int i32 = 2;
        if (i != 0) {
        }
        whdVar.r = null;
        whdVar.u = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (c(r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Context context, ArrayList arrayList, sq3 sq3Var) {
        xhd xhdVar;
        int i;
        int intValue;
        if (sq3Var instanceof xhd) {
            xhdVar = (xhd) sq3Var;
            int i2 = xhdVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xhdVar.v = i2 - Integer.MIN_VALUE;
                Object obj = xhdVar.t;
                lu3 lu3Var = lu3.a;
                i = xhdVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    xhdVar.r = context;
                    xhdVar.v = 1;
                    thd thdVar = this.a;
                    obj = gz8.U(xhdVar, thdVar.a, false, true, new shd(thdVar, arrayList, 0));
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        intValue = xhdVar.s;
                        y6a.M(obj);
                        return new Integer(intValue);
                    }
                    context = xhdVar.r;
                    y6a.M(obj);
                }
                intValue = ((Number) obj).intValue();
                xhdVar.r = null;
                xhdVar.s = intValue;
                xhdVar.v = 2;
            }
        }
        xhdVar = new xhd(this, sq3Var);
        Object obj2 = xhdVar.t;
        lu3 lu3Var2 = lu3.a;
        i = xhdVar.v;
        if (i != 0) {
        }
        intValue = ((Number) obj2).intValue();
        xhdVar.r = null;
        xhdVar.s = intValue;
        xhdVar.v = 2;
    }
}
