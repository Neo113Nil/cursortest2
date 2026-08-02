package je0;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import De.C2862e;
import Sc.o;
import ce0.InterfaceC5817a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.AnalyticModuleState;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.model.ActualBXTab;
import ru.ozon.mapsdk.common.geoproxy.model.PreferredProvider;
import ve0.AbstractC10313a;
import we0.C10543B;
import we0.m;
import xe.B0;
import xe.C10720e0;
import xe.H0;
import xe.N;
import xe.X0;

/* renamed from: je0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7406a extends AbstractC7409d {

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final x0<Boolean> f69943j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final M0<Boolean> f69944k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C2862e f69945l;

    /* renamed from: m, reason: collision with root package name */
    private WeakReference<ve0.b> f69946m;

    /* renamed from: n, reason: collision with root package name */
    private m f69947n;

    /* renamed from: o, reason: collision with root package name */
    private List<C10543B> f69948o;

    /* renamed from: p, reason: collision with root package name */
    private B0 f69949p;

    /* renamed from: je0.a$a, reason: collision with other inner class name */
    public static final class C1146a {
        @NotNull
        public static C7406a a(@NotNull AnalyticModuleState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            C7406a c7406a = new C7406a();
            c7406a.f69947n = state.getLastKnownPoint();
            c7406a.h(state.getActualBXTab());
            c7406a.f69948o = state.getPolygons();
            x0 x0Var = c7406a.f69943j;
            Boolean everBeenOutsidePolygons = state.getEverBeenOutsidePolygons();
            x0Var.setValue(Boolean.valueOf(everBeenOutsidePolygons != null ? everBeenOutsidePolygons.booleanValue() : false));
            c7406a.j(state.getPriorityProviderConfig());
            c7406a.i(state.getDefaultProviderConfig());
            c7406a.g();
            return c7406a;
        }
    }

    /* renamed from: je0.a$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69950a;

        static {
            int[] iArr = new int[ActualBXTab.values().length];
            try {
                iArr[ActualBXTab.COURIER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActualBXTab.PICKUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActualBXTab.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f69950a = iArr;
        }
    }

    public C7406a() {
        x0<Boolean> a11 = O0.a(Boolean.FALSE);
        this.f69943j = a11;
        this.f69944k = C2399j.b(a11);
        this.f69945l = N.a(CoroutineContext.Element.a.d(C10720e0.a(), (H0) X0.b()));
    }

    @Override // je0.AbstractC7409d
    public final List<String> d(@NotNull PreferredProvider.Type providerType) {
        Intrinsics.checkNotNullParameter(providerType, "providerType");
        int i11 = b.f69950a[a().ordinal()];
        if (i11 == 1) {
            return !this.f69943j.getValue().booleanValue() ? e(providerType) : b(providerType);
        }
        if (i11 == 2 || i11 == 3) {
            return e(providerType);
        }
        throw new o();
    }

    public final void o() {
        WeakReference<ve0.b> weakReference = this.f69946m;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    @NotNull
    public final M0<Boolean> p() {
        return this.f69944k;
    }

    @NotNull
    public final AnalyticModuleState q() {
        m mVar;
        ve0.b bVar;
        InterfaceC5817a g10;
        WeakReference<ve0.b> weakReference = this.f69946m;
        if (weakReference == null || (bVar = weakReference.get()) == null || (g10 = bVar.g()) == null || (mVar = g10.getCurrentPosition().c()) == null) {
            mVar = this.f69947n;
        }
        return new AnalyticModuleState(mVar, this.f69948o, a(), this.f69943j.getValue(), f(), c());
    }

    public final void r(AbstractC10313a abstractC10313a) {
        this.f69946m = new WeakReference<>(abstractC10313a);
    }

    public final void s(@NotNull GeoProviderConfig provider, GeoProviderConfig geoProviderConfig) {
        Object obj;
        ve0.b bVar;
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f69948o = provider.parseAllowedLocation();
        Iterator<E> it = ActualBXTab.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.d(((ActualBXTab) obj).getMode(), provider.getMode())) {
                    break;
                }
            }
        }
        ActualBXTab actualBXTab = (ActualBXTab) obj;
        if (actualBXTab == null) {
            actualBXTab = ActualBXTab.NONE;
        }
        h(actualBXTab);
        j(provider);
        i(geoProviderConfig);
        g();
        ie0.g.f66321a.getClass();
        Intrinsics.checkNotNullParameter(this, "analyticModule");
        WeakReference<ve0.b> weakReference = this.f69946m;
        if (weakReference == null || (bVar = weakReference.get()) == null) {
            return;
        }
        List<C10543B> list = this.f69948o;
        if (list == null || this.f69943j.getValue().booleanValue()) {
            B0 b02 = this.f69949p;
            if (b02 != null) {
                ((H0) b02).j(null);
            }
            this.f69949p = null;
            return;
        }
        K k11 = new K();
        B0 b03 = this.f69949p;
        if (b03 != null) {
            ((H0) b03).j(null);
        }
        this.f69949p = C2399j.C(new C2408n0(C2399j.o(bVar.g().e()), new C7407b(k11, this, list, null)), this.f69945l);
    }
}
