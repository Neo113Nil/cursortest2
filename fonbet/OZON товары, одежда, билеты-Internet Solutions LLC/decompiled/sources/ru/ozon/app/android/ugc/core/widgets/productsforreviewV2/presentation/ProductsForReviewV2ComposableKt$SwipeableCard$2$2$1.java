package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation;

import Sc.s;
import Wc.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m0.C7980b;
import m0.C8008p;
import ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductVI;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.android.haptic.HapticVibrator;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$SwipeAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductsForReviewV2ComposableKt$SwipeableCard$2$2$1 extends AbstractC7737t implements Function1<ProductVI.SwipeAction, Unit> {
    final /* synthetic */ C7980b<Float, C8008p> $offsetX;
    final /* synthetic */ Function1<ProductVI.SwipeAction, Unit> $onSwipeActionClick;
    final /* synthetic */ M $scope;
    final /* synthetic */ View $view;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductsForReviewV2ComposableKt$SwipeableCard$2$2$1$1", f = "ProductsForReviewV2Composable.kt", l = {195}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductsForReviewV2ComposableKt$SwipeableCard$2$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ ProductVI.SwipeAction $it;
        final /* synthetic */ C7980b<Float, C8008p> $offsetX;
        final /* synthetic */ Function1<ProductVI.SwipeAction, Unit> $onSwipeActionClick;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(C7980b<Float, C8008p> c7980b, Function1<? super ProductVI.SwipeAction, Unit> function1, ProductVI.SwipeAction swipeAction, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$offsetX = c7980b;
            this.$onSwipeActionClick = function1;
            this.$it = swipeAction;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$offsetX, this.$onSwipeActionClick, this.$it, dVar);
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
            this.$onSwipeActionClick.invoke(this.$it);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ProductsForReviewV2ComposableKt$SwipeableCard$2$2$1(View view, M m11, C7980b<Float, C8008p> c7980b, Function1<? super ProductVI.SwipeAction, Unit> function1) {
        super(1);
        this.$view = view;
        this.$scope = m11;
        this.$offsetX = c7980b;
        this.$onSwipeActionClick = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ProductVI.SwipeAction swipeAction) {
        invoke2(swipeAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ProductVI.SwipeAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        HapticVibrator.INSTANCE.vibrate(this.$view, HapticToken.LIGHT);
        C10727i.c(this.$scope, null, null, new AnonymousClass1(this.$offsetX, this.$onSwipeActionClick, it, null), 3);
    }
}
