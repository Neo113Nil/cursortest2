package com.ironsource;

import defpackage.dmi;
import defpackage.ljg;
import defpackage.wv8;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.f6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4070f6 {

    @NotNull
    private final Map<String, List<String>> a;
    private final int b;
    private final boolean c;
    private final long d;

    @NotNull
    private final List<C4184ld> e;

    @NotNull
    private final C4242p f;
    private final int g;

    @Nullable
    private final Integer h;

    /* JADX WARN: Multi-variable type inference failed */
    public C4070f6(@NotNull Map<String, ? extends List<String>> map, int i, boolean z, long j, @NotNull List<C4184ld> list, @NotNull C4242p c4242p, int i2, @Nullable Integer num) {
        map.getClass();
        list.getClass();
        c4242p.getClass();
        this.a = map;
        this.b = i;
        this.c = z;
        this.d = j;
        this.e = list;
        this.f = c4242p;
        this.g = i2;
        this.h = num;
    }

    public static /* synthetic */ C4070f6 a(C4070f6 c4070f6, Map map, int i, boolean z, long j, List list, C4242p c4242p, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            map = c4070f6.a;
        }
        if ((i3 & 2) != 0) {
            i = c4070f6.b;
        }
        if ((i3 & 4) != 0) {
            z = c4070f6.c;
        }
        if ((i3 & 8) != 0) {
            j = c4070f6.d;
        }
        if ((i3 & 16) != 0) {
            list = c4070f6.e;
        }
        if ((i3 & 32) != 0) {
            c4242p = c4070f6.f;
        }
        if ((i3 & 64) != 0) {
            i2 = c4070f6.g;
        }
        if ((i3 & 128) != 0) {
            num = c4070f6.h;
        }
        long j2 = j;
        boolean z2 = z;
        return c4070f6.a(map, i, z2, j2, list, c4242p, i2, num);
    }

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    @NotNull
    public final List<C4184ld> e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4070f6)) {
            return false;
        }
        C4070f6 c4070f6 = (C4070f6) obj;
        return Intrinsics.c(this.a, c4070f6.a) && this.b == c4070f6.b && this.c == c4070f6.c && this.d == c4070f6.d && Intrinsics.c(this.e, c4070f6.e) && Intrinsics.c(this.f, c4070f6.f) && this.g == c4070f6.g && Intrinsics.c(this.h, c4070f6.h);
    }

    @NotNull
    public final C4242p f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    @Nullable
    public final Integer h() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int a = wv8.a(this.b, this.a.hashCode() * 31, 31);
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int a2 = wv8.a(this.g, (this.f.hashCode() + dmi.d(ljg.c((a + i) * 31, 31, this.d), 31, this.e)) * 31, 31);
        Integer num = this.h;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final int i() {
        return this.g;
    }

    public final boolean j() {
        return this.c;
    }

    @NotNull
    public final C4242p k() {
        return this.f;
    }

    public final long l() {
        return this.d;
    }

    @Nullable
    public final Integer m() {
        return this.h;
    }

    public final int n() {
        return this.b;
    }

    @NotNull
    public final List<C4184ld> o() {
        return this.e;
    }

    @NotNull
    public final Map<String, List<String>> p() {
        return this.a;
    }

    @NotNull
    public String toString() {
        return "FullscreenAdFormatConfig2(providerOrder=" + this.a + ", parallelLoad=" + this.b + ", advancedLoading=" + this.c + ", collectBiddingDataTimeout=" + this.d + ", placements=" + this.e + ", auction=" + this.f + ", adapterTimeoutSecs=" + this.g + ", expiredDurationMins=" + this.h + ")";
    }

    @NotNull
    public final C4070f6 a(@NotNull Map<String, ? extends List<String>> map, int i, boolean z, long j, @NotNull List<C4184ld> list, @NotNull C4242p c4242p, int i2, @Nullable Integer num) {
        map.getClass();
        list.getClass();
        c4242p.getClass();
        return new C4070f6(map, i, z, j, list, c4242p, i2, num);
    }

    @NotNull
    public final Map<String, List<String>> a() {
        return this.a;
    }
}
