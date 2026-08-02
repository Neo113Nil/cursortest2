package ru.ozon.uni.atoms.data.dsCell;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.atoms.common.JsonUtilsKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u0004\u0018\u00010\u0002*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u0002*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/uni/atoms/data/dsCell/CellControlAtomDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/n;", "", "type", "parseAtom", "(Lcom/squareup/moshi/n;Ljava/lang/String;)Lru/ozon/uni/atoms/data/AtomDTO;", "reader", AppMeasurementSdk.ConditionalUserProperty.NAME, "getNestedAtom", "findAtom", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/AtomDTO;)V", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/AtomDTO;", "Lcom/squareup/moshi/Moshi;", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CellControlAtomDTOJsonAdapter extends JsonAdapter<AtomDTO> {

    @NotNull
    private final Moshi moshi;
    public static final int $stable = 8;

    @NotNull
    private static final Map<String, Class<? extends AtomDTO>> controlAtomTypes = U.j(new Pair("checkbox", CheckBoxDTO.class), new Pair(FormPageDTO.Field.FIELD_TYPE_RADIO, RadioDTO.class), new Pair("toggle", ToggleDTO.class));

    public CellControlAtomDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.moshi = moshi;
    }

    private final AtomDTO findAtom(n nVar, String str) {
        n.a a11 = n.a.C0918a.a(str);
        nVar.beginObject();
        AtomDTO atomDTO = null;
        while (nVar.hasNext()) {
            if (nVar.v(a11) != 0) {
                nVar.y();
                nVar.skipValue();
            } else if (nVar.p() == n.b.BEGIN_OBJECT) {
                atomDTO = parseAtom(nVar, str);
            } else {
                nVar.skipValue();
            }
        }
        nVar.endObject();
        nVar.close();
        return atomDTO;
    }

    private final AtomDTO getNestedAtom(n reader, String name) throws IOException {
        n q11 = reader.q();
        Intrinsics.checkNotNullExpressionValue(q11, "peekJson(...)");
        AtomDTO findAtom = findAtom(q11, name);
        if (findAtom != null) {
            JsonUtilsKt.skipReader(reader);
        }
        return findAtom;
    }

    private final AtomDTO parseAtom(n nVar, String str) {
        return (AtomDTO) this.moshi.c((Class) U.e(controlAtomTypes, str)).fromJson(nVar);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public AtomDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        n q11 = reader.q();
        Intrinsics.checkNotNullExpressionValue(q11, "peekJson(...)");
        String findNameInJsonMap = JsonUtilsKt.findNameInJsonMap(q11, controlAtomTypes);
        if (findNameInJsonMap != null) {
            AtomDTO nestedAtom = getNestedAtom(reader, findNameInJsonMap);
            return nestedAtom == null ? parseAtom(reader, findNameInJsonMap) : nestedAtom;
        }
        reader.skipValue();
        return null;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AtomDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value instanceof CheckBoxDTO) {
            this.moshi.c(CheckBoxDTO.class).mo44toJson(writer, (x) value);
            return;
        }
        if (value instanceof RadioDTO) {
            this.moshi.c(RadioDTO.class).mo44toJson(writer, (x) value);
        } else if (value instanceof ToggleDTO) {
            this.moshi.c(ToggleDTO.class).mo44toJson(writer, (x) value);
        } else {
            writer.x();
        }
    }
}
