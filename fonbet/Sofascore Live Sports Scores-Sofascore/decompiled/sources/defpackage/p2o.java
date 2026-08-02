package defpackage;

import com.google.android.gms.internal.measurement.zzez;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class p2o implements ThreadFactory {
    public final /* synthetic */ int a;
    public final ThreadFactory b;

    public /* synthetic */ p2o(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = Executors.defaultThreadFactory();
                break;
            default:
                this.b = Executors.defaultThreadFactory();
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        ThreadFactory threadFactory = this.b;
        switch (i) {
            case 0:
                Thread newThread = threadFactory.newThread(runnable);
                newThread.setName("ScionFrontendApi");
                break;
            case 1:
                Thread newThread2 = threadFactory.newThread(runnable);
                if (newThread2 == null) {
                    yhk.s("Default ThreadFactory returned null thread");
                    break;
                } else {
                    newThread2.setName("punch".concat(String.valueOf(newThread2.getName())));
                    break;
                }
            default:
                Thread newThread3 = threadFactory.newThread(runnable);
                if (newThread3 == null) {
                    yhk.s("Default ThreadFactory returned null thread");
                    break;
                } else {
                    newThread3.setName("punch".concat(String.valueOf(newThread3.getName())));
                    break;
                }
        }
        return null;
    }

    public p2o(zzez zzezVar) {
        this.a = 0;
        this.b = Executors.defaultThreadFactory();
    }
}
