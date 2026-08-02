package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class axh extends l6a {
    public int a;
    public final /* synthetic */ zwh b;

    public axh(zwh zwhVar) {
        this.b = zwhVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.e();
    }

    @Override // defpackage.l6a
    public final int nextInt() {
        int i = this.a;
        this.a = i + 1;
        return this.b.c(i);
    }
}
