package c;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26744a;

    /* renamed from: b, reason: collision with root package name */
    public final double f26745b;

    /* renamed from: c, reason: collision with root package name */
    public final List f26746c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26747d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26748e;

    /* renamed from: f, reason: collision with root package name */
    public final String f26749f;

    /* renamed from: g, reason: collision with root package name */
    public final String f26750g;

    /* renamed from: h, reason: collision with root package name */
    public final String f26751h;

    /* renamed from: i, reason: collision with root package name */
    public final String f26752i;

    /* renamed from: j, reason: collision with root package name */
    public final String f26753j;

    public z0(boolean z10, double d10, List list, boolean z11, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f26744a = z10;
        this.f26745b = d10;
        this.f26746c = list;
        this.f26747d = z11;
        this.f26748e = str;
        this.f26749f = str2;
        this.f26750g = str3;
        this.f26751h = str4;
        this.f26752i = str5;
        this.f26753j = str6;
    }

    public final String a() {
        return this.f26748e;
    }

    public final String b() {
        return this.f26753j;
    }

    public final String c() {
        return this.f26752i;
    }

    public final String d() {
        return this.f26749f;
    }

    public final String e() {
        return this.f26750g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.f26744a == z0Var.f26744a && Double.compare(this.f26745b, z0Var.f26745b) == 0 && Intrinsics.areEqual(this.f26746c, z0Var.f26746c) && this.f26747d == z0Var.f26747d && Intrinsics.areEqual(this.f26748e, z0Var.f26748e) && Intrinsics.areEqual(this.f26749f, z0Var.f26749f) && Intrinsics.areEqual(this.f26750g, z0Var.f26750g) && Intrinsics.areEqual(this.f26751h, z0Var.f26751h) && Intrinsics.areEqual(this.f26752i, z0Var.f26752i) && Intrinsics.areEqual(this.f26753j, z0Var.f26753j);
    }

    public final String f() {
        return this.f26751h;
    }

    public final double g() {
        return this.f26745b;
    }

    public final List h() {
        return this.f26746c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v31 */
    public final int hashCode() {
        boolean z10 = this.f26744a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int hashCode = (Double.hashCode(this.f26745b) + (r02 * 31)) * 31;
        List list = this.f26746c;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        boolean z11 = this.f26747d;
        int i10 = (hashCode2 + (z11 ? 1 : z11 ? 1 : 0)) * 31;
        String str = this.f26748e;
        int hashCode3 = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f26749f;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26750g;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26751h;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f26752i;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f26753j;
        return hashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final boolean i() {
        return this.f26747d;
    }

    public final boolean j() {
        return this.f26744a;
    }

    public final String toString() {
        return "IntegrityInfo(isRooted=" + this.f26744a + ", confidence=" + this.f26745b + ", suBinaryPaths=" + this.f26746c + ", testKeysPresent=" + this.f26747d + ", bootloader=" + this.f26748e + ", buildTags=" + this.f26749f + ", buildType=" + this.f26750g + ", buildUser=" + this.f26751h + ", buildHost=" + this.f26752i + ", buildFingerprint=" + this.f26753j + ')';
    }
}
