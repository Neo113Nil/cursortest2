package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class a {
    public static final int e = 0;
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Float d;

    public a() {
        this(null, null, null, null, 15, null);
    }

    public final Boolean a() {
        return this.a;
    }

    public final Boolean b() {
        return this.b;
    }

    public final Boolean c() {
        return this.c;
    }

    public final Float d() {
        return this.d;
    }

    public final Boolean e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual((Object) this.d, (Object) aVar.d);
    }

    public final Boolean f() {
        return this.b;
    }

    public final Float g() {
        return this.d;
    }

    public final Boolean h() {
        return this.c;
    }

    public int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.c;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Float f = this.d;
        return hashCode3 + (f != null ? f.hashCode() : 0);
    }

    public String toString() {
        return "AccessibilitySignal(accessibilityCaptioningEnabled=" + this.a + ", accessibilityLargePointerIcon=" + this.b + ", reduceBrightColorsActivated=" + this.c + ", fontScale=" + this.d + ')';
    }

    public a(Boolean bool, Boolean bool2, Boolean bool3, Float f) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = f;
    }

    public final a a(Boolean bool, Boolean bool2, Boolean bool3, Float f) {
        return new a(bool, bool2, bool3, f);
    }

    public static /* synthetic */ a a(a aVar, Boolean bool, Boolean bool2, Boolean bool3, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = aVar.a;
        }
        if ((i & 2) != 0) {
            bool2 = aVar.b;
        }
        if ((i & 4) != 0) {
            bool3 = aVar.c;
        }
        if ((i & 8) != 0) {
            f = aVar.d;
        }
        return aVar.a(bool, bool2, bool3, f);
    }

    public /* synthetic */ a(Boolean bool, Boolean bool2, Boolean bool3, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : f);
    }
}
