package ru.ozon.app.android.travel.actionhandler.travelResultActionV2;

import Vg.c;
import Vg.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.actionhandler.SupportedResultActionHandlers;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LVg/c;", "invoke", "()LVg/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class TravelResultActionV2Handler$createActionHandler$4 extends AbstractC7737t implements Function0<c> {
    final /* synthetic */ TravelResultActionV2Handler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelResultActionV2Handler$createActionHandler$4(TravelResultActionV2Handler travelResultActionV2Handler) {
        super(0);
        this.this$0 = travelResultActionV2Handler;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final c invoke() {
        d dVar;
        SupportedResultActionHandlers supportedResultActionHandlers;
        dVar = this.this$0.customActionHandlersStoreFactory;
        supportedResultActionHandlers = this.this$0.supportedResultActionHandlers;
        return dVar.create(supportedResultActionHandlers.getHandlers());
    }
}
