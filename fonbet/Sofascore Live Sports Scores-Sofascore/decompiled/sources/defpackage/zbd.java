package defpackage;

import com.appsflyer.internal.i;
import com.sofascore.model.newNetwork.NewsProvider;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zbd extends w31 implements dl6 {
    public final int g;
    public final String h;
    public final String i;
    public final long j;
    public final String k;
    public final String l;
    public final String m;
    public final long n;
    public final NewsProvider o;

    public zbd(int i, String str, String str2, long j, String str3, String str4, String str5, long j2, NewsProvider newsProvider) {
        super(str, str2, null, null, false);
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = j;
        this.k = str3;
        this.l = str4;
        this.m = str5;
        this.n = j2;
        this.o = newsProvider;
    }

    @Override // defpackage.dl6
    /* renamed from: d */
    public final String getK() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbd)) {
            return false;
        }
        zbd zbdVar = (zbd) obj;
        return this.g == zbdVar.g && Intrinsics.c(this.h, zbdVar.h) && Intrinsics.c(this.i, zbdVar.i) && this.j == zbdVar.j && Intrinsics.c(this.k, zbdVar.k) && Intrinsics.c(this.l, zbdVar.l) && Intrinsics.c(this.m, zbdVar.m) && this.n == zbdVar.n && Intrinsics.c(this.o, zbdVar.o);
    }

    @Override // defpackage.w31
    /* renamed from: g */
    public final String getI() {
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
        int c2 = ljg.c((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.n);
        NewsProvider newsProvider = this.o;
        return c2 + (newsProvider != null ? newsProvider.hashCode() : 0);
    }

    @Override // defpackage.w31
    /* renamed from: i */
    public final int getG() {
        return this.g;
    }

    @Override // defpackage.w31
    /* renamed from: k */
    public final String getH() {
        return this.h;
    }

    public final ecd n() {
        String str = this.h;
        String B = str != null ? jca.B(str) : null;
        String str2 = this.i;
        return new ecd(this.g, B, str2 != null ? jca.B(str2) : null, this.n, this.l, this.m, this.o);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.g, "NewsCardFeedModel(id=", ", title=", this.h, ", body=");
        i.n(this.j, this.i, ", createdAtTimestamp=", t);
        bf3.v(t, ", contentId=", this.k, ", externalUrl=", this.l);
        wt3.A(", thumbnailUrl=", this.m, t, ", publishedAtTimestamp=");
        t.append(this.n);
        t.append(", newsProvider=");
        t.append(this.o);
        t.append(")");
        return t.toString();
    }
}
