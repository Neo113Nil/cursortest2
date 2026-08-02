package ru.ozon.android.messenger.blocks.chat.search;

import F3.G;
import Hj.C3143a;
import I1.w;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u00018B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000bHÆ\u0003J\u0017\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u008f\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00069"}, d2 = {"Lru/ozon/android/messenger/blocks/chat/search/SearchChatDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "preview", "Lru/ozon/android/messenger/blocks/chat/search/SearchChatDTO$SearchPreviewDTO;", "deeplink", "", "messageId", "chatId", "badges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "conversationId", "avatarIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "titleIcons", "Lru/ozon/uni/atoms/data/button/Icon;", "trackingInfo", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/android/messenger/blocks/chat/search/SearchChatDTO$SearchPreviewDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/util/List;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPreview", "()Lru/ozon/android/messenger/blocks/chat/search/SearchChatDTO$SearchPreviewDTO;", "getDeeplink", "()Ljava/lang/String;", "getMessageId", "getChatId", "getBadges", "()Ljava/util/List;", "getConversationId", "getAvatarIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTitleIcons", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "SearchPreviewDTO", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SearchChatDTO {
    public static final int $stable = 8;
    private final IconDTO avatarIcon;
    private final List<BadgeDTO> badges;

    @NotNull
    private final String chatId;
    private final TextDTO conversationId;

    @NotNull
    private final String deeplink;

    @NotNull
    private final String messageId;

    @NotNull
    private final SearchPreviewDTO preview;

    @NotNull
    private final TextDTO title;
    private final List<Icon> titleIcons;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    @com.squareup.moshi.j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/android/messenger/blocks/chat/search/SearchChatDTO$SearchPreviewDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "date", "Lorg/joda/time/DateTime;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lorg/joda/time/DateTime;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDate", "()Lorg/joda/time/DateTime;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchPreviewDTO {
        public static final int $stable = 8;

        @NotNull
        private final DateTime date;

        @NotNull
        private final TextDTO text;

        public SearchPreviewDTO(@NotNull TextDTO text, @NotNull DateTime date) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(date, "date");
            this.text = text;
            this.date = date;
        }

        public static /* synthetic */ SearchPreviewDTO copy$default(SearchPreviewDTO searchPreviewDTO, TextDTO textDTO, DateTime dateTime, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = searchPreviewDTO.text;
            }
            if ((i11 & 2) != 0) {
                dateTime = searchPreviewDTO.date;
            }
            return searchPreviewDTO.copy(textDTO, dateTime);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final DateTime getDate() {
            return this.date;
        }

        @NotNull
        public final SearchPreviewDTO copy(@NotNull TextDTO text, @NotNull DateTime date) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(date, "date");
            return new SearchPreviewDTO(text, date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchPreviewDTO)) {
                return false;
            }
            SearchPreviewDTO searchPreviewDTO = (SearchPreviewDTO) other;
            return Intrinsics.d(this.text, searchPreviewDTO.text) && Intrinsics.d(this.date, searchPreviewDTO.date);
        }

        @NotNull
        public final DateTime getDate() {
            return this.date;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            return this.date.hashCode() + (this.text.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "SearchPreviewDTO(text=" + this.text + ", date=" + this.date + ")";
        }
    }

    public SearchChatDTO(@NotNull TextDTO title, @NotNull SearchPreviewDTO preview, @NotNull String deeplink, @NotNull String messageId, @NotNull String chatId, List<BadgeDTO> list, TextDTO textDTO, IconDTO iconDTO, List<Icon> list2, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.title = title;
        this.preview = preview;
        this.deeplink = deeplink;
        this.messageId = messageId;
        this.chatId = chatId;
        this.badges = list;
        this.conversationId = textDTO;
        this.avatarIcon = iconDTO;
        this.titleIcons = list2;
        this.trackingInfo = map;
    }

    public static /* synthetic */ SearchChatDTO copy$default(SearchChatDTO searchChatDTO, TextDTO textDTO, SearchPreviewDTO searchPreviewDTO, String str, String str2, String str3, List list, TextDTO textDTO2, IconDTO iconDTO, List list2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = searchChatDTO.title;
        }
        if ((i11 & 2) != 0) {
            searchPreviewDTO = searchChatDTO.preview;
        }
        if ((i11 & 4) != 0) {
            str = searchChatDTO.deeplink;
        }
        if ((i11 & 8) != 0) {
            str2 = searchChatDTO.messageId;
        }
        if ((i11 & 16) != 0) {
            str3 = searchChatDTO.chatId;
        }
        if ((i11 & 32) != 0) {
            list = searchChatDTO.badges;
        }
        if ((i11 & 64) != 0) {
            textDTO2 = searchChatDTO.conversationId;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            iconDTO = searchChatDTO.avatarIcon;
        }
        if ((i11 & 256) != 0) {
            list2 = searchChatDTO.titleIcons;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            map = searchChatDTO.trackingInfo;
        }
        List list3 = list2;
        Map map2 = map;
        TextDTO textDTO3 = textDTO2;
        IconDTO iconDTO2 = iconDTO;
        String str4 = str3;
        List list4 = list;
        return searchChatDTO.copy(textDTO, searchPreviewDTO, str, str2, str4, list4, textDTO3, iconDTO2, list3, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, MessengerTrackingInfo> component10() {
        return this.trackingInfo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final SearchPreviewDTO getPreview() {
        return this.preview;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    public final List<BadgeDTO> component6() {
        return this.badges;
    }

    /* renamed from: component7, reason: from getter */
    public final TextDTO getConversationId() {
        return this.conversationId;
    }

    /* renamed from: component8, reason: from getter */
    public final IconDTO getAvatarIcon() {
        return this.avatarIcon;
    }

    public final List<Icon> component9() {
        return this.titleIcons;
    }

    @NotNull
    public final SearchChatDTO copy(@NotNull TextDTO title, @NotNull SearchPreviewDTO preview, @NotNull String deeplink, @NotNull String messageId, @NotNull String chatId, List<BadgeDTO> badges, TextDTO conversationId, IconDTO avatarIcon, List<Icon> titleIcons, Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return new SearchChatDTO(title, preview, deeplink, messageId, chatId, badges, conversationId, avatarIcon, titleIcons, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchChatDTO)) {
            return false;
        }
        SearchChatDTO searchChatDTO = (SearchChatDTO) other;
        return Intrinsics.d(this.title, searchChatDTO.title) && Intrinsics.d(this.preview, searchChatDTO.preview) && Intrinsics.d(this.deeplink, searchChatDTO.deeplink) && Intrinsics.d(this.messageId, searchChatDTO.messageId) && Intrinsics.d(this.chatId, searchChatDTO.chatId) && Intrinsics.d(this.badges, searchChatDTO.badges) && Intrinsics.d(this.conversationId, searchChatDTO.conversationId) && Intrinsics.d(this.avatarIcon, searchChatDTO.avatarIcon) && Intrinsics.d(this.titleIcons, searchChatDTO.titleIcons) && Intrinsics.d(this.trackingInfo, searchChatDTO.trackingInfo);
    }

    public final IconDTO getAvatarIcon() {
        return this.avatarIcon;
    }

    public final List<BadgeDTO> getBadges() {
        return this.badges;
    }

    @NotNull
    public final String getChatId() {
        return this.chatId;
    }

    public final TextDTO getConversationId() {
        return this.conversationId;
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    public final SearchPreviewDTO getPreview() {
        return this.preview;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final List<Icon> getTitleIcons() {
        return this.titleIcons;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = G.g.a(G.g.a(G.g.a((this.preview.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.deeplink), 31, this.messageId), 31, this.chatId);
        List<BadgeDTO> list = this.badges;
        int hashCode = (a11 + (list == null ? 0 : list.hashCode())) * 31;
        TextDTO textDTO = this.conversationId;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        IconDTO iconDTO = this.avatarIcon;
        int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        List<Icon> list2 = this.titleIcons;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        SearchPreviewDTO searchPreviewDTO = this.preview;
        String str = this.deeplink;
        String str2 = this.messageId;
        String str3 = this.chatId;
        List<BadgeDTO> list = this.badges;
        TextDTO textDTO2 = this.conversationId;
        IconDTO iconDTO = this.avatarIcon;
        List<Icon> list2 = this.titleIcons;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("SearchChatDTO(title=");
        sb2.append(textDTO);
        sb2.append(", preview=");
        sb2.append(searchPreviewDTO);
        sb2.append(", deeplink=");
        Nh.a.h(sb2, str, ", messageId=", str2, ", chatId=");
        w.d(str3, ", badges=", ", conversationId=", sb2, list);
        G.f(sb2, textDTO2, ", avatarIcon=", iconDTO, ", titleIcons=");
        return C3143a.h(sb2, list2, ", trackingInfo=", map, ")");
    }

    public /* synthetic */ SearchChatDTO(TextDTO textDTO, SearchPreviewDTO searchPreviewDTO, String str, String str2, String str3, List list, TextDTO textDTO2, IconDTO iconDTO, List list2, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, searchPreviewDTO, str, str2, str3, list, textDTO2, iconDTO, list2, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : map);
    }
}
