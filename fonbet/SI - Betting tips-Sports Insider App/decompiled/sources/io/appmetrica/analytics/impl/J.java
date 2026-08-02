package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.OuterStateToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.SavableToggle;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final Ze f12397a = C0353na.k().y();

    /* renamed from: b, reason: collision with root package name */
    public final SavableToggle f12398b;

    /* renamed from: c, reason: collision with root package name */
    public final OuterStateToggle f12399c;

    /* renamed from: d, reason: collision with root package name */
    public final OuterStateToggle f12400d;

    /* renamed from: e, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f12401e;

    /* renamed from: f, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f12402f;

    /* renamed from: g, reason: collision with root package name */
    public final SavableToggle f12403g;

    public J(C0161fm c0161fm) {
        SavableToggle savableToggle = new SavableToggle("advIdsFromClientApi", new I(this));
        this.f12398b = savableToggle;
        OuterStateToggle outerStateToggle = new OuterStateToggle(false, "GAID-remote-config");
        this.f12399c = outerStateToggle;
        OuterStateToggle outerStateToggle2 = new OuterStateToggle(false, "HOAID-remote-config");
        this.f12400d = outerStateToggle2;
        this.f12401e = new ConjunctiveCompositeThreadSafeToggle(kotlin.collections.u.f(savableToggle, outerStateToggle), "GAID");
        this.f12402f = new ConjunctiveCompositeThreadSafeToggle(kotlin.collections.u.f(savableToggle, outerStateToggle2), "HOAID");
        this.f12403g = savableToggle;
        a(c0161fm);
    }

    public final void a(C0161fm c0161fm) {
        boolean z5 = c0161fm.f13767p;
        boolean z7 = true;
        this.f12399c.update(!z5 || c0161fm.f13765n.f14166c);
        OuterStateToggle outerStateToggle = this.f12400d;
        if (z5 && !c0161fm.f13765n.f14168e) {
            z7 = false;
        }
        outerStateToggle.update(z7);
    }

    public final G a() {
        int i5;
        int i10 = 3;
        int i11 = 4;
        if (this.f12401e.getActualState()) {
            i5 = 1;
        } else if (this.f12398b.getActualState()) {
            i5 = !this.f12399c.getActualState() ? 3 : 4;
        } else {
            i5 = 2;
        }
        if (this.f12402f.getActualState()) {
            i10 = 1;
        } else if (!this.f12398b.getActualState()) {
            i10 = 2;
        } else if (this.f12400d.getActualState()) {
            i10 = 4;
        }
        if (this.f12403g.getActualState()) {
            i11 = 1;
        } else if (!this.f12398b.getActualState()) {
            i11 = 2;
        }
        return new G(i5, i10, i11);
    }
}
