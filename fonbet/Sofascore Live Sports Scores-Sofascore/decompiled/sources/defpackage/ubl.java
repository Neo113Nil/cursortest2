package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ubl implements yff {
    public final yff a;
    public final yff b;
    public final tsg c;
    public final yff d;

    public ubl(yff yffVar, yff yffVar2, tsg tsgVar, yff yffVar3) {
        this.a = yffVar;
        this.b = yffVar2;
        this.c = tsgVar;
        this.d = yffVar3;
    }

    @Override // defpackage.yff
    public final Object get() {
        return new ujg(26, (Executor) this.a.get(), (mlg) this.b.get(), (sx2) this.c.get(), (mlg) this.d.get(), false);
    }
}
