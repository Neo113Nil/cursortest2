package com.sofascore.results.widget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.ad2;
import defpackage.anc;
import defpackage.auh;
import defpackage.buh;
import defpackage.eqe;
import defpackage.kq7;
import defpackage.l98;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.re0;
import defpackage.rq3;
import defpackage.ry8;
import defpackage.s75;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.sy8;
import defpackage.t01;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.wca;
import defpackage.wxf;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.zg3;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/widget/SofaWidgetReceiver;", "Lsy8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SofaWidgetReceiver extends sy8 {
    public static final /* synthetic */ int e = 0;
    public final auh c = new auh(0);
    public final ad2 d = s9a.c(this.a);

    @Override // defpackage.sy8
    public final t01 a() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0136, code lost:
    
        if (defpackage.ml4.u0(r12, r1, r11, r0) == r14) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0138, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0089, code lost:
    
        if (r11 == r14) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0123 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Context context, int i, sq3 sq3Var) {
        buh buhVar;
        int i2;
        Object u2gVar;
        re0 re0Var;
        Iterator it;
        Float f;
        int i3;
        Iterator it2;
        Float f2;
        if (sq3Var instanceof buh) {
            buhVar = (buh) sq3Var;
            int i4 = buhVar.w;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                buhVar.w = i4 - Integer.MIN_VALUE;
                Object obj = buhVar.u;
                Object obj2 = lu3.a;
                i2 = buhVar.w;
                if (i2 != 0) {
                    y6a.M(obj);
                    AppWidgetManager appWidgetManager = new ry8(context).b;
                    try {
                        p2g p2gVar = w2g.b;
                    } catch (Throwable th) {
                        p2g p2gVar2 = w2g.b;
                        u2gVar = new u2g(th);
                    }
                    if (appWidgetManager.getAppWidgetInfo(i) == null) {
                        throw new IllegalArgumentException("Invalid AppWidget ID.");
                    }
                    u2gVar = new re0(i);
                    if (u2gVar instanceof u2g) {
                        u2gVar = null;
                    }
                    re0Var = (re0) u2gVar;
                    if (re0Var == null) {
                        return Unit.a;
                    }
                    buhVar.r = context;
                    buhVar.s = re0Var;
                    buhVar.t = i;
                    buhVar.w = 1;
                    obj = l98.Q(appWidgetManager.getAppWidgetOptions(re0Var.a), zg3.r);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = buhVar.t;
                    re0 re0Var2 = buhVar.s;
                    Context context2 = buhVar.r;
                    y6a.M(obj);
                    re0Var = re0Var2;
                    context = context2;
                }
                List list = (List) obj;
                it = list.iterator();
                if (it.hasNext()) {
                    f = null;
                } else {
                    float a = s75.a(((s75) it.next()).a);
                    while (it.hasNext()) {
                        a = Math.max(a, s75.a(((s75) it.next()).a));
                    }
                    f = new Float(a);
                }
                int i5 = 0;
                if (f != null) {
                    if (f.floatValue() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f = null;
                    }
                    if (f != null) {
                        i3 = (int) f.floatValue();
                        it2 = list.iterator();
                        if (it2.hasNext()) {
                            float b = s75.b(((s75) it2.next()).a);
                            while (it2.hasNext()) {
                                b = Math.min(b, s75.b(((s75) it2.next()).a));
                            }
                            f2 = new Float(b);
                        } else {
                            f2 = null;
                        }
                        if (f2 != null) {
                            if (f2.floatValue() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                f2 = null;
                            }
                            if (f2 != null) {
                                i5 = (int) f2.floatValue();
                            }
                        }
                        if (i3 > 0 || i5 <= 0) {
                            return Unit.a;
                        }
                        kq7 kq7Var = new kq7(i3, i5, (rq3) null);
                        buhVar.r = null;
                        buhVar.s = null;
                        buhVar.t = i;
                        buhVar.w = 2;
                    }
                }
                i3 = 0;
                it2 = list.iterator();
                if (it2.hasNext()) {
                }
                if (f2 != null) {
                }
                if (i3 > 0) {
                }
                return Unit.a;
            }
        }
        buhVar = new buh(this, sq3Var);
        Object obj3 = buhVar.u;
        Object obj22 = lu3.a;
        i2 = buhVar.w;
        if (i2 != 0) {
        }
        List list2 = (List) obj3;
        it = list2.iterator();
        if (it.hasNext()) {
        }
        int i52 = 0;
        if (f != null) {
        }
        i3 = 0;
        it2 = list2.iterator();
        if (it2.hasNext()) {
        }
        if (f2 != null) {
        }
        if (i3 > 0) {
        }
        return Unit.a;
    }

    @Override // defpackage.sy8, android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        context.getClass();
        appWidgetManager.getClass();
        bundle.getClass();
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
        xw3.L(this.d, null, null, new anc(this, context, i, (rq3) null, 10), 3);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        context.getClass();
        super.onDisabled(context);
        wca.r(context);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        context.getClass();
        super.onEnabled(context);
        wca.G(context);
    }

    @Override // defpackage.sy8, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        super.onReceive(context, intent);
        if (Intrinsics.c(intent.getAction(), "com.sofascore.results.ENABLE_NOTIFICATIONS")) {
            wxf.f(2, context);
        }
    }

    @Override // defpackage.sy8, android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        context.getClass();
        appWidgetManager.getClass();
        iArr.getClass();
        super.onUpdate(context, appWidgetManager, iArr);
        wca.G(context);
        xw3.L(this.d, null, null, new eqe(iArr, context, this, (rq3) null, 1), 3);
    }
}
