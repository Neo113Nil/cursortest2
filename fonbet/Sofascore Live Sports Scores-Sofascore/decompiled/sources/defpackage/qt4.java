package defpackage;

import androidx.media3.common.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qt4 extends eu4 implements Comparable {
    public final int e;
    public final int f;

    public qt4(int i, osj osjVar, int i2, wt4 wt4Var, int i3) {
        super(i, osjVar, i2);
        int i4;
        this.e = n51.k(i3, wt4Var.D) ? 1 : 0;
        b bVar = this.d;
        int i5 = bVar.v;
        int i6 = -1;
        if (i5 != -1 && (i4 = bVar.w) != -1) {
            i6 = i5 * i4;
        }
        this.f = i6;
    }

    @Override // defpackage.eu4
    public final int a() {
        return this.e;
    }

    @Override // defpackage.eu4
    public final boolean b(eu4 eu4Var) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f, ((qt4) obj).f);
    }
}
