package defpackage;

import com.google.android.gms.internal.ads.zzaco;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class v8n implements zzaco {
    public final /* synthetic */ Executor a;

    public v8n(ExecutorService executorService) {
        this.a = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
