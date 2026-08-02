package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.view.View;
import com.google.android.gms.internal.ads.zzggg;
import com.google.android.gms.internal.ads.zzgqe;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class yfo implements zzgqe, zzggg {
    public static final String[] g = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    public final Context a;
    public final ExecutorService b;
    public long c = 0;
    public long d = 0;
    public long e = -1;
    public boolean f = false;

    public yfo(Context context, ExecutorService executorService, String[] strArr) {
        this.a = context;
        this.b = executorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final void a(HashMap hashMap, Context context, View view) {
        d();
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final void b(HashMap hashMap) {
        d();
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final void c(HashMap hashMap) {
        long j;
        long j2;
        d();
        synchronized (this) {
            try {
                j = this.f ? this.d - this.c : -1L;
            } finally {
            }
        }
        hashMap.put("vs", Long.valueOf(j));
        synchronized (this) {
            j2 = this.e;
            this.e = -1L;
        }
        hashMap.put("vf", Long.valueOf(j2));
    }

    public final void d() {
        synchronized (this) {
            try {
                if (this.f) {
                    this.d = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void e() {
        bmn bmnVar = new bmn(this, 1);
        try {
            Object systemService = this.a.getSystemService("appops");
            if (systemService == null) {
                throw null;
            }
            ((AppOpsManager) systemService).startWatchingActive(g, this.b, bmnVar);
        } catch (Throwable unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzggg
    public final ddb zza() {
        if (Build.VERSION.SDK_INT < 30) {
            return xlo.b;
        }
        emo emoVar = new emo(Executors.callable(new x3o(this, 24), null));
        this.b.execute(emoVar);
        return emoVar;
    }
}
