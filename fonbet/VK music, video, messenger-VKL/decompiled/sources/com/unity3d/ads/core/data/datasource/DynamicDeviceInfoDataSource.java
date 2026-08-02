package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import java.util.List;
import xsna.ksr;

/* compiled from: DynamicDeviceInfoDataSource.kt */
/* loaded from: classes14.dex */
public interface DynamicDeviceInfoDataSource {
    DynamicDeviceInfoOuterClass.DynamicDeviceInfo fetch();

    String getConnectionTypeStr();

    int getCurrentUiTheme();

    List<String> getLocaleList();

    String getOrientation();

    int getRingerMode();

    ksr<VolumeSettingsChange> getVolumeSettingsChange();

    boolean hasInternet();
}
