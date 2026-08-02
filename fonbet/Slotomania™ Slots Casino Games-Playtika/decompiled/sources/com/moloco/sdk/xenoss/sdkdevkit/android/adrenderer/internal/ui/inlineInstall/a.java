package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {
    public static final int f = 0;
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;

    public a(boolean z, boolean z2, String str, String str2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = z3;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d, aVar.d) && this.e == aVar.e;
    }

    public final String f() {
        return this.d;
    }

    public final boolean g() {
        return this.a;
    }

    public final String h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.a) * 31) + Boolean.hashCode(this.b)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.e);
    }

    public final boolean i() {
        return this.e;
    }

    public final boolean j() {
        return this.b;
    }

    public String toString() {
        return "AndroidAutoInlineControllerData(enabled=" + this.a + ", onSkip=" + this.b + ", eventLink=" + this.c + ", clickthroughUrl=" + this.d + ", forceFullscreen=" + this.e + ')';
    }

    public final a a(boolean z, boolean z2, String str, String str2, boolean z3) {
        return new a(z, z2, str, str2, z3);
    }

    public static /* synthetic */ a a(a aVar, boolean z, boolean z2, String str, String str2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = aVar.a;
        }
        if ((i & 2) != 0) {
            z2 = aVar.b;
        }
        if ((i & 4) != 0) {
            str = aVar.c;
        }
        if ((i & 8) != 0) {
            str2 = aVar.d;
        }
        if ((i & 16) != 0) {
            z3 = aVar.e;
        }
        boolean z4 = z3;
        String str3 = str;
        return aVar.a(z, z2, str3, str2, z4);
    }
}
