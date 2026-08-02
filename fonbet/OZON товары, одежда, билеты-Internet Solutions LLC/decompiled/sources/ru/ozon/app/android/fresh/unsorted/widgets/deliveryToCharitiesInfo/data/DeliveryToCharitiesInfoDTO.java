package ru.ozon.app.android.fresh.unsorted.widgets.deliveryToCharitiesInfo.data;

import D3.g;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001&BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryToCharitiesInfo/data/DeliveryToCharitiesInfoDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "instructions", "", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryToCharitiesInfo/data/DeliveryToCharitiesInfoDTO$InstructionDTO;", "agreement", "about", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getInstructions", "()Ljava/util/List;", "getAgreement", "getAbout", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "InstructionDTO", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DeliveryToCharitiesInfoDTO {
    public static final int $stable = 8;

    @NotNull
    private final TextDTO about;

    @NotNull
    private final TextDTO agreement;

    @NotNull
    private final List<InstructionDTO> instructions;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryToCharitiesInfo/data/DeliveryToCharitiesInfoDTO$InstructionDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InstructionDTO {
        public static final int $stable = 0;
        private final ButtonV3DTO button;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public InstructionDTO(@NotNull TextDTO title, TextDTO textDTO, ButtonV3DTO buttonV3DTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.subtitle = textDTO;
            this.button = buttonV3DTO;
        }

        public static /* synthetic */ InstructionDTO copy$default(InstructionDTO instructionDTO, TextDTO textDTO, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = instructionDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = instructionDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                buttonV3DTO = instructionDTO.button;
            }
            return instructionDTO.copy(textDTO, textDTO2, buttonV3DTO);
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

        /* renamed from: component3, reason: from getter */
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        @NotNull
        public final InstructionDTO copy(@NotNull TextDTO title, TextDTO subtitle, ButtonV3DTO button) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new InstructionDTO(title, subtitle, button);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InstructionDTO)) {
                return false;
            }
            InstructionDTO instructionDTO = (InstructionDTO) other;
            return Intrinsics.d(this.title, instructionDTO.title) && Intrinsics.d(this.subtitle, instructionDTO.subtitle) && Intrinsics.d(this.button, instructionDTO.button);
        }

        public final ButtonV3DTO getButton() {
            return this.button;
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
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            ButtonV3DTO buttonV3DTO = this.button;
            return hashCode2 + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            ButtonV3DTO buttonV3DTO = this.button;
            StringBuilder g10 = g.g("InstructionDTO(title=", textDTO, ", subtitle=", textDTO2, ", button=");
            g10.append(buttonV3DTO);
            g10.append(")");
            return g10.toString();
        }
    }

    public DeliveryToCharitiesInfoDTO(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull List<InstructionDTO> instructions, @NotNull TextDTO agreement, @NotNull TextDTO about, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        Intrinsics.checkNotNullParameter(agreement, "agreement");
        Intrinsics.checkNotNullParameter(about, "about");
        this.title = title;
        this.subtitle = subtitle;
        this.instructions = instructions;
        this.agreement = agreement;
        this.about = about;
        this.trackingInfo = map;
    }

    public static /* synthetic */ DeliveryToCharitiesInfoDTO copy$default(DeliveryToCharitiesInfoDTO deliveryToCharitiesInfoDTO, TextDTO textDTO, TextDTO textDTO2, List list, TextDTO textDTO3, TextDTO textDTO4, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = deliveryToCharitiesInfoDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = deliveryToCharitiesInfoDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            list = deliveryToCharitiesInfoDTO.instructions;
        }
        if ((i11 & 8) != 0) {
            textDTO3 = deliveryToCharitiesInfoDTO.agreement;
        }
        if ((i11 & 16) != 0) {
            textDTO4 = deliveryToCharitiesInfoDTO.about;
        }
        if ((i11 & 32) != 0) {
            map = deliveryToCharitiesInfoDTO.trackingInfo;
        }
        TextDTO textDTO5 = textDTO4;
        Map map2 = map;
        return deliveryToCharitiesInfoDTO.copy(textDTO, textDTO2, list, textDTO3, textDTO5, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<InstructionDTO> component3() {
        return this.instructions;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextDTO getAgreement() {
        return this.agreement;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final TextDTO getAbout() {
        return this.about;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final DeliveryToCharitiesInfoDTO copy(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull List<InstructionDTO> instructions, @NotNull TextDTO agreement, @NotNull TextDTO about, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        Intrinsics.checkNotNullParameter(agreement, "agreement");
        Intrinsics.checkNotNullParameter(about, "about");
        return new DeliveryToCharitiesInfoDTO(title, subtitle, instructions, agreement, about, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryToCharitiesInfoDTO)) {
            return false;
        }
        DeliveryToCharitiesInfoDTO deliveryToCharitiesInfoDTO = (DeliveryToCharitiesInfoDTO) other;
        return Intrinsics.d(this.title, deliveryToCharitiesInfoDTO.title) && Intrinsics.d(this.subtitle, deliveryToCharitiesInfoDTO.subtitle) && Intrinsics.d(this.instructions, deliveryToCharitiesInfoDTO.instructions) && Intrinsics.d(this.agreement, deliveryToCharitiesInfoDTO.agreement) && Intrinsics.d(this.about, deliveryToCharitiesInfoDTO.about) && Intrinsics.d(this.trackingInfo, deliveryToCharitiesInfoDTO.trackingInfo);
    }

    @NotNull
    public final TextDTO getAbout() {
        return this.about;
    }

    @NotNull
    public final TextDTO getAgreement() {
        return this.agreement;
    }

    @NotNull
    public final List<InstructionDTO> getInstructions() {
        return this.instructions;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = b.a(this.about, b.a(this.agreement, G.g.b(b.a(this.subtitle, this.title.hashCode() * 31, 31), 31, this.instructions), 31), 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        List<InstructionDTO> list = this.instructions;
        TextDTO textDTO3 = this.agreement;
        TextDTO textDTO4 = this.about;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = g.g("DeliveryToCharitiesInfoDTO(title=", textDTO, ", subtitle=", textDTO2, ", instructions=");
        g10.append(list);
        g10.append(", agreement=");
        g10.append(textDTO3);
        g10.append(", about=");
        g10.append(textDTO4);
        g10.append(", trackingInfo=");
        g10.append(map);
        g10.append(")");
        return g10.toString();
    }
}
