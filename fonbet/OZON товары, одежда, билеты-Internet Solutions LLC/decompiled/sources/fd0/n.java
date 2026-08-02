package fd0;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import Bc0.a;
import Sc.InterfaceC4008j;
import Sc.s;
import Vb0.b;
import android.app.Application;
import androidx.lifecycle.C5418g0;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import ed0.C6348a;
import id0.C7050a;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.AuthActionDTO;
import ru.ozon.id.nativeauth.requestPhoneAccess.data.RequestPhoneAccessDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import wc0.InterfaceC10500a;
import xc0.C10702a;
import xe.M;
import ze.C11115c;

/* loaded from: classes3.dex */
public final class n extends w0 implements M {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f63118a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Application f63119b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Nc0.f> f63120c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C5418g0 f63121d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10702a> f63122e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Pc0.c> f63123f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final a.n f63124g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6348a> f63125h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C7050a> f63126i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f63127j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final x0<RequestPhoneAccessDTO> f63128k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C2406m0 f63129l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final C11115c f63130m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<Unit> f63131n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f63132o;

    public n(@NotNull String screenId, @NotNull Application application, @NotNull InterfaceC4008j mainScreenContainer, @NotNull C5418g0 savedStateHandle, @NotNull InterfaceC4008j authRepository, @NotNull InterfaceC4008j authRouter, @NotNull a.n fullscreenExceptionHandler, @NotNull InterfaceC4008j requestPhoneAccessTrackingManager, @NotNull InterfaceC4008j trackingRepository) {
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(mainScreenContainer, "mainScreenContainer");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(authRepository, "authRepository");
        Intrinsics.checkNotNullParameter(authRouter, "authRouter");
        Intrinsics.checkNotNullParameter(fullscreenExceptionHandler, "fullscreenExceptionHandler");
        Intrinsics.checkNotNullParameter(requestPhoneAccessTrackingManager, "requestPhoneAccessTrackingManager");
        Intrinsics.checkNotNullParameter(trackingRepository, "trackingRepository");
        this.f63118a = screenId;
        this.f63119b = application;
        this.f63120c = mainScreenContainer;
        this.f63121d = savedStateHandle;
        this.f63122e = authRepository;
        this.f63123f = authRouter;
        this.f63124g = fullscreenExceptionHandler;
        this.f63125h = requestPhoneAccessTrackingManager;
        this.f63126i = trackingRepository;
        this.f63127j = Sc.k.b(new h(this));
        x0<RequestPhoneAccessDTO> a11 = O0.a(null);
        this.f63128k = a11;
        this.f63129l = new C2406m0(a11);
        C11115c a12 = ze.k.a(-1, 6, null);
        this.f63130m = a12;
        this.f63131n = C2399j.H(a12);
        j jVar = new j(this);
        this.f63132o = jVar;
        RequestPhoneAccessDTO requestPhoneAccessDTO = (RequestPhoneAccessDTO) savedStateHandle.c("dto_saved_state_key");
        ((Nc0.f) mainScreenContainer.getValue()).b(jVar);
        if (requestPhoneAccessDTO == null) {
            td0.f.b(this, null, new i(this, null));
        } else {
            a11.tryEmit(requestPhoneAccessDTO);
            ((Nc0.f) mainScreenContainer.getValue()).j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d0(n nVar, RequestPhoneAccessDTO.OzonIdButtonDTO ozonIdButtonDTO, Boolean bool, Boolean bool2, kotlin.coroutines.jvm.internal.c cVar) {
        g gVar;
        int i11;
        String link;
        nVar.getClass();
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i12 = gVar.f63105g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                gVar.f63105g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = gVar.f63103e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = gVar.f63105g;
                if (i11 != 0) {
                    s.b(obj);
                    if (ozonIdButtonDTO == null) {
                        return Unit.f71690a;
                    }
                    String str = null;
                    String str2 = bool != null ? bool.booleanValue() ? "allow" : "decline" : null;
                    if (bool2 != null) {
                        str = bool2.booleanValue() ? "allow" : "decline";
                    }
                    Tc.d builder = new Tc.d();
                    if (str2 != null) {
                    }
                    if (str != null) {
                        builder.put("ozonid_setup_call_manage", str);
                    }
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    Tc.d u11 = builder.u();
                    String trackingAction = ozonIdButtonDTO.getTrackingAction();
                    if (trackingAction != null) {
                        nVar.f63126i.getValue().b(nVar.f63125h.getValue().e(trackingAction, str2, str));
                    }
                    AtomActionDTO action = ozonIdButtonDTO.getAction();
                    if (action == null || (link = action.getLink()) == null) {
                        b.a.b(Vb0.b.f28514a, "Unexpected null in action.link!");
                        return Unit.f71690a;
                    }
                    nVar.f63120c.getValue().p();
                    C10702a value = nVar.f63122e.getValue();
                    gVar.f63102d = nVar;
                    gVar.f63105g = 1;
                    obj = InterfaceC10500a.C2252a.a(value, link, u11, gVar, 12);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nVar = gVar.f63102d;
                    s.b(obj);
                }
                nVar.f63123f.getValue().w((AuthActionDTO) obj);
                return Unit.f71690a;
            }
        }
        gVar = new g(nVar, cVar);
        Object obj2 = gVar.f63103e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = gVar.f63105g;
        if (i11 != 0) {
        }
        nVar.f63123f.getValue().w((AuthActionDTO) obj2);
        return Unit.f71690a;
    }

    public static final void n0(n nVar, RequestPhoneAccessDTO requestPhoneAccessDTO) {
        nVar.f63128k.tryEmit(requestPhoneAccessDTO);
        nVar.f63120c.getValue().j();
    }

    public static final void p0(n nVar) {
        nVar.f63128k.tryEmit(null);
        nVar.f63130m.e();
    }

    @Override // xe.M
    @NotNull
    public final CoroutineContext getCoroutineContext() {
        return (CoroutineContext) this.f63127j.getValue();
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        this.f63120c.getValue().d(this.f63132o);
        super.onCleared();
    }

    @NotNull
    public final InterfaceC2395h<Unit> q0() {
        return this.f63131n;
    }

    @NotNull
    public final InterfaceC2395h<RequestPhoneAccessDTO> r0() {
        return this.f63129l;
    }

    public final void s0() {
        this.f63123f.getValue().A();
    }
}
