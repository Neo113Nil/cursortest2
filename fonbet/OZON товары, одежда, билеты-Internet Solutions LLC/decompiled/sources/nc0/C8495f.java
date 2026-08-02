package nc0;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import De.C2862e;
import Sc.InterfaceC4008j;
import Sc.r;
import Sc.s;
import Vb0.b;
import android.app.Activity;
import android.app.Application;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Build;
import androidx.recyclerview.widget.LinearLayoutManager;
import dc0.C6149M;
import dc0.C6176v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import nc0.AbstractC8494e;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.crossApp.CrossAppAuthActivity;
import ru.ozon.id.nativeauth.crossApp.data.AccountSignatureData;
import ru.ozon.id.nativeauth.crossApp.data.api.CrossAppApi;
import ru.ozon.id.nativeauth.crossApp.dto.CrossAppChallengeInfoDto;
import ru.ozon.id.nativeauth.crossApp.dto.CrossAppChallengeRequestDto;
import ru.ozon.id.nativeauth.crossApp.dto.CrossAppChallengeResponseDto;
import ru.ozon.id.nativeauth.crossApp.dto.CrossAppSelectedKeyDto;
import ru.ozon.id.nativeauth.crossApp.dto.CrossAppSharedStoreKeyDto;
import ru.ozon.id.nativeauth.crossApp.dto.ModalCrossAppRequestBodyDTO;
import ru.ozon.id.nativeauth.crossApp.dto.ModalCrossAppResponseDTO;
import ru.ozon.id.nativeauth.crossApp.dto.SharedStoreKeysInfoDto;
import ru.ozon.id.nativeauth.data.models.AuthTokenDTO;
import ru.ozon.id.nativeauth.main.activity.AuthFlowActivity;
import xe.C10720e0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

