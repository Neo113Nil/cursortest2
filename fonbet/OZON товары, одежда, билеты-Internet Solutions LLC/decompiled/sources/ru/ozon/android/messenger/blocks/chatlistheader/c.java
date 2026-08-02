package ru.ozon.android.messenger.blocks.chatlistheader;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chatlistheader.ChatListHeaderDTO;
import ru.ozon.android.messenger.blocks.chatlistheader.f;
import ru.ozon.android.messenger.framework.analytics.h;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.IconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

/* loaded from: classes10.dex */
public final class c implements Function2<ChatListHeaderDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends f>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d.b f84733a;

    public c(@NotNull d.b blockCustomSettings) {
        Intrinsics.checkNotNullParameter(blockCustomSettings, "blockCustomSettings");
        this.f84733a = blockCustomSettings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5, types: [ru.ozon.android.messenger.blocks.chatlistheader.f$b$a] */
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends f> invoke(ChatListHeaderDTO chatListHeaderDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        f.c aVar;
        f.b.C1482b c1482b;
        IconTitleSubtitleCellDTO iconTitleSubtitleCellDTO;
        IconDTO icon;
        AtomActionDTO action;
        ChatListHeaderDTO state = chatListHeaderDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        List<ChatListHeaderDTO.MenuItemDTO> menuItems = state.getMenuItems();
        K k11 = null;
        if (menuItems != null) {
            ?? arrayList = new ArrayList();
            for (ChatListHeaderDTO.MenuItemDTO menuItemDTO : menuItems) {
                List<IconTitleSubtitleCellDTO> actionButtons = menuItemDTO.getActionButtons();
                if (actionButtons == null || actionButtons.isEmpty() || (icon = (iconTitleSubtitleCellDTO = (IconTitleSubtitleCellDTO) C7714v.K(menuItemDTO.getActionButtons())).getIcon()) == null) {
                    c1482b = null;
                } else if (menuItemDTO.getActionButtons().size() > 1) {
                    c1482b = new f.b.C1482b(new IconDTO(IconDTO.IconSize.SIZE_500, null, IconDTO.IconShape.SHAPE_NONE, null, new CommonAtomIconDTO("ic_m_kebab_ios_filled", "graphicTertiary"), null, null, null, null, null, null, null, null, null, null, null, 65514, null), new f.d(menuItemDTO.getActionButtons(), menuItemDTO.getLoadingTtl()));
                } else {
                    f.d dVar = new f.d(menuItemDTO.getActionButtons(), menuItemDTO.getLoadingTtl());
                    CommonCellSettings common = iconTitleSubtitleCellDTO.getCommon();
                    c1482b = new f.b.a(icon, dVar, (common == null || (action = common.getAction()) == null) ? null : ru.ozon.android.messenger.framework.navigation.action.b.c(action), h.a(iconTitleSubtitleCellDTO.getTrackingInfo()));
                }
                if (c1482b != null) {
                    arrayList.add(c1482b);
                }
            }
            k11 = arrayList;
        }
        if (k11 == null) {
            k11 = K.f71697a;
        }
        boolean b11 = this.f84733a.b();
        ChatListHeaderDTO.MainItem mainItem = state.getMainItem();
        if (mainItem.getTitle() != null && mainItem.getSearchBar() == null) {
            aVar = new f.c.b(mainItem.getTitle());
        } else {
            if (mainItem.getSearchBar() == null || mainItem.getTitle() != null) {
                throw new IllegalArgumentException("unknown type '" + mainItem + "'. One of the elements must not be null");
            }
            ChatListHeaderDTO.SearchBarDTO searchBar = mainItem.getSearchBar();
            IconDTO leftIcon = searchBar.getLeftIcon();
            TextDTO hint = searchBar.getHint();
            TextDTO text = searchBar.getText();
            aVar = new f.c.a(leftIcon, hint, text == null ? new TextDTO(new OzonSpannableString(), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null) : text, searchBar.getCancelButton(), searchBar.getDebounceMillis(), searchBar.getCornerRadius(), searchBar.getMinSearchQueryTextLength(), searchBar.getMaxSearchQueryTextLength(), false, searchBar.getClearIcon(), searchBar.getTrackingInfo());
        }
        return C7714v.a0(new f(blockId, k11, b11, aVar));
    }
}
