package com.sofascore.results.widget;

import android.content.Context;
import com.sofascore.localPersistence.database.AppDatabase;
import defpackage.a70;
import defpackage.auh;
import defpackage.c8d;
import defpackage.d8d;
import defpackage.doa;
import defpackage.dz8;
import defpackage.k50;
import defpackage.k6l;
import defpackage.l6l;
import defpackage.l98;
import defpackage.lu3;
import defpackage.lzf;
import defpackage.mc4;
import defpackage.n6l;
import defpackage.nb;
import defpackage.ok3;
import defpackage.p0d;
import defpackage.pzc;
import defpackage.qa6;
import defpackage.re0;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.y6a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/widget/NavigateLeftOrRight;", "Lnb;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavigateLeftOrRight implements nb {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x014d, code lost:
    
        if (r1.L(r4, r5, r10) == r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0134, code lost:
    
        if (defpackage.ml4.u0(r4, r5, r7, r10) != r3) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // defpackage.nb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, re0 re0Var, pzc pzcVar, rq3 rq3Var) {
        c8d c8dVar;
        lu3 lu3Var;
        int i;
        int intValue;
        Object c;
        Context context2;
        Object c2;
        int i2;
        re0 re0Var2;
        Context context3;
        int i3;
        re0 re0Var3 = re0Var;
        doa doaVar = doa.d;
        if (rq3Var instanceof c8d) {
            c8dVar = (c8d) rq3Var;
            int i4 = c8dVar.x;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c8dVar.x = i4 - Integer.MIN_VALUE;
                c8d c8dVar2 = c8dVar;
                Object obj = c8dVar2.v;
                lu3Var = lu3.a;
                i = c8dVar2.x;
                int i5 = 0;
                rq3 rq3Var2 = null;
                if (i != 0) {
                    y6a.M(obj);
                    Integer num = (Integer) pzcVar.a.get(ok3.k);
                    if (num == null) {
                        return Unit.a;
                    }
                    intValue = num.intValue();
                    Context applicationContext = context.getApplicationContext();
                    applicationContext.getClass();
                    c8dVar2.r = re0Var3;
                    c8dVar2.s = applicationContext;
                    c8dVar2.t = intValue;
                    c8dVar2.x = 1;
                    if (re0Var3 == null) {
                        a70.p("The glance ID is not the one of an App Widget");
                        return null;
                    }
                    c = dz8.a.c(applicationContext, doaVar, l98.M(re0Var3.a), c8dVar2);
                    if (c != lu3Var) {
                        context2 = applicationContext;
                    }
                    return lu3Var;
                }
                if (i == 1) {
                    int i6 = c8dVar2.t;
                    Context context4 = c8dVar2.s;
                    re0 re0Var4 = c8dVar2.r;
                    y6a.M(obj);
                    context2 = context4;
                    c = obj;
                    intValue = i6;
                    re0Var3 = re0Var4;
                } else if (i == 2) {
                    i3 = c8dVar2.u;
                    i2 = c8dVar2.t;
                    context3 = c8dVar2.s;
                    re0Var2 = c8dVar2.r;
                    y6a.M(obj);
                    l6l l6lVar = (l6l) obj;
                    k6l k6lVar = l6lVar.a;
                    List list = l6lVar.b;
                    context3.getClass();
                    k50 k50Var = new k50(k6lVar, list, rq3Var2, 14);
                    c8dVar2.r = re0Var2;
                    c8dVar2.s = context3;
                    c8dVar2.t = i2;
                    c8dVar2.u = i3;
                    c8dVar2.x = 3;
                } else {
                    if (i != 3) {
                        if (i == 4) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = c8dVar2.u;
                    i2 = c8dVar2.t;
                    context3 = c8dVar2.s;
                    re0Var2 = c8dVar2.r;
                    y6a.M(obj);
                    auh auhVar = new auh(0);
                    context3.getClass();
                    c8dVar2.r = null;
                    c8dVar2.s = null;
                    c8dVar2.t = i2;
                    c8dVar2.u = i3;
                    c8dVar2.x = 4;
                }
                p0d p0dVar = (p0d) c;
                n6l n6lVar = n6l.a;
                p0dVar.getClass();
                Integer num2 = (Integer) p0dVar.c(n6l.i);
                int intValue2 = num2 == null ? num2.intValue() : 0;
                context2.getClass();
                lzf lzfVar = (lzf) l98.T(context2, lzf.class);
                lzfVar.getClass();
                qa6 qa6Var = new qa6(((AppDatabase) ((mc4) lzfVar).z.get()).e());
                Integer num3 = (Integer) p0dVar.c(n6l.g);
                int intValue3 = num3 == null ? num3.intValue() : 0;
                List a = n6l.a(p0dVar);
                d8d d8dVar = new d8d(qa6Var, rq3Var2, i5);
                c8dVar2.r = re0Var3;
                c8dVar2.s = context2;
                c8dVar2.t = intValue;
                c8dVar2.u = intValue2;
                c8dVar2.x = 2;
                c2 = n6lVar.c(intValue3, intValue2 + intValue, a, context2, d8dVar, c8dVar2);
                if (c2 != lu3Var) {
                    i2 = intValue;
                    obj = c2;
                    re0Var2 = re0Var3;
                    context3 = context2;
                    i3 = intValue2;
                    l6l l6lVar2 = (l6l) obj;
                    k6l k6lVar2 = l6lVar2.a;
                    List list2 = l6lVar2.b;
                    context3.getClass();
                    k50 k50Var2 = new k50(k6lVar2, list2, rq3Var2, 14);
                    c8dVar2.r = re0Var2;
                    c8dVar2.s = context3;
                    c8dVar2.t = i2;
                    c8dVar2.u = i3;
                    c8dVar2.x = 3;
                }
                return lu3Var;
            }
        }
        c8dVar = new c8d(this, (sq3) rq3Var);
        c8d c8dVar22 = c8dVar;
        Object obj2 = c8dVar22.v;
        lu3Var = lu3.a;
        i = c8dVar22.x;
        int i52 = 0;
        rq3 rq3Var22 = null;
        if (i != 0) {
        }
        p0d p0dVar2 = (p0d) c;
        n6l n6lVar2 = n6l.a;
        p0dVar2.getClass();
        Integer num22 = (Integer) p0dVar2.c(n6l.i);
        if (num22 == null) {
        }
        context2.getClass();
        lzf lzfVar2 = (lzf) l98.T(context2, lzf.class);
        lzfVar2.getClass();
        qa6 qa6Var2 = new qa6(((AppDatabase) ((mc4) lzfVar2).z.get()).e());
        Integer num32 = (Integer) p0dVar2.c(n6l.g);
        if (num32 == null) {
        }
        List a2 = n6l.a(p0dVar2);
        d8d d8dVar2 = new d8d(qa6Var2, rq3Var22, i52);
        c8dVar22.r = re0Var3;
        c8dVar22.s = context2;
        c8dVar22.t = intValue;
        c8dVar22.u = intValue2;
        c8dVar22.x = 2;
        c2 = n6lVar2.c(intValue3, intValue2 + intValue, a2, context2, d8dVar2, c8dVar22);
        if (c2 != lu3Var) {
        }
        return lu3Var;
    }
}
