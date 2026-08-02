package defpackage;

import com.google.android.gms.internal.measurement.zzlk;
import java.net.ProxySelector;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class l49 implements tmi {
    public static final /* synthetic */ l49 b = new l49(2);
    public final /* synthetic */ int a;

    public /* synthetic */ l49(int i) {
        this.a = i;
    }

    @Override // defpackage.tmi
    public final Object get() {
        switch (this.a) {
            case 0:
                return new jfi();
            case 1:
                return ProxySelector.getDefault();
            default:
                Object obj = zzlk.j;
                ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(qc.b);
                return newSingleThreadScheduledExecutor instanceof lvc ? (lvc) newSingleThreadScheduledExecutor : new lvc(newSingleThreadScheduledExecutor);
        }
    }
}
