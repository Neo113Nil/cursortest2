package ru.ozon.fintech.settings.models;

import Ak.b;
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
import org.json.JSONObject;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/fintech/settings/models/FeatureValueJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/settings/models/FeatureValue;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/settings/models/FeatureValue;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/settings/models/FeatureValue;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableListOfStringAdapter", "Lorg/json/JSONObject;", "nullableJSONObjectAdapter", "", "nullableAnyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "fintech-settings_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FeatureValueJsonAdapter extends JsonAdapter<FeatureValue> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<FeatureValue> constructorRef;

    @NotNull
    private final JsonAdapter<Object> nullableAnyAdapter;

    @NotNull
    private final JsonAdapter<JSONObject> nullableJSONObjectAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public FeatureValueJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("enabled", "urlRegExp", "stringArrayData", "stringData", "dict", "dictParsed");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<Boolean> f7 = moshi.f(Boolean.TYPE, m11, "isEnabled");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.booleanAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "urlRegExp");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<List<String>> f12 = moshi.f(D.e(List.class, String.class), m11, "stringArrayData");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableListOfStringAdapter = f12;
        JsonAdapter<JSONObject> f13 = moshi.f(JSONObject.class, m11, "dict");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableJSONObjectAdapter = f13;
        JsonAdapter<Object> f14 = moshi.f(Object.class, m11, "dictParsed");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableAnyAdapter = f14;
    }

    @NotNull
    public String toString() {
        return b.c(34, "GeneratedJsonAdapter(FeatureValue)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FeatureValue fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        String str = null;
        List<String> list = null;
        String str2 = null;
        JSONObject jSONObject = null;
        Object obj = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isEnabled", "enabled", reader);
                    }
                    i11 &= -2;
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    list = this.nullableListOfStringAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    jSONObject = this.nullableJSONObjectAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    obj = this.nullableAnyAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -64) {
            Object obj2 = obj;
            JSONObject jSONObject2 = jSONObject;
            return new FeatureValue(bool2.booleanValue(), str, list, str2, jSONObject2, obj2);
        }
        JSONObject jSONObject3 = jSONObject;
        Object obj3 = obj;
        List<String> list2 = list;
        String str3 = str2;
        String str4 = str;
        Constructor<FeatureValue> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = FeatureValue.class.getDeclaredConstructor(Boolean.TYPE, String.class, List.class, String.class, JSONObject.class, Object.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        FeatureValue newInstance = constructor.newInstance(bool2, str4, list2, str3, jSONObject3, obj3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FeatureValue value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("enabled");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.isEnabled()));
        writer.w("urlRegExp");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getUrlRegExp());
        writer.w("stringArrayData");
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value_.getStringArrayData());
        writer.w("stringData");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getStringData());
        writer.w("dict");
        this.nullableJSONObjectAdapter.mo44toJson(writer, (x) value_.getDict());
        writer.w("dictParsed");
        this.nullableAnyAdapter.mo44toJson(writer, (x) value_.getDictParsed());
        writer.p();
    }
}
