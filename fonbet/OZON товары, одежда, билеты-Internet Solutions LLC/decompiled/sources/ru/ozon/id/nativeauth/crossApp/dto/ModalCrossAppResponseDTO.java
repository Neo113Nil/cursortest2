package ru.ozon.id.nativeauth.crossApp.dto;

import B0.A0;
import C.o0;
import N3.C3660k;
import T7.P;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppResponseDTO;", "", "data", "Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppResponseDTO$ModalDTO;", "sharedStoreKeysInfo", "Lru/ozon/id/nativeauth/crossApp/dto/SharedStoreKeysInfoDto;", "<init>", "(Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppResponseDTO$ModalDTO;Lru/ozon/id/nativeauth/crossApp/dto/SharedStoreKeysInfoDto;)V", "getData", "()Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppResponseDTO$ModalDTO;", "getSharedStoreKeysInfo", "()Lru/ozon/id/nativeauth/crossApp/dto/SharedStoreKeysInfoDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ModalDTO", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ModalCrossAppResponseDTO {
    private final ModalDTO data;
    private final SharedStoreKeysInfoDto sharedStoreKeysInfo;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002%&B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006'"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppResponseDTO$ModalDTO;", "", "logo", "", "avatar", "Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppResponseDTO$ModalDTO$AvatarDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "subtitle", "crossAppButton", "Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppResponseDTO$ModalDTO$CrossAppButtonDTO;", "entryButton", "<init>", "(Ljava/lang/String;Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppResponseDTO$ModalDTO$AvatarDTO;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppResponseDTO$ModalDTO$CrossAppButtonDTO;Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppResponseDTO$ModalDTO$CrossAppButtonDTO;)V", "getLogo", "()Ljava/lang/String;", "getAvatar", "()Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppResponseDTO$ModalDTO$AvatarDTO;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getSubtitle", "getCrossAppButton", "()Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppResponseDTO$ModalDTO$CrossAppButtonDTO;", "getEntryButton", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "AvatarDTO", "CrossAppButtonDTO", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ModalDTO {
        private final AvatarDTO avatar;

        @NotNull
        private final CrossAppButtonDTO crossAppButton;

        @NotNull
        private final CrossAppButtonDTO entryButton;

        @NotNull
        private final String logo;

        @NotNull
        private final OzonSpannableString subtitle;

        @NotNull
        private final OzonSpannableString title;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppResponseDTO$ModalDTO$AvatarDTO;", "", "image", "", "initials", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "getInitials", "getIcon", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AvatarDTO {
            private final String icon;
            private final String image;
            private final String initials;

            public AvatarDTO(String str, String str2, String str3) {
                this.image = str;
                this.initials = str2;
                this.icon = str3;
            }

            public static /* synthetic */ AvatarDTO copy$default(AvatarDTO avatarDTO, String str, String str2, String str3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = avatarDTO.image;
                }
                if ((i11 & 2) != 0) {
                    str2 = avatarDTO.initials;
                }
                if ((i11 & 4) != 0) {
                    str3 = avatarDTO.icon;
                }
                return avatarDTO.copy(str, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            /* renamed from: component2, reason: from getter */
            public final String getInitials() {
                return this.initials;
            }

            /* renamed from: component3, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            @NotNull
            public final AvatarDTO copy(String image, String initials, String icon) {
                return new AvatarDTO(image, initials, icon);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AvatarDTO)) {
                    return false;
                }
                AvatarDTO avatarDTO = (AvatarDTO) other;
                return Intrinsics.d(this.image, avatarDTO.image) && Intrinsics.d(this.initials, avatarDTO.initials) && Intrinsics.d(this.icon, avatarDTO.icon);
            }

            public final String getIcon() {
                return this.icon;
            }

            public final String getImage() {
                return this.image;
            }

            public final String getInitials() {
                return this.initials;
            }

            public int hashCode() {
                String str = this.image;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.initials;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.icon;
                return hashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.image;
                String str2 = this.initials;
                return o0.c(C3660k.d("AvatarDTO(image=", str, ", initials=", str2, ", icon="), this.icon, ")");
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppResponseDTO$ModalDTO$CrossAppButtonDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "action", "Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppResponseDTO$ModalDTO$CrossAppButtonDTO$CrossAppActionDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppResponseDTO$ModalDTO$CrossAppButtonDTO$CrossAppActionDTO;)V", "getTitle", "()Ljava/lang/String;", "getAction", "()Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppResponseDTO$ModalDTO$CrossAppButtonDTO$CrossAppActionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "CrossAppActionDTO", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class CrossAppButtonDTO {

            @NotNull
            private final CrossAppActionDTO action;

            @NotNull
            private final String title;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppResponseDTO$ModalDTO$CrossAppButtonDTO$CrossAppActionDTO;", "", "link", "", "<init>", "(Ljava/lang/String;)V", "getLink", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class CrossAppActionDTO {

                @NotNull
                private final String link;

                public CrossAppActionDTO(@NotNull String link) {
                    Intrinsics.checkNotNullParameter(link, "link");
                    this.link = link;
                }

                public static /* synthetic */ CrossAppActionDTO copy$default(CrossAppActionDTO crossAppActionDTO, String str, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = crossAppActionDTO.link;
                    }
                    return crossAppActionDTO.copy(str);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getLink() {
                    return this.link;
                }

                @NotNull
                public final CrossAppActionDTO copy(@NotNull String link) {
                    Intrinsics.checkNotNullParameter(link, "link");
                    return new CrossAppActionDTO(link);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof CrossAppActionDTO) && Intrinsics.d(this.link, ((CrossAppActionDTO) other).link);
                }

                @NotNull
                public final String getLink() {
                    return this.link;
                }

                public int hashCode() {
                    return this.link.hashCode();
                }

                @NotNull
                public String toString() {
                    return A0.b("CrossAppActionDTO(link=", this.link, ")");
                }
            }

            public CrossAppButtonDTO(@NotNull String title, @NotNull CrossAppActionDTO action) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(action, "action");
                this.title = title;
                this.action = action;
            }

            public static /* synthetic */ CrossAppButtonDTO copy$default(CrossAppButtonDTO crossAppButtonDTO, String str, CrossAppActionDTO crossAppActionDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = crossAppButtonDTO.title;
                }
                if ((i11 & 2) != 0) {
                    crossAppActionDTO = crossAppButtonDTO.action;
                }
                return crossAppButtonDTO.copy(str, crossAppActionDTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final CrossAppActionDTO getAction() {
                return this.action;
            }

            @NotNull
            public final CrossAppButtonDTO copy(@NotNull String title, @NotNull CrossAppActionDTO action) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(action, "action");
                return new CrossAppButtonDTO(title, action);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CrossAppButtonDTO)) {
                    return false;
                }
                CrossAppButtonDTO crossAppButtonDTO = (CrossAppButtonDTO) other;
                return Intrinsics.d(this.title, crossAppButtonDTO.title) && Intrinsics.d(this.action, crossAppButtonDTO.action);
            }

            @NotNull
            public final CrossAppActionDTO getAction() {
                return this.action;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.action.hashCode() + (this.title.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "CrossAppButtonDTO(title=" + this.title + ", action=" + this.action + ")";
            }
        }

        public ModalDTO(@NotNull String logo, AvatarDTO avatarDTO, @NotNull OzonSpannableString title, @NotNull OzonSpannableString subtitle, @NotNull CrossAppButtonDTO crossAppButton, @NotNull CrossAppButtonDTO entryButton) {
            Intrinsics.checkNotNullParameter(logo, "logo");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(crossAppButton, "crossAppButton");
            Intrinsics.checkNotNullParameter(entryButton, "entryButton");
            this.logo = logo;
            this.avatar = avatarDTO;
            this.title = title;
            this.subtitle = subtitle;
            this.crossAppButton = crossAppButton;
            this.entryButton = entryButton;
        }

        public static /* synthetic */ ModalDTO copy$default(ModalDTO modalDTO, String str, AvatarDTO avatarDTO, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, CrossAppButtonDTO crossAppButtonDTO, CrossAppButtonDTO crossAppButtonDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = modalDTO.logo;
            }
            if ((i11 & 2) != 0) {
                avatarDTO = modalDTO.avatar;
            }
            if ((i11 & 4) != 0) {
                ozonSpannableString = modalDTO.title;
            }
            if ((i11 & 8) != 0) {
                ozonSpannableString2 = modalDTO.subtitle;
            }
            if ((i11 & 16) != 0) {
                crossAppButtonDTO = modalDTO.crossAppButton;
            }
            if ((i11 & 32) != 0) {
                crossAppButtonDTO2 = modalDTO.entryButton;
            }
            CrossAppButtonDTO crossAppButtonDTO3 = crossAppButtonDTO;
            CrossAppButtonDTO crossAppButtonDTO4 = crossAppButtonDTO2;
            return modalDTO.copy(str, avatarDTO, ozonSpannableString, ozonSpannableString2, crossAppButtonDTO3, crossAppButtonDTO4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLogo() {
            return this.logo;
        }

        /* renamed from: component2, reason: from getter */
        public final AvatarDTO getAvatar() {
            return this.avatar;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final OzonSpannableString getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final OzonSpannableString getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final CrossAppButtonDTO getCrossAppButton() {
            return this.crossAppButton;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final CrossAppButtonDTO getEntryButton() {
            return this.entryButton;
        }

        @NotNull
        public final ModalDTO copy(@NotNull String logo, AvatarDTO avatar, @NotNull OzonSpannableString title, @NotNull OzonSpannableString subtitle, @NotNull CrossAppButtonDTO crossAppButton, @NotNull CrossAppButtonDTO entryButton) {
            Intrinsics.checkNotNullParameter(logo, "logo");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(crossAppButton, "crossAppButton");
            Intrinsics.checkNotNullParameter(entryButton, "entryButton");
            return new ModalDTO(logo, avatar, title, subtitle, crossAppButton, entryButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ModalDTO)) {
                return false;
            }
            ModalDTO modalDTO = (ModalDTO) other;
            return Intrinsics.d(this.logo, modalDTO.logo) && Intrinsics.d(this.avatar, modalDTO.avatar) && Intrinsics.d(this.title, modalDTO.title) && Intrinsics.d(this.subtitle, modalDTO.subtitle) && Intrinsics.d(this.crossAppButton, modalDTO.crossAppButton) && Intrinsics.d(this.entryButton, modalDTO.entryButton);
        }

        public final AvatarDTO getAvatar() {
            return this.avatar;
        }

        @NotNull
        public final CrossAppButtonDTO getCrossAppButton() {
            return this.crossAppButton;
        }

        @NotNull
        public final CrossAppButtonDTO getEntryButton() {
            return this.entryButton;
        }

        @NotNull
        public final String getLogo() {
            return this.logo;
        }

        @NotNull
        public final OzonSpannableString getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final OzonSpannableString getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.logo.hashCode() * 31;
            AvatarDTO avatarDTO = this.avatar;
            return this.entryButton.hashCode() + ((this.crossAppButton.hashCode() + P.c(this.subtitle, P.c(this.title, (hashCode + (avatarDTO == null ? 0 : avatarDTO.hashCode())) * 31, 31), 31)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.logo;
            AvatarDTO avatarDTO = this.avatar;
            OzonSpannableString ozonSpannableString = this.title;
            OzonSpannableString ozonSpannableString2 = this.subtitle;
            return "ModalDTO(logo=" + str + ", avatar=" + avatarDTO + ", title=" + ((Object) ozonSpannableString) + ", subtitle=" + ((Object) ozonSpannableString2) + ", crossAppButton=" + this.crossAppButton + ", entryButton=" + this.entryButton + ")";
        }
    }

    public ModalCrossAppResponseDTO(ModalDTO modalDTO, SharedStoreKeysInfoDto sharedStoreKeysInfoDto) {
        this.data = modalDTO;
        this.sharedStoreKeysInfo = sharedStoreKeysInfoDto;
    }

    public static /* synthetic */ ModalCrossAppResponseDTO copy$default(ModalCrossAppResponseDTO modalCrossAppResponseDTO, ModalDTO modalDTO, SharedStoreKeysInfoDto sharedStoreKeysInfoDto, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            modalDTO = modalCrossAppResponseDTO.data;
        }
        if ((i11 & 2) != 0) {
            sharedStoreKeysInfoDto = modalCrossAppResponseDTO.sharedStoreKeysInfo;
        }
        return modalCrossAppResponseDTO.copy(modalDTO, sharedStoreKeysInfoDto);
    }

    /* renamed from: component1, reason: from getter */
    public final ModalDTO getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final SharedStoreKeysInfoDto getSharedStoreKeysInfo() {
        return this.sharedStoreKeysInfo;
    }

    @NotNull
    public final ModalCrossAppResponseDTO copy(ModalDTO data, SharedStoreKeysInfoDto sharedStoreKeysInfo) {
        return new ModalCrossAppResponseDTO(data, sharedStoreKeysInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModalCrossAppResponseDTO)) {
            return false;
        }
        ModalCrossAppResponseDTO modalCrossAppResponseDTO = (ModalCrossAppResponseDTO) other;
        return Intrinsics.d(this.data, modalCrossAppResponseDTO.data) && Intrinsics.d(this.sharedStoreKeysInfo, modalCrossAppResponseDTO.sharedStoreKeysInfo);
    }

    public final ModalDTO getData() {
        return this.data;
    }

    public final SharedStoreKeysInfoDto getSharedStoreKeysInfo() {
        return this.sharedStoreKeysInfo;
    }

    public int hashCode() {
        ModalDTO modalDTO = this.data;
        int hashCode = (modalDTO == null ? 0 : modalDTO.hashCode()) * 31;
        SharedStoreKeysInfoDto sharedStoreKeysInfoDto = this.sharedStoreKeysInfo;
        return hashCode + (sharedStoreKeysInfoDto != null ? sharedStoreKeysInfoDto.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ModalCrossAppResponseDTO(data=" + this.data + ", sharedStoreKeysInfo=" + this.sharedStoreKeysInfo + ")";
    }
}
