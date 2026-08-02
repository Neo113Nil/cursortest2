package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.wearable.zzq;
import com.google.android.gms.wearable.WearableListenerService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class r8p extends zzq {
    public boolean a;
    public final yw9 b;
    public final /* synthetic */ WearableListenerService c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8p(WearableListenerService wearableListenerService, Looper looper) {
        super(looper);
        this.c = wearableListenerService;
        Looper.getMainLooper();
        this.b = new yw9(1);
    }

    @Override // com.google.android.gms.internal.wearable.zzq
    public final void a(Message message) {
        synchronized (this) {
            try {
                if (!this.a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        "bindService: ".concat(String.valueOf(this.c.a));
                    }
                    WearableListenerService wearableListenerService = this.c;
                    wearableListenerService.bindService(wearableListenerService.d, this.b, 1);
                    this.a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            super.a(message);
            if (hasMessages(0)) {
                return;
            }
            b("dispatch");
        } catch (Throwable th2) {
            if (!hasMessages(0)) {
                b("dispatch");
            }
            throw th2;
        }
    }

    public final synchronized void b(String str) {
        if (this.a) {
            if (Log.isLoggable("WearableLS", 2)) {
                WearableListenerService wearableListenerService = this.c;
                new StringBuilder(str.length() + 17 + String.valueOf(wearableListenerService.a).length());
            }
            try {
                this.c.unbindService(this.b);
            } catch (RuntimeException unused) {
            }
            this.a = false;
        }
    }
}
