package ru.ozon.app.android.pdp.utils;

import Kk.C3532b;
import P9.a;
import S0.A1;
import i1.C6987g;
import i1.C6992l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import n1.C8408a;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li1/g;", "Li1/l;", "invoke", "(Li1/g;)Li1/l;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class ComposeExtKt$shimmer$1$1 extends AbstractC7737t implements Function1<C6987g, C6992l> {
    final /* synthetic */ float $blurAlpha;
    final /* synthetic */ AbstractC7799Q $brush;
    final /* synthetic */ float $gradientWidthPx;
    final /* synthetic */ A1<Float> $translateAnimation;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/c;", "", "invoke", "(Ln1/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.pdp.utils.ComposeExtKt$shimmer$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {
        final /* synthetic */ float $blurAlpha;
        final /* synthetic */ AbstractC7799Q $brush;
        final /* synthetic */ float $gradientWidthPx;
        final /* synthetic */ A1<Float> $translateAnimation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(A1<Float> a12, float f7, AbstractC7799Q abstractC7799Q, float f11) {
            super(1);
            this.$translateAnimation = a12;
            this.$gradientWidthPx = f7;
            this.$brush = abstractC7799Q;
            this.$blurAlpha = f11;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8410c interfaceC8410c) {
            invoke2(interfaceC8410c);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC8410c onDrawWithContent) {
            Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
            onDrawWithContent.F0();
            A1<Float> a12 = this.$translateAnimation;
            float f7 = this.$gradientWidthPx;
            AbstractC7799Q abstractC7799Q = this.$brush;
            float f11 = this.$blurAlpha;
            C8408a.b w02 = onDrawWithContent.w0();
            long e11 = w02.e();
            w02.a().save();
            try {
                w02.f().g(a12.getValue().floatValue(), 0.0f);
                InterfaceC8412e.k0(onDrawWithContent, abstractC7799Q, a.a(-f7, 0.0f), 0L, f11, null, 0, 116);
            } finally {
                C3532b.b(w02, e11);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposeExtKt$shimmer$1$1(A1<Float> a12, float f7, AbstractC7799Q abstractC7799Q, float f11) {
        super(1);
        this.$translateAnimation = a12;
        this.$gradientWidthPx = f7;
        this.$brush = abstractC7799Q;
        this.$blurAlpha = f11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C6992l invoke(C6987g drawWithCache) {
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        return drawWithCache.t(new AnonymousClass1(this.$translateAnimation, this.$gradientWidthPx, this.$brush, this.$blurAlpha));
    }
}
