package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;
import xsna.spj;

/* compiled from: StaticDeviceInfoDataSource.kt */
/* loaded from: classes14.dex */
public interface StaticDeviceInfoDataSource {
    Object fetch(List<String> list, spj<? super StaticDeviceInfoOuterClass.StaticDeviceInfo> spjVar);

    StaticDeviceInfoOuterClass.StaticDeviceInfo fetchCached();

    String getAnalyticsUserId();

    String getAppName();

    Object getAuid(spj<? super String> spjVar);

    Object getIdfi(spj<? super String> spjVar);

    String getManufacturer();

    String getModel();

    String getOsVersion();

    long getSystemBootTime();

    Object getUnityBuildGuid(spj<? super String> spjVar);
}
