package ru.ozon.app.android.search.aiMessenger.blocks.markdown.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.c;
import ru.ozon.app.android.search.aiMessenger.blocks.markdown.data.AIMarkdownDTO;
import ru.ozon.app.android.search.aiMessenger.blocks.markdown.presentation.AIMarkdownVO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/search/aiMessenger/blocks/markdown/core/AIMarkdownMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/search/aiMessenger/blocks/markdown/data/AIMarkdownDTO;", "Lru/ozon/android/messenger/framework/presentation/models/c;", "", "Lru/ozon/app/android/search/aiMessenger/blocks/markdown/presentation/AIMarkdownVO;", "Lru/ozon/android/messenger/framework/core/viewmapper/BlockMapper;", "<init>", "()V", "state", "id", "invoke", "(Lru/ozon/app/android/search/aiMessenger/blocks/markdown/data/AIMarkdownDTO;Lru/ozon/android/messenger/framework/presentation/models/c;)Ljava/util/List;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AIMarkdownMapper implements Function2<AIMarkdownDTO, c, List<? extends AIMarkdownVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AIMarkdownVO> invoke(@NotNull AIMarkdownDTO state, @NotNull c id2) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(id2, "id");
        return C7714v.a0(new AIMarkdownVO(id2, state.getData(), state.getTrackingInfo()));
    }
}
