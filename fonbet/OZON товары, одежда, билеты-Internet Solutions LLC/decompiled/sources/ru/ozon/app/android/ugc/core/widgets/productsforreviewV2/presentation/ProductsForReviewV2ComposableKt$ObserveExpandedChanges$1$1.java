package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import m0.C7980b;
import m0.C8008p;
import ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductVI;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductsForReviewV2ComposableKt$ObserveExpandedChanges$1$1", f = "ProductsForReviewV2Composable.kt", l = {487}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ProductsForReviewV2ComposableKt$ObserveExpandedChanges$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ C7980b<Float, C8008p> $offsetX;
    final /* synthetic */ ProductVI.SwipeActionsVI $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductsForReviewV2ComposableKt$ObserveExpandedChanges$1$1(ProductVI.SwipeActionsVI swipeActionsVI, C7980b<Float, C8008p> c7980b, d<? super ProductsForReviewV2ComposableKt$ObserveExpandedChanges$1$1> dVar) {
        super(2, dVar);
        this.$state = swipeActionsVI;
        this.$offsetX = c7980b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ProductsForReviewV2ComposableKt$ObserveExpandedChanges$1$1(this.$state, this.$offsetX, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object smoothAnimateTo;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (!this.$state.getIsExpanded() && this.$offsetX.k().floatValue() != 0.0f) {
                C7980b<Float, C8008p> c7980b = this.$offsetX;
                this.label = 1;
                smoothAnimateTo = ProductsForReviewV2ComposableKt.smoothAnimateTo(c7980b, 0.0f, this);
                if (smoothAnimateTo == aVar) {
                    return aVar;
                }
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
        return ((ProductsForReviewV2ComposableKt$ObserveExpandedChanges$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
