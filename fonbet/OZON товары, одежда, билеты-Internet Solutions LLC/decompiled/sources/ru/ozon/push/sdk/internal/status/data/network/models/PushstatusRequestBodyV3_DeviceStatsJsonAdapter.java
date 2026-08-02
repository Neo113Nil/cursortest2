package ru.ozon.push.sdk.internal.status.data.network.models;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.powermanager.PowerSaveState;
import ru.ozon.android.networkinfo.models.ConnectionType;
import ru.ozon.push.sdk.internal.status.data.network.models.PushstatusRequestBodyV3;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018¨\u0006\""}, d2 = {"Lru/ozon/push/sdk/internal/status/data/network/models/PushstatusRequestBodyV3_DeviceStatsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/push/sdk/internal/status/data/network/models/PushstatusRequestBodyV3$DeviceStats;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/push/sdk/internal/status/data/network/models/PushstatusRequestBodyV3$DeviceStats;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/push/sdk/internal/status/data/network/models/PushstatusRequestBodyV3$DeviceStats;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/networkinfo/models/ConnectionType;", "connectionTypeAdapter", "", "intAdapter", "", "booleanAdapter", "Lru/ozon/android/hardwareinfo/powermanager/PowerSaveState;", "powerSaveStateAdapter", "nullableBooleanAdapter", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushstatusRequestBodyV3_DeviceStatsJsonAdapter extends JsonAdapter<PushstatusRequestBodyV3.DeviceStats> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<ConnectionType> connectionTypeAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PowerSaveState> powerSaveStateAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public PushstatusRequestBodyV3_DeviceStatsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("device_model", "net", "cellular_operator", "net_provider", "battery_charge", "energy_saving_mode", "energy_saving_mode_android", "vpn");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "deviceModel");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<ConnectionType> f11 = moshi.f(ConnectionType.class, m11, "connectionType");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.connectionTypeAdapter = f11;
        JsonAdapter<Integer> f12 = moshi.f(Integer.TYPE, m11, "batteryCharge");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.intAdapter = f12;
        JsonAdapter<Boolean> f13 = moshi.f(Boolean.TYPE, m11, "isEnergySavingModeEnabled");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.booleanAdapter = f13;
        JsonAdapter<PowerSaveState> f14 = moshi.f(PowerSaveState.class, m11, "powerSaveState");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.powerSaveStateAdapter = f14;
        JsonAdapter<Boolean> f15 = moshi.f(Boolean.class, m11, "vpnOrProxyEnabled");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableBooleanAdapter = f15;
    }

    @NotNull
    public String toString() {
        return b.c(57, "GeneratedJsonAdapter(PushstatusRequestBodyV3.DeviceStats)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PushstatusRequestBodyV3.DeviceStats fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        Boolean bool = null;
        String str = null;
        ConnectionType connectionType = null;
        String str2 = null;
        String str3 = null;
        PowerSaveState powerSaveState = null;
        Boolean bool2 = null;
        while (true) {
            Integer num2 = num;
            Boolean bool3 = bool;
            String str4 = str;
            ConnectionType connectionType2 = connectionType;
            String str5 = str2;
            String str6 = str3;
            PowerSaveState powerSaveState2 = powerSaveState;
            Boolean bool4 = bool2;
            if (!reader.hasNext()) {
                reader.endObject();
                if (str4 == null) {
                    throw c.j("deviceModel", "device_model", reader);
                }
                if (connectionType2 == null) {
                    throw c.j("connectionType", "net", reader);
                }
                if (str5 == null) {
                    throw c.j("cellularOperator", "cellular_operator", reader);
                }
                if (str6 == null) {
                    throw c.j("networkProvider", "net_provider", reader);
                }
                if (num2 == null) {
                    throw c.j("batteryCharge", "battery_charge", reader);
                }
                int intValue = num2.intValue();
                if (bool3 == null) {
                    throw c.j("isEnergySavingModeEnabled", "energy_saving_mode", reader);
                }
                boolean booleanValue = bool3.booleanValue();
                if (powerSaveState2 != null) {
                    return new PushstatusRequestBodyV3.DeviceStats(str4, connectionType2, str5, str6, intValue, booleanValue, powerSaveState2, bool4);
                }
                throw c.j("powerSaveState", "energy_saving_mode_android", reader);
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    num = num2;
                    bool = bool3;
                    str = str4;
                    connectionType = connectionType2;
                    str2 = str5;
                    str3 = str6;
                    powerSaveState = powerSaveState2;
                    bool2 = bool4;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("deviceModel", "device_model", reader);
                    }
                    num = num2;
                    bool = bool3;
                    connectionType = connectionType2;
                    str2 = str5;
                    str3 = str6;
                    powerSaveState = powerSaveState2;
                    bool2 = bool4;
                case 1:
                    connectionType = this.connectionTypeAdapter.fromJson(reader);
                    if (connectionType == null) {
                        throw c.q("connectionType", "net", reader);
                    }
                    num = num2;
                    bool = bool3;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    powerSaveState = powerSaveState2;
                    bool2 = bool4;
                case 2:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("cellularOperator", "cellular_operator", reader);
                    }
                    num = num2;
                    bool = bool3;
                    str = str4;
                    connectionType = connectionType2;
                    str3 = str6;
                    powerSaveState = powerSaveState2;
                    bool2 = bool4;
                case 3:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("networkProvider", "net_provider", reader);
                    }
                    num = num2;
                    bool = bool3;
                    str = str4;
                    connectionType = connectionType2;
                    str2 = str5;
                    powerSaveState = powerSaveState2;
                    bool2 = bool4;
                case 4:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("batteryCharge", "battery_charge", reader);
                    }
                    bool = bool3;
                    str = str4;
                    connectionType = connectionType2;
                    str2 = str5;
                    str3 = str6;
                    powerSaveState = powerSaveState2;
                    bool2 = bool4;
                case 5:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("isEnergySavingModeEnabled", "energy_saving_mode", reader);
                    }
                    num = num2;
                    str = str4;
                    connectionType = connectionType2;
                    str2 = str5;
                    str3 = str6;
                    powerSaveState = powerSaveState2;
                    bool2 = bool4;
                case 6:
                    PowerSaveState fromJson = this.powerSaveStateAdapter.fromJson(reader);
                    if (fromJson == null) {
                        throw c.q("powerSaveState", "energy_saving_mode_android", reader);
                    }
                    powerSaveState = fromJson;
                    num = num2;
                    bool = bool3;
                    str = str4;
                    connectionType = connectionType2;
                    str2 = str5;
                    str3 = str6;
                    bool2 = bool4;
                case 7:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    num = num2;
                    bool = bool3;
                    str = str4;
                    connectionType = connectionType2;
                    str2 = str5;
                    str3 = str6;
                    powerSaveState = powerSaveState2;
                default:
                    num = num2;
                    bool = bool3;
                    str = str4;
                    connectionType = connectionType2;
                    str2 = str5;
                    str3 = str6;
                    powerSaveState = powerSaveState2;
                    bool2 = bool4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PushstatusRequestBodyV3.DeviceStats value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("device_model");
        this.stringAdapter.mo44toJson(writer, (x) value_.getDeviceModel());
        writer.w("net");
        this.connectionTypeAdapter.mo44toJson(writer, (x) value_.getConnectionType());
        writer.w("cellular_operator");
        this.stringAdapter.mo44toJson(writer, (x) value_.getCellularOperator());
        writer.w("net_provider");
        this.stringAdapter.mo44toJson(writer, (x) value_.getNetworkProvider());
        writer.w("battery_charge");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getBatteryCharge()));
        writer.w("energy_saving_mode");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.isEnergySavingModeEnabled()));
        writer.w("energy_saving_mode_android");
        this.powerSaveStateAdapter.mo44toJson(writer, (x) value_.getPowerSaveState());
        writer.w("vpn");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getVpnOrProxyEnabled());
        writer.p();
    }
}
