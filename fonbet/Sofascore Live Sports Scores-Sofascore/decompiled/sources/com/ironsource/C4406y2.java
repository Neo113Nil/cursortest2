package com.ironsource;

import androidx.core.app.NotificationCompat;
import defpackage.dmi;
import defpackage.fn0;
import defpackage.ljg;
import defpackage.wv8;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.y2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4406y2 {

    @NotNull
    private final Map<String, List<String>> a;
    private final int b;
    private final boolean c;
    private final long d;

    @NotNull
    private final List<C4184ld> e;

    @NotNull
    private final C4242p f;
    private final long g;
    private final int h;
    private final long i;

    /* JADX WARN: Multi-variable type inference failed */
    public C4406y2(@NotNull Map<String, ? extends List<String>> map, int i, boolean z, long j, @NotNull List<C4184ld> list, @NotNull C4242p c4242p, long j2, int i2, long j3) {
        map.getClass();
        list.getClass();
        c4242p.getClass();
        this.a = map;
        this.b = i;
        this.c = z;
        this.d = j;
        this.e = list;
        this.f = c4242p;
        this.g = j2;
        this.h = i2;
        this.i = j3;
    }

    public static /* synthetic */ C4406y2 a(C4406y2 c4406y2, Map map, int i, boolean z, long j, List list, C4242p c4242p, long j2, int i2, long j3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            map = c4406y2.a;
        }
        if ((i3 & 2) != 0) {
            i = c4406y2.b;
        }
        if ((i3 & 4) != 0) {
            z = c4406y2.c;
        }
        if ((i3 & 8) != 0) {
            j = c4406y2.d;
        }
        if ((i3 & 16) != 0) {
            list = c4406y2.e;
        }
        if ((i3 & 32) != 0) {
            c4242p = c4406y2.f;
        }
        if ((i3 & 64) != 0) {
            j2 = c4406y2.g;
        }
        if ((i3 & 128) != 0) {
            i2 = c4406y2.h;
        }
        if ((i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            j3 = c4406y2.i;
        }
        int i4 = i2;
        long j4 = j2;
        List list2 = list;
        long j5 = j;
        boolean z2 = z;
        return c4406y2.a(map, i, z2, j5, list2, c4242p, j4, i4, j3);
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
        if (!(obj instanceof C4406y2)) {
            return false;
        }
        C4406y2 c4406y2 = (C4406y2) obj;
        return Intrinsics.c(this.a, c4406y2.a) && this.b == c4406y2.b && this.c == c4406y2.c && this.d == c4406y2.d && Intrinsics.c(this.e, c4406y2.e) && Intrinsics.c(this.f, c4406y2.f) && this.g == c4406y2.g && this.h == c4406y2.h && this.i == c4406y2.i;
    }

    @NotNull
    public final C4242p f() {
        return this.f;
    }

    public final long g() {
        return this.g;
    }

    public final int h() {
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
        return Long.hashCode(this.i) + wv8.a(this.h, ljg.c((this.f.hashCode() + dmi.d(ljg.c((a + i) * 31, 31, this.d), 31, this.e)) * 31, 31, this.g), 31);
    }

    public final long i() {
        return this.i;
    }

    public final long j() {
        return this.g;
    }

    public final boolean k() {
        return this.c;
    }

    @NotNull
    public final C4242p l() {
        return this.f;
    }

    public final int m() {
        return this.h;
    }

    public final long n() {
        return this.d;
    }

    public final long o() {
        return this.i;
    }

    public final int p() {
        return this.b;
    }

    @NotNull
    public final List<C4184ld> q() {
        return this.e;
    }

    @NotNull
    public final Map<String, List<String>> r() {
        return this.a;
    }

    @NotNull
    public String toString() {
        Map<String, List<String>> map = this.a;
        int i = this.b;
        boolean z = this.c;
        long j = this.d;
        List<C4184ld> list = this.e;
        C4242p c4242p = this.f;
        long j2 = this.g;
        int i2 = this.h;
        long j3 = this.i;
        StringBuilder sb = new StringBuilder("BannerAdFormatConfig2(providerOrder=");
        sb.append(map);
        sb.append(", parallelLoad=");
        sb.append(i);
        sb.append(", advancedLoading=");
        sb.append(z);
        sb.append(", collectBiddingDataTimeout=");
        sb.append(j);
        sb.append(", placements=");
        sb.append(list);
        sb.append(", auction=");
        sb.append(c4242p);
        fn0.t(j2, ", adapterTimeoutMillis=", ", bannerInterval=", sb);
        sb.append(i2);
        sb.append(", impressionTimeout=");
        sb.append(j3);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final C4406y2 a(@NotNull Map<String, ? extends List<String>> map, int i, boolean z, long j, @NotNull List<C4184ld> list, @NotNull C4242p c4242p, long j2, int i2, long j3) {
        map.getClass();
        list.getClass();
        c4242p.getClass();
        return new C4406y2(map, i, z, j, list, c4242p, j2, i2, j3);
    }

    @NotNull
    public final Map<String, List<String>> a() {
        return this.a;
    }
}
