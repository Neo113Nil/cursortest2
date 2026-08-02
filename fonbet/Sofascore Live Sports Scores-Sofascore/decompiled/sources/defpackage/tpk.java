package defpackage;

import android.hardware.display.DisplayManager;
import android.os.Handler;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tpk implements spk, DisplayManager.DisplayListener {
    public final DisplayManager a;
    public bnk b;

    public tpk(DisplayManager displayManager) {
        this.a = displayManager;
    }

    @Override // defpackage.spk
    public final void d(bnk bnkVar) {
        this.b = bnkVar;
        Handler j = lik.j(null);
        DisplayManager displayManager = this.a;
        displayManager.registerDisplayListener(this, j);
        bnkVar.d(displayManager.getDisplay(0));
    }

    @Override // defpackage.spk
    public final void h() {
        this.a.unregisterDisplayListener(this);
        this.b = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        bnk bnkVar = this.b;
        if (bnkVar == null || i != 0) {
            return;
        }
        bnkVar.d(this.a.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
