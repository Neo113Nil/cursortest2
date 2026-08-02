package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.impl.data.InstrumentationData;
import defpackage.bf3;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.vf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_InstrumentationData extends InstrumentationData {

    @Nullable
    private final vf adErrorEvent;

    @Nullable
    private final String androidDeviceInfoProtoBase64String;

    @Nullable
    private final InstrumentationData.Component component;

    @Nullable
    private final String latencyMeasurementProtoBase64String;

    @Nullable
    private final LoggableException loggableException;

    @Nullable
    private final InstrumentationData.Method method;
    private final long timestamp;

    public AutoValue_InstrumentationData(long j, @Nullable InstrumentationData.Component component, @Nullable InstrumentationData.Method method, @Nullable vf vfVar, @Nullable LoggableException loggableException, @Nullable String str, @Nullable String str2) {
        this.timestamp = j;
        this.component = component;
        this.method = method;
        this.adErrorEvent = vfVar;
        this.loggableException = loggableException;
        this.latencyMeasurementProtoBase64String = str;
        this.androidDeviceInfoProtoBase64String = str2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.InstrumentationData
    @Nullable
    public vf adErrorEvent() {
        return this.adErrorEvent;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.InstrumentationData
    @Nullable
    public String androidDeviceInfoProtoBase64String() {
        return this.androidDeviceInfoProtoBase64String;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.InstrumentationData
    @Nullable
    public InstrumentationData.Component component() {
        return this.component;
    }

    public boolean equals(Object obj) {
        InstrumentationData.Component component;
        InstrumentationData.Method method;
        vf vfVar;
        LoggableException loggableException;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstrumentationData) {
            InstrumentationData instrumentationData = (InstrumentationData) obj;
            if (this.timestamp == instrumentationData.timestamp() && ((component = this.component) != null ? component.equals(instrumentationData.component()) : instrumentationData.component() == null) && ((method = this.method) != null ? method.equals(instrumentationData.method()) : instrumentationData.method() == null) && ((vfVar = this.adErrorEvent) != null ? vfVar.equals(instrumentationData.adErrorEvent()) : instrumentationData.adErrorEvent() == null) && ((loggableException = this.loggableException) != null ? loggableException.equals(instrumentationData.loggableException()) : instrumentationData.loggableException() == null) && ((str = this.latencyMeasurementProtoBase64String) != null ? str.equals(instrumentationData.latencyMeasurementProtoBase64String()) : instrumentationData.latencyMeasurementProtoBase64String() == null) && ((str2 = this.androidDeviceInfoProtoBase64String) != null ? str2.equals(instrumentationData.androidDeviceInfoProtoBase64String()) : instrumentationData.androidDeviceInfoProtoBase64String() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        InstrumentationData.Component component = this.component;
        int hashCode = component == null ? 0 : component.hashCode();
        long j = this.timestamp;
        InstrumentationData.Method method = this.method;
        int hashCode2 = method == null ? 0 : method.hashCode();
        int i = hashCode ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
        vf vfVar = this.adErrorEvent;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (vfVar == null ? 0 : vfVar.hashCode())) * 1000003;
        LoggableException loggableException = this.loggableException;
        int hashCode4 = (hashCode3 ^ (loggableException == null ? 0 : loggableException.hashCode())) * 1000003;
        String str = this.latencyMeasurementProtoBase64String;
        int hashCode5 = (hashCode4 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.androidDeviceInfoProtoBase64String;
        return hashCode5 ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.InstrumentationData
    @Nullable
    public String latencyMeasurementProtoBase64String() {
        return this.latencyMeasurementProtoBase64String;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.InstrumentationData
    @Nullable
    public LoggableException loggableException() {
        return this.loggableException;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.InstrumentationData
    @Nullable
    public InstrumentationData.Method method() {
        return this.method;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.InstrumentationData
    public long timestamp() {
        return this.timestamp;
    }

    public String toString() {
        LoggableException loggableException = this.loggableException;
        vf vfVar = this.adErrorEvent;
        InstrumentationData.Method method = this.method;
        String valueOf = String.valueOf(this.component);
        String valueOf2 = String.valueOf(method);
        String valueOf3 = String.valueOf(vfVar);
        String valueOf4 = String.valueOf(loggableException);
        long j = this.timestamp;
        int length = String.valueOf(j).length();
        int length2 = valueOf.length();
        int length3 = valueOf2.length();
        int length4 = valueOf3.length();
        int length5 = valueOf4.length();
        String str = this.latencyMeasurementProtoBase64String;
        int length6 = String.valueOf(str).length();
        String str2 = this.androidDeviceInfoProtoBase64String;
        StringBuilder sb = new StringBuilder(length + 42 + length2 + 9 + length3 + 15 + length4 + 20 + length5 + 38 + length6 + 37 + String.valueOf(str2).length() + 1);
        fn0.t(j, "InstrumentationData{timestamp=", ", component=", sb);
        bf3.v(sb, valueOf, ", method=", valueOf2, ", adErrorEvent=");
        bf3.v(sb, valueOf3, ", loggableException=", valueOf4, ", latencyMeasurementProtoBase64String=");
        return fc6.o(sb, str, ", androidDeviceInfoProtoBase64String=", str2, "}");
    }
}
