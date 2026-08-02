package dc0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: dc0.J, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6146J {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f61495a;

    /* renamed from: b, reason: collision with root package name */
    private final String f61496b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C6154S f61497c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f61498d;

    public C6146J(@NotNull String cookieSourceAppName, String str, @NotNull C6154S userData, boolean z11) {
        Intrinsics.checkNotNullParameter(cookieSourceAppName, "cookieSourceAppName");
        Intrinsics.checkNotNullParameter(userData, "userData");
        this.f61495a = cookieSourceAppName;
        this.f61496b = str;
        this.f61497c = userData;
        this.f61498d = z11;
    }

    @NotNull
    public final String a() {
        return this.f61495a;
    }

    public final String b() {
        return this.f61496b;
    }

    @NotNull
    public final C6154S c() {
        return this.f61497c;
    }

    public final boolean d() {
        return this.f61498d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6146J)) {
            return false;
        }
        C6146J c6146j = (C6146J) obj;
        return Intrinsics.d(this.f61495a, c6146j.f61495a) && Intrinsics.d(this.f61496b, c6146j.f61496b) && Intrinsics.d(this.f61497c, c6146j.f61497c) && this.f61498d == c6146j.f61498d;
    }

    public final int hashCode() {
        int hashCode = this.f61495a.hashCode() * 31;
        String str = this.f61496b;
        return Boolean.hashCode(this.f61498d) + ((this.f61497c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OzonIdAccountData(cookieSourceAppName=");
        sb2.append(this.f61495a);
        sb2.append(", cookieSourceAppPackage=");
        sb2.append(this.f61496b);
        sb2.append(", userData=");
        sb2.append(this.f61497c);
        sb2.append(", isOldFormat=");
        return Pk0.a.a(")", sb2, this.f61498d);
    }
}
