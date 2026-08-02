package ru.ozon.android.messenger.blocks.chat.sx;

import Sc.o;
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
import ru.ozon.android.messenger.blocks.chat.sx.SxChatDTO;
import ru.ozon.android.messenger.blocks.chat.sx.b;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

/* loaded from: classes10.dex */
public final class a implements Function2<SxChatDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends b>> {

    /* renamed from: ru.ozon.android.messenger.blocks.chat.sx.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1478a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84629a;

        static {
            int[] iArr = new int[SxChatDTO.a.values().length];
            try {
                iArr[SxChatDTO.a.INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SxChatDTO.a.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SxChatDTO.a.EXTENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f84629a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends b> invoke(SxChatDTO sxChatDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        ?? r82;
        b.a aVar;
        SxChatDTO state = sxChatDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        ArrayList arrayList = new ArrayList();
        Icon trustIcon = state.getTrustIcon();
        if (trustIcon != null) {
            arrayList.add(trustIcon);
        }
        List<Icon> titleIcons = state.getTitleIcons();
        if (titleIcons != null) {
            arrayList.addAll(titleIcons);
        }
        UnreadCountIndicatorDTO unreadCountIndicator = state.getUnreadCountIndicator();
        m a11 = unreadCountIndicator != null ? l.a(unreadCountIndicator) : new m(state.getUnreadCount(), n.ACTIVE);
        String firstUnreadMessageId = state.getFirstUnreadMessageId();
        PreviewVO a12 = i.a(state.getPreview());
        Uri parse = Uri.parse(state.getDeeplink());
        List<ContextMenuItemDTO> contextMenuItems = state.getContextMenuItems();
        if (contextMenuItems != null) {
            List<ContextMenuItemDTO> list = contextMenuItems;
            r82 = new ArrayList(C7714v.z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r82.add(ru.ozon.android.messenger.blocks.chat.common.menuItems.a.a((ContextMenuItemDTO) it.next()));
            }
        } else {
            r82 = K.f71697a;
        }
        ru.ozon.android.messenger.blocks.chat.common.c cVar2 = new ru.ozon.android.messenger.blocks.chat.common.c(blockId, a11, firstUnreadMessageId, a12, arrayList, parse, r82, state.getAnimation(), state.getContextMenu());
        String title = state.getTitle();
        List<BadgeDTO> previewBadges = state.getPreviewBadges();
        String conversationId = state.getConversationId();
        int i11 = C1478a.f84629a[state.getDisplayType().ordinal()];
        if (i11 == 1) {
            aVar = b.a.INVALID;
        } else if (i11 == 2) {
            aVar = b.a.REGULAR;
        } else {
            if (i11 != 3) {
                throw new o();
            }
            aVar = b.a.EXTENDED;
        }
        return C7714v.a0(new b(title, previewBadges, conversationId, aVar, cVar2));
    }
}
