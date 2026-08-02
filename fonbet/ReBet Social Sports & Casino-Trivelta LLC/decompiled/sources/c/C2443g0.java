package c;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2443g0 {

    /* renamed from: c, reason: collision with root package name */
    public final List f26557c;

    /* renamed from: f, reason: collision with root package name */
    public final String f26560f;

    /* renamed from: h, reason: collision with root package name */
    public final String f26562h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f26563i;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26555a = true;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26556b = true;

    /* renamed from: d, reason: collision with root package name */
    public final long f26558d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final String f26559e = "1.0.0";

    /* renamed from: g, reason: collision with root package name */
    public final Long f26561g = null;

    public C2443g0(List list, String str, String str2, boolean z10) {
        this.f26557c = list;
        this.f26560f = str;
        this.f26562h = str2;
        this.f26563i = z10;
    }

    public final String a() {
        return this.f26560f;
    }

    public final Long b() {
        return this.f26561g;
    }

    public final List c() {
        return this.f26557c;
    }

    public final boolean d() {
        return this.f26555a;
    }

    public final boolean e() {
        return this.f26556b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2443g0)) {
            return false;
        }
        C2443g0 c2443g0 = (C2443g0) obj;
        return this.f26555a == c2443g0.f26555a && this.f26556b == c2443g0.f26556b && Intrinsics.areEqual(this.f26557c, c2443g0.f26557c) && this.f26558d == c2443g0.f26558d && Intrinsics.areEqual(this.f26559e, c2443g0.f26559e) && Intrinsics.areEqual(this.f26560f, c2443g0.f26560f) && Intrinsics.areEqual(this.f26561g, c2443g0.f26561g) && Intrinsics.areEqual(this.f26562h, c2443g0.f26562h) && this.f26563i == c2443g0.f26563i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public final int hashCode() {
        boolean z10 = this.f26555a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r22 = this.f26556b;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        List list = this.f26557c;
        int hashCode = (Long.hashCode(this.f26558d) + ((i12 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        String str = this.f26559e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f26560f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.f26561g;
        int hashCode4 = (hashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str3 = this.f26562h;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z11 = this.f26563i;
        return hashCode5 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String toString() {
        return "PreflightResponse(requiresAttestation=" + this.f26555a + ", requiresFingerprintRefresh=" + this.f26556b + ", collectFields=" + this.f26557c + ", cacheTtl=" + this.f26558d + ", policyVersion=" + this.f26559e + ", attestationNonce=" + this.f26560f + ", cloudProjectNumber=" + this.f26561g + ", token=" + this.f26562h + ", gpsCollectionEnabled=" + this.f26563i + ')';
    }
}
