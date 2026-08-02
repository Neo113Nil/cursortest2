package ru.ozon.app.android.returns.creation.widgets.photopickerunified.data;

import Ak.b;
import C.o0;
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
import ru.ozon.app.android.returns.creation.widgets.photopickerunified.data.ReturnCreationPhotoPickerUnifiedDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO_SettingsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO$SettingsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO$SettingsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO$SettingsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationPhotoPickerUnifiedDTO_SettingsDTOJsonAdapter extends JsonAdapter<ReturnCreationPhotoPickerUnifiedDTO.SettingsDTO> {
    public static final int $stable = 8;
    private volatile Constructor<ReturnCreationPhotoPickerUnifiedDTO.SettingsDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final n.a options;

    public ReturnCreationPhotoPickerUnifiedDTO_SettingsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("minCount", "maxCount");
        this.intAdapter = moshi.f(Integer.TYPE, M.f71699a, "minCount");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReturnCreationPhotoPickerUnifiedDTO.SettingsDTO fromJson(@NotNull n reader) {
        Integer a11 = o0.a(reader, "reader", 0);
        Integer num = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                a11 = this.intAdapter.fromJson(reader);
                if (a11 == null) {
                    throw c.q("minCount", "minCount", reader);
                }
                i11 = -2;
            } else if (v11 == 1 && (num = this.intAdapter.fromJson(reader)) == null) {
                throw c.q("maxCount", "maxCount", reader);
            }
        }
        reader.endObject();
        if (i11 == -2) {
            int intValue = a11.intValue();
            if (num != null) {
                return new ReturnCreationPhotoPickerUnifiedDTO.SettingsDTO(intValue, num.intValue());
            }
            throw c.j("maxCount", "maxCount", reader);
        }
        Constructor<ReturnCreationPhotoPickerUnifiedDTO.SettingsDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = ReturnCreationPhotoPickerUnifiedDTO.SettingsDTO.class.getDeclaredConstructor(cls, cls, cls, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (num == null) {
            throw c.j("maxCount", "maxCount", reader);
        }
        ReturnCreationPhotoPickerUnifiedDTO.SettingsDTO newInstance = constructor.newInstance(a11, num, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @NotNull
    public String toString() {
        return b.c(69, "GeneratedJsonAdapter(ReturnCreationPhotoPickerUnifiedDTO.SettingsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReturnCreationPhotoPickerUnifiedDTO.SettingsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("minCount");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMinCount()));
        writer.w("maxCount");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMaxCount()));
        writer.p();
    }
}
