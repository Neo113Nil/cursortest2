package ru.ozon.app.android.storefront.widgets.naviCategories.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO;", "", "roundedCorners", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$RoundedCornersDTO;", "blocks", "", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$NaviCategoryBlockDTO;", "<init>", "(Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$RoundedCornersDTO;Ljava/util/List;)V", "getRoundedCorners", "()Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$RoundedCornersDTO;", "getBlocks", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "RoundedCornersDTO", "NaviCategoryBlockDTO", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NaviCategoriesDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<NaviCategoryBlockDTO> blocks;
    private final RoundedCornersDTO roundedCorners;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J[\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$NaviCategoryBlockDTO;", "", "type", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$NaviCategoryBlockDTO$BlockTypeDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "image", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$NaviCategoryBlockDTO$BlockTypeDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getType", "()Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$NaviCategoryBlockDTO$BlockTypeDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getImage", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "BlockTypeDTO", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class NaviCategoryBlockDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final String image;
        private final TextAtom subtitle;
        private final TextAtom title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @NotNull
        private final BlockTypeDTO type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$NaviCategoryBlockDTO$BlockTypeDTO;", "", "<init>", "(Ljava/lang/String;I)V", "SINGLE", "DOUBLE", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class BlockTypeDTO {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ BlockTypeDTO[] $VALUES;
            public static final BlockTypeDTO SINGLE = new BlockTypeDTO("SINGLE", 0);
            public static final BlockTypeDTO DOUBLE = new BlockTypeDTO("DOUBLE", 1);

            private static final /* synthetic */ BlockTypeDTO[] $values() {
                return new BlockTypeDTO[]{SINGLE, DOUBLE};
            }

            static {
                BlockTypeDTO[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private BlockTypeDTO(String str, int i11) {
            }

            public static BlockTypeDTO valueOf(String str) {
                return (BlockTypeDTO) Enum.valueOf(BlockTypeDTO.class, str);
            }

            public static BlockTypeDTO[] values() {
                return (BlockTypeDTO[]) $VALUES.clone();
            }
        }

        public NaviCategoryBlockDTO(@NotNull BlockTypeDTO type, TextAtom textAtom, TextAtom textAtom2, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.title = textAtom;
            this.subtitle = textAtom2;
            this.image = str;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ NaviCategoryBlockDTO copy$default(NaviCategoryBlockDTO naviCategoryBlockDTO, BlockTypeDTO blockTypeDTO, TextAtom textAtom, TextAtom textAtom2, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                blockTypeDTO = naviCategoryBlockDTO.type;
            }
            if ((i11 & 2) != 0) {
                textAtom = naviCategoryBlockDTO.title;
            }
            if ((i11 & 4) != 0) {
                textAtom2 = naviCategoryBlockDTO.subtitle;
            }
            if ((i11 & 8) != 0) {
                str = naviCategoryBlockDTO.image;
            }
            if ((i11 & 16) != 0) {
                atomActionDTO = naviCategoryBlockDTO.action;
            }
            if ((i11 & 32) != 0) {
                map = naviCategoryBlockDTO.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            return naviCategoryBlockDTO.copy(blockTypeDTO, textAtom, textAtom2, str, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final BlockTypeDTO getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component5, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final NaviCategoryBlockDTO copy(@NotNull BlockTypeDTO type, TextAtom title, TextAtom subtitle, String image, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new NaviCategoryBlockDTO(type, title, subtitle, image, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NaviCategoryBlockDTO)) {
                return false;
            }
            NaviCategoryBlockDTO naviCategoryBlockDTO = (NaviCategoryBlockDTO) other;
            return this.type == naviCategoryBlockDTO.type && Intrinsics.d(this.title, naviCategoryBlockDTO.title) && Intrinsics.d(this.subtitle, naviCategoryBlockDTO.subtitle) && Intrinsics.d(this.image, naviCategoryBlockDTO.image) && Intrinsics.d(this.action, naviCategoryBlockDTO.action) && Intrinsics.d(this.trackingInfo, naviCategoryBlockDTO.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getImage() {
            return this.image;
        }

        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        public final TextAtom getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @NotNull
        public final BlockTypeDTO getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            TextAtom textAtom = this.title;
            int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            TextAtom textAtom2 = this.subtitle;
            int hashCode3 = (hashCode2 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
            String str = this.image;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode5 = (hashCode4 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            BlockTypeDTO blockTypeDTO = this.type;
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            String str = this.image;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("NaviCategoryBlockDTO(type=");
            sb2.append(blockTypeDTO);
            sb2.append(", title=");
            sb2.append(textAtom);
            sb2.append(", subtitle=");
            sb2.append(textAtom2);
            sb2.append(", image=");
            sb2.append(str);
            sb2.append(", action=");
            return D40.a.d(sb2, atomActionDTO, ", trackingInfo=", map, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$RoundedCornersDTO;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "TOP", "BOTTOM", "ALL", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RoundedCornersDTO {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ RoundedCornersDTO[] $VALUES;
        public static final RoundedCornersDTO NONE = new RoundedCornersDTO("NONE", 0);
        public static final RoundedCornersDTO TOP = new RoundedCornersDTO("TOP", 1);
        public static final RoundedCornersDTO BOTTOM = new RoundedCornersDTO("BOTTOM", 2);
        public static final RoundedCornersDTO ALL = new RoundedCornersDTO("ALL", 3);

        private static final /* synthetic */ RoundedCornersDTO[] $values() {
            return new RoundedCornersDTO[]{NONE, TOP, BOTTOM, ALL};
        }

        static {
            RoundedCornersDTO[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private RoundedCornersDTO(String str, int i11) {
        }

        public static RoundedCornersDTO valueOf(String str) {
            return (RoundedCornersDTO) Enum.valueOf(RoundedCornersDTO.class, str);
        }

        public static RoundedCornersDTO[] values() {
            return (RoundedCornersDTO[]) $VALUES.clone();
        }
    }

    public NaviCategoriesDTO(RoundedCornersDTO roundedCornersDTO, @NotNull List<NaviCategoryBlockDTO> blocks) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.roundedCorners = roundedCornersDTO;
        this.blocks = blocks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NaviCategoriesDTO copy$default(NaviCategoriesDTO naviCategoriesDTO, RoundedCornersDTO roundedCornersDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            roundedCornersDTO = naviCategoriesDTO.roundedCorners;
        }
        if ((i11 & 2) != 0) {
            list = naviCategoriesDTO.blocks;
        }
        return naviCategoriesDTO.copy(roundedCornersDTO, list);
    }

    /* renamed from: component1, reason: from getter */
    public final RoundedCornersDTO getRoundedCorners() {
        return this.roundedCorners;
    }

    @NotNull
    public final List<NaviCategoryBlockDTO> component2() {
        return this.blocks;
    }

    @NotNull
    public final NaviCategoriesDTO copy(RoundedCornersDTO roundedCorners, @NotNull List<NaviCategoryBlockDTO> blocks) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        return new NaviCategoriesDTO(roundedCorners, blocks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NaviCategoriesDTO)) {
            return false;
        }
        NaviCategoriesDTO naviCategoriesDTO = (NaviCategoriesDTO) other;
        return this.roundedCorners == naviCategoriesDTO.roundedCorners && Intrinsics.d(this.blocks, naviCategoriesDTO.blocks);
    }

    @NotNull
    public final List<NaviCategoryBlockDTO> getBlocks() {
        return this.blocks;
    }

    public final RoundedCornersDTO getRoundedCorners() {
        return this.roundedCorners;
    }

    public int hashCode() {
        RoundedCornersDTO roundedCornersDTO = this.roundedCorners;
        return this.blocks.hashCode() + ((roundedCornersDTO == null ? 0 : roundedCornersDTO.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "NaviCategoriesDTO(roundedCorners=" + this.roundedCorners + ", blocks=" + this.blocks + ")";
    }
}
