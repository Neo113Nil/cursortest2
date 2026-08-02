package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductVI;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductsForReviewV2ComposableKt$ProductBadges$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ List<ProductVI.Badge> $badges;
    final /* synthetic */ float $leftPadding;
    final /* synthetic */ Function0<Unit> $onBadgeClick;
    final /* synthetic */ Function0<Unit> $onTimerFinish;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ProductsForReviewV2ComposableKt$ProductBadges$2(List<? extends ProductVI.Badge> list, float f7, Function0<Unit> function0, Function0<Unit> function02, int i11) {
        super(2);
        this.$badges = list;
        this.$leftPadding = f7;
        this.$onTimerFinish = function0;
        this.$onBadgeClick = function02;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ProductsForReviewV2ComposableKt.m1493ProductBadgesuFdPcIQ(this.$badges, this.$leftPadding, this.$onTimerFinish, this.$onBadgeClick, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
