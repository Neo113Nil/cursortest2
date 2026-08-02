package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class v7n extends x7n {
    public int a = 0;
    public final int b;
    public final /* synthetic */ g8n c;

    public v7n(g8n g8nVar) {
        this.c = g8nVar;
        this.b = g8nVar.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // defpackage.x7n
    public final byte zza() {
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            return this.c.c(i);
        }
        yhk.d();
        return (byte) 0;
    }
}
