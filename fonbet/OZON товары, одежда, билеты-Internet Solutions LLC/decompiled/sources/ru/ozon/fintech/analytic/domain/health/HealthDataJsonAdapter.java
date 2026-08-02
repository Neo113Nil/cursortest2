package ru.ozon.fintech.analytic.domain.health;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k30.i;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.analytic.models.HealthData;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/fintech/analytic/domain/health/HealthDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/analytic/models/HealthData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/analytic/models/HealthData;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/analytic/models/HealthData;)V", "Lcom/squareup/moshi/Moshi;", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthDataJsonAdapter extends JsonAdapter<HealthData> {

    @NotNull
    private final Moshi moshi;

    @NotNull
    private final n.a options;

    public HealthDataJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.moshi = moshi;
        n.a a11 = n.a.C0918a.a("duration", "metadata", "object_id", "object_type", "parent_id", "source", ImagesContract.URL);
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public HealthData fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        JsonAdapter d11 = this.moshi.d(D.e(Map.class, String.class, Object.class));
        reader.beginObject();
        Long l11 = null;
        Map map = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case 0:
                    l11 = Long.valueOf(reader.nextLong());
                    break;
                case 1:
                    map = (Map) d11.fromJson(reader);
                    break;
                case 2:
                    str = reader.nextString();
                    break;
                case 3:
                    str2 = reader.nextString();
                    break;
                case 4:
                    str3 = reader.nextString();
                    break;
                case 5:
                    str4 = reader.nextString();
                    break;
                case 6:
                    str5 = reader.nextString();
                    break;
                default:
                    reader.y();
                    reader.skipValue();
                    break;
            }
        }
        reader.endObject();
        return new HealthData(l11, map, str, str2, str3, str4, str5, null, UserVerificationMethods.USER_VERIFY_PATTERN, null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HealthData value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            writer.x();
            return;
        }
        List<String> nonMaskedFields = value.getNonMaskedFields();
        LinkedHashMap linkedHashMap = null;
        if (nonMaskedFields == null || nonMaskedFields.isEmpty()) {
            Map<String, Object> metadata = value.getMetadata();
            if (metadata != null) {
                linkedHashMap = new LinkedHashMap(U.h(metadata.size()));
                Iterator<T> it = metadata.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), i.a(entry.getValue()));
                }
            }
        } else {
            Map<String, Object> metadata2 = value.getMetadata();
            if (metadata2 != null) {
                linkedHashMap = new LinkedHashMap(U.h(metadata2.size()));
                Iterator<T> it2 = metadata2.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    Object key = entry2.getKey();
                    String str = (String) entry2.getKey();
                    Object value2 = entry2.getValue();
                    if (!value.getNonMaskedFields().contains(str)) {
                        value2 = i.a(value2);
                    }
                    linkedHashMap.put(key, value2);
                }
            }
        }
        writer.j();
        writer.w("duration").Q(value.getDuration());
        writer.w("metadata").j();
        if (linkedHashMap != null) {
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                writer.w((String) entry3.getKey()).R(entry3.getValue().toString());
            }
        }
        writer.p();
        writer.w("object_id").R(value.getObjectId());
        writer.w("object_type").R(value.getObjectType());
        writer.w("parent_id").R(value.getParentId());
        writer.w("source").R(value.getSource());
        writer.w(ImagesContract.URL).R(value.getUrl());
        writer.p();
    }
}
