package com.moloco.sdk.internal.services.init;

import com.moloco.sdk.Init;
import com.moloco.sdk.internal.v;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {
    public static final int c = 0;
    public final v<Init.SDKInitResponse, j> a;
    public final String b;

    public c(v<Init.SDKInitResponse, j> sdkInitResult, String fetchType) {
        Intrinsics.checkNotNullParameter(sdkInitResult, "sdkInitResult");
        Intrinsics.checkNotNullParameter(fetchType, "fetchType");
        this.a = sdkInitResult;
        this.b = fetchType;
    }

    public final v<Init.SDKInitResponse, j> a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.b;
    }

    public final v<Init.SDKInitResponse, j> d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.a, cVar.a) && Intrinsics.areEqual(this.b, cVar.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "FetchState(sdkInitResult=" + this.a + ", fetchType=" + this.b + ')';
    }

    public final c a(v<Init.SDKInitResponse, j> sdkInitResult, String fetchType) {
        Intrinsics.checkNotNullParameter(sdkInitResult, "sdkInitResult");
        Intrinsics.checkNotNullParameter(fetchType, "fetchType");
        return new c(sdkInitResult, fetchType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c a(c cVar, v vVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            vVar = cVar.a;
        }
        if ((i & 2) != 0) {
            str = cVar.b;
        }
        return cVar.a(vVar, str);
    }
}
