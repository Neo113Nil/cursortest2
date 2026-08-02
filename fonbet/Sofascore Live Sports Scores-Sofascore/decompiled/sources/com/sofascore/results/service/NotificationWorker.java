package com.sofascore.results.service;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.sofascore.results.helper.SofaBackupAgent;
import defpackage.a70;
import defpackage.aik;
import defpackage.hdb;
import defpackage.jdb;
import defpackage.jid;
import defpackage.lu3;
import defpackage.nhd;
import defpackage.ohd;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.y6a;
import defpackage.yhd;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/sofascore/results/service/NotificationWorker;", "Lcom/sofascore/results/service/AbstractRetryCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lyhd;", "dbRepository", "Ljid;", "notificationsSyncUseCase", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lyhd;Ljid;)V", "mha", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationWorker extends AbstractRetryCoroutineWorker {
    public final yhd b;
    public final jid c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull yhd yhdVar, @NotNull jid jidVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        yhdVar.getClass();
        jidVar.getClass();
        this.b = yhdVar;
        this.c = jidVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        if (defpackage.gz8.U(r0, r6.b.a.a, false, true, new defpackage.bvb(r7, 10)) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.sofascore.results.service.AbstractRetryCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        nhd nhdVar;
        int i;
        if (rq3Var instanceof nhd) {
            nhdVar = (nhd) rq3Var;
            int i2 = nhdVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nhdVar.t = i2 - Integer.MIN_VALUE;
                Object obj = nhdVar.r;
                Object obj2 = lu3.a;
                i = nhdVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    String e = getInputData().e("ACTION");
                    if (Intrinsics.c(e, "UPDATE")) {
                        nhdVar.t = 1;
                        Object c = c(nhdVar);
                        if (c != obj2) {
                            return c;
                        }
                    } else {
                        if (!Intrinsics.c(e, "REMOVE")) {
                            return jdb.a();
                        }
                        int a = getInputData().a("NOTIFICATION_ID", -1);
                        nhdVar.t = 2;
                    }
                    return obj2;
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
        nhdVar = new nhd(this, (sq3) rq3Var);
        Object obj3 = nhdVar.r;
        Object obj22 = lu3.a;
        i = nhdVar.t;
        if (i != 0) {
        }
        return jdb.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(sq3 sq3Var) {
        ohd ohdVar;
        Object obj;
        int i;
        if (sq3Var instanceof ohd) {
            ohdVar = (ohd) sq3Var;
            int i2 = ohdVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ohdVar.t = i2 - Integer.MIN_VALUE;
                obj = ohdVar.r;
                lu3 lu3Var = lu3.a;
                i = ohdVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    Context applicationContext = getApplicationContext();
                    applicationContext.getClass();
                    ohdVar.t = 1;
                    obj = this.c.f(applicationContext, ohdVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return new hdb();
                }
                Map map = SofaBackupAgent.b;
                aik.h0();
                return jdb.a();
            }
        }
        ohdVar = new ohd(this, sq3Var);
        obj = ohdVar.r;
        lu3 lu3Var2 = lu3.a;
        i = ohdVar.t;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
