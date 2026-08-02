package ru.ozon.fintech.features.metrix.data;

import Ak.b;
import Y9.c;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018¨\u0006\""}, d2 = {"Lru/ozon/fintech/features/metrix/data/MetrixDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/metrix/data/MetrixDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/metrix/data/MetrixDto;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/metrix/data/MetrixDto;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/metrix/data/DeviceInfo;", "deviceInfoAdapter", "Lru/ozon/fintech/features/metrix/data/EtalonData;", "nullableEtalonDataAdapter", "", "Lru/ozon/fintech/features/metrix/data/Event;", "nullableListOfEventAdapter", "", "booleanAdapter", "metrix_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MetrixDtoJsonAdapter extends JsonAdapter<MetrixDto> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<DeviceInfo> deviceInfoAdapter;

    @NotNull
    private final JsonAdapter<EtalonData> nullableEtalonDataAdapter;

    @NotNull
    private final JsonAdapter<List<Event>> nullableListOfEventAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public MetrixDtoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("app", "app_ver", "device_info", "etalon_data", "events", "new_arch", "os", "os_ver", "session_id", "service_name");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "app");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<DeviceInfo> f11 = moshi.f(DeviceInfo.class, m11, "deviceInfo");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.deviceInfoAdapter = f11;
        JsonAdapter<EtalonData> f12 = moshi.f(EtalonData.class, m11, "etalonData");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableEtalonDataAdapter = f12;
        JsonAdapter<List<Event>> f13 = moshi.f(D.e(List.class, Event.class), m11, "events");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableListOfEventAdapter = f13;
        JsonAdapter<Boolean> f14 = moshi.f(Boolean.TYPE, m11, "newArch");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.booleanAdapter = f14;
    }

    @NotNull
    public String toString() {
        return b.c(31, "GeneratedJsonAdapter(MetrixDto)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public MetrixDto fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        String str = null;
        String str2 = null;
        DeviceInfo deviceInfo = null;
        EtalonData etalonData = null;
        List<Event> list = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (true) {
            Boolean bool2 = bool;
            String str7 = str;
            String str8 = str2;
            DeviceInfo deviceInfo2 = deviceInfo;
            EtalonData etalonData2 = etalonData;
            List<Event> list2 = list;
            String str9 = str3;
            String str10 = str4;
            String str11 = str5;
            String str12 = str6;
            if (!reader.hasNext()) {
                reader.endObject();
                if (str7 == null) {
                    throw c.j("app", "app", reader);
                }
                if (str8 == null) {
                    throw c.j("appVer", "app_ver", reader);
                }
                if (deviceInfo2 == null) {
                    throw c.j("deviceInfo", "device_info", reader);
                }
                if (bool2 == null) {
                    throw c.j("newArch", "new_arch", reader);
                }
                boolean booleanValue = bool2.booleanValue();
                if (str9 == null) {
                    throw c.j("os", "os", reader);
                }
                if (str10 == null) {
                    throw c.j("osVer", "os_ver", reader);
                }
                if (str11 == null) {
                    throw c.j("sessionId", "session_id", reader);
                }
                if (str12 != null) {
                    return new MetrixDto(str7, str8, deviceInfo2, etalonData2, list2, booleanValue, str9, str10, str11, str12);
                }
                throw c.j("serviceName", "service_name", reader);
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    bool = bool2;
                    str = str7;
                    str2 = str8;
                    deviceInfo = deviceInfo2;
                    etalonData = etalonData2;
                    list = list2;
                    str3 = str9;
                    str4 = str10;
                    str5 = str11;
                    str6 = str12;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("app", "app", reader);
                    }
                    bool = bool2;
                    str2 = str8;
                    deviceInfo = deviceInfo2;
                    etalonData = etalonData2;
                    list = list2;
                    str3 = str9;
                    str4 = str10;
                    str5 = str11;
                    str6 = str12;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("appVer", "app_ver", reader);
                    }
                    bool = bool2;
                    str = str7;
                    deviceInfo = deviceInfo2;
                    etalonData = etalonData2;
                    list = list2;
                    str3 = str9;
                    str4 = str10;
                    str5 = str11;
                    str6 = str12;
                case 2:
                    deviceInfo = this.deviceInfoAdapter.fromJson(reader);
                    if (deviceInfo == null) {
                        throw c.q("deviceInfo", "device_info", reader);
                    }
                    bool = bool2;
                    str = str7;
                    str2 = str8;
                    etalonData = etalonData2;
                    list = list2;
                    str3 = str9;
                    str4 = str10;
                    str5 = str11;
                    str6 = str12;
                case 3:
                    etalonData = this.nullableEtalonDataAdapter.fromJson(reader);
                    bool = bool2;
                    str = str7;
                    str2 = str8;
                    deviceInfo = deviceInfo2;
                    list = list2;
                    str3 = str9;
                    str4 = str10;
                    str5 = str11;
                    str6 = str12;
                case 4:
                    list = this.nullableListOfEventAdapter.fromJson(reader);
                    bool = bool2;
                    str = str7;
                    str2 = str8;
                    deviceInfo = deviceInfo2;
                    etalonData = etalonData2;
                    str3 = str9;
                    str4 = str10;
                    str5 = str11;
                    str6 = str12;
                case 5:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("newArch", "new_arch", reader);
                    }
                    str = str7;
                    str2 = str8;
                    deviceInfo = deviceInfo2;
                    etalonData = etalonData2;
                    list = list2;
                    str3 = str9;
                    str4 = str10;
                    str5 = str11;
                    str6 = str12;
                case 6:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("os", "os", reader);
                    }
                    bool = bool2;
                    str = str7;
                    str2 = str8;
                    deviceInfo = deviceInfo2;
                    etalonData = etalonData2;
                    list = list2;
                    str4 = str10;
                    str5 = str11;
                    str6 = str12;
                case 7:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("osVer", "os_ver", reader);
                    }
                    bool = bool2;
                    str = str7;
                    str2 = str8;
                    deviceInfo = deviceInfo2;
                    etalonData = etalonData2;
                    list = list2;
                    str3 = str9;
                    str5 = str11;
                    str6 = str12;
                case 8:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q("sessionId", "session_id", reader);
                    }
                    bool = bool2;
                    str = str7;
                    str2 = str8;
                    deviceInfo = deviceInfo2;
                    etalonData = etalonData2;
                    list = list2;
                    str3 = str9;
                    str4 = str10;
                    str6 = str12;
                case 9:
                    str6 = this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw c.q("serviceName", "service_name", reader);
                    }
                    bool = bool2;
                    str = str7;
                    str2 = str8;
                    deviceInfo = deviceInfo2;
                    etalonData = etalonData2;
                    list = list2;
                    str3 = str9;
                    str4 = str10;
                    str5 = str11;
                default:
                    bool = bool2;
                    str = str7;
                    str2 = str8;
                    deviceInfo = deviceInfo2;
                    etalonData = etalonData2;
                    list = list2;
                    str3 = str9;
                    str4 = str10;
                    str5 = str11;
                    str6 = str12;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, MetrixDto value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("app");
        this.stringAdapter.mo44toJson(writer, (x) value_.getApp());
        writer.w("app_ver");
        this.stringAdapter.mo44toJson(writer, (x) value_.getAppVer());
        writer.w("device_info");
        this.deviceInfoAdapter.mo44toJson(writer, (x) value_.getDeviceInfo());
        writer.w("etalon_data");
        this.nullableEtalonDataAdapter.mo44toJson(writer, (x) value_.getEtalonData());
        writer.w("events");
        this.nullableListOfEventAdapter.mo44toJson(writer, (x) value_.getEvents());
        writer.w("new_arch");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getNewArch()));
        writer.w("os");
        this.stringAdapter.mo44toJson(writer, (x) value_.getOs());
        writer.w("os_ver");
        this.stringAdapter.mo44toJson(writer, (x) value_.getOsVer());
        writer.w("session_id");
        this.stringAdapter.mo44toJson(writer, (x) value_.getSessionId());
        writer.w("service_name");
        this.stringAdapter.mo44toJson(writer, (x) value_.getServiceName());
        writer.p();
    }
}
