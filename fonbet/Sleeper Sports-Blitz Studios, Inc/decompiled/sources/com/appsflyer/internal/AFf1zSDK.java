package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFf1zSDK {
    final Set<AFf1wSDK> AFAdRevenueData;
    final Set<AFe1bSDK<?>> areAllFieldsValid;
    final NavigableSet<AFe1bSDK<?>> component1;
    final List<AFe1bSDK<?>> component2;
    final Set<AFf1wSDK> component3;
    final NavigableSet<AFe1bSDK<?>> component4;
    final Timer getCurrencyIso4217Code;
    public final List<AFe1fSDK> getMediationNetwork;
    final ExecutorService getMonetizationNetwork;
    public Executor getRevenue;

    public AFf1zSDK(ExecutorService executorService) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "");
        this.getRevenue = newSingleThreadExecutor;
        this.getCurrencyIso4217Code = new Timer(true);
        this.getMediationNetwork = new CopyOnWriteArrayList();
        this.AFAdRevenueData = new CopyOnWriteArraySet();
        this.component3 = Collections.newSetFromMap(new ConcurrentHashMap());
        this.component1 = new ConcurrentSkipListSet();
        this.component4 = new ConcurrentSkipListSet();
        this.component2 = new ArrayList();
        this.areAllFieldsValid = Collections.newSetFromMap(new ConcurrentHashMap());
        this.getMonetizationNetwork = executorService;
    }

    /* renamed from: com.appsflyer.internal.AFf1zSDK$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        private /* synthetic */ AFe1bSDK getMonetizationNetwork;

        public AnonymousClass3(AFe1bSDK aFe1bSDK) {
            this.getMonetizationNetwork = aFe1bSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean add;
            synchronized (AFf1zSDK.this.component1) {
                if (AFf1zSDK.this.areAllFieldsValid.contains(this.getMonetizationNetwork)) {
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFh1xSDK aFh1xSDK = AFh1xSDK.QUEUE;
                    StringBuilder sb = new StringBuilder("tried to add already running task: ");
                    sb.append(this.getMonetizationNetwork);
                    aFLogger.d(aFh1xSDK, sb.toString());
                    return;
                }
                if (!AFf1zSDK.this.component1.contains(this.getMonetizationNetwork) && !AFf1zSDK.this.component4.contains(this.getMonetizationNetwork)) {
                    AFf1zSDK aFf1zSDK = AFf1zSDK.this;
                    AFe1bSDK aFe1bSDK = this.getMonetizationNetwork;
                    for (AFf1wSDK aFf1wSDK : aFe1bSDK.AFAdRevenueData) {
                        if (aFf1zSDK.component3.contains(aFf1wSDK)) {
                            aFe1bSDK.getRevenue.add(aFf1wSDK);
                        }
                    }
                    if (AFf1zSDK.this.getRevenue(this.getMonetizationNetwork)) {
                        add = AFf1zSDK.this.component1.add(this.getMonetizationNetwork);
                    } else {
                        add = AFf1zSDK.this.component4.add(this.getMonetizationNetwork);
                        if (add) {
                            AFLogger aFLogger2 = AFLogger.INSTANCE;
                            AFh1xSDK aFh1xSDK2 = AFh1xSDK.QUEUE;
                            StringBuilder sb2 = new StringBuilder("new task was blocked: ");
                            sb2.append(this.getMonetizationNetwork);
                            aFLogger2.d(aFh1xSDK2, sb2.toString());
                            this.getMonetizationNetwork.getRevenue();
                        }
                    }
                    if (add) {
                        AFf1zSDK.this.component1.addAll(AFf1zSDK.this.component2);
                        AFf1zSDK.this.component2.clear();
                    } else {
                        AFLogger aFLogger3 = AFLogger.INSTANCE;
                        AFh1xSDK aFh1xSDK3 = AFh1xSDK.QUEUE;
                        StringBuilder sb3 = new StringBuilder("task not added, it's already in the queue: ");
                        sb3.append(this.getMonetizationNetwork);
                        aFLogger3.d(aFh1xSDK3, sb3.toString());
                    }
                    if (add) {
                        AFf1zSDK.this.component3.add(this.getMonetizationNetwork.getCurrencyIso4217Code);
                        AFLogger aFLogger4 = AFLogger.INSTANCE;
                        AFh1xSDK aFh1xSDK4 = AFh1xSDK.QUEUE;
                        StringBuilder sb4 = new StringBuilder("new task added: ");
                        sb4.append(this.getMonetizationNetwork);
                        aFLogger4.d(aFh1xSDK4, sb4.toString());
                        for (AFe1fSDK aFe1fSDK : AFf1zSDK.this.getMediationNetwork) {
                        }
                        AFf1zSDK aFf1zSDK2 = AFf1zSDK.this;
                        aFf1zSDK2.getMonetizationNetwork.submit(aFf1zSDK2.new AnonymousClass2());
                        AFf1zSDK aFf1zSDK3 = AFf1zSDK.this;
                        synchronized (aFf1zSDK3.component1) {
                            for (int size = (aFf1zSDK3.component1.size() + aFf1zSDK3.component4.size()) - 40; size > 0; size--) {
                                boolean isEmpty = aFf1zSDK3.component4.isEmpty();
                                boolean isEmpty2 = aFf1zSDK3.component1.isEmpty();
                                if (isEmpty2 || isEmpty) {
                                    if (!isEmpty2) {
                                        aFf1zSDK3.AFAdRevenueData(aFf1zSDK3.component1);
                                    } else if (!isEmpty) {
                                        aFf1zSDK3.AFAdRevenueData(aFf1zSDK3.component4);
                                    }
                                } else if (aFf1zSDK3.component1.first().compareTo(aFf1zSDK3.component4.first()) > 0) {
                                    aFf1zSDK3.AFAdRevenueData(aFf1zSDK3.component1);
                                } else {
                                    aFf1zSDK3.AFAdRevenueData(aFf1zSDK3.component4);
                                }
                            }
                        }
                        return;
                    }
                    AFLogger aFLogger5 = AFLogger.INSTANCE;
                    AFh1xSDK aFh1xSDK5 = AFh1xSDK.QUEUE;
                    StringBuilder sb5 = new StringBuilder("QUEUE: tried to add already pending task: ");
                    sb5.append(this.getMonetizationNetwork);
                    aFLogger5.w(aFh1xSDK5, sb5.toString());
                    return;
                }
                AFLogger aFLogger6 = AFLogger.INSTANCE;
                AFh1xSDK aFh1xSDK6 = AFh1xSDK.QUEUE;
                StringBuilder sb6 = new StringBuilder("tried to add already scheduled task: ");
                sb6.append(this.getMonetizationNetwork);
                aFLogger6.d(aFh1xSDK6, sb6.toString());
            }
        }
    }

    /* renamed from: com.appsflyer.internal.AFf1zSDK$2, reason: invalid class name */
    final class AnonymousClass2 implements Runnable {
        AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFf1zSDK.this.component1) {
                final AFe1bSDK<?> pollFirst = AFf1zSDK.this.component1.pollFirst();
                if (pollFirst == null) {
                    return;
                }
                AFf1zSDK.this.areAllFieldsValid.add(pollFirst);
                long mediationNetwork = pollFirst.getMediationNetwork();
                AFf1ySDK aFf1ySDK = new AFf1ySDK(Thread.currentThread());
                if (mediationNetwork > 0) {
                    AFf1zSDK.this.getCurrencyIso4217Code.schedule(aFf1ySDK, mediationNetwork);
                }
                final AFf1zSDK aFf1zSDK = AFf1zSDK.this;
                aFf1zSDK.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.AFf1zSDK.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator<AFe1fSDK> it = AFf1zSDK.this.getMediationNetwork.iterator();
                        while (it.hasNext()) {
                            it.next().AFAdRevenueData(pollFirst);
                        }
                    }
                });
                if (!AFf1zSDK.this.component1.isEmpty()) {
                    AFf1zSDK aFf1zSDK2 = AFf1zSDK.this;
                    aFf1zSDK2.getMonetizationNetwork.submit(aFf1zSDK2.new AnonymousClass2());
                }
                try {
                    AFLogger.INSTANCE.d(AFh1xSDK.QUEUE, "starting task execution: ".concat(String.valueOf(pollFirst)));
                    final AFe1dSDK call = pollFirst.call();
                    aFf1ySDK.cancel();
                    final AFf1zSDK aFf1zSDK3 = AFf1zSDK.this;
                    aFf1zSDK3.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.AFf1zSDK.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFh1xSDK aFh1xSDK = AFh1xSDK.QUEUE;
                            StringBuilder sb = new StringBuilder("execution finished for ");
                            sb.append(pollFirst);
                            sb.append(", result: ");
                            sb.append(call);
                            aFLogger.d(aFh1xSDK, sb.toString());
                            AFf1zSDK.this.areAllFieldsValid.remove(pollFirst);
                            Iterator<AFe1fSDK> it = AFf1zSDK.this.getMediationNetwork.iterator();
                            while (it.hasNext()) {
                                it.next().getRevenue(pollFirst, call);
                            }
                            if (call == AFe1dSDK.SUCCESS) {
                                AFf1zSDK.this.AFAdRevenueData.add(pollFirst.getCurrencyIso4217Code);
                                AFf1zSDK.this.getCurrencyIso4217Code();
                                return;
                            }
                            if (pollFirst.getMonetizationNetwork()) {
                                if (AFf1zSDK.getMonetizationNetwork(pollFirst)) {
                                    synchronized (AFf1zSDK.this.component1) {
                                        AFf1zSDK.this.component2.add(pollFirst);
                                        for (AFe1fSDK aFe1fSDK : AFf1zSDK.this.getMediationNetwork) {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            AFf1zSDK.this.AFAdRevenueData.add(pollFirst.getCurrencyIso4217Code);
                            AFf1zSDK.this.getCurrencyIso4217Code();
                        }
                    });
                } catch (InterruptedIOException | InterruptedException unused) {
                    AFLogger.INSTANCE.d(AFh1xSDK.QUEUE, "task was interrupted: ".concat(String.valueOf(pollFirst)));
                    pollFirst.getMonetizationNetwork = AFe1dSDK.TIMEOUT;
                    final AFf1zSDK aFf1zSDK4 = AFf1zSDK.this;
                    final AFe1dSDK aFe1dSDK = AFe1dSDK.TIMEOUT;
                    aFf1zSDK4.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.AFf1zSDK.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFh1xSDK aFh1xSDK = AFh1xSDK.QUEUE;
                            StringBuilder sb = new StringBuilder("execution finished for ");
                            sb.append(pollFirst);
                            sb.append(", result: ");
                            sb.append(aFe1dSDK);
                            aFLogger.d(aFh1xSDK, sb.toString());
                            AFf1zSDK.this.areAllFieldsValid.remove(pollFirst);
                            Iterator<AFe1fSDK> it = AFf1zSDK.this.getMediationNetwork.iterator();
                            while (it.hasNext()) {
                                it.next().getRevenue(pollFirst, aFe1dSDK);
                            }
                            if (aFe1dSDK == AFe1dSDK.SUCCESS) {
                                AFf1zSDK.this.AFAdRevenueData.add(pollFirst.getCurrencyIso4217Code);
                                AFf1zSDK.this.getCurrencyIso4217Code();
                                return;
                            }
                            if (pollFirst.getMonetizationNetwork()) {
                                if (AFf1zSDK.getMonetizationNetwork(pollFirst)) {
                                    synchronized (AFf1zSDK.this.component1) {
                                        AFf1zSDK.this.component2.add(pollFirst);
                                        for (AFe1fSDK aFe1fSDK : AFf1zSDK.this.getMediationNetwork) {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            AFf1zSDK.this.AFAdRevenueData.add(pollFirst.getCurrencyIso4217Code);
                            AFf1zSDK.this.getCurrencyIso4217Code();
                        }
                    });
                } catch (Throwable unused2) {
                    aFf1ySDK.cancel();
                    final AFf1zSDK aFf1zSDK5 = AFf1zSDK.this;
                    final AFe1dSDK aFe1dSDK2 = AFe1dSDK.FAILURE;
                    aFf1zSDK5.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.AFf1zSDK.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFh1xSDK aFh1xSDK = AFh1xSDK.QUEUE;
                            StringBuilder sb = new StringBuilder("execution finished for ");
                            sb.append(pollFirst);
                            sb.append(", result: ");
                            sb.append(aFe1dSDK2);
                            aFLogger.d(aFh1xSDK, sb.toString());
                            AFf1zSDK.this.areAllFieldsValid.remove(pollFirst);
                            Iterator<AFe1fSDK> it = AFf1zSDK.this.getMediationNetwork.iterator();
                            while (it.hasNext()) {
                                it.next().getRevenue(pollFirst, aFe1dSDK2);
                            }
                            if (aFe1dSDK2 == AFe1dSDK.SUCCESS) {
                                AFf1zSDK.this.AFAdRevenueData.add(pollFirst.getCurrencyIso4217Code);
                                AFf1zSDK.this.getCurrencyIso4217Code();
                                return;
                            }
                            if (pollFirst.getMonetizationNetwork()) {
                                if (AFf1zSDK.getMonetizationNetwork(pollFirst)) {
                                    synchronized (AFf1zSDK.this.component1) {
                                        AFf1zSDK.this.component2.add(pollFirst);
                                        for (AFe1fSDK aFe1fSDK : AFf1zSDK.this.getMediationNetwork) {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            AFf1zSDK.this.AFAdRevenueData.add(pollFirst.getCurrencyIso4217Code);
                            AFf1zSDK.this.getCurrencyIso4217Code();
                        }
                    });
                }
            }
        }
    }

    final void getCurrencyIso4217Code() {
        synchronized (this.component1) {
            Iterator<AFe1bSDK<?>> it = this.component4.iterator();
            boolean z = false;
            while (it.hasNext()) {
                AFe1bSDK<?> next = it.next();
                if (getRevenue(next)) {
                    it.remove();
                    this.component1.add(next);
                    z = true;
                }
            }
            if (z) {
                this.getMonetizationNetwork.submit(new AnonymousClass2());
            }
        }
    }

    final void AFAdRevenueData(NavigableSet<AFe1bSDK<?>> navigableSet) {
        AFe1bSDK<?> pollFirst = navigableSet.pollFirst();
        this.AFAdRevenueData.add(pollFirst.getCurrencyIso4217Code);
        Iterator<AFe1fSDK> it = this.getMediationNetwork.iterator();
        while (it.hasNext()) {
            it.next().getMediationNetwork(pollFirst);
        }
    }

    final boolean getRevenue(AFe1bSDK<?> aFe1bSDK) {
        return this.AFAdRevenueData.containsAll(aFe1bSDK.getRevenue);
    }

    public static boolean getMonetizationNetwork(AFe1bSDK<?> aFe1bSDK) {
        return ((aFe1bSDK instanceof AFf1eSDK) && aFe1bSDK.getCurrencyIso4217Code == AFf1wSDK.ARS_VALIDATE) ? false : true;
    }
}
