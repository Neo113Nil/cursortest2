package ru.ozon.app.android.geo.pvzSearcher;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.geo.addresseditformprompt.data.RecommendPvzRepository;
import ru.ozon.app.android.geo.pvzSearcher.PvzSearcherViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/geo/addresseditformprompt/data/RecommendPvzRepository$Result;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/geo/addresseditformprompt/data/RecommendPvzRepository$Result;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PvzSearcherViewModelImpl$searchPvz$3 extends AbstractC7737t implements Function1<RecommendPvzRepository.Result, Unit> {
    final /* synthetic */ PvzSearcherViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PvzSearcherViewModelImpl$searchPvz$3(PvzSearcherViewModelImpl pvzSearcherViewModelImpl) {
        super(1);
        this.this$0 = pvzSearcherViewModelImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RecommendPvzRepository.Result result) {
        invoke2(result);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RecommendPvzRepository.Result result) {
        PvzSearcherViewModel.Action notification;
        SingleLiveEvent<PvzSearcherViewModel.Action> actions = this.this$0.getActions();
        if (result instanceof RecommendPvzRepository.Result.Refresh) {
            RecommendPvzRepository.Result.Refresh refresh = (RecommendPvzRepository.Result.Refresh) result;
            notification = new PvzSearcherViewModel.Action.Refresh(refresh.getLink(), refresh.getViewPort());
        } else {
            if (!(result instanceof RecommendPvzRepository.Result.Notification)) {
                throw new o();
            }
            RecommendPvzRepository.Result.Notification notification2 = (RecommendPvzRepository.Result.Notification) result;
            notification = new PvzSearcherViewModel.Action.Notification(notification2.getRestriction(), notification2.getTrackingPayloads());
        }
        actions.setValue(notification);
    }
}
