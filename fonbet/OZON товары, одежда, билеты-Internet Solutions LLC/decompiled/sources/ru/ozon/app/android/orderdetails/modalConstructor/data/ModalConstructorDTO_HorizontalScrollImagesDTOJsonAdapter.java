package ru.ozon.app.android.orderdetails.modalConstructor.data;

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
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO;
import ru.ozon.app.android.orderdetails.modalConstructor.data.ModalConstructorDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/orderdetails/modalConstructor/data/ModalConstructorDTO_HorizontalScrollImagesDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/orderdetails/modalConstructor/data/ModalConstructorDTO$HorizontalScrollImagesDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/orderdetails/modalConstructor/data/ModalConstructorDTO$HorizontalScrollImagesDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/orderdetails/modalConstructor/data/ModalConstructorDTO$HorizontalScrollImagesDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;", "listOfImageDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "nullableLayoutPaddingAdapter", "Lru/ozon/app/android/orderdetails/modalConstructor/data/ModalConstructorDTO$PaddingDTO;", "nullablePaddingDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ModalConstructorDTO_HorizontalScrollImagesDTOJsonAdapter extends JsonAdapter<ModalConstructorDTO.HorizontalScrollImagesDTO> {
    public static final int $stable = 8;
    private volatile Constructor<ModalConstructorDTO.HorizontalScrollImagesDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<ImageDTO>> listOfImageDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonCellSettings.LayoutPadding> nullableLayoutPaddingAdapter;

    @NotNull
    private final JsonAdapter<ModalConstructorDTO.PaddingDTO> nullablePaddingDTOAdapter;

    @NotNull
    private final n.a options;

    public ModalConstructorDTO_HorizontalScrollImagesDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("scrollImages", "paddingBetweenImages", "padding");
        b e11 = D.e(List.class, ImageDTO.class);
        M m11 = M.f71699a;
        this.listOfImageDTOAdapter = moshi.f(e11, m11, "scrollImages");
        this.nullableLayoutPaddingAdapter = moshi.f(CommonCellSettings.LayoutPadding.class, m11, "paddingBetweenImages");
        this.nullablePaddingDTOAdapter = moshi.f(ModalConstructorDTO.PaddingDTO.class, m11, "padding");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(67, "GeneratedJsonAdapter(ModalConstructorDTO.HorizontalScrollImagesDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ModalConstructorDTO.HorizontalScrollImagesDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<ImageDTO> list = null;
        CommonCellSettings.LayoutPadding layoutPadding = null;
        ModalConstructorDTO.PaddingDTO paddingDTO = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.listOfImageDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("scrollImages", "scrollImages", reader);
                }
            } else if (v11 == 1) {
                layoutPadding = this.nullableLayoutPaddingAdapter.fromJson(reader);
                i11 = -3;
            } else if (v11 == 2) {
                paddingDTO = this.nullablePaddingDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (i11 == -3) {
            ModalConstructorDTO.PaddingDTO paddingDTO2 = paddingDTO;
            CommonCellSettings.LayoutPadding layoutPadding2 = layoutPadding;
            List<ImageDTO> list2 = list;
            if (list2 != null) {
                return new ModalConstructorDTO.HorizontalScrollImagesDTO(list2, layoutPadding2, paddingDTO2, false, 8, null);
            }
            throw c.j("scrollImages", "scrollImages", reader);
        }
        ModalConstructorDTO.PaddingDTO paddingDTO3 = paddingDTO;
        CommonCellSettings.LayoutPadding layoutPadding3 = layoutPadding;
        List<ImageDTO> list3 = list;
        Constructor<ModalConstructorDTO.HorizontalScrollImagesDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ModalConstructorDTO.HorizontalScrollImagesDTO.class.getDeclaredConstructor(List.class, CommonCellSettings.LayoutPadding.class, ModalConstructorDTO.PaddingDTO.class, Boolean.TYPE, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (list3 == null) {
            throw c.j("scrollImages", "scrollImages", reader);
        }
        ModalConstructorDTO.HorizontalScrollImagesDTO newInstance = constructor.newInstance(list3, layoutPadding3, paddingDTO3, Boolean.FALSE, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ModalConstructorDTO.HorizontalScrollImagesDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("scrollImages");
        this.listOfImageDTOAdapter.mo44toJson(writer, (x) value.getScrollImages());
        writer.w("paddingBetweenImages");
        this.nullableLayoutPaddingAdapter.mo44toJson(writer, (x) value.getPaddingBetweenImages());
        writer.w("padding");
        this.nullablePaddingDTOAdapter.mo44toJson(writer, (x) value.getPadding());
        writer.p();
    }
}
