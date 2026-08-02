package ru.ozon.app.android.ugc.core.widgets.illustrationButtons.core;

import P9.a;
import k1.C7456b;
import k1.C7464j;
import k1.C7465k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/e;", "", "invoke", "(Ln1/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class IllustrationButtonsComposableKt$IllustrationButton$3$1 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ float $cornerRadius;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IllustrationButtonsComposableKt$IllustrationButton$3$1(float f7, long j11) {
        super(1);
        this.$cornerRadius = f7;
        this.$backgroundColor = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8412e interfaceC8412e) {
        invoke2(interfaceC8412e);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8412e drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        float v12 = drawBehind.v1(18);
        float v13 = drawBehind.v1(this.$cornerRadius);
        InterfaceC8412e.p0(drawBehind, this.$backgroundColor, a.a(0.0f, v12), C7465k.a(C7464j.f(drawBehind.i()), C7464j.d(drawBehind.i()) - v12), C7456b.a(v13, v13), null, 240);
    }
}
