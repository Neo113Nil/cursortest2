package com.sofascore.results.service;

import android.content.Context;
import android.content.Intent;
import androidx.work.WorkerParameters;
import com.sofascore.model.mvvm.model.StageIds;
import defpackage.a52;
import defpackage.a70;
import defpackage.aba;
import defpackage.ad2;
import defpackage.bt7;
import defpackage.dhk;
import defpackage.gdb;
import defpackage.gz8;
import defpackage.hdb;
import defpackage.jdb;
import defpackage.js7;
import defpackage.k13;
import defpackage.ks7;
import defpackage.ls7;
import defpackage.lu3;
import defpackage.ms7;
import defpackage.qa6;
import defpackage.qv5;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.w1l;
import defpackage.w3a;
import defpackage.y6a;
import defpackage.yz;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/sofascore/results/service/FavoriteWorker;", "Lcom/sofascore/results/service/AbstractRetryCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lqa6;", "eventStageRepository", "Ldhk;", "userRepository", "Lbt7;", "favoritesUseCase", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lqa6;Ldhk;Lbt7;)V", "o02", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoriteWorker extends AbstractRetryCoroutineWorker {
    public final qa6 b;
    public final dhk c;
    public final bt7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull qa6 qa6Var, @NotNull dhk dhkVar, @NotNull bt7 bt7Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        qa6Var.getClass();
        dhkVar.getClass();
        bt7Var.getClass();
        this.b = qa6Var;
        this.c = dhkVar;
        this.d = bt7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (r8 == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.sofascore.results.service.AbstractRetryCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        js7 js7Var;
        int i;
        if (rq3Var instanceof js7) {
            js7Var = (js7) rq3Var;
            int i2 = js7Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                js7Var.t = i2 - Integer.MIN_VALUE;
                Object obj = js7Var.r;
                Object obj2 = lu3.a;
                i = js7Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    String e = getInputData().e("ACTION");
                    if (e != null) {
                        int hashCode = e.hashCode();
                        if (hashCode != -1225730353) {
                            bt7 bt7Var = this.d;
                            if (hashCode != 418358707) {
                                if (hashCode == 850959227 && e.equals("REFRESH_WEAR_FAVORITES")) {
                                    Context applicationContext = getApplicationContext();
                                    applicationContext.getClass();
                                    bt7Var.e(applicationContext);
                                    Context applicationContext2 = getApplicationContext();
                                    applicationContext2.getClass();
                                    w3a.Q(applicationContext2);
                                    js7Var.t = 2;
                                    obj = d(js7Var);
                                }
                            } else if (e.equals("REFRESH_FAVORITES")) {
                                Context applicationContext3 = getApplicationContext();
                                applicationContext3.getClass();
                                bt7Var.e(applicationContext3);
                                js7Var.t = 1;
                                Object d = d(js7Var);
                                return d == obj2 ? obj2 : d;
                            }
                        } else if (e.equals("HIDE_FINISHED")) {
                            js7Var.t = 3;
                            Object c = c(js7Var);
                            if (c != obj2) {
                                return c;
                            }
                        }
                    }
                    return new gdb();
                }
                if (i == 1) {
                    y6a.M(obj);
                    return obj;
                }
                if (i != 2) {
                    if (i == 3) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                jdb jdbVar = (jdb) obj;
                Intent intent = new Intent();
                intent.setAction("wearDataRefreshed");
                Context applicationContext4 = getApplicationContext();
                applicationContext4.getClass();
                intent.setPackage(applicationContext4.getApplicationContext().getPackageName());
                applicationContext4.sendBroadcast(intent);
                return jdbVar;
            }
        }
        js7Var = new js7(this, (sq3) rq3Var);
        Object obj3 = js7Var.r;
        Object obj22 = lu3.a;
        i = js7Var.t;
        if (i != 0) {
        }
        jdb jdbVar2 = (jdb) obj3;
        Intent intent2 = new Intent();
        intent2.setAction("wearDataRefreshed");
        Context applicationContext42 = getApplicationContext();
        applicationContext42.getClass();
        intent2.setPackage(applicationContext42.getApplicationContext().getPackageName());
        applicationContext42.sendBroadcast(intent2);
        return jdbVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009e, code lost:
    
        if (e(r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a0, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r14 != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r14 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(sq3 sq3Var) {
        ks7 ks7Var;
        Object obj;
        int i;
        Object U;
        if (sq3Var instanceof ks7) {
            ks7Var = (ks7) sq3Var;
            int i2 = ks7Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ks7Var.t = i2 - Integer.MIN_VALUE;
                Object obj2 = ks7Var.r;
                obj = lu3.a;
                i = ks7Var.t;
                qa6 qa6Var = this.b;
                if (i != 0) {
                    y6a.M(obj2);
                    ks7Var.t = 1;
                    qa6Var.getClass();
                    Object U2 = gz8.U(ks7Var, qa6Var.a.a, false, true, new yz(System.currentTimeMillis() / 1000, 13));
                    if (U2 != obj) {
                        U2 = Unit.a;
                    }
                    if (U2 != obj) {
                        U2 = Unit.a;
                    }
                } else if (i == 1) {
                    y6a.M(obj2);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj2);
                        Context applicationContext = getApplicationContext();
                        applicationContext.getClass();
                        aba.E(applicationContext);
                        return jdb.a();
                    }
                    y6a.M(obj2);
                    ad2 ad2Var = qv5.a;
                    qv5.a(a52.a);
                    ks7Var.t = 3;
                }
                ks7Var.t = 2;
                qa6Var.getClass();
                U = gz8.U(ks7Var, qa6Var.a.a, false, true, new yz(System.currentTimeMillis() / 1000, 16));
                if (U != obj) {
                    U = Unit.a;
                }
                if (U != obj) {
                    U = Unit.a;
                }
            }
        }
        ks7Var = new ks7(this, sq3Var);
        Object obj22 = ks7Var.r;
        obj = lu3.a;
        i = ks7Var.t;
        qa6 qa6Var2 = this.b;
        if (i != 0) {
        }
        ks7Var.t = 2;
        qa6Var2.getClass();
        U = gz8.U(ks7Var, qa6Var2.a.a, false, true, new yz(System.currentTimeMillis() / 1000, 16));
        if (U != obj) {
        }
        if (U != obj) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (e(r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0040, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(sq3 sq3Var) {
        ls7 ls7Var;
        int i;
        Boolean bool;
        if (sq3Var instanceof ls7) {
            ls7Var = (ls7) sq3Var;
            int i2 = ls7Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ls7Var.t = i2 - Integer.MIN_VALUE;
                Object obj = ls7Var.r;
                Object obj2 = lu3.a;
                i = ls7Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    ls7Var.t = 1;
                    obj = this.d.d(ls7Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return jdb.a();
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                bool = (Boolean) obj;
                if (Intrinsics.c(bool, Boolean.TRUE)) {
                    return Intrinsics.c(bool, Boolean.FALSE) ? new hdb() : jdb.a();
                }
                ls7Var.t = 2;
            }
        }
        ls7Var = new ls7(this, sq3Var);
        Object obj3 = ls7Var.r;
        Object obj22 = lu3.a;
        i = ls7Var.t;
        if (i != 0) {
        }
        bool = (Boolean) obj3;
        if (Intrinsics.c(bool, Boolean.TRUE)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c3, code lost:
    
        if (r6.r(r7, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        if (r7 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        if (r2.i((java.util.Set) r7, r0) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0067, code lost:
    
        if (r2.m((java.util.Set) r7, r0) != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(sq3 sq3Var) {
        ms7 ms7Var;
        int i;
        dhk dhkVar;
        dhk dhkVar2;
        if (sq3Var instanceof ms7) {
            ms7Var = (ms7) sq3Var;
            int i2 = ms7Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ms7Var.u = i2 - Integer.MIN_VALUE;
                Object obj = ms7Var.s;
                Object obj2 = lu3.a;
                i = ms7Var.u;
                qa6 qa6Var = this.b;
                dhk dhkVar3 = this.c;
                switch (i) {
                    case 0:
                        y6a.M(obj);
                        ms7Var.r = dhkVar3;
                        ms7Var.u = 1;
                        obj = qa6Var.g(ms7Var);
                        if (obj != obj2) {
                            dhkVar = dhkVar3;
                            ms7Var.r = null;
                            ms7Var.u = 2;
                            break;
                        }
                        return obj2;
                    case 1:
                        dhkVar = ms7Var.r;
                        y6a.M(obj);
                        ms7Var.r = null;
                        ms7Var.u = 2;
                        break;
                    case 2:
                        y6a.M(obj);
                        ms7Var.r = dhkVar3;
                        ms7Var.u = 3;
                        obj = qa6Var.h(ms7Var);
                        if (obj != obj2) {
                            dhkVar2 = dhkVar3;
                            ms7Var.r = null;
                            ms7Var.u = 4;
                            break;
                        }
                        return obj2;
                    case 3:
                        dhkVar2 = ms7Var.r;
                        y6a.M(obj);
                        ms7Var.r = null;
                        ms7Var.u = 4;
                        break;
                    case 4:
                        y6a.M(obj);
                        ms7Var.r = dhkVar3;
                        ms7Var.u = 5;
                        obj = qa6Var.k(ms7Var);
                        break;
                    case 5:
                        dhkVar3 = ms7Var.r;
                        y6a.M(obj);
                        Iterable iterable = (Iterable) obj;
                        ArrayList arrayList = new ArrayList(k13.r(iterable, 10));
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            w1l.A(arrayList, ((StageIds) it.next()).getId());
                        }
                        HashSet Q0 = CollectionsKt.Q0(arrayList);
                        ms7Var.r = null;
                        ms7Var.u = 6;
                        break;
                    case 6:
                        y6a.M(obj);
                        return Unit.a;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        ms7Var = new ms7(this, sq3Var);
        Object obj3 = ms7Var.s;
        Object obj22 = lu3.a;
        i = ms7Var.u;
        qa6 qa6Var2 = this.b;
        dhk dhkVar32 = this.c;
        switch (i) {
        }
    }
}
