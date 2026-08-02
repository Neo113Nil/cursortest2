package com.sofascore.results.player;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.newNetwork.PlayerDetailsResponse;
import com.sofascore.results.service.AbstractRetryCoroutineWorker;
import defpackage.a70;
import defpackage.ad2;
import defpackage.aoe;
import defpackage.bye;
import defpackage.cce;
import defpackage.cl;
import defpackage.cye;
import defpackage.dye;
import defpackage.eye;
import defpackage.gz8;
import defpackage.jdb;
import defpackage.jid;
import defpackage.lu3;
import defpackage.qv5;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.udl;
import defpackage.w1l;
import defpackage.wu;
import defpackage.wve;
import defpackage.x2g;
import defpackage.x42;
import defpackage.y6a;
import defpackage.yaa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/sofascore/results/player/PlayerWorker;", "Lcom/sofascore/results/service/AbstractRetryCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lwve;", "playerRepository", "Ljid;", "notificationsSyncUseCase", "Ludl;", "cache", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lwve;Ljid;Ludl;)V", "bea", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlayerWorker extends AbstractRetryCoroutineWorker {
    public final wve b;
    public final jid c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull wve wveVar, @NotNull jid jidVar, @NotNull udl udlVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        wveVar.getClass();
        jidVar.getClass();
        udlVar.getClass();
        this.b = wveVar;
        this.c = jidVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d5, code lost:
    
        if (r10 == r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0172, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        if (c(r11, r0) == r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        if (r11 == r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f7, code lost:
    
        if (r10 == r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0114, code lost:
    
        if (d(r11, r0) == r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0154, code lost:
    
        if (r10 == r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0170, code lost:
    
        if (e(r10, r0) == r1) goto L74;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.sofascore.results.service.AbstractRetryCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        dye dyeVar;
        Object r;
        if (rq3Var instanceof dye) {
            dyeVar = (dye) rq3Var;
            int i = dyeVar.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                dyeVar.u = i - Integer.MIN_VALUE;
                Object obj = dyeVar.s;
                Object obj2 = lu3.a;
                int i2 = 3;
                rq3 rq3Var2 = null;
                switch (dyeVar.u) {
                    case 0:
                        y6a.M(obj);
                        String e = getInputData().e("ACTION");
                        if (e != null) {
                            switch (e.hashCode()) {
                                case -1589820676:
                                    if (e.equals("REMOVE_PLAYER")) {
                                        int a = getInputData().a("PLAYER_ID", 0);
                                        dyeVar.u = 2;
                                        break;
                                    }
                                    break;
                                case -1465804674:
                                    if (e.equals("ADD_PLAYER_LIST")) {
                                        String e2 = getInputData().e("ANALYTICS_ACTION");
                                        e2.getClass();
                                        long[] d = getInputData().d("PLAYER_IDS");
                                        wu valueOf = wu.valueOf(e2);
                                        dyeVar.r = null;
                                        dyeVar.u = 3;
                                        if (d != null) {
                                            r = s9a.r(new cce(d, this, valueOf, rq3Var2, 2), dyeVar);
                                            if (r != obj2) {
                                                r = Unit.a;
                                                break;
                                            }
                                        } else {
                                            r = Unit.a;
                                            break;
                                        }
                                    }
                                    break;
                                case -819023983:
                                    if (e.equals("DISABLE_NOTIFICATIONS")) {
                                        int a2 = getInputData().a("PLAYER_ID", 0);
                                        dyeVar.u = 7;
                                        break;
                                    }
                                    break;
                                case -743295220:
                                    if (e.equals("ENABLE_NOTIFICATIONS")) {
                                        int a3 = getInputData().a("PLAYER_ID", 0);
                                        dyeVar.u = 6;
                                        Object c = c(a3, dyeVar);
                                        if (c != obj2) {
                                            c = Unit.a;
                                            break;
                                        }
                                    }
                                    break;
                                case -93509618:
                                    if (e.equals("REFRESH_PLAYERS")) {
                                        dyeVar.r = this;
                                        dyeVar.u = 4;
                                        obj = this.b.e(dyeVar);
                                        break;
                                    }
                                    break;
                                case 786738271:
                                    if (e.equals("ADD_PLAYER")) {
                                        int a4 = getInputData().a("PLAYER_ID", 0);
                                        dyeVar.u = 1;
                                        break;
                                    }
                                    break;
                            }
                        }
                        return jdb.a();
                    case 3:
                    case 1:
                    case 2:
                    case 5:
                    case 6:
                    case 7:
                        y6a.M(obj);
                        return jdb.a();
                    case 4:
                        this = dyeVar.r;
                        y6a.M(obj);
                        Map map = (Map) obj;
                        ArrayList arrayList = new ArrayList(map.size());
                        Iterator it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            w1l.A(arrayList, ((Number) ((Map.Entry) it.next()).getKey()).intValue());
                        }
                        HashSet Q0 = CollectionsKt.Q0(arrayList);
                        dyeVar.r = null;
                        dyeVar.u = 5;
                        this.getClass();
                        Object r2 = s9a.r(new cce(Q0, this, rq3Var2, i2), dyeVar);
                        if (r2 != lu3.a) {
                            r2 = Unit.a;
                            break;
                        }
                        break;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        dyeVar = new dye(this, (sq3) rq3Var);
        Object obj3 = dyeVar.s;
        Object obj22 = lu3.a;
        int i22 = 3;
        rq3 rq3Var22 = null;
        switch (dyeVar.u) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0179, code lost:
    
        if (defpackage.jid.g(r56.c, r2, r3) == r4) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0157, code lost:
    
        if (r2 == r4) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007e, code lost:
    
        if (r2 == r4) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, sq3 sq3Var) {
        bye byeVar;
        lu3 lu3Var;
        int i2;
        wve wveVar;
        PlayerDetailsResponse playerDetailsResponse;
        Player player;
        Serializable e;
        int i3;
        int i4;
        Player player2;
        Player player3;
        Map map;
        int i5 = i;
        if (sq3Var instanceof bye) {
            byeVar = (bye) sq3Var;
            int i6 = byeVar.x;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                byeVar.x = i6 - Integer.MIN_VALUE;
                Object obj = byeVar.v;
                lu3Var = lu3.a;
                i2 = byeVar.x;
                wveVar = this.b;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    byeVar.r = i5;
                    byeVar.x = 1;
                    obj = wveVar.i(i5, byeVar);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            i4 = byeVar.s;
                            i3 = byeVar.r;
                            player2 = byeVar.t;
                            y6a.M(obj);
                            player3 = player2;
                            map = (Map) obj;
                            while (true) {
                                if (map.size() >= 500) {
                                }
                            }
                            return lu3Var;
                        }
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 != 5) {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                Map map2 = byeVar.u;
                                y6a.M(obj);
                                ad2 ad2Var = qv5.a;
                                qv5.a(x42.a);
                                return Unit.a;
                            }
                            i4 = byeVar.s;
                            i3 = byeVar.r;
                            Map map3 = byeVar.u;
                            y6a.M(obj);
                            if (((Boolean) obj).booleanValue()) {
                                Context applicationContext = getApplicationContext();
                                applicationContext.getClass();
                                byeVar.t = null;
                                byeVar.u = null;
                                byeVar.r = i3;
                                byeVar.s = i4;
                                byeVar.x = 5;
                            }
                            return Unit.a;
                        }
                        i4 = byeVar.s;
                        i3 = byeVar.r;
                        map = byeVar.u;
                        Player player4 = byeVar.t;
                        y6a.M(obj);
                        player3 = player4;
                        while (true) {
                            if (map.size() >= 500) {
                                int intValue = ((Number) ((Map.Entry) map.entrySet().iterator().next()).getKey()).intValue();
                                byeVar.t = player3;
                                byeVar.u = map;
                                byeVar.r = i3;
                                byeVar.s = i4;
                                byeVar.x = 3;
                                if (wveVar.q(intValue, byeVar) == lu3Var) {
                                    break;
                                }
                            } else {
                                Player copy$default = Player.copy$default(player3, 0, null, null, null, null, null, null, player3.getUserCount() + 1, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, -129, 31, null);
                                byeVar.t = null;
                                byeVar.u = null;
                                byeVar.r = i3;
                                byeVar.s = i4;
                                byeVar.x = 4;
                                aoe aoeVar = wveVar.a;
                                obj = gz8.T(byeVar, aoeVar.a, new cl(aoeVar, copy$default, rq3Var, 21));
                            }
                        }
                        return lu3Var;
                    }
                    i5 = byeVar.r;
                    y6a.M(obj);
                }
                playerDetailsResponse = (PlayerDetailsResponse) yaa.x((x2g) obj);
                if (playerDetailsResponse != null && (player = playerDetailsResponse.getPlayer()) != null) {
                    byeVar.t = player;
                    byeVar.r = i5;
                    byeVar.s = 0;
                    byeVar.x = 2;
                    e = wveVar.e(byeVar);
                    if (e != lu3Var) {
                        i3 = i5;
                        i4 = 0;
                        player2 = player;
                        obj = e;
                        player3 = player2;
                        map = (Map) obj;
                        while (true) {
                            if (map.size() >= 500) {
                            }
                        }
                    }
                    return lu3Var;
                }
                return Unit.a;
            }
        }
        byeVar = new bye(this, sq3Var);
        Object obj2 = byeVar.v;
        lu3Var = lu3.a;
        i2 = byeVar.x;
        wveVar = this.b;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        playerDetailsResponse = (PlayerDetailsResponse) yaa.x((x2g) obj2);
        if (playerDetailsResponse != null) {
            byeVar.t = player;
            byeVar.r = i5;
            byeVar.s = 0;
            byeVar.x = 2;
            e = wveVar.e(byeVar);
            if (e != lu3Var) {
            }
            return lu3Var;
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (defpackage.jid.g(r5.c, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, sq3 sq3Var) {
        cye cyeVar;
        Object obj;
        int i2;
        if (sq3Var instanceof cye) {
            cyeVar = (cye) sq3Var;
            int i3 = cyeVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cyeVar.u = i3 - Integer.MIN_VALUE;
                obj = cyeVar.s;
                lu3 lu3Var = lu3.a;
                i2 = cyeVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    cyeVar.r = i;
                    cyeVar.u = 1;
                    obj = this.b.a(i, cyeVar);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        ad2 ad2Var = qv5.a;
                        qv5.a(x42.a);
                        return Unit.a;
                    }
                    i = cyeVar.r;
                    y6a.M(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    Context applicationContext = getApplicationContext();
                    applicationContext.getClass();
                    cyeVar.r = i;
                    cyeVar.u = 2;
                }
                ad2 ad2Var2 = qv5.a;
                qv5.a(x42.a);
                return Unit.a;
            }
        }
        cyeVar = new cye(this, sq3Var);
        obj = cyeVar.s;
        lu3 lu3Var2 = lu3.a;
        i2 = cyeVar.u;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        ad2 ad2Var22 = qv5.a;
        qv5.a(x42.a);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (defpackage.jid.g(r5.c, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(int i, sq3 sq3Var) {
        eye eyeVar;
        Object obj;
        int i2;
        if (sq3Var instanceof eye) {
            eyeVar = (eye) sq3Var;
            int i3 = eyeVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eyeVar.u = i3 - Integer.MIN_VALUE;
                obj = eyeVar.s;
                lu3 lu3Var = lu3.a;
                i2 = eyeVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    eyeVar.r = i;
                    eyeVar.u = 1;
                    obj = this.b.q(i, eyeVar);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        ad2 ad2Var = qv5.a;
                        qv5.a(x42.a);
                        return Unit.a;
                    }
                    i = eyeVar.r;
                    y6a.M(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    Context applicationContext = getApplicationContext();
                    applicationContext.getClass();
                    eyeVar.r = i;
                    eyeVar.u = 2;
                }
                return Unit.a;
            }
        }
        eyeVar = new eye(this, sq3Var);
        obj = eyeVar.s;
        lu3 lu3Var2 = lu3.a;
        i2 = eyeVar.u;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return Unit.a;
    }
}
