package com.sofascore.results.service;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.a70;
import defpackage.c7l;
import defpackage.i7l;
import defpackage.jdb;
import defpackage.lu3;
import defpackage.qdj;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/sofascore/results/service/WidgetFavoriteWorker;", "Lcom/sofascore/results/service/AbstractRetryCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Li7l;", "widgetFavoritesRefresher", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Li7l;)V", "aba", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WidgetFavoriteWorker extends AbstractRetryCoroutineWorker {
    public final i7l b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetFavoriteWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull i7l i7lVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        i7lVar.getClass();
        this.b = i7lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        if (r5.d(r7, r2, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.sofascore.results.service.AbstractRetryCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        c7l c7lVar;
        int i;
        if (rq3Var instanceof c7l) {
            c7lVar = (c7l) rq3Var;
            int i2 = c7lVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c7lVar.t = i2 - Integer.MIN_VALUE;
                Object obj = c7lVar.r;
                lu3 lu3Var = lu3.a;
                i = c7lVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    String e = getInputData().e("ACTION");
                    boolean c = Intrinsics.c(e, "REFRESH_WIDGET_FAVORITES");
                    i7l i7lVar = this.b;
                    if (c) {
                        Context applicationContext = getApplicationContext();
                        applicationContext.getClass();
                        c7lVar.t = 1;
                        Object a = i7lVar.a(applicationContext, c7lVar);
                        if (a != lu3Var) {
                            return a;
                        }
                    } else {
                        if (!Intrinsics.c(e, "UPDATE_WIDGET_NOTIFICATION_STATUS")) {
                            return jdb.a();
                        }
                        Context applicationContext2 = getApplicationContext();
                        applicationContext2.getClass();
                        qdj qdjVar = new qdj(this, 20);
                        c7lVar.t = 2;
                    }
                    return lu3Var;
                }
                if (i == 1) {
                    y6a.M(obj);
                    return obj;
                }
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                return jdb.a();
            }
        }
        c7lVar = new c7l(this, (sq3) rq3Var);
        Object obj2 = c7lVar.r;
        lu3 lu3Var2 = lu3.a;
        i = c7lVar.t;
        if (i != 0) {
        }
        return jdb.a();
    }
}
