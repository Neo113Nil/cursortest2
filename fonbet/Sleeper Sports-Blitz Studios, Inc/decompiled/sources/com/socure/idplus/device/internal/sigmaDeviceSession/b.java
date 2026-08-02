package com.socure.idplus.device.internal.sigmaDeviceSession;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f882a;
    public final String b;

    public b(String firstSessionToken, String latestSessionToken) {
        Intrinsics.checkNotNullParameter(firstSessionToken, "firstSessionToken");
        Intrinsics.checkNotNullParameter(latestSessionToken, "latestSessionToken");
        this.f882a = firstSessionToken;
        this.b = latestSessionToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f882a, bVar.f882a) && Intrinsics.areEqual(this.b, bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f882a.hashCode() * 31);
    }

    public final String toString() {
        return "SessionTokenTuple(firstSessionToken=" + this.f882a + ", latestSessionToken=" + this.b + ")";
    }
}
