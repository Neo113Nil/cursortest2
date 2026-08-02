package d80;

import Ae.O0;
import Ae.x0;
import Sc.o;
import android.app.Application;
import g30.InterfaceC6618a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.fintech.network.models.a;
import ru.ozon.fintech.ui.screenstate.ScreenState;

/* loaded from: classes3.dex */
public final class d extends E30.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f61316a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f61317b;

    /* renamed from: c, reason: collision with root package name */
    private String f61318c;

    /* renamed from: d, reason: collision with root package name */
    private String f61319d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final x0<String> f61320e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final x0<String> f61321f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private ru.ozon.fintech.network.models.a f61322g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final x0<ScreenState> f61323h;

    /* synthetic */ class a extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            d.d0((d) this.receiver);
            return Unit.f71690a;
        }
    }

    public d(@NotNull Application application, @NotNull InterfaceC6618a fintechAnalyticInteractor) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f61316a = application;
        this.f61317b = fintechAnalyticInteractor;
        this.f61320e = O0.a(null);
        this.f61321f = O0.a(null);
        this.f61322g = a.b.f96629a;
        this.f61323h = O0.a(null);
    }

    public static final void d0(d dVar) {
        dVar.f61320e.setValue(null);
        dVar.f61321f.setValue(null);
        dVar.f61322g = a.c.f96630a;
        dVar.handleState();
    }

    private final void handleState() {
        ScreenState generalError$default;
        this.f61320e.setValue(this.f61318c);
        this.f61321f.setValue(this.f61319d);
        x0<ScreenState> x0Var = this.f61323h;
        ru.ozon.fintech.network.models.a aVar = this.f61322g;
        if (aVar instanceof a.b) {
            generalError$default = null;
        } else if (aVar instanceof a.c) {
            generalError$default = new ScreenState.Progress(0L, null, 3, null);
        } else {
            if (!(aVar instanceof a.C2102a)) {
                throw new o();
            }
            generalError$default = ScreenState.Companion.getGeneralError$default(ScreenState.INSTANCE, new a(0, this, d.class, DeleteAccountApiResponse.Error.TYPE_RELOAD, "reload()V", 0), this.f61316a, null, 4, null);
        }
        x0Var.setValue(generalError$default);
    }

    @NotNull
    public final x0<String> e0() {
        return this.f61321f;
    }

    @NotNull
    public final x0<String> f0() {
        return this.f61320e;
    }

    public final void g0(String str, String str2) {
        this.f61318c = str;
        this.f61319d = str2;
        this.f61322g = a.c.f96630a;
        handleState();
    }

    @NotNull
    public final x0<ScreenState> getScreenStateFlow() {
        return this.f61323h;
    }

    public final void h0(Exception exc) {
        this.f61322g = new a.C2102a(exc);
        handleState();
        String str = this.f61318c;
        if (str == null && (str = this.f61319d) == null) {
            str = "";
        }
        this.f61317b.i0(str, null, false);
    }

    public final void i0() {
        this.f61322g = a.b.f96629a;
        handleState();
        String str = this.f61318c;
        if (str == null && (str = this.f61319d) == null) {
            str = "";
        }
        this.f61317b.i0(str, null, true);
    }
}
