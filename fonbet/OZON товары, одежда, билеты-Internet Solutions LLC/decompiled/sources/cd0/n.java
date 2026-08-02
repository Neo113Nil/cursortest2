package cd0;

import Ae.C0;
import Ae.C2406m0;
import Bc0.a;
import De.C2862e;
import I1.w;
import Sc.InterfaceC4008j;
import Sc.s;
import androidx.lifecycle.C5418g0;
import androidx.lifecycle.J;
import androidx.lifecycle.x0;
import dd0.C6181a;
import h3.C6788a;
import id0.C7050a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import ru.ozon.id.nativeauth.data.models.a;
import ru.ozon.id.nativeauth.data.models.b;
import ru.ozon.id.nativeauth.pageSocialAdditional.data.PageSocialAdditionalOptionDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import wc0.InterfaceC10500a;
import xc0.C10702a;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;
import zc0.C11091f;

/* loaded from: classes3.dex */
public final class n extends C5806a {

    /* renamed from: F, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f56983F = {w.c(n.class, "uiState", "getUiState()Lru/ozon/id/nativeauth/pageSocialAdditional/vo/PageSocialAdditionalOptionVO;", 0)};

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private final C2406m0 f56984A;

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private final C2862e f56985B;

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f56986C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f56987D;

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f56988E;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final String f56989u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Pc0.c> f56990v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final C11091f f56991w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10702a> f56992x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<InterfaceC10500a> f56993y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private final td0.m f56994z;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageSocialAdditional.presentation.PageSocialAdditionalOptionViewModel$load$1", f = "PageSocialAdditionalOptionViewModel.kt", l = {92}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f56995d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f56997f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f56997f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n.this.new a(this.f56997f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f56995d;
            n nVar = n.this;
            if (i11 == 0) {
                s.b(obj);
                C10702a c10702a = (C10702a) nVar.f56992x.getValue();
                this.f56995d = 1;
                obj = c10702a.t(this.f56997f, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            PageSocialAdditionalOptionDTO dto = (PageSocialAdditionalOptionDTO) obj;
            nVar.f56991w.getClass();
            Intrinsics.checkNotNullParameter(dto, "dto");
            OzonSpannableString title = dto.getTitle();
            OzonSpannableString subtitle = dto.getSubtitle();
            EntryDTO.SocialButtonDTO socialLoginButton = dto.getSocialLoginButton();
            n.V0(nVar, new C6181a(title, subtitle, (socialLoginButton != null ? socialLoginButton.getType() : null) != null ? new b.c(R.string.ozonid_login_with_vk_id_android, dto.getSocialLoginButton().getType(), dto.getSocialLoginButton().getLogo(), dto.getSocialLoginButton().getAuthUriAction(), dto.getSocialLoginButton().getRedirectUriAction()) : null, dto.getSubmitButton(), dto.getCancelButton()));
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageSocialAdditional.presentation.PageSocialAdditionalOptionViewModel$onActionButtonClick$1", f = "PageSocialAdditionalOptionViewModel.kt", l = {122, 125}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f56998d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ EntryDTO.EntryButtonDTO f56999e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ n f57000f;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f57001a;

            static {
                int[] iArr = new int[a.EnumC2132a.values().length];
                try {
                    iArr[a.EnumC2132a.DEEPLINK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.EnumC2132a.ACTION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.EnumC2132a.RELOAD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f57001a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EntryDTO.EntryButtonDTO entryButtonDTO, n nVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f56999e = entryButtonDTO;
            this.f57000f = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f56999e, this.f57000f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x008a, code lost:
        
            if (r4.K0((ru.ozon.id.nativeauth.data.models.FastEntryActionDTO) r7, r6) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x008c, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
        
            if (r7 == r0) goto L32;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f56998d;
            n nVar = this.f57000f;
            if (i11 == 0) {
                s.b(obj);
                EntryDTO.EntryButtonDTO entryButtonDTO = this.f56999e;
                String trackClick = entryButtonDTO.getTrackClick();
                if (trackClick != null) {
                    n.T0(nVar).b(trackClick);
                }
                int i12 = a.f57001a[entryButtonDTO.getType().ordinal()];
                if (i12 == 1) {
                    Pc0.c cVar = (Pc0.c) nVar.f56990v.getValue();
                    String deeplink = entryButtonDTO.getDeeplink();
                    if (deeplink == null) {
                        throw new IllegalStateException("Deeplink is null");
                    }
                    cVar.v(deeplink);
                } else if (i12 == 2) {
                    InterfaceC10500a interfaceC10500a = (InterfaceC10500a) nVar.f56993y.getValue();
                    String action = entryButtonDTO.getAction();
                    if (action == null) {
                        throw new IllegalStateException("Action is null");
                    }
                    this.f56998d = 1;
                    obj = InterfaceC10500a.C2252a.a(interfaceC10500a, action, null, this, 14);
                } else {
                    if (i12 != 3) {
                        throw new Sc.o();
                    }
                    Pc0.c cVar2 = (Pc0.c) nVar.f56990v.getValue();
                    String deeplink2 = entryButtonDTO.getDeeplink();
                    if (deeplink2 == null) {
                        throw new IllegalStateException("Deeplink is null");
                    }
                    cVar2.C(deeplink2);
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
            this.f56998d = 2;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageSocialAdditional.presentation.PageSocialAdditionalOptionViewModel$onLinkClick$1", f = "PageSocialAdditionalOptionViewModel.kt", l = {}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f57003e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f57003e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n.this.new c(this.f57003e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            ((Pc0.c) n.this.f56990v.getValue()).v(this.f57003e);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageSocialAdditional.presentation.PageSocialAdditionalOptionViewModel$onSocialButtonClick$1", f = "PageSocialAdditionalOptionViewModel.kt", l = {}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b.c f57005e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ J f57006f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b.c cVar, J j11, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f57005e = cVar;
            this.f57006f = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n.this.new d(this.f57005e, this.f57006f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            b.c cVar = this.f57005e;
            String a11 = cVar.a();
            if (a11 == null) {
                throw new IllegalStateException("Action is null");
            }
            String c11 = cVar.c();
            if (c11 == null) {
                throw new IllegalStateException("Redirect action is null");
            }
            n.this.L0(a11, c11, this.f57006f);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@NotNull String screenId, @NotNull InterfaceC4008j authRouter, @NotNull C11091f mapper, @NotNull InterfaceC4008j authRepository, @NotNull InterfaceC4008j mainScreenContainer, @NotNull InterfaceC4008j trackingRepository, @NotNull InterfaceC4008j actionAuthRepository, @NotNull C0 eventsSharedFlow, @NotNull Function1 provideFastEntryActionHandler, @NotNull a.n fullScreenExceptionHandler, @NotNull C5418g0 savedStateHandle, @NotNull Fb0.f config, @NotNull qc0.c crossAppChallengeKeySigner, @NotNull qc0.d crossAppChallengeRepository, @NotNull qc0.b crossAppChallengeKeyRepository) {
        super(savedStateHandle, provideFastEntryActionHandler, N.g(td0.f.a(), fullScreenExceptionHandler), config, crossAppChallengeKeySigner, crossAppChallengeRepository, crossAppChallengeKeyRepository, authRouter, authRepository, mainScreenContainer, actionAuthRepository, eventsSharedFlow);
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Intrinsics.checkNotNullParameter(authRouter, "authRouter");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(authRepository, "authRepository");
        Intrinsics.checkNotNullParameter(mainScreenContainer, "mainScreenContainer");
        Intrinsics.checkNotNullParameter(trackingRepository, "trackingRepository");
        Intrinsics.checkNotNullParameter(actionAuthRepository, "actionAuthRepository");
        Intrinsics.checkNotNullParameter(eventsSharedFlow, "eventsSharedFlow");
        Intrinsics.checkNotNullParameter(provideFastEntryActionHandler, "provideFastEntryActionHandler");
        Intrinsics.checkNotNullParameter(fullScreenExceptionHandler, "fullScreenExceptionHandler");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(crossAppChallengeKeySigner, "crossAppChallengeKeySigner");
        Intrinsics.checkNotNullParameter(crossAppChallengeRepository, "crossAppChallengeRepository");
        Intrinsics.checkNotNullParameter(crossAppChallengeKeyRepository, "crossAppChallengeKeyRepository");
        this.f56989u = screenId;
        this.f56990v = authRouter;
        this.f56991w = mapper;
        this.f56992x = authRepository;
        this.f56993y = actionAuthRepository;
        this.f56994z = td0.n.a(savedStateHandle, "account_merge_vo_saved_state_key");
        this.f56984A = new C2406m0(savedStateHandle.d("account_merge_vo_saved_state_key"));
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f56985B = N.g(N.g(a11, He.b.f10879b), fullScreenExceptionHandler);
        this.f56986C = trackingRepository;
        this.f56987D = mainScreenContainer;
        o oVar = new o(this);
        this.f56988E = oVar;
        ((Nc0.f) mainScreenContainer.getValue()).b(oVar);
        X0();
    }

    public static final C7050a T0(n nVar) {
        return (C7050a) nVar.f56986C.getValue();
    }

    public static final void V0(n nVar, C6181a c6181a) {
        nVar.f56994z.setValue(nVar, f56983F[0], c6181a);
        ((Nc0.f) nVar.f56987D.getValue()).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X0() {
        String b11 = this.f56990v.getValue().o(this.f56989u).b();
        if (b11.length() == 0) {
            ((Nc0.f) this.f56987D.getValue()).v(new RuntimeException());
        } else {
            C10727i.c(this.f56985B, null, null, new a(b11, null), 3);
        }
    }

    @NotNull
    public final C2406m0 W0() {
        return this.f56984A;
    }

    public final void Y0(@NotNull EntryDTO.EntryButtonDTO button) {
        Intrinsics.checkNotNullParameter(button, "button");
        C10727i.c(this.f56985B, null, null, new b(button, this, null), 3);
    }

    public final void Z0(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        C10727i.c(this.f56985B, null, null, new c(link, null), 3);
    }

    public final void a1(@NotNull b.c button, @NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        C10727i.c(this.f56985B, null, null, new d(button, lifecycleOwner, null), 3);
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        ((Nc0.f) this.f56987D.getValue()).d(this.f56988E);
    }
}
