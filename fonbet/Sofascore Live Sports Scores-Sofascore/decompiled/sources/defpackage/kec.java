package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kec implements skd {
    public final keb a;
    public final skd b;
    public int c = -1;

    public kec(keb kebVar, skd skdVar) {
        this.a = kebVar;
        this.b = skdVar;
    }

    @Override // defpackage.skd
    public final void h(Object obj) {
        int i = this.c;
        int i2 = this.a.g;
        if (i != i2) {
            this.c = i2;
            this.b.h(obj);
        }
    }
}
