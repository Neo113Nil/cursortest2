package com.ironsource;

import com.ironsource.E0;
import com.ironsource.Gf;
import com.ironsource.InterfaceC4320t6;
import com.ironsource.Ra;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import defpackage.a70;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.p0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4243p0 extends C4325tb {

    @NotNull
    private final IronSource.a a;

    @NotNull
    private final Gf.b b;

    @NotNull
    private final C4391x5 c;

    @NotNull
    private final F8 d;
    private final long e;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.p0$a */
    public static final class a {

        @NotNull
        public static final a a = new a();

        private a() {
        }

        @NotNull
        public static final C4243p0 a(@NotNull IronSource.a aVar, @NotNull E0.b bVar) {
            aVar.getClass();
            bVar.getClass();
            return new C4243p0(aVar, bVar);
        }
    }

    public C4243p0(@NotNull C4243p0 c4243p0, @NotNull E0.b bVar) {
        c4243p0.getClass();
        bVar.getClass();
        this.d = Ib.v.d().f();
        this.e = 3600000L;
        IronSource.a aVar = c4243p0.a;
        this.a = aVar;
        this.b = c4243p0.b;
        this.c = new C4391x5(aVar, bVar, c4243p0.c.c(), null, 8, null);
    }

    @NotNull
    public final C4077fd a(@NotNull String str) {
        str.getClass();
        Sa a2 = this.d.a();
        if (a2 == null) {
            a70.r("Error getting sdk configurations");
            return null;
        }
        C4077fd c = a2.c(LevelPlay.AdFormat.BANNER, str);
        if (c != null) {
            return c;
        }
        a70.r("Error getting placement");
        return null;
    }

    @InterfaceC4307sb
    @NotNull
    public final InterfaceC4320t6.a b(@NotNull LevelPlay.AdFormat adFormat, @NotNull String str) {
        adFormat.getClass();
        str.getClass();
        Sa a2 = this.d.a();
        if (a2 != null) {
            return a2.b(adFormat, str);
        }
        a70.r("Error getting sdk configurations");
        return null;
    }

    @NotNull
    public final C4077fd c(@NotNull String str) {
        str.getClass();
        Sa a2 = this.d.a();
        if (a2 == null) {
            a70.r("Error getting sdk configurations");
            return null;
        }
        C4077fd c = a2.c(LevelPlay.AdFormat.NATIVE_AD, str);
        if (c != null) {
            return c;
        }
        a70.r("Error getting sdk configurations");
        return null;
    }

    @NotNull
    public final Ra.a d(@NotNull String str) {
        str.getClass();
        Sa a2 = this.d.a();
        if (a2 != null) {
            return a2.a(str);
        }
        a70.r("Error getting sdk configurations");
        return null;
    }

    @NotNull
    public final IronSource.a e() {
        return this.a;
    }

    @NotNull
    public final C4391x5 f() {
        return this.c;
    }

    public final int g() {
        return Ib.v.d().s().a(this.a);
    }

    @NotNull
    public final String d() {
        return a(this, (String) null, (String) null, 3, (Object) null);
    }

    @NotNull
    public final String b(@Nullable String str) {
        return a(this, str, (String) null, 2, (Object) null);
    }

    public final long b(@NotNull LevelPlay.AdFormat adFormat) {
        adFormat.getClass();
        Sa a2 = this.d.a();
        return a2 != null ? a2.b(adFormat) : this.e;
    }

    @NotNull
    public final com.ironsource.lifecycle.b c() {
        com.ironsource.lifecycle.b d = com.ironsource.lifecycle.b.d();
        d.getClass();
        return d;
    }

    @NotNull
    public final String a(@Nullable String str, @Nullable String str2) {
        String a2 = this.b.a(str, str2);
        a2.getClass();
        return a2;
    }

    public static /* synthetic */ String a(C4243p0 c4243p0, String str, String str2, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: createLogMessage");
            return null;
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c4243p0.a(str, str2);
    }

    @Nullable
    public final C4077fd a(@NotNull LevelPlay.AdFormat adFormat, @Nullable String str) {
        Sa a2;
        adFormat.getClass();
        if (str == null || (a2 = this.d.a()) == null) {
            return null;
        }
        return a2.c(adFormat, str);
    }

    public final void a(@NotNull Map<String, Object> map, @NotNull ISBannerSize iSBannerSize) {
        map.getClass();
        iSBannerSize.getClass();
        com.ironsource.mediationsdk.j.a(map, iSBannerSize);
    }

    @NotNull
    public final ISBannerSize a(@NotNull LevelPlayAdSize levelPlayAdSize) {
        levelPlayAdSize.getClass();
        return new C4189m0().b(levelPlayAdSize);
    }

    public C4243p0(@NotNull IronSource.a aVar, @NotNull E0.b bVar) {
        aVar.getClass();
        bVar.getClass();
        this.d = Ib.v.d().f();
        this.e = 3600000L;
        this.a = aVar;
        this.c = new C4391x5(aVar, bVar, null, null, 12, null);
        Gf.b b = Gf.b(aVar);
        b.getClass();
        this.b = b;
    }
}
