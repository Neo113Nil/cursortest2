package ru.ozon.uni.foundation.components.image;

import S0.A1;
import S0.InterfaceC3978p0;
import java.util.List;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/e;", "", "invoke", "(Ln1/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class FoundationImageKt$FoundationLoadingImage$1$1 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
    final /* synthetic */ InterfaceC3978p0<Boolean> $firstAnimCycle$delegate;
    final /* synthetic */ float $gradientWidthPx;
    final /* synthetic */ boolean $isInspection;
    final /* synthetic */ A1<Float> $xShimmer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FoundationImageKt$FoundationLoadingImage$1$1(A1<Float> a12, boolean z11, float f7, InterfaceC3978p0<Boolean> interfaceC3978p0) {
        super(1);
        this.$xShimmer = a12;
        this.$isInspection = z11;
        this.$gradientWidthPx = f7;
        this.$firstAnimCycle$delegate = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8412e interfaceC8412e) {
        invoke2(interfaceC8412e);
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (r11.$xShimmer.getValue().floatValue() == 0.0f) goto L13;
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2(InterfaceC8412e drawBehind) {
        List list;
        boolean FoundationLoadingImage_WqkqGGM$lambda$5;
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        float f7 = 0.5f;
        if (this.$xShimmer.getValue().floatValue() > 0.5f) {
            FoundationImageKt.FoundationLoadingImage_WqkqGGM$lambda$6(this.$firstAnimCycle$delegate, false);
        }
        if (this.$isInspection) {
            FoundationLoadingImage_WqkqGGM$lambda$5 = FoundationImageKt.FoundationLoadingImage_WqkqGGM$lambda$5(this.$firstAnimCycle$delegate);
            if (FoundationLoadingImage_WqkqGGM$lambda$5) {
            }
        }
        f7 = this.$xShimmer.getValue().floatValue();
        AbstractC7799Q.a aVar = AbstractC7799Q.Companion;
        list = FoundationImageKt.loadingGradientColors;
        float f11 = C7464j.f(drawBehind.i());
        float f12 = this.$gradientWidthPx;
        InterfaceC8412e.k0(drawBehind, AbstractC7799Q.a.a(aVar, list, ((f11 + f12) * f7) - f12, (C7464j.f(drawBehind.i()) + this.$gradientWidthPx) * f7, 8), 0L, 0L, 0.0f, null, 0, 126);
    }
}
