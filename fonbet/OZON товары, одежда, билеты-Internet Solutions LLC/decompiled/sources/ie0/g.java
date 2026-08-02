package ie0;

import Sc.s;
import We.E;
import ae0.q;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import je0.AbstractC7412g;
import je0.C7408c;
import je0.C7413h;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.CountriesResponse;
import ru.ozon.mapsdk.common.geoproxy.data.model.CountryModel;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderObject;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProvidersV2Response;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeocodeResponse;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeocodeSuggestResponse;
import ru.ozon.mapsdk.common.geoproxy.data.model.MapKeysResponse;
import ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig;
import ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfigClient;
import ru.ozon.mapsdk.common.geoproxy.model.exceptions.GeoProxyApiException;
import te0.C9867b;
import ue0.C10044a;
import ue0.C10045b;
import ue0.InterfaceC10046c;
import xe.C10720e0;
import xe.C10727i;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    private static q f66322b;

    /* renamed from: c, reason: collision with root package name */
    private static E f66323c;

    /* renamed from: d, reason: collision with root package name */
    private static GeoProxyConfigClient f66324d;

    /* renamed from: e, reason: collision with root package name */
    private static C7413h f66325e;

    /* renamed from: f, reason: collision with root package name */
    private static String f66326f;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f66321a = new g();

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Je.d f66327g = Je.e.a();

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.geoproxy.GeoProxyClient$getMapKeys$2", f = "GeoProxyClient.kt", l = {381}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super MapKeysResponse>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f66328d;

        a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new a(1, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super MapKeysResponse> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f66328d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            g gVar = g.f66321a;
            C7408c a11 = g.a(gVar).a();
            String appName = g.a(gVar).b().getAppName();
            this.f66328d = 1;
            Object c11 = a11.c(appName, this);
            return c11 == aVar ? aVar : c11;
        }
    }

    public static final AbstractC7412g a(g gVar) {
        gVar.getClass();
        C7413h c7413h = f66325e;
        if (c7413h != null) {
            return c7413h;
        }
        throw new GeoProxyApiException("GeoProxyClient.config must be set", null, 2, null);
    }

    public static GeoProxyConfig c() {
        return f66324d;
    }

    public static Object e(@NotNull kotlin.coroutines.d dVar) {
        a aVar = new a(1, null);
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(He.b.f10879b, new l(aVar, null), (kotlin.coroutines.jvm.internal.c) dVar);
    }

    public static E f() {
        return f66323c;
    }

    public static String h() {
        return f66326f;
    }

    public static q i() {
        return f66322b;
    }

    public static void k(@NotNull GeoProxyConfigClient geoProxyConfigClient) {
        Intrinsics.checkNotNullParameter(geoProxyConfigClient, "geoProxyConfigClient");
        C7413h c7413h = new C7413h(geoProxyConfigClient);
        f66324d = geoProxyConfigClient;
        f66325e = c7413h;
        f66322b = new q(c7413h.d());
        f66323c = c7413h.d();
        C9867b c9867b = C9867b.f99466a;
        C9867b.h();
    }

    public static void l(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        f66326f = id2;
    }

    public static void m(boolean z11) {
        f66326f = z11 ? null : UUID.randomUUID().toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x005c, code lost:
    
        if (r10.a(r0) == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096 A[Catch: all -> 0x00dc, TryCatch #0 {all -> 0x00dc, blocks: (B:12:0x002b, B:13:0x008e, B:15:0x0096, B:16:0x0098, B:17:0x00a9, B:19:0x00af, B:23:0x00c0, B:26:0x00c7, B:30:0x00cf, B:34:0x00d6), top: B:11:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00af A[Catch: all -> 0x00dc, TRY_LEAVE, TryCatch #0 {all -> 0x00dc, blocks: (B:12:0x002b, B:13:0x008e, B:15:0x0096, B:16:0x0098, B:17:0x00a9, B:19:0x00af, B:23:0x00c0, B:26:0x00c7, B:30:0x00cf, B:34:0x00d6), top: B:11:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0079 A[Catch: all -> 0x00de, TRY_LEAVE, TryCatch #1 {all -> 0x00de, blocks: (B:56:0x0070, B:58:0x0079, B:62:0x00e0, B:63:0x00e7), top: B:55:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0 A[Catch: all -> 0x00de, TRY_ENTER, TryCatch #1 {all -> 0x00de, blocks: (B:56:0x0070, B:58:0x0079, B:62:0x00e0, B:63:0x00e7), top: B:55:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [Je.a] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v4, types: [Je.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        f fVar;
        int i11;
        Je.d dVar;
        ?? r02;
        C7413h c7413h;
        ae0.i iVar;
        List<CountryModel> countries;
        try {
            if (cVar instanceof f) {
                fVar = (f) cVar;
                int i12 = fVar.f66320h;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    fVar.f66320h = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = fVar.f66318f;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = fVar.f66320h;
                    if (i11 != 0) {
                        s.b(obj);
                        ae0.i.f36650a.getClass();
                        if (ae0.i.c() && ae0.i.b() == null) {
                            dVar = f66327g;
                            fVar.f66316d = dVar;
                            fVar.f66320h = 1;
                        }
                        ae0.i.f36650a.getClass();
                        return ae0.i.b();
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        iVar = fVar.f66317e;
                        r02 = fVar.f66316d;
                        try {
                            s.b(obj);
                            r02 = r02;
                            countries = ((CountriesResponse) obj).getCountries();
                            if (countries == null) {
                                countries = K.f71697a;
                            }
                            List<CountryModel> list = countries;
                            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
                            for (CountryModel countryModel : list) {
                                String uid = countryModel.getUid();
                                String str = "";
                                if (uid == null) {
                                    uid = "";
                                }
                                String nameRu = countryModel.getNameRu();
                                if (nameRu == null) {
                                    nameRu = "";
                                }
                                String nameEn = countryModel.getNameEn();
                                if (nameEn != null) {
                                    str = nameEn;
                                }
                                arrayList.add(new we0.l(uid, nameRu, str));
                            }
                            iVar.getClass();
                            ae0.i.f(arrayList);
                        } catch (Throwable unused) {
                        }
                        dVar = r02;
                        Unit unit = Unit.f71690a;
                        ae0.i.f36650a.getClass();
                        return ae0.i.b();
                    }
                    ?? r22 = fVar.f66316d;
                    s.b(obj);
                    dVar = r22;
                    ae0.i iVar2 = ae0.i.f36650a;
                    iVar2.getClass();
                    if (ae0.i.c() && ae0.i.b() == null) {
                        try {
                            f66321a.getClass();
                            c7413h = f66325e;
                        } catch (Throwable unused2) {
                            r02 = dVar;
                        }
                        if (c7413h != null) {
                            throw new GeoProxyApiException("GeoProxyClient.config must be set", null, 2, null);
                        }
                        C7408c a11 = c7413h.a();
                        fVar.f66316d = dVar;
                        fVar.f66317e = iVar2;
                        fVar.f66320h = 2;
                        Object b11 = a11.b(fVar);
                        if (b11 != aVar) {
                            r02 = dVar;
                            obj = b11;
                            iVar = iVar2;
                            countries = ((CountriesResponse) obj).getCountries();
                            if (countries == null) {
                            }
                            List<CountryModel> list2 = countries;
                            ArrayList arrayList2 = new ArrayList(C7714v.z(list2, 10));
                            while (r10.hasNext()) {
                            }
                            iVar.getClass();
                            ae0.i.f(arrayList2);
                            dVar = r02;
                        }
                        return aVar;
                    }
                    Unit unit2 = Unit.f71690a;
                    ae0.i.f36650a.getClass();
                    return ae0.i.b();
                }
            }
            ae0.i iVar22 = ae0.i.f36650a;
            iVar22.getClass();
            if (ae0.i.c()) {
                f66321a.getClass();
                c7413h = f66325e;
                if (c7413h != null) {
                }
            }
            Unit unit22 = Unit.f71690a;
            ae0.i.f36650a.getClass();
            return ae0.i.b();
        } finally {
            dVar.c(null);
        }
        fVar = new f(this, cVar);
        Object obj2 = fVar.f66318f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = fVar.f66320h;
        if (i11 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c A[LOOP:0: B:11:0x0066->B:13:0x006c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(String str, Double d11, Double d12, String str2, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        h hVar;
        int i11;
        Iterator<T> it;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i12 = hVar.f66331f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                hVar.f66331f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = hVar.f66329d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = hVar.f66331f;
                if (i11 != 0) {
                    s.b(obj);
                    i iVar = new i(str2, str, d11, d12, null);
                    hVar.f66331f = 1;
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    obj = C10727i.f(He.b.f10879b, new l(iVar, null), hVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                List<GeoProviderObject> providers = ((GeoProvidersV2Response) obj).getProviders();
                ArrayList arrayList = new ArrayList(C7714v.z(providers, 10));
                it = providers.iterator();
                while (it.hasNext()) {
                    arrayList.add(((GeoProviderObject) it.next()).getInfo());
                }
                return arrayList;
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.f66329d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = hVar.f66331f;
        if (i11 != 0) {
        }
        List<GeoProviderObject> providers2 = ((GeoProvidersV2Response) obj2).getProviders();
        ArrayList arrayList2 = new ArrayList(C7714v.z(providers2, 10));
        it = providers2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cd, code lost:
    
        if (r0 == r3) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:11:0x002a, B:12:0x00d0, B:14:0x00d8, B:15:0x00e9, B:17:0x00ef, B:21:0x00ff, B:24:0x0163, B:25:0x016c, B:27:0x0172, B:30:0x0183, B:33:0x018d, B:41:0x0192, B:46:0x0048, B:50:0x009f, B:52:0x00a4, B:53:0x00ab, B:58:0x0054, B:60:0x005f, B:62:0x0065), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable j(@NotNull String str, He0.b bVar, int i11, @NotNull List list, String str2, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        j jVar;
        int i12;
        He0.b bVar2;
        int i13;
        List list2;
        String str3;
        String str4;
        g gVar;
        String str5;
        g gVar2;
        String str6;
        List list3;
        try {
            if (cVar instanceof j) {
                jVar = (j) cVar;
                int i14 = jVar.f66345l;
                if ((i14 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    jVar.f66345l = i14 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = jVar.f66343j;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i12 = jVar.f66345l;
                    if (i12 != 0) {
                        s.b(obj);
                        ae0.i.f36650a.getClass();
                        if (ae0.i.c() && ae0.i.b() == null) {
                            jVar.f66337d = this;
                            jVar.f66338e = str;
                            bVar2 = bVar;
                            jVar.f66339f = bVar2;
                            jVar.f66340g = list;
                            jVar.f66341h = str2;
                            i13 = i11;
                            jVar.f66342i = i13;
                            jVar.f66345l = 1;
                            if (d(jVar) == aVar) {
                                return aVar;
                            }
                            str5 = str;
                            gVar2 = this;
                            str6 = str2;
                            list3 = list;
                        } else {
                            bVar2 = bVar;
                            i13 = i11;
                            list2 = list;
                            str3 = str2;
                            str4 = str;
                            gVar = this;
                            He0.b bVar3 = bVar2;
                            GeoProxyConfigClient geoProxyConfigClient = f66324d;
                            k kVar = new k(str4, i13, geoProxyConfigClient != null ? geoProxyConfigClient.getResponseLanguageString() : null, bVar3, str3, list2, null);
                            jVar.f66337d = null;
                            jVar.f66338e = null;
                            jVar.f66339f = null;
                            jVar.f66340g = null;
                            jVar.f66341h = null;
                            jVar.f66345l = 2;
                            gVar.getClass();
                            C10720e0 c10720e0 = C10720e0.f105451a;
                            obj = C10727i.f(He.b.f10879b, new l(kVar, null), jVar);
                        }
                    } else {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj);
                            List<GeocodeResponse> suggestions = ((GeocodeSuggestResponse) obj).getSuggestions();
                            if (suggestions == null) {
                                return K.f71697a;
                            }
                            List<GeocodeResponse> list4 = suggestions;
                            ArrayList arrayList = new ArrayList(C7714v.z(list4, 10));
                            for (GeocodeResponse geocodeResponse : list4) {
                                String displayAddressValue = geocodeResponse.getDisplayAddressValue();
                                if (displayAddressValue == null) {
                                    displayAddressValue = "";
                                }
                                arrayList.add(new He0.a(ae0.k.a(displayAddressValue), geocodeResponse.getAddress().getFullText(), ae0.k.a(geocodeResponse.getAddress().getFullText()), geocodeResponse.getAddress().getPostalCode(), geocodeResponse.getAddress().getComponents(), m.a(geocodeResponse.getAddress().getComponents()), new we0.m(geocodeResponse.getAddress().getGeometry().getPoint().getLat(), geocodeResponse.getAddress().getGeometry().getPoint().getLon()), geocodeResponse.getTrustCoord()));
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                He0.a aVar2 = (He0.a) next;
                                if (!kotlin.text.h.K(aVar2.e()) && !kotlin.text.h.K(aVar2.c())) {
                                    arrayList2.add(next);
                                }
                            }
                            return arrayList2;
                        }
                        int i15 = jVar.f66342i;
                        str6 = jVar.f66341h;
                        list3 = jVar.f66340g;
                        He0.b bVar4 = jVar.f66339f;
                        str5 = jVar.f66338e;
                        gVar2 = jVar.f66337d;
                        s.b(obj);
                        i13 = i15;
                        bVar2 = bVar4;
                    }
                    str3 = str6;
                    list2 = list3;
                    str4 = str5;
                    gVar = gVar2;
                    He0.b bVar32 = bVar2;
                    GeoProxyConfigClient geoProxyConfigClient2 = f66324d;
                    k kVar2 = new k(str4, i13, geoProxyConfigClient2 != null ? geoProxyConfigClient2.getResponseLanguageString() : null, bVar32, str3, list2, null);
                    jVar.f66337d = null;
                    jVar.f66338e = null;
                    jVar.f66339f = null;
                    jVar.f66340g = null;
                    jVar.f66341h = null;
                    jVar.f66345l = 2;
                    gVar.getClass();
                    C10720e0 c10720e02 = C10720e0.f105451a;
                    obj = C10727i.f(He.b.f10879b, new l(kVar2, null), jVar);
                }
            }
            if (i12 != 0) {
            }
            str3 = str6;
            list2 = list3;
            str4 = str5;
            gVar = gVar2;
            He0.b bVar322 = bVar2;
            GeoProxyConfigClient geoProxyConfigClient22 = f66324d;
            k kVar22 = new k(str4, i13, geoProxyConfigClient22 != null ? geoProxyConfigClient22.getResponseLanguageString() : null, bVar322, str3, list2, null);
            jVar.f66337d = null;
            jVar.f66338e = null;
            jVar.f66339f = null;
            jVar.f66340g = null;
            jVar.f66341h = null;
            jVar.f66345l = 2;
            gVar.getClass();
            C10720e0 c10720e022 = C10720e0.f105451a;
            obj = C10727i.f(He.b.f10879b, new l(kVar22, null), jVar);
        } catch (Exception e11) {
            if (C10045b.a(e11)) {
                C9867b c9867b = C9867b.f99466a;
                C9867b.f(Nk.a.b("decode error: ", e11.getMessage()), new C10044a(e11), InterfaceC10046c.a.ERROR);
            } else {
                C9867b c9867b2 = C9867b.f99466a;
                C9867b.f(Nk.a.b("Error while making suggest request: ", e11.getMessage()), new C10044a(e11), InterfaceC10046c.a.ERROR);
            }
            throw e11;
        }
        jVar = new j(this, cVar);
        Object obj2 = jVar.f66343j;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i12 = jVar.f66345l;
    }
}
