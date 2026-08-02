package zi;

import Ai.C2431a;
import Ai.C2432b;
import Ai.InterfaceC2433c;
import Qi.C3878b;
import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3967k;
import S0.n1;
import Sc.InterfaceC4008j;
import a1.C4912a;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.lifecycle.z0;
import g.AbstractC6592d;
import h.C6762h;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xi.C10779a;
import zi.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzi/b;", "Landroidx/fragment/app/m;", "<init>", "()V", "ozon-gallery_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: zi.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C11125b extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    public Ti.i f109067a;

    /* renamed from: b, reason: collision with root package name */
    public Oi.b f109068b;

    /* renamed from: c, reason: collision with root package name */
    public C3878b f109069c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f109070d = Sc.k.a(Sc.n.NONE, new c());

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C3991w0 f109071e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f109072f;

    /* renamed from: g, reason: collision with root package name */
    private m f109073g;

    /* renamed from: h, reason: collision with root package name */
    private yi.k f109074h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final AbstractC6592d<String[]> f109075i;

    /* renamed from: zi.b$a */
    public static final class a implements z0.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ yi.k f109076a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C11125b f109077b;

        a(yi.k kVar, C11125b c11125b) {
            this.f109076a = kVar;
            this.f109077b = c11125b;
        }

        @Override // androidx.lifecycle.z0.b
        public final <T extends w0> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Oi.b bVar = this.f109077b.f109068b;
            if (bVar != null) {
                return new m(this.f109076a, bVar);
            }
            Intrinsics.n("ozFileManager");
            throw null;
        }
    }

    /* renamed from: zi.b$b, reason: collision with other inner class name */
    static final class C2352b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
        C2352b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                C11125b c11125b = C11125b.this;
                InterfaceC2433c u11 = C11125b.u(c11125b);
                if (Intrinsics.d(u11, InterfaceC2433c.a.f1231a)) {
                    interfaceC3967k2.o(932215188);
                    C5185h.a(a0.d(androidx.compose.ui.e.f40358c0), interfaceC3967k2, 6);
                    interfaceC3967k2.k();
                } else if (Intrinsics.d(u11, InterfaceC2433c.C0039c.f1236a)) {
                    interfaceC3967k2.o(932366034);
                    m mVar = c11125b.f109073g;
                    if (mVar == null) {
                        Intrinsics.n("viewModel");
                        throw null;
                    }
                    C3878b c3878b = c11125b.f109069c;
                    if (c3878b == null) {
                        Intrinsics.n("logger");
                        throw null;
                    }
                    interfaceC3967k2.o(445723524);
                    boolean F11 = interfaceC3967k2.F(c11125b);
                    Object C11 = interfaceC3967k2.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new C11126c(c11125b);
                        interfaceC3967k2.x(C11);
                    }
                    Function0 function0 = (Function0) C11;
                    interfaceC3967k2.k();
                    interfaceC3967k2.o(445726269);
                    boolean F12 = interfaceC3967k2.F(c11125b);
                    Object C12 = interfaceC3967k2.C();
                    if (F12 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new C11127d(c11125b);
                        interfaceC3967k2.x(C12);
                    }
                    interfaceC3967k2.k();
                    C11130g.c(mVar, c3878b, function0, (Function2) C12, interfaceC3967k2, 0);
                    interfaceC3967k2.k();
                } else {
                    if (!(u11 instanceof InterfaceC2433c.b)) {
                        throw U7.l.c(interfaceC3967k2, 445711711);
                    }
                    interfaceC3967k2.o(932793896);
                    androidx.fragment.app.r activity = c11125b.getActivity();
                    if (activity != null) {
                        Ti.i w11 = c11125b.w();
                        interfaceC3967k2.o(-917729345);
                        boolean F13 = interfaceC3967k2.F(c11125b);
                        Object C13 = interfaceC3967k2.C();
                        if (F13 || C13 == InterfaceC3967k.a.a()) {
                            C13 = new C11128e(c11125b);
                            interfaceC3967k2.x(C13);
                        }
                        interfaceC3967k2.k();
                        w11.f(activity, (Function0) C13);
                        Unit unit = Unit.f71690a;
                    }
                    interfaceC3967k2.k();
                }
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: zi.b$c */
    static final class c extends AbstractC7737t implements Function0<C10779a> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10779a invoke() {
            Object parcelable;
            int i11 = Build.VERSION.SDK_INT;
            C11125b c11125b = C11125b.this;
            if (i11 < 33) {
                Bundle arguments = c11125b.getArguments();
                if (arguments != null) {
                    return (C10779a) arguments.getParcelable("CAMERA_PAGE_CONFIG_ARG");
                }
                return null;
            }
            Bundle arguments2 = c11125b.getArguments();
            if (arguments2 == null) {
                return null;
            }
            parcelable = arguments2.getParcelable("CAMERA_PAGE_CONFIG_ARG", C10779a.class);
            return (C10779a) parcelable;
        }
    }

    /* renamed from: zi.b$d */
    static final class d extends AbstractC7737t implements Function0<C2431a> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f109080b = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final C2431a invoke() {
            return new C2431a(true, true, true);
        }
    }

    public C11125b() {
        C3991w0 f7;
        f7 = n1.f(InterfaceC2433c.a.f1231a, D1.f25195a);
        this.f109071e = f7;
        this.f109072f = Sc.k.b(d.f109080b);
        AbstractC6592d<String[]> registerForActivityResult = registerForActivityResult(new C6762h(), new ru.ozon.android.messenger.framework.presentation.chatdetail.c(this, 1));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f109075i = registerForActivityResult;
    }

    public static void t(C11125b c11125b) {
        boolean z11;
        boolean z12;
        Context requireContext = c11125b.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        androidx.fragment.app.r requireActivity = c11125b.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        InterfaceC4008j interfaceC4008j = c11125b.f109072f;
        ArrayList a11 = C2432b.a(requireContext, C2432b.b(requireContext, (C2431a) interfaceC4008j.getValue()));
        boolean isEmpty = a11.isEmpty();
        C3991w0 c3991w0 = c11125b.f109071e;
        if (isEmpty) {
            c3991w0.setValue(InterfaceC2433c.C0039c.f1236a);
            return;
        }
        if (!a11.isEmpty()) {
            Iterator it = a11.iterator();
            while (it.hasNext()) {
                if (androidx.core.app.b.h(requireActivity, (String) it.next())) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        boolean contains = a11.contains("android.permission.CAMERA");
        boolean contains2 = a11.contains("android.permission.RECORD_AUDIO");
        if (!a11.isEmpty()) {
            Iterator it2 = a11.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (Intrinsics.d(str, "android.permission.READ_EXTERNAL_STORAGE") || Intrinsics.d(str, "android.permission.READ_MEDIA_IMAGES") || Intrinsics.d(str, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                    z12 = true;
                    break;
                }
            }
        }
        z12 = false;
        if (contains) {
            c11125b.w().f(requireActivity, new C11124a(c11125b));
            return;
        }
        if (contains2) {
            ((C2431a) interfaceC4008j.getValue()).getClass();
        }
        if (z12) {
            c3991w0.setValue(new InterfaceC2433c.b(a11, z11, !z11, true));
        } else {
            c3991w0.setValue(new InterfaceC2433c.b(a11, z11, !z11, false));
        }
    }

    public static final InterfaceC2433c u(C11125b c11125b) {
        return (InterfaceC2433c) c11125b.f109071e.getValue();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Pi.b.a().d(this);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ArrayList a11 = C2432b.a(requireContext, C2432b.b(requireContext, (C2431a) this.f109072f.getValue()));
        if (a11.isEmpty()) {
            this.f109071e.setValue(InterfaceC2433c.C0039c.f1236a);
        } else {
            this.f109075i.a(a11.toArray(new String[0]));
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [Sc.j, java.lang.Object] */
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        yi.k kVar = this.f109074h;
        ?? r62 = this.f109070d;
        if (kVar == null) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            C10779a c10779a = (C10779a) r62.getValue();
            String b11 = c10779a != null ? c10779a.b() : null;
            C3878b c3878b = this.f109069c;
            if (c3878b == null) {
                Intrinsics.n("logger");
                throw null;
            }
            kVar = new yi.k(requireContext, b11, c3878b);
            this.f109074h = kVar;
        }
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        kVar.v(viewLifecycleOwner, K.a(viewLifecycleOwner2));
        m mVar = (m) new z0(this, new a(kVar, this)).a(m.class);
        this.f109073g = mVar;
        if (mVar == null) {
            Intrinsics.n("viewModel");
            throw null;
        }
        C10727i.c(x0.a(mVar), null, null, new q(mVar, (C10779a) r62.getValue(), null), 3);
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext2, null, 6, 0);
        composeView.a(new C4912a(true, 494338523, new C2352b()));
        return composeView;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onPause() {
        super.onPause();
        m mVar = this.f109073g;
        if (mVar != null) {
            if (mVar != null) {
                mVar.q0(k.i.f109198a);
            } else {
                Intrinsics.n("viewModel");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onResume() {
        super.onResume();
        Context context = getContext();
        if (context != null && C2432b.a(context, C2432b.b(context, (C2431a) this.f109072f.getValue())).isEmpty()) {
            this.f109071e.setValue(InterfaceC2433c.C0039c.f1236a);
        }
        m mVar = this.f109073g;
        if (mVar != null) {
            mVar.q0(k.f.f109196a);
        }
    }

    @NotNull
    public final Ti.i w() {
        Ti.i iVar = this.f109067a;
        if (iVar != null) {
            return iVar;
        }
        Intrinsics.n("router");
        throw null;
    }
}
