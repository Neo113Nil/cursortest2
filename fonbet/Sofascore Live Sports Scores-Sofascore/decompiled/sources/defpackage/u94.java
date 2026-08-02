package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class u94 extends ga4 {
    public final /* synthetic */ Context b;

    public u94(Context context) {
        this.b = context;
    }

    @Override // defpackage.ga4
    public final void onCustomTabsServiceConnected(ComponentName componentName, ba4 ba4Var) {
        ba4Var.d();
        this.b.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
