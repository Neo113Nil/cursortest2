package ru.ozon.fintech.preferences.presentation.develop;

import B90.A;
import B90.B;
import B90.C;
import B90.C2600b;
import B90.C2601c;
import B90.C2602d;
import B90.C2603e;
import B90.C2604f;
import B90.C2605g;
import B90.C2606h;
import B90.C2607i;
import B90.C2608j;
import B90.C2609k;
import B90.C2611m;
import B90.C2612n;
import B90.C2613o;
import B90.C2614p;
import B90.C2615q;
import B90.C2616s;
import B90.C2617t;
import B90.C2618u;
import B90.C2619v;
import B90.C2620w;
import B90.C2621x;
import B90.C2622y;
import B90.C2623z;
import B90.D;
import B90.E;
import B90.F;
import B90.G;
import B90.H;
import B90.I;
import B90.J;
import B90.K;
import B90.L;
import B90.M;
import B90.O;
import B90.P;
import B90.Q;
import B90.RunnableC2599a;
import B90.RunnableC2610l;
import B90.S;
import B90.T;
import B90.U;
import B90.V;
import B90.W;
import B90.X;
import B90.Y;
import B90.Z;
import B90.a0;
import B90.v0;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.fragment.app.r;
import androidx.lifecycle.A0;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.g;
import f3.AbstractC6409a;
import h3.C6788a;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/fintech/preferences/presentation/develop/FintechPreferencesFragment;", "Landroidx/preference/c;", "<init>", "()V", "fintech-preferences_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FintechPreferencesFragment extends androidx.preference.c {

    /* renamed from: i, reason: collision with root package name */
    public z0.b f96744i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final y0 f96745j;

    /* renamed from: k, reason: collision with root package name */
    private Preference f96746k;

    public static final class a extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return FintechPreferencesFragment.this;
        }
    }

    public static final class b extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f96748b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.f96748b = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f96748b.invoke();
        }
    }

    public static final class c extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96749b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96749b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f96749b.getValue()).getViewModelStore();
        }
    }

    public static final class d extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96750b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96750b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f96750b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public FintechPreferencesFragment() {
        C2620w c2620w = new C2620w(this, 0);
        InterfaceC4008j a11 = k.a(n.NONE, new b(new a()));
        this.f96745j = b0.b(this, N.b(v0.class), new c(a11), new d(a11), c2620w);
        O30.b bVar = O30.b.FINANCE;
    }

    public static void A(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().w1();
    }

    public static void B(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().W0();
    }

    public static void C(FintechPreferencesFragment fintechPreferencesFragment) {
        Toast.makeText(fintechPreferencesFragment.requireContext().getApplicationContext(), "Mesh header очищен, рестартани апп", 0).show();
        fintechPreferencesFragment.y0();
        fintechPreferencesFragment.x0().G0();
        View view = fintechPreferencesFragment.getView();
        if (view != null) {
            view.postDelayed(new RunnableC2599a(fintechPreferencesFragment, 0), 300L);
        }
    }

    public static void D(FintechPreferencesFragment fintechPreferencesFragment) {
        v0 x02 = fintechPreferencesFragment.x0();
        r activity = fintechPreferencesFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
        x02.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        C10727i.c(x0.a(x02), null, null, new ru.ozon.fintech.preferences.presentation.develop.d(x02, activity, null), 3);
    }

    public static void E(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().t1();
    }

    public static void F(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().S0();
    }

    public static void G(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().k1();
    }

    public static void H(FintechPreferencesFragment fintechPreferencesFragment) {
        v0 x02 = fintechPreferencesFragment.x0();
        x02.getClass();
        C6788a a11 = x0.a(x02);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, He.b.f10879b, null, new ru.ozon.fintech.preferences.presentation.develop.b(x02, null), 2);
    }

    public static void I(FintechPreferencesFragment fintechPreferencesFragment) {
        v0 x02 = fintechPreferencesFragment.x0();
        x02.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        C6788a a11 = x0.a(x02);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, He.b.f10879b, null, new ru.ozon.fintech.preferences.presentation.develop.c(x02, currentTimeMillis, null), 2);
    }

    public static void J(FintechPreferencesFragment fintechPreferencesFragment) {
        Preference e11 = fintechPreferencesFragment.e("fintech_ab_variants_header_final");
        if (e11 != null) {
            e11.f0(fintechPreferencesFragment.x0().O0());
        }
    }

    public static void K(FintechPreferencesFragment fintechPreferencesFragment, Preference preference, Serializable serializable) {
        String obj = serializable.toString();
        fintechPreferencesFragment.x0().s1(obj);
        preference.f0(obj);
        Toast.makeText(fintechPreferencesFragment.requireContext().getApplicationContext(), "x-o3-ob-testing-auth-ttl обновлён, рестартани апп", 0).show();
        fintechPreferencesFragment.y0();
    }

    public static void L(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().p1();
    }

    public static void M(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.y0();
    }

    public static void N(FintechPreferencesFragment fintechPreferencesFragment) {
        EditTextPreference editTextPreference = (EditTextPreference) fintechPreferencesFragment.e("fintech_session_duration_set");
        if (editTextPreference != null) {
            editTextPreference.f0(fintechPreferencesFragment.x0().T0());
        }
    }

    public static void O(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().e1();
    }

    public static void P(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().n1();
    }

    public static void Q(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().d1();
    }

    public static void R(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().x1();
    }

    public static void S(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().X0();
    }

    public static void T(FintechPreferencesFragment fintechPreferencesFragment) {
        Preference e11 = fintechPreferencesFragment.e("fintech_internal_header_token_final_key");
        if (e11 != null) {
            e11.f0(fintechPreferencesFragment.x0().Q0());
        }
    }

    public static void U(FintechPreferencesFragment fintechPreferencesFragment) {
        Toast.makeText(fintechPreferencesFragment.requireContext().getApplicationContext(), "Token header очищен, рестартани апп", 0).show();
        fintechPreferencesFragment.y0();
        fintechPreferencesFragment.x0().J0();
        View view = fintechPreferencesFragment.getView();
        if (view != null) {
            view.postDelayed(new W(fintechPreferencesFragment, 0), 300L);
        }
    }

    public static void V(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().u1();
    }

    public static void W(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().g1();
    }

    public static void X(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().a1();
    }

    public static void Y(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().m1();
    }

    public static void Z(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().o1();
    }

    public static void a0(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().q1();
    }

    public static void b0(FintechPreferencesFragment fintechPreferencesFragment) {
        View view = fintechPreferencesFragment.getView();
        if (view != null) {
            view.postDelayed(new RunnableC2599a(fintechPreferencesFragment, 0), 300L);
        }
        fintechPreferencesFragment.y0();
    }

    public static void c0(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().Y0();
    }

    public static void d0(FintechPreferencesFragment fintechPreferencesFragment) {
        Toast.makeText(fintechPreferencesFragment.requireContext().getApplicationContext(), "Дефолтный конфиг переключен, рестартани апп", 0).show();
        fintechPreferencesFragment.y0();
    }

    public static void e0(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().U0();
    }

    public static void f0(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().f1();
    }

    public static void g0(FintechPreferencesFragment fintechPreferencesFragment) {
        v0 x02 = fintechPreferencesFragment.x0();
        x02.getClass();
        C10727i.c(x0.a(x02), null, null, new e(x02, null), 3);
    }

    public static void h0(FintechPreferencesFragment fintechPreferencesFragment) {
        v0 x02 = fintechPreferencesFragment.x0();
        x02.getClass();
        C6788a a11 = x0.a(x02);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, He.b.f10879b, null, new ru.ozon.fintech.preferences.presentation.develop.a(x02, null), 2);
    }

    public static void i0(FintechPreferencesFragment fintechPreferencesFragment) {
        Preference e11 = fintechPreferencesFragment.e("fintech_mesh_header_final_key");
        if (e11 != null) {
            e11.f0(fintechPreferencesFragment.x0().R0());
        }
    }

    public static void j0(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().y1();
    }

    public static void k0(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().v1();
    }

    public static void l0(FintechPreferencesFragment fintechPreferencesFragment, EditTextPreference editTextPreference) {
        fintechPreferencesFragment.x0().I0();
        if (editTextPreference != null) {
            editTextPreference.r0("");
        }
        if (editTextPreference != null) {
            editTextPreference.f0(null);
        }
        Toast.makeText(fintechPreferencesFragment.requireContext().getApplicationContext(), "x-o3-ob-testing-auth-ttl очищен, рестартани апп", 0).show();
        fintechPreferencesFragment.y0();
    }

    public static void m0(FintechPreferencesFragment fintechPreferencesFragment) {
        String f7 = P60.c.ALFA_BANK.f();
        if (f7 == null) {
            Toast.makeText(fintechPreferencesFragment.requireContext().getApplicationContext(), "Нет пакета приложения", 0).show();
        } else {
            fintechPreferencesFragment.x0().l1(f7);
        }
    }

    public static void n0(FintechPreferencesFragment fintechPreferencesFragment) {
        Toast.makeText(fintechPreferencesFragment.requireContext().getApplicationContext(), fintechPreferencesFragment.x0().N0() ? "Сессия истекла" : "Не удалось сделать сессию истекшей", 0).show();
    }

    public static void o0(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().M0();
    }

    public static void p0(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().c1();
    }

    public static void q0(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().b1();
    }

    public static void r0(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().A1();
    }

    public static void s0(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().V0();
    }

    public static void t0(FintechPreferencesFragment fintechPreferencesFragment) {
        Toast.makeText(fintechPreferencesFragment.requireContext().getApplicationContext(), "AB-Variants header очищен, рестартани апп", 0).show();
        fintechPreferencesFragment.y0();
        fintechPreferencesFragment.x0().F0();
        View view = fintechPreferencesFragment.getView();
        if (view != null) {
            view.postDelayed(new RunnableC2610l(fintechPreferencesFragment, 0), 300L);
        }
    }

    public static void u0(FintechPreferencesFragment fintechPreferencesFragment) {
        Toast.makeText(fintechPreferencesFragment.requireContext().getApplicationContext(), "Флаг очищен", 0).show();
        fintechPreferencesFragment.x0().H0();
    }

    public static void v0(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().z1();
    }

    public static void w0(FintechPreferencesFragment fintechPreferencesFragment, Serializable serializable) {
        v0 x02 = fintechPreferencesFragment.x0();
        Intrinsics.g(serializable, "null cannot be cast to non-null type kotlin.Boolean");
        x02.E0(((Boolean) serializable).booleanValue());
    }

    public static void x(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.x0().Z0();
    }

    private final v0 x0() {
        return (v0) this.f96745j.getValue();
    }

    public static void y(FintechPreferencesFragment fintechPreferencesFragment) {
        View view = fintechPreferencesFragment.getView();
        if (view != null) {
            view.postDelayed(new RunnableC2610l(fintechPreferencesFragment, 0), 300L);
        }
        fintechPreferencesFragment.y0();
    }

    private final void y0() {
        Preference preference = this.f96746k;
        if (preference != null) {
            preference.Y(R.drawable.fintech_preference_ic_fiber_manual_record_24);
        } else {
            Intrinsics.n("reloadApp");
            throw null;
        }
    }

    public static void z(FintechPreferencesFragment fintechPreferencesFragment) {
        View view = fintechPreferencesFragment.getView();
        if (view != null) {
            view.postDelayed(new W(fintechPreferencesFragment, 0), 300L);
        }
        fintechPreferencesFragment.y0();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("FINTECH_ACTIVITY_LIB_TYPE_KEY", "") : null;
        Intrinsics.f(string);
        ((w90.b) O30.a.a(O30.b.valueOf(string)).a(w90.b.class)).L0(this);
        x0().r1(new WeakReference<>(requireActivity()));
        super.onAttach(context);
    }

    @Override // androidx.preference.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        x0().getClass();
    }

    @Override // androidx.preference.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        view.setFitsSystemWindows(true);
        View view2 = getView();
        if (view2 != null) {
            view2.postDelayed(new RunnableC2599a(this, 0), 300L);
        }
        View view3 = getView();
        if (view3 != null) {
            view3.postDelayed(new W(this, 0), 300L);
        }
        View view4 = getView();
        if (view4 != null) {
            view4.postDelayed(new RunnableC2610l(this, 0), 300L);
        }
        View view5 = getView();
        if (view5 != null) {
            view5.postDelayed(new V(this, 0), 300L);
        }
    }

    @Override // androidx.preference.c
    public final void v(String str) {
        v0 x02 = x0();
        g u11 = u();
        Intrinsics.checkNotNullExpressionValue(u11, "getPreferenceManager(...)");
        x02.K0(u11);
        w(str);
        Preference e11 = e("fintech_reload_app");
        Intrinsics.f(e11);
        this.f96746k = e11;
        G g10 = new G(this);
        EditTextPreference editTextPreference = (EditTextPreference) e("fintech_mesh_header");
        if (editTextPreference != null) {
            editTextPreference.c0(new C2604f(this));
        }
        Preference e12 = e("fintech_clear_mesh_header");
        if (e12 != null) {
            e12.d0(new B90.r(this));
        }
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) e("fintech_is_autotests_header_key");
        if (switchPreferenceCompat != null) {
            switchPreferenceCompat.c0(new D(this));
        }
        Preference e13 = e("fintech_testing_features_v1_edit");
        if (e13 != null) {
            e13.d0(new L(this));
        }
        Preference e14 = e("fintech_native_bridge_testing");
        if (e14 != null) {
            e14.d0(new P(this));
        }
        Preference e15 = e("fintech_testing_features_v2_edit");
        if (e15 != null) {
            e15.d0(new Q(this, 0));
        }
        Preference e16 = e("fintech_tracker_logs");
        if (e16 != null) {
            e16.d0(new S(this));
        }
        EditTextPreference editTextPreference2 = (EditTextPreference) e("fintech_session_duration_set");
        if (editTextPreference2 != null) {
            editTextPreference2.c0(new T(this));
        }
        Preference e17 = e("fintech_session_duration_clear");
        if (e17 != null) {
            e17.d0(new U(this, editTextPreference2));
        }
        EditTextPreference editTextPreference3 = (EditTextPreference) e(requireContext().getString(R.string.fintech_internal_header_token_key));
        if (editTextPreference3 != null) {
            editTextPreference3.c0(new O(this));
        }
        EditTextPreference editTextPreference4 = (EditTextPreference) e("fintech_ab_variants_header");
        if (editTextPreference4 != null) {
            editTextPreference4.c0(new X(this));
        }
        Preference e18 = e(ExternalFintechSettings.OZON_SP_SERVER_KEY);
        if (e18 != null) {
            e18.c0(g10);
        }
        Preference e19 = e(ExternalFintechSettings.OZON_SP_SERVER_LOCALHOST);
        if (e19 != null) {
            e19.c0(g10);
        }
        Preference e21 = e(ExternalFintechSettings.FORCE_WEB_BANK_SERVER_FROM_SP);
        if (e21 != null) {
            e21.c0(g10);
        }
        Preference e22 = e("fintech_native_camera");
        if (e22 != null) {
            e22.c0(g10);
        }
        Preference e23 = e("fintech_native_chat");
        if (e23 != null) {
            e23.c0(g10);
        }
        Preference e24 = e("fintech_is_standalone");
        if (e24 != null) {
            e24.f0(String.valueOf(x0().i1()));
        }
        Preference e25 = e("fintech_copy_firebase_token");
        if (e25 != null) {
            e25.d0(new Y(this));
        }
        Preference e26 = e("fintech_copy_device_uuid");
        if (e26 != null) {
            e26.d0(new Z(this, 0));
        }
        Preference e27 = e("fintech_copy_device_adid");
        if (e27 != null) {
            e27.d0(new a0(this, 0));
        }
        Preference e28 = e("fintech_test_notification_ozonbank");
        if (e28 != null) {
            e28.d0(new B90.b0(this, 0));
        }
        Preference e29 = e("fintech_test_notification_https");
        if (e29 != null) {
            e29.d0(new C2600b(this));
        }
        Preference e31 = e("fintech_test_notification_otp");
        if (e31 != null) {
            e31.d0(new C2601c(this));
        }
        Preference e32 = e("fintech_nav_camera");
        if (e32 != null) {
            e32.d0(new C2602d(this));
        }
        Preference e33 = e("fintech_get_installed_bank_apps");
        if (e33 != null) {
            e33.d0(new C2603e(this));
        }
        Preference e34 = e("fintech_open_installed_bank_app");
        if (e34 != null) {
            e34.d0(new C2605g(this));
        }
        Preference e35 = e("fintech_start_audio_record");
        if (e35 != null) {
            e35.d0(new C2606h(this, 0));
        }
        Preference e36 = e("fintech_stop_audio_record");
        if (e36 != null) {
            e36.d0(new C2607i(this, 0));
        }
        Preference e37 = e("fintech_ozon_id_logout");
        if (e37 != null) {
            e37.d0(new C2608j(this));
        }
        Preference e38 = e("fintech_expire_session");
        if (e38 != null) {
            e38.d0(new C2609k(this));
        }
        Preference e39 = e("fintech_nav_goto_ozon_id");
        if (e39 != null) {
            e39.d0(new C2611m(this));
        }
        Preference e41 = e("fintech_nav_goto_theme");
        if (e41 != null) {
            e41.d0(new C2612n(this));
        }
        Preference e42 = e("fintech_nav_goto_hard_update");
        if (e42 != null) {
            e42.d0(new C2613o(this, 0));
        }
        Preference e43 = e("fintech_nav_goto_soft_update");
        if (e43 != null) {
            e43.d0(new C2614p(this));
        }
        Preference e44 = e("fintech_nav_goto_pin_pad");
        if (e44 != null) {
            e44.d0(new C2615q(this, 0));
        }
        SwitchPreferenceCompat switchPreferenceCompat2 = (SwitchPreferenceCompat) e("fintech_other_logger");
        if (switchPreferenceCompat2 != null) {
            L80.a.h(switchPreferenceCompat2.k0());
            switchPreferenceCompat2.c0(new C2616s());
        }
        Preference preference = this.f96746k;
        if (preference == null) {
            Intrinsics.n("reloadApp");
            throw null;
        }
        preference.d0(new C2617t(this));
        Preference e45 = e("fintech_crash_app");
        if (e45 != null) {
            e45.d0(new C2618u(0));
        }
        Preference e46 = e("fintech_anr_app");
        if (e46 != null) {
            e46.d0(new C2619v());
        }
        Preference e47 = e("fintech_view_logs");
        if (e47 != null) {
            e47.d0(new C2621x(this));
        }
        Preference e48 = e("fintech_qr_settings");
        if (e48 != null) {
            e48.d0(new C2622y(this));
        }
        Preference e49 = e("fintech_operation_info");
        if (e49 != null) {
            e49.d0(new C2623z(this));
        }
        Preference e51 = e("fintech_cbottom");
        if (e51 != null) {
            e51.d0(new A(this));
        }
        Preference e52 = e("fintech_photo");
        if (e52 != null) {
            e52.d0(new B(this));
        }
        Preference e53 = e("fintech_stories");
        if (e53 != null) {
            e53.d0(new C(this));
        }
        Preference e54 = e("fintech_onboarding");
        if (e54 != null) {
            e54.d0(new An.b(this));
        }
        Preference e55 = e("fintech_photo_64");
        if (e55 != null) {
            e55.d0(new E(this, 0));
        }
        Preference e56 = e("demo_recycli");
        if (e56 != null) {
            e56.d0(new F(this, 0));
        }
        Preference e57 = e("fintech_share_file_settings");
        if (e57 != null) {
            e57.d0(new H(this));
        }
        Preference e58 = e("fintech_send_graylog");
        if (e58 != null) {
            e58.d0(new I(this, 0));
        }
        Preference e59 = e("fintech_view_antifraud");
        if (e59 != null) {
            e59.d0(new AW.c(this));
        }
        Preference e61 = e("fintech_clear_header_token");
        if (e61 != null) {
            e61.d0(new AW.d(this));
        }
        Preference e62 = e("fintech_clear_ab_variants_header");
        if (e62 != null) {
            e62.d0(new J(this));
        }
        Preference e63 = e("fintech_clear_saved_notifications");
        if (e63 != null) {
            e63.d0(new K(this));
        }
        SwitchPreferenceCompat switchPreferenceCompat3 = (SwitchPreferenceCompat) e("ultra_state");
        if (switchPreferenceCompat3 != null) {
            switchPreferenceCompat3.l0(x0().j1());
            switchPreferenceCompat3.W(x0().h1());
            switchPreferenceCompat3.c0(new B2.b(this));
        }
        Preference e64 = e("input_playground");
        if (e64 != null) {
            e64.d0(new M(this, 0));
        }
        Preference e65 = e("fintech_cbdc_mfe_script");
        if (e65 != null) {
            e65.d0(new B90.N(this));
        }
    }
}
