package ru.ozon.app.android.search.aiMessenger.blocks.markdown.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.analytics.i;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.app.android.search.aiMessenger.blocks.markdown.presentation.AIMarkdownChatView;
import ru.ozon.app.android.search.databinding.ItemMarkwonRecyclerBinding;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/app/android/search/databinding/ItemMarkwonRecyclerBinding;", "binding", "Lru/ozon/android/messenger/framework/core/d;", "references", "Lru/ozon/app/android/search/aiMessenger/blocks/markdown/presentation/AIMarkdownChatView;", "invoke", "(Lru/ozon/app/android/search/databinding/ItemMarkwonRecyclerBinding;Lru/ozon/android/messenger/framework/core/d;)Lru/ozon/app/android/search/aiMessenger/blocks/markdown/presentation/AIMarkdownChatView;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class AIMarkdownViewMapper$viewProducer$1 extends AbstractC7737t implements Function2<ItemMarkwonRecyclerBinding, d, AIMarkdownChatView> {
    final /* synthetic */ AIMarkdownViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AIMarkdownViewMapper$viewProducer$1(AIMarkdownViewMapper aIMarkdownViewMapper) {
        super(2);
        this.this$0 = aIMarkdownViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final AIMarkdownChatView invoke(ItemMarkwonRecyclerBinding binding, d references) {
        i iVar;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        iVar = this.this$0.trackerAnalyticsAdapter;
        return new AIMarkdownChatView(binding, references, iVar);
    }
}
