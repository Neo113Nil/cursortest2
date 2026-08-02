package com.sofascore.results.service;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.WorkerParameters;
import com.sofascore.model.mvvm.model.PinnedTournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.DefaultPinnedLeaguesResponse;
import com.sofascore.model.newNetwork.UniqueTournamentResponse;
import defpackage.a5f;
import defpackage.a70;
import defpackage.ad2;
import defpackage.ahe;
import defpackage.asf;
import defpackage.bhe;
import defpackage.dhk;
import defpackage.dv3;
import defpackage.fzh;
import defpackage.gdb;
import defpackage.gz8;
import defpackage.ia0;
import defpackage.irj;
import defpackage.jdb;
import defpackage.jr5;
import defpackage.k13;
import defpackage.lu3;
import defpackage.ok3;
import defpackage.pgk;
import defpackage.qv5;
import defpackage.rha;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.t2g;
import defpackage.trj;
import defpackage.uic;
import defpackage.v2g;
import defpackage.v42;
import defpackage.vge;
import defpackage.vrj;
import defpackage.w3b;
import defpackage.wge;
import defpackage.wt3;
import defpackage.x2g;
import defpackage.xge;
import defpackage.y6a;
import defpackage.yaa;
import defpackage.yge;
import defpackage.zge;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B=\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/sofascore/results/service/PinnedLeagueWorker;", "Lcom/sofascore/results/service/AbstractRetryCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lw3b;", "leagueRepository", "Lvrj;", "tournamentRepository", "Ldhk;", "userRepository", "Landroid/content/SharedPreferences;", "preferences", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lw3b;Lvrj;Ldhk;Landroid/content/SharedPreferences;)V", "rha", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PinnedLeagueWorker extends AbstractRetryCoroutineWorker {
    public final w3b b;
    public final vrj c;
    public final dhk d;
    public final SharedPreferences e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinnedLeagueWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull w3b w3bVar, @NotNull vrj vrjVar, @NotNull dhk dhkVar, @NotNull SharedPreferences sharedPreferences) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        w3bVar.getClass();
        vrjVar.getClass();
        dhkVar.getClass();
        sharedPreferences.getClass();
        this.b = w3bVar;
        this.c = vrjVar;
        this.d = dhkVar;
        this.e = sharedPreferences;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (e(r0) == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ff, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if (h(r6, r0) == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        if (f(r6, r0) == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
    
        if (c(r6, r2, r0) == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d1, code lost:
    
        if (g(r0) == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fd, code lost:
    
        if (r5 == r1) goto L59;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.sofascore.results.service.AbstractRetryCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        wge wgeVar;
        Object r;
        if (rq3Var instanceof wge) {
            wgeVar = (wge) rq3Var;
            int i = wgeVar.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                wgeVar.t = i - Integer.MIN_VALUE;
                Object obj = wgeVar.r;
                Object obj2 = lu3.a;
                rq3 rq3Var2 = null;
                switch (wgeVar.t) {
                    case 0:
                        y6a.M(obj);
                        String e = getInputData().e("ACTION");
                        if (e != null) {
                            switch (e.hashCode()) {
                                case -2051812539:
                                    if (e.equals("ADD_PINNED_LEAGUE_LIST")) {
                                        int[] b = getInputData().b("LEAGUE_IDS");
                                        wgeVar.t = 1;
                                        if (b != null) {
                                            r = s9a.r(new jr5(b, this, rq3Var2, 9), wgeVar);
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
                                case 74947761:
                                    if (e.equals("UPDATE_DEFAULT_PINNED_LEAGUES")) {
                                        wgeVar.t = 4;
                                        break;
                                    }
                                    break;
                                case 611915566:
                                    if (e.equals("ADD_PINNED_LEAGUE_AT_POSITION")) {
                                        int a = getInputData().a("LEAGUE_ID", 0);
                                        int a2 = getInputData().a("ORDER_INDEX", -1);
                                        wgeVar.t = 2;
                                        break;
                                    }
                                    break;
                                case 1077306978:
                                    if (e.equals("REMOVE_PINNED_LEAGUE_LIST")) {
                                        int[] b2 = getInputData().b("LEAGUE_IDS");
                                        wgeVar.t = 3;
                                        break;
                                    }
                                    break;
                                case 1883870402:
                                    if (e.equals("UPDATE_PINNED_LEAGUES_ORDER")) {
                                        int[] b3 = getInputData().b("LEAGUE_IDS");
                                        wgeVar.t = 5;
                                        break;
                                    }
                                    break;
                                case 2035899753:
                                    if (e.equals("BACKUP_PINNED_LEAGUES_ORDER")) {
                                        wgeVar.t = 6;
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        y6a.M(obj);
                        break;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
                return jdb.a();
            }
        }
        wgeVar = new wge(this, (sq3) rq3Var);
        Object obj3 = wgeVar.r;
        Object obj22 = lu3.a;
        rq3 rq3Var22 = null;
        switch (wgeVar.t) {
        }
        return jdb.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00af, code lost:
    
        if (e(r0) != r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        if (r13 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        r9 = r12;
        r12 = r11;
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
    
        if (r3.R(r13, null, -1, r0) == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005d, code lost:
    
        if (r13 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, int i2, sq3 sq3Var) {
        vge vgeVar;
        int i3;
        UniqueTournamentResponse uniqueTournamentResponse;
        UniqueTournament uniqueTournament;
        if (sq3Var instanceof vge) {
            vgeVar = (vge) sq3Var;
            int i4 = vgeVar.v;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                vgeVar.v = i4 - Integer.MIN_VALUE;
                Object obj = vgeVar.t;
                Object obj2 = lu3.a;
                i3 = vgeVar.v;
                w3b w3bVar = this.b;
                rq3 rq3Var = null;
                if (i3 != 0) {
                    y6a.M(obj);
                    if (i == 0) {
                        return Unit.a;
                    }
                    vgeVar.r = i;
                    vgeVar.s = i2;
                    vgeVar.v = 1;
                    obj = w3bVar.q0(i, vgeVar);
                } else if (i3 == 1) {
                    i2 = vgeVar.s;
                    i = vgeVar.r;
                    y6a.M(obj);
                } else {
                    if (i3 != 2 && i3 != 3) {
                        if (i3 == 4) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = vgeVar.s;
                    int i6 = vgeVar.r;
                    y6a.M(obj);
                    vgeVar.r = i6;
                    vgeVar.s = i5;
                    vgeVar.v = 4;
                }
                uniqueTournamentResponse = (UniqueTournamentResponse) obj;
                if (uniqueTournamentResponse != null || (uniqueTournament = uniqueTournamentResponse.getUniqueTournament()) == null) {
                    return Unit.a;
                }
                if (i2 >= 0) {
                    vgeVar.r = i;
                    vgeVar.s = i2;
                    vgeVar.v = 2;
                    irj irjVar = w3bVar.a;
                    Object T = gz8.T(vgeVar, irjVar.a, new fzh(irjVar, new PinnedTournament(uniqueTournament, i2), rq3Var, 6));
                    if (T != obj2) {
                        T = Unit.a;
                    }
                    if (T != obj2) {
                        T = Unit.a;
                    }
                } else {
                    vgeVar.r = i;
                    vgeVar.s = i2;
                    vgeVar.v = 3;
                }
                vgeVar.r = i6;
                vgeVar.s = i5;
                vgeVar.v = 4;
            }
        }
        vgeVar = new vge(this, sq3Var);
        Object obj3 = vgeVar.t;
        Object obj22 = lu3.a;
        i3 = vgeVar.v;
        w3b w3bVar2 = this.b;
        rq3 rq3Var2 = null;
        if (i3 != 0) {
        }
        uniqueTournamentResponse = (UniqueTournamentResponse) obj3;
        if (uniqueTournamentResponse != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        if (((java.util.Set) r5).isEmpty() == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(sq3 sq3Var) {
        xge xgeVar;
        int i;
        if (sq3Var instanceof xge) {
            xgeVar = (xge) sq3Var;
            int i2 = xgeVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xgeVar.t = i2 - Integer.MIN_VALUE;
                Object obj = xgeVar.r;
                lu3 lu3Var = lu3.a;
                i = xgeVar.t;
                boolean z = true;
                if (i != 0) {
                    y6a.M(obj);
                    if (!this.e.contains("OLD_PINNED_LIST_V2")) {
                        xgeVar.t = 1;
                        obj = this.b.b(xgeVar);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    }
                    z = false;
                    return Boolean.valueOf(z);
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
            }
        }
        xgeVar = new xge(this, sq3Var);
        Object obj2 = xgeVar.r;
        lu3 lu3Var2 = lu3.a;
        i = xgeVar.t;
        boolean z2 = true;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
    
        if (r8 != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0088, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(sq3 sq3Var) {
        yge ygeVar;
        int i;
        dhk dhkVar;
        SharedPreferences d;
        if (sq3Var instanceof yge) {
            ygeVar = (yge) sq3Var;
            int i2 = ygeVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ygeVar.u = i2 - Integer.MIN_VALUE;
                Object obj = ygeVar.s;
                lu3 lu3Var = lu3.a;
                i = ygeVar.u;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    wt3.v(this.e, "PINNED_RESET_DONE_V2", true);
                    ia0 ia0Var = ia0.q;
                    if (ok3.p().e().getIsLoggedIn()) {
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
                        if (sharedPreferences.getBoolean("INIT_DONE", false)) {
                            dhkVar = this.d;
                            w3b w3bVar = this.b;
                            ygeVar.r = dhkVar;
                            ygeVar.u = 1;
                            obj = w3bVar.b(ygeVar);
                        }
                    }
                    return jdb.a();
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    x2g x2gVar = (x2g) obj;
                    if (x2gVar instanceof v2g) {
                        if (this.e.getBoolean("PINNED_LEAGUES_SYNCED_BLOCKED", false)) {
                            wt3.v(this.e, "PINNED_LEAGUES_SYNCED_BLOCKED", false);
                        }
                        jdb.a();
                    } else if (!(x2gVar instanceof t2g)) {
                        zzl.b();
                        return null;
                    }
                    return jdb.a();
                }
                dhkVar = ygeVar.r;
                y6a.M(obj);
                ygeVar.r = null;
                ygeVar.u = 2;
                dhkVar.getClass();
                obj = yaa.P(new pgk(dhkVar, (Set) obj, rq3Var, 4), ygeVar);
            }
        }
        ygeVar = new yge(this, sq3Var);
        Object obj2 = ygeVar.s;
        lu3 lu3Var2 = lu3.a;
        i = ygeVar.u;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        ygeVar.r = null;
        ygeVar.u = 2;
        dhkVar.getClass();
        obj2 = yaa.P(new pgk(dhkVar, (Set) obj2, rq3Var2, 4), ygeVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r9.b.f0(r7, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (e(r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0060 -> B:17:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int[] iArr, sq3 sq3Var) {
        zge zgeVar;
        int i;
        int i2;
        int[] iArr2;
        int length;
        int i3;
        if (sq3Var instanceof zge) {
            zgeVar = (zge) sq3Var;
            int i4 = zgeVar.x;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                zgeVar.x = i4 - Integer.MIN_VALUE;
                Object obj = zgeVar.v;
                Object obj2 = lu3.a;
                i = zgeVar.x;
                if (i != 0) {
                    y6a.M(obj);
                    if (iArr == null) {
                        return Unit.a;
                    }
                    i2 = 0;
                    iArr2 = iArr;
                    length = iArr.length;
                    i3 = 0;
                    if (i2 >= length) {
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                length = zgeVar.u;
                i2 = zgeVar.t;
                i3 = zgeVar.s;
                int[] iArr3 = zgeVar.r;
                y6a.M(obj);
                iArr2 = iArr3;
                i2++;
                if (i2 >= length) {
                    int i5 = iArr2[i2];
                    zgeVar.r = iArr2;
                    zgeVar.s = i3;
                    zgeVar.t = i2;
                    zgeVar.u = length;
                    zgeVar.x = 1;
                } else {
                    zgeVar.r = null;
                    zgeVar.x = 2;
                }
                return obj2;
            }
        }
        zgeVar = new zge(this, sq3Var);
        Object obj3 = zgeVar.v;
        Object obj22 = lu3.a;
        i = zgeVar.x;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x009b, code lost:
    
        if (r1 == r3) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e0 A[LOOP:1: B:33:0x01da->B:35:0x01e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x006d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x019d -> B:19:0x019e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(sq3 sq3Var) {
        ahe aheVar;
        int i;
        DefaultPinnedLeaguesResponse defaultPinnedLeaguesResponse;
        List<UniqueTournament> uniqueTournaments;
        asf asfVar;
        List<UniqueTournament> list;
        asf asfVar2;
        List<UniqueTournament> list2;
        ArrayList arrayList;
        List<UniqueTournament> list3;
        List list4;
        Iterator it;
        int i2;
        asf asfVar3;
        SharedPreferences d;
        Iterator<T> it2;
        if (sq3Var instanceof ahe) {
            aheVar = (ahe) sq3Var;
            int i3 = aheVar.y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aheVar.y = i3 - Integer.MIN_VALUE;
                Object obj = aheVar.w;
                Object obj2 = lu3.a;
                i = aheVar.y;
                int i4 = 0;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    Context applicationContext = getApplicationContext();
                    applicationContext.getClass();
                    String r = rha.r(applicationContext);
                    if (r == null) {
                        r = dv3.c();
                        Context applicationContext2 = getApplicationContext();
                        applicationContext2.getClass();
                        rha.B(applicationContext2, r);
                    }
                    vrj vrjVar = this.c;
                    aheVar.y = 1;
                    vrjVar.getClass();
                    obj = yaa.P(new trj(vrjVar, r, rq3Var, i4), aheVar);
                } else if (i == 1) {
                    y6a.M(obj);
                } else {
                    if (i == 2) {
                        asfVar = aheVar.s;
                        list = aheVar.r;
                        y6a.M(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            Context applicationContext3 = getApplicationContext();
                            applicationContext3.getClass();
                            SharedPreferences sharedPreferences = uic.j;
                            if (sharedPreferences == null) {
                                Context applicationContext4 = applicationContext3.getApplicationContext();
                                synchronized (uic.i) {
                                    d = a5f.d(applicationContext4);
                                    uic.j = d;
                                }
                                d.getClass();
                                sharedPreferences = d;
                            }
                            if (!sharedPreferences.getBoolean("PREF_SHOW_LEAGUES_INTRO_BOTTOM_SHEET", true) || this.e.getBoolean("PINNED_RESET_DONE_V2", false)) {
                                Set<String> stringSet = this.e.getStringSet("OLD_PINNED_LIST_V2", null);
                                if (stringSet != null) {
                                    Set<String> set = stringSet;
                                    arrayList = new ArrayList(k13.r(set, 10));
                                    for (String str : set) {
                                        str.getClass();
                                        arrayList.add(Integer.valueOf(Integer.parseInt(str)));
                                    }
                                } else {
                                    arrayList = new ArrayList(k13.r(list, 10));
                                    Iterator<T> it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        arrayList.add(Integer.valueOf(((UniqueTournament) it3.next()).getId()));
                                    }
                                }
                                Iterator it4 = list.iterator();
                                list3 = list;
                                list4 = arrayList;
                                it = it4;
                                i2 = 0;
                                asfVar3 = asfVar;
                                while (it.hasNext()) {
                                }
                                ArrayList arrayList2 = new ArrayList(k13.r(list3, 10));
                                it2 = list3.iterator();
                                while (it2.hasNext()) {
                                }
                                Set<String> W0 = CollectionsKt.W0(arrayList2);
                                SharedPreferences.Editor edit = this.e.edit();
                                edit.getClass();
                                edit.putStringSet("OLD_PINNED_LIST_V2", W0);
                                edit.apply();
                                if (asfVar3.a) {
                                }
                            }
                        }
                        w3b w3bVar = this.b;
                        aheVar.r = list;
                        aheVar.s = asfVar;
                        aheVar.t = asfVar;
                        aheVar.y = 3;
                        obj = w3bVar.S(list, aheVar);
                        if (obj != obj2) {
                            asfVar2 = asfVar;
                            list2 = list;
                            asfVar.a = ((Boolean) obj).booleanValue();
                            wt3.v(this.e, "PINNED_RESET_DONE", true);
                            wt3.v(this.e, "PINNED_RESET_DONE_V2", true);
                            asfVar3 = asfVar2;
                            list3 = list2;
                            ArrayList arrayList22 = new ArrayList(k13.r(list3, 10));
                            it2 = list3.iterator();
                            while (it2.hasNext()) {
                            }
                            Set<String> W02 = CollectionsKt.W0(arrayList22);
                            SharedPreferences.Editor edit2 = this.e.edit();
                            edit2.getClass();
                            edit2.putStringSet("OLD_PINNED_LIST_V2", W02);
                            edit2.apply();
                            if (asfVar3.a) {
                            }
                        }
                    }
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                y6a.M(obj);
                                return obj;
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i5 = aheVar.v;
                        it = aheVar.u;
                        list4 = (List) aheVar.t;
                        asfVar3 = aheVar.s;
                        list3 = aheVar.r;
                        y6a.M(obj);
                        asfVar3.a = true;
                        i2 = i5;
                        while (it.hasNext()) {
                            UniqueTournament uniqueTournament = (UniqueTournament) it.next();
                            if (!list4.contains(new Integer(uniqueTournament.getId()))) {
                                w3b w3bVar2 = this.b;
                                aheVar.r = list3;
                                aheVar.s = asfVar3;
                                aheVar.t = list4;
                                aheVar.u = it;
                                aheVar.v = i2;
                                aheVar.y = 4;
                                if (w3bVar2.R(uniqueTournament, null, -1, aheVar) != obj2) {
                                    i5 = i2;
                                    asfVar3.a = true;
                                    i2 = i5;
                                    while (it.hasNext()) {
                                    }
                                }
                            }
                        }
                        ArrayList arrayList222 = new ArrayList(k13.r(list3, 10));
                        it2 = list3.iterator();
                        while (it2.hasNext()) {
                            arrayList222.add(String.valueOf(((UniqueTournament) it2.next()).getId()));
                        }
                        Set<String> W022 = CollectionsKt.W0(arrayList222);
                        SharedPreferences.Editor edit22 = this.e.edit();
                        edit22.getClass();
                        edit22.putStringSet("OLD_PINNED_LIST_V2", W022);
                        edit22.apply();
                        if (asfVar3.a) {
                            return jdb.a();
                        }
                        aheVar.r = null;
                        aheVar.s = null;
                        aheVar.t = null;
                        aheVar.u = null;
                        aheVar.y = 5;
                        Object e = e(aheVar);
                        return e == obj2 ? obj2 : e;
                    }
                    asfVar = (asf) aheVar.t;
                    asfVar2 = aheVar.s;
                    list2 = aheVar.r;
                    y6a.M(obj);
                    asfVar.a = ((Boolean) obj).booleanValue();
                    wt3.v(this.e, "PINNED_RESET_DONE", true);
                    wt3.v(this.e, "PINNED_RESET_DONE_V2", true);
                    asfVar3 = asfVar2;
                    list3 = list2;
                    ArrayList arrayList2222 = new ArrayList(k13.r(list3, 10));
                    it2 = list3.iterator();
                    while (it2.hasNext()) {
                    }
                    Set<String> W0222 = CollectionsKt.W0(arrayList2222);
                    SharedPreferences.Editor edit222 = this.e.edit();
                    edit222.getClass();
                    edit222.putStringSet("OLD_PINNED_LIST_V2", W0222);
                    edit222.apply();
                    if (asfVar3.a) {
                    }
                }
                defaultPinnedLeaguesResponse = (DefaultPinnedLeaguesResponse) yaa.x((x2g) obj);
                if (defaultPinnedLeaguesResponse != null || (uniqueTournaments = defaultPinnedLeaguesResponse.getUniqueTournaments()) == null) {
                    return new gdb();
                }
                asfVar = new asf();
                aheVar.r = uniqueTournaments;
                aheVar.s = asfVar;
                aheVar.y = 2;
                Object d2 = d(aheVar);
                if (d2 != obj2) {
                    list = uniqueTournaments;
                    obj = d2;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    w3b w3bVar3 = this.b;
                    aheVar.r = list;
                    aheVar.s = asfVar;
                    aheVar.t = asfVar;
                    aheVar.y = 3;
                    obj = w3bVar3.S(list, aheVar);
                    if (obj != obj2) {
                    }
                }
            }
        }
        aheVar = new ahe(this, sq3Var);
        Object obj3 = aheVar.w;
        Object obj22 = lu3.a;
        i = aheVar.y;
        int i42 = 0;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        defaultPinnedLeaguesResponse = (DefaultPinnedLeaguesResponse) yaa.x((x2g) obj3);
        if (defaultPinnedLeaguesResponse != null) {
        }
        return new gdb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        if (e(r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (r10.b.O0(r12, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(int[] iArr, sq3 sq3Var) {
        bhe bheVar;
        int i;
        if (sq3Var instanceof bhe) {
            bheVar = (bhe) sq3Var;
            int i2 = bheVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bheVar.t = i2 - Integer.MIN_VALUE;
                Object obj = bheVar.r;
                Object obj2 = lu3.a;
                i = bheVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    if (iArr != null) {
                        ArrayList arrayList = new ArrayList(iArr.length);
                        int length = iArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            arrayList.add(new Pair(new Integer(iArr[i3]), new Integer(i4)));
                            i3++;
                            i4++;
                        }
                        bheVar.t = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        ad2 ad2Var = qv5.a;
                        qv5.a(v42.a);
                        return Unit.a;
                    }
                    y6a.M(obj);
                }
                bheVar.t = 2;
            }
        }
        bheVar = new bhe(this, sq3Var);
        Object obj3 = bheVar.r;
        Object obj22 = lu3.a;
        i = bheVar.t;
        if (i != 0) {
        }
        bheVar.t = 2;
    }
}
