package com.sofascore.results.service;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.AddedEventsResponse;
import com.sofascore.model.network.response.EventBasicInfo;
import com.sofascore.model.network.response.EventResponse;
import defpackage.a52;
import defpackage.a70;
import defpackage.ad2;
import defpackage.asf;
import defpackage.hdb;
import defpackage.j0j;
import defpackage.jdb;
import defpackage.lu3;
import defpackage.qa6;
import defpackage.qv5;
import defpackage.r3;
import defpackage.rq3;
import defpackage.s96;
import defpackage.sq3;
import defpackage.v2g;
import defpackage.w3b;
import defpackage.x2g;
import defpackage.y6a;
import defpackage.yaa;
import defpackage.ybd;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B=\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/sofascore/results/service/NewlyAddedEventsWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Ls96;", "eventStageNetworkRepository", "Lqa6;", "eventStageDbRepository", "Lj0j;", "teamRepository", "Lw3b;", "leagueRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ls96;Lqa6;Lj0j;Lw3b;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NewlyAddedEventsWorker extends CoroutineWorker {
    public final s96 a;
    public final qa6 b;
    public final j0j c;
    public final w3b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewlyAddedEventsWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull s96 s96Var, @NotNull qa6 qa6Var, @NotNull j0j j0jVar, @NotNull w3b w3bVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        s96Var.getClass();
        qa6Var.getClass();
        j0jVar.getClass();
        w3bVar.getClass();
        this.a = s96Var;
        this.b = qa6Var;
        this.c = j0jVar;
        this.d = w3bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0120, code lost:
    
        if (r13 == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0173, code lost:
    
        if (r3.o(r13, r0) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0089, code lost:
    
        if (r13 == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0129 -> B:13:0x00d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0155 -> B:13:0x00d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0173 -> B:12:0x0176). Please report as a decompilation issue!!! */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(rq3 rq3Var) {
        ybd ybdVar;
        int i;
        List<EventBasicInfo> list;
        Serializable h;
        HashSet hashSet;
        asf asfVar;
        Iterator<EventBasicInfo> it;
        HashSet hashSet2;
        HashSet hashSet3;
        EventBasicInfo eventBasicInfo;
        boolean z;
        EventResponse eventResponse;
        if (rq3Var instanceof ybd) {
            ybdVar = (ybd) rq3Var;
            int i2 = ybdVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybdVar.A = i2 - Integer.MIN_VALUE;
                Object obj = ybdVar.y;
                lu3 lu3Var = lu3.a;
                i = ybdVar.A;
                qa6 qa6Var = this.b;
                s96 s96Var = this.a;
                rq3 rq3Var2 = null;
                switch (i) {
                    case 0:
                        y6a.M(obj);
                        ybdVar.A = 1;
                        s96Var.getClass();
                        obj = yaa.P(new r3(s96Var, rq3Var2, 9), ybdVar);
                        break;
                    case 1:
                        y6a.M(obj);
                        x2g x2gVar = (x2g) obj;
                        if (!(x2gVar instanceof v2g)) {
                            return new hdb();
                        }
                        List<EventBasicInfo> events = ((AddedEventsResponse) ((v2g) x2gVar).a).getEvents();
                        ybdVar.r = events;
                        ybdVar.A = 2;
                        Serializable g = this.c.g(ybdVar);
                        if (g != lu3Var) {
                            list = events;
                            obj = g;
                            HashSet hashSet4 = (HashSet) obj;
                            ybdVar.r = list;
                            ybdVar.s = hashSet4;
                            ybdVar.A = 3;
                            h = this.d.h(ybdVar);
                            if (h != lu3Var) {
                                obj = h;
                                hashSet = hashSet4;
                                asfVar = new asf();
                                it = list.iterator();
                                hashSet2 = hashSet;
                                hashSet3 = (HashSet) obj;
                                while (it.hasNext()) {
                                    eventBasicInfo = it.next();
                                    if (hashSet2.contains(new Integer(eventBasicInfo.getHomeTeamId())) || hashSet2.contains(new Integer(eventBasicInfo.getAwayTeamId())) || CollectionsKt.R(hashSet3, eventBasicInfo.getUniqueTournamentId())) {
                                        int eventId = eventBasicInfo.getEventId();
                                        ybdVar.r = null;
                                        ybdVar.s = hashSet2;
                                        ybdVar.t = hashSet3;
                                        ybdVar.u = asfVar;
                                        ybdVar.v = it;
                                        ybdVar.w = eventBasicInfo;
                                        ybdVar.A = 4;
                                        obj = qa6Var.m(eventId, ybdVar);
                                    }
                                }
                                if (asfVar.a) {
                                    ad2 ad2Var = qv5.a;
                                    qv5.a(a52.a);
                                }
                                return jdb.a();
                            }
                        }
                        return lu3Var;
                    case 2:
                        list = ybdVar.r;
                        y6a.M(obj);
                        HashSet hashSet42 = (HashSet) obj;
                        ybdVar.r = list;
                        ybdVar.s = hashSet42;
                        ybdVar.A = 3;
                        h = this.d.h(ybdVar);
                        if (h != lu3Var) {
                        }
                        return lu3Var;
                    case 3:
                        hashSet = ybdVar.s;
                        list = ybdVar.r;
                        y6a.M(obj);
                        asfVar = new asf();
                        it = list.iterator();
                        hashSet2 = hashSet;
                        hashSet3 = (HashSet) obj;
                        while (it.hasNext()) {
                        }
                        if (asfVar.a) {
                        }
                        return jdb.a();
                    case 4:
                        eventBasicInfo = ybdVar.w;
                        it = ybdVar.v;
                        asfVar = ybdVar.u;
                        hashSet3 = ybdVar.t;
                        hashSet2 = ybdVar.s;
                        y6a.M(obj);
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (!booleanValue) {
                            int eventId2 = eventBasicInfo.getEventId();
                            ybdVar.r = null;
                            ybdVar.s = hashSet2;
                            ybdVar.t = hashSet3;
                            ybdVar.u = asfVar;
                            ybdVar.v = it;
                            ybdVar.w = null;
                            ybdVar.x = booleanValue;
                            ybdVar.A = 5;
                            Object d = s96Var.d(eventId2, ybdVar);
                            if (d != lu3Var) {
                                obj = d;
                                z = booleanValue;
                                eventResponse = (EventResponse) yaa.x((x2g) obj);
                                if (eventResponse != null) {
                                    Event event = eventResponse.getEvent();
                                    ybdVar.r = null;
                                    ybdVar.s = hashSet2;
                                    ybdVar.t = hashSet3;
                                    ybdVar.u = asfVar;
                                    ybdVar.v = it;
                                    ybdVar.w = null;
                                    ybdVar.x = z;
                                    ybdVar.A = 6;
                                    break;
                                }
                            }
                            return lu3Var;
                        }
                        while (it.hasNext()) {
                        }
                        if (asfVar.a) {
                        }
                        return jdb.a();
                    case 5:
                        z = ybdVar.x;
                        it = ybdVar.v;
                        asfVar = ybdVar.u;
                        hashSet3 = ybdVar.t;
                        hashSet2 = ybdVar.s;
                        y6a.M(obj);
                        eventResponse = (EventResponse) yaa.x((x2g) obj);
                        if (eventResponse != null) {
                        }
                        while (it.hasNext()) {
                        }
                        if (asfVar.a) {
                        }
                        return jdb.a();
                    case 6:
                        Iterator<EventBasicInfo> it2 = ybdVar.v;
                        asf asfVar2 = ybdVar.u;
                        HashSet hashSet5 = ybdVar.t;
                        HashSet hashSet6 = ybdVar.s;
                        y6a.M(obj);
                        hashSet2 = hashSet6;
                        hashSet3 = hashSet5;
                        asfVar = asfVar2;
                        it = it2;
                        asfVar.a = true;
                        while (it.hasNext()) {
                        }
                        if (asfVar.a) {
                        }
                        return jdb.a();
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        ybdVar = new ybd(this, (sq3) rq3Var);
        Object obj2 = ybdVar.y;
        lu3 lu3Var2 = lu3.a;
        i = ybdVar.A;
        qa6 qa6Var2 = this.b;
        s96 s96Var2 = this.a;
        rq3 rq3Var22 = null;
        switch (i) {
        }
    }
}
