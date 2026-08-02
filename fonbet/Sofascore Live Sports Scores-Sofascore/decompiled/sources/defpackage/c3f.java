package defpackage;

import com.sofascore.model.odds.FeaturedOddsWithProvider;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class c3f extends w31 {
    public final int g;
    public final bx7 h;
    public final long i;
    public final String j;
    public final fy7 k;
    public final fy7 l;
    public final FeaturedOddsWithProvider m;
    public final boolean n;
    public final boolean o;

    public c3f(int i, bx7 bx7Var, long j, String str, fy7 fy7Var, fy7 fy7Var2, FeaturedOddsWithProvider featuredOddsWithProvider, boolean z, boolean z2) {
        super(null, null, str, bx7Var, true);
        this.g = i;
        this.h = bx7Var;
        this.i = j;
        this.j = str;
        this.k = fy7Var;
        this.l = fy7Var2;
        this.m = featuredOddsWithProvider;
        this.n = z;
        this.o = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3f)) {
            return false;
        }
        c3f c3fVar = (c3f) obj;
        return this.g == c3fVar.g && this.h.equals(c3fVar.h) && this.i == c3fVar.i && Intrinsics.c(this.j, c3fVar.j) && this.k.equals(c3fVar.k) && this.l.equals(c3fVar.l) && Intrinsics.c(this.m, c3fVar.m) && this.n == c3fVar.n && this.o == c3fVar.o;
    }

    @Override // defpackage.w31
    /* renamed from: g */
    public final String getI() {
        return null;
    }

    @Override // defpackage.w31
    public final bx7 h() {
        return this.h;
    }

    public final int hashCode() {
        int c = ljg.c(fn0.d(this.h, Integer.hashCode(this.g) * 29791, 31), 31, this.i);
        String str = this.j;
        int hashCode = (this.l.hashCode() + ((this.k.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        FeaturedOddsWithProvider featuredOddsWithProvider = this.m;
        return Boolean.hashCode(this.o) + dmi.e((hashCode + (featuredOddsWithProvider != null ? featuredOddsWithProvider.hashCode() : 0)) * 31, 31, this.n);
    }

    @Override // defpackage.w31
    /* renamed from: i */
    public final int getG() {
        return this.g;
    }

    @Override // defpackage.w31
    public final String j() {
        return this.j;
    }

    @Override // defpackage.w31
    /* renamed from: k */
    public final String getH() {
        return null;
    }

    public final String toString() {
        return "PreEventCardModel(id=" + this.g + ", title=null, body=null, event=" + this.h + ", createdAtTimestamp=" + this.i + ", sport=" + this.j + ", homeTeam=" + this.k + ", awayTeam=" + this.l + ", featuredOdds=" + this.m + ", wholeRoundWithoutOdds=" + this.n + ", hasSofascoreAnalyst=" + this.o + ")";
    }
}
