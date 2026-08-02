package com.ironsource;

import defpackage.vxd;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.v3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4353v3 {

    @Nullable
    private final Boolean a;

    @Nullable
    private final String b;

    @Nullable
    private final Integer c;

    public /* synthetic */ C4353v3(Boolean bool, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
    }

    public static /* synthetic */ C4353v3 a(C4353v3 c4353v3, Boolean bool, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = c4353v3.a;
        }
        if ((i & 2) != 0) {
            str = c4353v3.b;
        }
        if ((i & 4) != 0) {
            num = c4353v3.c;
        }
        return c4353v3.a(bool, str, num);
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    @Nullable
    public final Integer c() {
        return this.c;
    }

    @Nullable
    public final Boolean d() {
        return this.a;
    }

    @Nullable
    public final Integer e() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4353v3)) {
            return false;
        }
        C4353v3 c4353v3 = (C4353v3) obj;
        return Intrinsics.c(this.a, c4353v3.a) && Intrinsics.c(this.b, c4353v3.b) && Intrinsics.c(this.c, c4353v3.c);
    }

    @Nullable
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

    @NotNull
    public String toString() {
        Boolean bool = this.a;
        String str = this.b;
        Integer num = this.c;
        StringBuilder sb = new StringBuilder("CappingConfig2(enabled=");
        sb.append(bool);
        sb.append(", unit=");
        sb.append(str);
        sb.append(", maxImpressions=");
        return vxd.n(sb, num, ")");
    }

    public C4353v3(@Nullable Boolean bool, @Nullable String str, @Nullable Integer num) {
        this.a = bool;
        this.b = str;
        this.c = num;
    }

    @NotNull
    public final C4353v3 a(@Nullable Boolean bool, @Nullable String str, @Nullable Integer num) {
        return new C4353v3(bool, str, num);
    }

    public C4353v3() {
        this(null, null, null, 7, null);
    }

    @Nullable
    public final Boolean a() {
        return this.a;
    }
}
