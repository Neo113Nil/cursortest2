package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class hng extends rmg {
    @Override // defpackage.rmg, defpackage.smg
    public final void h(wmg wmgVar) {
        if (wmgVar instanceof gng) {
            this.i.add(wmgVar);
            return;
        }
        throw new wng("Text content elements cannot contain " + wmgVar + " elements.");
    }
}
