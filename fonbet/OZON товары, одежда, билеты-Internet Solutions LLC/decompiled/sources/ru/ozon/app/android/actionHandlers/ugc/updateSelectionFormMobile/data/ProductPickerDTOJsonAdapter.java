package ru.ozon.app.android.actionHandlers.ugc.updateSelectionFormMobile.data;

import Ak.b;
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
import ru.ozon.app.android.actionHandlers.ugc.updateSelectionFormMobile.data.ProductPickerDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/actionHandlers/ugc/updateSelectionFormMobile/data/ProductPickerDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/actionHandlers/ugc/updateSelectionFormMobile/data/ProductPickerDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/actionHandlers/ugc/updateSelectionFormMobile/data/ProductPickerDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/actionHandlers/ugc/updateSelectionFormMobile/data/ProductPickerDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/actionHandlers/ugc/updateSelectionFormMobile/data/ProductPickerDTO$AddProductDTO;", "addProductDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "listOfCellDTOAdapter", "listOfStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductPickerDTOJsonAdapter extends JsonAdapter<ProductPickerDTO> {

    @NotNull
    private final JsonAdapter<ProductPickerDTO.AddProductDTO> addProductDTOAdapter;
    private volatile Constructor<ProductPickerDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<CellDTO>> listOfCellDTOAdapter;

    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;

    @NotNull
    private final n.a options;

    public ProductPickerDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("addProduct", "products", "uploadValue");
        M m11 = M.f71699a;
        this.addProductDTOAdapter = moshi.f(ProductPickerDTO.AddProductDTO.class, m11, "addProduct");
        this.listOfCellDTOAdapter = moshi.f(D.e(List.class, CellDTO.class), m11, "products");
        this.listOfStringAdapter = moshi.f(D.e(List.class, String.class), m11, "uploadValue");
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(ProductPickerDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ProductPickerDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ProductPickerDTO.AddProductDTO addProductDTO = null;
        List<CellDTO> list = null;
        List<String> list2 = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                addProductDTO = this.addProductDTOAdapter.fromJson(reader);
                if (addProductDTO == null) {
                    throw c.q("addProduct", "addProduct", reader);
                }
            } else if (v11 == 1) {
                list = this.listOfCellDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("products", "products", reader);
                }
            } else if (v11 == 2) {
                list2 = this.listOfStringAdapter.fromJson(reader);
                if (list2 == null) {
                    throw c.q("uploadValue", "uploadValue", reader);
                }
                i11 = -5;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -5) {
            if (addProductDTO == null) {
                throw c.j("addProduct", "addProduct", reader);
            }
            if (list == null) {
                throw c.j("products", "products", reader);
            }
            Intrinsics.g(list2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            return new ProductPickerDTO(addProductDTO, list, list2);
        }
        Constructor<ProductPickerDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ProductPickerDTO.class.getDeclaredConstructor(ProductPickerDTO.AddProductDTO.class, List.class, List.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (addProductDTO == null) {
            throw c.j("addProduct", "addProduct", reader);
        }
        if (list == null) {
            throw c.j("products", "products", reader);
        }
        ProductPickerDTO newInstance = constructor.newInstance(addProductDTO, list, list2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ProductPickerDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("addProduct");
        this.addProductDTOAdapter.mo44toJson(writer, (x) value.getAddProduct());
        writer.w("products");
        this.listOfCellDTOAdapter.mo44toJson(writer, (x) value.getProducts());
        writer.w("uploadValue");
        this.listOfStringAdapter.mo44toJson(writer, (x) value.getUploadValue());
        writer.p();
    }
}
