package ru.ozon.app.android.returns.actionModal.data.dto.processReturnAction;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.actionModal.data.dto.processReturnAction.ProcessReturnActionRequestDto;
import ru.ozon.app.android.returns.ui.data.components.RmsImageLocation;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R(\u0010\u001d\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018¨\u0006!"}, d2 = {"Lru/ozon/app/android/returns/actionModal/data/dto/processReturnAction/ProcessReturnActionRequestDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/actionModal/data/dto/processReturnAction/ProcessReturnActionRequestDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/actionModal/data/dto/processReturnAction/ProcessReturnActionRequestDto;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/actionModal/data/dto/processReturnAction/ProcessReturnActionRequestDto;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/app/android/returns/actionModal/data/dto/processReturnAction/ProcessReturnActionRequestDto$TrackingInfo;", "nullableTrackingInfoAdapter", "", "nullableMapOfStringStringAdapter", "", "Lru/ozon/app/android/returns/ui/data/components/RmsImageLocation;", "nullableListOfRmsImageLocationAdapter", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProcessReturnActionRequestDtoJsonAdapter extends JsonAdapter<ProcessReturnActionRequestDto> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<RmsImageLocation>> nullableListOfRmsImageLocationAdapter;

    @NotNull
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<ProcessReturnActionRequestDto.TrackingInfo> nullableTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public ProcessReturnActionRequestDtoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("returnNumber", "action", "comment", "trackingInfo", "extraValues", "imageLocations");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "returnNumber");
        this.nullableStringAdapter = moshi.f(String.class, m11, "comment");
        this.nullableTrackingInfoAdapter = moshi.f(ProcessReturnActionRequestDto.TrackingInfo.class, m11, "trackingInfo");
        this.nullableMapOfStringStringAdapter = moshi.f(D.e(Map.class, String.class, String.class), m11, "extraValues");
        this.nullableListOfRmsImageLocationAdapter = moshi.f(D.e(List.class, RmsImageLocation.class), m11, "imageLocations");
    }

    @NotNull
    public String toString() {
        return b.c(51, "GeneratedJsonAdapter(ProcessReturnActionRequestDto)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ProcessReturnActionRequestDto fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        ProcessReturnActionRequestDto.TrackingInfo trackingInfo = null;
        Map<String, String> map = null;
        List<RmsImageLocation> list = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("returnNumber", "returnNumber", reader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("action", "action", reader);
                    }
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    trackingInfo = this.nullableTrackingInfoAdapter.fromJson(reader);
                    break;
                case 4:
                    map = this.nullableMapOfStringStringAdapter.fromJson(reader);
                    break;
                case 5:
                    list = this.nullableListOfRmsImageLocationAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j("returnNumber", "returnNumber", reader);
        }
        if (str2 != null) {
            return new ProcessReturnActionRequestDto(str, str2, str3, trackingInfo, map, list);
        }
        throw c.j("action", "action", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ProcessReturnActionRequestDto value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("returnNumber");
        this.stringAdapter.mo44toJson(writer, (x) value.getReturnNumber());
        writer.w("action");
        this.stringAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("comment");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getComment());
        writer.w("trackingInfo");
        this.nullableTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("extraValues");
        this.nullableMapOfStringStringAdapter.mo44toJson(writer, (x) value.getExtraValues());
        writer.w("imageLocations");
        this.nullableListOfRmsImageLocationAdapter.mo44toJson(writer, (x) value.getImageLocations());
        writer.p();
    }
}
