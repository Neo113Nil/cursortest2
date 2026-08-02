package defpackage;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhz;
import com.google.android.gms.measurement.internal.zzic;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.concurrent.BlockingQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class aoo extends Thread {
    public final Object a;
    public final BlockingQueue b;
    public boolean c = false;
    public final /* synthetic */ zzhz d;

    public aoo(zzhz zzhzVar, String str, BlockingQueue blockingQueue) {
        this.d = zzhzVar;
        Preconditions.i(blockingQueue);
        this.a = new Object();
        this.b = blockingQueue;
        setName(str);
    }

    public final void a() {
        zzhz zzhzVar = this.d;
        synchronized (zzhzVar.j) {
            try {
                if (!this.c) {
                    zzhzVar.k.release();
                    zzhzVar.j.notifyAll();
                    if (this == zzhzVar.d) {
                        zzhzVar.d = null;
                    } else if (this == zzhzVar.e) {
                        zzhzVar.e = null;
                    } else {
                        zzgu zzguVar = ((zzic) zzhzVar.b).f;
                        zzic.m(zzguVar);
                        zzguVar.g.a("Current scheduler thread is neither worker nor network");
                    }
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.d.k.acquire();
                z = true;
            } catch (InterruptedException e) {
                zzgu zzguVar = ((zzic) this.d.b).f;
                zzic.m(zzguVar);
                zzguVar.j.b(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.b;
                xno xnoVar = (xno) blockingQueue.poll();
                if (xnoVar != null) {
                    Process.setThreadPriority(true != xnoVar.b ? 10 : threadPriority);
                    xnoVar.run();
                } else {
                    Object obj = this.a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.d.getClass();
                            try {
                                obj.wait(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
                            } catch (InterruptedException e2) {
                                zzgu zzguVar2 = ((zzic) this.d.b).f;
                                zzic.m(zzguVar2);
                                zzguVar2.j.b(e2, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.d.j) {
                        if (this.b.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            a();
            throw th;
        }
    }
}
