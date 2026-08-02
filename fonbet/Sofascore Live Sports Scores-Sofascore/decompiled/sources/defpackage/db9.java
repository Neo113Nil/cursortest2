package defpackage;

import com.google.android.gms.wearable.WearableListenerService;
import com.sofascore.results.service.WatchService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class db9 extends WearableListenerService implements vv8 {
    public volatile r6h i;
    public final Object j = new Object();
    public boolean k = false;

    @Override // defpackage.uv8
    public final Object f() {
        if (this.i == null) {
            synchronized (this.j) {
                try {
                    if (this.i == null) {
                        this.i = new r6h(this);
                    }
                } finally {
                }
            }
        }
        return this.i.f();
    }

    @Override // com.google.android.gms.wearable.WearableListenerService, android.app.Service
    public void onCreate() {
        if (!this.k) {
            this.k = true;
            ((WatchService) this).p = (qa6) ((kc4) ((szk) f())).a.K.get();
        }
        super.onCreate();
    }
}
