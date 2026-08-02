package jc0;

import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.InterfaceC2395h;
import Jc0.b;
import Nc0.k;
import Sc.InterfaceC4008j;
import Sc.o;
import Sc.s;
import jc0.AbstractC7343f;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.AuthActionDTO;
import ru.ozon.id.nativeauth.data.models.DeeplinkOtpFlowDTO;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;
import ru.ozon.id.nativeauth.data.models.OtpDTO;
import xc0.C10702a;
import xe.M;

/* renamed from: jc0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7340c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f69679a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final M f69680b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<k> f69681c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10702a> f69682d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f69683e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f69684f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f69685g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C0 f69686h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<AbstractC7343f> f69687i;

    /* renamed from: jc0.c$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69688a;

        static {
            int[] iArr = new int[FastEntryActionDTO.FastEntryDataDTO.FastEntryAuthMethodDTO.b.values().length];
            try {
                iArr[FastEntryActionDTO.FastEntryDataDTO.FastEntryAuthMethodDTO.b.Biometry.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FastEntryActionDTO.FastEntryDataDTO.FastEntryAuthMethodDTO.b.Instant.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FastEntryActionDTO.FastEntryDataDTO.FastEntryAuthMethodDTO.b.Sequential.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FastEntryActionDTO.FastEntryDataDTO.FastEntryAuthMethodDTO.b.AuthMethodSelector.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f69688a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.common.FastEntryActionHandler$handle$1", f = "FastEntryActionHandler.kt", l = {50}, m = "invokeSuspend")
    /* renamed from: jc0.c$b */
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f69689d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ FastEntryActionDTO f69691f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FastEntryActionDTO fastEntryActionDTO, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f69691f = fastEntryActionDTO;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C7340c.this.new b(this.f69691f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f69689d;
            C7340c c7340c = C7340c.this;
            if (i11 == 0) {
                s.b(obj);
                C10702a c10702a = (C10702a) c7340c.f69682d.getValue();
                String otpToken = this.f69691f.getStatus().getOtpToken();
                this.f69689d = 1;
                obj = c10702a.b(otpToken, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            C7340c.e(c7340c).v(((DeeplinkOtpFlowDTO) obj).getDeeplink());
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.common.FastEntryActionHandler$handleInstantAuthMethod$1", f = "FastEntryActionHandler.kt", l = {167}, m = "invokeSuspend")
    /* renamed from: jc0.c$c, reason: collision with other inner class name */
    static final class C1138c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f69692d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f69694f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ FastEntryActionDTO f69695g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FastEntryActionDTO.FastEntryDataDTO.FastEntryAuthMethodDTO f69696h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1138c(String str, FastEntryActionDTO fastEntryActionDTO, FastEntryActionDTO.FastEntryDataDTO.FastEntryAuthMethodDTO fastEntryAuthMethodDTO, kotlin.coroutines.d<? super C1138c> dVar) {
            super(2, dVar);
            this.f69694f = str;
            this.f69695g = fastEntryActionDTO;
            this.f69696h = fastEntryAuthMethodDTO;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C7340c.this.new C1138c(this.f69694f, this.f69695g, this.f69696h, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1138c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f69692d;
            C7340c c7340c = C7340c.this;
            if (i11 == 0) {
                s.b(obj);
                Jc0.b d11 = C7340c.d(c7340c);
                this.f69692d = 1;
                if (b.a.a(d11, this.f69694f, null, this, 6) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            C7340c.a(c7340c, this.f69695g, this.f69696h);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.common.FastEntryActionHandler$onBiometryDialogResult$1", f = "FastEntryActionHandler.kt", l = {75}, m = "invokeSuspend")
    /* renamed from: jc0.c$d */
    static final class d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f69697d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f69699f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f69700g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FastEntryActionDTO f69701h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z11, String str, FastEntryActionDTO fastEntryActionDTO, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f69699f = z11;
            this.f69700g = str;
            this.f69701h = fastEntryActionDTO;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C7340c.this.new d(this.f69699f, this.f69700g, this.f69701h, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f69697d;
            C7340c c7340c = C7340c.this;
            if (i11 == 0) {
                s.b(obj);
                Fb0.a c11 = C7340c.c(c7340c);
                this.f69697d = 1;
                if (c11.a(this.f69699f, this.f69700g, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            C7340c.e(c7340c).w(this.f69701h);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7340c(@NotNull String biometryDialogRequestKey, @NotNull M coroutineScope, @NotNull InterfaceC4008j<? extends k> screenStateHolder, @NotNull InterfaceC4008j<C10702a> authRepository, @NotNull InterfaceC4008j<Pc0.c> router, @NotNull InterfaceC4008j<? extends Fb0.a> biometryAuth, @NotNull InterfaceC4008j<? extends Jc0.b> instantAuth) {
        Intrinsics.checkNotNullParameter(biometryDialogRequestKey, "biometryDialogRequestKey");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(screenStateHolder, "screenStateHolder");
        Intrinsics.checkNotNullParameter(authRepository, "authRepository");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(biometryAuth, "biometryAuth");
        Intrinsics.checkNotNullParameter(instantAuth, "instantAuth");
        this.f69679a = biometryDialogRequestKey;
        this.f69680b = coroutineScope;
        this.f69681c = screenStateHolder;
        this.f69682d = authRepository;
        this.f69683e = router;
        this.f69684f = biometryAuth;
        this.f69685g = instantAuth;
        C0 b11 = E0.b(0, 0, null, 7);
        this.f69686h = b11;
        this.f69687i = C2399j.a(b11);
    }

    public static final void a(C7340c c7340c, FastEntryActionDTO fastEntryActionDTO, FastEntryActionDTO.FastEntryDataDTO.FastEntryAuthMethodDTO fastEntryAuthMethodDTO) {
        c7340c.getClass();
        if (fastEntryAuthMethodDTO.getType() != FastEntryActionDTO.FastEntryDataDTO.FastEntryAuthMethodDTO.b.Sequential) {
            ((Pc0.c) c7340c.f69683e.getValue()).w(fastEntryActionDTO);
            return;
        }
        FastEntryActionDTO.FastEntryDataDTO.FastEntryBiometryDTO biometry = fastEntryAuthMethodDTO.getBiometry();
        if (biometry == null) {
            return;
        }
        c7340c.j(biometry, fastEntryActionDTO);
    }

    public static final Fb0.a c(C7340c c7340c) {
        return (Fb0.a) c7340c.f69684f.getValue();
    }

    public static final Jc0.b d(C7340c c7340c) {
        return (Jc0.b) c7340c.f69685g.getValue();
    }

    public static final Pc0.c e(C7340c c7340c) {
        return (Pc0.c) c7340c.f69683e.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bf, code lost:
    
        if (r8 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ab, code lost:
    
        if ((r8 == null ? false : j(r8, r7)) != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean i(FastEntryActionDTO.FastEntryDataDTO fastEntryDataDTO, FastEntryActionDTO fastEntryActionDTO, boolean z11) {
        boolean j11;
        M m11 = this.f69680b;
        InterfaceC4008j<k> interfaceC4008j = this.f69681c;
        if (z11 && fastEntryDataDTO.getMobileIdCurtain() != null) {
            FastEntryActionDTO.FastEntryDataDTO.AuthCurtain mobileIdCurtain = fastEntryDataDTO.getMobileIdCurtain();
            interfaceC4008j.getValue().hideLoader();
            td0.f.b(m11, null, new C7342e(this, new AbstractC7343f.b(mobileIdCurtain, fastEntryDataDTO, fastEntryActionDTO), null));
            return true;
        }
        if (z11 && fastEntryDataDTO.getAgreementCurtain() != null) {
            OtpDTO.AgreementSheet agreementCurtain = fastEntryDataDTO.getAgreementCurtain();
            interfaceC4008j.getValue().hideLoader();
            td0.f.b(m11, null, new C7341d(this, new AbstractC7343f.a(agreementCurtain, fastEntryActionDTO), null));
            return true;
        }
        if (z11 && fastEntryDataDTO.getVkIdCurtain() != null) {
            FastEntryActionDTO.FastEntryDataDTO.AuthCurtain vkIdCurtain = fastEntryDataDTO.getVkIdCurtain();
            interfaceC4008j.getValue().hideLoader();
            td0.f.b(m11, null, new C7342e(this, new AbstractC7343f.b(vkIdCurtain, fastEntryDataDTO, fastEntryActionDTO), null));
            return true;
        }
        if (fastEntryDataDTO.getAuthMethod() != null) {
            FastEntryActionDTO.FastEntryDataDTO.FastEntryAuthMethodDTO authMethod = fastEntryDataDTO.getAuthMethod();
            int i11 = a.f69688a[authMethod.getType().ordinal()];
            if (i11 == 1) {
                FastEntryActionDTO.FastEntryDataDTO.FastEntryBiometryDTO biometry = authMethod.getBiometry();
                if (biometry != null) {
                    j11 = j(biometry, fastEntryActionDTO);
                }
                j11 = false;
            } else if (i11 != 2) {
                if (i11 == 3) {
                    if (!k(authMethod, fastEntryActionDTO)) {
                        FastEntryActionDTO.FastEntryDataDTO.FastEntryBiometryDTO biometry2 = authMethod.getBiometry();
                    }
                    j11 = true;
                } else if (i11 != 4) {
                    throw new o();
                }
                j11 = false;
            } else {
                j11 = k(authMethod, fastEntryActionDTO);
            }
        }
        return fastEntryDataDTO.getBiometry() != null && j(fastEntryDataDTO.getBiometry(), fastEntryActionDTO);
    }

    private final boolean j(FastEntryActionDTO.FastEntryDataDTO.FastEntryBiometryDTO fastEntryBiometryDTO, FastEntryActionDTO fastEntryActionDTO) {
        if (!((Fb0.a) this.f69684f.getValue()).available()) {
            return false;
        }
        ((Pc0.c) this.f69683e.getValue()).B(this.f69679a, fastEntryActionDTO, fastEntryBiometryDTO);
        return true;
    }

    private final boolean k(FastEntryActionDTO.FastEntryDataDTO.FastEntryAuthMethodDTO fastEntryAuthMethodDTO, FastEntryActionDTO fastEntryActionDTO) {
        String instantAuthAction = fastEntryAuthMethodDTO.getInstantAuthAction();
        if (instantAuthAction == null || !((Jc0.b) this.f69685g.getValue()).available()) {
            return false;
        }
        td0.f.b(this.f69680b, null, new C1138c(instantAuthAction, fastEntryActionDTO, fastEntryAuthMethodDTO, null));
        return true;
    }

    @NotNull
    public final InterfaceC2395h<AbstractC7343f> g() {
        return this.f69687i;
    }

    public final void h(@NotNull FastEntryActionDTO action) {
        Intrinsics.checkNotNullParameter(action, "action");
        FastEntryActionDTO.FastEntryDataDTO data = action.getData();
        if (data == null || !i(data, action, true)) {
            AuthActionDTO.StatusDTO status = action.getStatus();
            String otpToken = status != null ? status.getOtpToken() : null;
            if (otpToken == null || otpToken.length() == 0) {
                ((Pc0.c) this.f69683e.getValue()).w(action);
            } else {
                td0.f.b(this.f69680b, null, new b(action, null));
            }
        }
    }

    public final void l(@NotNull String analyticTag, @NotNull FastEntryActionDTO authActionDTO, boolean z11) {
        Intrinsics.checkNotNullParameter(analyticTag, "analyticTag");
        Intrinsics.checkNotNullParameter(authActionDTO, "authActionDTO");
        td0.f.b(this.f69680b, null, new d(z11, analyticTag, authActionDTO, null));
    }

    public final void m(@NotNull FastEntryActionDTO.FastEntryDataDTO data, @NotNull FastEntryActionDTO action) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(action, "action");
        if (i(data, action, false)) {
            return;
        }
        ((Pc0.c) this.f69683e.getValue()).w(action);
    }
}
