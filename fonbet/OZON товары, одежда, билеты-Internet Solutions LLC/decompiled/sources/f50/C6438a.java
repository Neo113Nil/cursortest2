package f50;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import B90.C2600b;
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
import c50.C5746a;
import com.github.chrisbanes.photoview.PhotoView;
import d50.InterfaceC6091a;
import f3.AbstractC6409a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.pdf.PdfPreviewListItem;
import ru.ozon.fintech.ui.pdf.PdfPreviewListItemView;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lf50/a;", "LE30/c;", "Le50/g;", "<init>", "()V", "cbottom-pdf_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: f50.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6438a extends E30.c implements e50.g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y0 f62753a;

    /* renamed from: b, reason: collision with root package name */
    private C5746a f62754b;

    /* renamed from: c, reason: collision with root package name */
    private int f62755c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f62756d;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPageFragment$onViewCreated$$inlined$observe$1", f = "CbottomPdfPageFragment.kt", l = {33}, m = "invokeSuspend")
    /* renamed from: f50.a$a, reason: collision with other inner class name */
    public static final class C0991a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f62757d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f62758e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f62760g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C6438a f62761h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPageFragment$onViewCreated$$inlined$observe$1$1", f = "CbottomPdfPageFragment.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: f50.a$a$a, reason: collision with other inner class name */
        public static final class C0992a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f62762d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f62763e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C6438a f62764f;

            /* renamed from: f50.a$a$a$a, reason: collision with other inner class name */
            public static final class C0993a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C6438a f62765a;

                public C0993a(C6438a c6438a) {
                    this.f62765a = c6438a;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    C6438a c6438a;
                    C5746a c5746a;
                    PdfPreviewListItemView a11;
                    Bitmap bitmap = (Bitmap) t2;
                    if (bitmap != null && (c5746a = (c6438a = this.f62765a).f62754b) != null && (a11 = c5746a.a()) != null) {
                        a11.bind(new PdfPreviewListItem(c6438a.f62755c, bitmap));
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0992a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, C6438a c6438a) {
                super(2, dVar);
                this.f62763e = interfaceC2395h;
                this.f62764f = c6438a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0992a(this.f62763e, dVar, this.f62764f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0992a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f62762d;
                if (i11 == 0) {
                    s.b(obj);
                    C0993a c0993a = new C0993a(this.f62764f);
                    this.f62762d = 1;
                    if (this.f62763e.collect(c0993a, this) == aVar) {
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
        public C0991a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, C6438a c6438a) {
            super(2, dVar);
            this.f62760g = interfaceC2395h;
            this.f62761h = c6438a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C0991a c0991a = C6438a.this.new C0991a(this.f62760g, dVar, this.f62761h);
            c0991a.f62758e = obj;
            return c0991a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0991a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f62757d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f62758e)) {
                    J viewLifecycleOwner = C6438a.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    C0992a c0992a = new C0992a(this.f62760g, null, this.f62761h);
                    this.f62757d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, c0992a, this) == aVar) {
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

    /* renamed from: f50.a$b */
    public static final class b extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return C6438a.this;
        }
    }

    /* renamed from: f50.a$c */
    public static final class c extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f62767b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f62767b = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f62767b.invoke();
        }
    }

    /* renamed from: f50.a$d */
    public static final class d extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f62768b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f62768b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f62768b.getValue()).getViewModelStore();
        }
    }

    /* renamed from: f50.a$e */
    public static final class e extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f62769b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f62769b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f62769b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public C6438a() {
        G30.a aVar = new G30.a(this, 4);
        InterfaceC4008j a11 = Sc.k.a(Sc.n.NONE, new c(new b()));
        this.f62753a = b0.b(this, kotlin.jvm.internal.N.b(p.class), new d(a11), new e(a11), aVar);
        this.f62756d = "PdfPageFragment";
    }

    public static void t(C6438a c6438a) {
        PdfPreviewListItemView a11;
        PhotoView imageView;
        ComponentCallbacksC5392m parentFragment = c6438a.getParentFragment();
        f50.b bVar = parentFragment instanceof f50.b ? (f50.b) parentFragment : null;
        if (bVar != null) {
            C5746a c5746a = c6438a.f62754b;
            bVar.onScaleChange((c5746a == null || (a11 = c5746a.a()) == null || (imageView = a11.getImageView()) == null) ? 1.0f : imageView.g());
        }
    }

    @Override // E30.c
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public final String getF62756d() {
        return this.f62756d;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((InterfaceC6091a) O30.a.a(O30.c.a(requireActivity)).a(InterfaceC6091a.class)).h0(this);
        super.onAttach(context);
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i11 = arguments.getInt("PAGE_ID", 0);
            p pVar = (p) this.f62753a.getValue();
            pVar.getClass();
            C10727i.c(x0.a(pVar), null, null, new o(pVar, i11, null), 3);
            this.f62755c = i11;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C5746a b11 = C5746a.b(inflater, viewGroup);
        this.f62754b = b11;
        PdfPreviewListItemView a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        this.f62754b = null;
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        PdfPreviewListItemView a11;
        PhotoView imageView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Ae.x0<Bitmap> e02 = ((p) this.f62753a.getValue()).e0();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new C0991a(e02, null, this), 3);
        C5746a c5746a = this.f62754b;
        if (c5746a == null || (a11 = c5746a.a()) == null || (imageView = a11.getImageView()) == null) {
            return;
        }
        imageView.l(new C2600b(this));
    }

    @Override // e50.g
    public final void q() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i11 = arguments.getInt("PAGE_ID", 0);
            p pVar = (p) this.f62753a.getValue();
            pVar.getClass();
            C10727i.c(x0.a(pVar), null, null, new o(pVar, i11, null), 3);
            this.f62755c = i11;
        }
    }
}
