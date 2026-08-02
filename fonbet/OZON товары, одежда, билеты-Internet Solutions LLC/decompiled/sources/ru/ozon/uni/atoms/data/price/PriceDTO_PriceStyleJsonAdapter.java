package ru.ozon.uni.atoms.data.price;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/uni/atoms/data/price/PriceDTO_PriceStyleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/price/PriceDTO$PriceStyle;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/price/PriceDTO$PriceStyle;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/price/PriceDTO$PriceStyle;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/price/PriceDTO$PriceStyle$StyleType;", "styleTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/price/PriceDTO$Gradient;", "nullableGradientAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PriceDTO_PriceStyleJsonAdapter extends JsonAdapter<PriceDTO.PriceStyle> {
    public static final int $stable = 8;
    private volatile Constructor<PriceDTO.PriceStyle> constructorRef;

    @NotNull
    private final JsonAdapter<PriceDTO.Gradient> nullableGradientAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PriceDTO.PriceStyle.StyleType> styleTypeAdapter;

    public PriceDTO_PriceStyleJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("styleType", "gradientToken", "gradient");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<PriceDTO.PriceStyle.StyleType> f7 = moshi.f(PriceDTO.PriceStyle.StyleType.class, m11, "styleType");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.styleTypeAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "gradientToken");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<PriceDTO.Gradient> f12 = moshi.f(PriceDTO.Gradient.class, m11, "gradient");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableGradientAdapter = f12;
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(PriceDTO.PriceStyle)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PriceDTO.PriceStyle fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        PriceDTO.PriceStyle.StyleType styleType = null;
        String str = null;
        PriceDTO.Gradient gradient = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                styleType = this.styleTypeAdapter.fromJson(reader);
                if (styleType == null) {
                    throw c.q("styleType", "styleType", reader);
                }
            } else if (v11 == 1) {
                str = this.nullableStringAdapter.fromJson(reader);
                i11 &= -3;
            } else if (v11 == 2) {
                gradient = this.nullableGradientAdapter.fromJson(reader);
                i11 &= -5;
            }
        }
        reader.endObject();
        if (i11 == -7) {
            if (styleType != null) {
                return new PriceDTO.PriceStyle(styleType, str, gradient);
            }
            throw c.j("styleType", "styleType", reader);
        }
        Constructor<PriceDTO.PriceStyle> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PriceDTO.PriceStyle.class.getDeclaredConstructor(PriceDTO.PriceStyle.StyleType.class, String.class, PriceDTO.Gradient.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (styleType == null) {
            throw c.j("styleType", "styleType", reader);
        }
        PriceDTO.PriceStyle newInstance = constructor.newInstance(styleType, str, gradient, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PriceDTO.PriceStyle value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("styleType");
        this.styleTypeAdapter.mo44toJson(writer, (x) value_.getStyleType());
        writer.w("gradientToken");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getGradientToken());
        writer.w("gradient");
        this.nullableGradientAdapter.mo44toJson(writer, (x) value_.getGradient());
        writer.p();
    }
}
