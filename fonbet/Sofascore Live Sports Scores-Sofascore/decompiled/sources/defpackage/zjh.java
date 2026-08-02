package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lzjh;", "Lbuc;", "Lfkh;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class zjh extends buc {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    public zjh(float f, float f2, float f3, float f4, boolean z, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z);
    }

    @Override // defpackage.buc
    public final wtc c() {
        fkh fkhVar = new fkh();
        fkhVar.o = this.a;
        fkhVar.p = this.b;
        fkhVar.q = this.c;
        fkhVar.r = this.d;
        fkhVar.s = this.e;
        return fkhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjh)) {
            return false;
        }
        zjh zjhVar = (zjh) obj;
        return p75.b(this.a, zjhVar.a) && p75.b(this.b, zjhVar.b) && p75.b(this.c, zjhVar.c) && p75.b(this.d, zjhVar.d) && this.e == zjhVar.e;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        fkh fkhVar = (fkh) wtcVar;
        fkhVar.o = this.a;
        fkhVar.p = this.b;
        fkhVar.q = this.c;
        fkhVar.r = this.d;
        fkhVar.s = this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + fc6.a(this.d, fc6.a(this.c, fc6.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public zjh(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }
}
