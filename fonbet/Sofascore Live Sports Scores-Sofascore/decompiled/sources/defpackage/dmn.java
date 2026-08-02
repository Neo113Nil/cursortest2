package defpackage;

import android.os.SystemClock;
import com.google.android.gms.internal.play_billing.zzbq;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dmn extends zzbq {
    public final /* synthetic */ int b;

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final long a() {
        switch (this.b) {
            case 0:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}
