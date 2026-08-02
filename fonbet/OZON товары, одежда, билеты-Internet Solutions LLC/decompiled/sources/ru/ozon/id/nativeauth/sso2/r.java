package ru.ozon.id.nativeauth.sso2;

import De.C2862e;
import Sc.InterfaceC4008j;
import We.L;
import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import dc0.C6152P;
import id0.C7050a;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.ozon.id.nativeauth.sso2.Sso2Api;
import ru.ozon.id.nativeauth.sso2.s;
import ru.ozon.id.nativeauth.sso2.u;
import xe.C10721f;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Fb0.f f97455a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Sso2Api> f97456b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6152P> f97457c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Cb0.e> f97458d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2862e f97459e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C7050a> f97460f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<hd0.i> f97461g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<hd0.e> f97462h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<ob0.B> f97463i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97464j;

    public r() {
        throw null;
    }

    public r(Fb0.f ozonIdConfig, InterfaceC4008j sso2Api, InterfaceC4008j ozonIdRequiredCookieSource, InterfaceC4008j clientCookiesInteractor, InterfaceC4008j composerTrackingRepository, InterfaceC4008j sso2MobileConfigRepository, InterfaceC4008j sso2MobileConfigInteractor, InterfaceC4008j ozonIdTrackingManager) {
        C2862e coroutineScope = td0.f.a();
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        Intrinsics.checkNotNullParameter(sso2Api, "sso2Api");
        Intrinsics.checkNotNullParameter(ozonIdRequiredCookieSource, "ozonIdRequiredCookieSource");
        Intrinsics.checkNotNullParameter(clientCookiesInteractor, "clientCookiesInteractor");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(composerTrackingRepository, "composerTrackingRepository");
        Intrinsics.checkNotNullParameter(sso2MobileConfigRepository, "sso2MobileConfigRepository");
        Intrinsics.checkNotNullParameter(sso2MobileConfigInteractor, "sso2MobileConfigInteractor");
        Intrinsics.checkNotNullParameter(ozonIdTrackingManager, "ozonIdTrackingManager");
        this.f97455a = ozonIdConfig;
        this.f97456b = sso2Api;
        this.f97457c = ozonIdRequiredCookieSource;
        this.f97458d = clientCookiesInteractor;
        this.f97459e = coroutineScope;
        this.f97460f = composerTrackingRepository;
        this.f97461g = sso2MobileConfigRepository;
        this.f97462h = sso2MobileConfigInteractor;
        this.f97463i = ozonIdTrackingManager;
        this.f97464j = Sc.k.b(n.f97442b);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|(2:14|(1:18))|19|20)(2:22|23))(2:24|25))(3:32|33|(2:35|36))|26|(2:28|29)(2:30|31)))|46|6|7|(0)(0)|26|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0052, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0053, code lost:
    
        r7 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:
    
        r9 = r10.getAuthActionsRequiredDomains().contains(r8);
        r0.f97419d = r6;
        r0.f97420e = r7;
        r0.f97421f = r9;
        r0.f97422g = r7;
        r0.f97423h = null;
        r0.f97424i = r9;
        r0.f97427l = 2;
        r11 = r6.j(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b6, code lost:
    
        if (r11 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b9, code lost:
    
        r10 = r6;
        r6 = r9;
        r9 = r7;
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0050, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return new ru.ozon.id.nativeauth.sso2.u.a(r9, r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083 A[Catch: Exception -> 0x0050, HttpException -> 0x0052, TryCatch #2 {HttpException -> 0x0052, Exception -> 0x0050, blocks: (B:25:0x004c, B:26:0x007b, B:28:0x0083, B:30:0x008e, B:31:0x0093, B:33:0x005d), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e A[Catch: Exception -> 0x0050, HttpException -> 0x0052, TryCatch #2 {HttpException -> 0x0052, Exception -> 0x0050, blocks: (B:25:0x004c, B:26:0x007b, B:28:0x0083, B:30:0x008e, B:31:0x0093, B:33:0x005d), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(r rVar, t tVar, String str, String domain, Sso2DomainsAuthMobileResponse sso2DomainsAuthMobileResponse, kotlin.coroutines.jvm.internal.c cVar) {
        i iVar;
        int i11;
        L raw;
        Response response;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i12 = iVar.f97427l;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                iVar.f97427l = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = iVar.f97425j;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = iVar.f97427l;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    Sso2Api value = rVar.f97456b.getValue();
                    iVar.f97419d = rVar;
                    iVar.f97420e = tVar;
                    iVar.f97421f = str;
                    iVar.f97422g = domain;
                    iVar.f97423h = sso2DomainsAuthMobileResponse;
                    iVar.f97427l = 1;
                    obj = value.authDomain(str, Sso2Api.a.f97363a, iVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z11 = iVar.f97424i;
                        HttpException httpException = (HttpException) iVar.f97422g;
                        String str2 = iVar.f97421f;
                        t tVar2 = iVar.f97420e;
                        r rVar2 = iVar.f97419d;
                        Sc.s.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            rVar2.getClass();
                            Response<?> response2 = httpException.response();
                            if (response2 != null && (raw = response2.raw()) != null) {
                                rVar2.f97460f.getValue().c(new p(rVar2, raw, z11, tVar2));
                            }
                        }
                        return new u.c(str2, td0.j.b(httpException), z11);
                    }
                    Sso2DomainsAuthMobileResponse sso2DomainsAuthMobileResponse2 = iVar.f97423h;
                    domain = (String) iVar.f97422g;
                    String str3 = iVar.f97421f;
                    t tVar3 = iVar.f97420e;
                    r rVar3 = iVar.f97419d;
                    Sc.s.b(obj);
                }
                response = (Response) obj;
                if (response.isSuccessful()) {
                    throw new HttpException(response);
                }
                Intrinsics.checkNotNullParameter(domain, "domain");
                return new u.d(domain);
            }
        }
        iVar = new i(rVar, cVar);
        Object obj2 = iVar.f97425j;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = iVar.f97427l;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(List list, kotlin.coroutines.jvm.internal.c cVar) {
        j jVar;
        int i11;
        r rVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i12 = jVar.f97431g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                jVar.f97431g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = jVar.f97429e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = jVar.f97431g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (!list.isEmpty()) {
                        jVar.f97428d = this;
                        jVar.f97431g = 1;
                        if (k(list, jVar) == aVar) {
                            return aVar;
                        }
                        rVar = this;
                    }
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar = jVar.f97428d;
                Sc.s.b(obj);
                C10727i.c((M) rVar.f97464j.getValue(), null, null, new k(rVar, null), 3);
                return Unit.f71690a;
            }
        }
        jVar = new j(this, cVar);
        Object obj2 = jVar.f97429e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = jVar.f97431g;
        if (i11 != 0) {
        }
        C10727i.c((M) rVar.f97464j.getValue(), null, null, new k(rVar, null), 3);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(kotlin.coroutines.jvm.internal.c cVar) {
        l lVar;
        int i11;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i12 = lVar.f97436f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                lVar.f97436f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = lVar.f97434d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = lVar.f97436f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    hd0.i value = this.f97461g.getValue();
                    lVar.f97436f = 1;
                    obj = value.f(lVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO = (Sso2MobileConfigResponseDTO) obj;
                return Boolean.valueOf(sso2MobileConfigResponseDTO != null ? sso2MobileConfigResponseDTO.getLogsEnabled() : true);
            }
        }
        lVar = new l(this, cVar);
        Object obj2 = lVar.f97434d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = lVar.f97436f;
        if (i11 != 0) {
        }
        Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO2 = (Sso2MobileConfigResponseDTO) obj2;
        return Boolean.valueOf(sso2MobileConfigResponseDTO2 != null ? sso2MobileConfigResponseDTO2.getLogsEnabled() : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00da, code lost:
    
        if (r6.h(r4, r2) == r3) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(List list, kotlin.coroutines.jvm.internal.c cVar) {
        m mVar;
        int i11;
        List list2;
        r rVar;
        Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO;
        ArrayList arrayList;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i12 = mVar.f97441h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                mVar.f97441h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = mVar.f97439f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = mVar.f97441h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    hd0.i value = this.f97461g.getValue();
                    mVar.f97437d = this;
                    mVar.f97438e = list;
                    mVar.f97441h = 1;
                    obj = value.f(mVar);
                    if (obj != aVar) {
                        list2 = list;
                        rVar = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                list2 = mVar.f97438e;
                rVar = mVar.f97437d;
                Sc.s.b(obj);
                sso2MobileConfigResponseDTO = (Sso2MobileConfigResponseDTO) obj;
                if (sso2MobileConfigResponseDTO != null) {
                    return Unit.f71690a;
                }
                List<String> requiredDomains = sso2MobileConfigResponseDTO.getRequiredDomains();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : requiredDomains) {
                    if (list2.contains((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                List<String> nonRequiredDomains = sso2MobileConfigResponseDTO.getNonRequiredDomains();
                if (nonRequiredDomains != null) {
                    arrayList = new ArrayList();
                    for (Object obj3 : nonRequiredDomains) {
                        if (list2.contains((String) obj3)) {
                            arrayList.add(obj3);
                        }
                    }
                } else {
                    arrayList = null;
                }
                Sso2MobileConfigResponseDTO copy$default = Sso2MobileConfigResponseDTO.copy$default(sso2MobileConfigResponseDTO, 0, arrayList2, arrayList, 0L, false, null, false, 121, null);
                hd0.i value2 = rVar.f97461g.getValue();
                mVar.f97437d = null;
                mVar.f97438e = null;
                mVar.f97441h = 2;
            }
        }
        mVar = new m(this, cVar);
        Object obj4 = mVar.f97439f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = mVar.f97441h;
        if (i11 != 0) {
        }
        sso2MobileConfigResponseDTO = (Sso2MobileConfigResponseDTO) obj4;
        if (sso2MobileConfigResponseDTO != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009a, code lost:
    
        if (r1.h(r6, r2) != r3) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Sso2DomainsAuthMobileResponse sso2DomainsAuthMobileResponse, kotlin.coroutines.jvm.internal.c cVar) {
        o oVar;
        int i11;
        r rVar;
        Sso2DomainsAuthMobileResponse sso2DomainsAuthMobileResponse2;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i12 = oVar.f97447h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                oVar.f97447h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = oVar.f97445f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = oVar.f97447h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    hd0.i value = this.f97461g.getValue();
                    String appVersion = this.f97455a.getAppVersion();
                    oVar.f97443d = this;
                    oVar.f97444e = sso2DomainsAuthMobileResponse;
                    oVar.f97447h = 1;
                    if (value.i(appVersion, oVar) != aVar) {
                        rVar = this;
                        sso2DomainsAuthMobileResponse2 = sso2DomainsAuthMobileResponse;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                sso2DomainsAuthMobileResponse2 = oVar.f97444e;
                rVar = oVar.f97443d;
                Sc.s.b(obj);
                hd0.i value2 = rVar.f97461g.getValue();
                ArrayList m11 = m(sso2DomainsAuthMobileResponse2.getAuthActionsRequiredDomains());
                List<String> authActionsNonRequiredDomains = sso2DomainsAuthMobileResponse2.getAuthActionsNonRequiredDomains();
                Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO = new Sso2MobileConfigResponseDTO(0, m11, authActionsNonRequiredDomains == null ? m(authActionsNonRequiredDomains) : K.f71697a, 0L, false, null, false, 120, null);
                oVar.f97443d = null;
                oVar.f97444e = null;
                oVar.f97447h = 2;
            }
        }
        oVar = new o(this, cVar);
        Object obj2 = oVar.f97445f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = oVar.f97447h;
        if (i11 != 0) {
        }
        hd0.i value22 = rVar.f97461g.getValue();
        ArrayList m112 = m(sso2DomainsAuthMobileResponse2.getAuthActionsRequiredDomains());
        List<String> authActionsNonRequiredDomains2 = sso2DomainsAuthMobileResponse2.getAuthActionsNonRequiredDomains();
        Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO2 = new Sso2MobileConfigResponseDTO(0, m112, authActionsNonRequiredDomains2 == null ? m(authActionsNonRequiredDomains2) : K.f71697a, 0L, false, null, false, 120, null);
        oVar.f97443d = null;
        oVar.f97444e = null;
        oVar.f97447h = 2;
    }

    private static ArrayList m(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String host = Uri.parse((String) it.next()).getHost();
            if (host != null) {
                arrayList.add(host);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01ff, code lost:
    
        if (r6.i(r5, r3) != r4) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f8, code lost:
    
        if (r10.l(r0, r3) == r4) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b9 A[LOOP:0: B:17:0x01b3->B:19:0x01b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01e0 A[LOOP:1: B:22:0x01da->B:24:0x01e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017e A[LOOP:3: B:50:0x0178->B:52:0x017e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(@NotNull t tVar, @NotNull List list, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        g gVar;
        t tVar2;
        r rVar;
        t tVar3;
        r rVar2;
        Object j11;
        r rVar3;
        t tVar4;
        Object f7;
        List list2;
        Sso2DomainsAuthMobileResponse sso2DomainsAuthMobileResponse;
        r rVar4;
        t tVar5;
        Response<?> response;
        String c11;
        L raw;
        Iterator it;
        List W02;
        Iterator it2;
        Object a11;
        List list3;
        r rVar5;
        String a12;
        Iterator it3;
        List list4 = list;
        try {
            if (cVar instanceof g) {
                gVar = (g) cVar;
                int i11 = gVar.f97413j;
                if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    gVar.f97413j = i11 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = gVar.f97411h;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    switch (gVar.f97413j) {
                        case 0:
                            Sc.s.b(obj);
                            try {
                                Sso2Api value = this.f97456b.getValue();
                                Sso2DomainsAuthMobileRequest sso2DomainsAuthMobileRequest = new Sso2DomainsAuthMobileRequest(list4);
                                gVar.f97407d = this;
                                tVar2 = tVar;
                                try {
                                    gVar.f97408e = tVar2;
                                    gVar.f97409f = list4;
                                    gVar.f97413j = 1;
                                    obj = value.domainsAuthMobile(sso2DomainsAuthMobileRequest, gVar);
                                    if (obj != aVar) {
                                        tVar3 = tVar2;
                                        rVar2 = this;
                                        Sso2DomainsAuthMobileResponse sso2DomainsAuthMobileResponse2 = (Sso2DomainsAuthMobileResponse) obj;
                                        hd0.i value2 = rVar2.f97461g.getValue();
                                        gVar.f97407d = rVar2;
                                        gVar.f97408e = tVar3;
                                        gVar.f97409f = list4;
                                        gVar.f97410g = sso2DomainsAuthMobileResponse2;
                                        gVar.f97413j = 3;
                                        f7 = value2.f(gVar);
                                        if (f7 != aVar) {
                                            t tVar6 = tVar3;
                                            list2 = list4;
                                            sso2DomainsAuthMobileResponse = sso2DomainsAuthMobileResponse2;
                                            obj = f7;
                                            rVar4 = rVar2;
                                            tVar5 = tVar6;
                                            if (obj == null) {
                                                gVar.f97407d = rVar4;
                                                gVar.f97408e = tVar5;
                                                gVar.f97409f = list2;
                                                gVar.f97410g = sso2DomainsAuthMobileResponse;
                                                gVar.f97413j = 4;
                                                break;
                                            }
                                            Sso2DomainsAuthMobileResponse sso2DomainsAuthMobileResponse3 = sso2DomainsAuthMobileResponse;
                                            t tVar7 = tVar5;
                                            r rVar6 = rVar4;
                                            List<String> authActionsRequiredDomains = sso2DomainsAuthMobileResponse3.getAuthActionsRequiredDomains();
                                            List<String> authActionsNonRequiredDomains = sso2DomainsAuthMobileResponse3.getAuthActionsNonRequiredDomains();
                                            ArrayList p02 = C7714v.p0(authActionsNonRequiredDomains != null ? authActionsNonRequiredDomains : K.f71697a, authActionsRequiredDomains);
                                            rVar6.getClass();
                                            ArrayList arrayList = new ArrayList();
                                            it = p02.iterator();
                                            while (it.hasNext()) {
                                                String host = Uri.parse((String) it.next()).getHost();
                                                URI e11 = (host == null || (a12 = hd0.n.a(host)) == null) ? null : cc0.c.e(a12);
                                                if (e11 != null) {
                                                    arrayList.add(e11);
                                                }
                                            }
                                            rVar6.f97458d.getValue().g(rVar6.f97457c.getValue().a(), arrayList, false);
                                            ArrayList arrayList2 = new ArrayList();
                                            W02 = C7714v.W0(list2);
                                            ArrayList arrayList3 = new ArrayList(C7714v.z(p02, 10));
                                            it2 = p02.iterator();
                                            while (it2.hasNext()) {
                                                arrayList3.add(C10727i.a(rVar6.f97459e, null, null, new h((String) it2.next(), rVar6, tVar7, sso2DomainsAuthMobileResponse3, null), 3));
                                            }
                                            gVar.f97407d = rVar6;
                                            gVar.f97408e = arrayList2;
                                            gVar.f97409f = W02;
                                            gVar.f97410g = null;
                                            gVar.f97413j = 5;
                                            a11 = C10721f.a(arrayList3, gVar);
                                            if (a11 != aVar) {
                                                obj = a11;
                                                list3 = arrayList2;
                                                rVar5 = rVar6;
                                                for (u uVar : (Iterable) obj) {
                                                    list3.add(uVar);
                                                    W02.remove(uVar.a());
                                                }
                                                List list5 = W02;
                                                ArrayList arrayList4 = new ArrayList(C7714v.z(list5, 10));
                                                it3 = list5.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList4.add(new u.b((String) it3.next()));
                                                }
                                                list3.addAll(arrayList4);
                                                gVar.f97407d = list3;
                                                gVar.f97408e = null;
                                                gVar.f97409f = null;
                                                gVar.f97413j = 6;
                                                break;
                                            }
                                        }
                                    }
                                } catch (HttpException e12) {
                                    e = e12;
                                    rVar = this;
                                    gVar.f97407d = rVar;
                                    gVar.f97408e = tVar2;
                                    gVar.f97409f = e;
                                    gVar.f97413j = 2;
                                    j11 = rVar.j(gVar);
                                    if (j11 != aVar) {
                                    }
                                    return aVar;
                                }
                            } catch (HttpException e13) {
                                e = e13;
                                tVar2 = tVar;
                            }
                            return aVar;
                        case 1:
                            list4 = (List) gVar.f97409f;
                            tVar3 = (t) gVar.f97408e;
                            rVar2 = (r) gVar.f97407d;
                            try {
                                Sc.s.b(obj);
                                Sso2DomainsAuthMobileResponse sso2DomainsAuthMobileResponse22 = (Sso2DomainsAuthMobileResponse) obj;
                                hd0.i value22 = rVar2.f97461g.getValue();
                                gVar.f97407d = rVar2;
                                gVar.f97408e = tVar3;
                                gVar.f97409f = list4;
                                gVar.f97410g = sso2DomainsAuthMobileResponse22;
                                gVar.f97413j = 3;
                                f7 = value22.f(gVar);
                                if (f7 != aVar) {
                                }
                            } catch (HttpException e14) {
                                e = e14;
                                rVar = rVar2;
                                tVar2 = tVar3;
                                gVar.f97407d = rVar;
                                gVar.f97408e = tVar2;
                                gVar.f97409f = e;
                                gVar.f97413j = 2;
                                j11 = rVar.j(gVar);
                                if (j11 != aVar) {
                                    rVar3 = rVar;
                                    obj = j11;
                                    tVar4 = tVar2;
                                    if (((Boolean) obj).booleanValue()) {
                                    }
                                    response = e.response();
                                    if (response != null) {
                                    }
                                    return new s.c(td0.j.b(e));
                                }
                                return aVar;
                            }
                            return aVar;
                        case 2:
                            e = (HttpException) gVar.f97409f;
                            tVar4 = (t) gVar.f97408e;
                            rVar3 = (r) gVar.f97407d;
                            Sc.s.b(obj);
                            if (((Boolean) obj).booleanValue()) {
                                rVar3.getClass();
                                Response<?> response2 = e.response();
                                if (response2 != null && (raw = response2.raw()) != null) {
                                    rVar3.f97460f.getValue().c(new q(rVar3, raw, tVar4));
                                }
                            }
                            response = e.response();
                            if (response != null) {
                                Intrinsics.checkNotNullParameter(response, "<this>");
                                if (response.code() == 401 && (c11 = response.headers().c("x-o3-gdecision")) != null && c11.length() != 0) {
                                    return s.a.f97465a;
                                }
                            }
                            return new s.c(td0.j.b(e));
                        case 3:
                            sso2DomainsAuthMobileResponse = gVar.f97410g;
                            list2 = (List) gVar.f97409f;
                            tVar5 = (t) gVar.f97408e;
                            rVar4 = (r) gVar.f97407d;
                            Sc.s.b(obj);
                            if (obj == null) {
                            }
                            Sso2DomainsAuthMobileResponse sso2DomainsAuthMobileResponse32 = sso2DomainsAuthMobileResponse;
                            t tVar72 = tVar5;
                            r rVar62 = rVar4;
                            List<String> authActionsRequiredDomains2 = sso2DomainsAuthMobileResponse32.getAuthActionsRequiredDomains();
                            List<String> authActionsNonRequiredDomains2 = sso2DomainsAuthMobileResponse32.getAuthActionsNonRequiredDomains();
                            ArrayList p022 = C7714v.p0(authActionsNonRequiredDomains2 != null ? authActionsNonRequiredDomains2 : K.f71697a, authActionsRequiredDomains2);
                            rVar62.getClass();
                            ArrayList arrayList5 = new ArrayList();
                            it = p022.iterator();
                            while (it.hasNext()) {
                            }
                            rVar62.f97458d.getValue().g(rVar62.f97457c.getValue().a(), arrayList5, false);
                            ArrayList arrayList22 = new ArrayList();
                            W02 = C7714v.W0(list2);
                            ArrayList arrayList32 = new ArrayList(C7714v.z(p022, 10));
                            it2 = p022.iterator();
                            while (it2.hasNext()) {
                            }
                            gVar.f97407d = rVar62;
                            gVar.f97408e = arrayList22;
                            gVar.f97409f = W02;
                            gVar.f97410g = null;
                            gVar.f97413j = 5;
                            a11 = C10721f.a(arrayList32, gVar);
                            if (a11 != aVar) {
                            }
                            return aVar;
                        case 4:
                            sso2DomainsAuthMobileResponse = gVar.f97410g;
                            list2 = (List) gVar.f97409f;
                            tVar5 = (t) gVar.f97408e;
                            rVar4 = (r) gVar.f97407d;
                            Sc.s.b(obj);
                            Sso2DomainsAuthMobileResponse sso2DomainsAuthMobileResponse322 = sso2DomainsAuthMobileResponse;
                            t tVar722 = tVar5;
                            r rVar622 = rVar4;
                            List<String> authActionsRequiredDomains22 = sso2DomainsAuthMobileResponse322.getAuthActionsRequiredDomains();
                            List<String> authActionsNonRequiredDomains22 = sso2DomainsAuthMobileResponse322.getAuthActionsNonRequiredDomains();
                            ArrayList p0222 = C7714v.p0(authActionsNonRequiredDomains22 != null ? authActionsNonRequiredDomains22 : K.f71697a, authActionsRequiredDomains22);
                            rVar622.getClass();
                            ArrayList arrayList52 = new ArrayList();
                            it = p0222.iterator();
                            while (it.hasNext()) {
                            }
                            rVar622.f97458d.getValue().g(rVar622.f97457c.getValue().a(), arrayList52, false);
                            ArrayList arrayList222 = new ArrayList();
                            W02 = C7714v.W0(list2);
                            ArrayList arrayList322 = new ArrayList(C7714v.z(p0222, 10));
                            it2 = p0222.iterator();
                            while (it2.hasNext()) {
                            }
                            gVar.f97407d = rVar622;
                            gVar.f97408e = arrayList222;
                            gVar.f97409f = W02;
                            gVar.f97410g = null;
                            gVar.f97413j = 5;
                            a11 = C10721f.a(arrayList322, gVar);
                            if (a11 != aVar) {
                            }
                            return aVar;
                        case 5:
                            List list6 = (List) gVar.f97409f;
                            List list7 = (List) gVar.f97408e;
                            rVar5 = (r) gVar.f97407d;
                            Sc.s.b(obj);
                            W02 = list6;
                            list3 = list7;
                            while (r2.hasNext()) {
                            }
                            List list52 = W02;
                            ArrayList arrayList42 = new ArrayList(C7714v.z(list52, 10));
                            it3 = list52.iterator();
                            while (it3.hasNext()) {
                            }
                            list3.addAll(arrayList42);
                            gVar.f97407d = list3;
                            gVar.f97408e = null;
                            gVar.f97409f = null;
                            gVar.f97413j = 6;
                            break;
                        case 6:
                            list3 = (List) gVar.f97407d;
                            Sc.s.b(obj);
                            return new s.d(list3);
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (gVar.f97413j) {
            }
        } catch (Exception unused) {
            return new s.b(new IOException());
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.f97411h;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
    }
}
