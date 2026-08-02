package defpackage;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class akj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ akj(Toolbar toolbar, int i) {
        this.a = i;
        this.b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Toolbar toolbar = this.b;
        switch (i) {
            case 0:
                ckj ckjVar = toolbar.M;
                efc efcVar = ckjVar == null ? null : ckjVar.b;
                if (efcVar != null) {
                    efcVar.collapseActionView();
                    break;
                }
                break;
            default:
                toolbar.m();
                break;
        }
    }
}
