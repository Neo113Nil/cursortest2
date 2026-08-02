package ru.ozon.app.android.storefront.widgets.navigationSliderCompose;

import S0.A1;
import Z1.d;
import a1.C4912a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2VO;
import ru.ozon.app.android.tools.ItemAdapterCallback;
import v0.G;
import v0.I;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/G;", "", "invoke", "(Lv0/G;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class NavigationSliderComposableKt$NavigationSliderComposable$2$1$1 extends AbstractC7737t implements Function1<G, Unit> {
    final /* synthetic */ ItemAdapterCallback<NavigationSliderV2VO.NavigationItemV2> $adapterCallback;
    final /* synthetic */ AdultHandler $adultHandler;
    final /* synthetic */ d $density;
    final /* synthetic */ NavigationSliderV2VO $item;
    final /* synthetic */ I $state;
    final /* synthetic */ long $textPrimaryColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NavigationSliderComposableKt$NavigationSliderComposable$2$1$1(NavigationSliderV2VO navigationSliderV2VO, ItemAdapterCallback<? super NavigationSliderV2VO.NavigationItemV2> itemAdapterCallback, AdultHandler adultHandler, long j11, I i11, d dVar) {
        super(1);
        this.$item = navigationSliderV2VO;
        this.$adapterCallback = itemAdapterCallback;
        this.$adultHandler = adultHandler;
        this.$textPrimaryColor = j11;
        this.$state = i11;
        this.$density = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$7$lambda$1(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(G g10) {
        invoke2(g10);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(G LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        List<NavigationSliderV2VO.NavigationItemV2> items = this.$item.getItems();
        LazyRow.a(items.size(), null, new NavigationSliderComposableKt$NavigationSliderComposable$2$1$1$invoke$$inlined$itemsIndexed$default$2(items), new C4912a(true, -1091073711, new NavigationSliderComposableKt$NavigationSliderComposable$2$1$1$invoke$$inlined$itemsIndexed$default$3(items, this.$adapterCallback, this.$adultHandler, this.$textPrimaryColor, this.$state, this.$density)));
    }
}
