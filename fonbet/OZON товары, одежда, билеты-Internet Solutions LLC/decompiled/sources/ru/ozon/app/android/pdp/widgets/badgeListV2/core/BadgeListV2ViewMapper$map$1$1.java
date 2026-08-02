package ru.ozon.app.android.pdp.widgets.badgeListV2.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.badgeListV2.presentation.BadgeListV2ItemDecorator;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2ItemDecorator$PaddingConfig;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class BadgeListV2ViewMapper$map$1$1 extends AbstractC7737t implements Function1<BadgeListV2ItemDecorator.PaddingConfig, Unit> {
    final /* synthetic */ BadgeListV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BadgeListV2ViewMapper$map$1$1(BadgeListV2ViewMapper badgeListV2ViewMapper) {
        super(1);
        this.this$0 = badgeListV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BadgeListV2ItemDecorator.PaddingConfig paddingConfig) {
        invoke2(paddingConfig);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BadgeListV2ItemDecorator.PaddingConfig it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.decoratorConfig = it;
    }
}
