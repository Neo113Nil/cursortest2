package defpackage;

import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a8b {
    public gwd a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public a8b() {
        c();
    }

    public final void a() {
        boolean z = this.d;
        gwd gwdVar = this.a;
        this.c = z ? gwdVar.g() : gwdVar.k();
    }

    public final void b(int i, View view) {
        gwd gwdVar = this.a;
        int l = Integer.MIN_VALUE == gwdVar.b ? 0 : gwdVar.l() - gwdVar.b;
        if (l >= 0) {
            boolean z = this.d;
            gwd gwdVar2 = this.a;
            if (z) {
                int b = gwdVar2.b(view);
                gwd gwdVar3 = this.a;
                this.c = (Integer.MIN_VALUE != gwdVar3.b ? gwdVar3.l() - gwdVar3.b : 0) + b;
            } else {
                this.c = gwdVar2.e(view);
            }
            this.b = i;
            return;
        }
        this.b = i;
        boolean z2 = this.d;
        gwd gwdVar4 = this.a;
        if (!z2) {
            int e = gwdVar4.e(view);
            int k = e - this.a.k();
            this.c = e;
            if (k > 0) {
                int g = (this.a.g() - Math.min(0, (this.a.g() - l) - this.a.b(view))) - (this.a.c(view) + e);
                if (g < 0) {
                    this.c -= Math.min(k, -g);
                    return;
                }
                return;
            }
            return;
        }
        int g2 = (gwdVar4.g() - l) - this.a.b(view);
        this.c = this.a.g() - g2;
        if (g2 > 0) {
            int c = this.c - this.a.c(view);
            int k2 = this.a.k();
            int min = c - (Math.min(this.a.e(view) - k2, 0) + k2);
            if (min < 0) {
                this.c = Math.min(g2, -min) + this.c;
            }
        }
    }

    public final void c() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
        sb.append(this.b);
        sb.append(", mCoordinate=");
        sb.append(this.c);
        sb.append(", mLayoutFromEnd=");
        sb.append(this.d);
        sb.append(", mValid=");
        return lnb.r(sb, this.e, '}');
    }
}
