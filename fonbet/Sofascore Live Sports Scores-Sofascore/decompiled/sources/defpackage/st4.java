package defpackage;

import androidx.media3.common.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class st4 implements Comparable {
    public final boolean a;
    public final boolean b;

    public st4(b bVar, int i) {
        this.a = (bVar.e & 1) != 0;
        this.b = n51.k(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        st4 st4Var = (st4) obj;
        return w63.a.c(this.b, st4Var.b).c(this.a, st4Var.a).e();
    }
}
