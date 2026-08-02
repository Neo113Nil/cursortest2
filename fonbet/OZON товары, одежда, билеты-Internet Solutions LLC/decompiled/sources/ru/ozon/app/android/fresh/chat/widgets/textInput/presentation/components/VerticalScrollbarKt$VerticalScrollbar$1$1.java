package ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.components;

import Hj.C3143a;
import P9.a;
import k1.C7456b;
import k1.C7464j;
import k1.C7465k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import n0.d0;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/c;", "", "invoke", "(Ln1/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class VerticalScrollbarKt$VerticalScrollbar$1$1 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {
    final /* synthetic */ d0 $scrollState;
    final /* synthetic */ long $scrollbarColor;
    final /* synthetic */ VerticalScrollbarStyle $scrollbarStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerticalScrollbarKt$VerticalScrollbar$1$1(VerticalScrollbarStyle verticalScrollbarStyle, d0 d0Var, long j11) {
        super(1);
        this.$scrollbarStyle = verticalScrollbarStyle;
        this.$scrollState = d0Var;
        this.$scrollbarColor = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8410c interfaceC8410c) {
        invoke2(interfaceC8410c);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8410c drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        float v12 = drawWithContent.v1(this.$scrollbarStyle.getScrollbarVerticalPadding());
        float f7 = 2;
        float d11 = C7464j.d(drawWithContent.i()) - (v12 * f7);
        float d12 = C7464j.d(drawWithContent.i());
        float d13 = h.d(d12 / (this.$scrollState.l() + d12), 0.1f, 0.9f) * d11;
        InterfaceC8412e.p0(drawWithContent, this.$scrollbarColor, a.a(0.0f, C3143a.d(d11, d13, this.$scrollState.m() / this.$scrollState.l(), v12)), C7465k.a(C7464j.f(drawWithContent.i()), d13), C7456b.a(C7464j.f(drawWithContent.i()) / f7, C7464j.f(drawWithContent.i()) / f7), null, 240);
    }
}
