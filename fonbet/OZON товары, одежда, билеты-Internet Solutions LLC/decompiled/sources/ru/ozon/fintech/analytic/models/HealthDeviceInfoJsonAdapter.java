package ru.ozon.fintech.analytic.models;

import Ak.b;
import Y9.c;
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

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R(\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\"\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\"\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020&\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/fintech/analytic/models/HealthDeviceInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/analytic/models/HealthDeviceInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/analytic/models/HealthDeviceInfo;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/analytic/models/HealthDeviceInfo;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "listOfIntAdapter", "nullableStringAdapter", "", "nullableMapOfStringStringAdapter", "nullableIntAdapter", "", "nullableBooleanAdapter", "Lru/ozon/fintech/analytic/models/HealthRam;", "nullableHealthRamAdapter", "", "nullableListOfDoubleAdapter", "Lru/ozon/fintech/analytic/models/HealthDisk;", "nullableListOfHealthDiskAdapter", "Lru/ozon/fintech/analytic/models/HealthLocation;", "nullableHealthLocationAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthDeviceInfoJsonAdapter extends JsonAdapter<HealthDeviceInfo> {
    private volatile Constructor<HealthDeviceInfo> constructorRef;

    @NotNull
    private final JsonAdapter<List<Integer>> listOfIntAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<HealthLocation> nullableHealthLocationAdapter;

    @NotNull
    private final JsonAdapter<HealthRam> nullableHealthRamAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<List<Double>> nullableListOfDoubleAdapter;

    @NotNull
    private final JsonAdapter<List<HealthDisk>> nullableListOfHealthDiskAdapter;

    @NotNull
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public HealthDeviceInfoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("os", "os_ver", "vendor", "model", "model_code", "device_id", "battery", "low_energy_mode", "lockdown_mode", "ram", "cpu_count", "cpu_freq", "disks", "bluetooth", "language", "geolocation");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "os");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<List<Integer>> f11 = moshi.f(D.e(List.class, Integer.class), m11, "osVer");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.listOfIntAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "vendor");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
        JsonAdapter<Map<String, String>> f13 = moshi.f(D.e(Map.class, String.class, String.class), m11, "deviceId");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableMapOfStringStringAdapter = f13;
        JsonAdapter<Integer> f14 = moshi.f(Integer.class, m11, "battery");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableIntAdapter = f14;
        JsonAdapter<Boolean> f15 = moshi.f(Boolean.class, m11, "lowEnergyMode");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableBooleanAdapter = f15;
        JsonAdapter<HealthRam> f16 = moshi.f(HealthRam.class, m11, "ram");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableHealthRamAdapter = f16;
        JsonAdapter<List<Double>> f17 = moshi.f(D.e(List.class, Double.class), m11, "cpuFreq");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableListOfDoubleAdapter = f17;
        JsonAdapter<List<HealthDisk>> f18 = moshi.f(D.e(List.class, HealthDisk.class), m11, "disks");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableListOfHealthDiskAdapter = f18;
        JsonAdapter<HealthLocation> f19 = moshi.f(HealthLocation.class, m11, "geolocation");
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.nullableHealthLocationAdapter = f19;
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(HealthDeviceInfo)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HealthDeviceInfo fromJson(@NotNull n reader) {
        String str;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str2 = null;
        List<Integer> list = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Map<String, String> map = null;
        Integer num = null;
        Boolean bool = null;
        Boolean bool2 = null;
        HealthRam healthRam = null;
        Integer num2 = null;
        List<Double> list2 = null;
        List<HealthDisk> list3 = null;
        Boolean bool3 = null;
        String str6 = null;
        HealthLocation healthLocation = null;
        while (true) {
            String str7 = str2;
            List<Integer> list4 = list;
            String str8 = str3;
            if (!reader.hasNext()) {
                String str9 = str4;
                reader.endObject();
                if (i11 == -65517) {
                    if (str7 == null) {
                        throw c.j("os", "os", reader);
                    }
                    if (list4 == null) {
                        throw c.j("osVer", "os_ver", reader);
                    }
                    if (str5 == null) {
                        throw c.j("modelCode", "model_code", reader);
                    }
                    Boolean bool4 = bool2;
                    Boolean bool5 = bool;
                    return new HealthDeviceInfo(str7, list4, str8, str9, str5, map, num, bool5, bool4, healthRam, num2, list2, list3, bool3, str6, healthLocation);
                }
                int i12 = i11;
                Constructor<HealthDeviceInfo> constructor = this.constructorRef;
                if (constructor == null) {
                    str = str8;
                    constructor = HealthDeviceInfo.class.getDeclaredConstructor(String.class, List.class, String.class, String.class, String.class, Map.class, Integer.class, Boolean.class, Boolean.class, HealthRam.class, Integer.class, List.class, List.class, Boolean.class, String.class, HealthLocation.class, Integer.TYPE, c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    str = str8;
                }
                if (str7 == null) {
                    throw c.j("os", "os", reader);
                }
                if (list4 == null) {
                    throw c.j("osVer", "os_ver", reader);
                }
                if (str5 == null) {
                    throw c.j("modelCode", "model_code", reader);
                }
                HealthDeviceInfo newInstance = constructor.newInstance(str7, list4, str, str9, str5, map, num, bool, bool2, healthRam, num2, list2, list3, bool3, str6, healthLocation, Integer.valueOf(i12), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            String str10 = str4;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    str4 = str10;
                    str2 = str7;
                    list = list4;
                    str3 = str8;
                case 0:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("os", "os", reader);
                    }
                    str4 = str10;
                    list = list4;
                    str3 = str8;
                case 1:
                    list = this.listOfIntAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("osVer", "os_ver", reader);
                    }
                    str4 = str10;
                    str2 = str7;
                    str3 = str8;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -5;
                    str4 = str10;
                    str2 = str7;
                    list = list4;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -9;
                    str2 = str7;
                    list = list4;
                    str3 = str8;
                case 4:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q("modelCode", "model_code", reader);
                    }
                    str4 = str10;
                    str2 = str7;
                    list = list4;
                    str3 = str8;
                case 5:
                    map = this.nullableMapOfStringStringAdapter.fromJson(reader);
                    i11 &= -33;
                    str4 = str10;
                    str2 = str7;
                    list = list4;
                    str3 = str8;
                case 6:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -65;
                    str4 = str10;
                    str2 = str7;
                    list = list4;
                    str3 = str8;
                case 7:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -129;
                    str4 = str10;
                    str2 = str7;
                    list = list4;
                    str3 = str8;
                case 8:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -257;
                    str4 = str10;
                    str2 = str7;
                    list = list4;
                    str3 = str8;
                case 9:
                    healthRam = this.nullableHealthRamAdapter.fromJson(reader);
                    i11 &= -513;
                    str4 = str10;
                    str2 = str7;
                    list = list4;
                    str3 = str8;
                case 10:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -1025;
                    str4 = str10;
                    str2 = str7;
                    list = list4;
                    str3 = str8;
                case 11:
                    list2 = this.nullableListOfDoubleAdapter.fromJson(reader);
                    i11 &= -2049;
                    str4 = str10;
                    str2 = str7;
                    list = list4;
                    str3 = str8;
                case 12:
                    list3 = this.nullableListOfHealthDiskAdapter.fromJson(reader);
                    i11 &= -4097;
                    str4 = str10;
                    str2 = str7;
                    list = list4;
                    str3 = str8;
                case 13:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -8193;
                    str4 = str10;
                    str2 = str7;
                    list = list4;
                    str3 = str8;
                case 14:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -16385;
                    str4 = str10;
                    str2 = str7;
                    list = list4;
                    str3 = str8;
                case 15:
                    healthLocation = this.nullableHealthLocationAdapter.fromJson(reader);
                    i11 &= -32769;
                    str4 = str10;
                    str2 = str7;
                    list = list4;
                    str3 = str8;
                default:
                    str4 = str10;
                    str2 = str7;
                    list = list4;
                    str3 = str8;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HealthDeviceInfo value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("os");
        this.stringAdapter.mo44toJson(writer, (x) value_.getOs());
        writer.w("os_ver");
        this.listOfIntAdapter.mo44toJson(writer, (x) value_.getOsVer());
        writer.w("vendor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getVendor());
        writer.w("model");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getModel());
        writer.w("model_code");
        this.stringAdapter.mo44toJson(writer, (x) value_.getModelCode());
        writer.w("device_id");
        this.nullableMapOfStringStringAdapter.mo44toJson(writer, (x) value_.getDeviceId());
        writer.w("battery");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getBattery());
        writer.w("low_energy_mode");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getLowEnergyMode());
        writer.w("lockdown_mode");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getLockdownMode());
        writer.w("ram");
        this.nullableHealthRamAdapter.mo44toJson(writer, (x) value_.getRam());
        writer.w("cpu_count");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getCpuCount());
        writer.w("cpu_freq");
        this.nullableListOfDoubleAdapter.mo44toJson(writer, (x) value_.getCpuFreq());
        writer.w("disks");
        this.nullableListOfHealthDiskAdapter.mo44toJson(writer, (x) value_.getDisks());
        writer.w("bluetooth");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getBluetooth());
        writer.w("language");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getLanguage());
        writer.w("geolocation");
        this.nullableHealthLocationAdapter.mo44toJson(writer, (x) value_.getGeolocation());
        writer.p();
    }
}
