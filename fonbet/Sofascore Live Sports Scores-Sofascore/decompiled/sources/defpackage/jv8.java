package defpackage;

import com.google.firebase.perf.session.gauges.GaugeManager;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class jv8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ GaugeManager b;
    public final /* synthetic */ String c;
    public final /* synthetic */ of0 d;

    public /* synthetic */ jv8(GaugeManager gaugeManager, String str, of0 of0Var, int i) {
        this.a = i;
        this.b = gaugeManager;
        this.c = str;
        this.d = of0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        of0 of0Var = this.d;
        String str = this.c;
        GaugeManager gaugeManager = this.b;
        switch (i) {
            case 0:
                gaugeManager.lambda$stopCollectingGauges$3(str, of0Var);
                break;
            default:
                gaugeManager.lambda$startCollectingGauges$2(str, of0Var);
                break;
        }
    }
}
