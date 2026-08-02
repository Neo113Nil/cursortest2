package ru.ozon.app.android.regulardraw.widgets.daily.presentation.compose;

import P9.a;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import i1.C6987g;
import i1.C6992l;
import k1.C7456b;
import k1.C7464j;
import k1.C7465k;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7785C;
import l1.C7807Z;
import l1.C7811b0;
import n1.C8416i;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li1/g;", "Li1/l;", "invoke", "(Li1/g;)Li1/l;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class DailyRewardsBackgroundKt$dailyRewardsBackground$1$1$1 extends AbstractC7737t implements Function1<C6987g, C6992l> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $borderColorEnd;
    final /* synthetic */ long $borderColorStart;
    final /* synthetic */ long $darkShadowColor;
    final /* synthetic */ long $lightShadowColor;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/e;", "", "invoke", "(Ln1/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.regulardraw.widgets.daily.presentation.compose.DailyRewardsBackgroundKt$dailyRewardsBackground$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
        final /* synthetic */ long $backgroundColor;
        final /* synthetic */ AbstractC7799Q $borderBrush;
        final /* synthetic */ C8416i $borderStroke;
        final /* synthetic */ long $cornerRadius;
        final /* synthetic */ long $darkShadowColor;
        final /* synthetic */ long $lightShadowColor;
        final /* synthetic */ float $shadowOffset;
        final /* synthetic */ Paint $shadowPaint;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j11, long j12, float f7, Paint paint, C8416i c8416i, AbstractC7799Q abstractC7799Q, long j13, long j14) {
            super(1);
            this.$backgroundColor = j11;
            this.$cornerRadius = j12;
            this.$shadowOffset = f7;
            this.$shadowPaint = paint;
            this.$borderStroke = c8416i;
            this.$borderBrush = abstractC7799Q;
            this.$lightShadowColor = j13;
            this.$darkShadowColor = j14;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8412e interfaceC8412e) {
            invoke2(interfaceC8412e);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC8412e onDrawBehind) {
            Intrinsics.checkNotNullParameter(onDrawBehind, "$this$onDrawBehind");
            InterfaceC8412e.p0(onDrawBehind, this.$backgroundColor, 0L, 0L, this.$cornerRadius, null, 246);
            float f7 = this.$shadowOffset;
            long a11 = a.a(f7, f7);
            long j11 = this.$cornerRadius;
            Paint paint = this.$shadowPaint;
            paint.setColor(C7811b0.i(this.$lightShadowColor));
            Unit unit = Unit.f71690a;
            DailyRewardsBackgroundKt.m944dropShadowInsideGeI9l2I(onDrawBehind, a11, j11, paint);
            float f11 = -this.$shadowOffset;
            long a12 = a.a(f11, f11);
            long j12 = this.$cornerRadius;
            Paint paint2 = this.$shadowPaint;
            paint2.setColor(C7811b0.i(this.$darkShadowColor));
            DailyRewardsBackgroundKt.m944dropShadowInsideGeI9l2I(onDrawBehind, a12, j12, paint2);
            float f12 = 2;
            InterfaceC8412e.I0(onDrawBehind, this.$borderBrush, a.a(this.$borderStroke.e() / f12, this.$borderStroke.e() / f12), C7465k.a(C7464j.f(onDrawBehind.i()) - this.$borderStroke.e(), C7464j.d(onDrawBehind.i()) - this.$borderStroke.e()), this.$cornerRadius, 0.0f, this.$borderStroke, 208);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DailyRewardsBackgroundKt$dailyRewardsBackground$1$1$1(long j11, long j12, long j13, long j14, long j15) {
        super(1);
        this.$borderColorStart = j11;
        this.$borderColorEnd = j12;
        this.$backgroundColor = j13;
        this.$lightShadowColor = j14;
        this.$darkShadowColor = j15;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C6992l invoke(C6987g drawWithCache) {
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        float g10 = drawWithCache.g() * 24;
        long a11 = C7456b.a(g10, g10);
        float g11 = drawWithCache.g() * 4;
        Paint d11 = C7785C.a().d();
        d11.setAntiAlias(true);
        d11.setStyle(Paint.Style.STROKE);
        d11.setStrokeWidth(g11);
        d11.setMaskFilter(new BlurMaskFilter(drawWithCache.g() * 3, BlurMaskFilter.Blur.NORMAL));
        return drawWithCache.s(new AnonymousClass1(this.$backgroundColor, a11, g11, d11, new C8416i(drawWithCache.g() * 1, 0.0f, 0, 0, null, 30), AbstractC7799Q.a.e(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(this.$borderColorStart)), new Pair(Float.valueOf(1.0f), C7807Z.m(this.$borderColorEnd))}, a.a(C7464j.f(drawWithCache.i()) / 2, (-C7464j.f(drawWithCache.i())) / 4.0f), a.a(C7464j.f(drawWithCache.i()) * 0.75f, C7464j.f(drawWithCache.i()) / 2.0f), 8), this.$lightShadowColor, this.$darkShadowColor));
    }
}
