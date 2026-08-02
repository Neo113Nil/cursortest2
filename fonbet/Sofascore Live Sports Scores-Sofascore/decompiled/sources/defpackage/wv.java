package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wv implements vfc {
    public final kv1 a;
    public final kv1 b;
    public final int c;

    public wv(kv1 kv1Var, kv1 kv1Var2, int i) {
        this.a = kv1Var;
        this.b = kv1Var2;
        this.c = i;
    }

    @Override // defpackage.vfc
    public final int a(x6a x6aVar, long j, int i, ema emaVar) {
        int a = this.b.a(0, x6aVar.d(), emaVar);
        int i2 = -this.a.a(0, i, emaVar);
        ema emaVar2 = ema.a;
        int i3 = this.c;
        if (emaVar != emaVar2) {
            i3 = -i3;
        }
        return wt3.B(x6aVar.a, a, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv)) {
            return false;
        }
        wv wvVar = (wv) obj;
        return this.a.equals(wvVar.a) && this.b.equals(wvVar.b) && this.c == wvVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + fc6.a(this.b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return wv8.j(sb, this.c, ')');
    }
}
