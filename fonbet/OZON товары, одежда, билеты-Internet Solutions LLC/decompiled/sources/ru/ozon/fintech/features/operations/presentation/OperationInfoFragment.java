package ru.ozon.fintech.features.operations.presentation;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import H30.z;
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
import com.facebook.shimmer.ShimmerFrameLayout;
import f3.AbstractC6409a;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.operations.ui.actioncard.ActionCardView;
import ru.ozon.fintech.features.operations.ui.operationinfo.OperationInfoCardView;
import ru.ozon.fintech.ui.screenstate.ScreenState;
import ru.ozon.fintech.ui.screenstate.ScreenStateView;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/fintech/features/operations/presentation/OperationInfoFragment;", "LE30/c;", "<init>", "()V", "operations_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OperationInfoFragment extends E30.c {

    /* renamed from: a, reason: collision with root package name */
    private A70.b f95968a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final y0 f95969b;

    /* renamed from: c, reason: collision with root package name */
    private int f95970c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f95971d;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.operations.presentation.OperationInfoFragment$onViewCreated$$inlined$observe$1", f = "OperationInfoFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95972d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95973e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95975g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OperationInfoFragment f95976h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.operations.presentation.OperationInfoFragment$onViewCreated$$inlined$observe$1$1", f = "OperationInfoFragment.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: ru.ozon.fintech.features.operations.presentation.OperationInfoFragment$a$a, reason: collision with other inner class name */
        public static final class C2057a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95977d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95978e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ OperationInfoFragment f95979f;

            /* renamed from: ru.ozon.fintech.features.operations.presentation.OperationInfoFragment$a$a$a, reason: collision with other inner class name */
            public static final class C2058a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OperationInfoFragment f95980a;

                public C2058a(OperationInfoFragment operationInfoFragment) {
                    this.f95980a = operationInfoFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    FinToolbarState finToolbarState = (FinToolbarState) t2;
                    A70.b bVar = this.f95980a.f95968a;
                    if (bVar != null) {
                        bVar.f541g.bindState(finToolbarState);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2057a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OperationInfoFragment operationInfoFragment) {
                super(2, dVar);
                this.f95978e = interfaceC2395h;
                this.f95979f = operationInfoFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C2057a(this.f95978e, dVar, this.f95979f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C2057a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95977d;
                if (i11 == 0) {
                    s.b(obj);
                    C2058a c2058a = new C2058a(this.f95979f);
                    this.f95977d = 1;
                    if (this.f95978e.collect(c2058a, this) == aVar) {
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
        public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OperationInfoFragment operationInfoFragment) {
            super(2, dVar);
            this.f95975g = interfaceC2395h;
            this.f95976h = operationInfoFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = OperationInfoFragment.this.new a(this.f95975g, dVar, this.f95976h);
            aVar.f95973e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95972d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95973e)) {
                    J viewLifecycleOwner = OperationInfoFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    C2057a c2057a = new C2057a(this.f95975g, null, this.f95976h);
                    this.f95972d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, c2057a, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.operations.presentation.OperationInfoFragment$onViewCreated$$inlined$observe$2", f = "OperationInfoFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95981d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95982e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95984g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OperationInfoFragment f95985h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.operations.presentation.OperationInfoFragment$onViewCreated$$inlined$observe$2$1", f = "OperationInfoFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95986d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95987e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ OperationInfoFragment f95988f;

            /* renamed from: ru.ozon.fintech.features.operations.presentation.OperationInfoFragment$b$a$a, reason: collision with other inner class name */
            public static final class C2059a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OperationInfoFragment f95989a;

                public C2059a(OperationInfoFragment operationInfoFragment) {
                    this.f95989a = operationInfoFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    ru.ozon.fintech.features.operations.ui.operationinfo.a aVar = (ru.ozon.fintech.features.operations.ui.operationinfo.a) t2;
                    OperationInfoFragment operationInfoFragment = this.f95989a;
                    if (aVar != null) {
                        A70.b bVar = operationInfoFragment.f95968a;
                        if (bVar != null) {
                            OperationInfoCardView operationInfoCardView = bVar.f538d;
                            operationInfoCardView.c(aVar);
                            z.b(operationInfoFragment.f95970c, operationInfoCardView);
                        }
                    } else {
                        A70.b bVar2 = operationInfoFragment.f95968a;
                        if (bVar2 != null) {
                            bVar2.f538d.setVisibility(8);
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OperationInfoFragment operationInfoFragment) {
                super(2, dVar);
                this.f95987e = interfaceC2395h;
                this.f95988f = operationInfoFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95987e, dVar, this.f95988f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95986d;
                if (i11 == 0) {
                    s.b(obj);
                    C2059a c2059a = new C2059a(this.f95988f);
                    this.f95986d = 1;
                    if (this.f95987e.collect(c2059a, this) == aVar) {
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
        public b(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OperationInfoFragment operationInfoFragment) {
            super(2, dVar);
            this.f95984g = interfaceC2395h;
            this.f95985h = operationInfoFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = OperationInfoFragment.this.new b(this.f95984g, dVar, this.f95985h);
            bVar.f95982e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95981d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95982e)) {
                    J viewLifecycleOwner = OperationInfoFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95984g, null, this.f95985h);
                    this.f95981d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.operations.presentation.OperationInfoFragment$onViewCreated$$inlined$observe$3", f = "OperationInfoFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95990d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95991e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95993g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OperationInfoFragment f95994h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.operations.presentation.OperationInfoFragment$onViewCreated$$inlined$observe$3$1", f = "OperationInfoFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95995d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95996e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ OperationInfoFragment f95997f;

            /* renamed from: ru.ozon.fintech.features.operations.presentation.OperationInfoFragment$c$a$a, reason: collision with other inner class name */
            public static final class C2060a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OperationInfoFragment f95998a;

                public C2060a(OperationInfoFragment operationInfoFragment) {
                    this.f95998a = operationInfoFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    ScreenState screenState = (ScreenState) t2;
                    boolean z11 = screenState instanceof ScreenState.Progress;
                    OperationInfoFragment operationInfoFragment = this.f95998a;
                    if (z11) {
                        A70.b bVar = operationInfoFragment.f95968a;
                        if (bVar != null) {
                            bVar.f540f.a();
                        }
                    } else if (screenState instanceof ScreenState.Error) {
                        A70.b bVar2 = operationInfoFragment.f95968a;
                        if (bVar2 != null) {
                            bVar2.f540f.b();
                            bVar2.f539e.bindState(screenState);
                        }
                    } else {
                        A70.b bVar3 = operationInfoFragment.f95968a;
                        if (bVar3 != null) {
                            bVar3.f540f.b();
                        }
                    }
                    A70.b bVar4 = operationInfoFragment.f95968a;
                    if (bVar4 != null) {
                        ScreenStateView screenState2 = bVar4.f539e;
                        Intrinsics.checkNotNullExpressionValue(screenState2, "screenState");
                        screenState2.setVisibility(screenState instanceof ScreenState.Error ? 0 : 8);
                        ShimmerFrameLayout shimmerPlaceholder = bVar4.f540f;
                        Intrinsics.checkNotNullExpressionValue(shimmerPlaceholder, "shimmerPlaceholder");
                        shimmerPlaceholder.setVisibility(z11 ? 0 : 8);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OperationInfoFragment operationInfoFragment) {
                super(2, dVar);
                this.f95996e = interfaceC2395h;
                this.f95997f = operationInfoFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95996e, dVar, this.f95997f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95995d;
                if (i11 == 0) {
                    s.b(obj);
                    C2060a c2060a = new C2060a(this.f95997f);
                    this.f95995d = 1;
                    if (this.f95996e.collect(c2060a, this) == aVar) {
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
        public c(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OperationInfoFragment operationInfoFragment) {
            super(2, dVar);
            this.f95993g = interfaceC2395h;
            this.f95994h = operationInfoFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = OperationInfoFragment.this.new c(this.f95993g, dVar, this.f95994h);
            cVar.f95991e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95990d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95991e)) {
                    J viewLifecycleOwner = OperationInfoFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95993g, null, this.f95994h);
                    this.f95990d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.operations.presentation.OperationInfoFragment$onViewCreated$$inlined$observe$4", f = "OperationInfoFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95999d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96000e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96002g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OperationInfoFragment f96003h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.operations.presentation.OperationInfoFragment$onViewCreated$$inlined$observe$4$1", f = "OperationInfoFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96004d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96005e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ OperationInfoFragment f96006f;

            /* renamed from: ru.ozon.fintech.features.operations.presentation.OperationInfoFragment$d$a$a, reason: collision with other inner class name */
            public static final class C2061a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OperationInfoFragment f96007a;

                public C2061a(OperationInfoFragment operationInfoFragment) {
                    this.f96007a = operationInfoFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    G70.a aVar = (G70.a) t2;
                    OperationInfoFragment operationInfoFragment = this.f96007a;
                    if (aVar != null) {
                        A70.b bVar = operationInfoFragment.f95968a;
                        if (bVar != null) {
                            ActionCardView actionCardView = bVar.f536b;
                            actionCardView.b(aVar);
                            actionCardView.setVisibility(0);
                        }
                    } else {
                        A70.b bVar2 = operationInfoFragment.f95968a;
                        if (bVar2 != null) {
                            bVar2.f539e.setVisibility(8);
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OperationInfoFragment operationInfoFragment) {
                super(2, dVar);
                this.f96005e = interfaceC2395h;
                this.f96006f = operationInfoFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96005e, dVar, this.f96006f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96004d;
                if (i11 == 0) {
                    s.b(obj);
                    C2061a c2061a = new C2061a(this.f96006f);
                    this.f96004d = 1;
                    if (this.f96005e.collect(c2061a, this) == aVar) {
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
        public d(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OperationInfoFragment operationInfoFragment) {
            super(2, dVar);
            this.f96002g = interfaceC2395h;
            this.f96003h = operationInfoFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = OperationInfoFragment.this.new d(this.f96002g, dVar, this.f96003h);
            dVar2.f96000e = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95999d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96000e)) {
                    J viewLifecycleOwner = OperationInfoFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96002g, null, this.f96003h);
                    this.f95999d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.operations.presentation.OperationInfoFragment$onViewCreated$$inlined$observe$5", f = "OperationInfoFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class e extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96008d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96009e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96011g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OperationInfoFragment f96012h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.operations.presentation.OperationInfoFragment$onViewCreated$$inlined$observe$5$1", f = "OperationInfoFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96013d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96014e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ OperationInfoFragment f96015f;

            /* renamed from: ru.ozon.fintech.features.operations.presentation.OperationInfoFragment$e$a$a, reason: collision with other inner class name */
            public static final class C2062a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OperationInfoFragment f96016a;

                public C2062a(OperationInfoFragment operationInfoFragment) {
                    this.f96016a = operationInfoFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    G70.a aVar = (G70.a) t2;
                    OperationInfoFragment operationInfoFragment = this.f96016a;
                    if (aVar != null) {
                        A70.b bVar = operationInfoFragment.f95968a;
                        if (bVar != null) {
                            ActionCardView actionCardView = bVar.f537c;
                            actionCardView.b(aVar);
                            actionCardView.setVisibility(0);
                        }
                    } else {
                        A70.b bVar2 = operationInfoFragment.f95968a;
                        if (bVar2 != null) {
                            bVar2.f537c.setVisibility(8);
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OperationInfoFragment operationInfoFragment) {
                super(2, dVar);
                this.f96014e = interfaceC2395h;
                this.f96015f = operationInfoFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96014e, dVar, this.f96015f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96013d;
                if (i11 == 0) {
                    s.b(obj);
                    C2062a c2062a = new C2062a(this.f96015f);
                    this.f96013d = 1;
                    if (this.f96014e.collect(c2062a, this) == aVar) {
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
        public e(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OperationInfoFragment operationInfoFragment) {
            super(2, dVar);
            this.f96011g = interfaceC2395h;
            this.f96012h = operationInfoFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = OperationInfoFragment.this.new e(this.f96011g, dVar, this.f96012h);
            eVar.f96009e = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96008d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96009e)) {
                    J viewLifecycleOwner = OperationInfoFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96011g, null, this.f96012h);
                    this.f96008d = 1;
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

    public static final class f extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return OperationInfoFragment.this;
        }
    }

    public static final class g extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f96018b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f96018b = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f96018b.invoke();
        }
    }

    public static final class h extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96019b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96019b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f96019b.getValue()).getViewModelStore();
        }
    }

    public static final class i extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96020b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96020b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f96020b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public OperationInfoFragment() {
        F70.a aVar = new F70.a(this, 0);
        InterfaceC4008j a11 = k.a(n.NONE, new g(new f()));
        this.f95969b = b0.b(this, kotlin.jvm.internal.N.b(ru.ozon.fintech.features.operations.presentation.a.class), new h(a11), new i(a11), aVar);
        this.f95971d = "OperationInfoFragment";
    }

    private final ru.ozon.fintech.features.operations.presentation.a v() {
        return (ru.ozon.fintech.features.operations.presentation.a) this.f95969b.getValue();
    }

    @Override // E30.c
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public final String getF95971d() {
        return this.f95971d;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((B70.b) O30.a.a(O30.c.a(requireActivity)).a(B70.b.class)).u1(this);
        this.f95970c = getResources().getInteger(R.integer.config_shortAnimTime);
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("id_key", "");
            String string2 = arguments.getString("type_key");
            C70.c cVar = null;
            if (string2 != null) {
                Intrinsics.checkNotNullParameter(string2, "<this>");
                try {
                    String upperCase = string2.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    cVar = C70.c.valueOf(upperCase);
                } catch (NoSuchElementException unused) {
                }
            }
            ru.ozon.fintech.features.operations.presentation.a v11 = v();
            Intrinsics.f(string);
            v11.B0(string, cVar);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        A70.b b11 = A70.b.b(inflater, viewGroup);
        this.f95968a = b11;
        ConstraintLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        x0<FinToolbarState> z02 = v().z0();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new a(z02, null, this), 3);
        x0<ru.ozon.fintech.features.operations.ui.operationinfo.a> v02 = v().v0();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new b(v02, null, this), 3);
        x0<ScreenState> y02 = v().y0();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner3), null, null, new c(y02, null, this), 3);
        x0<G70.a> u02 = v().u0();
        J viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner4), null, null, new d(u02, null, this), 3);
        x0<G70.a> t02 = v().t0();
        J viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner5), null, null, new e(t02, null, this), 3);
    }
}
