package com.vk.media.pipeline.utils.concurrent;

import android.os.Handler;
import android.os.Looper;
import com.vk.media.pipeline.stat.ErrorStatBuilder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.baa;
import xsna.cod0;
import xsna.efz;
import xsna.f100;
import xsna.hkc0;
import xsna.j5g;
import xsna.okp0;
import xsna.on00;
import xsna.or4;
import xsna.rl3;
import xsna.xu10;
import xsna.xx8;
import xsna.zu10;

/* compiled from: ThreadStuckAnalyzer.kt */
/* loaded from: classes3.dex */
public final class ThreadStuckAnalyzer extends Thread {
    public final f100 b;
    public final long c;
    public a d;
    public cod0 e;
    public final Handler f;
    public final LinkedHashSet g;
    public volatile boolean h;
    public volatile boolean i;
    public final String j;

    /* compiled from: ThreadStuckAnalyzer.kt */
    public static final class ThreadStuckException extends RuntimeException {
    }

    /* compiled from: ThreadStuckAnalyzer.kt */
    public interface a {
        void b(ThreadStuckException threadStuckException);
    }

    public ThreadStuckAnalyzer(Looper looper, f100 f100Var, long j) {
        super("|WatchDog|");
        Thread thread;
        String name;
        this.b = f100Var;
        this.c = j;
        this.d = new hkc0(this, 5);
        this.f = looper != null ? new Handler(looper) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (looper != null) {
            linkedHashSet.add(looper.getThread().getName());
        }
        this.g = linkedHashSet;
        this.h = true;
        StringBuilder sb = new StringBuilder("Thread ");
        sb.append((looper == null || (thread = looper.getThread()) == null || (name = thread.getName()) == null) ? "" : name);
        sb.append(" is not responding for more than ");
        sb.append(j);
        sb.append("ms!");
        this.j = sb.toString();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!isInterrupted()) {
            if (this.h) {
                this.h = false;
                Handler handler = this.f;
                if (handler != null) {
                    handler.post(new or4(this, 15));
                }
            }
            try {
                Thread.sleep(this.c);
                if (!this.h && !this.i) {
                    this.i = true;
                    Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
                        if (this.g.contains(entry.getKey().getName())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(linkedHashMap.size()));
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        linkedHashMap2.put(entry2.getKey(), rl3.u0((StackTraceElement[]) entry2.getValue()));
                    }
                    f100 f100Var = this.b;
                    if (f100Var != null) {
                        f100Var.e("ThreadWatchDog", this.j + ". Dumping threads:");
                        TreeMap treeMap = new TreeMap(new xx8(5));
                        treeMap.putAll(linkedHashMap2);
                        for (Map.Entry entry3 : treeMap.entrySet()) {
                            Thread thread = (Thread) entry3.getKey();
                            List list = (List) entry3.getValue();
                            f100Var.e("ThreadWatchDog", "  " + thread.getName() + "(state=" + thread.getState() + "):");
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                f100Var.e("ThreadWatchDog", "      " + ((StackTraceElement) it.next()));
                            }
                        }
                    }
                    this.d.b(new ThreadStuckException(efz.b(this.c, UcumUtils.UCUM_MILLISECODS, new StringBuilder("Thread blocked > "))));
                    cod0 cod0Var = this.e;
                    if (cod0Var != null) {
                        StringBuilder sb = new StringBuilder();
                        TreeMap treeMap2 = new TreeMap(new baa(2));
                        treeMap2.putAll(linkedHashMap2);
                        for (Map.Entry entry4 : treeMap2.entrySet()) {
                            Thread thread2 = (Thread) entry4.getKey();
                            List list2 = (List) entry4.getValue();
                            sb.append(" " + thread2.getName() + "(state=" + thread2.getState() + "):");
                            sb.append('\n');
                            Iterator it2 = j5g.H0(list2, 5).iterator();
                            while (it2.hasNext()) {
                                sb.append("  " + ((StackTraceElement) it2.next()));
                                sb.append('\n');
                            }
                        }
                        String sb2 = sb.toString();
                        okp0 okp0Var = (okp0) cod0Var.b;
                        Thread thread3 = (Thread) cod0Var.c;
                        zu10 b = ((ErrorStatBuilder) okp0Var.f.b).b(new ThreadStuckException(sb2));
                        xu10 xu10Var = okp0Var.b;
                        if (xu10Var != null) {
                            xu10Var.c(b);
                        }
                        thread3.interrupt();
                    }
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }
}
