package ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.data;

import B3.p;
import B90.C2616s;
import GR.b;
import Kk.C3532b;
import Lh.a;
import Pk0.f;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\"#$B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListDTO;", "", "items", "", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListDTO$ImageBadge;", "itemSettings", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListDTO$ItemSettings;", "paddings", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListDTO$PaddingsDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListDTO$ItemSettings;Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListDTO$PaddingsDTO;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "getItemSettings", "()Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListDTO$ItemSettings;", "getPaddings", "()Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListDTO$PaddingsDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ImageBadge", "ItemSettings", "PaddingsDTO", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ImageBadgeListDTO {
    public static final int $stable = 8;

    @NotNull
    private final ItemSettings itemSettings;

    @NotNull
    private final List<ImageBadge> items;

    @NotNull
    private final PaddingsDTO paddings;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListDTO$ItemSettings;", "", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "top", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottom", "left", "right", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getTop", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottom", "getLeft", "getRight", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemSettings {
        public static final int $stable = 0;
        private final String backgroundColor;

        @NotNull
        private final Paddings bottom;

        @NotNull
        private final CornerRadius cornerRadius;

        @NotNull
        private final Paddings left;
        private final Paddings right;

        @NotNull
        private final Paddings top;

        public ItemSettings() {
            this(null, null, null, null, null, null, 63, null);
        }

        public static /* synthetic */ ItemSettings copy$default(ItemSettings itemSettings, String str, CornerRadius cornerRadius, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = itemSettings.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                cornerRadius = itemSettings.cornerRadius;
            }
            if ((i11 & 4) != 0) {
                paddings = itemSettings.top;
            }
            if ((i11 & 8) != 0) {
                paddings2 = itemSettings.bottom;
            }
            if ((i11 & 16) != 0) {
                paddings3 = itemSettings.left;
            }
            if ((i11 & 32) != 0) {
                paddings4 = itemSettings.right;
            }
            Paddings paddings5 = paddings3;
            Paddings paddings6 = paddings4;
            return itemSettings.copy(str, cornerRadius, paddings, paddings2, paddings5, paddings6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
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
        public final Paddings getLeft() {
            return this.left;
        }

        /* renamed from: component6, reason: from getter */
        public final Paddings getRight() {
            return this.right;
        }

        @NotNull
        public final ItemSettings copy(String backgroundColor, @NotNull CornerRadius cornerRadius, @NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings left, Paddings right) {
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(left, "left");
            return new ItemSettings(backgroundColor, cornerRadius, top, bottom, left, right);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemSettings)) {
                return false;
            }
            ItemSettings itemSettings = (ItemSettings) other;
            return Intrinsics.d(this.backgroundColor, itemSettings.backgroundColor) && this.cornerRadius == itemSettings.cornerRadius && this.top == itemSettings.top && this.bottom == itemSettings.bottom && this.left == itemSettings.left && this.right == itemSettings.right;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final Paddings getLeft() {
            return this.left;
        }

        public final Paddings getRight() {
            return this.right;
        }

        @NotNull
        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            int b11 = b.b(this.left, b.b(this.bottom, b.b(this.top, Tl.b.b(this.cornerRadius, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31), 31);
            Paddings paddings = this.right;
            return b11 + (paddings != null ? paddings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColor;
            CornerRadius cornerRadius = this.cornerRadius;
            Paddings paddings = this.top;
            Paddings paddings2 = this.bottom;
            Paddings paddings3 = this.left;
            Paddings paddings4 = this.right;
            StringBuilder sb2 = new StringBuilder("ItemSettings(backgroundColor=");
            sb2.append(str);
            sb2.append(", cornerRadius=");
            sb2.append(cornerRadius);
            sb2.append(", top=");
            a.e(sb2, paddings, ", bottom=", paddings2, ", left=");
            return b.e(sb2, paddings3, ", right=", paddings4, ")");
        }

        public ItemSettings(String str, @NotNull CornerRadius cornerRadius, @NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings left, Paddings paddings) {
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(left, "left");
            this.backgroundColor = str;
            this.cornerRadius = cornerRadius;
            this.top = top;
            this.bottom = bottom;
            this.left = left;
            this.right = paddings;
        }

        public /* synthetic */ ItemSettings(String str, CornerRadius cornerRadius, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? CornerRadius.RADIUS_300 : cornerRadius, (i11 & 4) != 0 ? Paddings.PADDING_300 : paddings, (i11 & 8) != 0 ? Paddings.PADDING_300 : paddings2, (i11 & 16) != 0 ? Paddings.PADDING_300 : paddings3, (i11 & 32) != 0 ? null : paddings4);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListDTO$PaddingsDTO;", "", "top", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottom", "left", "right", "between", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTop", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottom", "getLeft", "getRight", "getBetween", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingsDTO {
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

        public PaddingsDTO() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ PaddingsDTO copy$default(PaddingsDTO paddingsDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = paddingsDTO.top;
            }
            if ((i11 & 2) != 0) {
                paddings2 = paddingsDTO.bottom;
            }
            if ((i11 & 4) != 0) {
                paddings3 = paddingsDTO.left;
            }
            if ((i11 & 8) != 0) {
                paddings4 = paddingsDTO.right;
            }
            if ((i11 & 16) != 0) {
                paddings5 = paddingsDTO.between;
            }
            Paddings paddings6 = paddings5;
            Paddings paddings7 = paddings3;
            return paddingsDTO.copy(paddings, paddings2, paddings7, paddings4, paddings6);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getLeft() {
            return this.left;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getRight() {
            return this.right;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final Paddings getBetween() {
            return this.between;
        }

        @NotNull
        public final PaddingsDTO copy(@NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings left, @NotNull Paddings right, @NotNull Paddings between) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            Intrinsics.checkNotNullParameter(between, "between");
            return new PaddingsDTO(top, bottom, left, right, between);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingsDTO)) {
                return false;
            }
            PaddingsDTO paddingsDTO = (PaddingsDTO) other;
            return this.top == paddingsDTO.top && this.bottom == paddingsDTO.bottom && this.left == paddingsDTO.left && this.right == paddingsDTO.right && this.between == paddingsDTO.between;
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
            return this.between.hashCode() + b.b(this.right, b.b(this.left, b.b(this.bottom, this.top.hashCode() * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.top;
            Paddings paddings2 = this.bottom;
            Paddings paddings3 = this.left;
            Paddings paddings4 = this.right;
            Paddings paddings5 = this.between;
            StringBuilder b11 = p.b("PaddingsDTO(top=", paddings, ", bottom=", paddings2, ", left=");
            a.e(b11, paddings3, ", right=", paddings4, ", between=");
            return D40.b.b(b11, paddings5, ")");
        }

        public PaddingsDTO(@NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings left, @NotNull Paddings right, @NotNull Paddings between) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            Intrinsics.checkNotNullParameter(between, "between");
            this.top = top;
            this.bottom = bottom;
            this.left = left;
            this.right = right;
            this.between = between;
        }

        public /* synthetic */ PaddingsDTO(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Paddings.PADDING_300 : paddings, (i11 & 2) != 0 ? Paddings.NONE : paddings2, (i11 & 4) != 0 ? Paddings.PADDING_300 : paddings3, (i11 & 8) != 0 ? Paddings.PADDING_300 : paddings4, (i11 & 16) != 0 ? Paddings.PADDING_250 : paddings5);
        }
    }

    public ImageBadgeListDTO(@NotNull List<ImageBadge> items, @NotNull ItemSettings itemSettings, @NotNull PaddingsDTO paddings, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemSettings, "itemSettings");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.items = items;
        this.itemSettings = itemSettings;
        this.paddings = paddings;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageBadgeListDTO copy$default(ImageBadgeListDTO imageBadgeListDTO, List list, ItemSettings itemSettings, PaddingsDTO paddingsDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = imageBadgeListDTO.items;
        }
        if ((i11 & 2) != 0) {
            itemSettings = imageBadgeListDTO.itemSettings;
        }
        if ((i11 & 4) != 0) {
            paddingsDTO = imageBadgeListDTO.paddings;
        }
        if ((i11 & 8) != 0) {
            map = imageBadgeListDTO.trackingInfo;
        }
        return imageBadgeListDTO.copy(list, itemSettings, paddingsDTO, map);
    }

    @NotNull
    public final List<ImageBadge> component1() {
        return this.items;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ItemSettings getItemSettings() {
        return this.itemSettings;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PaddingsDTO getPaddings() {
        return this.paddings;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final ImageBadgeListDTO copy(@NotNull List<ImageBadge> items, @NotNull ItemSettings itemSettings, @NotNull PaddingsDTO paddings, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemSettings, "itemSettings");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new ImageBadgeListDTO(items, itemSettings, paddings, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageBadgeListDTO)) {
            return false;
        }
        ImageBadgeListDTO imageBadgeListDTO = (ImageBadgeListDTO) other;
        return Intrinsics.d(this.items, imageBadgeListDTO.items) && Intrinsics.d(this.itemSettings, imageBadgeListDTO.itemSettings) && Intrinsics.d(this.paddings, imageBadgeListDTO.paddings) && Intrinsics.d(this.trackingInfo, imageBadgeListDTO.trackingInfo);
    }

    @NotNull
    public final ItemSettings getItemSettings() {
        return this.itemSettings;
    }

    @NotNull
    public final List<ImageBadge> getItems() {
        return this.items;
    }

    @NotNull
    public final PaddingsDTO getPaddings() {
        return this.paddings;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.paddings.hashCode() + ((this.itemSettings.hashCode() + (this.items.hashCode() * 31)) * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return "ImageBadgeListDTO(items=" + this.items + ", itemSettings=" + this.itemSettings + ", paddings=" + this.paddings + ", trackingInfo=" + this.trackingInfo + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ImageBadgeListDTO(List list, ItemSettings itemSettings, PaddingsDTO paddingsDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, itemSettings, paddingsDTO, map);
        if ((i11 & 2) != 0) {
            itemSettings = new ItemSettings(null, null, null, null, null, null, 63, null);
        }
        if ((i11 & 4) != 0) {
            paddingsDTO = new PaddingsDTO(null, null, null, null, null, 31, null);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003JU\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0001J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListDTO$ImageBadge;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "hasSeparator", "", "hasTrailingIcon", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getHasSeparator", "()Z", "getHasTrailingIcon", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImageBadge {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final boolean hasSeparator;
        private final boolean hasTrailingIcon;

        @NotNull
        private final ImageDTO image;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ImageBadge(@NotNull ImageDTO image, @NotNull TextDTO title, boolean z11, boolean z12, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            this.image = image;
            this.title = title;
            this.hasSeparator = z11;
            this.hasTrailingIcon = z12;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ ImageBadge copy$default(ImageBadge imageBadge, ImageDTO imageDTO, TextDTO textDTO, boolean z11, boolean z12, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = imageBadge.image;
            }
            if ((i11 & 2) != 0) {
                textDTO = imageBadge.title;
            }
            if ((i11 & 4) != 0) {
                z11 = imageBadge.hasSeparator;
            }
            if ((i11 & 8) != 0) {
                z12 = imageBadge.hasTrailingIcon;
            }
            if ((i11 & 16) != 0) {
                atomActionDTO = imageBadge.action;
            }
            if ((i11 & 32) != 0) {
                map = imageBadge.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            return imageBadge.copy(imageDTO, textDTO, z11, z12, atomActionDTO2, map2);
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
        public final boolean getHasSeparator() {
            return this.hasSeparator;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHasTrailingIcon() {
            return this.hasTrailingIcon;
        }

        /* renamed from: component5, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final ImageBadge copy(@NotNull ImageDTO image, @NotNull TextDTO title, boolean hasSeparator, boolean hasTrailingIcon, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            return new ImageBadge(image, title, hasSeparator, hasTrailingIcon, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageBadge)) {
                return false;
            }
            ImageBadge imageBadge = (ImageBadge) other;
            return Intrinsics.d(this.image, imageBadge.image) && Intrinsics.d(this.title, imageBadge.title) && this.hasSeparator == imageBadge.hasSeparator && this.hasTrailingIcon == imageBadge.hasTrailingIcon && Intrinsics.d(this.action, imageBadge.action) && Intrinsics.d(this.trackingInfo, imageBadge.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final boolean getHasSeparator() {
            return this.hasSeparator;
        }

        public final boolean getHasTrailingIcon() {
            return this.hasTrailingIcon;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = C3532b.a(C3532b.a(Ns.b.a(this.title, this.image.hashCode() * 31, 31), 31, this.hasSeparator), 31, this.hasTrailingIcon);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.image;
            TextDTO textDTO = this.title;
            boolean z11 = this.hasSeparator;
            boolean z12 = this.hasTrailingIcon;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C2616s.d("ImageBadge(image=", imageDTO, ", title=", textDTO, ", hasSeparator=");
            f.c(", hasTrailingIcon=", ", action=", d11, z11, z12);
            return D40.a.d(d11, atomActionDTO, ", trackingInfo=", map, ")");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ ImageBadge(ImageDTO imageDTO, TextDTO textDTO, boolean z11, boolean z12, AtomActionDTO atomActionDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(imageDTO, textDTO, z11, r6, r7, r8);
            Map map2;
            AtomActionDTO atomActionDTO2;
            boolean z13;
            z11 = (i11 & 4) != 0 ? false : z11;
            if ((i11 & 8) != 0) {
                map2 = map;
                atomActionDTO2 = atomActionDTO;
                z13 = false;
            } else {
                map2 = map;
                atomActionDTO2 = atomActionDTO;
                z13 = z12;
            }
        }
    }
}
