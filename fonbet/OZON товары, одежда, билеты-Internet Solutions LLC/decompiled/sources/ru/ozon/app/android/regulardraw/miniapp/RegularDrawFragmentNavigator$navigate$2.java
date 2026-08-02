package ru.ozon.app.android.regulardraw.miniapp;

import EZ.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class RegularDrawFragmentNavigator$navigate$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ int $requestCode;
    final /* synthetic */ e<?> $response;
    final /* synthetic */ RegularDrawFragmentNavigator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RegularDrawFragmentNavigator$navigate$2(RegularDrawFragmentNavigator regularDrawFragmentNavigator, e<?> eVar, int i11) {
        super(0);
        this.this$0 = regularDrawFragmentNavigator;
        this.$response = eVar;
        this.$requestCode = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.getFragmentManager().S0();
        if (this.this$0.getFragmentManager().l0() == 0) {
            this.this$0.next(this.$response, this.$requestCode);
        }
    }
}
