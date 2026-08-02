package com.sofascore.results.service.game;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.WorkerParameters;
import com.sofascore.results.service.AbstractRetryCoroutineWorker;
import defpackage.a5f;
import defpackage.a70;
import defpackage.dhk;
import defpackage.hdb;
import defpackage.jdb;
import defpackage.jpi;
import defpackage.lu3;
import defpackage.qa6;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.uic;
import defpackage.y6a;
import java.io.Serializable;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/sofascore/results/service/game/SyncEventsWorker;", "Lcom/sofascore/results/service/AbstractRetryCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lqa6;", "eventStageRepository", "Ldhk;", "userRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lqa6;Ldhk;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SyncEventsWorker extends AbstractRetryCoroutineWorker {
    public final qa6 b;
    public final dhk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncEventsWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull qa6 qa6Var, @NotNull dhk dhkVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        qa6Var.getClass();
        dhkVar.getClass();
        this.b = qa6Var;
        this.c = dhkVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        if (r9 != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.sofascore.results.service.AbstractRetryCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        jpi jpiVar;
        int i;
        dhk dhkVar;
        SharedPreferences d;
        if (rq3Var instanceof jpi) {
            jpiVar = (jpi) rq3Var;
            int i2 = jpiVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jpiVar.u = i2 - Integer.MIN_VALUE;
                Object obj = jpiVar.s;
                lu3 lu3Var = lu3.a;
                i = jpiVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    Context applicationContext = getApplicationContext();
                    applicationContext.getClass();
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext2 = applicationContext.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext2);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    if (!sharedPreferences.getBoolean("INIT_DONE", false)) {
                        return jdb.a();
                    }
                    dhk dhkVar2 = this.c;
                    qa6 qa6Var = this.b;
                    jpiVar.r = dhkVar2;
                    jpiVar.u = 1;
                    Serializable h = qa6Var.h(jpiVar);
                    if (h != lu3Var) {
                        obj = h;
                        dhkVar = dhkVar2;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return ((Boolean) obj).booleanValue() ? jdb.a() : new hdb();
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dhkVar = jpiVar.r;
                y6a.M(obj);
                jpiVar.r = null;
                jpiVar.u = 2;
                obj = dhkVar.i((Set) obj, jpiVar);
            }
        }
        jpiVar = new jpi(this, (sq3) rq3Var);
        Object obj2 = jpiVar.s;
        lu3 lu3Var2 = lu3.a;
        i = jpiVar.u;
        if (i != 0) {
        }
        jpiVar.r = null;
        jpiVar.u = 2;
        obj2 = dhkVar.i((Set) obj2, jpiVar);
    }
}
