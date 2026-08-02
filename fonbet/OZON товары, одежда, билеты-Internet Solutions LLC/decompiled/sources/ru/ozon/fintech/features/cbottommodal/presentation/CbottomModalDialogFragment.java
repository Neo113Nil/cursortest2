package ru.ozon.fintech.features.cbottommodal.presentation;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import C.D;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.s;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
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
import androidx.recyclerview.widget.RecyclerView;
import com.detmir.recycli.adapters.RecyclerItem;
import f3.AbstractC6409a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.common.CenterLinearLayoutManager;
import ru.ozon.uni.android.uikit.common.StyleParser;
import w40.InterfaceC10428a;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/fintech/features/cbottommodal/presentation/CbottomModalDialogFragment;", "LE30/b;", "Lw40/a;", "<init>", "()V", "cbottom-modal_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CbottomModalDialogFragment extends E30.b implements InterfaceC10428a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f95080a = "CbottomModalDialogFragment";

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final y0 f95081b;

    /* renamed from: c, reason: collision with root package name */
    private N40.a f95082c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final a f95083d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f95084e;

    /* renamed from: f, reason: collision with root package name */
    private final float f95085f;

    public static final class a extends C {
        a() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            CbottomModalDialogFragment.this.x().onBackPressed();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottommodal.presentation.CbottomModalDialogFragment$onViewCreated$$inlined$observe$1", f = "CbottomModalDialogFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95087d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95088e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95090g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ CbottomModalDialogFragment f95091h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottommodal.presentation.CbottomModalDialogFragment$onViewCreated$$inlined$observe$1$1", f = "CbottomModalDialogFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95092d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95093e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ CbottomModalDialogFragment f95094f;

            /* renamed from: ru.ozon.fintech.features.cbottommodal.presentation.CbottomModalDialogFragment$b$a$a, reason: collision with other inner class name */
            public static final class C2000a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CbottomModalDialogFragment f95095a;

                public C2000a(CbottomModalDialogFragment cbottomModalDialogFragment) {
                    this.f95095a = cbottomModalDialogFragment;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    List list = (List) t2;
                    N40.a aVar = this.f95095a.f95082c;
                    if (aVar != null) {
                        com.detmir.recycli.adapters.d.a(aVar.f18685b, list);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, CbottomModalDialogFragment cbottomModalDialogFragment) {
                super(2, dVar);
                this.f95093e = interfaceC2395h;
                this.f95094f = cbottomModalDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95093e, dVar, this.f95094f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95092d;
                if (i11 == 0) {
                    s.b(obj);
                    C2000a c2000a = new C2000a(this.f95094f);
                    this.f95092d = 1;
                    if (this.f95093e.collect(c2000a, this) == aVar) {
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
        public b(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, CbottomModalDialogFragment cbottomModalDialogFragment) {
            super(2, dVar);
            this.f95090g = interfaceC2395h;
            this.f95091h = cbottomModalDialogFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = CbottomModalDialogFragment.this.new b(this.f95090g, dVar, this.f95091h);
            bVar.f95088e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95087d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95088e)) {
                    J viewLifecycleOwner = CbottomModalDialogFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95090g, null, this.f95091h);
                    this.f95087d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottommodal.presentation.CbottomModalDialogFragment$onViewCreated$$inlined$observe$2", f = "CbottomModalDialogFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95096d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95097e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95099g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ CbottomModalDialogFragment f95100h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottommodal.presentation.CbottomModalDialogFragment$onViewCreated$$inlined$observe$2$1", f = "CbottomModalDialogFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95101d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95102e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ CbottomModalDialogFragment f95103f;

            /* renamed from: ru.ozon.fintech.features.cbottommodal.presentation.CbottomModalDialogFragment$c$a$a, reason: collision with other inner class name */
            public static final class C2001a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CbottomModalDialogFragment f95104a;

                public C2001a(CbottomModalDialogFragment cbottomModalDialogFragment) {
                    this.f95104a = cbottomModalDialogFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:65:0x0140  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x01da  */
                /* JADX WARN: Removed duplicated region for block: B:78:0x01fc  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x0271  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x0158  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    Integer num;
                    N40.a aVar;
                    P40.d dVar2 = (P40.d) t2;
                    if (dVar2 != null) {
                        Integer g10 = dVar2.g();
                        int i11 = -2;
                        int d11 = (g10 == null || g10.intValue() == -1) ? -1 : g10.intValue() == -2 ? -2 : D.d(dVar2.g().intValue());
                        Integer c11 = dVar2.c();
                        if (c11 != null) {
                            if (c11.intValue() == -1) {
                                i11 = -1;
                            } else if (c11.intValue() != -2) {
                                i11 = D.d(dVar2.c().intValue());
                            }
                        }
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(d11, i11);
                        layoutParams.gravity = 17;
                        CbottomModalDialogFragment cbottomModalDialogFragment = this.f95104a;
                        N40.a aVar2 = cbottomModalDialogFragment.f95082c;
                        if (aVar2 != null) {
                            aVar2.f18685b.setLayoutParams(layoutParams);
                        }
                        N40.a aVar3 = cbottomModalDialogFragment.f95082c;
                        if (aVar3 != null) {
                            FrameLayout frameLayout = aVar3.f18687d;
                            Rect e11 = dVar2.e();
                            int d12 = e11 != null ? D.d(e11.left) : 0;
                            Rect e12 = dVar2.e();
                            int d13 = e12 != null ? D.d(e12.top) : 0;
                            Rect e13 = dVar2.e();
                            int d14 = e13 != null ? D.d(e13.right) : 0;
                            Rect e14 = dVar2.e();
                            frameLayout.setPadding(d12, d13, d14, e14 != null ? D.d(e14.bottom) : 0);
                        }
                        N40.a aVar4 = cbottomModalDialogFragment.f95082c;
                        if (aVar4 != null) {
                            RecyclerView recyclerView = aVar4.f18685b;
                            Rect d15 = dVar2.d();
                            int d16 = d15 != null ? D.d(d15.left) : 0;
                            Rect d17 = dVar2.d();
                            int d18 = d17 != null ? D.d(d17.top) : 0;
                            Rect d19 = dVar2.d();
                            int d21 = d19 != null ? D.d(d19.right) : 0;
                            Rect d22 = dVar2.d();
                            recyclerView.setPadding(d16, d18, d21, d22 != null ? D.d(d22.bottom) : 0);
                        }
                        List<Integer> b11 = dVar2.b();
                        if (b11 != null && b11.size() == 4) {
                            List<Integer> b12 = dVar2.b();
                            if (!(b12 instanceof Collection) || !b12.isEmpty()) {
                                Iterator<T> it = b12.iterator();
                                while (it.hasNext()) {
                                    if (((Number) it.next()).intValue() == dVar2.b().get(0).intValue()) {
                                    }
                                }
                            }
                            num = (Integer) C7714v.K(dVar2.b());
                            if (num != null) {
                                N40.a aVar5 = cbottomModalDialogFragment.f95082c;
                                if (aVar5 != null) {
                                    aVar5.f18685b.setOutlineProvider(null);
                                }
                                N40.a aVar6 = cbottomModalDialogFragment.f95082c;
                                if (aVar6 != null) {
                                    aVar6.f18685b.setClipToOutline(false);
                                }
                            } else {
                                N40.a aVar7 = cbottomModalDialogFragment.f95082c;
                                if ((aVar7 != null ? aVar7.f18685b.getOutlineProvider() : null) == null) {
                                    N40.a aVar8 = cbottomModalDialogFragment.f95082c;
                                    if (aVar8 != null) {
                                        aVar8.f18685b.setOutlineProvider(new L30.c(num.intValue()));
                                    }
                                    N40.a aVar9 = cbottomModalDialogFragment.f95082c;
                                    if (aVar9 != null) {
                                        aVar9.f18685b.setClipToOutline(true);
                                    }
                                } else {
                                    N40.a aVar10 = cbottomModalDialogFragment.f95082c;
                                    ViewOutlineProvider outlineProvider = aVar10 != null ? aVar10.f18685b.getOutlineProvider() : null;
                                    L30.c cVar = outlineProvider instanceof L30.c ? (L30.c) outlineProvider : null;
                                    if (!Intrinsics.d(cVar != null ? new Integer(cVar.a()) : null, num)) {
                                        N40.a aVar11 = cbottomModalDialogFragment.f95082c;
                                        if (aVar11 != null) {
                                            aVar11.f18685b.setOutlineProvider(new L30.c(num.intValue()));
                                        }
                                        N40.a aVar12 = cbottomModalDialogFragment.f95082c;
                                        if (aVar12 != null) {
                                            aVar12.f18685b.setClipToOutline(true);
                                        }
                                    }
                                }
                            }
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            if (dVar2.a() != null) {
                                StyleParser styleParser = StyleParser.INSTANCE;
                                Context requireContext = cbottomModalDialogFragment.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                                Integer parseColor = styleParser.parseColor(requireContext, dVar2.a());
                                if (parseColor != null) {
                                    gradientDrawable.setColor(parseColor.intValue());
                                }
                            }
                            if (dVar2.b() != null) {
                                float d23 = D.d(dVar2.b().get(0).intValue());
                                float d24 = D.d(dVar2.b().get(1).intValue());
                                float d25 = D.d(dVar2.b().get(2).intValue());
                                float d26 = D.d(dVar2.b().get(3).intValue());
                                gradientDrawable.setCornerRadii(new float[]{d23, d23, d24, d24, d25, d25, d26, d26});
                            }
                            LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{gradientDrawable});
                            aVar = cbottomModalDialogFragment.f95082c;
                            if (aVar != null) {
                                aVar.f18685b.setBackground(layerDrawable);
                            }
                        }
                        num = null;
                        if (num != null) {
                        }
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        if (dVar2.a() != null) {
                        }
                        if (dVar2.b() != null) {
                        }
                        LayerDrawable layerDrawable2 = new LayerDrawable(new GradientDrawable[]{gradientDrawable2});
                        aVar = cbottomModalDialogFragment.f95082c;
                        if (aVar != null) {
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, CbottomModalDialogFragment cbottomModalDialogFragment) {
                super(2, dVar);
                this.f95102e = interfaceC2395h;
                this.f95103f = cbottomModalDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95102e, dVar, this.f95103f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95101d;
                if (i11 == 0) {
                    s.b(obj);
                    C2001a c2001a = new C2001a(this.f95103f);
                    this.f95101d = 1;
                    if (this.f95102e.collect(c2001a, this) == aVar) {
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
        public c(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, CbottomModalDialogFragment cbottomModalDialogFragment) {
            super(2, dVar);
            this.f95099g = interfaceC2395h;
            this.f95100h = cbottomModalDialogFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = CbottomModalDialogFragment.this.new c(this.f95099g, dVar, this.f95100h);
            cVar.f95097e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95096d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95097e)) {
                    J viewLifecycleOwner = CbottomModalDialogFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95099g, null, this.f95100h);
                    this.f95096d = 1;
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
            return CbottomModalDialogFragment.this;
        }
    }

    public static final class e extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f95106b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f95106b = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f95106b.invoke();
        }
    }

    public static final class f extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95107b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95107b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f95107b.getValue()).getViewModelStore();
        }
    }

    public static final class g extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95108b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95108b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f95108b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public CbottomModalDialogFragment() {
        K70.c cVar = new K70.c(this, 1);
        InterfaceC4008j a11 = k.a(n.NONE, new e(new d()));
        this.f95081b = b0.b(this, kotlin.jvm.internal.N.b(Q40.a.class), new f(a11), new g(a11), cVar);
        this.f95083d = new a();
        this.f95084e = k.b(new B50.a(this, 3));
        this.f95085f = 0.6f;
    }

    public static void t(CbottomModalDialogFragment cbottomModalDialogFragment) {
        cbottomModalDialogFragment.x().onBackPressed();
    }

    public static boolean u(CbottomModalDialogFragment cbottomModalDialogFragment) {
        return cbottomModalDialogFragment.x().m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Q40.a x() {
        return (Q40.a) this.f95081b.getValue();
    }

    @Override // w40.InterfaceC10428a
    public final void action(String str) {
    }

    @Override // E30.b
    /* renamed from: getDimAmount, reason: from getter */
    public final float getF95085f() {
        return this.f95085f;
    }

    @Override // E30.b
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public final String getF95080a() {
        return this.f95080a;
    }

    @Override // E30.b
    public final boolean getLightStatusBar() {
        return false;
    }

    @Override // E30.b
    @NotNull
    public final C getOnBackPressedCallback() {
        return this.f95083d;
    }

    @Override // E30.b
    /* renamed from: isStandaloneIntegration */
    public final boolean getF96847d() {
        return ((Boolean) this.f95084e.getValue()).booleanValue();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((O40.a) O30.a.a(O30.c.a(requireActivity)).a(O40.a.class)).N(this);
        super.onAttach(context);
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setStyle(2, R.style.Base_Ozon_FullScreenDialog);
        Q40.a x11 = x();
        Bundle arguments = getArguments();
        String string2 = arguments != null ? arguments.getString("PARAMETER_JSON") : null;
        Bundle arguments2 = getArguments();
        Parcelable parcelable = arguments2 != null ? arguments2.getParcelable("PARAMETER_PARCELABLE") : null;
        Bundle arguments3 = getArguments();
        Integer valueOf = Integer.valueOf(arguments3 != null ? arguments3.getInt("PARAMETER_VERSION") : 2);
        Bundle arguments4 = getArguments();
        x11.j0(string2, parcelable, valueOf, (arguments4 == null || (string = arguments4.getString("PARAMETER_UUID", "")) == null) ? "" : string, null);
        x().g0();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        N40.a b11 = N40.a.b(inflater, viewGroup);
        this.f95082c = b11;
        ConstraintLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroy() {
        super.onDestroy();
        x().onDestroy();
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        this.f95082c = null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        Q40.a x11 = x();
        x11.h0(x11.i0());
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        x().onStart();
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        super.onStop();
        x().onStop();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        ConstraintLayout constraintLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        N40.a aVar = this.f95082c;
        if (aVar != null) {
            RecyclerView recyclerView = aVar.f18685b;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            recyclerView.setLayoutManager(new CenterLinearLayoutManager(requireContext, 1, false));
            H30.r.a(recyclerView);
        }
        x0<List<RecyclerItem>> k02 = x().k0();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new b(k02, null, this), 3);
        N40.a aVar2 = this.f95082c;
        if (aVar2 != null && (constraintLayout = aVar2.f18686c) != null) {
            constraintLayout.setOnClickListener(new AI.b(this, 9));
        }
        x0<P40.d> l02 = x().l0();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new c(l02, null, this), 3);
    }

    @Override // w40.InterfaceC10428a
    @NotNull
    public final String provideId() {
        return x().i0();
    }

    @Override // w40.InterfaceC10428a
    public final void updateState(String str, Parcelable parcelable, int i11, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        x().j0(null, parcelable, 2, uuid, null);
    }
}
