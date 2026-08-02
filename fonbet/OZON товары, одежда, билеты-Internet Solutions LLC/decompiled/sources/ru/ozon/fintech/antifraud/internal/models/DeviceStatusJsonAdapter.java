package ru.ozon.fintech.antifraud.internal.models;

import Ak.b;
import Y9.c;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.antifraud.internal.models.DeviceStatus;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R&\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\"\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020%\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/fintech/antifraud/internal/models/DeviceStatusJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/antifraud/internal/models/DeviceStatus;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/antifraud/internal/models/DeviceStatus;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/antifraud/internal/models/DeviceStatus;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "longAdapter", "Lru/ozon/fintech/antifraud/internal/models/DeviceStatus$Location;", "nullableLocationAdapter", "", "mapOfStringStringAdapter", "", "listOfStringAdapter", "nullableStringAdapter", "nullableListOfStringAdapter", "Lru/ozon/fintech/antifraud/internal/models/DeviceStatus$CellData;", "nullableListOfCellDataAdapter", "", "intAdapter", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "internal_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeviceStatusJsonAdapter extends JsonAdapter<DeviceStatus> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<DeviceStatus> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<Map<String, String>> mapOfStringStringAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<List<DeviceStatus.CellData>> nullableListOfCellDataAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final JsonAdapter<DeviceStatus.Location> nullableLocationAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public DeviceStatusJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("call", "capt", "caller", "from_contacts", "from_call_log", "from_call_log_in_period", "last_shot_ts", "last_capt_ts", "last_call_ts", "device_time_ts", "vendor", "device", "timezone", "carrier", "carrier_id", "carrier_country", "carrier_roaming", "emulator", "location", "raw_ids", "found_apps", "wifi_ssid", "keyboards", "vpn", "ozonID_session_id", "cell_data", "is_root", "battery", "screen_on", "display_width", "display_height", "cert_hash", "first_launch", "perm_access_location", "perm_camera", "perm_post_notifications", "perm_read_contacts", "perm_use_biometric", "session_id");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<Boolean> f7 = moshi.f(Boolean.TYPE, m11, "isActiveCall");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.booleanAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "phoneNumber");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.stringAdapter = f11;
        JsonAdapter<Long> f12 = moshi.f(Long.TYPE, m11, "lastScreenshootTimeTs");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.longAdapter = f12;
        JsonAdapter<DeviceStatus.Location> f13 = moshi.f(DeviceStatus.Location.class, m11, "location");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableLocationAdapter = f13;
        JsonAdapter<Map<String, String>> f14 = moshi.f(D.e(Map.class, String.class, String.class), m11, "ids");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.mapOfStringStringAdapter = f14;
        JsonAdapter<List<String>> f15 = moshi.f(D.e(List.class, String.class), m11, "foundApps");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.listOfStringAdapter = f15;
        JsonAdapter<String> f16 = moshi.f(String.class, m11, "wifiSsid");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableStringAdapter = f16;
        JsonAdapter<List<String>> f17 = moshi.f(D.e(List.class, String.class), m11, "keyboards");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableListOfStringAdapter = f17;
        JsonAdapter<List<DeviceStatus.CellData>> f18 = moshi.f(D.e(List.class, DeviceStatus.CellData.class), m11, "cellData");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableListOfCellDataAdapter = f18;
        JsonAdapter<Integer> f19 = moshi.f(Integer.TYPE, m11, "battery");
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.intAdapter = f19;
        JsonAdapter<Boolean> f21 = moshi.f(Boolean.class, m11, "screenOn");
        Intrinsics.checkNotNullExpressionValue(f21, "adapter(...)");
        this.nullableBooleanAdapter = f21;
    }

    @NotNull
    public String toString() {
        return b.c(34, "GeneratedJsonAdapter(DeviceStatus)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DeviceStatus fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        String str = null;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        Boolean bool5 = bool4;
        Boolean bool6 = bool5;
        Boolean bool7 = bool6;
        Boolean bool8 = bool7;
        Boolean bool9 = bool8;
        Boolean bool10 = bool9;
        Long l11 = 0L;
        Long l12 = null;
        Long l13 = null;
        Long l14 = null;
        Long l15 = null;
        Integer num = 0;
        Integer num2 = null;
        Integer num3 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Map<String, String> map = null;
        List<String> list = null;
        String str5 = null;
        String str6 = null;
        List<DeviceStatus.CellData> list2 = null;
        Boolean bool11 = null;
        String str7 = null;
        Boolean bool12 = null;
        Boolean bool13 = null;
        DeviceStatus.Location location = null;
        String str8 = null;
        List<String> list3 = null;
        Boolean bool14 = null;
        Boolean bool15 = null;
        Boolean bool16 = null;
        Boolean bool17 = null;
        String str9 = null;
        int i12 = -1;
        int i13 = -1;
        String str10 = null;
        while (reader.hasNext()) {
            Boolean bool18 = bool2;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    bool2 = bool18;
                case 0:
                    bool3 = this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw c.q("isActiveCall", "call", reader);
                    }
                    i12 &= -2;
                    bool2 = bool18;
                case 1:
                    bool4 = this.booleanAdapter.fromJson(reader);
                    if (bool4 == null) {
                        throw c.q("isActiveScreenCapture", "capt", reader);
                    }
                    i12 &= -3;
                    bool2 = bool18;
                case 2:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q("phoneNumber", "caller", reader);
                    }
                    i12 &= -5;
                    bool2 = bool18;
                case 3:
                    bool5 = this.booleanAdapter.fromJson(reader);
                    if (bool5 == null) {
                        throw c.q("fromContacts", "from_contacts", reader);
                    }
                    i12 &= -9;
                    bool2 = bool18;
                case 4:
                    bool6 = this.booleanAdapter.fromJson(reader);
                    if (bool6 == null) {
                        throw c.q("fromCallLog", "from_call_log", reader);
                    }
                    i12 &= -17;
                    bool2 = bool18;
                case 5:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("fromCallLogInPeriod", "from_call_log_in_period", reader);
                    }
                    i12 &= -33;
                case 6:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw c.q("lastScreenshootTimeTs", "last_shot_ts", reader);
                    }
                    i12 &= -65;
                    bool2 = bool18;
                case 7:
                    l12 = this.longAdapter.fromJson(reader);
                    if (l12 == null) {
                        throw c.q("lastScreenCaptureTimeTs", "last_capt_ts", reader);
                    }
                    i12 &= -129;
                    bool2 = bool18;
                case 8:
                    l13 = this.longAdapter.fromJson(reader);
                    if (l13 == null) {
                        throw c.q("lastActiveCallTimeTs", "last_call_ts", reader);
                    }
                    i12 &= -257;
                    bool2 = bool18;
                case 9:
                    l14 = this.longAdapter.fromJson(reader);
                    if (l14 == null) {
                        throw c.q("currentTime", "device_time_ts", reader);
                    }
                    i12 &= -513;
                    bool2 = bool18;
                case 10:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("vendor", "vendor", reader);
                    }
                    i12 &= -1025;
                    bool2 = bool18;
                case 11:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("device", "device", reader);
                    }
                    i12 &= -2049;
                    bool2 = bool18;
                case 12:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("timezone", "timezone", reader);
                    }
                    i12 &= -4097;
                    bool2 = bool18;
                case 13:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("carrierName", "carrier", reader);
                    }
                    i12 &= -8193;
                    bool2 = bool18;
                case 14:
                    l15 = this.longAdapter.fromJson(reader);
                    if (l15 == null) {
                        throw c.q("carrierId", "carrier_id", reader);
                    }
                    i12 &= -16385;
                    bool2 = bool18;
                case 15:
                    str10 = this.stringAdapter.fromJson(reader);
                    if (str10 == null) {
                        throw c.q("carrierCountry", "carrier_country", reader);
                    }
                    i11 = -32769;
                    i12 &= i11;
                    bool2 = bool18;
                case 16:
                    bool7 = this.booleanAdapter.fromJson(reader);
                    if (bool7 == null) {
                        throw c.q("carrierRoaming", "carrier_roaming", reader);
                    }
                    i11 = -65537;
                    i12 &= i11;
                    bool2 = bool18;
                case 17:
                    bool8 = this.booleanAdapter.fromJson(reader);
                    if (bool8 == null) {
                        throw c.q("emulator", "emulator", reader);
                    }
                    i11 = -131073;
                    i12 &= i11;
                    bool2 = bool18;
                case 18:
                    location = this.nullableLocationAdapter.fromJson(reader);
                    i11 = -262145;
                    i12 &= i11;
                    bool2 = bool18;
                case 19:
                    map = this.mapOfStringStringAdapter.fromJson(reader);
                    if (map == null) {
                        throw c.q("ids", "raw_ids", reader);
                    }
                    i11 = -524289;
                    i12 &= i11;
                    bool2 = bool18;
                case 20:
                    list = this.listOfStringAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("foundApps", "found_apps", reader);
                    }
                    i11 = -1048577;
                    i12 &= i11;
                    bool2 = bool18;
                case 21:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -2097153;
                    i12 &= i11;
                    bool2 = bool18;
                case 22:
                    list3 = this.nullableListOfStringAdapter.fromJson(reader);
                    i11 = -4194305;
                    i12 &= i11;
                    bool2 = bool18;
                case 23:
                    bool9 = this.booleanAdapter.fromJson(reader);
                    if (bool9 == null) {
                        throw c.q("isVpn", "vpn", reader);
                    }
                    i11 = -8388609;
                    i12 &= i11;
                    bool2 = bool18;
                case 24:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -16777217;
                    i12 &= i11;
                    bool2 = bool18;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    list2 = this.nullableListOfCellDataAdapter.fromJson(reader);
                    i11 = -33554433;
                    i12 &= i11;
                    bool2 = bool18;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    bool10 = this.booleanAdapter.fromJson(reader);
                    if (bool10 == null) {
                        throw c.q("isRoot", "is_root", reader);
                    }
                    i11 = -67108865;
                    i12 &= i11;
                    bool2 = bool18;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("battery", "battery", reader);
                    }
                    i11 = -134217729;
                    i12 &= i11;
                    bool2 = bool18;
                case 28:
                    bool11 = this.nullableBooleanAdapter.fromJson(reader);
                    i11 = -268435457;
                    i12 &= i11;
                    bool2 = bool18;
                case 29:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("displayWidth", "display_width", reader);
                    }
                    i11 = -536870913;
                    i12 &= i11;
                    bool2 = bool18;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    num3 = this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        throw c.q("displayHeight", "display_height", reader);
                    }
                    i11 = -1073741825;
                    i12 &= i11;
                    bool2 = bool18;
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    i11 = Integer.MAX_VALUE;
                    i12 &= i11;
                    bool2 = bool18;
                case 32:
                    bool12 = this.nullableBooleanAdapter.fromJson(reader);
                    i13 &= -2;
                    bool2 = bool18;
                case 33:
                    bool13 = this.nullableBooleanAdapter.fromJson(reader);
                    i13 &= -3;
                    bool2 = bool18;
                case 34:
                    bool14 = this.nullableBooleanAdapter.fromJson(reader);
                    i13 &= -5;
                    bool2 = bool18;
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    bool15 = this.nullableBooleanAdapter.fromJson(reader);
                    i13 &= -9;
                    bool2 = bool18;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    bool16 = this.nullableBooleanAdapter.fromJson(reader);
                    i13 &= -17;
                    bool2 = bool18;
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    bool17 = this.nullableBooleanAdapter.fromJson(reader);
                    i13 &= -33;
                    bool2 = bool18;
                case 38:
                    str9 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -65;
                    bool2 = bool18;
                default:
                    bool2 = bool18;
            }
        }
        Boolean bool19 = bool2;
        reader.endObject();
        if (i12 != 0 || i13 != -128) {
            String str11 = str2;
            String str12 = str3;
            String str13 = str4;
            String str14 = str;
            String str15 = str10;
            Map<String, String> map2 = map;
            List<String> list4 = list;
            String str16 = str5;
            String str17 = str7;
            Boolean bool20 = bool12;
            Boolean bool21 = bool13;
            Constructor<DeviceStatus> constructor = this.constructorRef;
            if (constructor == null) {
                Class<?> cls = c.f34864d;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Long.TYPE;
                Class cls4 = Integer.TYPE;
                constructor = DeviceStatus.class.getDeclaredConstructor(cls2, cls2, String.class, cls2, cls2, cls2, cls3, cls3, cls3, cls3, String.class, String.class, String.class, String.class, cls3, String.class, cls2, cls2, DeviceStatus.Location.class, Map.class, List.class, String.class, List.class, cls2, String.class, List.class, cls2, cls4, Boolean.class, cls4, cls4, String.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, String.class, cls4, cls4, cls);
                this.constructorRef = constructor;
                Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
            }
            DeviceStatus newInstance = constructor.newInstance(bool3, bool4, str16, bool5, bool6, bool19, l11, l12, l13, l14, str14, str11, str12, str13, l15, str15, bool7, bool8, location, map2, list4, str8, list3, bool9, str6, list2, bool10, num, bool11, num2, num3, str17, bool20, bool21, bool14, bool15, bool16, bool17, str9, Integer.valueOf(i12), Integer.valueOf(i13), null);
            Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
            return newInstance;
        }
        Boolean bool22 = bool12;
        boolean booleanValue = bool3.booleanValue();
        Boolean bool23 = bool13;
        boolean booleanValue2 = bool4.booleanValue();
        Intrinsics.g(str5, "null cannot be cast to non-null type kotlin.String");
        boolean booleanValue3 = bool5.booleanValue();
        boolean booleanValue4 = bool6.booleanValue();
        boolean booleanValue5 = bool19.booleanValue();
        long longValue = l11.longValue();
        long longValue2 = l12.longValue();
        long longValue3 = l13.longValue();
        long longValue4 = l14.longValue();
        Intrinsics.g(str, "null cannot be cast to non-null type kotlin.String");
        Intrinsics.g(str2, "null cannot be cast to non-null type kotlin.String");
        Intrinsics.g(str3, "null cannot be cast to non-null type kotlin.String");
        Intrinsics.g(str4, "null cannot be cast to non-null type kotlin.String");
        long longValue5 = l15.longValue();
        Intrinsics.g(str10, "null cannot be cast to non-null type kotlin.String");
        boolean booleanValue6 = bool7.booleanValue();
        boolean booleanValue7 = bool8.booleanValue();
        Intrinsics.g(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        return new DeviceStatus(booleanValue, booleanValue2, str5, booleanValue3, booleanValue4, booleanValue5, longValue, longValue2, longValue3, longValue4, str, str2, str3, str4, longValue5, str10, booleanValue6, booleanValue7, location, map, list, str8, list3, bool9.booleanValue(), str6, list2, bool10.booleanValue(), num.intValue(), bool11, num2.intValue(), num3.intValue(), str7, bool22, bool23, bool14, bool15, bool16, bool17, str9);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DeviceStatus value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("call");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.isActiveCall()));
        writer.w("capt");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.isActiveScreenCapture()));
        writer.w("caller");
        this.stringAdapter.mo44toJson(writer, (x) value_.getPhoneNumber());
        writer.w("from_contacts");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getFromContacts()));
        writer.w("from_call_log");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getFromCallLog()));
        writer.w("from_call_log_in_period");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getFromCallLogInPeriod()));
        writer.w("last_shot_ts");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value_.getLastScreenshootTimeTs()));
        writer.w("last_capt_ts");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value_.getLastScreenCaptureTimeTs()));
        writer.w("last_call_ts");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value_.getLastActiveCallTimeTs()));
        writer.w("device_time_ts");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value_.getCurrentTime()));
        writer.w("vendor");
        this.stringAdapter.mo44toJson(writer, (x) value_.getVendor());
        writer.w("device");
        this.stringAdapter.mo44toJson(writer, (x) value_.getDevice());
        writer.w("timezone");
        this.stringAdapter.mo44toJson(writer, (x) value_.getTimezone());
        writer.w("carrier");
        this.stringAdapter.mo44toJson(writer, (x) value_.getCarrierName());
        writer.w("carrier_id");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value_.getCarrierId()));
        writer.w("carrier_country");
        this.stringAdapter.mo44toJson(writer, (x) value_.getCarrierCountry());
        writer.w("carrier_roaming");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getCarrierRoaming()));
        writer.w("emulator");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getEmulator()));
        writer.w("location");
        this.nullableLocationAdapter.mo44toJson(writer, (x) value_.getLocation());
        writer.w("raw_ids");
        this.mapOfStringStringAdapter.mo44toJson(writer, (x) value_.getIds());
        writer.w("found_apps");
        this.listOfStringAdapter.mo44toJson(writer, (x) value_.getFoundApps());
        writer.w("wifi_ssid");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getWifiSsid());
        writer.w("keyboards");
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value_.getKeyboards());
        writer.w("vpn");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.isVpn()));
        writer.w("ozonID_session_id");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getOzonIDSessionId());
        writer.w("cell_data");
        this.nullableListOfCellDataAdapter.mo44toJson(writer, (x) value_.getCellData());
        writer.w("is_root");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.isRoot()));
        writer.w("battery");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getBattery()));
        writer.w("screen_on");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getScreenOn());
        writer.w("display_width");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getDisplayWidth()));
        writer.w("display_height");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getDisplayHeight()));
        writer.w("cert_hash");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getCertHash());
        writer.w("first_launch");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getFirstLaunch());
        writer.w("perm_access_location");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getPermAccessLocation());
        writer.w("perm_camera");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getPermCamera());
        writer.w("perm_post_notifications");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getPermPostNotifications());
        writer.w("perm_read_contacts");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getPermReadContacts());
        writer.w("perm_use_biometric");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getPermUseBiometric());
        writer.w("session_id");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSessionId());
        writer.p();
    }
}
