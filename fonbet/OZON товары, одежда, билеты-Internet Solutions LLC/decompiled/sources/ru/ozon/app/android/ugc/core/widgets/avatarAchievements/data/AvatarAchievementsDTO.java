package ru.ozon.app.android.ugc.core.widgets.avatarAchievements.data;

import B3.p;
import D40.b;
import Nh.a;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003&'(BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JU\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO;", "", "avatar", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO$AvatarDTO;", "achievements", "", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO$AchievementDTO;", "backgroundColor", "", "paddings", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO$PaddingsDTO;", "tracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO$AvatarDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO$PaddingsDTO;Ljava/util/Map;)V", "getAvatar", "()Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO$AvatarDTO;", "getAchievements", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getPaddings", "()Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO$PaddingsDTO;", "getTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "AvatarDTO", "AchievementDTO", "PaddingsDTO", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AvatarAchievementsDTO {
    public static final int $stable = 8;
    private final List<AchievementDTO> achievements;

    @NotNull
    private final AvatarDTO avatar;
    private final String backgroundColor;
    private final PaddingsDTO paddings;
    private final Map<String, TokenizedTrackingInfo> tracking;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Js\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00060"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO$AchievementDTO;", "", "defaultImage", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "darkThemeImage", "counter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "tooltip", "Lru/ozon/uni/atoms/data/common/TooltipDTO;", "tooltipKey", "", "counterStrokeColor", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "tracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/common/TooltipDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getDefaultImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getDarkThemeImage", "getCounter", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTooltip", "()Lru/ozon/uni/atoms/data/common/TooltipDTO;", "getTooltipKey", "()Ljava/lang/String;", "getCounterStrokeColor", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AchievementDTO {
        public static final int $stable = 8;
        private final AtomActionDTO clickAction;
        private final BadgeDTO counter;
        private final String counterStrokeColor;
        private final ImageDTO darkThemeImage;

        @NotNull
        private final ImageDTO defaultImage;
        private final TooltipDTO tooltip;
        private final String tooltipKey;
        private final Map<String, TokenizedTrackingInfo> tracking;

        public AchievementDTO(@NotNull ImageDTO defaultImage, ImageDTO imageDTO, BadgeDTO badgeDTO, TooltipDTO tooltipDTO, String str, String str2, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(defaultImage, "defaultImage");
            this.defaultImage = defaultImage;
            this.darkThemeImage = imageDTO;
            this.counter = badgeDTO;
            this.tooltip = tooltipDTO;
            this.tooltipKey = str;
            this.counterStrokeColor = str2;
            this.clickAction = atomActionDTO;
            this.tracking = map;
        }

        public static /* synthetic */ AchievementDTO copy$default(AchievementDTO achievementDTO, ImageDTO imageDTO, ImageDTO imageDTO2, BadgeDTO badgeDTO, TooltipDTO tooltipDTO, String str, String str2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = achievementDTO.defaultImage;
            }
            if ((i11 & 2) != 0) {
                imageDTO2 = achievementDTO.darkThemeImage;
            }
            if ((i11 & 4) != 0) {
                badgeDTO = achievementDTO.counter;
            }
            if ((i11 & 8) != 0) {
                tooltipDTO = achievementDTO.tooltip;
            }
            if ((i11 & 16) != 0) {
                str = achievementDTO.tooltipKey;
            }
            if ((i11 & 32) != 0) {
                str2 = achievementDTO.counterStrokeColor;
            }
            if ((i11 & 64) != 0) {
                atomActionDTO = achievementDTO.clickAction;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                map = achievementDTO.tracking;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            String str3 = str;
            String str4 = str2;
            return achievementDTO.copy(imageDTO, imageDTO2, badgeDTO, tooltipDTO, str3, str4, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getDefaultImage() {
            return this.defaultImage;
        }

        /* renamed from: component2, reason: from getter */
        public final ImageDTO getDarkThemeImage() {
            return this.darkThemeImage;
        }

        /* renamed from: component3, reason: from getter */
        public final BadgeDTO getCounter() {
            return this.counter;
        }

        /* renamed from: component4, reason: from getter */
        public final TooltipDTO getTooltip() {
            return this.tooltip;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTooltipKey() {
            return this.tooltipKey;
        }

        /* renamed from: component6, reason: from getter */
        public final String getCounterStrokeColor() {
            return this.counterStrokeColor;
        }

        /* renamed from: component7, reason: from getter */
        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        public final Map<String, TokenizedTrackingInfo> component8() {
            return this.tracking;
        }

        @NotNull
        public final AchievementDTO copy(@NotNull ImageDTO defaultImage, ImageDTO darkThemeImage, BadgeDTO counter, TooltipDTO tooltip, String tooltipKey, String counterStrokeColor, AtomActionDTO clickAction, Map<String, TokenizedTrackingInfo> tracking) {
            Intrinsics.checkNotNullParameter(defaultImage, "defaultImage");
            return new AchievementDTO(defaultImage, darkThemeImage, counter, tooltip, tooltipKey, counterStrokeColor, clickAction, tracking);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AchievementDTO)) {
                return false;
            }
            AchievementDTO achievementDTO = (AchievementDTO) other;
            return Intrinsics.d(this.defaultImage, achievementDTO.defaultImage) && Intrinsics.d(this.darkThemeImage, achievementDTO.darkThemeImage) && Intrinsics.d(this.counter, achievementDTO.counter) && Intrinsics.d(this.tooltip, achievementDTO.tooltip) && Intrinsics.d(this.tooltipKey, achievementDTO.tooltipKey) && Intrinsics.d(this.counterStrokeColor, achievementDTO.counterStrokeColor) && Intrinsics.d(this.clickAction, achievementDTO.clickAction) && Intrinsics.d(this.tracking, achievementDTO.tracking);
        }

        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        public final BadgeDTO getCounter() {
            return this.counter;
        }

        public final String getCounterStrokeColor() {
            return this.counterStrokeColor;
        }

        public final ImageDTO getDarkThemeImage() {
            return this.darkThemeImage;
        }

        @NotNull
        public final ImageDTO getDefaultImage() {
            return this.defaultImage;
        }

        public final TooltipDTO getTooltip() {
            return this.tooltip;
        }

        public final String getTooltipKey() {
            return this.tooltipKey;
        }

        public final Map<String, TokenizedTrackingInfo> getTracking() {
            return this.tracking;
        }

        public int hashCode() {
            int hashCode = this.defaultImage.hashCode() * 31;
            ImageDTO imageDTO = this.darkThemeImage;
            int hashCode2 = (hashCode + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
            BadgeDTO badgeDTO = this.counter;
            int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            TooltipDTO tooltipDTO = this.tooltip;
            int hashCode4 = (hashCode3 + (tooltipDTO == null ? 0 : tooltipDTO.hashCode())) * 31;
            String str = this.tooltipKey;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.counterStrokeColor;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.clickAction;
            int hashCode7 = (hashCode6 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.tracking;
            return hashCode7 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.defaultImage;
            ImageDTO imageDTO2 = this.darkThemeImage;
            BadgeDTO badgeDTO = this.counter;
            TooltipDTO tooltipDTO = this.tooltip;
            String str = this.tooltipKey;
            String str2 = this.counterStrokeColor;
            AtomActionDTO atomActionDTO = this.clickAction;
            Map<String, TokenizedTrackingInfo> map = this.tracking;
            StringBuilder sb2 = new StringBuilder("AchievementDTO(defaultImage=");
            sb2.append(imageDTO);
            sb2.append(", darkThemeImage=");
            sb2.append(imageDTO2);
            sb2.append(", counter=");
            sb2.append(badgeDTO);
            sb2.append(", tooltip=");
            sb2.append(tooltipDTO);
            sb2.append(", tooltipKey=");
            a.h(sb2, str, ", counterStrokeColor=", str2, ", clickAction=");
            return D40.a.d(sb2, atomActionDTO, ", tracking=", map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003JT\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\b\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO$AvatarDTO;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "isTopAuthor", "", "tracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/Boolean;Ljava/util/Map;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/Boolean;Ljava/util/Map;)Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO$AvatarDTO;", "equals", "other", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AvatarDTO {
        public static final int $stable = 8;
        private final BadgeDTO badge;
        private final AtomActionDTO clickAction;

        @NotNull
        private final IconDTO icon;
        private final Boolean isTopAuthor;
        private final Map<String, TokenizedTrackingInfo> tracking;

        public AvatarDTO(@NotNull IconDTO icon, AtomActionDTO atomActionDTO, BadgeDTO badgeDTO, Boolean bool, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.clickAction = atomActionDTO;
            this.badge = badgeDTO;
            this.isTopAuthor = bool;
            this.tracking = map;
        }

        public static /* synthetic */ AvatarDTO copy$default(AvatarDTO avatarDTO, IconDTO iconDTO, AtomActionDTO atomActionDTO, BadgeDTO badgeDTO, Boolean bool, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconDTO = avatarDTO.icon;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = avatarDTO.clickAction;
            }
            if ((i11 & 4) != 0) {
                badgeDTO = avatarDTO.badge;
            }
            if ((i11 & 8) != 0) {
                bool = avatarDTO.isTopAuthor;
            }
            if ((i11 & 16) != 0) {
                map = avatarDTO.tracking;
            }
            Map map2 = map;
            BadgeDTO badgeDTO2 = badgeDTO;
            return avatarDTO.copy(iconDTO, atomActionDTO, badgeDTO2, bool, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        /* renamed from: component3, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getIsTopAuthor() {
            return this.isTopAuthor;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.tracking;
        }

        @NotNull
        public final AvatarDTO copy(@NotNull IconDTO icon, AtomActionDTO clickAction, BadgeDTO badge, Boolean isTopAuthor, Map<String, TokenizedTrackingInfo> tracking) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new AvatarDTO(icon, clickAction, badge, isTopAuthor, tracking);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AvatarDTO)) {
                return false;
            }
            AvatarDTO avatarDTO = (AvatarDTO) other;
            return Intrinsics.d(this.icon, avatarDTO.icon) && Intrinsics.d(this.clickAction, avatarDTO.clickAction) && Intrinsics.d(this.badge, avatarDTO.badge) && Intrinsics.d(this.isTopAuthor, avatarDTO.isTopAuthor) && Intrinsics.d(this.tracking, avatarDTO.tracking);
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        public final Map<String, TokenizedTrackingInfo> getTracking() {
            return this.tracking;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.clickAction;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            Boolean bool = this.isTopAuthor;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.tracking;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        public final Boolean isTopAuthor() {
            return this.isTopAuthor;
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.icon;
            AtomActionDTO atomActionDTO = this.clickAction;
            BadgeDTO badgeDTO = this.badge;
            Boolean bool = this.isTopAuthor;
            Map<String, TokenizedTrackingInfo> map = this.tracking;
            StringBuilder sb2 = new StringBuilder("AvatarDTO(icon=");
            sb2.append(iconDTO);
            sb2.append(", clickAction=");
            sb2.append(atomActionDTO);
            sb2.append(", badge=");
            sb2.append(badgeDTO);
            sb2.append(", isTopAuthor=");
            sb2.append(bool);
            sb2.append(", tracking=");
            return P.f(sb2, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO$PaddingsDTO;", "", "leftPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "rightPadding", "intersectionPadding", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getLeftPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getRightPadding", "getIntersectionPadding", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingsDTO {
        public static final int $stable = 0;

        @EnumNullFallback
        private final Paddings intersectionPadding;

        @EnumNullFallback
        private final Paddings leftPadding;

        @EnumNullFallback
        private final Paddings rightPadding;

        public PaddingsDTO(Paddings paddings, Paddings paddings2, Paddings paddings3) {
            this.leftPadding = paddings;
            this.rightPadding = paddings2;
            this.intersectionPadding = paddings3;
        }

        public static /* synthetic */ PaddingsDTO copy$default(PaddingsDTO paddingsDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = paddingsDTO.leftPadding;
            }
            if ((i11 & 2) != 0) {
                paddings2 = paddingsDTO.rightPadding;
            }
            if ((i11 & 4) != 0) {
                paddings3 = paddingsDTO.intersectionPadding;
            }
            return paddingsDTO.copy(paddings, paddings2, paddings3);
        }

        /* renamed from: component1, reason: from getter */
        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getIntersectionPadding() {
            return this.intersectionPadding;
        }

        @NotNull
        public final PaddingsDTO copy(Paddings leftPadding, Paddings rightPadding, Paddings intersectionPadding) {
            return new PaddingsDTO(leftPadding, rightPadding, intersectionPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingsDTO)) {
                return false;
            }
            PaddingsDTO paddingsDTO = (PaddingsDTO) other;
            return this.leftPadding == paddingsDTO.leftPadding && this.rightPadding == paddingsDTO.rightPadding && this.intersectionPadding == paddingsDTO.intersectionPadding;
        }

        public final Paddings getIntersectionPadding() {
            return this.intersectionPadding;
        }

        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        public int hashCode() {
            Paddings paddings = this.leftPadding;
            int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
            Paddings paddings2 = this.rightPadding;
            int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
            Paddings paddings3 = this.intersectionPadding;
            return hashCode2 + (paddings3 != null ? paddings3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.leftPadding;
            Paddings paddings2 = this.rightPadding;
            return b.b(p.b("PaddingsDTO(leftPadding=", paddings, ", rightPadding=", paddings2, ", intersectionPadding="), this.intersectionPadding, ")");
        }
    }

    public AvatarAchievementsDTO(@NotNull AvatarDTO avatar, List<AchievementDTO> list, String str, PaddingsDTO paddingsDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        this.avatar = avatar;
        this.achievements = list;
        this.backgroundColor = str;
        this.paddings = paddingsDTO;
        this.tracking = map;
    }

    public static /* synthetic */ AvatarAchievementsDTO copy$default(AvatarAchievementsDTO avatarAchievementsDTO, AvatarDTO avatarDTO, List list, String str, PaddingsDTO paddingsDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            avatarDTO = avatarAchievementsDTO.avatar;
        }
        if ((i11 & 2) != 0) {
            list = avatarAchievementsDTO.achievements;
        }
        if ((i11 & 4) != 0) {
            str = avatarAchievementsDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            paddingsDTO = avatarAchievementsDTO.paddings;
        }
        if ((i11 & 16) != 0) {
            map = avatarAchievementsDTO.tracking;
        }
        Map map2 = map;
        String str2 = str;
        return avatarAchievementsDTO.copy(avatarDTO, list, str2, paddingsDTO, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AvatarDTO getAvatar() {
        return this.avatar;
    }

    public final List<AchievementDTO> component2() {
        return this.achievements;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final PaddingsDTO getPaddings() {
        return this.paddings;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.tracking;
    }

    @NotNull
    public final AvatarAchievementsDTO copy(@NotNull AvatarDTO avatar, List<AchievementDTO> achievements, String backgroundColor, PaddingsDTO paddings, Map<String, TokenizedTrackingInfo> tracking) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        return new AvatarAchievementsDTO(avatar, achievements, backgroundColor, paddings, tracking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvatarAchievementsDTO)) {
            return false;
        }
        AvatarAchievementsDTO avatarAchievementsDTO = (AvatarAchievementsDTO) other;
        return Intrinsics.d(this.avatar, avatarAchievementsDTO.avatar) && Intrinsics.d(this.achievements, avatarAchievementsDTO.achievements) && Intrinsics.d(this.backgroundColor, avatarAchievementsDTO.backgroundColor) && Intrinsics.d(this.paddings, avatarAchievementsDTO.paddings) && Intrinsics.d(this.tracking, avatarAchievementsDTO.tracking);
    }

    public final List<AchievementDTO> getAchievements() {
        return this.achievements;
    }

    @NotNull
    public final AvatarDTO getAvatar() {
        return this.avatar;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final PaddingsDTO getPaddings() {
        return this.paddings;
    }

    public final Map<String, TokenizedTrackingInfo> getTracking() {
        return this.tracking;
    }

    public int hashCode() {
        int hashCode = this.avatar.hashCode() * 31;
        List<AchievementDTO> list = this.achievements;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        PaddingsDTO paddingsDTO = this.paddings;
        int hashCode4 = (hashCode3 + (paddingsDTO == null ? 0 : paddingsDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        AvatarDTO avatarDTO = this.avatar;
        List<AchievementDTO> list = this.achievements;
        String str = this.backgroundColor;
        PaddingsDTO paddingsDTO = this.paddings;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        StringBuilder sb2 = new StringBuilder("AvatarAchievementsDTO(avatar=");
        sb2.append(avatarDTO);
        sb2.append(", achievements=");
        sb2.append(list);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", paddings=");
        sb2.append(paddingsDTO);
        sb2.append(", tracking=");
        return P.f(sb2, map, ")");
    }
}
