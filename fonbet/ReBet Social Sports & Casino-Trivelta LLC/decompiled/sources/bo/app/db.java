package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class db {

    /* renamed from: a, reason: collision with root package name */
    public final cb f25395a;

    /* renamed from: b, reason: collision with root package name */
    public final cb f25396b;

    public db(cb oldNetworkLevel, cb newNetworkLevel) {
        Intrinsics.checkNotNullParameter(oldNetworkLevel, "oldNetworkLevel");
        Intrinsics.checkNotNullParameter(newNetworkLevel, "newNetworkLevel");
        this.f25395a = oldNetworkLevel;
        this.f25396b = newNetworkLevel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db)) {
            return false;
        }
        db dbVar = (db) obj;
        return this.f25395a == dbVar.f25395a && this.f25396b == dbVar.f25396b;
    }

    public final int hashCode() {
        return this.f25396b.hashCode() + (this.f25395a.hashCode() * 31);
    }

    public final String toString() {
        return "NetworkLevelChangeEvent(oldNetworkLevel=" + this.f25395a + ", newNetworkLevel=" + this.f25396b + ")";
    }
}
