package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.m9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2543m9 {
    private final String a;
    private final int b;
    private final String c;

    public C2543m9() {
        this(null, 0, null, 7, null);
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2543m9)) {
            return false;
        }
        C2543m9 c2543m9 = (C2543m9) obj;
        return Intrinsics.areEqual(this.a, c2543m9.a) && this.b == c2543m9.b && Intrinsics.areEqual(this.c, c2543m9.c);
    }

    public final int f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "InstanceInformation(instanceId=" + this.a + ", instanceType=" + this.b + ", dynamicDemandSourceId=" + this.c + ")";
    }

    public C2543m9(String instanceId, int i, String str) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        this.a = instanceId;
        this.b = i;
        this.c = str;
    }

    public final C2543m9 a(String instanceId, int i, String str) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        return new C2543m9(instanceId, i, str);
    }

    public static /* synthetic */ C2543m9 a(C2543m9 c2543m9, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c2543m9.a;
        }
        if ((i2 & 2) != 0) {
            i = c2543m9.b;
        }
        if ((i2 & 4) != 0) {
            str2 = c2543m9.c;
        }
        return c2543m9.a(str, i, str2);
    }

    public /* synthetic */ C2543m9(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2);
    }
}
