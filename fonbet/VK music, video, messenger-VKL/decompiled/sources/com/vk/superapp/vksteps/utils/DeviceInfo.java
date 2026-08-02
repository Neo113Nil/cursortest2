package com.vk.superapp.vksteps.utils;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: GoogleFitResponseParser.kt */
/* loaded from: classes6.dex */
public final class DeviceInfo {

    @pmi0("manufacturer")
    private final String manufacturer;

    @pmi0("model")
    private final String model;

    @pmi0("type")
    private final int type;

    @pmi0("uid")
    private final String uid;

    public DeviceInfo(int i, String str, String str2, String str3) {
        this.type = i;
        this.model = str;
        this.uid = str2;
        this.manufacturer = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return this.type == deviceInfo.type && epx.f(this.model, deviceInfo.model) && epx.f(this.uid, deviceInfo.uid) && epx.f(this.manufacturer, deviceInfo.manufacturer);
    }

    public final int hashCode() {
        return this.manufacturer.hashCode() + urd0.a(urd0.a(Integer.hashCode(this.type) * 31, 31, this.model), 31, this.uid);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceInfo(type=");
        sb.append(this.type);
        sb.append(", model=");
        sb.append(this.model);
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", manufacturer=");
        return ho8.a(sb, this.manufacturer, ')');
    }
}
