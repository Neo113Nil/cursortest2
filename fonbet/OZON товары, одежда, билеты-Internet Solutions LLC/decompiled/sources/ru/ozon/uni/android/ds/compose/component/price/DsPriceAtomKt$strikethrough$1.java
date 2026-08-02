package ru.ozon.uni.android.ds.compose.component.price;

import Hj0.T;
import P9.a;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n1.InterfaceC8410c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/c;", "", "invoke", "(Ln1/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class DsPriceAtomKt$strikethrough$1 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {
    final /* synthetic */ long $color;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsPriceAtomKt$strikethrough$1(long j11) {
        super(1);
        this.$color = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8410c interfaceC8410c) {
        invoke2(interfaceC8410c);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8410c drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.F0();
        if (C7464j.f(drawWithContent.i()) < drawWithContent.Z0(T.d(1))) {
            return;
        }
        float f7 = 2;
        float f11 = 1;
        drawWithContent.U(this.$color, a.a(0.0f, drawWithContent.v1(f11) + (C7464j.d(drawWithContent.i()) / f7)), a.a(C7464j.f(drawWithContent.i()), (C7464j.d(drawWithContent.i()) / f7) - drawWithContent.v1(f11)), drawWithContent.v1(f11), (r21 & 16) != 0 ? 0 : 1, (r21 & 32) != 0 ? null : null);
    }
}
