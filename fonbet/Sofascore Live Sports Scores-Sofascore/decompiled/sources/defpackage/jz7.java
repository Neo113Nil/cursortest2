package defpackage;

import android.view.View;
import android.view.WindowManager;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jz7 extends zoi {
    public final /* synthetic */ WindowManager.LayoutParams n;
    public final /* synthetic */ WindowManager o;
    public final /* synthetic */ y0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz7(View view, hpo hpoVar, WindowManager.LayoutParams layoutParams, WindowManager windowManager, y0 y0Var) {
        super(view, hpoVar);
        this.n = layoutParams;
        this.o = windowManager;
        this.p = y0Var;
    }

    @Override // defpackage.zoi
    public final float b() {
        return this.n.x;
    }

    @Override // defpackage.zoi
    public final void c(float f) {
        WindowManager.LayoutParams layoutParams = this.n;
        layoutParams.x = (int) f;
        this.o.updateViewLayout(this.p.i(), layoutParams);
    }
}
