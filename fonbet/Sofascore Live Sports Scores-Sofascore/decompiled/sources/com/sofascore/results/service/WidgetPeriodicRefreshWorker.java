package com.sofascore.results.service;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.sofascore.results.wc26.widget.WorldCupWidgetReceiver;
import com.sofascore.results.widget.SofaWidgetReceiver;
import defpackage.a70;
import defpackage.auh;
import defpackage.i7l;
import defpackage.jdb;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.td4;
import defpackage.u7l;
import defpackage.xbl;
import defpackage.y6a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/sofascore/results/service/WidgetPeriodicRefreshWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Li7l;", "widgetFavoritesRefresher", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Li7l;)V", "wca", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WidgetPeriodicRefreshWorker extends CoroutineWorker {
    public final i7l a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetPeriodicRefreshWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull i7l i7lVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        i7lVar.getClass();
        this.a = i7lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(rq3 rq3Var) {
        u7l u7lVar;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (rq3Var instanceof u7l) {
            u7lVar = (u7l) rq3Var;
            int i2 = u7lVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u7lVar.v = i2 - Integer.MIN_VALUE;
                Object obj = u7lVar.t;
                lu3 lu3Var = lu3.a;
                i = u7lVar.v;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    Context applicationContext = getApplicationContext();
                    applicationContext.getClass();
                    int[] appWidgetIds = AppWidgetManager.getInstance(applicationContext).getAppWidgetIds(new ComponentName(applicationContext, (Class<?>) WorldCupWidgetReceiver.class));
                    appWidgetIds.getClass();
                    boolean z5 = appWidgetIds.length == 0;
                    z = !z5;
                    Context applicationContext2 = getApplicationContext();
                    applicationContext2.getClass();
                    int[] appWidgetIds2 = AppWidgetManager.getInstance(applicationContext2).getAppWidgetIds(new ComponentName(applicationContext2, (Class<?>) SofaWidgetReceiver.class));
                    appWidgetIds2.getClass();
                    boolean z6 = appWidgetIds2.length == 0;
                    z2 = !z6;
                    if (z5 && z6) {
                        Context applicationContext3 = getApplicationContext();
                        applicationContext3.getClass();
                        xbl d = xbl.d(applicationContext3);
                        d.getClass();
                        d.c();
                        return jdb.a();
                    }
                    if (!z5) {
                        auh auhVar = new auh(i3);
                        Context applicationContext4 = getApplicationContext();
                        applicationContext4.getClass();
                        u7lVar.r = z;
                        u7lVar.s = z2;
                        u7lVar.v = 1;
                        if (td4.y0(auhVar, applicationContext4, u7lVar) != lu3Var) {
                            z3 = z;
                            z4 = z2;
                        }
                    }
                    if (!z2) {
                        return jdb.a();
                    }
                    Context applicationContext5 = getApplicationContext();
                    applicationContext5.getClass();
                    u7lVar.r = z;
                    u7lVar.s = z2;
                    u7lVar.v = 2;
                    Object a = this.a.a(applicationContext5, u7lVar);
                    return a == lu3Var ? lu3Var : a;
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z4 = u7lVar.s;
                z3 = u7lVar.r;
                y6a.M(obj);
                z2 = z4;
                z = z3;
                if (!z2) {
                }
            }
        }
        u7lVar = new u7l(this, (sq3) rq3Var);
        Object obj2 = u7lVar.t;
        lu3 lu3Var2 = lu3.a;
        i = u7lVar.v;
        int i32 = 1;
        if (i != 0) {
        }
        z2 = z4;
        z = z3;
        if (!z2) {
        }
    }
}
