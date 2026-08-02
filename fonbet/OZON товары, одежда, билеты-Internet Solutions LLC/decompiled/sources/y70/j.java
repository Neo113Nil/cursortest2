package y70;

import Ae.C0;
import Ae.E0;
import Ae.O0;
import Ae.w0;
import Ae.x0;
import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.r;
import h3.C6788a;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r90.f;
import ru.ozon.app.android.R;
import ru.ozon.fintech.network.models.a;
import ru.ozon.fintech.ui.button.large.FinLargeButtonState;
import ru.ozon.fintech.ui.screenstate.ScreenState;
import t90.AbstractC9781a;
import t90.AbstractC9782b;
import u90.C9987a;
import xe.C10720e0;
import xe.C10727i;
import ze.EnumC11113a;

/* loaded from: classes3.dex */
public final class j extends E30.d implements f.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f106267a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final r90.f f106268b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final S80.b f106269c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final h90.f f106270d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Q90.c f106271e;

    /* renamed from: f, reason: collision with root package name */
    private AbstractC9782b f106272f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final x0<C9987a> f106273g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private C0 f106274h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final x0<Pair<FinLargeButtonState, FinLargeButtonState>> f106275i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final x0<String> f106276j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final x0<String> f106277k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final x0<String> f106278l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final x0<ScreenState> f106279m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private ru.ozon.fintech.network.models.a f106280n;

    /* renamed from: o, reason: collision with root package name */
    private String f106281o;

    /* renamed from: p, reason: collision with root package name */
    private String f106282p;

    /* renamed from: q, reason: collision with root package name */
    private String f106283q;

    /* synthetic */ class a extends C7735q implements Function1<String, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String p02 = str;
            Intrinsics.checkNotNullParameter(p02, "p0");
            j.f0((j) this.receiver, p02);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class b extends C7735q implements Function1<String, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String p02 = str;
            Intrinsics.checkNotNullParameter(p02, "p0");
            j.f0((j) this.receiver, p02);
            return Unit.f71690a;
        }
    }

    public j(@NotNull Application application, @NotNull r90.f permissionsDelegate, @NotNull S80.b navigation, @NotNull h90.f notifcationInteractor, @NotNull Q90.c featureToggles) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(permissionsDelegate, "permissionsDelegate");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(notifcationInteractor, "notifcationInteractor");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        this.f106267a = application;
        this.f106268b = permissionsDelegate;
        this.f106269c = navigation;
        this.f106270d = notifcationInteractor;
        this.f106271e = featureToggles;
        this.f106273g = O0.a(null);
        this.f106274h = E0.a(0, 1, EnumC11113a.DROP_LATEST);
        this.f106275i = O0.a(null);
        this.f106276j = O0.a(null);
        this.f106277k = O0.a(null);
        this.f106278l = O0.a(null);
        this.f106279m = O0.a(null);
        this.f106280n = a.b.f96629a;
        permissionsDelegate.s(this);
    }

    public static final void f0(j jVar, String str) {
        jVar.getClass();
        if (!Intrinsics.d(str, "enabled")) {
            if (Intrinsics.d(str, "disabled")) {
                jVar.f106269c.pop();
                return;
            }
            return;
        }
        C0 c02 = jVar.f106274h;
        AbstractC9782b abstractC9782b = jVar.f106272f;
        if (abstractC9782b != null) {
            abstractC9782b.c(false);
        }
        Unit unit = Unit.f71690a;
        jVar.f106268b.getClass();
        c02.tryEmit(r90.f.p(abstractC9782b));
    }

    public static final void h0(j jVar, a.b bVar) {
        jVar.f106280n = bVar;
        jVar.handleState();
    }

    private final void handleState() {
        if (this.f106272f instanceof AbstractC9782b.a) {
            this.f106269c.pop();
            return;
        }
        this.f106276j.setValue(this.f106283q);
        this.f106277k.setValue(this.f106282p);
        this.f106278l.setValue(this.f106281o);
        this.f106279m.setValue(Intrinsics.d(this.f106280n, a.c.f96630a) ? new ScreenState.Progress(0L, null, 3, null) : null);
        x0<Pair<FinLargeButtonState, FinLargeButtonState>> x0Var = this.f106275i;
        boolean z11 = this.f106272f instanceof AbstractC9782b.d;
        Application application = this.f106267a;
        String string = z11 ? application.getString(R.string.fintech_notification_request_go_settings) : application.getString(R.string.fintech_notification_request_enable);
        Intrinsics.f(string);
        FinLargeButtonState finLargeButtonState = new FinLargeButtonState("enabled", string, null, new a(1, this, j.class, "handleClick", "handleClick(Ljava/lang/String;)V", 0), FinLargeButtonState.Type.PRIMARY, null, null, null, null, 484, null);
        String string2 = application.getString(R.string.fintech_notification_request_disable);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        x0Var.setValue(new Pair<>(finLargeButtonState, new FinLargeButtonState("disabled", string2, null, new b(1, this, j.class, "handleClick", "handleClick(Ljava/lang/String;)V", 0), FinLargeButtonState.Type.SECONDARY, null, null, null, null, 484, null)));
    }

    @NotNull
    public final w0<AbstractC9781a> getPermissionAction() {
        return this.f106274h;
    }

    @NotNull
    public final x0<ScreenState> getScreenStateFlow() {
        return this.f106279m;
    }

    @NotNull
    public final x0<Pair<FinLargeButtonState, FinLargeButtonState>> i0() {
        return this.f106275i;
    }

    @NotNull
    public final x0<String> j0() {
        return this.f106278l;
    }

    @NotNull
    public final x0<String> k0() {
        return this.f106276j;
    }

    @NotNull
    public final x0<String> l0() {
        return this.f106277k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m0(@NotNull r activity, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (str != null) {
            this.f106281o = str;
        }
        if (str2 == null) {
            this.f106282p = activity.getString(R.string.fintech_notification_request_title);
        } else {
            this.f106282p = str2;
        }
        if (str3 == null) {
            this.f106280n = a.c.f96630a;
            handleState();
            C6788a a11 = androidx.lifecycle.x0.a(this);
            C10720e0 c10720e0 = C10720e0.f105451a;
            C10727i.c(a11, He.b.f10879b, null, new k(this, null), 2);
        } else {
            this.f106283q = str3;
        }
        if (activity instanceof I30.a) {
            ((I30.a) activity).a(true);
        }
    }

    public final void onPermissionResumeOrResult(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f106268b.d(activity, false);
    }

    @Override // r90.f.a
    public final void permissionUpdated(AbstractC9782b abstractC9782b) {
        if (abstractC9782b instanceof AbstractC9782b.a) {
            AbstractC9782b abstractC9782b2 = this.f106272f;
            if ((abstractC9782b2 instanceof AbstractC9782b.c) || (abstractC9782b2 instanceof AbstractC9782b.C2182b)) {
                this.f106270d.getClass();
            }
        }
        this.f106272f = abstractC9782b;
        handleState();
    }
}
