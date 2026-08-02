package defpackage;

import android.content.ComponentName;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ca4 extends ga4 {
    public final /* synthetic */ ku3 b;
    public final /* synthetic */ String c;

    public ca4(ku3 ku3Var, String str) {
        this.b = ku3Var;
        this.c = str;
    }

    @Override // defpackage.ga4
    public final void onCustomTabsServiceConnected(ComponentName componentName, ba4 ba4Var) {
        componentName.getClass();
        hs4 hs4Var = z45.a;
        xw3.L(this.b, hq4.c, null, new r1((fa4) ba4Var, this.c, null, 13), 2);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
