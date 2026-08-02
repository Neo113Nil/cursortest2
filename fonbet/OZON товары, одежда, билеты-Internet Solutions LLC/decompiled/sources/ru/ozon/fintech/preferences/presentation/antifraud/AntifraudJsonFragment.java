package ru.ozon.fintech.preferences.presentation.antifraud;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.M0;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.s;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.C;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.preferences.presentation.antifraud.AntifraudJsonFragment;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/fintech/preferences/presentation/antifraud/AntifraudJsonFragment;", "Landroidx/fragment/app/m;", "<init>", "()V", "fintech-preferences_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AntifraudJsonFragment extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    private v90.a f96636a;

    /* renamed from: b, reason: collision with root package name */
    public z0.b f96637b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final y0 f96638c;

    /* renamed from: d, reason: collision with root package name */
    private ClipboardManager f96639d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private a f96640e;

    public static final class a extends C {
        a() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            AntifraudJsonFragment.w(AntifraudJsonFragment.this).e0();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.antifraud.AntifraudJsonFragment$onViewCreated$$inlined$observe$1", f = "AntifraudJsonFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96642d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96643e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96645g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ AntifraudJsonFragment f96646h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.antifraud.AntifraudJsonFragment$onViewCreated$$inlined$observe$1$1", f = "AntifraudJsonFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96647d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96648e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AntifraudJsonFragment f96649f;

            /* renamed from: ru.ozon.fintech.preferences.presentation.antifraud.AntifraudJsonFragment$b$a$a, reason: collision with other inner class name */
            public static final class C2103a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ AntifraudJsonFragment f96650a;

                public C2103a(AntifraudJsonFragment antifraudJsonFragment) {
                    this.f96650a = antifraudJsonFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    v90.a aVar;
                    String str = (String) t2;
                    if (str != null && (aVar = this.f96650a.f96636a) != null) {
                        aVar.f102576c.setText(str);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, AntifraudJsonFragment antifraudJsonFragment) {
                super(2, dVar);
                this.f96648e = interfaceC2395h;
                this.f96649f = antifraudJsonFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96648e, dVar, this.f96649f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96647d;
                if (i11 == 0) {
                    s.b(obj);
                    C2103a c2103a = new C2103a(this.f96649f);
                    this.f96647d = 1;
                    if (this.f96648e.collect(c2103a, this) == aVar) {
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
        public b(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, AntifraudJsonFragment antifraudJsonFragment) {
            super(2, dVar);
            this.f96645g = interfaceC2395h;
            this.f96646h = antifraudJsonFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = AntifraudJsonFragment.this.new b(this.f96645g, dVar, this.f96646h);
            bVar.f96643e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96642d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96643e)) {
                    J viewLifecycleOwner = AntifraudJsonFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96645g, null, this.f96646h);
                    this.f96642d = 1;
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

    public static final class c extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return AntifraudJsonFragment.this;
        }
    }

    public static final class d extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f96652b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f96652b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f96652b.invoke();
        }
    }

    public static final class e extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96653b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96653b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f96653b.getValue()).getViewModelStore();
        }
    }

    public static final class f extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96654b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96654b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f96654b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public AntifraudJsonFragment() {
        R70.a aVar = new R70.a(this, 4);
        InterfaceC4008j a11 = k.a(n.NONE, new d(new c()));
        this.f96638c = b0.b(this, kotlin.jvm.internal.N.b(y90.b.class), new e(a11), new f(a11), aVar);
        this.f96640e = new a();
    }

    public static void t(TextView textView, AntifraudJsonFragment antifraudJsonFragment) {
        ClipData newPlainText = ClipData.newPlainText("text", textView.getText().toString());
        ClipboardManager clipboardManager = antifraudJsonFragment.f96639d;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(newPlainText);
        }
        Toast.makeText(antifraudJsonFragment.requireActivity().getApplicationContext(), "Json copied", 0).show();
    }

    public static Unit u(AntifraudJsonFragment antifraudJsonFragment) {
        ((y90.b) antifraudJsonFragment.f96638c.getValue()).e0();
        return Unit.f71690a;
    }

    public static final y90.b w(AntifraudJsonFragment antifraudJsonFragment) {
        return (y90.b) antifraudJsonFragment.f96638c.getValue();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((w90.b) O30.a.a(O30.c.a(requireActivity)).a(w90.b.class)).H0(this);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((y90.b) this.f96638c.getValue()).f0();
        Object systemService = requireContext().getSystemService("clipboard");
        this.f96639d = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        v90.a b11 = v90.a.b(inflater, viewGroup);
        this.f96636a = b11;
        ConstraintLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        androidx.activity.J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner, this.f96640e);
        v90.a aVar = this.f96636a;
        if (aVar != null) {
            aVar.f102575b.bindState(new FinToolbarState("Антифрод Json", null, null, null, null, null, null, null, null, Integer.valueOf(R.drawable.ic_m_disclosure_back_filled), "graphicTertiary", new A50.a(this, 5), null, null, null, null, 17, 61950, null));
        }
        v90.a aVar2 = this.f96636a;
        if (aVar2 != null) {
            final TextView textView = aVar2.f102576c;
            textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: y90.a
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    AntifraudJsonFragment.t(textView, this);
                    return true;
                }
            });
        }
        M0<String> d02 = ((y90.b) this.f96638c.getValue()).d0();
        if (d02 != null) {
            J viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            C10727i.c(K.a(viewLifecycleOwner2), null, null, new b(d02, null, this), 3);
        }
    }
}
