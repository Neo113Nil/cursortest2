package com.mbridge.msdk.tracker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
class q implements l {
    private final g a;

    public q(g gVar) {
        this.a = gVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public long[] a() {
        return y.b(this.a) ? new long[]{0, 0} : this.a.a();
    }

    @Override // com.mbridge.msdk.tracker.l
    public void b(e eVar) {
        if (y.b(this.a)) {
            return;
        }
        try {
            h j = eVar.j();
            if (y.a(j)) {
                eVar.a(j.a(eVar));
            }
            this.a.b(eVar);
        } catch (Exception unused) {
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public void a(e eVar) {
        if (y.b(this.a)) {
            return;
        }
        this.a.a(eVar);
    }
}
