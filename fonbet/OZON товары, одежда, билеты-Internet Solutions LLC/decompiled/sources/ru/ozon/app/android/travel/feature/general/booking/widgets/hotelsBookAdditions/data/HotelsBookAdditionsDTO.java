package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.data;

import G.g;
import J0.C3349u1;
import Kk.C3532b;
import Ns.b;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v1.CommonInputDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001+BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0003Jc\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0019R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/data/HotelsBookAdditionsDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "collapsedIconButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "expandedIconButton", "isOpen", "", "fields", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/data/HotelsBookAdditionsDTO$FieldDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;ZLjava/util/List;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getCollapsedIconButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getExpandedIconButton", "()Z", "getFields", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "FieldDTO", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HotelsBookAdditionsDTO {

    @NotNull
    private final ButtonV3Atom.SmallIconButton collapsedIconButton;

    @NotNull
    private final ButtonV3Atom.SmallIconButton expandedIconButton;

    @NotNull
    private final List<FieldDTO> fields;
    private final boolean isOpen;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/data/HotelsBookAdditionsDTO$FieldDTO;", "", "input", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;", "subtext", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getInput", "()Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;", "getSubtext", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FieldDTO {

        @NotNull
        private final CommonInputDTO input;
        private final TextDTO subtext;

        public FieldDTO(@NotNull CommonInputDTO input, TextDTO textDTO) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.input = input;
            this.subtext = textDTO;
        }

        public static /* synthetic */ FieldDTO copy$default(FieldDTO fieldDTO, CommonInputDTO commonInputDTO, TextDTO textDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                commonInputDTO = fieldDTO.input;
            }
            if ((i11 & 2) != 0) {
                textDTO = fieldDTO.subtext;
            }
            return fieldDTO.copy(commonInputDTO, textDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CommonInputDTO getInput() {
            return this.input;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtext() {
            return this.subtext;
        }

        @NotNull
        public final FieldDTO copy(@NotNull CommonInputDTO input, TextDTO subtext) {
            Intrinsics.checkNotNullParameter(input, "input");
            return new FieldDTO(input, subtext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FieldDTO)) {
                return false;
            }
            FieldDTO fieldDTO = (FieldDTO) other;
            return Intrinsics.d(this.input, fieldDTO.input) && Intrinsics.d(this.subtext, fieldDTO.subtext);
        }

        @NotNull
        public final CommonInputDTO getInput() {
            return this.input;
        }

        public final TextDTO getSubtext() {
            return this.subtext;
        }

        public int hashCode() {
            int hashCode = this.input.hashCode() * 31;
            TextDTO textDTO = this.subtext;
            return hashCode + (textDTO == null ? 0 : textDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "FieldDTO(input=" + this.input + ", subtext=" + this.subtext + ")";
        }
    }

    public HotelsBookAdditionsDTO(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull ButtonV3Atom.SmallIconButton collapsedIconButton, @NotNull ButtonV3Atom.SmallIconButton expandedIconButton, boolean z11, @NotNull List<FieldDTO> fields, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(collapsedIconButton, "collapsedIconButton");
        Intrinsics.checkNotNullParameter(expandedIconButton, "expandedIconButton");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.title = title;
        this.subtitle = subtitle;
        this.collapsedIconButton = collapsedIconButton;
        this.expandedIconButton = expandedIconButton;
        this.isOpen = z11;
        this.fields = fields;
        this.trackingInfo = map;
    }

    public static /* synthetic */ HotelsBookAdditionsDTO copy$default(HotelsBookAdditionsDTO hotelsBookAdditionsDTO, TextDTO textDTO, TextDTO textDTO2, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallIconButton smallIconButton2, boolean z11, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = hotelsBookAdditionsDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = hotelsBookAdditionsDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            smallIconButton = hotelsBookAdditionsDTO.collapsedIconButton;
        }
        if ((i11 & 8) != 0) {
            smallIconButton2 = hotelsBookAdditionsDTO.expandedIconButton;
        }
        if ((i11 & 16) != 0) {
            z11 = hotelsBookAdditionsDTO.isOpen;
        }
        if ((i11 & 32) != 0) {
            list = hotelsBookAdditionsDTO.fields;
        }
        if ((i11 & 64) != 0) {
            map = hotelsBookAdditionsDTO.trackingInfo;
        }
        List list2 = list;
        Map map2 = map;
        boolean z12 = z11;
        ButtonV3Atom.SmallIconButton smallIconButton3 = smallIconButton;
        return hotelsBookAdditionsDTO.copy(textDTO, textDTO2, smallIconButton3, smallIconButton2, z12, list2, map2);
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
    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getCollapsedIconButton() {
        return this.collapsedIconButton;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getExpandedIconButton() {
        return this.expandedIconButton;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsOpen() {
        return this.isOpen;
    }

    @NotNull
    public final List<FieldDTO> component6() {
        return this.fields;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final HotelsBookAdditionsDTO copy(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull ButtonV3Atom.SmallIconButton collapsedIconButton, @NotNull ButtonV3Atom.SmallIconButton expandedIconButton, boolean isOpen, @NotNull List<FieldDTO> fields, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(collapsedIconButton, "collapsedIconButton");
        Intrinsics.checkNotNullParameter(expandedIconButton, "expandedIconButton");
        Intrinsics.checkNotNullParameter(fields, "fields");
        return new HotelsBookAdditionsDTO(title, subtitle, collapsedIconButton, expandedIconButton, isOpen, fields, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsBookAdditionsDTO)) {
            return false;
        }
        HotelsBookAdditionsDTO hotelsBookAdditionsDTO = (HotelsBookAdditionsDTO) other;
        return Intrinsics.d(this.title, hotelsBookAdditionsDTO.title) && Intrinsics.d(this.subtitle, hotelsBookAdditionsDTO.subtitle) && Intrinsics.d(this.collapsedIconButton, hotelsBookAdditionsDTO.collapsedIconButton) && Intrinsics.d(this.expandedIconButton, hotelsBookAdditionsDTO.expandedIconButton) && this.isOpen == hotelsBookAdditionsDTO.isOpen && Intrinsics.d(this.fields, hotelsBookAdditionsDTO.fields) && Intrinsics.d(this.trackingInfo, hotelsBookAdditionsDTO.trackingInfo);
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getCollapsedIconButton() {
        return this.collapsedIconButton;
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getExpandedIconButton() {
        return this.expandedIconButton;
    }

    @NotNull
    public final List<FieldDTO> getFields() {
        return this.fields;
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
        int b11 = g.b(C3532b.a(C3349u1.d(this.expandedIconButton, C3349u1.d(this.collapsedIconButton, b.a(this.subtitle, this.title.hashCode() * 31, 31), 31), 31), 31, this.isOpen), 31, this.fields);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map == null ? 0 : map.hashCode());
    }

    public final boolean isOpen() {
        return this.isOpen;
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        ButtonV3Atom.SmallIconButton smallIconButton = this.collapsedIconButton;
        ButtonV3Atom.SmallIconButton smallIconButton2 = this.expandedIconButton;
        boolean z11 = this.isOpen;
        List<FieldDTO> list = this.fields;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = D3.g.g("HotelsBookAdditionsDTO(title=", textDTO, ", subtitle=", textDTO2, ", collapsedIconButton=");
        g10.append(smallIconButton);
        g10.append(", expandedIconButton=");
        g10.append(smallIconButton2);
        g10.append(", isOpen=");
        g10.append(z11);
        g10.append(", fields=");
        g10.append(list);
        g10.append(", trackingInfo=");
        return P.f(g10, map, ")");
    }

    public /* synthetic */ HotelsBookAdditionsDTO(TextDTO textDTO, TextDTO textDTO2, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallIconButton smallIconButton2, boolean z11, List list, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, textDTO2, smallIconButton, smallIconButton2, (i11 & 16) != 0 ? false : z11, list, map);
    }
}
