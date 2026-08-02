package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j8j implements g8j {
    public final long a;
    public final /* synthetic */ k8j b;

    public j8j(k8j k8jVar, long j) {
        this.b = k8jVar;
        this.a = j;
    }

    @Override // defpackage.g8j
    public final f8j R() {
        return qea.o(this.b);
    }

    @Override // defpackage.g8j
    public final long m0(dma dmaVar) {
        dma dmaVar2 = (dma) ((eoh) this.b.r).getValue();
        if (dmaVar2 != null) {
            return dmaVar.l(dmaVar2, this.a);
        }
        u3a.d("Tried to open context menu before the anchor was placed.");
        pvd.x();
        return 0L;
    }

    @Override // defpackage.g8j
    public final oqf p0(dma dmaVar) {
        return jca.r(m0(dmaVar), 0L);
    }
}
