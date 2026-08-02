package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation;

import Vg.c;
import Vg.d;
import Vg.f;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LVg/c;", "invoke", "()LVg/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class HotelsBookTotalV3WidgetViewHolder$actionHandler$1 extends AbstractC7737t implements Function0<c> {
    final /* synthetic */ d $customActionHandlersStoreFactory;
    final /* synthetic */ HotelsBookTotalV3WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsBookTotalV3WidgetViewHolder$actionHandler$1(d dVar, HotelsBookTotalV3WidgetViewHolder hotelsBookTotalV3WidgetViewHolder) {
        super(0);
        this.$customActionHandlersStoreFactory = dVar;
        this.this$0 = hotelsBookTotalV3WidgetViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final c invoke() {
        Class[] supportedActionHandlers;
        d dVar = this.$customActionHandlersStoreFactory;
        supportedActionHandlers = this.this$0.getSupportedActionHandlers();
        return dVar.create((Class<? extends f>[]) Arrays.copyOf(supportedActionHandlers, supportedActionHandlers.length));
    }
}
