package f50;

import Ae.C0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.w0;
import Ae.x0;
import B90.f0;
import B90.g0;
import H30.D;
import H30.u;
import H30.z;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.s;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.activity.C;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
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
import androidx.viewpager2.widget.ViewPager2;
import c50.C5747b;
import com.facebook.shimmer.ShimmerFrameLayout;
import d50.InterfaceC6091a;
import f3.AbstractC6409a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.cbottombase.ui.CbottomUINoScrollableView;
import ru.ozon.fintech.permissions.ui.PermissionsScreenStateView;
import ru.ozon.fintech.ui.screenstate.ScreenState;
import s90.InterfaceC9636e;
import t90.AbstractC9781a;
import u90.C9987a;
import w40.InterfaceC10428a;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lf50/b;", "LX80/a;", "Lw40/a;", "<init>", "()V", "cbottom-pdf_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends X80.a implements InterfaceC10428a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f62770a = "CbottomPdfPreviewFragment";

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final y0 f62771b;

    /* renamed from: c, reason: collision with root package name */
    private C5747b f62772c;

    /* renamed from: d, reason: collision with root package name */
    private ViewPager2 f62773d;

    /* renamed from: e, reason: collision with root package name */
    private int f62774e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final a f62775f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f62776g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f62777h;

    public static final class a extends C {
        a() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            b.this.B().onBackPressed();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPreviewFragment$onViewCreated$$inlined$observe$1", f = "CbottomPdfPreviewFragment.kt", l = {33}, m = "invokeSuspend")
    /* renamed from: f50.b$b, reason: collision with other inner class name */
    public static final class C0994b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f62779d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f62780e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f62782g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f62783h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPreviewFragment$onViewCreated$$inlined$observe$1$1", f = "CbottomPdfPreviewFragment.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: f50.b$b$a */
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f62784d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f62785e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f62786f;

            /* renamed from: f50.b$b$a$a, reason: collision with other inner class name */
            public static final class C0995a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ b f62787a;

                public C0995a(b bVar) {
                    this.f62787a = bVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    e50.e eVar = (e50.e) t2;
                    b bVar = this.f62787a;
                    if (eVar != null) {
                        ViewPager2 viewPager2 = bVar.f62773d;
                        if ((viewPager2 != null ? viewPager2.e() : null) != null) {
                            viewPager2 = null;
                        }
                        if (viewPager2 != null) {
                            int b11 = eVar.b();
                            AbstractC5434v lifecycle = bVar.getLifecycle();
                            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                            G childFragmentManager = bVar.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            viewPager2.s(new n(b11, lifecycle, childFragmentManager));
                        }
                    }
                    if (eVar != null) {
                        ViewPager2 viewPager22 = bVar.f62773d;
                        if (viewPager22 != null) {
                            z.b(bVar.f62774e, viewPager22);
                        }
                    } else {
                        ViewPager2 viewPager23 = bVar.f62773d;
                        if (viewPager23 != null) {
                            viewPager23.setVisibility(8);
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, b bVar) {
                super(2, dVar);
                this.f62785e = interfaceC2395h;
                this.f62786f = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f62785e, dVar, this.f62786f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f62784d;
                if (i11 == 0) {
                    s.b(obj);
                    C0995a c0995a = new C0995a(this.f62786f);
                    this.f62784d = 1;
                    if (this.f62785e.collect(c0995a, this) == aVar) {
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
        public C0994b(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, b bVar) {
            super(2, dVar);
            this.f62782g = interfaceC2395h;
            this.f62783h = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C0994b c0994b = b.this.new C0994b(this.f62782g, dVar, this.f62783h);
            c0994b.f62780e = obj;
            return c0994b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0994b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f62779d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f62780e)) {
                    J viewLifecycleOwner = b.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f62782g, null, this.f62783h);
                    this.f62779d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPreviewFragment$onViewCreated$$inlined$observe$2", f = "CbottomPdfPreviewFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f62788d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f62789e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f62791g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f62792h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPreviewFragment$onViewCreated$$inlined$observe$2$1", f = "CbottomPdfPreviewFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f62793d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f62794e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f62795f;

            /* renamed from: f50.b$c$a$a, reason: collision with other inner class name */
            public static final class C0996a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ b f62796a;

                public C0996a(b bVar) {
                    this.f62796a = bVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    if (Intrinsics.d((Boolean) t2, Boolean.TRUE)) {
                        b bVar = this.f62796a;
                        List<ComponentCallbacksC5392m> r02 = bVar.getChildFragmentManager().r0();
                        Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
                        ArrayList arrayList = new ArrayList();
                        for (T t11 : r02) {
                            if (t11 instanceof e50.g) {
                                arrayList.add(t11);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((e50.g) it.next()).q();
                        }
                        bVar.B().O0();
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, b bVar) {
                super(2, dVar);
                this.f62794e = interfaceC2395h;
                this.f62795f = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f62794e, dVar, this.f62795f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f62793d;
                if (i11 == 0) {
                    s.b(obj);
                    C0996a c0996a = new C0996a(this.f62795f);
                    this.f62793d = 1;
                    if (this.f62794e.collect(c0996a, this) == aVar) {
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
        public c(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, b bVar) {
            super(2, dVar);
            this.f62791g = interfaceC2395h;
            this.f62792h = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = b.this.new c(this.f62791g, dVar, this.f62792h);
            cVar.f62789e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f62788d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f62789e)) {
                    J viewLifecycleOwner = b.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f62791g, null, this.f62792h);
                    this.f62788d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPreviewFragment$onViewCreated$$inlined$observe$3", f = "CbottomPdfPreviewFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f62797d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f62798e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f62800g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f62801h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPreviewFragment$onViewCreated$$inlined$observe$3$1", f = "CbottomPdfPreviewFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f62802d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f62803e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f62804f;

            /* renamed from: f50.b$d$a$a, reason: collision with other inner class name */
            public static final class C0997a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ b f62805a;

                public C0997a(b bVar) {
                    this.f62805a = bVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    C5747b c5747b;
                    ScreenState screenState = (ScreenState) t2;
                    b bVar = this.f62805a;
                    C5747b c5747b2 = bVar.f62772c;
                    if (c5747b2 != null) {
                        c5747b2.f56516e.setVisibility((screenState == null || (screenState instanceof ScreenState.Progress)) ? 8 : 0);
                    }
                    if (screenState instanceof ScreenState.Progress) {
                        C5747b c5747b3 = bVar.f62772c;
                        if (c5747b3 != null) {
                            ShimmerFrameLayout shimmerFrameLayout = c5747b3.f56517f;
                            shimmerFrameLayout.a();
                            shimmerFrameLayout.setVisibility(0);
                        }
                    } else {
                        C5747b c5747b4 = bVar.f62772c;
                        if (c5747b4 != null) {
                            ShimmerFrameLayout shimmerFrameLayout2 = c5747b4.f56517f;
                            shimmerFrameLayout2.b();
                            shimmerFrameLayout2.setVisibility(8);
                        }
                        if (screenState != null && (c5747b = bVar.f62772c) != null) {
                            c5747b.f56516e.bindState(screenState);
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, b bVar) {
                super(2, dVar);
                this.f62803e = interfaceC2395h;
                this.f62804f = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f62803e, dVar, this.f62804f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f62802d;
                if (i11 == 0) {
                    s.b(obj);
                    C0997a c0997a = new C0997a(this.f62804f);
                    this.f62802d = 1;
                    if (this.f62803e.collect(c0997a, this) == aVar) {
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
        public d(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, b bVar) {
            super(2, dVar);
            this.f62800g = interfaceC2395h;
            this.f62801h = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = b.this.new d(this.f62800g, dVar, this.f62801h);
            dVar2.f62798e = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f62797d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f62798e)) {
                    J viewLifecycleOwner = b.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f62800g, null, this.f62801h);
                    this.f62797d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPreviewFragment$onViewCreated$$inlined$observe$4", f = "CbottomPdfPreviewFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f62806d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f62807e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f62809g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f62810h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPreviewFragment$onViewCreated$$inlined$observe$4$1", f = "CbottomPdfPreviewFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f62811d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f62812e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f62813f;

            /* renamed from: f50.b$e$a$a, reason: collision with other inner class name */
            public static final class C0998a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ b f62814a;

                public C0998a(b bVar) {
                    this.f62814a = bVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    H40.a aVar = (H40.a) t2;
                    if (aVar != null) {
                        b bVar = this.f62814a;
                        C5747b c5747b = bVar.f62772c;
                        if (c5747b != null) {
                            CbottomUINoScrollableView cbottomUINoScrollableView = c5747b.f56513b;
                            cbottomUINoScrollableView.a(aVar);
                            cbottomUINoScrollableView.getViewTreeObserver().addOnGlobalLayoutListener(new i(cbottomUINoScrollableView, bVar, c5747b));
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, b bVar) {
                super(2, dVar);
                this.f62812e = interfaceC2395h;
                this.f62813f = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f62812e, dVar, this.f62813f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f62811d;
                if (i11 == 0) {
                    s.b(obj);
                    C0998a c0998a = new C0998a(this.f62813f);
                    this.f62811d = 1;
                    if (this.f62812e.collect(c0998a, this) == aVar) {
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
        public e(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, b bVar) {
            super(2, dVar);
            this.f62809g = interfaceC2395h;
            this.f62810h = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = b.this.new e(this.f62809g, dVar, this.f62810h);
            eVar.f62807e = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f62806d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f62807e)) {
                    J viewLifecycleOwner = b.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f62809g, null, this.f62810h);
                    this.f62806d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPreviewFragment$onViewCreated$$inlined$observe$5", f = "CbottomPdfPreviewFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f62815d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f62816e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f62818g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f62819h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPreviewFragment$onViewCreated$$inlined$observe$5$1", f = "CbottomPdfPreviewFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f62820d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f62821e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f62822f;

            /* renamed from: f50.b$f$a$a, reason: collision with other inner class name */
            public static final class C0999a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ b f62823a;

                public C0999a(b bVar) {
                    this.f62823a = bVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    b bVar = this.f62823a;
                    bVar.startActivity(Intent.createChooser((Intent) t2, bVar.requireContext().getString(R.string.fintech_cbottom_pdf_chooser_title)));
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, b bVar) {
                super(2, dVar);
                this.f62821e = c02;
                this.f62822f = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f62821e, dVar, this.f62822f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f62820d;
                if (i11 == 0) {
                    s.b(obj);
                    C0999a c0999a = new C0999a(this.f62822f);
                    this.f62820d = 1;
                    if (this.f62821e.collect(c0999a, this) == aVar) {
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
        public f(C0 c02, kotlin.coroutines.d dVar, b bVar) {
            super(2, dVar);
            this.f62818g = c02;
            this.f62819h = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = b.this.new f(this.f62818g, dVar, this.f62819h);
            fVar.f62816e = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f62815d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f62816e)) {
                    J viewLifecycleOwner = b.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f62818g, null, this.f62819h);
                    this.f62815d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPreviewFragment$onViewCreated$$inlined$observe$6", f = "CbottomPdfPreviewFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f62824d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f62825e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f62827g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f62828h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPreviewFragment$onViewCreated$$inlined$observe$6$1", f = "CbottomPdfPreviewFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f62829d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f62830e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f62831f;

            /* renamed from: f50.b$g$a$a, reason: collision with other inner class name */
            public static final class C1000a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ b f62832a;

                public C1000a(b bVar) {
                    this.f62832a = bVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    AbstractC9781a abstractC9781a = (AbstractC9781a) t2;
                    if (abstractC9781a != null) {
                        boolean z11 = abstractC9781a instanceof AbstractC9781a.b;
                        b bVar = this.f62832a;
                        if (z11) {
                            List<InterfaceC9636e> a11 = ((AbstractC9781a.b) abstractC9781a).a();
                            ArrayList arrayList = new ArrayList(C7714v.z(a11, 10));
                            Iterator<T> it = a11.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((InterfaceC9636e) it.next()).a());
                            }
                            bVar.requestPermissions((String[]) arrayList.toArray(new String[0]), 9314);
                        } else {
                            if (!(abstractC9781a instanceof AbstractC9781a.C2181a)) {
                                throw new Sc.o();
                            }
                            bVar.requireContext().startActivity(((AbstractC9781a.C2181a) abstractC9781a).a());
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, b bVar) {
                super(2, dVar);
                this.f62830e = c02;
                this.f62831f = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f62830e, dVar, this.f62831f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f62829d;
                if (i11 == 0) {
                    s.b(obj);
                    C1000a c1000a = new C1000a(this.f62831f);
                    this.f62829d = 1;
                    if (this.f62830e.collect(c1000a, this) == aVar) {
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
        public g(C0 c02, kotlin.coroutines.d dVar, b bVar) {
            super(2, dVar);
            this.f62827g = c02;
            this.f62828h = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            g gVar = b.this.new g(this.f62827g, dVar, this.f62828h);
            gVar.f62825e = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f62824d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f62825e)) {
                    J viewLifecycleOwner = b.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f62827g, null, this.f62828h);
                    this.f62824d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPreviewFragment$onViewCreated$$inlined$observe$7", f = "CbottomPdfPreviewFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f62833d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f62834e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f62836g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f62837h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPreviewFragment$onViewCreated$$inlined$observe$7$1", f = "CbottomPdfPreviewFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f62838d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f62839e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f62840f;

            /* renamed from: f50.b$h$a$a, reason: collision with other inner class name */
            public static final class C1001a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ b f62841a;

                public C1001a(b bVar) {
                    this.f62841a = bVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    C9987a c9987a = (C9987a) t2;
                    C5747b c5747b = this.f62841a.f62772c;
                    if (c5747b != null) {
                        PermissionsScreenStateView permissionsScreenStateView = c5747b.f56515d;
                        permissionsScreenStateView.setVisibility(c9987a != null ? 0 : 8);
                        if (c9987a != null) {
                            permissionsScreenStateView.c(c9987a);
                            permissionsScreenStateView.expand();
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, b bVar) {
                super(2, dVar);
                this.f62839e = interfaceC2395h;
                this.f62840f = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f62839e, dVar, this.f62840f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f62838d;
                if (i11 == 0) {
                    s.b(obj);
                    C1001a c1001a = new C1001a(this.f62840f);
                    this.f62838d = 1;
                    if (this.f62839e.collect(c1001a, this) == aVar) {
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
        public h(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, b bVar) {
            super(2, dVar);
            this.f62836g = interfaceC2395h;
            this.f62837h = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            h hVar = b.this.new h(this.f62836g, dVar, this.f62837h);
            hVar.f62834e = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f62833d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f62834e)) {
                    J viewLifecycleOwner = b.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f62836g, null, this.f62837h);
                    this.f62833d = 1;
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

    public static final class i implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CbottomUINoScrollableView f62842a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f62843b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C5747b f62844c;

        public i(CbottomUINoScrollableView cbottomUINoScrollableView, b bVar, C5747b c5747b) {
            this.f62842a = cbottomUINoScrollableView;
            this.f62843b = bVar;
            this.f62844c = c5747b;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            CbottomUINoScrollableView cbottomUINoScrollableView = this.f62842a;
            if (cbottomUINoScrollableView.getMeasuredWidth() <= 0 || cbottomUINoScrollableView.getMeasuredHeight() <= 0) {
                return;
            }
            cbottomUINoScrollableView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            b.A(this.f62843b, this.f62844c.f56513b.getF10592a().getBottom() / cbottomUINoScrollableView.getHeight());
        }
    }

    public static final class j extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return b.this;
        }
    }

    public static final class k extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f62846b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f62846b = jVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f62846b.invoke();
        }
    }

    public static final class l extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f62847b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f62847b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f62847b.getValue()).getViewModelStore();
        }
    }

    public static final class m extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f62848b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f62848b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f62848b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public b() {
        H90.a aVar = new H90.a(this, 1);
        InterfaceC4008j a11 = Sc.k.a(Sc.n.NONE, new k(new j()));
        this.f62771b = b0.b(this, kotlin.jvm.internal.N.b(f50.f.class), new l(a11), new m(a11), aVar);
        this.f62775f = new a();
        this.f62776g = true;
        this.f62777h = Sc.k.b(new D90.h(this, 3));
    }

    public static final void A(b bVar, float f7) {
        C5747b c5747b = bVar.f62772c;
        if (c5747b != null) {
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.p(c5747b.a());
            dVar.b0(f7, R.id.guideline_cbottom_header);
            dVar.f(c5747b.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f50.f B() {
        return (f50.f) this.f62771b.getValue();
    }

    public static boolean t(b bVar) {
        return bVar.B().N0();
    }

    public static void u(b bVar) {
        ConstraintLayout a11;
        C5747b c5747b = bVar.f62772c;
        if (c5747b == null || (a11 = c5747b.a()) == null) {
            return;
        }
        bVar.B().R0(a11.getMeasuredWidth(), a11.getMeasuredHeight());
    }

    public static void v(b bVar) {
        RecyclerView.o layoutManager;
        ViewPager2 viewPager2 = bVar.f62773d;
        if (viewPager2 != null) {
            viewPager2.v(2);
            viewPager2.w(1);
            View childAt = viewPager2.getChildAt(0);
            RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
            if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
                return;
            }
            layoutManager.setItemPrefetchEnabled(false);
        }
    }

    @Override // w40.InterfaceC10428a
    public final void action(String str) {
        B().C0(str);
    }

    @Override // E30.b
    /* renamed from: getDimAmount */
    public final float getF96848e() {
        return 0.0f;
    }

    @Override // E30.b
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public final String getF62770a() {
        return this.f62770a;
    }

    @Override // E30.b
    /* renamed from: getLightStatusBar, reason: from getter */
    public final boolean getF62776g() {
        return this.f62776g;
    }

    @Override // E30.b
    @NotNull
    public final C getOnBackPressedCallback() {
        return this.f62775f;
    }

    @Override // E30.b
    /* renamed from: isStandaloneIntegration */
    public final boolean getF96847d() {
        return ((Boolean) this.f62777h.getValue()).booleanValue();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((InterfaceC6091a) O30.a.a(O30.c.a(requireActivity)).a(InterfaceC6091a.class)).v0(this);
        super.onAttach(context);
        this.f62774e = getResources().getInteger(android.R.integer.config_shortAnimTime);
    }

    @Override // X80.a, E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        String uniqueUuid;
        super.onCreate(bundle);
        setStyle(2, R.style.Base_Ozon_FullScreenDialog);
        f50.f B11 = B();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("PARAMETER_JSON", null) : null;
        Bundle arguments2 = getArguments();
        Parcelable parcelable = arguments2 != null ? arguments2.getParcelable("PARAMETER_PARCELABLE") : null;
        Bundle arguments3 = getArguments();
        Integer valueOf = Integer.valueOf(arguments3 != null ? arguments3.getInt("PARAMETER_VERSION") : 2);
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (uniqueUuid = arguments4.getString("PARAMETER_UUID", getUniqueUuid())) == null) {
            uniqueUuid = getUniqueUuid();
        }
        B11.j0(string, parcelable, valueOf, uniqueUuid, null);
        B().g0();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C5747b b11 = C5747b.b(inflater, viewGroup);
        this.f62772c = b11;
        ConstraintLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // X80.a, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroy() {
        super.onDestroy();
        B().onDestroy();
        f50.f B11 = B();
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        B11.P0(requireActivity);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @InterfaceC3999a
    public final void onRequestPermissionsResult(int i11, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (permissions.length == 0) {
            return;
        }
        f50.f B11 = B();
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        B11.onPermissionResumeOrResult(requireActivity);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onResume() {
        super.onResume();
        f50.f B11 = B();
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        B11.onPermissionResumeOrResult(requireActivity);
    }

    public final void onScaleChange(float f7) {
        ViewPager2 viewPager2 = this.f62773d;
        if (viewPager2 != null) {
            viewPager2.y(f7 < 1.1f);
        }
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        B().onStart();
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        super.onStop();
        B().onStop();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Window window;
        ConstraintLayout a11;
        ConstraintLayout a12;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        f50.f B11 = B();
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        B11.M0(requireActivity);
        C5747b c5747b = this.f62772c;
        if (c5747b != null) {
            ViewPager2 viewPager2 = new ViewPager2(requireContext());
            viewPager2.setLayoutParams(new ConstraintLayout.b(-1, 0));
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            viewPager2.setId(View.generateViewId());
            c5747b.a().addView(viewPager2, 0);
            dVar.p(c5747b.a());
            dVar.t(viewPager2.getId(), 3, c5747b.f56514c.getId(), 4, 0);
            dVar.t(viewPager2.getId(), 6, 0, 6, 0);
            dVar.t(viewPager2.getId(), 7, 0, 7, 0);
            dVar.t(viewPager2.getId(), 4, 0, 4, 0);
            dVar.f(c5747b.a());
            this.f62773d = viewPager2;
            viewPager2.setVisibility(8);
            ViewPager2 viewPager22 = this.f62773d;
            if (viewPager22 != null) {
                D.c(viewPager22, 48.0f);
            }
        }
        C5747b c5747b2 = this.f62772c;
        if (c5747b2 != null && (a12 = c5747b2.a()) != null) {
            a12.post(new f0(this, 6));
        }
        androidx.activity.J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner, this.f62775f);
        x0<e50.e> I02 = B().I0();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new C0994b(I02, null, this), 3);
        x0<Boolean> L02 = B().L0();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner3), null, null, new c(L02, null, this), 3);
        x0<ScreenState> J02 = B().J0();
        J viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner4), null, null, new d(J02, null, this), 3);
        x0<H40.a> F02 = B().F0();
        J viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner5), null, null, new e(F02, null, this), 3);
        C0 K02 = B().K0();
        J viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner6), null, null, new f(K02, null, this), 3);
        w0<AbstractC9781a> permissionAction = B().getPermissionAction();
        J viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner7), null, null, new g((C0) permissionAction, null, this), 3);
        x0<C9987a> permissionScreenState = B().getPermissionScreenState();
        J viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner8), null, null, new h(permissionScreenState, null, this), 3);
        C5747b c5747b3 = this.f62772c;
        if (c5747b3 != null && (a11 = c5747b3.a()) != null) {
            a11.post(new g0(this, 6));
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        u.d(window);
    }

    @Override // w40.InterfaceC10428a
    @NotNull
    public final String provideId() {
        return B().i0();
    }

    @Override // w40.InterfaceC10428a
    public final void updateState(String str, Parcelable parcelable, int i11, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        B().j0(null, parcelable, 2, uuid, null);
    }
}
