package c;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final String f26467a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26468b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26469c;

    public N(String str, String connectionType, String str2) {
        Intrinsics.checkNotNullParameter(connectionType, "connectionType");
        this.f26467a = str;
        this.f26468b = connectionType;
        this.f26469c = str2;
    }

    public final String a() {
        return this.f26468b;
    }

    public final String b() {
        return this.f26469c;
    }

    public final String c() {
        return this.f26467a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return Intrinsics.areEqual(this.f26467a, n10.f26467a) && Intrinsics.areEqual(this.f26468b, n10.f26468b) && Intrinsics.areEqual(this.f26469c, n10.f26469c);
    }

    public final int hashCode() {
        String str = this.f26467a;
        int hashCode = (this.f26468b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.f26469c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkInfo(wifiSSID=" + this.f26467a + ", connectionType=" + this.f26468b + ", ipAddress=" + this.f26469c + ')';
    }
}
