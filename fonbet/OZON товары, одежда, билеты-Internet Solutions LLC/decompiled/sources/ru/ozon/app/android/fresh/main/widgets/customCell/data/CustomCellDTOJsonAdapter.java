package ru.ozon.app.android.fresh.main.widgets.customCell.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.main.widgets.customCell.data.CustomCellDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R(\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cellDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$RightBlock;", "nullableRightBlockAdapter", "Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$PaddingsDTO;", "paddingsDTOAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "nullableStringAdapter", "Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$CustomBackground;", "customBackgroundAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CustomCellDTOJsonAdapter extends JsonAdapter<CustomCellDTO> {

    @NotNull
    private final JsonAdapter<CellDTO> cellDTOAdapter;
    private volatile Constructor<CustomCellDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CustomCellDTO.CustomBackground> customBackgroundAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<CustomCellDTO.RightBlock> nullableRightBlockAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<CustomCellDTO.PaddingsDTO> paddingsDTOAdapter;

    public CustomCellDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("cell", "block", "spacers", "action", "backgroundColor", "contentColor", "trackingInfo");
        M m11 = M.f71699a;
        this.cellDTOAdapter = moshi.f(CellDTO.class, m11, "cell");
        this.nullableRightBlockAdapter = moshi.f(CustomCellDTO.RightBlock.class, m11, "block");
        this.paddingsDTOAdapter = moshi.f(CustomCellDTO.PaddingsDTO.class, m11, "spacers");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.customBackgroundAdapter = moshi.f(CustomCellDTO.CustomBackground.class, m11, "contentColor");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(35, "GeneratedJsonAdapter(CustomCellDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CustomCellDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        CellDTO cellDTO = null;
        CustomCellDTO.RightBlock rightBlock = null;
        CustomCellDTO.PaddingsDTO paddingsDTO = null;
        AtomActionDTO atomActionDTO = null;
        String str = null;
        CustomCellDTO.CustomBackground customBackground = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    cellDTO = this.cellDTOAdapter.fromJson(reader);
                    if (cellDTO == null) {
                        throw c.q("cell", "cell", reader);
                    }
                    break;
                case 1:
                    rightBlock = this.nullableRightBlockAdapter.fromJson(reader);
                    break;
                case 2:
                    paddingsDTO = this.paddingsDTOAdapter.fromJson(reader);
                    if (paddingsDTO == null) {
                        throw c.q("spacers", "spacers", reader);
                    }
                    i11 = -5;
                    break;
                case 3:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    customBackground = this.customBackgroundAdapter.fromJson(reader);
                    if (customBackground == null) {
                        throw c.q("contentColor", "contentColor", reader);
                    }
                    break;
                case 6:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -5) {
            CustomCellDTO.RightBlock rightBlock2 = rightBlock;
            CellDTO cellDTO2 = cellDTO;
            if (cellDTO2 == null) {
                throw c.j("cell", "cell", reader);
            }
            Intrinsics.g(paddingsDTO, "null cannot be cast to non-null type ru.ozon.app.android.fresh.main.widgets.customCell.data.CustomCellDTO.PaddingsDTO");
            if (customBackground == null) {
                throw c.j("contentColor", "contentColor", reader);
            }
            Map<String, TokenizedTrackingInfo> map2 = map;
            CustomCellDTO.CustomBackground customBackground2 = customBackground;
            return new CustomCellDTO(cellDTO2, rightBlock2, paddingsDTO, atomActionDTO, str, customBackground2, map2);
        }
        CustomCellDTO.RightBlock rightBlock3 = rightBlock;
        CellDTO cellDTO3 = cellDTO;
        Constructor<CustomCellDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CustomCellDTO.class.getDeclaredConstructor(CellDTO.class, CustomCellDTO.RightBlock.class, CustomCellDTO.PaddingsDTO.class, AtomActionDTO.class, String.class, CustomCellDTO.CustomBackground.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<CustomCellDTO> constructor2 = constructor;
        if (cellDTO3 == null) {
            throw c.j("cell", "cell", reader);
        }
        if (customBackground == null) {
            throw c.j("contentColor", "contentColor", reader);
        }
        CustomCellDTO newInstance = constructor2.newInstance(cellDTO3, rightBlock3, paddingsDTO, atomActionDTO, str, customBackground, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CustomCellDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("cell");
        this.cellDTOAdapter.mo44toJson(writer, (x) value.getCell());
        writer.w("block");
        this.nullableRightBlockAdapter.mo44toJson(writer, (x) value.getBlock());
        writer.w("spacers");
        this.paddingsDTOAdapter.mo44toJson(writer, (x) value.getSpacers());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("contentColor");
        this.customBackgroundAdapter.mo44toJson(writer, (x) value.getContentColor());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
