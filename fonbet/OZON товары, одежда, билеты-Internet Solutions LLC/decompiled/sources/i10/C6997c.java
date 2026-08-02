package i10;

import Kk.C3532b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import i10.h;
import i10.k;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;

/* renamed from: i10.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6997c<I extends C7854a> {

    /* renamed from: a, reason: collision with root package name */
    private final k.a<I> f65692a;

    /* renamed from: b, reason: collision with root package name */
    private final k.b<I> f65693b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final j f65694c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final h f65695d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final T00.a f65696e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<String> f65697f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f65698g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f65699h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f65700i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final K f65701j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Set<String> f65702k;

    /* renamed from: l, reason: collision with root package name */
    private final long f65703l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f65704m;

    /* renamed from: n, reason: collision with root package name */
    private final f f65705n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final Map<Class<? extends InterfaceC6995a>, InterfaceC6995a> f65706o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final b f65707p;

    /* renamed from: i10.c$a */
    public static final class a {
        public static C6997c a(h.c page, j uiState, boolean z11, Set notRemovableOverlays) {
            T00.a aVar;
            g requestMethod = g.GET;
            Map additionalStates = U.c();
            Intrinsics.checkNotNullParameter(page, "page");
            Intrinsics.checkNotNullParameter(requestMethod, "requestMethod");
            Intrinsics.checkNotNullParameter(uiState, "uiState");
            Intrinsics.checkNotNullParameter(notRemovableOverlays, "notRemovableOverlays");
            Intrinsics.checkNotNullParameter(additionalStates, "additionalStates");
            h hVar = new h(page, requestMethod);
            aVar = T00.a.f26425n;
            K k11 = K.f71697a;
            return new C6997c(null, null, uiState, hVar, aVar, k11, false, false, false, k11, notRemovableOverlays, 0L, z11, null, additionalStates, b.f65708b);
        }
    }

    /* renamed from: i10.c$b */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private static final b f65708b = new b(-1);

        /* renamed from: a, reason: collision with root package name */
        private final long f65709a;

        public b(long j11) {
            this.f65709a = j11;
        }

        public final long b() {
            return this.f65709a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!b.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.composer.state.ComposerPageState.MetricsTime");
            return this.f65709a == ((b) obj).f65709a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f65709a);
        }

        @NotNull
        public final String toString() {
            return P4.f.a(this.f65709a, ")", new StringBuilder("MetricsTime(time="));
        }
    }

    public C6997c(k.a aVar, k.b bVar, @NotNull j uiState, @NotNull h requestState, @NotNull T00.a responseState, @NotNull List pageStack, boolean z11, boolean z12, boolean z13, @NotNull K requiredWidgets, @NotNull Set notRemovableOverlays, long j11, boolean z14, f fVar, @NotNull Map additionalStates, @NotNull b reloadMetric) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Intrinsics.checkNotNullParameter(requestState, "requestState");
        Intrinsics.checkNotNullParameter(responseState, "responseState");
        Intrinsics.checkNotNullParameter(pageStack, "pageStack");
        Intrinsics.checkNotNullParameter(requiredWidgets, "requiredWidgets");
        Intrinsics.checkNotNullParameter(notRemovableOverlays, "notRemovableOverlays");
        Intrinsics.checkNotNullParameter(additionalStates, "additionalStates");
        Intrinsics.checkNotNullParameter(reloadMetric, "reloadMetric");
        this.f65692a = aVar;
        this.f65693b = bVar;
        this.f65694c = uiState;
        this.f65695d = requestState;
        this.f65696e = responseState;
        this.f65697f = pageStack;
        this.f65698g = z11;
        this.f65699h = z12;
        this.f65700i = z13;
        this.f65701j = requiredWidgets;
        this.f65702k = notRemovableOverlays;
        this.f65703l = j11;
        this.f65704m = z14;
        this.f65705n = fVar;
        this.f65706o = additionalStates;
        this.f65707p = reloadMetric;
    }

    public static C6997c c(C6997c c6997c, k.a aVar, k.b bVar, j jVar, h hVar, T00.a aVar2, List list, boolean z11, boolean z12, long j11, f fVar, Map map, b bVar2, int i11) {
        k.a aVar3 = (i11 & 1) != 0 ? c6997c.f65692a : aVar;
        k.b bVar3 = (i11 & 2) != 0 ? c6997c.f65693b : bVar;
        j uiState = (i11 & 4) != 0 ? c6997c.f65694c : jVar;
        h requestState = (i11 & 8) != 0 ? c6997c.f65695d : hVar;
        T00.a responseState = (i11 & 16) != 0 ? c6997c.f65696e : aVar2;
        List pageStack = (i11 & 32) != 0 ? c6997c.f65697f : list;
        boolean z13 = (i11 & 64) != 0 ? c6997c.f65698g : z11;
        boolean z14 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? c6997c.f65699h : z12;
        boolean z15 = (i11 & 256) != 0 ? c6997c.f65700i : true;
        K requiredWidgets = c6997c.f65701j;
        Set<String> notRemovableOverlays = c6997c.f65702k;
        long j12 = (i11 & 2048) != 0 ? c6997c.f65703l : j11;
        boolean z16 = c6997c.f65704m;
        f fVar2 = (i11 & 8192) != 0 ? c6997c.f65705n : fVar;
        Map additionalStates = (i11 & 16384) != 0 ? c6997c.f65706o : map;
        b reloadMetric = (i11 & 32768) != 0 ? c6997c.f65707p : bVar2;
        c6997c.getClass();
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Intrinsics.checkNotNullParameter(requestState, "requestState");
        Intrinsics.checkNotNullParameter(responseState, "responseState");
        Intrinsics.checkNotNullParameter(pageStack, "pageStack");
        Intrinsics.checkNotNullParameter(requiredWidgets, "requiredWidgets");
        Intrinsics.checkNotNullParameter(notRemovableOverlays, "notRemovableOverlays");
        Intrinsics.checkNotNullParameter(additionalStates, "additionalStates");
        Intrinsics.checkNotNullParameter(reloadMetric, "reloadMetric");
        return new C6997c(aVar3, bVar3, uiState, requestState, responseState, pageStack, z13, z14, z15, requiredWidgets, notRemovableOverlays, j12, z16, fVar2, additionalStates, reloadMetric);
    }

    public final <S extends InterfaceC6995a> S a(@NotNull Class<? extends S> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return clazz.cast(this.f65706o.get(clazz));
    }

    public final boolean b(boolean z11) {
        return (!this.f65699h || z11) && !this.f65698g;
    }

    @NotNull
    public final Map<Class<? extends InterfaceC6995a>, InterfaceC6995a> d() {
        return this.f65706o;
    }

    public final k.a<I> e() {
        return this.f65692a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6997c)) {
            return false;
        }
        C6997c c6997c = (C6997c) obj;
        return Intrinsics.d(this.f65692a, c6997c.f65692a) && Intrinsics.d(this.f65693b, c6997c.f65693b) && Intrinsics.d(this.f65694c, c6997c.f65694c) && Intrinsics.d(this.f65695d, c6997c.f65695d) && Intrinsics.d(this.f65696e, c6997c.f65696e) && Intrinsics.d(this.f65697f, c6997c.f65697f) && this.f65698g == c6997c.f65698g && this.f65699h == c6997c.f65699h && this.f65700i == c6997c.f65700i && Intrinsics.d(this.f65701j, c6997c.f65701j) && Intrinsics.d(this.f65702k, c6997c.f65702k) && this.f65703l == c6997c.f65703l && this.f65704m == c6997c.f65704m && Intrinsics.d(this.f65705n, c6997c.f65705n) && Intrinsics.d(this.f65706o, c6997c.f65706o) && Intrinsics.d(this.f65707p, c6997c.f65707p);
    }

    public final long f() {
        return this.f65703l;
    }

    @NotNull
    public final Set<String> g() {
        return this.f65702k;
    }

    public final k.b<I> h() {
        return this.f65693b;
    }

    public final int hashCode() {
        k.a<I> aVar = this.f65692a;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        k.b<I> bVar = this.f65693b;
        int a11 = C3532b.a(C3532b.a(C3532b.a(G.g.b((this.f65696e.hashCode() + ((this.f65695d.hashCode() + ((this.f65694c.hashCode() + ((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.f65697f), 31, this.f65698g), 31, this.f65699h), 31, this.f65700i);
        this.f65701j.getClass();
        int a12 = C3532b.a(Pk0.c.a((this.f65702k.hashCode() + ((1 + a11) * 31)) * 31, 31, this.f65703l), 31, this.f65704m);
        f fVar = this.f65705n;
        return this.f65707p.hashCode() + D40.c.a(this.f65706o, (a12 + (fVar != null ? fVar.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public final List<String> i() {
        return this.f65697f;
    }

    public final f j() {
        return this.f65705n;
    }

    @NotNull
    public final b k() {
        return this.f65707p;
    }

    @NotNull
    public final h l() {
        return this.f65695d;
    }

    @NotNull
    public final T00.a m() {
        return this.f65696e;
    }

    public final boolean n() {
        return this.f65704m;
    }

    @NotNull
    public final j o() {
        return this.f65694c;
    }

    public final boolean p() {
        return this.f65700i;
    }

    public final boolean q() {
        return this.f65698g;
    }

    public final boolean r() {
        return this.f65699h;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s() {
        boolean z11;
        h.c d11;
        k.a<I> aVar = this.f65692a;
        List<I> a11 = aVar != null ? aVar.a() : null;
        if (a11 == null || a11.isEmpty()) {
            k.b<I> bVar = this.f65693b;
            List<I> a12 = bVar != null ? bVar.a() : null;
            if (a12 == null || a12.isEmpty()) {
                z11 = true;
                d11 = this.f65695d.d();
                if (d11 instanceof h.c.a) {
                    h.c.a aVar2 = (h.c.a) d11;
                    String c11 = aVar2.c();
                    if (!Intrinsics.d(c11 != null ? B00.a.a(c11) : null, B00.a.a(aVar2.f())) && !z11) {
                        return true;
                    }
                }
                return false;
            }
        }
        z11 = false;
        d11 = this.f65695d.d();
        if (d11 instanceof h.c.a) {
        }
        return false;
    }

    @NotNull
    public final String toString() {
        return "ComposerPageState(items=" + this.f65692a + ", overlayItems=" + this.f65693b + ", uiState=" + this.f65694c + ", requestState=" + this.f65695d + ", responseState=" + this.f65696e + ", pageStack=" + this.f65697f + ", isLastPage=" + this.f65698g + ", isLoading=" + this.f65699h + ", isFirstPageLoaded=" + this.f65700i + ", requiredWidgets=" + this.f65701j + ", notRemovableOverlays=" + this.f65702k + ", lastLoadTime=" + this.f65703l + ", skipComposerFrequencyLoadCheck=" + this.f65704m + ", redirect=" + this.f65705n + ", additionalStates=" + this.f65706o + ", reloadMetric=" + this.f65707p + ")";
    }
}
