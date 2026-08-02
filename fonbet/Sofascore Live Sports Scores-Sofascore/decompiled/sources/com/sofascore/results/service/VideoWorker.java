package com.sofascore.results.service;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.a70;
import defpackage.crk;
import defpackage.drk;
import defpackage.irk;
import defpackage.jdb;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.udl;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/sofascore/results/service/VideoWorker;", "Lcom/sofascore/results/service/AbstractRetryCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lirk;", "videoRepository", "Ludl;", "cache", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lirk;Ludl;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VideoWorker extends AbstractRetryCoroutineWorker {
    public final irk b;
    public final udl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull irk irkVar, @NotNull udl udlVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        irkVar.getClass();
        udlVar.getClass();
        this.b = irkVar;
        this.c = udlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.sofascore.results.service.AbstractRetryCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        drk drkVar;
        int i;
        if (rq3Var instanceof drk) {
            drkVar = (drk) rq3Var;
            int i2 = drkVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                drkVar.t = i2 - Integer.MIN_VALUE;
                Object obj = drkVar.r;
                Object obj2 = lu3.a;
                i = drkVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    int a = getInputData().a("WATCHED_ID", 0);
                    drkVar.t = 1;
                    if (c(a, drkVar) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return jdb.a();
            }
        }
        drkVar = new drk(this, (sq3) rq3Var);
        Object obj3 = drkVar.r;
        Object obj22 = lu3.a;
        i = drkVar.t;
        if (i != 0) {
        }
        return jdb.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r6.b.a(r4, r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r6.c.d(r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, sq3 sq3Var) {
        crk crkVar;
        int i2;
        if (sq3Var instanceof crk) {
            crkVar = (crk) sq3Var;
            int i3 = crkVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                crkVar.u = i3 - Integer.MIN_VALUE;
                Object obj = crkVar.s;
                lu3 lu3Var = lu3.a;
                i2 = crkVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    crkVar.r = i;
                    crkVar.u = 1;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = crkVar.r;
                    y6a.M(obj);
                }
                long currentTimeMillis = System.currentTimeMillis();
                crkVar.r = i;
                crkVar.u = 2;
            }
        }
        crkVar = new crk(this, sq3Var);
        Object obj2 = crkVar.s;
        lu3 lu3Var2 = lu3.a;
        i2 = crkVar.u;
        if (i2 != 0) {
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        crkVar.r = i;
        crkVar.u = 2;
    }
}
