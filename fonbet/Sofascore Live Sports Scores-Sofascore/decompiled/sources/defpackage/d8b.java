package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class d8b implements iub {
    public final int a;
    public final int b;
    public final int c;

    public d8b(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.iub
    public final String a(wcd wcdVar) {
        int i = wcdVar.a.d;
        return String.valueOf(llf.c(i - (i % this.c), this.a, this.b));
    }
}
