package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data;

import C.o0;
import D3.g;
import Tl.b;
import V.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002 !B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO;", "", "info", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "kppCheck", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$KppCheckDTO;", "banner", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$Banner;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$KppCheckDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$Banner;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getInfo", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getKppCheck", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$KppCheckDTO;", "getBanner", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$Banner;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "KppCheckDTO", "Banner", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CheckLegalInfoDTO {
    public static final int $stable = CellDTO.$stable;
    private final Banner banner;

    @NotNull
    private final ButtonV3DTO button;

    @NotNull
    private final CellDTO info;
    private final KppCheckDTO kppCheck;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$Banner;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "image", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getImage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Banner {
        public static final int $stable = 0;

        @NotNull
        private final String image;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public Banner(@NotNull TextDTO title, TextDTO textDTO, @NotNull String image) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(image, "image");
            this.title = title;
            this.subtitle = textDTO;
            this.image = image;
        }

        public static /* synthetic */ Banner copy$default(Banner banner, TextDTO textDTO, TextDTO textDTO2, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = banner.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = banner.subtitle;
            }
            if ((i11 & 4) != 0) {
                str = banner.image;
            }
            return banner.copy(textDTO, textDTO2, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final Banner copy(@NotNull TextDTO title, TextDTO subtitle, @NotNull String image) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(image, "image");
            return new Banner(title, subtitle, image);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) other;
            return Intrinsics.d(this.title, banner.title) && Intrinsics.d(this.subtitle, banner.subtitle) && Intrinsics.d(this.image, banner.image);
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextDTO textDTO = this.subtitle;
            return this.image.hashCode() + ((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            return o0.c(g.g("Banner(title=", textDTO, ", subtitle=", textDTO2, ", image="), this.image, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$KppCheckDTO;", "", "input", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$KppCheckDTO$InputDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "description", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$KppCheckDTO$InputDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getInput", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$KppCheckDTO$InputDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDescription", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "InputDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class KppCheckDTO {
        public static final int $stable = 0;
        private final TextDTO description;

        @NotNull
        private final InputDTO input;
        private final TextDTO title;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$KppCheckDTO$InputDTO;", "", HammersV3BodyDTO.PLACEHOLDER, "", "emptyTextErrorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPlaceholder", "()Ljava/lang/String;", "getEmptyTextErrorMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InputDTO {
            public static final int $stable = 0;

            @NotNull
            private final String emptyTextErrorMessage;

            @NotNull
            private final String placeholder;

            public InputDTO(@NotNull String placeholder, @NotNull String emptyTextErrorMessage) {
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                Intrinsics.checkNotNullParameter(emptyTextErrorMessage, "emptyTextErrorMessage");
                this.placeholder = placeholder;
                this.emptyTextErrorMessage = emptyTextErrorMessage;
            }

            public static /* synthetic */ InputDTO copy$default(InputDTO inputDTO, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = inputDTO.placeholder;
                }
                if ((i11 & 2) != 0) {
                    str2 = inputDTO.emptyTextErrorMessage;
                }
                return inputDTO.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getPlaceholder() {
                return this.placeholder;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getEmptyTextErrorMessage() {
                return this.emptyTextErrorMessage;
            }

            @NotNull
            public final InputDTO copy(@NotNull String placeholder, @NotNull String emptyTextErrorMessage) {
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                Intrinsics.checkNotNullParameter(emptyTextErrorMessage, "emptyTextErrorMessage");
                return new InputDTO(placeholder, emptyTextErrorMessage);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InputDTO)) {
                    return false;
                }
                InputDTO inputDTO = (InputDTO) other;
                return Intrinsics.d(this.placeholder, inputDTO.placeholder) && Intrinsics.d(this.emptyTextErrorMessage, inputDTO.emptyTextErrorMessage);
            }

            @NotNull
            public final String getEmptyTextErrorMessage() {
                return this.emptyTextErrorMessage;
            }

            @NotNull
            public final String getPlaceholder() {
                return this.placeholder;
            }

            public int hashCode() {
                return this.emptyTextErrorMessage.hashCode() + (this.placeholder.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return e.a("InputDTO(placeholder=", this.placeholder, ", emptyTextErrorMessage=", this.emptyTextErrorMessage, ")");
            }
        }

        public KppCheckDTO(@NotNull InputDTO input, TextDTO textDTO, TextDTO textDTO2) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.input = input;
            this.title = textDTO;
            this.description = textDTO2;
        }

        public static /* synthetic */ KppCheckDTO copy$default(KppCheckDTO kppCheckDTO, InputDTO inputDTO, TextDTO textDTO, TextDTO textDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                inputDTO = kppCheckDTO.input;
            }
            if ((i11 & 2) != 0) {
                textDTO = kppCheckDTO.title;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = kppCheckDTO.description;
            }
            return kppCheckDTO.copy(inputDTO, textDTO, textDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final InputDTO getInput() {
            return this.input;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getDescription() {
            return this.description;
        }

        @NotNull
        public final KppCheckDTO copy(@NotNull InputDTO input, TextDTO title, TextDTO description) {
            Intrinsics.checkNotNullParameter(input, "input");
            return new KppCheckDTO(input, title, description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof KppCheckDTO)) {
                return false;
            }
            KppCheckDTO kppCheckDTO = (KppCheckDTO) other;
            return Intrinsics.d(this.input, kppCheckDTO.input) && Intrinsics.d(this.title, kppCheckDTO.title) && Intrinsics.d(this.description, kppCheckDTO.description);
        }

        public final TextDTO getDescription() {
            return this.description;
        }

        @NotNull
        public final InputDTO getInput() {
            return this.input;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.input.hashCode() * 31;
            TextDTO textDTO = this.title;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.description;
            return hashCode2 + (textDTO2 != null ? textDTO2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            InputDTO inputDTO = this.input;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.description;
            StringBuilder sb2 = new StringBuilder("KppCheckDTO(input=");
            sb2.append(inputDTO);
            sb2.append(", title=");
            sb2.append(textDTO);
            sb2.append(", description=");
            return b.e(sb2, textDTO2, ")");
        }
    }

    public CheckLegalInfoDTO(@NotNull CellDTO info, KppCheckDTO kppCheckDTO, Banner banner, @NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(button, "button");
        this.info = info;
        this.kppCheck = kppCheckDTO;
        this.banner = banner;
        this.button = button;
    }

    public static /* synthetic */ CheckLegalInfoDTO copy$default(CheckLegalInfoDTO checkLegalInfoDTO, CellDTO cellDTO, KppCheckDTO kppCheckDTO, Banner banner, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cellDTO = checkLegalInfoDTO.info;
        }
        if ((i11 & 2) != 0) {
            kppCheckDTO = checkLegalInfoDTO.kppCheck;
        }
        if ((i11 & 4) != 0) {
            banner = checkLegalInfoDTO.banner;
        }
        if ((i11 & 8) != 0) {
            buttonV3DTO = checkLegalInfoDTO.button;
        }
        return checkLegalInfoDTO.copy(cellDTO, kppCheckDTO, banner, buttonV3DTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CellDTO getInfo() {
        return this.info;
    }

    /* renamed from: component2, reason: from getter */
    public final KppCheckDTO getKppCheck() {
        return this.kppCheck;
    }

    /* renamed from: component3, reason: from getter */
    public final Banner getBanner() {
        return this.banner;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final CheckLegalInfoDTO copy(@NotNull CellDTO info, KppCheckDTO kppCheck, Banner banner, @NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(button, "button");
        return new CheckLegalInfoDTO(info, kppCheck, banner, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckLegalInfoDTO)) {
            return false;
        }
        CheckLegalInfoDTO checkLegalInfoDTO = (CheckLegalInfoDTO) other;
        return Intrinsics.d(this.info, checkLegalInfoDTO.info) && Intrinsics.d(this.kppCheck, checkLegalInfoDTO.kppCheck) && Intrinsics.d(this.banner, checkLegalInfoDTO.banner) && Intrinsics.d(this.button, checkLegalInfoDTO.button);
    }

    public final Banner getBanner() {
        return this.banner;
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final CellDTO getInfo() {
        return this.info;
    }

    public final KppCheckDTO getKppCheck() {
        return this.kppCheck;
    }

    public int hashCode() {
        int hashCode = this.info.hashCode() * 31;
        KppCheckDTO kppCheckDTO = this.kppCheck;
        int hashCode2 = (hashCode + (kppCheckDTO == null ? 0 : kppCheckDTO.hashCode())) * 31;
        Banner banner = this.banner;
        return this.button.hashCode() + ((hashCode2 + (banner != null ? banner.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "CheckLegalInfoDTO(info=" + this.info + ", kppCheck=" + this.kppCheck + ", banner=" + this.banner + ", button=" + this.button + ")";
    }
}
