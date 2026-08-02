package ru.ozon.uni.atoms.data.dsCell;

import Ak.b;
import Y9.c;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\"\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/uni/atoms/data/dsCell/CellDTO_CenterBlockJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$CenterBlock;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/dsCell/CellDTO$CenterBlock;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/dsCell/CellDTO$CenterBlock;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$CellText;", "cellTextAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableCellTextAdapter", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "nullableLayoutPaddingAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "nullableCommonAtomIconDTOAdapter", "", "nullableListOfBadgeDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CellDTO_CenterBlockJsonAdapter extends JsonAdapter<CellDTO.CenterBlock> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CellDTO.CellText> cellTextAdapter;
    private volatile Constructor<CellDTO.CenterBlock> constructorRef;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<CellDTO.CellText> nullableCellTextAdapter;

    @NotNull
    private final JsonAdapter<CommonAtomIconDTO> nullableCommonAtomIconDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonCellSettings.LayoutPadding> nullableLayoutPaddingAdapter;

    @NotNull
    private final JsonAdapter<List<BadgeDTO>> nullableListOfBadgeDTOAdapter;

    @NotNull
    private final n.a options;

    public CellDTO_CenterBlockJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "titleSpaceBetween", "titleBadge", "titleIcon", "badgeList");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<CellDTO.CellText> f7 = moshi.f(CellDTO.CellText.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.cellTextAdapter = f7;
        JsonAdapter<CellDTO.CellText> f11 = moshi.f(CellDTO.CellText.class, m11, "subtitle");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableCellTextAdapter = f11;
        JsonAdapter<CommonCellSettings.LayoutPadding> f12 = moshi.f(CommonCellSettings.LayoutPadding.class, m11, "titleSpaceBetween");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableLayoutPaddingAdapter = f12;
        JsonAdapter<BadgeDTO> f13 = moshi.f(BadgeDTO.class, m11, "titleBadge");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableBadgeDTOAdapter = f13;
        JsonAdapter<CommonAtomIconDTO> f14 = moshi.f(CommonAtomIconDTO.class, m11, "titleIcon");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableCommonAtomIconDTOAdapter = f14;
        JsonAdapter<List<BadgeDTO>> f15 = moshi.f(D.e(List.class, BadgeDTO.class), m11, "badgeList");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableListOfBadgeDTOAdapter = f15;
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(CellDTO.CenterBlock)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CellDTO.CenterBlock fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        CellDTO.CellText cellText = null;
        CellDTO.CellText cellText2 = null;
        CommonCellSettings.LayoutPadding layoutPadding = null;
        BadgeDTO badgeDTO = null;
        CommonAtomIconDTO commonAtomIconDTO = null;
        List<BadgeDTO> list = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    cellText = this.cellTextAdapter.fromJson(reader);
                    if (cellText == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    cellText2 = this.nullableCellTextAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    layoutPadding = this.nullableLayoutPaddingAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    commonAtomIconDTO = this.nullableCommonAtomIconDTOAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    list = this.nullableListOfBadgeDTOAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -63) {
            List<BadgeDTO> list2 = list;
            CommonAtomIconDTO commonAtomIconDTO2 = commonAtomIconDTO;
            BadgeDTO badgeDTO2 = badgeDTO;
            CommonCellSettings.LayoutPadding layoutPadding2 = layoutPadding;
            CellDTO.CellText cellText3 = cellText2;
            CellDTO.CellText cellText4 = cellText;
            if (cellText4 != null) {
                return new CellDTO.CenterBlock(cellText4, cellText3, layoutPadding2, badgeDTO2, commonAtomIconDTO2, list2);
            }
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        List<BadgeDTO> list3 = list;
        CommonAtomIconDTO commonAtomIconDTO3 = commonAtomIconDTO;
        BadgeDTO badgeDTO3 = badgeDTO;
        CommonCellSettings.LayoutPadding layoutPadding3 = layoutPadding;
        CellDTO.CellText cellText5 = cellText2;
        CellDTO.CellText cellText6 = cellText;
        Constructor<CellDTO.CenterBlock> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CellDTO.CenterBlock.class.getDeclaredConstructor(CellDTO.CellText.class, CellDTO.CellText.class, CommonCellSettings.LayoutPadding.class, BadgeDTO.class, CommonAtomIconDTO.class, List.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (cellText6 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        CellDTO.CenterBlock newInstance = constructor.newInstance(cellText6, cellText5, layoutPadding3, badgeDTO3, commonAtomIconDTO3, list3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CellDTO.CenterBlock value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.cellTextAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("subtitle");
        this.nullableCellTextAdapter.mo44toJson(writer, (x) value_.getSubtitle());
        writer.w("titleSpaceBetween");
        this.nullableLayoutPaddingAdapter.mo44toJson(writer, (x) value_.getTitleSpaceBetween());
        writer.w("titleBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value_.getTitleBadge());
        writer.w("titleIcon");
        this.nullableCommonAtomIconDTOAdapter.mo44toJson(writer, (x) value_.getTitleIcon());
        writer.w("badgeList");
        this.nullableListOfBadgeDTOAdapter.mo44toJson(writer, (x) value_.getBadgeList());
        writer.p();
    }
}
