package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Xc {

    @Nullable
    private final Boolean a;

    @Nullable
    private final Integer b;

    public /* synthetic */ Xc(Boolean bool, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num);
    }

    public static /* synthetic */ Xc a(Xc xc, Boolean bool, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = xc.a;
        }
        if ((i & 2) != 0) {
            num = xc.b;
        }
        return xc.a(bool, num);
    }

    @Nullable
    public final Integer b() {
        return this.b;
    }

    @Nullable
    public final Boolean c() {
        return this.a;
    }

    @Nullable
    public final Integer d() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xc)) {
            return false;
        }
        Xc xc = (Xc) obj;
        return Intrinsics.c(this.a, xc.a) && Intrinsics.c(this.b, xc.b);
    }

    public int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PacingConfig2(enabled=" + this.a + ", minTimeBetweenShowsSeconds=" + this.b + ")";
    }

    public Xc(@Nullable Boolean bool, @Nullable Integer num) {
        this.a = bool;
        this.b = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Xc() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @NotNull
    public final Xc a(@Nullable Boolean bool, @Nullable Integer num) {
        return new Xc(bool, num);
    }

    @Nullable
    public final Boolean a() {
        return this.a;
    }
}
