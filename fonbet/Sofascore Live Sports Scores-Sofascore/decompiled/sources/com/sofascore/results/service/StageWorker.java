package com.sofascore.results.service;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.newNetwork.RecentStageIdsResponse;
import com.sofascore.model.newNetwork.StageResponse;
import com.sofascore.model.newNetwork.StagesListResponse;
import defpackage.a52;
import defpackage.a70;
import defpackage.aba;
import defpackage.ad2;
import defpackage.asf;
import defpackage.b9i;
import defpackage.jdb;
import defpackage.jid;
import defpackage.joa;
import defpackage.k13;
import defpackage.km5;
import defpackage.kv7;
import defpackage.l5i;
import defpackage.lu3;
import defpackage.md4;
import defpackage.qa6;
import defpackage.qv5;
import defpackage.rq3;
import defpackage.s8i;
import defpackage.s96;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.t8i;
import defpackage.tak;
import defpackage.u8i;
import defpackage.v8i;
import defpackage.w8i;
import defpackage.x42;
import defpackage.x8i;
import defpackage.y6a;
import defpackage.y8i;
import defpackage.z8i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B=\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/sofascore/results/service/StageWorker;", "Lcom/sofascore/results/service/AbstractRetryCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lqa6;", "eventStageRepository", "Ls96;", "networkRepository", "Ltak;", "uniqueStageRepository", "Ljid;", "notificationsSyncUseCase", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lqa6;Ls96;Ltak;Ljid;)V", "t6a", "s8i", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StageWorker extends AbstractRetryCoroutineWorker {
    public final qa6 b;
    public final s96 c;
    public final tak d;
    public final jid e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StageWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull qa6 qa6Var, @NotNull s96 s96Var, @NotNull tak takVar, @NotNull jid jidVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        qa6Var.getClass();
        s96Var.getClass();
        takVar.getClass();
        jidVar.getClass();
        this.b = qa6Var;
        this.c = s96Var;
        this.d = takVar;
        this.e = jidVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        if (c(r9, r2, true, r0) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x012f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        if (defpackage.s9a.r(new defpackage.big(r8, r3, 24), r0) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b8, code lost:
    
        if (i(r9, r0) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        if (h(r9, true, r0) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f3, code lost:
    
        if (c(r9, true, true, r0) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0112, code lost:
    
        if (h(r9, true, r0) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012d, code lost:
    
        if (d(r9, r0) == r1) goto L62;
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
        x8i x8iVar;
        if (rq3Var instanceof x8i) {
            x8iVar = (x8i) rq3Var;
            int i = x8iVar.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                x8iVar.t = i - Integer.MIN_VALUE;
                Object obj = x8iVar.r;
                Object obj2 = lu3.a;
                rq3 rq3Var2 = null;
                switch (x8iVar.t) {
                    case 0:
                        y6a.M(obj);
                        String e = getInputData().e("ACTION");
                        if (e != null) {
                            switch (e.hashCode()) {
                                case -1966844946:
                                    if (e.equals("ADD_UNIQUE_STAGE")) {
                                        int a = getInputData().a("STAGE_ID", 0);
                                        x8iVar.t = 3;
                                        break;
                                    }
                                    break;
                                case -1572296861:
                                    if (e.equals("REMOVE_STAGE")) {
                                        int[] iArr = {getInputData().a("STAGE_ID", 0)};
                                        x8iVar.t = 5;
                                        break;
                                    }
                                    break;
                                case -248707680:
                                    if (e.equals("ADD_STAGE")) {
                                        int[] iArr2 = {getInputData().a("STAGE_ID", 0)};
                                        x8iVar.t = 1;
                                        break;
                                    }
                                    break;
                                case 844488698:
                                    if (e.equals("REMOVE_STAGE_LIST")) {
                                        int[] b = getInputData().b("STAGE_IDS");
                                        x8iVar.t = 6;
                                        break;
                                    }
                                    break;
                                case 856080587:
                                    if (e.equals("REMOVE_UNIQUE_STAGE")) {
                                        int a2 = getInputData().a("STAGE_ID", 0);
                                        x8iVar.t = 7;
                                        break;
                                    }
                                    break;
                                case 1515577055:
                                    if (e.equals("REFRESH_UNIQUE_STAGES")) {
                                        x8iVar.t = 4;
                                        break;
                                    }
                                    break;
                                case 1637081053:
                                    if (e.equals("ADD_STAGE_LIST")) {
                                        int[] b2 = getInputData().b("STAGE_IDS");
                                        md4 inputData = getInputData();
                                        Object obj3 = Boolean.TRUE;
                                        Object obj4 = inputData.a.get("WITH_SUB_STAGES");
                                        if (obj4 instanceof Boolean) {
                                            obj3 = obj4;
                                        }
                                        boolean booleanValue = ((Boolean) obj3).booleanValue();
                                        x8iVar.t = 2;
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
                    case 7:
                        y6a.M(obj);
                        break;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
                return jdb.a();
            }
        }
        x8iVar = new x8i(this, (sq3) rq3Var);
        Object obj5 = x8iVar.r;
        Object obj22 = lu3.a;
        rq3 rq3Var22 = null;
        switch (x8iVar.t) {
        }
        return jdb.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        if (r12.e.h(r0, false, r7) == r8) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int[] iArr, boolean z, boolean z2, sq3 sq3Var) {
        t8i t8iVar;
        int i;
        asf asfVar;
        boolean z3;
        boolean z4;
        if (sq3Var instanceof t8i) {
            t8iVar = (t8i) sq3Var;
            int i2 = t8iVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t8iVar.w = i2 - Integer.MIN_VALUE;
                t8i t8iVar2 = t8iVar;
                Object obj = t8iVar2.u;
                lu3 lu3Var = lu3.a;
                i = t8iVar2.w;
                if (i != 0) {
                    y6a.M(obj);
                    if (iArr == null) {
                        return Unit.a;
                    }
                    asfVar = new asf();
                    u8i u8iVar = new u8i(iArr, z2, this, asfVar, z, null);
                    t8iVar2.r = asfVar;
                    t8iVar2.s = z;
                    t8iVar2.t = z2;
                    t8iVar2.w = 1;
                    if (s9a.r(u8iVar, t8iVar2) != lu3Var) {
                        z3 = z;
                        z4 = z2;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    e();
                    return Unit.a;
                }
                z4 = t8iVar2.t;
                z3 = t8iVar2.s;
                asfVar = t8iVar2.r;
                y6a.M(obj);
                if (asfVar.a) {
                    Context applicationContext = getApplicationContext();
                    applicationContext.getClass();
                    t8iVar2.r = null;
                    t8iVar2.s = z3;
                    t8iVar2.t = z4;
                    t8iVar2.w = 2;
                }
                return Unit.a;
            }
        }
        t8iVar = new t8i(this, sq3Var);
        t8i t8iVar22 = t8iVar;
        Object obj2 = t8iVar22.u;
        lu3 lu3Var2 = lu3.a;
        i = t8iVar22.w;
        if (i != 0) {
        }
        if (asfVar.a) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00af, code lost:
    
        if (r3.j(r12, false, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
    
        if (r3.h(r12, false, r0) != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        if (c(r2, true, false, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        if (r12 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0063, code lost:
    
        if (r10.d.a(r11, r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, sq3 sq3Var) {
        v8i v8iVar;
        int i2;
        List<Integer> stageIds;
        if (sq3Var instanceof v8i) {
            v8iVar = (v8i) sq3Var;
            int i3 = v8iVar.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v8iVar.v = i3 - Integer.MIN_VALUE;
                Object obj = v8iVar.t;
                Object obj2 = lu3.a;
                i2 = v8iVar.v;
                jid jidVar = this.e;
                if (i2 != 0) {
                    y6a.M(obj);
                    v8iVar.r = i;
                    v8iVar.v = 1;
                } else if (i2 == 1) {
                    i = v8iVar.r;
                    y6a.M(obj);
                } else if (i2 == 2) {
                    i = v8iVar.r;
                    y6a.M(obj);
                    RecentStageIdsResponse recentStageIdsResponse = (RecentStageIdsResponse) obj;
                    if (recentStageIdsResponse != null && (stageIds = recentStageIdsResponse.getStageIds()) != null) {
                        int[] R0 = CollectionsKt.R0(stageIds);
                        v8iVar.s = stageIds;
                        v8iVar.r = i;
                        v8iVar.v = 3;
                    }
                    Context applicationContext = getApplicationContext();
                    applicationContext.getClass();
                    v8iVar.r = i;
                    v8iVar.v = 4;
                } else if (i2 == 3) {
                    i = v8iVar.r;
                    y6a.M(obj);
                    Context applicationContext2 = getApplicationContext();
                    applicationContext2.getClass();
                    v8iVar.r = i;
                    v8iVar.v = 4;
                } else {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        e();
                        return Unit.a;
                    }
                    i = v8iVar.r;
                    y6a.M(obj);
                    Context applicationContext3 = getApplicationContext();
                    applicationContext3.getClass();
                    v8iVar.r = i;
                    v8iVar.v = 5;
                }
                v8iVar.r = i;
                v8iVar.v = 2;
                obj = this.c.O(i, v8iVar);
            }
        }
        v8iVar = new v8i(this, sq3Var);
        Object obj3 = v8iVar.t;
        Object obj22 = lu3.a;
        i2 = v8iVar.v;
        jid jidVar2 = this.e;
        if (i2 != 0) {
        }
        v8iVar.r = i;
        v8iVar.v = 2;
        obj3 = this.c.O(i, v8iVar);
    }

    public final void e() {
        ad2 ad2Var = qv5.a;
        qv5.a(a52.a);
        qv5.a(x42.a);
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        aba.E(applicationContext);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0058, code lost:
    
        if (r12 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i, boolean z, sq3 sq3Var) {
        w8i w8iVar;
        int i2;
        StageResponse stageResponse;
        Stage stage;
        int i3;
        int i4;
        Stage stage2;
        List<Stage> list;
        Stage stage3;
        if (sq3Var instanceof w8i) {
            w8iVar = (w8i) sq3Var;
            int i5 = w8iVar.x;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                w8iVar.x = i5 - Integer.MIN_VALUE;
                Object obj = w8iVar.v;
                Serializable serializable = lu3.a;
                i2 = w8iVar.x;
                s96 s96Var = this.c;
                if (i2 != 0) {
                    y6a.M(obj);
                    w8iVar.r = i;
                    w8iVar.t = z;
                    w8iVar.x = 1;
                    obj = s96Var.y(i, w8iVar);
                } else if (i2 == 1) {
                    z = w8iVar.t;
                    i = w8iVar.r;
                    y6a.M(obj);
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        stage3 = w8iVar.u;
                        y6a.M(obj);
                        list = (List) obj;
                        if (list.isEmpty()) {
                            Stage stageEvent = stage3.getStageEvent();
                            return a.c(new s8i(stage3, stageEvent != null ? new Integer(stageEvent.getId()) : null, stage3.getUniqueStageId()));
                        }
                        ArrayList arrayList = new ArrayList(k13.r(list, 10));
                        for (Stage stage4 : list) {
                            stage4.setStageEvent(stage3);
                            arrayList.add(new s8i(stage4, new Integer(stage3.getId()), stage3.getUniqueStageId()));
                        }
                        return arrayList;
                    }
                    i4 = w8iVar.s;
                    z = w8iVar.t;
                    i3 = w8iVar.r;
                    y6a.M(obj);
                    stage2 = (Stage) obj;
                    if (stage2 != null) {
                        return km5.a;
                    }
                    joa joaVar = l5i.a;
                    l5i.l(stage2);
                    if (z) {
                        int id = stage2.getId();
                        w8iVar.u = stage2;
                        w8iVar.r = i3;
                        w8iVar.t = z;
                        w8iVar.s = i4;
                        w8iVar.x = 3;
                        Serializable g = g(id, w8iVar);
                        if (g != serializable) {
                            obj = g;
                            stage3 = stage2;
                            list = (List) obj;
                            if (list.isEmpty()) {
                            }
                        }
                        return serializable;
                    }
                    list = km5.a;
                    stage3 = stage2;
                    if (list.isEmpty()) {
                    }
                }
                stageResponse = (StageResponse) obj;
                if (stageResponse != null || (stage = stageResponse.getStage()) == null) {
                    return km5.a;
                }
                w8iVar.r = i;
                w8iVar.t = z;
                w8iVar.s = 0;
                w8iVar.x = 2;
                obj = s96Var.a(stage, false, w8iVar);
                if (obj != serializable) {
                    i3 = i;
                    i4 = 0;
                    stage2 = (Stage) obj;
                    if (stage2 != null) {
                    }
                }
                return serializable;
            }
        }
        w8iVar = new w8i(this, sq3Var);
        Object obj2 = w8iVar.v;
        Serializable serializable2 = lu3.a;
        i2 = w8iVar.x;
        s96 s96Var2 = this.c;
        if (i2 != 0) {
        }
        stageResponse = (StageResponse) obj2;
        if (stageResponse != null) {
        }
        return km5.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d A[LOOP:0: B:15:0x0057->B:17:0x005d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(int i, sq3 sq3Var) {
        y8i y8iVar;
        int i2;
        StagesListResponse stagesListResponse;
        Iterator it;
        if (sq3Var instanceof y8i) {
            y8iVar = (y8i) sq3Var;
            int i3 = y8iVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                y8iVar.t = i3 - Integer.MIN_VALUE;
                Object obj = y8iVar.r;
                lu3 lu3Var = lu3.a;
                i2 = y8iVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    y8iVar.t = 1;
                    obj = this.c.R(i, y8iVar);
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
                stagesListResponse = (StagesListResponse) obj;
                if (stagesListResponse != null || (r4 = stagesListResponse.getStages()) == null) {
                    List<Stage> list = km5.a;
                }
                ArrayList arrayList = new ArrayList(k13.r(list, 10));
                for (Stage stage : list) {
                    joa joaVar = l5i.a;
                    l5i.l(stage);
                    arrayList.add(stage);
                }
                ArrayList arrayList2 = new ArrayList();
                it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (CollectionsKt.R(l5i.a(), ((Stage) next).getType())) {
                        arrayList2.add(next);
                    }
                }
                return arrayList2;
            }
        }
        y8iVar = new y8i(this, sq3Var);
        Object obj2 = y8iVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = y8iVar.t;
        if (i2 != 0) {
        }
        stagesListResponse = (StagesListResponse) obj2;
        if (stagesListResponse != null) {
        }
        List<Stage> list2 = km5.a;
        ArrayList arrayList3 = new ArrayList(k13.r(list2, 10));
        while (r4.hasNext()) {
        }
        ArrayList arrayList22 = new ArrayList();
        it = arrayList3.iterator();
        while (it.hasNext()) {
        }
        return arrayList22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r12.e.h(r0, false, r7) == r8) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(int[] iArr, boolean z, sq3 sq3Var) {
        z8i z8iVar;
        int i;
        boolean z2;
        asf asfVar;
        if (sq3Var instanceof z8i) {
            z8iVar = (z8i) sq3Var;
            int i2 = z8iVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z8iVar.v = i2 - Integer.MIN_VALUE;
                z8i z8iVar2 = z8iVar;
                Object obj = z8iVar2.t;
                lu3 lu3Var = lu3.a;
                i = z8iVar2.v;
                if (i != 0) {
                    y6a.M(obj);
                    if (iArr == 0) {
                        return Unit.a;
                    }
                    asf asfVar2 = new asf();
                    kv7 kv7Var = new kv7((Serializable) iArr, z, (Object) this, (Serializable) asfVar2, (rq3) null, 7);
                    z8iVar2.r = asfVar2;
                    z8iVar2.s = z;
                    z8iVar2.v = 1;
                    if (s9a.r(kv7Var, z8iVar2) != lu3Var) {
                        z2 = z;
                        asfVar = asfVar2;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = z8iVar2.s;
                asfVar = z8iVar2.r;
                y6a.M(obj);
                if (asfVar.a) {
                    return Unit.a;
                }
                e();
                Context applicationContext = getApplicationContext();
                applicationContext.getClass();
                z8iVar2.r = null;
                z8iVar2.s = z2;
                z8iVar2.v = 2;
            }
        }
        z8iVar = new z8i(this, sq3Var);
        z8i z8iVar22 = z8iVar;
        Object obj2 = z8iVar22.t;
        lu3 lu3Var2 = lu3.a;
        i = z8iVar22.v;
        if (i != 0) {
        }
        if (asfVar.a) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (r4.j(r10, false, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r4.h(r10, false, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (r8.d.d(r9, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(int i, sq3 sq3Var) {
        b9i b9iVar;
        int i2;
        if (sq3Var instanceof b9i) {
            b9iVar = (b9i) sq3Var;
            int i3 = b9iVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b9iVar.u = i3 - Integer.MIN_VALUE;
                Object obj = b9iVar.s;
                lu3 lu3Var = lu3.a;
                i2 = b9iVar.u;
                jid jidVar = this.e;
                if (i2 != 0) {
                    y6a.M(obj);
                    b9iVar.r = i;
                    b9iVar.u = 1;
                } else if (i2 == 1) {
                    i = b9iVar.r;
                    y6a.M(obj);
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        e();
                        return Unit.a;
                    }
                    i = b9iVar.r;
                    y6a.M(obj);
                    Context applicationContext = getApplicationContext();
                    applicationContext.getClass();
                    b9iVar.r = i;
                    b9iVar.u = 3;
                }
                Context applicationContext2 = getApplicationContext();
                applicationContext2.getClass();
                b9iVar.r = i;
                b9iVar.u = 2;
            }
        }
        b9iVar = new b9i(this, sq3Var);
        Object obj2 = b9iVar.s;
        lu3 lu3Var2 = lu3.a;
        i2 = b9iVar.u;
        jid jidVar2 = this.e;
        if (i2 != 0) {
        }
        Context applicationContext22 = getApplicationContext();
        applicationContext22.getClass();
        b9iVar.r = i;
        b9iVar.u = 2;
    }
}
