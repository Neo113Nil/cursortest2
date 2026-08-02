package ru.ozon.android.messenger.blocks.chat.bx;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.chat.common.PreviewVO;
import ru.ozon.android.messenger.blocks.chat.common.UnreadCountIndicatorDTO;
import ru.ozon.android.messenger.blocks.chat.common.i;
import ru.ozon.android.messenger.blocks.chat.common.l;
import ru.ozon.android.messenger.blocks.chat.common.m;
import ru.ozon.android.messenger.blocks.chat.common.menuItems.ContextMenuItemDTO;
import ru.ozon.android.messenger.blocks.chat.common.n;
import ru.ozon.uni.atoms.data.button.Icon;

/* loaded from: classes10.dex */
public final class a implements Function2<BxChatDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends b>> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends b> invoke(BxChatDTO bxChatDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        List list;
        BxChatDTO state = bxChatDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        UnreadCountIndicatorDTO unreadCountIndicator = state.getUnreadCountIndicator();
        m a11 = unreadCountIndicator != null ? l.a(unreadCountIndicator) : new m(state.getUnreadCount(), n.ACTIVE);
        String firstUnreadMessageId = state.getFirstUnreadMessageId();
        PreviewVO a12 = i.a(state.getPreview());
        List<Icon> titleIcons = state.getTitleIcons();
        if (titleIcons == null) {
            titleIcons = K.f71697a;
        }
        List<Icon> list2 = titleIcons;
        Uri parse = Uri.parse(state.getDeeplink());
        List<ContextMenuItemDTO> contextMenuItems = state.getContextMenuItems();
        if (contextMenuItems != null) {
            List<ContextMenuItemDTO> list3 = contextMenuItems;
            list = new ArrayList(C7714v.z(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                list.add(ru.ozon.android.messenger.blocks.chat.common.menuItems.a.a((ContextMenuItemDTO) it.next()));
            }
        } else {
            list = K.f71697a;
        }
        return C7714v.a0(new b(state.getTitle(), state.getAvatarIcon(), new ru.ozon.android.messenger.blocks.chat.common.c(blockId, a11, firstUnreadMessageId, a12, list2, parse, list, state.getAnimation(), state.getContextMenu())));
    }
}
