package com.vk.superapp.location.js.bridge.api.events;

import com.ironsource.O6;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import ru.ok.android.api.core.ApiUris;
import xsna.asp;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GetGeodata.kt */
/* loaded from: classes6.dex */
public final class GetGeodata$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public GetGeodata$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new GetGeodata$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetGeodata$Response)) {
            return false;
        }
        GetGeodata$Response getGeodata$Response = (GetGeodata$Response) obj;
        return epx.f(this.type, getGeodata$Response.type) && epx.f(this.data, getGeodata$Response.data) && epx.f(this.requestId, getGeodata$Response.requestId);
    }

    public final int hashCode() {
        int hashCode = (this.data.hashCode() + (this.type.hashCode() * 31)) * 31;
        String str = this.requestId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(type=");
        sb.append(this.type);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }

    public /* synthetic */ GetGeodata$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppGetGeodataResult" : str, data, str2);
    }

    /* compiled from: GetGeodata.kt */
    public static final class Data {

        @pmi0("accuracy")
        private final Float accuracy;

        @pmi0("altitude")
        private final GetGeodata$Measurement altitude;

        @pmi0("available")
        private final boolean available;

        @pmi0("bad_measurement")
        private final Boolean badMeasurement;

        @pmi0("course")
        private final GetGeodata$Measurement course;

        @pmi0(O6.s)
        private final Float lat;

        /* renamed from: long, reason: not valid java name */
        @pmi0("long")
        private final Float f44long;

        @pmi0("measurement_quality")
        private final MeasurementQuality measurementQuality;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("speed")
        private final GetGeodata$Measurement speed;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GetGeodata.kt */
        public static final class MeasurementQuality {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ MeasurementQuality[] $VALUES;

            @pmi0("bad")
            public static final MeasurementQuality BAD;

            @pmi0(ApiUris.SCHEME_OK)
            public static final MeasurementQuality OK;

            @pmi0("warning")
            public static final MeasurementQuality WARNING;

            static {
                MeasurementQuality measurementQuality = new MeasurementQuality("OK", 0);
                OK = measurementQuality;
                MeasurementQuality measurementQuality2 = new MeasurementQuality("WARNING", 1);
                WARNING = measurementQuality2;
                MeasurementQuality measurementQuality3 = new MeasurementQuality("BAD", 2);
                BAD = measurementQuality3;
                MeasurementQuality[] measurementQualityArr = {measurementQuality, measurementQuality2, measurementQuality3};
                $VALUES = measurementQualityArr;
                $ENTRIES = new asp(measurementQualityArr);
            }

            private MeasurementQuality(String str, int i) {
            }

            public static MeasurementQuality valueOf(String str) {
                return (MeasurementQuality) Enum.valueOf(MeasurementQuality.class, str);
            }

            public static MeasurementQuality[] values() {
                return (MeasurementQuality[]) $VALUES.clone();
            }
        }

        public Data(boolean z, Float f, Float f2, Float f3, Boolean bool, MeasurementQuality measurementQuality, GetGeodata$Measurement getGeodata$Measurement, GetGeodata$Measurement getGeodata$Measurement2, GetGeodata$Measurement getGeodata$Measurement3, String str) {
            this.available = z;
            this.lat = f;
            this.f44long = f2;
            this.accuracy = f3;
            this.badMeasurement = bool;
            this.measurementQuality = measurementQuality;
            this.altitude = getGeodata$Measurement;
            this.speed = getGeodata$Measurement2;
            this.course = getGeodata$Measurement3;
            this.requestId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.available == data.available && epx.f(this.lat, data.lat) && epx.f(this.f44long, data.f44long) && epx.f(this.accuracy, data.accuracy) && epx.f(this.badMeasurement, data.badMeasurement) && this.measurementQuality == data.measurementQuality && epx.f(this.altitude, data.altitude) && epx.f(this.speed, data.speed) && epx.f(this.course, data.course) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.available) * 31;
            Float f = this.lat;
            int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
            Float f2 = this.f44long;
            int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
            Float f3 = this.accuracy;
            int hashCode4 = (hashCode3 + (f3 == null ? 0 : f3.hashCode())) * 31;
            Boolean bool = this.badMeasurement;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            MeasurementQuality measurementQuality = this.measurementQuality;
            int hashCode6 = (hashCode5 + (measurementQuality == null ? 0 : measurementQuality.hashCode())) * 31;
            GetGeodata$Measurement getGeodata$Measurement = this.altitude;
            int hashCode7 = (hashCode6 + (getGeodata$Measurement == null ? 0 : getGeodata$Measurement.hashCode())) * 31;
            GetGeodata$Measurement getGeodata$Measurement2 = this.speed;
            int hashCode8 = (hashCode7 + (getGeodata$Measurement2 == null ? 0 : getGeodata$Measurement2.hashCode())) * 31;
            GetGeodata$Measurement getGeodata$Measurement3 = this.course;
            int hashCode9 = (hashCode8 + (getGeodata$Measurement3 == null ? 0 : getGeodata$Measurement3.hashCode())) * 31;
            String str = this.requestId;
            return hashCode9 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(available=");
            sb.append(this.available);
            sb.append(", lat=");
            sb.append(this.lat);
            sb.append(", long=");
            sb.append(this.f44long);
            sb.append(", accuracy=");
            sb.append(this.accuracy);
            sb.append(", badMeasurement=");
            sb.append(this.badMeasurement);
            sb.append(", measurementQuality=");
            sb.append(this.measurementQuality);
            sb.append(", altitude=");
            sb.append(this.altitude);
            sb.append(", speed=");
            sb.append(this.speed);
            sb.append(", course=");
            sb.append(this.course);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Data(boolean z, Float f, Float f2, Float f3, Boolean bool, MeasurementQuality measurementQuality, GetGeodata$Measurement getGeodata$Measurement, GetGeodata$Measurement getGeodata$Measurement2, GetGeodata$Measurement getGeodata$Measurement3, String str, int i, zcl zclVar) {
            this(z, f, f2, f3, bool, measurementQuality, getGeodata$Measurement, getGeodata$Measurement2, r11, r12);
            String str2;
            GetGeodata$Measurement getGeodata$Measurement4;
            f = (i & 2) != 0 ? null : f;
            f2 = (i & 4) != 0 ? null : f2;
            f3 = (i & 8) != 0 ? null : f3;
            bool = (i & 16) != 0 ? null : bool;
            measurementQuality = (i & 32) != 0 ? null : measurementQuality;
            getGeodata$Measurement = (i & 64) != 0 ? null : getGeodata$Measurement;
            getGeodata$Measurement2 = (i & 128) != 0 ? null : getGeodata$Measurement2;
            if ((i & 256) != 0) {
                str2 = str;
                getGeodata$Measurement4 = null;
            } else {
                str2 = str;
                getGeodata$Measurement4 = getGeodata$Measurement3;
            }
        }
    }
}
