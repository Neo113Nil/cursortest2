package com.vk.newsfeed.posting.impl.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NearbyPlaces.kt */
/* loaded from: classes4.dex */
public final class GeoPermissionStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GeoPermissionStatus[] $VALUES;
    public static final GeoPermissionStatus ApplicationRestricted;
    public static final GeoPermissionStatus DeviceRestricted;
    public static final GeoPermissionStatus Granted;

    static {
        GeoPermissionStatus geoPermissionStatus = new GeoPermissionStatus("DeviceRestricted", 0);
        DeviceRestricted = geoPermissionStatus;
        GeoPermissionStatus geoPermissionStatus2 = new GeoPermissionStatus("ApplicationRestricted", 1);
        ApplicationRestricted = geoPermissionStatus2;
        GeoPermissionStatus geoPermissionStatus3 = new GeoPermissionStatus("Granted", 2);
        Granted = geoPermissionStatus3;
        GeoPermissionStatus[] geoPermissionStatusArr = {geoPermissionStatus, geoPermissionStatus2, geoPermissionStatus3};
        $VALUES = geoPermissionStatusArr;
        $ENTRIES = new asp(geoPermissionStatusArr);
    }

    public GeoPermissionStatus() {
        throw null;
    }

    public static GeoPermissionStatus valueOf(String str) {
        return (GeoPermissionStatus) Enum.valueOf(GeoPermissionStatus.class, str);
    }

    public static GeoPermissionStatus[] values() {
        return (GeoPermissionStatus[]) $VALUES.clone();
    }
}
