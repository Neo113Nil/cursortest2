package defpackage;

import android.hardware.SensorManager;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t1m implements n55 {
    public final /* synthetic */ SensorManager a;
    public final /* synthetic */ txl b;

    public t1m(SensorManager sensorManager, txl txlVar) {
        this.a = sensorManager;
        this.b = txlVar;
    }

    @Override // defpackage.n55
    public final void d() {
        this.a.unregisterListener(this.b);
    }
}
