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

/* loaded from: classes5.dex */
public final class AFe1sSDK {
    final Timer AFAdRevenueData;
    final NavigableSet<AFe1tSDK<?>> areAllFieldsValid;
    final NavigableSet<AFe1tSDK<?>> component1;
    final Set<AFe1uSDK> component2;
    final List<AFe1tSDK<?>> component3;
    final Set<AFe1tSDK<?>> component4;
    final ExecutorService getCurrencyIso4217Code;
    final Set<AFe1uSDK> getMediationNetwork;
    public final List<AFe1qSDK> getMonetizationNetwork;
    public Executor getRevenue;

    public AFe1sSDK(ExecutorService executorService) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "");
        this.getRevenue = newSingleThreadExecutor;
        this.AFAdRevenueData = new Timer(true);
        this.getMonetizationNetwork = new CopyOnWriteArrayList();
        this.getMediationNetwork = new CopyOnWriteArraySet();
        this.component2 = Collections.newSetFromMap(new ConcurrentHashMap());
        this.areAllFieldsValid = new ConcurrentSkipListSet();
        this.component1 = new ConcurrentSkipListSet();
        this.component3 = new ArrayList();
        this.component4 = Collections.newSetFromMap(new ConcurrentHashMap());
        this.getCurrencyIso4217Code = executorService;
    }

    /* renamed from: com.appsflyer.internal.AFe1sSDK$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        private /* synthetic */ AFe1tSDK getMonetizationNetwork;

        public AnonymousClass3(AFe1tSDK aFe1tSDK) {
            this.getMonetizationNetwork = aFe1tSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean add;
            synchronized (AFe1sSDK.this.areAllFieldsValid) {
                if (AFe1sSDK.this.component4.contains(this.getMonetizationNetwork)) {
                    AFLogger.INSTANCE.d(AFh1zSDK.QUEUE, new StringBuilder("tried to add already running task: ").append(this.getMonetizationNetwork).toString());
                    return;
                }
                if (!AFe1sSDK.this.areAllFieldsValid.contains(this.getMonetizationNetwork) && !AFe1sSDK.this.component1.contains(this.getMonetizationNetwork)) {
                    AFe1sSDK aFe1sSDK = AFe1sSDK.this;
                    AFe1tSDK aFe1tSDK = this.getMonetizationNetwork;
                    for (AFe1uSDK aFe1uSDK : aFe1tSDK.getRevenue) {
                        if (aFe1sSDK.component2.contains(aFe1uSDK)) {
                            aFe1tSDK.AFAdRevenueData.add(aFe1uSDK);
                        }
                    }
                    if (AFe1sSDK.this.getMediationNetwork(this.getMonetizationNetwork)) {
                        add = AFe1sSDK.this.areAllFieldsValid.add(this.getMonetizationNetwork);
                    } else {
                        add = AFe1sSDK.this.component1.add(this.getMonetizationNetwork);
                        if (add) {
                            AFLogger.INSTANCE.d(AFh1zSDK.QUEUE, new StringBuilder("new task was blocked: ").append(this.getMonetizationNetwork).toString());
                            this.getMonetizationNetwork.getMediationNetwork();
                        }
                    }
                    if (add) {
                        AFe1sSDK.this.areAllFieldsValid.addAll(AFe1sSDK.this.component3);
                        AFe1sSDK.this.component3.clear();
                    } else {
                        AFLogger.INSTANCE.d(AFh1zSDK.QUEUE, new StringBuilder("task not added, it's already in the queue: ").append(this.getMonetizationNetwork).toString());
                    }
                    if (add) {
                        AFe1sSDK.this.component2.add(this.getMonetizationNetwork.getMonetizationNetwork);
                        AFLogger.INSTANCE.d(AFh1zSDK.QUEUE, new StringBuilder("new task added: ").append(this.getMonetizationNetwork).toString());
                        for (AFe1qSDK aFe1qSDK : AFe1sSDK.this.getMonetizationNetwork) {
                        }
                        AFe1sSDK aFe1sSDK2 = AFe1sSDK.this;
                        aFe1sSDK2.getCurrencyIso4217Code.submit(aFe1sSDK2.new AnonymousClass2());
                        AFe1sSDK aFe1sSDK3 = AFe1sSDK.this;
                        synchronized (aFe1sSDK3.areAllFieldsValid) {
                            for (int size = (aFe1sSDK3.areAllFieldsValid.size() + aFe1sSDK3.component1.size()) - 40; size > 0; size--) {
                                boolean isEmpty = aFe1sSDK3.component1.isEmpty();
                                boolean isEmpty2 = aFe1sSDK3.areAllFieldsValid.isEmpty();
                                if (isEmpty2 || isEmpty) {
                                    if (!isEmpty2) {
                                        aFe1sSDK3.AFAdRevenueData(aFe1sSDK3.areAllFieldsValid);
                                    } else if (!isEmpty) {
                                        aFe1sSDK3.AFAdRevenueData(aFe1sSDK3.component1);
                                    }
                                } else if (aFe1sSDK3.areAllFieldsValid.first().compareTo(aFe1sSDK3.component1.first()) > 0) {
                                    aFe1sSDK3.AFAdRevenueData(aFe1sSDK3.areAllFieldsValid);
                                } else {
                                    aFe1sSDK3.AFAdRevenueData(aFe1sSDK3.component1);
                                }
                            }
                        }
                        return;
                    }
                    AFLogger.INSTANCE.w(AFh1zSDK.QUEUE, new StringBuilder("QUEUE: tried to add already pending task: ").append(this.getMonetizationNetwork).toString());
                    return;
                }
                AFLogger.INSTANCE.d(AFh1zSDK.QUEUE, new StringBuilder("tried to add already scheduled task: ").append(this.getMonetizationNetwork).toString());
            }
        }
    }

    /* renamed from: com.appsflyer.internal.AFe1sSDK$2, reason: invalid class name */
    final class AnonymousClass2 implements Runnable {
        AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFe1sSDK.this.areAllFieldsValid) {
                final AFe1tSDK<?> pollFirst = AFe1sSDK.this.areAllFieldsValid.pollFirst();
                if (pollFirst == null) {
                    return;
                }
                AFe1sSDK.this.component4.add(pollFirst);
                long revenue = pollFirst.getRevenue();
                AFe1lSDK aFe1lSDK = new AFe1lSDK(Thread.currentThread());
                if (revenue > 0) {
                    AFe1sSDK.this.AFAdRevenueData.schedule(aFe1lSDK, revenue);
                }
                final AFe1sSDK aFe1sSDK = AFe1sSDK.this;
                aFe1sSDK.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1sSDK.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator<AFe1qSDK> it = AFe1sSDK.this.getMonetizationNetwork.iterator();
                        while (it.hasNext()) {
                            it.next().getMediationNetwork(pollFirst);
                        }
                    }
                });
                if (!AFe1sSDK.this.areAllFieldsValid.isEmpty()) {
                    AFe1sSDK aFe1sSDK2 = AFe1sSDK.this;
                    aFe1sSDK2.getCurrencyIso4217Code.submit(aFe1sSDK2.new AnonymousClass2());
                }
                try {
                    AFLogger.INSTANCE.d(AFh1zSDK.QUEUE, "starting task execution: ".concat(String.valueOf(pollFirst)));
                    final AFe1rSDK call = pollFirst.call();
                    aFe1lSDK.cancel();
                    final AFe1sSDK aFe1sSDK3 = AFe1sSDK.this;
                    aFe1sSDK3.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1sSDK.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger.INSTANCE.d(AFh1zSDK.QUEUE, new StringBuilder("execution finished for ").append(pollFirst).append(", result: ").append(call).toString());
                            AFe1sSDK.this.component4.remove(pollFirst);
                            Iterator<AFe1qSDK> it = AFe1sSDK.this.getMonetizationNetwork.iterator();
                            while (it.hasNext()) {
                                it.next().getRevenue(pollFirst, call);
                            }
                            if (call == AFe1rSDK.SUCCESS) {
                                AFe1sSDK.this.getMediationNetwork.add(pollFirst.getMonetizationNetwork);
                                AFe1sSDK.this.getMonetizationNetwork();
                                return;
                            }
                            if (pollFirst.getMonetizationNetwork()) {
                                if (AFe1sSDK.getCurrencyIso4217Code(pollFirst)) {
                                    synchronized (AFe1sSDK.this.areAllFieldsValid) {
                                        AFe1sSDK.this.component3.add(pollFirst);
                                        for (AFe1qSDK aFe1qSDK : AFe1sSDK.this.getMonetizationNetwork) {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            AFe1sSDK.this.getMediationNetwork.add(pollFirst.getMonetizationNetwork);
                            AFe1sSDK.this.getMonetizationNetwork();
                        }
                    });
                } catch (InterruptedIOException | InterruptedException unused) {
                    AFLogger.INSTANCE.d(AFh1zSDK.QUEUE, "task was interrupted: ".concat(String.valueOf(pollFirst)));
                    pollFirst.getMediationNetwork = AFe1rSDK.TIMEOUT;
                    final AFe1sSDK aFe1sSDK4 = AFe1sSDK.this;
                    final AFe1rSDK aFe1rSDK = AFe1rSDK.TIMEOUT;
                    aFe1sSDK4.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1sSDK.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger.INSTANCE.d(AFh1zSDK.QUEUE, new StringBuilder("execution finished for ").append(pollFirst).append(", result: ").append(aFe1rSDK).toString());
                            AFe1sSDK.this.component4.remove(pollFirst);
                            Iterator<AFe1qSDK> it = AFe1sSDK.this.getMonetizationNetwork.iterator();
                            while (it.hasNext()) {
                                it.next().getRevenue(pollFirst, aFe1rSDK);
                            }
                            if (aFe1rSDK == AFe1rSDK.SUCCESS) {
                                AFe1sSDK.this.getMediationNetwork.add(pollFirst.getMonetizationNetwork);
                                AFe1sSDK.this.getMonetizationNetwork();
                                return;
                            }
                            if (pollFirst.getMonetizationNetwork()) {
                                if (AFe1sSDK.getCurrencyIso4217Code(pollFirst)) {
                                    synchronized (AFe1sSDK.this.areAllFieldsValid) {
                                        AFe1sSDK.this.component3.add(pollFirst);
                                        for (AFe1qSDK aFe1qSDK : AFe1sSDK.this.getMonetizationNetwork) {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            AFe1sSDK.this.getMediationNetwork.add(pollFirst.getMonetizationNetwork);
                            AFe1sSDK.this.getMonetizationNetwork();
                        }
                    });
                } catch (Throwable unused2) {
                    aFe1lSDK.cancel();
                    final AFe1sSDK aFe1sSDK5 = AFe1sSDK.this;
                    final AFe1rSDK aFe1rSDK2 = AFe1rSDK.FAILURE;
                    aFe1sSDK5.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1sSDK.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger.INSTANCE.d(AFh1zSDK.QUEUE, new StringBuilder("execution finished for ").append(pollFirst).append(", result: ").append(aFe1rSDK2).toString());
                            AFe1sSDK.this.component4.remove(pollFirst);
                            Iterator<AFe1qSDK> it = AFe1sSDK.this.getMonetizationNetwork.iterator();
                            while (it.hasNext()) {
                                it.next().getRevenue(pollFirst, aFe1rSDK2);
                            }
                            if (aFe1rSDK2 == AFe1rSDK.SUCCESS) {
                                AFe1sSDK.this.getMediationNetwork.add(pollFirst.getMonetizationNetwork);
                                AFe1sSDK.this.getMonetizationNetwork();
                                return;
                            }
                            if (pollFirst.getMonetizationNetwork()) {
                                if (AFe1sSDK.getCurrencyIso4217Code(pollFirst)) {
                                    synchronized (AFe1sSDK.this.areAllFieldsValid) {
                                        AFe1sSDK.this.component3.add(pollFirst);
                                        for (AFe1qSDK aFe1qSDK : AFe1sSDK.this.getMonetizationNetwork) {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            AFe1sSDK.this.getMediationNetwork.add(pollFirst.getMonetizationNetwork);
                            AFe1sSDK.this.getMonetizationNetwork();
                        }
                    });
                }
            }
        }
    }

    final void getMonetizationNetwork() {
        synchronized (this.areAllFieldsValid) {
            Iterator<AFe1tSDK<?>> it = this.component1.iterator();
            boolean z = false;
            while (it.hasNext()) {
                AFe1tSDK<?> next = it.next();
                if (getMediationNetwork(next)) {
                    it.remove();
                    this.areAllFieldsValid.add(next);
                    z = true;
                }
            }
            if (z) {
                this.getCurrencyIso4217Code.submit(new AnonymousClass2());
            }
        }
    }

    final void AFAdRevenueData(NavigableSet<AFe1tSDK<?>> navigableSet) {
        AFe1tSDK<?> pollFirst = navigableSet.pollFirst();
        this.getMediationNetwork.add(pollFirst.getMonetizationNetwork);
        Iterator<AFe1qSDK> it = this.getMonetizationNetwork.iterator();
        while (it.hasNext()) {
            it.next().AFAdRevenueData(pollFirst);
        }
    }

    final boolean getMediationNetwork(AFe1tSDK<?> aFe1tSDK) {
        return this.getMediationNetwork.containsAll(aFe1tSDK.AFAdRevenueData);
    }

    public static boolean getCurrencyIso4217Code(AFe1tSDK<?> aFe1tSDK) {
        return ((aFe1tSDK instanceof AFf1ySDK) && aFe1tSDK.getMonetizationNetwork == AFe1uSDK.ARS_VALIDATE) ? false : true;
    }
}
