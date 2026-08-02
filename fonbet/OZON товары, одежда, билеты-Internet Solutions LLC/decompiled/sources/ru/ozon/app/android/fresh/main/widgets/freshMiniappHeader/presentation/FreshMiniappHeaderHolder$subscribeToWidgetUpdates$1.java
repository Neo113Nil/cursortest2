package ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.presentation;

import Sc.s;
import WZ.l;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "response", "Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderUpdateResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.presentation.FreshMiniappHeaderHolder$subscribeToWidgetUpdates$1", f = "FreshMiniappHeaderHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FreshMiniappHeaderHolder$subscribeToWidgetUpdates$1 extends j implements Function2<FreshMiniappHeaderUpdateResponse, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FreshMiniappHeaderHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshMiniappHeaderHolder$subscribeToWidgetUpdates$1(FreshMiniappHeaderHolder freshMiniappHeaderHolder, d<? super FreshMiniappHeaderHolder$subscribeToWidgetUpdates$1> dVar) {
        super(2, dVar);
        this.this$0 = freshMiniappHeaderHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FreshMiniappHeaderHolder$subscribeToWidgetUpdates$1 freshMiniappHeaderHolder$subscribeToWidgetUpdates$1 = new FreshMiniappHeaderHolder$subscribeToWidgetUpdates$1(this.this$0, dVar);
        freshMiniappHeaderHolder$subscribeToWidgetUpdates$1.L$0 = obj;
        return freshMiniappHeaderHolder$subscribeToWidgetUpdates$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        l20.d c11;
        FreshMiniappHeaderMapper freshMiniappHeaderMapper;
        l lVar;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        FreshMiniappHeaderUpdateResponse freshMiniappHeaderUpdateResponse = (FreshMiniappHeaderUpdateResponse) this.L$0;
        Map<String, String> trackingPayloads = freshMiniappHeaderUpdateResponse.getTrackingPayloads();
        if (trackingPayloads != null) {
            lVar = this.this$0.tokenizedAnalytics;
            lVar.e(trackingPayloads);
        }
        ru.ozon.composer.ui.widget.l viewItem = this.this$0.getViewItem();
        if (viewItem != null && (c11 = viewItem.c()) != null) {
            FreshMiniappHeaderHolder freshMiniappHeaderHolder = this.this$0;
            freshMiniappHeaderMapper = freshMiniappHeaderHolder.mapper;
            FreshMiniappHeaderVO freshMiniappHeaderVO = (FreshMiniappHeaderVO) C7714v.M(freshMiniappHeaderMapper.invoke(freshMiniappHeaderUpdateResponse.getDto(), c11));
            if (freshMiniappHeaderVO != null && !freshMiniappHeaderVO.equals(freshMiniappHeaderHolder.getBoundData())) {
                freshMiniappHeaderHolder.updateFreshMiniappHeader(freshMiniappHeaderVO);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FreshMiniappHeaderUpdateResponse freshMiniappHeaderUpdateResponse, d<? super Unit> dVar) {
        return ((FreshMiniappHeaderHolder$subscribeToWidgetUpdates$1) create(freshMiniappHeaderUpdateResponse, dVar)).invokeSuspend(Unit.f71690a);
    }
}
