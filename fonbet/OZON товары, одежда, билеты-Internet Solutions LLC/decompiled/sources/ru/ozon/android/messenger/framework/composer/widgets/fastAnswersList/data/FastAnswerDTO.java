package ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.data;

import B3.p;
import F3.G;
import Ns.b;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001aB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/android/messenger/framework/composer/widgets/fastAnswersList/data/FastAnswerDTO;", "", "type", "", "cell", "Lru/ozon/android/messenger/framework/composer/widgets/fastAnswersList/data/FastAnswerDTO$FastAnswerTemplateCellDTO;", "islandSeparator", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/android/messenger/framework/composer/widgets/fastAnswersList/data/FastAnswerDTO$FastAnswerTemplateCellDTO;Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;)V", "getType", "()Ljava/lang/String;", "getCell", "()Lru/ozon/android/messenger/framework/composer/widgets/fastAnswersList/data/FastAnswerDTO$FastAnswerTemplateCellDTO;", "getIslandSeparator", "()Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "FastAnswerTemplateCellDTO", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FastAnswerDTO {
    public static final int $stable = 8;
    private final FastAnswerTemplateCellDTO cell;
    private final IslandSeparatorDTO islandSeparator;

    @NotNull
    private final String type;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Jc\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, d2 = {"Lru/ozon/android/messenger/framework/composer/widgets/fastAnswersList/data/FastAnswerDTO$FastAnswerTemplateCellDTO;", "", "editButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "removeButton", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "chevronIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "backgroundColor", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getEditButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRemoveButton", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getChevronIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FastAnswerTemplateCellDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final String backgroundColor;
        private final IconDTO chevronIcon;

        @NotNull
        private final IconButtonV3DTO editButton;

        @NotNull
        private final IconButtonV3DTO removeButton;

        @NotNull
        private final TextDTO text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public FastAnswerTemplateCellDTO(@NotNull IconButtonV3DTO editButton, @NotNull IconButtonV3DTO removeButton, @NotNull TextDTO text, IconDTO iconDTO, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(editButton, "editButton");
            Intrinsics.checkNotNullParameter(removeButton, "removeButton");
            Intrinsics.checkNotNullParameter(text, "text");
            this.editButton = editButton;
            this.removeButton = removeButton;
            this.text = text;
            this.chevronIcon = iconDTO;
            this.backgroundColor = str;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ FastAnswerTemplateCellDTO copy$default(FastAnswerTemplateCellDTO fastAnswerTemplateCellDTO, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, TextDTO textDTO, IconDTO iconDTO, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconButtonV3DTO = fastAnswerTemplateCellDTO.editButton;
            }
            if ((i11 & 2) != 0) {
                iconButtonV3DTO2 = fastAnswerTemplateCellDTO.removeButton;
            }
            if ((i11 & 4) != 0) {
                textDTO = fastAnswerTemplateCellDTO.text;
            }
            if ((i11 & 8) != 0) {
                iconDTO = fastAnswerTemplateCellDTO.chevronIcon;
            }
            if ((i11 & 16) != 0) {
                str = fastAnswerTemplateCellDTO.backgroundColor;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = fastAnswerTemplateCellDTO.action;
            }
            if ((i11 & 64) != 0) {
                map = fastAnswerTemplateCellDTO.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            String str2 = str;
            TextDTO textDTO2 = textDTO;
            return fastAnswerTemplateCellDTO.copy(iconButtonV3DTO, iconButtonV3DTO2, textDTO2, iconDTO, str2, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconButtonV3DTO getEditButton() {
            return this.editButton;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final IconButtonV3DTO getRemoveButton() {
            return this.removeButton;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component4, reason: from getter */
        public final IconDTO getChevronIcon() {
            return this.chevronIcon;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final FastAnswerTemplateCellDTO copy(@NotNull IconButtonV3DTO editButton, @NotNull IconButtonV3DTO removeButton, @NotNull TextDTO text, IconDTO chevronIcon, String backgroundColor, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(editButton, "editButton");
            Intrinsics.checkNotNullParameter(removeButton, "removeButton");
            Intrinsics.checkNotNullParameter(text, "text");
            return new FastAnswerTemplateCellDTO(editButton, removeButton, text, chevronIcon, backgroundColor, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FastAnswerTemplateCellDTO)) {
                return false;
            }
            FastAnswerTemplateCellDTO fastAnswerTemplateCellDTO = (FastAnswerTemplateCellDTO) other;
            return Intrinsics.d(this.editButton, fastAnswerTemplateCellDTO.editButton) && Intrinsics.d(this.removeButton, fastAnswerTemplateCellDTO.removeButton) && Intrinsics.d(this.text, fastAnswerTemplateCellDTO.text) && Intrinsics.d(this.chevronIcon, fastAnswerTemplateCellDTO.chevronIcon) && Intrinsics.d(this.backgroundColor, fastAnswerTemplateCellDTO.backgroundColor) && Intrinsics.d(this.action, fastAnswerTemplateCellDTO.action) && Intrinsics.d(this.trackingInfo, fastAnswerTemplateCellDTO.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final IconDTO getChevronIcon() {
            return this.chevronIcon;
        }

        @NotNull
        public final IconButtonV3DTO getEditButton() {
            return this.editButton;
        }

        @NotNull
        public final IconButtonV3DTO getRemoveButton() {
            return this.removeButton;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = b.a(this.text, GR.b.c(this.removeButton, this.editButton.hashCode() * 31, 31), 31);
            IconDTO iconDTO = this.chevronIcon;
            int hashCode = (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            IconButtonV3DTO iconButtonV3DTO = this.editButton;
            IconButtonV3DTO iconButtonV3DTO2 = this.removeButton;
            TextDTO textDTO = this.text;
            IconDTO iconDTO = this.chevronIcon;
            String str = this.backgroundColor;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("FastAnswerTemplateCellDTO(editButton=");
            sb2.append(iconButtonV3DTO);
            sb2.append(", removeButton=");
            sb2.append(iconButtonV3DTO2);
            sb2.append(", text=");
            G.f(sb2, textDTO, ", chevronIcon=", iconDTO, ", backgroundColor=");
            p.c(str, ", action=", ", trackingInfo=", sb2, atomActionDTO);
            return P.f(sb2, map, ")");
        }
    }

    public FastAnswerDTO(@NotNull String type, FastAnswerTemplateCellDTO fastAnswerTemplateCellDTO, IslandSeparatorDTO islandSeparatorDTO) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.cell = fastAnswerTemplateCellDTO;
        this.islandSeparator = islandSeparatorDTO;
    }

    public static /* synthetic */ FastAnswerDTO copy$default(FastAnswerDTO fastAnswerDTO, String str, FastAnswerTemplateCellDTO fastAnswerTemplateCellDTO, IslandSeparatorDTO islandSeparatorDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fastAnswerDTO.type;
        }
        if ((i11 & 2) != 0) {
            fastAnswerTemplateCellDTO = fastAnswerDTO.cell;
        }
        if ((i11 & 4) != 0) {
            islandSeparatorDTO = fastAnswerDTO.islandSeparator;
        }
        return fastAnswerDTO.copy(str, fastAnswerTemplateCellDTO, islandSeparatorDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final FastAnswerTemplateCellDTO getCell() {
        return this.cell;
    }

    /* renamed from: component3, reason: from getter */
    public final IslandSeparatorDTO getIslandSeparator() {
        return this.islandSeparator;
    }

    @NotNull
    public final FastAnswerDTO copy(@NotNull String type, FastAnswerTemplateCellDTO cell, IslandSeparatorDTO islandSeparator) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new FastAnswerDTO(type, cell, islandSeparator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FastAnswerDTO)) {
            return false;
        }
        FastAnswerDTO fastAnswerDTO = (FastAnswerDTO) other;
        return Intrinsics.d(this.type, fastAnswerDTO.type) && Intrinsics.d(this.cell, fastAnswerDTO.cell) && Intrinsics.d(this.islandSeparator, fastAnswerDTO.islandSeparator);
    }

    public final FastAnswerTemplateCellDTO getCell() {
        return this.cell;
    }

    public final IslandSeparatorDTO getIslandSeparator() {
        return this.islandSeparator;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        FastAnswerTemplateCellDTO fastAnswerTemplateCellDTO = this.cell;
        int hashCode2 = (hashCode + (fastAnswerTemplateCellDTO == null ? 0 : fastAnswerTemplateCellDTO.hashCode())) * 31;
        IslandSeparatorDTO islandSeparatorDTO = this.islandSeparator;
        return hashCode2 + (islandSeparatorDTO != null ? islandSeparatorDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FastAnswerDTO(type=" + this.type + ", cell=" + this.cell + ", islandSeparator=" + this.islandSeparator + ")";
    }
}
