package ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.data;

import B3.p;
import D3.g;
import GR.b;
import Lh.a;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTextPair.data.FreshTextPairDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO;", "", "tiles", "", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$TileItem;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$HeaderDTO;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$HeaderDTO;)V", "getTiles", "()Ljava/util/List;", "getHeader", "()Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$HeaderDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TileItem", "HeaderDTO", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DetailedCheckoutProductsDTO {
    public static final int $stable = 8;
    private final HeaderDTO header;

    @NotNull
    private final List<TileItem> tiles;

    public DetailedCheckoutProductsDTO(@NotNull List<TileItem> tiles, HeaderDTO headerDTO) {
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        this.tiles = tiles;
        this.header = headerDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DetailedCheckoutProductsDTO copy$default(DetailedCheckoutProductsDTO detailedCheckoutProductsDTO, List list, HeaderDTO headerDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = detailedCheckoutProductsDTO.tiles;
        }
        if ((i11 & 2) != 0) {
            headerDTO = detailedCheckoutProductsDTO.header;
        }
        return detailedCheckoutProductsDTO.copy(list, headerDTO);
    }

    @NotNull
    public final List<TileItem> component1() {
        return this.tiles;
    }

    /* renamed from: component2, reason: from getter */
    public final HeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final DetailedCheckoutProductsDTO copy(@NotNull List<TileItem> tiles, HeaderDTO header) {
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        return new DetailedCheckoutProductsDTO(tiles, header);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailedCheckoutProductsDTO)) {
            return false;
        }
        DetailedCheckoutProductsDTO detailedCheckoutProductsDTO = (DetailedCheckoutProductsDTO) other;
        return Intrinsics.d(this.tiles, detailedCheckoutProductsDTO.tiles) && Intrinsics.d(this.header, detailedCheckoutProductsDTO.header);
    }

    public final HeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<TileItem> getTiles() {
        return this.tiles;
    }

    public int hashCode() {
        int hashCode = this.tiles.hashCode() * 31;
        HeaderDTO headerDTO = this.header;
        return hashCode + (headerDTO == null ? 0 : headerDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "DetailedCheckoutProductsDTO(tiles=" + this.tiles + ", header=" + this.header + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$HeaderDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "topMargin", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottomMargin", "leftMargin", "rightMargin", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getTopMargin", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomMargin", "getLeftMargin", "getRightMargin", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HeaderDTO {
        public static final int $stable = 0;

        @NotNull
        private final Paddings bottomMargin;

        @NotNull
        private final Paddings leftMargin;

        @NotNull
        private final Paddings rightMargin;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        @NotNull
        private final Paddings topMargin;

        public HeaderDTO(@NotNull TextDTO title, TextDTO textDTO, @NotNull Paddings topMargin, @NotNull Paddings bottomMargin, @NotNull Paddings leftMargin, @NotNull Paddings rightMargin) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(topMargin, "topMargin");
            Intrinsics.checkNotNullParameter(bottomMargin, "bottomMargin");
            Intrinsics.checkNotNullParameter(leftMargin, "leftMargin");
            Intrinsics.checkNotNullParameter(rightMargin, "rightMargin");
            this.title = title;
            this.subtitle = textDTO;
            this.topMargin = topMargin;
            this.bottomMargin = bottomMargin;
            this.leftMargin = leftMargin;
            this.rightMargin = rightMargin;
        }

        public static /* synthetic */ HeaderDTO copy$default(HeaderDTO headerDTO, TextDTO textDTO, TextDTO textDTO2, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = headerDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = headerDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                paddings = headerDTO.topMargin;
            }
            if ((i11 & 8) != 0) {
                paddings2 = headerDTO.bottomMargin;
            }
            if ((i11 & 16) != 0) {
                paddings3 = headerDTO.leftMargin;
            }
            if ((i11 & 32) != 0) {
                paddings4 = headerDTO.rightMargin;
            }
            Paddings paddings5 = paddings3;
            Paddings paddings6 = paddings4;
            return headerDTO.copy(textDTO, textDTO2, paddings, paddings2, paddings5, paddings6);
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
        /* renamed from: component3, reason: from getter */
        public final Paddings getTopMargin() {
            return this.topMargin;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getBottomMargin() {
            return this.bottomMargin;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final Paddings getLeftMargin() {
            return this.leftMargin;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final Paddings getRightMargin() {
            return this.rightMargin;
        }

        @NotNull
        public final HeaderDTO copy(@NotNull TextDTO title, TextDTO subtitle, @NotNull Paddings topMargin, @NotNull Paddings bottomMargin, @NotNull Paddings leftMargin, @NotNull Paddings rightMargin) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(topMargin, "topMargin");
            Intrinsics.checkNotNullParameter(bottomMargin, "bottomMargin");
            Intrinsics.checkNotNullParameter(leftMargin, "leftMargin");
            Intrinsics.checkNotNullParameter(rightMargin, "rightMargin");
            return new HeaderDTO(title, subtitle, topMargin, bottomMargin, leftMargin, rightMargin);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderDTO)) {
                return false;
            }
            HeaderDTO headerDTO = (HeaderDTO) other;
            return Intrinsics.d(this.title, headerDTO.title) && Intrinsics.d(this.subtitle, headerDTO.subtitle) && this.topMargin == headerDTO.topMargin && this.bottomMargin == headerDTO.bottomMargin && this.leftMargin == headerDTO.leftMargin && this.rightMargin == headerDTO.rightMargin;
        }

        @NotNull
        public final Paddings getBottomMargin() {
            return this.bottomMargin;
        }

        @NotNull
        public final Paddings getLeftMargin() {
            return this.leftMargin;
        }

        @NotNull
        public final Paddings getRightMargin() {
            return this.rightMargin;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final Paddings getTopMargin() {
            return this.topMargin;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextDTO textDTO = this.subtitle;
            return this.rightMargin.hashCode() + b.b(this.leftMargin, b.b(this.bottomMargin, b.b(this.topMargin, (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            Paddings paddings = this.topMargin;
            Paddings paddings2 = this.bottomMargin;
            Paddings paddings3 = this.leftMargin;
            Paddings paddings4 = this.rightMargin;
            StringBuilder g10 = g.g("HeaderDTO(title=", textDTO, ", subtitle=", textDTO2, ", topMargin=");
            a.e(g10, paddings, ", bottomMargin=", paddings2, ", leftMargin=");
            return b.e(g10, paddings3, ", rightMargin=", paddings4, ")");
        }

        public /* synthetic */ HeaderDTO(TextDTO textDTO, TextDTO textDTO2, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textDTO, textDTO2, (i11 & 4) != 0 ? Paddings.NONE : paddings, (i11 & 8) != 0 ? Paddings.NONE : paddings2, (i11 & 16) != 0 ? Paddings.NONE : paddings3, (i11 & 32) != 0 ? Paddings.NONE : paddings4);
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002>?B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0001HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0010HÆ\u0003J\t\u00105\u001a\u00020\u0012HÆ\u0003J\u0017\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u0091\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001f\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006@"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$TileItem;", "", "image", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "productQuantity", "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "separator", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$TileItem$Separator;", "backgroundColor", "radius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "spacers", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$TileItem$Spacers;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Object;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$TileItem$Separator;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$TileItem$Spacers;Ljava/util/Map;)V", "getImage", "()Ljava/lang/String;", "getTitle", "()Ljava/lang/Object;", "getProductQuantity", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getSeparator", "()Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$TileItem$Separator;", "getBackgroundColor", "getRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getSpacers", "()Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$TileItem$Spacers;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "Separator", "Spacers", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class TileItem {
        public static final int $stable = 8;
        private final String backgroundColor;
        private final IconDTO icon;

        @NotNull
        private final String image;
        private final PriceDTO price;
        private final TextDTO productQuantity;

        @NotNull
        private final CornerRadius radius;
        private final Separator separator;

        @NotNull
        private final Spacers spacers;
        private final Object subtitle;

        @NotNull
        private final Object title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$TileItem$Separator;", "", "color", "", "height", "", "<init>", "(Ljava/lang/String;Ljava/lang/Float;)V", "getColor", "()Ljava/lang/String;", "getHeight", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Float;)Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$TileItem$Separator;", "equals", "", "other", "hashCode", "", "toString", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Separator {
            public static final int $stable = 0;
            private final String color;
            private final Float height;

            public Separator(String str, Float f7) {
                this.color = str;
                this.height = f7;
            }

            public static /* synthetic */ Separator copy$default(Separator separator, String str, Float f7, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = separator.color;
                }
                if ((i11 & 2) != 0) {
                    f7 = separator.height;
                }
                return separator.copy(str, f7);
            }

            /* renamed from: component1, reason: from getter */
            public final String getColor() {
                return this.color;
            }

            /* renamed from: component2, reason: from getter */
            public final Float getHeight() {
                return this.height;
            }

            @NotNull
            public final Separator copy(String color, Float height) {
                return new Separator(color, height);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Separator)) {
                    return false;
                }
                Separator separator = (Separator) other;
                return Intrinsics.d(this.color, separator.color) && Intrinsics.d(this.height, separator.height);
            }

            public final String getColor() {
                return this.color;
            }

            public final Float getHeight() {
                return this.height;
            }

            public int hashCode() {
                String str = this.color;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Float f7 = this.height;
                return hashCode + (f7 != null ? f7.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Separator(color=" + this.color + ", height=" + this.height + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$TileItem$Spacers;", "", "vertical", "Lru/ozon/uni/atoms/data/common/Paddings;", "horizontal", "between", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getVertical", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getHorizontal", "getBetween", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Spacers {
            public static final int $stable = 0;

            @NotNull
            private final Paddings between;

            @NotNull
            private final Paddings horizontal;

            @NotNull
            private final Paddings vertical;

            public Spacers() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ Spacers copy$default(Spacers spacers, Paddings paddings, Paddings paddings2, Paddings paddings3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    paddings = spacers.vertical;
                }
                if ((i11 & 2) != 0) {
                    paddings2 = spacers.horizontal;
                }
                if ((i11 & 4) != 0) {
                    paddings3 = spacers.between;
                }
                return spacers.copy(paddings, paddings2, paddings3);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final Paddings getVertical() {
                return this.vertical;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final Paddings getHorizontal() {
                return this.horizontal;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final Paddings getBetween() {
                return this.between;
            }

            @NotNull
            public final Spacers copy(@NotNull Paddings vertical, @NotNull Paddings horizontal, @NotNull Paddings between) {
                Intrinsics.checkNotNullParameter(vertical, "vertical");
                Intrinsics.checkNotNullParameter(horizontal, "horizontal");
                Intrinsics.checkNotNullParameter(between, "between");
                return new Spacers(vertical, horizontal, between);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Spacers)) {
                    return false;
                }
                Spacers spacers = (Spacers) other;
                return this.vertical == spacers.vertical && this.horizontal == spacers.horizontal && this.between == spacers.between;
            }

            @NotNull
            public final Paddings getBetween() {
                return this.between;
            }

            @NotNull
            public final Paddings getHorizontal() {
                return this.horizontal;
            }

            @NotNull
            public final Paddings getVertical() {
                return this.vertical;
            }

            public int hashCode() {
                return this.between.hashCode() + b.b(this.horizontal, this.vertical.hashCode() * 31, 31);
            }

            @NotNull
            public String toString() {
                Paddings paddings = this.vertical;
                Paddings paddings2 = this.horizontal;
                return D40.b.b(p.b("Spacers(vertical=", paddings, ", horizontal=", paddings2, ", between="), this.between, ")");
            }

            public Spacers(@NotNull Paddings vertical, @NotNull Paddings horizontal, @NotNull Paddings between) {
                Intrinsics.checkNotNullParameter(vertical, "vertical");
                Intrinsics.checkNotNullParameter(horizontal, "horizontal");
                Intrinsics.checkNotNullParameter(between, "between");
                this.vertical = vertical;
                this.horizontal = horizontal;
                this.between = between;
            }

            public /* synthetic */ Spacers(Paddings paddings, Paddings paddings2, Paddings paddings3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? Paddings.PADDING_400 : paddings, (i11 & 2) != 0 ? Paddings.PADDING_500 : paddings2, (i11 & 4) != 0 ? Paddings.PADDING_350 : paddings3);
            }
        }

        public TileItem(@NotNull String image, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "textPair", type = FreshTextPairDTO.class), @ProtoOneOfSignature(name = "textAtom", type = TextDTO.class)}) @NotNull @ProtoOneOf Object title, TextDTO textDTO, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "subtitleTextAtom", type = TextDTO.class), @ProtoOneOfSignature(name = "subtitleBadge", type = BadgeDTO.class)}) @ProtoOneOf Object obj, IconDTO iconDTO, PriceDTO priceDTO, Separator separator, String str, @NotNull CornerRadius radius, @NotNull Spacers spacers, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(radius, "radius");
            Intrinsics.checkNotNullParameter(spacers, "spacers");
            this.image = image;
            this.title = title;
            this.productQuantity = textDTO;
            this.subtitle = obj;
            this.icon = iconDTO;
            this.price = priceDTO;
            this.separator = separator;
            this.backgroundColor = str;
            this.radius = radius;
            this.spacers = spacers;
            this.trackingInfo = map;
        }

        public static /* synthetic */ TileItem copy$default(TileItem tileItem, String str, Object obj, TextDTO textDTO, Object obj2, IconDTO iconDTO, PriceDTO priceDTO, Separator separator, String str2, CornerRadius cornerRadius, Spacers spacers, Map map, int i11, Object obj3) {
            if ((i11 & 1) != 0) {
                str = tileItem.image;
            }
            if ((i11 & 2) != 0) {
                obj = tileItem.title;
            }
            if ((i11 & 4) != 0) {
                textDTO = tileItem.productQuantity;
            }
            if ((i11 & 8) != 0) {
                obj2 = tileItem.subtitle;
            }
            if ((i11 & 16) != 0) {
                iconDTO = tileItem.icon;
            }
            if ((i11 & 32) != 0) {
                priceDTO = tileItem.price;
            }
            if ((i11 & 64) != 0) {
                separator = tileItem.separator;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str2 = tileItem.backgroundColor;
            }
            if ((i11 & 256) != 0) {
                cornerRadius = tileItem.radius;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                spacers = tileItem.spacers;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                map = tileItem.trackingInfo;
            }
            Spacers spacers2 = spacers;
            Map map2 = map;
            String str3 = str2;
            CornerRadius cornerRadius2 = cornerRadius;
            PriceDTO priceDTO2 = priceDTO;
            Separator separator2 = separator;
            IconDTO iconDTO2 = iconDTO;
            TextDTO textDTO2 = textDTO;
            return tileItem.copy(str, obj, textDTO2, obj2, iconDTO2, priceDTO2, separator2, str3, cornerRadius2, spacers2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component10, reason: from getter */
        public final Spacers getSpacers() {
            return this.spacers;
        }

        public final Map<String, TokenizedTrackingInfo> component11() {
            return this.trackingInfo;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Object getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getProductQuantity() {
            return this.productQuantity;
        }

        /* renamed from: component4, reason: from getter */
        public final Object getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component5, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component6, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        /* renamed from: component7, reason: from getter */
        public final Separator getSeparator() {
            return this.separator;
        }

        /* renamed from: component8, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component9, reason: from getter */
        public final CornerRadius getRadius() {
            return this.radius;
        }

        @NotNull
        public final TileItem copy(@NotNull String image, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "textPair", type = FreshTextPairDTO.class), @ProtoOneOfSignature(name = "textAtom", type = TextDTO.class)}) @NotNull @ProtoOneOf Object title, TextDTO productQuantity, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "subtitleTextAtom", type = TextDTO.class), @ProtoOneOfSignature(name = "subtitleBadge", type = BadgeDTO.class)}) @ProtoOneOf Object subtitle, IconDTO icon, PriceDTO price, Separator separator, String backgroundColor, @NotNull CornerRadius radius, @NotNull Spacers spacers, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(radius, "radius");
            Intrinsics.checkNotNullParameter(spacers, "spacers");
            return new TileItem(image, title, productQuantity, subtitle, icon, price, separator, backgroundColor, radius, spacers, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TileItem)) {
                return false;
            }
            TileItem tileItem = (TileItem) other;
            return Intrinsics.d(this.image, tileItem.image) && Intrinsics.d(this.title, tileItem.title) && Intrinsics.d(this.productQuantity, tileItem.productQuantity) && Intrinsics.d(this.subtitle, tileItem.subtitle) && Intrinsics.d(this.icon, tileItem.icon) && Intrinsics.d(this.price, tileItem.price) && Intrinsics.d(this.separator, tileItem.separator) && Intrinsics.d(this.backgroundColor, tileItem.backgroundColor) && this.radius == tileItem.radius && Intrinsics.d(this.spacers, tileItem.spacers) && Intrinsics.d(this.trackingInfo, tileItem.trackingInfo);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final PriceDTO getPrice() {
            return this.price;
        }

        public final TextDTO getProductQuantity() {
            return this.productQuantity;
        }

        @NotNull
        public final CornerRadius getRadius() {
            return this.radius;
        }

        public final Separator getSeparator() {
            return this.separator;
        }

        @NotNull
        public final Spacers getSpacers() {
            return this.spacers;
        }

        public final Object getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final Object getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int c11 = H00.a.c(this.image.hashCode() * 31, 31, this.title);
            TextDTO textDTO = this.productQuantity;
            int hashCode = (c11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            Object obj = this.subtitle;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            IconDTO iconDTO = this.icon;
            int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            PriceDTO priceDTO = this.price;
            int hashCode4 = (hashCode3 + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
            Separator separator = this.separator;
            int hashCode5 = (hashCode4 + (separator == null ? 0 : separator.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode6 = (this.spacers.hashCode() + Tl.b.b(this.radius, (hashCode5 + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode6 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            Object obj = this.title;
            TextDTO textDTO = this.productQuantity;
            Object obj2 = this.subtitle;
            IconDTO iconDTO = this.icon;
            PriceDTO priceDTO = this.price;
            Separator separator = this.separator;
            String str2 = this.backgroundColor;
            CornerRadius cornerRadius = this.radius;
            Spacers spacers = this.spacers;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("TileItem(image=");
            sb2.append(str);
            sb2.append(", title=");
            sb2.append(obj);
            sb2.append(", productQuantity=");
            sb2.append(textDTO);
            sb2.append(", subtitle=");
            sb2.append(obj2);
            sb2.append(", icon=");
            sb2.append(iconDTO);
            sb2.append(", price=");
            sb2.append(priceDTO);
            sb2.append(", separator=");
            sb2.append(separator);
            sb2.append(", backgroundColor=");
            sb2.append(str2);
            sb2.append(", radius=");
            sb2.append(cornerRadius);
            sb2.append(", spacers=");
            sb2.append(spacers);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }

        public /* synthetic */ TileItem(String str, Object obj, TextDTO textDTO, Object obj2, IconDTO iconDTO, PriceDTO priceDTO, Separator separator, String str2, CornerRadius cornerRadius, Spacers spacers, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, obj, textDTO, obj2, iconDTO, priceDTO, separator, str2, (i11 & 256) != 0 ? CornerRadius.NO_RADIUS : cornerRadius, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? new Spacers(null, null, null, 7, null) : spacers, map);
        }
    }
}
