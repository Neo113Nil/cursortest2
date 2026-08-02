package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class xl5 implements k0a {
    public final boolean a;

    public xl5(boolean z) {
        this.a = z;
    }

    @Override // defpackage.k0a
    public final ydd b() {
        return null;
    }

    @Override // defpackage.k0a
    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        return lnb.q(new StringBuilder("Empty{"), this.a ? "Active" : "New", '}');
    }
}
