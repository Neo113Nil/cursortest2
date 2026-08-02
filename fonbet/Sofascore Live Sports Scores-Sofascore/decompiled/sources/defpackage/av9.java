package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class av9 extends i4 {
    public final hv9 c;

    public av9(hv9 hv9Var, int i) {
        super(hv9Var.size(), i);
        this.c = hv9Var;
    }

    @Override // defpackage.i4
    public final Object a(int i) {
        return this.c.get(i);
    }
}
