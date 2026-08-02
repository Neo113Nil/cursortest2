package com.ironsource;

import android.content.Context;
import com.ironsource.E0;
import com.ironsource.Gf;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlayAdSize;
import defpackage.a70;
import defpackage.wzb;
import defpackage.zzl;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.m0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4189m0 extends C4325tb {

    @NotNull
    private final C4391x5 a;

    @NotNull
    private final Gf.b b;

    @NotNull
    private final F8 c;

    public C4189m0() {
        IronSource.a aVar = IronSource.a.BANNER;
        this.a = new C4391x5(aVar, E0.b.MEDIATION, null, null, 12, null);
        Gf.b b = Gf.b(aVar);
        b.getClass();
        this.b = b;
        this.c = Ib.v.d().f();
    }

    private final ISBannerSize a(LevelPlayAdSize levelPlayAdSize) {
        LevelPlayAdSize fallbackAdSize$mediationsdk_release = levelPlayAdSize.getFallbackAdSize$mediationsdk_release();
        if (fallbackAdSize$mediationsdk_release == null) {
            fallbackAdSize$mediationsdk_release = LevelPlayAdSize.BANNER;
        }
        ISBannerSize b = b(fallbackAdSize$mediationsdk_release);
        b.setAdaptive(true);
        com.ironsource.mediationsdk.m.a.a(b, new R7(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()));
        return b;
    }

    private final ISBannerSize c(LevelPlayAdSize levelPlayAdSize) {
        return Intrinsics.c(levelPlayAdSize, LevelPlayAdSize.LARGE) ? new ISBannerSize(com.ironsource.mediationsdk.j.b, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : Intrinsics.c(levelPlayAdSize, LevelPlayAdSize.MEDIUM_RECTANGLE) ? new ISBannerSize(com.ironsource.mediationsdk.j.c, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : Intrinsics.c(levelPlayAdSize, LevelPlayAdSize.LEADERBOARD) ? new ISBannerSize(com.ironsource.mediationsdk.j.e, 0, 0) : levelPlayAdSize.equals(LevelPlayAdSize.Companion.createCustomSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight())) ? new ISBannerSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : new ISBannerSize(com.ironsource.mediationsdk.j.a, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
    }

    private final Float d() {
        Sa a = this.c.a();
        Float valueOf = a != null ? Float.valueOf(a.m()) : null;
        if (valueOf != null) {
            return valueOf;
        }
        this.a.h().f("MaxScreenSizePercentageForBannerHeight is null: Error getting sdk configurations");
        return null;
    }

    @Nullable
    public final Integer b(@NotNull Context context) {
        context.getClass();
        Float d = d();
        if (d != null) {
            return Integer.valueOf(wzb.b(d.floatValue() * X4.a.a(context)));
        }
        return null;
    }

    @NotNull
    public final ISBannerSize b(@NotNull LevelPlayAdSize levelPlayAdSize) {
        levelPlayAdSize.getClass();
        boolean isAdaptive = levelPlayAdSize.isAdaptive();
        if (isAdaptive) {
            return a(levelPlayAdSize);
        }
        if (!isAdaptive) {
            return c(levelPlayAdSize);
        }
        zzl.b();
        return null;
    }

    @NotNull
    public final String a(@Nullable String str, @Nullable String str2) {
        String a = this.b.a(str, str2);
        a.getClass();
        return a;
    }

    public final int a(int i) {
        return com.ironsource.mediationsdk.j.a(i);
    }

    public static /* synthetic */ String a(C4189m0 c4189m0, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c4189m0.a(str, str2);
    }

    @NotNull
    public final List<LevelPlayAdSize> c() {
        Sa a = this.c.a();
        if (a != null) {
            return a.l();
        }
        a70.r("Error getting sdk configurations");
        return null;
    }
}
