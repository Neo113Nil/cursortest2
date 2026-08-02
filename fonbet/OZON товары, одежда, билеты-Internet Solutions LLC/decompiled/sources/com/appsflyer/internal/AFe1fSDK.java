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

/* loaded from: classes.dex */
public final class AFe1fSDK {
    final Timer AFInAppEventParameterName;
    final Set<AFf1zSDK> AFInAppEventType;
    public Executor AFKeystoreWrapper;
    final Set<AFe1eSDK<?>> AFLogger;

    /* renamed from: d, reason: collision with root package name */
    final NavigableSet<AFe1eSDK<?>> f57399d;

    /* renamed from: e, reason: collision with root package name */
    final NavigableSet<AFe1eSDK<?>> f57400e;
    final Set<AFf1zSDK> registerClient;
    final List<AFe1eSDK<?>> unregisterClient;
    public final List<AFe1bSDK> valueOf;
    final ExecutorService values;

    /* renamed from: com.appsflyer.internal.AFe1fSDK$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        private /* synthetic */ AFe1eSDK AFInAppEventType;

        public AnonymousClass3(AFe1eSDK aFe1eSDK) {
            this.AFInAppEventType = aFe1eSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean add;
            synchronized (AFe1fSDK.this.f57400e) {
                try {
                    if (AFe1fSDK.this.AFLogger.contains(this.AFInAppEventType)) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1gSDK aFg1gSDK = AFg1gSDK.QUEUE;
                        StringBuilder sb2 = new StringBuilder("tried to add already running task: ");
                        sb2.append(this.AFInAppEventType);
                        aFLogger.d(aFg1gSDK, sb2.toString());
                        return;
                    }
                    if (!AFe1fSDK.this.f57400e.contains(this.AFInAppEventType) && !AFe1fSDK.this.f57399d.contains(this.AFInAppEventType)) {
                        AFe1fSDK aFe1fSDK = AFe1fSDK.this;
                        AFe1eSDK aFe1eSDK = this.AFInAppEventType;
                        for (AFf1zSDK aFf1zSDK : aFe1eSDK.valueOf) {
                            if (aFe1fSDK.registerClient.contains(aFf1zSDK)) {
                                aFe1eSDK.AFKeystoreWrapper.add(aFf1zSDK);
                            }
                        }
                        if (AFe1fSDK.this.values(this.AFInAppEventType)) {
                            add = AFe1fSDK.this.f57400e.add(this.AFInAppEventType);
                        } else {
                            add = AFe1fSDK.this.f57399d.add(this.AFInAppEventType);
                            if (add) {
                                AFLogger aFLogger2 = AFLogger.INSTANCE;
                                AFg1gSDK aFg1gSDK2 = AFg1gSDK.QUEUE;
                                StringBuilder sb3 = new StringBuilder("new task was blocked: ");
                                sb3.append(this.AFInAppEventType);
                                aFLogger2.d(aFg1gSDK2, sb3.toString());
                                this.AFInAppEventType.valueOf();
                            }
                        }
                        if (add) {
                            AFe1fSDK aFe1fSDK2 = AFe1fSDK.this;
                            aFe1fSDK2.f57400e.addAll(aFe1fSDK2.unregisterClient);
                            AFe1fSDK.this.unregisterClient.clear();
                        } else {
                            AFLogger aFLogger3 = AFLogger.INSTANCE;
                            AFg1gSDK aFg1gSDK3 = AFg1gSDK.QUEUE;
                            StringBuilder sb4 = new StringBuilder("task not added, it's already in the queue: ");
                            sb4.append(this.AFInAppEventType);
                            aFLogger3.d(aFg1gSDK3, sb4.toString());
                        }
                        if (!add) {
                            AFLogger aFLogger4 = AFLogger.INSTANCE;
                            AFg1gSDK aFg1gSDK4 = AFg1gSDK.QUEUE;
                            StringBuilder sb5 = new StringBuilder("QUEUE: tried to add already pending task: ");
                            sb5.append(this.AFInAppEventType);
                            aFLogger4.w(aFg1gSDK4, sb5.toString());
                            return;
                        }
                        AFe1fSDK.this.registerClient.add(this.AFInAppEventType.AFInAppEventParameterName);
                        AFLogger aFLogger5 = AFLogger.INSTANCE;
                        AFg1gSDK aFg1gSDK5 = AFg1gSDK.QUEUE;
                        StringBuilder sb6 = new StringBuilder("new task added: ");
                        sb6.append(this.AFInAppEventType);
                        aFLogger5.d(aFg1gSDK5, sb6.toString());
                        for (AFe1bSDK aFe1bSDK : AFe1fSDK.this.valueOf) {
                        }
                        AFe1fSDK aFe1fSDK3 = AFe1fSDK.this;
                        aFe1fSDK3.values.submit(aFe1fSDK3.new AnonymousClass4());
                        AFe1fSDK aFe1fSDK4 = AFe1fSDK.this;
                        synchronized (aFe1fSDK4.f57400e) {
                            try {
                                for (int size = (aFe1fSDK4.f57400e.size() + aFe1fSDK4.f57399d.size()) - 40; size > 0; size--) {
                                    boolean isEmpty = aFe1fSDK4.f57399d.isEmpty();
                                    boolean isEmpty2 = aFe1fSDK4.f57400e.isEmpty();
                                    if (isEmpty2 || isEmpty) {
                                        if (!isEmpty2) {
                                            aFe1fSDK4.valueOf(aFe1fSDK4.f57400e);
                                        } else if (!isEmpty) {
                                            aFe1fSDK4.valueOf(aFe1fSDK4.f57399d);
                                        }
                                    } else if (aFe1fSDK4.f57400e.first().compareTo(aFe1fSDK4.f57399d.first()) > 0) {
                                        aFe1fSDK4.valueOf(aFe1fSDK4.f57400e);
                                    } else {
                                        aFe1fSDK4.valueOf(aFe1fSDK4.f57399d);
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return;
                    }
                    AFLogger aFLogger6 = AFLogger.INSTANCE;
                    AFg1gSDK aFg1gSDK6 = AFg1gSDK.QUEUE;
                    StringBuilder sb7 = new StringBuilder("tried to add already scheduled task: ");
                    sb7.append(this.AFInAppEventType);
                    aFLogger6.d(aFg1gSDK6, sb7.toString());
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* renamed from: com.appsflyer.internal.AFe1fSDK$4, reason: invalid class name */
    final class AnonymousClass4 implements Runnable {
        AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFe1fSDK.this.f57400e) {
                try {
                    final AFe1eSDK<?> pollFirst = AFe1fSDK.this.f57400e.pollFirst();
                    if (pollFirst == null) {
                        return;
                    }
                    AFe1fSDK.this.AFLogger.add(pollFirst);
                    long AFInAppEventType = pollFirst.AFInAppEventType();
                    AFf1ySDK aFf1ySDK = new AFf1ySDK(Thread.currentThread());
                    if (AFInAppEventType > 0) {
                        AFe1fSDK.this.AFInAppEventParameterName.schedule(aFf1ySDK, AFInAppEventType);
                    }
                    final AFe1fSDK aFe1fSDK = AFe1fSDK.this;
                    aFe1fSDK.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1fSDK.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            Iterator<AFe1bSDK> it = AFe1fSDK.this.valueOf.iterator();
                            while (it.hasNext()) {
                                it.next().values(pollFirst);
                            }
                        }
                    });
                    if (!AFe1fSDK.this.f57400e.isEmpty()) {
                        AFe1fSDK aFe1fSDK2 = AFe1fSDK.this;
                        aFe1fSDK2.values.submit(aFe1fSDK2.new AnonymousClass4());
                    }
                    try {
                        AFLogger.INSTANCE.d(AFg1gSDK.QUEUE, "starting task execution: ".concat(String.valueOf(pollFirst)));
                        final AFe1dSDK call = pollFirst.call();
                        aFf1ySDK.cancel();
                        final AFe1fSDK aFe1fSDK3 = AFe1fSDK.this;
                        aFe1fSDK3.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1fSDK.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1gSDK aFg1gSDK = AFg1gSDK.QUEUE;
                                StringBuilder sb2 = new StringBuilder("execution finished for ");
                                sb2.append(pollFirst);
                                sb2.append(", result: ");
                                sb2.append(call);
                                aFLogger.d(aFg1gSDK, sb2.toString());
                                AFe1fSDK.this.AFLogger.remove(pollFirst);
                                Iterator<AFe1bSDK> it = AFe1fSDK.this.valueOf.iterator();
                                while (it.hasNext()) {
                                    it.next().AFInAppEventParameterName(pollFirst, call);
                                }
                                if (call == AFe1dSDK.SUCCESS) {
                                    AFe1fSDK.this.AFInAppEventType.add(pollFirst.AFInAppEventParameterName);
                                    AFe1fSDK.AFInAppEventType(AFe1fSDK.this);
                                    return;
                                }
                                if (!pollFirst.AFInAppEventParameterName()) {
                                    AFe1fSDK.this.AFInAppEventType.add(pollFirst.AFInAppEventParameterName);
                                    AFe1fSDK.AFInAppEventType(AFe1fSDK.this);
                                } else if (AFe1fSDK.valueOf((AFe1eSDK<?>) pollFirst)) {
                                    synchronized (AFe1fSDK.this.f57400e) {
                                        try {
                                            AFe1fSDK.this.unregisterClient.add(pollFirst);
                                            for (AFe1bSDK aFe1bSDK : AFe1fSDK.this.valueOf) {
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                            }
                        });
                    } catch (InterruptedIOException | InterruptedException unused) {
                        AFLogger.INSTANCE.d(AFg1gSDK.QUEUE, "task was interrupted: ".concat(String.valueOf(pollFirst)));
                        final AFe1dSDK aFe1dSDK = AFe1dSDK.TIMEOUT;
                        pollFirst.AFInAppEventType = aFe1dSDK;
                        final AFe1fSDK aFe1fSDK4 = AFe1fSDK.this;
                        aFe1fSDK4.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1fSDK.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1gSDK aFg1gSDK = AFg1gSDK.QUEUE;
                                StringBuilder sb2 = new StringBuilder("execution finished for ");
                                sb2.append(pollFirst);
                                sb2.append(", result: ");
                                sb2.append(aFe1dSDK);
                                aFLogger.d(aFg1gSDK, sb2.toString());
                                AFe1fSDK.this.AFLogger.remove(pollFirst);
                                Iterator<AFe1bSDK> it = AFe1fSDK.this.valueOf.iterator();
                                while (it.hasNext()) {
                                    it.next().AFInAppEventParameterName(pollFirst, aFe1dSDK);
                                }
                                if (aFe1dSDK == AFe1dSDK.SUCCESS) {
                                    AFe1fSDK.this.AFInAppEventType.add(pollFirst.AFInAppEventParameterName);
                                    AFe1fSDK.AFInAppEventType(AFe1fSDK.this);
                                    return;
                                }
                                if (!pollFirst.AFInAppEventParameterName()) {
                                    AFe1fSDK.this.AFInAppEventType.add(pollFirst.AFInAppEventParameterName);
                                    AFe1fSDK.AFInAppEventType(AFe1fSDK.this);
                                } else if (AFe1fSDK.valueOf((AFe1eSDK<?>) pollFirst)) {
                                    synchronized (AFe1fSDK.this.f57400e) {
                                        try {
                                            AFe1fSDK.this.unregisterClient.add(pollFirst);
                                            for (AFe1bSDK aFe1bSDK : AFe1fSDK.this.valueOf) {
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                            }
                        });
                    } catch (Throwable unused2) {
                        aFf1ySDK.cancel();
                        final AFe1fSDK aFe1fSDK5 = AFe1fSDK.this;
                        final AFe1dSDK aFe1dSDK2 = AFe1dSDK.FAILURE;
                        aFe1fSDK5.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1fSDK.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1gSDK aFg1gSDK = AFg1gSDK.QUEUE;
                                StringBuilder sb2 = new StringBuilder("execution finished for ");
                                sb2.append(pollFirst);
                                sb2.append(", result: ");
                                sb2.append(aFe1dSDK2);
                                aFLogger.d(aFg1gSDK, sb2.toString());
                                AFe1fSDK.this.AFLogger.remove(pollFirst);
                                Iterator<AFe1bSDK> it = AFe1fSDK.this.valueOf.iterator();
                                while (it.hasNext()) {
                                    it.next().AFInAppEventParameterName(pollFirst, aFe1dSDK2);
                                }
                                if (aFe1dSDK2 == AFe1dSDK.SUCCESS) {
                                    AFe1fSDK.this.AFInAppEventType.add(pollFirst.AFInAppEventParameterName);
                                    AFe1fSDK.AFInAppEventType(AFe1fSDK.this);
                                    return;
                                }
                                if (!pollFirst.AFInAppEventParameterName()) {
                                    AFe1fSDK.this.AFInAppEventType.add(pollFirst.AFInAppEventParameterName);
                                    AFe1fSDK.AFInAppEventType(AFe1fSDK.this);
                                } else if (AFe1fSDK.valueOf((AFe1eSDK<?>) pollFirst)) {
                                    synchronized (AFe1fSDK.this.f57400e) {
                                        try {
                                            AFe1fSDK.this.unregisterClient.add(pollFirst);
                                            for (AFe1bSDK aFe1bSDK : AFe1fSDK.this.valueOf) {
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public AFe1fSDK(ExecutorService executorService) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "");
        this.AFKeystoreWrapper = newSingleThreadExecutor;
        this.AFInAppEventParameterName = new Timer(true);
        this.valueOf = new CopyOnWriteArrayList();
        this.AFInAppEventType = new CopyOnWriteArraySet();
        this.registerClient = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f57400e = new ConcurrentSkipListSet();
        this.f57399d = new ConcurrentSkipListSet();
        this.unregisterClient = new ArrayList();
        this.AFLogger = Collections.newSetFromMap(new ConcurrentHashMap());
        this.values = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean values(AFe1eSDK<?> aFe1eSDK) {
        return this.AFInAppEventType.containsAll(aFe1eSDK.AFKeystoreWrapper);
    }

    final void valueOf(NavigableSet<AFe1eSDK<?>> navigableSet) {
        AFe1eSDK<?> pollFirst = navigableSet.pollFirst();
        this.AFInAppEventType.add(pollFirst.AFInAppEventParameterName);
        Iterator<AFe1bSDK> it = this.valueOf.iterator();
        while (it.hasNext()) {
            it.next().AFKeystoreWrapper(pollFirst);
        }
    }

    static /* synthetic */ void AFInAppEventType(AFe1fSDK aFe1fSDK) {
        synchronized (aFe1fSDK.f57400e) {
            try {
                Iterator<AFe1eSDK<?>> it = aFe1fSDK.f57399d.iterator();
                boolean z11 = false;
                while (it.hasNext()) {
                    AFe1eSDK<?> next = it.next();
                    if (aFe1fSDK.values(next)) {
                        it.remove();
                        aFe1fSDK.f57400e.add(next);
                        z11 = true;
                    }
                }
                if (z11) {
                    aFe1fSDK.values.submit(aFe1fSDK.new AnonymousClass4());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean valueOf(AFe1eSDK<?> aFe1eSDK) {
        return ((aFe1eSDK instanceof AFf1kSDK) && aFe1eSDK.AFInAppEventParameterName == AFf1zSDK.ARS_VALIDATE) ? false : true;
    }
}
