package ru.ozon.app.android.pdp.widgets.descriptionAccordion.data;

import C.o0;
import HY.a;
import HY.b;
import Tz.C4055a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001eB)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ8\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001d\u0010\r¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/descriptionAccordion/data/DescriptionAccordionDTO;", "", "", "Lru/ozon/app/android/pdp/widgets/descriptionAccordion/data/DescriptionAccordionDTO$Block;", "blocks", "", "backgroundColor", "tabGroupId", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/pdp/widgets/descriptionAccordion/data/DescriptionAccordionDTO;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBlocks", "Ljava/lang/String;", "getBackgroundColor", "getTabGroupId", "Block", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DescriptionAccordionDTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final List<Block> blocks;
    private final String tabGroupId;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J`\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0005\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0012R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/app/android/pdp/widgets/descriptionAccordion/data/DescriptionAccordionDTO$Block;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "isDisclosureOpen", "", "disclosureTintColor", "", "showSeparator", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDisclosureTintColor", "()Ljava/lang/String;", "getShowSeparator", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)Lru/ozon/app/android/pdp/widgets/descriptionAccordion/data/DescriptionAccordionDTO$Block;", "equals", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Block {
        public static final int $stable = 8;
        private final String disclosureTintColor;
        private final Boolean isDisclosureOpen;
        private final Boolean showSeparator;
        private final TextAtom subtitle;

        @NotNull
        private final TextAtom title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Block(@NotNull TextAtom title, TextAtom textAtom, Boolean bool, String str, Boolean bool2, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.subtitle = textAtom;
            this.isDisclosureOpen = bool;
            this.disclosureTintColor = str;
            this.showSeparator = bool2;
            this.trackingInfo = map;
        }

        public static /* synthetic */ Block copy$default(Block block, TextAtom textAtom, TextAtom textAtom2, Boolean bool, String str, Boolean bool2, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = block.title;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = block.subtitle;
            }
            if ((i11 & 4) != 0) {
                bool = block.isDisclosureOpen;
            }
            if ((i11 & 8) != 0) {
                str = block.disclosureTintColor;
            }
            if ((i11 & 16) != 0) {
                bool2 = block.showSeparator;
            }
            if ((i11 & 32) != 0) {
                map = block.trackingInfo;
            }
            Boolean bool3 = bool2;
            Map map2 = map;
            return block.copy(textAtom, textAtom2, bool, str, bool3, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getIsDisclosureOpen() {
            return this.isDisclosureOpen;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDisclosureTintColor() {
            return this.disclosureTintColor;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getShowSeparator() {
            return this.showSeparator;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final Block copy(@NotNull TextAtom title, TextAtom subtitle, Boolean isDisclosureOpen, String disclosureTintColor, Boolean showSeparator, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Block(title, subtitle, isDisclosureOpen, disclosureTintColor, showSeparator, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Block)) {
                return false;
            }
            Block block = (Block) other;
            return Intrinsics.d(this.title, block.title) && Intrinsics.d(this.subtitle, block.subtitle) && Intrinsics.d(this.isDisclosureOpen, block.isDisclosureOpen) && Intrinsics.d(this.disclosureTintColor, block.disclosureTintColor) && Intrinsics.d(this.showSeparator, block.showSeparator) && Intrinsics.d(this.trackingInfo, block.trackingInfo);
        }

        public final String getDisclosureTintColor() {
            return this.disclosureTintColor;
        }

        public final Boolean getShowSeparator() {
            return this.showSeparator;
        }

        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextAtom textAtom = this.subtitle;
            int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            Boolean bool = this.isDisclosureOpen;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.disclosureTintColor;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool2 = this.showSeparator;
            int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        public final Boolean isDisclosureOpen() {
            return this.isDisclosureOpen;
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            Boolean bool = this.isDisclosureOpen;
            String str = this.disclosureTintColor;
            Boolean bool2 = this.showSeparator;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder a11 = a.a("Block(title=", textAtom, ", subtitle=", textAtom2, ", isDisclosureOpen=");
            b.c(bool, ", disclosureTintColor=", str, ", showSeparator=", a11);
            a11.append(bool2);
            a11.append(", trackingInfo=");
            a11.append(map);
            a11.append(")");
            return a11.toString();
        }
    }

    public DescriptionAccordionDTO(@NotNull List<Block> blocks, String str, String str2) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.blocks = blocks;
        this.backgroundColor = str;
        this.tabGroupId = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DescriptionAccordionDTO copy$default(DescriptionAccordionDTO descriptionAccordionDTO, List list, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = descriptionAccordionDTO.blocks;
        }
        if ((i11 & 2) != 0) {
            str = descriptionAccordionDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            str2 = descriptionAccordionDTO.tabGroupId;
        }
        return descriptionAccordionDTO.copy(list, str, str2);
    }

    @NotNull
    public final List<Block> component1() {
        return this.blocks;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTabGroupId() {
        return this.tabGroupId;
    }

    @NotNull
    public final DescriptionAccordionDTO copy(@NotNull List<Block> blocks, String backgroundColor, String tabGroupId) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        return new DescriptionAccordionDTO(blocks, backgroundColor, tabGroupId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DescriptionAccordionDTO)) {
            return false;
        }
        DescriptionAccordionDTO descriptionAccordionDTO = (DescriptionAccordionDTO) other;
        return Intrinsics.d(this.blocks, descriptionAccordionDTO.blocks) && Intrinsics.d(this.backgroundColor, descriptionAccordionDTO.backgroundColor) && Intrinsics.d(this.tabGroupId, descriptionAccordionDTO.tabGroupId);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<Block> getBlocks() {
        return this.blocks;
    }

    public final String getTabGroupId() {
        return this.tabGroupId;
    }

    public int hashCode() {
        int hashCode = this.blocks.hashCode() * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tabGroupId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<Block> list = this.blocks;
        String str = this.backgroundColor;
        return o0.c(C4055a.a("DescriptionAccordionDTO(blocks=", ", backgroundColor=", str, ", tabGroupId=", list), this.tabGroupId, ")");
    }
}
