package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class fe0 implements zff {
    public final /* synthetic */ int a;
    public final f4a b;

    public /* synthetic */ fe0(f4a f4aVar, int i) {
        this.a = i;
        this.b = f4aVar;
    }

    @Override // defpackage.yff
    public final Object get() {
        int i = this.a;
        f4a f4aVar = this.b;
        switch (i) {
            case 0:
                return (hgf) f4aVar.b;
            default:
                hki hkiVar = (hki) f4aVar.c;
                i2a.v(hkiVar);
                return hkiVar;
        }
    }
}
