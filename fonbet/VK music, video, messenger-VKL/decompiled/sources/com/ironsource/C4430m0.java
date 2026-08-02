package com.ironsource;

import android.content.Context;
import com.ironsource.F0;
import com.ironsource.If;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.an10;
import xsna.epx;

/* renamed from: com.ironsource.m0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4430m0 extends C4602vb {
    private final C4668z5 b;
    private final If.b c;
    private final I8 d;

    public C4430m0() {
        IronSource.a aVar = IronSource.a.BANNER;
        this.b = new C4668z5(aVar, F0.b.MEDIATION, null, null, 12, null);
        this.c = If.b(aVar);
        this.d = Kb.u.d().f();
    }

    public static /* synthetic */ String a(C4430m0 c4430m0, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c4430m0.a(str, str2);
    }

    public final Integer b(Context context) {
        Float b = b();
        if (b != null) {
            return Integer.valueOf(an10.b(b.floatValue() * Z4.a.a(context)));
        }
        return null;
    }

    public final boolean c() {
        return Kb.u.d().f().c();
    }

    private final ISBannerSize c(LevelPlayAdSize levelPlayAdSize) {
        return epx.f(levelPlayAdSize, LevelPlayAdSize.LARGE) ? new ISBannerSize("LARGE", levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : epx.f(levelPlayAdSize, LevelPlayAdSize.MEDIUM_RECTANGLE) ? new ISBannerSize("RECTANGLE", levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : epx.f(levelPlayAdSize, LevelPlayAdSize.LEADERBOARD) ? new ISBannerSize("SMART", 0, 0) : levelPlayAdSize.equals(LevelPlayAdSize.Companion.createCustomSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight())) ? new ISBannerSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : new ISBannerSize("BANNER", levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
    }

    public final String a(String str, String str2) {
        return this.c.a(str, str2);
    }

    public final List<LevelPlayAdSize> a() {
        Va a = this.d.a();
        if (a != null) {
            return a.k();
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final ISBannerSize b(LevelPlayAdSize levelPlayAdSize) {
        boolean isAdaptive = levelPlayAdSize.isAdaptive();
        if (isAdaptive) {
            return a(levelPlayAdSize);
        }
        if (isAdaptive) {
            throw new NoWhenBranchMatchedException();
        }
        return c(levelPlayAdSize);
    }

    public final int a(int i) {
        return com.ironsource.mediationsdk.j.a(i);
    }

    private final ISBannerSize a(LevelPlayAdSize levelPlayAdSize) {
        LevelPlayAdSize fallbackAdSize$mediationsdk_release = levelPlayAdSize.getFallbackAdSize$mediationsdk_release();
        if (fallbackAdSize$mediationsdk_release == null) {
            fallbackAdSize$mediationsdk_release = LevelPlayAdSize.BANNER;
        }
        ISBannerSize b = b(fallbackAdSize$mediationsdk_release);
        b.setAdaptive(true);
        com.ironsource.mediationsdk.m.a.a(b, new U7(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()));
        return b;
    }

    private final Float b() {
        Va a = this.d.a();
        Float valueOf = a != null ? Float.valueOf(a.l()) : null;
        if (valueOf != null) {
            return valueOf;
        }
        this.b.h().f("MaxScreenSizePercentageForBannerHeight is null: Error getting sdk configurations");
        return null;
    }
}
