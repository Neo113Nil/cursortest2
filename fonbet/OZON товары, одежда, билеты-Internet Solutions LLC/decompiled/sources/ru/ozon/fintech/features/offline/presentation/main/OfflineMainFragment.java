package ru.ozon.fintech.features.offline.presentation.main;

import Ae.x0;
import Dc0.m;
import H30.y;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.ScrollView;
import android.widget.Space;
import androidx.activity.C;
import androidx.activity.J;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.fragment.app.r;
import androidx.lifecycle.A0;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.K;
import androidx.lifecycle.y0;
import b70.C5575c;
import c70.InterfaceC5760b;
import f3.AbstractC6409a;
import g70.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.offline.presentation.main.OfflineMainFragment;
import ru.ozon.uni.android.atom.disclaimer.DisclaimerView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.disclaimer.DSDisclaimerHolderKt;
import xe.C10727i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/fintech/features/offline/presentation/main/OfflineMainFragment;", "LE30/c;", "<init>", "()V", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfflineMainFragment extends E30.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y0 f95663a;

    /* renamed from: b, reason: collision with root package name */
    private C5575c f95664b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private a f95665c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f95666d;

    public static final class a extends C {
        a() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            OfflineMainFragment.this.y().onBackPressed();
        }
    }

    public static final class b extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return OfflineMainFragment.this;
        }
    }

    public static final class c extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f95669b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f95669b = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f95669b.invoke();
        }
    }

    public static final class d extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95670b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95670b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f95670b.getValue()).getViewModelStore();
        }
    }

    public static final class e extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95671b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95671b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f95671b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public OfflineMainFragment() {
        B50.a aVar = new B50.a(this, 6);
        InterfaceC4008j a11 = k.a(n.NONE, new c(new b()));
        this.f95663a = b0.b(this, N.b(f.class), new d(a11), new e(a11), aVar);
        this.f95665c = new a();
        this.f95666d = "OfflineMainFragment";
    }

    public static void t(OfflineMainFragment offlineMainFragment) {
        offlineMainFragment.y().n0();
    }

    public static void u(OfflineMainFragment offlineMainFragment) {
        offlineMainFragment.y().k0();
    }

    public static WindowInsets v(OfflineMainFragment offlineMainFragment, View view, WindowInsets insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        C5575c c5575c = offlineMainFragment.f95664b;
        if (c5575c != null) {
            Space space = c5575c.f55592c;
            Intrinsics.checkNotNullParameter(space, "<this>");
            ScrollView scrollView = c5575c.f55601l;
            scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new y(scrollView, space, scrollView));
        }
        return view.onApplyWindowInsets(insets);
    }

    public static final void x(OfflineMainFragment offlineMainFragment, h70.a aVar) {
        C5575c c5575c = offlineMainFragment.f95664b;
        if (c5575c != null) {
            c5575c.f55602m.bindState(aVar.f());
        }
        C5575c c5575c2 = offlineMainFragment.f95664b;
        if (c5575c2 != null) {
            DSDisclaimerHolderKt.bind$default(c5575c2.f55596g, aVar.c().a(), null, 2, null);
        }
        C5575c c5575c3 = offlineMainFragment.f95664b;
        if (c5575c3 != null) {
            AppCompatTextView appCompatTextView = c5575c3.f55598i;
            aVar.getClass();
            appCompatTextView.setText("Доступно без интернета");
        }
        C5575c c5575c4 = offlineMainFragment.f95664b;
        if (c5575c4 != null) {
            c5575c4.f55597h.bindState(aVar.d());
        }
        C5575c c5575c5 = offlineMainFragment.f95664b;
        if (c5575c5 != null) {
            c5575c5.f55594e.c(aVar.e());
        }
        C5575c c5575c6 = offlineMainFragment.f95664b;
        if (c5575c6 != null) {
            c5575c6.f55593d.c(aVar.b());
        }
        C5575c c5575c7 = offlineMainFragment.f95664b;
        if (c5575c7 != null) {
            c5575c7.f55601l.setVisibility(0);
        }
        C5575c c5575c8 = offlineMainFragment.f95664b;
        if (c5575c8 != null) {
            c5575c8.f55595f.setVisibility(0);
        }
        C5575c c5575c9 = offlineMainFragment.f95664b;
        if (c5575c9 != null) {
            ButtonV3View buttonV3View = c5575c9.f55595f;
            aVar.a().getClass();
            ButtonV3HolderKt.bind$default(buttonV3View, new ButtonV3DTO(null, ButtonV3DTO.Sizes.SIZE_600, "Обновить", null, "ic_m_reload_filled", null, null, null, null, null, null, null, null, null, null, null, null, null, 262121, null), null, 2, null);
        }
        C5575c c5575c10 = offlineMainFragment.f95664b;
        if (c5575c10 != null) {
            c5575c10.f55595f.setOnClickListener(new m(offlineMainFragment, 10));
        }
        C5575c c5575c11 = offlineMainFragment.f95664b;
        if (c5575c11 != null) {
            DisclaimerView disclaimerView = c5575c11.f55596g;
            disclaimerView.setDisclaimerClickable(true);
            disclaimerView.setOnClickListener(new CD.a(offlineMainFragment, 5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f y() {
        return (f) this.f95663a.getValue();
    }

    @Override // E30.c
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public final String getF56706d() {
        return this.f95666d;
    }

    @Override // E30.c
    /* renamed from: isNeedSendOnCreateAnalytic */
    public final boolean getIsNeedSendOnCreateAnalytic() {
        return false;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((InterfaceC5760b) O30.a.a(O30.c.a(requireActivity)).a(U60.a.class)).K0(this);
        super.onAttach(context);
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            y().l0(getUniqueUuid());
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C5575c a11 = C5575c.a(inflater, viewGroup);
        this.f95664b = a11;
        ConstraintLayout root = a11.f55600k;
        Intrinsics.checkNotNullExpressionValue(root, "root");
        return root;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        this.f95665c.remove();
        this.f95664b = null;
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        androidx.lifecycle.J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner, this.f95665c);
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: g70.a
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                return OfflineMainFragment.v(OfflineMainFragment.this, view2, windowInsets);
            }
        });
        x0<h70.a> j02 = y().j0();
        androidx.lifecycle.J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new g70.b(this, j02, null, this), 3);
        y().m0();
    }
}
