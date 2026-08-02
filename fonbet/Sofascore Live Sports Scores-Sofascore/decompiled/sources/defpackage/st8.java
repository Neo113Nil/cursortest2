package defpackage;

import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class st8 extends c4 implements Runnable {
    public ddb h;

    @Override // defpackage.g4
    public final void c() {
        this.h = null;
    }

    @Override // defpackage.g4
    public final String j() {
        ddb ddbVar = this.h;
        if (ddbVar == null) {
            return null;
        }
        return "delegate=[" + ddbVar + U3.j.e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ddb ddbVar = this.h;
        if (ddbVar != null) {
            n(ddbVar);
        }
    }
}
