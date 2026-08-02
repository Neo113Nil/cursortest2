package m4;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f20419a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20420b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20421c;

    /* renamed from: d, reason: collision with root package name */
    public final p f20422d;

    /* renamed from: e, reason: collision with root package name */
    public final s f20423e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f20424f;

    public r(int i5, long j, long j6, p pVar, s sVar, Object obj) {
        this.f20419a = i5;
        this.f20420b = j;
        this.f20421c = j6;
        this.f20422d = pVar;
        this.f20423e = sVar;
        this.f20424f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f20419a == rVar.f20419a && this.f20420b == rVar.f20420b && this.f20421c == rVar.f20421c && Intrinsics.areEqual(this.f20422d, rVar.f20422d) && Intrinsics.areEqual(this.f20423e, rVar.f20423e) && Intrinsics.areEqual(this.f20424f, rVar.f20424f);
    }

    public final int hashCode() {
        int i5 = this.f20419a * 31;
        long j = this.f20420b;
        int i10 = (i5 + ((int) (j ^ (j >>> 32)))) * 31;
        long j6 = this.f20421c;
        int hashCode = (this.f20422d.f20414a.hashCode() + ((i10 + ((int) (j6 ^ (j6 >>> 32)))) * 31)) * 31;
        s sVar = this.f20423e;
        int hashCode2 = (hashCode + (sVar == null ? 0 : sVar.f20425a.hashCode())) * 31;
        Object obj = this.f20424f;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkResponse(code=" + this.f20419a + ", requestMillis=" + this.f20420b + ", responseMillis=" + this.f20421c + ", headers=" + this.f20422d + ", body=" + this.f20423e + ", delegate=" + this.f20424f + ')';
    }
}
