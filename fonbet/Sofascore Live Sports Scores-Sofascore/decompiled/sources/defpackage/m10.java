package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.zzatj;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class m10 implements Executor {
    public final /* synthetic */ int a;
    public final Handler b;

    public m10(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new Handler(Looper.getMainLooper());
                break;
            default:
                this.b = new Handler(Looper.getMainLooper());
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Handler handler = this.b;
        switch (i) {
            case 0:
                handler.post(runnable);
                return;
            case 1:
                handler.post(runnable);
                return;
            case 2:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 3:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 4:
                handler.post(runnable);
                return;
            case 5:
                handler.post(runnable);
                return;
            case 6:
                handler.post(runnable);
                return;
            case 7:
                handler.post(runnable);
                return;
            default:
                handler.post(runnable);
                return;
        }
    }

    public m10(Looper looper) {
        this.a = 7;
        this.b = new Handler(looper);
    }

    public m10(zzatj zzatjVar, Handler handler) {
        this.a = 6;
        this.b = handler;
    }

    public /* synthetic */ m10(Handler handler, int i) {
        this.a = i;
        this.b = handler;
    }
}
