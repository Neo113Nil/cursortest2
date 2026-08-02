package gd0;

import Ae.C2406m0;
import Bc0.a;
import De.C2862e;
import I1.w;
import Sc.InterfaceC4008j;
import androidx.lifecycle.C5418g0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import h3.C6788a;
import id0.C7050a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.RestoreAccesVO;
import td0.n;
import xc0.C10702a;
import xe.C10720e0;
import xe.C10727i;
import xe.N;
import zc0.C11092g;

/* loaded from: classes3.dex */
public final class h extends w0 {

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f64279k = {w.c(h.class, "uiState", "getUiState()Lru/ozon/id/nativeauth/data/models/RestoreAccesVO;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f64280a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10702a> f64281b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Pc0.c> f64282c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C11092g f64283d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Nc0.f> f64284e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f64285f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C2862e f64286g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final td0.m f64287h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C2406m0 f64288i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f64289j;

    public h(@NotNull String screenId, @NotNull InterfaceC4008j authRepository, @NotNull InterfaceC4008j authRouter, @NotNull C11092g mapper, @NotNull InterfaceC4008j mainScreenContainer, @NotNull InterfaceC4008j trackingRepository, @NotNull a.n fullScreenExceptionHandler, @NotNull C5418g0 savedStateHandle) {
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Intrinsics.checkNotNullParameter(authRepository, "authRepository");
        Intrinsics.checkNotNullParameter(authRouter, "authRouter");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(mainScreenContainer, "mainScreenContainer");
        Intrinsics.checkNotNullParameter(trackingRepository, "trackingRepository");
        Intrinsics.checkNotNullParameter(fullScreenExceptionHandler, "fullScreenExceptionHandler");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.f64280a = screenId;
        this.f64281b = authRepository;
        this.f64282c = authRouter;
        this.f64283d = mapper;
        this.f64284e = mainScreenContainer;
        this.f64285f = trackingRepository;
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2862e g10 = N.g(N.g(a11, He.b.f10879b), fullScreenExceptionHandler);
        this.f64286g = g10;
        this.f64287h = n.a(savedStateHandle, "restore_vo_saved_state_key");
        this.f64288i = new C2406m0(savedStateHandle.d("restore_vo_saved_state_key"));
        g gVar = new g(this);
        this.f64289j = gVar;
        ((Nc0.f) mainScreenContainer.getValue()).b(gVar);
        C10727i.c(g10, null, null, new f(this, null), 3);
    }

    public static final void h0(h hVar) {
        hVar.getClass();
        C10727i.c(hVar.f64286g, null, null, new f(hVar, null), 3);
    }

    public static final void i0(h hVar, RestoreAccesVO restoreAccesVO) {
        hVar.f64287h.setValue(hVar, f64279k[0], restoreAccesVO);
        hVar.f64284e.getValue().j();
    }

    @NotNull
    public final C2406m0 j0() {
        return this.f64288i;
    }

    public final void k0(@NotNull C11092g.a cellDto) {
        Intrinsics.checkNotNullParameter(cellDto, "cellDto");
        String c11 = cellDto.c();
        if (c11 != null) {
            ((C7050a) this.f64285f.getValue()).b(c11);
        }
        String b11 = cellDto.b();
        if (b11 != null) {
            this.f64282c.getValue().v(b11);
        }
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        this.f64284e.getValue().d(this.f64289j);
    }
}
