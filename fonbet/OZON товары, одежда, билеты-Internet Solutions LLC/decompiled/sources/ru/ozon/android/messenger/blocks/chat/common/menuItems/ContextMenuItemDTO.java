package ru.ozon.android.messenger.blocks.chat.common.menuItems;

import B3.p;
import G.g;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JI\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/android/messenger/blocks/chat/common/menuItems/ContextMenuItemDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "icon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "backgroundColor", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ContextMenuItemDTO {
    public static final int $stable = 8;

    @NotNull
    private final AtomActionDTO action;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final CommonAtomIconDTO icon;

    @NotNull
    private final CommonAtomLabelDTO title;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    public ContextMenuItemDTO(@NotNull CommonAtomLabelDTO title, @NotNull CommonAtomIconDTO icon, @NotNull String backgroundColor, @NotNull AtomActionDTO action, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(action, "action");
        this.title = title;
        this.icon = icon;
        this.backgroundColor = backgroundColor;
        this.action = action;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ContextMenuItemDTO copy$default(ContextMenuItemDTO contextMenuItemDTO, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomIconDTO commonAtomIconDTO, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            commonAtomLabelDTO = contextMenuItemDTO.title;
        }
        if ((i11 & 2) != 0) {
            commonAtomIconDTO = contextMenuItemDTO.icon;
        }
        if ((i11 & 4) != 0) {
            str = contextMenuItemDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = contextMenuItemDTO.action;
        }
        if ((i11 & 16) != 0) {
            map = contextMenuItemDTO.trackingInfo;
        }
        Map map2 = map;
        String str2 = str;
        return contextMenuItemDTO.copy(commonAtomLabelDTO, commonAtomIconDTO, str2, atomActionDTO, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CommonAtomLabelDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CommonAtomIconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, MessengerTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final ContextMenuItemDTO copy(@NotNull CommonAtomLabelDTO title, @NotNull CommonAtomIconDTO icon, @NotNull String backgroundColor, @NotNull AtomActionDTO action, Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(action, "action");
        return new ContextMenuItemDTO(title, icon, backgroundColor, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContextMenuItemDTO)) {
            return false;
        }
        ContextMenuItemDTO contextMenuItemDTO = (ContextMenuItemDTO) other;
        return Intrinsics.d(this.title, contextMenuItemDTO.title) && Intrinsics.d(this.icon, contextMenuItemDTO.icon) && Intrinsics.d(this.backgroundColor, contextMenuItemDTO.backgroundColor) && Intrinsics.d(this.action, contextMenuItemDTO.action) && Intrinsics.d(this.trackingInfo, contextMenuItemDTO.trackingInfo);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CommonAtomIconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    public final CommonAtomLabelDTO getTitle() {
        return this.title;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = Ih.a.b(this.action, g.a((this.icon.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.backgroundColor), 31);
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        return b11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonAtomIconDTO commonAtomIconDTO = this.icon;
        String str = this.backgroundColor;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ContextMenuItemDTO(title=");
        sb2.append(commonAtomLabelDTO);
        sb2.append(", icon=");
        sb2.append(commonAtomIconDTO);
        sb2.append(", backgroundColor=");
        p.c(str, ", action=", ", trackingInfo=", sb2, atomActionDTO);
        return P.f(sb2, map, ")");
    }

    public /* synthetic */ ContextMenuItemDTO(CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomIconDTO commonAtomIconDTO, String str, AtomActionDTO atomActionDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(commonAtomLabelDTO, commonAtomIconDTO, str, atomActionDTO, (i11 & 16) != 0 ? null : map);
    }
}
