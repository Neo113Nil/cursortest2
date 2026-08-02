package ru.ozon.android.messenger.blocks.chat.old;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import ru.ozon.android.messenger.blocks.chat.common.PreviewVO;
import ru.ozon.android.messenger.blocks.chat.common.l;
import ru.ozon.android.messenger.blocks.chat.common.m;
import ru.ozon.android.messenger.blocks.chat.common.menuItems.ContextMenuItemDTO;
import ru.ozon.android.messenger.blocks.chat.old.ChatDTO;
import ru.ozon.android.messenger.framework.presentation.models.z;
import ru.ozon.uni.atoms.data.button.Icon;

/* loaded from: classes10.dex */
public final class a implements Function2<ChatDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends c>> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends c> invoke(ChatDTO chatDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        PreviewVO previewVO;
        List list;
        ChatDTO state = chatDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        m a11 = l.a(state.getUnreadCountIndicator());
        String firstUnreadMessageId = state.getFirstUnreadMessageId();
        ChatDTO.PreviewDTO lastMessagePreview = state.getLastMessagePreview();
        if (lastMessagePreview != null) {
            Intrinsics.checkNotNullParameter(lastMessagePreview, "<this>");
            String text = lastMessagePreview.getText();
            if (text == null) {
                text = "";
            }
            Icon icon = lastMessagePreview.getIcon();
            if (icon == null) {
                String url = lastMessagePreview.getUrl();
                icon = new Icon(url != null ? url : "", null);
            }
            List a02 = C7714v.a0(icon);
            DateTime date = lastMessagePreview.getDate();
            ChatDTO.PreviewDTO.a status = lastMessagePreview.getStatus();
            int i11 = status == null ? -1 : b.f84565a[status.ordinal()];
            z zVar = i11 != 1 ? i11 != 2 ? z.d.f91566a : z.e.f91567a : z.f.f91568a;
            ru.ozon.android.messenger.blocks.chat.common.f chatStatus = lastMessagePreview.getChatStatus();
            if (chatStatus == null) {
                chatStatus = ru.ozon.android.messenger.blocks.chat.common.f.CHAT_STATUS_ACTIVE;
            }
            previewVO = new PreviewVO(text, a02, date, zVar, chatStatus, false);
        } else {
            previewVO = null;
        }
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
        return C7714v.a0(new c(state.getTitleAtom(), state.getAvatarIcon(), state.getAvatarIconVerticalAlignment(), new ru.ozon.android.messenger.blocks.chat.common.c(blockId, a11, firstUnreadMessageId, previewVO, list2, parse, list, state.getAnimation(), state.getContextMenu())));
    }
}
