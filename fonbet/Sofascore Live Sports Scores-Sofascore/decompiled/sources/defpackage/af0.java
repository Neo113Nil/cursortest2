package defpackage;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.compose.runtime.e;
import com.sofascore.results.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class af0 {
    public final String a;
    public final AtomicBoolean b;
    public final g62 c;
    public final t01 d;
    public final re0 e;
    public final ekh f;
    public final e1d g;
    public final e1d h;
    public Map i;
    public final aea j;
    public final fdi k;

    public af0(t01 t01Var, re0 re0Var, Bundle bundle, int i) {
        bundle = (i & 4) != 0 ? null : bundle;
        dz8 dz8Var = dz8.a;
        dkh y = t01Var.y();
        this.a = l98.M(re0Var.a);
        this.b = new AtomicBoolean(true);
        this.c = ml4.g(Integer.MAX_VALUE, 6, null);
        this.d = t01Var;
        this.e = re0Var;
        this.f = y;
        int i2 = re0Var.a;
        if (Integer.MIN_VALUE <= i2 && i2 < -1) {
            a70.p("If the AppWidgetSession is not created for a bound widget, you must provide a lambda action receiver");
            throw null;
        }
        f7a f7aVar = f7a.k;
        this.g = e.e(null, f7aVar);
        this.h = e.e(bundle, f7aVar);
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.i = lm5Var;
        this.j = bea.a();
        this.k = gdi.a(null);
    }

    public final void a(Context context, Throwable th) {
        int i = this.e.a;
        this.d.getClass();
        AppWidgetManager.getInstance(context).updateAppWidget(i, new RemoteViews(context.getPackageName(), R.layout.glance_error_layout));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|(1:(1:(4:19|20|21|22)(1:(2:13|14)(3:16|17|18)))(1:23))(2:58|(2:60|61)(3:62|(1:64)|39))|24|25|26|27|28|29|(7:31|32|33|34|35|36|37)(2:54|55)))|65|6|(0)(0)|24|25|26|27|28|29|(0)(0)|(3:(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d9, code lost:
    
        if (r3.b(r5) == r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0133, code lost:
    
        if (r3.b(r5) != r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0110, code lost:
    
        if (r3.b(r5) != r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0120, code lost:
    
        if (r3.b(r5) != r6) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1 A[Catch: all -> 0x00e0, CancellationException -> 0x0127, TRY_LEAVE, TryCatch #5 {CancellationException -> 0x0127, all -> 0x00e0, blocks: (B:27:0x0094, B:29:0x0099, B:31:0x00a1, B:36:0x00c3, B:54:0x00e9, B:55:0x0100), top: B:26:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9 A[Catch: all -> 0x00e0, CancellationException -> 0x0127, TRY_ENTER, TryCatch #5 {CancellationException -> 0x0127, all -> 0x00e0, blocks: (B:27:0x0094, B:29:0x0099, B:31:0x00a1, B:36:0x00c3, B:54:0x00e9, B:55:0x0100), top: B:26:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, yk5 yk5Var, sq3 sq3Var) {
        we0 we0Var;
        int i;
        af0 af0Var;
        yk5 yk5Var2;
        AppWidgetProviderInfo appWidgetInfo;
        Context context2 = context;
        if (sq3Var instanceof we0) {
            we0Var = (we0) sq3Var;
            int i2 = we0Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                we0Var.w = i2 - Integer.MIN_VALUE;
                Object obj = we0Var.u;
                lu3 lu3Var = lu3.a;
                i = we0Var.w;
                if (i != 0) {
                    y6a.M(obj);
                    if (fqj.I(yk5Var)) {
                        return Boolean.FALSE;
                    }
                    yk5Var.getClass();
                    int i3 = this.e.a;
                    we0Var.r = this;
                    we0Var.s = context2;
                    we0Var.t = yk5Var;
                    we0Var.w = 1;
                    obj = cma.g.x(context2, i3, we0Var);
                    if (obj != lu3Var) {
                        af0Var = this;
                        yk5Var2 = yk5Var;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i == 2 || i == 3 || i == 4) {
                        y6a.M(obj);
                        gsj.a();
                        return Boolean.TRUE;
                    }
                    if (i != 5) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = (Throwable) we0Var.r;
                    y6a.M(obj);
                    gsj.a();
                    throw th;
                }
                yk5Var2 = we0Var.t;
                context2 = we0Var.s;
                af0Var = (af0) we0Var.r;
                y6a.M(obj);
                Context context3 = context2;
                cma cmaVar = (cma) obj;
                Object systemService = context3.getSystemService("appwidget");
                systemService.getClass();
                AppWidgetManager appWidgetManager = (AppWidgetManager) systemService;
                af0Var.getClass();
                re0 re0Var = af0Var.e;
                appWidgetInfo = appWidgetManager.getAppWidgetInfo(re0Var.a);
                if (appWidgetInfo != null) {
                    throw new IllegalArgumentException(("No app widget info for " + re0Var.a).toString());
                }
                ComponentName componentName = appWidgetInfo.provider;
                oea.q((eyf) yk5Var2);
                af0Var.i = oea.B(yk5Var2);
                try {
                    RemoteViews R = l4a.R(context3, re0Var.a, (eyf) yk5Var2, cmaVar, cmaVar.a(yk5Var2), componentName);
                    appWidgetManager.updateAppWidget(re0Var.a, R);
                    af0Var.k.l(R);
                    we0Var.r = null;
                    we0Var.s = null;
                    we0Var.t = null;
                    we0Var.w = 2;
                } catch (CancellationException unused) {
                    cmaVar = cmaVar;
                    we0Var.r = null;
                    we0Var.s = null;
                    we0Var.t = null;
                    we0Var.w = 3;
                } catch (Throwable th) {
                    th = th;
                    cmaVar = cmaVar;
                    try {
                        af0Var.a(context3, th);
                        we0Var.r = null;
                        we0Var.s = null;
                        we0Var.t = null;
                        we0Var.w = 4;
                    } catch (Throwable th2) {
                        th = th2;
                        we0Var.r = th;
                        we0Var.s = null;
                        we0Var.t = null;
                        we0Var.w = 5;
                    }
                }
            }
        }
        we0Var = new we0(this, sq3Var);
        Object obj2 = we0Var.u;
        lu3 lu3Var2 = lu3.a;
        i = we0Var.w;
        if (i != 0) {
        }
        Context context32 = context2;
        cma cmaVar2 = (cma) obj2;
        Object systemService2 = context32.getSystemService("appwidget");
        systemService2.getClass();
        AppWidgetManager appWidgetManager2 = (AppWidgetManager) systemService2;
        af0Var.getClass();
        re0 re0Var2 = af0Var.e;
        appWidgetInfo = appWidgetManager2.getAppWidgetInfo(re0Var2.a);
        if (appWidgetInfo != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Context context, Object obj, sq3 sq3Var) {
        xe0 xe0Var;
        int i;
        c1d C;
        nnh j;
        c1d c1dVar;
        if (sq3Var instanceof xe0) {
            xe0Var = (xe0) sq3Var;
            int i2 = xe0Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xe0Var.u = i2 - Integer.MIN_VALUE;
                Object obj2 = xe0Var.s;
                lu3 lu3Var = lu3.a;
                i = xe0Var.u;
                Unit unit = null;
                if (i != 0) {
                    y6a.M(obj2);
                    boolean z = obj instanceof ue0;
                    String str = this.a;
                    if (!z) {
                        if (obj instanceof te0) {
                            nnh h = snh.h();
                            c1d c1dVar2 = h instanceof c1d ? (c1d) h : null;
                            if (c1dVar2 == null || (C = c1dVar2.C(null, null)) == null) {
                                a70.r("Cannot create a mutable snapshot of an read-only snapshot");
                                return null;
                            }
                            try {
                                j = C.j();
                                try {
                                    ((eoh) this.h).setValue(((te0) obj).a);
                                    Unit unit2 = Unit.a;
                                    nnh.q(j);
                                    C.w().i();
                                    C.c();
                                } finally {
                                }
                            } finally {
                            }
                        } else if (obj instanceof se0) {
                            nnh h2 = snh.h();
                            c1d c1dVar3 = h2 instanceof c1d ? (c1d) h2 : null;
                            if (c1dVar3 == null || (C = c1dVar3.C(null, null)) == null) {
                                a70.r("Cannot create a mutable snapshot of an read-only snapshot");
                                return null;
                            }
                            try {
                                j = C.j();
                                try {
                                    List list = (List) this.i.get(((se0) obj).a);
                                    if (list != null) {
                                        Iterator it = list.iterator();
                                        if (it.hasNext()) {
                                            throw null;
                                        }
                                        unit = Unit.a;
                                    }
                                    nnh.q(j);
                                    C.w().i();
                                    C.c();
                                    if (unit == null) {
                                        o02.K(Log.w("AppWidgetSession", fc6.o(new StringBuilder("Triggering Action("), ((se0) obj).a, ") for session(", str, ") failed")));
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            } finally {
                            }
                        } else {
                            if (!(obj instanceof ve0)) {
                                sw9.t(obj.getClass(), " to AppWidgetSession", "Sent unrecognized event type ");
                                return null;
                            }
                            aea aeaVar = ((ve0) obj).a;
                            if (aeaVar.isActive()) {
                                aeaVar.j0();
                            }
                        }
                        return Unit.a;
                    }
                    doa z2 = this.d.z();
                    if (z2 != null) {
                        dz8 dz8Var = dz8.a;
                        xe0Var.r = this;
                        xe0Var.u = 1;
                        obj2 = dz8Var.c(context, z2, str, xe0Var);
                        if (obj2 == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        obj2 = null;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = xe0Var.r;
                    y6a.M(obj2);
                }
                nnh h3 = snh.h();
                c1dVar = !(h3 instanceof c1d) ? (c1d) h3 : null;
                if (c1dVar != null || (C = c1dVar.C(null, null)) == null) {
                    a70.r("Cannot create a mutable snapshot of an read-only snapshot");
                    return null;
                }
                try {
                    j = C.j();
                    try {
                        ((eoh) this.g).setValue(obj2);
                        Unit unit3 = Unit.a;
                        nnh.q(j);
                        C.w().i();
                        return Unit.a;
                    } finally {
                    }
                } finally {
                }
            }
        }
        xe0Var = new xe0(this, sq3Var);
        Object obj22 = xe0Var.s;
        lu3 lu3Var2 = lu3.a;
        i = xe0Var.u;
        Unit unit4 = null;
        if (i != 0) {
        }
        nnh h32 = snh.h();
        if (!(h32 instanceof c1d)) {
        }
        if (c1dVar != null) {
        }
        a70.r("Cannot create a mutable snapshot of an read-only snapshot");
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(1:(5:11|12|13|14|(2:16|17)(5:19|20|(1:22)|24|25))(2:27|28))(6:29|30|20|(0)|24|25))(4:31|32|14|(0)(0))))|34|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        if (r2.c(r9, r10, r0) == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b A[Catch: oz2 -> 0x0096, TRY_LEAVE, TryCatch #0 {oz2 -> 0x0096, blocks: (B:12:0x0030, B:14:0x0059, B:20:0x0073, B:22:0x007b, B:30:0x004b, B:32:0x0052), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r8v7, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v9, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0093 -> B:13:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Context context, x40 x40Var, sq3 sq3Var) {
        j7h j7hVar;
        int i;
        b62 b62Var;
        Context context2;
        x40 x40Var2;
        b62 b62Var2;
        af0 af0Var;
        if (sq3Var instanceof j7h) {
            j7hVar = (j7h) sq3Var;
            int i2 = j7hVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j7hVar.x = i2 - Integer.MIN_VALUE;
                Object obj = j7hVar.v;
                lu3 lu3Var = lu3.a;
                i = j7hVar.x;
                if (i == 0) {
                    if (i == 1) {
                        b62Var2 = j7hVar.u;
                        Function1 function1 = j7hVar.t;
                        context2 = j7hVar.s;
                        af0Var = j7hVar.r;
                        y6a.M(obj);
                        x40Var2 = function1;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        return Unit.a;
                    }
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b62Var2 = j7hVar.u;
                    Function1 function12 = j7hVar.t;
                    context2 = j7hVar.s;
                    af0Var = j7hVar.r;
                    y6a.M(obj);
                    x40 x40Var3 = function12;
                    af0 af0Var2 = af0Var;
                    b62Var = b62Var2;
                    this = af0Var2;
                    Context context3 = context2;
                    x40Var = x40Var3;
                    context = context3;
                    j7hVar.r = this;
                    j7hVar.s = context;
                    j7hVar.t = x40Var;
                    j7hVar.u = b62Var;
                    j7hVar.x = 1;
                    obj = b62Var.a(j7hVar);
                    if (obj != lu3Var) {
                        return lu3Var;
                    }
                    b62 b62Var3 = b62Var;
                    af0Var = this;
                    b62Var2 = b62Var3;
                    x40 x40Var4 = x40Var;
                    context2 = context;
                    x40Var2 = x40Var4;
                    if (((Boolean) obj).booleanValue()) {
                        Object c = b62Var2.c();
                        x40Var2.invoke(c);
                        j7hVar.r = af0Var;
                        j7hVar.s = context2;
                        j7hVar.t = x40Var2;
                        j7hVar.u = b62Var2;
                        j7hVar.x = 2;
                        x40Var3 = x40Var2;
                    }
                    return Unit.a;
                }
                y6a.M(obj);
                b62Var = new b62(this.c);
                j7hVar.r = this;
                j7hVar.s = context;
                j7hVar.t = x40Var;
                j7hVar.u = b62Var;
                j7hVar.x = 1;
                obj = b62Var.a(j7hVar);
                if (obj != lu3Var) {
                }
            }
        }
        j7hVar = new j7h(this, sq3Var);
        Object obj2 = j7hVar.v;
        lu3 lu3Var2 = lu3.a;
        i = j7hVar.x;
        if (i == 0) {
        }
    }

    public final Object e(Object obj, sq3 sq3Var) {
        Object q = this.c.q(sq3Var, obj);
        return q == lu3.a ? q : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(sq3 sq3Var) {
        ze0 ze0Var;
        int i;
        ve0 ve0Var;
        if (sq3Var instanceof ze0) {
            ze0Var = (ze0) sq3Var;
            int i2 = ze0Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ze0Var.u = i2 - Integer.MIN_VALUE;
                Object obj = ze0Var.s;
                Object obj2 = lu3.a;
                i = ze0Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    ve0 ve0Var2 = new ve0(new aea(this.j));
                    ze0Var.r = ve0Var2;
                    ze0Var.u = 1;
                    if (e(ve0Var2, ze0Var) == obj2) {
                        return obj2;
                    }
                    ve0Var = ve0Var2;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ve0Var = ze0Var.r;
                    y6a.M(obj);
                }
                return ve0Var.a;
            }
        }
        ze0Var = new ze0(this, sq3Var);
        Object obj3 = ze0Var.s;
        Object obj22 = lu3.a;
        i = ze0Var.u;
        if (i != 0) {
        }
        return ve0Var.a;
    }
}
