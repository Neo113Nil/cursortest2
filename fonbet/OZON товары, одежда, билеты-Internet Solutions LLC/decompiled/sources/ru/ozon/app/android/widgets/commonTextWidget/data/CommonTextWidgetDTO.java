package ru.ozon.app.android.widgets.commonTextWidget.data;

import GR.b;
import Tz.C4055a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.header.data.HeaderDTO;
import ru.ozon.android.composerCommonViewKit.plainText.data.PlainTextDTO;
import ru.ozon.app.android.widgets.commonTextWidget.cellList.data.CellListV2DTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, d2 = {"Lru/ozon/app/android/widgets/commonTextWidget/data/CommonTextWidgetDTO;", "", "items", "", "backgroundColor", "", "islandCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "leftMargin", "Lru/ozon/uni/atoms/data/common/Paddings;", "rightMargin", "<init>", "(Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getItems", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getIslandCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getLeftMargin", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getRightMargin", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CommonTextWidgetDTO {
    private final String backgroundColor;

    @NotNull
    private final CornerRadius islandCornerRadius;

    @NotNull
    private final List<Object> items;

    @NotNull
    private final Paddings leftMargin;

    @NotNull
    private final Paddings rightMargin;

    public CommonTextWidgetDTO() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ CommonTextWidgetDTO copy$default(CommonTextWidgetDTO commonTextWidgetDTO, List list, String str, CornerRadius cornerRadius, Paddings paddings, Paddings paddings2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = commonTextWidgetDTO.items;
        }
        if ((i11 & 2) != 0) {
            str = commonTextWidgetDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            cornerRadius = commonTextWidgetDTO.islandCornerRadius;
        }
        if ((i11 & 8) != 0) {
            paddings = commonTextWidgetDTO.leftMargin;
        }
        if ((i11 & 16) != 0) {
            paddings2 = commonTextWidgetDTO.rightMargin;
        }
        Paddings paddings3 = paddings2;
        CornerRadius cornerRadius2 = cornerRadius;
        return commonTextWidgetDTO.copy(list, str, cornerRadius2, paddings, paddings3);
    }

    @NotNull
    public final List<Object> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CornerRadius getIslandCornerRadius() {
        return this.islandCornerRadius;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Paddings getLeftMargin() {
        return this.leftMargin;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Paddings getRightMargin() {
        return this.rightMargin;
    }

    @NotNull
    public final CommonTextWidgetDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "plainText", type = PlainTextDTO.class), @ProtoOneOfSignature(name = "header", type = HeaderDTO.class), @ProtoOneOfSignature(name = "cellList", type = CellListV2DTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, String backgroundColor, @NotNull CornerRadius islandCornerRadius, @NotNull Paddings leftMargin, @NotNull Paddings rightMargin) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(islandCornerRadius, "islandCornerRadius");
        Intrinsics.checkNotNullParameter(leftMargin, "leftMargin");
        Intrinsics.checkNotNullParameter(rightMargin, "rightMargin");
        return new CommonTextWidgetDTO(items, backgroundColor, islandCornerRadius, leftMargin, rightMargin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonTextWidgetDTO)) {
            return false;
        }
        CommonTextWidgetDTO commonTextWidgetDTO = (CommonTextWidgetDTO) other;
        return Intrinsics.d(this.items, commonTextWidgetDTO.items) && Intrinsics.d(this.backgroundColor, commonTextWidgetDTO.backgroundColor) && this.islandCornerRadius == commonTextWidgetDTO.islandCornerRadius && this.leftMargin == commonTextWidgetDTO.leftMargin && this.rightMargin == commonTextWidgetDTO.rightMargin;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CornerRadius getIslandCornerRadius() {
        return this.islandCornerRadius;
    }

    @NotNull
    public final List<Object> getItems() {
        return this.items;
    }

    @NotNull
    public final Paddings getLeftMargin() {
        return this.leftMargin;
    }

    @NotNull
    public final Paddings getRightMargin() {
        return this.rightMargin;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        String str = this.backgroundColor;
        return this.rightMargin.hashCode() + b.b(this.leftMargin, Tl.b.b(this.islandCornerRadius, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        List<Object> list = this.items;
        String str = this.backgroundColor;
        CornerRadius cornerRadius = this.islandCornerRadius;
        Paddings paddings = this.leftMargin;
        Paddings paddings2 = this.rightMargin;
        StringBuilder a11 = C4055a.a("CommonTextWidgetDTO(items=", ", backgroundColor=", str, ", islandCornerRadius=", list);
        a11.append(cornerRadius);
        a11.append(", leftMargin=");
        a11.append(paddings);
        a11.append(", rightMargin=");
        return D40.b.b(a11, paddings2, ")");
    }

    public CommonTextWidgetDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "plainText", type = PlainTextDTO.class), @ProtoOneOfSignature(name = "header", type = HeaderDTO.class), @ProtoOneOfSignature(name = "cellList", type = CellListV2DTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, String str, @NotNull CornerRadius islandCornerRadius, @NotNull Paddings leftMargin, @NotNull Paddings rightMargin) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(islandCornerRadius, "islandCornerRadius");
        Intrinsics.checkNotNullParameter(leftMargin, "leftMargin");
        Intrinsics.checkNotNullParameter(rightMargin, "rightMargin");
        this.items = items;
        this.backgroundColor = str;
        this.islandCornerRadius = islandCornerRadius;
        this.leftMargin = leftMargin;
        this.rightMargin = rightMargin;
    }

    public CommonTextWidgetDTO(List list, String str, CornerRadius cornerRadius, Paddings paddings, Paddings paddings2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? CornerRadius.NO_RADIUS : cornerRadius, (i11 & 8) != 0 ? Paddings.NONE : paddings, (i11 & 16) != 0 ? Paddings.NONE : paddings2);
    }
}
