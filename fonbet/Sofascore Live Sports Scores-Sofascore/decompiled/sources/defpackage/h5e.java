package defpackage;

import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h5e implements hqa {
    public final a6e a;
    public final int b;

    public h5e(a6e a6eVar, int i) {
        this.a = a6eVar;
        this.b = i;
    }

    @Override // defpackage.hqa
    public final int a() {
        int i;
        a6e a6eVar = this.a;
        if (a6eVar.m().a.size() == 0) {
            return 0;
        }
        int E = o6a.E(a6eVar.m());
        int i2 = a6eVar.m().b + a6eVar.m().c;
        if (i2 != 0 && (i = E / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.hqa
    public final boolean b() {
        return !this.a.m().a.isEmpty();
    }

    @Override // defpackage.hqa
    public final int c() {
        return Math.max(0, this.a.e - this.b);
    }

    @Override // defpackage.hqa
    public final int d() {
        return Math.min(r0.n() - 1, ((n1c) CollectionsKt.h0(this.a.m().a)).a + this.b);
    }

    @Override // defpackage.hqa
    public final int getItemCount() {
        return this.a.n();
    }
}
