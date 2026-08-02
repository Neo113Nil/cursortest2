package c80;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import B90.C2613o;
import B90.m0;
import Sc.InterfaceC4008j;
import Sc.s;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import com.github.chrisbanes.photoview.PhotoView;
import f3.AbstractC6409a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment;
import ru.ozon.fintech.ui.pdf.PdfPreviewListItem;
import ru.ozon.fintech.ui.pdf.PdfPreviewListItemView;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc80/b;", "LE30/c;", "<init>", "()V", "sharing-files_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends E30.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y0 f56703a;

    /* renamed from: b, reason: collision with root package name */
    private W70.b f56704b;

    /* renamed from: c, reason: collision with root package name */
    private int f56705c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f56706d;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.pdf.PdfPageFragment$onViewCreated$$inlined$observe$1", f = "PdfPageFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f56707d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f56708e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f56710g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f56711h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.pdf.PdfPageFragment$onViewCreated$$inlined$observe$1$1", f = "PdfPageFragment.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: c80.b$a$a, reason: collision with other inner class name */
        public static final class C0855a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f56712d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f56713e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f56714f;

            /* renamed from: c80.b$a$a$a, reason: collision with other inner class name */
            public static final class C0856a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ b f56715a;

                public C0856a(b bVar) {
                    this.f56715a = bVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    b bVar;
                    W70.b bVar2;
                    PdfPreviewListItemView a11;
                    Bitmap bitmap = (Bitmap) t2;
                    if (bitmap != null && (bVar2 = (bVar = this.f56715a).f56704b) != null && (a11 = bVar2.a()) != null) {
                        a11.bind(new PdfPreviewListItem(bVar.f56705c, bitmap));
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0855a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, b bVar) {
                super(2, dVar);
                this.f56713e = interfaceC2395h;
                this.f56714f = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0855a(this.f56713e, dVar, this.f56714f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0855a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f56712d;
                if (i11 == 0) {
                    s.b(obj);
                    C0856a c0856a = new C0856a(this.f56714f);
                    this.f56712d = 1;
                    if (this.f56713e.collect(c0856a, this) == aVar) {
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
        public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, b bVar) {
            super(2, dVar);
            this.f56710g = interfaceC2395h;
            this.f56711h = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = b.this.new a(this.f56710g, dVar, this.f56711h);
            aVar.f56708e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f56707d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f56708e)) {
                    J viewLifecycleOwner = b.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    C0855a c0855a = new C0855a(this.f56710g, null, this.f56711h);
                    this.f56707d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, c0855a, this) == aVar) {
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

    /* renamed from: c80.b$b, reason: collision with other inner class name */
    public static final class C0857b extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public C0857b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return b.this;
        }
    }

    public static final class c extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0857b f56717b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0857b c0857b) {
            super(0);
            this.f56717b = c0857b;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f56717b.invoke();
        }
    }

    public static final class d extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f56718b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f56718b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f56718b.getValue()).getViewModelStore();
        }
    }

    public static final class e extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f56719b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f56719b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f56719b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public b() {
        m0 m0Var = new m0(this, 4);
        InterfaceC4008j a11 = Sc.k.a(Sc.n.NONE, new c(new C0857b()));
        this.f56703a = b0.b(this, kotlin.jvm.internal.N.b(c80.d.class), new d(a11), new e(a11), m0Var);
        this.f56706d = "PdfPageFragment";
    }

    public static void t(b bVar) {
        PdfPreviewListItemView a11;
        PhotoView imageView;
        ComponentCallbacksC5392m parentFragment = bVar.getParentFragment();
        SharingPreviewFragment sharingPreviewFragment = parentFragment instanceof SharingPreviewFragment ? (SharingPreviewFragment) parentFragment : null;
        if (sharingPreviewFragment != null) {
            W70.b bVar2 = bVar.f56704b;
            sharingPreviewFragment.onScaleChange((bVar2 == null || (a11 = bVar2.a()) == null || (imageView = a11.getImageView()) == null) ? 1.0f : imageView.g());
        }
    }

    @Override // E30.c
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public final String getF56706d() {
        return this.f56706d;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((X70.b) O30.a.a(O30.c.a(requireActivity)).a(X70.b.class)).j0(this);
        super.onAttach(context);
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i11 = arguments.getInt("PAGE_ID", 0);
            c80.d dVar = (c80.d) this.f56703a.getValue();
            dVar.getClass();
            C10727i.c(x0.a(dVar), null, null, new c80.c(dVar, i11, null), 3);
            this.f56705c = i11;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        W70.b b11 = W70.b.b(inflater, viewGroup);
        this.f56704b = b11;
        PdfPreviewListItemView a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        this.f56704b = null;
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        PdfPreviewListItemView a11;
        PhotoView imageView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Ae.x0<Bitmap> e02 = ((c80.d) this.f56703a.getValue()).e0();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new a(e02, null, this), 3);
        W70.b bVar = this.f56704b;
        if (bVar == null || (a11 = bVar.a()) == null || (imageView = a11.getImageView()) == null) {
            return;
        }
        imageView.l(new C2613o(this, 5));
    }
}
