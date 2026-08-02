package ru.ozon.app.android.travel.feature.general.common.widgets.travelImage.v1.data;

import B3.p;
import GR.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001fB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelImage/v1/data/TravelImageDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "backgroundColor", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "margins", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelImage/v1/data/TravelImageDTO$ElementMargins;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/travel/feature/general/common/widgets/travelImage/v1/data/TravelImageDTO$ElementMargins;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getMargins", "()Lru/ozon/app/android/travel/feature/general/common/widgets/travelImage/v1/data/TravelImageDTO$ElementMargins;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ElementMargins", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelImageDTO {
    public static final int $stable = 0;
    private final String backgroundColor;
    private final CommonControlSettings common;

    @NotNull
    private final ImageDTO image;

    @NotNull
    private final ElementMargins margins;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelImage/v1/data/TravelImageDTO$ElementMargins;", "", "start", "Lru/ozon/uni/atoms/data/common/Paddings;", "end", "top", "bottom", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getStart", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getEnd", "getTop", "getBottom", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ElementMargins {
        public static final int $stable = 0;

        @EnumNullFallback
        @NotNull
        private final Paddings bottom;

        @EnumNullFallback
        @NotNull
        private final Paddings end;

        @EnumNullFallback
        @NotNull
        private final Paddings start;

        @EnumNullFallback
        @NotNull
        private final Paddings top;

        public ElementMargins() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ ElementMargins copy$default(ElementMargins elementMargins, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = elementMargins.start;
            }
            if ((i11 & 2) != 0) {
                paddings2 = elementMargins.end;
            }
            if ((i11 & 4) != 0) {
                paddings3 = elementMargins.top;
            }
            if ((i11 & 8) != 0) {
                paddings4 = elementMargins.bottom;
            }
            return elementMargins.copy(paddings, paddings2, paddings3, paddings4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getStart() {
            return this.start;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getEnd() {
            return this.end;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final ElementMargins copy(@NotNull Paddings start, @NotNull Paddings end, @NotNull Paddings top, @NotNull Paddings bottom) {
            Intrinsics.checkNotNullParameter(start, "start");
            Intrinsics.checkNotNullParameter(end, "end");
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            return new ElementMargins(start, end, top, bottom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ElementMargins)) {
                return false;
            }
            ElementMargins elementMargins = (ElementMargins) other;
            return this.start == elementMargins.start && this.end == elementMargins.end && this.top == elementMargins.top && this.bottom == elementMargins.bottom;
        }

        @NotNull
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final Paddings getEnd() {
            return this.end;
        }

        @NotNull
        public final Paddings getStart() {
            return this.start;
        }

        @NotNull
        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            return this.bottom.hashCode() + b.b(this.top, b.b(this.end, this.start.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.start;
            Paddings paddings2 = this.end;
            return b.e(p.b("ElementMargins(start=", paddings, ", end=", paddings2, ", top="), this.top, ", bottom=", this.bottom, ")");
        }

        public ElementMargins(@NotNull Paddings start, @NotNull Paddings end, @NotNull Paddings top, @NotNull Paddings bottom) {
            Intrinsics.checkNotNullParameter(start, "start");
            Intrinsics.checkNotNullParameter(end, "end");
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            this.start = start;
            this.end = end;
            this.top = top;
            this.bottom = bottom;
        }

        public /* synthetic */ ElementMargins(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Paddings.NONE : paddings, (i11 & 2) != 0 ? Paddings.NONE : paddings2, (i11 & 4) != 0 ? Paddings.NONE : paddings3, (i11 & 8) != 0 ? Paddings.NONE : paddings4);
        }
    }

    public TravelImageDTO(@NotNull ImageDTO image, String str, CommonControlSettings commonControlSettings, @NotNull ElementMargins margins) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(margins, "margins");
        this.image = image;
        this.backgroundColor = str;
        this.common = commonControlSettings;
        this.margins = margins;
    }

    public static /* synthetic */ TravelImageDTO copy$default(TravelImageDTO travelImageDTO, ImageDTO imageDTO, String str, CommonControlSettings commonControlSettings, ElementMargins elementMargins, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = travelImageDTO.image;
        }
        if ((i11 & 2) != 0) {
            str = travelImageDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            commonControlSettings = travelImageDTO.common;
        }
        if ((i11 & 8) != 0) {
            elementMargins = travelImageDTO.margins;
        }
        return travelImageDTO.copy(imageDTO, str, commonControlSettings, elementMargins);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ElementMargins getMargins() {
        return this.margins;
    }

    @NotNull
    public final TravelImageDTO copy(@NotNull ImageDTO image, String backgroundColor, CommonControlSettings common, @NotNull ElementMargins margins) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(margins, "margins");
        return new TravelImageDTO(image, backgroundColor, common, margins);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelImageDTO)) {
            return false;
        }
        TravelImageDTO travelImageDTO = (TravelImageDTO) other;
        return Intrinsics.d(this.image, travelImageDTO.image) && Intrinsics.d(this.backgroundColor, travelImageDTO.backgroundColor) && Intrinsics.d(this.common, travelImageDTO.common) && Intrinsics.d(this.margins, travelImageDTO.margins);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    public final ElementMargins getMargins() {
        return this.margins;
    }

    public int hashCode() {
        int hashCode = this.image.hashCode() * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        return this.margins.hashCode() + ((hashCode2 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "TravelImageDTO(image=" + this.image + ", backgroundColor=" + this.backgroundColor + ", common=" + this.common + ", margins=" + this.margins + ")";
    }
}
