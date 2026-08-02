package com.ironsource;

import androidx.core.app.NotificationCompat;
import defpackage.dmi;
import defpackage.fn0;
import defpackage.ljg;
import defpackage.me4;
import defpackage.mz1;
import defpackage.w1l;
import defpackage.wv8;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4242p {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @NotNull
    private final String c;
    private final int d;
    private final long e;
    private final int f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final boolean j;
    private final boolean k;

    public C4242p(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, long j, int i2, boolean z, boolean z2, int i3, boolean z3, boolean z4) {
        me4.p(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = j;
        this.f = i2;
        this.g = z;
        this.h = z2;
        this.i = i3;
        this.j = z3;
        this.k = z4;
    }

    public static /* synthetic */ C4242p a(C4242p c4242p, String str, String str2, String str3, int i, long j, int i2, boolean z, boolean z2, int i3, boolean z3, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = c4242p.a;
        }
        if ((i4 & 2) != 0) {
            str2 = c4242p.b;
        }
        if ((i4 & 4) != 0) {
            str3 = c4242p.c;
        }
        if ((i4 & 8) != 0) {
            i = c4242p.d;
        }
        if ((i4 & 16) != 0) {
            j = c4242p.e;
        }
        if ((i4 & 32) != 0) {
            i2 = c4242p.f;
        }
        if ((i4 & 64) != 0) {
            z = c4242p.g;
        }
        if ((i4 & 128) != 0) {
            z2 = c4242p.h;
        }
        if ((i4 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            i3 = c4242p.i;
        }
        if ((i4 & 512) != 0) {
            z3 = c4242p.j;
        }
        if ((i4 & 1024) != 0) {
            z4 = c4242p.k;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        long j2 = j;
        String str4 = str3;
        int i5 = i;
        return c4242p.a(str, str2, str4, i5, j2, i2, z, z2, i3, z5, z6);
    }

    public final boolean b() {
        return this.j;
    }

    public final boolean c() {
        return this.k;
    }

    @NotNull
    public final String d() {
        return this.b;
    }

    @NotNull
    public final String e() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4242p)) {
            return false;
        }
        C4242p c4242p = (C4242p) obj;
        return Intrinsics.c(this.a, c4242p.a) && Intrinsics.c(this.b, c4242p.b) && Intrinsics.c(this.c, c4242p.c) && this.d == c4242p.d && this.e == c4242p.e && this.f == c4242p.f && this.g == c4242p.g && this.h == c4242p.h && this.i == c4242p.i && this.j == c4242p.j && this.k == c4242p.k;
    }

    public final int f() {
        return this.d;
    }

    public final long g() {
        return this.e;
    }

    public final int h() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int a = wv8.a(this.f, ljg.c(wv8.a(this.d, dmi.c(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31);
        boolean z = this.g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (a + i) * 31;
        boolean z2 = this.h;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int a2 = wv8.a(this.i, (i2 + i3) * 31, 31);
        boolean z3 = this.j;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int i5 = (a2 + i4) * 31;
        boolean z4 = this.k;
        return i5 + (z4 ? 1 : z4 ? 1 : 0);
    }

    public final boolean i() {
        return this.g;
    }

    public final boolean j() {
        return this.h;
    }

    public final int k() {
        return this.i;
    }

    @NotNull
    public final String l() {
        return this.a;
    }

    public final int m() {
        return this.f;
    }

    public final long n() {
        return this.e;
    }

    public final int o() {
        return this.d;
    }

    @NotNull
    public final String p() {
        return this.b;
    }

    public final boolean q() {
        return this.g;
    }

    public final boolean r() {
        return this.h;
    }

    public final boolean s() {
        return this.k;
    }

    public final int t() {
        return this.i;
    }

    @NotNull
    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        int i = this.d;
        long j = this.e;
        int i2 = this.f;
        boolean z = this.g;
        boolean z2 = this.h;
        int i3 = this.i;
        boolean z3 = this.j;
        boolean z4 = this.k;
        StringBuilder s = mz1.s("AdFormatAuctionConfig2(auctionData=", str, ", auctioneerURL=", str2, ", extAuctioneerURL=");
        w1l.q(i, str3, ", auctionTrials=", ", auctionTimeout=", s);
        s.append(j);
        s.append(", auctionSavedHistoryLimit=");
        s.append(i2);
        fn0.y(", compressAuctionRequest=", ", compressAuctionResponse=", s, z, z2);
        s.append(", encryptionVersion=");
        s.append(i3);
        s.append(", tokenPerAdapter=");
        s.append(z3);
        s.append(", enableAuctionFallback=");
        s.append(z4);
        s.append(")");
        return s.toString();
    }

    @NotNull
    public final String u() {
        return this.c;
    }

    public final boolean v() {
        return this.j;
    }

    @NotNull
    public final C4242p a(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, long j, int i2, boolean z, boolean z2, int i3, boolean z3, boolean z4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new C4242p(str, str2, str3, i, j, i2, z, z2, i3, z3, z4);
    }

    @NotNull
    public final String a() {
        return this.a;
    }
}
