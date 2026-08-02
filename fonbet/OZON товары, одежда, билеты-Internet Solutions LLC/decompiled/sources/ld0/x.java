package ld0;

import Fb0.f;
import Kb0.K;
import Vb0.b;
import We.A;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import md0.C8134b;
import org.jetbrains.annotations.NotNull;
import rd0.InterfaceC9254a;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.data.models.AuthTokenDTO;
import ru.ozon.id.nativeauth.main.activity.AuthFlowActivity;
import ru.ozon.id.ozonLimb.debug.OzonIdDebugActivity;
import ru.ozon.id.user.data.OzonIdUser;
import sd0.EnumC9670a;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lld0/x;", "Landroidx/fragment/app/m;", "<init>", "()V", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"SetTextI18n"})
/* loaded from: classes3.dex */
public final class x extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    private Jb0.i f73240a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f73241b;

    static final class a extends AbstractC7737t implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            x xVar = x.this;
            Jb0.i iVar = xVar.f73240a;
            if (iVar != null) {
                xVar.J(iVar);
            }
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function1<InterfaceC9254a, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Jb0.i f73244c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Jb0.i iVar) {
            super(1);
            this.f73244c = iVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC9254a interfaceC9254a) {
            InterfaceC9254a it = interfaceC9254a;
            Intrinsics.checkNotNullParameter(it, "it");
            x.D(x.this, this.f73244c, it);
            return Unit.f71690a;
        }
    }

    public x() {
        super(R.layout.fragment_ozon_id_debug_main);
        this.f73241b = new a();
    }

    public static void A(x xVar) {
        OzonIdDebugActivity F11 = xVar.F();
        if (F11 != null) {
            F11.P(new md0.e());
        }
    }

    public static final void D(x xVar, Jb0.i iVar, InterfaceC9254a interfaceC9254a) {
        OzonIdDebugActivity F11 = xVar.F();
        if (F11 != null) {
            F11.O();
        }
        if (interfaceC9254a instanceof InterfaceC9254a.c) {
            H(iVar, (InterfaceC9254a.c) interfaceC9254a);
            return;
        }
        if (interfaceC9254a instanceof InterfaceC9254a.b) {
            H(iVar, null);
            return;
        }
        if (!(interfaceC9254a instanceof InterfaceC9254a.C1418a)) {
            throw new Sc.o();
        }
        InterfaceC9254a.C1418a c1418a = (InterfaceC9254a.C1418a) interfaceC9254a;
        b.a.c(Vb0.b.f28514a, c1418a.a());
        OzonIdDebugActivity F12 = xVar.F();
        if (F12 != null) {
            F12.R("Ошибка: " + c1418a.a().getMessage());
        }
        H(iVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OzonIdDebugActivity F() {
        androidx.fragment.app.r activity = getActivity();
        if (activity instanceof OzonIdDebugActivity) {
            return (OzonIdDebugActivity) activity;
        }
        return null;
    }

    private final String G(Jb0.i iVar) {
        String obj = kotlin.text.h.z0(String.valueOf(iVar.f14458c.getText())).toString();
        try {
            We.A.f33515l.getClass();
            A.b.c(obj);
            return obj;
        } catch (Throwable unused) {
            OzonIdDebugActivity F11 = F();
            if (F11 == null) {
                return null;
            }
            if (kotlin.text.h.K(obj)) {
                obj = "(пустой)";
            }
            F11.R("Некорректный URL:\n" + ((Object) obj));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void H(Jb0.i iVar, InterfaceC9254a.c cVar) {
        boolean z11;
        boolean z12;
        boolean z13;
        OzonIdUser a11;
        OzonIdUser.Profile profile;
        OzonIdUser a12;
        OzonIdUser.Credentials credentials;
        boolean z14 = false;
        boolean z15 = cVar != null;
        AppCompatTextView appCompatTextView = iVar.f14455N;
        K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        appCompatTextView.setText(String.valueOf(k11.w().getValue().d()));
        K k12 = Tb0.a.f26975d;
        if (k12 == null) {
            throw new Lb0.a();
        }
        iVar.f14449H.setText(String.valueOf(k12.w().getValue().b()));
        String str = null;
        iVar.f14445D.setText(String.valueOf((cVar == null || (a12 = cVar.a()) == null || (credentials = a12.getCredentials()) == null) ? null : credentials.getPhone()));
        if (cVar != null && (a11 = cVar.a()) != null && (profile = a11.getProfile()) != null) {
            str = G.g.c(profile.getFirstName(), " ", profile.getLastName());
        }
        iVar.f14454M.setText(String.valueOf(str));
        if (z15) {
            K k13 = Tb0.a.f26975d;
            if (k13 == null) {
                throw new Lb0.a();
            }
            if (k13.q().getValue().available()) {
                z11 = true;
                iVar.f14475t.setEnabled(z11);
                if (z15) {
                    K k14 = Tb0.a.f26975d;
                    if (k14 == null) {
                        throw new Lb0.a();
                    }
                    if (k14.q().getValue().available()) {
                        z12 = true;
                        iVar.f14473r.setEnabled(z12);
                        if (z15) {
                            K k15 = Tb0.a.f26975d;
                            if (k15 == null) {
                                throw new Lb0.a();
                            }
                            if (k15.D().getValue().available()) {
                                z13 = true;
                                iVar.f14476u.setEnabled(z13);
                                if (z15) {
                                    K k16 = Tb0.a.f26975d;
                                    if (k16 == null) {
                                        throw new Lb0.a();
                                    }
                                    if (k16.D().getValue().available()) {
                                        z14 = true;
                                    }
                                }
                                iVar.f14474s.setEnabled(z14);
                                boolean z16 = !z15;
                                iVar.f14453L.setEnabled(z16);
                                iVar.f14442A.setEnabled(z15);
                                iVar.f14477v.setEnabled(z15);
                                iVar.f14478w.setEnabled(z15);
                                iVar.f14479x.setEnabled(z15);
                                iVar.f14480y.setEnabled(z15);
                                iVar.f14459d.setEnabled(z16);
                                iVar.f14462g.setEnabled(z15);
                            }
                        }
                        z13 = false;
                        iVar.f14476u.setEnabled(z13);
                        if (z15) {
                        }
                        iVar.f14474s.setEnabled(z14);
                        boolean z162 = !z15;
                        iVar.f14453L.setEnabled(z162);
                        iVar.f14442A.setEnabled(z15);
                        iVar.f14477v.setEnabled(z15);
                        iVar.f14478w.setEnabled(z15);
                        iVar.f14479x.setEnabled(z15);
                        iVar.f14480y.setEnabled(z15);
                        iVar.f14459d.setEnabled(z162);
                        iVar.f14462g.setEnabled(z15);
                    }
                }
                z12 = false;
                iVar.f14473r.setEnabled(z12);
                if (z15) {
                }
                z13 = false;
                iVar.f14476u.setEnabled(z13);
                if (z15) {
                }
                iVar.f14474s.setEnabled(z14);
                boolean z1622 = !z15;
                iVar.f14453L.setEnabled(z1622);
                iVar.f14442A.setEnabled(z15);
                iVar.f14477v.setEnabled(z15);
                iVar.f14478w.setEnabled(z15);
                iVar.f14479x.setEnabled(z15);
                iVar.f14480y.setEnabled(z15);
                iVar.f14459d.setEnabled(z1622);
                iVar.f14462g.setEnabled(z15);
            }
        }
        z11 = false;
        iVar.f14475t.setEnabled(z11);
        if (z15) {
        }
        z12 = false;
        iVar.f14473r.setEnabled(z12);
        if (z15) {
        }
        z13 = false;
        iVar.f14476u.setEnabled(z13);
        if (z15) {
        }
        iVar.f14474s.setEnabled(z14);
        boolean z16222 = !z15;
        iVar.f14453L.setEnabled(z16222);
        iVar.f14442A.setEnabled(z15);
        iVar.f14477v.setEnabled(z15);
        iVar.f14478w.setEnabled(z15);
        iVar.f14479x.setEnabled(z15);
        iVar.f14480y.setEnabled(z15);
        iVar.f14459d.setEnabled(z16222);
        iVar.f14462g.setEnabled(z15);
    }

    static /* synthetic */ void I(x xVar, Jb0.i iVar) {
        xVar.getClass();
        H(iVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(Jb0.i iVar) {
        OzonIdDebugActivity F11 = F();
        if (F11 != null) {
            F11.S();
        }
        K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        k11.B().getValue().b(new EnumC9670a[]{EnumC9670a.Profile, EnumC9670a.Phone}, new b(iVar));
    }

    public static void t(x xVar) {
        OzonIdDebugActivity F11 = xVar.F();
        if (F11 != null) {
            F11.P(new C7931F());
        }
    }

    public static void u(x xVar) {
        OzonIdDebugActivity F11 = xVar.F();
        if (F11 != null) {
            F11.P(new C7929D());
        }
    }

    public static void v(x xVar) {
        OzonIdDebugActivity F11 = xVar.F();
        if (F11 != null) {
            F11.P(new C8134b());
        }
    }

    public static void w(x xVar, Jb0.i iVar) {
        String G11 = xVar.G(iVar);
        if (G11 == null) {
            return;
        }
        K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        if (k11.t().h().getValue().b().j()) {
            Fb0.d.a(new Fb0.c(true, (AuthTokenDTO) null, 6), Gb0.d.LOGIN, true);
            return;
        }
        int i11 = AuthFlowActivity.f97290u;
        OzonIdDebugActivity F11 = xVar.F();
        if (F11 == null) {
            return;
        }
        AuthFlowActivity.a.d(F11, null, true, new u(G11));
    }

    public static void x(x xVar) {
        K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        k11.v().m().getValue().a();
        OzonIdDebugActivity F11 = xVar.F();
        if (F11 != null) {
            F11.R("Старые токены ШС удалены");
        }
    }

    public static void y(x xVar, Jb0.i iVar) {
        String G11 = xVar.G(iVar);
        if (G11 == null) {
            return;
        }
        int i11 = AuthFlowActivity.f97290u;
        OzonIdDebugActivity activity = xVar.F();
        if (activity == null) {
            return;
        }
        v vVar = new v(G11);
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.startActivity(AuthFlowActivity.a.a(activity, vVar));
    }

    public static void z(x xVar) {
        OzonIdDebugActivity F11 = xVar.F();
        if (F11 != null) {
            F11.P(new C7934c());
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        OzonIdDebugActivity F11 = F();
        if (F11 != null) {
            F11.Q(this.f73241b);
        }
        this.f73240a = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onResume() {
        super.onResume();
        Jb0.i iVar = this.f73240a;
        if (iVar != null) {
            J(iVar);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        OzonIdDebugActivity F11 = F();
        if (F11 != null) {
            F11.N(this.f73241b);
        }
        final Jb0.i a11 = Jb0.i.a(view);
        K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        boolean z11 = k11.N().getAppName() == f.a.SDK_DEMO_APP;
        AppCompatTextView userIdValueTextView = a11.f14455N;
        Intrinsics.checkNotNullExpressionValue(userIdValueTextView, "userIdValueTextView");
        userIdValueTextView.setOnClickListener(new Ck.a(userIdValueTextView, 10));
        AppCompatTextView sessionIdValueTextView = a11.f14449H;
        Intrinsics.checkNotNullExpressionValue(sessionIdValueTextView, "sessionIdValueTextView");
        sessionIdValueTextView.setOnClickListener(new Ck.a(sessionIdValueTextView, 10));
        AppCompatTextView phoneNumberValueTextView = a11.f14445D;
        Intrinsics.checkNotNullExpressionValue(phoneNumberValueTextView, "phoneNumberValueTextView");
        phoneNumberValueTextView.setOnClickListener(new Ck.a(phoneNumberValueTextView, 10));
        AppCompatTextView userFullNameValueTextView = a11.f14454M;
        Intrinsics.checkNotNullExpressionValue(userFullNameValueTextView, "userFullNameValueTextView");
        userFullNameValueTextView.setOnClickListener(new Ck.a(userFullNameValueTextView, 10));
        AppCompatTextView biometrySubtitleTextView = a11.f14463h;
        Intrinsics.checkNotNullExpressionValue(biometrySubtitleTextView, "biometrySubtitleTextView");
        biometrySubtitleTextView.setVisibility(z11 ? 0 : 8);
        MaterialButton materialButton = a11.f14475t;
        materialButton.setVisibility(z11 ? 0 : 8);
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: ld0.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                x xVar = x.this;
                C7926A c7926a = new C7926A(true, xVar, null);
                J viewLifecycleOwner = xVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C10727i.c(androidx.lifecycle.K.a(viewLifecycleOwner), null, null, new C7928C(c7926a, xVar, "Биометрия", null), 3);
            }
        });
        MaterialButton materialButton2 = a11.f14473r;
        materialButton2.setVisibility(z11 ? 0 : 8);
        materialButton2.setOnClickListener(new View.OnClickListener() { // from class: ld0.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                x xVar = x.this;
                C7926A c7926a = new C7926A(false, xVar, null);
                J viewLifecycleOwner = xVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C10727i.c(androidx.lifecycle.K.a(viewLifecycleOwner), null, null, new C7928C(c7926a, xVar, "Биометрия", null), 3);
            }
        });
        AppCompatTextView instantLoginSubtitleTextView = a11.f14481z;
        Intrinsics.checkNotNullExpressionValue(instantLoginSubtitleTextView, "instantLoginSubtitleTextView");
        instantLoginSubtitleTextView.setVisibility(z11 ? 0 : 8);
        MaterialButton materialButton3 = a11.f14476u;
        materialButton3.setVisibility(z11 ? 0 : 8);
        materialButton3.setOnClickListener(new View.OnClickListener() { // from class: ld0.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                x xVar = x.this;
                C7927B c7927b = new C7927B(true, xVar, null);
                J viewLifecycleOwner = xVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C10727i.c(androidx.lifecycle.K.a(viewLifecycleOwner), null, null, new C7928C(c7927b, xVar, "InstantLogin", null), 3);
            }
        });
        MaterialButton materialButton4 = a11.f14474s;
        materialButton4.setVisibility(z11 ? 0 : 8);
        materialButton4.setOnClickListener(new View.OnClickListener() { // from class: ld0.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                x xVar = x.this;
                C7927B c7927b = new C7927B(false, xVar, null);
                J viewLifecycleOwner = xVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C10727i.c(androidx.lifecycle.K.a(viewLifecycleOwner), null, null, new C7928C(c7927b, xVar, "InstantLogin", null), 3);
            }
        });
        a11.f14453L.setOnClickListener(new CC.a(this, 10));
        a11.f14442A.setOnClickListener(new Dc0.m(this, 13));
        a11.f14477v.setOnClickListener(new j());
        a11.f14478w.setOnClickListener(new k());
        a11.f14479x.setOnClickListener(new View.OnClickListener() { // from class: ld0.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                K k12 = Tb0.a.f26975d;
                if (k12 == null) {
                    throw new Lb0.a();
                }
                k12.M().m().getValue().d(null, new w(x.this, a11), false, false);
            }
        });
        a11.f14480y.setOnClickListener(new View.OnClickListener() { // from class: ld0.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                K k12 = Tb0.a.f26975d;
                if (k12 == null) {
                    throw new Lb0.a();
                }
                k12.M().m().getValue().d(null, new t(x.this, a11), true, false);
            }
        });
        a11.f14460e.setOnClickListener(new CD.a(this, 7));
        a11.f14451J.setOnClickListener(new FG.a(this, 17));
        a11.f14466k.setOnClickListener(new View.OnClickListener() { // from class: ld0.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                x xVar = x.this;
                J viewLifecycleOwner = xVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C10727i.c(androidx.lifecycle.K.a(viewLifecycleOwner), null, null, new r(false, xVar, null), 3);
            }
        });
        a11.f14464i.setOnClickListener(new View.OnClickListener() { // from class: ld0.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                x xVar = x.this;
                J viewLifecycleOwner = xVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C10727i.c(androidx.lifecycle.K.a(viewLifecycleOwner), null, null, new r(true, xVar, null), 3);
            }
        });
        a11.f14467l.setOnClickListener(new View.OnClickListener() { // from class: ld0.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C10727i.c(androidx.lifecycle.K.a(x.this), null, null, new z(2, null), 3);
            }
        });
        a11.f14472q.setOnClickListener(new View.OnClickListener() { // from class: ld0.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                x xVar = x.this;
                J viewLifecycleOwner = xVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                androidx.lifecycle.D a12 = androidx.lifecycle.K.a(viewLifecycleOwner);
                C10720e0 c10720e0 = C10720e0.f105451a;
                C10727i.c(a12, He.b.f10879b, null, new s(xVar, null), 2);
            }
        });
        a11.f14448G.setOnClickListener(new FK.a(this, 13));
        a11.f14459d.setOnClickListener(new Hv.a(5, this, a11));
        a11.f14462g.setOnClickListener(new FK.b(2, this, a11));
        a11.f14471p.setOnClickListener(new OD.a(this, 6));
        a11.f14452K.setOnClickListener(new Il.a(this, 13));
        a11.f14469n.setOnClickListener(new ViewOnClickListenerC7937f());
        a11.f14465j.setOnClickListener(new View.OnClickListener() { // from class: ld0.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                x xVar = x.this;
                C10727i.c(androidx.lifecycle.K.a(xVar), null, null, new y(xVar, null), 3);
            }
        });
        a11.f14468m.setOnClickListener(new DG.a(this, 10));
        a11.f14444C.setOnClickListener(new AI.a(this, 10));
        this.f73240a = a11;
    }
}
