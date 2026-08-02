package defpackage;

import android.content.Context;
import android.net.NetworkCapabilities;
import android.view.View;
import com.google.android.gms.internal.ads.zzggg;
import com.google.android.gms.internal.ads.zzgqe;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tfo implements zzgqe, zzggg {
    public final Context a;
    public final ExecutorService b;
    public NetworkCapabilities c = null;

    public tfo(Context context, ExecutorService executorService) {
        this.a = context;
        this.b = executorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final void c(HashMap hashMap) {
        NetworkCapabilities networkCapabilities;
        long j;
        synchronized (this) {
            networkCapabilities = this.c;
        }
        hashMap.put("ntc", networkCapabilities);
        synchronized (this) {
            try {
                NetworkCapabilities networkCapabilities2 = this.c;
                if (networkCapabilities2 != null) {
                    if (networkCapabilities2.hasTransport(4)) {
                        j = 2;
                    } else if (this.c.hasTransport(1)) {
                        j = 1;
                    } else if (this.c.hasTransport(0)) {
                        j = 0;
                    }
                }
                j = -1;
            } finally {
            }
        }
        hashMap.put("nt", Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzggg
    public final ddb zza() {
        emo emoVar = new emo(Executors.callable(new x3o(this, 23), null));
        this.b.execute(emoVar);
        return emoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final void b(HashMap hashMap) {
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final void a(HashMap hashMap, Context context, View view) {
    }
}
