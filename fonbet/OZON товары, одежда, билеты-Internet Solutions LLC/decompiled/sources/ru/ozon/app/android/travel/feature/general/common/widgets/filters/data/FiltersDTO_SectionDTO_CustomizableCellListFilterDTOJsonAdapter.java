package ru.ozon.app.android.travel.feature.general.common.widgets.filters.data;

import Ak.b;
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
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.data.FiltersDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO_SectionDTO_CustomizableCellListFilterDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$CustomizableCellListFilterDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson-DhqPK0I", "(Lcom/squareup/moshi/n;)Ljava/util/List;", "fromJson", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson-RL7tN2s", "(Lcom/squareup/moshi/x;Ljava/util/List;)V", "toJson", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$CustomizableCell;", "listOfCustomizableCellAdapter", "Lcom/squareup/moshi/JsonAdapter;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiltersDTO_SectionDTO_CustomizableCellListFilterDTOJsonAdapter extends JsonAdapter<FiltersDTO.SectionDTO.CustomizableCellListFilterDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<FiltersDTO.SectionDTO.CustomizableCell>> listOfCustomizableCellAdapter;

    @NotNull
    private final n.a options;

    public FiltersDTO_SectionDTO_CustomizableCellListFilterDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("customizableCells");
        this.listOfCustomizableCellAdapter = moshi.f(D.e(List.class, FiltersDTO.SectionDTO.CustomizableCell.class), M.f71699a, "customizableCells");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public /* bridge */ /* synthetic */ FiltersDTO.SectionDTO.CustomizableCellListFilterDTO fromJson(n nVar) {
        return FiltersDTO.SectionDTO.CustomizableCellListFilterDTO.m1216boximpl(m1232fromJsonDhqPK0I(nVar));
    }

    @NotNull
    /* renamed from: fromJson-DhqPK0I, reason: not valid java name */
    public List<? extends FiltersDTO.SectionDTO.CustomizableCell> m1232fromJsonDhqPK0I(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<FiltersDTO.SectionDTO.CustomizableCell> list = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0 && (list = this.listOfCustomizableCellAdapter.fromJson(reader)) == null) {
                throw c.q("customizableCells", "customizableCells", reader);
            }
        }
        reader.endObject();
        if (list != null) {
            return FiltersDTO.SectionDTO.CustomizableCellListFilterDTO.m1217constructorimpl(list);
        }
        throw c.j("customizableCells", "customizableCells", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson */
    public /* bridge */ /* synthetic */ void mo44toJson(x xVar, FiltersDTO.SectionDTO.CustomizableCellListFilterDTO customizableCellListFilterDTO) {
        FiltersDTO.SectionDTO.CustomizableCellListFilterDTO customizableCellListFilterDTO2 = customizableCellListFilterDTO;
        m1233toJsonRL7tN2s(xVar, customizableCellListFilterDTO2 != null ? customizableCellListFilterDTO2.getCustomizableCells() : null);
    }

    /* renamed from: toJson-RL7tN2s, reason: not valid java name */
    public void m1233toJsonRL7tN2s(@NotNull x writer, List<? extends FiltersDTO.SectionDTO.CustomizableCell> value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("customizableCells");
        this.listOfCustomizableCellAdapter.mo44toJson(writer, (x) value);
        writer.p();
    }

    @NotNull
    public String toString() {
        return b.c(73, "GeneratedJsonAdapter(FiltersDTO.SectionDTO.CustomizableCellListFilterDTO)", "toString(...)");
    }
}
