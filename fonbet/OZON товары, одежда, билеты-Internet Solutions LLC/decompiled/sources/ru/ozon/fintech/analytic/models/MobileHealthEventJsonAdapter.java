package ru.ozon.fintech.analytic.models;

import Ak.b;
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

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/fintech/analytic/models/MobileHealthEventJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/analytic/models/MobileHealthEvent;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/analytic/models/MobileHealthEvent;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/analytic/models/MobileHealthEvent;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "Lru/ozon/fintech/analytic/models/HealthApplicationInfo;", "healthApplicationInfoAdapter", "Lru/ozon/fintech/analytic/models/HealthDeviceInfo;", "healthDeviceInfoAdapter", "Lru/ozon/fintech/analytic/models/HealthRunInfo;", "healthRunInfoAdapter", "Lru/ozon/fintech/analytic/models/HealthAccessibilityInfo;", "nullableHealthAccessibilityInfoAdapter", "Lru/ozon/fintech/analytic/models/HealthData;", "nullableHealthDataAdapter", "nullableStringAdapter", "Lru/ozon/fintech/analytic/models/HealthNetworkInfo;", "nullableHealthNetworkInfoAdapter", "Lru/ozon/fintech/analytic/models/HealthScreenInfo;", "nullableHealthScreenInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MobileHealthEventJsonAdapter extends JsonAdapter<MobileHealthEvent> {
    private volatile Constructor<MobileHealthEvent> constructorRef;

    @NotNull
    private final JsonAdapter<HealthApplicationInfo> healthApplicationInfoAdapter;

    @NotNull
    private final JsonAdapter<HealthDeviceInfo> healthDeviceInfoAdapter;

    @NotNull
    private final JsonAdapter<HealthRunInfo> healthRunInfoAdapter;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<HealthAccessibilityInfo> nullableHealthAccessibilityInfoAdapter;

    @NotNull
    private final JsonAdapter<HealthData> nullableHealthDataAdapter;

    @NotNull
    private final JsonAdapter<HealthNetworkInfo> nullableHealthNetworkInfoAdapter;

    @NotNull
    private final JsonAdapter<HealthScreenInfo> nullableHealthScreenInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public MobileHealthEventJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("domain", AppMeasurementSdk.ConditionalUserProperty.NAME, "class", "device_timestamp", "ozon_id", "application_info", "device_info", "run_info", "accessibility_info", "data", "code", "network_info", "screen_info");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "domain");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<Long> f11 = moshi.f(Long.TYPE, m11, "deviceTimestamp");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.longAdapter = f11;
        JsonAdapter<HealthApplicationInfo> f12 = moshi.f(HealthApplicationInfo.class, m11, "applicationInfo");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.healthApplicationInfoAdapter = f12;
        JsonAdapter<HealthDeviceInfo> f13 = moshi.f(HealthDeviceInfo.class, m11, "deviceInfo");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.healthDeviceInfoAdapter = f13;
        JsonAdapter<HealthRunInfo> f14 = moshi.f(HealthRunInfo.class, m11, "runInfo");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.healthRunInfoAdapter = f14;
        JsonAdapter<HealthAccessibilityInfo> f15 = moshi.f(HealthAccessibilityInfo.class, m11, "accessibilityInfo");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableHealthAccessibilityInfoAdapter = f15;
        JsonAdapter<HealthData> f16 = moshi.f(HealthData.class, m11, "data");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableHealthDataAdapter = f16;
        JsonAdapter<String> f17 = moshi.f(String.class, m11, "code");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableStringAdapter = f17;
        JsonAdapter<HealthNetworkInfo> f18 = moshi.f(HealthNetworkInfo.class, m11, "networkInfo");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableHealthNetworkInfoAdapter = f18;
        JsonAdapter<HealthScreenInfo> f19 = moshi.f(HealthScreenInfo.class, m11, "screenInfo");
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.nullableHealthScreenInfoAdapter = f19;
    }

    @NotNull
    public String toString() {
        return b.c(39, "GeneratedJsonAdapter(MobileHealthEvent)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public MobileHealthEvent fromJson(@NotNull n reader) {
        String str;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Long l11 = null;
        Long l12 = null;
        HealthApplicationInfo healthApplicationInfo = null;
        HealthDeviceInfo healthDeviceInfo = null;
        HealthRunInfo healthRunInfo = null;
        HealthAccessibilityInfo healthAccessibilityInfo = null;
        HealthData healthData = null;
        String str5 = null;
        HealthNetworkInfo healthNetworkInfo = null;
        HealthScreenInfo healthScreenInfo = null;
        while (true) {
            String str6 = str2;
            String str7 = str3;
            String str8 = str4;
            Long l13 = l11;
            Long l14 = l12;
            HealthApplicationInfo healthApplicationInfo2 = healthApplicationInfo;
            HealthDeviceInfo healthDeviceInfo2 = healthDeviceInfo;
            HealthRunInfo healthRunInfo2 = healthRunInfo;
            HealthAccessibilityInfo healthAccessibilityInfo2 = healthAccessibilityInfo;
            if (!reader.hasNext()) {
                reader.endObject();
                if (i11 == -7937) {
                    if (str6 == null) {
                        throw c.j("domain", "domain", reader);
                    }
                    if (str7 == null) {
                        throw c.j(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                    }
                    if (str8 == null) {
                        throw c.j("clazz", "class", reader);
                    }
                    if (l13 == null) {
                        throw c.j("deviceTimestamp", "device_timestamp", reader);
                    }
                    long longValue = l13.longValue();
                    if (l14 == null) {
                        throw c.j("ozonId", "ozon_id", reader);
                    }
                    long longValue2 = l14.longValue();
                    if (healthApplicationInfo2 == null) {
                        throw c.j("applicationInfo", "application_info", reader);
                    }
                    if (healthDeviceInfo2 == null) {
                        throw c.j("deviceInfo", "device_info", reader);
                    }
                    if (healthRunInfo2 != null) {
                        return new MobileHealthEvent(str6, str7, str8, longValue, longValue2, healthApplicationInfo2, healthDeviceInfo2, healthRunInfo2, healthAccessibilityInfo2, healthData, str5, healthNetworkInfo, healthScreenInfo);
                    }
                    throw c.j("runInfo", "run_info", reader);
                }
                int i12 = i11;
                Constructor<MobileHealthEvent> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = c.f34864d;
                    Class cls2 = Long.TYPE;
                    Class[] clsArr = {String.class, String.class, String.class, cls2, cls2, HealthApplicationInfo.class, HealthDeviceInfo.class, HealthRunInfo.class, HealthAccessibilityInfo.class, HealthData.class, String.class, HealthNetworkInfo.class, HealthScreenInfo.class, Integer.TYPE, cls};
                    str = AppMeasurementSdk.ConditionalUserProperty.NAME;
                    constructor = MobileHealthEvent.class.getDeclaredConstructor(clsArr);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    str = AppMeasurementSdk.ConditionalUserProperty.NAME;
                }
                if (str6 == null) {
                    throw c.j("domain", "domain", reader);
                }
                if (str7 == null) {
                    String str9 = str;
                    throw c.j(str9, str9, reader);
                }
                if (str8 == null) {
                    throw c.j("clazz", "class", reader);
                }
                if (l13 == null) {
                    throw c.j("deviceTimestamp", "device_timestamp", reader);
                }
                if (l14 == null) {
                    throw c.j("ozonId", "ozon_id", reader);
                }
                if (healthApplicationInfo2 == null) {
                    throw c.j("applicationInfo", "application_info", reader);
                }
                if (healthDeviceInfo2 == null) {
                    throw c.j("deviceInfo", "device_info", reader);
                }
                if (healthRunInfo2 == null) {
                    throw c.j("runInfo", "run_info", reader);
                }
                MobileHealthEvent newInstance = constructor.newInstance(str6, str7, str8, l13, l14, healthApplicationInfo2, healthDeviceInfo2, healthRunInfo2, healthAccessibilityInfo2, healthData, str5, healthNetworkInfo, healthScreenInfo, Integer.valueOf(i12), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    str2 = str6;
                    str3 = str7;
                    str4 = str8;
                    l11 = l13;
                    l12 = l14;
                    healthApplicationInfo = healthApplicationInfo2;
                    healthDeviceInfo = healthDeviceInfo2;
                    healthRunInfo = healthRunInfo2;
                    healthAccessibilityInfo = healthAccessibilityInfo2;
                case 0:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("domain", "domain", reader);
                    }
                    str3 = str7;
                    str4 = str8;
                    l11 = l13;
                    l12 = l14;
                    healthApplicationInfo = healthApplicationInfo2;
                    healthDeviceInfo = healthDeviceInfo2;
                    healthRunInfo = healthRunInfo2;
                    healthAccessibilityInfo = healthAccessibilityInfo2;
                case 1:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                    }
                    str2 = str6;
                    str4 = str8;
                    l11 = l13;
                    l12 = l14;
                    healthApplicationInfo = healthApplicationInfo2;
                    healthDeviceInfo = healthDeviceInfo2;
                    healthRunInfo = healthRunInfo2;
                    healthAccessibilityInfo = healthAccessibilityInfo2;
                case 2:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("clazz", "class", reader);
                    }
                    str2 = str6;
                    str3 = str7;
                    l11 = l13;
                    l12 = l14;
                    healthApplicationInfo = healthApplicationInfo2;
                    healthDeviceInfo = healthDeviceInfo2;
                    healthRunInfo = healthRunInfo2;
                    healthAccessibilityInfo = healthAccessibilityInfo2;
                case 3:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw c.q("deviceTimestamp", "device_timestamp", reader);
                    }
                    str2 = str6;
                    str3 = str7;
                    str4 = str8;
                    l12 = l14;
                    healthApplicationInfo = healthApplicationInfo2;
                    healthDeviceInfo = healthDeviceInfo2;
                    healthRunInfo = healthRunInfo2;
                    healthAccessibilityInfo = healthAccessibilityInfo2;
                case 4:
                    l12 = this.longAdapter.fromJson(reader);
                    if (l12 == null) {
                        throw c.q("ozonId", "ozon_id", reader);
                    }
                    str2 = str6;
                    str3 = str7;
                    str4 = str8;
                    l11 = l13;
                    healthApplicationInfo = healthApplicationInfo2;
                    healthDeviceInfo = healthDeviceInfo2;
                    healthRunInfo = healthRunInfo2;
                    healthAccessibilityInfo = healthAccessibilityInfo2;
                case 5:
                    healthApplicationInfo = this.healthApplicationInfoAdapter.fromJson(reader);
                    if (healthApplicationInfo == null) {
                        throw c.q("applicationInfo", "application_info", reader);
                    }
                    str2 = str6;
                    str3 = str7;
                    str4 = str8;
                    l11 = l13;
                    l12 = l14;
                    healthDeviceInfo = healthDeviceInfo2;
                    healthRunInfo = healthRunInfo2;
                    healthAccessibilityInfo = healthAccessibilityInfo2;
                case 6:
                    healthDeviceInfo = this.healthDeviceInfoAdapter.fromJson(reader);
                    if (healthDeviceInfo == null) {
                        throw c.q("deviceInfo", "device_info", reader);
                    }
                    str2 = str6;
                    str3 = str7;
                    str4 = str8;
                    l11 = l13;
                    l12 = l14;
                    healthApplicationInfo = healthApplicationInfo2;
                    healthRunInfo = healthRunInfo2;
                    healthAccessibilityInfo = healthAccessibilityInfo2;
                case 7:
                    HealthRunInfo fromJson = this.healthRunInfoAdapter.fromJson(reader);
                    if (fromJson == null) {
                        throw c.q("runInfo", "run_info", reader);
                    }
                    healthRunInfo = fromJson;
                    str2 = str6;
                    str3 = str7;
                    str4 = str8;
                    l11 = l13;
                    l12 = l14;
                    healthApplicationInfo = healthApplicationInfo2;
                    healthDeviceInfo = healthDeviceInfo2;
                    healthAccessibilityInfo = healthAccessibilityInfo2;
                case 8:
                    healthAccessibilityInfo = this.nullableHealthAccessibilityInfoAdapter.fromJson(reader);
                    i11 &= -257;
                    str2 = str6;
                    str3 = str7;
                    str4 = str8;
                    l11 = l13;
                    l12 = l14;
                    healthApplicationInfo = healthApplicationInfo2;
                    healthDeviceInfo = healthDeviceInfo2;
                    healthRunInfo = healthRunInfo2;
                case 9:
                    healthData = this.nullableHealthDataAdapter.fromJson(reader);
                    i11 &= -513;
                    str2 = str6;
                    str3 = str7;
                    str4 = str8;
                    l11 = l13;
                    l12 = l14;
                    healthApplicationInfo = healthApplicationInfo2;
                    healthDeviceInfo = healthDeviceInfo2;
                    healthRunInfo = healthRunInfo2;
                    healthAccessibilityInfo = healthAccessibilityInfo2;
                case 10:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -1025;
                    str2 = str6;
                    str3 = str7;
                    str4 = str8;
                    l11 = l13;
                    l12 = l14;
                    healthApplicationInfo = healthApplicationInfo2;
                    healthDeviceInfo = healthDeviceInfo2;
                    healthRunInfo = healthRunInfo2;
                    healthAccessibilityInfo = healthAccessibilityInfo2;
                case 11:
                    healthNetworkInfo = this.nullableHealthNetworkInfoAdapter.fromJson(reader);
                    i11 &= -2049;
                    str2 = str6;
                    str3 = str7;
                    str4 = str8;
                    l11 = l13;
                    l12 = l14;
                    healthApplicationInfo = healthApplicationInfo2;
                    healthDeviceInfo = healthDeviceInfo2;
                    healthRunInfo = healthRunInfo2;
                    healthAccessibilityInfo = healthAccessibilityInfo2;
                case 12:
                    healthScreenInfo = this.nullableHealthScreenInfoAdapter.fromJson(reader);
                    i11 &= -4097;
                    str2 = str6;
                    str3 = str7;
                    str4 = str8;
                    l11 = l13;
                    l12 = l14;
                    healthApplicationInfo = healthApplicationInfo2;
                    healthDeviceInfo = healthDeviceInfo2;
                    healthRunInfo = healthRunInfo2;
                    healthAccessibilityInfo = healthAccessibilityInfo2;
                default:
                    str2 = str6;
                    str3 = str7;
                    str4 = str8;
                    l11 = l13;
                    l12 = l14;
                    healthApplicationInfo = healthApplicationInfo2;
                    healthDeviceInfo = healthDeviceInfo2;
                    healthRunInfo = healthRunInfo2;
                    healthAccessibilityInfo = healthAccessibilityInfo2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, MobileHealthEvent value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("domain");
        this.stringAdapter.mo44toJson(writer, (x) value_.getDomain());
        writer.w(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.stringAdapter.mo44toJson(writer, (x) value_.getName());
        writer.w("class");
        this.stringAdapter.mo44toJson(writer, (x) value_.getClazz());
        writer.w("device_timestamp");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value_.getDeviceTimestamp()));
        writer.w("ozon_id");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value_.getOzonId()));
        writer.w("application_info");
        this.healthApplicationInfoAdapter.mo44toJson(writer, (x) value_.getApplicationInfo());
        writer.w("device_info");
        this.healthDeviceInfoAdapter.mo44toJson(writer, (x) value_.getDeviceInfo());
        writer.w("run_info");
        this.healthRunInfoAdapter.mo44toJson(writer, (x) value_.getRunInfo());
        writer.w("accessibility_info");
        this.nullableHealthAccessibilityInfoAdapter.mo44toJson(writer, (x) value_.getAccessibilityInfo());
        writer.w("data");
        this.nullableHealthDataAdapter.mo44toJson(writer, (x) value_.getData());
        writer.w("code");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getCode());
        writer.w("network_info");
        this.nullableHealthNetworkInfoAdapter.mo44toJson(writer, (x) value_.getNetworkInfo());
        writer.w("screen_info");
        this.nullableHealthScreenInfoAdapter.mo44toJson(writer, (x) value_.getScreenInfo());
        writer.p();
    }
}
