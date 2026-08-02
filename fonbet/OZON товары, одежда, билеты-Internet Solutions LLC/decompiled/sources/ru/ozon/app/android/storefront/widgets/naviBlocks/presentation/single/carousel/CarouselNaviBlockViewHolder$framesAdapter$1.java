package ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.carousel;

import android.animation.ValueAnimator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class CarouselNaviBlockViewHolder$framesAdapter$1 extends C7735q implements Function0<Unit> {
    CarouselNaviBlockViewHolder$framesAdapter$1(Object obj) {
        super(0, obj, ValueAnimator.class, "pause", "pause()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ValueAnimator) this.receiver).pause();
    }
}
