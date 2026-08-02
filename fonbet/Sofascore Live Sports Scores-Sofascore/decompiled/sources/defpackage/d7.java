package defpackage;

import java.util.Random;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class d7 extends glf {
    @Override // defpackage.glf
    public final int a(int i) {
        return (j().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.glf
    public final int d() {
        return j().nextInt();
    }

    @Override // defpackage.glf
    public final long g() {
        return j().nextLong();
    }

    public abstract Random j();

    public final int k(int i) {
        return j().nextInt(i);
    }
}
