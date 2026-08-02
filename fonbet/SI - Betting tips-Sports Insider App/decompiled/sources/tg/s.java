package tg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class s extends c0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23957a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23958b;

    public s(String body, boolean z5) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.f23957a = z5;
        this.f23958b = body.toString();
    }

    @Override // tg.c0
    public final String a() {
        return this.f23958b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.f23957a == sVar.f23957a && Intrinsics.areEqual(this.f23958b, sVar.f23958b);
    }

    public final int hashCode() {
        return this.f23958b.hashCode() + ((this.f23957a ? 1231 : 1237) * 31);
    }

    @Override // tg.c0
    public final String toString() {
        boolean z5 = this.f23957a;
        String str = this.f23958b;
        if (!z5) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        ug.v.a(sb2, str);
        return sb2.toString();
    }
}
