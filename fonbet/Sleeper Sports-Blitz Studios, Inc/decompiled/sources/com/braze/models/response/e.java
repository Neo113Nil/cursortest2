package com.braze.models.response;

import com.braze.requests.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f652a;
    public final o b;

    public e(String str, o originalRequest) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f652a = str;
        this.b = originalRequest;
    }

    @Override // com.braze.models.response.d
    public final String a() {
        return this.f652a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f652a, eVar.f652a) && Intrinsics.areEqual(this.b, eVar.b);
    }

    public final int hashCode() {
        String str = this.f652a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "InvalidApiKeyError(errorMessage=" + this.f652a + ", originalRequest=" + this.b + ")";
    }
}
