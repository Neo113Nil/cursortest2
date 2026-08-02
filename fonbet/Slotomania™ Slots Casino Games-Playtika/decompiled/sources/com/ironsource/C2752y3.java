package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.y3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2752y3 {
    private final Boolean a;
    private final String b;
    private final Integer c;

    public C2752y3() {
        this(null, null, null, 7, null);
    }

    public final Boolean a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final Integer c() {
        return this.c;
    }

    public final Boolean d() {
        return this.a;
    }

    public final Integer e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2752y3)) {
            return false;
        }
        C2752y3 c2752y3 = (C2752y3) obj;
        return Intrinsics.areEqual(this.a, c2752y3.a) && Intrinsics.areEqual(this.b, c2752y3.b) && Intrinsics.areEqual(this.c, c2752y3.c);
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "CappingConfig2(enabled=" + this.a + ", unit=" + this.b + ", maxImpressions=" + this.c + ")";
    }

    public C2752y3(Boolean bool, String str, Integer num) {
        this.a = bool;
        this.b = str;
        this.c = num;
    }

    public final C2752y3 a(Boolean bool, String str, Integer num) {
        return new C2752y3(bool, str, num);
    }

    public static /* synthetic */ C2752y3 a(C2752y3 c2752y3, Boolean bool, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = c2752y3.a;
        }
        if ((i & 2) != 0) {
            str = c2752y3.b;
        }
        if ((i & 4) != 0) {
            num = c2752y3.c;
        }
        return c2752y3.a(bool, str, num);
    }

    public /* synthetic */ C2752y3(Boolean bool, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
    }
}
