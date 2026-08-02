package com.iab.omid.library.unity3d.adsession;

import org.apache.cordova.networkinformation.NetworkManager;

/* loaded from: classes3.dex */
public enum DeviceCategory {
    CTV("ctv"),
    MOBILE(NetworkManager.MOBILE),
    OTHER("other");

    private final String deviceCategory;

    DeviceCategory(String str) {
        this.deviceCategory = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.deviceCategory;
    }
}
