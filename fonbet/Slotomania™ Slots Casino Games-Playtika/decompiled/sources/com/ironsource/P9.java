package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class P9 {
    private final String a;
    private final String b;

    public P9(String advId, String advIdType) {
        Intrinsics.checkNotNullParameter(advId, "advId");
        Intrinsics.checkNotNullParameter(advIdType, "advIdType");
        this.a = advId;
        this.b = advIdType;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P9)) {
            return false;
        }
        P9 p9 = (P9) obj;
        return Intrinsics.areEqual(this.a, p9.a) && Intrinsics.areEqual(this.b, p9.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "IronSourceAdvId(advId=" + this.a + ", advIdType=" + this.b + ")";
    }

    public final P9 a(String advId, String advIdType) {
        Intrinsics.checkNotNullParameter(advId, "advId");
        Intrinsics.checkNotNullParameter(advIdType, "advIdType");
        return new P9(advId, advIdType);
    }

    public static /* synthetic */ P9 a(P9 p9, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = p9.a;
        }
        if ((i & 2) != 0) {
            str2 = p9.b;
        }
        return p9.a(str, str2);
    }
}
