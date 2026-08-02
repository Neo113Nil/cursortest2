package com.ironsource;

import com.ironsource.F0;
import com.ironsource.If;
import com.ironsource.InterfaceC4615w6;
import com.ironsource.Ua;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.p0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4484p0 extends C4602vb {
    private final IronSource.a b;
    private final If.b c;
    private final C4668z5 d;
    private final I8 e = Kb.u.d().f();
    private final long f = TimeUnit.HOURS.toMillis(1);

    /* renamed from: com.ironsource.p0$a */
    public static final class a {
        public static final a a = new a();

        private a() {
        }

        public static final C4484p0 a(IronSource.a aVar, F0.b bVar) {
            return new C4484p0(aVar, bVar);
        }
    }

    public C4484p0(IronSource.a aVar, F0.b bVar) {
        this.b = aVar;
        this.d = new C4668z5(aVar, bVar, null, null, 12, null);
        this.c = If.b(aVar);
    }

    public static /* synthetic */ String a(C4484p0 c4484p0, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c4484p0.a(str, str2);
    }

    public final String b() {
        return a(this, (String) null, (String) null, 3, (Object) null);
    }

    public final IronSource.a c() {
        return this.b;
    }

    public final C4668z5 d() {
        return this.d;
    }

    public final int e() {
        return Kb.u.d().s().a(this.b);
    }

    public final boolean f() {
        return Kb.u.d().f().c();
    }

    public final String a(String str, String str2) {
        return this.c.a(str, str2);
    }

    public final String b(String str) {
        return a(this, str, (String) null, 2, (Object) null);
    }

    public final C4336gd c(String str) {
        Va a2 = this.e.a();
        if (a2 == null) {
            throw new IllegalStateException("Error getting sdk configurations");
        }
        C4336gd c = a2.c(LevelPlay.AdFormat.NATIVE_AD, str);
        if (c != null) {
            return c;
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final Ua.a d(String str) {
        Va a2 = this.e.a();
        if (a2 != null) {
            return a2.a(str);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final com.ironsource.lifecycle.b a() {
        return com.ironsource.lifecycle.b.d();
    }

    public final InterfaceC4615w6.a b(LevelPlay.AdFormat adFormat, String str) {
        Va a2 = this.e.a();
        if (a2 != null) {
            return a2.b(adFormat, str);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final C4336gd a(String str) {
        Va a2 = this.e.a();
        if (a2 != null) {
            C4336gd c = a2.c(LevelPlay.AdFormat.BANNER, str);
            if (c != null) {
                return c;
            }
            throw new IllegalStateException("Error getting placement");
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final long b(LevelPlay.AdFormat adFormat) {
        Va a2 = this.e.a();
        return a2 != null ? a2.b(adFormat) : this.f;
    }

    public C4484p0(C4484p0 c4484p0, F0.b bVar) {
        IronSource.a aVar = c4484p0.b;
        this.b = aVar;
        this.c = c4484p0.c;
        this.d = new C4668z5(aVar, bVar, c4484p0.d.c(), null, 8, null);
    }

    public final C4336gd a(LevelPlay.AdFormat adFormat, String str) {
        Va a2;
        if (str == null || (a2 = this.e.a()) == null) {
            return null;
        }
        return a2.c(adFormat, str);
    }

    public final void a(Map<String, Object> map, ISBannerSize iSBannerSize) {
        com.ironsource.mediationsdk.j.a(map, iSBannerSize);
    }

    public final ISBannerSize a(LevelPlayAdSize levelPlayAdSize) {
        return new C4430m0().b(levelPlayAdSize);
    }
}
