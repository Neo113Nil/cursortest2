package ru.ozon.app.android.checkoutcomposer.sberpay;

import GZ.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SberPayFragment$onViewCreated$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ String $link;
    final /* synthetic */ SberPayFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SberPayFragment$onViewCreated$1(SberPayFragment sberPayFragment, String str) {
        super(0);
        this.this$0 = sberPayFragment;
        this.$link = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        g gVar;
        this.this$0.paymentIsDone = true;
        gVar = this.this$0.ozonRouter;
        if (gVar != null) {
            g.a.a(gVar, this.$link, null, null, 6);
        } else {
            Intrinsics.n("ozonRouter");
            throw null;
        }
    }
}
