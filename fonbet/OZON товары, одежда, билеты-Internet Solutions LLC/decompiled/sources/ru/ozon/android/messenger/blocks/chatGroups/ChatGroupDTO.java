package ru.ozon.android.messenger.blocks.chatGroups;

import El.C2971a;
import G.g;
import N3.C3660k;
import Sc.InterfaceC3999a;
import T7.P;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chat.common.UnreadCountIndicatorDTO;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b!\b\u0081\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Jh\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0006HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0019\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00060"}, d2 = {"Lru/ozon/android/messenger/blocks/chatGroups/ChatGroupDTO;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "chatType", "unreadCount", "", "unreadCountIndicator", "Lru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO;", "groupIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "hasSearch", "", "trackingInfo", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/Boolean;Ljava/util/Map;)V", "getName", "()Ljava/lang/String;", "getChatType", "getUnreadCount$annotations", "()V", "getUnreadCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUnreadCountIndicator", "()Lru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO;", "getGroupIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getHasSearch", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/Boolean;Ljava/util/Map;)Lru/ozon/android/messenger/blocks/chatGroups/ChatGroupDTO;", "equals", "other", "hashCode", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ChatGroupDTO {
    public static final int $stable = 8;

    @NotNull
    private final String chatType;

    @NotNull
    private final IconDTO groupIcon;
    private final Boolean hasSearch;

    @NotNull
    private final String name;
    private final Map<String, MessengerTrackingInfo> trackingInfo;
    private final Integer unreadCount;
    private final UnreadCountIndicatorDTO unreadCountIndicator;

    public ChatGroupDTO(@NotNull String name, @NotNull String chatType, Integer num, UnreadCountIndicatorDTO unreadCountIndicatorDTO, @NotNull IconDTO groupIcon, Boolean bool, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(chatType, "chatType");
        Intrinsics.checkNotNullParameter(groupIcon, "groupIcon");
        this.name = name;
        this.chatType = chatType;
        this.unreadCount = num;
        this.unreadCountIndicator = unreadCountIndicatorDTO;
        this.groupIcon = groupIcon;
        this.hasSearch = bool;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ChatGroupDTO copy$default(ChatGroupDTO chatGroupDTO, String str, String str2, Integer num, UnreadCountIndicatorDTO unreadCountIndicatorDTO, IconDTO iconDTO, Boolean bool, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = chatGroupDTO.name;
        }
        if ((i11 & 2) != 0) {
            str2 = chatGroupDTO.chatType;
        }
        if ((i11 & 4) != 0) {
            num = chatGroupDTO.unreadCount;
        }
        if ((i11 & 8) != 0) {
            unreadCountIndicatorDTO = chatGroupDTO.unreadCountIndicator;
        }
        if ((i11 & 16) != 0) {
            iconDTO = chatGroupDTO.groupIcon;
        }
        if ((i11 & 32) != 0) {
            bool = chatGroupDTO.hasSearch;
        }
        if ((i11 & 64) != 0) {
            map = chatGroupDTO.trackingInfo;
        }
        Boolean bool2 = bool;
        Map map2 = map;
        IconDTO iconDTO2 = iconDTO;
        Integer num2 = num;
        return chatGroupDTO.copy(str, str2, num2, unreadCountIndicatorDTO, iconDTO2, bool2, map2);
    }

    @InterfaceC3999a
    public static /* synthetic */ void getUnreadCount$annotations() {
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getChatType() {
        return this.chatType;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getUnreadCount() {
        return this.unreadCount;
    }

    /* renamed from: component4, reason: from getter */
    public final UnreadCountIndicatorDTO getUnreadCountIndicator() {
        return this.unreadCountIndicator;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final IconDTO getGroupIcon() {
        return this.groupIcon;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getHasSearch() {
        return this.hasSearch;
    }

    public final Map<String, MessengerTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final ChatGroupDTO copy(@NotNull String name, @NotNull String chatType, Integer unreadCount, UnreadCountIndicatorDTO unreadCountIndicator, @NotNull IconDTO groupIcon, Boolean hasSearch, Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(chatType, "chatType");
        Intrinsics.checkNotNullParameter(groupIcon, "groupIcon");
        return new ChatGroupDTO(name, chatType, unreadCount, unreadCountIndicator, groupIcon, hasSearch, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatGroupDTO)) {
            return false;
        }
        ChatGroupDTO chatGroupDTO = (ChatGroupDTO) other;
        return Intrinsics.d(this.name, chatGroupDTO.name) && Intrinsics.d(this.chatType, chatGroupDTO.chatType) && Intrinsics.d(this.unreadCount, chatGroupDTO.unreadCount) && Intrinsics.d(this.unreadCountIndicator, chatGroupDTO.unreadCountIndicator) && Intrinsics.d(this.groupIcon, chatGroupDTO.groupIcon) && Intrinsics.d(this.hasSearch, chatGroupDTO.hasSearch) && Intrinsics.d(this.trackingInfo, chatGroupDTO.trackingInfo);
    }

    @NotNull
    public final String getChatType() {
        return this.chatType;
    }

    @NotNull
    public final IconDTO getGroupIcon() {
        return this.groupIcon;
    }

    public final Boolean getHasSearch() {
        return this.hasSearch;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final Integer getUnreadCount() {
        return this.unreadCount;
    }

    public final UnreadCountIndicatorDTO getUnreadCountIndicator() {
        return this.unreadCountIndicator;
    }

    public int hashCode() {
        int a11 = g.a(this.name.hashCode() * 31, 31, this.chatType);
        Integer num = this.unreadCount;
        int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        UnreadCountIndicatorDTO unreadCountIndicatorDTO = this.unreadCountIndicator;
        int a12 = C2971a.a(this.groupIcon, (hashCode + (unreadCountIndicatorDTO == null ? 0 : unreadCountIndicatorDTO.hashCode())) * 31, 31);
        Boolean bool = this.hasSearch;
        int hashCode2 = (a12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.chatType;
        Integer num = this.unreadCount;
        UnreadCountIndicatorDTO unreadCountIndicatorDTO = this.unreadCountIndicator;
        IconDTO iconDTO = this.groupIcon;
        Boolean bool = this.hasSearch;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("ChatGroupDTO(name=", str, ", chatType=", str2, ", unreadCount=");
        d11.append(num);
        d11.append(", unreadCountIndicator=");
        d11.append(unreadCountIndicatorDTO);
        d11.append(", groupIcon=");
        d11.append(iconDTO);
        d11.append(", hasSearch=");
        d11.append(bool);
        d11.append(", trackingInfo=");
        return P.f(d11, map, ")");
    }

    public /* synthetic */ ChatGroupDTO(String str, String str2, Integer num, UnreadCountIndicatorDTO unreadCountIndicatorDTO, IconDTO iconDTO, Boolean bool, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, num, unreadCountIndicatorDTO, iconDTO, (i11 & 32) != 0 ? null : bool, (i11 & 64) != 0 ? null : map);
    }
}
