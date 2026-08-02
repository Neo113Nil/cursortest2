package ru.ozon.android.messenger.blocks.header;

import I1.w;
import K1.G;
import N3.C3660k;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00020\u0001:\u0004MNOPB\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0004\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u001e\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010$J\u0012\u0010*\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b.\u0010$Jº\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00042\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00042\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b1\u0010$J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u001cR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\b@\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010$R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\bC\u0010\u001eR\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\bD\u0010\u001eR%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bF\u0010(R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bG\u0010$R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010H\u001a\u0004\bI\u0010+R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010J\u001a\u0004\bK\u0010-R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\bL\u0010$¨\u0006Q"}, d2 = {"Lru/ozon/android/messenger/blocks/header/ChatHeaderDTO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "titleAtom", "", "subtitles", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "avatarIcon", "", "backgroundColor", "Lru/ozon/android/messenger/blocks/header/ChatHeaderDTO$IconItemDTO;", "titleIcons", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButtonWithIcon;", "buttons", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "trackingInfo", "animation", "Lru/ozon/android/messenger/blocks/header/ChatHeaderDTO$a;", "status", "Lru/ozon/uni/atoms/data/button/Icon;", "statusIcon", "statusIconUrl", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lru/ozon/android/messenger/blocks/header/ChatHeaderDTO$a;Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;)V", "component1", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component2", "()Ljava/util/List;", "component3", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component4", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "component5", "()Ljava/lang/String;", "component6", "component7", "component8", "()Ljava/util/Map;", "component9", "component10", "()Lru/ozon/android/messenger/blocks/header/ChatHeaderDTO$a;", "component11", "()Lru/ozon/uni/atoms/data/button/Icon;", "component12", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lru/ozon/android/messenger/blocks/header/ChatHeaderDTO$a;Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;)Lru/ozon/android/messenger/blocks/header/ChatHeaderDTO;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitleAtom", "Ljava/util/List;", "getSubtitles", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAvatarIcon", "Ljava/lang/String;", "getBackgroundColor", "getTitleIcons", "getButtons", "Ljava/util/Map;", "getTrackingInfo", "getAnimation", "Lru/ozon/android/messenger/blocks/header/ChatHeaderDTO$a;", "getStatus", "Lru/ozon/uni/atoms/data/button/Icon;", "getStatusIcon", "getStatusIconUrl", "SubtitleItemDTO", "IconItemDTO", "IconTooltipItemDTO", "a", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ChatHeaderDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final String animation;
    private final IconDTO avatarIcon;

    @NotNull
    private final String backgroundColor;
    private final List<ButtonV3Atom.SmallButtonWithIcon> buttons;
    private final a status;
    private final Icon statusIcon;
    private final String statusIconUrl;
    private final List<TextDTO> subtitles;

    @NotNull
    private final TextDTO titleAtom;
    private final List<IconItemDTO> titleIcons;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    @com.squareup.moshi.j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/android/messenger/blocks/header/ChatHeaderDTO$IconItemDTO;", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "tooltip", "Lru/ozon/android/messenger/blocks/header/ChatHeaderDTO$IconTooltipItemDTO;", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/android/messenger/blocks/header/ChatHeaderDTO$IconTooltipItemDTO;)V", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getTooltip", "()Lru/ozon/android/messenger/blocks/header/ChatHeaderDTO$IconTooltipItemDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconItemDTO {
        public static final int $stable = 8;

        @NotNull
        private final Icon icon;
        private final IconTooltipItemDTO tooltip;

        public IconItemDTO(@NotNull Icon icon, IconTooltipItemDTO iconTooltipItemDTO) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.tooltip = iconTooltipItemDTO;
        }

        public static /* synthetic */ IconItemDTO copy$default(IconItemDTO iconItemDTO, Icon icon, IconTooltipItemDTO iconTooltipItemDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                icon = iconItemDTO.icon;
            }
            if ((i11 & 2) != 0) {
                iconTooltipItemDTO = iconItemDTO.tooltip;
            }
            return iconItemDTO.copy(icon, iconTooltipItemDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final IconTooltipItemDTO getTooltip() {
            return this.tooltip;
        }

        @NotNull
        public final IconItemDTO copy(@NotNull Icon icon, IconTooltipItemDTO tooltip) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new IconItemDTO(icon, tooltip);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconItemDTO)) {
                return false;
            }
            IconItemDTO iconItemDTO = (IconItemDTO) other;
            return Intrinsics.d(this.icon, iconItemDTO.icon) && Intrinsics.d(this.tooltip, iconItemDTO.tooltip);
        }

        @NotNull
        public final Icon getIcon() {
            return this.icon;
        }

        public final IconTooltipItemDTO getTooltip() {
            return this.tooltip;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            IconTooltipItemDTO iconTooltipItemDTO = this.tooltip;
            return hashCode + (iconTooltipItemDTO == null ? 0 : iconTooltipItemDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "IconItemDTO(icon=" + this.icon + ", tooltip=" + this.tooltip + ")";
        }
    }

    @com.squareup.moshi.j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/android/messenger/blocks/header/ChatHeaderDTO$IconTooltipItemDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "description", "trackingInfo", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconTooltipItemDTO {
        public static final int $stable = 8;

        @NotNull
        private final String description;
        private final String title;
        private final Map<String, MessengerTrackingInfo> trackingInfo;

        public IconTooltipItemDTO(String str, @NotNull String description, Map<String, MessengerTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.title = str;
            this.description = description;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ IconTooltipItemDTO copy$default(IconTooltipItemDTO iconTooltipItemDTO, String str, String str2, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = iconTooltipItemDTO.title;
            }
            if ((i11 & 2) != 0) {
                str2 = iconTooltipItemDTO.description;
            }
            if ((i11 & 4) != 0) {
                map = iconTooltipItemDTO.trackingInfo;
            }
            return iconTooltipItemDTO.copy(str, str2, map);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final Map<String, MessengerTrackingInfo> component3() {
            return this.trackingInfo;
        }

        @NotNull
        public final IconTooltipItemDTO copy(String title, @NotNull String description, Map<String, MessengerTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(description, "description");
            return new IconTooltipItemDTO(title, description, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconTooltipItemDTO)) {
                return false;
            }
            IconTooltipItemDTO iconTooltipItemDTO = (IconTooltipItemDTO) other;
            return Intrinsics.d(this.title, iconTooltipItemDTO.title) && Intrinsics.d(this.description, iconTooltipItemDTO.description) && Intrinsics.d(this.trackingInfo, iconTooltipItemDTO.trackingInfo);
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        public final String getTitle() {
            return this.title;
        }

        public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            String str = this.title;
            int a11 = G.g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.description);
            Map<String, MessengerTrackingInfo> map = this.trackingInfo;
            return a11 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.description;
            return P.f(C3660k.d("IconTooltipItemDTO(title=", str, ", description=", str2, ", trackingInfo="), this.trackingInfo, ")");
        }
    }

    @com.squareup.moshi.j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/android/messenger/blocks/header/ChatHeaderDTO$SubtitleItemDTO;", "", "text", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;)V", "getText", "()Ljava/lang/String;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SubtitleItemDTO {
        public static final int $stable = Icon.$stable;
        private final Icon icon;

        @NotNull
        private final String text;

        public SubtitleItemDTO(@NotNull String text, Icon icon) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.icon = icon;
        }

        public static /* synthetic */ SubtitleItemDTO copy$default(SubtitleItemDTO subtitleItemDTO, String str, Icon icon, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = subtitleItemDTO.text;
            }
            if ((i11 & 2) != 0) {
                icon = subtitleItemDTO.icon;
            }
            return subtitleItemDTO.copy(str, icon);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        public final SubtitleItemDTO copy(@NotNull String text, Icon icon) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new SubtitleItemDTO(text, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubtitleItemDTO)) {
                return false;
            }
            SubtitleItemDTO subtitleItemDTO = (SubtitleItemDTO) other;
            return Intrinsics.d(this.text, subtitleItemDTO.text) && Intrinsics.d(this.icon, subtitleItemDTO.icon);
        }

        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            Icon icon = this.icon;
            return hashCode + (icon == null ? 0 : icon.hashCode());
        }

        @NotNull
        public String toString() {
            return "SubtitleItemDTO(text=" + this.text + ", icon=" + this.icon + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;

        @com.squareup.moshi.i(name = "Offline")
        public static final a OFFLINE;

        @com.squareup.moshi.i(name = "Online")
        public static final a ONLINE;

        static {
            a aVar = new a("ONLINE", 0);
            ONLINE = aVar;
            a aVar2 = new a("OFFLINE", 1);
            OFFLINE = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public ChatHeaderDTO(@NotNull TextDTO titleAtom, List<TextDTO> list, AtomActionDTO atomActionDTO, IconDTO iconDTO, @NotNull String backgroundColor, List<IconItemDTO> list2, List<ButtonV3Atom.SmallButtonWithIcon> list3, Map<String, MessengerTrackingInfo> map, String str, a aVar, Icon icon, String str2) {
        Intrinsics.checkNotNullParameter(titleAtom, "titleAtom");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.titleAtom = titleAtom;
        this.subtitles = list;
        this.action = atomActionDTO;
        this.avatarIcon = iconDTO;
        this.backgroundColor = backgroundColor;
        this.titleIcons = list2;
        this.buttons = list3;
        this.trackingInfo = map;
        this.animation = str;
        this.status = aVar;
        this.statusIcon = icon;
        this.statusIconUrl = str2;
    }

    public static /* synthetic */ ChatHeaderDTO copy$default(ChatHeaderDTO chatHeaderDTO, TextDTO textDTO, List list, AtomActionDTO atomActionDTO, IconDTO iconDTO, String str, List list2, List list3, Map map, String str2, a aVar, Icon icon, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = chatHeaderDTO.titleAtom;
        }
        if ((i11 & 2) != 0) {
            list = chatHeaderDTO.subtitles;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = chatHeaderDTO.action;
        }
        if ((i11 & 8) != 0) {
            iconDTO = chatHeaderDTO.avatarIcon;
        }
        if ((i11 & 16) != 0) {
            str = chatHeaderDTO.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            list2 = chatHeaderDTO.titleIcons;
        }
        if ((i11 & 64) != 0) {
            list3 = chatHeaderDTO.buttons;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = chatHeaderDTO.trackingInfo;
        }
        if ((i11 & 256) != 0) {
            str2 = chatHeaderDTO.animation;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            aVar = chatHeaderDTO.status;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            icon = chatHeaderDTO.statusIcon;
        }
        if ((i11 & 2048) != 0) {
            str3 = chatHeaderDTO.statusIconUrl;
        }
        Icon icon2 = icon;
        String str4 = str3;
        String str5 = str2;
        a aVar2 = aVar;
        List list4 = list3;
        Map map2 = map;
        String str6 = str;
        List list5 = list2;
        return chatHeaderDTO.copy(textDTO, list, atomActionDTO, iconDTO, str6, list5, list4, map2, str5, aVar2, icon2, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitleAtom() {
        return this.titleAtom;
    }

    /* renamed from: component10, reason: from getter */
    public final a getStatus() {
        return this.status;
    }

    /* renamed from: component11, reason: from getter */
    public final Icon getStatusIcon() {
        return this.statusIcon;
    }

    /* renamed from: component12, reason: from getter */
    public final String getStatusIconUrl() {
        return this.statusIconUrl;
    }

    public final List<TextDTO> component2() {
        return this.subtitles;
    }

    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final IconDTO getAvatarIcon() {
        return this.avatarIcon;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<IconItemDTO> component6() {
        return this.titleIcons;
    }

    public final List<ButtonV3Atom.SmallButtonWithIcon> component7() {
        return this.buttons;
    }

    public final Map<String, MessengerTrackingInfo> component8() {
        return this.trackingInfo;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAnimation() {
        return this.animation;
    }

    @NotNull
    public final ChatHeaderDTO copy(@NotNull TextDTO titleAtom, List<TextDTO> subtitles, AtomActionDTO action, IconDTO avatarIcon, @NotNull String backgroundColor, List<IconItemDTO> titleIcons, List<ButtonV3Atom.SmallButtonWithIcon> buttons, Map<String, MessengerTrackingInfo> trackingInfo, String animation, a status, Icon statusIcon, String statusIconUrl) {
        Intrinsics.checkNotNullParameter(titleAtom, "titleAtom");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new ChatHeaderDTO(titleAtom, subtitles, action, avatarIcon, backgroundColor, titleIcons, buttons, trackingInfo, animation, status, statusIcon, statusIconUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatHeaderDTO)) {
            return false;
        }
        ChatHeaderDTO chatHeaderDTO = (ChatHeaderDTO) other;
        return Intrinsics.d(this.titleAtom, chatHeaderDTO.titleAtom) && Intrinsics.d(this.subtitles, chatHeaderDTO.subtitles) && Intrinsics.d(this.action, chatHeaderDTO.action) && Intrinsics.d(this.avatarIcon, chatHeaderDTO.avatarIcon) && Intrinsics.d(this.backgroundColor, chatHeaderDTO.backgroundColor) && Intrinsics.d(this.titleIcons, chatHeaderDTO.titleIcons) && Intrinsics.d(this.buttons, chatHeaderDTO.buttons) && Intrinsics.d(this.trackingInfo, chatHeaderDTO.trackingInfo) && Intrinsics.d(this.animation, chatHeaderDTO.animation) && this.status == chatHeaderDTO.status && Intrinsics.d(this.statusIcon, chatHeaderDTO.statusIcon) && Intrinsics.d(this.statusIconUrl, chatHeaderDTO.statusIconUrl);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getAnimation() {
        return this.animation;
    }

    public final IconDTO getAvatarIcon() {
        return this.avatarIcon;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<ButtonV3Atom.SmallButtonWithIcon> getButtons() {
        return this.buttons;
    }

    public final a getStatus() {
        return this.status;
    }

    public final Icon getStatusIcon() {
        return this.statusIcon;
    }

    public final String getStatusIconUrl() {
        return this.statusIconUrl;
    }

    public final List<TextDTO> getSubtitles() {
        return this.subtitles;
    }

    @NotNull
    public final TextDTO getTitleAtom() {
        return this.titleAtom;
    }

    public final List<IconItemDTO> getTitleIcons() {
        return this.titleIcons;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.titleAtom.hashCode() * 31;
        List<TextDTO> list = this.subtitles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        IconDTO iconDTO = this.avatarIcon;
        int a11 = G.g.a((hashCode3 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31, this.backgroundColor);
        List<IconItemDTO> list2 = this.titleIcons;
        int hashCode4 = (a11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ButtonV3Atom.SmallButtonWithIcon> list3 = this.buttons;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.animation;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.status;
        int hashCode8 = (hashCode7 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Icon icon = this.statusIcon;
        int hashCode9 = (hashCode8 + (icon == null ? 0 : icon.hashCode())) * 31;
        String str2 = this.statusIconUrl;
        return hashCode9 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.titleAtom;
        List<TextDTO> list = this.subtitles;
        AtomActionDTO atomActionDTO = this.action;
        IconDTO iconDTO = this.avatarIcon;
        String str = this.backgroundColor;
        List<IconItemDTO> list2 = this.titleIcons;
        List<ButtonV3Atom.SmallButtonWithIcon> list3 = this.buttons;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        String str2 = this.animation;
        a aVar = this.status;
        Icon icon = this.statusIcon;
        String str3 = this.statusIconUrl;
        StringBuilder e11 = G.e("ChatHeaderDTO(titleAtom=", textDTO, ", subtitles=", list, ", action=");
        e11.append(atomActionDTO);
        e11.append(", avatarIcon=");
        e11.append(iconDTO);
        e11.append(", backgroundColor=");
        w.d(str, ", titleIcons=", ", buttons=", e11, list2);
        e11.append(list3);
        e11.append(", trackingInfo=");
        e11.append(map);
        e11.append(", animation=");
        e11.append(str2);
        e11.append(", status=");
        e11.append(aVar);
        e11.append(", statusIcon=");
        e11.append(icon);
        e11.append(", statusIconUrl=");
        e11.append(str3);
        e11.append(")");
        return e11.toString();
    }
}
