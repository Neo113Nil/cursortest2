package ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.data;

import Ak.C2436a;
import C.o0;
import Ef0.c;
import T7.E;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.cell.DisclosureTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.image.ImageFixedDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00142\u00020\u0001:\u0003\u0014\u0015\u0016B'\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/data/SimpleInfoDTO;", "", "body", "", CommentV3DTO.FOOTER_FIELD_NAME, "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getBody", "()Ljava/util/List;", "getFooter", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "SpaceDTO", "CellListDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SimpleInfoDTO {

    @NotNull
    private final List<Object> body;

    @NotNull
    private final List<Object> footer;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JN\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\t\u0010!\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/data/SimpleInfoDTO$CellListDTO;", "", "cells", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "leftPadding", "", "rightPadding", "backgroundCornerRadius", "listBackgroundColor", "", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getCells", "()Ljava/util/List;", "getLeftPadding", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRightPadding", "getBackgroundCornerRadius", "getListBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/data/SimpleInfoDTO$CellListDTO;", "equals", "", "other", "hashCode", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellListDTO {
        public static final int $stable = 8;
        private final Integer backgroundCornerRadius;

        @NotNull
        private final List<CellDTO> cells;
        private final Integer leftPadding;
        private final String listBackgroundColor;
        private final Integer rightPadding;

        public CellListDTO(@NotNull List<CellDTO> cells, Integer num, Integer num2, Integer num3, String str) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            this.cells = cells;
            this.leftPadding = num;
            this.rightPadding = num2;
            this.backgroundCornerRadius = num3;
            this.listBackgroundColor = str;
        }

        public static /* synthetic */ CellListDTO copy$default(CellListDTO cellListDTO, List list, Integer num, Integer num2, Integer num3, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = cellListDTO.cells;
            }
            if ((i11 & 2) != 0) {
                num = cellListDTO.leftPadding;
            }
            if ((i11 & 4) != 0) {
                num2 = cellListDTO.rightPadding;
            }
            if ((i11 & 8) != 0) {
                num3 = cellListDTO.backgroundCornerRadius;
            }
            if ((i11 & 16) != 0) {
                str = cellListDTO.listBackgroundColor;
            }
            String str2 = str;
            Integer num4 = num2;
            return cellListDTO.copy(list, num, num4, num3, str2);
        }

        @NotNull
        public final List<CellDTO> component1() {
            return this.cells;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getLeftPadding() {
            return this.leftPadding;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getRightPadding() {
            return this.rightPadding;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getBackgroundCornerRadius() {
            return this.backgroundCornerRadius;
        }

        /* renamed from: component5, reason: from getter */
        public final String getListBackgroundColor() {
            return this.listBackgroundColor;
        }

        @NotNull
        public final CellListDTO copy(@NotNull List<CellDTO> cells, Integer leftPadding, Integer rightPadding, Integer backgroundCornerRadius, String listBackgroundColor) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            return new CellListDTO(cells, leftPadding, rightPadding, backgroundCornerRadius, listBackgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellListDTO)) {
                return false;
            }
            CellListDTO cellListDTO = (CellListDTO) other;
            return Intrinsics.d(this.cells, cellListDTO.cells) && Intrinsics.d(this.leftPadding, cellListDTO.leftPadding) && Intrinsics.d(this.rightPadding, cellListDTO.rightPadding) && Intrinsics.d(this.backgroundCornerRadius, cellListDTO.backgroundCornerRadius) && Intrinsics.d(this.listBackgroundColor, cellListDTO.listBackgroundColor);
        }

        public final Integer getBackgroundCornerRadius() {
            return this.backgroundCornerRadius;
        }

        @NotNull
        public final List<CellDTO> getCells() {
            return this.cells;
        }

        public final Integer getLeftPadding() {
            return this.leftPadding;
        }

        public final String getListBackgroundColor() {
            return this.listBackgroundColor;
        }

        public final Integer getRightPadding() {
            return this.rightPadding;
        }

        public int hashCode() {
            int hashCode = this.cells.hashCode() * 31;
            Integer num = this.leftPadding;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.rightPadding;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.backgroundCornerRadius;
            int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str = this.listBackgroundColor;
            return hashCode4 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            List<CellDTO> list = this.cells;
            Integer num = this.leftPadding;
            Integer num2 = this.rightPadding;
            Integer num3 = this.backgroundCornerRadius;
            String str = this.listBackgroundColor;
            StringBuilder sb2 = new StringBuilder("CellListDTO(cells=");
            sb2.append(list);
            sb2.append(", leftPadding=");
            sb2.append(num);
            sb2.append(", rightPadding=");
            c.e(sb2, num2, ", backgroundCornerRadius=", num3, ", listBackgroundColor=");
            return o0.c(sb2, str, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001c\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005*\b\u0012\u0004\u0012\u00020\u00010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/data/SimpleInfoDTO$Companion;", "", "<init>", "()V", "filterBySupportedTypes", "", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<Object> filterBySupportedTypes(@NotNull Iterable<? extends Object> iterable) {
            Intrinsics.checkNotNullParameter(iterable, "<this>");
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (obj instanceof ImageFixedDTO) {
                    arrayList.add(ImageDTO.INSTANCE.toImage((ImageFixedDTO) obj));
                } else if ((obj instanceof ButtonDTO) || (obj instanceof SimpleInfoImageDTO) || (obj instanceof SpaceDTO) || (obj instanceof TextDTO) || (obj instanceof DisclosureTitleSubtitleCellDTO) || (obj instanceof ButtonV3DTO) || (obj instanceof CellDTO) || (obj instanceof CellListDTO)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/data/SimpleInfoDTO$SpaceDTO;", "", "height", "", "<init>", "(I)V", "getHeight", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SpaceDTO {
        public static final int $stable = 0;
        private final int height;

        public SpaceDTO(int i11) {
            this.height = i11;
        }

        public static /* synthetic */ SpaceDTO copy$default(SpaceDTO spaceDTO, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = spaceDTO.height;
            }
            return spaceDTO.copy(i11);
        }

        /* renamed from: component1, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        @NotNull
        public final SpaceDTO copy(int height) {
            return new SpaceDTO(height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SpaceDTO) && this.height == ((SpaceDTO) other).height;
        }

        public final int getHeight() {
            return this.height;
        }

        public int hashCode() {
            return Integer.hashCode(this.height);
        }

        @NotNull
        public String toString() {
            return E.a(this.height, "SpaceDTO(height=", ")");
        }
    }

    public SimpleInfoDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonDTO.class), @ProtoOneOfSignature(name = "disclosureTitleSubtitleCell", type = DisclosureTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "image", type = SimpleInfoImageDTO.class), @ProtoOneOfSignature(name = "imageFixed", type = ImageFixedDTO.class), @ProtoOneOfSignature(name = "space", type = SpaceDTO.class), @ProtoOneOfSignature(name = "text", type = TextDTO.class), @ProtoOneOfSignature(name = "buttonV3", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "cell", type = CellDTO.class), @ProtoOneOfSignature(name = "cellList", type = CellListDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> body, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonDTO.class), @ProtoOneOfSignature(name = "disclosureTitleSubtitleCell", type = DisclosureTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "image", type = SimpleInfoImageDTO.class), @ProtoOneOfSignature(name = "imageFixed", type = ImageFixedDTO.class), @ProtoOneOfSignature(name = "space", type = SpaceDTO.class), @ProtoOneOfSignature(name = "text", type = TextDTO.class), @ProtoOneOfSignature(name = "buttonV3", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "cell", type = CellDTO.class), @ProtoOneOfSignature(name = "cellList", type = CellListDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> footer) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.body = body;
        this.footer = footer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SimpleInfoDTO copy$default(SimpleInfoDTO simpleInfoDTO, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = simpleInfoDTO.body;
        }
        if ((i11 & 2) != 0) {
            list2 = simpleInfoDTO.footer;
        }
        return simpleInfoDTO.copy(list, list2);
    }

    @NotNull
    public final List<Object> component1() {
        return this.body;
    }

    @NotNull
    public final List<Object> component2() {
        return this.footer;
    }

    @NotNull
    public final SimpleInfoDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonDTO.class), @ProtoOneOfSignature(name = "disclosureTitleSubtitleCell", type = DisclosureTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "image", type = SimpleInfoImageDTO.class), @ProtoOneOfSignature(name = "imageFixed", type = ImageFixedDTO.class), @ProtoOneOfSignature(name = "space", type = SpaceDTO.class), @ProtoOneOfSignature(name = "text", type = TextDTO.class), @ProtoOneOfSignature(name = "buttonV3", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "cell", type = CellDTO.class), @ProtoOneOfSignature(name = "cellList", type = CellListDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> body, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonDTO.class), @ProtoOneOfSignature(name = "disclosureTitleSubtitleCell", type = DisclosureTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "image", type = SimpleInfoImageDTO.class), @ProtoOneOfSignature(name = "imageFixed", type = ImageFixedDTO.class), @ProtoOneOfSignature(name = "space", type = SpaceDTO.class), @ProtoOneOfSignature(name = "text", type = TextDTO.class), @ProtoOneOfSignature(name = "buttonV3", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "cell", type = CellDTO.class), @ProtoOneOfSignature(name = "cellList", type = CellListDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> footer) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(footer, "footer");
        return new SimpleInfoDTO(body, footer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimpleInfoDTO)) {
            return false;
        }
        SimpleInfoDTO simpleInfoDTO = (SimpleInfoDTO) other;
        return Intrinsics.d(this.body, simpleInfoDTO.body) && Intrinsics.d(this.footer, simpleInfoDTO.footer);
    }

    @NotNull
    public final List<Object> getBody() {
        return this.body;
    }

    @NotNull
    public final List<Object> getFooter() {
        return this.footer;
    }

    public int hashCode() {
        return this.footer.hashCode() + (this.body.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return C2436a.b("SimpleInfoDTO(body=", this.body, ", footer=", ")", this.footer);
    }
}
