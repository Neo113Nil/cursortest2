package defpackage;

import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.internal.zzx;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class u8p implements Runnable {
    public final /* synthetic */ zzx a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public u8p(y9p y9pVar, zzx zzxVar, String str, String str2) {
        this.a = zzxVar;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Cast.MessageReceivedCallback messageReceivedCallback;
        zzx zzxVar = this.a;
        synchronized (zzxVar.L) {
            messageReceivedCallback = (Cast.MessageReceivedCallback) zzxVar.L.get(this.b);
        }
        if (messageReceivedCallback != null) {
            messageReceivedCallback.a(this.c);
        } else {
            zzx.a0.a("Discarded message for unknown namespace '%s'", this.b);
        }
    }
}
