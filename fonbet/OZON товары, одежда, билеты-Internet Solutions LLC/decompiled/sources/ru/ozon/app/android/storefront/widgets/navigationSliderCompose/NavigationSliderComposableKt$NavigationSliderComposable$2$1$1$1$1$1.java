package ru.ozon.app.android.storefront.widgets.navigationSliderCompose;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2VO;
import ru.ozon.app.android.tools.ItemAdapterCallback;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.widgets.navigationSliderCompose.NavigationSliderComposableKt$NavigationSliderComposable$2$1$1$1$1$1", f = "NavigationSliderComposable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NavigationSliderComposableKt$NavigationSliderComposable$2$1$1$1$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ItemAdapterCallback<NavigationSliderV2VO.NavigationItemV2> $adapterCallback;
    final /* synthetic */ int $index;
    final /* synthetic */ NavigationSliderV2VO.NavigationItemV2 $navItem;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NavigationSliderComposableKt$NavigationSliderComposable$2$1$1$1$1$1(ItemAdapterCallback<? super NavigationSliderV2VO.NavigationItemV2> itemAdapterCallback, int i11, NavigationSliderV2VO.NavigationItemV2 navigationItemV2, d<? super NavigationSliderComposableKt$NavigationSliderComposable$2$1$1$1$1$1> dVar) {
        super(2, dVar);
        this.$adapterCallback = itemAdapterCallback;
        this.$index = i11;
        this.$navItem = navigationItemV2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new NavigationSliderComposableKt$NavigationSliderComposable$2$1$1$1$1$1(this.$adapterCallback, this.$index, this.$navItem, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.$adapterCallback.view(this.$index, this.$navItem);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((NavigationSliderComposableKt$NavigationSliderComposable$2$1$1$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
