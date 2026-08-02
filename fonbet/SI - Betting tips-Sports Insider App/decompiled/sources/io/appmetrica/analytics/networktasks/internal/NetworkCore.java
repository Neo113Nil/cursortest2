package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.networktasks.impl.d;
import io.appmetrica.analytics.networktasks.impl.f;
import io.appmetrica.analytics.networktasks.impl.g;
import io.appmetrica.analytics.networktasks.impl.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class NetworkCore extends InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedBlockingQueue f15208a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f15209b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f15210c;

    /* renamed from: d, reason: collision with root package name */
    private volatile d f15211d;

    /* renamed from: e, reason: collision with root package name */
    private final g f15212e;

    /* renamed from: f, reason: collision with root package name */
    private final IExecutionPolicy f15213f;

    public NetworkCore(@NonNull IExecutionPolicy iExecutionPolicy) {
        this(iExecutionPolicy, new g());
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        NetworkTask networkTask = null;
        while (isRunning()) {
            try {
                synchronized (this.f15210c) {
                }
                this.f15211d = (d) this.f15208a.take();
                networkTask = this.f15211d.f15179a;
                Executor executor = networkTask.getExecutor();
                this.f15212e.getClass();
                executor.execute(new h(networkTask, this, new f()));
                networkTask.onTaskFinished();
                synchronized (this.f15210c) {
                    this.f15211d = null;
                }
            } catch (InterruptedException unused) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f15210c) {
                        this.f15211d = null;
                    }
                } else {
                    continue;
                }
            } catch (Throwable th2) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f15210c) {
                        this.f15211d = null;
                        networkTask.onTaskRemoved();
                    }
                }
                throw th2;
            }
            networkTask.onTaskRemoved();
        }
    }

    public void startTask(NetworkTask networkTask) {
        if (this.f15213f.canBeExecuted()) {
            synchronized (this.f15209b) {
                try {
                    d dVar = new d(networkTask);
                    if (isRunning() && !this.f15208a.contains(dVar) && !dVar.equals(this.f15211d) && networkTask.onTaskAdded()) {
                        this.f15208a.offer(dVar);
                    }
                } finally {
                }
            }
        }
    }

    public void stopTasks() {
        synchronized (this.f15210c) {
            try {
                ArrayList arrayList = new ArrayList(this.f15208a.size());
                this.f15208a.drainTo(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f15179a.onTaskRemoved();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public NetworkCore(IExecutionPolicy iExecutionPolicy, g gVar) {
        this.f15208a = new LinkedBlockingQueue();
        this.f15209b = new Object();
        this.f15210c = new Object();
        this.f15213f = iExecutionPolicy;
        this.f15212e = gVar;
    }
}
