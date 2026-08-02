package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class hea extends cea {
    public final h2h e;
    public final /* synthetic */ kea f;

    public hea(kea keaVar, h2h h2hVar) {
        this.f = keaVar;
        this.e = h2hVar;
    }

    @Override // defpackage.cea
    public final boolean l() {
        return false;
    }

    @Override // defpackage.cea
    public final void m(Throwable th) {
        kea keaVar = this.f;
        Object O = keaVar.O();
        if (!(O instanceof eb3)) {
            O = lea.a(O);
        }
        this.e.i(keaVar, O);
    }
}
