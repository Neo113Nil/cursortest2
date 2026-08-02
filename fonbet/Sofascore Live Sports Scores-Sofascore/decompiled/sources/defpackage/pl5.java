package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pl5 implements ol5 {
    public final int a;
    public int b = -1;
    public int c = -1;

    public pl5(int i) {
        this.a = i;
    }

    @Override // defpackage.ol5
    public final boolean d(CharSequence charSequence, int i, int i2, d6k d6kVar) {
        int i3 = this.a;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.b = i;
        this.c = i2;
        return false;
    }

    @Override // defpackage.ol5
    public final Object a() {
        return this;
    }
}
