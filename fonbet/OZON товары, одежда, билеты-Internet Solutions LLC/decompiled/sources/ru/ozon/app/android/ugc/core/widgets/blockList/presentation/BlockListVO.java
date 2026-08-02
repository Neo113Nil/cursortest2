package ru.ozon.app.android.ugc.core.widgets.blockList.presentation;

import B3.p;
import Bi.a;
import Kk.C3532b;
import Tg.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.cellList.v2.data.CellListV2DTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001:\u0004,-./BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010\u0012R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+¨\u00060"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$TopContainer;", "topContainer", "Lru/ozon/app/android/common/cellList/v2/data/CellListV2DTO;", "bottomContainer", "Lru/ozon/uni/atoms/data/common/Paddings;", "horizontalPadding", "", "backgroundColor", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$TopContainer;Lru/ozon/app/android/common/cellList/v2/data/CellListV2DTO;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$TopContainer;", "getTopContainer", "()Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$TopContainer;", "Lru/ozon/app/android/common/cellList/v2/data/CellListV2DTO;", "getBottomContainer", "()Lru/ozon/app/android/common/cellList/v2/data/CellListV2DTO;", "Lru/ozon/uni/atoms/data/common/Paddings;", "getHorizontalPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "Ljava/lang/String;", "getBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "TopContainer", "BlockVO", "CommonVO", "LayoutPaddingsVO", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlockListVO implements c {
    private final String backgroundColor;
    private final CellListV2DTO bottomContainer;
    private final Paddings horizontalPadding;
    private final long id;
    private final t tokenizedEvent;

    @NotNull
    private final TopContainer topContainer;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$BlockVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$CommonVO;", "common", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$CommonVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$CommonVO;", "getCommon", "()Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$CommonVO;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BlockVO {
        private final CommonVO common;
        private final IconDTO icon;
        private final ImageDTO image;

        @NotNull
        private final TextDTO text;

        public BlockVO(@NotNull TextDTO text, ImageDTO imageDTO, IconDTO iconDTO, CommonVO commonVO) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.image = imageDTO;
            this.icon = iconDTO;
            this.common = commonVO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BlockVO)) {
                return false;
            }
            BlockVO blockVO = (BlockVO) other;
            return Intrinsics.d(this.text, blockVO.text) && Intrinsics.d(this.image, blockVO.image) && Intrinsics.d(this.icon, blockVO.icon) && Intrinsics.d(this.common, blockVO.common);
        }

        public final CommonVO getCommon() {
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
            CommonVO commonVO = this.common;
            return hashCode3 + (commonVO != null ? commonVO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "BlockVO(text=" + this.text + ", image=" + this.image + ", icon=" + this.icon + ", common=" + this.common + ")";
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$CommonVO;", "", "", "backgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$LayoutPaddingsVO;", "paddings", "LTg/b;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$LayoutPaddingsVO;LTg/b;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$LayoutPaddingsVO;", "getPaddings", "()Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$LayoutPaddingsVO;", "LTg/b;", "getAction", "()LTg/b;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CommonVO {
        private final b action;
        private final String backgroundColor;
        private final CornerRadius cornerRadius;
        private final LayoutPaddingsVO paddings;
        private final t tokenizedEvent;

        public CommonVO(String str, CornerRadius cornerRadius, LayoutPaddingsVO layoutPaddingsVO, b bVar, t tVar) {
            this.backgroundColor = str;
            this.cornerRadius = cornerRadius;
            this.paddings = layoutPaddingsVO;
            this.action = bVar;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommonVO)) {
                return false;
            }
            CommonVO commonVO = (CommonVO) other;
            return Intrinsics.d(this.backgroundColor, commonVO.backgroundColor) && this.cornerRadius == commonVO.cornerRadius && Intrinsics.d(this.paddings, commonVO.paddings) && Intrinsics.d(this.action, commonVO.action) && Intrinsics.d(this.tokenizedEvent, commonVO.tokenizedEvent);
        }

        public final b getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        public final LayoutPaddingsVO getPaddings() {
            return this.paddings;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            CornerRadius cornerRadius = this.cornerRadius;
            int hashCode2 = (hashCode + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
            LayoutPaddingsVO layoutPaddingsVO = this.paddings;
            int hashCode3 = (hashCode2 + (layoutPaddingsVO == null ? 0 : layoutPaddingsVO.hashCode())) * 31;
            b bVar = this.action;
            int hashCode4 = (hashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColor;
            CornerRadius cornerRadius = this.cornerRadius;
            LayoutPaddingsVO layoutPaddingsVO = this.paddings;
            b bVar = this.action;
            t tVar = this.tokenizedEvent;
            StringBuilder sb2 = new StringBuilder("CommonVO(backgroundColor=");
            sb2.append(str);
            sb2.append(", cornerRadius=");
            sb2.append(cornerRadius);
            sb2.append(", paddings=");
            sb2.append(layoutPaddingsVO);
            sb2.append(", action=");
            sb2.append(bVar);
            sb2.append(", tokenizedEvent=");
            return Tl.b.d(sb2, tVar, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$LayoutPaddingsVO;", "", "Lru/ozon/uni/atoms/data/common/Paddings;", "topPadding", "bottomPadding", "leftPadding", "rightPadding", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/common/Paddings;", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getLeftPadding", "getRightPadding", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LayoutPaddingsVO {
        private final Paddings bottomPadding;
        private final Paddings leftPadding;
        private final Paddings rightPadding;
        private final Paddings topPadding;

        public LayoutPaddingsVO(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4) {
            this.topPadding = paddings;
            this.bottomPadding = paddings2;
            this.leftPadding = paddings3;
            this.rightPadding = paddings4;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LayoutPaddingsVO)) {
                return false;
            }
            LayoutPaddingsVO layoutPaddingsVO = (LayoutPaddingsVO) other;
            return this.topPadding == layoutPaddingsVO.topPadding && this.bottomPadding == layoutPaddingsVO.bottomPadding && this.leftPadding == layoutPaddingsVO.leftPadding && this.rightPadding == layoutPaddingsVO.rightPadding;
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
            return GR.b.e(p.b("LayoutPaddingsVO(topPadding=", paddings, ", bottomPadding=", paddings2, ", leftPadding="), this.leftPadding, ", rightPadding=", this.rightPadding, ")");
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0006\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$TopContainer;", "", "", "Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$BlockVO;", "blocks", "", "isReversed", "Lru/ozon/uni/atoms/data/common/Paddings;", "verticalPadding", "horizontalPadding", "<init>", "(Ljava/util/List;ZLru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBlocks", "()Ljava/util/List;", "Z", "()Z", "Lru/ozon/uni/atoms/data/common/Paddings;", "getVerticalPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getHorizontalPadding", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TopContainer {

        @NotNull
        private final List<BlockVO> blocks;
        private final Paddings horizontalPadding;
        private final boolean isReversed;
        private final Paddings verticalPadding;

        public TopContainer(@NotNull List<BlockVO> blocks, boolean z11, Paddings paddings, Paddings paddings2) {
            Intrinsics.checkNotNullParameter(blocks, "blocks");
            this.blocks = blocks;
            this.isReversed = z11;
            this.verticalPadding = paddings;
            this.horizontalPadding = paddings2;
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
        public final List<BlockVO> getBlocks() {
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

        /* renamed from: isReversed, reason: from getter */
        public final boolean getIsReversed() {
            return this.isReversed;
        }

        @NotNull
        public String toString() {
            List<BlockVO> list = this.blocks;
            boolean z11 = this.isReversed;
            Paddings paddings = this.verticalPadding;
            Paddings paddings2 = this.horizontalPadding;
            StringBuilder sb2 = new StringBuilder("TopContainer(blocks=");
            sb2.append(list);
            sb2.append(", isReversed=");
            sb2.append(z11);
            sb2.append(", verticalPadding=");
            return GR.b.e(sb2, paddings, ", horizontalPadding=", paddings2, ")");
        }
    }

    public BlockListVO(long j11, @NotNull TopContainer topContainer, CellListV2DTO cellListV2DTO, Paddings paddings, String str, t tVar) {
        Intrinsics.checkNotNullParameter(topContainer, "topContainer");
        this.id = j11;
        this.topContainer = topContainer;
        this.bottomContainer = cellListV2DTO;
        this.horizontalPadding = paddings;
        this.backgroundColor = str;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockListVO)) {
            return false;
        }
        BlockListVO blockListVO = (BlockListVO) other;
        return this.id == blockListVO.id && Intrinsics.d(this.topContainer, blockListVO.topContainer) && Intrinsics.d(this.bottomContainer, blockListVO.bottomContainer) && this.horizontalPadding == blockListVO.horizontalPadding && Intrinsics.d(this.backgroundColor, blockListVO.backgroundColor) && Intrinsics.d(this.tokenizedEvent, blockListVO.tokenizedEvent);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Paddings getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @NotNull
    public final TopContainer getTopContainer() {
        return this.topContainer;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.topContainer.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        CellListV2DTO cellListV2DTO = this.bottomContainer;
        int hashCode2 = (hashCode + (cellListV2DTO == null ? 0 : cellListV2DTO.hashCode())) * 31;
        Paddings paddings = this.horizontalPadding;
        int hashCode3 = (hashCode2 + (paddings == null ? 0 : paddings.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TopContainer topContainer = this.topContainer;
        CellListV2DTO cellListV2DTO = this.bottomContainer;
        Paddings paddings = this.horizontalPadding;
        String str = this.backgroundColor;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("BlockListVO(id=");
        sb2.append(j11);
        sb2.append(", topContainer=");
        sb2.append(topContainer);
        sb2.append(", bottomContainer=");
        sb2.append(cellListV2DTO);
        sb2.append(", horizontalPadding=");
        sb2.append(paddings);
        a.f(sb2, ", backgroundColor=", str, ", tokenizedEvent=", tVar);
        sb2.append(")");
        return sb2.toString();
    }
}
