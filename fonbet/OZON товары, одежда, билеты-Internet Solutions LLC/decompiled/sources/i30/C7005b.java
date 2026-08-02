package i30;

import B0.C2454a;
import G.g;
import Kk.C3532b;
import P4.f;
import Pk0.c;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: i30.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7005b {

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private static final C7005b f65782l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f65783m = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f65784a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f65785b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f65786c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f65787d;

    /* renamed from: e, reason: collision with root package name */
    private final K f65788e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final K f65789f;

    /* renamed from: g, reason: collision with root package name */
    private final K f65790g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f65791h;

    /* renamed from: i, reason: collision with root package name */
    private final int f65792i;

    /* renamed from: j, reason: collision with root package name */
    private final long f65793j;

    /* renamed from: k, reason: collision with root package name */
    private final long f65794k;

    /* renamed from: i30.b$a */
    public static final class a {
        @NotNull
        public static C7005b a() {
            return C7005b.f65782l;
        }
    }

    static {
        K k11 = K.f71697a;
        f65782l = new C7005b(k11, k11, k11);
    }

    public C7005b() {
        throw null;
    }

    public C7005b(K k11, K libVer, K k12) {
        Intrinsics.checkNotNullParameter("", ImagesContract.URL);
        Intrinsics.checkNotNullParameter("", "appAlias");
        Intrinsics.checkNotNullParameter("", "store");
        Intrinsics.checkNotNullParameter("", "appVersionName");
        Intrinsics.checkNotNullParameter(libVer, "libVer");
        Intrinsics.checkNotNullParameter("", "bankId");
        this.f65784a = "";
        this.f65785b = "";
        this.f65786c = "";
        this.f65787d = "";
        this.f65788e = k11;
        this.f65789f = libVer;
        this.f65790g = k12;
        this.f65791h = "";
        this.f65792i = 15;
        this.f65793j = 30000L;
        this.f65794k = 5000L;
    }

    public final long b() {
        return this.f65793j;
    }

    public final int c() {
        return this.f65792i;
    }

    @NotNull
    public final String d() {
        return this.f65784a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7005b)) {
            return false;
        }
        C7005b c7005b = (C7005b) obj;
        return Intrinsics.d(this.f65784a, c7005b.f65784a) && Intrinsics.d(this.f65785b, c7005b.f65785b) && Intrinsics.d(this.f65786c, c7005b.f65786c) && Intrinsics.d(this.f65787d, c7005b.f65787d) && Intrinsics.d(this.f65788e, c7005b.f65788e) && Intrinsics.d(this.f65789f, c7005b.f65789f) && Intrinsics.d(this.f65790g, c7005b.f65790g) && Intrinsics.d(this.f65791h, c7005b.f65791h) && this.f65792i == c7005b.f65792i && this.f65793j == c7005b.f65793j && this.f65794k == c7005b.f65794k;
    }

    public final int hashCode() {
        int a11 = (g.a(g.a(g.a(C3532b.a(this.f65784a.hashCode() * 31, 31, false), 31, this.f65785b), 31, this.f65786c), 31, this.f65787d) + (this.f65788e == null ? 0 : 1)) * 31;
        this.f65789f.getClass();
        return c.a(c.a(C2454a.a(this.f65792i, g.a((((a11 + 1) * 31) + (this.f65790g != null ? 1 : 0)) * 31, 31, this.f65791h), 31), 31, this.f65793j), 31, this.f65794k);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MobileHealthConfig(url=");
        sb2.append(this.f65784a);
        sb2.append(", isEnabled=false, appAlias=");
        sb2.append(this.f65785b);
        sb2.append(", store=");
        sb2.append(this.f65786c);
        sb2.append(", appVersionName=");
        sb2.append(this.f65787d);
        sb2.append(", appWidgetsComponents=");
        sb2.append(this.f65788e);
        sb2.append(", libVer=");
        sb2.append(this.f65789f);
        sb2.append(", extLibs=");
        sb2.append(this.f65790g);
        sb2.append(", bankId=");
        sb2.append(this.f65791h);
        sb2.append(", countEventsForSend=");
        sb2.append(this.f65792i);
        sb2.append(", aliveTickerTimeoutMs=");
        sb2.append(this.f65793j);
        sb2.append(", clearSingleEventsTimeout=");
        return f.a(this.f65794k, ", eventLifeTimeMills=null)", sb2);
    }
}
