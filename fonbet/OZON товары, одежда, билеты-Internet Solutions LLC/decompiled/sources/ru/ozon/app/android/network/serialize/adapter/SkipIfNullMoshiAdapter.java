package ru.ozon.app.android.network.serialize.adapter;

import Lm0.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/network/serialize/adapter/SkipIfNullMoshiAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "", "Ljava/lang/Class;", "itemType", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Ljava/lang/Class;Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Ljava/util/List;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Class;", "getItemType", "()Ljava/lang/Class;", "Lcom/squareup/moshi/Moshi;", "getMoshi", "()Lcom/squareup/moshi/Moshi;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SkipIfNullMoshiAdapter<T> extends JsonAdapter<List<? extends T>> {

    @NotNull
    private final Class<T> itemType;

    @NotNull
    private final Moshi moshi;

    public SkipIfNullMoshiAdapter(@NotNull Class<T> itemType, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.itemType = itemType;
        this.moshi = moshi;
    }

    @NotNull
    public final Class<T> getItemType() {
        return this.itemType;
    }

    @NotNull
    public final Moshi getMoshi() {
        return this.moshi;
    }

    @NotNull
    public String toString() {
        return this.moshi + ".SkipIfNullMoshiDeserializer()";
    }

    @Override // com.squareup.moshi.JsonAdapter
    public List<T> fromJson(@NotNull n reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        JsonAdapter<T> c11 = this.moshi.c(this.itemType);
        ArrayList arrayList = new ArrayList();
        reader.beginArray();
        while (reader.hasNext()) {
            try {
                Object t2 = reader.t();
                Intrinsics.g(t2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                String jSONObject = new JSONObject((Map) t2).toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
                arrayList.add(c11.fromJson(jSONObject));
            } catch (Exception e11) {
                a.f17149a.e(e11);
            }
        }
        reader.endArray();
        return arrayList;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, List<? extends T> value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.moshi.d(D.e(List.class, this.itemType)).mo44toJson(writer, (x) value);
    }
}
