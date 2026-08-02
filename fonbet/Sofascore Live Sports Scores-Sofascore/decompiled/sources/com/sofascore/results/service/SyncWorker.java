package com.sofascore.results.service;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.WorkerParameters;
import com.sofascore.model.mvvm.model.DbMyPlayer;
import com.sofascore.model.mvvm.model.DbMyTeam;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageIds;
import com.sofascore.model.network.response.EventResponse;
import com.sofascore.model.newNetwork.EventIdsResponse;
import com.sofascore.model.newNetwork.StageResponse;
import com.sofascore.model.newNetwork.StagesListResponse;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.model.profile.SyncNetworkResponse;
import defpackage.a52;
import defpackage.a70;
import defpackage.aba;
import defpackage.ad2;
import defpackage.aqi;
import defpackage.azi;
import defpackage.bfk;
import defpackage.bqi;
import defpackage.cqi;
import defpackage.d0b;
import defpackage.dhk;
import defpackage.dqi;
import defpackage.egk;
import defpackage.el;
import defpackage.eqi;
import defpackage.fvi;
import defpackage.g9i;
import defpackage.gqi;
import defpackage.gz8;
import defpackage.h52;
import defpackage.hdb;
import defpackage.hqi;
import defpackage.iqi;
import defpackage.j0j;
import defpackage.jdb;
import defpackage.jid;
import defpackage.joa;
import defpackage.k13;
import defpackage.ke0;
import defpackage.ku3;
import defpackage.l5i;
import defpackage.lu3;
import defpackage.qa6;
import defpackage.qv5;
import defpackage.rq3;
import defpackage.s96;
import defpackage.s9a;
import defpackage.spi;
import defpackage.sq3;
import defpackage.tak;
import defpackage.tpi;
import defpackage.udl;
import defpackage.ugj;
import defpackage.upi;
import defpackage.v76;
import defpackage.vpi;
import defpackage.w1l;
import defpackage.w3b;
import defpackage.w9g;
import defpackage.wi7;
import defpackage.wpi;
import defpackage.wve;
import defpackage.x2g;
import defpackage.xpi;
import defpackage.xr2;
import defpackage.y6a;
import defpackage.yaa;
import defpackage.ypi;
import defpackage.zpi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001$B\u008d\u0001\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/sofascore/results/service/SyncWorker;", "Lcom/sofascore/results/service/AbstractRetryCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lku3;", "appScope", "Lbfk;", "accountManager", "Lw3b;", "leagueRepository", "Lqa6;", "eventRepository", "Ls96;", "eventNetworkRepository", "Lwve;", "playerRepository", "Lj0j;", "teamRepository", "Ldhk;", "userRepository", "Ltak;", "uniqueStageRepository", "Lwi7;", "fantasyRepository", "Lel;", "adsRepository", "Ludl;", "cache", "Ljid;", "notificationsSyncUseCase", "Landroid/content/SharedPreferences;", "preferences", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lku3;Lbfk;Lw3b;Lqa6;Ls96;Lwve;Lj0j;Ldhk;Ltak;Lwi7;Lel;Ludl;Ljid;Landroid/content/SharedPreferences;)V", "w3a", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SyncWorker extends AbstractRetryCoroutineWorker {
    public final ku3 b;
    public final bfk c;
    public final w3b d;
    public final qa6 e;
    public final s96 f;
    public final wve g;
    public final j0j h;
    public final dhk i;
    public final tak j;
    public final wi7 k;
    public final el l;
    public final udl m;
    public final jid n;
    public final SharedPreferences o;
    public g9i p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull ku3 ku3Var, @NotNull bfk bfkVar, @NotNull w3b w3bVar, @NotNull qa6 qa6Var, @NotNull s96 s96Var, @NotNull wve wveVar, @NotNull j0j j0jVar, @NotNull dhk dhkVar, @NotNull tak takVar, @NotNull wi7 wi7Var, @NotNull el elVar, @NotNull udl udlVar, @NotNull jid jidVar, @NotNull SharedPreferences sharedPreferences) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        ku3Var.getClass();
        bfkVar.getClass();
        w3bVar.getClass();
        qa6Var.getClass();
        s96Var.getClass();
        wveVar.getClass();
        j0jVar.getClass();
        dhkVar.getClass();
        takVar.getClass();
        wi7Var.getClass();
        elVar.getClass();
        udlVar.getClass();
        jidVar.getClass();
        sharedPreferences.getClass();
        this.b = ku3Var;
        this.c = bfkVar;
        this.d = w3bVar;
        this.e = qa6Var;
        this.f = s96Var;
        this.g = wveVar;
        this.h = j0jVar;
        this.i = dhkVar;
        this.j = takVar;
        this.k = wi7Var;
        this.l = elVar;
        this.m = udlVar;
        this.n = jidVar;
        this.o = sharedPreferences;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (r6 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.sofascore.results.service.AbstractRetryCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        spi spiVar;
        int i;
        SyncNetworkResponse syncNetworkResponse;
        ProfileData userAccount;
        if (rq3Var instanceof spi) {
            spiVar = (spi) rq3Var;
            int i2 = spiVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                spiVar.t = i2 - Integer.MIN_VALUE;
                Object obj = spiVar.r;
                lu3 lu3Var = lu3.a;
                i = spiVar.t;
                rq3 rq3Var2 = null;
                if (i != 0) {
                    y6a.M(obj);
                    ke0.h = false;
                    spiVar.t = 1;
                    dhk dhkVar = this.i;
                    dhkVar.getClass();
                    obj = yaa.P(new egk(dhkVar, rq3Var2, 5), spiVar);
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
                syncNetworkResponse = (SyncNetworkResponse) yaa.x((x2g) obj);
                if (syncNetworkResponse != null || (userAccount = syncNetworkResponse.getUserAccount()) == null) {
                    return new hdb();
                }
                spiVar.t = 2;
                Object r = s9a.r(new gqi(this, userAccount, null), spiVar);
                if (r != lu3Var) {
                    r = Unit.a;
                }
            }
        }
        spiVar = new spi(this, (sq3) rq3Var);
        Object obj2 = spiVar.r;
        lu3 lu3Var2 = lu3.a;
        i = spiVar.t;
        rq3 rq3Var22 = null;
        if (i != 0) {
        }
        syncNetworkResponse = (SyncNetworkResponse) yaa.x((x2g) obj2);
        if (syncNetworkResponse != null) {
        }
        return new hdb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
    
        if (r8.e.o(r2, r0) == r1) goto L34;
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
    public final Object c(int i, int i2, sq3 sq3Var) {
        tpi tpiVar;
        int i3;
        EventResponse eventResponse;
        Event event;
        int i4;
        int i5;
        if (sq3Var instanceof tpi) {
            tpiVar = (tpi) sq3Var;
            int i6 = tpiVar.w;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                tpiVar.w = i6 - Integer.MIN_VALUE;
                Object obj = tpiVar.u;
                lu3 lu3Var = lu3.a;
                i3 = tpiVar.w;
                if (i3 != 0) {
                    y6a.M(obj);
                    tpiVar.r = i;
                    tpiVar.s = i2;
                    tpiVar.w = 1;
                    obj = this.f.d(i, tpiVar);
                } else if (i3 == 1) {
                    i2 = tpiVar.s;
                    i = tpiVar.r;
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
                    i5 = tpiVar.s;
                    i4 = tpiVar.r;
                    event = tpiVar.t;
                    y6a.M(obj);
                    if (((Boolean) obj).booleanValue()) {
                        return Unit.a;
                    }
                    tpiVar.t = null;
                    tpiVar.r = i4;
                    tpiVar.s = i5;
                    tpiVar.w = 3;
                }
                eventResponse = (EventResponse) yaa.x((x2g) obj);
                if (eventResponse != null || (event = eventResponse.getEvent()) == null) {
                    return Unit.a;
                }
                tpiVar.t = event;
                tpiVar.r = i;
                tpiVar.s = i2;
                tpiVar.w = 2;
                obj = this.d.B(i2, tpiVar);
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
        tpiVar = new tpi(this, sq3Var);
        Object obj2 = tpiVar.u;
        lu3 lu3Var2 = lu3.a;
        i3 = tpiVar.w;
        if (i3 != 0) {
        }
        eventResponse = (EventResponse) yaa.x((x2g) obj2);
        if (eventResponse != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
    
        if (r8.e.o(r2, r0) == r1) goto L34;
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
    public final Object d(int i, int i2, sq3 sq3Var) {
        upi upiVar;
        int i3;
        EventResponse eventResponse;
        Event event;
        int i4;
        int i5;
        if (sq3Var instanceof upi) {
            upiVar = (upi) sq3Var;
            int i6 = upiVar.w;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                upiVar.w = i6 - Integer.MIN_VALUE;
                Object obj = upiVar.u;
                lu3 lu3Var = lu3.a;
                i3 = upiVar.w;
                if (i3 != 0) {
                    y6a.M(obj);
                    upiVar.r = i;
                    upiVar.s = i2;
                    upiVar.w = 1;
                    obj = this.f.d(i, upiVar);
                } else if (i3 == 1) {
                    i2 = upiVar.s;
                    i = upiVar.r;
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
                    i5 = upiVar.s;
                    i4 = upiVar.r;
                    event = upiVar.t;
                    y6a.M(obj);
                    if (((Boolean) obj).booleanValue()) {
                        return Unit.a;
                    }
                    upiVar.t = null;
                    upiVar.r = i4;
                    upiVar.s = i5;
                    upiVar.w = 3;
                }
                eventResponse = (EventResponse) yaa.x((x2g) obj);
                if (eventResponse != null || (event = eventResponse.getEvent()) == null) {
                    return Unit.a;
                }
                upiVar.t = event;
                upiVar.r = i;
                upiVar.s = i2;
                upiVar.w = 2;
                obj = this.h.y(i2, upiVar);
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
        upiVar = new upi(this, sq3Var);
        Object obj2 = upiVar.u;
        lu3 lu3Var2 = lu3.a;
        i3 = upiVar.w;
        if (i3 != 0) {
        }
        eventResponse = (EventResponse) yaa.x((x2g) obj2);
        if (eventResponse != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0044, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(int i, sq3 sq3Var) {
        vpi vpiVar;
        int i2;
        StageResponse stageResponse;
        Stage stage;
        if (sq3Var instanceof vpi) {
            vpiVar = (vpi) sq3Var;
            int i3 = vpiVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vpiVar.u = i3 - Integer.MIN_VALUE;
                Object obj = vpiVar.s;
                lu3 lu3Var = lu3.a;
                i2 = vpiVar.u;
                s96 s96Var = this.f;
                if (i2 != 0) {
                    y6a.M(obj);
                    vpiVar.r = i;
                    vpiVar.u = 1;
                    obj = s96Var.y(i, vpiVar);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        Stage stage2 = (Stage) obj;
                        if (stage2 != null) {
                            joa joaVar = l5i.a;
                            l5i.l(stage2);
                            return stage2;
                        }
                        return null;
                    }
                    i = vpiVar.r;
                    y6a.M(obj);
                }
                stageResponse = (StageResponse) obj;
                if (stageResponse != null && (stage = stageResponse.getStage()) != null) {
                    if (!CollectionsKt.R(l5i.a(), stage.getType())) {
                        stage = null;
                    }
                    if (stage != null) {
                        vpiVar.r = i;
                        vpiVar.u = 2;
                        obj = s96Var.a(stage, false, vpiVar);
                    }
                }
                return null;
            }
        }
        vpiVar = new vpi(this, sq3Var);
        Object obj2 = vpiVar.s;
        lu3 lu3Var2 = lu3.a;
        i2 = vpiVar.u;
        s96 s96Var2 = this.f;
        if (i2 != 0) {
        }
        stageResponse = (StageResponse) obj2;
        if (stageResponse != null) {
            if (!CollectionsKt.R(l5i.a(), stage.getType())) {
            }
            if (stage != null) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable f(Stage stage, sq3 sq3Var) {
        wpi wpiVar;
        int i;
        StagesListResponse stagesListResponse;
        List<Stage> stages;
        if (sq3Var instanceof wpi) {
            wpiVar = (wpi) sq3Var;
            int i2 = wpiVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wpiVar.u = i2 - Integer.MIN_VALUE;
                Object obj = wpiVar.s;
                lu3 lu3Var = lu3.a;
                i = wpiVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    int id = stage.getId();
                    wpiVar.r = stage;
                    wpiVar.u = 1;
                    obj = this.f.R(id, wpiVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    stage = wpiVar.r;
                    y6a.M(obj);
                }
                stagesListResponse = (StagesListResponse) obj;
                if (stagesListResponse != null || (stages = stagesListResponse.getStages()) == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : stages) {
                    if (CollectionsKt.R(l5i.a(), ((Stage) obj2).getType())) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Stage stage2 = (Stage) it.next();
                    joa joaVar = l5i.a;
                    l5i.l(stage2);
                    stage2.setStageEvent(stage);
                    arrayList2.add(stage2);
                }
                return arrayList2;
            }
        }
        wpiVar = new wpi(this, sq3Var);
        Object obj3 = wpiVar.s;
        lu3 lu3Var2 = lu3.a;
        i = wpiVar.u;
        if (i != 0) {
        }
        stagesListResponse = (StagesListResponse) obj3;
        if (stagesListResponse != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(sq3 sq3Var) {
        xpi xpiVar;
        int i;
        if (sq3Var instanceof xpi) {
            xpiVar = (xpi) sq3Var;
            int i2 = xpiVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xpiVar.t = i2 - Integer.MIN_VALUE;
                Object obj = xpiVar.r;
                lu3 lu3Var = lu3.a;
                i = xpiVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    xpiVar.t = 1;
                    if (s9a.r(new w9g(this, rq3Var, 23), xpiVar) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Context applicationContext = getApplicationContext();
                applicationContext.getClass();
                aba.E(applicationContext);
                ad2 ad2Var = qv5.a;
                qv5.a(h52.a);
                qv5.a(a52.a);
                return Unit.a;
            }
        }
        xpiVar = new xpi(this, sq3Var);
        Object obj2 = xpiVar.r;
        lu3 lu3Var2 = lu3.a;
        i = xpiVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        Context applicationContext2 = getApplicationContext();
        applicationContext2.getClass();
        aba.E(applicationContext2);
        ad2 ad2Var2 = qv5.a;
        qv5.a(h52.a);
        qv5.a(a52.a);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        if (r10 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(List list, sq3 sq3Var) {
        ypi ypiVar;
        int i;
        Set set;
        int i2;
        Set set2;
        Iterator it;
        if (sq3Var instanceof ypi) {
            ypiVar = (ypi) sq3Var;
            int i3 = ypiVar.y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ypiVar.y = i3 - Integer.MIN_VALUE;
                Object obj = ypiVar.w;
                Object obj2 = lu3.a;
                i = ypiVar.y;
                qa6 qa6Var = this.e;
                if (i != 0) {
                    y6a.M(obj);
                    ypiVar.r = list;
                    ypiVar.y = 1;
                    obj = qa6Var.g(ypiVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = ypiVar.v;
                        it = ypiVar.u;
                        set = ypiVar.t;
                        set2 = ypiVar.s;
                        y6a.M(obj);
                        while (it.hasNext()) {
                            int intValue = ((Number) it.next()).intValue();
                            ypiVar.r = null;
                            ypiVar.s = set2;
                            ypiVar.t = set;
                            ypiVar.u = it;
                            ypiVar.v = i2;
                            ypiVar.y = 2;
                            if (qa6Var.z(intValue, ypiVar) == obj2) {
                                return obj2;
                            }
                        }
                        set.removeAll(set2);
                        ugj.a.getClass();
                        return set;
                    }
                    list = ypiVar.r;
                    y6a.M(obj);
                }
                Set set3 = (Set) obj;
                HashSet Q0 = CollectionsKt.Q0(set3);
                HashSet Q02 = CollectionsKt.Q0(list);
                set3.removeAll(Q02);
                set = Q02;
                i2 = 0;
                set2 = Q0;
                it = set3.iterator();
                while (it.hasNext()) {
                }
                set.removeAll(set2);
                ugj.a.getClass();
                return set;
            }
        }
        ypiVar = new ypi(this, sq3Var);
        Object obj3 = ypiVar.w;
        Object obj22 = lu3.a;
        i = ypiVar.y;
        qa6 qa6Var2 = this.e;
        if (i != 0) {
        }
        Set set32 = (Set) obj3;
        HashSet Q03 = CollectionsKt.Q0(set32);
        HashSet Q022 = CollectionsKt.Q0(list);
        set32.removeAll(Q022);
        set = Q022;
        i2 = 0;
        set2 = Q03;
        it = set32.iterator();
        while (it.hasNext()) {
        }
        set.removeAll(set2);
        ugj.a.getClass();
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        if (r13 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(List list, sq3 sq3Var) {
        zpi zpiVar;
        int i;
        Set set;
        int i2;
        Set set2;
        Iterator it;
        if (sq3Var instanceof zpi) {
            zpiVar = (zpi) sq3Var;
            int i3 = zpiVar.y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zpiVar.y = i3 - Integer.MIN_VALUE;
                Object obj = zpiVar.w;
                Object obj2 = lu3.a;
                i = zpiVar.y;
                qa6 qa6Var = this.e;
                int i4 = 1;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    zpiVar.r = list;
                    zpiVar.y = 1;
                    obj = qa6Var.h(zpiVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = zpiVar.v;
                        it = zpiVar.u;
                        set = zpiVar.t;
                        set2 = zpiVar.s;
                        y6a.M(obj);
                        while (it.hasNext()) {
                            int intValue = ((Number) it.next()).intValue();
                            zpiVar.r = null;
                            zpiVar.s = set2;
                            zpiVar.t = set;
                            zpiVar.u = it;
                            zpiVar.v = i2;
                            zpiVar.y = 2;
                            v76 v76Var = qa6Var.a;
                            if (gz8.T(zpiVar, v76Var.a, new xr2(v76Var, intValue, rq3Var, i4)) == obj2) {
                                return obj2;
                            }
                        }
                        set.removeAll(set2);
                        ugj.a.getClass();
                        return set;
                    }
                    list = zpiVar.r;
                    y6a.M(obj);
                }
                Set set3 = (Set) obj;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.addAll(set3);
                HashSet Q0 = CollectionsKt.Q0(list);
                set3.removeAll(Q0);
                set = Q0;
                i2 = 0;
                set2 = linkedHashSet;
                it = set3.iterator();
                while (it.hasNext()) {
                }
                set.removeAll(set2);
                ugj.a.getClass();
                return set;
            }
        }
        zpiVar = new zpi(this, sq3Var);
        Object obj3 = zpiVar.w;
        Object obj22 = lu3.a;
        i = zpiVar.y;
        qa6 qa6Var2 = this.e;
        int i42 = 1;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        Set set32 = (Set) obj3;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.addAll(set32);
        HashSet Q02 = CollectionsKt.Q0(list);
        set32.removeAll(Q02);
        set = Q02;
        i2 = 0;
        set2 = linkedHashSet2;
        it = set32.iterator();
        while (it.hasNext()) {
        }
        set.removeAll(set2);
        ugj.a.getClass();
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(List list, sq3 sq3Var) {
        aqi aqiVar;
        Object obj;
        int i;
        qa6 qa6Var;
        List S0;
        HashSet hashSet;
        HashSet hashSet2;
        if (sq3Var instanceof aqi) {
            aqiVar = (aqi) sq3Var;
            int i2 = aqiVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aqiVar.w = i2 - Integer.MIN_VALUE;
                Object obj2 = aqiVar.u;
                obj = lu3.a;
                i = aqiVar.w;
                qa6Var = this.e;
                if (i != 0) {
                    y6a.M(obj2);
                    aqiVar.r = list;
                    aqiVar.w = 1;
                    obj2 = qa6Var.i(aqiVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hashSet = aqiVar.t;
                        hashSet2 = aqiVar.s;
                        y6a.M(obj2);
                        hashSet.removeAll(hashSet2);
                        ugj.a.getClass();
                        return hashSet;
                    }
                    list = aqiVar.r;
                    y6a.M(obj2);
                }
                HashSet Q0 = CollectionsKt.Q0((Iterable) obj2);
                HashSet Q02 = CollectionsKt.Q0(Q0);
                HashSet Q03 = CollectionsKt.Q0(list);
                Q0.removeAll(Q03);
                S0 = CollectionsKt.S0(Q0);
                aqiVar.r = null;
                aqiVar.s = Q02;
                aqiVar.t = Q03;
                aqiVar.w = 2;
                if (qa6Var.A(S0, aqiVar) != obj) {
                    hashSet = Q03;
                    hashSet2 = Q02;
                    hashSet.removeAll(hashSet2);
                    ugj.a.getClass();
                    return hashSet;
                }
                return obj;
            }
        }
        aqiVar = new aqi(this, sq3Var);
        Object obj22 = aqiVar.u;
        obj = lu3.a;
        i = aqiVar.w;
        qa6Var = this.e;
        if (i != 0) {
        }
        HashSet Q04 = CollectionsKt.Q0((Iterable) obj22);
        HashSet Q022 = CollectionsKt.Q0(Q04);
        HashSet Q032 = CollectionsKt.Q0(list);
        Q04.removeAll(Q032);
        S0 = CollectionsKt.S0(Q04);
        aqiVar.r = null;
        aqiVar.s = Q022;
        aqiVar.t = Q032;
        aqiVar.w = 2;
        if (qa6Var.A(S0, aqiVar) != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r10 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable k(ArrayList arrayList, sq3 sq3Var) {
        bqi bqiVar;
        int i;
        HashSet hashSet;
        int i2;
        HashSet hashSet2;
        Iterator it;
        if (sq3Var instanceof bqi) {
            bqiVar = (bqi) sq3Var;
            int i3 = bqiVar.y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bqiVar.y = i3 - Integer.MIN_VALUE;
                Object obj = bqiVar.w;
                lu3 lu3Var = lu3.a;
                i = bqiVar.y;
                wve wveVar = this.g;
                if (i != 0) {
                    y6a.M(obj);
                    bqiVar.r = arrayList;
                    bqiVar.y = 1;
                    obj = wveVar.d(bqiVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = bqiVar.v;
                        it = bqiVar.u;
                        hashSet = bqiVar.t;
                        hashSet2 = bqiVar.s;
                        y6a.M(obj);
                        while (it.hasNext()) {
                            int playerId = ((DbMyPlayer) it.next()).getPlayerId();
                            bqiVar.r = null;
                            bqiVar.s = hashSet2;
                            bqiVar.t = hashSet;
                            bqiVar.u = it;
                            bqiVar.v = i2;
                            bqiVar.y = 2;
                            if (wveVar.q(playerId, bqiVar) == lu3Var) {
                                return lu3Var;
                            }
                        }
                        hashSet.removeAll(hashSet2);
                        ugj.a.getClass();
                        return hashSet;
                    }
                    arrayList = bqiVar.r;
                    y6a.M(obj);
                }
                HashSet hashSet3 = (HashSet) obj;
                HashSet Q0 = CollectionsKt.Q0(hashSet3);
                HashSet Q02 = CollectionsKt.Q0(arrayList);
                hashSet3.removeAll(Q02);
                hashSet = Q02;
                i2 = 0;
                hashSet2 = Q0;
                it = hashSet3.iterator();
                while (it.hasNext()) {
                }
                hashSet.removeAll(hashSet2);
                ugj.a.getClass();
                return hashSet;
            }
        }
        bqiVar = new bqi(this, sq3Var);
        Object obj2 = bqiVar.w;
        lu3 lu3Var2 = lu3.a;
        i = bqiVar.y;
        wve wveVar2 = this.g;
        if (i != 0) {
        }
        HashSet hashSet32 = (HashSet) obj2;
        HashSet Q03 = CollectionsKt.Q0(hashSet32);
        HashSet Q022 = CollectionsKt.Q0(arrayList);
        hashSet32.removeAll(Q022);
        hashSet = Q022;
        i2 = 0;
        hashSet2 = Q03;
        it = hashSet32.iterator();
        while (it.hasNext()) {
        }
        hashSet.removeAll(hashSet2);
        ugj.a.getClass();
        return hashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062 A[LOOP:0: B:18:0x005c->B:20:0x0062, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(List list, sq3 sq3Var) {
        cqi cqiVar;
        Object obj;
        int i;
        qa6 qa6Var;
        Iterator it;
        List S0;
        HashSet hashSet;
        HashSet hashSet2;
        if (sq3Var instanceof cqi) {
            cqiVar = (cqi) sq3Var;
            int i2 = cqiVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cqiVar.w = i2 - Integer.MIN_VALUE;
                Object obj2 = cqiVar.u;
                obj = lu3.a;
                i = cqiVar.w;
                qa6Var = this.e;
                if (i != 0) {
                    y6a.M(obj2);
                    cqiVar.r = list;
                    cqiVar.w = 1;
                    obj2 = qa6Var.k(cqiVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hashSet = cqiVar.t;
                        hashSet2 = cqiVar.s;
                        y6a.M(obj2);
                        hashSet.removeAll(hashSet2);
                        ugj.a.getClass();
                        return hashSet;
                    }
                    list = cqiVar.r;
                    y6a.M(obj2);
                }
                Iterable iterable = (Iterable) obj2;
                ArrayList arrayList = new ArrayList(k13.r(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    w1l.A(arrayList, ((StageIds) it.next()).getId());
                }
                HashSet Q0 = CollectionsKt.Q0(arrayList);
                HashSet Q02 = CollectionsKt.Q0(Q0);
                HashSet Q03 = CollectionsKt.Q0(list);
                Q0.removeAll(Q03);
                S0 = CollectionsKt.S0(Q0);
                cqiVar.r = null;
                cqiVar.s = Q02;
                cqiVar.t = Q03;
                cqiVar.w = 2;
                if (qa6Var.x(S0, cqiVar) != obj) {
                    hashSet = Q03;
                    hashSet2 = Q02;
                    hashSet.removeAll(hashSet2);
                    ugj.a.getClass();
                    return hashSet;
                }
                return obj;
            }
        }
        cqiVar = new cqi(this, sq3Var);
        Object obj22 = cqiVar.u;
        obj = lu3.a;
        i = cqiVar.w;
        qa6Var = this.e;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj22;
        ArrayList arrayList2 = new ArrayList(k13.r(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        HashSet Q04 = CollectionsKt.Q0(arrayList2);
        HashSet Q022 = CollectionsKt.Q0(Q04);
        HashSet Q032 = CollectionsKt.Q0(list);
        Q04.removeAll(Q032);
        S0 = CollectionsKt.S0(Q04);
        cqiVar.r = null;
        cqiVar.s = Q022;
        cqiVar.t = Q032;
        cqiVar.w = 2;
        if (qa6Var.x(S0, cqiVar) != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        if (r13 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(ArrayList arrayList, sq3 sq3Var) {
        dqi dqiVar;
        int i;
        Set set;
        int i2;
        Set set2;
        Iterator it;
        if (sq3Var instanceof dqi) {
            dqiVar = (dqi) sq3Var;
            int i3 = dqiVar.y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dqiVar.y = i3 - Integer.MIN_VALUE;
                Object obj = dqiVar.w;
                Object obj2 = lu3.a;
                i = dqiVar.y;
                j0j j0jVar = this.h;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    dqiVar.r = arrayList;
                    dqiVar.y = 1;
                    obj = j0jVar.c(dqiVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = dqiVar.v;
                        it = dqiVar.u;
                        set = dqiVar.t;
                        set2 = dqiVar.s;
                        y6a.M(obj);
                        while (it.hasNext()) {
                            int teamId = ((DbMyTeam) it.next()).getTeamId();
                            dqiVar.r = null;
                            dqiVar.s = set2;
                            dqiVar.t = set;
                            dqiVar.u = it;
                            dqiVar.v = i2;
                            dqiVar.y = 2;
                            fvi fviVar = j0jVar.a;
                            if (gz8.T(dqiVar, fviVar.a, new xr2(fviVar, teamId, rq3Var, 6)) == obj2) {
                                return obj2;
                            }
                        }
                        set.removeAll(set2);
                        ugj.a.getClass();
                        return set;
                    }
                    arrayList = dqiVar.r;
                    y6a.M(obj);
                }
                Set set3 = (Set) obj;
                HashSet Q0 = CollectionsKt.Q0(set3);
                HashSet Q02 = CollectionsKt.Q0(arrayList);
                set3.removeAll(Q02);
                set = Q02;
                i2 = 0;
                set2 = Q0;
                it = set3.iterator();
                while (it.hasNext()) {
                }
                set.removeAll(set2);
                ugj.a.getClass();
                return set;
            }
        }
        dqiVar = new dqi(this, sq3Var);
        Object obj3 = dqiVar.w;
        Object obj22 = lu3.a;
        i = dqiVar.y;
        j0j j0jVar2 = this.h;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        Set set32 = (Set) obj3;
        HashSet Q03 = CollectionsKt.Q0(set32);
        HashSet Q022 = CollectionsKt.Q0(arrayList);
        set32.removeAll(Q022);
        set = Q022;
        i2 = 0;
        set2 = Q03;
        it = set32.iterator();
        while (it.hasNext()) {
        }
        set.removeAll(set2);
        ugj.a.getClass();
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(List list, sq3 sq3Var) {
        eqi eqiVar;
        Object obj;
        int i;
        tak takVar;
        List S0;
        HashSet hashSet;
        HashSet hashSet2;
        if (sq3Var instanceof eqi) {
            eqiVar = (eqi) sq3Var;
            int i2 = eqiVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eqiVar.w = i2 - Integer.MIN_VALUE;
                Object obj2 = eqiVar.u;
                obj = lu3.a;
                i = eqiVar.w;
                takVar = this.j;
                if (i != 0) {
                    y6a.M(obj2);
                    eqiVar.r = list;
                    eqiVar.w = 1;
                    obj2 = takVar.c(eqiVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hashSet = eqiVar.t;
                        hashSet2 = eqiVar.s;
                        y6a.M(obj2);
                        hashSet.removeAll(hashSet2);
                        ugj.a.getClass();
                        return hashSet;
                    }
                    list = eqiVar.r;
                    y6a.M(obj2);
                }
                HashSet Q0 = CollectionsKt.Q0((Iterable) obj2);
                HashSet Q02 = CollectionsKt.Q0(Q0);
                HashSet Q03 = CollectionsKt.Q0(list);
                Q0.removeAll(Q03);
                S0 = CollectionsKt.S0(Q0);
                eqiVar.r = null;
                eqiVar.s = Q02;
                eqiVar.t = Q03;
                eqiVar.w = 2;
                if (takVar.e(S0, eqiVar) != obj) {
                    hashSet = Q03;
                    hashSet2 = Q02;
                    hashSet.removeAll(hashSet2);
                    ugj.a.getClass();
                    return hashSet;
                }
                return obj;
            }
        }
        eqiVar = new eqi(this, sq3Var);
        Object obj22 = eqiVar.u;
        obj = lu3.a;
        i = eqiVar.w;
        takVar = this.j;
        if (i != 0) {
        }
        HashSet Q04 = CollectionsKt.Q0((Iterable) obj22);
        HashSet Q022 = CollectionsKt.Q0(Q04);
        HashSet Q032 = CollectionsKt.Q0(list);
        Q04.removeAll(Q032);
        S0 = CollectionsKt.S0(Q04);
        eqiVar.r = null;
        eqiVar.s = Q022;
        eqiVar.t = Q032;
        eqiVar.w = 2;
        if (takVar.e(S0, eqiVar) != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e7, code lost:
    
        if (r14 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0085, code lost:
    
        if (r14 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00d2 -> B:14:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0108 -> B:13:0x010b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x010f -> B:14:0x00a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(int i, sq3 sq3Var) {
        hqi hqiVar;
        int i2;
        EventIdsResponse eventIdsResponse;
        List<Integer> eventIds;
        int i3;
        Iterator it;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Iterator it2;
        if (sq3Var instanceof hqi) {
            hqiVar = (hqi) sq3Var;
            int i9 = hqiVar.y;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                hqiVar.y = i9 - Integer.MIN_VALUE;
                Object obj = hqiVar.w;
                Object obj2 = lu3.a;
                i2 = hqiVar.y;
                rq3 rq3Var = null;
                w3b w3bVar = this.d;
                if (i2 != 0) {
                    y6a.M(obj);
                    hqiVar.r = i;
                    hqiVar.y = 1;
                    w3bVar.getClass();
                    obj = yaa.P(new d0b(i, 11, rq3Var, w3bVar), hqiVar);
                } else if (i2 == 1) {
                    i = hqiVar.r;
                    y6a.M(obj);
                } else if (i2 == 2) {
                    i5 = hqiVar.u;
                    i6 = hqiVar.t;
                    i4 = hqiVar.s;
                    i3 = hqiVar.r;
                    it = hqiVar.v;
                    y6a.M(obj);
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    if (!it.hasNext()) {
                    }
                } else if (i2 == 3) {
                    i5 = hqiVar.u;
                    i6 = hqiVar.t;
                    i4 = hqiVar.s;
                    i3 = hqiVar.r;
                    it = hqiVar.v;
                    y6a.M(obj);
                    Object obj3 = obj;
                    int i10 = i5;
                    i7 = i4;
                    int i11 = i6;
                    hqi hqiVar2 = hqiVar;
                    if (((Boolean) obj3).booleanValue()) {
                        hqiVar2.v = it;
                        hqiVar2.r = i3;
                        hqiVar2.s = i7;
                        hqiVar2.t = i11;
                        hqiVar2.u = i10;
                        hqiVar2.y = 4;
                        if (c(i11, i3, hqiVar2) != obj2) {
                            hqiVar = hqiVar2;
                            i8 = i3;
                            it2 = it;
                            i3 = i8;
                            it = it2;
                            i4 = i7;
                            if (!it.hasNext()) {
                            }
                        }
                        return obj2;
                    }
                    i4 = i7;
                    hqiVar = hqiVar2;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i2 != 4) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i7 = hqiVar.s;
                    i8 = hqiVar.r;
                    it2 = hqiVar.v;
                    y6a.M(obj);
                    i3 = i8;
                    it = it2;
                    i4 = i7;
                    if (!it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        hqiVar.v = it;
                        hqiVar.r = i3;
                        hqiVar.s = i4;
                        hqiVar.t = intValue;
                        hqiVar.u = 0;
                        hqiVar.y = 2;
                        obj = this.e.m(intValue, hqiVar);
                        if (obj != obj2) {
                            i6 = intValue;
                            i5 = 0;
                            if (!((Boolean) obj).booleanValue()) {
                                hqiVar.v = it;
                                hqiVar.r = i3;
                                hqiVar.s = i4;
                                hqiVar.t = i6;
                                hqiVar.u = i5;
                                hqiVar.y = 3;
                                obj = w3bVar.B(i3, hqiVar);
                            }
                            if (!it.hasNext()) {
                                return Unit.a;
                            }
                        }
                        return obj2;
                    }
                }
                eventIdsResponse = (EventIdsResponse) yaa.x((x2g) obj);
                if (eventIdsResponse != null || (eventIds = eventIdsResponse.getEventIds()) == null) {
                    return Unit.a;
                }
                i3 = i;
                it = eventIds.iterator();
                i4 = 0;
                if (!it.hasNext()) {
                }
            }
        }
        hqiVar = new hqi(this, sq3Var);
        Object obj4 = hqiVar.w;
        Object obj22 = lu3.a;
        i2 = hqiVar.y;
        rq3 rq3Var2 = null;
        w3b w3bVar2 = this.d;
        if (i2 != 0) {
        }
        eventIdsResponse = (EventIdsResponse) yaa.x((x2g) obj4);
        if (eventIdsResponse != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e7, code lost:
    
        if (r14 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0085, code lost:
    
        if (r14 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00d2 -> B:14:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0108 -> B:13:0x010b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x010f -> B:14:0x00a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(int i, sq3 sq3Var) {
        iqi iqiVar;
        int i2;
        EventIdsResponse eventIdsResponse;
        List<Integer> eventIds;
        int i3;
        Iterator it;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Iterator it2;
        if (sq3Var instanceof iqi) {
            iqiVar = (iqi) sq3Var;
            int i9 = iqiVar.y;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                iqiVar.y = i9 - Integer.MIN_VALUE;
                Object obj = iqiVar.w;
                Object obj2 = lu3.a;
                i2 = iqiVar.y;
                rq3 rq3Var = null;
                j0j j0jVar = this.h;
                if (i2 != 0) {
                    y6a.M(obj);
                    iqiVar.r = i;
                    iqiVar.y = 1;
                    j0jVar.getClass();
                    obj = yaa.P(new azi(j0jVar, i, rq3Var, 9), iqiVar);
                } else if (i2 == 1) {
                    i = iqiVar.r;
                    y6a.M(obj);
                } else if (i2 == 2) {
                    i5 = iqiVar.u;
                    i6 = iqiVar.t;
                    i4 = iqiVar.s;
                    i3 = iqiVar.r;
                    it = iqiVar.v;
                    y6a.M(obj);
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    if (!it.hasNext()) {
                    }
                } else if (i2 == 3) {
                    i5 = iqiVar.u;
                    i6 = iqiVar.t;
                    i4 = iqiVar.s;
                    i3 = iqiVar.r;
                    it = iqiVar.v;
                    y6a.M(obj);
                    Object obj3 = obj;
                    int i10 = i5;
                    i7 = i4;
                    int i11 = i6;
                    iqi iqiVar2 = iqiVar;
                    if (((Boolean) obj3).booleanValue()) {
                        iqiVar2.v = it;
                        iqiVar2.r = i3;
                        iqiVar2.s = i7;
                        iqiVar2.t = i11;
                        iqiVar2.u = i10;
                        iqiVar2.y = 4;
                        if (d(i11, i3, iqiVar2) != obj2) {
                            iqiVar = iqiVar2;
                            i8 = i3;
                            it2 = it;
                            i3 = i8;
                            it = it2;
                            i4 = i7;
                            if (!it.hasNext()) {
                            }
                        }
                        return obj2;
                    }
                    i4 = i7;
                    iqiVar = iqiVar2;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i2 != 4) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i7 = iqiVar.s;
                    i8 = iqiVar.r;
                    it2 = iqiVar.v;
                    y6a.M(obj);
                    i3 = i8;
                    it = it2;
                    i4 = i7;
                    if (!it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        iqiVar.v = it;
                        iqiVar.r = i3;
                        iqiVar.s = i4;
                        iqiVar.t = intValue;
                        iqiVar.u = 0;
                        iqiVar.y = 2;
                        obj = this.e.m(intValue, iqiVar);
                        if (obj != obj2) {
                            i6 = intValue;
                            i5 = 0;
                            if (!((Boolean) obj).booleanValue()) {
                                iqiVar.v = it;
                                iqiVar.r = i3;
                                iqiVar.s = i4;
                                iqiVar.t = i6;
                                iqiVar.u = i5;
                                iqiVar.y = 3;
                                obj = j0jVar.y(i3, iqiVar);
                            }
                            if (!it.hasNext()) {
                                return Unit.a;
                            }
                        }
                        return obj2;
                    }
                }
                eventIdsResponse = (EventIdsResponse) yaa.x((x2g) obj);
                if (eventIdsResponse != null || (eventIds = eventIdsResponse.getEventIds()) == null) {
                    return Unit.a;
                }
                i3 = i;
                it = eventIds.iterator();
                i4 = 0;
                if (!it.hasNext()) {
                }
            }
        }
        iqiVar = new iqi(this, sq3Var);
        Object obj4 = iqiVar.w;
        Object obj22 = lu3.a;
        i2 = iqiVar.y;
        rq3 rq3Var2 = null;
        j0j j0jVar2 = this.h;
        if (i2 != 0) {
        }
        eventIdsResponse = (EventIdsResponse) yaa.x((x2g) obj4);
        if (eventIdsResponse != null) {
        }
        return Unit.a;
    }
}
