package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zbl implements zti {
    public final n5h a;
    public final au3 b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final wog d = new wog(this, 1);

    public zbl(ExecutorService executorService) {
        n5h n5hVar = new n5h(executorService, 0);
        this.a = n5hVar;
        this.b = fz8.P(n5hVar);
    }
}
