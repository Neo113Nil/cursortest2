package ru.ozon.app.android.session.userSocialsMobile.data.item;

import J.d;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "socials", "", "Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO$SocialDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSocials", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SocialDTO", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserSocialsMobileDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<SocialDTO> socials;

    @NotNull
    private final TextAtom title;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO$SocialDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "logo", "Lru/ozon/uni/atoms/data/avatar/Avatar;", "description", "unbindButton", "Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO$SocialDTO$UnbindButtonDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/avatar/Avatar;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO$SocialDTO$UnbindButtonDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getLogo", "()Lru/ozon/uni/atoms/data/avatar/Avatar;", "getDescription", "getUnbindButton", "()Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO$SocialDTO$UnbindButtonDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "UnbindButtonDTO", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class SocialDTO {
        public static final int $stable;
        private final TextAtom description;

        @NotNull
        private final Avatar logo;

        @NotNull
        private final TextAtom title;
        private final UnbindButtonDTO unbindButton;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO$SocialDTO$UnbindButtonDTO;", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "confirmationData", "Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO$SocialDTO$UnbindButtonDTO$ConfirmationDataDTO;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO$SocialDTO$UnbindButtonDTO$ConfirmationDataDTO;)V", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getConfirmationData", "()Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO$SocialDTO$UnbindButtonDTO$ConfirmationDataDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConfirmationDataDTO", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class UnbindButtonDTO {
            public static final int $stable = ButtonV3Atom.LargeBorderlessButton.$stable;

            @NotNull
            private final ButtonV3Atom.LargeBorderlessButton button;

            @NotNull
            private final ConfirmationDataDTO confirmationData;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO$SocialDTO$UnbindButtonDTO$ConfirmationDataDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class ConfirmationDataDTO {
                public static final int $stable = 0;

                @NotNull
                private final String subtitle;

                @NotNull
                private final String title;

                public ConfirmationDataDTO(@NotNull String title, @NotNull String subtitle) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                    this.title = title;
                    this.subtitle = subtitle;
                }

                public static /* synthetic */ ConfirmationDataDTO copy$default(ConfirmationDataDTO confirmationDataDTO, String str, String str2, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = confirmationDataDTO.title;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = confirmationDataDTO.subtitle;
                    }
                    return confirmationDataDTO.copy(str, str2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final String getSubtitle() {
                    return this.subtitle;
                }

                @NotNull
                public final ConfirmationDataDTO copy(@NotNull String title, @NotNull String subtitle) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                    return new ConfirmationDataDTO(title, subtitle);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ConfirmationDataDTO)) {
                        return false;
                    }
                    ConfirmationDataDTO confirmationDataDTO = (ConfirmationDataDTO) other;
                    return Intrinsics.d(this.title, confirmationDataDTO.title) && Intrinsics.d(this.subtitle, confirmationDataDTO.subtitle);
                }

                @NotNull
                public final String getSubtitle() {
                    return this.subtitle;
                }

                @NotNull
                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    return this.subtitle.hashCode() + (this.title.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return e.a("ConfirmationDataDTO(title=", this.title, ", subtitle=", this.subtitle, ")");
                }
            }

            public UnbindButtonDTO(@NotNull ButtonV3Atom.LargeBorderlessButton button, @NotNull ConfirmationDataDTO confirmationData) {
                Intrinsics.checkNotNullParameter(button, "button");
                Intrinsics.checkNotNullParameter(confirmationData, "confirmationData");
                this.button = button;
                this.confirmationData = confirmationData;
            }

            public static /* synthetic */ UnbindButtonDTO copy$default(UnbindButtonDTO unbindButtonDTO, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, ConfirmationDataDTO confirmationDataDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    largeBorderlessButton = unbindButtonDTO.button;
                }
                if ((i11 & 2) != 0) {
                    confirmationDataDTO = unbindButtonDTO.confirmationData;
                }
                return unbindButtonDTO.copy(largeBorderlessButton, confirmationDataDTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final ButtonV3Atom.LargeBorderlessButton getButton() {
                return this.button;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final ConfirmationDataDTO getConfirmationData() {
                return this.confirmationData;
            }

            @NotNull
            public final UnbindButtonDTO copy(@NotNull ButtonV3Atom.LargeBorderlessButton button, @NotNull ConfirmationDataDTO confirmationData) {
                Intrinsics.checkNotNullParameter(button, "button");
                Intrinsics.checkNotNullParameter(confirmationData, "confirmationData");
                return new UnbindButtonDTO(button, confirmationData);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UnbindButtonDTO)) {
                    return false;
                }
                UnbindButtonDTO unbindButtonDTO = (UnbindButtonDTO) other;
                return Intrinsics.d(this.button, unbindButtonDTO.button) && Intrinsics.d(this.confirmationData, unbindButtonDTO.confirmationData);
            }

            @NotNull
            public final ButtonV3Atom.LargeBorderlessButton getButton() {
                return this.button;
            }

            @NotNull
            public final ConfirmationDataDTO getConfirmationData() {
                return this.confirmationData;
            }

            public int hashCode() {
                return this.confirmationData.hashCode() + (this.button.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "UnbindButtonDTO(button=" + this.button + ", confirmationData=" + this.confirmationData + ")";
            }
        }

        static {
            int i11 = ButtonV3Atom.LargeBorderlessButton.$stable;
            int i12 = TextAtom.$stable;
            $stable = i11 | i12 | Avatar.$stable | i12;
        }

        public SocialDTO(@NotNull TextAtom title, @NotNull Avatar logo, TextAtom textAtom, UnbindButtonDTO unbindButtonDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(logo, "logo");
            this.title = title;
            this.logo = logo;
            this.description = textAtom;
            this.unbindButton = unbindButtonDTO;
        }

        public static /* synthetic */ SocialDTO copy$default(SocialDTO socialDTO, TextAtom textAtom, Avatar avatar, TextAtom textAtom2, UnbindButtonDTO unbindButtonDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = socialDTO.title;
            }
            if ((i11 & 2) != 0) {
                avatar = socialDTO.logo;
            }
            if ((i11 & 4) != 0) {
                textAtom2 = socialDTO.description;
            }
            if ((i11 & 8) != 0) {
                unbindButtonDTO = socialDTO.unbindButton;
            }
            return socialDTO.copy(textAtom, avatar, textAtom2, unbindButtonDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Avatar getLogo() {
            return this.logo;
        }

        /* renamed from: component3, reason: from getter */
        public final TextAtom getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final UnbindButtonDTO getUnbindButton() {
            return this.unbindButton;
        }

        @NotNull
        public final SocialDTO copy(@NotNull TextAtom title, @NotNull Avatar logo, TextAtom description, UnbindButtonDTO unbindButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(logo, "logo");
            return new SocialDTO(title, logo, description, unbindButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SocialDTO)) {
                return false;
            }
            SocialDTO socialDTO = (SocialDTO) other;
            return Intrinsics.d(this.title, socialDTO.title) && Intrinsics.d(this.logo, socialDTO.logo) && Intrinsics.d(this.description, socialDTO.description) && Intrinsics.d(this.unbindButton, socialDTO.unbindButton);
        }

        public final TextAtom getDescription() {
            return this.description;
        }

        @NotNull
        public final Avatar getLogo() {
            return this.logo;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public final UnbindButtonDTO getUnbindButton() {
            return this.unbindButton;
        }

        public int hashCode() {
            int hashCode = (this.logo.hashCode() + (this.title.hashCode() * 31)) * 31;
            TextAtom textAtom = this.description;
            int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            UnbindButtonDTO unbindButtonDTO = this.unbindButton;
            return hashCode2 + (unbindButtonDTO != null ? unbindButtonDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SocialDTO(title=" + this.title + ", logo=" + this.logo + ", description=" + this.description + ", unbindButton=" + this.unbindButton + ")";
        }
    }

    public UserSocialsMobileDTO(@NotNull TextAtom title, @NotNull List<SocialDTO> socials) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(socials, "socials");
        this.title = title;
        this.socials = socials;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserSocialsMobileDTO copy$default(UserSocialsMobileDTO userSocialsMobileDTO, TextAtom textAtom, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = userSocialsMobileDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = userSocialsMobileDTO.socials;
        }
        return userSocialsMobileDTO.copy(textAtom, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final List<SocialDTO> component2() {
        return this.socials;
    }

    @NotNull
    public final UserSocialsMobileDTO copy(@NotNull TextAtom title, @NotNull List<SocialDTO> socials) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(socials, "socials");
        return new UserSocialsMobileDTO(title, socials);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSocialsMobileDTO)) {
            return false;
        }
        UserSocialsMobileDTO userSocialsMobileDTO = (UserSocialsMobileDTO) other;
        return Intrinsics.d(this.title, userSocialsMobileDTO.title) && Intrinsics.d(this.socials, userSocialsMobileDTO.socials);
    }

    @NotNull
    public final List<SocialDTO> getSocials() {
        return this.socials;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.socials.hashCode() + (this.title.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return d.c("UserSocialsMobileDTO(title=", this.title, ", socials=", this.socials, ")");
    }
}
