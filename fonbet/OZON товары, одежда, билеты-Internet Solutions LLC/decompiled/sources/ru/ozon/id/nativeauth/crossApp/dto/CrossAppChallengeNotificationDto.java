package ru.ozon.id.nativeauth.crossApp.dto;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0001\u0018\u00002\u00020\u0001:\u0003%&'B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001f\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeNotificationDto;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "titleMaxLines", "", "subtitleMaxLines", "leftContent", "Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeNotificationDto$LeftContentDto;", "rightContent", "Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeNotificationDto$RightContentDto;", "autoHideDelay", "context", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "preset", "Lru/ozon/uni/atoms/data/notification/NotificationDTO$Preset;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeNotificationDto$LeftContentDto;Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeNotificationDto$RightContentDto;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/notification/NotificationDTO$Preset;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getTitleMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSubtitleMaxLines", "getLeftContent", "()Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeNotificationDto$LeftContentDto;", "getRightContent", "()Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeNotificationDto$RightContentDto;", "getAutoHideDelay", "getContext", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getPreset", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO$Preset;", "LeftContentDto", "LeftContentAtomDto", "RightContentDto", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrossAppChallengeNotificationDto {
    private final Integer autoHideDelay;
    private final CommonControlSettings common;
    private final String context;
    private final LeftContentDto leftContent;
    private final NotificationDTO.Preset preset;
    private final RightContentDto rightContent;
    private final String subtitle;
    private final Integer subtitleMaxLines;

    @NotNull
    private final String title;
    private final Integer titleMaxLines;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeNotificationDto$LeftContentAtomDto;", "", "type", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "getType", "()Ljava/lang/String;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LeftContentAtomDto {

        @NotNull
        private final IconDTO icon;

        @NotNull
        private final String type;

        public LeftContentAtomDto(@NotNull String type, @NotNull IconDTO icon) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.type = type;
            this.icon = icon;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeNotificationDto$LeftContentDto;", "", "atom", "Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeNotificationDto$LeftContentAtomDto;", "alignment", "Lru/ozon/uni/atoms/data/notification/NotificationDTO$Alignment;", "<init>", "(Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeNotificationDto$LeftContentAtomDto;Lru/ozon/uni/atoms/data/notification/NotificationDTO$Alignment;)V", "getAtom", "()Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeNotificationDto$LeftContentAtomDto;", "getAlignment", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO$Alignment;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LeftContentDto {
        private final NotificationDTO.Alignment alignment;
        private final LeftContentAtomDto atom;

        /* JADX WARN: Multi-variable type inference failed */
        public LeftContentDto() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final NotificationDTO.Alignment getAlignment() {
            return this.alignment;
        }

        public final LeftContentAtomDto getAtom() {
            return this.atom;
        }

        public LeftContentDto(LeftContentAtomDto leftContentAtomDto, NotificationDTO.Alignment alignment) {
            this.atom = leftContentAtomDto;
            this.alignment = alignment;
        }

        public /* synthetic */ LeftContentDto(LeftContentAtomDto leftContentAtomDto, NotificationDTO.Alignment alignment, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : leftContentAtomDto, (i11 & 2) != 0 ? NotificationDTO.Alignment.TOP : alignment);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeNotificationDto$RightContentDto;", "", "buttonType", "Lru/ozon/uni/atoms/data/notification/NotificationDTO$RightContent$ButtonType;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "iconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "alignment", "Lru/ozon/uni/atoms/data/notification/NotificationDTO$Alignment;", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO$RightContent$ButtonType;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO$Alignment;)V", "getButtonType", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO$RightContent$ButtonType;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getAlignment", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO$Alignment;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RightContentDto {
        private final NotificationDTO.Alignment alignment;
        private final ButtonV3DTO button;
        private final NotificationDTO.RightContent.ButtonType buttonType;
        private final IconButtonV3DTO iconButton;

        public RightContentDto() {
            this(null, null, null, null, 15, null);
        }

        public final NotificationDTO.Alignment getAlignment() {
            return this.alignment;
        }

        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public final NotificationDTO.RightContent.ButtonType getButtonType() {
            return this.buttonType;
        }

        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        public RightContentDto(NotificationDTO.RightContent.ButtonType buttonType, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, NotificationDTO.Alignment alignment) {
            this.buttonType = buttonType;
            this.button = buttonV3DTO;
            this.iconButton = iconButtonV3DTO;
            this.alignment = alignment;
        }

        public /* synthetic */ RightContentDto(NotificationDTO.RightContent.ButtonType buttonType, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, NotificationDTO.Alignment alignment, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? NotificationDTO.RightContent.ButtonType.CLOSE : buttonType, (i11 & 2) != 0 ? null : buttonV3DTO, (i11 & 4) != 0 ? null : iconButtonV3DTO, (i11 & 8) != 0 ? NotificationDTO.Alignment.CENTER : alignment);
        }
    }

    public CrossAppChallengeNotificationDto(@NotNull String title, String str, Integer num, Integer num2, LeftContentDto leftContentDto, RightContentDto rightContentDto, Integer num3, String str2, CommonControlSettings commonControlSettings, NotificationDTO.Preset preset) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitle = str;
        this.titleMaxLines = num;
        this.subtitleMaxLines = num2;
        this.leftContent = leftContentDto;
        this.rightContent = rightContentDto;
        this.autoHideDelay = num3;
        this.context = str2;
        this.common = commonControlSettings;
        this.preset = preset;
    }

    public final Integer getAutoHideDelay() {
        return this.autoHideDelay;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final String getContext() {
        return this.context;
    }

    public final LeftContentDto getLeftContent() {
        return this.leftContent;
    }

    public final NotificationDTO.Preset getPreset() {
        return this.preset;
    }

    public final RightContentDto getRightContent() {
        return this.rightContent;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Integer getSubtitleMaxLines() {
        return this.subtitleMaxLines;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final Integer getTitleMaxLines() {
        return this.titleMaxLines;
    }

    public /* synthetic */ CrossAppChallengeNotificationDto(String str, String str2, Integer num, Integer num2, LeftContentDto leftContentDto, RightContentDto rightContentDto, Integer num3, String str3, CommonControlSettings commonControlSettings, NotificationDTO.Preset preset, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? 2 : num, (i11 & 8) != 0 ? 2 : num2, (i11 & 16) != 0 ? null : leftContentDto, (i11 & 32) != 0 ? null : rightContentDto, (i11 & 64) != 0 ? 5 : num3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str3, (i11 & 256) != 0 ? null : commonControlSettings, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? NotificationDTO.Preset.CUSTOM : preset);
    }
}
