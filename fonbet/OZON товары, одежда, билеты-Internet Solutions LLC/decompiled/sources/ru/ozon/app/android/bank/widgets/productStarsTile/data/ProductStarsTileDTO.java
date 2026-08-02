package ru.ozon.app.android.bank.widgets.productStarsTile.data;

import C.o0;
import D3.g;
import Ns.b;
import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/bank/widgets/productStarsTile/data/ProductStarsTileDTO;", "", "firstBlock", "Lru/ozon/app/android/bank/widgets/productStarsTile/data/ProductStarsTileDTO$BlockDTO;", "secondBlock", "backgroundColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/bank/widgets/productStarsTile/data/ProductStarsTileDTO$BlockDTO;Lru/ozon/app/android/bank/widgets/productStarsTile/data/ProductStarsTileDTO$BlockDTO;Ljava/lang/String;Ljava/util/Map;)V", "getFirstBlock", "()Lru/ozon/app/android/bank/widgets/productStarsTile/data/ProductStarsTileDTO$BlockDTO;", "getSecondBlock", "getBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "BlockDTO", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProductStarsTileDTO {
    private final String backgroundColor;

    @NotNull
    private final BlockDTO firstBlock;

    @NotNull
    private final BlockDTO secondBlock;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/bank/widgets/productStarsTile/data/ProductStarsTileDTO$BlockDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BlockDTO {
        private final String backgroundColor;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public BlockDTO(@NotNull TextDTO title, @NotNull TextDTO subtitle, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.title = title;
            this.subtitle = subtitle;
            this.backgroundColor = str;
        }

        public static /* synthetic */ BlockDTO copy$default(BlockDTO blockDTO, TextDTO textDTO, TextDTO textDTO2, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = blockDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = blockDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                str = blockDTO.backgroundColor;
            }
            return blockDTO.copy(textDTO, textDTO2, str);
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

        /* renamed from: component3, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final BlockDTO copy(@NotNull TextDTO title, @NotNull TextDTO subtitle, String backgroundColor) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new BlockDTO(title, subtitle, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BlockDTO)) {
                return false;
            }
            BlockDTO blockDTO = (BlockDTO) other;
            return Intrinsics.d(this.title, blockDTO.title) && Intrinsics.d(this.subtitle, blockDTO.subtitle) && Intrinsics.d(this.backgroundColor, blockDTO.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = b.a(this.subtitle, this.title.hashCode() * 31, 31);
            String str = this.backgroundColor;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            return o0.c(g.g("BlockDTO(title=", textDTO, ", subtitle=", textDTO2, ", backgroundColor="), this.backgroundColor, ")");
        }
    }

    public ProductStarsTileDTO(@NotNull BlockDTO firstBlock, @NotNull BlockDTO secondBlock, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(firstBlock, "firstBlock");
        Intrinsics.checkNotNullParameter(secondBlock, "secondBlock");
        this.firstBlock = firstBlock;
        this.secondBlock = secondBlock;
        this.backgroundColor = str;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductStarsTileDTO copy$default(ProductStarsTileDTO productStarsTileDTO, BlockDTO blockDTO, BlockDTO blockDTO2, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            blockDTO = productStarsTileDTO.firstBlock;
        }
        if ((i11 & 2) != 0) {
            blockDTO2 = productStarsTileDTO.secondBlock;
        }
        if ((i11 & 4) != 0) {
            str = productStarsTileDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            map = productStarsTileDTO.trackingInfo;
        }
        return productStarsTileDTO.copy(blockDTO, blockDTO2, str, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlockDTO getFirstBlock() {
        return this.firstBlock;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlockDTO getSecondBlock() {
        return this.secondBlock;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final ProductStarsTileDTO copy(@NotNull BlockDTO firstBlock, @NotNull BlockDTO secondBlock, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(firstBlock, "firstBlock");
        Intrinsics.checkNotNullParameter(secondBlock, "secondBlock");
        return new ProductStarsTileDTO(firstBlock, secondBlock, backgroundColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductStarsTileDTO)) {
            return false;
        }
        ProductStarsTileDTO productStarsTileDTO = (ProductStarsTileDTO) other;
        return Intrinsics.d(this.firstBlock, productStarsTileDTO.firstBlock) && Intrinsics.d(this.secondBlock, productStarsTileDTO.secondBlock) && Intrinsics.d(this.backgroundColor, productStarsTileDTO.backgroundColor) && Intrinsics.d(this.trackingInfo, productStarsTileDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final BlockDTO getFirstBlock() {
        return this.firstBlock;
    }

    @NotNull
    public final BlockDTO getSecondBlock() {
        return this.secondBlock;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.secondBlock.hashCode() + (this.firstBlock.hashCode() * 31)) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        BlockDTO blockDTO = this.firstBlock;
        BlockDTO blockDTO2 = this.secondBlock;
        String str = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ProductStarsTileDTO(firstBlock=");
        sb2.append(blockDTO);
        sb2.append(", secondBlock=");
        sb2.append(blockDTO2);
        sb2.append(", backgroundColor=");
        return C4070a.a(sb2, str, ", trackingInfo=", map, ")");
    }
}
