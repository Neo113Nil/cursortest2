package ru.ozon.app.android.marketing.widgets.sellerActionsPreview.data;

import B0.C2454a;
import Bl.C2639a;
import C.o0;
import D40.a;
import Ef0.c;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.seller.molecule.progressLadder.data.ProgressLadderDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0001&BO\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0001HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J`\u0010\u001f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006'"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/data/SellerActionsPreviewDTO;", "", "cellFirst", "cellSecond", "backgroundColor", "", "verticalPadding", "", "horizontalPadding", "horizontalMargin", "containerBgColor", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getCellFirst", "()Ljava/lang/Object;", "getCellSecond", "getBackgroundColor", "()Ljava/lang/String;", "getVerticalPadding", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHorizontalPadding", "getHorizontalMargin", "getContainerBgColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/data/SellerActionsPreviewDTO;", "equals", "", "other", "hashCode", "toString", "LadderCell", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SellerActionsPreviewDTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final Object cellFirst;
    private final Object cellSecond;
    private final String containerBgColor;
    private final Integer horizontalMargin;
    private final Integer horizontalPadding;
    private final Integer verticalPadding;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003J]\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/data/SellerActionsPreviewDTO$LadderCell;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "iconLeft", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconRight", "progressLadder", "Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIconLeft", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIconRight", "getProgressLadder", "()Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LadderCell {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final IconDTO iconLeft;
        private final IconDTO iconRight;
        private final ProgressLadderDTO progressLadder;
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public LadderCell(TextDTO textDTO, IconDTO iconDTO, IconDTO iconDTO2, ProgressLadderDTO progressLadderDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            this.title = textDTO;
            this.iconLeft = iconDTO;
            this.iconRight = iconDTO2;
            this.progressLadder = progressLadderDTO;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ LadderCell copy$default(LadderCell ladderCell, TextDTO textDTO, IconDTO iconDTO, IconDTO iconDTO2, ProgressLadderDTO progressLadderDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = ladderCell.title;
            }
            if ((i11 & 2) != 0) {
                iconDTO = ladderCell.iconLeft;
            }
            if ((i11 & 4) != 0) {
                iconDTO2 = ladderCell.iconRight;
            }
            if ((i11 & 8) != 0) {
                progressLadderDTO = ladderCell.progressLadder;
            }
            if ((i11 & 16) != 0) {
                atomActionDTO = ladderCell.action;
            }
            if ((i11 & 32) != 0) {
                map = ladderCell.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            return ladderCell.copy(textDTO, iconDTO, iconDTO2, progressLadderDTO, atomActionDTO2, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final IconDTO getIconLeft() {
            return this.iconLeft;
        }

        /* renamed from: component3, reason: from getter */
        public final IconDTO getIconRight() {
            return this.iconRight;
        }

        /* renamed from: component4, reason: from getter */
        public final ProgressLadderDTO getProgressLadder() {
            return this.progressLadder;
        }

        /* renamed from: component5, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final LadderCell copy(TextDTO title, IconDTO iconLeft, IconDTO iconRight, ProgressLadderDTO progressLadder, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            return new LadderCell(title, iconLeft, iconRight, progressLadder, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LadderCell)) {
                return false;
            }
            LadderCell ladderCell = (LadderCell) other;
            return Intrinsics.d(this.title, ladderCell.title) && Intrinsics.d(this.iconLeft, ladderCell.iconLeft) && Intrinsics.d(this.iconRight, ladderCell.iconRight) && Intrinsics.d(this.progressLadder, ladderCell.progressLadder) && Intrinsics.d(this.action, ladderCell.action) && Intrinsics.d(this.trackingInfo, ladderCell.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final IconDTO getIconLeft() {
            return this.iconLeft;
        }

        public final IconDTO getIconRight() {
            return this.iconRight;
        }

        public final ProgressLadderDTO getProgressLadder() {
            return this.progressLadder;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            IconDTO iconDTO = this.iconLeft;
            int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            IconDTO iconDTO2 = this.iconRight;
            int hashCode3 = (hashCode2 + (iconDTO2 == null ? 0 : iconDTO2.hashCode())) * 31;
            ProgressLadderDTO progressLadderDTO = this.progressLadder;
            int hashCode4 = (hashCode3 + (progressLadderDTO == null ? 0 : progressLadderDTO.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode5 = (hashCode4 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            IconDTO iconDTO = this.iconLeft;
            IconDTO iconDTO2 = this.iconRight;
            ProgressLadderDTO progressLadderDTO = this.progressLadder;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C2639a.d("LadderCell(title=", ", iconLeft=", ", iconRight=", iconDTO, textDTO);
            d11.append(iconDTO2);
            d11.append(", progressLadder=");
            d11.append(progressLadderDTO);
            d11.append(", action=");
            return a.d(d11, atomActionDTO, ", trackingInfo=", map, ")");
        }
    }

    public SellerActionsPreviewDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "dsCell", type = CellDTO.class), @ProtoOneOfSignature(name = "cellWithLadder", type = LadderCell.class)}) @NotNull @ProtoOneOf(label = "type") Object cellFirst, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "dsCell", type = CellDTO.class), @ProtoOneOfSignature(name = "cellWithLadder", type = LadderCell.class)}) @ProtoOneOf(label = "type") Object obj, String str, Integer num, Integer num2, Integer num3, String str2) {
        Intrinsics.checkNotNullParameter(cellFirst, "cellFirst");
        this.cellFirst = cellFirst;
        this.cellSecond = obj;
        this.backgroundColor = str;
        this.verticalPadding = num;
        this.horizontalPadding = num2;
        this.horizontalMargin = num3;
        this.containerBgColor = str2;
    }

    public static /* synthetic */ SellerActionsPreviewDTO copy$default(SellerActionsPreviewDTO sellerActionsPreviewDTO, Object obj, Object obj2, String str, Integer num, Integer num2, Integer num3, String str2, int i11, Object obj3) {
        if ((i11 & 1) != 0) {
            obj = sellerActionsPreviewDTO.cellFirst;
        }
        if ((i11 & 2) != 0) {
            obj2 = sellerActionsPreviewDTO.cellSecond;
        }
        if ((i11 & 4) != 0) {
            str = sellerActionsPreviewDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            num = sellerActionsPreviewDTO.verticalPadding;
        }
        if ((i11 & 16) != 0) {
            num2 = sellerActionsPreviewDTO.horizontalPadding;
        }
        if ((i11 & 32) != 0) {
            num3 = sellerActionsPreviewDTO.horizontalMargin;
        }
        if ((i11 & 64) != 0) {
            str2 = sellerActionsPreviewDTO.containerBgColor;
        }
        Integer num4 = num3;
        String str3 = str2;
        Integer num5 = num2;
        String str4 = str;
        return sellerActionsPreviewDTO.copy(obj, obj2, str4, num, num5, num4, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Object getCellFirst() {
        return this.cellFirst;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getCellSecond() {
        return this.cellSecond;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getVerticalPadding() {
        return this.verticalPadding;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getHorizontalPadding() {
        return this.horizontalPadding;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getHorizontalMargin() {
        return this.horizontalMargin;
    }

    /* renamed from: component7, reason: from getter */
    public final String getContainerBgColor() {
        return this.containerBgColor;
    }

    @NotNull
    public final SellerActionsPreviewDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "dsCell", type = CellDTO.class), @ProtoOneOfSignature(name = "cellWithLadder", type = LadderCell.class)}) @NotNull @ProtoOneOf(label = "type") Object cellFirst, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "dsCell", type = CellDTO.class), @ProtoOneOfSignature(name = "cellWithLadder", type = LadderCell.class)}) @ProtoOneOf(label = "type") Object cellSecond, String backgroundColor, Integer verticalPadding, Integer horizontalPadding, Integer horizontalMargin, String containerBgColor) {
        Intrinsics.checkNotNullParameter(cellFirst, "cellFirst");
        return new SellerActionsPreviewDTO(cellFirst, cellSecond, backgroundColor, verticalPadding, horizontalPadding, horizontalMargin, containerBgColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerActionsPreviewDTO)) {
            return false;
        }
        SellerActionsPreviewDTO sellerActionsPreviewDTO = (SellerActionsPreviewDTO) other;
        return Intrinsics.d(this.cellFirst, sellerActionsPreviewDTO.cellFirst) && Intrinsics.d(this.cellSecond, sellerActionsPreviewDTO.cellSecond) && Intrinsics.d(this.backgroundColor, sellerActionsPreviewDTO.backgroundColor) && Intrinsics.d(this.verticalPadding, sellerActionsPreviewDTO.verticalPadding) && Intrinsics.d(this.horizontalPadding, sellerActionsPreviewDTO.horizontalPadding) && Intrinsics.d(this.horizontalMargin, sellerActionsPreviewDTO.horizontalMargin) && Intrinsics.d(this.containerBgColor, sellerActionsPreviewDTO.containerBgColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final Object getCellFirst() {
        return this.cellFirst;
    }

    public final Object getCellSecond() {
        return this.cellSecond;
    }

    public final String getContainerBgColor() {
        return this.containerBgColor;
    }

    public final Integer getHorizontalMargin() {
        return this.horizontalMargin;
    }

    public final Integer getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public final Integer getVerticalPadding() {
        return this.verticalPadding;
    }

    public int hashCode() {
        int hashCode = this.cellFirst.hashCode() * 31;
        Object obj = this.cellSecond;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.verticalPadding;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.horizontalPadding;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.horizontalMargin;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.containerBgColor;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Object obj = this.cellFirst;
        Object obj2 = this.cellSecond;
        String str = this.backgroundColor;
        Integer num = this.verticalPadding;
        Integer num2 = this.horizontalPadding;
        Integer num3 = this.horizontalMargin;
        String str2 = this.containerBgColor;
        StringBuilder sb2 = new StringBuilder("SellerActionsPreviewDTO(cellFirst=");
        sb2.append(obj);
        sb2.append(", cellSecond=");
        sb2.append(obj2);
        sb2.append(", backgroundColor=");
        C2454a.f(num, str, ", verticalPadding=", ", horizontalPadding=", sb2);
        c.e(sb2, num2, ", horizontalMargin=", num3, ", containerBgColor=");
        return o0.c(sb2, str2, ")");
    }
}
