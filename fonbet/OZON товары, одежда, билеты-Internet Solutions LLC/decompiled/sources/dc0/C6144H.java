package dc0;

import De.C2862e;
import Hb0.f;
import Sc.InterfaceC4008j;
import android.webkit.CookieManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.net.CookieHandler;
import java.net.CookieStore;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import jc0.C7338a;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.sso2.Sso2MobileConfigResponseDTO;
import xe.C10720e0;
import xe.C10727i;
import xe.a1;

/* renamed from: dc0.H, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6144H {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<CookieManager> f61480a;

    /* renamed from: b, reason: collision with root package name */
    private final CookieHandler f61481b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6147K> f61482c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<URI> f61483d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6160f> f61484e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C7338a> f61485f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<jd0.v> f61486g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<hd0.i> f61487h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Fb0.f f61488i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Cb0.i> f61489j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C2862e f61490k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C6178x f61491l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Hb0.c> f61492m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f61493n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f61494o;

    public C6144H(@NotNull InterfaceC4008j webViewCookieManager, CookieHandler cookieHandler, @NotNull InterfaceC4008j ozonIdCookieManager, @NotNull InterfaceC4008j primaryCookiesDomainURI, @NotNull InterfaceC4008j authCookieHandler, @NotNull InterfaceC4008j domainsProvider, @NotNull InterfaceC4008j webViewCookies, @NotNull InterfaceC4008j sso2MobileConfigRepository, @NotNull Fb0.f ozonIdConfig, @NotNull InterfaceC4008j networkCookieEvents, @NotNull C2862e coroutineScope, @NotNull C6178x currentUserRepository, @NotNull InterfaceC4008j featureFlagsStore) {
        Intrinsics.checkNotNullParameter(webViewCookieManager, "webViewCookieManager");
        Intrinsics.checkNotNullParameter(ozonIdCookieManager, "ozonIdCookieManager");
        Intrinsics.checkNotNullParameter(primaryCookiesDomainURI, "primaryCookiesDomainURI");
        Intrinsics.checkNotNullParameter(authCookieHandler, "authCookieHandler");
        Intrinsics.checkNotNullParameter(domainsProvider, "domainsProvider");
        Intrinsics.checkNotNullParameter(webViewCookies, "webViewCookies");
        Intrinsics.checkNotNullParameter(sso2MobileConfigRepository, "sso2MobileConfigRepository");
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        Intrinsics.checkNotNullParameter(networkCookieEvents, "networkCookieEvents");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        Intrinsics.checkNotNullParameter(featureFlagsStore, "featureFlagsStore");
        this.f61480a = webViewCookieManager;
        this.f61481b = cookieHandler;
        this.f61482c = ozonIdCookieManager;
        this.f61483d = primaryCookiesDomainURI;
        this.f61484e = authCookieHandler;
        this.f61485f = domainsProvider;
        this.f61486g = webViewCookies;
        this.f61487h = sso2MobileConfigRepository;
        this.f61488i = ozonIdConfig;
        this.f61489j = networkCookieEvents;
        this.f61490k = coroutineScope;
        this.f61491l = currentUserRepository;
        this.f61492m = featureFlagsStore;
        this.f61493n = new C6143G(this);
        this.f61494o = Sc.k.b(C6140D.f61470b);
    }

    public static /* synthetic */ Map h(C6144H c6144h, URI uri) {
        return c6144h.g(uri, U.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C6137A c6137a;
        int i11;
        C6144H c6144h;
        java.net.CookieManager cookieManager;
        CookieStore cookieStore;
        if (cVar instanceof C6137A) {
            c6137a = (C6137A) cVar;
            int i12 = c6137a.f61457g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c6137a.f61457g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c6137a.f61455e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c6137a.f61457g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    CookieManager value = this.f61480a.getValue();
                    if (value == null) {
                        c6144h = this;
                        c6144h.f61482c.getValue().getCookieStore().removeAll();
                        CookieHandler cookieHandler = c6144h.f61481b;
                        cookieManager = cookieHandler instanceof java.net.CookieManager ? (java.net.CookieManager) cookieHandler : null;
                        if (cookieManager != null && (cookieStore = cookieManager.getCookieStore()) != null) {
                            cookieStore.removeAll();
                        }
                        c6144h.f61484e.getValue().f();
                        return Unit.f71690a;
                    }
                    c6137a.f61454d = this;
                    c6137a.f61457g = 1;
                    if (C10727i.f(a1.a(1, "android.webkit.CookieManager.removeAllCookies"), new C6142F(value, null), c6137a) == aVar) {
                        return aVar;
                    }
                    c6144h = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c6144h = c6137a.f61454d;
                    Sc.s.b(obj);
                }
                ((ExecutorService) c6144h.f61494o.getValue()).submit(new CallableC6180z(c6144h.f61493n));
                c6144h.f61482c.getValue().getCookieStore().removeAll();
                CookieHandler cookieHandler2 = c6144h.f61481b;
                if (cookieHandler2 instanceof java.net.CookieManager) {
                }
                if (cookieManager != null) {
                    cookieStore.removeAll();
                }
                c6144h.f61484e.getValue().f();
                return Unit.f71690a;
            }
        }
        c6137a = new C6137A(this, cVar);
        Object obj2 = c6137a.f61455e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c6137a.f61457g;
        if (i11 != 0) {
        }
        ((ExecutorService) c6144h.f61494o.getValue()).submit(new CallableC6180z(c6144h.f61493n));
        c6144h.f61482c.getValue().getCookieStore().removeAll();
        CookieHandler cookieHandler22 = c6144h.f61481b;
        if (cookieHandler22 instanceof java.net.CookieManager) {
        }
        if (cookieManager != null) {
        }
        c6144h.f61484e.getValue().f();
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011d A[LOOP:3: B:49:0x0117->B:51:0x011d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C6138B c6138b;
        int i11;
        URI create;
        List list;
        C6144H c6144h;
        Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO;
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        Set<String> allDomains;
        if (cVar instanceof C6138B) {
            c6138b = (C6138B) cVar;
            int i12 = c6138b.f61463i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c6138b.f61463i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c6138b.f61461g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c6138b.f61463i;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    List b02 = C7714v.b0("__Secure-idp-token", "__Secure-idp-user-id");
                    create = URI.create(this.f61488i.getPrimaryDomain().g());
                    if (create == null) {
                        return Unit.f71690a;
                    }
                    f(create, b02);
                    List b03 = C7714v.b0("__Secure-token", "__Secure-product-user-id");
                    hd0.i value = this.f61487h.getValue();
                    c6138b.f61458d = this;
                    c6138b.f61459e = create;
                    c6138b.f61460f = b03;
                    c6138b.f61463i = 1;
                    Object f7 = value.f(c6138b);
                    if (f7 == aVar) {
                        return aVar;
                    }
                    list = b03;
                    obj = f7;
                    c6144h = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = c6138b.f61460f;
                    create = c6138b.f61459e;
                    c6144h = c6138b.f61458d;
                    Sc.s.b(obj);
                }
                sso2MobileConfigResponseDTO = (Sso2MobileConfigResponseDTO) obj;
                if (sso2MobileConfigResponseDTO != null || (allDomains = sso2MobileConfigResponseDTO.getAllDomains()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    Iterator<T> it3 = allDomains.iterator();
                    while (it3.hasNext()) {
                        URI e11 = cc0.c.e((String) it3.next());
                        if (e11 != null) {
                            arrayList.add(e11);
                        }
                    }
                }
                if (arrayList != null) {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        c6144h.f((URI) it4.next(), list);
                    }
                }
                List a02 = C7714v.a0("__Secure-sid");
                RandomAccess randomAccess = arrayList;
                if (arrayList == null) {
                    randomAccess = kotlin.collections.K.f71697a;
                }
                ArrayList q02 = C7714v.q0(create, (Collection) randomAccess);
                ArrayList arrayList2 = new ArrayList();
                it = q02.iterator();
                while (it.hasNext()) {
                    String host = ((URI) it.next()).getHost();
                    Intrinsics.checkNotNullExpressionValue(host, "getHost(...)");
                    String a11 = hd0.n.a(host);
                    URI e12 = a11 != null ? cc0.c.e(a11) : null;
                    if (e12 != null) {
                        arrayList2.add(e12);
                    }
                }
                it2 = C7714v.Y0(arrayList2).iterator();
                while (it2.hasNext()) {
                    c6144h.f((URI) it2.next(), a02);
                }
                return Unit.f71690a;
            }
        }
        c6138b = new C6138B(this, cVar);
        Object obj2 = c6138b.f61461g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c6138b.f61463i;
        if (i11 != 0) {
        }
        sso2MobileConfigResponseDTO = (Sso2MobileConfigResponseDTO) obj2;
        if (sso2MobileConfigResponseDTO != null) {
        }
        arrayList = null;
        if (arrayList != null) {
        }
        List a022 = C7714v.a0("__Secure-sid");
        RandomAccess randomAccess2 = arrayList;
        if (arrayList == null) {
        }
        ArrayList q022 = C7714v.q0(create, (Collection) randomAccess2);
        ArrayList arrayList22 = new ArrayList();
        it = q022.iterator();
        while (it.hasNext()) {
        }
        it2 = C7714v.Y0(arrayList22).iterator();
        while (it2.hasNext()) {
        }
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Set set, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C6139C c6139c;
        Object obj;
        int i11;
        C6144H c6144h;
        Collection collection;
        List b02;
        Collection collection2;
        List list;
        C6144H c6144h2;
        Collection collection3;
        Iterator it;
        Collection collection4;
        if (cVar instanceof C6139C) {
            c6139c = (C6139C) cVar;
            int i12 = c6139c.f61469i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c6139c.f61469i = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj = c6139c.f61467g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c6139c.f61469i;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    Hb0.c value = this.f61492m.getValue();
                    f.o oVar = f.o.f10813a;
                    c6139c.f61464d = this;
                    c6139c.f61465e = set;
                    c6139c.f61469i = 1;
                    obj = value.a(oVar, c6139c);
                    if (obj != aVar) {
                        c6144h = this;
                        collection = set;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = c6139c.f61466f;
                    collection2 = (Set) c6139c.f61465e;
                    c6144h2 = c6139c.f61464d;
                    Sc.s.b(obj);
                    Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO = (Sso2MobileConfigResponseDTO) obj;
                    Collection allDomains = sso2MobileConfigResponseDTO == null ? sso2MobileConfigResponseDTO.getAllDomains() : null;
                    b02 = list;
                    collection4 = allDomains;
                    c6144h = c6144h2;
                    if (collection4 != null) {
                        Iterator it2 = collection4.iterator();
                        while (it2.hasNext()) {
                            URI e11 = cc0.c.e((String) it2.next());
                            if (e11 != null) {
                                c6144h.f(e11, b02);
                            }
                        }
                    }
                    collection3 = collection2;
                    List b03 = C7714v.b0("__Secure-access-token", "__Secure-refresh-token", "__Secure-user-id", "__Secure-ab-group");
                    Collection collection5 = collection3;
                    if (collection3 == null) {
                        collection5 = c6144h.f61485f.getValue().b();
                    }
                    it = collection5.iterator();
                    while (it.hasNext()) {
                        URI e12 = cc0.c.e((String) it.next());
                        if (e12 != null) {
                            c6144h.f(e12, b03);
                        }
                    }
                    return Unit.f71690a;
                }
                Collection collection6 = (Set) c6139c.f61465e;
                c6144h = c6139c.f61464d;
                Sc.s.b(obj);
                collection = collection6;
                collection3 = collection;
                if (((Boolean) obj).booleanValue()) {
                    b02 = C7714v.b0("__Secure-token", "__Secure-product-user-id");
                    if (collection == null) {
                        hd0.i value2 = c6144h.f61487h.getValue();
                        c6139c.f61464d = c6144h;
                        c6139c.f61465e = (Set) collection;
                        c6139c.f61466f = b02;
                        c6139c.f61469i = 2;
                        Object f7 = value2.f(c6139c);
                        if (f7 != aVar) {
                            collection2 = collection;
                            list = b02;
                            obj = f7;
                            c6144h2 = c6144h;
                            Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO2 = (Sso2MobileConfigResponseDTO) obj;
                            Collection allDomains2 = sso2MobileConfigResponseDTO2 == null ? sso2MobileConfigResponseDTO2.getAllDomains() : null;
                            b02 = list;
                            collection4 = allDomains2;
                            c6144h = c6144h2;
                            if (collection4 != null) {
                            }
                            collection3 = collection2;
                        }
                        return aVar;
                    }
                    collection2 = collection;
                    collection4 = collection;
                    if (collection4 != null) {
                    }
                    collection3 = collection2;
                }
                List b032 = C7714v.b0("__Secure-access-token", "__Secure-refresh-token", "__Secure-user-id", "__Secure-ab-group");
                Collection collection52 = collection3;
                if (collection3 == null) {
                }
                it = collection52.iterator();
                while (it.hasNext()) {
                }
                return Unit.f71690a;
            }
        }
        c6139c = new C6139C(this, cVar);
        obj = c6139c.f61467g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c6139c.f61469i;
        if (i11 != 0) {
        }
        collection3 = collection;
        if (((Boolean) obj).booleanValue()) {
        }
        List b0322 = C7714v.b0("__Secure-access-token", "__Secure-refresh-token", "__Secure-user-id", "__Secure-ab-group");
        Collection collection522 = collection3;
        if (collection3 == null) {
        }
        it = collection522.iterator();
        while (it.hasNext()) {
        }
        return Unit.f71690a;
    }

    public final void f(@NotNull URI uri, @NotNull Iterable<String> cookieNames) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(cookieNames, "cookieNames");
        String domain = uri.getHost();
        Intrinsics.checkNotNullExpressionValue(domain, "getHost(...)");
        int i11 = C6171q.f61578b;
        Intrinsics.checkNotNullParameter(cookieNames, "cookieNames");
        Intrinsics.checkNotNullParameter(domain, "domain");
        Tc.b builder = C7714v.B();
        Iterator<String> it = cookieNames.iterator();
        while (it.hasNext()) {
            String str = it.next() + "=; Secure; Max-Age=0";
            builder.add(str);
            builder.add(C6171q.b(str, domain));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        l(uri, C6171q.x(builder.B()), false);
    }

    @NotNull
    public final Map<String, List<String>> g(URI uri, Map<String, ? extends List<String>> map) {
        Map<String, List<String>> map2;
        Map<String, List<String>> z11;
        if (uri == null) {
            return U.c();
        }
        if (this.f61480a.getValue() == null) {
            CookieHandler cookieHandler = this.f61481b;
            return (cookieHandler == null || (map2 = cookieHandler.get(uri, map)) == null) ? this.f61482c.getValue().a(uri, map) : map2;
        }
        jd0.v value = this.f61486g.getValue();
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        ArrayList b11 = value.b(uri2);
        return (b11 == null || (z11 = C6171q.z(b11)) == null) ? U.c() : z11;
    }

    @NotNull
    public final ArrayList i() {
        return C6171q.m(h(this, this.f61483d.getValue()));
    }

    public final void j() {
        this.f61491l.c(C6171q.C(i()));
    }

    public final void k(URI uri, Map<String, ? extends List<String>> map, boolean z11) {
        String host;
        if (map == null) {
            return;
        }
        ArrayList k11 = C6171q.k(map);
        if (k11.isEmpty()) {
            return;
        }
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(this.f61490k, He.b.f10879b, null, new C6141E(k11, this, uri, null), 2);
        l(uri, k11, z11);
        if (uri == null || (host = uri.getHost()) == null) {
            return;
        }
        this.f61484e.getValue().e(host, k11);
    }

    public final void l(URI uri, @NotNull ArrayList cookies, boolean z11) {
        String uri2;
        CookieManager value;
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        if (uri == null || (uri2 = uri.toString()) == null) {
            return;
        }
        Map<String, List<String>> A11 = C6171q.A(cookies);
        this.f61482c.getValue().b(uri, A11);
        CookieHandler cookieHandler = this.f61481b;
        if (cookieHandler != null) {
            cookieHandler.put(uri, A11);
        }
        if (z11 || (value = this.f61480a.getValue()) == null) {
            return;
        }
        Iterator it = cookies.iterator();
        while (it.hasNext()) {
            value.setCookie(uri2, ((C6179y) it.next()).b());
        }
        ((ExecutorService) this.f61494o.getValue()).submit(new CallableC6180z(this.f61493n));
    }
}
