package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.environment.workerthread.WorkerManager;
import com.ironsource.environment.workerthread.WorkerResult;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.bf3;
import defpackage.dmi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.q3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4264q3 {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.q3$a */
    public class a implements WorkerManager.WorkEndedListener<C4281r3> {
        final /* synthetic */ b a;

        public a(b bVar) {
            this.a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkCompleted(List<WorkerResult<C4281r3>> list, long j) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (WorkerResult<C4281r3> workerResult : list) {
                if (workerResult instanceof WorkerResult.Completed) {
                    arrayList2.add((C4281r3) ((WorkerResult.Completed) workerResult).data);
                } else if (workerResult instanceof WorkerResult.Canceled) {
                    arrayList.add(((CallableC4210n3) ((WorkerResult.Canceled) workerResult).callable).c());
                } else if (workerResult instanceof WorkerResult.Failed) {
                    WorkerResult.Failed failed = (WorkerResult.Failed) workerResult;
                    CallableC4210n3 callableC4210n3 = (CallableC4210n3) failed.callable;
                    arrayList2.add(new C4281r3(callableC4210n3.d(), callableC4210n3.c(), null, 0L, failed.exception.getMessage()));
                }
            }
            C4264q3.this.a(arrayList2, arrayList, j);
            this.a.a(arrayList2, j, arrayList);
        }

        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkFailed(String str) {
            String q = dmi.q("failed to collect bidding data, error= ", str);
            IronLog.INTERNAL.verbose(q);
            this.a.onFailure(q);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.q3$b */
    public interface b {
        void a(@NotNull List<C4281r3> list, long j, @NotNull List<String> list2);

        void onFailure(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<C4281r3> list, List<String> list2, long j) {
        IronLog.INTERNAL.verbose("tokens received=" + list.size() + ", reached timeout=" + list2.size() + ", total duration=" + j + " millis");
        for (C4281r3 c4281r3 : list) {
            if (c4281r3.a() != null) {
                IronLog.INTERNAL.verbose(c4281r3.c() + " - success (" + c4281r3.e() + " millis)");
            } else {
                IronLog.INTERNAL.verbose(c4281r3.c() + " - failed (" + c4281r3.e() + " millis) error: " + c4281r3.b());
            }
        }
        for (String str : list2) {
            IronLog.INTERNAL.verbose(str + " reached timeout");
        }
    }

    public void a(@NotNull List<CallableC4210n3> list, @NotNull b bVar, long j, @NotNull TimeUnit timeUnit) {
        try {
            if (list.isEmpty()) {
                IronLog.INTERNAL.verbose("BiddingDataCallable list is empty");
                return;
            }
            WorkerManager workerManager = new WorkerManager(IronSourceThreadManager.INSTANCE.getThreadPoolExecutor());
            Iterator<CallableC4210n3> it = list.iterator();
            while (it.hasNext()) {
                workerManager.addCallable(it.next());
            }
            IronLog.INTERNAL.verbose("instances=" + list.size() + ", timeout=" + j + " millis");
            workerManager.startWork(new a(bVar), j, timeUnit);
        } catch (Throwable th) {
            C4157k4.d().a(th);
            String o = bf3.o(new StringBuilder("Exception - failed to collect bidding data, error= "), th);
            IronLog.INTERNAL.error(o);
            bVar.onFailure(o);
        }
    }
}
