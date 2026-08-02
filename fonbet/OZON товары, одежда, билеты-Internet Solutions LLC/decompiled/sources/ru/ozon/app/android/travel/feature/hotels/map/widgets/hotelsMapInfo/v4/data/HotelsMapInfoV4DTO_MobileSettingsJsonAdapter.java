package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.HotelsMapInfoV4DTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO_MobileSettingsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$MobileSettings;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson-JY3OwJc", "(Lcom/squareup/moshi/n;)Ljava/lang/String;", "fromJson", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson-N3LUqto", "(Lcom/squareup/moshi/x;Ljava/lang/String;)V", "toJson", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapInfoV4DTO_MobileSettingsJsonAdapter extends JsonAdapter<HotelsMapInfoV4DTO.MobileSettings> {

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public HotelsMapInfoV4DTO_MobileSettingsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("searchUpdateLink");
        this.stringAdapter = moshi.f(String.class, M.f71699a, "searchUpdateLink");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public /* bridge */ /* synthetic */ HotelsMapInfoV4DTO.MobileSettings fromJson(n nVar) {
        return HotelsMapInfoV4DTO.MobileSettings.m1324boximpl(m1331fromJsonJY3OwJc(nVar));
    }

    @NotNull
    /* renamed from: fromJson-JY3OwJc, reason: not valid java name */
    public String m1331fromJsonJY3OwJc(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0 && (str = this.stringAdapter.fromJson(reader)) == null) {
                throw c.q("searchUpdateLink", "searchUpdateLink", reader);
            }
        }
        reader.endObject();
        if (str != null) {
            return HotelsMapInfoV4DTO.MobileSettings.m1325constructorimpl(str);
        }
        throw c.j("searchUpdateLink", "searchUpdateLink", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson */
    public /* bridge */ /* synthetic */ void mo44toJson(x xVar, HotelsMapInfoV4DTO.MobileSettings mobileSettings) {
        HotelsMapInfoV4DTO.MobileSettings mobileSettings2 = mobileSettings;
        m1332toJsonN3LUqto(xVar, mobileSettings2 != null ? mobileSettings2.m1330unboximpl() : null);
    }

    /* renamed from: toJson-N3LUqto, reason: not valid java name */
    public void m1332toJsonN3LUqto(@NotNull x writer, String value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("searchUpdateLink");
        this.stringAdapter.mo44toJson(writer, (x) value);
        writer.p();
    }

    @NotNull
    public String toString() {
        return b.c(55, "GeneratedJsonAdapter(HotelsMapInfoV4DTO.MobileSettings)", "toString(...)");
    }
}
