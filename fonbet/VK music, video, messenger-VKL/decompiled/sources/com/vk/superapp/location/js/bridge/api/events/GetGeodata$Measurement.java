package com.vk.superapp.location.js.bridge.api.events;

import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;

/* compiled from: GetGeodata.kt */
/* loaded from: classes6.dex */
public final class GetGeodata$Measurement {

    @pmi0("accuracy")
    private final Float accuracy;

    @pmi0("accuracy_available")
    private final Boolean accuracyAvailable;

    @pmi0("available")
    private final boolean available;

    @pmi0("bad_measurement")
    private final Boolean badMeasurement;

    @pmi0("value")
    private final Float value;

    public GetGeodata$Measurement(boolean z, Float f, Boolean bool, Float f2, Boolean bool2) {
        this.available = z;
        this.value = f;
        this.accuracyAvailable = bool;
        this.accuracy = f2;
        this.badMeasurement = bool2;
    }

    public final Boolean a() {
        return this.badMeasurement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetGeodata$Measurement)) {
            return false;
        }
        GetGeodata$Measurement getGeodata$Measurement = (GetGeodata$Measurement) obj;
        return this.available == getGeodata$Measurement.available && epx.f(this.value, getGeodata$Measurement.value) && epx.f(this.accuracyAvailable, getGeodata$Measurement.accuracyAvailable) && epx.f(this.accuracy, getGeodata$Measurement.accuracy) && epx.f(this.badMeasurement, getGeodata$Measurement.badMeasurement);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.available) * 31;
        Float f = this.value;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Boolean bool = this.accuracyAvailable;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f2 = this.accuracy;
        int hashCode4 = (hashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Boolean bool2 = this.badMeasurement;
        return hashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Measurement(available=");
        sb.append(this.available);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", accuracyAvailable=");
        sb.append(this.accuracyAvailable);
        sb.append(", accuracy=");
        sb.append(this.accuracy);
        sb.append(", badMeasurement=");
        return tn.a(sb, this.badMeasurement, ')');
    }

    public /* synthetic */ GetGeodata$Measurement(boolean z, Float f, Boolean bool, Float f2, Boolean bool2, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : f2, (i & 16) != 0 ? null : bool2);
    }
}
