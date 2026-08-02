package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class zzgg extends Thread {
    final /* synthetic */ zzgh zza;
    private final Object zzb;
    private final BlockingQueue zzc;
    private boolean zzd = false;

    public zzgg(zzgh zzghVar, String str, BlockingQueue blockingQueue) {
        this.zza = zzghVar;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.zzb = new Object();
        this.zzc = blockingQueue;
        setName(str);
    }

    private final void zzb() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        zzgg zzggVar;
        zzgg zzggVar2;
        obj = this.zza.zzh;
        synchronized (obj) {
            try {
                if (!this.zzd) {
                    semaphore = this.zza.zzi;
                    semaphore.release();
                    obj2 = this.zza.zzh;
                    obj2.notifyAll();
                    zzgh zzghVar = this.zza;
                    zzggVar = zzghVar.zzb;
                    if (this == zzggVar) {
                        zzghVar.zzb = null;
                    } else {
                        zzggVar2 = zzghVar.zzc;
                        if (this == zzggVar2) {
                            zzghVar.zzc = null;
                        } else {
                            zzghVar.zzs.zzay().zzd().zza("Current scheduler thread is neither worker nor network");
                        }
                    }
                    this.zzd = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void zzc(InterruptedException interruptedException) {
        this.zza.zzs.zzay().zzk().zzb(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        Object obj;
        boolean z11 = false;
        while (!z11) {
            try {
                semaphore = this.zza.zzi;
                semaphore.acquire();
                z11 = true;
            } catch (InterruptedException e11) {
                zzc(e11);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                zzgf zzgfVar = (zzgf) this.zzc.poll();
                if (zzgfVar != null) {
                    Process.setThreadPriority(true != zzgfVar.zza ? 10 : threadPriority);
                    zzgfVar.run();
                } else {
                    synchronized (this.zzb) {
                        if (this.zzc.peek() == null) {
                            zzgh.zzr(this.zza);
                            try {
                                this.zzb.wait(30000L);
                            } catch (InterruptedException e12) {
                                zzc(e12);
                            }
                        }
                    }
                    obj = this.zza.zzh;
                    synchronized (obj) {
                        try {
                            if (this.zzc.peek() == null) {
                                break;
                            }
                        } finally {
                        }
                    }
                }
            }
            if (this.zza.zzs.zzf().zzs(null, zzen.zzaf)) {
                zzb();
            }
            zzb();
        } catch (Throwable th2) {
            zzb();
            throw th2;
        }
    }

    public final void zza() {
        synchronized (this.zzb) {
            this.zzb.notifyAll();
        }
    }
}
