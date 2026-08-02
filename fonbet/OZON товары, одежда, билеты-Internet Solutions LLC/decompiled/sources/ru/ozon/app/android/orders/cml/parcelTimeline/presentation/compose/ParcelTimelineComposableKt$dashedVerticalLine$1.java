package ru.ozon.app.android.orders.cml.parcelTimeline.presentation.compose;

import P9.a;
import android.graphics.DashPathEffect;
import i1.C6987g;
import i1.C6992l;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7787E;
import l1.t0;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li1/g;", "Li1/l;", "invoke", "(Li1/g;)Li1/l;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class ParcelTimelineComposableKt$dashedVerticalLine$1 extends AbstractC7737t implements Function1<C6987g, C6992l> {
    final /* synthetic */ long $color;
    final /* synthetic */ float $dashLength;
    final /* synthetic */ float $gapLength;
    final /* synthetic */ float $thickness;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/e;", "", "invoke", "(Ln1/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.orders.cml.parcelTimeline.presentation.compose.ParcelTimelineComposableKt$dashedVerticalLine$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
        final /* synthetic */ long $color;
        final /* synthetic */ t0 $pathEffect;
        final /* synthetic */ float $strokeWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j11, float f7, t0 t0Var) {
            super(1);
            this.$color = j11;
            this.$strokeWidth = f7;
            this.$pathEffect = t0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8412e interfaceC8412e) {
            invoke2(interfaceC8412e);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC8412e onDrawBehind) {
            Intrinsics.checkNotNullParameter(onDrawBehind, "$this$onDrawBehind");
            onDrawBehind.U(this.$color, a.a(C7464j.f(onDrawBehind.i()) / 2.0f, 0.0f), a.a(C7464j.f(onDrawBehind.i()) / 2.0f, C7464j.d(onDrawBehind.i())), this.$strokeWidth, (r21 & 16) != 0 ? 0 : 1, (r21 & 32) != 0 ? null : this.$pathEffect);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ParcelTimelineComposableKt$dashedVerticalLine$1(float f7, float f11, float f12, long j11) {
        super(1);
        this.$thickness = f7;
        this.$dashLength = f11;
        this.$gapLength = f12;
        this.$color = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C6992l invoke(C6987g drawWithCache) {
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        return drawWithCache.s(new AnonymousClass1(this.$color, drawWithCache.g() * this.$thickness, new C7787E(new DashPathEffect(new float[]{drawWithCache.g() * this.$dashLength, drawWithCache.g() * this.$gapLength}, 0.0f))));
    }
}
