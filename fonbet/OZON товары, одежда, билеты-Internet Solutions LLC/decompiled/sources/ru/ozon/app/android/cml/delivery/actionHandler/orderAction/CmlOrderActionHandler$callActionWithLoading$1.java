package ru.ozon.app.android.cml.delivery.actionHandler.orderAction;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cml.delivery.actionHandler.orderAction.CmlOrderActionHandler", f = "CmlOrderActionHandler.kt", l = {151}, m = "callActionWithLoading")
/* loaded from: classes11.dex */
final class CmlOrderActionHandler$callActionWithLoading$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CmlOrderActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CmlOrderActionHandler$callActionWithLoading$1(CmlOrderActionHandler cmlOrderActionHandler, d<? super CmlOrderActionHandler$callActionWithLoading$1> dVar) {
        super(dVar);
        this.this$0 = cmlOrderActionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object callActionWithLoading;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        callActionWithLoading = this.this$0.callActionWithLoading(null, null, this);
        return callActionWithLoading;
    }
}
