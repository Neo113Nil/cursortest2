package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class k9 {
    public int a;
    public int b;
    public int c;

    public k9(int i, int i2) {
        int i3 = (i2 & 2) != 0 ? i : 1;
        int i4 = (i2 & 8) != 0 ? i * 3 : 5;
        this.a = i;
        this.b = i3;
        this.c = i4;
        if (i3 != 0) {
            return;
        }
        a70.p("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        throw null;
    }

    public /* synthetic */ k9(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
