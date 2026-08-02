package ru.ozon.uni.android.ds.compose.component.rating;

import P9.a;
import S0.InterfaceC3970l0;
import i1.C6987g;
import i1.C6992l;
import k1.C7464j;
import k1.C7465k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li1/g;", "Li1/l;", "invoke", "(Li1/g;)Li1/l;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes8.dex */
final class DsRatingKt$DsRating$2$1$6$1 extends AbstractC7737t implements Function1<C6987g, C6992l> {
    final /* synthetic */ AbstractC7799Q $backgroundBrush;
    final /* synthetic */ int $i;
    final /* synthetic */ AbstractC7799Q $selectedBrush;
    final /* synthetic */ InterfaceC3970l0 $selectedIndex$delegate;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/c;", "", "invoke", "(Ln1/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.uni.android.ds.compose.component.rating.DsRatingKt$DsRating$2$1$6$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {
        final /* synthetic */ AbstractC7799Q $backgroundBrush;
        final /* synthetic */ int $i;
        final /* synthetic */ AbstractC7799Q $selectedBrush;
        final /* synthetic */ InterfaceC3970l0 $selectedIndex$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i11, AbstractC7799Q abstractC7799Q, AbstractC7799Q abstractC7799Q2, InterfaceC3970l0 interfaceC3970l0) {
            super(1);
            this.$i = i11;
            this.$selectedBrush = abstractC7799Q;
            this.$backgroundBrush = abstractC7799Q2;
            this.$selectedIndex$delegate = interfaceC3970l0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8410c interfaceC8410c) {
            invoke2(interfaceC8410c);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC8410c onDrawWithContent) {
            float floatValue;
            float floatValue2;
            float floatValue3;
            float floatValue4;
            Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
            onDrawWithContent.F0();
            floatValue = this.$selectedIndex$delegate.getFloatValue();
            floatValue2 = this.$selectedIndex$delegate.getFloatValue();
            double d11 = floatValue2 - ((int) floatValue);
            floatValue3 = this.$selectedIndex$delegate.getFloatValue();
            int i11 = this.$i;
            if (floatValue3 >= i11 + 1) {
                InterfaceC8412e.k0(onDrawWithContent, this.$selectedBrush, 0L, 0L, 0.0f, null, 5, 62);
                return;
            }
            float f7 = i11;
            float f11 = 1.0f + f7;
            floatValue4 = this.$selectedIndex$delegate.getFloatValue();
            if (f7 > floatValue4 || floatValue4 > f11) {
                InterfaceC8412e.k0(onDrawWithContent, this.$backgroundBrush, 0L, 0L, 0.0f, null, 5, 62);
                return;
            }
            float f12 = C7464j.f(onDrawWithContent.i()) * ((float) d11);
            if (d11 == 0.0d) {
                InterfaceC8412e.k0(onDrawWithContent, this.$backgroundBrush, 0L, 0L, 0.0f, null, 5, 62);
                return;
            }
            InterfaceC8412e.k0(onDrawWithContent, this.$backgroundBrush, a.a(f12, 0.0f), C7465k.a(C7464j.f(onDrawWithContent.i()) - f12, C7464j.d(onDrawWithContent.i())), 0.0f, null, 5, 56);
            InterfaceC8412e.k0(onDrawWithContent, this.$selectedBrush, 0L, C7465k.a(f12, C7464j.d(onDrawWithContent.i())), 0.0f, null, 5, 58);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsRatingKt$DsRating$2$1$6$1(int i11, AbstractC7799Q abstractC7799Q, AbstractC7799Q abstractC7799Q2, InterfaceC3970l0 interfaceC3970l0) {
        super(1);
        this.$i = i11;
        this.$selectedBrush = abstractC7799Q;
        this.$backgroundBrush = abstractC7799Q2;
        this.$selectedIndex$delegate = interfaceC3970l0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C6992l invoke(C6987g drawWithCache) {
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        return drawWithCache.t(new AnonymousClass1(this.$i, this.$selectedBrush, this.$backgroundBrush, this.$selectedIndex$delegate));
    }
}
