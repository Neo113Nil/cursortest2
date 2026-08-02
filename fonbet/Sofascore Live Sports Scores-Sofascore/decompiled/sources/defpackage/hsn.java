package defpackage;

import com.google.android.gms.internal.ads.zzhbu;
import com.ironsource.U3;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class hsn extends zzhbu {
    public final /* synthetic */ int a = 0;
    public final Executor b;

    public hsn(ExecutorService executorService) {
        executorService.getClass();
        this.b = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.b).awaitTermination(j, timeUnit);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                this.b.execute(runnable);
                break;
            default:
                ((ExecutorService) this.b).execute(runnable);
                break;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.b).isShutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.b).isTerminated();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                ((ExecutorService) this.b).shutdown();
                return;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.b).shutdownNow();
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                ExecutorService executorService = (ExecutorService) this.b;
                String obj = super.toString();
                String valueOf = String.valueOf(executorService);
                return fc6.o(new StringBuilder(wt3.B(String.valueOf(obj).length(), 1, valueOf.length(), 1)), obj, U3.j.d, valueOf, U3.j.e);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ hsn(Executor executor) {
        this.b = executor;
    }
}
