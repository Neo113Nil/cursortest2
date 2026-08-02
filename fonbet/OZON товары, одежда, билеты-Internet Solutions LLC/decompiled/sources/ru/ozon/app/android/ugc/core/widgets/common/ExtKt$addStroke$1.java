package ru.ozon.app.android.ugc.core.widgets.common;

import i1.C6987g;
import i1.C6992l;
import k1.C7460f;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7786D;
import l1.C7790H;
import n1.C8416i;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li1/g;", "Li1/l;", "invoke", "(Li1/g;)Li1/l;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ExtKt$addStroke$1 extends AbstractC7737t implements Function1<C6987g, C6992l> {
    final /* synthetic */ float $cornerRadius;
    final /* synthetic */ long $strokeColor;
    final /* synthetic */ float $strokeWidth;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/e;", "", "invoke", "(Ln1/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.common.ExtKt$addStroke$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
        final /* synthetic */ float $cornerRadiusPx;
        final /* synthetic */ float $halfStroke;
        final /* synthetic */ long $strokeColor;
        final /* synthetic */ float $strokeWidthPx;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(float f7, long j11, float f11, float f12) {
            super(1);
            this.$halfStroke = f7;
            this.$strokeColor = j11;
            this.$strokeWidthPx = f11;
            this.$cornerRadiusPx = f12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8412e interfaceC8412e) {
            invoke2(interfaceC8412e);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC8412e onDrawBehind) {
            Intrinsics.checkNotNullParameter(onDrawBehind, "$this$onDrawBehind");
            float f7 = this.$halfStroke;
            C7460f c7460f = new C7460f(f7, f7, C7464j.f(onDrawBehind.i()) - this.$halfStroke, C7464j.d(onDrawBehind.i()));
            C7786D a11 = C7790H.a();
            float f11 = this.$cornerRadiusPx;
            float f12 = this.$halfStroke;
            a11.a(c7460f.n(), c7460f.h());
            a11.b(c7460f.n(), (c7460f.q() + f11) - f12);
            float f13 = f11 - f12;
            float f14 = 2 * f13;
            a11.w(new C7460f(c7460f.n(), c7460f.q(), c7460f.n() + f14, c7460f.q() + f14), 180.0f, 90.0f);
            a11.b(c7460f.o() - f13, c7460f.q());
            a11.w(new C7460f(c7460f.o() - f14, c7460f.q(), c7460f.o(), c7460f.q() + f14), -90.0f, 90.0f);
            a11.b(c7460f.o(), c7460f.h());
            InterfaceC8412e.X(onDrawBehind, a11, this.$strokeColor, new C8416i(this.$strokeWidthPx, 0.0f, 0, 0, null, 30), 52);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExtKt$addStroke$1(float f7, float f11, long j11) {
        super(1);
        this.$strokeWidth = f7;
        this.$cornerRadius = f11;
        this.$strokeColor = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C6992l invoke(C6987g drawWithCache) {
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        float g10 = drawWithCache.g() * this.$strokeWidth;
        return drawWithCache.s(new AnonymousClass1(g10 / 2, this.$strokeColor, g10, drawWithCache.g() * this.$cornerRadius));
    }
}
