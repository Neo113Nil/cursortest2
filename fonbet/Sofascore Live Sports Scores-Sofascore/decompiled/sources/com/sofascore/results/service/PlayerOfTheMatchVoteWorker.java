package com.sofascore.results.service;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.a70;
import defpackage.aue;
import defpackage.hdb;
import defpackage.jdb;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.t2g;
import defpackage.v2g;
import defpackage.wi9;
import defpackage.x2g;
import defpackage.y6a;
import defpackage.zte;
import defpackage.zzl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/sofascore/results/service/PlayerOfTheMatchVoteWorker;", "Lcom/sofascore/results/service/AbstractRetryCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lzte;", "playerOfTheMatchVoteRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lzte;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlayerOfTheMatchVoteWorker extends AbstractRetryCoroutineWorker {
    public final zte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerOfTheMatchVoteWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull zte zteVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        zteVar.getClass();
        this.b = zteVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.sofascore.results.service.AbstractRetryCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        aue aueVar;
        int i;
        x2g x2gVar;
        if (rq3Var instanceof aue) {
            aueVar = (aue) rq3Var;
            int i2 = aueVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aueVar.t = i2 - Integer.MIN_VALUE;
                aue aueVar2 = aueVar;
                Object obj = aueVar2.r;
                lu3 lu3Var = lu3.a;
                i = aueVar2.t;
                if (i != 0) {
                    y6a.M(obj);
                    int a = getInputData().a("EVENT_ID", 0);
                    long c = getInputData().c("EVENT_TIMESTAMP", 0L);
                    int a2 = getInputData().a("PLAYER_ID", 0);
                    aueVar2.t = 1;
                    obj = this.b.a(a, a2, c, aueVar2);
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
                x2gVar = (x2g) obj;
                if (!(x2gVar instanceof v2g)) {
                    return jdb.a();
                }
                if (x2gVar instanceof t2g) {
                    return ((t2g) x2gVar).a instanceof wi9 ? jdb.a() : new hdb();
                }
                zzl.b();
                return null;
            }
        }
        aueVar = new aue(this, (sq3) rq3Var);
        aue aueVar22 = aueVar;
        Object obj2 = aueVar22.r;
        lu3 lu3Var2 = lu3.a;
        i = aueVar22.t;
        if (i != 0) {
        }
        x2gVar = (x2g) obj2;
        if (!(x2gVar instanceof v2g)) {
        }
    }
}
