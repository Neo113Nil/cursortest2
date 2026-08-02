package ru.ozon.app.android.ugc.widgets.selectionsList.data;

import Bl.C2639a;
import D40.a;
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
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/TileFooterContentDTO;", "", "<init>", "()V", "Companion", "SelectionInfo", "SelectionItemFooter", "ReviewPreviewTitleRating", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/TileFooterContentDTO$ReviewPreviewTitleRating;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/TileFooterContentDTO$SelectionInfo;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/TileFooterContentDTO$SelectionItemFooter;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class TileFooterContentDTO {
    public static final int $stable = 0;

    @NotNull
    public static final String CONTENT_TYPE_REVIEW_PREVIEW_PRICE = "CONTENT_TYPE_REVIEW_PREVIEW_PRICE";

    @NotNull
    public static final String CONTENT_TYPE_REVIEW_PREVIEW_TITLE_RATING = "CONTENT_TYPE_REVIEW_PREVIEW_TITLE_RATING";

    @NotNull
    public static final String CONTENT_TYPE_SELECTION_ITEM_FOOTER = "CONTENT_TYPE_SELECTION_ITEM_FOOTER";

    @NotNull
    public static final String CONTENT_TYPE_SELECTION_ITEM_INFO = "CONTENT_TYPE_SELECTION_ITEM_INFO";

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/TileFooterContentDTO$ReviewPreviewTitleRating;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/TileFooterContentDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "ratingIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "ratingValue", "separator", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getRatingIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRatingValue", "getSeparator", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReviewPreviewTitleRating extends TileFooterContentDTO {
        public static final int $stable = IconDTO.$stable;
        private final IconDTO ratingIcon;
        private final TextDTO ratingValue;
        private final TextDTO separator;

        @NotNull
        private final TextDTO title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReviewPreviewTitleRating(@NotNull TextDTO title, IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.ratingIcon = iconDTO;
            this.ratingValue = textDTO;
            this.separator = textDTO2;
        }

        public static /* synthetic */ ReviewPreviewTitleRating copy$default(ReviewPreviewTitleRating reviewPreviewTitleRating, TextDTO textDTO, IconDTO iconDTO, TextDTO textDTO2, TextDTO textDTO3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = reviewPreviewTitleRating.title;
            }
            if ((i11 & 2) != 0) {
                iconDTO = reviewPreviewTitleRating.ratingIcon;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = reviewPreviewTitleRating.ratingValue;
            }
            if ((i11 & 8) != 0) {
                textDTO3 = reviewPreviewTitleRating.separator;
            }
            return reviewPreviewTitleRating.copy(textDTO, iconDTO, textDTO2, textDTO3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final IconDTO getRatingIcon() {
            return this.ratingIcon;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getRatingValue() {
            return this.ratingValue;
        }

        /* renamed from: component4, reason: from getter */
        public final TextDTO getSeparator() {
            return this.separator;
        }

        @NotNull
        public final ReviewPreviewTitleRating copy(@NotNull TextDTO title, IconDTO ratingIcon, TextDTO ratingValue, TextDTO separator) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new ReviewPreviewTitleRating(title, ratingIcon, ratingValue, separator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReviewPreviewTitleRating)) {
                return false;
            }
            ReviewPreviewTitleRating reviewPreviewTitleRating = (ReviewPreviewTitleRating) other;
            return Intrinsics.d(this.title, reviewPreviewTitleRating.title) && Intrinsics.d(this.ratingIcon, reviewPreviewTitleRating.ratingIcon) && Intrinsics.d(this.ratingValue, reviewPreviewTitleRating.ratingValue) && Intrinsics.d(this.separator, reviewPreviewTitleRating.separator);
        }

        public final IconDTO getRatingIcon() {
            return this.ratingIcon;
        }

        public final TextDTO getRatingValue() {
            return this.ratingValue;
        }

        public final TextDTO getSeparator() {
            return this.separator;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            IconDTO iconDTO = this.ratingIcon;
            int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            TextDTO textDTO = this.ratingValue;
            int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.separator;
            return hashCode3 + (textDTO2 != null ? textDTO2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            IconDTO iconDTO = this.ratingIcon;
            TextDTO textDTO2 = this.ratingValue;
            TextDTO textDTO3 = this.separator;
            StringBuilder d11 = C2639a.d("ReviewPreviewTitleRating(title=", ", ratingIcon=", ", ratingValue=", iconDTO, textDTO);
            d11.append(textDTO2);
            d11.append(", separator=");
            d11.append(textDTO3);
            d11.append(")");
            return d11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/TileFooterContentDTO$SelectionInfo;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/TileFooterContentDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "productImages", "", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getProductImages", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectionInfo extends TileFooterContentDTO {
        public static final int $stable = 8;
        private final List<ProductMediaDTO> productImages;

        @NotNull
        private final TextDTO title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectionInfo(@NotNull TextDTO title, List<ProductMediaDTO> list) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.productImages = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SelectionInfo copy$default(SelectionInfo selectionInfo, TextDTO textDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = selectionInfo.title;
            }
            if ((i11 & 2) != 0) {
                list = selectionInfo.productImages;
            }
            return selectionInfo.copy(textDTO, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        public final List<ProductMediaDTO> component2() {
            return this.productImages;
        }

        @NotNull
        public final SelectionInfo copy(@NotNull TextDTO title, List<ProductMediaDTO> productImages) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new SelectionInfo(title, productImages);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectionInfo)) {
                return false;
            }
            SelectionInfo selectionInfo = (SelectionInfo) other;
            return Intrinsics.d(this.title, selectionInfo.title) && Intrinsics.d(this.productImages, selectionInfo.productImages);
        }

        public final List<ProductMediaDTO> getProductImages() {
            return this.productImages;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            List<ProductMediaDTO> list = this.productImages;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public String toString() {
            return "SelectionInfo(title=" + this.title + ", productImages=" + this.productImages + ")";
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/TileFooterContentDTO$SelectionItemFooter;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/TileFooterContentDTO;", "statusList", "", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/TileFooterContentDTO$SelectionItemFooter$StatusSelection;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getStatusList", "()Ljava/util/List;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "StatusSelection", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class SelectionItemFooter extends TileFooterContentDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final IconDTO icon;

        @NotNull
        private final List<StatusSelection> statusList;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/TileFooterContentDTO$SelectionItemFooter$StatusSelection;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class StatusSelection {
            public static final int $stable = IconDTO.$stable;

            @NotNull
            private final IconDTO icon;

            @NotNull
            private final TextDTO text;

            public StatusSelection(@NotNull IconDTO icon, @NotNull TextDTO text) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(text, "text");
                this.icon = icon;
                this.text = text;
            }

            public static /* synthetic */ StatusSelection copy$default(StatusSelection statusSelection, IconDTO iconDTO, TextDTO textDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    iconDTO = statusSelection.icon;
                }
                if ((i11 & 2) != 0) {
                    textDTO = statusSelection.text;
                }
                return statusSelection.copy(iconDTO, textDTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final IconDTO getIcon() {
                return this.icon;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextDTO getText() {
                return this.text;
            }

            @NotNull
            public final StatusSelection copy(@NotNull IconDTO icon, @NotNull TextDTO text) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(text, "text");
                return new StatusSelection(icon, text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StatusSelection)) {
                    return false;
                }
                StatusSelection statusSelection = (StatusSelection) other;
                return Intrinsics.d(this.icon, statusSelection.icon) && Intrinsics.d(this.text, statusSelection.text);
            }

            @NotNull
            public final IconDTO getIcon() {
                return this.icon;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode() + (this.icon.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "StatusSelection(icon=" + this.icon + ", text=" + this.text + ")";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectionItemFooter(@NotNull List<StatusSelection> statusList, IconDTO iconDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            super(null);
            Intrinsics.checkNotNullParameter(statusList, "statusList");
            this.statusList = statusList;
            this.icon = iconDTO;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SelectionItemFooter copy$default(SelectionItemFooter selectionItemFooter, List list, IconDTO iconDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = selectionItemFooter.statusList;
            }
            if ((i11 & 2) != 0) {
                iconDTO = selectionItemFooter.icon;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = selectionItemFooter.action;
            }
            if ((i11 & 8) != 0) {
                map = selectionItemFooter.trackingInfo;
            }
            return selectionItemFooter.copy(list, iconDTO, atomActionDTO, map);
        }

        @NotNull
        public final List<StatusSelection> component1() {
            return this.statusList;
        }

        /* renamed from: component2, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        @NotNull
        public final SelectionItemFooter copy(@NotNull List<StatusSelection> statusList, IconDTO icon, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(statusList, "statusList");
            return new SelectionItemFooter(statusList, icon, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectionItemFooter)) {
                return false;
            }
            SelectionItemFooter selectionItemFooter = (SelectionItemFooter) other;
            return Intrinsics.d(this.statusList, selectionItemFooter.statusList) && Intrinsics.d(this.icon, selectionItemFooter.icon) && Intrinsics.d(this.action, selectionItemFooter.action) && Intrinsics.d(this.trackingInfo, selectionItemFooter.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final List<StatusSelection> getStatusList() {
            return this.statusList;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.statusList.hashCode() * 31;
            IconDTO iconDTO = this.icon;
            int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            List<StatusSelection> list = this.statusList;
            IconDTO iconDTO = this.icon;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("SelectionItemFooter(statusList=");
            sb2.append(list);
            sb2.append(", icon=");
            sb2.append(iconDTO);
            sb2.append(", action=");
            return a.d(sb2, atomActionDTO, ", trackingInfo=", map, ")");
        }
    }

    public /* synthetic */ TileFooterContentDTO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TileFooterContentDTO() {
    }
}
