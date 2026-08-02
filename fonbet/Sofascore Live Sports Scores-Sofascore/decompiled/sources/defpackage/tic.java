package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tic implements yff {
    public final /* synthetic */ int a;
    public final yff b;
    public final yff c;

    public /* synthetic */ tic(yff yffVar, yff yffVar2, int i) {
        this.a = i;
        this.b = yffVar;
        this.c = yffVar2;
    }

    @Override // defpackage.yff
    public final Object get() {
        int i = this.a;
        yff yffVar = this.b;
        switch (i) {
            case 0:
                return new sic((Context) ((iy3) yffVar).b, (x6k) ((iy3) this.c).get());
            default:
                return new mlg(new kif(5), new n2f(5), eu0.f, (ysg) yffVar.get(), this.c);
        }
    }
}
