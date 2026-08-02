package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bmd extends w31 {
    public final String g;
    public final String h;
    public final long i;

    public bmd(String str, String str2, long j) {
        super(null, null, null, null, false);
        this.g = str;
        this.h = str2;
        this.i = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmd)) {
            return false;
        }
        bmd bmdVar = (bmd) obj;
        return Intrinsics.c(this.g, bmdVar.g) && Intrinsics.c(this.h, bmdVar.h) && this.i == bmdVar.i;
    }

    @Override // defpackage.w31
    /* renamed from: g */
    public final String getI() {
        return this.h;
    }

    @Override // defpackage.w31
    public final bx7 h() {
        return null;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(0) * 31;
        String str = this.g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        return ljg.c((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 961, 31, this.i);
    }

    @Override // defpackage.w31
    /* renamed from: i */
    public final int getG() {
        return 0;
    }

    @Override // defpackage.w31
    public final String j() {
        return null;
    }

    @Override // defpackage.w31
    /* renamed from: k */
    public final String getH() {
        return this.g;
    }

    public final String toString() {
        return lnb.l(this.i, ", sport=null)", mz1.s("OddsRegulationCardModel(id=0, title=", this.g, ", body=", this.h, ", event=null, createdAtTimestamp="));
    }
}
