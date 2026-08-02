package hd0;

import Je.InterfaceC3394a;
import Sc.InterfaceC4008j;
import Sc.s;
import We.L;
import androidx.recyclerview.widget.LinearLayoutManager;
import dc0.C6144H;
import dc0.C6152P;
import dc0.C6171q;
import id0.C7050a;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jc0.C7339b;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ob0.B;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.ozon.id.nativeauth.sso2.Sso2Api;
import ru.ozon.id.nativeauth.sso2.Sso2MobileConfigResponseDTO;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Sso2Api> f65330a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<i> f65331b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Fb0.f f65332c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6144H> f65333d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6152P> f65334e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Cb0.e> f65335f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C7050a> f65336g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<B> f65337h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f65338i;

    static final class a extends AbstractC7737t implements Function0<String> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L f65340c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f65341d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(L l11, ArrayList arrayList) {
            super(0);
            this.f65340c = l11;
            this.f65341d = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return ((B) e.this.f65337h.getValue()).t(this.f65340c, this.f65341d);
        }
    }

    static final class b extends AbstractC7737t implements Function0<InterfaceC3394a> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f65342b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC3394a invoke() {
            return Je.e.a();
        }
    }

    public e(@NotNull Fb0.f ozonIdConfig, @NotNull InterfaceC4008j sso2Api, @NotNull InterfaceC4008j sso2MobileConfigRepository, @NotNull InterfaceC4008j localCookieDataSource, @NotNull InterfaceC4008j ozonIdRequiredCookieSource, @NotNull InterfaceC4008j clientCookiesInteractor, @NotNull InterfaceC4008j composerTrackingRepository, @NotNull InterfaceC4008j ozonIdTrackingManager) {
        Intrinsics.checkNotNullParameter(sso2Api, "sso2Api");
        Intrinsics.checkNotNullParameter(sso2MobileConfigRepository, "sso2MobileConfigRepository");
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        Intrinsics.checkNotNullParameter(localCookieDataSource, "localCookieDataSource");
        Intrinsics.checkNotNullParameter(ozonIdRequiredCookieSource, "ozonIdRequiredCookieSource");
        Intrinsics.checkNotNullParameter(clientCookiesInteractor, "clientCookiesInteractor");
        Intrinsics.checkNotNullParameter(composerTrackingRepository, "composerTrackingRepository");
        Intrinsics.checkNotNullParameter(ozonIdTrackingManager, "ozonIdTrackingManager");
        this.f65330a = sso2Api;
        this.f65331b = sso2MobileConfigRepository;
        this.f65332c = ozonIdConfig;
        this.f65333d = localCookieDataSource;
        this.f65334e = ozonIdRequiredCookieSource;
        this.f65335f = clientCookiesInteractor;
        this.f65336g = composerTrackingRepository;
        this.f65337h = ozonIdTrackingManager;
        this.f65338i = Sc.k.b(b.f65342b);
    }

    private final void c(L l11) {
        ArrayList i11 = this.f65333d.getValue().i();
        ArrayList arrayList = new ArrayList();
        if (C6171q.f("__Secure-idp-user-id", i11) == null) {
            arrayList.add("__Secure-idp-user-id");
        }
        if (C6171q.f("__Secure-idp-token", i11) == null) {
            arrayList.add("__Secure-idp-token");
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f65336g.getValue().c(new a(l11, arrayList));
    }

    private final Object d(Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO, Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO2, kotlin.coroutines.d<? super Unit> dVar) {
        Object e11 = this.f65333d.getValue().e(e0.d(sso2MobileConfigResponseDTO.getAllDomains(), sso2MobileConfigResponseDTO2.getAllDomains()), (kotlin.coroutines.jvm.internal.c) dVar);
        return e11 == Wc.a.COROUTINE_SUSPENDED ? e11 : Unit.f71690a;
    }

    private final void e(Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO, Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO2) {
        Fb0.e primaryDomain = this.f65332c.getPrimaryDomain();
        LinkedHashSet g10 = e0.g(primaryDomain.n() ? C7339b.c() : C7339b.b(), primaryDomain.j());
        ArrayList a11 = this.f65334e.getValue().a();
        ArrayList arrayList = new ArrayList(C7714v.z(a11, 10));
        Iterator it = a11.iterator();
        while (it.hasNext()) {
            arrayList.add(((zb0.e) it.next()).getName());
        }
        Set<String> allDomains = sso2MobileConfigResponseDTO.getAllDomains();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = allDomains.iterator();
        while (it2.hasNext()) {
            String a12 = n.a((String) it2.next());
            if (a12 != null) {
                arrayList2.add(a12);
            }
        }
        List l02 = C7714v.l0(arrayList2, e0.f(g10, sso2MobileConfigResponseDTO2.getAllDomains()));
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = l02.iterator();
        while (it3.hasNext()) {
            URI e11 = cc0.c.e((String) it3.next());
            if (e11 != null) {
                arrayList3.add(e11);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            this.f65333d.getValue().f((URI) it4.next(), arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO, kotlin.coroutines.jvm.internal.c cVar) {
        f fVar;
        int i11;
        e eVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i12 = fVar.f65347h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                fVar.f65347h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = fVar.f65345f;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = fVar.f65347h;
                if (i11 != 0) {
                    s.b(obj);
                    if (sso2MobileConfigResponseDTO == null) {
                        return Boolean.TRUE;
                    }
                    i value = this.f65331b.getValue();
                    fVar.f65343d = this;
                    fVar.f65344e = sso2MobileConfigResponseDTO;
                    fVar.f65347h = 1;
                    obj = value.g(fVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                    eVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sso2MobileConfigResponseDTO = fVar.f65344e;
                    eVar = fVar.f65343d;
                    s.b(obj);
                }
                String str = (String) obj;
                if (sso2MobileConfigResponseDTO.getCheckAppVersion() || Intrinsics.d(str, eVar.f65332c.getAppVersion())) {
                    return Boolean.valueOf((((long) sso2MobileConfigResponseDTO.getRefreshInterval()) * 1000) + sso2MobileConfigResponseDTO.getLastCallMS() < System.currentTimeMillis());
                }
                return Boolean.TRUE;
            }
        }
        fVar = new f(this, cVar);
        Object obj3 = fVar.f65345f;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = fVar.f65347h;
        if (i11 != 0) {
        }
        String str2 = (String) obj3;
        if (sso2MobileConfigResponseDTO.getCheckAppVersion()) {
        }
        return Boolean.valueOf((((long) sso2MobileConfigResponseDTO.getRefreshInterval()) * 1000) + sso2MobileConfigResponseDTO.getLastCallMS() < System.currentTimeMillis());
    }

    private final void g(Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO) {
        Set<String> allDomains = sso2MobileConfigResponseDTO.getAllDomains();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = allDomains.iterator();
        while (it.hasNext()) {
            String a11 = n.a((String) it.next());
            URI e11 = a11 != null ? cc0.c.e(a11) : null;
            if (e11 != null) {
                arrayList.add(e11);
            }
        }
        this.f65335f.getValue().g(this.f65334e.getValue().a(), arrayList, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(2:3|(4:5|6|7|8))|7|8|(2:(0)|(5:44|15|16|17|18))) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|103|6|7|8|(2:(0)|(5:44|15|16|17|18))) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x004c, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x004d, code lost:
    
        r11 = r2;
        r1 = r5;
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0049, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0181, code lost:
    
        if (r6.h(r11, r0) == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e9, code lost:
    
        if (((java.lang.Boolean) r12).booleanValue() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x006f, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0049: MOVE (r1 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:102:0x0049 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x004e: MOVE (r1 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:101:0x004d */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x004f: MOVE (r0 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:101:0x004d */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a0 A[Catch: all -> 0x019b, TryCatch #5 {all -> 0x019b, blocks: (B:36:0x0196, B:24:0x01a0, B:26:0x01a9, B:29:0x01b0), top: B:35:0x0196 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0196 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00cf A[Catch: all -> 0x007e, TryCatch #6 {all -> 0x007e, blocks: (B:16:0x01c1, B:75:0x007a, B:76:0x00e3, B:82:0x0087, B:83:0x00cb, B:85:0x00cf, B:91:0x00b2), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r11v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v34, types: [ru.ozon.id.nativeauth.sso2.Sso2MobileConfigResponseDTO] */
    /* JADX WARN: Type inference failed for: r11v5, types: [ru.ozon.id.nativeauth.sso2.Sso2MobileConfigResponseDTO] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v18, types: [Je.a] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20, types: [Je.a] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25, types: [Je.a] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v4, types: [Je.a] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [Je.a] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(boolean z11, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        h hVar;
        ?? r22;
        InterfaceC3394a interfaceC3394a;
        e eVar;
        L raw;
        e eVar2;
        InterfaceC3394a interfaceC3394a2;
        boolean z12;
        boolean z13;
        InterfaceC3394a interfaceC3394a3;
        Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO;
        InterfaceC3394a interfaceC3394a4;
        InterfaceC3394a interfaceC3394a5;
        Response response;
        Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO2;
        Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO3;
        Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO4;
        i value;
        String appVersion;
        try {
            if (cVar instanceof h) {
                hVar = (h) cVar;
                int i11 = hVar.f65357k;
                if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    hVar.f65357k = i11 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = hVar.f65355i;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    r22 = hVar.f65357k;
                    boolean z14 = true;
                    switch (r22) {
                        case 0:
                            s.b(obj);
                            InterfaceC3394a interfaceC3394a6 = (InterfaceC3394a) this.f65338i.getValue();
                            hVar.f65350d = this;
                            hVar.f65351e = interfaceC3394a6;
                            hVar.f65354h = z11;
                            hVar.f65357k = 1;
                            if (interfaceC3394a6.a(hVar) != aVar) {
                                eVar2 = this;
                                interfaceC3394a2 = interfaceC3394a6;
                                z12 = z11;
                                i value2 = eVar2.f65331b.getValue();
                                hVar.f65350d = eVar2;
                                hVar.f65351e = interfaceC3394a2;
                                hVar.f65354h = z12;
                                hVar.f65357k = 2;
                                obj = value2.f(hVar);
                                interfaceC3394a3 = interfaceC3394a2;
                                z13 = z12;
                                if (obj == aVar) {
                                }
                                Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO5 = (Sso2MobileConfigResponseDTO) obj;
                                if (!z13) {
                                    hVar.f65350d = eVar2;
                                    hVar.f65351e = interfaceC3394a3;
                                    hVar.f65352f = sso2MobileConfigResponseDTO5;
                                    hVar.f65357k = 3;
                                    Object f7 = eVar2.f(sso2MobileConfigResponseDTO5, hVar);
                                    if (f7 != aVar) {
                                        obj = f7;
                                        sso2MobileConfigResponseDTO = sso2MobileConfigResponseDTO5;
                                        interfaceC3394a5 = interfaceC3394a3;
                                        r22 = interfaceC3394a5;
                                        interfaceC3394a4 = interfaceC3394a5;
                                        break;
                                    }
                                } else {
                                    sso2MobileConfigResponseDTO = sso2MobileConfigResponseDTO5;
                                    interfaceC3394a4 = interfaceC3394a3;
                                    Sso2Api value3 = eVar2.f65330a.getValue();
                                    hVar.f65350d = eVar2;
                                    hVar.f65351e = interfaceC3394a4;
                                    hVar.f65352f = sso2MobileConfigResponseDTO;
                                    hVar.f65357k = 4;
                                    obj = value3.ssoMobileConfig(Ic0.j.f12234a, hVar);
                                    r22 = interfaceC3394a4;
                                    if (obj == aVar) {
                                    }
                                    response = (Response) obj;
                                    sso2MobileConfigResponseDTO2 = (Sso2MobileConfigResponseDTO) response.body();
                                    if (response.isSuccessful() || sso2MobileConfigResponseDTO2 == null) {
                                        throw new HttpException(response);
                                    }
                                    if (sso2MobileConfigResponseDTO != null ? sso2MobileConfigResponseDTO.getLogsEnabled() : true) {
                                        L raw2 = response.raw();
                                        Intrinsics.checkNotNullExpressionValue(raw2, "raw(...)");
                                        eVar2.c(raw2);
                                    }
                                    if (sso2MobileConfigResponseDTO != null) {
                                        hVar.f65350d = eVar2;
                                        hVar.f65351e = r22;
                                        hVar.f65352f = sso2MobileConfigResponseDTO;
                                        hVar.f65353g = sso2MobileConfigResponseDTO2;
                                        hVar.f65357k = 5;
                                        r22 = r22;
                                        if (eVar2.d(sso2MobileConfigResponseDTO, sso2MobileConfigResponseDTO2, hVar) == aVar) {
                                        }
                                        eVar2.e(sso2MobileConfigResponseDTO, sso2MobileConfigResponseDTO2);
                                    }
                                    sso2MobileConfigResponseDTO3 = sso2MobileConfigResponseDTO;
                                    sso2MobileConfigResponseDTO4 = sso2MobileConfigResponseDTO2;
                                    try {
                                        eVar2.g(sso2MobileConfigResponseDTO4);
                                        value = eVar2.f65331b.getValue();
                                        appVersion = eVar2.f65332c.getAppVersion();
                                        hVar.f65350d = eVar2;
                                        hVar.f65351e = r22;
                                        hVar.f65352f = sso2MobileConfigResponseDTO3;
                                        hVar.f65353g = sso2MobileConfigResponseDTO4;
                                        hVar.f65357k = 6;
                                        r22 = r22;
                                        if (value.i(appVersion, hVar) == aVar) {
                                        }
                                        i value4 = eVar2.f65331b.getValue();
                                        hVar.f65350d = eVar2;
                                        hVar.f65351e = r22;
                                        hVar.f65352f = sso2MobileConfigResponseDTO3;
                                        hVar.f65353g = null;
                                        hVar.f65357k = 7;
                                        break;
                                    } catch (HttpException e11) {
                                        Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO6 = sso2MobileConfigResponseDTO3;
                                        e = e11;
                                        z11 = sso2MobileConfigResponseDTO6;
                                        interfaceC3394a = r22;
                                        eVar = eVar2;
                                        if (z11 != 0) {
                                            try {
                                                z14 = z11.getLogsEnabled();
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r22 = interfaceC3394a;
                                                r22.c(null);
                                                throw th;
                                            }
                                        }
                                        if (z14) {
                                            eVar.getClass();
                                            Response<?> response2 = e.response();
                                            if (response2 != null && (raw = response2.raw()) != null) {
                                                eVar.f65336g.getValue().c(new g(eVar, raw));
                                            }
                                        }
                                        r22 = interfaceC3394a;
                                        Unit unit = Unit.f71690a;
                                        r22.c(null);
                                        return Unit.f71690a;
                                    }
                                }
                            }
                            return aVar;
                        case 1:
                            boolean z15 = hVar.f65354h;
                            InterfaceC3394a interfaceC3394a7 = hVar.f65351e;
                            eVar2 = hVar.f65350d;
                            s.b(obj);
                            interfaceC3394a2 = interfaceC3394a7;
                            z12 = z15;
                            i value22 = eVar2.f65331b.getValue();
                            hVar.f65350d = eVar2;
                            hVar.f65351e = interfaceC3394a2;
                            hVar.f65354h = z12;
                            hVar.f65357k = 2;
                            obj = value22.f(hVar);
                            interfaceC3394a3 = interfaceC3394a2;
                            z13 = z12;
                            if (obj == aVar) {
                            }
                            Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO52 = (Sso2MobileConfigResponseDTO) obj;
                            if (!z13) {
                            }
                            break;
                        case 2:
                            boolean z16 = hVar.f65354h;
                            InterfaceC3394a interfaceC3394a8 = hVar.f65351e;
                            eVar2 = hVar.f65350d;
                            s.b(obj);
                            interfaceC3394a3 = interfaceC3394a8;
                            z13 = z16;
                            Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO522 = (Sso2MobileConfigResponseDTO) obj;
                            if (!z13) {
                            }
                            break;
                        case 3:
                            sso2MobileConfigResponseDTO = hVar.f65352f;
                            InterfaceC3394a interfaceC3394a9 = hVar.f65351e;
                            eVar2 = hVar.f65350d;
                            s.b(obj);
                            interfaceC3394a5 = interfaceC3394a9;
                            r22 = interfaceC3394a5;
                            interfaceC3394a4 = interfaceC3394a5;
                            break;
                        case 4:
                            sso2MobileConfigResponseDTO = hVar.f65352f;
                            InterfaceC3394a interfaceC3394a10 = hVar.f65351e;
                            eVar2 = hVar.f65350d;
                            s.b(obj);
                            r22 = interfaceC3394a10;
                            response = (Response) obj;
                            sso2MobileConfigResponseDTO2 = (Sso2MobileConfigResponseDTO) response.body();
                            if (response.isSuccessful()) {
                            }
                            throw new HttpException(response);
                        case 5:
                            Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO7 = hVar.f65353g;
                            Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO8 = hVar.f65352f;
                            InterfaceC3394a interfaceC3394a11 = hVar.f65351e;
                            e eVar3 = hVar.f65350d;
                            s.b(obj);
                            sso2MobileConfigResponseDTO2 = sso2MobileConfigResponseDTO7;
                            sso2MobileConfigResponseDTO = sso2MobileConfigResponseDTO8;
                            r22 = interfaceC3394a11;
                            eVar2 = eVar3;
                            eVar2.e(sso2MobileConfigResponseDTO, sso2MobileConfigResponseDTO2);
                            sso2MobileConfigResponseDTO3 = sso2MobileConfigResponseDTO;
                            sso2MobileConfigResponseDTO4 = sso2MobileConfigResponseDTO2;
                            eVar2.g(sso2MobileConfigResponseDTO4);
                            value = eVar2.f65331b.getValue();
                            appVersion = eVar2.f65332c.getAppVersion();
                            hVar.f65350d = eVar2;
                            hVar.f65351e = r22;
                            hVar.f65352f = sso2MobileConfigResponseDTO3;
                            hVar.f65353g = sso2MobileConfigResponseDTO4;
                            hVar.f65357k = 6;
                            r22 = r22;
                            if (value.i(appVersion, hVar) == aVar) {
                            }
                            i value42 = eVar2.f65331b.getValue();
                            hVar.f65350d = eVar2;
                            hVar.f65351e = r22;
                            hVar.f65352f = sso2MobileConfigResponseDTO3;
                            hVar.f65353g = null;
                            hVar.f65357k = 7;
                            break;
                        case 6:
                            sso2MobileConfigResponseDTO4 = hVar.f65353g;
                            Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO9 = hVar.f65352f;
                            InterfaceC3394a interfaceC3394a12 = hVar.f65351e;
                            e eVar4 = hVar.f65350d;
                            s.b(obj);
                            sso2MobileConfigResponseDTO3 = sso2MobileConfigResponseDTO9;
                            r22 = interfaceC3394a12;
                            eVar2 = eVar4;
                            i value422 = eVar2.f65331b.getValue();
                            hVar.f65350d = eVar2;
                            hVar.f65351e = r22;
                            hVar.f65352f = sso2MobileConfigResponseDTO3;
                            hVar.f65353g = null;
                            hVar.f65357k = 7;
                            break;
                        case 7:
                            z11 = hVar.f65352f;
                            interfaceC3394a = hVar.f65351e;
                            eVar = hVar.f65350d;
                            try {
                                s.b(obj);
                            } catch (HttpException e12) {
                                e = e12;
                                if (z11 != 0) {
                                }
                                if (z14) {
                                }
                            } catch (Throwable unused) {
                            }
                            r22 = interfaceC3394a;
                            Unit unit2 = Unit.f71690a;
                            r22.c(null);
                            return Unit.f71690a;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (r22) {
            }
            interfaceC3394a = r22;
            r22 = interfaceC3394a;
            Unit unit22 = Unit.f71690a;
            r22.c(null);
            return Unit.f71690a;
        } catch (Throwable th3) {
            th = th3;
            r22.c(null);
            throw th;
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.f65355i;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        r22 = hVar.f65357k;
        boolean z142 = true;
    }
}
