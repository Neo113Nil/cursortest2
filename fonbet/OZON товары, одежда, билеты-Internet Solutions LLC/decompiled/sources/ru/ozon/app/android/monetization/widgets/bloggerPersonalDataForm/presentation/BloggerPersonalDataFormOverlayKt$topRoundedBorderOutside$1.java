package ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.presentation;

import i1.C6987g;
import i1.C6992l;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7786D;
import l1.C7790H;
import l1.s0;
import n1.C8416i;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li1/g;", "Li1/l;", "invoke", "(Li1/g;)Li1/l;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class BloggerPersonalDataFormOverlayKt$topRoundedBorderOutside$1 extends AbstractC7737t implements Function1<C6987g, C6992l> {
    final /* synthetic */ long $color;
    final /* synthetic */ float $cornerRadius;
    final /* synthetic */ float $strokeWidth;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/e;", "", "invoke", "(Ln1/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.presentation.BloggerPersonalDataFormOverlayKt$topRoundedBorderOutside$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
        final /* synthetic */ long $color;
        final /* synthetic */ s0 $path;
        final /* synthetic */ float $strokeWidthPx;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(s0 s0Var, long j11, float f7) {
            super(1);
            this.$path = s0Var;
            this.$color = j11;
            this.$strokeWidthPx = f7;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8412e interfaceC8412e) {
            invoke2(interfaceC8412e);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC8412e onDrawBehind) {
            Intrinsics.checkNotNullParameter(onDrawBehind, "$this$onDrawBehind");
            InterfaceC8412e.X(onDrawBehind, this.$path, this.$color, new C8416i(this.$strokeWidthPx, 0.0f, 0, 0, null, 30), 52);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BloggerPersonalDataFormOverlayKt$topRoundedBorderOutside$1(float f7, float f11, long j11) {
        super(1);
        this.$strokeWidth = f7;
        this.$cornerRadius = f11;
        this.$color = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C6992l invoke(C6987g drawWithCache) {
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        float g10 = drawWithCache.g() * this.$strokeWidth;
        float g11 = drawWithCache.g() * this.$cornerRadius;
        float f7 = g10 / 2;
        C7786D a11 = C7790H.a();
        float f11 = -f7;
        a11.a(f11, C7464j.d(drawWithCache.i()));
        float f12 = g11 + f7;
        a11.b(f11, f12);
        a11.r(f11, f7, f12, f7);
        a11.b((C7464j.f(drawWithCache.i()) - g11) - f7, f7);
        a11.r(C7464j.f(drawWithCache.i()) + f7, f7, C7464j.f(drawWithCache.i()) + f7, f12);
        a11.b(C7464j.f(drawWithCache.i()) + f7, C7464j.d(drawWithCache.i()));
        return drawWithCache.s(new AnonymousClass1(a11, this.$color, g10));
    }
}
