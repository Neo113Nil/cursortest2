package com.vk.push.pushsdk.receiver;

import com.vk.push.common.Logger;
import com.vk.push.pushsdk.receiver.OneTimePushReceiveHelper;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import xsna.ake0;
import xsna.c5g;
import xsna.d5w0;
import xsna.dwl;
import xsna.eje0;
import xsna.epx;
import xsna.ewl;
import xsna.ms9;
import xsna.nhe0;
import xsna.uj80;
import xsna.zje0;

/* compiled from: OneTimePushReceiveHelper.kt */
/* loaded from: classes5.dex */
public final class OneTimePushReceiveHelper {
    public final d5w0 a;
    public final nhe0 b;
    public final Logger c;

    /* compiled from: OneTimePushReceiveHelper.kt */
    public static final class SyncTimeoutExceededException extends Exception {
    }

    /* compiled from: OneTimePushReceiveHelper.kt */
    public static abstract class a {

        /* compiled from: OneTimePushReceiveHelper.kt */
        /* renamed from: com.vk.push.pushsdk.receiver.OneTimePushReceiveHelper$a$a, reason: collision with other inner class name */
        public static final class C1735a extends a {
            public final List<eje0> a;

            public C1735a(List<eje0> list) {
                this.a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1735a) && epx.f(this.a, ((C1735a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("DeliveryToClientCompleted(deliveredPushMessage="), this.a);
            }
        }

        /* compiled from: OneTimePushReceiveHelper.kt */
        public static final class b extends a {
            public static final b a = new b();
        }

        /* compiled from: OneTimePushReceiveHelper.kt */
        public static final class c extends a {
            public final List<eje0> a;

            public c(List<eje0> list) {
                this.a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("ReceivedPushesFromServer(receivedPushes="), this.a);
            }
        }
    }

    /* compiled from: OneTimePushReceiveHelper.kt */
    public static abstract class b {

        /* compiled from: OneTimePushReceiveHelper.kt */
        public static final class a extends b {
            public final List<eje0> a;

            public a(List<eje0> list) {
                this.a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("AwaitingForPushesDeliveryToClients(receivedPushes="), this.a);
            }
        }

        /* compiled from: OneTimePushReceiveHelper.kt */
        /* renamed from: com.vk.push.pushsdk.receiver.OneTimePushReceiveHelper$b$b, reason: collision with other inner class name */
        public static final class C1736b extends b {
            public final ArrayList a;

            public C1736b(ArrayList arrayList) {
                this.a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1736b) && epx.f(this.a, ((C1736b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return j.b(')', new StringBuilder("DeliveryInProgress(remainingPushesToDeliver="), this.a);
            }
        }

        /* compiled from: OneTimePushReceiveHelper.kt */
        public static final class c extends b {
            public static final c a = new c();
        }

        /* compiled from: OneTimePushReceiveHelper.kt */
        public static final class d extends b {
            public static final d a = new d();
        }

        /* compiled from: OneTimePushReceiveHelper.kt */
        public static final class e extends b {
            public static final e a = new e();
        }
    }

    /* compiled from: OneTimePushReceiveHelper.kt */
    public static final class c {
        public final Logger a;
        public b b = b.d.a;
        public uj80 c;

        public c(Logger logger) {
            this.a = logger.createLogger("StateMachine");
        }

        public static String a(eje0 eje0Var) {
            return eje0Var.g + ':' + eje0Var.a;
        }

        public final synchronized void b(a aVar) {
            uj80 uj80Var;
            try {
                Logger.DefaultImpls.info$default(this.a, "Consume event: " + aVar, null, 2, null);
                if (aVar.equals(a.b.a)) {
                    this.b = b.e.a;
                } else if (aVar instanceof a.c) {
                    this.b = !((a.c) aVar).a.isEmpty() ? new b.a(((a.c) aVar).a) : b.c.a;
                } else if (aVar instanceof a.C1735a) {
                    b bVar = this.b;
                    if (bVar instanceof b.a) {
                        List<eje0> list = ((a.C1735a) aVar).a;
                        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(a((eje0) it.next()));
                        }
                        List<eje0> list2 = ((b.a) bVar).a;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : list2) {
                            if (!arrayList.contains(a((eje0) obj))) {
                                arrayList2.add(obj);
                            }
                        }
                        this.b = !arrayList2.isEmpty() ? new b.C1736b(arrayList2) : b.c.a;
                    } else if (bVar instanceof b.C1736b) {
                        List<eje0> list3 = ((a.C1735a) aVar).a;
                        ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                        Iterator<T> it2 = list3.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(a((eje0) it2.next()));
                        }
                        ArrayList arrayList4 = ((b.C1736b) bVar).a;
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj2 : arrayList4) {
                            if (!arrayList3.contains(a((eje0) obj2))) {
                                arrayList5.add(obj2);
                            }
                        }
                        this.b = !arrayList5.isEmpty() ? new b.C1736b(arrayList5) : b.c.a;
                    } else {
                        Logger.DefaultImpls.warn$default(this.a, "Unexpected previous state: " + bVar + ", abort", null, 2, null);
                        this.b = b.c.a;
                    }
                }
                Logger.DefaultImpls.info$default(this.a, "New state is " + this.b, null, 2, null);
                if (epx.f(this.b, b.c.a) && (uj80Var = this.c) != null) {
                    uj80Var.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public OneTimePushReceiveHelper(d5w0 d5w0Var, nhe0 nhe0Var, Logger logger) {
        this.a = d5w0Var;
        this.b = nhe0Var;
        this.c = logger.createLogger("OneTimePushReceiveHelper");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [xsna.sj80] */
    public final void a() throws SyncTimeoutExceededException {
        nhe0 nhe0Var = this.b;
        d5w0 d5w0Var = this.a;
        Logger logger = this.c;
        Logger.DefaultImpls.info$default(logger, "Sync pushes started, available timeout: 300", null, 2, null);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        final c cVar = new c(logger);
        ?? r7 = new zje0.a() { // from class: xsna.sj80
            @Override // xsna.zje0.a
            public final void a(ake0.a aVar) {
                OneTimePushReceiveHelper.c.this.b(new OneTimePushReceiveHelper.a.c(aVar.a));
            }
        };
        ewl ewlVar = new ewl() { // from class: xsna.tj80
            @Override // xsna.ewl
            public final void a(dwl.a aVar) {
                OneTimePushReceiveHelper.c.this.b(new OneTimePushReceiveHelper.a.C1735a(aVar.a));
            }
        };
        try {
            cVar.c = new uj80(countDownLatch);
            cVar.b(a.b.a);
            d5w0Var.b(r7);
            nhe0Var.d.add(ewlVar);
            d5w0Var.g();
            if (!countDownLatch.await(300L, TimeUnit.SECONDS)) {
                throw new SyncTimeoutExceededException("Unable to sync pushes as timeout 300 exceeded");
            }
            Logger.DefaultImpls.info$default(logger, "Push sync completed successfully", null, 2, null);
        } finally {
            d5w0Var.a();
            d5w0Var.h(r7);
            nhe0Var.d.remove(ewlVar);
        }
    }
}
