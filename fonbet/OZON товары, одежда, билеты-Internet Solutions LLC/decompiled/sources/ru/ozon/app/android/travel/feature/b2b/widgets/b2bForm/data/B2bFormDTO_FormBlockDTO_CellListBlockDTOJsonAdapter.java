package ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.data;

import Ak.b;
import C.o0;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.data.B2bFormDTO;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO_FormBlockDTO_CellListBlockDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$FormBlockDTO$CellListBlockDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$FormBlockDTO$CellListBlockDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$FormBlockDTO$CellListBlockDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "nullableTravelWidgetSettingsDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "listOfCellDTOAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B2bFormDTO_FormBlockDTO_CellListBlockDTOJsonAdapter extends JsonAdapter<B2bFormDTO.FormBlockDTO.CellListBlockDTO> {
    public static final int $stable = 8;
    private volatile Constructor<B2bFormDTO.FormBlockDTO.CellListBlockDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<CellDTO>> listOfCellDTOAdapter;

    @NotNull
    private final JsonAdapter<TravelWidgetSettingsDTO> nullableTravelWidgetSettingsDTOAdapter;

    @NotNull
    private final n.a options;

    public B2bFormDTO_FormBlockDTO_CellListBlockDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("settings", "cellList", "gap");
        M m11 = M.f71699a;
        this.nullableTravelWidgetSettingsDTOAdapter = moshi.f(TravelWidgetSettingsDTO.class, m11, "settings");
        this.listOfCellDTOAdapter = moshi.f(D.e(List.class, CellDTO.class), m11, "cellList");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "gap");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public B2bFormDTO.FormBlockDTO.CellListBlockDTO fromJson(@NotNull n reader) {
        Integer a11 = o0.a(reader, "reader", 0);
        TravelWidgetSettingsDTO travelWidgetSettingsDTO = null;
        List<CellDTO> list = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                travelWidgetSettingsDTO = this.nullableTravelWidgetSettingsDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                list = this.listOfCellDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("cellList", "cellList", reader);
                }
            } else if (v11 == 2) {
                a11 = this.intAdapter.fromJson(reader);
                if (a11 == null) {
                    throw c.q("gap", "gap", reader);
                }
                i11 = -5;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -5) {
            if (list != null) {
                return new B2bFormDTO.FormBlockDTO.CellListBlockDTO(travelWidgetSettingsDTO, list, a11.intValue());
            }
            throw c.j("cellList", "cellList", reader);
        }
        Constructor<B2bFormDTO.FormBlockDTO.CellListBlockDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = B2bFormDTO.FormBlockDTO.CellListBlockDTO.class.getDeclaredConstructor(TravelWidgetSettingsDTO.class, List.class, cls2, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (list == null) {
            throw c.j("cellList", "cellList", reader);
        }
        B2bFormDTO.FormBlockDTO.CellListBlockDTO newInstance = constructor.newInstance(travelWidgetSettingsDTO, list, a11, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @NotNull
    public String toString() {
        return b.c(62, "GeneratedJsonAdapter(B2bFormDTO.FormBlockDTO.CellListBlockDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, B2bFormDTO.FormBlockDTO.CellListBlockDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("settings");
        this.nullableTravelWidgetSettingsDTOAdapter.mo44toJson(writer, (x) value.getSettings());
        writer.w("cellList");
        this.listOfCellDTOAdapter.mo44toJson(writer, (x) value.getCellList());
        writer.w("gap");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getGap()));
        writer.p();
    }
}
