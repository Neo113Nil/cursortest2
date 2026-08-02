package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.wearable.internal.zzko;
import com.sofascore.results.service.WatchService;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ngo extends gso {
    public final WeakReference b;
    public final WeakReference c;

    public ngo(HashMap hashMap, WatchService watchService, yro yroVar) {
        super(yroVar);
        this.b = new WeakReference(hashMap);
        this.c = new WeakReference(watchService);
    }

    @Override // com.google.android.gms.wearable.internal.zza, com.google.android.gms.wearable.internal.zzgm
    public final void f3(Status status) {
        Map map = (Map) this.b.get();
        Object obj = this.c.get();
        status.getClass();
        if (status.a == 4002 && map != null && obj != null) {
            synchronized (map) {
                try {
                    zzko zzkoVar = (zzko) map.remove(obj);
                    if (zzkoVar != null) {
                        zzkoVar.S1();
                    }
                } finally {
                }
            }
        }
        BaseImplementation.ResultHolder resultHolder = this.a;
        if (resultHolder != null) {
            resultHolder.a(status);
            this.a = null;
        }
    }
}
