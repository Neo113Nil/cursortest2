package ru.ozon.app.android.storefront.widgets.navigationSliderCompose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2VO;
import ru.ozon.app.android.tools.ItemAdapterCallback;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NavigationSliderComposableKt$NavigationSliderComposable$2$1$1$1$4$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ItemAdapterCallback<NavigationSliderV2VO.NavigationItemV2> $adapterCallback;
    final /* synthetic */ int $index;
    final /* synthetic */ NavigationSliderV2VO.NavigationItemV2 $navItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NavigationSliderComposableKt$NavigationSliderComposable$2$1$1$1$4$1(ItemAdapterCallback<? super NavigationSliderV2VO.NavigationItemV2> itemAdapterCallback, int i11, NavigationSliderV2VO.NavigationItemV2 navigationItemV2) {
        super(0);
        this.$adapterCallback = itemAdapterCallback;
        this.$index = i11;
        this.$navItem = navigationItemV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$adapterCallback.click(this.$index, this.$navItem);
    }
}
