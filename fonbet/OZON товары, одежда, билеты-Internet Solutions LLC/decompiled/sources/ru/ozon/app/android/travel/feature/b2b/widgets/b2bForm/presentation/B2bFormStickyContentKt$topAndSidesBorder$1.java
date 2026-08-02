package ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.presentation;

import Kk.C3532b;
import i1.C6987g;
import i1.C6992l;
import k1.C7455a;
import k1.C7456b;
import k1.C7462h;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7786D;
import l1.C7790H;
import l1.s0;
import n1.C8408a;
import n1.C8416i;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li1/g;", "Li1/l;", "invoke", "(Li1/g;)Li1/l;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class B2bFormStickyContentKt$topAndSidesBorder$1 extends AbstractC7737t implements Function1<C6987g, C6992l> {
    final /* synthetic */ long $color;
    final /* synthetic */ float $cornerRadius;
    final /* synthetic */ float $strokeWidth;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/c;", "", "invoke", "(Ln1/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.presentation.B2bFormStickyContentKt$topAndSidesBorder$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {
        final /* synthetic */ long $color;
        final /* synthetic */ s0 $path;
        final /* synthetic */ C8416i $stroke;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(s0 s0Var, long j11, C8416i c8416i) {
            super(1);
            this.$path = s0Var;
            this.$color = j11;
            this.$stroke = c8416i;
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
            float d11 = C7464j.d(onDrawWithContent.i());
            s0 s0Var = this.$path;
            long j11 = this.$color;
            C8416i c8416i = this.$stroke;
            float f7 = C7464j.f(onDrawWithContent.i());
            C8408a.b w02 = onDrawWithContent.w0();
            long e11 = w02.e();
            w02.a().save();
            try {
                w02.f().b(0.0f, 0.0f, f7, d11, 1);
                InterfaceC8412e.X(onDrawWithContent, s0Var, j11, c8416i, 52);
            } finally {
                C3532b.b(w02, e11);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bFormStickyContentKt$topAndSidesBorder$1(float f7, float f11, long j11) {
        super(1);
        this.$strokeWidth = f7;
        this.$cornerRadius = f11;
        this.$color = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C6992l invoke(C6987g drawWithCache) {
        long j11;
        long j12;
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        float g10 = drawWithCache.g() * this.$strokeWidth;
        float f7 = g10 / 2.0f;
        float g11 = (drawWithCache.g() * this.$cornerRadius) - f7;
        float f11 = g11 >= 0.0f ? g11 : 0.0f;
        C8416i c8416i = new C8416i(g10, 0.0f, 0, 0, null, 30);
        C7786D a11 = C7790H.a();
        float f12 = C7464j.f(drawWithCache.i()) - f7;
        float d11 = C7464j.d(drawWithCache.i()) + g10;
        long a12 = C7456b.a(f11, f11);
        long a13 = C7456b.a(f11, f11);
        j11 = C7455a.f70271b;
        j12 = C7455a.f70271b;
        a11.s(new C7462h(f7, f7, f12, d11, a12, a13, j11, j12), s0.a.CounterClockwise);
        return drawWithCache.t(new AnonymousClass1(a11, this.$color, c8416i));
    }
}
