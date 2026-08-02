package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tsg implements yff {
    public final /* synthetic */ int a;
    public final yff b;
    public final yff c;
    public final yff d;

    public /* synthetic */ tsg(yff yffVar, yff yffVar2, yff yffVar3, int i) {
        this.a = i;
        this.b = yffVar;
        this.c = yffVar2;
        this.d = yffVar3;
    }

    @Override // defpackage.yff
    public final Object get() {
        int i = this.a;
        yff yffVar = this.d;
        yff yffVar2 = this.c;
        yff yffVar3 = this.b;
        switch (i) {
            case 0:
                return new sx2((Context) yffVar3.get(), (mlg) yffVar2.get(), (bv0) ((re6) yffVar).get());
            default:
                return new gyj(new kif(5), new n2f(5), (is4) ((js4) yffVar3).get(), (ji3) ((dek) yffVar2).get(), (ujg) ((ubl) yffVar).get());
        }
    }
}
