package ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.data.storage.offline.OfflineTravelStorage;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.presentation.OfflineTravelModelWidgetViewHolder$downloadData$1$1", f = "OfflineTravelModelWidgetViewHolder.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OfflineTravelModelWidgetViewHolder$downloadData$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ OfflineTravelModeVI $item;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OfflineTravelModelWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OfflineTravelModelWidgetViewHolder$downloadData$1$1(OfflineTravelModelWidgetViewHolder offlineTravelModelWidgetViewHolder, OfflineTravelModeVI offlineTravelModeVI, d<? super OfflineTravelModelWidgetViewHolder$downloadData$1$1> dVar) {
        super(2, dVar);
        this.this$0 = offlineTravelModelWidgetViewHolder;
        this.$item = offlineTravelModeVI;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OfflineTravelModelWidgetViewHolder$downloadData$1$1(this.this$0, this.$item, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        OfflineTravelModelViewModel offlineTravelModelViewModel;
        OfflineTravelStorage offlineTravelStorage;
        OfflineTravelModeVI offlineTravelModeVI;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            offlineTravelModelViewModel = this.this$0.viewModel;
            OfflineTravelModeVI offlineTravelModeVI2 = this.$item;
            offlineTravelStorage = this.this$0.offlineTravelStorage;
            this.L$0 = offlineTravelModelViewModel;
            this.L$1 = offlineTravelModeVI2;
            this.label = 1;
            Object widgetsHash = offlineTravelStorage.getWidgetsHash(this);
            if (widgetsHash == aVar) {
                return aVar;
            }
            offlineTravelModeVI = offlineTravelModeVI2;
            obj = widgetsHash;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            offlineTravelModeVI = (OfflineTravelModeVI) this.L$1;
            offlineTravelModelViewModel = (OfflineTravelModelViewModel) this.L$0;
            s.b(obj);
        }
        offlineTravelModelViewModel.downloadWidgetStates(offlineTravelModeVI, (String) obj);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OfflineTravelModelWidgetViewHolder$downloadData$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
