package cd0;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.C2406m0;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.M0;
import De.C2862e;
import I1.w;
import Rc0.s;
import Rc0.t;
import Sc.InterfaceC4008j;
import androidx.lifecycle.C5418g0;
import androidx.lifecycle.J;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.id.VKID;
import com.vk.id.VKIDAuthFail;
import com.vk.id.auth.AuthCodeData;
import com.vk.id.auth.VKIDAuthParams;
import com.vk.id.auth.VKIDAuthUiParams;
import java.util.List;
import java.util.Map;
import jc0.C7340c;
import kc0.InterfaceC7641O;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.limb2.di.modules.Limb2PluginProvidersModule;
import ru.ozon.id.nativeauth.data.models.AuthActionDTO;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;
import ru.ozon.id.nativeauth.data.models.PkceAuthParamEntryActionDTO;
import ru.ozon.id.nativeauth.data.models.b;
import wc0.InterfaceC10500a;
import xc0.C10702a;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

/* renamed from: cd0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5806a extends s {

    /* renamed from: t, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f56909t = {w.c(C5806a.class, "agreementsViewState", "getAgreementsViewState$ozon_id_sdk_release()Lru/ozon/id/nativeauth/otp/agreements/AgreementsViewState;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C5418g0 f56910a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f56911b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2862e f56912c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Fb0.f f56913d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final qc0.c f56914e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final qc0.d f56915f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final qc0.b f56916g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f56917h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f56918i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f56919j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f56920k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f56921l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f56922m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final Be.n f56923n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final M0<t> f56924o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final td0.m f56925p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final C2406m0 f56926q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final C0 f56927r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final B0<Rc0.b> f56928s;

    /* renamed from: cd0.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0861a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56929a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f56930b;

        static {
            int[] iArr = new int[FastEntryActionDTO.ErrorDTO.b.values().length];
            try {
                iArr[FastEntryActionDTO.ErrorDTO.b.VALIDATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FastEntryActionDTO.ErrorDTO.b.RESTRICTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f56929a = iArr;
            int[] iArr2 = new int[Ub0.d.values().length];
            try {
                iArr2[Ub0.d.Russian.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Ub0.d.English.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Ub0.d.Turkish.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f56930b = iArr2;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageSocialAdditional.presentation.AuthViewModel$getVKIdOneTapParams$2", f = "AuthViewModel.kt", l = {161}, m = "invokeSuspend")
    /* renamed from: cd0.a$b */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super VKIDAuthUiParams>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f56931d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f56933f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f56934g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f56933f = str;
            this.f56934g = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C5806a.this.new b(this.f56933f, this.f56934g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super VKIDAuthUiParams> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f56931d;
            C5806a c5806a = C5806a.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                C10702a m02 = C5806a.m0(c5806a);
                this.f56931d = 1;
                obj = m02.d(this.f56933f, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            PkceAuthParamEntryActionDTO pkceAuthParamEntryActionDTO = (PkceAuthParamEntryActionDTO) obj;
            c5806a.f56910a.g(pkceAuthParamEntryActionDTO.getState(), "vk_state_value_key");
            c5806a.f56910a.g(this.f56934g, "vk_uri_redirect_action_key");
            VKIDAuthUiParams.Builder builder = new VKIDAuthUiParams.Builder();
            builder.setState(pkceAuthParamEntryActionDTO.getState());
            builder.setCodeChallenge(pkceAuthParamEntryActionDTO.getCodeChallenge());
            Intrinsics.checkNotNullParameter(pkceAuthParamEntryActionDTO, "<this>");
            builder.setScopes(C7714v.Y0(kotlin.text.h.m(pkceAuthParamEntryActionDTO.getScopes(), new String[]{","}, 0, 6)));
            return builder.build();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageSocialAdditional.presentation.AuthViewModel$login$1", f = "AuthViewModel.kt", l = {137}, m = "invokeSuspend")
    /* renamed from: cd0.a$c */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f56935d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f56937f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f56938g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ J f56939h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, J j11, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f56937f = str;
            this.f56938g = str2;
            this.f56939h = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C5806a.this.new c(this.f56937f, this.f56938g, this.f56939h, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Ub0.d localeProvider$lambda$1;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f56935d;
            C5806a c5806a = C5806a.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                c5806a.E0().p();
                InterfaceC10500a l02 = C5806a.l0(c5806a);
                this.f56935d = 1;
                obj = l02.d(this.f56937f, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            PkceAuthParamEntryActionDTO pkceAuthParamEntryActionDTO = (PkceAuthParamEntryActionDTO) obj;
            c5806a.f56910a.g(pkceAuthParamEntryActionDTO.getState(), "vk_state_value_key");
            c5806a.f56910a.g(this.f56938g, "vk_uri_redirect_action_key");
            VKID companion = VKID.INSTANCE.getInstance();
            C5807b p02 = C5806a.p0(c5806a);
            VKIDAuthParams.Builder builder = new VKIDAuthParams.Builder();
            builder.setState(pkceAuthParamEntryActionDTO.getState());
            builder.setCodeChallenge(pkceAuthParamEntryActionDTO.getCodeChallenge());
            Intrinsics.checkNotNullParameter(pkceAuthParamEntryActionDTO, "<this>");
            builder.setScopes(C7714v.Y0(kotlin.text.h.m(pkceAuthParamEntryActionDTO.getScopes(), new String[]{","}, 0, 6)));
            localeProvider$lambda$1 = Limb2PluginProvidersModule.getLocaleProvider$lambda$1((InterfaceC4008j) ((BY.b) c5806a.f56913d.getLocaleProvider()).f3307a);
            int i12 = C0861a.f56930b[localeProvider$lambda$1.ordinal()];
            builder.setLocale(i12 != 1 ? i12 != 2 ? i12 != 3 ? VKIDAuthParams.Locale.RUS : VKIDAuthParams.Locale.TURKEY : VKIDAuthParams.Locale.ENG : VKIDAuthParams.Locale.RUS);
            companion.authorize(this.f56939h, p02, builder.build());
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5806a(@NotNull C5418g0 savedStateHandle, @NotNull Function1 provideFastEntryActionHandler, @NotNull C2862e safeCoroutineScope, @NotNull Fb0.f ozonIdConfig, @NotNull qc0.c crossAppChallengeKeySigner, @NotNull qc0.d crossAppChallengeRepository, @NotNull qc0.b crossAppChallengeKeyRepository, @NotNull InterfaceC4008j authRouter, @NotNull InterfaceC4008j authRepository, @NotNull InterfaceC4008j mainScreenContainer, @NotNull InterfaceC4008j actionAuthRepository, @NotNull C0 eventsSharedFlow) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(provideFastEntryActionHandler, "provideFastEntryActionHandler");
        Intrinsics.checkNotNullParameter(safeCoroutineScope, "safeCoroutineScope");
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        Intrinsics.checkNotNullParameter(crossAppChallengeKeySigner, "crossAppChallengeKeySigner");
        Intrinsics.checkNotNullParameter(crossAppChallengeRepository, "crossAppChallengeRepository");
        Intrinsics.checkNotNullParameter(crossAppChallengeKeyRepository, "crossAppChallengeKeyRepository");
        Intrinsics.checkNotNullParameter(authRouter, "authRouter");
        Intrinsics.checkNotNullParameter(authRepository, "authRepository");
        Intrinsics.checkNotNullParameter(mainScreenContainer, "mainScreenContainer");
        Intrinsics.checkNotNullParameter(actionAuthRepository, "actionAuthRepository");
        Intrinsics.checkNotNullParameter(eventsSharedFlow, "eventsSharedFlow");
        this.f56910a = savedStateHandle;
        this.f56911b = (AbstractC7737t) provideFastEntryActionHandler;
        this.f56912c = safeCoroutineScope;
        this.f56913d = ozonIdConfig;
        this.f56914e = crossAppChallengeKeySigner;
        this.f56915f = crossAppChallengeRepository;
        this.f56916g = crossAppChallengeKeyRepository;
        this.f56917h = authRouter;
        this.f56918i = authRepository;
        this.f56919j = mainScreenContainer;
        this.f56920k = actionAuthRepository;
        this.f56921l = Sc.k.b(new C5808c(this));
        this.f56922m = Sc.k.b(new C5810e(this));
        this.f56923n = C2399j.F(eventsSharedFlow, new C5813h(D0().g()));
        M0<t> d11 = savedStateHandle.d("agreements_view_state");
        this.f56924o = d11;
        this.f56925p = td0.n.a(savedStateHandle, "agreements_view_state");
        this.f56926q = new C2406m0(d11);
        C0 b11 = E0.b(0, 0, null, 7);
        this.f56927r = b11;
        this.f56928s = C2399j.a(b11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pc0.c B0() {
        return (Pc0.c) this.f56917h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Nc0.f E0() {
        return (Nc0.f) this.f56919j.getValue();
    }

    public static final InterfaceC10500a l0(C5806a c5806a) {
        return (InterfaceC10500a) c5806a.f56920k.getValue();
    }

    public static final C10702a m0(C5806a c5806a) {
        return (C10702a) c5806a.f56918i.getValue();
    }

    public static final C5807b p0(C5806a c5806a) {
        return (C5807b) c5806a.f56921l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009f, code lost:
    
        if (r13.K0((ru.ozon.id.nativeauth.data.models.FastEntryActionDTO) r14, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y0(C5418g0 c5418g0, AuthCodeData authCodeData, kotlin.coroutines.jvm.internal.c cVar) {
        C5809d c5809d;
        int i11;
        C5806a c5806a;
        if (cVar instanceof C5809d) {
            c5809d = (C5809d) cVar;
            int i12 = c5809d.f56949h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c5809d.f56949h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c5809d.f56947f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c5809d.f56949h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    String str = (String) c5418g0.c("vk_uri_redirect_action_key");
                    if (str == null) {
                        return Unit.f71690a;
                    }
                    InterfaceC10500a interfaceC10500a = (InterfaceC10500a) this.f56920k.getValue();
                    Map j11 = U.j(new Pair("code", authCodeData.getCode()), new Pair("deviceId", authCodeData.getDeviceId()), new Pair("state", String.valueOf(c5418g0.c("vk_state_value_key"))));
                    c5809d.f56945d = this;
                    c5809d.f56946e = c5418g0;
                    c5809d.f56949h = 1;
                    obj = interfaceC10500a.e(str, j11, c5809d);
                    if (obj != aVar) {
                        c5806a = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c5418g0 = c5809d.f56946e;
                    c5806a = c5809d.f56945d;
                    Sc.s.b(obj);
                    c5806a.E0().hideLoader();
                    c5418g0.b("vk_uri_redirect_action_key");
                    c5418g0.b("vk_state_value_key");
                    return Unit.f71690a;
                }
                c5418g0 = c5809d.f56946e;
                c5806a = c5809d.f56945d;
                Sc.s.b(obj);
                c5809d.f56945d = c5806a;
                c5809d.f56946e = c5418g0;
                c5809d.f56949h = 2;
            }
        }
        c5809d = new C5809d(this, cVar);
        Object obj2 = c5809d.f56947f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c5809d.f56949h;
        if (i11 != 0) {
        }
        c5809d.f56945d = c5806a;
        c5809d.f56946e = c5418g0;
        c5809d.f56949h = 2;
    }

    public final t A0() {
        return (t) this.f56925p.getValue(this, f56909t[0]);
    }

    @NotNull
    public final Be.n C0() {
        return this.f56923n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final C7340c D0() {
        return (C7340c) this.f56922m.getValue();
    }

    public final Object F0(@NotNull ru.ozon.id.nativeauth.data.models.b bVar, @NotNull kotlin.coroutines.d<? super VKIDAuthUiParams> dVar) {
        String a11;
        b.c k11 = bVar.k();
        if (k11 == null || (a11 = k11.a()) == null) {
            return new VKIDAuthUiParams.Builder().build();
        }
        String c11 = bVar.k().c();
        if (c11 == null) {
            return new VKIDAuthUiParams.Builder().build();
        }
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(He.b.f10879b, new b(a11, c11, null), dVar);
    }

    @NotNull
    public final C0 G0() {
        return this.f56927r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void H0(@NotNull FastEntryActionDTO.ErrorDTO error, EntryDTO.InputDTO.ErrorButton errorButton, Function1<? super InterfaceC7641O, Unit> function1) {
        FastEntryActionDTO.ErrorDTO.FieldDTO fieldDTO;
        Intrinsics.checkNotNullParameter(error, "error");
        E0().hideLoader();
        String errorButtonAction = error.getErrorButtonAction();
        C5418g0 c5418g0 = this.f56910a;
        if (errorButtonAction == null || errorButtonAction.length() == 0) {
            c5418g0.e("antibot_error_state_key");
        } else {
            c5418g0.g(error.getErrorButtonAction(), "antibot_error_state_key");
        }
        int i11 = C0861a.f56929a[error.getType().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new Sc.o();
            }
            E0().y(error.getMessage());
        } else if (function1 != null) {
            List<FastEntryActionDTO.ErrorDTO.FieldDTO> fields = error.getFields();
            function1.invoke(new InterfaceC7641O.b((fields == null || (fieldDTO = (FastEntryActionDTO.ErrorDTO.FieldDTO) C7714v.M(fields)) == null) ? null : fieldDTO.getMessage(), errorButton));
        }
    }

    protected final void J0(@NotNull FastEntryActionDTO authActionDTO, @NotNull Function1<? super FastEntryActionDTO, Unit> onAction) {
        Intrinsics.checkNotNullParameter(authActionDTO, "authActionDTO");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        FastEntryActionDTO.FastEntryDataDTO data = authActionDTO.getData();
        FastEntryActionDTO.FastEntryDataDTO.MobileId mobileId = data != null ? data.getMobileId() : null;
        if (mobileId != null) {
            td0.f.b(x0.a(this), null, new C5811f(this, mobileId, onAction, null));
            return;
        }
        FastEntryActionDTO.SharedStoreKeysInfo sharedStoreKeysInfo = authActionDTO.getSharedStoreKeysInfo();
        if ((sharedStoreKeysInfo != null ? sharedStoreKeysInfo.getSelectedKeyInfo() : null) != null) {
            C10727i.c(this.f56912c, null, null, new C5812g(this, authActionDTO.getSharedStoreKeysInfo().getSelectedKeyInfo(), null), 3);
        } else {
            D0().h(authActionDTO);
        }
    }

    protected final Object K0(@NotNull FastEntryActionDTO fastEntryActionDTO, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        AuthActionDTO.StatusDTO status = fastEntryActionDTO.getStatus();
        String deeplink = status != null ? status.getDeeplink() : null;
        if (fastEntryActionDTO.getError() != null) {
            B0().z();
            C5418g0 c5418g0 = this.f56910a;
            c5418g0.b("vk_uri_redirect_action_key");
            c5418g0.b("vk_state_value_key");
            return Unit.f71690a;
        }
        AuthActionDTO.StatusDTO status2 = fastEntryActionDTO.getStatus();
        if (!(status2 != null ? Intrinsics.d(status2.isCompleted(), Boolean.TRUE) : false)) {
            if (!(deeplink == null || deeplink.length() == 0)) {
                B0().v(deeplink);
            }
        } else {
            if (B0().t()) {
                Object y11 = B0().y(cVar);
                return y11 == Wc.a.COROUTINE_SUSPENDED ? y11 : Unit.f71690a;
            }
            D0().h(fastEntryActionDTO);
        }
        return Unit.f71690a;
    }

    public final void L0(@NotNull String action, @NotNull String redirectUriAction, @NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(redirectUriAction, "redirectUriAction");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        C10727i.c(this.f56912c, null, null, new c(action, redirectUriAction, lifecycleOwner, null), 3);
    }

    public final void M0(@NotNull FastEntryActionDTO.FastEntryDataDTO data, @NotNull FastEntryActionDTO action) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(action, "action");
        D0().m(data, action);
    }

    public final void N0(@NotNull VKIDAuthFail fail) {
        Intrinsics.checkNotNullParameter(fail, "fail");
        E0().hideLoader();
        if (fail instanceof VKIDAuthFail.FailedApiCall) {
            E0().v(new Lb0.b(fail.getDescription()));
        }
    }

    public final void O0(t tVar) {
        this.f56925p.setValue(this, f56909t[0], tVar);
    }

    @Override // Rc0.s
    public final InterfaceC2395h d0() {
        return this.f56928s;
    }

    @Override // Rc0.s
    @NotNull
    public final C2406m0 e0() {
        return this.f56926q;
    }

    @Override // Rc0.s
    public void f0(boolean z11) {
    }

    @Override // Rc0.s
    public void g0() {
    }

    @Override // Rc0.s
    public void h0() {
    }

    @Override // Rc0.s
    public void i0(boolean z11) {
    }

    @Override // Rc0.s
    public void j0(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        B0().v(url);
    }

    public final Object z0(@NotNull AuthCodeData authCodeData, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object y02 = y0(this.f56910a, authCodeData, (kotlin.coroutines.jvm.internal.c) dVar);
        return y02 == Wc.a.COROUTINE_SUSPENDED ? y02 : Unit.f71690a;
    }
}
