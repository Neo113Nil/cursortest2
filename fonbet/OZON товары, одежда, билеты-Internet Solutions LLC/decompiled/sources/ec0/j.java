package ec0;

import Ae.C0;
import Ae.C2406m0;
import Bc0.a;
import De.C2862e;
import I1.w;
import Sc.InterfaceC4008j;
import Sc.o;
import Sc.s;
import androidx.lifecycle.C5418g0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import cd0.C5806a;
import fc0.C6497a;
import h3.C6788a;
import id0.C7050a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.accountMerge.data.AccountMergeDTO;
import ru.ozon.id.nativeauth.accountMerge.data.UserInfoDTO;
import ru.ozon.id.nativeauth.data.models.AuthActionDTO;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;
import ru.ozon.id.nativeauth.data.models.b;
import td0.n;
import wc0.InterfaceC10500a;
import xc0.C10702a;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;
import zc0.C11086a;
import zc0.C11088c;

/* loaded from: classes3.dex */
public final class j extends C5806a {

    /* renamed from: G, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f62140G = {w.c(j.class, "uiState", "getUiState()Lru/ozon/id/nativeauth/accountMerge/presentation/vo/AccountMergeVO;", 0)};

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private final C5418g0 f62141A;

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private final td0.m f62142B;

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final C2406m0 f62143C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final C2862e f62144D;

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f62145E;

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f62146F;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final String f62147u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final C11086a f62148v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10702a> f62149w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<InterfaceC10500a> f62150x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Pc0.c> f62151y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Nc0.f> f62152z;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.accountMerge.presentation.OzonIdAccountMergeViewModel$load$1", f = "OzonIdAccountMergeViewModel.kt", l = {102}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f62153d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f62155f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f62155f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new a(this.f62155f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f62153d;
            j jVar = j.this;
            if (i11 == 0) {
                s.b(obj);
                C10702a c10702a = (C10702a) jVar.f62149w.getValue();
                this.f62153d = 1;
                obj = c10702a.m(this.f62155f, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            AccountMergeDTO dto = (AccountMergeDTO) obj;
            jVar.f62148v.getClass();
            Intrinsics.checkNotNullParameter(dto, "dto");
            String title = dto.getTitle();
            String description = dto.getDescription();
            UserInfoDTO userInfo = dto.getUserInfo();
            EntryDTO.SubmitButtonDTO submitButton = dto.getSubmitButton();
            String termsOfUser = dto.getTermsOfUser();
            List<EntryDTO.EntryButtonDTO> hintButtons = dto.getHintButtons();
            if (hintButtons != null) {
                List<EntryDTO.EntryButtonDTO> list = hintButtons;
                arrayList = new ArrayList(C7714v.z(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(C11088c.a((EntryDTO.EntryButtonDTO) it.next()));
                }
            } else {
                arrayList = null;
            }
            j.Z0(jVar, new C6497a(title, description, userInfo, submitButton, arrayList, termsOfUser, dto.getAccountRecoveryButton()));
            return Unit.f71690a;
        }
    }

    /* synthetic */ class b extends C7735q implements Function1<FastEntryActionDTO, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(FastEntryActionDTO fastEntryActionDTO) {
            FastEntryActionDTO p02 = fastEntryActionDTO;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((j) this.receiver).c1(p02);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.accountMerge.presentation.OzonIdAccountMergeViewModel$onHintButtonClicked$1", f = "OzonIdAccountMergeViewModel.kt", l = {153}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f62156d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b.InterfaceC2133b f62157e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j f62158f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b.InterfaceC2133b interfaceC2133b, j jVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f62157e = interfaceC2133b;
            this.f62158f = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f62157e, this.f62158f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f62156d;
            if (i11 == 0) {
                s.b(obj);
                b.InterfaceC2133b interfaceC2133b = this.f62157e;
                boolean z11 = interfaceC2133b instanceof b.InterfaceC2133b.d;
                j jVar = this.f62158f;
                if (z11) {
                    ((Pc0.c) jVar.f62151y.getValue()).C(((b.InterfaceC2133b.d) interfaceC2133b).a());
                } else if (interfaceC2133b instanceof b.InterfaceC2133b.c) {
                    b.InterfaceC2133b.c cVar = (b.InterfaceC2133b.c) interfaceC2133b;
                    String b11 = cVar.b();
                    if (b11 != null) {
                        j.W0(jVar).b(b11);
                    }
                    ((Pc0.c) jVar.f62151y.getValue()).v(cVar.a());
                } else if (interfaceC2133b instanceof b.InterfaceC2133b.a) {
                    ((Nc0.f) jVar.f62152z.getValue()).p();
                    b.InterfaceC2133b.a aVar2 = (b.InterfaceC2133b.a) interfaceC2133b;
                    String a11 = aVar2.a();
                    Map<String, Object> b12 = aVar2.b();
                    this.f62156d = 1;
                    if (j.P0(jVar, a11, b12, this) == aVar) {
                        return aVar;
                    }
                } else if (!(interfaceC2133b instanceof b.InterfaceC2133b.C2135b)) {
                    throw new o();
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.accountMerge.presentation.OzonIdAccountMergeViewModel$onSubmitClick$1", f = "OzonIdAccountMergeViewModel.kt", l = {119}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f62159d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f62161f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Map<String, Object> f62162g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Map<String, ? extends Object> map, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f62161f = str;
            this.f62162g = map;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new d(this.f62161f, this.f62162g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f62159d;
            boolean z11 = true;
            j jVar = j.this;
            if (i11 == 0) {
                s.b(obj);
                InterfaceC10500a interfaceC10500a = (InterfaceC10500a) jVar.f62150x.getValue();
                Map<String, Object> map = this.f62162g;
                if (map == null) {
                    map = U.c();
                }
                this.f62159d = 1;
                obj = interfaceC10500a.e(this.f62161f, map, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            FastEntryActionDTO fastEntryActionDTO = (FastEntryActionDTO) obj;
            AuthActionDTO.StatusDTO status = fastEntryActionDTO.getStatus();
            String deeplink = status != null ? status.getDeeplink() : null;
            AuthActionDTO.StatusDTO status2 = fastEntryActionDTO.getStatus();
            if (status2 != null ? Intrinsics.d(status2.isCompleted(), Boolean.TRUE) : false) {
                jVar.D0().h(fastEntryActionDTO);
            } else if (fastEntryActionDTO.getError() != null) {
                ((Pc0.c) jVar.f62151y.getValue()).z();
            } else {
                if (deeplink != null && deeplink.length() != 0) {
                    z11 = false;
                }
                if (!z11) {
                    ((Pc0.c) jVar.f62151y.getValue()).v(deeplink);
                }
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull String screenId, @NotNull C11086a mapper, @NotNull InterfaceC4008j authRepository, @NotNull InterfaceC4008j actionAuthRepository, @NotNull InterfaceC4008j authRouter, @NotNull InterfaceC4008j mainScreenContainer, @NotNull Fb0.f config, @NotNull C5418g0 savedStateHandle, @NotNull InterfaceC4008j trackingRepository, @NotNull Function1 provideFastEntryActionHandler, @NotNull C0 eventsSharedFlow, @NotNull a.n fullScreenExceptionHandler, @NotNull qc0.c crossAppChallengeKeySigner, @NotNull qc0.d crossAppChallengeRepository, @NotNull qc0.b crossAppChallengeKeyRepository) {
        super(savedStateHandle, provideFastEntryActionHandler, N.g(td0.f.a(), fullScreenExceptionHandler), config, crossAppChallengeKeySigner, crossAppChallengeRepository, crossAppChallengeKeyRepository, authRouter, authRepository, mainScreenContainer, actionAuthRepository, eventsSharedFlow);
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(authRepository, "authRepository");
        Intrinsics.checkNotNullParameter(actionAuthRepository, "actionAuthRepository");
        Intrinsics.checkNotNullParameter(authRouter, "authRouter");
        Intrinsics.checkNotNullParameter(mainScreenContainer, "mainScreenContainer");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(trackingRepository, "trackingRepository");
        Intrinsics.checkNotNullParameter(provideFastEntryActionHandler, "provideFastEntryActionHandler");
        Intrinsics.checkNotNullParameter(eventsSharedFlow, "eventsSharedFlow");
        Intrinsics.checkNotNullParameter(fullScreenExceptionHandler, "fullScreenExceptionHandler");
        Intrinsics.checkNotNullParameter(crossAppChallengeKeySigner, "crossAppChallengeKeySigner");
        Intrinsics.checkNotNullParameter(crossAppChallengeRepository, "crossAppChallengeRepository");
        Intrinsics.checkNotNullParameter(crossAppChallengeKeyRepository, "crossAppChallengeKeyRepository");
        this.f62147u = screenId;
        this.f62148v = mapper;
        this.f62149w = authRepository;
        this.f62150x = actionAuthRepository;
        this.f62151y = authRouter;
        this.f62152z = mainScreenContainer;
        this.f62141A = savedStateHandle;
        td0.m a11 = n.a(savedStateHandle, "account_merge_vo_saved_state_key");
        this.f62142B = a11;
        this.f62143C = new C2406m0(savedStateHandle.d("account_merge_vo_saved_state_key"));
        C6788a a12 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f62144D = N.g(N.g(a12, He.b.f10879b), fullScreenExceptionHandler);
        k kVar = new k(this);
        this.f62145E = kVar;
        this.f62146F = trackingRepository;
        C6497a c6497a = (C6497a) savedStateHandle.c("account_merge_vo_saved_state_key");
        ((Nc0.f) mainScreenContainer.getValue()).b(kVar);
        if (c6497a == null) {
            b1();
        } else {
            a11.setValue(this, f62140G[0], c6497a);
            ((Nc0.f) mainScreenContainer.getValue()).j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P0(j jVar, String str, Map map, kotlin.coroutines.jvm.internal.c cVar) {
        i iVar;
        int i11;
        jVar.getClass();
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i12 = iVar.f62139g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                iVar.f62139g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = iVar.f62137e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = iVar.f62139g;
                if (i11 != 0) {
                    s.b(obj);
                    C10702a value = jVar.f62149w.getValue();
                    iVar.f62136d = jVar;
                    iVar.f62139g = 1;
                    obj = InterfaceC10500a.C2252a.a(value, str, map, iVar, 8);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = iVar.f62136d;
                    s.b(obj);
                }
                jVar.c1((FastEntryActionDTO) obj);
                return Unit.f71690a;
            }
        }
        iVar = new i(jVar, cVar);
        Object obj2 = iVar.f62137e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = iVar.f62139g;
        if (i11 != 0) {
        }
        jVar.c1((FastEntryActionDTO) obj2);
        return Unit.f71690a;
    }

    public static final C7050a W0(j jVar) {
        return (C7050a) jVar.f62146F.getValue();
    }

    public static final void Z0(j jVar, C6497a c6497a) {
        jVar.getClass();
        jVar.f62142B.setValue(jVar, f62140G[0], c6497a);
        jVar.f62152z.getValue().j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b1() {
        InterfaceC4008j<Pc0.c> interfaceC4008j = this.f62151y;
        String b11 = interfaceC4008j.getValue().o(this.f62147u).b();
        if (b11.length() == 0) {
            this.f62152z.getValue().hideLoader();
            interfaceC4008j.getValue().q();
        } else {
            C10727i.c(this.f62144D, null, null, new a(b11, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c1(FastEntryActionDTO fastEntryActionDTO) {
        if (fastEntryActionDTO.getError() != null) {
            H0(fastEntryActionDTO.getError(), null, null);
        } else {
            this.f62141A.e("antibot_error_state_key");
            J0(fastEntryActionDTO, new b(1, this, j.class, "onAction", "onAction(Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO;)V", 0));
        }
    }

    @NotNull
    public final C2406m0 a1() {
        return this.f62143C;
    }

    public final void d1(@NotNull b.InterfaceC2133b hintButton) {
        Intrinsics.checkNotNullParameter(hintButton, "hintButton");
        td0.f.b(this.f62144D, null, new c(hintButton, this, null));
    }

    public final void e1(@NotNull String action, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(action, "action");
        C10727i.c(this.f62144D, null, null, new d(action, map, null), 3);
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        this.f62152z.getValue().d(this.f62145E);
    }
}
