package defpackage;

import android.content.Context;
import android.view.View;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p7d extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p7d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
        this.v = obj4;
        this.w = obj5;
        this.x = obj6;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.x;
        Object obj3 = this.w;
        Object obj4 = this.v;
        Object obj5 = this.u;
        Object obj6 = this.t;
        switch (i) {
            case 0:
                return new p7d((axj) this.s, (k7d) obj6, (d6d) obj5, (g0d) obj4, (cdi) obj3, (oe3) obj2, rq3Var, 0);
            case 1:
                return new p7d((String) this.s, (ynj) obj6, (ksa) obj5, (Context) obj4, (ku3) obj3, (e1d) obj2, rq3Var, 1);
            default:
                p7d p7dVar = new p7d((e1d) obj6, (e1d) obj5, (j) obj4, (e1d) obj3, (e1d) obj2, rq3Var);
                p7dVar.s = obj;
                return p7dVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((p7d) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((p7d) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((p7d) create((d) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Object obj2 = this.v;
        Object obj3 = this.x;
        Object obj4 = this.u;
        Object obj5 = this.t;
        Object obj6 = this.w;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                axj axjVar = (axj) this.s;
                Object w = axjVar.a.w();
                e1d e1dVar = axjVar.d;
                if (Intrinsics.c(w, ((eoh) e1dVar).getValue()) && (((d6d) ((k7d) obj5).b.f.m()) == null || Intrinsics.c(((eoh) e1dVar).getValue(), (d6d) obj4))) {
                    oe3 oe3Var = (oe3) obj3;
                    Iterator it = ((List) ((cdi) obj6).getValue()).iterator();
                    while (it.hasNext()) {
                        oe3Var.b().c((d6d) it.next());
                    }
                    g0d g0dVar = (g0d) obj2;
                    long[] jArr = g0dVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((255 & j) < 128) {
                                        int i5 = (i2 << 3) + i4;
                                        Object obj7 = g0dVar.b[i5];
                                        float f = g0dVar.c[i5];
                                        if (!Intrinsics.c((String) obj7, ((d6d) ((eoh) e1dVar).getValue()).f)) {
                                            g0dVar.e(i5);
                                        }
                                    }
                                    j >>= 8;
                                }
                                if (i3 != 8) {
                                }
                            }
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    }
                }
                break;
            case 1:
                gv9 gv9Var = ((ynj) obj5).a;
                String str = (String) this.s;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                e1d e1dVar2 = (e1d) obj3;
                if (!((Boolean) e1dVar2.getValue()).booleanValue() && str != null && !gv9Var.isEmpty()) {
                    l3j.c(str, gv9Var, (ksa) obj4, (Context) obj2, (ku3) obj6);
                    e1dVar2.setValue(Boolean.TRUE);
                }
                break;
            default:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                d dVar = (d) this.s;
                ((Function1) ((e1d) obj6).getValue()).invoke(Boolean.valueOf(dVar.a));
                ((e1d) obj5).setValue(Boolean.valueOf(dVar.a));
                boolean z = dVar.c;
                ((e1d) obj4).setValue(Boolean.valueOf(z));
                ((Function1) ((e1d) obj3).getValue()).invoke(Boolean.valueOf(dVar.b));
                View c = ((j) obj2).c();
                if (c != null) {
                    c.setKeepScreenOn(z);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7d(e1d e1dVar, e1d e1dVar2, j jVar, e1d e1dVar3, e1d e1dVar4, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 2;
        this.t = e1dVar;
        this.u = e1dVar2;
        this.v = jVar;
        this.w = e1dVar3;
        this.x = e1dVar4;
    }
}
