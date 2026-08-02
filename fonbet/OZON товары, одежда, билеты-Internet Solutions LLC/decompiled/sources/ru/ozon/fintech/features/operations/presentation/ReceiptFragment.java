package ru.ozon.fintech.features.operations.presentation;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.s;
import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import f3.AbstractC6409a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.operations.ui.receipt.ReceiptItem;
import ru.ozon.fintech.features.operations.ui.receipt.ReceiptItemView;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ozon/fintech/features/operations/presentation/ReceiptFragment;", "LE30/c;", "<init>", "()V", "a", "operations_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReceiptFragment extends E30.c {

    /* renamed from: a, reason: collision with root package name */
    private A70.c f96021a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final y0 f96022b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f96023c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ERROR;
        public static final a PROCESS;
        public static final a SUCCESS;

        static {
            a aVar = new a("SUCCESS", 0);
            SUCCESS = aVar;
            a aVar2 = new a("ERROR", 1);
            ERROR = aVar2;
            a aVar3 = new a("PROCESS", 2);
            PROCESS = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.operations.presentation.ReceiptFragment$onViewCreated$$inlined$observe$1", f = "ReceiptFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96024d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96025e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96027g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ReceiptFragment f96028h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.operations.presentation.ReceiptFragment$onViewCreated$$inlined$observe$1$1", f = "ReceiptFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96029d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96030e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ReceiptFragment f96031f;

            /* renamed from: ru.ozon.fintech.features.operations.presentation.ReceiptFragment$b$a$a, reason: collision with other inner class name */
            public static final class C2063a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ReceiptFragment f96032a;

                public C2063a(ReceiptFragment receiptFragment) {
                    this.f96032a = receiptFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    FinToolbarState finToolbarState = (FinToolbarState) t2;
                    A70.c cVar = this.f96032a.f96021a;
                    if (cVar != null) {
                        cVar.f545d.bindState(finToolbarState);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, ReceiptFragment receiptFragment) {
                super(2, dVar);
                this.f96030e = interfaceC2395h;
                this.f96031f = receiptFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96030e, dVar, this.f96031f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96029d;
                if (i11 == 0) {
                    s.b(obj);
                    C2063a c2063a = new C2063a(this.f96031f);
                    this.f96029d = 1;
                    if (this.f96030e.collect(c2063a, this) == aVar) {
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
        public b(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, ReceiptFragment receiptFragment) {
            super(2, dVar);
            this.f96027g = interfaceC2395h;
            this.f96028h = receiptFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = ReceiptFragment.this.new b(this.f96027g, dVar, this.f96028h);
            bVar.f96025e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96024d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96025e)) {
                    J viewLifecycleOwner = ReceiptFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96027g, null, this.f96028h);
                    this.f96024d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.operations.presentation.ReceiptFragment$onViewCreated$$inlined$observe$2", f = "ReceiptFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96033d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96034e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96036g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ReceiptFragment f96037h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.operations.presentation.ReceiptFragment$onViewCreated$$inlined$observe$2$1", f = "ReceiptFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96038d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96039e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ReceiptFragment f96040f;

            /* renamed from: ru.ozon.fintech.features.operations.presentation.ReceiptFragment$c$a$a, reason: collision with other inner class name */
            public static final class C2064a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ReceiptFragment f96041a;

                public C2064a(ReceiptFragment receiptFragment) {
                    this.f96041a = receiptFragment;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    A70.c cVar;
                    List list = (List) t2;
                    if (list != null && (cVar = this.f96041a.f96021a) != null) {
                        com.detmir.recycli.adapters.d.a(cVar.f544c, list);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, ReceiptFragment receiptFragment) {
                super(2, dVar);
                this.f96039e = interfaceC2395h;
                this.f96040f = receiptFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96039e, dVar, this.f96040f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96038d;
                if (i11 == 0) {
                    s.b(obj);
                    C2064a c2064a = new C2064a(this.f96040f);
                    this.f96038d = 1;
                    if (this.f96039e.collect(c2064a, this) == aVar) {
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
        public c(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, ReceiptFragment receiptFragment) {
            super(2, dVar);
            this.f96036g = interfaceC2395h;
            this.f96037h = receiptFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = ReceiptFragment.this.new c(this.f96036g, dVar, this.f96037h);
            cVar.f96034e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96033d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96034e)) {
                    J viewLifecycleOwner = ReceiptFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96036g, null, this.f96037h);
                    this.f96033d = 1;
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
            return ReceiptFragment.this;
        }
    }

    public static final class e extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f96043b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f96043b = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f96043b.invoke();
        }
    }

    public static final class f extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96044b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96044b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f96044b.getValue()).getViewModelStore();
        }
    }

    public static final class g extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96045b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96045b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f96045b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public ReceiptFragment() {
        F70.c cVar = new F70.c(this, 0);
        InterfaceC4008j a11 = k.a(n.NONE, new e(new d()));
        this.f96022b = b0.b(this, kotlin.jvm.internal.N.b(ru.ozon.fintech.features.operations.presentation.d.class), new f(a11), new g(a11), cVar);
        this.f96023c = "ReceiptFragment";
    }

    @Override // E30.c
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public final String getF95438c() {
        return this.f96023c;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((B70.b) O30.a.a(O30.c.a(requireActivity)).a(B70.b.class)).I0(this);
        getResources().getInteger(R.integer.config_shortAnimTime);
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        D70.a aVar;
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                Intrinsics.checkNotNullParameter(arguments, "<this>");
                String string = arguments.getString("id_key", "");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = arguments.getString("receipt_status_text_key", "");
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                a aVar2 = a.values()[arguments.getInt("receipt_status_type_key", 0)];
                String string3 = arguments.getString("time_key", "");
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                String string4 = arguments.getString("amount_key", "");
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                String string5 = arguments.getString("receiver_bank_key", "");
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                String string6 = arguments.getString("sender_count_key", "");
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                String string7 = arguments.getString("sender_phone_key", "");
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                String string8 = arguments.getString("sender_bank_key", "");
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                aVar = new D70.a(string, string2, aVar2, string3, string4, string5, string6, string7, string8, arguments.getString("message_key"));
            } else {
                aVar = null;
            }
            ((ru.ozon.fintech.features.operations.presentation.d) this.f96022b.getValue()).f0(aVar);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        A70.c b11 = A70.c.b(inflater, viewGroup);
        this.f96021a = b11;
        LinearLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        RecyclerView.n nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        A70.c cVar = this.f96021a;
        if (cVar != null) {
            RecyclerView recyclerView = cVar.f544c;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            H30.r.a(recyclerView);
            ReceiptItemView.INSTANCE.getClass();
            nVar = ReceiptItemView.decoration;
            recyclerView.addItemDecoration(nVar);
        }
        A70.c cVar2 = this.f96021a;
        if (cVar2 != null) {
            cVar2.f543b.setClipToOutline(true);
        }
        y0 y0Var = this.f96022b;
        x0<FinToolbarState> e02 = ((ru.ozon.fintech.features.operations.presentation.d) y0Var.getValue()).e0();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new b(e02, null, this), 3);
        x0<List<ReceiptItem>> d02 = ((ru.ozon.fintech.features.operations.presentation.d) y0Var.getValue()).d0();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new c(d02, null, this), 3);
    }
}
