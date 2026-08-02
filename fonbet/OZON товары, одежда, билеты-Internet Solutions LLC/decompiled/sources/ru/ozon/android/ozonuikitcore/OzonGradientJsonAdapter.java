package ru.ozon.android.ozonuikitcore;

import Fj.a;
import Y9.b;
import Y9.c;
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

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/android/ozonuikitcore/OzonGradientJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/ozonuikitcore/OzonGradient;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/ozonuikitcore/OzonGradient;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/ozonuikitcore/OzonGradient;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "listOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableListOfStringAdapter", "LFj/a;", "nullableGradientDirectionAdapter", "", "listOfFloatAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OzonGradientJsonAdapter extends JsonAdapter<OzonGradient> {
    private volatile Constructor<OzonGradient> constructorRef;

    @NotNull
    private final JsonAdapter<List<Float>> listOfFloatAdapter;

    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;

    @NotNull
    private final JsonAdapter<a> nullableGradientDirectionAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final n.a options;

    public OzonGradientJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("lightValues", "darkValues", "direction", "positions");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        b e11 = D.e(List.class, String.class);
        M m11 = M.f71699a;
        JsonAdapter<List<String>> f7 = moshi.f(e11, m11, "lightValues");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.listOfStringAdapter = f7;
        JsonAdapter<List<String>> f11 = moshi.f(D.e(List.class, String.class), m11, "darkValues");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableListOfStringAdapter = f11;
        JsonAdapter<a> f12 = moshi.f(a.class, m11, "gradientDirection");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableGradientDirectionAdapter = f12;
        JsonAdapter<List<Float>> f13 = moshi.f(D.e(List.class, Float.class), m11, "positions");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.listOfFloatAdapter = f13;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(34, "GeneratedJsonAdapter(OzonGradient)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OzonGradient fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<String> list = null;
        List<String> list2 = null;
        a aVar = null;
        List<Float> list3 = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.listOfStringAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("lightValues", "lightValues", reader);
                }
            } else if (v11 == 1) {
                list2 = this.nullableListOfStringAdapter.fromJson(reader);
                i11 &= -3;
            } else if (v11 == 2) {
                aVar = this.nullableGradientDirectionAdapter.fromJson(reader);
                i11 &= -5;
            } else if (v11 == 3) {
                list3 = this.listOfFloatAdapter.fromJson(reader);
                if (list3 == null) {
                    throw c.q("positions", "positions", reader);
                }
                i11 &= -33;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -39) {
            a aVar2 = aVar;
            List<String> list4 = list2;
            List<String> list5 = list;
            if (list5 == null) {
                throw c.j("lightValues", "lightValues", reader);
            }
            Intrinsics.g(list3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
            return new OzonGradient(list5, list4, aVar2, null, null, list3, 24, null);
        }
        a aVar3 = aVar;
        List<Float> list6 = list3;
        List<String> list7 = list2;
        List<String> list8 = list;
        Constructor<OzonGradient> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = OzonGradient.class.getDeclaredConstructor(List.class, List.class, a.class, List.class, List.class, List.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (list8 == null) {
            throw c.j("lightValues", "lightValues", reader);
        }
        OzonGradient newInstance = constructor.newInstance(list8, list7, aVar3, null, null, list6, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OzonGradient value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("lightValues");
        this.listOfStringAdapter.mo44toJson(writer, (x) value_.getLightValues());
        writer.w("darkValues");
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value_.getDarkValues());
        writer.w("direction");
        this.nullableGradientDirectionAdapter.mo44toJson(writer, (x) value_.getGradientDirection());
        writer.w("positions");
        this.listOfFloatAdapter.mo44toJson(writer, (x) value_.getPositions());
        writer.p();
    }
}
