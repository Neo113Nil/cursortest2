package com.sofascore.results.team;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.EventResponse;
import com.sofascore.model.newNetwork.TeamDetailsResponse;
import com.sofascore.results.service.AbstractRetryCoroutineWorker;
import defpackage.a52;
import defpackage.a5j;
import defpackage.a70;
import defpackage.aba;
import defpackage.ad2;
import defpackage.b5j;
import defpackage.bvb;
import defpackage.fvi;
import defpackage.fzh;
import defpackage.gz8;
import defpackage.j0j;
import defpackage.jdb;
import defpackage.jid;
import defpackage.lu3;
import defpackage.ndl;
import defpackage.pf4;
import defpackage.qa6;
import defpackage.qv5;
import defpackage.rq3;
import defpackage.s96;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.td4;
import defpackage.udl;
import defpackage.v4j;
import defpackage.w4j;
import defpackage.wu;
import defpackage.x2g;
import defpackage.x42;
import defpackage.x4j;
import defpackage.xr2;
import defpackage.y4j;
import defpackage.y6a;
import defpackage.yaa;
import defpackage.z4j;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.g;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012BE\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/sofascore/results/team/TeamWorker;", "Lcom/sofascore/results/service/AbstractRetryCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lj0j;", "teamRepository", "Lqa6;", "eventStageRepository", "Ls96;", "eventStageNetworkRepository", "Ljid;", "notificationsSyncUseCase", "Ludl;", "cache", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lj0j;Lqa6;Ls96;Ljid;Ludl;)V", "v7a", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TeamWorker extends AbstractRetryCoroutineWorker {
    public final j0j b;
    public final qa6 c;
    public final s96 d;
    public final jid e;
    public final udl f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull j0j j0jVar, @NotNull qa6 qa6Var, @NotNull s96 s96Var, @NotNull jid jidVar, @NotNull udl udlVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        j0jVar.getClass();
        qa6Var.getClass();
        s96Var.getClass();
        jidVar.getClass();
        udlVar.getClass();
        this.b = j0jVar;
        this.c = qa6Var;
        this.d = s96Var;
        this.e = jidVar;
        this.f = udlVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x011d, code lost:
    
        if (defpackage.s9a.r(new defpackage.h4i((java.util.HashSet) r10, r9, r7, 14), r0) != r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (h(r10, r0) == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (r9 == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d0, code lost:
    
        if (c(r9, r0) == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ec, code lost:
    
        if (d(r9, r0) == r1) goto L59;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.sofascore.results.service.AbstractRetryCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        x4j x4jVar;
        TeamWorker teamWorker;
        Object r;
        if (rq3Var instanceof x4j) {
            x4jVar = (x4j) rq3Var;
            int i = x4jVar.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                x4jVar.u = i - Integer.MIN_VALUE;
                Object obj = x4jVar.s;
                Object obj2 = lu3.a;
                rq3 rq3Var2 = null;
                switch (x4jVar.u) {
                    case 0:
                        y6a.M(obj);
                        String e = getInputData().e("ACTION");
                        if (e != null) {
                            switch (e.hashCode()) {
                                case -1694934254:
                                    if (e.equals("REFRESH_TEAMS")) {
                                        x4jVar.r = this;
                                        x4jVar.u = 4;
                                        obj = this.b.c(x4jVar);
                                        if (obj != obj2) {
                                            teamWorker = this;
                                            x4jVar.r = null;
                                            x4jVar.u = 5;
                                            teamWorker.getClass();
                                            break;
                                        }
                                        return obj2;
                                    }
                                    break;
                                case -819023983:
                                    if (e.equals("DISABLE_NOTIFICATIONS")) {
                                        int a = getInputData().a("TEAM_ID", 0);
                                        x4jVar.u = 6;
                                        break;
                                    }
                                    break;
                                case -423649445:
                                    if (e.equals("ADD_TEAM")) {
                                        int a2 = getInputData().a("TEAM_ID", 0);
                                        x4jVar.u = 1;
                                        break;
                                    }
                                    break;
                                case -248230824:
                                    if (e.equals("ADD_TEAMS")) {
                                        String e2 = getInputData().e("ANALYTICS_ACTION");
                                        e2.getClass();
                                        long[] d = getInputData().d("TEAM_IDS");
                                        wu valueOf = wu.valueOf(e2);
                                        x4jVar.r = null;
                                        x4jVar.u = 2;
                                        if (d != null) {
                                            r = s9a.r(new pf4(d, this, valueOf, rq3Var2, 4), x4jVar);
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
                                case 1888958776:
                                    if (e.equals("REMOVE_TEAM")) {
                                        int a3 = getInputData().a("TEAM_ID", 0);
                                        x4jVar.u = 3;
                                        break;
                                    }
                                    break;
                            }
                        }
                        return jdb.a();
                    case 2:
                    case 1:
                    case 3:
                    case 5:
                    case 6:
                        y6a.M(obj);
                        return jdb.a();
                    case 4:
                        teamWorker = x4jVar.r;
                        y6a.M(obj);
                        x4jVar.r = null;
                        x4jVar.u = 5;
                        teamWorker.getClass();
                        break;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        x4jVar = new x4j(this, (sq3) rq3Var);
        Object obj3 = x4jVar.s;
        Object obj22 = lu3.a;
        rq3 rq3Var22 = null;
        switch (x4jVar.u) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x01de, code lost:
    
        if (i(r2, false, r3) == r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x01c6, code lost:
    
        if (defpackage.jid.i(r55.e, r2, r3) == r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0096, code lost:
    
        if (r2 == r4) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0122 -> B:25:0x0125). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, sq3 sq3Var) {
        v4j v4jVar;
        int i2;
        Team team;
        Team team2;
        Set set;
        int i3;
        int i4;
        int i5;
        Set set2;
        Team team3;
        Object U;
        Object obj;
        int i6;
        Team team4;
        boolean booleanValue;
        int i7 = i;
        if (sq3Var instanceof v4j) {
            v4jVar = (v4j) sq3Var;
            int i8 = v4jVar.z;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                v4jVar.z = i8 - Integer.MIN_VALUE;
                Object obj2 = v4jVar.x;
                Object obj3 = lu3.a;
                i2 = v4jVar.z;
                int i9 = 3;
                int i10 = 2;
                j0j j0jVar = this.b;
                rq3 rq3Var = null;
                switch (i2) {
                    case 0:
                        y6a.M(obj2);
                        v4jVar.r = i7;
                        v4jVar.z = 1;
                        obj2 = j0jVar.k(i7, v4jVar);
                        break;
                    case 1:
                        i7 = v4jVar.r;
                        y6a.M(obj2);
                        TeamDetailsResponse teamDetailsResponse = (TeamDetailsResponse) yaa.x((x2g) obj2);
                        if (teamDetailsResponse != null && (team = teamDetailsResponse.getTeam()) != null) {
                            udl udlVar = this.f;
                            Set set3 = udlVar.j;
                            if (set3 == null) {
                                set3 = (Set) td4.t0(g.a, new ndl(udlVar, rq3Var, i10));
                            }
                            Set set4 = set3;
                            team2 = team;
                            set = set4;
                            i3 = 0;
                            if (set.size() >= 400) {
                                int intValue = ((Number) set.iterator().next()).intValue();
                                v4jVar.u = team2;
                                v4jVar.v = set;
                                v4jVar.r = i7;
                                v4jVar.s = i3;
                                v4jVar.t = intValue;
                                v4jVar.z = i10;
                                if (j0jVar.I(intValue, v4jVar) != obj3) {
                                    team3 = team2;
                                    i5 = i7;
                                    i4 = intValue;
                                    set2 = set;
                                    v4jVar.u = team3;
                                    v4jVar.v = set2;
                                    v4jVar.r = i5;
                                    v4jVar.s = i3;
                                    v4jVar.t = i4;
                                    v4jVar.z = 3;
                                    U = gz8.U(v4jVar, j0jVar.a.a, false, true, new bvb(i4, 25));
                                    obj = lu3.a;
                                    if (U != obj) {
                                        U = Unit.a;
                                    }
                                    if (U != obj) {
                                        U = Unit.a;
                                    }
                                    if (U != obj3) {
                                        i7 = i5;
                                        set = set2;
                                        team2 = team3;
                                        i10 = 2;
                                        if (set.size() >= 400) {
                                            Pair pair = new Pair(Team.copy$default(team2, 0, null, null, team2.getUserCount() + 1, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, 63, null), Boolean.TRUE);
                                            v4jVar.u = team2;
                                            v4jVar.v = null;
                                            v4jVar.r = i7;
                                            v4jVar.s = i3;
                                            v4jVar.z = 4;
                                            fvi fviVar = j0jVar.a;
                                            obj2 = gz8.T(v4jVar, fviVar.a, new fzh(fviVar, pair, rq3Var, i9));
                                            if (obj2 != obj3) {
                                                i6 = i7;
                                                team4 = team2;
                                                booleanValue = ((Boolean) obj2).booleanValue();
                                                if (booleanValue) {
                                                    Context applicationContext = getApplicationContext();
                                                    applicationContext.getClass();
                                                    v4jVar.u = team4;
                                                    v4jVar.v = null;
                                                    v4jVar.r = i6;
                                                    v4jVar.s = i3;
                                                    v4jVar.w = booleanValue;
                                                    v4jVar.z = 5;
                                                    break;
                                                }
                                                ad2 ad2Var = qv5.a;
                                                qv5.a(x42.a);
                                            }
                                        }
                                    }
                                }
                            }
                            return obj3;
                        }
                        return Unit.a;
                    case 2:
                        i4 = v4jVar.t;
                        i3 = v4jVar.s;
                        i5 = v4jVar.r;
                        set2 = v4jVar.v;
                        team3 = v4jVar.u;
                        y6a.M(obj2);
                        v4jVar.u = team3;
                        v4jVar.v = set2;
                        v4jVar.r = i5;
                        v4jVar.s = i3;
                        v4jVar.t = i4;
                        v4jVar.z = 3;
                        U = gz8.U(v4jVar, j0jVar.a.a, false, true, new bvb(i4, 25));
                        obj = lu3.a;
                        if (U != obj) {
                        }
                        if (U != obj) {
                        }
                        if (U != obj3) {
                        }
                        return obj3;
                    case 3:
                        int i11 = v4jVar.s;
                        int i12 = v4jVar.r;
                        Set set5 = v4jVar.v;
                        Team team5 = v4jVar.u;
                        y6a.M(obj2);
                        i3 = i11;
                        i7 = i12;
                        set = set5;
                        team2 = team5;
                        i10 = 2;
                        if (set.size() >= 400) {
                        }
                        return obj3;
                    case 4:
                        int i13 = v4jVar.s;
                        int i14 = v4jVar.r;
                        Set set6 = v4jVar.v;
                        Team team6 = v4jVar.u;
                        y6a.M(obj2);
                        team4 = team6;
                        i6 = i14;
                        i3 = i13;
                        booleanValue = ((Boolean) obj2).booleanValue();
                        if (booleanValue) {
                        }
                        ad2 ad2Var2 = qv5.a;
                        qv5.a(x42.a);
                        return Unit.a;
                    case 5:
                        booleanValue = v4jVar.w;
                        i3 = v4jVar.s;
                        i6 = v4jVar.r;
                        Set set7 = v4jVar.v;
                        team4 = v4jVar.u;
                        y6a.M(obj2);
                        int id = team4.getId();
                        v4jVar.u = null;
                        v4jVar.v = null;
                        v4jVar.r = i6;
                        v4jVar.s = i3;
                        v4jVar.w = booleanValue;
                        v4jVar.z = 6;
                        break;
                    case 6:
                        Set set8 = v4jVar.v;
                        y6a.M(obj2);
                        ad2 ad2Var22 = qv5.a;
                        qv5.a(x42.a);
                        return Unit.a;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        v4jVar = new v4j(this, sq3Var);
        Object obj22 = v4jVar.x;
        Object obj32 = lu3.a;
        i2 = v4jVar.z;
        int i92 = 3;
        int i102 = 2;
        j0j j0jVar2 = this.b;
        rq3 rq3Var2 = null;
        switch (i2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (defpackage.jid.i(r5.e, r7, r0) == r1) goto L23;
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
        w4j w4jVar;
        Object obj;
        int i2;
        if (sq3Var instanceof w4j) {
            w4jVar = (w4j) sq3Var;
            int i3 = w4jVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                w4jVar.u = i3 - Integer.MIN_VALUE;
                obj = w4jVar.s;
                lu3 lu3Var = lu3.a;
                i2 = w4jVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    w4jVar.r = i;
                    w4jVar.u = 1;
                    obj = this.b.a(i, w4jVar);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        ad2 ad2Var = qv5.a;
                        qv5.a(x42.a);
                        g();
                        return Unit.a;
                    }
                    i = w4jVar.r;
                    y6a.M(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    Context applicationContext = getApplicationContext();
                    applicationContext.getClass();
                    w4jVar.r = i;
                    w4jVar.u = 2;
                }
                ad2 ad2Var2 = qv5.a;
                qv5.a(x42.a);
                g();
                return Unit.a;
            }
        }
        w4jVar = new w4j(this, sq3Var);
        obj = w4jVar.s;
        lu3 lu3Var2 = lu3.a;
        i2 = w4jVar.u;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        ad2 ad2Var22 = qv5.a;
        qv5.a(x42.a);
        g();
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
    
        if (r8.c.o(r2, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0056, code lost:
    
        if (r11 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(int i, int i2, sq3 sq3Var) {
        y4j y4jVar;
        int i3;
        EventResponse eventResponse;
        Event event;
        int i4;
        int i5;
        if (sq3Var instanceof y4j) {
            y4jVar = (y4j) sq3Var;
            int i6 = y4jVar.w;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                y4jVar.w = i6 - Integer.MIN_VALUE;
                Object obj = y4jVar.u;
                lu3 lu3Var = lu3.a;
                i3 = y4jVar.w;
                if (i3 != 0) {
                    y6a.M(obj);
                    y4jVar.r = i;
                    y4jVar.s = i2;
                    y4jVar.w = 1;
                    obj = this.d.d(i, y4jVar);
                } else if (i3 == 1) {
                    i2 = y4jVar.s;
                    i = y4jVar.r;
                    y6a.M(obj);
                } else {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = y4jVar.s;
                    i4 = y4jVar.r;
                    event = y4jVar.t;
                    y6a.M(obj);
                    if (((Boolean) obj).booleanValue()) {
                        return Unit.a;
                    }
                    y4jVar.t = null;
                    y4jVar.r = i4;
                    y4jVar.s = i5;
                    y4jVar.w = 3;
                }
                eventResponse = (EventResponse) yaa.x((x2g) obj);
                if (eventResponse != null || (event = eventResponse.getEvent()) == null) {
                    return Unit.a;
                }
                y4jVar.t = event;
                y4jVar.r = i;
                y4jVar.s = i2;
                y4jVar.w = 2;
                obj = this.b.y(i2, y4jVar);
                if (obj != lu3Var) {
                    int i7 = i2;
                    i4 = i;
                    i5 = i7;
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
                return lu3Var;
            }
        }
        y4jVar = new y4j(this, sq3Var);
        Object obj2 = y4jVar.u;
        lu3 lu3Var2 = lu3.a;
        i3 = y4jVar.w;
        if (i3 != 0) {
        }
        eventResponse = (EventResponse) yaa.x((x2g) obj2);
        if (eventResponse != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (defpackage.jid.i(r5.e, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r5.f.h(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(boolean z, sq3 sq3Var) {
        z4j z4jVar;
        int i;
        if (sq3Var instanceof z4j) {
            z4jVar = (z4j) sq3Var;
            int i2 = z4jVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z4jVar.u = i2 - Integer.MIN_VALUE;
                Object obj = z4jVar.s;
                lu3 lu3Var = lu3.a;
                i = z4jVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    if (z) {
                        z4jVar.r = z;
                        z4jVar.u = 1;
                    }
                    g();
                    return Unit.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    g();
                    return Unit.a;
                }
                z = z4jVar.r;
                y6a.M(obj);
                Context applicationContext = getApplicationContext();
                applicationContext.getClass();
                z4jVar.r = z;
                z4jVar.u = 2;
            }
        }
        z4jVar = new z4j(this, sq3Var);
        Object obj2 = z4jVar.s;
        lu3 lu3Var2 = lu3.a;
        i = z4jVar.u;
        if (i != 0) {
        }
    }

    public final void g() {
        ad2 ad2Var = qv5.a;
        qv5.a(a52.a);
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        aba.E(applicationContext);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0166, code lost:
    
        if (r6.d(r14, false, r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x012b, code lost:
    
        if (r6.a(r9, false, r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0109, code lost:
    
        if (r14 == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f6, code lost:
    
        if (defpackage.jid.i(r6, r14, r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0095, code lost:
    
        if (r14 == r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(int i, sq3 sq3Var) {
        a5j a5jVar;
        int i2;
        int i3;
        int i4;
        Object T;
        int i5;
        int i6;
        int i7;
        boolean booleanValue;
        boolean z;
        int i8;
        int i9;
        int i10;
        if (sq3Var instanceof a5j) {
            a5jVar = (a5j) sq3Var;
            int i11 = a5jVar.y;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                a5jVar.y = i11 - Integer.MIN_VALUE;
                Object obj = a5jVar.w;
                lu3 lu3Var = lu3.a;
                i2 = a5jVar.y;
                int i12 = 6;
                rq3 rq3Var = null;
                jid jidVar = this.e;
                qa6 qa6Var = this.c;
                switch (i2) {
                    case 0:
                        y6a.M(obj);
                        a5jVar.r = i;
                        a5jVar.y = 1;
                        obj = qa6Var.h(a5jVar);
                        break;
                    case 1:
                        i = a5jVar.r;
                        y6a.M(obj);
                        int size = ((HashSet) obj).size();
                        a5jVar.r = i;
                        a5jVar.s = size;
                        a5jVar.y = 2;
                        Serializable g = qa6Var.g(a5jVar);
                        if (g != lu3Var) {
                            i3 = i;
                            i4 = size;
                            obj = g;
                            int size2 = ((HashSet) obj).size();
                            a5jVar.r = i3;
                            a5jVar.s = i4;
                            a5jVar.t = size2;
                            a5jVar.y = 3;
                            fvi fviVar = this.b.a;
                            T = gz8.T(a5jVar, fviVar.a, new xr2(fviVar, i3, rq3Var, i12));
                            if (T != lu3Var) {
                                i5 = i3;
                                i6 = size2;
                                obj = T;
                                i7 = i4;
                                booleanValue = ((Boolean) obj).booleanValue();
                                if (booleanValue) {
                                    Context applicationContext = getApplicationContext();
                                    applicationContext.getClass();
                                    a5jVar.r = i5;
                                    a5jVar.s = i7;
                                    a5jVar.t = i6;
                                    a5jVar.v = booleanValue;
                                    a5jVar.y = 4;
                                    break;
                                }
                                return Unit.a;
                            }
                        }
                        return lu3Var;
                    case 2:
                        i4 = a5jVar.s;
                        i3 = a5jVar.r;
                        y6a.M(obj);
                        int size22 = ((HashSet) obj).size();
                        a5jVar.r = i3;
                        a5jVar.s = i4;
                        a5jVar.t = size22;
                        a5jVar.y = 3;
                        fvi fviVar2 = this.b.a;
                        T = gz8.T(a5jVar, fviVar2.a, new xr2(fviVar2, i3, rq3Var, i12));
                        if (T != lu3Var) {
                        }
                        return lu3Var;
                    case 3:
                        int i13 = a5jVar.t;
                        int i14 = a5jVar.s;
                        int i15 = a5jVar.r;
                        y6a.M(obj);
                        i5 = i15;
                        i7 = i14;
                        i6 = i13;
                        booleanValue = ((Boolean) obj).booleanValue();
                        if (booleanValue) {
                        }
                        return Unit.a;
                    case 4:
                        booleanValue = a5jVar.v;
                        i6 = a5jVar.t;
                        i7 = a5jVar.s;
                        i5 = a5jVar.r;
                        y6a.M(obj);
                        a5jVar.r = i5;
                        a5jVar.s = i7;
                        a5jVar.t = i6;
                        a5jVar.v = booleanValue;
                        a5jVar.y = 5;
                        obj = qa6Var.h(a5jVar);
                        break;
                    case 5:
                        booleanValue = a5jVar.v;
                        i6 = a5jVar.t;
                        i7 = a5jVar.s;
                        i5 = a5jVar.r;
                        y6a.M(obj);
                        int i16 = i6;
                        z = booleanValue;
                        int size3 = ((HashSet) obj).size();
                        if (i7 != size3) {
                            Context applicationContext2 = getApplicationContext();
                            applicationContext2.getClass();
                            a5jVar.r = i5;
                            a5jVar.s = i7;
                            a5jVar.t = i16;
                            a5jVar.v = z;
                            a5jVar.u = size3;
                            a5jVar.y = 6;
                            break;
                        }
                        i8 = i16;
                        i9 = size3;
                        a5jVar.r = i5;
                        a5jVar.s = i7;
                        a5jVar.t = i8;
                        a5jVar.v = z;
                        a5jVar.u = i9;
                        a5jVar.y = 7;
                        obj = qa6Var.g(a5jVar);
                        if (obj != lu3Var) {
                            i10 = i5;
                            if (i8 != ((HashSet) obj).size()) {
                                Context applicationContext3 = getApplicationContext();
                                applicationContext3.getClass();
                                a5jVar.r = i10;
                                a5jVar.s = i7;
                                a5jVar.t = i8;
                                a5jVar.v = z;
                                a5jVar.u = i9;
                                a5jVar.y = 8;
                                break;
                            }
                            g();
                            ad2 ad2Var = qv5.a;
                            qv5.a(x42.a);
                            return Unit.a;
                        }
                        return lu3Var;
                    case 6:
                        i9 = a5jVar.u;
                        z = a5jVar.v;
                        i8 = a5jVar.t;
                        i7 = a5jVar.s;
                        i5 = a5jVar.r;
                        y6a.M(obj);
                        a5jVar.r = i5;
                        a5jVar.s = i7;
                        a5jVar.t = i8;
                        a5jVar.v = z;
                        a5jVar.u = i9;
                        a5jVar.y = 7;
                        obj = qa6Var.g(a5jVar);
                        if (obj != lu3Var) {
                        }
                        return lu3Var;
                    case 7:
                        i9 = a5jVar.u;
                        z = a5jVar.v;
                        i8 = a5jVar.t;
                        i7 = a5jVar.s;
                        i10 = a5jVar.r;
                        y6a.M(obj);
                        if (i8 != ((HashSet) obj).size()) {
                        }
                        g();
                        ad2 ad2Var2 = qv5.a;
                        qv5.a(x42.a);
                        return Unit.a;
                    case 8:
                        y6a.M(obj);
                        g();
                        ad2 ad2Var22 = qv5.a;
                        qv5.a(x42.a);
                        return Unit.a;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        a5jVar = new a5j(this, sq3Var);
        Object obj2 = a5jVar.w;
        lu3 lu3Var2 = lu3.a;
        i2 = a5jVar.y;
        int i122 = 6;
        rq3 rq3Var2 = null;
        jid jidVar2 = this.e;
        qa6 qa6Var2 = this.c;
        switch (i2) {
        }
    }

    public final Object i(int i, boolean z, sq3 sq3Var) {
        Object r = s9a.r(new b5j(this, i, z, null), sq3Var);
        return r == lu3.a ? r : Unit.a;
    }
}
