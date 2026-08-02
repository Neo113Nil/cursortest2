package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class d8h implements wff {
    public final /* synthetic */ int a;
    public final wff b;
    public final wff c;

    public /* synthetic */ d8h(wff wffVar, wff wffVar2, int i) {
        this.a = i;
        this.b = wffVar;
        this.c = wffVar2;
    }

    @Override // defpackage.yff
    public final Object get() {
        int i = this.a;
        wff wffVar = this.c;
        wff wffVar2 = this.b;
        switch (i) {
            case 0:
                return new c8h((vhj) wffVar2.get(), (kjk) wffVar.get());
            default:
                return new a9h((mah) wffVar2.get(), (mah) wffVar.get());
        }
    }
}
