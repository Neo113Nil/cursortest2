package c4;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3569a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3570b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3571c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3572d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3573e;

    public b0(String str, String str2, String str3, String str4, String str5) {
        this.f3569a = str;
        this.f3570b = str2;
        this.f3571c = str3;
        this.f3572d = str4;
        this.f3573e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.areEqual(((b0) obj).f3569a, this.f3569a);
    }

    public final int hashCode() {
        return this.f3569a.hashCode();
    }

    public final String toString() {
        return this.f3569a;
    }
}
