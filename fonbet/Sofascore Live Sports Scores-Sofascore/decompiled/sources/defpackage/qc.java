package defpackage;

import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.measurement.zzlk;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qc implements ThreadFactory {
    public static final /* synthetic */ qc b = new qc(4);
    public final /* synthetic */ int a;

    public /* synthetic */ qc(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new Thread(new pc(0, runnable), "glide-active-resources");
            case 1:
                return new vk0(runnable);
            case 2:
                return new vk0(2, "fonts-androidx", runnable);
            case 3:
                String str = zzfm.a;
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            default:
                Object obj = zzlk.j;
                return new Thread(runnable, "ProcessStablePhenotypeFlag");
        }
    }
}
