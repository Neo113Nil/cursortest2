package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class mt4 implements cu4, hyj {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mt4(boolean z, Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.a = z;
        this.d = obj3;
    }

    @Override // defpackage.hyj
    public void a(Exception exc) {
        kzf kzfVar = (kzf) this.b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
        ps0 ps0Var = (ps0) this.d;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.a) {
            boolean z = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new gjc(26, kzfVar, countDownLatch)).start();
            ExecutorService executorService = sik.a;
            boolean z2 = false;
            try {
                long j = 2000000000;
                long nanoTime = System.nanoTime() + 2000000000;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(j, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th) {
                            th = th;
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        j = nanoTime - System.nanoTime();
                        z2 = true;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th2) {
                th = th2;
                z = z2;
            }
        }
        taskCompletionSource.trySetResult(ps0Var);
    }

    @Override // defpackage.cu4
    public vvf c(int i, osj osjVar, int[] iArr) {
        iu4 iu4Var = (iu4) this.b;
        wt4 wt4Var = (wt4) this.c;
        int[] iArr2 = (int[]) this.d;
        iu4Var.getClass();
        jt4 jt4Var = new jt4(iu4Var, wt4Var);
        int i2 = iArr2[i];
        zu9 s = hv9.s();
        for (int i3 = 0; i3 < osjVar.a; i3++) {
            s.c(new pt4(i, osjVar, i3, wt4Var, iArr[i3], this.a, jt4Var, i2));
        }
        return s.g();
    }
}
