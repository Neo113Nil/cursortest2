package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalMobile.data;

import B90.C2619v;
import Co.a;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001f B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/data/AddLegalMobileDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "input", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/data/AddLegalMobileDTO$InputDTO;", "advantages", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/data/AddLegalMobileDTO$AdvantageDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/data/AddLegalMobileDTO$InputDTO;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getInput", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/data/AddLegalMobileDTO$InputDTO;", "getAdvantages", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "InputDTO", "AdvantageDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddLegalMobileDTO {
    public static final int $stable = 8;
    private final List<AdvantageDTO> advantages;

    @NotNull
    private final InputDTO input;

    @NotNull
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/data/AddLegalMobileDTO$AdvantageDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AdvantageDTO {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final TextAtom subtitle;

        @NotNull
        private final TextAtom title;

        public AdvantageDTO(@NotNull TextAtom title, @NotNull TextAtom subtitle) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.title = title;
            this.subtitle = subtitle;
        }

        public static /* synthetic */ AdvantageDTO copy$default(AdvantageDTO advantageDTO, TextAtom textAtom, TextAtom textAtom2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = advantageDTO.title;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = advantageDTO.subtitle;
            }
            return advantageDTO.copy(textAtom, textAtom2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final AdvantageDTO copy(@NotNull TextAtom title, @NotNull TextAtom subtitle) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new AdvantageDTO(title, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdvantageDTO)) {
                return false;
            }
            AdvantageDTO advantageDTO = (AdvantageDTO) other;
            return Intrinsics.d(this.title, advantageDTO.title) && Intrinsics.d(this.subtitle, advantageDTO.subtitle);
        }

        @NotNull
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.subtitle.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a.a("AdvantageDTO(title=", this.title, ", subtitle=", this.subtitle, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/data/AddLegalMobileDTO$InputDTO;", "", HammersV3BodyDTO.PLACEHOLDER, "", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPlaceholder", "()Ljava/lang/String;", "getDeeplink", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InputDTO {
        public static final int $stable = 0;

        @NotNull
        private final String deeplink;

        @NotNull
        private final String placeholder;

        public InputDTO(@NotNull String placeholder, @NotNull String deeplink) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.placeholder = placeholder;
            this.deeplink = deeplink;
        }

        public static /* synthetic */ InputDTO copy$default(InputDTO inputDTO, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = inputDTO.placeholder;
            }
            if ((i11 & 2) != 0) {
                str2 = inputDTO.deeplink;
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
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final InputDTO copy(@NotNull String placeholder, @NotNull String deeplink) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new InputDTO(placeholder, deeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputDTO)) {
                return false;
            }
            InputDTO inputDTO = (InputDTO) other;
            return Intrinsics.d(this.placeholder, inputDTO.placeholder) && Intrinsics.d(this.deeplink, inputDTO.deeplink);
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        public int hashCode() {
            return this.deeplink.hashCode() + (this.placeholder.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("InputDTO(placeholder=", this.placeholder, ", deeplink=", this.deeplink, ")");
        }
    }

    public AddLegalMobileDTO(@NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull InputDTO input, List<AdvantageDTO> list) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(input, "input");
        this.title = title;
        this.subtitle = subtitle;
        this.input = input;
        this.advantages = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddLegalMobileDTO copy$default(AddLegalMobileDTO addLegalMobileDTO, TextAtom textAtom, TextAtom textAtom2, InputDTO inputDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = addLegalMobileDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = addLegalMobileDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            inputDTO = addLegalMobileDTO.input;
        }
        if ((i11 & 8) != 0) {
            list = addLegalMobileDTO.advantages;
        }
        return addLegalMobileDTO.copy(textAtom, textAtom2, inputDTO, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final InputDTO getInput() {
        return this.input;
    }

    public final List<AdvantageDTO> component4() {
        return this.advantages;
    }

    @NotNull
    public final AddLegalMobileDTO copy(@NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull InputDTO input, List<AdvantageDTO> advantages) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(input, "input");
        return new AddLegalMobileDTO(title, subtitle, input, advantages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddLegalMobileDTO)) {
            return false;
        }
        AddLegalMobileDTO addLegalMobileDTO = (AddLegalMobileDTO) other;
        return Intrinsics.d(this.title, addLegalMobileDTO.title) && Intrinsics.d(this.subtitle, addLegalMobileDTO.subtitle) && Intrinsics.d(this.input, addLegalMobileDTO.input) && Intrinsics.d(this.advantages, addLegalMobileDTO.advantages);
    }

    public final List<AdvantageDTO> getAdvantages() {
        return this.advantages;
    }

    @NotNull
    public final InputDTO getInput() {
        return this.input;
    }

    @NotNull
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = (this.input.hashCode() + C2619v.b(this.title.hashCode() * 31, 31, this.subtitle)) * 31;
        List<AdvantageDTO> list = this.advantages;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        InputDTO inputDTO = this.input;
        List<AdvantageDTO> list = this.advantages;
        StringBuilder a11 = HY.a.a("AddLegalMobileDTO(title=", textAtom, ", subtitle=", textAtom2, ", input=");
        a11.append(inputDTO);
        a11.append(", advantages=");
        a11.append(list);
        a11.append(")");
        return a11.toString();
    }
}
