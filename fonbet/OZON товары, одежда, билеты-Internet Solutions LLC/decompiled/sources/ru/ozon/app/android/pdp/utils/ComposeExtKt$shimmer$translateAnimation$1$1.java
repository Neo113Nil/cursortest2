package ru.ozon.app.android.pdp.utils;

import S0.InterfaceC3970l0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m0.G;
import m0.V;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm0/V$b;", "", "", "invoke", "(Lm0/V$b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class ComposeExtKt$shimmer$translateAnimation$1$1 extends AbstractC7737t implements Function1<V.b<Float>, Unit> {
    final /* synthetic */ int $delayBetweenAnimationMs;
    final /* synthetic */ int $durationMs;
    final /* synthetic */ float $gradientWidthPx;
    final /* synthetic */ InterfaceC3970l0 $widthPx$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposeExtKt$shimmer$translateAnimation$1$1(int i11, int i12, float f7, InterfaceC3970l0 interfaceC3970l0) {
        super(1);
        this.$durationMs = i11;
        this.$delayBetweenAnimationMs = i12;
        this.$gradientWidthPx = f7;
        this.$widthPx$delegate = interfaceC3970l0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(V.b<Float> bVar) {
        invoke2(bVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(V.b<Float> keyframes) {
        float floatValue;
        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
        keyframes.e(this.$durationMs + this.$delayBetweenAnimationMs);
        keyframes.f(0, Float.valueOf(-this.$gradientWidthPx)).c(G.b());
        floatValue = this.$widthPx$delegate.getFloatValue();
        keyframes.f(this.$durationMs, Float.valueOf(floatValue)).c(G.b());
    }
}
