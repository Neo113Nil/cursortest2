package com.braze.models.response;

import com.braze.requests.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class h implements d {

    /* renamed from: a, reason: collision with root package name */
    public final o f654a;
    public final int b;
    public final String c;
    public final String d;

    public h(o originalRequest, int i, String str, String str2) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f654a = originalRequest;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // com.braze.models.response.d
    public final String a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f654a, hVar.f654a) && this.b == hVar.b && Intrinsics.areEqual(this.c, hVar.c) && Intrinsics.areEqual(this.d, hVar.d);
    }

    public final int hashCode() {
        int hashCode = (Integer.hashCode(this.b) + (this.f654a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "{code = " + this.b + ", reason = " + this.c + ", message = " + this.d + "}";
    }
}
