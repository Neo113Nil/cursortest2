package com.ironsource;

import com.ironsource.F0;
import com.ironsource.Ff;
import com.ironsource.InterfaceC2683u6;
import com.ironsource.Ta;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.p0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2588p0 extends C2688ub {
    private final IronSource.a b;
    private final Ff.b c;
    private final C2772z5 d;
    private final H8 e;
    private final long f;

    /* renamed from: com.ironsource.p0$a */
    public static final class a {
        public static final a a = new a();

        private a() {
        }

        @JvmStatic
        public static final C2588p0 a(IronSource.a adFormat, F0.b level) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            Intrinsics.checkNotNullParameter(level, "level");
            return new C2588p0(adFormat, level);
        }
    }

    public C2588p0(IronSource.a adFormat, F0.b level) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(level, "level");
        this.e = Jb.u.d().f();
        this.f = TimeUnit.HOURS.toMillis(1L);
        this.b = adFormat;
        this.d = new C2772z5(adFormat, level, null, null, 12, null);
        Ff.b b = Ff.b(adFormat);
        Intrinsics.checkNotNullExpressionValue(b, "createLogFactory(adFormat)");
        this.c = b;
    }

    public static /* synthetic */ String a(C2588p0 c2588p0, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c2588p0.a(str, str2);
    }

    public final String b(String str) {
        return a(this, str, (String) null, 2, (Object) null);
    }

    public final String c() {
        return a(this, (String) null, (String) null, 3, (Object) null);
    }

    protected final IronSource.a d() {
        return this.b;
    }

    public final C2772z5 e() {
        return this.d;
    }

    public final int f() {
        return Jb.u.d().s().a(this.b);
    }

    public final boolean g() {
        return Jb.u.d().f().c();
    }

    public final String a(String str, String str2) {
        String a2 = this.c.a(str, str2);
        Intrinsics.checkNotNullExpressionValue(a2, "logFactory.createLogMessage(message, suffix)");
        return a2;
    }

    public final com.ironsource.lifecycle.b b() {
        com.ironsource.lifecycle.b d = com.ironsource.lifecycle.b.d();
        Intrinsics.checkNotNullExpressionValue(d, "getInstance()");
        return d;
    }

    public final C2440gd c(String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Ua a2 = this.e.a();
        if (a2 == null) {
            throw new IllegalStateException("Error getting sdk configurations");
        }
        C2440gd c = a2.c(LevelPlay.AdFormat.NATIVE_AD, placementName);
        if (c != null) {
            return c;
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final Ta.a d(String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Ua a2 = this.e.a();
        if (a2 != null) {
            return a2.a(adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final C2440gd a(String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Ua a2 = this.e.a();
        if (a2 != null) {
            C2440gd c = a2.c(LevelPlay.AdFormat.BANNER, placementName);
            if (c != null) {
                return c;
            }
            throw new IllegalStateException("Error getting placement");
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final InterfaceC2683u6.a b(LevelPlay.AdFormat adFormat, String adUnitId) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Ua a2 = this.e.a();
        if (a2 != null) {
            return a2.b(adFormat, adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final long b(LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Ua a2 = this.e.a();
        return a2 != null ? a2.b(adFormat) : this.f;
    }

    public final C2440gd a(LevelPlay.AdFormat adFormat, String str) {
        Ua a2;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        if (str == null || (a2 = this.e.a()) == null) {
            return null;
        }
        return a2.c(adFormat, str);
    }

    public C2588p0(C2588p0 adTools, F0.b level) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(level, "level");
        this.e = Jb.u.d().f();
        this.f = TimeUnit.HOURS.toMillis(1L);
        IronSource.a aVar = adTools.b;
        this.b = aVar;
        this.c = adTools.c;
        this.d = new C2772z5(aVar, level, adTools.d.c(), null, 8, null);
    }

    public final void a(Map<String, Object> data, ISBannerSize size) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(size, "size");
        com.ironsource.mediationsdk.j.a(data, size);
    }

    public final ISBannerSize a(LevelPlayAdSize adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        return new C2534m0().b(adSize);
    }
}
