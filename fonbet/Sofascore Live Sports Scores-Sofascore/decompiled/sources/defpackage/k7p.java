package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k7p extends cga {
    private k7p() {
        throw null;
    }

    @Override // defpackage.cga
    public final int V(o7p o7pVar) {
        int i;
        synchronized (o7pVar) {
            i = o7pVar.i - 1;
            o7pVar.i = i;
        }
        return i;
    }
}
