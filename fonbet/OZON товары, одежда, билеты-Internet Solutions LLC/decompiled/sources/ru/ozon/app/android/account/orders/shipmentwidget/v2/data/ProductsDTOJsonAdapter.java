package ru.ozon.app.android.account.orders.shipmentwidget.v2.data;

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
import ru.ozon.app.android.cscore.padding.HorizontalPadding;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/ProductsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/ProductsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/ProductsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/ProductsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/ProductImageDTO;", "listOfProductImageDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/common/Paddings;", "paddingsAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Lru/ozon/app/android/cscore/padding/HorizontalPadding;", "horizontalPaddingAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductsDTOJsonAdapter extends JsonAdapter<ProductsDTO> {
    public static final int $stable = 8;
    private volatile Constructor<ProductsDTO> constructorRef;

    @NotNull
    private final JsonAdapter<HorizontalPadding> horizontalPaddingAdapter;

    @NotNull
    private final JsonAdapter<List<ProductImageDTO>> listOfProductImageDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Paddings> paddingsAdapter;

    public ProductsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("products", "spaceBetween", "common", "horizontalPadding");
        b e11 = D.e(List.class, ProductImageDTO.class);
        M m11 = M.f71699a;
        this.listOfProductImageDTOAdapter = moshi.f(e11, m11, "products");
        this.paddingsAdapter = moshi.f(Paddings.class, m11, "spaceBetween");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
        this.horizontalPaddingAdapter = moshi.f(HorizontalPadding.class, m11, "horizontalPadding");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(33, "GeneratedJsonAdapter(ProductsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ProductsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<ProductImageDTO> list = null;
        Paddings paddings = null;
        CommonControlSettings commonControlSettings = null;
        HorizontalPadding horizontalPadding = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.listOfProductImageDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("products", "products", reader);
                }
            } else if (v11 == 1) {
                paddings = this.paddingsAdapter.fromJson(reader);
                if (paddings == null) {
                    throw c.q("spaceBetween", "spaceBetween", reader);
                }
                i11 &= -3;
            } else if (v11 == 2) {
                commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
            } else if (v11 == 3) {
                horizontalPadding = this.horizontalPaddingAdapter.fromJson(reader);
                if (horizontalPadding == null) {
                    throw c.q("horizontalPadding", "horizontalPadding", reader);
                }
                i11 &= -17;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -19) {
            List<ProductImageDTO> list2 = list;
            if (list2 == null) {
                throw c.j("products", "products", reader);
            }
            Intrinsics.g(paddings, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
            Intrinsics.g(horizontalPadding, "null cannot be cast to non-null type ru.ozon.app.android.cscore.padding.HorizontalPadding");
            return new ProductsDTO(list2, paddings, commonControlSettings, null, horizontalPadding, 8, null);
        }
        List<ProductImageDTO> list3 = list;
        Constructor<ProductsDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ProductsDTO.class.getDeclaredConstructor(List.class, Paddings.class, CommonControlSettings.class, CommonControlSettings.class, HorizontalPadding.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<ProductsDTO> constructor2 = constructor;
        if (list3 == null) {
            throw c.j("products", "products", reader);
        }
        ProductsDTO newInstance = constructor2.newInstance(list3, paddings, commonControlSettings, null, horizontalPadding, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ProductsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("products");
        this.listOfProductImageDTOAdapter.mo44toJson(writer, (x) value.getProducts());
        writer.w("spaceBetween");
        this.paddingsAdapter.mo44toJson(writer, (x) value.getSpaceBetween());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("horizontalPadding");
        this.horizontalPaddingAdapter.mo44toJson(writer, (x) value.getHorizontalPadding());
        writer.p();
    }
}
