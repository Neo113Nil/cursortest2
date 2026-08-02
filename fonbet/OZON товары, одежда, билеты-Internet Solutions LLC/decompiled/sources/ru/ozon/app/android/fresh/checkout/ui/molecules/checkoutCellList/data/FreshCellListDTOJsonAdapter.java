package ru.ozon.app.android.fresh.checkout.ui.molecules.checkoutCellList.data;

import Y9.b;
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
import ru.ozon.app.android.fresh.checkout.ui.molecules.checkoutCellList.data.FreshCellListDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\"\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/fresh/checkout/ui/molecules/checkoutCellList/data/FreshCellListDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/checkout/ui/molecules/checkoutCellList/data/FreshCellListDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/checkout/ui/molecules/checkoutCellList/data/FreshCellListDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/checkout/ui/molecules/checkoutCellList/data/FreshCellListDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "listOfCellDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "Lru/ozon/app/android/fresh/checkout/ui/molecules/checkoutCellList/data/FreshCellListDTO$Paddings;", "nullablePaddingsAdapter", "Lru/ozon/app/android/fresh/checkout/ui/molecules/checkoutCellList/data/FreshCellListDTO$Corners;", "nullableListOfCornersAdapter", "", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshCellListDTOJsonAdapter extends JsonAdapter<FreshCellListDTO> {
    public static final int $stable = 8;
    private volatile Constructor<FreshCellListDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<CellDTO>> listOfCellDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<List<FreshCellListDTO.Corners>> nullableListOfCornersAdapter;

    @NotNull
    private final JsonAdapter<FreshCellListDTO.Paddings> nullablePaddingsAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public FreshCellListDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("cells", "backgroundColor", "islandCornerRadius", "paddings", "corners", "showShadow");
        b e11 = D.e(List.class, CellDTO.class);
        M m11 = M.f71699a;
        this.listOfCellDTOAdapter = moshi.f(e11, m11, "cells");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableCornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "islandCornerRadius");
        this.nullablePaddingsAdapter = moshi.f(FreshCellListDTO.Paddings.class, m11, "paddings");
        this.nullableListOfCornersAdapter = moshi.f(D.e(List.class, FreshCellListDTO.Corners.class), m11, "corners");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "showShadow");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(38, "GeneratedJsonAdapter(FreshCellListDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FreshCellListDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        List<CellDTO> list = null;
        String str = null;
        CornerRadius cornerRadius = null;
        FreshCellListDTO.Paddings paddings = null;
        List<FreshCellListDTO.Corners> list2 = null;
        Boolean bool = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.listOfCellDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("cells", "cells", reader);
                    }
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    paddings = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 4:
                    list2 = this.nullableListOfCornersAdapter.fromJson(reader);
                    break;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -37) {
            Boolean bool2 = bool;
            List<FreshCellListDTO.Corners> list3 = list2;
            FreshCellListDTO.Paddings paddings2 = paddings;
            CornerRadius cornerRadius2 = cornerRadius;
            String str2 = str;
            List<CellDTO> list4 = list;
            if (list4 != null) {
                return new FreshCellListDTO(list4, str2, cornerRadius2, paddings2, list3, bool2);
            }
            throw c.j("cells", "cells", reader);
        }
        Boolean bool3 = bool;
        List<FreshCellListDTO.Corners> list5 = list2;
        FreshCellListDTO.Paddings paddings3 = paddings;
        CornerRadius cornerRadius3 = cornerRadius;
        String str3 = str;
        List<CellDTO> list6 = list;
        Constructor<FreshCellListDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = FreshCellListDTO.class.getDeclaredConstructor(List.class, String.class, CornerRadius.class, FreshCellListDTO.Paddings.class, List.class, Boolean.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (list6 == null) {
            throw c.j("cells", "cells", reader);
        }
        FreshCellListDTO newInstance = constructor.newInstance(list6, str3, cornerRadius3, paddings3, list5, bool3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FreshCellListDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("cells");
        this.listOfCellDTOAdapter.mo44toJson(writer, (x) value.getCells());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("islandCornerRadius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value.getIslandCornerRadius());
        writer.w("paddings");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getPaddings());
        writer.w("corners");
        this.nullableListOfCornersAdapter.mo44toJson(writer, (x) value.getCorners());
        writer.w("showShadow");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getShowShadow());
        writer.p();
    }
}
