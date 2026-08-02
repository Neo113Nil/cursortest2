package ja;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements nc.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f18413a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18414b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18415c;

    public e(int i5, String str, String str2) {
        this.f18413a = i5;
        this.f18414b = str;
        this.f18415c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f18413a == eVar.f18413a && Intrinsics.areEqual(this.f18414b, eVar.f18414b) && Intrinsics.areEqual(this.f18415c, eVar.f18415c);
    }

    @Override // nc.a
    public final int getId() {
        return this.f18413a;
    }

    @Override // nc.a
    public final String getLogo() {
        return this.f18415c;
    }

    @Override // nc.a
    public final String getName() {
        return this.f18414b;
    }

    public final int hashCode() {
        int i5 = this.f18413a * 31;
        String str = this.f18414b;
        int hashCode = (i5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18415c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SportKindData(id=");
        sb2.append(this.f18413a);
        sb2.append(", name=");
        sb2.append(this.f18414b);
        sb2.append(", logo=");
        return d9.e.k(sb2, this.f18415c, ')');
    }
}
