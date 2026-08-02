package ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation.PromoStickyBubbleView;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "eventType", "Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleView$EventType;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PromoStickyBubbleViewHolder$bind$1 extends AbstractC7737t implements Function1<PromoStickyBubbleView.EventType, Unit> {
    final /* synthetic */ PromoStickyBubbleV0 $item;
    final /* synthetic */ PromoStickyBubbleViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoStickyBubbleViewHolder$bind$1(PromoStickyBubbleViewHolder promoStickyBubbleViewHolder, PromoStickyBubbleV0 promoStickyBubbleV0) {
        super(1);
        this.this$0 = promoStickyBubbleViewHolder;
        this.$item = promoStickyBubbleV0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PromoStickyBubbleView.EventType eventType) {
        invoke2(eventType);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PromoStickyBubbleView.EventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.this$0.processViewEvents(this.$item, eventType);
    }
}
