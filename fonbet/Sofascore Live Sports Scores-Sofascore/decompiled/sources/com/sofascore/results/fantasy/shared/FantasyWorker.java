package com.sofascore.results.fantasy.shared;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.sofascore.results.service.AbstractRetryCoroutineWorker;
import defpackage.a70;
import defpackage.ad2;
import defpackage.jdb;
import defpackage.jid;
import defpackage.lq7;
import defpackage.lu3;
import defpackage.mq7;
import defpackage.nq7;
import defpackage.qv5;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.udl;
import defpackage.wi7;
import defpackage.y6a;
import defpackage.z42;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/sofascore/results/fantasy/shared/FantasyWorker;", "Lcom/sofascore/results/service/AbstractRetryCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lwi7;", "fantasyRepository", "Ljid;", "notificationsSyncUseCase", "Ludl;", "cache", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lwi7;Ljid;Ludl;)V", "hkg", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyWorker extends AbstractRetryCoroutineWorker {
    public final wi7 b;
    public final jid c;
    public final udl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FantasyWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull wi7 wi7Var, @NotNull jid jidVar, @NotNull udl udlVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        wi7Var.getClass();
        jidVar.getClass();
        udlVar.getClass();
        this.b = wi7Var;
        this.c = jidVar;
        this.d = udlVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
    
        if (r10.c.b(r11, false, r0) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
    
        if (c(r11, r0) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
    
        if (r11 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c4, code lost:
    
        if (d(r11, r0) == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.sofascore.results.service.AbstractRetryCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        mq7 mq7Var;
        int i;
        if (rq3Var instanceof mq7) {
            mq7Var = (mq7) rq3Var;
            int i2 = mq7Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mq7Var.t = i2 - Integer.MIN_VALUE;
                Object obj = mq7Var.r;
                Object obj2 = lu3.a;
                i = mq7Var.t;
                if (i == 0) {
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            y6a.M(obj);
                            if (!((Collection) obj).isEmpty()) {
                                Context applicationContext = getApplicationContext();
                                applicationContext.getClass();
                                mq7Var.t = 4;
                            }
                            return jdb.a();
                        }
                        if (i != 4) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    y6a.M(obj);
                    return jdb.a();
                }
                y6a.M(obj);
                String e = getInputData().e("ACTION");
                if (e != null) {
                    int hashCode = e.hashCode();
                    if (hashCode != -1948202396) {
                        if (hashCode != 647978311) {
                            if (hashCode == 1147324129 && e.equals("ADD_COMPETITION")) {
                                int a = getInputData().a("COMPETITION_ID", 0);
                                mq7Var.t = 1;
                            }
                        } else if (e.equals("FORCE_REFRESH")) {
                            mq7Var.t = 3;
                            obj = this.b.A(mq7Var);
                        }
                    } else if (e.equals("REMOVE_COMPETITION")) {
                        int a2 = getInputData().a("COMPETITION_ID", 0);
                        mq7Var.t = 2;
                    }
                }
                return jdb.a();
                return obj2;
            }
        }
        mq7Var = new mq7(this, (sq3) rq3Var);
        Object obj3 = mq7Var.r;
        Object obj22 = lu3.a;
        i = mq7Var.t;
        if (i == 0) {
        }
        return obj22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (r6.c.b(r8, false, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r8 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (r6.d.a(r7, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, sq3 sq3Var) {
        lq7 lq7Var;
        int i2;
        if (sq3Var instanceof lq7) {
            lq7Var = (lq7) sq3Var;
            int i3 = lq7Var.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lq7Var.u = i3 - Integer.MIN_VALUE;
                Object obj = lq7Var.s;
                lu3 lu3Var = lu3.a;
                i2 = lq7Var.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    lq7Var.r = i;
                    lq7Var.u = 1;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj);
                            ad2 ad2Var = qv5.a;
                            qv5.a(z42.a);
                            return Unit.a;
                        }
                        i = lq7Var.r;
                        y6a.M(obj);
                        if (((Boolean) obj).booleanValue()) {
                            Context applicationContext = getApplicationContext();
                            applicationContext.getClass();
                            lq7Var.r = i;
                            lq7Var.u = 3;
                        }
                        ad2 ad2Var2 = qv5.a;
                        qv5.a(z42.a);
                        return Unit.a;
                    }
                    i = lq7Var.r;
                    y6a.M(obj);
                }
                lq7Var.r = i;
                lq7Var.u = 2;
                obj = this.b.d0(i, lq7Var);
            }
        }
        lq7Var = new lq7(this, sq3Var);
        Object obj2 = lq7Var.s;
        lu3 lu3Var2 = lu3.a;
        i2 = lq7Var.u;
        if (i2 != 0) {
        }
        lq7Var.r = i;
        lq7Var.u = 2;
        obj2 = this.b.d0(i, lq7Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (r6.c.b(r8, false, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r8 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (r6.d.j(r7, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, sq3 sq3Var) {
        nq7 nq7Var;
        int i2;
        if (sq3Var instanceof nq7) {
            nq7Var = (nq7) sq3Var;
            int i3 = nq7Var.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nq7Var.u = i3 - Integer.MIN_VALUE;
                Object obj = nq7Var.s;
                lu3 lu3Var = lu3.a;
                i2 = nq7Var.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    nq7Var.r = i;
                    nq7Var.u = 1;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj);
                            ad2 ad2Var = qv5.a;
                            qv5.a(z42.a);
                            return Unit.a;
                        }
                        i = nq7Var.r;
                        y6a.M(obj);
                        if (((Boolean) obj).booleanValue()) {
                            Context applicationContext = getApplicationContext();
                            applicationContext.getClass();
                            nq7Var.r = i;
                            nq7Var.u = 3;
                        }
                        ad2 ad2Var2 = qv5.a;
                        qv5.a(z42.a);
                        return Unit.a;
                    }
                    i = nq7Var.r;
                    y6a.M(obj);
                }
                nq7Var.r = i;
                nq7Var.u = 2;
                obj = this.b.c(i, nq7Var);
            }
        }
        nq7Var = new nq7(this, sq3Var);
        Object obj2 = nq7Var.s;
        lu3 lu3Var2 = lu3.a;
        i2 = nq7Var.u;
        if (i2 != 0) {
        }
        nq7Var.r = i;
        nq7Var.u = 2;
        obj2 = this.b.c(i, nq7Var);
    }
}
