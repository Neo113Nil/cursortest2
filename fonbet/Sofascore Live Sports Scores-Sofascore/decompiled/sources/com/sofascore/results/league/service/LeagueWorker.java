package com.sofascore.results.league.service;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.EventResponse;
import com.sofascore.model.newNetwork.UniqueTournamentResponse;
import com.sofascore.results.service.AbstractRetryCoroutineWorker;
import defpackage.a52;
import defpackage.a5b;
import defpackage.a70;
import defpackage.aba;
import defpackage.ad2;
import defpackage.b5b;
import defpackage.c5b;
import defpackage.d5b;
import defpackage.e5b;
import defpackage.f5b;
import defpackage.g5b;
import defpackage.gz8;
import defpackage.hrj;
import defpackage.irj;
import defpackage.jdb;
import defpackage.jid;
import defpackage.lu3;
import defpackage.md4;
import defpackage.pf4;
import defpackage.qa6;
import defpackage.qv5;
import defpackage.rq3;
import defpackage.s96;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.udl;
import defpackage.w3b;
import defpackage.wu;
import defpackage.x2g;
import defpackage.x42;
import defpackage.y6a;
import defpackage.yaa;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012BE\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/sofascore/results/league/service/LeagueWorker;", "Lcom/sofascore/results/service/AbstractRetryCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lw3b;", "leagueRepository", "Lqa6;", "eventStageRepository", "Ls96;", "eventRepository", "Ljid;", "notificationsSyncUseCase", "Ludl;", "cache", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lw3b;Lqa6;Ls96;Ljid;Ludl;)V", "yaa", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LeagueWorker extends AbstractRetryCoroutineWorker {
    public final w3b b;
    public final qa6 c;
    public final s96 d;
    public final jid e;
    public final udl f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeagueWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull w3b w3bVar, @NotNull qa6 qa6Var, @NotNull s96 s96Var, @NotNull jid jidVar, @NotNull udl udlVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        w3bVar.getClass();
        qa6Var.getClass();
        s96Var.getClass();
        jidVar.getClass();
        udlVar.getClass();
        this.b = w3bVar;
        this.c = qa6Var;
        this.d = s96Var;
        this.e = jidVar;
        this.f = udlVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ba, code lost:
    
        if (defpackage.s9a.r(new defpackage.zi7((java.util.Map) r10, r9, r7, 22), r0) == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0157, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        if (c(r10, r2, r0) == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        if (r10 == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00dc, code lost:
    
        if (r9 == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f9, code lost:
    
        if (d(r10, r0) == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0114, code lost:
    
        if (g(r10, r0) == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0155, code lost:
    
        if (r9 == r1) goto L70;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.sofascore.results.service.AbstractRetryCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        c5b c5bVar;
        Object r;
        if (rq3Var instanceof c5b) {
            c5bVar = (c5b) rq3Var;
            int i = c5bVar.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5bVar.u = i - Integer.MIN_VALUE;
                Object obj = c5bVar.s;
                Object obj2 = lu3.a;
                rq3 rq3Var2 = null;
                switch (c5bVar.u) {
                    case 0:
                        y6a.M(obj);
                        String e = getInputData().e("ACTION");
                        if (e != null) {
                            switch (e.hashCode()) {
                                case -1855176208:
                                    if (e.equals("ADD_LEAGUE_LIST")) {
                                        String e2 = getInputData().e("ANALYTICS_ACTION");
                                        e2.getClass();
                                        long[] d = getInputData().d("LEAGUE_IDS");
                                        wu valueOf = wu.valueOf(e2);
                                        c5bVar.r = null;
                                        c5bVar.u = 3;
                                        if (d != null) {
                                            r = s9a.r(new pf4(d, this, valueOf, rq3Var2, 2), c5bVar);
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
                                case -1710818742:
                                    if (e.equals("REMOVE_LEAGUE")) {
                                        int a = getInputData().a("LEAGUE_ID", 0);
                                        c5bVar.u = 2;
                                        break;
                                    }
                                    break;
                                case -819023983:
                                    if (e.equals("DISABLE_NOTIFICATIONS")) {
                                        int a2 = getInputData().a("LEAGUE_ID", 0);
                                        c5bVar.u = 7;
                                        break;
                                    }
                                    break;
                                case -743295220:
                                    if (e.equals("ENABLE_NOTIFICATIONS")) {
                                        int a3 = getInputData().a("LEAGUE_ID", 0);
                                        c5bVar.u = 6;
                                        Object c = c(a3, true, c5bVar);
                                        if (c != obj2) {
                                            c = Unit.a;
                                            break;
                                        }
                                    }
                                    break;
                                case 450517632:
                                    if (e.equals("REFRESH_LEAGUES")) {
                                        c5bVar.r = this;
                                        c5bVar.u = 4;
                                        obj = this.b.i(c5bVar);
                                        break;
                                    }
                                    break;
                                case 665740205:
                                    if (e.equals("ADD_LEAGUE")) {
                                        int a4 = getInputData().a("LEAGUE_ID", 0);
                                        md4 inputData = getInputData();
                                        Object obj3 = Boolean.FALSE;
                                        Object obj4 = inputData.a.get("NOTIFICATIONS_ENABLED");
                                        if (obj4 instanceof Boolean) {
                                            obj3 = obj4;
                                        }
                                        boolean booleanValue = ((Boolean) obj3).booleanValue();
                                        c5bVar.u = 1;
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
                        this = c5bVar.r;
                        y6a.M(obj);
                        c5bVar.r = null;
                        c5bVar.u = 5;
                        this.getClass();
                        break;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        c5bVar = new c5b(this, (sq3) rq3Var);
        Object obj5 = c5bVar.s;
        Object obj22 = lu3.a;
        rq3 rq3Var22 = null;
        switch (c5bVar.u) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x01e7, code lost:
    
        if (h(r2, false, r3) == r4) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01cd, code lost:
    
        if (defpackage.jid.c(r46.e, r2, r3) == r4) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01a6, code lost:
    
        if (r2 != r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bc, code lost:
    
        if (r5 == r4) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0124 -> B:29:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, boolean z, sq3 sq3Var) {
        a5b a5bVar;
        int i2;
        boolean z2;
        Object q0;
        UniqueTournament uniqueTournament;
        Set e;
        UniqueTournament uniqueTournament2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z4;
        Set set;
        UniqueTournament uniqueTournament3;
        int i7;
        UniqueTournament uniqueTournament4;
        int i8;
        boolean z5;
        int i9;
        boolean booleanValue;
        int i10 = i;
        if (sq3Var instanceof a5b) {
            a5bVar = (a5b) sq3Var;
            int i11 = a5bVar.A;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                a5bVar.A = i11 - Integer.MIN_VALUE;
                Object obj = a5bVar.y;
                Object obj2 = lu3.a;
                i2 = a5bVar.A;
                udl udlVar = this.f;
                w3b w3bVar = this.b;
                switch (i2) {
                    case 0:
                        y6a.M(obj);
                        a5bVar.r = i10;
                        z2 = z;
                        a5bVar.u = z2;
                        a5bVar.A = 1;
                        q0 = w3bVar.q0(i10, a5bVar);
                        break;
                    case 1:
                        boolean z6 = a5bVar.u;
                        int i12 = a5bVar.r;
                        y6a.M(obj);
                        z2 = z6;
                        i10 = i12;
                        q0 = obj;
                        UniqueTournamentResponse uniqueTournamentResponse = (UniqueTournamentResponse) q0;
                        if (uniqueTournamentResponse != null && (uniqueTournament = uniqueTournamentResponse.getUniqueTournament()) != null) {
                            e = udlVar.e();
                            uniqueTournament2 = uniqueTournament;
                            z3 = z2;
                            i3 = i10;
                            i4 = 0;
                            if (e.size() >= 200) {
                                int intValue = ((Number) e.iterator().next()).intValue();
                                a5bVar.w = uniqueTournament2;
                                a5bVar.x = e;
                                a5bVar.r = i3;
                                a5bVar.u = z3;
                                a5bVar.s = i4;
                                a5bVar.t = intValue;
                                a5bVar.A = 2;
                                if (udlVar.k(intValue, a5bVar) != obj2) {
                                    boolean z7 = z3;
                                    i6 = i4;
                                    i5 = intValue;
                                    uniqueTournament3 = uniqueTournament2;
                                    set = e;
                                    z4 = z7;
                                    a5bVar.w = uniqueTournament3;
                                    a5bVar.x = set;
                                    a5bVar.r = i3;
                                    a5bVar.u = z4;
                                    a5bVar.s = i6;
                                    a5bVar.t = i5;
                                    a5bVar.A = 3;
                                    if (w3bVar.e0(i5, a5bVar) != obj2) {
                                        i4 = i6;
                                        z3 = z4;
                                        e = set;
                                        uniqueTournament2 = uniqueTournament3;
                                        if (e.size() >= 200) {
                                            int id = uniqueTournament2.getId();
                                            a5bVar.w = uniqueTournament2;
                                            a5bVar.x = null;
                                            a5bVar.r = i3;
                                            a5bVar.u = z3;
                                            a5bVar.s = i4;
                                            a5bVar.A = 4;
                                            if (udlVar.b(id, a5bVar) != obj2) {
                                                i7 = i3;
                                                uniqueTournament4 = uniqueTournament2;
                                                UniqueTournament copy$default = UniqueTournament.copy$default(uniqueTournament4, 0, null, null, null, uniqueTournament4.getUserCount() + 1, false, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147483631, null);
                                                a5bVar.w = uniqueTournament4;
                                                a5bVar.x = null;
                                                a5bVar.r = i7;
                                                a5bVar.u = z3;
                                                a5bVar.s = i4;
                                                a5bVar.A = 5;
                                                irj irjVar = w3bVar.a;
                                                obj = gz8.T(a5bVar, irjVar.a, new hrj(irjVar, copy$default, z3, null));
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            return obj2;
                        }
                        return Unit.a;
                    case 2:
                        i5 = a5bVar.t;
                        i6 = a5bVar.s;
                        z4 = a5bVar.u;
                        int i13 = a5bVar.r;
                        Set set2 = a5bVar.x;
                        UniqueTournament uniqueTournament5 = a5bVar.w;
                        y6a.M(obj);
                        i3 = i13;
                        set = set2;
                        uniqueTournament3 = uniqueTournament5;
                        a5bVar.w = uniqueTournament3;
                        a5bVar.x = set;
                        a5bVar.r = i3;
                        a5bVar.u = z4;
                        a5bVar.s = i6;
                        a5bVar.t = i5;
                        a5bVar.A = 3;
                        if (w3bVar.e0(i5, a5bVar) != obj2) {
                        }
                        return obj2;
                    case 3:
                        i4 = a5bVar.s;
                        z3 = a5bVar.u;
                        int i14 = a5bVar.r;
                        set = a5bVar.x;
                        uniqueTournament3 = a5bVar.w;
                        y6a.M(obj);
                        i3 = i14;
                        e = set;
                        uniqueTournament2 = uniqueTournament3;
                        if (e.size() >= 200) {
                        }
                        return obj2;
                    case 4:
                        i4 = a5bVar.s;
                        z3 = a5bVar.u;
                        i7 = a5bVar.r;
                        Set set3 = a5bVar.x;
                        uniqueTournament4 = a5bVar.w;
                        y6a.M(obj);
                        UniqueTournament copy$default2 = UniqueTournament.copy$default(uniqueTournament4, 0, null, null, null, uniqueTournament4.getUserCount() + 1, false, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147483631, null);
                        a5bVar.w = uniqueTournament4;
                        a5bVar.x = null;
                        a5bVar.r = i7;
                        a5bVar.u = z3;
                        a5bVar.s = i4;
                        a5bVar.A = 5;
                        irj irjVar2 = w3bVar.a;
                        obj = gz8.T(a5bVar, irjVar2.a, new hrj(irjVar2, copy$default2, z3, null));
                        break;
                    case 5:
                        i4 = a5bVar.s;
                        z3 = a5bVar.u;
                        i7 = a5bVar.r;
                        Set set4 = a5bVar.x;
                        UniqueTournament uniqueTournament6 = a5bVar.w;
                        y6a.M(obj);
                        uniqueTournament4 = uniqueTournament6;
                        i8 = i7;
                        z5 = z3;
                        i9 = i4;
                        booleanValue = ((Boolean) obj).booleanValue();
                        if (booleanValue) {
                            Context applicationContext = getApplicationContext();
                            applicationContext.getClass();
                            a5bVar.w = uniqueTournament4;
                            a5bVar.x = null;
                            a5bVar.r = i8;
                            a5bVar.u = z5;
                            a5bVar.s = i9;
                            a5bVar.v = booleanValue;
                            a5bVar.A = 6;
                            break;
                        }
                        ad2 ad2Var = qv5.a;
                        qv5.a(x42.a);
                        return Unit.a;
                    case 6:
                        booleanValue = a5bVar.v;
                        i9 = a5bVar.s;
                        z5 = a5bVar.u;
                        i8 = a5bVar.r;
                        Set set5 = a5bVar.x;
                        uniqueTournament4 = a5bVar.w;
                        y6a.M(obj);
                        int id2 = uniqueTournament4.getId();
                        a5bVar.w = null;
                        a5bVar.x = null;
                        a5bVar.r = i8;
                        a5bVar.u = z5;
                        a5bVar.s = i9;
                        a5bVar.v = booleanValue;
                        a5bVar.A = 7;
                        break;
                    case 7:
                        Set set6 = a5bVar.x;
                        y6a.M(obj);
                        ad2 ad2Var2 = qv5.a;
                        qv5.a(x42.a);
                        return Unit.a;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        a5bVar = new a5b(this, sq3Var);
        Object obj3 = a5bVar.y;
        Object obj22 = lu3.a;
        i2 = a5bVar.A;
        udl udlVar2 = this.f;
        w3b w3bVar2 = this.b;
        switch (i2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (defpackage.jid.c(r5.e, r7, r0) == r1) goto L23;
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
        b5b b5bVar;
        Object obj;
        int i2;
        if (sq3Var instanceof b5b) {
            b5bVar = (b5b) sq3Var;
            int i3 = b5bVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b5bVar.u = i3 - Integer.MIN_VALUE;
                obj = b5bVar.s;
                lu3 lu3Var = lu3.a;
                i2 = b5bVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    b5bVar.r = i;
                    b5bVar.u = 1;
                    obj = this.b.a(i, b5bVar);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        ad2 ad2Var = qv5.a;
                        qv5.a(x42.a);
                        qv5.a(a52.a);
                        return Unit.a;
                    }
                    i = b5bVar.r;
                    y6a.M(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    Context applicationContext = getApplicationContext();
                    applicationContext.getClass();
                    b5bVar.r = i;
                    b5bVar.u = 2;
                }
                ad2 ad2Var2 = qv5.a;
                qv5.a(x42.a);
                qv5.a(a52.a);
                return Unit.a;
            }
        }
        b5bVar = new b5b(this, sq3Var);
        obj = b5bVar.s;
        lu3 lu3Var2 = lu3.a;
        i2 = b5bVar.u;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        ad2 ad2Var22 = qv5.a;
        qv5.a(x42.a);
        qv5.a(a52.a);
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(int i, sq3 sq3Var) {
        d5b d5bVar;
        int i2;
        EventResponse eventResponse;
        if (sq3Var instanceof d5b) {
            d5bVar = (d5b) sq3Var;
            int i3 = d5bVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                d5bVar.t = i3 - Integer.MIN_VALUE;
                Object obj = d5bVar.r;
                lu3 lu3Var = lu3.a;
                i2 = d5bVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    d5bVar.t = 1;
                    obj = this.d.d(i, d5bVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                eventResponse = (EventResponse) yaa.x((x2g) obj);
                if (eventResponse == null) {
                    return eventResponse.getEvent();
                }
                return null;
            }
        }
        d5bVar = new d5b(this, sq3Var);
        Object obj2 = d5bVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = d5bVar.t;
        if (i2 != 0) {
        }
        eventResponse = (EventResponse) yaa.x((x2g) obj2);
        if (eventResponse == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (defpackage.jid.c(r5.e, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r5.f.g(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(boolean z, sq3 sq3Var) {
        e5b e5bVar;
        int i;
        if (sq3Var instanceof e5b) {
            e5bVar = (e5b) sq3Var;
            int i2 = e5bVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e5bVar.u = i2 - Integer.MIN_VALUE;
                Object obj = e5bVar.s;
                lu3 lu3Var = lu3.a;
                i = e5bVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    if (z) {
                        e5bVar.r = z;
                        e5bVar.u = 1;
                    }
                    ad2 ad2Var = qv5.a;
                    qv5.a(a52.a);
                    Context applicationContext = getApplicationContext();
                    applicationContext.getClass();
                    aba.E(applicationContext);
                    return Unit.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    ad2 ad2Var2 = qv5.a;
                    qv5.a(a52.a);
                    Context applicationContext2 = getApplicationContext();
                    applicationContext2.getClass();
                    aba.E(applicationContext2);
                    return Unit.a;
                }
                z = e5bVar.r;
                y6a.M(obj);
                Context applicationContext3 = getApplicationContext();
                applicationContext3.getClass();
                e5bVar.r = z;
                e5bVar.u = 2;
            }
        }
        e5bVar = new e5b(this, sq3Var);
        Object obj2 = e5bVar.s;
        lu3 lu3Var2 = lu3.a;
        i = e5bVar.u;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0172, code lost:
    
        if (r4.d(r12, false, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0136, code lost:
    
        if (r4.a(r12, false, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0113, code lost:
    
        if (r12 == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0100, code lost:
    
        if (defpackage.jid.c(r4, r12, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
    
        if (r12 == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ac, code lost:
    
        if (r12 == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009f, code lost:
    
        if (r10.f.k(r11, r0) == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(int i, sq3 sq3Var) {
        f5b f5bVar;
        int i2;
        int i3;
        int size;
        int i4;
        int i5;
        int i6;
        boolean booleanValue;
        int i7;
        int i8;
        int i9;
        boolean z;
        int size2;
        int i10;
        int i11;
        int i12;
        if (sq3Var instanceof f5b) {
            f5bVar = (f5b) sq3Var;
            int i13 = f5bVar.y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                f5bVar.y = i13 - Integer.MIN_VALUE;
                Object obj = f5bVar.w;
                lu3 lu3Var = lu3.a;
                i2 = f5bVar.y;
                jid jidVar = this.e;
                qa6 qa6Var = this.c;
                switch (i2) {
                    case 0:
                        y6a.M(obj);
                        f5bVar.r = i;
                        f5bVar.y = 1;
                        break;
                    case 1:
                        i = f5bVar.r;
                        y6a.M(obj);
                        f5bVar.r = i;
                        f5bVar.y = 2;
                        obj = qa6Var.h(f5bVar);
                        break;
                    case 2:
                        i = f5bVar.r;
                        y6a.M(obj);
                        i3 = i;
                        size = ((HashSet) obj).size();
                        f5bVar.r = i3;
                        f5bVar.s = size;
                        f5bVar.y = 3;
                        obj = qa6Var.g(f5bVar);
                        break;
                    case 3:
                        size = f5bVar.s;
                        i3 = f5bVar.r;
                        y6a.M(obj);
                        int size3 = ((HashSet) obj).size();
                        f5bVar.r = i3;
                        f5bVar.s = size;
                        f5bVar.t = size3;
                        f5bVar.y = 4;
                        Object e0 = this.b.e0(i3, f5bVar);
                        if (e0 != lu3Var) {
                            i4 = i3;
                            i5 = size3;
                            obj = e0;
                            i6 = size;
                            booleanValue = ((Boolean) obj).booleanValue();
                            if (booleanValue) {
                                Context applicationContext = getApplicationContext();
                                applicationContext.getClass();
                                f5bVar.r = i4;
                                f5bVar.s = i6;
                                f5bVar.t = i5;
                                f5bVar.v = booleanValue;
                                f5bVar.y = 5;
                                break;
                            }
                            return Unit.a;
                        }
                        return lu3Var;
                    case 4:
                        int i14 = f5bVar.t;
                        int i15 = f5bVar.s;
                        int i16 = f5bVar.r;
                        y6a.M(obj);
                        i4 = i16;
                        i6 = i15;
                        i5 = i14;
                        booleanValue = ((Boolean) obj).booleanValue();
                        if (booleanValue) {
                        }
                        return Unit.a;
                    case 5:
                        booleanValue = f5bVar.v;
                        i5 = f5bVar.t;
                        i6 = f5bVar.s;
                        i4 = f5bVar.r;
                        y6a.M(obj);
                        f5bVar.r = i4;
                        f5bVar.s = i6;
                        f5bVar.t = i5;
                        f5bVar.v = booleanValue;
                        f5bVar.y = 6;
                        obj = qa6Var.h(f5bVar);
                        break;
                    case 6:
                        booleanValue = f5bVar.v;
                        i5 = f5bVar.t;
                        i6 = f5bVar.s;
                        i4 = f5bVar.r;
                        y6a.M(obj);
                        i7 = i4;
                        i8 = i6;
                        i9 = i5;
                        z = booleanValue;
                        size2 = ((HashSet) obj).size();
                        if (i8 != size2) {
                            Context applicationContext2 = getApplicationContext();
                            applicationContext2.getClass();
                            f5bVar.r = i7;
                            f5bVar.s = i8;
                            f5bVar.t = i9;
                            f5bVar.v = z;
                            f5bVar.u = size2;
                            f5bVar.y = 7;
                            break;
                        }
                        f5bVar.r = i7;
                        f5bVar.s = i8;
                        f5bVar.t = i9;
                        f5bVar.v = z;
                        f5bVar.u = size2;
                        f5bVar.y = 8;
                        obj = qa6Var.g(f5bVar);
                        if (obj != lu3Var) {
                            i10 = i9;
                            i11 = i8;
                            i12 = i7;
                            if (i10 != ((HashSet) obj).size()) {
                                Context applicationContext3 = getApplicationContext();
                                applicationContext3.getClass();
                                f5bVar.r = i12;
                                f5bVar.s = i11;
                                f5bVar.t = i10;
                                f5bVar.v = z;
                                f5bVar.u = size2;
                                f5bVar.y = 9;
                                break;
                            }
                            ad2 ad2Var = qv5.a;
                            qv5.a(a52.a);
                            Context applicationContext4 = getApplicationContext();
                            applicationContext4.getClass();
                            aba.E(applicationContext4);
                            qv5.a(x42.a);
                            return Unit.a;
                        }
                        return lu3Var;
                    case 7:
                        size2 = f5bVar.u;
                        z = f5bVar.v;
                        i9 = f5bVar.t;
                        i8 = f5bVar.s;
                        i7 = f5bVar.r;
                        y6a.M(obj);
                        f5bVar.r = i7;
                        f5bVar.s = i8;
                        f5bVar.t = i9;
                        f5bVar.v = z;
                        f5bVar.u = size2;
                        f5bVar.y = 8;
                        obj = qa6Var.g(f5bVar);
                        if (obj != lu3Var) {
                        }
                        return lu3Var;
                    case 8:
                        size2 = f5bVar.u;
                        z = f5bVar.v;
                        i10 = f5bVar.t;
                        i11 = f5bVar.s;
                        i12 = f5bVar.r;
                        y6a.M(obj);
                        if (i10 != ((HashSet) obj).size()) {
                        }
                        ad2 ad2Var2 = qv5.a;
                        qv5.a(a52.a);
                        Context applicationContext42 = getApplicationContext();
                        applicationContext42.getClass();
                        aba.E(applicationContext42);
                        qv5.a(x42.a);
                        return Unit.a;
                    case 9:
                        y6a.M(obj);
                        ad2 ad2Var22 = qv5.a;
                        qv5.a(a52.a);
                        Context applicationContext422 = getApplicationContext();
                        applicationContext422.getClass();
                        aba.E(applicationContext422);
                        qv5.a(x42.a);
                        return Unit.a;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        f5bVar = new f5b(this, sq3Var);
        Object obj2 = f5bVar.w;
        lu3 lu3Var2 = lu3.a;
        i2 = f5bVar.y;
        jid jidVar2 = this.e;
        qa6 qa6Var2 = this.c;
        switch (i2) {
        }
    }

    public final Object h(int i, boolean z, sq3 sq3Var) {
        Object r = s9a.r(new g5b(this, i, z, (rq3) null), sq3Var);
        return r == lu3.a ? r : Unit.a;
    }
}
