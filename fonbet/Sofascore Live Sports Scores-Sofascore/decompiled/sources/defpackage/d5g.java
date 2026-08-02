package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class d5g extends m4 {
    public int a;
    public int b;
    public final /* synthetic */ e5g c;

    public d5g(e5g e5gVar) {
        this.c = e5gVar;
        this.a = e5gVar.size();
        this.b = e5gVar.c;
    }

    @Override // defpackage.m4
    public final void computeNext() {
        if (this.a == 0) {
            done();
            return;
        }
        e5g e5gVar = this.c;
        setNext(e5gVar.a[this.b]);
        this.b = (this.b + 1) % e5gVar.b;
        this.a--;
    }
}
