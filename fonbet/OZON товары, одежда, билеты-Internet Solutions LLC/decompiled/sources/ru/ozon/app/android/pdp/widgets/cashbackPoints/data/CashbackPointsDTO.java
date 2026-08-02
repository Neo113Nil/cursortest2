package ru.ozon.app.android.pdp.widgets.cashbackPoints.data;

import C.o0;
import D3.g;
import Ns.b;
import Tz.C4055a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001 B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u000bHÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cashbackPoints/data/CashbackPointsDTO;", "", "blocks", "", "Lru/ozon/app/android/pdp/widgets/cashbackPoints/data/CashbackPointsDTO$Block;", "backgroundColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "hasBottomMargin", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Z)V", "getBlocks", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "getHasBottomMargin", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Block", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CashbackPointsDTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final List<Block> blocks;
    private final boolean hasBottomMargin;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cashbackPoints/data/CashbackPointsDTO$Block;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Block {
        public static final int $stable = 0;

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public Block(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.title = title;
            this.subtitle = subtitle;
            this.backgroundColor = backgroundColor;
        }

        public static /* synthetic */ Block copy$default(Block block, TextDTO textDTO, TextDTO textDTO2, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = block.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = block.subtitle;
            }
            if ((i11 & 4) != 0) {
                str = block.backgroundColor;
            }
            return block.copy(textDTO, textDTO2, str);
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

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final Block copy(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return new Block(title, subtitle, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Block)) {
                return false;
            }
            Block block = (Block) other;
            return Intrinsics.d(this.title, block.title) && Intrinsics.d(this.subtitle, block.subtitle) && Intrinsics.d(this.backgroundColor, block.backgroundColor);
        }

        @NotNull
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
            return this.backgroundColor.hashCode() + b.a(this.subtitle, this.title.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            return o0.c(g.g("Block(title=", textDTO, ", subtitle=", textDTO2, ", backgroundColor="), this.backgroundColor, ")");
        }
    }

    public CashbackPointsDTO(@NotNull List<Block> blocks, String str, Map<String, TokenizedTrackingInfo> map, boolean z11) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.blocks = blocks;
        this.backgroundColor = str;
        this.trackingInfo = map;
        this.hasBottomMargin = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashbackPointsDTO copy$default(CashbackPointsDTO cashbackPointsDTO, List list, String str, Map map, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = cashbackPointsDTO.blocks;
        }
        if ((i11 & 2) != 0) {
            str = cashbackPointsDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            map = cashbackPointsDTO.trackingInfo;
        }
        if ((i11 & 8) != 0) {
            z11 = cashbackPointsDTO.hasBottomMargin;
        }
        return cashbackPointsDTO.copy(list, str, map, z11);
    }

    @NotNull
    public final List<Block> component1() {
        return this.blocks;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasBottomMargin() {
        return this.hasBottomMargin;
    }

    @NotNull
    public final CashbackPointsDTO copy(@NotNull List<Block> blocks, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo, boolean hasBottomMargin) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        return new CashbackPointsDTO(blocks, backgroundColor, trackingInfo, hasBottomMargin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashbackPointsDTO)) {
            return false;
        }
        CashbackPointsDTO cashbackPointsDTO = (CashbackPointsDTO) other;
        return Intrinsics.d(this.blocks, cashbackPointsDTO.blocks) && Intrinsics.d(this.backgroundColor, cashbackPointsDTO.backgroundColor) && Intrinsics.d(this.trackingInfo, cashbackPointsDTO.trackingInfo) && this.hasBottomMargin == cashbackPointsDTO.hasBottomMargin;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<Block> getBlocks() {
        return this.blocks;
    }

    public final boolean getHasBottomMargin() {
        return this.hasBottomMargin;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.blocks.hashCode() * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return Boolean.hashCode(this.hasBottomMargin) + ((hashCode2 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        List<Block> list = this.blocks;
        String str = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        boolean z11 = this.hasBottomMargin;
        StringBuilder a11 = C4055a.a("CashbackPointsDTO(blocks=", ", backgroundColor=", str, ", trackingInfo=", list);
        a11.append(map);
        a11.append(", hasBottomMargin=");
        a11.append(z11);
        a11.append(")");
        return a11.toString();
    }

    public /* synthetic */ CashbackPointsDTO(List list, String str, Map map, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, map, (i11 & 8) != 0 ? false : z11);
    }
}
