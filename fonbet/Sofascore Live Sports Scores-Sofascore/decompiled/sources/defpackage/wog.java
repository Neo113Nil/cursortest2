package defpackage;

import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzf;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.measurement.internal.zzhz;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlj;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wog implements Executor {
    public final /* synthetic */ int a;
    public final Object b;

    public wog() {
        this.a = 2;
        this.b = new zzf(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Executor) obj).execute(new pc(1, runnable));
                return;
            case 1:
                ((zbl) obj).c.post(runnable);
                return;
            case 2:
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    ((zzf) obj).post(runnable);
                    return;
                }
                try {
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    zzt.zzc();
                    zzs.zzP(zzt.zzh().e, th);
                    throw th;
                }
            default:
                zzhz zzhzVar = ((zzic) ((zzlj) obj).b).g;
                zzic.m(zzhzVar);
                zzhzVar.Z(runnable);
                return;
        }
    }

    public /* synthetic */ wog(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
