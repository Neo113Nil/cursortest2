package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k75 extends l75 {
    @Override // defpackage.l75
    public final int a(int i, int i2, int i3, int i4) {
        return l75.d ? 2 : 1;
    }

    @Override // defpackage.l75
    public final float b(int i, int i2, int i3, int i4) {
        if (l75.d) {
            return Math.min(i3 / i, i4 / i2);
        }
        if (Math.max(i2 / i4, i / i3) == 0) {
            return 1.0f;
        }
        return 1.0f / Integer.highestOneBit(r0);
    }
}
