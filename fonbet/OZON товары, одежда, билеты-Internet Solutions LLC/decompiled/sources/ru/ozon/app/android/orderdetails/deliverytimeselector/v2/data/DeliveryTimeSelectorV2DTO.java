package ru.ozon.app.android.orderdetails.deliverytimeselector.v2.data;

import Fj.c;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001bB/\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/DeliveryTimeSelectorV2DTO;", "", "deliveryDates", "", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/DeliveryTimeSelectorV2DTO$DeliveryDateDTO;", "timeSlots", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getDeliveryDates", "()Ljava/util/List;", "getTimeSlots", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "DeliveryDateDTO", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeliveryTimeSelectorV2DTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3DTO button;
    private final List<DeliveryDateDTO> deliveryDates;
    private final List<CellDTO> timeSlots;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/DeliveryTimeSelectorV2DTO$DeliveryDateDTO;", "", "wrapper", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getWrapper", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeliveryDateDTO {
        public static final int $stable = AspectDTO.$stable;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        @NotNull
        private final AspectDTO wrapper;

        public DeliveryDateDTO(@NotNull AspectDTO wrapper, @NotNull TextDTO title, @NotNull TextDTO subtitle) {
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.wrapper = wrapper;
            this.title = title;
            this.subtitle = subtitle;
        }

        public static /* synthetic */ DeliveryDateDTO copy$default(DeliveryDateDTO deliveryDateDTO, AspectDTO aspectDTO, TextDTO textDTO, TextDTO textDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                aspectDTO = deliveryDateDTO.wrapper;
            }
            if ((i11 & 2) != 0) {
                textDTO = deliveryDateDTO.title;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = deliveryDateDTO.subtitle;
            }
            return deliveryDateDTO.copy(aspectDTO, textDTO, textDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AspectDTO getWrapper() {
            return this.wrapper;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final DeliveryDateDTO copy(@NotNull AspectDTO wrapper, @NotNull TextDTO title, @NotNull TextDTO subtitle) {
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new DeliveryDateDTO(wrapper, title, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeliveryDateDTO)) {
                return false;
            }
            DeliveryDateDTO deliveryDateDTO = (DeliveryDateDTO) other;
            return Intrinsics.d(this.wrapper, deliveryDateDTO.wrapper) && Intrinsics.d(this.title, deliveryDateDTO.title) && Intrinsics.d(this.subtitle, deliveryDateDTO.subtitle);
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final AspectDTO getWrapper() {
            return this.wrapper;
        }

        public int hashCode() {
            return this.subtitle.hashCode() + b.a(this.title, this.wrapper.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            AspectDTO aspectDTO = this.wrapper;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            StringBuilder sb2 = new StringBuilder("DeliveryDateDTO(wrapper=");
            sb2.append(aspectDTO);
            sb2.append(", title=");
            sb2.append(textDTO);
            sb2.append(", subtitle=");
            return Tl.b.e(sb2, textDTO2, ")");
        }
    }

    public DeliveryTimeSelectorV2DTO(List<DeliveryDateDTO> list, List<CellDTO> list2, @NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.deliveryDates = list;
        this.timeSlots = list2;
        this.button = button;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryTimeSelectorV2DTO copy$default(DeliveryTimeSelectorV2DTO deliveryTimeSelectorV2DTO, List list, List list2, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = deliveryTimeSelectorV2DTO.deliveryDates;
        }
        if ((i11 & 2) != 0) {
            list2 = deliveryTimeSelectorV2DTO.timeSlots;
        }
        if ((i11 & 4) != 0) {
            buttonV3DTO = deliveryTimeSelectorV2DTO.button;
        }
        return deliveryTimeSelectorV2DTO.copy(list, list2, buttonV3DTO);
    }

    public final List<DeliveryDateDTO> component1() {
        return this.deliveryDates;
    }

    public final List<CellDTO> component2() {
        return this.timeSlots;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final DeliveryTimeSelectorV2DTO copy(List<DeliveryDateDTO> deliveryDates, List<CellDTO> timeSlots, @NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(button, "button");
        return new DeliveryTimeSelectorV2DTO(deliveryDates, timeSlots, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryTimeSelectorV2DTO)) {
            return false;
        }
        DeliveryTimeSelectorV2DTO deliveryTimeSelectorV2DTO = (DeliveryTimeSelectorV2DTO) other;
        return Intrinsics.d(this.deliveryDates, deliveryTimeSelectorV2DTO.deliveryDates) && Intrinsics.d(this.timeSlots, deliveryTimeSelectorV2DTO.timeSlots) && Intrinsics.d(this.button, deliveryTimeSelectorV2DTO.button);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final List<DeliveryDateDTO> getDeliveryDates() {
        return this.deliveryDates;
    }

    public final List<CellDTO> getTimeSlots() {
        return this.timeSlots;
    }

    public int hashCode() {
        List<DeliveryDateDTO> list = this.deliveryDates;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<CellDTO> list2 = this.timeSlots;
        return this.button.hashCode() + ((hashCode + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        List<DeliveryDateDTO> list = this.deliveryDates;
        List<CellDTO> list2 = this.timeSlots;
        ButtonV3DTO buttonV3DTO = this.button;
        StringBuilder d11 = c.d("DeliveryTimeSelectorV2DTO(deliveryDates=", list, ", timeSlots=", ", button=", list2);
        d11.append(buttonV3DTO);
        d11.append(")");
        return d11.toString();
    }
}
