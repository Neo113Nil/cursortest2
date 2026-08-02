package ru.ozon.app.android.ugc.core.widgets.commentsListV3.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsMapper;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsV3Mapper;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.domain.CommentsRepositoryImpl;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/domain/CommentsRepositoryImpl;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CommentsListComponent$Companion$create$1$1$commentsRepository$2 extends AbstractC7737t implements Function0<CommentsRepositoryImpl> {
    final /* synthetic */ CommentsListComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsListComponent$Companion$create$1$1$commentsRepository$2(CommentsListComponent$Companion$create$1$1 commentsListComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = commentsListComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CommentsRepositoryImpl invoke() {
        ActionComponentApi actionComponentApi;
        CommentsMapper commentsMapper;
        CommentsV3Mapper commentsV3Mapper;
        actionComponentApi = this.this$0.actionComponentApi;
        ActionV2Repository actionRepository = actionComponentApi.getActionRepository();
        commentsMapper = this.this$0.getCommentsMapper();
        commentsV3Mapper = this.this$0.getCommentsV3Mapper();
        return new CommentsRepositoryImpl(actionRepository, commentsMapper, commentsV3Mapper);
    }
}
