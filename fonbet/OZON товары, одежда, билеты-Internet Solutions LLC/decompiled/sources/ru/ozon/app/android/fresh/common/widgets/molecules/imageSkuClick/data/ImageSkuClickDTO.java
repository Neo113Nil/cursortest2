package ru.ozon.app.android.fresh.common.widgets.molecules.imageSkuClick.data;

import B3.p;
import G.g;
import GR.b;
import Lc.a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002*+BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003JW\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/data/ImageSkuClickDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "text", "Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/data/ImageSkuClickDTO$LabelDTO;", "overlayColor", "", "spacers", "Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/data/ImageSkuClickDTO$Spacers;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/data/ImageSkuClickDTO$LabelDTO;Ljava/lang/String;Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/data/ImageSkuClickDTO$Spacers;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getText", "()Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/data/ImageSkuClickDTO$LabelDTO;", "getOverlayColor", "()Ljava/lang/String;", "getSpacers", "()Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/data/ImageSkuClickDTO$Spacers;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "LabelDTO", "Spacers", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ImageSkuClickDTO {
    private final AtomActionDTO action;

    @NotNull
    private final ImageDTO image;

    @NotNull
    private final String overlayColor;
    private final Spacers spacers;

    @NotNull
    private final LabelDTO text;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/data/ImageSkuClickDTO$LabelDTO;", "", "quantity", "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getQuantity", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LabelDTO {

        @NotNull
        private final TextDTO quantity;

        @NotNull
        private final TextDTO subtitle;

        public LabelDTO(@NotNull TextDTO quantity, @NotNull TextDTO subtitle) {
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.quantity = quantity;
            this.subtitle = subtitle;
        }

        public static /* synthetic */ LabelDTO copy$default(LabelDTO labelDTO, TextDTO textDTO, TextDTO textDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = labelDTO.quantity;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = labelDTO.subtitle;
            }
            return labelDTO.copy(textDTO, textDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getQuantity() {
            return this.quantity;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final LabelDTO copy(@NotNull TextDTO quantity, @NotNull TextDTO subtitle) {
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new LabelDTO(quantity, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LabelDTO)) {
                return false;
            }
            LabelDTO labelDTO = (LabelDTO) other;
            return Intrinsics.d(this.quantity, labelDTO.quantity) && Intrinsics.d(this.subtitle, labelDTO.subtitle);
        }

        @NotNull
        public final TextDTO getQuantity() {
            return this.quantity;
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public int hashCode() {
            return this.subtitle.hashCode() + (this.quantity.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a.b("LabelDTO(quantity=", this.quantity, ", subtitle=", this.subtitle, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/data/ImageSkuClickDTO$Spacers;", "", "top", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottom", "left", "right", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTop", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottom", "getLeft", "getRight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Spacers {
        private final Paddings bottom;
        private final Paddings left;
        private final Paddings right;
        private final Paddings top;

        public Spacers(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4) {
            this.top = paddings;
            this.bottom = paddings2;
            this.left = paddings3;
            this.right = paddings4;
        }

        public static /* synthetic */ Spacers copy$default(Spacers spacers, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = spacers.top;
            }
            if ((i11 & 2) != 0) {
                paddings2 = spacers.bottom;
            }
            if ((i11 & 4) != 0) {
                paddings3 = spacers.left;
            }
            if ((i11 & 8) != 0) {
                paddings4 = spacers.right;
            }
            return spacers.copy(paddings, paddings2, paddings3, paddings4);
        }

        /* renamed from: component1, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getLeft() {
            return this.left;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getRight() {
            return this.right;
        }

        @NotNull
        public final Spacers copy(Paddings top, Paddings bottom, Paddings left, Paddings right) {
            return new Spacers(top, bottom, left, right);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spacers)) {
                return false;
            }
            Spacers spacers = (Spacers) other;
            return this.top == spacers.top && this.bottom == spacers.bottom && this.left == spacers.left && this.right == spacers.right;
        }

        public final Paddings getBottom() {
            return this.bottom;
        }

        public final Paddings getLeft() {
            return this.left;
        }

        public final Paddings getRight() {
            return this.right;
        }

        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            Paddings paddings = this.top;
            int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
            Paddings paddings2 = this.bottom;
            int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
            Paddings paddings3 = this.left;
            int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
            Paddings paddings4 = this.right;
            return hashCode3 + (paddings4 != null ? paddings4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.top;
            Paddings paddings2 = this.bottom;
            return b.e(p.b("Spacers(top=", paddings, ", bottom=", paddings2, ", left="), this.left, ", right=", this.right, ")");
        }
    }

    public ImageSkuClickDTO(@NotNull ImageDTO image, @NotNull LabelDTO text, @NotNull String overlayColor, Spacers spacers, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(overlayColor, "overlayColor");
        this.image = image;
        this.text = text;
        this.overlayColor = overlayColor;
        this.spacers = spacers;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ImageSkuClickDTO copy$default(ImageSkuClickDTO imageSkuClickDTO, ImageDTO imageDTO, LabelDTO labelDTO, String str, Spacers spacers, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = imageSkuClickDTO.image;
        }
        if ((i11 & 2) != 0) {
            labelDTO = imageSkuClickDTO.text;
        }
        if ((i11 & 4) != 0) {
            str = imageSkuClickDTO.overlayColor;
        }
        if ((i11 & 8) != 0) {
            spacers = imageSkuClickDTO.spacers;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = imageSkuClickDTO.action;
        }
        if ((i11 & 32) != 0) {
            map = imageSkuClickDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        return imageSkuClickDTO.copy(imageDTO, labelDTO, str, spacers, atomActionDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final LabelDTO getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getOverlayColor() {
        return this.overlayColor;
    }

    /* renamed from: component4, reason: from getter */
    public final Spacers getSpacers() {
        return this.spacers;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final ImageSkuClickDTO copy(@NotNull ImageDTO image, @NotNull LabelDTO text, @NotNull String overlayColor, Spacers spacers, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(overlayColor, "overlayColor");
        return new ImageSkuClickDTO(image, text, overlayColor, spacers, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageSkuClickDTO)) {
            return false;
        }
        ImageSkuClickDTO imageSkuClickDTO = (ImageSkuClickDTO) other;
        return Intrinsics.d(this.image, imageSkuClickDTO.image) && Intrinsics.d(this.text, imageSkuClickDTO.text) && Intrinsics.d(this.overlayColor, imageSkuClickDTO.overlayColor) && Intrinsics.d(this.spacers, imageSkuClickDTO.spacers) && Intrinsics.d(this.action, imageSkuClickDTO.action) && Intrinsics.d(this.trackingInfo, imageSkuClickDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    public final String getOverlayColor() {
        return this.overlayColor;
    }

    public final Spacers getSpacers() {
        return this.spacers;
    }

    @NotNull
    public final LabelDTO getText() {
        return this.text;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a((this.text.hashCode() + (this.image.hashCode() * 31)) * 31, 31, this.overlayColor);
        Spacers spacers = this.spacers;
        int hashCode = (a11 + (spacers == null ? 0 : spacers.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ImageDTO imageDTO = this.image;
        LabelDTO labelDTO = this.text;
        String str = this.overlayColor;
        Spacers spacers = this.spacers;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ImageSkuClickDTO(image=");
        sb2.append(imageDTO);
        sb2.append(", text=");
        sb2.append(labelDTO);
        sb2.append(", overlayColor=");
        sb2.append(str);
        sb2.append(", spacers=");
        sb2.append(spacers);
        sb2.append(", action=");
        return D40.a.d(sb2, atomActionDTO, ", trackingInfo=", map, ")");
    }
}
