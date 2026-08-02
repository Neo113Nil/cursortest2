package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class x {
    public static final int b = 0;
    public final String a;

    public x(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.areEqual(this.a, ((x) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "TestConfigSignal(configJson=" + this.a + ')';
    }

    public final x a(String str) {
        return new x(str);
    }

    public static /* synthetic */ x a(x xVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = xVar.a;
        }
        return xVar.a(str);
    }
}
