package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation;

import Sc.s;
import WZ.t;
import Wc.a;
import androidx.compose.foundation.gestures.C5177u;
import k1.C7459e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import m0.C7980b;
import m0.C8008p;
import ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductVI;
import x1.F;
import x1.x;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx1/F;", "", "<anonymous>", "(Lx1/F;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductsForReviewV2ComposableKt$DraggableCardContent$2$1", f = "ProductsForReviewV2Composable.kt", l = {227}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ProductsForReviewV2ComposableKt$DraggableCardContent$2$1 extends j implements Function2<F, d<? super Unit>, Object> {
    final /* synthetic */ float $actionsWidthPx;
    final /* synthetic */ C7980b<Float, C8008p> $offsetX;
    final /* synthetic */ Function0<Unit> $onSwipeStarted;
    final /* synthetic */ Function1<t, Unit> $onView;
    final /* synthetic */ M $scope;
    final /* synthetic */ ProductVI.SwipeActionsVI $state;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk1/e;", "it", "", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductsForReviewV2ComposableKt$DraggableCardContent$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<C7459e, Unit> {
        final /* synthetic */ Function0<Unit> $onSwipeStarted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function0<Unit> function0) {
            super(1);
            this.$onSwipeStarted = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C7459e c7459e) {
            m1496invokek4lQ0M(c7459e.n());
            return Unit.f71690a;
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m1496invokek4lQ0M(long j11) {
            this.$onSwipeStarted.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductsForReviewV2ComposableKt$DraggableCardContent$2$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ float $actionsWidthPx;
        final /* synthetic */ C7980b<Float, C8008p> $offsetX;
        final /* synthetic */ Function1<t, Unit> $onView;
        final /* synthetic */ M $scope;
        final /* synthetic */ ProductVI.SwipeActionsVI $state;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductsForReviewV2ComposableKt$DraggableCardContent$2$1$2$1", f = "ProductsForReviewV2Composable.kt", l = {233, 236}, m = "invokeSuspend")
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductsForReviewV2ComposableKt$DraggableCardContent$2$1$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
            final /* synthetic */ float $actionsWidthPx;
            final /* synthetic */ C7980b<Float, C8008p> $offsetX;
            final /* synthetic */ Function1<t, Unit> $onView;
            final /* synthetic */ ProductVI.SwipeActionsVI $state;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(C7980b<Float, C8008p> c7980b, float f7, ProductVI.SwipeActionsVI swipeActionsVI, Function1<? super t, Unit> function1, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$offsetX = c7980b;
                this.$actionsWidthPx = f7;
                this.$state = swipeActionsVI;
                this.$onView = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new AnonymousClass1(this.$offsetX, this.$actionsWidthPx, this.$state, this.$onView, dVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
            
                if (r6 == r0) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
            
                if (r6 == r0) goto L20;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object smoothAnimateTo;
                Object smoothAnimateTo2;
                a aVar = a.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    s.b(obj);
                    float floatValue = this.$offsetX.k().floatValue();
                    float f7 = -this.$actionsWidthPx;
                    if (floatValue < 0.8f * f7) {
                        C7980b<Float, C8008p> c7980b = this.$offsetX;
                        this.label = 1;
                        smoothAnimateTo2 = ProductsForReviewV2ComposableKt.smoothAnimateTo(c7980b, f7, this);
                    } else {
                        C7980b<Float, C8008p> c7980b2 = this.$offsetX;
                        this.label = 2;
                        smoothAnimateTo = ProductsForReviewV2ComposableKt.smoothAnimateTo(c7980b2, 0.0f, this);
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    s.b(obj);
                    t tokenizedEvent = this.$state.getTokenizedEvent();
                    if (tokenizedEvent != null) {
                        this.$onView.invoke(tokenizedEvent);
                        Unit unit = Unit.f71690a;
                    }
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, d<? super Unit> dVar) {
                return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(M m11, C7980b<Float, C8008p> c7980b, float f7, ProductVI.SwipeActionsVI swipeActionsVI, Function1<? super t, Unit> function1) {
            super(0);
            this.$scope = m11;
            this.$offsetX = c7980b;
            this.$actionsWidthPx = f7;
            this.$state = swipeActionsVI;
            this.$onView = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C10727i.c(this.$scope, null, null, new AnonymousClass1(this.$offsetX, this.$actionsWidthPx, this.$state, this.$onView, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductsForReviewV2ComposableKt$DraggableCardContent$2$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ C7980b<Float, C8008p> $offsetX;
        final /* synthetic */ M $scope;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductsForReviewV2ComposableKt$DraggableCardContent$2$1$3$1", f = "ProductsForReviewV2Composable.kt", l = {243}, m = "invokeSuspend")
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductsForReviewV2ComposableKt$DraggableCardContent$2$1$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
            final /* synthetic */ C7980b<Float, C8008p> $offsetX;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(C7980b<Float, C8008p> c7980b, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$offsetX = c7980b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new AnonymousClass1(this.$offsetX, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object smoothAnimateTo;
                a aVar = a.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    s.b(obj);
                    C7980b<Float, C8008p> c7980b = this.$offsetX;
                    this.label = 1;
                    smoothAnimateTo = ProductsForReviewV2ComposableKt.smoothAnimateTo(c7980b, 0.0f, this);
                    if (smoothAnimateTo == aVar) {
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

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, d<? super Unit> dVar) {
                return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(M m11, C7980b<Float, C8008p> c7980b) {
            super(0);
            this.$scope = m11;
            this.$offsetX = c7980b;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C10727i.c(this.$scope, null, null, new AnonymousClass1(this.$offsetX, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx1/x;", "<unused var>", "", "dragAmount", "", "invoke", "(Lx1/x;F)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductsForReviewV2ComposableKt$DraggableCardContent$2$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function2<x, Float, Unit> {
        final /* synthetic */ float $actionsWidthPx;
        final /* synthetic */ C7980b<Float, C8008p> $offsetX;
        final /* synthetic */ M $scope;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductsForReviewV2ComposableKt$DraggableCardContent$2$1$4$1", f = "ProductsForReviewV2Composable.kt", l = {251}, m = "invokeSuspend")
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductsForReviewV2ComposableKt$DraggableCardContent$2$1$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
            final /* synthetic */ float $actionsWidthPx;
            final /* synthetic */ float $dragAmount;
            final /* synthetic */ C7980b<Float, C8008p> $offsetX;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(C7980b<Float, C8008p> c7980b, float f7, float f11, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$offsetX = c7980b;
                this.$dragAmount = f7;
                this.$actionsWidthPx = f11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new AnonymousClass1(this.$offsetX, this.$dragAmount, this.$actionsWidthPx, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    s.b(obj);
                    float d11 = h.d(this.$offsetX.k().floatValue() + this.$dragAmount, -this.$actionsWidthPx, 0.0f);
                    C7980b<Float, C8008p> c7980b = this.$offsetX;
                    Float f7 = new Float(d11);
                    this.label = 1;
                    if (c7980b.m(f7, this) == aVar) {
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

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, d<? super Unit> dVar) {
                return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(M m11, C7980b<Float, C8008p> c7980b, float f7) {
            super(2);
            this.$scope = m11;
            this.$offsetX = c7980b;
            this.$actionsWidthPx = f7;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(x xVar, Float f7) {
            invoke(xVar, f7.floatValue());
            return Unit.f71690a;
        }

        public final void invoke(x xVar, float f7) {
            Intrinsics.checkNotNullParameter(xVar, "<unused var>");
            C10727i.c(this.$scope, null, null, new AnonymousClass1(this.$offsetX, f7, this.$actionsWidthPx, null), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ProductsForReviewV2ComposableKt$DraggableCardContent$2$1(Function0<Unit> function0, M m11, C7980b<Float, C8008p> c7980b, float f7, ProductVI.SwipeActionsVI swipeActionsVI, Function1<? super t, Unit> function1, d<? super ProductsForReviewV2ComposableKt$DraggableCardContent$2$1> dVar) {
        super(2, dVar);
        this.$onSwipeStarted = function0;
        this.$scope = m11;
        this.$offsetX = c7980b;
        this.$actionsWidthPx = f7;
        this.$state = swipeActionsVI;
        this.$onView = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ProductsForReviewV2ComposableKt$DraggableCardContent$2$1 productsForReviewV2ComposableKt$DraggableCardContent$2$1 = new ProductsForReviewV2ComposableKt$DraggableCardContent$2$1(this.$onSwipeStarted, this.$scope, this.$offsetX, this.$actionsWidthPx, this.$state, this.$onView, dVar);
        productsForReviewV2ComposableKt$DraggableCardContent$2$1.L$0 = obj;
        return productsForReviewV2ComposableKt$DraggableCardContent$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            F f7 = (F) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onSwipeStarted);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$scope, this.$offsetX, this.$actionsWidthPx, this.$state, this.$onView);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$scope, this.$offsetX);
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$scope, this.$offsetX, this.$actionsWidthPx);
            this.label = 1;
            if (C5177u.g(f7, anonymousClass1, anonymousClass2, anonymousClass3, anonymousClass4, this) == aVar) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(F f7, d<? super Unit> dVar) {
        return ((ProductsForReviewV2ComposableKt$DraggableCardContent$2$1) create(f7, dVar)).invokeSuspend(Unit.f71690a);
    }
}
