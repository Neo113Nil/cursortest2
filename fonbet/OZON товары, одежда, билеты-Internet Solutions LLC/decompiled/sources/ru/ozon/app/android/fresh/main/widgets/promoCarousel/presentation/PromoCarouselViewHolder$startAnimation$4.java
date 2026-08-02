package ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation;

import android.view.animation.PathInterpolator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Float;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PromoCarouselViewHolder$startAnimation$4 extends AbstractC7737t implements Function1<Float, Unit> {
    final /* synthetic */ PromoCarouselViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoCarouselViewHolder$startAnimation$4(PromoCarouselViewHolder promoCarouselViewHolder) {
        super(1);
        this.this$0 = promoCarouselViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f7) {
        invoke2(f7);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Float f7) {
        PromoCarouselRecyclerView promoCarouselRecyclerView;
        PathInterpolator pathInterpolator;
        promoCarouselRecyclerView = this.this$0.containerView;
        Intrinsics.f(f7);
        int px = UiExtKt.toPx(f7.floatValue());
        pathInterpolator = this.this$0.interpolator;
        promoCarouselRecyclerView.smoothScrollBy(px, 0, pathInterpolator, 300);
    }
}
