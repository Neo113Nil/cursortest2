package com.squareup.moshi;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001c*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00040\u0003:\u0001\u001dB\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a¨\u0006\u0006"}, d2 = {"Lcom/squareup/moshi/MapJsonAdapter;", "K", "V", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/squareup/moshi/Moshi;", "moshi", "Ljava/lang/reflect/Type;", "keyType", "valueType", "<init>", "(Lcom/squareup/moshi/Moshi;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Ljava/util/Map;)V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Ljava/util/Map;", "", "toString", "()Ljava/lang/String;", "keyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "valueAdapter", "Factory", "a"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class MapJsonAdapter<K, V> extends JsonAdapter<Map<K, ? extends V>> {

    /* renamed from: Factory, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final JsonAdapter<K> keyAdapter;

    @NotNull
    private final JsonAdapter<V> valueAdapter;

    /* renamed from: com.squareup.moshi.MapJsonAdapter$a, reason: from kotlin metadata */
    public static final class Companion implements JsonAdapter.a {
        @Override // com.squareup.moshi.JsonAdapter.a
        public final JsonAdapter<?> create(@NotNull Type context, @NotNull Set<? extends Annotation> annotations, @NotNull Moshi moshi) {
            Type[] typeArr;
            Intrinsics.checkNotNullParameter(context, "type");
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            if (!annotations.isEmpty()) {
                return null;
            }
            Class<?> contextRawType = F.a(context);
            if (!Intrinsics.d(contextRawType, Map.class)) {
                return null;
            }
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(contextRawType, "contextRawType");
            if (context == Properties.class) {
                typeArr = new Type[]{String.class, String.class};
            } else {
                Type d11 = D.d(context, contextRawType, Map.class);
                if (d11 instanceof ParameterizedType) {
                    typeArr = ((ParameterizedType) d11).getActualTypeArguments();
                    Intrinsics.checkNotNullExpressionValue(typeArr, "mapType.actualTypeArguments");
                } else {
                    typeArr = new Type[]{Object.class, Object.class};
                }
            }
            return new MapJsonAdapter(moshi, typeArr[0], typeArr[1]).nullSafe();
        }
    }

    public MapJsonAdapter(@NotNull Moshi moshi, @NotNull Type keyType, @NotNull Type valueType) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(keyType, "keyType");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        this.keyAdapter = moshi.d(keyType);
        this.valueAdapter = moshi.d(valueType);
    }

    @NotNull
    public String toString() {
        return "JsonAdapter(" + this.keyAdapter + '=' + this.valueAdapter + ')';
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public Map<K, V> fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        y yVar = new y(0);
        reader.beginObject();
        while (reader.hasNext()) {
            reader.r();
            K fromJson = this.keyAdapter.fromJson(reader);
            if (fromJson == null) {
                throw new k("Map key is null at " + reader.d());
            }
            V fromJson2 = this.valueAdapter.fromJson(reader);
            V put = yVar.put(fromJson, fromJson2);
            if (put != null) {
                throw new k("Map key '" + fromJson + "' has multiple values at path " + reader.d() + ": " + put + " and " + fromJson2);
            }
        }
        reader.endObject();
        return yVar;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, Map<K, ? extends V> value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        writer.j();
        for (Map.Entry<K, ? extends V> entry : value.entrySet()) {
            K key = entry.getKey();
            V value2 = entry.getValue();
            if (key == null) {
                throw new k("Map key is null at " + writer.r());
            }
            int y11 = writer.y();
            if (y11 != 5 && y11 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            writer.f60477h = true;
            this.keyAdapter.mo44toJson(writer, (x) key);
            this.valueAdapter.mo44toJson(writer, (x) value2);
        }
        writer.p();
    }
}
