package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xji {
    public final aki a;
    public kna b;
    public final wji c = new wji(this, 2);
    public final wji d = new wji(this, 0);
    public final wji e = new wji(this, 1);

    public xji(aki akiVar) {
        this.a = akiVar;
    }

    public final kna a() {
        kna knaVar = this.b;
        if (knaVar != null) {
            return knaVar;
        }
        a70.p("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
