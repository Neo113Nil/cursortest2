package ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.data;

import Y9.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.data.SimpleInfoDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/data/SimpleInfoDTO_CellListDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/data/SimpleInfoDTO$CellListDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/data/SimpleInfoDTO$CellListDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/data/SimpleInfoDTO$CellListDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "listOfCellDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "nullableStringAdapter", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SimpleInfoDTO_CellListDTOJsonAdapter extends JsonAdapter<SimpleInfoDTO.CellListDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<CellDTO>> listOfCellDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public SimpleInfoDTO_CellListDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("cells", "leftPadding", "rightPadding", "backgroundCornerRadius", "listBackgroundColor");
        b e11 = D.e(List.class, CellDTO.class);
        M m11 = M.f71699a;
        this.listOfCellDTOAdapter = moshi.f(e11, m11, "cells");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "leftPadding");
        this.nullableStringAdapter = moshi.f(String.class, m11, "listBackgroundColor");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(47, "GeneratedJsonAdapter(SimpleInfoDTO.CellListDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SimpleInfoDTO.CellListDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<CellDTO> list = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        String str = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.listOfCellDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("cells", "cells", reader);
                }
            } else if (v11 == 1) {
                num = this.nullableIntAdapter.fromJson(reader);
            } else if (v11 == 2) {
                num2 = this.nullableIntAdapter.fromJson(reader);
            } else if (v11 == 3) {
                num3 = this.nullableIntAdapter.fromJson(reader);
            } else if (v11 == 4) {
                str = this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (list != null) {
            return new SimpleInfoDTO.CellListDTO(list, num, num2, num3, str);
        }
        throw c.j("cells", "cells", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SimpleInfoDTO.CellListDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("cells");
        this.listOfCellDTOAdapter.mo44toJson(writer, (x) value.getCells());
        writer.w("leftPadding");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getLeftPadding());
        writer.w("rightPadding");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getRightPadding());
        writer.w("backgroundCornerRadius");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getBackgroundCornerRadius());
        writer.w("listBackgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getListBackgroundColor());
        writer.p();
    }
}
