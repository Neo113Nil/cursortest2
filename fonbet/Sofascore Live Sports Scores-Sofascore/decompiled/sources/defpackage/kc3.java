package defpackage;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class kc3 implements vff {
    public final /* synthetic */ int a;

    public /* synthetic */ kc3(int i) {
        this.a = i;
    }

    @Override // defpackage.vff
    public final Object get() {
        xv3 lambda$new$0;
        rec lambda$new$1;
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                koa koaVar = ExecutorsRegistrar.a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                detectNetwork.detectResourceMismatches();
                detectNetwork.detectUnbufferedIo();
                return new iw4(Executors.newFixedThreadPool(4, new la4("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 2:
                koa koaVar2 = ExecutorsRegistrar.a;
                return new iw4(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new la4("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                koa koaVar3 = ExecutorsRegistrar.a;
                return new iw4(Executors.newCachedThreadPool(new la4("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                koa koaVar4 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new la4("Firebase Scheduler", 0, null));
            case 5:
                return null;
            case 6:
                return Executors.newSingleThreadScheduledExecutor();
            case 7:
                lambda$new$0 = GaugeManager.lambda$new$0();
                return lambda$new$0;
            case 8:
                lambda$new$1 = GaugeManager.lambda$new$1();
                return lambda$new$1;
            case 9:
            default:
                return null;
        }
    }
}
