package ru.ozon.app.android.travel.feature.avia.widgets.luggageRequirements.v2.data;

import Ak.C2436a;
import An.C2439a;
import B90.C2619v;
import J.d;
import Ve.C4636t5;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/data/LuggageRequirementsV2DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", DynamicElementDTO.TABS, "", "Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/data/LuggageRequirementsV2DTO$TabDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTabs", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TabDTO", "CompanyRequirementsDTO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LuggageRequirementsV2DTO {
    public static final int $stable = 8;

    @NotNull
    private final List<TabDTO> tabs;
    private final TextAtom title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/data/LuggageRequirementsV2DTO$CompanyRequirementsDTO;", "", "iconUrl", "", "companyName", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "handCarryTitle", "handCarryText", "luggageTitle", "luggageText", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getIconUrl", "()Ljava/lang/String;", "getCompanyName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getHandCarryTitle", "getHandCarryText", "getLuggageTitle", "getLuggageText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CompanyRequirementsDTO {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final TextAtom companyName;
        private final TextAtom handCarryText;
        private final TextAtom handCarryTitle;
        private final String iconUrl;
        private final TextAtom luggageText;
        private final TextAtom luggageTitle;

        public CompanyRequirementsDTO(String str, @NotNull TextAtom companyName, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, TextAtom textAtom4) {
            Intrinsics.checkNotNullParameter(companyName, "companyName");
            this.iconUrl = str;
            this.companyName = companyName;
            this.handCarryTitle = textAtom;
            this.handCarryText = textAtom2;
            this.luggageTitle = textAtom3;
            this.luggageText = textAtom4;
        }

        public static /* synthetic */ CompanyRequirementsDTO copy$default(CompanyRequirementsDTO companyRequirementsDTO, String str, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, TextAtom textAtom4, TextAtom textAtom5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = companyRequirementsDTO.iconUrl;
            }
            if ((i11 & 2) != 0) {
                textAtom = companyRequirementsDTO.companyName;
            }
            if ((i11 & 4) != 0) {
                textAtom2 = companyRequirementsDTO.handCarryTitle;
            }
            if ((i11 & 8) != 0) {
                textAtom3 = companyRequirementsDTO.handCarryText;
            }
            if ((i11 & 16) != 0) {
                textAtom4 = companyRequirementsDTO.luggageTitle;
            }
            if ((i11 & 32) != 0) {
                textAtom5 = companyRequirementsDTO.luggageText;
            }
            TextAtom textAtom6 = textAtom4;
            TextAtom textAtom7 = textAtom5;
            return companyRequirementsDTO.copy(str, textAtom, textAtom2, textAtom3, textAtom6, textAtom7);
        }

        /* renamed from: component1, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getCompanyName() {
            return this.companyName;
        }

        /* renamed from: component3, reason: from getter */
        public final TextAtom getHandCarryTitle() {
            return this.handCarryTitle;
        }

        /* renamed from: component4, reason: from getter */
        public final TextAtom getHandCarryText() {
            return this.handCarryText;
        }

        /* renamed from: component5, reason: from getter */
        public final TextAtom getLuggageTitle() {
            return this.luggageTitle;
        }

        /* renamed from: component6, reason: from getter */
        public final TextAtom getLuggageText() {
            return this.luggageText;
        }

        @NotNull
        public final CompanyRequirementsDTO copy(String iconUrl, @NotNull TextAtom companyName, TextAtom handCarryTitle, TextAtom handCarryText, TextAtom luggageTitle, TextAtom luggageText) {
            Intrinsics.checkNotNullParameter(companyName, "companyName");
            return new CompanyRequirementsDTO(iconUrl, companyName, handCarryTitle, handCarryText, luggageTitle, luggageText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CompanyRequirementsDTO)) {
                return false;
            }
            CompanyRequirementsDTO companyRequirementsDTO = (CompanyRequirementsDTO) other;
            return Intrinsics.d(this.iconUrl, companyRequirementsDTO.iconUrl) && Intrinsics.d(this.companyName, companyRequirementsDTO.companyName) && Intrinsics.d(this.handCarryTitle, companyRequirementsDTO.handCarryTitle) && Intrinsics.d(this.handCarryText, companyRequirementsDTO.handCarryText) && Intrinsics.d(this.luggageTitle, companyRequirementsDTO.luggageTitle) && Intrinsics.d(this.luggageText, companyRequirementsDTO.luggageText);
        }

        @NotNull
        public final TextAtom getCompanyName() {
            return this.companyName;
        }

        public final TextAtom getHandCarryText() {
            return this.handCarryText;
        }

        public final TextAtom getHandCarryTitle() {
            return this.handCarryTitle;
        }

        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final TextAtom getLuggageText() {
            return this.luggageText;
        }

        public final TextAtom getLuggageTitle() {
            return this.luggageTitle;
        }

        public int hashCode() {
            String str = this.iconUrl;
            int b11 = C2619v.b((str == null ? 0 : str.hashCode()) * 31, 31, this.companyName);
            TextAtom textAtom = this.handCarryTitle;
            int hashCode = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            TextAtom textAtom2 = this.handCarryText;
            int hashCode2 = (hashCode + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
            TextAtom textAtom3 = this.luggageTitle;
            int hashCode3 = (hashCode2 + (textAtom3 == null ? 0 : textAtom3.hashCode())) * 31;
            TextAtom textAtom4 = this.luggageText;
            return hashCode3 + (textAtom4 != null ? textAtom4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.iconUrl;
            TextAtom textAtom = this.companyName;
            TextAtom textAtom2 = this.handCarryTitle;
            TextAtom textAtom3 = this.handCarryText;
            TextAtom textAtom4 = this.luggageTitle;
            TextAtom textAtom5 = this.luggageText;
            StringBuilder d11 = C2436a.d("CompanyRequirementsDTO(iconUrl=", str, ", companyName=", ", handCarryTitle=", textAtom);
            C4636t5.c(", handCarryText=", ", luggageTitle=", d11, textAtom2, textAtom3);
            d11.append(textAtom4);
            d11.append(", luggageText=");
            d11.append(textAtom5);
            d11.append(")");
            return d11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/data/LuggageRequirementsV2DTO$TabDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "requirements", "", "Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/data/LuggageRequirementsV2DTO$CompanyRequirementsDTO;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getRequirements", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<CompanyRequirementsDTO> requirements;

        @NotNull
        private final String title;

        public TabDTO(@NotNull String title, @NotNull List<CompanyRequirementsDTO> requirements) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(requirements, "requirements");
            this.title = title;
            this.requirements = requirements;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TabDTO copy$default(TabDTO tabDTO, String str, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = tabDTO.title;
            }
            if ((i11 & 2) != 0) {
                list = tabDTO.requirements;
            }
            return tabDTO.copy(str, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final List<CompanyRequirementsDTO> component2() {
            return this.requirements;
        }

        @NotNull
        public final TabDTO copy(@NotNull String title, @NotNull List<CompanyRequirementsDTO> requirements) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(requirements, "requirements");
            return new TabDTO(title, requirements);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabDTO)) {
                return false;
            }
            TabDTO tabDTO = (TabDTO) other;
            return Intrinsics.d(this.title, tabDTO.title) && Intrinsics.d(this.requirements, tabDTO.requirements);
        }

        @NotNull
        public final List<CompanyRequirementsDTO> getRequirements() {
            return this.requirements;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.requirements.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return C2439a.a("TabDTO(title=", this.title, ", requirements=", ")", this.requirements);
        }
    }

    public LuggageRequirementsV2DTO(TextAtom textAtom, @NotNull List<TabDTO> tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.title = textAtom;
        this.tabs = tabs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LuggageRequirementsV2DTO copy$default(LuggageRequirementsV2DTO luggageRequirementsV2DTO, TextAtom textAtom, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = luggageRequirementsV2DTO.title;
        }
        if ((i11 & 2) != 0) {
            list = luggageRequirementsV2DTO.tabs;
        }
        return luggageRequirementsV2DTO.copy(textAtom, list);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final List<TabDTO> component2() {
        return this.tabs;
    }

    @NotNull
    public final LuggageRequirementsV2DTO copy(TextAtom title, @NotNull List<TabDTO> tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        return new LuggageRequirementsV2DTO(title, tabs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LuggageRequirementsV2DTO)) {
            return false;
        }
        LuggageRequirementsV2DTO luggageRequirementsV2DTO = (LuggageRequirementsV2DTO) other;
        return Intrinsics.d(this.title, luggageRequirementsV2DTO.title) && Intrinsics.d(this.tabs, luggageRequirementsV2DTO.tabs);
    }

    @NotNull
    public final List<TabDTO> getTabs() {
        return this.tabs;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        TextAtom textAtom = this.title;
        return this.tabs.hashCode() + ((textAtom == null ? 0 : textAtom.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return d.c("LuggageRequirementsV2DTO(title=", this.title, ", tabs=", this.tabs, ")");
    }
}
