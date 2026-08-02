package ru.ozon.fintech.features.cbottomscreen.presentation;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.s;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.fragment.app.r;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.y0;
import f3.AbstractC6409a;
import h50.C6812a;
import i50.InterfaceC7010a;
import k50.C7594a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l50.C7877a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2ScreenDTO;
import w40.InterfaceC10428a;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lru/ozon/fintech/features/cbottomscreen/presentation/CbottomScreenFragment;", "LE30/c;", "Lw40/a;", "<init>", "()V", "a", "cbottom-screen_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CbottomScreenFragment extends E30.c implements InterfaceC10428a {

    /* renamed from: a, reason: collision with root package name */
    private C6812a f95199a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final y0 f95200b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f95201c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private b f95202d;

    public static final class a {
        @NotNull
        public static Bundle a(Cbottom2ScreenDTO cbottom2ScreenDTO, boolean z11, boolean z12, @NotNull String uuid) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            return androidx.core.os.d.b(new Pair("LOAD_URL_KEY", null), new Pair("PARAMETER_JSON", null), new Pair("PARAMETER_PARCELABLE", cbottom2ScreenDTO), new Pair("PARAMETER_VERSION", 2), new Pair("IN_OVER", Boolean.valueOf(z11)), new Pair(CameraFragment.NO_BOTTOM_TABS, Boolean.valueOf(z12)), new Pair("PARAMETER_UUID", uuid));
        }
    }

    public static final class b extends C {
        b() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            CbottomScreenFragment.this.v().onBackPressed();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomscreen.presentation.CbottomScreenFragment$onViewCreated$$inlined$observe$1", f = "CbottomScreenFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95204d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95205e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95207g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ CbottomScreenFragment f95208h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomscreen.presentation.CbottomScreenFragment$onViewCreated$$inlined$observe$1$1", f = "CbottomScreenFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95209d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95210e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ CbottomScreenFragment f95211f;

            /* renamed from: ru.ozon.fintech.features.cbottomscreen.presentation.CbottomScreenFragment$c$a$a, reason: collision with other inner class name */
            public static final class C2010a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CbottomScreenFragment f95212a;

                public C2010a(CbottomScreenFragment cbottomScreenFragment) {
                    this.f95212a = cbottomScreenFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    C6812a f95199a;
                    C7877a c7877a = (C7877a) t2;
                    if (c7877a != null && (f95199a = this.f95212a.getF95199a()) != null) {
                        f95199a.f65022b.a(c7877a.a());
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, CbottomScreenFragment cbottomScreenFragment) {
                super(2, dVar);
                this.f95210e = interfaceC2395h;
                this.f95211f = cbottomScreenFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95210e, dVar, this.f95211f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95209d;
                if (i11 == 0) {
                    s.b(obj);
                    C2010a c2010a = new C2010a(this.f95211f);
                    this.f95209d = 1;
                    if (this.f95210e.collect(c2010a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, CbottomScreenFragment cbottomScreenFragment) {
            super(2, dVar);
            this.f95207g = interfaceC2395h;
            this.f95208h = cbottomScreenFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = CbottomScreenFragment.this.new c(this.f95207g, dVar, this.f95208h);
            cVar.f95205e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95204d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95205e)) {
                    J viewLifecycleOwner = CbottomScreenFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95207g, null, this.f95208h);
                    this.f95204d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    public static final class d extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return CbottomScreenFragment.this;
        }
    }

    public static final class e extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f95214b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f95214b = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f95214b.invoke();
        }
    }

    public static final class f extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95215b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95215b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f95215b.getValue()).getViewModelStore();
        }
    }

    public static final class g extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95216b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95216b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f95216b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public CbottomScreenFragment() {
        fa.b bVar = new fa.b(this, 1);
        InterfaceC4008j a11 = k.a(n.NONE, new e(new d()));
        this.f95200b = b0.b(this, kotlin.jvm.internal.N.b(C7594a.class), new f(a11), new g(a11), bVar);
        this.f95201c = "JSContexFragment";
        this.f95202d = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C7594a v() {
        return (C7594a) this.f95200b.getValue();
    }

    @Override // w40.InterfaceC10428a
    public final void action(String str) {
    }

    @Override // E30.c
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public final String getF95201c() {
        return this.f95201c;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((InterfaceC7010a) O30.a.a(O30.c.a(requireActivity)).a(InterfaceC7010a.class)).n1(this);
        super.onAttach(context);
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        C7594a v11 = v();
        Bundle arguments = getArguments();
        v11.init(arguments != null ? arguments.getString("LOAD_URL_KEY") : null);
        C7594a v12 = v();
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("PARAMETER_JSON") : null;
        Bundle arguments3 = getArguments();
        Parcelable parcelable = arguments3 != null ? arguments3.getParcelable("PARAMETER_PARCELABLE") : null;
        Bundle arguments4 = getArguments();
        Integer valueOf = Integer.valueOf(arguments4 != null ? arguments4.getInt("PARAMETER_VERSION", 2) : 2);
        Bundle arguments5 = getArguments();
        v12.j0(string2, parcelable, valueOf, (arguments5 == null || (string = arguments5.getString("PARAMETER_UUID", "")) == null) ? "" : string, null);
        v().g0();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C6812a b11 = C6812a.b(inflater, viewGroup);
        this.f95199a = b11;
        return b11.a();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroy() {
        super.onDestroy();
        v().onDestroy();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        this.f95199a = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        v().onStart();
        this.f95202d.setEnabled(true);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        super.onStop();
        v().onStop();
        this.f95202d.setEnabled(false);
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        x0<C7877a> k02 = v().k0();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new c(k02, null, this), 3);
        androidx.activity.J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        b onBackPressedCallback = this.f95202d;
        onBackPressedDispatcher.getClass();
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        onBackPressedDispatcher.i(onBackPressedCallback);
    }

    @Override // w40.InterfaceC10428a
    @NotNull
    public final String provideId() {
        return v().i0();
    }

    /* renamed from: u, reason: from getter */
    protected final C6812a getF95199a() {
        return this.f95199a;
    }

    @Override // w40.InterfaceC10428a
    public final void updateState(String str, Parcelable parcelable, int i11, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        v().j0(null, parcelable, 2, uuid, null);
    }
}
