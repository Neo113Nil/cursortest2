package defpackage;

import com.appsflyer.internal.i;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class il6 extends w31 implements dl6, v31 {
    public final int g;
    public final String h;
    public final String i;
    public final long j;
    public final String k;
    public final String l;
    public final String m;
    public final Long n;
    public final boolean o;
    public final x43 p;

    public il6(int i, String str, String str2, long j, String str3, String str4, String str5, Long l, boolean z, x43 x43Var) {
        super(str, str2, null, null, false, x43Var);
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = j;
        this.k = str3;
        this.l = str4;
        this.m = str5;
        this.n = l;
        this.o = z;
        this.p = x43Var;
    }

    @Override // defpackage.v31
    public final w31 a(x43 x43Var) {
        return new il6(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, x43Var);
    }

    @Override // defpackage.dl6
    public final String d() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il6)) {
            return false;
        }
        il6 il6Var = (il6) obj;
        return this.g == il6Var.g && Intrinsics.c(this.h, il6Var.h) && Intrinsics.c(this.i, il6Var.i) && this.j == il6Var.j && Intrinsics.c(this.k, il6Var.k) && Intrinsics.c(this.l, il6Var.l) && Intrinsics.c(this.m, il6Var.m) && Intrinsics.c(this.n, il6Var.n) && this.o == il6Var.o && this.p.equals(il6Var.p);
    }

    @Override // defpackage.w31
    public final x43 f() {
        return this.p;
    }

    @Override // defpackage.w31
    public final String g() {
        return this.i;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.g) * 31;
        String str = this.h;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int c = ljg.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.j);
        String str3 = this.k;
        int hashCode3 = (c + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.m;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.n;
        return this.p.hashCode() + dmi.e((hashCode5 + (l != null ? l.hashCode() : 0)) * 31, 31, this.o);
    }

    @Override // defpackage.w31
    public final int i() {
        return this.g;
    }

    @Override // defpackage.w31
    public final String k() {
        return this.h;
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.g, "ExternalVideoFeedCardModel(id=", ", title=", this.h, ", body=");
        i.n(this.j, this.i, ", createdAtTimestamp=", t);
        bf3.v(t, ", contentId=", this.k, ", externalUrl=", this.l);
        t.append(", thumbnailUrl=");
        t.append(this.m);
        t.append(", publishedAtTimestamp=");
        t.append(this.n);
        t.append(", isEmbeddable=");
        t.append(this.o);
        t.append(", additionalData=");
        t.append(this.p);
        t.append(")");
        return t.toString();
    }
}
