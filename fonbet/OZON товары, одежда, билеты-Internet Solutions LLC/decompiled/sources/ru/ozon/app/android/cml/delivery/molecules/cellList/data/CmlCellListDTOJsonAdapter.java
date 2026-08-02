package ru.ozon.app.android.cml.delivery.molecules.cellList.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R(\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019¨\u0006%"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "nullableLayoutPaddingAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "", "nullableBooleanAdapter", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "listOfCellDTOAdapter", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CmlCellListDTOJsonAdapter extends JsonAdapter<CmlCellListDTO> {

    @NotNull
    private final JsonAdapter<List<CellDTO>> listOfCellDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<CommonCellSettings.LayoutPadding> nullableLayoutPaddingAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public CmlCellListDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("islandCornerRadius", "topIslandCornerRadius", "bottomIslandCornerRadius", "islandColor", "backgroundColor", "leftMargin", "rightMargin", "topMargin", "bottomMargin", "leftPadding", "rightPadding", "trackingInfo", "enableHtmlTags", "enableCellsSeparators", "cells");
        M m11 = M.f71699a;
        this.nullableCornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "islandCornerRadius");
        this.nullableStringAdapter = moshi.f(String.class, m11, "islandColor");
        this.nullableLayoutPaddingAdapter = moshi.f(CommonCellSettings.LayoutPadding.class, m11, "leftMargin");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "enableHtmlTags");
        this.listOfCellDTOAdapter = moshi.f(D.e(List.class, CellDTO.class), m11, "cells");
    }

    @NotNull
    public String toString() {
        return b.c(36, "GeneratedJsonAdapter(CmlCellListDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CmlCellListDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CornerRadius cornerRadius = null;
        CornerRadius cornerRadius2 = null;
        CornerRadius cornerRadius3 = null;
        String str = null;
        String str2 = null;
        CommonCellSettings.LayoutPadding layoutPadding = null;
        CommonCellSettings.LayoutPadding layoutPadding2 = null;
        CommonCellSettings.LayoutPadding layoutPadding3 = null;
        CommonCellSettings.LayoutPadding layoutPadding4 = null;
        CommonCellSettings.LayoutPadding layoutPadding5 = null;
        CommonCellSettings.LayoutPadding layoutPadding6 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Boolean bool = null;
        Boolean bool2 = null;
        List<CellDTO> list = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
                    break;
                case 1:
                    cornerRadius2 = this.nullableCornerRadiusAdapter.fromJson(reader);
                    break;
                case 2:
                    cornerRadius3 = this.nullableCornerRadiusAdapter.fromJson(reader);
                    break;
                case 3:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    layoutPadding = this.nullableLayoutPaddingAdapter.fromJson(reader);
                    break;
                case 6:
                    layoutPadding2 = this.nullableLayoutPaddingAdapter.fromJson(reader);
                    break;
                case 7:
                    layoutPadding3 = this.nullableLayoutPaddingAdapter.fromJson(reader);
                    break;
                case 8:
                    layoutPadding4 = this.nullableLayoutPaddingAdapter.fromJson(reader);
                    break;
                case 9:
                    layoutPadding5 = this.nullableLayoutPaddingAdapter.fromJson(reader);
                    break;
                case 10:
                    layoutPadding6 = this.nullableLayoutPaddingAdapter.fromJson(reader);
                    break;
                case 11:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 12:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 13:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 14:
                    list = this.listOfCellDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("cells", "cells", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (list != null) {
            return new CmlCellListDTO(cornerRadius, cornerRadius2, cornerRadius3, str, str2, layoutPadding, layoutPadding2, layoutPadding3, layoutPadding4, layoutPadding5, layoutPadding6, map, bool, bool2, list);
        }
        throw c.j("cells", "cells", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CmlCellListDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("islandCornerRadius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value.getIslandCornerRadius());
        writer.w("topIslandCornerRadius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value.getTopIslandCornerRadius());
        writer.w("bottomIslandCornerRadius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value.getBottomIslandCornerRadius());
        writer.w("islandColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getIslandColor());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("leftMargin");
        this.nullableLayoutPaddingAdapter.mo44toJson(writer, (x) value.getLeftMargin());
        writer.w("rightMargin");
        this.nullableLayoutPaddingAdapter.mo44toJson(writer, (x) value.getRightMargin());
        writer.w("topMargin");
        this.nullableLayoutPaddingAdapter.mo44toJson(writer, (x) value.getTopMargin());
        writer.w("bottomMargin");
        this.nullableLayoutPaddingAdapter.mo44toJson(writer, (x) value.getBottomMargin());
        writer.w("leftPadding");
        this.nullableLayoutPaddingAdapter.mo44toJson(writer, (x) value.getLeftPadding());
        writer.w("rightPadding");
        this.nullableLayoutPaddingAdapter.mo44toJson(writer, (x) value.getRightPadding());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("enableHtmlTags");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getEnableHtmlTags());
        writer.w("enableCellsSeparators");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getEnableCellsSeparators());
        writer.w("cells");
        this.listOfCellDTOAdapter.mo44toJson(writer, (x) value.getCells());
        writer.p();
    }
}
