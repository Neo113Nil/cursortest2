package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.data;

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
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.data.ComparisonDTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\"\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019¨\u0006\""}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO$ComparisonProductsDTO;", "comparisonProductsDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "cellWithSubtitleToggleAdapter", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsPickDTO;", "characteristicsPickDTOAdapter", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsGroupDTO;", "nullableCharacteristicsGroupDTOAdapter", "", "nullableListOfCharacteristicsGroupDTOAdapter", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComparisonDTOJsonAdapter extends JsonAdapter<ComparisonDTO> {

    @NotNull
    private final JsonAdapter<CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle> cellWithSubtitleToggleAdapter;

    @NotNull
    private final JsonAdapter<CharacteristicsPickDTO> characteristicsPickDTOAdapter;

    @NotNull
    private final JsonAdapter<ComparisonDTO.ComparisonProductsDTO> comparisonProductsDTOAdapter;

    @NotNull
    private final JsonAdapter<CharacteristicsGroupDTO> nullableCharacteristicsGroupDTOAdapter;

    @NotNull
    private final JsonAdapter<List<CharacteristicsGroupDTO>> nullableListOfCharacteristicsGroupDTOAdapter;

    @NotNull
    private final n.a options;

    public ComparisonDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("products", "differencesCell", "characteristicsPick", "keyCharacteristicsGroup", "characteristicsGroups");
        M m11 = M.f71699a;
        this.comparisonProductsDTOAdapter = moshi.f(ComparisonDTO.ComparisonProductsDTO.class, m11, "products");
        this.cellWithSubtitleToggleAdapter = moshi.f(CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle.class, m11, "differencesCell");
        this.characteristicsPickDTOAdapter = moshi.f(CharacteristicsPickDTO.class, m11, "characteristicsPick");
        this.nullableCharacteristicsGroupDTOAdapter = moshi.f(CharacteristicsGroupDTO.class, m11, "keyCharacteristicsGroup");
        this.nullableListOfCharacteristicsGroupDTOAdapter = moshi.f(D.e(List.class, CharacteristicsGroupDTO.class), m11, "characteristicsGroups");
    }

    @NotNull
    public String toString() {
        return b.c(35, "GeneratedJsonAdapter(ComparisonDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ComparisonDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ComparisonDTO.ComparisonProductsDTO comparisonProductsDTO = null;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle cellWithSubtitleToggle = null;
        CharacteristicsPickDTO characteristicsPickDTO = null;
        CharacteristicsGroupDTO characteristicsGroupDTO = null;
        List<CharacteristicsGroupDTO> list = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                comparisonProductsDTO = this.comparisonProductsDTOAdapter.fromJson(reader);
                if (comparisonProductsDTO == null) {
                    throw c.q("products", "products", reader);
                }
            } else if (v11 == 1) {
                cellWithSubtitleToggle = this.cellWithSubtitleToggleAdapter.fromJson(reader);
                if (cellWithSubtitleToggle == null) {
                    throw c.q("differencesCell", "differencesCell", reader);
                }
            } else if (v11 == 2) {
                characteristicsPickDTO = this.characteristicsPickDTOAdapter.fromJson(reader);
                if (characteristicsPickDTO == null) {
                    throw c.q("characteristicsPick", "characteristicsPick", reader);
                }
            } else if (v11 == 3) {
                characteristicsGroupDTO = this.nullableCharacteristicsGroupDTOAdapter.fromJson(reader);
            } else if (v11 == 4) {
                list = this.nullableListOfCharacteristicsGroupDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (comparisonProductsDTO == null) {
            throw c.j("products", "products", reader);
        }
        if (cellWithSubtitleToggle == null) {
            throw c.j("differencesCell", "differencesCell", reader);
        }
        if (characteristicsPickDTO != null) {
            return new ComparisonDTO(comparisonProductsDTO, cellWithSubtitleToggle, characteristicsPickDTO, characteristicsGroupDTO, list);
        }
        throw c.j("characteristicsPick", "characteristicsPick", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ComparisonDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("products");
        this.comparisonProductsDTOAdapter.mo44toJson(writer, (x) value.getProducts());
        writer.w("differencesCell");
        this.cellWithSubtitleToggleAdapter.mo44toJson(writer, (x) value.getDifferencesCell());
        writer.w("characteristicsPick");
        this.characteristicsPickDTOAdapter.mo44toJson(writer, (x) value.getCharacteristicsPick());
        writer.w("keyCharacteristicsGroup");
        this.nullableCharacteristicsGroupDTOAdapter.mo44toJson(writer, (x) value.getKeyCharacteristicsGroup());
        writer.w("characteristicsGroups");
        this.nullableListOfCharacteristicsGroupDTOAdapter.mo44toJson(writer, (x) value.getCharacteristicsGroups());
        writer.p();
    }
}
