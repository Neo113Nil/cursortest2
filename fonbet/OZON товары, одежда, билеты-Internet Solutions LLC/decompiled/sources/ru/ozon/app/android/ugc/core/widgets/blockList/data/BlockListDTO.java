package ru.ozon.app.android.ugc.core.widgets.blockList.data;

import B3.p;
import GR.b;
import Kk.C3532b;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.common.cellList.v2.data.CellListV2DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0004%&'(BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006)"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/blockList/data/BlockListDTO;", "", "topContainer", "Lru/ozon/app/android/ugc/core/widgets/blockList/data/BlockListDTO$TopContainer;", "bottomContainer", "Lru/ozon/app/android/common/cellList/v2/data/CellListV2DTO;", "horizontalPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "backgroundColor", "", "tracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/blockList/data/BlockListDTO$TopContainer;Lru/ozon/app/android/common/cellList/v2/data/CellListV2DTO;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/String;Ljava/util/Map;)V", "getTopContainer", "()Lru/ozon/app/android/ugc/core/widgets/blockList/data/BlockListDTO$TopContainer;", "getBottomContainer", "()Lru/ozon/app/android/common/cellList/v2/data/CellListV2DTO;", "getHorizontalPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBackgroundColor", "()Ljava/lang/String;", "getTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "TopContainer", "BlockDTO", "CommonDTO", "LayoutPaddingsDTO", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlockListDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final CellListV2DTO bottomContainer;
    private final Paddings horizontalPadding;

    @NotNull
    private final TopContainer topContainer;
    private final Map<String, TokenizedTrackingInfo> tracking;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/blockList/data/BlockListDTO$BlockDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "common", "Lru/ozon/app/android/ugc/core/widgets/blockList/data/BlockListDTO$CommonDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/ugc/core/widgets/blockList/data/BlockListDTO$CommonDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getCommon", "()Lru/ozon/app/android/ugc/core/widgets/blockList/data/BlockListDTO$CommonDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BlockDTO {
        public static final int $stable = 8;
        private final CommonDTO common;
        private final IconDTO icon;
        private final ImageDTO image;

        @NotNull
        private final TextDTO text;

        public BlockDTO(@NotNull TextDTO text, ImageDTO imageDTO, IconDTO iconDTO, CommonDTO commonDTO) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.image = imageDTO;
            this.icon = iconDTO;
            this.common = commonDTO;
        }

        public static /* synthetic */ BlockDTO copy$default(BlockDTO blockDTO, TextDTO textDTO, ImageDTO imageDTO, IconDTO iconDTO, CommonDTO commonDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = blockDTO.text;
            }
            if ((i11 & 2) != 0) {
                imageDTO = blockDTO.image;
            }
            if ((i11 & 4) != 0) {
                iconDTO = blockDTO.icon;
            }
            if ((i11 & 8) != 0) {
                commonDTO = blockDTO.common;
            }
            return blockDTO.copy(textDTO, imageDTO, iconDTO, commonDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        /* renamed from: component3, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component4, reason: from getter */
        public final CommonDTO getCommon() {
            return this.common;
        }

        @NotNull
        public final BlockDTO copy(@NotNull TextDTO text, ImageDTO image, IconDTO icon, CommonDTO common) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new BlockDTO(text, image, icon, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BlockDTO)) {
                return false;
            }
            BlockDTO blockDTO = (BlockDTO) other;
            return Intrinsics.d(this.text, blockDTO.text) && Intrinsics.d(this.image, blockDTO.image) && Intrinsics.d(this.icon, blockDTO.icon) && Intrinsics.d(this.common, blockDTO.common);
        }

        public final CommonDTO getCommon() {
            return this.common;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            ImageDTO imageDTO = this.image;
            int hashCode2 = (hashCode + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
            IconDTO iconDTO = this.icon;
            int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            CommonDTO commonDTO = this.common;
            return hashCode3 + (commonDTO != null ? commonDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "BlockDTO(text=" + this.text + ", image=" + this.image + ", icon=" + this.icon + ", common=" + this.common + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/blockList/data/BlockListDTO$CommonDTO;", "", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "paddings", "Lru/ozon/app/android/ugc/core/widgets/blockList/data/BlockListDTO$LayoutPaddingsDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "tracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/ugc/core/widgets/blockList/data/BlockListDTO$LayoutPaddingsDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getPaddings", "()Lru/ozon/app/android/ugc/core/widgets/blockList/data/BlockListDTO$LayoutPaddingsDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CommonDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final String backgroundColor;
        private final CornerRadius cornerRadius;
        private final LayoutPaddingsDTO paddings;
        private final Map<String, TokenizedTrackingInfo> tracking;

        public CommonDTO(String str, CornerRadius cornerRadius, LayoutPaddingsDTO layoutPaddingsDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            this.backgroundColor = str;
            this.cornerRadius = cornerRadius;
            this.paddings = layoutPaddingsDTO;
            this.action = atomActionDTO;
            this.tracking = map;
        }

        public static /* synthetic */ CommonDTO copy$default(CommonDTO commonDTO, String str, CornerRadius cornerRadius, LayoutPaddingsDTO layoutPaddingsDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = commonDTO.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                cornerRadius = commonDTO.cornerRadius;
            }
            if ((i11 & 4) != 0) {
                layoutPaddingsDTO = commonDTO.paddings;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = commonDTO.action;
            }
            if ((i11 & 16) != 0) {
                map = commonDTO.tracking;
            }
            Map map2 = map;
            LayoutPaddingsDTO layoutPaddingsDTO2 = layoutPaddingsDTO;
            return commonDTO.copy(str, cornerRadius, layoutPaddingsDTO2, atomActionDTO, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        /* renamed from: component3, reason: from getter */
        public final LayoutPaddingsDTO getPaddings() {
            return this.paddings;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.tracking;
        }

        @NotNull
        public final CommonDTO copy(String backgroundColor, CornerRadius cornerRadius, LayoutPaddingsDTO paddings, AtomActionDTO action, Map<String, TokenizedTrackingInfo> tracking) {
            return new CommonDTO(backgroundColor, cornerRadius, paddings, action, tracking);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommonDTO)) {
                return false;
            }
            CommonDTO commonDTO = (CommonDTO) other;
            return Intrinsics.d(this.backgroundColor, commonDTO.backgroundColor) && this.cornerRadius == commonDTO.cornerRadius && Intrinsics.d(this.paddings, commonDTO.paddings) && Intrinsics.d(this.action, commonDTO.action) && Intrinsics.d(this.tracking, commonDTO.tracking);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        public final LayoutPaddingsDTO getPaddings() {
            return this.paddings;
        }

        public final Map<String, TokenizedTrackingInfo> getTracking() {
            return this.tracking;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            CornerRadius cornerRadius = this.cornerRadius;
            int hashCode2 = (hashCode + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
            LayoutPaddingsDTO layoutPaddingsDTO = this.paddings;
            int hashCode3 = (hashCode2 + (layoutPaddingsDTO == null ? 0 : layoutPaddingsDTO.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.tracking;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColor;
            CornerRadius cornerRadius = this.cornerRadius;
            LayoutPaddingsDTO layoutPaddingsDTO = this.paddings;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.tracking;
            StringBuilder sb2 = new StringBuilder("CommonDTO(backgroundColor=");
            sb2.append(str);
            sb2.append(", cornerRadius=");
            sb2.append(cornerRadius);
            sb2.append(", paddings=");
            sb2.append(layoutPaddingsDTO);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", tracking=");
            return P.f(sb2, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/blockList/data/BlockListDTO$LayoutPaddingsDTO;", "", "topPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottomPadding", "leftPadding", "rightPadding", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getLeftPadding", "getRightPadding", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LayoutPaddingsDTO {
        public static final int $stable = 0;
        private final Paddings bottomPadding;
        private final Paddings leftPadding;
        private final Paddings rightPadding;
        private final Paddings topPadding;

        public LayoutPaddingsDTO(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4) {
            this.topPadding = paddings;
            this.bottomPadding = paddings2;
            this.leftPadding = paddings3;
            this.rightPadding = paddings4;
        }

        public static /* synthetic */ LayoutPaddingsDTO copy$default(LayoutPaddingsDTO layoutPaddingsDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = layoutPaddingsDTO.topPadding;
            }
            if ((i11 & 2) != 0) {
                paddings2 = layoutPaddingsDTO.bottomPadding;
            }
            if ((i11 & 4) != 0) {
                paddings3 = layoutPaddingsDTO.leftPadding;
            }
            if ((i11 & 8) != 0) {
                paddings4 = layoutPaddingsDTO.rightPadding;
            }
            return layoutPaddingsDTO.copy(paddings, paddings2, paddings3, paddings4);
        }

        /* renamed from: component1, reason: from getter */
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        public final LayoutPaddingsDTO copy(Paddings topPadding, Paddings bottomPadding, Paddings leftPadding, Paddings rightPadding) {
            return new LayoutPaddingsDTO(topPadding, bottomPadding, leftPadding, rightPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LayoutPaddingsDTO)) {
                return false;
            }
            LayoutPaddingsDTO layoutPaddingsDTO = (LayoutPaddingsDTO) other;
            return this.topPadding == layoutPaddingsDTO.topPadding && this.bottomPadding == layoutPaddingsDTO.bottomPadding && this.leftPadding == layoutPaddingsDTO.leftPadding && this.rightPadding == layoutPaddingsDTO.rightPadding;
        }

        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            Paddings paddings = this.topPadding;
            int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
            Paddings paddings2 = this.bottomPadding;
            int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
            Paddings paddings3 = this.leftPadding;
            int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
            Paddings paddings4 = this.rightPadding;
            return hashCode3 + (paddings4 != null ? paddings4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.topPadding;
            Paddings paddings2 = this.bottomPadding;
            return b.e(p.b("LayoutPaddingsDTO(topPadding=", paddings, ", bottomPadding=", paddings2, ", leftPadding="), this.leftPadding, ", rightPadding=", this.rightPadding, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/blockList/data/BlockListDTO$TopContainer;", "", "blocks", "", "Lru/ozon/app/android/ugc/core/widgets/blockList/data/BlockListDTO$BlockDTO;", "isReversed", "", "verticalPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "horizontalPadding", "<init>", "(Ljava/util/List;ZLru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getBlocks", "()Ljava/util/List;", "()Z", "getVerticalPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getHorizontalPadding", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TopContainer {
        public static final int $stable = 8;

        @NotNull
        private final List<BlockDTO> blocks;
        private final Paddings horizontalPadding;
        private final boolean isReversed;
        private final Paddings verticalPadding;

        public TopContainer(@NotNull List<BlockDTO> blocks, boolean z11, Paddings paddings, Paddings paddings2) {
            Intrinsics.checkNotNullParameter(blocks, "blocks");
            this.blocks = blocks;
            this.isReversed = z11;
            this.verticalPadding = paddings;
            this.horizontalPadding = paddings2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TopContainer copy$default(TopContainer topContainer, List list, boolean z11, Paddings paddings, Paddings paddings2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = topContainer.blocks;
            }
            if ((i11 & 2) != 0) {
                z11 = topContainer.isReversed;
            }
            if ((i11 & 4) != 0) {
                paddings = topContainer.verticalPadding;
            }
            if ((i11 & 8) != 0) {
                paddings2 = topContainer.horizontalPadding;
            }
            return topContainer.copy(list, z11, paddings, paddings2);
        }

        @NotNull
        public final List<BlockDTO> component1() {
            return this.blocks;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsReversed() {
            return this.isReversed;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getVerticalPadding() {
            return this.verticalPadding;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getHorizontalPadding() {
            return this.horizontalPadding;
        }

        @NotNull
        public final TopContainer copy(@NotNull List<BlockDTO> blocks, boolean isReversed, Paddings verticalPadding, Paddings horizontalPadding) {
            Intrinsics.checkNotNullParameter(blocks, "blocks");
            return new TopContainer(blocks, isReversed, verticalPadding, horizontalPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TopContainer)) {
                return false;
            }
            TopContainer topContainer = (TopContainer) other;
            return Intrinsics.d(this.blocks, topContainer.blocks) && this.isReversed == topContainer.isReversed && this.verticalPadding == topContainer.verticalPadding && this.horizontalPadding == topContainer.horizontalPadding;
        }

        @NotNull
        public final List<BlockDTO> getBlocks() {
            return this.blocks;
        }

        public final Paddings getHorizontalPadding() {
            return this.horizontalPadding;
        }

        public final Paddings getVerticalPadding() {
            return this.verticalPadding;
        }

        public int hashCode() {
            int a11 = C3532b.a(this.blocks.hashCode() * 31, 31, this.isReversed);
            Paddings paddings = this.verticalPadding;
            int hashCode = (a11 + (paddings == null ? 0 : paddings.hashCode())) * 31;
            Paddings paddings2 = this.horizontalPadding;
            return hashCode + (paddings2 != null ? paddings2.hashCode() : 0);
        }

        public final boolean isReversed() {
            return this.isReversed;
        }

        @NotNull
        public String toString() {
            List<BlockDTO> list = this.blocks;
            boolean z11 = this.isReversed;
            Paddings paddings = this.verticalPadding;
            Paddings paddings2 = this.horizontalPadding;
            StringBuilder sb2 = new StringBuilder("TopContainer(blocks=");
            sb2.append(list);
            sb2.append(", isReversed=");
            sb2.append(z11);
            sb2.append(", verticalPadding=");
            return b.e(sb2, paddings, ", horizontalPadding=", paddings2, ")");
        }
    }

    public BlockListDTO(@NotNull TopContainer topContainer, CellListV2DTO cellListV2DTO, Paddings paddings, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(topContainer, "topContainer");
        this.topContainer = topContainer;
        this.bottomContainer = cellListV2DTO;
        this.horizontalPadding = paddings;
        this.backgroundColor = str;
        this.tracking = map;
    }

    public static /* synthetic */ BlockListDTO copy$default(BlockListDTO blockListDTO, TopContainer topContainer, CellListV2DTO cellListV2DTO, Paddings paddings, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            topContainer = blockListDTO.topContainer;
        }
        if ((i11 & 2) != 0) {
            cellListV2DTO = blockListDTO.bottomContainer;
        }
        if ((i11 & 4) != 0) {
            paddings = blockListDTO.horizontalPadding;
        }
        if ((i11 & 8) != 0) {
            str = blockListDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            map = blockListDTO.tracking;
        }
        Map map2 = map;
        Paddings paddings2 = paddings;
        return blockListDTO.copy(topContainer, cellListV2DTO, paddings2, str, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TopContainer getTopContainer() {
        return this.topContainer;
    }

    /* renamed from: component2, reason: from getter */
    public final CellListV2DTO getBottomContainer() {
        return this.bottomContainer;
    }

    /* renamed from: component3, reason: from getter */
    public final Paddings getHorizontalPadding() {
        return this.horizontalPadding;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.tracking;
    }

    @NotNull
    public final BlockListDTO copy(@NotNull TopContainer topContainer, CellListV2DTO bottomContainer, Paddings horizontalPadding, String backgroundColor, Map<String, TokenizedTrackingInfo> tracking) {
        Intrinsics.checkNotNullParameter(topContainer, "topContainer");
        return new BlockListDTO(topContainer, bottomContainer, horizontalPadding, backgroundColor, tracking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockListDTO)) {
            return false;
        }
        BlockListDTO blockListDTO = (BlockListDTO) other;
        return Intrinsics.d(this.topContainer, blockListDTO.topContainer) && Intrinsics.d(this.bottomContainer, blockListDTO.bottomContainer) && this.horizontalPadding == blockListDTO.horizontalPadding && Intrinsics.d(this.backgroundColor, blockListDTO.backgroundColor) && Intrinsics.d(this.tracking, blockListDTO.tracking);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CellListV2DTO getBottomContainer() {
        return this.bottomContainer;
    }

    public final Paddings getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @NotNull
    public final TopContainer getTopContainer() {
        return this.topContainer;
    }

    public final Map<String, TokenizedTrackingInfo> getTracking() {
        return this.tracking;
    }

    public int hashCode() {
        int hashCode = this.topContainer.hashCode() * 31;
        CellListV2DTO cellListV2DTO = this.bottomContainer;
        int hashCode2 = (hashCode + (cellListV2DTO == null ? 0 : cellListV2DTO.hashCode())) * 31;
        Paddings paddings = this.horizontalPadding;
        int hashCode3 = (hashCode2 + (paddings == null ? 0 : paddings.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TopContainer topContainer = this.topContainer;
        CellListV2DTO cellListV2DTO = this.bottomContainer;
        Paddings paddings = this.horizontalPadding;
        String str = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        StringBuilder sb2 = new StringBuilder("BlockListDTO(topContainer=");
        sb2.append(topContainer);
        sb2.append(", bottomContainer=");
        sb2.append(cellListV2DTO);
        sb2.append(", horizontalPadding=");
        sb2.append(paddings);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", tracking=");
        return P.f(sb2, map, ")");
    }
}
