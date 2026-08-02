package ru.ozon.app.android.cscore.buttonv2.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ActionButtonViewModel$loading$2 extends AbstractC7737t implements Function0<SingleLiveEvent<Boolean>> {
    final /* synthetic */ ActionButtonViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionButtonViewModel$loading$2(ActionButtonViewModel actionButtonViewModel) {
        super(0);
        this.this$0 = actionButtonViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SingleLiveEvent<Boolean> invoke() {
        SingleLiveEvent<Boolean> singleLiveEvent;
        singleLiveEvent = this.this$0.singleLoading;
        return singleLiveEvent;
    }
}
