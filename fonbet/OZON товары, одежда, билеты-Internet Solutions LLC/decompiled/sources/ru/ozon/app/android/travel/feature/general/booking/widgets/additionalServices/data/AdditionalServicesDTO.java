package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.data;

import B0.C2454a;
import B90.C2616s;
import G.g;
import Ih.a;
import Ns.b;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.counterInput.v2.CounterInputV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0001)BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0003J]\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\tHÖ\u0001J\t\u0010(\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/data/AdditionalServicesDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "cells", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/data/AdditionalServicesDTO$CellDTO;", "cellsCount", "", "showMoreButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;ILru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getCells", "()Ljava/util/List;", "getCellsCount", "()I", "getShowMoreButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "CellDTO", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AdditionalServicesDTO {

    @NotNull
    private final List<CellDTO> cells;
    private final int cellsCount;
    private final ButtonV3DTO showMoreButton;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00019Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0001HÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010%J\u0017\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012HÆ\u0003J\u0084\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\u00102\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006:"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/data/AdditionalServicesDTO$CellDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "titleInfoButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "subtitle", "control", "controlAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "tariffs", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/data/AdditionalServicesDTO$CellDTO$TariffDTO;", "hideSeparator", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Object;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/Map;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitleInfoButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getSubtitle", "getControl", "()Ljava/lang/Object;", "getControlAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTariffs", "()Ljava/util/List;", "getHideSeparator", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Object;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/data/AdditionalServicesDTO$CellDTO;", "equals", "other", "hashCode", "", "toString", "TariffDTO", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class CellDTO {

        @NotNull
        private final Object control;

        @NotNull
        private final AtomActionDTO controlAction;
        private final Boolean hideSeparator;

        @NotNull
        private final ImageDTO image;
        private final TextDTO subtitle;
        private final List<TariffDTO> tariffs;

        @NotNull
        private final TextDTO title;
        private final IconButtonV3DTO titleInfoButton;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/data/AdditionalServicesDTO$CellDTO$TariffDTO;", "", "aspect", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getAspect", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TariffDTO {

            @NotNull
            private final AspectDTO aspect;
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;

            public TariffDTO(@NotNull AspectDTO aspect, @NotNull TextDTO title, TextDTO textDTO) {
                Intrinsics.checkNotNullParameter(aspect, "aspect");
                Intrinsics.checkNotNullParameter(title, "title");
                this.aspect = aspect;
                this.title = title;
                this.subtitle = textDTO;
            }

            public static /* synthetic */ TariffDTO copy$default(TariffDTO tariffDTO, AspectDTO aspectDTO, TextDTO textDTO, TextDTO textDTO2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    aspectDTO = tariffDTO.aspect;
                }
                if ((i11 & 2) != 0) {
                    textDTO = tariffDTO.title;
                }
                if ((i11 & 4) != 0) {
                    textDTO2 = tariffDTO.subtitle;
                }
                return tariffDTO.copy(aspectDTO, textDTO, textDTO2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final AspectDTO getAspect() {
                return this.aspect;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            /* renamed from: component3, reason: from getter */
            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TariffDTO copy(@NotNull AspectDTO aspect, @NotNull TextDTO title, TextDTO subtitle) {
                Intrinsics.checkNotNullParameter(aspect, "aspect");
                Intrinsics.checkNotNullParameter(title, "title");
                return new TariffDTO(aspect, title, subtitle);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TariffDTO)) {
                    return false;
                }
                TariffDTO tariffDTO = (TariffDTO) other;
                return Intrinsics.d(this.aspect, tariffDTO.aspect) && Intrinsics.d(this.title, tariffDTO.title) && Intrinsics.d(this.subtitle, tariffDTO.subtitle);
            }

            @NotNull
            public final AspectDTO getAspect() {
                return this.aspect;
            }

            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                int a11 = b.a(this.title, this.aspect.hashCode() * 31, 31);
                TextDTO textDTO = this.subtitle;
                return a11 + (textDTO == null ? 0 : textDTO.hashCode());
            }

            @NotNull
            public String toString() {
                AspectDTO aspectDTO = this.aspect;
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                StringBuilder sb2 = new StringBuilder("TariffDTO(aspect=");
                sb2.append(aspectDTO);
                sb2.append(", title=");
                sb2.append(textDTO);
                sb2.append(", subtitle=");
                return Tl.b.e(sb2, textDTO2, ")");
            }
        }

        public CellDTO(@NotNull ImageDTO image, @NotNull TextDTO title, IconButtonV3DTO iconButtonV3DTO, TextDTO textDTO, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "toggle", type = ToggleDTO.class), @ProtoOneOfSignature(name = "counter", type = CounterInputV2DTO.class)}) @NotNull @ProtoOneOf(label = "type") Object control, @NotNull AtomActionDTO controlAction, List<TariffDTO> list, Boolean bool, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(control, "control");
            Intrinsics.checkNotNullParameter(controlAction, "controlAction");
            this.image = image;
            this.title = title;
            this.titleInfoButton = iconButtonV3DTO;
            this.subtitle = textDTO;
            this.control = control;
            this.controlAction = controlAction;
            this.tariffs = list;
            this.hideSeparator = bool;
            this.trackingInfo = map;
        }

        public static /* synthetic */ CellDTO copy$default(CellDTO cellDTO, ImageDTO imageDTO, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, TextDTO textDTO2, Object obj, AtomActionDTO atomActionDTO, List list, Boolean bool, Map map, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                imageDTO = cellDTO.image;
            }
            if ((i11 & 2) != 0) {
                textDTO = cellDTO.title;
            }
            if ((i11 & 4) != 0) {
                iconButtonV3DTO = cellDTO.titleInfoButton;
            }
            if ((i11 & 8) != 0) {
                textDTO2 = cellDTO.subtitle;
            }
            if ((i11 & 16) != 0) {
                obj = cellDTO.control;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = cellDTO.controlAction;
            }
            if ((i11 & 64) != 0) {
                list = cellDTO.tariffs;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                bool = cellDTO.hideSeparator;
            }
            if ((i11 & 256) != 0) {
                map = cellDTO.trackingInfo;
            }
            Boolean bool2 = bool;
            Map map2 = map;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            List list2 = list;
            Object obj3 = obj;
            IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
            return cellDTO.copy(imageDTO, textDTO, iconButtonV3DTO2, textDTO2, obj3, atomActionDTO2, list2, bool2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final IconButtonV3DTO getTitleInfoButton() {
            return this.titleInfoButton;
        }

        /* renamed from: component4, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final Object getControl() {
            return this.control;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getControlAction() {
            return this.controlAction;
        }

        public final List<TariffDTO> component7() {
            return this.tariffs;
        }

        /* renamed from: component8, reason: from getter */
        public final Boolean getHideSeparator() {
            return this.hideSeparator;
        }

        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.trackingInfo;
        }

        @NotNull
        public final CellDTO copy(@NotNull ImageDTO image, @NotNull TextDTO title, IconButtonV3DTO titleInfoButton, TextDTO subtitle, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "toggle", type = ToggleDTO.class), @ProtoOneOfSignature(name = "counter", type = CounterInputV2DTO.class)}) @NotNull @ProtoOneOf(label = "type") Object control, @NotNull AtomActionDTO controlAction, List<TariffDTO> tariffs, Boolean hideSeparator, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(control, "control");
            Intrinsics.checkNotNullParameter(controlAction, "controlAction");
            return new CellDTO(image, title, titleInfoButton, subtitle, control, controlAction, tariffs, hideSeparator, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellDTO)) {
                return false;
            }
            CellDTO cellDTO = (CellDTO) other;
            return Intrinsics.d(this.image, cellDTO.image) && Intrinsics.d(this.title, cellDTO.title) && Intrinsics.d(this.titleInfoButton, cellDTO.titleInfoButton) && Intrinsics.d(this.subtitle, cellDTO.subtitle) && Intrinsics.d(this.control, cellDTO.control) && Intrinsics.d(this.controlAction, cellDTO.controlAction) && Intrinsics.d(this.tariffs, cellDTO.tariffs) && Intrinsics.d(this.hideSeparator, cellDTO.hideSeparator) && Intrinsics.d(this.trackingInfo, cellDTO.trackingInfo);
        }

        @NotNull
        public final Object getControl() {
            return this.control;
        }

        @NotNull
        public final AtomActionDTO getControlAction() {
            return this.controlAction;
        }

        public final Boolean getHideSeparator() {
            return this.hideSeparator;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final List<TariffDTO> getTariffs() {
            return this.tariffs;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final IconButtonV3DTO getTitleInfoButton() {
            return this.titleInfoButton;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = b.a(this.title, this.image.hashCode() * 31, 31);
            IconButtonV3DTO iconButtonV3DTO = this.titleInfoButton;
            int hashCode = (a11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
            TextDTO textDTO = this.subtitle;
            int b11 = a.b(this.controlAction, H00.a.c((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.control), 31);
            List<TariffDTO> list = this.tariffs;
            int hashCode2 = (b11 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.hideSeparator;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.image;
            TextDTO textDTO = this.title;
            IconButtonV3DTO iconButtonV3DTO = this.titleInfoButton;
            TextDTO textDTO2 = this.subtitle;
            Object obj = this.control;
            AtomActionDTO atomActionDTO = this.controlAction;
            List<TariffDTO> list = this.tariffs;
            Boolean bool = this.hideSeparator;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C2616s.d("CellDTO(image=", imageDTO, ", title=", textDTO, ", titleInfoButton=");
            d11.append(iconButtonV3DTO);
            d11.append(", subtitle=");
            d11.append(textDTO2);
            d11.append(", control=");
            d11.append(obj);
            d11.append(", controlAction=");
            d11.append(atomActionDTO);
            d11.append(", tariffs=");
            d11.append(list);
            d11.append(", hideSeparator=");
            d11.append(bool);
            d11.append(", trackingInfo=");
            return P.f(d11, map, ")");
        }
    }

    public AdditionalServicesDTO(@NotNull TextDTO title, TextDTO textDTO, @NotNull List<CellDTO> cells, int i11, ButtonV3DTO buttonV3DTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.title = title;
        this.subtitle = textDTO;
        this.cells = cells;
        this.cellsCount = i11;
        this.showMoreButton = buttonV3DTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ AdditionalServicesDTO copy$default(AdditionalServicesDTO additionalServicesDTO, TextDTO textDTO, TextDTO textDTO2, List list, int i11, ButtonV3DTO buttonV3DTO, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            textDTO = additionalServicesDTO.title;
        }
        if ((i12 & 2) != 0) {
            textDTO2 = additionalServicesDTO.subtitle;
        }
        if ((i12 & 4) != 0) {
            list = additionalServicesDTO.cells;
        }
        if ((i12 & 8) != 0) {
            i11 = additionalServicesDTO.cellsCount;
        }
        if ((i12 & 16) != 0) {
            buttonV3DTO = additionalServicesDTO.showMoreButton;
        }
        if ((i12 & 32) != 0) {
            map = additionalServicesDTO.trackingInfo;
        }
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        Map map2 = map;
        return additionalServicesDTO.copy(textDTO, textDTO2, list, i11, buttonV3DTO2, map2);
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
    public final List<CellDTO> component3() {
        return this.cells;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCellsCount() {
        return this.cellsCount;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonV3DTO getShowMoreButton() {
        return this.showMoreButton;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final AdditionalServicesDTO copy(@NotNull TextDTO title, TextDTO subtitle, @NotNull List<CellDTO> cells, int cellsCount, ButtonV3DTO showMoreButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cells, "cells");
        return new AdditionalServicesDTO(title, subtitle, cells, cellsCount, showMoreButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalServicesDTO)) {
            return false;
        }
        AdditionalServicesDTO additionalServicesDTO = (AdditionalServicesDTO) other;
        return Intrinsics.d(this.title, additionalServicesDTO.title) && Intrinsics.d(this.subtitle, additionalServicesDTO.subtitle) && Intrinsics.d(this.cells, additionalServicesDTO.cells) && this.cellsCount == additionalServicesDTO.cellsCount && Intrinsics.d(this.showMoreButton, additionalServicesDTO.showMoreButton) && Intrinsics.d(this.trackingInfo, additionalServicesDTO.trackingInfo);
    }

    @NotNull
    public final List<CellDTO> getCells() {
        return this.cells;
    }

    public final int getCellsCount() {
        return this.cellsCount;
    }

    public final ButtonV3DTO getShowMoreButton() {
        return this.showMoreButton;
    }

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
        int hashCode = this.title.hashCode() * 31;
        TextDTO textDTO = this.subtitle;
        int a11 = C2454a.a(this.cellsCount, g.b((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.cells), 31);
        ButtonV3DTO buttonV3DTO = this.showMoreButton;
        int hashCode2 = (a11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        List<CellDTO> list = this.cells;
        int i11 = this.cellsCount;
        ButtonV3DTO buttonV3DTO = this.showMoreButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = D3.g.g("AdditionalServicesDTO(title=", textDTO, ", subtitle=", textDTO2, ", cells=");
        g10.append(list);
        g10.append(", cellsCount=");
        g10.append(i11);
        g10.append(", showMoreButton=");
        g10.append(buttonV3DTO);
        g10.append(", trackingInfo=");
        g10.append(map);
        g10.append(")");
        return g10.toString();
    }
}
