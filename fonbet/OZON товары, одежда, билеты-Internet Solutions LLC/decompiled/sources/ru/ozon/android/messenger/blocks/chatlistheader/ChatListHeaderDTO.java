package ru.ozon.android.messenger.blocks.chatlistheader;

import C.J;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.cell.IconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lru/ozon/android/messenger/blocks/chatlistheader/ChatListHeaderDTO;", "", "mainItem", "Lru/ozon/android/messenger/blocks/chatlistheader/ChatListHeaderDTO$MainItem;", "menuItems", "", "Lru/ozon/android/messenger/blocks/chatlistheader/ChatListHeaderDTO$MenuItemDTO;", "<init>", "(Lru/ozon/android/messenger/blocks/chatlistheader/ChatListHeaderDTO$MainItem;Ljava/util/List;)V", "getMainItem", "()Lru/ozon/android/messenger/blocks/chatlistheader/ChatListHeaderDTO$MainItem;", "getMenuItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "MenuItemDTO", "MainItem", "SearchBarDTO", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ChatListHeaderDTO {
    public static final int $stable = 8;

    @NotNull
    private final MainItem mainItem;
    private final List<MenuItemDTO> menuItems;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/android/messenger/blocks/chatlistheader/ChatListHeaderDTO$MainItem;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "searchBar", "Lru/ozon/android/messenger/blocks/chatlistheader/ChatListHeaderDTO$SearchBarDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/android/messenger/blocks/chatlistheader/ChatListHeaderDTO$SearchBarDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSearchBar", "()Lru/ozon/android/messenger/blocks/chatlistheader/ChatListHeaderDTO$SearchBarDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MainItem {
        public static final int $stable = 8;
        private final SearchBarDTO searchBar;
        private final TextDTO title;

        public MainItem(TextDTO textDTO, SearchBarDTO searchBarDTO) {
            this.title = textDTO;
            this.searchBar = searchBarDTO;
        }

        public static /* synthetic */ MainItem copy$default(MainItem mainItem, TextDTO textDTO, SearchBarDTO searchBarDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = mainItem.title;
            }
            if ((i11 & 2) != 0) {
                searchBarDTO = mainItem.searchBar;
            }
            return mainItem.copy(textDTO, searchBarDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final SearchBarDTO getSearchBar() {
            return this.searchBar;
        }

        @NotNull
        public final MainItem copy(TextDTO title, SearchBarDTO searchBar) {
            return new MainItem(title, searchBar);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MainItem)) {
                return false;
            }
            MainItem mainItem = (MainItem) other;
            return Intrinsics.d(this.title, mainItem.title) && Intrinsics.d(this.searchBar, mainItem.searchBar);
        }

        public final SearchBarDTO getSearchBar() {
            return this.searchBar;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            SearchBarDTO searchBarDTO = this.searchBar;
            return hashCode + (searchBarDTO != null ? searchBarDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "MainItem(title=" + this.title + ", searchBar=" + this.searchBar + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ,\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/android/messenger/blocks/chatlistheader/ChatListHeaderDTO$MenuItemDTO;", "", "actionButtons", "", "Lru/ozon/uni/atoms/data/cell/IconTitleSubtitleCellDTO;", "loadingTtl", "", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "getActionButtons", "()Ljava/util/List;", "getLoadingTtl", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Integer;)Lru/ozon/android/messenger/blocks/chatlistheader/ChatListHeaderDTO$MenuItemDTO;", "equals", "", "other", "hashCode", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MenuItemDTO {
        public static final int $stable = IconTitleSubtitleCellDTO.$stable;
        private final List<IconTitleSubtitleCellDTO> actionButtons;
        private final Integer loadingTtl;

        public MenuItemDTO(List<IconTitleSubtitleCellDTO> list, Integer num) {
            this.actionButtons = list;
            this.loadingTtl = num;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MenuItemDTO copy$default(MenuItemDTO menuItemDTO, List list, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = menuItemDTO.actionButtons;
            }
            if ((i11 & 2) != 0) {
                num = menuItemDTO.loadingTtl;
            }
            return menuItemDTO.copy(list, num);
        }

        public final List<IconTitleSubtitleCellDTO> component1() {
            return this.actionButtons;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getLoadingTtl() {
            return this.loadingTtl;
        }

        @NotNull
        public final MenuItemDTO copy(List<IconTitleSubtitleCellDTO> actionButtons, Integer loadingTtl) {
            return new MenuItemDTO(actionButtons, loadingTtl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MenuItemDTO)) {
                return false;
            }
            MenuItemDTO menuItemDTO = (MenuItemDTO) other;
            return Intrinsics.d(this.actionButtons, menuItemDTO.actionButtons) && Intrinsics.d(this.loadingTtl, menuItemDTO.loadingTtl);
        }

        public final List<IconTitleSubtitleCellDTO> getActionButtons() {
            return this.actionButtons;
        }

        public final Integer getLoadingTtl() {
            return this.loadingTtl;
        }

        public int hashCode() {
            List<IconTitleSubtitleCellDTO> list = this.actionButtons;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            Integer num = this.loadingTtl;
            return hashCode + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "MenuItemDTO(actionButtons=" + this.actionButtons + ", loadingTtl=" + this.loadingTtl + ")";
        }
    }

    public ChatListHeaderDTO(@NotNull MainItem mainItem, List<MenuItemDTO> list) {
        Intrinsics.checkNotNullParameter(mainItem, "mainItem");
        this.mainItem = mainItem;
        this.menuItems = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatListHeaderDTO copy$default(ChatListHeaderDTO chatListHeaderDTO, MainItem mainItem, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            mainItem = chatListHeaderDTO.mainItem;
        }
        if ((i11 & 2) != 0) {
            list = chatListHeaderDTO.menuItems;
        }
        return chatListHeaderDTO.copy(mainItem, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final MainItem getMainItem() {
        return this.mainItem;
    }

    public final List<MenuItemDTO> component2() {
        return this.menuItems;
    }

    @NotNull
    public final ChatListHeaderDTO copy(@NotNull MainItem mainItem, List<MenuItemDTO> menuItems) {
        Intrinsics.checkNotNullParameter(mainItem, "mainItem");
        return new ChatListHeaderDTO(mainItem, menuItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatListHeaderDTO)) {
            return false;
        }
        ChatListHeaderDTO chatListHeaderDTO = (ChatListHeaderDTO) other;
        return Intrinsics.d(this.mainItem, chatListHeaderDTO.mainItem) && Intrinsics.d(this.menuItems, chatListHeaderDTO.menuItems);
    }

    @NotNull
    public final MainItem getMainItem() {
        return this.mainItem;
    }

    public final List<MenuItemDTO> getMenuItems() {
        return this.menuItems;
    }

    public int hashCode() {
        int hashCode = this.mainItem.hashCode() * 31;
        List<MenuItemDTO> list = this.menuItems;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "ChatListHeaderDTO(mainItem=" + this.mainItem + ", menuItems=" + this.menuItems + ")";
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001;Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u00102\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0017\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012HÆ\u0003J\u008e\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\fHÖ\u0001J\t\u0010:\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010#\u001a\u0004\b$\u0010\"R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010#\u001a\u0004\b%\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006<"}, d2 = {"Lru/ozon/android/messenger/blocks/chatlistheader/ChatListHeaderDTO$SearchBarDTO;", "", "leftIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "hint", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "cancelButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "debounceMillis", "", "cornerRadius", "", "minSearchQueryTextLength", "maxSearchQueryTextLength", "clearIcon", "Lru/ozon/android/messenger/blocks/chatlistheader/ChatListHeaderDTO$SearchBarDTO$ClearIconDTO;", "trackingInfo", "", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/android/messenger/blocks/chatlistheader/ChatListHeaderDTO$SearchBarDTO$ClearIconDTO;Ljava/util/Map;)V", "getLeftIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getHint", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "getCancelButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getDebounceMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCornerRadius", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinSearchQueryTextLength", "getMaxSearchQueryTextLength", "getClearIcon", "()Lru/ozon/android/messenger/blocks/chatlistheader/ChatListHeaderDTO$SearchBarDTO$ClearIconDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/android/messenger/blocks/chatlistheader/ChatListHeaderDTO$SearchBarDTO$ClearIconDTO;Ljava/util/Map;)Lru/ozon/android/messenger/blocks/chatlistheader/ChatListHeaderDTO$SearchBarDTO;", "equals", "", "other", "hashCode", "toString", "ClearIconDTO", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class SearchBarDTO {
        public static final int $stable = 8;
        private final ButtonV3DTO cancelButton;
        private final ClearIconDTO clearIcon;
        private final Integer cornerRadius;
        private final Long debounceMillis;

        @NotNull
        private final TextDTO hint;

        @NotNull
        private final IconDTO leftIcon;
        private final Integer maxSearchQueryTextLength;
        private final Integer minSearchQueryTextLength;
        private final TextDTO text;
        private final Map<String, MessengerTrackingInfo> trackingInfo;

        public SearchBarDTO(@NotNull IconDTO leftIcon, @NotNull TextDTO hint, TextDTO textDTO, ButtonV3DTO buttonV3DTO, Long l11, Integer num, Integer num2, Integer num3, ClearIconDTO clearIconDTO, Map<String, MessengerTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(leftIcon, "leftIcon");
            Intrinsics.checkNotNullParameter(hint, "hint");
            this.leftIcon = leftIcon;
            this.hint = hint;
            this.text = textDTO;
            this.cancelButton = buttonV3DTO;
            this.debounceMillis = l11;
            this.cornerRadius = num;
            this.minSearchQueryTextLength = num2;
            this.maxSearchQueryTextLength = num3;
            this.clearIcon = clearIconDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ SearchBarDTO copy$default(SearchBarDTO searchBarDTO, IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, Long l11, Integer num, Integer num2, Integer num3, ClearIconDTO clearIconDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconDTO = searchBarDTO.leftIcon;
            }
            if ((i11 & 2) != 0) {
                textDTO = searchBarDTO.hint;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = searchBarDTO.text;
            }
            if ((i11 & 8) != 0) {
                buttonV3DTO = searchBarDTO.cancelButton;
            }
            if ((i11 & 16) != 0) {
                l11 = searchBarDTO.debounceMillis;
            }
            if ((i11 & 32) != 0) {
                num = searchBarDTO.cornerRadius;
            }
            if ((i11 & 64) != 0) {
                num2 = searchBarDTO.minSearchQueryTextLength;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                num3 = searchBarDTO.maxSearchQueryTextLength;
            }
            if ((i11 & 256) != 0) {
                clearIconDTO = searchBarDTO.clearIcon;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                map = searchBarDTO.trackingInfo;
            }
            ClearIconDTO clearIconDTO2 = clearIconDTO;
            Map map2 = map;
            Integer num4 = num2;
            Integer num5 = num3;
            Long l12 = l11;
            Integer num6 = num;
            return searchBarDTO.copy(iconDTO, textDTO, textDTO2, buttonV3DTO, l12, num6, num4, num5, clearIconDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconDTO getLeftIcon() {
            return this.leftIcon;
        }

        public final Map<String, MessengerTrackingInfo> component10() {
            return this.trackingInfo;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getHint() {
            return this.hint;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component4, reason: from getter */
        public final ButtonV3DTO getCancelButton() {
            return this.cancelButton;
        }

        /* renamed from: component5, reason: from getter */
        public final Long getDebounceMillis() {
            return this.debounceMillis;
        }

        /* renamed from: component6, reason: from getter */
        public final Integer getCornerRadius() {
            return this.cornerRadius;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getMinSearchQueryTextLength() {
            return this.minSearchQueryTextLength;
        }

        /* renamed from: component8, reason: from getter */
        public final Integer getMaxSearchQueryTextLength() {
            return this.maxSearchQueryTextLength;
        }

        /* renamed from: component9, reason: from getter */
        public final ClearIconDTO getClearIcon() {
            return this.clearIcon;
        }

        @NotNull
        public final SearchBarDTO copy(@NotNull IconDTO leftIcon, @NotNull TextDTO hint, TextDTO text, ButtonV3DTO cancelButton, Long debounceMillis, Integer cornerRadius, Integer minSearchQueryTextLength, Integer maxSearchQueryTextLength, ClearIconDTO clearIcon, Map<String, MessengerTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(leftIcon, "leftIcon");
            Intrinsics.checkNotNullParameter(hint, "hint");
            return new SearchBarDTO(leftIcon, hint, text, cancelButton, debounceMillis, cornerRadius, minSearchQueryTextLength, maxSearchQueryTextLength, clearIcon, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchBarDTO)) {
                return false;
            }
            SearchBarDTO searchBarDTO = (SearchBarDTO) other;
            return Intrinsics.d(this.leftIcon, searchBarDTO.leftIcon) && Intrinsics.d(this.hint, searchBarDTO.hint) && Intrinsics.d(this.text, searchBarDTO.text) && Intrinsics.d(this.cancelButton, searchBarDTO.cancelButton) && Intrinsics.d(this.debounceMillis, searchBarDTO.debounceMillis) && Intrinsics.d(this.cornerRadius, searchBarDTO.cornerRadius) && Intrinsics.d(this.minSearchQueryTextLength, searchBarDTO.minSearchQueryTextLength) && Intrinsics.d(this.maxSearchQueryTextLength, searchBarDTO.maxSearchQueryTextLength) && Intrinsics.d(this.clearIcon, searchBarDTO.clearIcon) && Intrinsics.d(this.trackingInfo, searchBarDTO.trackingInfo);
        }

        public final ButtonV3DTO getCancelButton() {
            return this.cancelButton;
        }

        public final ClearIconDTO getClearIcon() {
            return this.clearIcon;
        }

        public final Integer getCornerRadius() {
            return this.cornerRadius;
        }

        public final Long getDebounceMillis() {
            return this.debounceMillis;
        }

        @NotNull
        public final TextDTO getHint() {
            return this.hint;
        }

        @NotNull
        public final IconDTO getLeftIcon() {
            return this.leftIcon;
        }

        public final Integer getMaxSearchQueryTextLength() {
            return this.maxSearchQueryTextLength;
        }

        public final Integer getMinSearchQueryTextLength() {
            return this.minSearchQueryTextLength;
        }

        public final TextDTO getText() {
            return this.text;
        }

        public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = Ns.b.a(this.hint, this.leftIcon.hashCode() * 31, 31);
            TextDTO textDTO = this.text;
            int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            ButtonV3DTO buttonV3DTO = this.cancelButton;
            int hashCode2 = (hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
            Long l11 = this.debounceMillis;
            int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Integer num = this.cornerRadius;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.minSearchQueryTextLength;
            int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.maxSearchQueryTextLength;
            int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
            ClearIconDTO clearIconDTO = this.clearIcon;
            int hashCode7 = (hashCode6 + (clearIconDTO == null ? 0 : clearIconDTO.hashCode())) * 31;
            Map<String, MessengerTrackingInfo> map = this.trackingInfo;
            return hashCode7 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.leftIcon;
            TextDTO textDTO = this.hint;
            TextDTO textDTO2 = this.text;
            ButtonV3DTO buttonV3DTO = this.cancelButton;
            Long l11 = this.debounceMillis;
            Integer num = this.cornerRadius;
            Integer num2 = this.minSearchQueryTextLength;
            Integer num3 = this.maxSearchQueryTextLength;
            ClearIconDTO clearIconDTO = this.clearIcon;
            Map<String, MessengerTrackingInfo> map = this.trackingInfo;
            StringBuilder i11 = Bi.b.i("SearchBarDTO(leftIcon=", ", hint=", ", text=", iconDTO, textDTO);
            i11.append(textDTO2);
            i11.append(", cancelButton=");
            i11.append(buttonV3DTO);
            i11.append(", debounceMillis=");
            i11.append(l11);
            i11.append(", cornerRadius=");
            i11.append(num);
            i11.append(", minSearchQueryTextLength=");
            Ef0.c.e(i11, num2, ", maxSearchQueryTextLength=", num3, ", clearIcon=");
            i11.append(clearIconDTO);
            i11.append(", trackingInfo=");
            i11.append(map);
            i11.append(")");
            return i11.toString();
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, d2 = {"Lru/ozon/android/messenger/blocks/chatlistheader/ChatListHeaderDTO$SearchBarDTO$ClearIconDTO;", "Landroid/os/Parcelable;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "trackingInfo", "", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/util/Map;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ClearIconDTO implements Parcelable {
            public static final int $stable = 8;

            @NotNull
            public static final Parcelable.Creator<ClearIconDTO> CREATOR = new a();
            private final IconDTO icon;
            private final Map<String, MessengerTrackingInfo> trackingInfo;

            public static final class a implements Parcelable.Creator<ClearIconDTO> {
                @Override // android.os.Parcelable.Creator
                public final ClearIconDTO createFromParcel(Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    IconDTO iconDTO = (IconDTO) parcel.readParcelable(ClearIconDTO.class.getClassLoader());
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt = parcel.readInt();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                        for (int i11 = 0; i11 != readInt; i11++) {
                            linkedHashMap2.put(parcel.readString(), MessengerTrackingInfo.CREATOR.createFromParcel(parcel));
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new ClearIconDTO(iconDTO, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final ClearIconDTO[] newArray(int i11) {
                    return new ClearIconDTO[i11];
                }
            }

            public ClearIconDTO(IconDTO iconDTO, Map<String, MessengerTrackingInfo> map) {
                this.icon = iconDTO;
                this.trackingInfo = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ClearIconDTO copy$default(ClearIconDTO clearIconDTO, IconDTO iconDTO, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    iconDTO = clearIconDTO.icon;
                }
                if ((i11 & 2) != 0) {
                    map = clearIconDTO.trackingInfo;
                }
                return clearIconDTO.copy(iconDTO, map);
            }

            /* renamed from: component1, reason: from getter */
            public final IconDTO getIcon() {
                return this.icon;
            }

            public final Map<String, MessengerTrackingInfo> component2() {
                return this.trackingInfo;
            }

            @NotNull
            public final ClearIconDTO copy(IconDTO icon, Map<String, MessengerTrackingInfo> trackingInfo) {
                return new ClearIconDTO(icon, trackingInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ClearIconDTO)) {
                    return false;
                }
                ClearIconDTO clearIconDTO = (ClearIconDTO) other;
                return Intrinsics.d(this.icon, clearIconDTO.icon) && Intrinsics.d(this.trackingInfo, clearIconDTO.trackingInfo);
            }

            public final IconDTO getIcon() {
                return this.icon;
            }

            public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                IconDTO iconDTO = this.icon;
                int hashCode = (iconDTO == null ? 0 : iconDTO.hashCode()) * 31;
                Map<String, MessengerTrackingInfo> map = this.trackingInfo;
                return hashCode + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "ClearIconDTO(icon=" + this.icon + ", trackingInfo=" + this.trackingInfo + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.icon, flags);
                Map<String, MessengerTrackingInfo> map = this.trackingInfo;
                if (map == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator e11 = J.e(map, dest, 1);
                while (e11.hasNext()) {
                    Map.Entry entry = (Map.Entry) e11.next();
                    dest.writeString((String) entry.getKey());
                    ((MessengerTrackingInfo) entry.getValue()).writeToParcel(dest, flags);
                }
            }

            public /* synthetic */ ClearIconDTO(IconDTO iconDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(iconDTO, (i11 & 2) != 0 ? null : map);
            }
        }

        public /* synthetic */ SearchBarDTO(IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, Long l11, Integer num, Integer num2, Integer num3, ClearIconDTO clearIconDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(iconDTO, textDTO, textDTO2, buttonV3DTO, l11, num, num2, num3, clearIconDTO, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : map);
        }
    }
}
