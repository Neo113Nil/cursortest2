package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Q5 extends AbstractC0496t4 {
    public Q5(@NonNull String str, double d10) {
        super(2, str, Double.valueOf(d10), new C0429qb(), new C0471s4(new Gb(new C0322m4(100))));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0496t4
    public final void a(@NonNull C0163fo c0163fo) {
        C0215ho c0215ho = c0163fo.f13788d;
        c0215ho.f13910c = ((Double) this.f14664f).doubleValue() + c0215ho.f13910c;
    }
}
