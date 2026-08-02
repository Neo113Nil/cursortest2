package ru.ozon.fintech.analytic.models;

import Ak.b;
import Y9.c;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R(\u0010\u001c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/fintech/analytic/models/HealthDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/analytic/models/HealthData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/analytic/models/HealthData;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/analytic/models/HealthData;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableLongAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "nullableMapOfStringAnyAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthDataJsonAdapter extends JsonAdapter<HealthData> {
    private volatile Constructor<HealthData> constructorRef;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringAnyAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public HealthDataJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("duration", "metadata", "object_id", "object_type", "parent_id", "source", ImagesContract.URL);
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<Long> f7 = moshi.f(Long.class, m11, "duration");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableLongAdapter = f7;
        JsonAdapter<Map<String, Object>> f11 = moshi.f(D.e(Map.class, String.class, Object.class), m11, "metadata");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableMapOfStringAnyAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "objectId");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
    }

    @NotNull
    public String toString() {
        return b.c(32, "GeneratedJsonAdapter(HealthData)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HealthData fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        Long l11 = null;
        Map<String, Object> map = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    i11 &= -2;
                    break;
                case 1:
                    map = this.nullableMapOfStringAnyAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -128) {
            String str6 = str5;
            String str7 = str4;
            String str8 = str3;
            String str9 = str2;
            return new HealthData(l11, map, str, str9, str8, str7, str6, null, UserVerificationMethods.USER_VERIFY_PATTERN, null);
        }
        String str10 = str5;
        String str11 = str4;
        String str12 = str3;
        String str13 = str2;
        String str14 = str;
        Map<String, Object> map2 = map;
        Long l12 = l11;
        Constructor<HealthData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = HealthData.class.getDeclaredConstructor(Long.class, Map.class, String.class, String.class, String.class, String.class, String.class, List.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        HealthData newInstance = constructor.newInstance(l12, map2, str14, str13, str12, str11, str10, null, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HealthData value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("duration");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getDuration());
        writer.w("metadata");
        this.nullableMapOfStringAnyAdapter.mo44toJson(writer, (x) value_.getMetadata());
        writer.w("object_id");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getObjectId());
        writer.w("object_type");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getObjectType());
        writer.w("parent_id");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getParentId());
        writer.w("source");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSource());
        writer.w(ImagesContract.URL);
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getUrl());
        writer.p();
    }
}
