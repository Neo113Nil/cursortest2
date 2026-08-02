package ob0;

import B90.C2603e;
import Fb0.f;
import Jb0.C3388f;
import Kb0.K;
import Sc.InterfaceC4008j;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.activity.J;
import androidx.activity.L;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.host.config.external.AppId;
import spay.sdk.api.ErrorCode;
import vb0.C10294a;
import vb0.C10295b;
import za0.InterfaceC11014a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lob0/q;", "Landroidx/fragment/app/m;", "<init>", "()V", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    private C3388f f77974a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f77975b;

    /* renamed from: c, reason: collision with root package name */
    private C10295b f77976c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f77977d;

    static final class a extends AbstractC7737t implements Function1<androidx.activity.C, Unit> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(androidx.activity.C c11) {
            androidx.activity.C addCallback = c11;
            Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
            q.u(q.this).e();
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function0<Boolean> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            AppId m11;
            K k11 = Tb0.a.f26975d;
            if (k11 == null) {
                throw new Lb0.a();
            }
            InterfaceC11014a interfaceC11014a = (InterfaceC11014a) k11.G().d(InterfaceC11014a.class);
            boolean d11 = Intrinsics.d((interfaceC11014a == null || (m11 = interfaceC11014a.m()) == null) ? null : m11.getAppName(), f.a.SELECT_APP.a());
            boolean z11 = false;
            boolean z12 = q.this.requireArguments().getBoolean("is_from_auth_flow", false);
            if (d11 && !z12) {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    public q() {
        K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        this.f77975b = k11.l().n();
        this.f77977d = Sc.k.b(new b());
    }

    public static void t(q qVar) {
        ((C8685A) qVar.f77975b.getValue()).getClass();
        C8685A.f();
    }

    public static final C8685A u(q qVar) {
        return (C8685A) qVar.f77975b.getValue();
    }

    private final boolean v() {
        return ((Boolean) this.f77977d.getValue()).booleanValue();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C3388f b11 = C3388f.b(inflater.cloneInContext(new androidx.appcompat.view.d(requireContext(), v() ? R.style.OzonIdSelectTheme : R.style.OzonIdTheme)), viewGroup);
        this.f77974a = b11;
        return b11.a();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        if (v()) {
            C10295b c10295b = this.f77976c;
            if (c10295b != null) {
                c10295b.f();
            }
            this.f77976c = null;
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        J onBackPressedDispatcher;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        boolean v11 = v();
        int i11 = R.color.layer_floor_1;
        if (v11) {
            Window window = requireActivity().getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            C10295b c10295b = new C10295b(window);
            c10295b.g(C10295b.EnumC2227b.STATUS, requireContext().getColor(R.color.bg_dark_key));
            c10295b.g(C10295b.EnumC2227b.NAVIGATION, requireContext().getColor(R.color.layer_floor_1));
            this.f77976c = c10295b;
        }
        C3388f c3388f = this.f77974a;
        Intrinsics.f(c3388f);
        Bundle requireArguments = requireArguments();
        Intrinsics.checkNotNullExpressionValue(requireArguments, "requireArguments(...)");
        boolean z11 = requireArguments.getBoolean("show_close_button", true);
        String string = requireArguments.getString("incident_id", ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        c3388f.f14413b.e(new C10294a(string, v(), requireArguments.getString("support_url", null), requireArguments.getString("error_text", null), z11, requireArguments.getString("antibot_flow_result_code"), new m(this), new o(this), new p(this)));
        if (!v()) {
            i11 = R.color.layer_floor_0;
        }
        C3388f c3388f2 = this.f77974a;
        Intrinsics.f(c3388f2);
        c3388f2.f14415d.setBackgroundResource(i11);
        C3388f c3388f3 = this.f77974a;
        Intrinsics.f(c3388f3);
        c3388f3.a().setOnRefreshListener(new C2603e(this));
        androidx.fragment.app.r activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            L.a(onBackPressedDispatcher, null, new a(), 3);
        }
        K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        Function1<FrameLayout, Unit> antibotFrameForHostProvider = k11.N().getAntibotFrameForHostProvider();
        if (antibotFrameForHostProvider != null) {
            C3388f c3388f4 = this.f77974a;
            Intrinsics.f(c3388f4);
            FrameLayout hostContainer = c3388f4.f14414c;
            Intrinsics.checkNotNullExpressionValue(hostContainer, "hostContainer");
            antibotFrameForHostProvider.invoke(hostContainer);
        }
    }
}
