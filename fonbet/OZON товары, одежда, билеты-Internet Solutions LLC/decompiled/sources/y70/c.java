package y70;

import Ae.O0;
import Ae.x0;
import android.app.Application;
import d40.InterfaceC6083a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.onboarding.ui.DisclosureItem;
import ru.ozon.fintech.ui.button.large.FinLargeButtonState;
import w70.C10445a;
import x70.C10674a;

/* loaded from: classes3.dex */
public final class c extends E30.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f106200a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6083a f106201b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f106202c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C10674a f106203d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final x0<Pair<FinLargeButtonState, FinLargeButtonState>> f106204e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final x0<C10445a> f106205f;

    public c(@NotNull Application application, @NotNull InterfaceC6083a exchanger, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull C10674a disclosureConfig) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(disclosureConfig, "disclosureConfig");
        this.f106200a = application;
        this.f106201b = exchanger;
        this.f106202c = fintechSettings;
        this.f106203d = disclosureConfig;
        this.f106204e = O0.a(null);
        this.f106205f = O0.a(null);
    }

    public static final void d0(c cVar, String str) {
        cVar.getClass();
        boolean d11 = Intrinsics.d(str, "enabled");
        InterfaceC6083a interfaceC6083a = cVar.f106201b;
        ru.ozon.fintech.settings.domain.a aVar = cVar.f106202c;
        if (d11) {
            Boolean bool = Boolean.TRUE;
            aVar.y(bool);
            interfaceC6083a.c(bool, "DISCLOSURE_DONE");
        } else if (Intrinsics.d(str, "disabled")) {
            aVar.y(Boolean.FALSE);
            interfaceC6083a.c(Boolean.TRUE, "DISCLOSURE_DONE");
        }
    }

    @NotNull
    public final x0<Pair<FinLargeButtonState, FinLargeButtonState>> e0() {
        return this.f106204e;
    }

    @NotNull
    public final x0<C10445a> f0() {
        return this.f106205f;
    }

    public final void g0() {
        x0<Pair<FinLargeButtonState, FinLargeButtonState>> x0Var = this.f106204e;
        C10674a c10674a = this.f106203d;
        int e11 = c10674a.e();
        Application application = this.f106200a;
        String string = application.getString(e11);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        FinLargeButtonState finLargeButtonState = new FinLargeButtonState("enabled", string, null, new C10859a(1, this, c.class, "handleClick", "handleClick(Ljava/lang/String;)V", 0), FinLargeButtonState.Type.PRIMARY, null, null, null, null, 484, null);
        String string2 = application.getString(c10674a.b());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        x0Var.setValue(new Pair<>(finLargeButtonState, new FinLargeButtonState("disabled", string2, null, new C10860b(1, this, c.class, "handleClick", "handleClick(Ljava/lang/String;)V", 0), FinLargeButtonState.Type.SECONDARY, null, null, null, null, 484, null)));
        x0<C10445a> x0Var2 = this.f106205f;
        Integer f7 = c10674a.f();
        String string3 = application.getString(c10674a.c());
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        int i11 = c10674a.i();
        String string4 = application.getString(c10674a.d(), this.f106202c.getAppName());
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        int h11 = c10674a.h();
        List<C10674a.C2275a> g10 = c10674a.g();
        ArrayList arrayList = new ArrayList(C7714v.z(g10, 10));
        for (C10674a.C2275a c2275a : g10) {
            String valueOf = String.valueOf(c2275a.b());
            int a11 = c2275a.a();
            String string5 = application.getString(c2275a.b());
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            arrayList.add(new DisclosureItem(valueOf, string5, a11, R.color.oz_semantic_ctrl_neutral_pale_100));
        }
        x0Var2.setValue(new C10445a(f7, string3, i11, string4, h11, arrayList));
    }
}
