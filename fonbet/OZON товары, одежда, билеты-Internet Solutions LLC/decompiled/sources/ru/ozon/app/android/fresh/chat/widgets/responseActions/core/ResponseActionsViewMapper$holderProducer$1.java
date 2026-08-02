package ru.ozon.app.android.fresh.chat.widgets.responseActions.core;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.chat.widgets.responseActions.presentation.ResponseActionsView;
import ru.ozon.app.android.fresh.chat.widgets.responseActions.presentation.ResponseActionsViewHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/chat/widgets/responseActions/presentation/ResponseActionsViewHolder;", "view", "Landroid/view/View;", "composerReferences", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ResponseActionsViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ResponseActionsViewHolder> {
    final /* synthetic */ ResponseActionsViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResponseActionsViewMapper$holderProducer$1(ResponseActionsViewMapper responseActionsViewMapper) {
        super(2);
        this.this$0 = responseActionsViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ResponseActionsViewHolder invoke(View view, ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        return new ResponseActionsViewHolder((ResponseActionsView) view, this.this$0.component().getTokenizedAnalytics(), this.this$0.component().getCustomActionHandlersStoreFactory(), composerReferences);
    }
}
