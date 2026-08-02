package wc0;

import Sc.InterfaceC4008j;
import Sc.s;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import androidx.recyclerview.widget.LinearLayoutManager;
import id0.C7050a;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.U;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import ru.ozon.id.nativeauth.biometry.data.dto.BiometryEntryActionDTO;
import ru.ozon.id.nativeauth.data.api.ActionApi;
import ru.ozon.id.nativeauth.data.api.MtsApi;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;
import ru.ozon.id.nativeauth.data.models.LoginErrorActionDTO;
import td0.l;
import wc0.InterfaceC10500a;
import xd0.C10708a;
import xe.C10720e0;
import xe.C10727i;
import xe.I;
import xe.M;

/* renamed from: wc0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10503d implements InterfaceC10500a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f104116a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<ActionApi> f104117b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<Oc0.a> f104118c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function0<Oc0.e> f104119d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<vc0.c> f104120e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C7050a> f104121f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10708a> f104122g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final I f104123h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f104124i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f104125j;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.data.action.ActionAuthRepositoryImpl$callBiometryEntryAction$2", f = "ActionAuthRepositoryImpl.kt", l = {87}, m = "invokeSuspend")
    /* renamed from: wc0.d$a */
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super BiometryEntryActionDTO>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f104126d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f104128f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object f104129g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Map<String, ? extends Object> map, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f104128f = str;
            this.f104129g = map;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C10503d.this.new a(this.f104128f, this.f104129g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super BiometryEntryActionDTO> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f104126d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            String str = this.f104128f;
            C10503d c10503d = C10503d.this;
            String u11 = C10503d.u(c10503d, str);
            LinkedHashMap u12 = U.u(this.f104129g);
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            u12.put("model", MODEL);
            ActionApi l11 = C10503d.l(c10503d);
            this.f104126d = 1;
            Object biometryEntryAuth = l11.biometryEntryAuth(u11, u12, this);
            return biometryEntryAuth == aVar ? aVar : biometryEntryAuth;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.data.action.ActionAuthRepositoryImpl$callLoginErrorAction$2", f = "ActionAuthRepositoryImpl.kt", l = {94}, m = "invokeSuspend")
    /* renamed from: wc0.d$b */
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super LoginErrorActionDTO>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f104130d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C10503d f104131e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f104132f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, kotlin.coroutines.d dVar, C10503d c10503d) {
            super(2, dVar);
            this.f104131e = c10503d;
            this.f104132f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f104132f, dVar, this.f104131e);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super LoginErrorActionDTO> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f104130d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            String str = this.f104132f;
            C10503d c10503d = this.f104131e;
            String u11 = C10503d.u(c10503d, str);
            ActionApi l11 = C10503d.l(c10503d);
            this.f104130d = 1;
            Object loginError = l11.loginError(u11, this);
            return loginError == aVar ? aVar : loginError;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.data.action.ActionAuthRepositoryImpl$callMobileId$2", f = "ActionAuthRepositoryImpl.kt", l = {102, 105, 109, 114}, m = "invokeSuspend")
    /* renamed from: wc0.d$c */
    static final class c extends j implements Function2<M, kotlin.coroutines.d<? super FastEntryActionDTO>, Object> {

        /* renamed from: d, reason: collision with root package name */
        Object f104133d;

        /* renamed from: e, reason: collision with root package name */
        int f104134e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ FastEntryActionDTO.FastEntryDataDTO.MobileId f104136g;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.data.action.ActionAuthRepositoryImpl$callMobileId$2$1$response$1", f = "ActionAuthRepositoryImpl.kt", l = {103}, m = "invokeSuspend")
        /* renamed from: wc0.d$c$a */
        static final class a extends j implements Function1<kotlin.coroutines.d<? super Response<Unit>>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f104137d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C10503d f104138e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ MtsApi f104139f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ FastEntryActionDTO.FastEntryDataDTO.MobileId f104140g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C10503d c10503d, MtsApi mtsApi, FastEntryActionDTO.FastEntryDataDTO.MobileId mobileId, kotlin.coroutines.d<? super a> dVar) {
                super(1, dVar);
                this.f104138e = c10503d;
                this.f104139f = mtsApi;
                this.f104140g = mobileId;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new a(this.f104138e, this.f104139f, this.f104140g, dVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super Response<Unit>> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f104137d;
                try {
                    if (i11 == 0) {
                        s.b(obj);
                        MtsApi mtsApi = this.f104139f;
                        String mobileIdUrl = this.f104140g.getMobileIdUrl();
                        this.f104137d = 1;
                        obj = mtsApi.mobileId(mobileIdUrl, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    return (Response) obj;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(FastEntryActionDTO.FastEntryDataDTO.MobileId mobileId, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f104136g = mobileId;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C10503d.this.new c(this.f104136g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super FastEntryActionDTO> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
        
            if (r12 == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
        
            if (xe.Y.b(r9, r11) != r0) goto L31;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            MtsApi d11;
            FastEntryActionDTO.FastEntryDataDTO.MobileId mobileId;
            Response response;
            String t2;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f104134e;
            FastEntryActionDTO.FastEntryDataDTO.MobileId mobileId2 = this.f104136g;
            C10503d c10503d = C10503d.this;
            if (i11 == 0) {
                s.b(obj);
                Oc0.a aVar2 = (Oc0.a) c10503d.f104118c.invoke();
                if (aVar2 != null && (d11 = aVar2.d()) != null) {
                    String trackingAction = mobileId2.getTrackingAction();
                    a aVar3 = new a(c10503d, d11, mobileId2, null);
                    this.f104133d = mobileId2;
                    this.f104134e = 1;
                    obj = C10503d.p(c10503d, trackingAction, aVar2, aVar3, this);
                    if (obj != aVar) {
                        mobileId = mobileId2;
                        response = (Response) obj;
                        if (response != null) {
                            long continueTimeout = mobileId.getContinueTimeout();
                            this.f104133d = null;
                            this.f104134e = 2;
                        }
                    }
                }
                t2 = c10503d.t(mobileId2.getContinueAction(), true);
                this.f104133d = t2;
                this.f104134e = 3;
                obj = C10503d.j(c10503d, null, true, true, this);
            } else if (i11 == 1) {
                mobileId = (FastEntryActionDTO.FastEntryDataDTO.MobileId) this.f104133d;
                s.b(obj);
                response = (Response) obj;
                if (response != null && response.isSuccessful()) {
                    long continueTimeout2 = mobileId.getContinueTimeout();
                    this.f104133d = null;
                    this.f104134e = 2;
                }
                t2 = c10503d.t(mobileId2.getContinueAction(), true);
                this.f104133d = t2;
                this.f104134e = 3;
                obj = C10503d.j(c10503d, null, true, true, this);
            } else {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return obj;
                    }
                    t2 = (String) this.f104133d;
                    s.b(obj);
                    ActionApi l11 = C10503d.l(c10503d);
                    this.f104133d = null;
                    this.f104134e = 4;
                    Object continueMobileId = l11.continueMobileId(t2, (Map) obj, this);
                    return continueMobileId == aVar ? aVar : continueMobileId;
                }
                s.b(obj);
                t2 = c10503d.t(mobileId2.getContinueAction(), true);
                this.f104133d = t2;
                this.f104134e = 3;
                obj = C10503d.j(c10503d, null, true, true, this);
            }
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.data.action.ActionAuthRepositoryImpl$callRefreshCallInMobile$2", f = "ActionAuthRepositoryImpl.kt", l = {63}, m = "invokeSuspend")
    /* renamed from: wc0.d$d, reason: collision with other inner class name */
    static final class C2253d extends j implements Function2<M, kotlin.coroutines.d<? super FastEntryActionDTO>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f104141d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C10503d f104142e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f104143f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2253d(String str, kotlin.coroutines.d dVar, C10503d c10503d) {
            super(2, dVar);
            this.f104142e = c10503d;
            this.f104143f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C2253d(this.f104143f, dVar, this.f104142e);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super FastEntryActionDTO> dVar) {
            return ((C2253d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f104141d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            this.f104141d = 1;
            Object a11 = InterfaceC10500a.C2252a.a(this.f104142e, this.f104143f, null, this, 14);
            return a11 == aVar ? aVar : a11;
        }
    }

    public C10503d(Application application, InterfaceC4008j actionApiLazy, Function0 getMobileIdContainer, Function0 getMobileIdTrackingManager, InterfaceC4008j appInfoRepository, InterfaceC4008j trackingRepository, InterfaceC4008j cellularUtils, InterfaceC4008j biometryAuth, InterfaceC4008j instantAuth) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        He.b ioDispatcher = He.b.f10879b;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(actionApiLazy, "actionApiLazy");
        Intrinsics.checkNotNullParameter(getMobileIdContainer, "getMobileIdContainer");
        Intrinsics.checkNotNullParameter(getMobileIdTrackingManager, "getMobileIdTrackingManager");
        Intrinsics.checkNotNullParameter(appInfoRepository, "appInfoRepository");
        Intrinsics.checkNotNullParameter(trackingRepository, "trackingRepository");
        Intrinsics.checkNotNullParameter(cellularUtils, "cellularUtils");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(biometryAuth, "biometryAuth");
        Intrinsics.checkNotNullParameter(instantAuth, "instantAuth");
        this.f104116a = application;
        this.f104117b = actionApiLazy;
        this.f104118c = getMobileIdContainer;
        this.f104119d = getMobileIdTrackingManager;
        this.f104120e = appInfoRepository;
        this.f104121f = trackingRepository;
        this.f104122g = cellularUtils;
        this.f104123h = ioDispatcher;
        this.f104124i = biometryAuth;
        this.f104125j = instantAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(C10503d c10503d, Map map, boolean z11, boolean z12, kotlin.coroutines.jvm.internal.c cVar) {
        C10502c c10502c;
        int i11;
        LinkedHashMap u11;
        boolean z13;
        boolean z14;
        Object obj;
        Tc.d dVar;
        C10503d c10503d2;
        boolean z15;
        Map map2;
        boolean z16;
        Map map3;
        c10503d.getClass();
        if (cVar instanceof C10502c) {
            c10502c = (C10502c) cVar;
            int i12 = c10502c.f104115k;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c10502c.f104115k = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = c10502c.f104113i;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c10502c.f104115k;
                if (i11 != 0) {
                    s.b(obj2);
                    if (map != null) {
                        u11 = U.u(map);
                        String MODEL = Build.MODEL;
                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                        u11.put("model", MODEL);
                        c10502c.f104108d = c10503d;
                        c10502c.f104109e = u11;
                        c10502c.f104110f = u11;
                        c10502c.f104111g = z11;
                        c10502c.f104112h = z12;
                        c10502c.f104115k = 1;
                        if (c10503d.q(u11, c10502c) != aVar) {
                            z13 = z12;
                            z14 = z11;
                            obj = u11;
                        }
                        return aVar;
                    }
                    dVar = new Tc.d();
                    c10503d.getClass();
                    String MODEL2 = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(MODEL2, "MODEL");
                    dVar.put("model", MODEL2);
                    c10502c.f104108d = c10503d;
                    c10502c.f104109e = dVar;
                    c10502c.f104110f = dVar;
                    c10502c.f104111g = z11;
                    c10502c.f104112h = z12;
                    c10502c.f104115k = 2;
                    if (c10503d.q(dVar, c10502c) != aVar) {
                        c10503d2 = c10503d;
                        z15 = z12;
                        map2 = dVar;
                        z16 = z11;
                        map3 = map2;
                        if (z15) {
                        }
                        if (z16) {
                        }
                        return U.b(map2);
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z15 = c10502c.f104112h;
                    z16 = c10502c.f104111g;
                    map3 = (Map) c10502c.f104110f;
                    map2 = (Map) c10502c.f104109e;
                    c10503d2 = c10502c.f104108d;
                    s.b(obj2);
                    if (z15) {
                        c10503d2.s(map3);
                    }
                    if (z16) {
                        c10503d2.r(map3);
                    }
                    return U.b(map2);
                }
                boolean z17 = c10502c.f104112h;
                boolean z18 = c10502c.f104111g;
                ?? r72 = (Map) c10502c.f104110f;
                Object obj3 = (Map) c10502c.f104109e;
                C10503d c10503d3 = c10502c.f104108d;
                s.b(obj2);
                z13 = z17;
                z14 = z18;
                obj = obj3;
                u11 = r72;
                c10503d = c10503d3;
                if (z13) {
                    c10503d.s(u11);
                }
                if (z14) {
                    c10503d.r(u11);
                }
                if (obj == null) {
                    return obj;
                }
                z11 = z14;
                z12 = z13;
                dVar = new Tc.d();
                c10503d.getClass();
                String MODEL22 = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(MODEL22, "MODEL");
                dVar.put("model", MODEL22);
                c10502c.f104108d = c10503d;
                c10502c.f104109e = dVar;
                c10502c.f104110f = dVar;
                c10502c.f104111g = z11;
                c10502c.f104112h = z12;
                c10502c.f104115k = 2;
                if (c10503d.q(dVar, c10502c) != aVar) {
                }
                return aVar;
            }
        }
        c10502c = new C10502c(c10503d, cVar);
        Object obj22 = c10502c.f104113i;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c10502c.f104115k;
        if (i11 != 0) {
        }
        if (z13) {
        }
        if (z14) {
        }
        if (obj == null) {
        }
    }

    public static final ActionApi l(C10503d c10503d) {
        return c10503d.f104117b.getValue();
    }

    public static final Fb0.a n(C10503d c10503d) {
        return (Fb0.a) c10503d.f104124i.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(C10503d c10503d, String str, Oc0.a aVar, Function1 function1, kotlin.coroutines.jvm.internal.c cVar) {
        C10508i c10508i;
        int i11;
        String str2;
        long j11;
        Oc0.e invoke;
        c10503d.getClass();
        if (cVar instanceof C10508i) {
            c10508i = (C10508i) cVar;
            int i12 = c10508i.f104169j;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c10508i.f104169j = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c10508i.f104167h;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c10508i.f104169j;
                if (i11 != 0) {
                    s.b(obj);
                    if (str == null) {
                        c10508i.f104169j = 1;
                        Object invoke2 = ((c.a) function1).invoke(c10508i);
                        if (invoke2 != aVar2) {
                            return invoke2;
                        }
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        c10508i.f104163d = c10503d;
                        c10508i.f104164e = str;
                        c10508i.f104165f = aVar;
                        c10508i.f104166g = currentTimeMillis;
                        c10508i.f104169j = 2;
                        obj = ((c.a) function1).invoke(c10508i);
                        if (obj != aVar2) {
                            str2 = str;
                            j11 = currentTimeMillis;
                        }
                    }
                    return aVar2;
                }
                if (i11 == 1) {
                    s.b(obj);
                    return obj;
                }
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j12 = c10508i.f104166g;
                aVar = c10508i.f104165f;
                String str3 = c10508i.f104164e;
                C10503d c10503d2 = c10508i.f104163d;
                s.b(obj);
                j11 = j12;
                str2 = str3;
                c10503d = c10503d2;
                Oc0.a aVar3 = aVar;
                Response response = (Response) obj;
                long currentTimeMillis2 = System.currentTimeMillis();
                invoke = c10503d.f104119d.invoke();
                if (invoke != null) {
                    String g10 = invoke.g(str2, j11, currentTimeMillis2, response != null ? new Integer(response.code()) : null, aVar3);
                    if (g10 != null) {
                        c10503d.f104121f.getValue().b(g10);
                    }
                }
                return response;
            }
        }
        c10508i = new C10508i(c10503d, cVar);
        Object obj2 = c10508i.f104167h;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c10508i.f104169j;
        if (i11 != 0) {
        }
        Oc0.a aVar32 = aVar;
        Response response2 = (Response) obj2;
        long currentTimeMillis22 = System.currentTimeMillis();
        invoke = c10503d.f104119d.invoke();
        if (invoke != null) {
        }
        return response2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Map map, kotlin.coroutines.jvm.internal.c cVar) {
        C10501b c10501b;
        int i11;
        Map map2;
        String str;
        if (cVar instanceof C10501b) {
            c10501b = (C10501b) cVar;
            int i12 = c10501b.f104107i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c10501b.f104107i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c10501b.f104105g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c10501b.f104107i;
                if (i11 != 0) {
                    s.b(obj);
                    vc0.c value = this.f104120e.getValue();
                    Map map3 = map;
                    c10501b.f104102d = map3;
                    c10501b.f104103e = "deviceId";
                    c10501b.f104104f = map3;
                    c10501b.f104107i = 1;
                    obj = value.b(c10501b);
                    if (obj == aVar) {
                        return aVar;
                    }
                    map2 = map;
                    str = "deviceId";
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = c10501b.f104104f;
                    str = c10501b.f104103e;
                    map2 = c10501b.f104102d;
                    s.b(obj);
                }
                map.put(str, obj);
                return map2;
            }
        }
        c10501b = new C10501b(this, cVar);
        Object obj2 = c10501b.f104105g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c10501b.f104107i;
        if (i11 != 0) {
        }
        map.put(str, obj2);
        return map2;
    }

    private final void r(Map map) {
        map.put("hasBiometrics", Boolean.valueOf(((Fb0.a) this.f104124i.getValue()).available()));
        map.put("hasSmartLock", Boolean.valueOf(((Jc0.b) this.f104125j.getValue()).available()));
    }

    private final void s(Map map) {
        Oc0.a invoke = this.f104118c.invoke();
        if (invoke != null) {
            map.put("connectionType", invoke.b().a());
            map.put("willForceMobileIdOverCellular", Boolean.valueOf(invoke.e()));
            if (invoke.c()) {
                InterfaceC4008j<C10708a> interfaceC4008j = this.f104122g;
                Boolean b11 = interfaceC4008j.getValue().b();
                if (b11 != null) {
                    map.put("cellularDataRoaming", b11);
                }
                String a11 = interfaceC4008j.getValue().a();
                if (a11 != null) {
                    map.put("cellularNetworkCode", a11);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String t(String str, boolean z11) {
        String packageName;
        PackageInfo packageInfo;
        boolean z12;
        PackageManager.PackageInfoFlags of2;
        Uri.Builder buildUpon = Uri.parse("composer-api.bx/_action/" + str).buildUpon();
        if (z11) {
            Intrinsics.f(buildUpon);
            String[] strArr = {"android.permission.READ_CALL_LOG", "android.permission.READ_PHONE_STATE"};
            String[] permissions = (String[]) Arrays.copyOf(strArr, 2);
            Application application = this.f104116a;
            Intrinsics.checkNotNullParameter(application, "<this>");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            PackageManager packageManager = application.getPackageManager();
            if (packageManager != null && (packageName = application.getPackageName()) != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    of2 = PackageManager.PackageInfoFlags.of(4096);
                    Intrinsics.checkNotNullExpressionValue(of2, "of(...)");
                    packageInfo = packageManager.getPackageInfo(packageName, of2);
                } else {
                    packageInfo = packageManager.getPackageInfo(packageName, 4096);
                }
                String[] strArr2 = packageInfo.requestedPermissions;
                if (strArr2 != null) {
                    for (String str2 : permissions) {
                        if (C7705l.m(strArr2, str2)) {
                        }
                    }
                    z12 = true;
                    buildUpon.appendQueryParameter("isNeedPermissionsScreen", String.valueOf((z12 || l.a(application, (String[]) Arrays.copyOf(strArr, 2))) ? false : true));
                }
            }
            z12 = false;
            buildUpon.appendQueryParameter("isNeedPermissionsScreen", String.valueOf((z12 || l.a(application, (String[]) Arrays.copyOf(strArr, 2))) ? false : true));
        }
        String uri = buildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    static /* synthetic */ String u(C10503d c10503d, String str) {
        return c10503d.t(str, false);
    }

    @Override // wc0.InterfaceC10500a
    public final Object a(@NotNull String str, Map map, boolean z11, boolean z12, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return C10727i.f(this.f104123h, new C10504e(this, str, z11, map, z12, null), cVar);
    }

    @Override // wc0.InterfaceC10500a
    public final Object b(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return C10727i.f(this.f104123h, new C10505f(str, null, this), cVar);
    }

    @Override // wc0.InterfaceC10500a
    public final Object c(@NotNull FastEntryActionDTO.FastEntryDataDTO.MobileId mobileId, @NotNull kotlin.coroutines.d<? super FastEntryActionDTO> dVar) {
        return C10727i.f(this.f104123h, new c(mobileId, null), dVar);
    }

    @Override // wc0.InterfaceC10500a
    public final Object d(@NotNull String str, @NotNull j jVar) {
        return C10727i.f(this.f104123h, new C10507h(str, null, this), jVar);
    }

    @Override // wc0.InterfaceC10500a
    public final Object e(@NotNull String str, @NotNull Map map, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return C10727i.f(this.f104123h, new C10506g(this, str, map, null), cVar);
    }

    @Override // wc0.InterfaceC10500a
    public final Object f(@NotNull String str, @NotNull kotlin.coroutines.d<? super FastEntryActionDTO> dVar) {
        return C10727i.f(this.f104123h, new C2253d(str, null, this), dVar);
    }

    @Override // wc0.InterfaceC10500a
    public final Object g(@NotNull String str, @NotNull kotlin.coroutines.d<? super LoginErrorActionDTO> dVar) {
        return C10727i.f(this.f104123h, new b(str, null, this), dVar);
    }

    @Override // wc0.InterfaceC10500a
    public final Object h(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull kotlin.coroutines.d<? super BiometryEntryActionDTO> dVar) {
        return C10727i.f(this.f104123h, new a(str, map, null), dVar);
    }
}
