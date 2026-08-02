package ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.data;

import B0.C2454a;
import De.C2859b;
import G.g;
import Ns.b;
import T7.P;
import Tz.C4055a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v2.CommonInputV2DTO;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0003&'(BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003JS\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\nHÖ\u0001J\t\u0010%\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO;", "", "headerSection", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$HeaderSectionDTO;", "formBlockList", "", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$FormBlockDTO;", "buttonSection", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$ButtonSectionDTO;", "gap", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$HeaderSectionDTO;Ljava/util/List;Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$ButtonSectionDTO;ILjava/util/Map;)V", "getHeaderSection", "()Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$HeaderSectionDTO;", "getFormBlockList", "()Ljava/util/List;", "getButtonSection", "()Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$ButtonSectionDTO;", "getGap", "()I", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "HeaderSectionDTO", "FormBlockDTO", "ButtonSectionDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class B2bFormDTO {
    public static final int $stable = 8;
    private final ButtonSectionDTO buttonSection;

    @NotNull
    private final List<FormBlockDTO> formBlockList;
    private final int gap;
    private final HeaderSectionDTO headerSection;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$HeaderSectionDTO;", "", "settings", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getSettings", "()Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HeaderSectionDTO {
        public static final int $stable = 8;
        private final ImageDTO image;
        private final TravelWidgetSettingsDTO settings;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public HeaderSectionDTO(TravelWidgetSettingsDTO travelWidgetSettingsDTO, ImageDTO imageDTO, @NotNull TextDTO title, TextDTO textDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.settings = travelWidgetSettingsDTO;
            this.image = imageDTO;
            this.title = title;
            this.subtitle = textDTO;
        }

        public static /* synthetic */ HeaderSectionDTO copy$default(HeaderSectionDTO headerSectionDTO, TravelWidgetSettingsDTO travelWidgetSettingsDTO, ImageDTO imageDTO, TextDTO textDTO, TextDTO textDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                travelWidgetSettingsDTO = headerSectionDTO.settings;
            }
            if ((i11 & 2) != 0) {
                imageDTO = headerSectionDTO.image;
            }
            if ((i11 & 4) != 0) {
                textDTO = headerSectionDTO.title;
            }
            if ((i11 & 8) != 0) {
                textDTO2 = headerSectionDTO.subtitle;
            }
            return headerSectionDTO.copy(travelWidgetSettingsDTO, imageDTO, textDTO, textDTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final TravelWidgetSettingsDTO getSettings() {
            return this.settings;
        }

        /* renamed from: component2, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final HeaderSectionDTO copy(TravelWidgetSettingsDTO settings, ImageDTO image, @NotNull TextDTO title, TextDTO subtitle) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new HeaderSectionDTO(settings, image, title, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderSectionDTO)) {
                return false;
            }
            HeaderSectionDTO headerSectionDTO = (HeaderSectionDTO) other;
            return Intrinsics.d(this.settings, headerSectionDTO.settings) && Intrinsics.d(this.image, headerSectionDTO.image) && Intrinsics.d(this.title, headerSectionDTO.title) && Intrinsics.d(this.subtitle, headerSectionDTO.subtitle);
        }

        public final ImageDTO getImage() {
            return this.image;
        }

        public final TravelWidgetSettingsDTO getSettings() {
            return this.settings;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            TravelWidgetSettingsDTO travelWidgetSettingsDTO = this.settings;
            int hashCode = (travelWidgetSettingsDTO == null ? 0 : travelWidgetSettingsDTO.hashCode()) * 31;
            ImageDTO imageDTO = this.image;
            int a11 = b.a(this.title, (hashCode + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31, 31);
            TextDTO textDTO = this.subtitle;
            return a11 + (textDTO != null ? textDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "HeaderSectionDTO(settings=" + this.settings + ", image=" + this.image + ", title=" + this.title + ", subtitle=" + this.subtitle + ")";
        }
    }

    public B2bFormDTO(HeaderSectionDTO headerSectionDTO, @NotNull List<FormBlockDTO> formBlockList, ButtonSectionDTO buttonSectionDTO, int i11, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(formBlockList, "formBlockList");
        this.headerSection = headerSectionDTO;
        this.formBlockList = formBlockList;
        this.buttonSection = buttonSectionDTO;
        this.gap = i11;
        this.trackingInfo = map;
    }

    public static /* synthetic */ B2bFormDTO copy$default(B2bFormDTO b2bFormDTO, HeaderSectionDTO headerSectionDTO, List list, ButtonSectionDTO buttonSectionDTO, int i11, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            headerSectionDTO = b2bFormDTO.headerSection;
        }
        if ((i12 & 2) != 0) {
            list = b2bFormDTO.formBlockList;
        }
        if ((i12 & 4) != 0) {
            buttonSectionDTO = b2bFormDTO.buttonSection;
        }
        if ((i12 & 8) != 0) {
            i11 = b2bFormDTO.gap;
        }
        if ((i12 & 16) != 0) {
            map = b2bFormDTO.trackingInfo;
        }
        Map map2 = map;
        ButtonSectionDTO buttonSectionDTO2 = buttonSectionDTO;
        return b2bFormDTO.copy(headerSectionDTO, list, buttonSectionDTO2, i11, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final HeaderSectionDTO getHeaderSection() {
        return this.headerSection;
    }

    @NotNull
    public final List<FormBlockDTO> component2() {
        return this.formBlockList;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonSectionDTO getButtonSection() {
        return this.buttonSection;
    }

    /* renamed from: component4, reason: from getter */
    public final int getGap() {
        return this.gap;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final B2bFormDTO copy(HeaderSectionDTO headerSection, @NotNull List<FormBlockDTO> formBlockList, ButtonSectionDTO buttonSection, int gap, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(formBlockList, "formBlockList");
        return new B2bFormDTO(headerSection, formBlockList, buttonSection, gap, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof B2bFormDTO)) {
            return false;
        }
        B2bFormDTO b2bFormDTO = (B2bFormDTO) other;
        return Intrinsics.d(this.headerSection, b2bFormDTO.headerSection) && Intrinsics.d(this.formBlockList, b2bFormDTO.formBlockList) && Intrinsics.d(this.buttonSection, b2bFormDTO.buttonSection) && this.gap == b2bFormDTO.gap && Intrinsics.d(this.trackingInfo, b2bFormDTO.trackingInfo);
    }

    public final ButtonSectionDTO getButtonSection() {
        return this.buttonSection;
    }

    @NotNull
    public final List<FormBlockDTO> getFormBlockList() {
        return this.formBlockList;
    }

    public final int getGap() {
        return this.gap;
    }

    public final HeaderSectionDTO getHeaderSection() {
        return this.headerSection;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        HeaderSectionDTO headerSectionDTO = this.headerSection;
        int b11 = g.b((headerSectionDTO == null ? 0 : headerSectionDTO.hashCode()) * 31, 31, this.formBlockList);
        ButtonSectionDTO buttonSectionDTO = this.buttonSection;
        int a11 = C2454a.a(this.gap, (b11 + (buttonSectionDTO == null ? 0 : buttonSectionDTO.hashCode())) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        HeaderSectionDTO headerSectionDTO = this.headerSection;
        List<FormBlockDTO> list = this.formBlockList;
        ButtonSectionDTO buttonSectionDTO = this.buttonSection;
        int i11 = this.gap;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("B2bFormDTO(headerSection=");
        sb2.append(headerSectionDTO);
        sb2.append(", formBlockList=");
        sb2.append(list);
        sb2.append(", buttonSection=");
        sb2.append(buttonSectionDTO);
        sb2.append(", gap=");
        sb2.append(i11);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u00010B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003Ji\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$FormBlockDTO;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "settings", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "inputList", "", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO;", "cellListBlock", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$FormBlockDTO$CellListBlockDTO;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "gap", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;Ljava/util/List;Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$FormBlockDTO$CellListBlockDTO;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;I)V", "getId", "()I", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getSettings", "()Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "getInputList", "()Ljava/util/List;", "getCellListBlock", "()Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$FormBlockDTO$CellListBlockDTO;", "getDisclaimer", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getGap", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "", "CellListBlockDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class FormBlockDTO {
        public static final int $stable = 8;
        private final CellListBlockDTO cellListBlock;
        private final DisclaimerDTO disclaimer;
        private final int gap;
        private final int id;

        @NotNull
        private final List<CommonInputV2DTO> inputList;
        private final TravelWidgetSettingsDTO settings;
        private final TextDTO subtitle;
        private final TextDTO title;

        public FormBlockDTO(int i11, TextDTO textDTO, TextDTO textDTO2, TravelWidgetSettingsDTO travelWidgetSettingsDTO, @NotNull List<CommonInputV2DTO> inputList, CellListBlockDTO cellListBlockDTO, DisclaimerDTO disclaimerDTO, int i12) {
            Intrinsics.checkNotNullParameter(inputList, "inputList");
            this.id = i11;
            this.title = textDTO;
            this.subtitle = textDTO2;
            this.settings = travelWidgetSettingsDTO;
            this.inputList = inputList;
            this.cellListBlock = cellListBlockDTO;
            this.disclaimer = disclaimerDTO;
            this.gap = i12;
        }

        public static /* synthetic */ FormBlockDTO copy$default(FormBlockDTO formBlockDTO, int i11, TextDTO textDTO, TextDTO textDTO2, TravelWidgetSettingsDTO travelWidgetSettingsDTO, List list, CellListBlockDTO cellListBlockDTO, DisclaimerDTO disclaimerDTO, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = formBlockDTO.id;
            }
            if ((i13 & 2) != 0) {
                textDTO = formBlockDTO.title;
            }
            if ((i13 & 4) != 0) {
                textDTO2 = formBlockDTO.subtitle;
            }
            if ((i13 & 8) != 0) {
                travelWidgetSettingsDTO = formBlockDTO.settings;
            }
            if ((i13 & 16) != 0) {
                list = formBlockDTO.inputList;
            }
            if ((i13 & 32) != 0) {
                cellListBlockDTO = formBlockDTO.cellListBlock;
            }
            if ((i13 & 64) != 0) {
                disclaimerDTO = formBlockDTO.disclaimer;
            }
            if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                i12 = formBlockDTO.gap;
            }
            DisclaimerDTO disclaimerDTO2 = disclaimerDTO;
            int i14 = i12;
            List list2 = list;
            CellListBlockDTO cellListBlockDTO2 = cellListBlockDTO;
            return formBlockDTO.copy(i11, textDTO, textDTO2, travelWidgetSettingsDTO, list2, cellListBlockDTO2, disclaimerDTO2, i14);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final TravelWidgetSettingsDTO getSettings() {
            return this.settings;
        }

        @NotNull
        public final List<CommonInputV2DTO> component5() {
            return this.inputList;
        }

        /* renamed from: component6, reason: from getter */
        public final CellListBlockDTO getCellListBlock() {
            return this.cellListBlock;
        }

        /* renamed from: component7, reason: from getter */
        public final DisclaimerDTO getDisclaimer() {
            return this.disclaimer;
        }

        /* renamed from: component8, reason: from getter */
        public final int getGap() {
            return this.gap;
        }

        @NotNull
        public final FormBlockDTO copy(int id2, TextDTO title, TextDTO subtitle, TravelWidgetSettingsDTO settings, @NotNull List<CommonInputV2DTO> inputList, CellListBlockDTO cellListBlock, DisclaimerDTO disclaimer, int gap) {
            Intrinsics.checkNotNullParameter(inputList, "inputList");
            return new FormBlockDTO(id2, title, subtitle, settings, inputList, cellListBlock, disclaimer, gap);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormBlockDTO)) {
                return false;
            }
            FormBlockDTO formBlockDTO = (FormBlockDTO) other;
            return this.id == formBlockDTO.id && Intrinsics.d(this.title, formBlockDTO.title) && Intrinsics.d(this.subtitle, formBlockDTO.subtitle) && Intrinsics.d(this.settings, formBlockDTO.settings) && Intrinsics.d(this.inputList, formBlockDTO.inputList) && Intrinsics.d(this.cellListBlock, formBlockDTO.cellListBlock) && Intrinsics.d(this.disclaimer, formBlockDTO.disclaimer) && this.gap == formBlockDTO.gap;
        }

        public final CellListBlockDTO getCellListBlock() {
            return this.cellListBlock;
        }

        public final DisclaimerDTO getDisclaimer() {
            return this.disclaimer;
        }

        public final int getGap() {
            return this.gap;
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final List<CommonInputV2DTO> getInputList() {
            return this.inputList;
        }

        public final TravelWidgetSettingsDTO getSettings() {
            return this.settings;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.id) * 31;
            TextDTO textDTO = this.title;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.subtitle;
            int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            TravelWidgetSettingsDTO travelWidgetSettingsDTO = this.settings;
            int b11 = g.b((hashCode3 + (travelWidgetSettingsDTO == null ? 0 : travelWidgetSettingsDTO.hashCode())) * 31, 31, this.inputList);
            CellListBlockDTO cellListBlockDTO = this.cellListBlock;
            int hashCode4 = (b11 + (cellListBlockDTO == null ? 0 : cellListBlockDTO.hashCode())) * 31;
            DisclaimerDTO disclaimerDTO = this.disclaimer;
            return Integer.hashCode(this.gap) + ((hashCode4 + (disclaimerDTO != null ? disclaimerDTO.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            TravelWidgetSettingsDTO travelWidgetSettingsDTO = this.settings;
            List<CommonInputV2DTO> list = this.inputList;
            CellListBlockDTO cellListBlockDTO = this.cellListBlock;
            DisclaimerDTO disclaimerDTO = this.disclaimer;
            int i12 = this.gap;
            StringBuilder b11 = C4055a.b(textDTO, "FormBlockDTO(id=", ", title=", ", subtitle=", i11);
            b11.append(textDTO2);
            b11.append(", settings=");
            b11.append(travelWidgetSettingsDTO);
            b11.append(", inputList=");
            b11.append(list);
            b11.append(", cellListBlock=");
            b11.append(cellListBlockDTO);
            b11.append(", disclaimer=");
            b11.append(disclaimerDTO);
            b11.append(", gap=");
            b11.append(i12);
            b11.append(")");
            return b11.toString();
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$FormBlockDTO$CellListBlockDTO;", "", "settings", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "cellList", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "gap", "", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;Ljava/util/List;I)V", "getSettings", "()Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "getCellList", "()Ljava/util/List;", "getGap", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CellListBlockDTO {
            public static final int $stable = 8;

            @NotNull
            private final List<CellDTO> cellList;
            private final int gap;
            private final TravelWidgetSettingsDTO settings;

            public CellListBlockDTO(TravelWidgetSettingsDTO travelWidgetSettingsDTO, @NotNull List<CellDTO> cellList, int i11) {
                Intrinsics.checkNotNullParameter(cellList, "cellList");
                this.settings = travelWidgetSettingsDTO;
                this.cellList = cellList;
                this.gap = i11;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ CellListBlockDTO copy$default(CellListBlockDTO cellListBlockDTO, TravelWidgetSettingsDTO travelWidgetSettingsDTO, List list, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    travelWidgetSettingsDTO = cellListBlockDTO.settings;
                }
                if ((i12 & 2) != 0) {
                    list = cellListBlockDTO.cellList;
                }
                if ((i12 & 4) != 0) {
                    i11 = cellListBlockDTO.gap;
                }
                return cellListBlockDTO.copy(travelWidgetSettingsDTO, list, i11);
            }

            /* renamed from: component1, reason: from getter */
            public final TravelWidgetSettingsDTO getSettings() {
                return this.settings;
            }

            @NotNull
            public final List<CellDTO> component2() {
                return this.cellList;
            }

            /* renamed from: component3, reason: from getter */
            public final int getGap() {
                return this.gap;
            }

            @NotNull
            public final CellListBlockDTO copy(TravelWidgetSettingsDTO settings, @NotNull List<CellDTO> cellList, int gap) {
                Intrinsics.checkNotNullParameter(cellList, "cellList");
                return new CellListBlockDTO(settings, cellList, gap);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CellListBlockDTO)) {
                    return false;
                }
                CellListBlockDTO cellListBlockDTO = (CellListBlockDTO) other;
                return Intrinsics.d(this.settings, cellListBlockDTO.settings) && Intrinsics.d(this.cellList, cellListBlockDTO.cellList) && this.gap == cellListBlockDTO.gap;
            }

            @NotNull
            public final List<CellDTO> getCellList() {
                return this.cellList;
            }

            public final int getGap() {
                return this.gap;
            }

            public final TravelWidgetSettingsDTO getSettings() {
                return this.settings;
            }

            public int hashCode() {
                TravelWidgetSettingsDTO travelWidgetSettingsDTO = this.settings;
                return Integer.hashCode(this.gap) + g.b((travelWidgetSettingsDTO == null ? 0 : travelWidgetSettingsDTO.hashCode()) * 31, 31, this.cellList);
            }

            @NotNull
            public String toString() {
                TravelWidgetSettingsDTO travelWidgetSettingsDTO = this.settings;
                List<CellDTO> list = this.cellList;
                int i11 = this.gap;
                StringBuilder sb2 = new StringBuilder("CellListBlockDTO(settings=");
                sb2.append(travelWidgetSettingsDTO);
                sb2.append(", cellList=");
                sb2.append(list);
                sb2.append(", gap=");
                return K00.b.e(i11, ")", sb2);
            }

            public /* synthetic */ CellListBlockDTO(TravelWidgetSettingsDTO travelWidgetSettingsDTO, List list, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(travelWidgetSettingsDTO, list, (i12 & 4) != 0 ? 0 : i11);
            }
        }

        public FormBlockDTO(int i11, TextDTO textDTO, TextDTO textDTO2, TravelWidgetSettingsDTO travelWidgetSettingsDTO, List list, CellListBlockDTO cellListBlockDTO, DisclaimerDTO disclaimerDTO, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, textDTO, textDTO2, travelWidgetSettingsDTO, (i13 & 16) != 0 ? K.f71697a : list, cellListBlockDTO, disclaimerDTO, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 8 : i12);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$ButtonSectionDTO;", "", "settings", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "submitButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "additionalButton", "additionalIconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "agreement", "Lru/ozon/uni/atoms/data/text/TextDTO;", "isSticky", "", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Z)V", "getSettings", "()Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAdditionalButton", "getAdditionalIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getAgreement", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonSectionDTO {
        public static final int $stable = 8;
        private final ButtonV3DTO additionalButton;
        private final IconButtonV3DTO additionalIconButton;
        private final TextDTO agreement;
        private final boolean isSticky;
        private final TravelWidgetSettingsDTO settings;

        @NotNull
        private final ButtonV3DTO submitButton;

        public ButtonSectionDTO(TravelWidgetSettingsDTO travelWidgetSettingsDTO, @NotNull ButtonV3DTO submitButton, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, TextDTO textDTO, boolean z11) {
            Intrinsics.checkNotNullParameter(submitButton, "submitButton");
            this.settings = travelWidgetSettingsDTO;
            this.submitButton = submitButton;
            this.additionalButton = buttonV3DTO;
            this.additionalIconButton = iconButtonV3DTO;
            this.agreement = textDTO;
            this.isSticky = z11;
        }

        public static /* synthetic */ ButtonSectionDTO copy$default(ButtonSectionDTO buttonSectionDTO, TravelWidgetSettingsDTO travelWidgetSettingsDTO, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, IconButtonV3DTO iconButtonV3DTO, TextDTO textDTO, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                travelWidgetSettingsDTO = buttonSectionDTO.settings;
            }
            if ((i11 & 2) != 0) {
                buttonV3DTO = buttonSectionDTO.submitButton;
            }
            if ((i11 & 4) != 0) {
                buttonV3DTO2 = buttonSectionDTO.additionalButton;
            }
            if ((i11 & 8) != 0) {
                iconButtonV3DTO = buttonSectionDTO.additionalIconButton;
            }
            if ((i11 & 16) != 0) {
                textDTO = buttonSectionDTO.agreement;
            }
            if ((i11 & 32) != 0) {
                z11 = buttonSectionDTO.isSticky;
            }
            TextDTO textDTO2 = textDTO;
            boolean z12 = z11;
            return buttonSectionDTO.copy(travelWidgetSettingsDTO, buttonV3DTO, buttonV3DTO2, iconButtonV3DTO, textDTO2, z12);
        }

        /* renamed from: component1, reason: from getter */
        public final TravelWidgetSettingsDTO getSettings() {
            return this.settings;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ButtonV3DTO getSubmitButton() {
            return this.submitButton;
        }

        /* renamed from: component3, reason: from getter */
        public final ButtonV3DTO getAdditionalButton() {
            return this.additionalButton;
        }

        /* renamed from: component4, reason: from getter */
        public final IconButtonV3DTO getAdditionalIconButton() {
            return this.additionalIconButton;
        }

        /* renamed from: component5, reason: from getter */
        public final TextDTO getAgreement() {
            return this.agreement;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsSticky() {
            return this.isSticky;
        }

        @NotNull
        public final ButtonSectionDTO copy(TravelWidgetSettingsDTO settings, @NotNull ButtonV3DTO submitButton, ButtonV3DTO additionalButton, IconButtonV3DTO additionalIconButton, TextDTO agreement, boolean isSticky) {
            Intrinsics.checkNotNullParameter(submitButton, "submitButton");
            return new ButtonSectionDTO(settings, submitButton, additionalButton, additionalIconButton, agreement, isSticky);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonSectionDTO)) {
                return false;
            }
            ButtonSectionDTO buttonSectionDTO = (ButtonSectionDTO) other;
            return Intrinsics.d(this.settings, buttonSectionDTO.settings) && Intrinsics.d(this.submitButton, buttonSectionDTO.submitButton) && Intrinsics.d(this.additionalButton, buttonSectionDTO.additionalButton) && Intrinsics.d(this.additionalIconButton, buttonSectionDTO.additionalIconButton) && Intrinsics.d(this.agreement, buttonSectionDTO.agreement) && this.isSticky == buttonSectionDTO.isSticky;
        }

        public final ButtonV3DTO getAdditionalButton() {
            return this.additionalButton;
        }

        public final IconButtonV3DTO getAdditionalIconButton() {
            return this.additionalIconButton;
        }

        public final TextDTO getAgreement() {
            return this.agreement;
        }

        public final TravelWidgetSettingsDTO getSettings() {
            return this.settings;
        }

        @NotNull
        public final ButtonV3DTO getSubmitButton() {
            return this.submitButton;
        }

        public int hashCode() {
            TravelWidgetSettingsDTO travelWidgetSettingsDTO = this.settings;
            int c11 = C2859b.c(this.submitButton, (travelWidgetSettingsDTO == null ? 0 : travelWidgetSettingsDTO.hashCode()) * 31, 31);
            ButtonV3DTO buttonV3DTO = this.additionalButton;
            int hashCode = (c11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
            IconButtonV3DTO iconButtonV3DTO = this.additionalIconButton;
            int hashCode2 = (hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
            TextDTO textDTO = this.agreement;
            return Boolean.hashCode(this.isSticky) + ((hashCode2 + (textDTO != null ? textDTO.hashCode() : 0)) * 31);
        }

        public final boolean isSticky() {
            return this.isSticky;
        }

        @NotNull
        public String toString() {
            return "ButtonSectionDTO(settings=" + this.settings + ", submitButton=" + this.submitButton + ", additionalButton=" + this.additionalButton + ", additionalIconButton=" + this.additionalIconButton + ", agreement=" + this.agreement + ", isSticky=" + this.isSticky + ")";
        }

        public /* synthetic */ ButtonSectionDTO(TravelWidgetSettingsDTO travelWidgetSettingsDTO, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, IconButtonV3DTO iconButtonV3DTO, TextDTO textDTO, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(travelWidgetSettingsDTO, buttonV3DTO, buttonV3DTO2, iconButtonV3DTO, textDTO, (i11 & 32) != 0 ? false : z11);
        }
    }

    public /* synthetic */ B2bFormDTO(HeaderSectionDTO headerSectionDTO, List list, ButtonSectionDTO buttonSectionDTO, int i11, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(headerSectionDTO, list, buttonSectionDTO, (i12 & 8) != 0 ? 0 : i11, map);
    }
}