/* renamed from: nc0.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8495f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f76758a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<CrossAppApi> f76759b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final qc0.b f76760c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final qc0.c f76761d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final qc0.d f76762e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C2862e f76763f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final x0<Boolean> f76764g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<Boolean> f76765h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final x0<ModalCrossAppResponseDTO.ModalDTO> f76766i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C2406m0 f76767j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final x0<Boolean> f76768k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<Boolean> f76769l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final x0<Boolean> f76770m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<Boolean> f76771n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f76772o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f76773p;

    /* renamed from: q, reason: collision with root package name */
    private volatile boolean f76774q;

    /* renamed from: r, reason: collision with root package name */
    private volatile C8493d f76775r;

    /* renamed from: s, reason: collision with root package name */
    private volatile Function0<Unit> f76776s;

    /* renamed from: t, reason: collision with root package name */
    private volatile boolean f76777t;

    /* renamed from: u, reason: collision with root package name */
    private volatile String f76778u;

    /* renamed from: v, reason: collision with root package name */
    private volatile CrossAppSelectedKeyDto f76779v;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.crossApp.CrossAppAuthenticator$launchCrossApp$1", f = "CrossAppAuthenticator.kt", l = {163}, m = "invokeSuspend")
    /* renamed from: nc0.f$a */
    /* loaded from: classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f76780d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f76781e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<AccountSignatureData> f76783g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<AccountSignatureData> list, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f76783g = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = C8495f.this.new a(this.f76783g, dVar);
            aVar.f76781e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f76780d;
            C8495f c8495f = C8495f.this;
            try {
                if (i11 == 0) {
                    s.b(obj);
                    List<AccountSignatureData> list = this.f76783g;
                    r.Companion companion = Sc.r.INSTANCE;
                    C8495f.j(c8495f);
                    this.f76780d = 1;
                    if (C8495f.k(c8495f, list, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                a11 = Unit.f71690a;
                r.Companion companion2 = Sc.r.INSTANCE;
            } catch (Throwable th2) {
                r.Companion companion3 = Sc.r.INSTANCE;
                a11 = s.a(th2);
            }
            Throwable b11 = Sc.r.b(a11);
            if (b11 != null) {
                b.a.c(Vb0.b.f28514a, b11);
                C8495f.e(c8495f);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.crossApp.CrossAppAuthenticator$onCrossAppAuthResult$1", f = "CrossAppAuthenticator.kt", l = {}, m = "invokeSuspend")
    /* renamed from: nc0.f$b */
    /* loaded from: classes3.dex */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC8494e f76784d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C8495f f76785e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC8494e abstractC8494e, C8495f c8495f, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f76784d = abstractC8494e;
            this.f76785e = c8495f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f76784d, this.f76785e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Activity activity;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            AbstractC8494e abstractC8494e = this.f76784d;
            boolean z11 = abstractC8494e instanceof AbstractC8494e.d;
            C8495f c8495f = this.f76785e;
            if (z11) {
                AbstractC8494e.d dVar = (AbstractC8494e.d) abstractC8494e;
                c8495f.getClass();
                dVar.getClass();
                Fb0.d.a(new Fb0.c(true, (AuthTokenDTO) null, 4), dVar.a() ? Gb0.d.LOGIN : Gb0.d.CROSS_APP, false);
                WeakReference weakReference = AuthFlowActivity.f97288s;
                if (weakReference != null && (activity = (Activity) weakReference.get()) != null) {
                    activity.finish();
                }
            } else if (!(abstractC8494e instanceof AbstractC8494e.c) && !(abstractC8494e instanceof AbstractC8494e.a) && !(abstractC8494e instanceof AbstractC8494e.b)) {
                throw new Sc.o();
            }
            c8495f.m();
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.crossApp.CrossAppAuthenticator$onEntryAnotherAccountClicked$1", f = "CrossAppAuthenticator.kt", l = {316}, m = "invokeSuspend")
    /* renamed from: nc0.f$c */
    /* loaded from: classes3.dex */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f76786d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f76788f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f76788f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C8495f.this.new c(this.f76788f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f76786d;
            C8495f c8495f = C8495f.this;
            if (i11 == 0) {
                s.b(obj);
                qc0.d dVar = c8495f.f76762e;
                String MODEL = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                CrossAppChallengeRequestDto crossAppChallengeRequestDto = new CrossAppChallengeRequestDto(null, MODEL);
                this.f76786d = 1;
                if (dVar.a(this.f76788f, crossAppChallengeRequestDto, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            c8495f.s(AbstractC8494e.a.f76754a);
            return Unit.f71690a;
        }
    }

    /* renamed from: nc0.f$d */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.coroutines.a implements J {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C8495f f76789a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(J.a aVar, C8495f c8495f) {
            super(aVar);
            this.f76789a = c8495f;
        }

        @Override // xe.J
        public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
            C8495f c8495f = this.f76789a;
            C6149M d11 = C8495f.d(c8495f);
            String string = c8495f.f76758a.getString(R.string.ozonid_error_technical_error_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            d11.f(string);
            C8495f.i(c8495f, th2);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.crossApp.CrossAppAuthenticator$onLoginClicked$1", f = "CrossAppAuthenticator.kt", l = {278}, m = "invokeSuspend")
    /* renamed from: nc0.f$e */
    /* loaded from: classes3.dex */
    static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f76790d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f76792f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f76792f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C8495f.this.new e(this.f76792f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f76790d;
            if (i11 == 0) {
                s.b(obj);
                this.f76790d = 1;
                if (C8495f.g(C8495f.this, this.f76792f, this) == aVar) {
                    return aVar;
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

    /* renamed from: nc0.f$f, reason: collision with other inner class name */
    public static final class C1296f extends kotlin.coroutines.a implements J {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C8495f f76793a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1296f(J.a aVar, C8495f c8495f) {
            super(aVar);
            this.f76793a = c8495f;
        }

        @Override // xe.J
        public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
            C8495f.i(this.f76793a, th2);
        }
    }

    /* renamed from: nc0.f$g */
    /* loaded from: classes3.dex */
    /* synthetic */ class g extends C7735q implements Function0<Unit> {
        g(C8495f c8495f) {
            super(0, c8495f, C8495f.class, "launchCrossApp", "launchCrossApp()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((C8495f) this.receiver).r();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8495f(@NotNull Application application, @NotNull InterfaceC4008j<C6176v> currentUserDataInteractor, @NotNull InterfaceC4008j<? extends CrossAppApi> api, @NotNull InterfaceC4008j<C6149M> ozonIdNotifier, @NotNull qc0.b crossAppChallengeKeyRepository, @NotNull qc0.c crossAppChallengeKeySigner, @NotNull qc0.d crossAppChallengeRepository) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(currentUserDataInteractor, "currentUserDataInteractor");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(ozonIdNotifier, "ozonIdNotifier");
        Intrinsics.checkNotNullParameter(crossAppChallengeKeyRepository, "crossAppChallengeKeyRepository");
        Intrinsics.checkNotNullParameter(crossAppChallengeKeySigner, "crossAppChallengeKeySigner");
        Intrinsics.checkNotNullParameter(crossAppChallengeRepository, "crossAppChallengeRepository");
        this.f76758a = application;
        this.f76759b = api;
        this.f76760c = crossAppChallengeKeyRepository;
        this.f76761d = crossAppChallengeKeySigner;
        this.f76762e = crossAppChallengeRepository;
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f76763f = N.g(N.g(N.a(He.b.f10879b), X0.b()), new C1296f(J.f105405n0, this));
        Boolean bool = Boolean.FALSE;
        x0<Boolean> a11 = O0.a(bool);
        this.f76764g = a11;
        this.f76765h = C2399j.b(a11);
        x0<ModalCrossAppResponseDTO.ModalDTO> a12 = O0.a(null);
        this.f76766i = a12;
        this.f76767j = new C2406m0(a12);
        x0<Boolean> a13 = O0.a(bool);
        this.f76768k = a13;
        this.f76769l = C2399j.b(a13);
        x0<Boolean> a14 = O0.a(bool);
        this.f76770m = a14;
        this.f76771n = C2399j.b(a14);
        this.f76772o = ozonIdNotifier;
        this.f76773p = currentUserDataInteractor;
    }

    public static final C6149M d(C8495f c8495f) {
        return (C6149M) c8495f.f76772o.getValue();
    }

    public static final void e(C8495f c8495f) {
        x0<Boolean> x0Var = c8495f.f76768k;
        Boolean bool = Boolean.FALSE;
        x0Var.tryEmit(bool);
        c8495f.f76764g.tryEmit(bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(C8495f c8495f, String str, kotlin.coroutines.jvm.internal.c cVar) {
        C8496g c8496g;
        Object obj;
        int i11;
        c8495f.getClass();
        if (cVar instanceof C8496g) {
            c8496g = (C8496g) cVar;
            int i12 = c8496g.f76797g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c8496g.f76797g = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj = c8496g.f76795e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c8496g.f76797g;
                if (i11 != 0) {
                    s.b(obj);
                    CrossAppSelectedKeyDto crossAppSelectedKeyDto = c8495f.f76779v;
                    if (crossAppSelectedKeyDto == null) {
                        c8495f.v();
                        return Unit.f71690a;
                    }
                    String str2 = c8495f.f76778u;
                    if (str2 == null) {
                        c8495f.v();
                        return Unit.f71690a;
                    }
                    String b11 = c8495f.f76761d.b(crossAppSelectedKeyDto.getAuthPublicKey(), crossAppSelectedKeyDto.getAuthChallenge());
                    if (b11 == null) {
                        c8495f.v();
                        return Unit.f71690a;
                    }
                    qc0.d dVar = c8495f.f76762e;
                    CrossAppChallengeInfoDto crossAppChallengeInfoDto = new CrossAppChallengeInfoDto(crossAppSelectedKeyDto.getAuthPublicKey(), str2, b11);
                    String MODEL = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                    CrossAppChallengeRequestDto crossAppChallengeRequestDto = new CrossAppChallengeRequestDto(crossAppChallengeInfoDto, MODEL);
                    c8496g.f76794d = c8495f;
                    c8496g.f76797g = 1;
                    obj = dVar.a(str, crossAppChallengeRequestDto, c8496g);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c8495f = c8496g.f76794d;
                    s.b(obj);
                }
                if (((CrossAppChallengeResponseDto) obj).getStatus().getIsSuccess()) {
                    c8495f.v();
                } else {
                    c8495f.s(new AbstractC8494e.d(c8495f.f76775r != null));
                }
                return Unit.f71690a;
            }
        }
        c8496g = new C8496g(c8495f, cVar);
        obj = c8496g.f76795e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c8496g.f76797g;
        if (i11 != 0) {
        }
        if (((CrossAppChallengeResponseDto) obj).getStatus().getIsSuccess()) {
        }
        return Unit.f71690a;
    }

    public static final void i(C8495f c8495f, Throwable th2) {
        c8495f.getClass();
        b.a.c(Vb0.b.f28514a, th2);
        c8495f.s(AbstractC8494e.c.f76756a);
    }

    public static final void j(C8495f c8495f) {
        Intent addFlags;
        c8495f.f76768k.tryEmit(Boolean.TRUE);
        C8493d c8493d = c8495f.f76775r;
        ContextWrapper a11 = c8493d != null ? c8493d.a() : null;
        if (a11 != null) {
            addFlags = new Intent(a11, (Class<?>) CrossAppAuthActivity.class);
        } else {
            a11 = c8495f.f76758a;
            addFlags = new Intent(c8495f.f76758a, (Class<?>) CrossAppAuthActivity.class).addFlags(268435456);
        }
        a11.startActivity(addFlags);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x016d, code lost:
    
        if (r13.z(r14, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0099, code lost:
    
        if (r14 == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(C8495f c8495f, List list, kotlin.coroutines.jvm.internal.c cVar) {
        C8497h c8497h;
        int i11;
        ModalCrossAppResponseDTO modalCrossAppResponseDTO;
        C8495f c8495f2;
        String str;
        ModalCrossAppResponseDTO modalCrossAppResponseDTO2;
        c8495f.getClass();
        if (cVar instanceof C8497h) {
            c8497h = (C8497h) cVar;
            int i12 = c8497h.f76802h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c8497h.f76802h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c8497h.f76800f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c8497h.f76802h;
                if (i11 != 0) {
                    s.b(obj);
                    c8497h.f76798d = c8495f;
                    c8497h.f76799e = list;
                    c8497h.f76802h = 1;
                    List<AccountSignatureData> list2 = list;
                    ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
                    for (AccountSignatureData accountSignatureData : list2) {
                        arrayList.add(new CrossAppSharedStoreKeyDto(accountSignatureData.getPublicKey(), accountSignatureData.getAppName()));
                    }
                    obj = c8495f.f76759b.getValue().modalCrossAppSendChallenge(new ModalCrossAppRequestBodyDTO(arrayList, null, 2, null), c8497h);
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj);
                            return Unit.f71690a;
                        }
                        str = (String) c8497h.f76799e;
                        c8495f2 = c8497h.f76798d;
                        s.b(obj);
                        modalCrossAppResponseDTO2 = (ModalCrossAppResponseDTO) obj;
                        if (modalCrossAppResponseDTO2.getData() != null) {
                            SharedStoreKeysInfoDto sharedStoreKeysInfo = modalCrossAppResponseDTO2.getSharedStoreKeysInfo();
                            if ((sharedStoreKeysInfo != null ? sharedStoreKeysInfo.getSelectedKeyInfo() : null) != null) {
                                c8495f2.f76778u = str;
                                c8495f2.f76779v = modalCrossAppResponseDTO2.getSharedStoreKeysInfo().getSelectedKeyInfo();
                                c8497h.f76798d = null;
                                c8497h.f76799e = null;
                                c8497h.f76802h = 3;
                            }
                        }
                        throw new IllegalStateException("Cross app modal data and selected key should be passed from backend after checking challenge");
                    }
                    list = (List) c8497h.f76799e;
                    c8495f = c8497h.f76798d;
                    s.b(obj);
                }
                modalCrossAppResponseDTO = (ModalCrossAppResponseDTO) obj;
                if (modalCrossAppResponseDTO.getSharedStoreKeysInfo() != null) {
                    c8495f.s(AbstractC8494e.c.f76756a);
                    return Unit.f71690a;
                }
                CrossAppSelectedKeyDto selectedKeyInfo = modalCrossAppResponseDTO.getSharedStoreKeysInfo().getSelectedKeyInfo();
                List<String> unauthorizedKeys = modalCrossAppResponseDTO.getSharedStoreKeysInfo().getUnauthorizedKeys();
                if (unauthorizedKeys != null) {
                    c8495f.f76760c.f(unauthorizedKeys);
                }
                if (selectedKeyInfo == null) {
                    c8495f.s(AbstractC8494e.c.f76756a);
                    return Unit.f71690a;
                }
                for (AccountSignatureData accountSignatureData2 : list) {
                    if (Intrinsics.d(accountSignatureData2.getPublicKey(), selectedKeyInfo.getAuthPublicKey())) {
                        String appName = accountSignatureData2.getAppName();
                        String b11 = c8495f.f76761d.b(selectedKeyInfo.getAuthPublicKey(), selectedKeyInfo.getAuthChallenge());
                        if (b11 == null) {
                            x0<Boolean> x0Var = c8495f.f76768k;
                            Boolean bool = Boolean.FALSE;
                            x0Var.tryEmit(bool);
                            c8495f.f76764g.tryEmit(bool);
                            return Unit.f71690a;
                        }
                        String b12 = Nk.a.b("composer-api.bx/_action/", selectedKeyInfo.getAuthAction());
                        CrossAppApi value = c8495f.f76759b.getValue();
                        ModalCrossAppRequestBodyDTO modalCrossAppRequestBodyDTO = new ModalCrossAppRequestBodyDTO(null, new CrossAppChallengeInfoDto(selectedKeyInfo.getAuthPublicKey(), appName, b11), 1, null);
                        c8497h.f76798d = c8495f;
                        c8497h.f76799e = appName;
                        c8497h.f76802h = 2;
                        obj = value.modalCrossAppCheckChallenge(b12, modalCrossAppRequestBodyDTO, c8497h);
                        if (obj != aVar) {
                            c8495f2 = c8495f;
                            str = appName;
                            modalCrossAppResponseDTO2 = (ModalCrossAppResponseDTO) obj;
                            if (modalCrossAppResponseDTO2.getData() != null) {
                            }
                            throw new IllegalStateException("Cross app modal data and selected key should be passed from backend after checking challenge");
                        }
                        return aVar;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        c8497h = new C8497h(c8495f, cVar);
        Object obj2 = c8497h.f76800f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c8497h.f76802h;
        if (i11 != 0) {
        }
        modalCrossAppResponseDTO = (ModalCrossAppResponseDTO) obj2;
        if (modalCrossAppResponseDTO.getSharedStoreKeysInfo() != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        this.f76775r = null;
        this.f76778u = null;
        x0<Boolean> x0Var = this.f76764g;
        Boolean bool = Boolean.FALSE;
        x0Var.setValue(bool);
        this.f76777t = false;
        this.f76776s = null;
        this.f76766i.tryEmit(null);
        this.f76768k.tryEmit(bool);
        this.f76770m.tryEmit(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        List<AccountSignatureData> c11 = this.f76760c.c();
        if (c11.isEmpty()) {
            s(AbstractC8494e.c.f76756a);
            return;
        }
        C10720e0 c10720e0 = C10720e0.f105451a;
        td0.f.b(this.f76763f, He.b.f10879b, new a(c11, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(AbstractC8494e abstractC8494e) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        td0.f.b(this.f76763f, De.s.f6650a, new b(abstractC8494e, this, null));
    }

    private final void v() {
        C6149M c6149m = (C6149M) this.f76772o.getValue();
        String string = this.f76758a.getString(R.string.ozonid_error_technical_error_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        c6149m.f(string);
        s(AbstractC8494e.c.f76756a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (r7.emit(r6, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(ModalCrossAppResponseDTO modalCrossAppResponseDTO, kotlin.coroutines.jvm.internal.c cVar) {
        C8498i c8498i;
        int i11;
        C8495f c8495f;
        if (cVar instanceof C8498i) {
            c8498i = (C8498i) cVar;
            int i12 = c8498i.f76807h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c8498i.f76807h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c8498i.f76805f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c8498i.f76807h;
                if (i11 != 0) {
                    s.b(obj);
                    x0<Boolean> x0Var = this.f76768k;
                    Boolean bool = Boolean.FALSE;
                    c8498i.f76803d = this;
                    c8498i.f76804e = modalCrossAppResponseDTO;
                    c8498i.f76807h = 1;
                    if (x0Var.emit(bool, c8498i) != aVar) {
                        c8495f = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                modalCrossAppResponseDTO = c8498i.f76804e;
                c8495f = c8498i.f76803d;
                s.b(obj);
                x0<ModalCrossAppResponseDTO.ModalDTO> x0Var2 = c8495f.f76766i;
                ModalCrossAppResponseDTO.ModalDTO data = modalCrossAppResponseDTO.getData();
                c8498i.f76803d = null;
                c8498i.f76804e = null;
                c8498i.f76807h = 2;
            }
        }
        c8498i = new C8498i(this, cVar);
        Object obj2 = c8498i.f76805f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c8498i.f76807h;
        if (i11 != 0) {
        }
        x0<ModalCrossAppResponseDTO.ModalDTO> x0Var22 = c8495f.f76766i;
        ModalCrossAppResponseDTO.ModalDTO data2 = modalCrossAppResponseDTO.getData();
        c8498i.f76803d = null;
        c8498i.f76804e = null;
        c8498i.f76807h = 2;
    }

    @NotNull
    public final InterfaceC2395h<Boolean> n() {
        return this.f76769l;
    }

    @NotNull
    public final C2406m0 o() {
        return this.f76767j;
    }

    @NotNull
    public final InterfaceC2395h<Boolean> p() {
        return this.f76771n;
    }

    @NotNull
    public final InterfaceC2395h<Boolean> q() {
        return this.f76765h;
    }

    public final void t() {
        if (this.f76777t || !this.f76764g.getValue().booleanValue()) {
            return;
        }
        s(AbstractC8494e.b.f76755a);
    }

    public final void u(@NotNull String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f76777t = true;
        td0.f.b(this.f76763f, null, new c(action, null));
    }

    public final void w() {
        Function0<Unit> function0;
        this.f76774q = true;
        if (!((C6176v) this.f76773p.getValue()).e() && (function0 = this.f76776s) != null) {
            ((g) function0).invoke();
        }
        this.f76776s = null;
    }

    public final void x(@NotNull String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f76777t = true;
        d dVar = new d(J.f105405n0, this);
        this.f76770m.tryEmit(Boolean.TRUE);
        td0.f.b(this.f76763f, dVar, new e(action, null));
    }

    public final void y(@NotNull C8493d args) {
        Intrinsics.checkNotNullParameter(args, "args");
        if (this.f76764g.b(Boolean.FALSE, Boolean.TRUE)) {
            this.f76775r = args;
            if (this.f76776s == null) {
                if (((C6176v) this.f76773p.getValue()).e()) {
                    m();
                } else if (this.f76774q) {
                    r();
                } else {
                    this.f76776s = new g(this);
                }
            }
        }
    }
}
