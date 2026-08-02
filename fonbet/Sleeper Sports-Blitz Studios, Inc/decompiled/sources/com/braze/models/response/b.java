package com.braze.models.response;

import com.braze.requests.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f650a;
    public final o b;

    public b(String str, o originalRequest) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f650a = str;
        this.b = originalRequest;
    }

    @Override // com.braze.models.response.d
    public final String a() {
        return this.f650a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f650a, bVar.f650a) && Intrinsics.areEqual(this.b, bVar.b);
    }

    public final int hashCode() {
        String str = this.f650a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "BasicResponseError(errorMessage=" + this.f650a + ", originalRequest=" + this.b + ")";
    }
}
