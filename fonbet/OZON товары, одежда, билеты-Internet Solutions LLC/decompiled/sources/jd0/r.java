package jd0;

import De.C2862e;
import Hb0.f;
import Sc.InterfaceC4008j;
import Vb0.b;
import android.webkit.CookieManager;
import android.webkit.WebView;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C0;
import androidx.lifecycle.I;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import dc0.C6144H;
import dc0.C6160f;
import dc0.C6171q;
import java.net.URI;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.AbstractC10711a;
import xe.B0;
import xe.C10720e0;
import xe.H0;
import xe.N;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Long> f69796a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<CookieManager> f69797b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6144H> f69798c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6160f> f69799d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<v> f69800e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<URI> f69801f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<hd0.b> f69802g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Hb0.c> f69803h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f69804i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C2862e f69805j;

    /* renamed from: k, reason: collision with root package name */
    private B0 f69806k;

    private static final class a extends UnsupportedOperationException {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f69807a = new a();
    }

    static final class b extends AbstractC7737t implements Function0<u> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final u invoke() {
            return new u(r.this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(@NotNull InterfaceC4008j<Long> timerIntervalMillis, @NotNull InterfaceC4008j<? extends CookieManager> webViewCookieManager, @NotNull InterfaceC4008j<C6144H> localCookieDataSource, @NotNull InterfaceC4008j<C6160f> authCookieHandler, @NotNull InterfaceC4008j<v> webViewCookieProvider, @NotNull InterfaceC4008j<URI> primaryCookiesDomainURI, @NotNull InterfaceC4008j<hd0.b> ozonIdTracker, @NotNull InterfaceC4008j<? extends Hb0.c> featureFlagsStore) {
        Intrinsics.checkNotNullParameter(timerIntervalMillis, "timerIntervalMillis");
        Intrinsics.checkNotNullParameter(webViewCookieManager, "webViewCookieManager");
        Intrinsics.checkNotNullParameter(localCookieDataSource, "localCookieDataSource");
        Intrinsics.checkNotNullParameter(authCookieHandler, "authCookieHandler");
        Intrinsics.checkNotNullParameter(webViewCookieProvider, "webViewCookieProvider");
        Intrinsics.checkNotNullParameter(primaryCookiesDomainURI, "primaryCookiesDomainURI");
        Intrinsics.checkNotNullParameter(ozonIdTracker, "ozonIdTracker");
        Intrinsics.checkNotNullParameter(featureFlagsStore, "featureFlagsStore");
        this.f69796a = timerIntervalMillis;
        this.f69797b = webViewCookieManager;
        this.f69798c = localCookieDataSource;
        this.f69799d = authCookieHandler;
        this.f69800e = webViewCookieProvider;
        this.f69801f = primaryCookiesDomainURI;
        this.f69802g = ozonIdTracker;
        this.f69803h = featureFlagsStore;
        this.f69804i = Sc.k.b(new b());
        this.f69805j = N.a(C10720e0.a());
    }

    public static final void c(r rVar) {
        if (rVar.f69797b.getValue() == null) {
            return;
        }
        B0 b02 = rVar.f69806k;
        if (b02 == null || !((AbstractC10711a) b02).isActive()) {
            rVar.f69806k = td0.f.b(rVar.f69805j, null, new s(rVar, null));
        }
    }

    public static final void d(r rVar) {
        B0 b02 = rVar.f69806k;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        rVar.f69806k = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(r rVar, kotlin.coroutines.jvm.internal.c cVar) {
        t tVar;
        Object obj;
        int i11;
        String obj2;
        ArrayList b11;
        rVar.getClass();
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i12 = tVar.f69816h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                tVar.f69816h = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj = tVar.f69814f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = tVar.f69816h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    InterfaceC4008j<URI> interfaceC4008j = rVar.f69801f;
                    obj2 = interfaceC4008j.toString();
                    rVar.f69802g.getValue().d(false);
                    ArrayList a11 = rVar.f69800e.getValue().a(obj2);
                    if (a11 != null) {
                        rVar.f69798c.getValue().k(interfaceC4008j.getValue(), C6171q.A(a11), true);
                        return Unit.f71690a;
                    }
                    Hb0.c value = rVar.f69803h.getValue();
                    f.k kVar = f.k.f10808a;
                    tVar.f69812d = rVar;
                    tVar.f69813e = obj2;
                    tVar.f69816h = 1;
                    obj = value.a(kVar, tVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str = tVar.f69813e;
                    r rVar2 = tVar.f69812d;
                    Sc.s.b(obj);
                    obj2 = str;
                    rVar = rVar2;
                }
                if (((Boolean) obj).booleanValue()) {
                    b.a.f(Vb0.b.f28514a, "Cookie info compat not supported", a.f69807a);
                }
                b11 = rVar.f69800e.getValue().b(obj2);
                if (b11 != null) {
                    return Unit.f71690a;
                }
                InterfaceC4008j<URI> interfaceC4008j2 = rVar.f69801f;
                String host = interfaceC4008j2.getValue().getHost();
                Intrinsics.checkNotNullExpressionValue(host, "getHost(...)");
                ArrayList d11 = C6171q.d(host, b11);
                if (d11.isEmpty()) {
                    return Unit.f71690a;
                }
                C6160f value2 = rVar.f69799d.getValue();
                String host2 = interfaceC4008j2.getValue().getHost();
                Intrinsics.checkNotNullExpressionValue(host2, "getHost(...)");
                value2.e(host2, d11);
                return Unit.f71690a;
            }
        }
        tVar = new t(rVar, cVar);
        obj = tVar.f69814f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = tVar.f69816h;
        if (i11 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        b11 = rVar.f69800e.getValue().b(obj2);
        if (b11 != null) {
        }
    }

    public final void f(@NotNull WebView webView) {
        J a11;
        AbstractC5434v lifecycle;
        Intrinsics.checkNotNullParameter(webView, "webView");
        if (this.f69796a.getValue().longValue() == 0 || (a11 = C0.a(webView)) == null || (lifecycle = a11.getLifecycle()) == null) {
            return;
        }
        lifecycle.a((I) this.f69804i.getValue());
    }
}
