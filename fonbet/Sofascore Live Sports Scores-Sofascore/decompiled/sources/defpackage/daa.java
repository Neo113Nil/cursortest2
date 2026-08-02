package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class daa extends w31 implements a1i {
    public final int g;
    public final long h;
    public final String i;
    public final bx7 j;
    public final String k;

    public daa(int i, long j, String str, bx7 bx7Var, String str2) {
        super(null, null, str, bx7Var, false);
        this.g = i;
        this.h = j;
        this.i = str;
        this.j = bx7Var;
        this.k = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof daa)) {
            return false;
        }
        daa daaVar = (daa) obj;
        return this.g == daaVar.g && this.h == daaVar.h && Intrinsics.c(this.i, daaVar.i) && this.j.equals(daaVar.j) && this.k.equals(daaVar.k);
    }

    @Override // defpackage.w31
    public final bx7 h() {
        return this.j;
    }

    public final int hashCode() {
        int c = ljg.c(Integer.hashCode(this.g) * 31, 31, this.h);
        String str = this.i;
        return this.k.hashCode() + fn0.d(this.j, (c + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    @Override // defpackage.w31
    /* renamed from: i */
    public final int getG() {
        return this.g;
    }

    @Override // defpackage.w31
    public final String j() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntroFeedCardModel(id=");
        sb.append(this.g);
        sb.append(", createdAtTimestamp=");
        sb.append(this.h);
        sb.append(", sport=");
        sb.append(this.i);
        sb.append(", event=");
        sb.append(this.j);
        return wt3.m(", startDateText=", this.k, sb, ")");
    }
}
