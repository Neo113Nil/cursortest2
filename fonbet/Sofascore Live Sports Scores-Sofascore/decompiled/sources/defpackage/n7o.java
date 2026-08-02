package defpackage;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzfbc;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class n7o implements Callable {
    public static final /* synthetic */ n7o a = new n7o();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        Runtime runtime = Runtime.getRuntime();
        bundle.putLong("runtime_free", runtime.freeMemory());
        bundle.putLong("runtime_max", runtime.maxMemory());
        bundle.putLong("runtime_total", runtime.totalMemory());
        bundle.putInt("web_view_count", zzt.zzh().k.get());
        if (((Boolean) zzba.zzc().a(zzbjg.hg)).booleanValue()) {
            ActivityManager.MemoryInfo zze = zzf.zze(zzt.zzh().e);
            if (zze != null) {
                if (Build.VERSION.SDK_INT >= 34) {
                    bundle.putLong("a_ad_mem", zze.advertisedMem);
                }
                bundle.putLong("a_total", zze.totalMem);
                bundle.putLong("a_avai", zze.availMem);
                bundle.putLong("a_threshold", zze.threshold);
                bundle.putBoolean("a_is_low_mem", zze.lowMemory);
            }
            bundle.putLong("runtime_avai_processors", runtime.availableProcessors());
        }
        return new zzfbc(bundle);
    }
}
