package ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/data/ProductMediaDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/data/ProductMediaDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/data/ProductMediaDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/data/ProductMediaDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "", "booleanAdapter", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/data/Collage;", "nullableCollageAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductMediaDTOJsonAdapter extends JsonAdapter<ProductMediaDTO> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ProductMediaDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Collage> nullableCollageAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public ProductMediaDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("imageUrl", "radius", "backgroundColor", "backgroundParanja", "isSemiTransparent", "hasBlurAndNoise", "collage");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, "imageUrl");
        this.nullableCornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "radius");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isSemiTransparent");
        this.nullableCollageAdapter = moshi.f(Collage.class, m11, "collage");
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(ProductMediaDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ProductMediaDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        CornerRadius cornerRadius = null;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        String str = null;
        String str2 = null;
        Collage collage = null;
        int i11 = -1;
        String str3 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isSemiTransparent", "isSemiTransparent", reader);
                    }
                    i11 &= -17;
                    break;
                case 5:
                    bool3 = this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw c.q("hasBlurAndNoise", "hasBlurAndNoise", reader);
                    }
                    i11 &= -33;
                    break;
                case 6:
                    collage = this.nullableCollageAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -61) {
            return new ProductMediaDTO(str, cornerRadius, str3, str2, bool2.booleanValue(), bool3.booleanValue(), collage);
        }
        Constructor<ProductMediaDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Boolean.TYPE;
            constructor = ProductMediaDTO.class.getDeclaredConstructor(String.class, CornerRadius.class, String.class, String.class, cls2, cls2, Collage.class, Integer.TYPE, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Collage collage2 = collage;
        String str4 = str2;
        ProductMediaDTO newInstance = constructor.newInstance(str, cornerRadius, str3, str4, bool2, bool3, collage2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ProductMediaDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("imageUrl");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getImageUrl());
        writer.w("radius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value.getRadius());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("backgroundParanja");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundParanja());
        writer.w("isSemiTransparent");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isSemiTransparent()));
        writer.w("hasBlurAndNoise");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getHasBlurAndNoise()));
        writer.w("collage");
        this.nullableCollageAdapter.mo44toJson(writer, (x) value.getCollage());
        writer.p();
    }
}
