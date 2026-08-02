package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class iy3 implements yff {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ iy3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yff
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = 5;
                return new x6k(i2, (Context) ((iy3) obj).b, new kif(i2), new n2f(i2));
            default:
                return obj;
        }
    }
}
