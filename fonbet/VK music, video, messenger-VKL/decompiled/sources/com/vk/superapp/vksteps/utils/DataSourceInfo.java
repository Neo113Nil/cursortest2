package com.vk.superapp.vksteps.utils;

import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;

/* compiled from: GoogleFitResponseParser.kt */
/* loaded from: classes6.dex */
public final class DataSourceInfo {

    @pmi0("appPackageName")
    private final String appPackageName;

    @pmi0("dataType")
    private final DataTypeInfo dataType;

    @pmi0("device")
    private final DeviceInfo device;

    @pmi0("streamIdentifier")
    private final String streamIdentifier;

    @pmi0("streamName")
    private final String streamName;

    @pmi0("type")
    private final int type;

    public DataSourceInfo(String str, String str2, String str3, int i, DataTypeInfo dataTypeInfo, DeviceInfo deviceInfo) {
        this.streamName = str;
        this.streamIdentifier = str2;
        this.appPackageName = str3;
        this.type = i;
        this.dataType = dataTypeInfo;
        this.device = deviceInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataSourceInfo)) {
            return false;
        }
        DataSourceInfo dataSourceInfo = (DataSourceInfo) obj;
        return epx.f(this.streamName, dataSourceInfo.streamName) && epx.f(this.streamIdentifier, dataSourceInfo.streamIdentifier) && epx.f(this.appPackageName, dataSourceInfo.appPackageName) && this.type == dataSourceInfo.type && epx.f(this.dataType, dataSourceInfo.dataType) && epx.f(this.device, dataSourceInfo.device);
    }

    public final int hashCode() {
        int a = urd0.a(this.streamName.hashCode() * 31, 31, this.streamIdentifier);
        String str = this.appPackageName;
        int hashCode = (this.dataType.hashCode() + shy.a(this.type, (a + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
        DeviceInfo deviceInfo = this.device;
        return hashCode + (deviceInfo != null ? deviceInfo.hashCode() : 0);
    }

    public final String toString() {
        return "DataSourceInfo(streamName=" + this.streamName + ", streamIdentifier=" + this.streamIdentifier + ", appPackageName=" + this.appPackageName + ", type=" + this.type + ", dataType=" + this.dataType + ", device=" + this.device + ')';
    }
}
