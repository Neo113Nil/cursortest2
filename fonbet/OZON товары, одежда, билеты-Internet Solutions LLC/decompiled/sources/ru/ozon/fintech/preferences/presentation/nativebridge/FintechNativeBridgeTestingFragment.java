package ru.ozon.fintech.preferences.presentation.nativebridge;

import Ax.ViewOnClickListenerC2451a;
import Cw.ViewOnClickListenerC2787a;
import I0.C3173b;
import N3.C3660k;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import androidx.activity.C;
import androidx.activity.J;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.fragment.app.r;
import androidx.lifecycle.A0;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.y0;
import f3.AbstractC6409a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.preferences.presentation.nativebridge.FintechNativeBridgeTestingFragment;
import ru.ozon.fintech.preferences.ui.nativebridge.JsonCodeEditorView;
import ru.ozon.fintech.preferences.ui.nativebridge.StatusResultView;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;
import v90.j;
import xe.C10727i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/fintech/preferences/presentation/nativebridge/FintechNativeBridgeTestingFragment;", "LE30/b;", "<init>", "()V", "fintech-preferences_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FintechNativeBridgeTestingFragment extends E30.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f96844a = "FintechNativeBridgeTestingFragment";

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private a f96845b = new a();

    /* renamed from: c, reason: collision with root package name */
    private final boolean f96846c = true;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f96847d = true;

    /* renamed from: e, reason: collision with root package name */
    private final float f96848e = 0.6f;

    /* renamed from: f, reason: collision with root package name */
    private j f96849f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final y0 f96850g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayAdapter<String> f96851h;

    public static final class a extends C {
        a() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            FintechNativeBridgeTestingFragment.this.dismiss();
        }
    }

    public static final class b extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return FintechNativeBridgeTestingFragment.this;
        }
    }

    public static final class c extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f96854b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f96854b = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f96854b.invoke();
        }
    }

    public static final class d extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96855b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96855b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f96855b.getValue()).getViewModelStore();
        }
    }

    public static final class e extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96856b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96856b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f96856b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public static final class f implements AdapterView.OnItemSelectedListener {
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> parent, View view, int i11, long j11) {
            Intrinsics.checkNotNullParameter(parent, "parent");
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
        }
    }

    public FintechNativeBridgeTestingFragment() {
        D90.b bVar = new D90.b(this, 0);
        InterfaceC4008j a11 = k.a(n.NONE, new c(new b()));
        this.f96850g = b0.b(this, N.b(D90.j.class), new d(a11), new e(a11), bVar);
    }

    public static final D90.j A(FintechNativeBridgeTestingFragment fintechNativeBridgeTestingFragment) {
        return (D90.j) fintechNativeBridgeTestingFragment.f96850g.getValue();
    }

    public static final void D(FintechNativeBridgeTestingFragment fintechNativeBridgeTestingFragment) {
        Object selectedItem;
        j jVar = fintechNativeBridgeTestingFragment.f96849f;
        String obj = (jVar == null || (selectedItem = jVar.f102687i.getSelectedItem()) == null) ? null : selectedItem.toString();
        if (obj == null) {
            obj = "";
        }
        ArrayAdapter<String> arrayAdapter = fintechNativeBridgeTestingFragment.f96851h;
        if (arrayAdapter != null) {
            final D90.d dVar = new D90.d(obj);
            arrayAdapter.sort(new Comparator() { // from class: D90.e
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return ((Number) d.this.invoke(obj2, obj3)).intValue();
                }
            });
        }
    }

    private final String E() {
        Spinner spinner;
        Object selectedItem;
        String obj;
        EditText editText;
        j jVar;
        EditText editText2;
        Editable text;
        EditText editText3;
        j jVar2 = this.f96849f;
        if (jVar2 == null || (editText = jVar2.f102682d) == null || editText.getVisibility() != 0 || (jVar = this.f96849f) == null || (editText2 = jVar.f102682d) == null || (text = editText2.getText()) == null || !(!h.K(text))) {
            j jVar3 = this.f96849f;
            return (jVar3 == null || (spinner = jVar3.f102687i) == null || (selectedItem = spinner.getSelectedItem()) == null || (obj = selectedItem.toString()) == null) ? "" : obj;
        }
        j jVar4 = this.f96849f;
        return h.z0(String.valueOf((jVar4 == null || (editText3 = jVar4.f102682d) == null) ? null : editText3.getText())).toString();
    }

    private final String F() {
        Spinner spinner;
        Object selectedItem;
        String obj;
        EditText editText;
        j jVar;
        EditText editText2;
        Editable text;
        EditText editText3;
        j jVar2 = this.f96849f;
        if (jVar2 == null || (editText = jVar2.f102683e) == null || editText.getVisibility() != 0 || (jVar = this.f96849f) == null || (editText2 = jVar.f102683e) == null || (text = editText2.getText()) == null || !(!h.K(text))) {
            j jVar3 = this.f96849f;
            return (jVar3 == null || (spinner = jVar3.f102688j) == null || (selectedItem = spinner.getSelectedItem()) == null || (obj = selectedItem.toString()) == null) ? "" : obj;
        }
        j jVar4 = this.f96849f;
        return h.z0(String.valueOf((jVar4 == null || (editText3 = jVar4.f102683e) == null) ? null : editText3.getText())).toString();
    }

    private static void G(EditText editText, Spinner spinner) {
        if (editText != null) {
            editText.setVisibility(editText.getVisibility() == 0 ? 8 : 0);
        }
        if (spinner != null) {
            spinner.setVisibility(spinner.getVisibility() != 0 ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(String str) {
        Map<String, List<String>> g02 = ((D90.j) this.f96850g.getValue()).g0();
        if (g02 == null) {
            g02 = U.c();
        }
        List<String> list = g02.get(str);
        if (list == null) {
            list = K.f71697a;
        }
        j jVar = this.f96849f;
        if (jVar != null) {
            Spinner spinner = jVar.f102688j;
            ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), R.layout.simple_spinner_item, list);
            arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        }
        j jVar2 = this.f96849f;
        if (jVar2 != null) {
            jVar2.f102688j.setSelection(0);
        }
        j jVar3 = this.f96849f;
        if (jVar3 != null) {
            jVar3.f102688j.setOnItemSelectedListener(new f());
        }
    }

    public static void t(FintechNativeBridgeTestingFragment fintechNativeBridgeTestingFragment, String str) {
        L80.a.a(fintechNativeBridgeTestingFragment.f96844a, Nk.a.b("evaluateJavascript = ", str));
    }

    public static void u(FintechNativeBridgeTestingFragment fintechNativeBridgeTestingFragment) {
        j jVar = fintechNativeBridgeTestingFragment.f96849f;
        String d11 = jVar != null ? jVar.f102690l.d() : "";
        String E11 = fintechNativeBridgeTestingFragment.E();
        String F11 = fintechNativeBridgeTestingFragment.F();
        j jVar2 = fintechNativeBridgeTestingFragment.f96849f;
        String obj = jVar2 != null ? h.z0(jVar2.f102686h.e()).toString() : null;
        if (obj == null) {
            obj = "";
        }
        j jVar3 = fintechNativeBridgeTestingFragment.f96849f;
        Boolean valueOf = jVar3 != null ? Boolean.valueOf(jVar3.f102686h.d()) : null;
        Object systemService = fintechNativeBridgeTestingFragment.requireContext().getSystemService("clipboard");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("bridge_result", C3173b.c(C3660k.d("window.native_bridge.", E11, ".", F11, Intrinsics.d(valueOf, Boolean.TRUE) ? "_sync" : ""), "(", obj, ")\n\nResponse NativeBridge:\n", d11)));
        Toast.makeText(fintechNativeBridgeTestingFragment.requireContext(), fintechNativeBridgeTestingFragment.getString(ru.ozon.app.android.R.string.fintech_testing_nativebridge_copy_done), 0).show();
    }

    public static void v(FintechNativeBridgeTestingFragment fintechNativeBridgeTestingFragment) {
        j jVar = fintechNativeBridgeTestingFragment.f96849f;
        G(jVar != null ? jVar.f102683e : null, jVar != null ? jVar.f102688j : null);
    }

    public static void w(FintechNativeBridgeTestingFragment fintechNativeBridgeTestingFragment) {
        j jVar = fintechNativeBridgeTestingFragment.f96849f;
        G(jVar != null ? jVar.f102682d : null, jVar != null ? jVar.f102687i : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [D90.f] */
    public static void x(final FintechNativeBridgeTestingFragment fintechNativeBridgeTestingFragment) {
        j jVar;
        String E11 = fintechNativeBridgeTestingFragment.E();
        String F11 = fintechNativeBridgeTestingFragment.F();
        if (h.K(E11)) {
            Toast.makeText(fintechNativeBridgeTestingFragment.requireContext(), fintechNativeBridgeTestingFragment.getString(ru.ozon.app.android.R.string.fintech_testing_nativebridge_hint_group), 0).show();
            return;
        }
        if (h.K(F11)) {
            Toast.makeText(fintechNativeBridgeTestingFragment.requireContext(), fintechNativeBridgeTestingFragment.getString(ru.ozon.app.android.R.string.fintech_testing_nativebridge_hint_method), 0).show();
            return;
        }
        j jVar2 = fintechNativeBridgeTestingFragment.f96849f;
        String obj = jVar2 != null ? h.z0(jVar2.f102686h.e()).toString() : null;
        if (obj == null) {
            obj = "";
        }
        j jVar3 = fintechNativeBridgeTestingFragment.f96849f;
        Boolean valueOf = jVar3 != null ? Boolean.valueOf(jVar3.f102686h.d()) : null;
        j jVar4 = fintechNativeBridgeTestingFragment.f96849f;
        if (jVar4 != null) {
            jVar4.f102690l.g(StatusResultView.a.IN_PROGRESS);
        }
        j jVar5 = fintechNativeBridgeTestingFragment.f96849f;
        if (jVar5 != null && !jVar5.f102690l.e() && (jVar = fintechNativeBridgeTestingFragment.f96849f) != null) {
            jVar.f102690l.b();
        }
        ((D90.j) fintechNativeBridgeTestingFragment.f96850g.getValue()).f0(obj, E11, F11, valueOf, new ValueCallback() { // from class: D90.f
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj2) {
                FintechNativeBridgeTestingFragment.t(FintechNativeBridgeTestingFragment.this, (String) obj2);
            }
        });
    }

    @Override // E30.b
    public final float getDimAmount() {
        return this.f96848e;
    }

    @Override // E30.b
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public final String getF95405a() {
        return this.f96844a;
    }

    @Override // E30.b
    /* renamed from: getLightStatusBar, reason: from getter */
    public final boolean getF95411g() {
        return this.f96846c;
    }

    @Override // E30.b
    @NotNull
    public final C getOnBackPressedCallback() {
        return this.f96845b;
    }

    @Override // E30.b
    /* renamed from: isStandaloneIntegration, reason: from getter */
    public final boolean getF96847d() {
        return this.f96847d;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((w90.b) O30.a.a(O30.c.a(requireActivity)).a(w90.b.class)).A0(this);
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, ru.ozon.app.android.R.style.Base_Ozon_FullScreenDialog);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        j b11 = j.b(inflater, viewGroup);
        this.f96849f = b11;
        ConstraintLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        j jVar = this.f96849f;
        if (jVar != null) {
            jVar.f102686h.c();
        }
        j jVar2 = this.f96849f;
        if (jVar2 != null) {
            jVar2.f102690l.c();
        }
        this.f96849f = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        androidx.lifecycle.J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner, this.f96845b);
        FinToolbarState finToolbarState = new FinToolbarState(getString(ru.ozon.app.android.R.string.fintech_testing_nativebridge_nativebridge_test_title), null, null, null, null, null, null, null, null, Integer.valueOf(ru.ozon.app.android.R.drawable.ic_m_disclosure_back_filled), "graphicTertiary", new D90.a(this, 0), null, null, null, null, 17, 61950, null);
        j jVar = this.f96849f;
        if (jVar != null) {
            jVar.f102691m.bindState(finToolbarState);
        }
        Map<String, List<String>> g02 = ((D90.j) this.f96850g.getValue()).g0();
        if (g02 == null) {
            g02 = U.c();
        }
        ArrayList W02 = C7714v.W0(C7714v.H0(g02.keySet()));
        ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), R.layout.simple_spinner_item, W02);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        j jVar2 = this.f96849f;
        if (jVar2 != null) {
            jVar2.f102687i.setAdapter((SpinnerAdapter) arrayAdapter);
        }
        String str = (String) C7714v.M(W02);
        if (str == null) {
            str = "";
        }
        H(str);
        j jVar3 = this.f96849f;
        if (jVar3 != null) {
            jVar3.f102687i.setSelection(0);
        }
        j jVar4 = this.f96849f;
        if (jVar4 != null) {
            jVar4.f102687i.setOnItemSelectedListener(new ru.ozon.fintech.preferences.presentation.nativebridge.c(this, W02));
        }
        j jVar5 = this.f96849f;
        if (jVar5 != null) {
            jVar5.f102680b.setOnClickListener(new ViewOnClickListenerC2787a(this, 1));
        }
        j jVar6 = this.f96849f;
        if (jVar6 != null) {
            jVar6.f102681c.setOnClickListener(new Cw.b(this, 1));
        }
        j jVar7 = this.f96849f;
        if (jVar7 != null) {
            jVar7.f102685g.setOnClickListener(new ViewOnClickListenerC2451a(this, 2));
        }
        j jVar8 = this.f96849f;
        if (jVar8 != null) {
            jVar8.f102684f.setOnClickListener(new D90.c(this, 0));
        }
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new ru.ozon.fintech.preferences.presentation.nativebridge.a(this, null), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new ru.ozon.fintech.preferences.presentation.nativebridge.b(this, null), 3);
        j jVar9 = this.f96849f;
        if (jVar9 != null) {
            JsonCodeEditorView jsonEditorView = jVar9.f102686h;
            Intrinsics.checkNotNullExpressionValue(jsonEditorView, "jsonEditorView");
            androidx.lifecycle.J viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            jsonEditorView.g(androidx.lifecycle.K.a(viewLifecycleOwner2));
            if (jsonEditorView.e().length() > 0) {
                jsonEditorView.f();
            }
        }
    }
}
