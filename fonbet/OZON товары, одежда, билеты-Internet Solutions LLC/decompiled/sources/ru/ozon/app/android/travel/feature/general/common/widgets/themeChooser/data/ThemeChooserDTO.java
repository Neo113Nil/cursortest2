package ru.ozon.app.android.travel.feature.general.common.widgets.themeChooser.data;

import H3.c;
import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/data/ThemeChooserDTO;", "", "selectors", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/data/ThemeChooserDTO$ThemeSelector;", "<init>", "(Ljava/util/List;)V", "getSelectors", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ThemeSelector", "ThemeEnum", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ThemeChooserDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<ThemeSelector> selectors;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/data/ThemeChooserDTO$ThemeEnum;", "", "<init>", "(Ljava/lang/String;I)V", "LIGHT", "DARK", "SYSTEM", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ThemeEnum {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ThemeEnum[] $VALUES;

        @i(name = "LIGHT")
        public static final ThemeEnum LIGHT = new ThemeEnum("LIGHT", 0);

        @i(name = "DARK")
        public static final ThemeEnum DARK = new ThemeEnum("DARK", 1);

        @i(name = "SYSTEM")
        public static final ThemeEnum SYSTEM = new ThemeEnum("SYSTEM", 2);

        private static final /* synthetic */ ThemeEnum[] $values() {
            return new ThemeEnum[]{LIGHT, DARK, SYSTEM};
        }

        static {
            ThemeEnum[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ThemeEnum(String str, int i11) {
        }

        public static ThemeEnum valueOf(String str) {
            return (ThemeEnum) Enum.valueOf(ThemeEnum.class, str);
        }

        public static ThemeEnum[] values() {
            return (ThemeEnum[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0018\u001a\u00020\u000bH\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003J=\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/data/ThemeChooserDTO$ThemeSelector;", "", "theme", "Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/data/ThemeChooserDTO$ThemeEnum;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "themeImage", "Lru/ozon/uni/atoms/data/image/ImageDTO;", FormPageDTO.Field.FIELD_TYPE_RADIO, "Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO;", "backgroundColor", "", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/data/ThemeChooserDTO$ThemeEnum;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO;Ljava/lang/String;)V", "getTheme", "()Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/data/ThemeChooserDTO$ThemeEnum;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getThemeImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getRadio", "()Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO;", "getBackgroundColor", "()Ljava/lang/String;", "toString", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ThemeSelector {
        public static final int $stable = RadioDTO.$stable;
        private final String backgroundColor;

        @NotNull
        private final RadioDTO radio;

        @NotNull
        private final ThemeEnum theme;

        @NotNull
        private final ImageDTO themeImage;

        @NotNull
        private final TextDTO title;

        public ThemeSelector(@NotNull ThemeEnum theme, @NotNull TextDTO title, @NotNull ImageDTO themeImage, @NotNull RadioDTO radio, String str) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(themeImage, "themeImage");
            Intrinsics.checkNotNullParameter(radio, "radio");
            this.theme = theme;
            this.title = title;
            this.themeImage = themeImage;
            this.radio = radio;
            this.backgroundColor = str;
        }

        public static /* synthetic */ ThemeSelector copy$default(ThemeSelector themeSelector, ThemeEnum themeEnum, TextDTO textDTO, ImageDTO imageDTO, RadioDTO radioDTO, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                themeEnum = themeSelector.theme;
            }
            if ((i11 & 2) != 0) {
                textDTO = themeSelector.title;
            }
            if ((i11 & 4) != 0) {
                imageDTO = themeSelector.themeImage;
            }
            if ((i11 & 8) != 0) {
                radioDTO = themeSelector.radio;
            }
            if ((i11 & 16) != 0) {
                str = themeSelector.backgroundColor;
            }
            String str2 = str;
            ImageDTO imageDTO2 = imageDTO;
            return themeSelector.copy(themeEnum, textDTO, imageDTO2, radioDTO, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ThemeEnum getTheme() {
            return this.theme;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ImageDTO getThemeImage() {
            return this.themeImage;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final RadioDTO getRadio() {
            return this.radio;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final ThemeSelector copy(@NotNull ThemeEnum theme, @NotNull TextDTO title, @NotNull ImageDTO themeImage, @NotNull RadioDTO radio, String backgroundColor) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(themeImage, "themeImage");
            Intrinsics.checkNotNullParameter(radio, "radio");
            return new ThemeSelector(theme, title, themeImage, radio, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ThemeSelector)) {
                return false;
            }
            ThemeSelector themeSelector = (ThemeSelector) other;
            return this.theme == themeSelector.theme && Intrinsics.d(this.title, themeSelector.title) && Intrinsics.d(this.themeImage, themeSelector.themeImage) && Intrinsics.d(this.radio, themeSelector.radio) && Intrinsics.d(this.backgroundColor, themeSelector.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final RadioDTO getRadio() {
            return this.radio;
        }

        @NotNull
        public final ThemeEnum getTheme() {
            return this.theme;
        }

        @NotNull
        public final ImageDTO getThemeImage() {
            return this.themeImage;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = (this.radio.hashCode() + Nh.a.b(this.themeImage, Ns.b.a(this.title, this.theme.hashCode() * 31, 31), 31)) * 31;
            String str = this.backgroundColor;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            int ordinal = this.theme.ordinal();
            OzonSpannableString text = this.title.getText();
            return this + "@ThemeSelector with theme=" + ordinal + ", title=" + ((Object) text) + ", themeImage=" + this.themeImage.getImage() + ", radio=" + this.radio.isSelected();
        }
    }

    public ThemeChooserDTO(@NotNull List<ThemeSelector> selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        this.selectors = selectors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThemeChooserDTO copy$default(ThemeChooserDTO themeChooserDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = themeChooserDTO.selectors;
        }
        return themeChooserDTO.copy(list);
    }

    @NotNull
    public final List<ThemeSelector> component1() {
        return this.selectors;
    }

    @NotNull
    public final ThemeChooserDTO copy(@NotNull List<ThemeSelector> selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        return new ThemeChooserDTO(selectors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ThemeChooserDTO) && Intrinsics.d(this.selectors, ((ThemeChooserDTO) other).selectors);
    }

    @NotNull
    public final List<ThemeSelector> getSelectors() {
        return this.selectors;
    }

    public int hashCode() {
        return this.selectors.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("ThemeChooserDTO(selectors=", ")", this.selectors);
    }
}
