package ru.ozon.android.messenger.blocks.chat.search;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.chat.search.SearchChatDTO;
import ru.ozon.android.messenger.blocks.chat.search.i;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class h implements Function2<SearchChatDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends i>> {
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends i> invoke(SearchChatDTO searchChatDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        SearchChatDTO state = searchChatDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        TextDTO title = state.getTitle();
        List<BadgeDTO> badges = state.getBadges();
        TextDTO conversationId = state.getConversationId();
        SearchChatDTO.SearchPreviewDTO preview = state.getPreview();
        return C7714v.a0(new i(blockId, title, badges, conversationId, new i.a(preview.getText(), preview.getDate()), state.getAvatarIcon(), state.getTitleIcons(), state.getDeeplink(), state.getMessageId(), state.getChatId(), state.getTrackingInfo()));
    }
}
