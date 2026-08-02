package ru.ozon.app.android.returns.ui.data.components;

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

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/returns/ui/data/components/RmsUploadPhotosDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/ui/data/components/RmsUploadPhotosDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/ui/data/components/RmsUploadPhotosDto;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/ui/data/components/RmsUploadPhotosDto;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableIntAdapter", "", "nullableListOfStringAdapter", "Lru/ozon/app/android/returns/ui/data/components/RmsImageLocation;", "nullableListOfRmsImageLocationAdapter", "stringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RmsUploadPhotosDtoJsonAdapter extends JsonAdapter<RmsUploadPhotosDto> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<RmsUploadPhotosDto> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<List<RmsImageLocation>> nullableListOfRmsImageLocationAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public RmsUploadPhotosDtoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("isRequired", AppMeasurementSdk.ConditionalUserProperty.NAME, "limit", AppMeasurementSdk.ConditionalUserProperty.VALUE, "imageLocations", "subtext");
        M m11 = M.f71699a;
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isRequired");
        this.nullableStringAdapter = moshi.f(String.class, m11, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "limit");
        this.nullableListOfStringAdapter = moshi.f(D.e(List.class, String.class), m11, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.nullableListOfRmsImageLocationAdapter = moshi.f(D.e(List.class, RmsImageLocation.class), m11, "imageLocations");
        this.stringAdapter = moshi.f(String.class, m11, "subtext");
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(RmsUploadPhotosDto)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public RmsUploadPhotosDto fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        String str = null;
        Integer num = null;
        List<String> list = null;
        List<RmsImageLocation> list2 = null;
        String str2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isRequired", "isRequired", reader);
                    }
                    i11 = -2;
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 3:
                    list = this.nullableListOfStringAdapter.fromJson(reader);
                    break;
                case 4:
                    list2 = this.nullableListOfRmsImageLocationAdapter.fromJson(reader);
                    break;
                case 5:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("subtext", "subtext", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (i11 == -2) {
            String str3 = str2;
            List<String> list3 = list;
            String str4 = str;
            List<RmsImageLocation> list4 = list2;
            Integer num2 = num;
            boolean booleanValue = bool2.booleanValue();
            if (str3 != null) {
                return new RmsUploadPhotosDto(booleanValue, str4, num2, list3, list4, str3);
            }
            throw c.j("subtext", "subtext", reader);
        }
        List<RmsImageLocation> list5 = list2;
        String str5 = str2;
        Integer num3 = num;
        List<String> list6 = list;
        String str6 = str;
        Constructor<RmsUploadPhotosDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = RmsUploadPhotosDto.class.getDeclaredConstructor(Boolean.TYPE, String.class, Integer.class, List.class, List.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str5 == null) {
            throw c.j("subtext", "subtext", reader);
        }
        RmsUploadPhotosDto newInstance = constructor.newInstance(bool2, str6, num3, list6, list5, str5, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, RmsUploadPhotosDto value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("isRequired");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isRequired()));
        writer.w(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getName());
        writer.w("limit");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getLimit());
        writer.w(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value.getValue());
        writer.w("imageLocations");
        this.nullableListOfRmsImageLocationAdapter.mo44toJson(writer, (x) value.getImageLocations());
        writer.w("subtext");
        this.stringAdapter.mo44toJson(writer, (x) value.getSubtext());
        writer.p();
    }
}
