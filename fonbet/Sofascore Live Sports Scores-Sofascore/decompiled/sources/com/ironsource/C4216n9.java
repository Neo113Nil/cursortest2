package com.ironsource;

import defpackage.mz1;
import defpackage.wv8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.n9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4216n9 {

    @NotNull
    private final String a;
    private final int b;

    @Nullable
    private final String c;

    public /* synthetic */ C4216n9(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2);
    }

    public static /* synthetic */ C4216n9 a(C4216n9 c4216n9, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c4216n9.a;
        }
        if ((i2 & 2) != 0) {
            i = c4216n9.b;
        }
        if ((i2 & 4) != 0) {
            str2 = c4216n9.c;
        }
        return c4216n9.a(str, i, str2);
    }

    public final int b() {
        return this.b;
    }

    @Nullable
    public final String c() {
        return this.c;
    }

    @Nullable
    public final String d() {
        return this.c;
    }

    @NotNull
    public final String e() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4216n9)) {
            return false;
        }
        C4216n9 c4216n9 = (C4216n9) obj;
        return Intrinsics.c(this.a, c4216n9.a) && this.b == c4216n9.b && Intrinsics.c(this.c, c4216n9.c);
    }

    public final int f() {
        return this.b;
    }

    public int hashCode() {
        int a = wv8.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return a + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.a;
        int i = this.b;
        return mz1.o(mz1.q(i, "InstanceInformation(instanceId=", str, ", instanceType=", ", dynamicDemandSourceId="), this.c, ")");
    }

    public C4216n9(@NotNull String str, int i, @Nullable String str2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    @NotNull
    public final C4216n9 a(@NotNull String str, int i, @Nullable String str2) {
        str.getClass();
        return new C4216n9(str, i, str2);
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    public C4216n9() {
        this(null, 0, null, 7, null);
    }
}
