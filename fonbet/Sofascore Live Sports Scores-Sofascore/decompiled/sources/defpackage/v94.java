package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v94 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ aa4 c;

    public /* synthetic */ v94(aa4 aa4Var, Bundle bundle, int i) {
        this.a = i;
        this.c = aa4Var;
        this.b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Bundle bundle = this.b;
        aa4 aa4Var = this.c;
        switch (i) {
            case 0:
                aa4Var.b.onUnminimized(bundle);
                break;
            default:
                aa4Var.b.onMinimized(bundle);
                break;
        }
    }
}
