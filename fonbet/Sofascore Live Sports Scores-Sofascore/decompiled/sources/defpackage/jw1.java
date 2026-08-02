package defpackage;

import android.app.Application;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jw1 implements uff {
    public final /* synthetic */ int a;
    public final uff b;

    public /* synthetic */ jw1(uff uffVar, int i) {
        this.a = i;
        this.b = uffVar;
    }

    @Override // defpackage.yff
    public final Object get() {
        int i = this.a;
        uff uffVar = this.b;
        switch (i) {
            case 0:
                return new iw1((Application) uffVar.get());
            default:
                return new iz7((n0g) uffVar.get());
        }
    }
}
