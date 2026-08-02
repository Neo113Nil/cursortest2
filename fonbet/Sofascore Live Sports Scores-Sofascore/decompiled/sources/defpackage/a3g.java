package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class a3g extends cea {
    public final eea e;

    public a3g(eea eeaVar) {
        this.e = eeaVar;
    }

    @Override // defpackage.cea
    public final boolean l() {
        return false;
    }

    @Override // defpackage.cea
    public final void m(Throwable th) {
        Object O = k().O();
        boolean z = O instanceof eb3;
        eea eeaVar = this.e;
        if (z) {
            p2g p2gVar = w2g.b;
            eeaVar.resumeWith(y6a.x(((eb3) O).a));
        } else {
            p2g p2gVar2 = w2g.b;
            eeaVar.resumeWith(lea.a(O));
        }
    }
}
