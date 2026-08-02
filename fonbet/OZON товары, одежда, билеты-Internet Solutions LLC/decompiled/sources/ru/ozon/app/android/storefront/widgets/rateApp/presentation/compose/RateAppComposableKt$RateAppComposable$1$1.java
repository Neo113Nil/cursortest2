package ru.ozon.app.android.storefront.widgets.rateApp.presentation.compose;

import S0.InterfaceC3970l0;
import Z1.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZ1/q;", "it", "", "invoke-ozmzZPI", "(J)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class RateAppComposableKt$RateAppComposable$1$1 extends AbstractC7737t implements Function1<q, Unit> {
    final /* synthetic */ InterfaceC3970l0 $height$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RateAppComposableKt$RateAppComposable$1$1(InterfaceC3970l0 interfaceC3970l0) {
        super(1);
        this.$height$delegate = interfaceC3970l0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(q qVar) {
        m1054invokeozmzZPI(qVar.e());
        return Unit.f71690a;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m1054invokeozmzZPI(long j11) {
        this.$height$delegate.h((int) (j11 & 4294967295L));
    }
}
