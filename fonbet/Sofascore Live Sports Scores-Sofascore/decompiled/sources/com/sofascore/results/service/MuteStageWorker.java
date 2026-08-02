package com.sofascore.results.service;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.newNetwork.StageResponse;
import com.sofascore.model.newNetwork.StagesListResponse;
import defpackage.a2d;
import defpackage.a52;
import defpackage.a70;
import defpackage.aba;
import defpackage.ad2;
import defpackage.b2d;
import defpackage.c2d;
import defpackage.d2d;
import defpackage.e2d;
import defpackage.f2d;
import defpackage.g2d;
import defpackage.gz8;
import defpackage.i76;
import defpackage.jdb;
import defpackage.jid;
import defpackage.joa;
import defpackage.k13;
import defpackage.km5;
import defpackage.l5i;
import defpackage.lu3;
import defpackage.ph0;
import defpackage.qa6;
import defpackage.qv5;
import defpackage.rq3;
import defpackage.s96;
import defpackage.sq3;
import defpackage.udl;
import defpackage.v76;
import defpackage.w1l;
import defpackage.x42;
import defpackage.y6a;
import defpackage.z1d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B=\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/sofascore/results/service/MuteStageWorker;", "Lcom/sofascore/results/service/AbstractRetryCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lqa6;", "eventStageRepository", "Ls96;", "eventNetworkRepository", "Ljid;", "notificationsSyncUseCase", "Ludl;", "cache", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lqa6;Ls96;Ljid;Ludl;)V", "u0a", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MuteStageWorker extends AbstractRetryCoroutineWorker {
    public final qa6 b;
    public final s96 c;
    public final jid d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MuteStageWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull qa6 qa6Var, @NotNull s96 s96Var, @NotNull jid jidVar, @NotNull udl udlVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        qa6Var.getClass();
        s96Var.getClass();
        jidVar.getClass();
        udlVar.getClass();
        this.b = qa6Var;
        this.c = s96Var;
        this.d = jidVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (h(r11, r0) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f8, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cb, code lost:
    
        if (j(r11, r2, r3, r0) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f6, code lost:
    
        if (f(r11, r0) == r1) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.sofascore.results.service.AbstractRetryCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        z1d z1dVar;
        int i;
        Integer num;
        if (rq3Var instanceof z1d) {
            z1dVar = (z1d) rq3Var;
            int i2 = z1dVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z1dVar.t = i2 - Integer.MIN_VALUE;
                Object obj = z1dVar.r;
                Object obj2 = lu3.a;
                i = z1dVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    String e = getInputData().e("ACTION");
                    if (e != null) {
                        int hashCode = e.hashCode();
                        if (hashCode != -1282031304) {
                            if (hashCode != 106962283) {
                                if (hashCode == 2115347102 && e.equals("UN_MUTE_STAGE")) {
                                    Integer num2 = new Integer(getInputData().a("STAGE_ID", 0));
                                    num = num2.intValue() != 0 ? num2 : null;
                                    if (num != null) {
                                        int intValue = num.intValue();
                                        z1dVar.t = 2;
                                    }
                                }
                            } else if (e.equals("UPDATE_STAGES")) {
                                int a = getInputData().a("STAGE_ID", 0);
                                int[] b = getInputData().b("STAGE_IDS_TO_MUTE");
                                if (b == null || (r2 = ph0.V(b)) == null) {
                                    List list = km5.a;
                                }
                                int[] b2 = getInputData().b("STAGE_IDS_TO_UN_MUTE");
                                if (b2 == null || (r3 = ph0.V(b2)) == null) {
                                    List list2 = km5.a;
                                }
                                z1dVar.t = 3;
                            }
                        } else if (e.equals("MUTE_STAGE")) {
                            Integer num3 = new Integer(getInputData().a("STAGE_ID", 0));
                            num = num3.intValue() != 0 ? num3 : null;
                            if (num != null) {
                                int intValue2 = num.intValue();
                                z1dVar.t = 1;
                            }
                        }
                    }
                } else {
                    if (i != 1 && i != 2 && i != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return jdb.a();
            }
        }
        z1dVar = new z1d(this, (sq3) rq3Var);
        Object obj3 = z1dVar.r;
        Object obj22 = lu3.a;
        i = z1dVar.t;
        if (i != 0) {
        }
        return jdb.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(int i, sq3 sq3Var) {
        a2d a2dVar;
        int i2;
        StageResponse stageResponse;
        if (sq3Var instanceof a2d) {
            a2dVar = (a2d) sq3Var;
            int i3 = a2dVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                a2dVar.u = i3 - Integer.MIN_VALUE;
                Object obj = a2dVar.s;
                lu3 lu3Var = lu3.a;
                i2 = a2dVar.u;
                s96 s96Var = this.c;
                if (i2 != 0) {
                    y6a.M(obj);
                    a2dVar.r = i;
                    a2dVar.u = 1;
                    obj = s96Var.y(i, a2dVar);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        Stage stage = (Stage) obj;
                        if (stage != null) {
                            joa joaVar = l5i.a;
                            l5i.l(stage);
                            return stage;
                        }
                        return null;
                    }
                    i = a2dVar.r;
                    y6a.M(obj);
                }
                stageResponse = (StageResponse) obj;
                if (stageResponse != null) {
                    Stage stage2 = stageResponse.getStage();
                    a2dVar.r = i;
                    a2dVar.u = 2;
                    obj = s96Var.a(stage2, false, a2dVar);
                }
                return null;
            }
        }
        a2dVar = new a2d(this, sq3Var);
        Object obj2 = a2dVar.s;
        lu3 lu3Var2 = lu3.a;
        i2 = a2dVar.u;
        s96 s96Var2 = this.c;
        if (i2 != 0) {
        }
        stageResponse = (StageResponse) obj2;
        if (stageResponse != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d A[LOOP:0: B:15:0x0057->B:17:0x005d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(int i, sq3 sq3Var) {
        b2d b2dVar;
        int i2;
        StagesListResponse stagesListResponse;
        Iterator it;
        if (sq3Var instanceof b2d) {
            b2dVar = (b2d) sq3Var;
            int i3 = b2dVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b2dVar.t = i3 - Integer.MIN_VALUE;
                Object obj = b2dVar.r;
                lu3 lu3Var = lu3.a;
                i2 = b2dVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    b2dVar.t = 1;
                    obj = this.c.R(i, b2dVar);
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
        b2dVar = new b2d(this, sq3Var);
        Object obj2 = b2dVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = b2dVar.t;
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

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ce, code lost:
    
        if (r12.b.q(r8, r0) != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0058, code lost:
    
        if (r15 == r1) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af A[LOOP:1: B:30:0x00a9->B:32:0x00af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.sofascore.results.service.MuteStageWorker] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(int i, ArrayList arrayList, sq3 sq3Var) {
        c2d c2dVar;
        int i2;
        ArrayList arrayList2;
        Stage stage;
        List list;
        int i3;
        int i4;
        Stage stage2;
        Iterator it;
        if (sq3Var instanceof c2d) {
            c2dVar = (c2d) sq3Var;
            int i5 = c2dVar.y;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2dVar.y = i5 - Integer.MIN_VALUE;
                Object obj = c2dVar.w;
                Object obj2 = lu3.a;
                i2 = c2dVar.y;
                if (i2 != 0) {
                    y6a.M(obj);
                    c2dVar.t = arrayList;
                    c2dVar.r = i;
                    c2dVar.y = 1;
                    obj = c(i, c2dVar);
                    arrayList2 = arrayList;
                } else if (i2 == 1) {
                    i = c2dVar.r;
                    ?? r14 = c2dVar.t;
                    y6a.M(obj);
                    arrayList2 = r14;
                } else {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = c2dVar.s;
                    i3 = c2dVar.r;
                    stage = c2dVar.v;
                    stage2 = c2dVar.u;
                    list = c2dVar.t;
                    y6a.M(obj);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : (Iterable) obj) {
                        if (list.contains(new Integer(((Stage) obj3).getId()))) {
                            arrayList3.add(obj3);
                        }
                    }
                    it = arrayList3.iterator();
                    while (it.hasNext()) {
                        Stage stage3 = (Stage) it.next();
                        stage3.setStageEvent(stage);
                        stage3.setMuted(true);
                    }
                    c2dVar.t = null;
                    c2dVar.u = stage2;
                    c2dVar.v = null;
                    c2dVar.r = i3;
                    c2dVar.s = i4;
                    c2dVar.y = 3;
                }
                stage = (Stage) obj;
                if (stage != null) {
                    c2dVar.t = arrayList2;
                    c2dVar.u = stage;
                    c2dVar.v = stage;
                    c2dVar.r = i;
                    c2dVar.s = 0;
                    c2dVar.y = 2;
                    Object d = d(i, c2dVar);
                    if (d != obj2) {
                        list = arrayList2;
                        i3 = i;
                        i4 = 0;
                        obj = d;
                        stage2 = stage;
                        ArrayList arrayList32 = new ArrayList();
                        while (r15.hasNext()) {
                        }
                        it = arrayList32.iterator();
                        while (it.hasNext()) {
                        }
                        c2dVar.t = null;
                        c2dVar.u = stage2;
                        c2dVar.v = null;
                        c2dVar.r = i3;
                        c2dVar.s = i4;
                        c2dVar.y = 3;
                    }
                    return obj2;
                }
                return Unit.a;
            }
        }
        c2dVar = new c2d(this, sq3Var);
        Object obj4 = c2dVar.w;
        Object obj22 = lu3.a;
        i2 = c2dVar.y;
        if (i2 != 0) {
        }
        stage = (Stage) obj4;
        if (stage != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0151, code lost:
    
        if (r12.d.e(r14, false, r0) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0083, code lost:
    
        if (r14 == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2 A[LOOP:0: B:34:0x00ac->B:36:0x00b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i, sq3 sq3Var) {
        d2d d2dVar;
        int i2;
        Stage stage;
        Stage stage2;
        int i3;
        int i4;
        ArrayList x0;
        Stage stage3;
        Stage stage4;
        Stage stageEvent;
        Integer num;
        Object a;
        Stage stage5;
        int i5;
        int i6;
        int i7;
        Stage stage6;
        if (sq3Var instanceof d2d) {
            d2dVar = (d2d) sq3Var;
            int i8 = d2dVar.A;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                d2dVar.A = i8 - Integer.MIN_VALUE;
                Object obj = d2dVar.y;
                Serializable serializable = lu3.a;
                i2 = d2dVar.A;
                qa6 qa6Var = this.b;
                switch (i2) {
                    case 0:
                        y6a.M(obj);
                        d2dVar.r = i;
                        d2dVar.A = 1;
                        obj = c(i, d2dVar);
                        break;
                    case 1:
                        i = d2dVar.r;
                        y6a.M(obj);
                        Stage stage7 = (Stage) obj;
                        if (stage7 != null) {
                            stage7.setMuted(true);
                            d2dVar.v = stage7;
                            d2dVar.w = stage7;
                            d2dVar.r = i;
                            d2dVar.s = 0;
                            d2dVar.A = 2;
                            Serializable d = d(i, d2dVar);
                            if (d != serializable) {
                                stage = stage7;
                                stage2 = stage;
                                obj = d;
                                i3 = i;
                                i4 = 0;
                                Iterable<Stage> iterable = (Iterable) obj;
                                for (Stage stage8 : iterable) {
                                    stage8.setStageEvent(stage);
                                    stage8.setMuted(true);
                                }
                                g();
                                x0 = CollectionsKt.x0((List) iterable, stage);
                                d2dVar.v = stage2;
                                d2dVar.w = stage;
                                d2dVar.x = null;
                                d2dVar.r = i3;
                                d2dVar.s = i4;
                                d2dVar.A = 3;
                                if (qa6Var.q(x0, d2dVar) != serializable) {
                                    stage3 = stage;
                                    stage4 = stage2;
                                    stageEvent = stage3.getStageEvent();
                                    if (stageEvent != null) {
                                        num = new Integer(stageEvent.getId());
                                        int intValue = num.intValue();
                                        d2dVar.v = stage4;
                                        d2dVar.w = null;
                                        d2dVar.x = num;
                                        d2dVar.r = i3;
                                        d2dVar.s = i4;
                                        d2dVar.t = intValue;
                                        d2dVar.u = 0;
                                        d2dVar.A = 4;
                                        a = qa6Var.a(intValue, d2dVar);
                                        if (a != serializable) {
                                            stage5 = stage4;
                                            i5 = i3;
                                            i6 = intValue;
                                            i7 = 0;
                                            if (((Boolean) a).booleanValue()) {
                                                i3 = i5;
                                                stage4 = stage5;
                                            } else {
                                                g();
                                                d2dVar.v = stage5;
                                                d2dVar.w = null;
                                                d2dVar.x = num;
                                                d2dVar.r = i5;
                                                d2dVar.s = i4;
                                                d2dVar.t = i6;
                                                d2dVar.u = i7;
                                                d2dVar.A = 5;
                                                if (qa6Var.v(i6, d2dVar) != serializable) {
                                                    i3 = i5;
                                                    stage6 = stage5;
                                                    stage4 = stage6;
                                                }
                                            }
                                        }
                                    }
                                    Context applicationContext = getApplicationContext();
                                    applicationContext.getClass();
                                    d2dVar.v = stage4;
                                    d2dVar.w = null;
                                    d2dVar.x = null;
                                    d2dVar.r = i3;
                                    d2dVar.s = i4;
                                    d2dVar.A = 6;
                                    break;
                                }
                            }
                            return serializable;
                        }
                        return Unit.a;
                    case 2:
                        i4 = d2dVar.s;
                        i3 = d2dVar.r;
                        stage = d2dVar.w;
                        stage2 = d2dVar.v;
                        y6a.M(obj);
                        Iterable<Stage> iterable2 = (Iterable) obj;
                        while (r9.hasNext()) {
                        }
                        g();
                        x0 = CollectionsKt.x0((List) iterable2, stage);
                        d2dVar.v = stage2;
                        d2dVar.w = stage;
                        d2dVar.x = null;
                        d2dVar.r = i3;
                        d2dVar.s = i4;
                        d2dVar.A = 3;
                        if (qa6Var.q(x0, d2dVar) != serializable) {
                        }
                        return serializable;
                    case 3:
                        i4 = d2dVar.s;
                        i3 = d2dVar.r;
                        stage3 = d2dVar.w;
                        stage4 = d2dVar.v;
                        y6a.M(obj);
                        stageEvent = stage3.getStageEvent();
                        if (stageEvent != null) {
                        }
                        Context applicationContext2 = getApplicationContext();
                        applicationContext2.getClass();
                        d2dVar.v = stage4;
                        d2dVar.w = null;
                        d2dVar.x = null;
                        d2dVar.r = i3;
                        d2dVar.s = i4;
                        d2dVar.A = 6;
                        break;
                    case 4:
                        int i9 = d2dVar.u;
                        i6 = d2dVar.t;
                        int i10 = d2dVar.s;
                        i5 = d2dVar.r;
                        num = d2dVar.x;
                        stage5 = d2dVar.v;
                        y6a.M(obj);
                        i7 = i9;
                        i4 = i10;
                        a = obj;
                        if (((Boolean) a).booleanValue()) {
                        }
                        break;
                    case 5:
                        i4 = d2dVar.s;
                        i3 = d2dVar.r;
                        stage6 = d2dVar.v;
                        y6a.M(obj);
                        stage4 = stage6;
                        Context applicationContext22 = getApplicationContext();
                        applicationContext22.getClass();
                        d2dVar.v = stage4;
                        d2dVar.w = null;
                        d2dVar.x = null;
                        d2dVar.r = i3;
                        d2dVar.s = i4;
                        d2dVar.A = 6;
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
        d2dVar = new d2d(this, sq3Var);
        Object obj2 = d2dVar.y;
        Serializable serializable2 = lu3.a;
        i2 = d2dVar.A;
        qa6 qa6Var2 = this.b;
        switch (i2) {
        }
    }

    public final void g() {
        ad2 ad2Var = qv5.a;
        qv5.a(a52.a);
        qv5.a(x42.a);
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        aba.E(applicationContext);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00fb, code lost:
    
        if (i(r6, r3) != r4) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f A[LOOP:0: B:28:0x0099->B:30:0x009f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.sofascore.results.service.MuteStageWorker] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(int i, sq3 sq3Var) {
        e2d e2dVar;
        Object obj;
        lu3 lu3Var;
        int i2;
        ArrayList l;
        Object obj2;
        int i3;
        ArrayList arrayList;
        List list;
        Iterator it;
        List list2;
        List list3;
        Stage stage;
        Stage stageEvent;
        int i4 = i;
        if (sq3Var instanceof e2d) {
            e2dVar = (e2d) sq3Var;
            int i5 = e2dVar.y;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                e2dVar.y = i5 - Integer.MIN_VALUE;
                obj = e2dVar.w;
                lu3Var = lu3.a;
                i2 = e2dVar.y;
                int i6 = 1;
                if (i2 != 0) {
                    y6a.M(obj);
                    l = b.l(new Integer(i4));
                    e2dVar.t = l;
                    e2dVar.u = l;
                    e2dVar.v = l;
                    e2dVar.r = i4;
                    e2dVar.s = 0;
                    e2dVar.y = 1;
                    Serializable d = d(i4, e2dVar);
                    if (d != lu3Var) {
                        obj2 = d;
                        i3 = 0;
                        arrayList = l;
                        list = arrayList;
                    }
                    return lu3Var;
                }
                if (i2 == 1) {
                    int i7 = e2dVar.s;
                    int i8 = e2dVar.r;
                    ArrayList arrayList2 = e2dVar.v;
                    ?? r12 = e2dVar.u;
                    list = e2dVar.t;
                    y6a.M(obj);
                    i3 = i7;
                    i4 = i8;
                    obj2 = obj;
                    arrayList = arrayList2;
                    l = r12;
                } else {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = e2dVar.r;
                    list2 = e2dVar.u;
                    list3 = e2dVar.t;
                    y6a.M(obj);
                    stage = (Stage) obj;
                    if (stage != null && (stageEvent = stage.getStageEvent()) != null) {
                        list2.add(new Integer(new Integer(stageEvent.getId()).intValue()));
                    }
                    e2dVar.t = null;
                    e2dVar.u = null;
                    e2dVar.r = i4;
                    e2dVar.y = 3;
                }
                Iterable iterable = (Iterable) obj2;
                ArrayList arrayList3 = new ArrayList(k13.r(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    w1l.A(arrayList3, ((Stage) it.next()).getId());
                }
                arrayList.addAll(arrayList3);
                e2dVar.t = list;
                e2dVar.u = l;
                e2dVar.v = null;
                e2dVar.r = i4;
                e2dVar.s = i3;
                e2dVar.y = 2;
                v76 v76Var = this.b.a;
                obj = gz8.U(e2dVar, v76Var.a, true, false, new i76(i4, v76Var, i6));
                if (obj != lu3Var) {
                    list2 = l;
                    list3 = list;
                    stage = (Stage) obj;
                    if (stage != null) {
                        list2.add(new Integer(new Integer(stageEvent.getId()).intValue()));
                    }
                    e2dVar.t = null;
                    e2dVar.u = null;
                    e2dVar.r = i4;
                    e2dVar.y = 3;
                }
                return lu3Var;
            }
        }
        e2dVar = new e2d(this, sq3Var);
        obj = e2dVar.w;
        lu3Var = lu3.a;
        i2 = e2dVar.y;
        int i62 = 1;
        if (i2 != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList32 = new ArrayList(k13.r(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        arrayList.addAll(arrayList32);
        e2dVar.t = list;
        e2dVar.u = l;
        e2dVar.v = null;
        e2dVar.r = i4;
        e2dVar.s = i3;
        e2dVar.y = 2;
        v76 v76Var2 = this.b.a;
        obj = gz8.U(e2dVar, v76Var2.a, true, false, new i76(i4, v76Var2, i62));
        if (obj != lu3Var) {
        }
        return lu3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (r5.d.e(r6, false, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r5.b.A(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(List list, sq3 sq3Var) {
        f2d f2dVar;
        int i;
        if (sq3Var instanceof f2d) {
            f2dVar = (f2d) sq3Var;
            int i2 = f2dVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f2dVar.t = i2 - Integer.MIN_VALUE;
                Object obj = f2dVar.r;
                lu3 lu3Var = lu3.a;
                i = f2dVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    g();
                    f2dVar.t = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Context applicationContext = getApplicationContext();
                applicationContext.getClass();
                f2dVar.t = 2;
            }
        }
        f2dVar = new f2d(this, sq3Var);
        Object obj2 = f2dVar.r;
        lu3 lu3Var2 = lu3.a;
        i = f2dVar.t;
        if (i != 0) {
        }
        Context applicationContext2 = getApplicationContext();
        applicationContext2.getClass();
        f2dVar.t = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0152, code lost:
    
        if (r10.d.e(r14, false, r0) != r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0132, code lost:
    
        if (r3.A(r6, r0) == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0078, code lost:
    
        if (i(r12, r0) == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0092, code lost:
    
        if (f(r11, r0) == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a6, code lost:
    
        if (r14 == r1) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(int i, List list, List list2, sq3 sq3Var) {
        g2d g2dVar;
        int i2;
        Object obj;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList2;
        if (sq3Var instanceof g2d) {
            g2dVar = (g2d) sq3Var;
            int i6 = g2dVar.z;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                g2dVar.z = i6 - Integer.MIN_VALUE;
                Object obj2 = g2dVar.x;
                Object obj3 = lu3.a;
                i2 = g2dVar.z;
                qa6 qa6Var = this.b;
                switch (i2) {
                    case 0:
                        y6a.M(obj2);
                        if (!list.isEmpty()) {
                            if (!list2.isEmpty()) {
                                g2dVar.u = list;
                                g2dVar.v = list2;
                                g2dVar.r = i;
                                g2dVar.z = 3;
                                Object i7 = qa6Var.i(g2dVar);
                                obj = i7;
                                break;
                            } else {
                                g2dVar.u = null;
                                g2dVar.v = null;
                                g2dVar.r = i;
                                g2dVar.z = 2;
                                break;
                            }
                        } else {
                            List x0 = CollectionsKt.x0(list2, new Integer(i));
                            g2dVar.u = null;
                            g2dVar.v = null;
                            g2dVar.r = i;
                            g2dVar.z = 1;
                            break;
                        }
                        return obj3;
                    case 1:
                        y6a.M(obj2);
                        return Unit.a;
                    case 2:
                        y6a.M(obj2);
                        return Unit.a;
                    case 3:
                        i = g2dVar.r;
                        list2 = g2dVar.v;
                        list = g2dVar.u;
                        y6a.M(obj2);
                        obj = obj2;
                        HashSet hashSet = (HashSet) obj;
                        ArrayList U0 = CollectionsKt.U0(list);
                        U0.removeAll(hashSet);
                        boolean isEmpty = U0.isEmpty();
                        int i8 = !isEmpty ? 1 : 0;
                        ArrayList x02 = CollectionsKt.x0(list2, new Integer(i));
                        arrayList = new ArrayList();
                        Iterator it = x02.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (hashSet.contains(new Integer(((Number) next).intValue()))) {
                                arrayList.add(next);
                            }
                        }
                        boolean isEmpty2 = arrayList.isEmpty();
                        int i9 = !isEmpty2 ? 1 : 0;
                        if (isEmpty && isEmpty2) {
                            return Unit.a;
                        }
                        g();
                        if (!isEmpty) {
                            g2dVar.u = null;
                            g2dVar.v = null;
                            g2dVar.w = arrayList;
                            g2dVar.r = i;
                            g2dVar.s = i8;
                            g2dVar.t = i9;
                            g2dVar.z = 4;
                            if (e(i, U0, g2dVar) != obj3) {
                                i3 = i;
                                i4 = i9;
                                i5 = i8;
                                arrayList2 = arrayList;
                                arrayList = arrayList2;
                                if (i4 != 0) {
                                    g2dVar.u = null;
                                    g2dVar.v = null;
                                    g2dVar.w = null;
                                    g2dVar.r = i3;
                                    g2dVar.s = i5;
                                    g2dVar.t = i4;
                                    g2dVar.z = 5;
                                    break;
                                }
                                Context applicationContext = getApplicationContext();
                                applicationContext.getClass();
                                g2dVar.u = null;
                                g2dVar.v = null;
                                g2dVar.w = null;
                                g2dVar.r = i3;
                                g2dVar.s = i5;
                                g2dVar.t = i4;
                                g2dVar.z = 6;
                                break;
                            }
                            return obj3;
                        }
                        i3 = i;
                        i4 = i9;
                        i5 = i8;
                        if (i4 != 0) {
                        }
                        Context applicationContext2 = getApplicationContext();
                        applicationContext2.getClass();
                        g2dVar.u = null;
                        g2dVar.v = null;
                        g2dVar.w = null;
                        g2dVar.r = i3;
                        g2dVar.s = i5;
                        g2dVar.t = i4;
                        g2dVar.z = 6;
                    case 4:
                        i4 = g2dVar.t;
                        i5 = g2dVar.s;
                        i3 = g2dVar.r;
                        arrayList2 = g2dVar.w;
                        y6a.M(obj2);
                        arrayList = arrayList2;
                        if (i4 != 0) {
                        }
                        Context applicationContext22 = getApplicationContext();
                        applicationContext22.getClass();
                        g2dVar.u = null;
                        g2dVar.v = null;
                        g2dVar.w = null;
                        g2dVar.r = i3;
                        g2dVar.s = i5;
                        g2dVar.t = i4;
                        g2dVar.z = 6;
                        break;
                    case 5:
                        i4 = g2dVar.t;
                        i5 = g2dVar.s;
                        i3 = g2dVar.r;
                        y6a.M(obj2);
                        Context applicationContext222 = getApplicationContext();
                        applicationContext222.getClass();
                        g2dVar.u = null;
                        g2dVar.v = null;
                        g2dVar.w = null;
                        g2dVar.r = i3;
                        g2dVar.s = i5;
                        g2dVar.t = i4;
                        g2dVar.z = 6;
                        break;
                    case 6:
                        y6a.M(obj2);
                        return Unit.a;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        g2dVar = new g2d(this, sq3Var);
        Object obj22 = g2dVar.x;
        Object obj32 = lu3.a;
        i2 = g2dVar.z;
        qa6 qa6Var2 = this.b;
        switch (i2) {
        }
    }
}
