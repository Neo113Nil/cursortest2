package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.utlis;

import Kk.C3532b;
import P9.a;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import n1.C8408a;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/e;", "", "invoke", "(Ln1/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ComposeUtilsKt$topRadialGradient$1 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
    final /* synthetic */ long $color;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposeUtilsKt$topRadialGradient$1(long j11) {
        super(1);
        this.$color = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8412e interfaceC8412e) {
        invoke2(interfaceC8412e);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8412e drawBehind) {
        long j11;
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        float f7 = C7464j.f(drawBehind.i()) / 2.0f;
        long a11 = a.a(f7, 0.0f);
        long j12 = this.$color;
        C8408a.b w02 = drawBehind.w0();
        long e11 = w02.e();
        w02.a().save();
        try {
            w02.f().e(4.0f, 1.0f, a11);
            AbstractC7799Q.a aVar = AbstractC7799Q.Companion;
            Pair pair = new Pair(Float.valueOf(0.0f), C7807Z.m(j12));
            Pair pair2 = new Pair(Float.valueOf(0.32f), C7807Z.m(C7807Z.o(0.0f, j12)));
            Float valueOf = Float.valueOf(1.0f);
            j11 = C7807Z.f72258l;
            InterfaceC8412e.k0(drawBehind, AbstractC7799Q.a.f(aVar, new Pair[]{pair, pair2, new Pair(valueOf, C7807Z.m(j11))}, a11, f7), 0L, 0L, 0.0f, null, 0, 126);
        } finally {
            C3532b.b(w02, e11);
        }
    }
}
