package ru.ozon.app.android.fresh.unsorted.widgets.tagList.data;

import B3.p;
import GR.b;
import Lh.a;
import Tz.C4055a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001!B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/tagList/data/TagListDTO;", "", "tags", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "backgroundColor", "", "spacers", "Lru/ozon/app/android/fresh/unsorted/widgets/tagList/data/TagListDTO$SpacersDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/fresh/unsorted/widgets/tagList/data/TagListDTO$SpacersDTO;Ljava/util/Map;)V", "getTags", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getSpacers", "()Lru/ozon/app/android/fresh/unsorted/widgets/tagList/data/TagListDTO$SpacersDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "SpacersDTO", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TagListDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final SpacersDTO spacers;

    @NotNull
    private final List<TagButtonDTO> tags;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/tagList/data/TagListDTO$SpacersDTO;", "", "left", "Lru/ozon/uni/atoms/data/common/Paddings;", "right", "top", "bottom", "between", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getLeft", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getRight", "getTop", "getBottom", "getBetween", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SpacersDTO {
        public static final int $stable = 0;

        @NotNull
        private final Paddings between;

        @NotNull
        private final Paddings bottom;

        @NotNull
        private final Paddings left;

        @NotNull
        private final Paddings right;

        @NotNull
        private final Paddings top;

        public SpacersDTO() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ SpacersDTO copy$default(SpacersDTO spacersDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = spacersDTO.left;
            }
            if ((i11 & 2) != 0) {
                paddings2 = spacersDTO.right;
            }
            if ((i11 & 4) != 0) {
                paddings3 = spacersDTO.top;
            }
            if ((i11 & 8) != 0) {
                paddings4 = spacersDTO.bottom;
            }
            if ((i11 & 16) != 0) {
                paddings5 = spacersDTO.between;
            }
            Paddings paddings6 = paddings5;
            Paddings paddings7 = paddings3;
            return spacersDTO.copy(paddings, paddings2, paddings7, paddings4, paddings6);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getLeft() {
            return this.left;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getRight() {
            return this.right;
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
        /* renamed from: component5, reason: from getter */
        public final Paddings getBetween() {
            return this.between;
        }

        @NotNull
        public final SpacersDTO copy(@NotNull Paddings left, @NotNull Paddings right, @NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings between) {
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(between, "between");
            return new SpacersDTO(left, right, top, bottom, between);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpacersDTO)) {
                return false;
            }
            SpacersDTO spacersDTO = (SpacersDTO) other;
            return this.left == spacersDTO.left && this.right == spacersDTO.right && this.top == spacersDTO.top && this.bottom == spacersDTO.bottom && this.between == spacersDTO.between;
        }

        @NotNull
        public final Paddings getBetween() {
            return this.between;
        }

        @NotNull
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final Paddings getLeft() {
            return this.left;
        }

        @NotNull
        public final Paddings getRight() {
            return this.right;
        }

        @NotNull
        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            return this.between.hashCode() + b.b(this.bottom, b.b(this.top, b.b(this.right, this.left.hashCode() * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.left;
            Paddings paddings2 = this.right;
            Paddings paddings3 = this.top;
            Paddings paddings4 = this.bottom;
            Paddings paddings5 = this.between;
            StringBuilder b11 = p.b("SpacersDTO(left=", paddings, ", right=", paddings2, ", top=");
            a.e(b11, paddings3, ", bottom=", paddings4, ", between=");
            return D40.b.b(b11, paddings5, ")");
        }

        public SpacersDTO(@NotNull Paddings left, @NotNull Paddings right, @NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings between) {
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(between, "between");
            this.left = left;
            this.right = right;
            this.top = top;
            this.bottom = bottom;
            this.between = between;
        }

        public /* synthetic */ SpacersDTO(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Paddings.PADDING_300 : paddings, (i11 & 2) != 0 ? Paddings.PADDING_300 : paddings2, (i11 & 4) != 0 ? Paddings.PADDING_300 : paddings3, (i11 & 8) != 0 ? Paddings.PADDING_300 : paddings4, (i11 & 16) != 0 ? Paddings.PADDING_250 : paddings5);
        }
    }

    public TagListDTO(@NotNull List<TagButtonDTO> tags, String str, SpacersDTO spacersDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.tags = tags;
        this.backgroundColor = str;
        this.spacers = spacersDTO;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TagListDTO copy$default(TagListDTO tagListDTO, List list, String str, SpacersDTO spacersDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = tagListDTO.tags;
        }
        if ((i11 & 2) != 0) {
            str = tagListDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            spacersDTO = tagListDTO.spacers;
        }
        if ((i11 & 8) != 0) {
            map = tagListDTO.trackingInfo;
        }
        return tagListDTO.copy(list, str, spacersDTO, map);
    }

    @NotNull
    public final List<TagButtonDTO> component1() {
        return this.tags;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final SpacersDTO getSpacers() {
        return this.spacers;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final TagListDTO copy(@NotNull List<TagButtonDTO> tags, String backgroundColor, SpacersDTO spacers, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        return new TagListDTO(tags, backgroundColor, spacers, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagListDTO)) {
            return false;
        }
        TagListDTO tagListDTO = (TagListDTO) other;
        return Intrinsics.d(this.tags, tagListDTO.tags) && Intrinsics.d(this.backgroundColor, tagListDTO.backgroundColor) && Intrinsics.d(this.spacers, tagListDTO.spacers) && Intrinsics.d(this.trackingInfo, tagListDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final SpacersDTO getSpacers() {
        return this.spacers;
    }

    @NotNull
    public final List<TagButtonDTO> getTags() {
        return this.tags;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.tags.hashCode() * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        SpacersDTO spacersDTO = this.spacers;
        int hashCode3 = (hashCode2 + (spacersDTO == null ? 0 : spacersDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TagButtonDTO> list = this.tags;
        String str = this.backgroundColor;
        SpacersDTO spacersDTO = this.spacers;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder a11 = C4055a.a("TagListDTO(tags=", ", backgroundColor=", str, ", spacers=", list);
        a11.append(spacersDTO);
        a11.append(", trackingInfo=");
        a11.append(map);
        a11.append(")");
        return a11.toString();
    }
}
