package ru.ozon.fintech.features.demo.presentation;

import Ae.C0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import B90.H;
import Sc.InterfaceC4008j;
import Sc.n;
import Sc.s;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.f;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.detmir.recycli.adapters.RecyclerItem;
import f3.AbstractC6409a;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.demo.ui.income.DemoIncomeItemView;
import ru.ozon.fintech.features.demo.ui.message.DemoMessageItemView;
import ru.ozon.fintech.ui.button.large.FinLargeButtonState;
import ru.ozon.fintech.ui.button.large.FinLargeButtonView;
import ru.ozon.fintech.ui.common.TopBottomDecorator;
import ru.ozon.fintech.ui.screenstate.ScreenState;
import ru.ozon.fintech.ui.screenstate.ScreenStateView;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/fintech/features/demo/presentation/DemoFragment;", "LE30/c;", "<init>", "()V", "demo_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DemoFragment extends E30.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y0 f95436a;

    /* renamed from: b, reason: collision with root package name */
    private K50.a f95437b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f95438c;

    /* renamed from: d, reason: collision with root package name */
    private final int f95439d;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.demo.presentation.DemoFragment$onViewCreated$$inlined$observe$1", f = "DemoFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95440d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95441e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95443g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ DemoFragment f95444h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.demo.presentation.DemoFragment$onViewCreated$$inlined$observe$1$1", f = "DemoFragment.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: ru.ozon.fintech.features.demo.presentation.DemoFragment$a$a, reason: collision with other inner class name */
        public static final class C2030a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95445d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95446e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ DemoFragment f95447f;

            /* renamed from: ru.ozon.fintech.features.demo.presentation.DemoFragment$a$a$a, reason: collision with other inner class name */
            public static final class C2031a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ DemoFragment f95448a;

                public C2031a(DemoFragment demoFragment) {
                    this.f95448a = demoFragment;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    List list = (List) t2;
                    L80.a.a("DemoFragment", "observe recyclerState");
                    K50.a aVar = this.f95448a.f95437b;
                    if (aVar == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    RecyclerView recyclerView = aVar.f15287c;
                    Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                    com.detmir.recycli.adapters.d.a(recyclerView, list);
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2030a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, DemoFragment demoFragment) {
                super(2, dVar);
                this.f95446e = interfaceC2395h;
                this.f95447f = demoFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C2030a(this.f95446e, dVar, this.f95447f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C2030a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95445d;
                if (i11 == 0) {
                    s.b(obj);
                    C2031a c2031a = new C2031a(this.f95447f);
                    this.f95445d = 1;
                    if (this.f95446e.collect(c2031a, this) == aVar) {
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
        public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, DemoFragment demoFragment) {
            super(2, dVar);
            this.f95443g = interfaceC2395h;
            this.f95444h = demoFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = DemoFragment.this.new a(this.f95443g, dVar, this.f95444h);
            aVar.f95441e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95440d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95441e)) {
                    J viewLifecycleOwner = DemoFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    C2030a c2030a = new C2030a(this.f95443g, null, this.f95444h);
                    this.f95440d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, c2030a, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.demo.presentation.DemoFragment$onViewCreated$$inlined$observe$2", f = "DemoFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95449d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95450e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95452g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ DemoFragment f95453h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.demo.presentation.DemoFragment$onViewCreated$$inlined$observe$2$1", f = "DemoFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95454d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95455e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ DemoFragment f95456f;

            /* renamed from: ru.ozon.fintech.features.demo.presentation.DemoFragment$b$a$a, reason: collision with other inner class name */
            public static final class C2032a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ DemoFragment f95457a;

                public C2032a(DemoFragment demoFragment) {
                    this.f95457a = demoFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    FinToolbarState finToolbarState = (FinToolbarState) t2;
                    L80.a.a("DemoFragment", "observe toolbarState");
                    K50.a aVar = this.f95457a.f95437b;
                    if (aVar != null) {
                        aVar.f15290f.bindState(finToolbarState);
                        return Unit.f71690a;
                    }
                    Intrinsics.n("binding");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, DemoFragment demoFragment) {
                super(2, dVar);
                this.f95455e = interfaceC2395h;
                this.f95456f = demoFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95455e, dVar, this.f95456f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95454d;
                if (i11 == 0) {
                    s.b(obj);
                    C2032a c2032a = new C2032a(this.f95456f);
                    this.f95454d = 1;
                    if (this.f95455e.collect(c2032a, this) == aVar) {
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
        public b(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, DemoFragment demoFragment) {
            super(2, dVar);
            this.f95452g = interfaceC2395h;
            this.f95453h = demoFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = DemoFragment.this.new b(this.f95452g, dVar, this.f95453h);
            bVar.f95450e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95449d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95450e)) {
                    J viewLifecycleOwner = DemoFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95452g, null, this.f95453h);
                    this.f95449d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.demo.presentation.DemoFragment$onViewCreated$$inlined$observe$3", f = "DemoFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95458d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95459e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95461g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ DemoFragment f95462h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.demo.presentation.DemoFragment$onViewCreated$$inlined$observe$3$1", f = "DemoFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95463d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95464e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ DemoFragment f95465f;

            /* renamed from: ru.ozon.fintech.features.demo.presentation.DemoFragment$c$a$a, reason: collision with other inner class name */
            public static final class C2033a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ DemoFragment f95466a;

                public C2033a(DemoFragment demoFragment) {
                    this.f95466a = demoFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    ScreenState screenState = (ScreenState) t2;
                    L80.a.a("DemoFragment", "observe screenState");
                    DemoFragment demoFragment = this.f95466a;
                    K50.a aVar = demoFragment.f95437b;
                    if (aVar == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    ScreenStateView screenState2 = aVar.f15288d;
                    Intrinsics.checkNotNullExpressionValue(screenState2, "screenState");
                    screenState2.setVisibility(screenState != null ? 0 : 8);
                    if (screenState != null) {
                        K50.a aVar2 = demoFragment.f95437b;
                        if (aVar2 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        aVar2.f15288d.bindState(screenState);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, DemoFragment demoFragment) {
                super(2, dVar);
                this.f95464e = interfaceC2395h;
                this.f95465f = demoFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95464e, dVar, this.f95465f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95463d;
                if (i11 == 0) {
                    s.b(obj);
                    C2033a c2033a = new C2033a(this.f95465f);
                    this.f95463d = 1;
                    if (this.f95464e.collect(c2033a, this) == aVar) {
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
        public c(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, DemoFragment demoFragment) {
            super(2, dVar);
            this.f95461g = interfaceC2395h;
            this.f95462h = demoFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = DemoFragment.this.new c(this.f95461g, dVar, this.f95462h);
            cVar.f95459e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95458d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95459e)) {
                    J viewLifecycleOwner = DemoFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95461g, null, this.f95462h);
                    this.f95458d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.demo.presentation.DemoFragment$onViewCreated$$inlined$observe$4", f = "DemoFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95467d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95468e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95470g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ DemoFragment f95471h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.demo.presentation.DemoFragment$onViewCreated$$inlined$observe$4$1", f = "DemoFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95472d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95473e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ DemoFragment f95474f;

            /* renamed from: ru.ozon.fintech.features.demo.presentation.DemoFragment$d$a$a, reason: collision with other inner class name */
            public static final class C2034a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ DemoFragment f95475a;

                public C2034a(DemoFragment demoFragment) {
                    this.f95475a = demoFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    FinLargeButtonState finLargeButtonState = (FinLargeButtonState) t2;
                    L80.a.a("DemoFragment", "observe nextButtonState");
                    DemoFragment demoFragment = this.f95475a;
                    K50.a aVar = demoFragment.f95437b;
                    if (aVar == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    FinLargeButtonView gotoNext = aVar.f15286b;
                    Intrinsics.checkNotNullExpressionValue(gotoNext, "gotoNext");
                    gotoNext.setVisibility(finLargeButtonState != null ? 0 : 8);
                    if (finLargeButtonState != null) {
                        K50.a aVar2 = demoFragment.f95437b;
                        if (aVar2 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        aVar2.f15286b.bindState(finLargeButtonState);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, DemoFragment demoFragment) {
                super(2, dVar);
                this.f95473e = interfaceC2395h;
                this.f95474f = demoFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95473e, dVar, this.f95474f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95472d;
                if (i11 == 0) {
                    s.b(obj);
                    C2034a c2034a = new C2034a(this.f95474f);
                    this.f95472d = 1;
                    if (this.f95473e.collect(c2034a, this) == aVar) {
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
        public d(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, DemoFragment demoFragment) {
            super(2, dVar);
            this.f95470g = interfaceC2395h;
            this.f95471h = demoFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = DemoFragment.this.new d(this.f95470g, dVar, this.f95471h);
            dVar2.f95468e = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95467d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95468e)) {
                    J viewLifecycleOwner = DemoFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95470g, null, this.f95471h);
                    this.f95467d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.demo.presentation.DemoFragment$onViewCreated$$inlined$observe$5", f = "DemoFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95476d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95477e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95479g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ DemoFragment f95480h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.demo.presentation.DemoFragment$onViewCreated$$inlined$observe$5$1", f = "DemoFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95481d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95482e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ DemoFragment f95483f;

            /* renamed from: ru.ozon.fintech.features.demo.presentation.DemoFragment$e$a$a, reason: collision with other inner class name */
            public static final class C2035a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ DemoFragment f95484a;

                public C2035a(DemoFragment demoFragment) {
                    this.f95484a = demoFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    boolean booleanValue = ((Boolean) t2).booleanValue();
                    L80.a.a("DemoFragment", "observe refreshState");
                    K50.a aVar = this.f95484a.f95437b;
                    if (aVar != null) {
                        aVar.f15289e.setRefreshing(booleanValue);
                        return Unit.f71690a;
                    }
                    Intrinsics.n("binding");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, DemoFragment demoFragment) {
                super(2, dVar);
                this.f95482e = interfaceC2395h;
                this.f95483f = demoFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95482e, dVar, this.f95483f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95481d;
                if (i11 == 0) {
                    s.b(obj);
                    C2035a c2035a = new C2035a(this.f95483f);
                    this.f95481d = 1;
                    if (this.f95482e.collect(c2035a, this) == aVar) {
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
        public e(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, DemoFragment demoFragment) {
            super(2, dVar);
            this.f95479g = interfaceC2395h;
            this.f95480h = demoFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = DemoFragment.this.new e(this.f95479g, dVar, this.f95480h);
            eVar.f95477e = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95476d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95477e)) {
                    J viewLifecycleOwner = DemoFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95479g, null, this.f95480h);
                    this.f95476d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.demo.presentation.DemoFragment$onViewCreated$$inlined$observe$6", f = "DemoFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95485d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95486e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f95488g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ DemoFragment f95489h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.demo.presentation.DemoFragment$onViewCreated$$inlined$observe$6$1", f = "DemoFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95490d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f95491e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ DemoFragment f95492f;

            /* renamed from: ru.ozon.fintech.features.demo.presentation.DemoFragment$f$a$a, reason: collision with other inner class name */
            public static final class C2036a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ DemoFragment f95493a;

                public C2036a(DemoFragment demoFragment) {
                    this.f95493a = demoFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    String str = (String) t2;
                    L80.a.a("DemoFragment", "observe deleteAccount");
                    DemoFragment demoFragment = this.f95493a;
                    new f.a(demoFragment.requireContext()).setTitle("Удалить акк " + str + "?").h("Не", g.f95494a).m("Да", demoFragment.new h(str)).q();
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, DemoFragment demoFragment) {
                super(2, dVar);
                this.f95491e = c02;
                this.f95492f = demoFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95491e, dVar, this.f95492f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95490d;
                if (i11 == 0) {
                    s.b(obj);
                    C2036a c2036a = new C2036a(this.f95492f);
                    this.f95490d = 1;
                    if (this.f95491e.collect(c2036a, this) == aVar) {
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
        public f(C0 c02, kotlin.coroutines.d dVar, DemoFragment demoFragment) {
            super(2, dVar);
            this.f95488g = c02;
            this.f95489h = demoFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = DemoFragment.this.new f(this.f95488g, dVar, this.f95489h);
            fVar.f95486e = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95485d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95486e)) {
                    J viewLifecycleOwner = DemoFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95488g, null, this.f95489h);
                    this.f95485d = 1;
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

    static final class g implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public static final g f95494a = new g();

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
            dialogInterface.cancel();
        }
    }

    static final class h implements DialogInterface.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f95496b;

        h(String str) {
            this.f95496b = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
            dialogInterface.cancel();
            DemoFragment.this.w().deleteAccount(this.f95496b);
        }
    }

    public static final class i extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return DemoFragment.this;
        }
    }

    public static final class j extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f95498b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f95498b = iVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f95498b.invoke();
        }
    }

    public static final class k extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95499b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95499b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f95499b.getValue()).getViewModelStore();
        }
    }

    public static final class l extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95500b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95500b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f95500b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public DemoFragment() {
        N50.a aVar = new N50.a(this, 0);
        InterfaceC4008j a11 = Sc.k.a(n.NONE, new j(new i()));
        this.f95436a = b0.b(this, kotlin.jvm.internal.N.b(N50.e.class), new k(a11), new l(a11), aVar);
        this.f95438c = "DemoFragment";
        this.f95439d = Color.argb(255, new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255));
    }

    public static void t(DemoFragment demoFragment) {
        demoFragment.w().F0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final N50.e w() {
        return (N50.e) this.f95436a.getValue();
    }

    @Override // E30.c
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public final String getF35376a() {
        return this.f95438c;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((L50.b) O30.a.a(O30.c.a(requireActivity)).a(L50.b.class)).m0(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        K50.a b11 = K50.a.b(inflater, viewGroup);
        this.f95437b = b11;
        ConstraintLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        RecyclerView.n nVar;
        RecyclerView.n nVar2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        K50.a aVar = this.f95437b;
        if (aVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        aVar.a().setBackgroundColor(this.f95439d);
        Bundle arguments = getArguments();
        if (arguments != null) {
            w().E0(arguments.getInt("ID_KEY"));
        }
        K50.a aVar2 = this.f95437b;
        if (aVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        aVar2.f15287c.setLayoutManager(new LinearLayoutManager(getContext()));
        K50.a aVar3 = this.f95437b;
        if (aVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        RecyclerView recyclerView = aVar3.f15287c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        H30.r.a(recyclerView);
        K50.a aVar4 = this.f95437b;
        if (aVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        DemoMessageItemView.INSTANCE.getClass();
        nVar = DemoMessageItemView.decoration;
        aVar4.f15287c.addItemDecoration(nVar);
        K50.a aVar5 = this.f95437b;
        if (aVar5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        DemoIncomeItemView.INSTANCE.getClass();
        nVar2 = DemoIncomeItemView.decoration;
        aVar5.f15287c.addItemDecoration(nVar2);
        K50.a aVar6 = this.f95437b;
        if (aVar6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        aVar6.f15287c.addItemDecoration(new TopBottomDecorator(E30.f.i(), E30.f.b()));
        K50.a aVar7 = this.f95437b;
        if (aVar7 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        aVar7.f15289e.setOnRefreshListener(new H(this));
        x0<List<RecyclerItem>> A02 = w().A0();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new a(A02, null, this), 3);
        x0<FinToolbarState> D02 = w().D0();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new b(D02, null, this), 3);
        x0<ScreenState> C02 = w().C0();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner3), null, null, new c(C02, null, this), 3);
        x0<FinLargeButtonState> z02 = w().z0();
        J viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner4), null, null, new d(z02, null, this), 3);
        x0<Boolean> B02 = w().B0();
        J viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner5), null, null, new e(B02, null, this), 3);
        C0 y02 = w().y0();
        J viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner6), null, null, new f(y02, null, this), 3);
    }
}
