package ru.ozon.app.android.fresh.main.widgets.customCell.data;

import An.C2439a;
import B3.p;
import GR.b;
import T7.P;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003/01BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Jc\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00062"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO;", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "block", "Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$RightBlock;", "spacers", "Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$PaddingsDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "backgroundColor", "", "contentColor", "Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$CustomBackground;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$RightBlock;Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$PaddingsDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$CustomBackground;Ljava/util/Map;)V", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getBlock", "()Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$RightBlock;", "getSpacers", "()Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$PaddingsDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getContentColor", "()Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$CustomBackground;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "PaddingsDTO", "RightBlock", "CustomBackground", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CustomCellDTO {
    private final AtomActionDTO action;
    private final String backgroundColor;
    private final RightBlock block;

    @NotNull
    private final CellDTO cell;

    @NotNull
    private final CustomBackground contentColor;

    @NotNull
    private final PaddingsDTO spacers;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$CustomBackground;", "", "color", "", "gradient", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "getGradient", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomBackground {
        private final String color;
        private final String gradient;

        public CustomBackground(String str, String str2) {
            this.color = str;
            this.gradient = str2;
        }

        public static /* synthetic */ CustomBackground copy$default(CustomBackground customBackground, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = customBackground.color;
            }
            if ((i11 & 2) != 0) {
                str2 = customBackground.gradient;
            }
            return customBackground.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        /* renamed from: component2, reason: from getter */
        public final String getGradient() {
            return this.gradient;
        }

        @NotNull
        public final CustomBackground copy(String color, String gradient) {
            return new CustomBackground(color, gradient);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomBackground)) {
                return false;
            }
            CustomBackground customBackground = (CustomBackground) other;
            return Intrinsics.d(this.color, customBackground.color) && Intrinsics.d(this.gradient, customBackground.gradient);
        }

        public final String getColor() {
            return this.color;
        }

        public final String getGradient() {
            return this.gradient;
        }

        public int hashCode() {
            String str = this.color;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.gradient;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return e.a("CustomBackground(color=", this.color, ", gradient=", this.gradient, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$PaddingsDTO;", "", "horizontal", "Lru/ozon/uni/atoms/data/common/Paddings;", "top", "bottom", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getHorizontal", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getTop", "getBottom", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingsDTO {

        @NotNull
        private final Paddings bottom;

        @NotNull
        private final Paddings horizontal;

        @NotNull
        private final Paddings top;

        public PaddingsDTO() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ PaddingsDTO copy$default(PaddingsDTO paddingsDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = paddingsDTO.horizontal;
            }
            if ((i11 & 2) != 0) {
                paddings2 = paddingsDTO.top;
            }
            if ((i11 & 4) != 0) {
                paddings3 = paddingsDTO.bottom;
            }
            return paddingsDTO.copy(paddings, paddings2, paddings3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getHorizontal() {
            return this.horizontal;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final PaddingsDTO copy(@NotNull Paddings horizontal, @NotNull Paddings top, @NotNull Paddings bottom) {
            Intrinsics.checkNotNullParameter(horizontal, "horizontal");
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            return new PaddingsDTO(horizontal, top, bottom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingsDTO)) {
                return false;
            }
            PaddingsDTO paddingsDTO = (PaddingsDTO) other;
            return this.horizontal == paddingsDTO.horizontal && this.top == paddingsDTO.top && this.bottom == paddingsDTO.bottom;
        }

        @NotNull
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final Paddings getHorizontal() {
            return this.horizontal;
        }

        @NotNull
        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            return this.bottom.hashCode() + b.b(this.top, this.horizontal.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.horizontal;
            Paddings paddings2 = this.top;
            return D40.b.b(p.b("PaddingsDTO(horizontal=", paddings, ", top=", paddings2, ", bottom="), this.bottom, ")");
        }

        public PaddingsDTO(@NotNull Paddings horizontal, @NotNull Paddings top, @NotNull Paddings bottom) {
            Intrinsics.checkNotNullParameter(horizontal, "horizontal");
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            this.horizontal = horizontal;
            this.top = top;
            this.bottom = bottom;
        }

        public /* synthetic */ PaddingsDTO(Paddings paddings, Paddings paddings2, Paddings paddings3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Paddings.PADDING_500 : paddings, (i11 & 2) != 0 ? Paddings.PADDING_300 : paddings2, (i11 & 4) != 0 ? Paddings.PADDING_300 : paddings3);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$RightBlock;", "", "SingleImage", "ImagesBlock", "Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$RightBlock$ImagesBlock;", "Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$RightBlock$SingleImage;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "singleImage", type = SingleImage.class), @ProtoOneOfSignature(name = "imagesBlock", type = ImagesBlock.class)})
    @ProtoOneOf(label = "type")
    public interface RightBlock {

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$RightBlock$ImagesBlock;", "Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$RightBlock;", "gradient", "", "icons", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getGradient", "()Ljava/lang/String;", "getIcons", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ImagesBlock implements RightBlock {

            @NotNull
            private final String gradient;

            @NotNull
            private final List<IconDTO> icons;

            public ImagesBlock(@NotNull String gradient, @NotNull List<IconDTO> icons) {
                Intrinsics.checkNotNullParameter(gradient, "gradient");
                Intrinsics.checkNotNullParameter(icons, "icons");
                this.gradient = gradient;
                this.icons = icons;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ImagesBlock copy$default(ImagesBlock imagesBlock, String str, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = imagesBlock.gradient;
                }
                if ((i11 & 2) != 0) {
                    list = imagesBlock.icons;
                }
                return imagesBlock.copy(str, list);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getGradient() {
                return this.gradient;
            }

            @NotNull
            public final List<IconDTO> component2() {
                return this.icons;
            }

            @NotNull
            public final ImagesBlock copy(@NotNull String gradient, @NotNull List<IconDTO> icons) {
                Intrinsics.checkNotNullParameter(gradient, "gradient");
                Intrinsics.checkNotNullParameter(icons, "icons");
                return new ImagesBlock(gradient, icons);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ImagesBlock)) {
                    return false;
                }
                ImagesBlock imagesBlock = (ImagesBlock) other;
                return Intrinsics.d(this.gradient, imagesBlock.gradient) && Intrinsics.d(this.icons, imagesBlock.icons);
            }

            @NotNull
            public final String getGradient() {
                return this.gradient;
            }

            @NotNull
            public final List<IconDTO> getIcons() {
                return this.icons;
            }

            public int hashCode() {
                return this.icons.hashCode() + (this.gradient.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return C2439a.a("ImagesBlock(gradient=", this.gradient, ", icons=", ")", this.icons);
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$RightBlock$SingleImage;", "Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$RightBlock;", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SingleImage implements RightBlock {

            @NotNull
            private final ImageDTO image;

            public SingleImage(@NotNull ImageDTO image) {
                Intrinsics.checkNotNullParameter(image, "image");
                this.image = image;
            }

            public static /* synthetic */ SingleImage copy$default(SingleImage singleImage, ImageDTO imageDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    imageDTO = singleImage.image;
                }
                return singleImage.copy(imageDTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final ImageDTO getImage() {
                return this.image;
            }

            @NotNull
            public final SingleImage copy(@NotNull ImageDTO image) {
                Intrinsics.checkNotNullParameter(image, "image");
                return new SingleImage(image);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SingleImage) && Intrinsics.d(this.image, ((SingleImage) other).image);
            }

            @NotNull
            public final ImageDTO getImage() {
                return this.image;
            }

            public int hashCode() {
                return this.image.hashCode();
            }

            @NotNull
            public String toString() {
                return "SingleImage(image=" + this.image + ")";
            }
        }
    }

    public CustomCellDTO(@NotNull CellDTO cell, RightBlock rightBlock, @NotNull PaddingsDTO spacers, AtomActionDTO atomActionDTO, String str, @NotNull CustomBackground contentColor, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        Intrinsics.checkNotNullParameter(contentColor, "contentColor");
        this.cell = cell;
        this.block = rightBlock;
        this.spacers = spacers;
        this.action = atomActionDTO;
        this.backgroundColor = str;
        this.contentColor = contentColor;
        this.trackingInfo = map;
    }

    public static /* synthetic */ CustomCellDTO copy$default(CustomCellDTO customCellDTO, CellDTO cellDTO, RightBlock rightBlock, PaddingsDTO paddingsDTO, AtomActionDTO atomActionDTO, String str, CustomBackground customBackground, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cellDTO = customCellDTO.cell;
        }
        if ((i11 & 2) != 0) {
            rightBlock = customCellDTO.block;
        }
        if ((i11 & 4) != 0) {
            paddingsDTO = customCellDTO.spacers;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = customCellDTO.action;
        }
        if ((i11 & 16) != 0) {
            str = customCellDTO.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            customBackground = customCellDTO.contentColor;
        }
        if ((i11 & 64) != 0) {
            map = customCellDTO.trackingInfo;
        }
        CustomBackground customBackground2 = customBackground;
        Map map2 = map;
        String str2 = str;
        PaddingsDTO paddingsDTO2 = paddingsDTO;
        return customCellDTO.copy(cellDTO, rightBlock, paddingsDTO2, atomActionDTO, str2, customBackground2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CellDTO getCell() {
        return this.cell;
    }

    /* renamed from: component2, reason: from getter */
    public final RightBlock getBlock() {
        return this.block;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PaddingsDTO getSpacers() {
        return this.spacers;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final CustomBackground getContentColor() {
        return this.contentColor;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final CustomCellDTO copy(@NotNull CellDTO cell, RightBlock block, @NotNull PaddingsDTO spacers, AtomActionDTO action, String backgroundColor, @NotNull CustomBackground contentColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        Intrinsics.checkNotNullParameter(contentColor, "contentColor");
        return new CustomCellDTO(cell, block, spacers, action, backgroundColor, contentColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomCellDTO)) {
            return false;
        }
        CustomCellDTO customCellDTO = (CustomCellDTO) other;
        return Intrinsics.d(this.cell, customCellDTO.cell) && Intrinsics.d(this.block, customCellDTO.block) && Intrinsics.d(this.spacers, customCellDTO.spacers) && Intrinsics.d(this.action, customCellDTO.action) && Intrinsics.d(this.backgroundColor, customCellDTO.backgroundColor) && Intrinsics.d(this.contentColor, customCellDTO.contentColor) && Intrinsics.d(this.trackingInfo, customCellDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final RightBlock getBlock() {
        return this.block;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    @NotNull
    public final CustomBackground getContentColor() {
        return this.contentColor;
    }

    @NotNull
    public final PaddingsDTO getSpacers() {
        return this.spacers;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.cell.hashCode() * 31;
        RightBlock rightBlock = this.block;
        int hashCode2 = (this.spacers.hashCode() + ((hashCode + (rightBlock == null ? 0 : rightBlock.hashCode())) * 31)) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode4 = (this.contentColor.hashCode() + ((hashCode3 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        CellDTO cellDTO = this.cell;
        RightBlock rightBlock = this.block;
        PaddingsDTO paddingsDTO = this.spacers;
        AtomActionDTO atomActionDTO = this.action;
        String str = this.backgroundColor;
        CustomBackground customBackground = this.contentColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("CustomCellDTO(cell=");
        sb2.append(cellDTO);
        sb2.append(", block=");
        sb2.append(rightBlock);
        sb2.append(", spacers=");
        sb2.append(paddingsDTO);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", contentColor=");
        sb2.append(customBackground);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CustomCellDTO(CellDTO cellDTO, RightBlock rightBlock, PaddingsDTO paddingsDTO, AtomActionDTO atomActionDTO, String str, CustomBackground customBackground, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cellDTO, rightBlock, r10, r11, r12, r13, r14);
        Map map2;
        CustomBackground customBackground2;
        String str2;
        AtomActionDTO atomActionDTO2;
        PaddingsDTO paddingsDTO2;
        if ((i11 & 4) != 0) {
            map2 = map;
            customBackground2 = customBackground;
            str2 = str;
            atomActionDTO2 = atomActionDTO;
            paddingsDTO2 = new PaddingsDTO(null, null, null, 7, null);
        } else {
            map2 = map;
            customBackground2 = customBackground;
            str2 = str;
            atomActionDTO2 = atomActionDTO;
            paddingsDTO2 = paddingsDTO;
        }
    }
}
