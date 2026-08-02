package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lc9 extends y41 {
    public final List d;
    public final long e;

    public lc9(long j, List list) {
        super(0L, list.size() - 1);
        this.e = j;
        this.d = list;
    }

    @Override // defpackage.k2c
    public final long a() {
        c();
        return this.e + ((xc9) this.d.get((int) this.c)).e;
    }

    @Override // defpackage.k2c
    public final long b() {
        c();
        xc9 xc9Var = (xc9) this.d.get((int) this.c);
        return this.e + xc9Var.e + xc9Var.c;
    }
}
