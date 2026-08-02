package ru.ozon.app.android.storefront.stories.setContainer;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.events.StoriesUpdate;
import ru.ozon.app.android.storefront.domain.events.UpdateStoryViewed;
import ru.ozon.app.android.storefront.stories.setContainer.SetContainerViewMapper;
import ru.ozon.app.android.storefront.stories.setContainer.data.SetContainerVO;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$J$a;", "update", "Lru/ozon/app/android/storefront/stories/setContainer/data/SetContainerVO;", "oldVO", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/storefront/stories/setContainer/data/SetContainerVO;)Lru/ozon/app/android/storefront/stories/setContainer/data/SetContainerVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class SetContainerViewMapper$updateConsumer$1 extends AbstractC7737t implements Function2<a.J.InterfaceC0007a, SetContainerVO, SetContainerVO> {
    final /* synthetic */ SetContainerViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetContainerViewMapper$updateConsumer$1(SetContainerViewMapper setContainerViewMapper) {
        super(2);
        this.this$0 = setContainerViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final SetContainerVO invoke(a.J.InterfaceC0007a update, SetContainerVO oldVO) {
        SetContainerVO updateViewed;
        SetContainerVO updateViewed2;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        if (update instanceof StoriesUpdate) {
            updateViewed2 = this.this$0.updateViewed(oldVO, (StoriesUpdate) update);
            return updateViewed2;
        }
        if (!(update instanceof UpdateStoryViewed)) {
            return update instanceof SetContainerViewMapper.SelectorState ? SetContainerVO.copy$default(oldVO, 0L, null, 0, ((SetContainerViewMapper.SelectorState) update).getSelected(), 7, null) : oldVO;
        }
        updateViewed = this.this$0.updateViewed(oldVO, (UpdateStoryViewed) update);
        return updateViewed;
    }
}
