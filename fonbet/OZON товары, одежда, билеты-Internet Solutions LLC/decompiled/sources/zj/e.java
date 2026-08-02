package zj;

import Aj.C2434a;
import Aj.C2435b;
import Bj.c;
import Bj.g;
import Cj.C2780a;
import Dj.InterfaceC2875c;
import Od0.e;
import Sc.InterfaceC4008j;
import Sc.k;
import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import xj.f;

/* loaded from: classes6.dex */
public final class e extends Od0.e<InterfaceC2875c> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<? extends InterfaceC2875c> f109304a = InterfaceC2875c.class;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f109305b = k.b(a.f109306a);

    /* synthetic */ class a extends C7735q implements Function0<C2434a> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f109306a = new a(0, C2434a.class, "<init>", "<init>()V", 0);

        @Override // kotlin.jvm.functions.Function0
        public final C2434a invoke() {
            return new C2434a();
        }
    }

    @Override // Od0.d
    public final Ld0.e create(Ld0.c store) {
        Intrinsics.checkNotNullParameter(store, "store");
        sj.e.f98817f.getClass();
        sj.e.r(store);
        return new f();
    }

    @Override // Od0.d
    @NotNull
    public final List<C2780a> createPluginProviderIntegration(@NotNull Ld0.c diStore) {
        Intrinsics.checkNotNullParameter(diStore, "diStore");
        return C7714v.a0(new C2780a(diStore));
    }

    @Override // Od0.d
    @NotNull
    public final Class<? extends InterfaceC2875c> getKey() {
        return this.f109304a;
    }

    @Override // Od0.e
    @NotNull
    public final e.a handleDeeplink(@NotNull Ld0.c store, @NotNull e.b deeplink) {
        String queryParameter;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ((C2434a) this.f109305b.getValue()).getClass();
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Uri a11 = deeplink.a();
        if (a11 != null && Intrinsics.d(a11.getHost(), "ozonLogger")) {
            Bj.e eVar = null;
            if (!Intrinsics.d(a11.getPath(), "/set")) {
                return new e.a.b("Only \"/set\" path is supported!", null);
            }
            if (a11.getQuery() == null) {
                return new e.a.b("Query is null!", null);
            }
            Set<String> queryParameterNames = a11.getQueryParameterNames();
            Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
            g.a aVar = g.Companion;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : queryParameterNames) {
                aVar.getClass();
                g a12 = g.a.a(str);
                if (a12 != null && (queryParameter = a11.getQueryParameter(str)) != null) {
                    linkedHashMap.put(a12, queryParameter);
                }
            }
            if (linkedHashMap.isEmpty()) {
                return new e.a.b("Query is empty - no params specified!", null);
            }
            ArrayList arrayList = new ArrayList();
            g gVar = g.IS_DEBUG;
            String str2 = (String) linkedHashMap.get(gVar);
            if (str2 != null) {
                Boolean t02 = h.t0(str2);
                if (t02 != null) {
                    sj.e.f98817f.l(t02.booleanValue());
                } else {
                    eVar = new Bj.e(gVar, str2);
                }
                if (eVar != null) {
                    arrayList.add(eVar);
                }
            }
            Object bVar = arrayList.isEmpty() ? Bj.f.f3887a : new c.b(arrayList);
            if (!(bVar instanceof Bj.c)) {
                return new e.a.C0409a();
            }
            Bj.c cVar = (Bj.c) bVar;
            return new e.a.b(C2435b.a(cVar), Bj.b.a(cVar));
        }
        return new e.a.c();
    }

    @Override // Od0.d
    public final boolean isLazyInitializationEnabled() {
        return false;
    }
}
