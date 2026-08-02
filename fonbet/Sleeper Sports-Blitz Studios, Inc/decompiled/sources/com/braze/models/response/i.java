package com.braze.models.response;

import com.braze.requests.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class i implements d {

    /* renamed from: a, reason: collision with root package name */
    public final o f655a;
    public final int b;
    public final String c;

    public i(o originalRequest, int i, String str) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f655a = originalRequest;
        this.b = i;
        this.c = str;
    }

    @Override // com.braze.models.response.d
    public final String a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f655a, iVar.f655a) && this.b == iVar.b && Intrinsics.areEqual(this.c, iVar.c);
    }

    public final int hashCode() {
        int hashCode = (Integer.hashCode(this.b) + (this.f655a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "{code = " + this.b + ", reason = " + this.c + "}";
    }
}
