package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.tab;

import P9.a;
import Ra.h;
import i1.C6987g;
import i1.C6992l;
import k1.C7456b;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7791I;
import l1.C7807Z;
import n1.InterfaceC8412e;
import ru.ozon.app.android.regulardraw.ui.InnerShadowPainter;
import ru.ozon.app.android.regulardraw.ui.InnerShadowPainterKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li1/g;", "Li1/l;", "invoke", "(Li1/g;)Li1/l;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class MorkovskTabbarTabBackgroundKt$tabBackground$1$1$1 extends AbstractC7737t implements Function1<C6987g, C6992l> {
    final /* synthetic */ long $backLayerBackgroundColor;
    final /* synthetic */ float $backLayerCornerRadius;
    final /* synthetic */ long $backLayerDarkShadowColor;
    final /* synthetic */ long $backLayerLightShadowColor;
    final /* synthetic */ long $secondLayerBackgroundGradientEndColor;
    final /* synthetic */ long $secondLayerBackgroundGradientStartColor;
    final /* synthetic */ long $secondLayerBorderGradientEndColor;
    final /* synthetic */ long $secondLayerBorderGradientStartColor;
    final /* synthetic */ float $secondLayerCornerRadius;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/e;", "", "invoke", "(Ln1/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.tab.MorkovskTabbarTabBackgroundKt$tabBackground$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
        final /* synthetic */ long $backLayerBackgroundColor;
        final /* synthetic */ float $backLayerCornerRadius;
        final /* synthetic */ InnerShadowPainter $backLayerFirstDarkShadowPainter;
        final /* synthetic */ InnerShadowPainter $backLayerLightShadowPainter;
        final /* synthetic */ InnerShadowPainter $backLayerSecondDarkShadowPainter;
        final /* synthetic */ AbstractC7799Q $secondLayerBackgroundGradient;
        final /* synthetic */ InnerShadowPainter $secondLayerBorderPainter;
        final /* synthetic */ float $secondLayerCornerRadius;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j11, float f7, InnerShadowPainter innerShadowPainter, InnerShadowPainter innerShadowPainter2, InnerShadowPainter innerShadowPainter3, AbstractC7799Q abstractC7799Q, float f11, InnerShadowPainter innerShadowPainter4) {
            super(1);
            this.$backLayerBackgroundColor = j11;
            this.$backLayerCornerRadius = f7;
            this.$backLayerFirstDarkShadowPainter = innerShadowPainter;
            this.$backLayerSecondDarkShadowPainter = innerShadowPainter2;
            this.$backLayerLightShadowPainter = innerShadowPainter3;
            this.$secondLayerBackgroundGradient = abstractC7799Q;
            this.$secondLayerCornerRadius = f11;
            this.$secondLayerBorderPainter = innerShadowPainter4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8412e interfaceC8412e) {
            invoke2(interfaceC8412e);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC8412e onDrawBehind) {
            float f7;
            Intrinsics.checkNotNullParameter(onDrawBehind, "$this$onDrawBehind");
            long j11 = this.$backLayerBackgroundColor;
            float v12 = onDrawBehind.v1(this.$backLayerCornerRadius);
            InterfaceC8412e.p0(onDrawBehind, j11, 0L, 0L, C7456b.a(v12, v12), null, 246);
            this.$backLayerFirstDarkShadowPainter.draw(onDrawBehind);
            this.$backLayerSecondDarkShadowPainter.draw(onDrawBehind);
            this.$backLayerLightShadowPainter.draw(onDrawBehind);
            float f11 = 4;
            float v13 = onDrawBehind.v1(f11);
            float v14 = onDrawBehind.v1(f11);
            float v15 = onDrawBehind.v1(f11);
            float v16 = onDrawBehind.v1(0);
            AbstractC7799Q abstractC7799Q = this.$secondLayerBackgroundGradient;
            float f12 = this.$secondLayerCornerRadius;
            InnerShadowPainter innerShadowPainter = this.$secondLayerBorderPainter;
            onDrawBehind.w0().f().c(v13, v16, v14, v15);
            try {
                float v17 = onDrawBehind.v1(f12);
                f7 = v16;
                try {
                    InterfaceC8412e.I0(onDrawBehind, abstractC7799Q, 0L, 0L, C7456b.a(v17, v17), 0.0f, null, 246);
                    innerShadowPainter.draw(onDrawBehind);
                    onDrawBehind.w0().f().c(-v13, -f7, -v14, -v15);
                } catch (Throwable th2) {
                    th = th2;
                    onDrawBehind.w0().f().c(-v13, -f7, -v14, -v15);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                f7 = v16;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MorkovskTabbarTabBackgroundKt$tabBackground$1$1$1(float f7, long j11, long j12, long j13, long j14, float f11, long j15, long j16, long j17) {
        super(1);
        this.$backLayerCornerRadius = f7;
        this.$backLayerDarkShadowColor = j11;
        this.$backLayerLightShadowColor = j12;
        this.$secondLayerBackgroundGradientStartColor = j13;
        this.$secondLayerBackgroundGradientEndColor = j14;
        this.$secondLayerCornerRadius = f11;
        this.$secondLayerBorderGradientStartColor = j15;
        this.$secondLayerBorderGradientEndColor = j16;
        this.$backLayerBackgroundColor = j17;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C6992l invoke(C6987g drawWithCache) {
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        float f7 = (float) (-3.23d);
        float f11 = (float) 5.04d;
        float f12 = 0;
        float f13 = 1;
        return drawWithCache.s(new AnonymousClass1(this.$backLayerBackgroundColor, this.$backLayerCornerRadius, InnerShadowPainterKt.m912InnerShadowPainterRiaaXQU$default(drawWithCache, h.c(f7, f7), this.$backLayerCornerRadius, f11, f12, false, C7807Z.m(this.$backLayerDarkShadowColor), null, 80, null), InnerShadowPainterKt.m912InnerShadowPainterRiaaXQU$default(drawWithCache, h.c((float) 2.77d, f7), this.$backLayerCornerRadius, f11, f12, false, C7807Z.m(this.$backLayerDarkShadowColor), null, 80, null), InnerShadowPainterKt.m912InnerShadowPainterRiaaXQU$default(drawWithCache, h.c(f13, f13), this.$backLayerCornerRadius, 6, f12, false, C7807Z.m(this.$backLayerLightShadowColor), null, 80, null), AbstractC7799Q.a.e(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(this.$secondLayerBackgroundGradientStartColor)), new Pair(Float.valueOf(1.0f), C7807Z.m(this.$secondLayerBackgroundGradientEndColor))}, a.a(C7464j.f(drawWithCache.i()) * 0.25f, C7464j.d(drawWithCache.i()) * 0.2f), a.a(C7464j.f(drawWithCache.i()) * 0.85f, C7464j.d(drawWithCache.i()) * 0.75f), 8), this.$secondLayerCornerRadius, InnerShadowPainterKt.m912InnerShadowPainterRiaaXQU$default(drawWithCache, h.c(f12, f12), this.$secondLayerCornerRadius, (float) 1.8d, (float) 1.4d, false, null, C7791I.a(0L, a.a(C7464j.f(drawWithCache.i()) * 0.25f, C7464j.d(drawWithCache.i()) * 0.5f), C7714v.b0(C7807Z.m(this.$secondLayerBorderGradientStartColor), C7807Z.m(this.$secondLayerBorderGradientEndColor)), null, 0), 32, null)));
    }
}
