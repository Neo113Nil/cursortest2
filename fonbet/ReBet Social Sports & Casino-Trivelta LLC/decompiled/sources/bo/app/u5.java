package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26105a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26106b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26107c;

    public u5(String mite, String host, String auth) {
        Intrinsics.checkNotNullParameter(mite, "mite");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(auth, "auth");
        this.f26105a = mite;
        this.f26106b = host;
        this.f26107c = auth;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        return Intrinsics.areEqual(this.f26105a, u5Var.f26105a) && Intrinsics.areEqual(this.f26106b, u5Var.f26106b) && Intrinsics.areEqual(this.f26107c, u5Var.f26107c);
    }

    public final int hashCode() {
        return this.f26107c.hashCode() + ((this.f26106b.hashCode() + (this.f26105a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DustConfigReceivedEvent(mite=" + this.f26105a + ", host=" + this.f26106b + ", auth=" + this.f26107c + ")";
    }
}
