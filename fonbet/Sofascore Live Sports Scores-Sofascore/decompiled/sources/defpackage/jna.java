package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jna {
    public final /* synthetic */ int a;
    public final /* synthetic */ kna b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jna(kna knaVar, Object obj, int i) {
        this.a = i;
        this.b = knaVar;
        this.c = obj;
    }

    public cna b() {
        kna knaVar = this.b;
        wma wmaVar = (wma) knaVar.j.g(this.c);
        if (wmaVar != null) {
            return (cna) knaVar.f.g(wmaVar);
        }
        return null;
    }

    public final boolean c() {
        fce fceVar;
        switch (this.a) {
            case 0:
                return true;
            default:
                cna b = b();
                if (b == null || (fceVar = b.f) == null) {
                    return true;
                }
                return fceVar.c();
        }
    }

    private final void a() {
    }
}
