package defpackage;

import androidx.compose.runtime.e;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yqa implements cdi {
    public final int a;
    public final int b;
    public final e1d c;
    public int d;

    public yqa(int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        int i4 = (i / i2) * i2;
        this.c = e.e(llf.j(Math.max(i4 - i3, 0), i4 + i2 + i3), wib.i);
        this.d = i;
    }

    public final void c(int i) {
        if (i != this.d) {
            this.d = i;
            int i2 = this.a;
            int i3 = (i / i2) * i2;
            int i4 = this.b;
            ((eoh) this.c).setValue(llf.j(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }

    @Override // defpackage.cdi
    public final Object getValue() {
        return (IntRange) ((eoh) this.c).getValue();
    }
}
