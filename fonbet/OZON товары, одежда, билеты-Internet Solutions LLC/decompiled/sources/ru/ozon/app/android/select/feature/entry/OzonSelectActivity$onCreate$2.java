package ru.ozon.app.android.select.feature.entry;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.select.feature.entry.OzonSelectActivity$onCreate$2", f = "OzonSelectActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class OzonSelectActivity$onCreate$2 extends j implements Function2<Unit, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ OzonSelectActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonSelectActivity$onCreate$2(OzonSelectActivity ozonSelectActivity, d<? super OzonSelectActivity$onCreate$2> dVar) {
        super(2, dVar);
        this.this$0 = ozonSelectActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OzonSelectActivity$onCreate$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.notifyAppHostNotificationUiReady();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, d<? super Unit> dVar) {
        return ((OzonSelectActivity$onCreate$2) create(unit, dVar)).invokeSuspend(Unit.f71690a);
    }
}
