package com.vk.superapp.vksteps.domain;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GoogleServicesDataSource.kt */
/* loaded from: classes6.dex */
public final class GoogleServicesDataSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GoogleServicesDataSource[] $VALUES;
    public static final GoogleServicesDataSource GOOGLE_FIT;
    public static final GoogleServicesDataSource HEALTH_CONNECT;

    static {
        GoogleServicesDataSource googleServicesDataSource = new GoogleServicesDataSource("HEALTH_CONNECT", 0);
        HEALTH_CONNECT = googleServicesDataSource;
        GoogleServicesDataSource googleServicesDataSource2 = new GoogleServicesDataSource("GOOGLE_FIT", 1);
        GOOGLE_FIT = googleServicesDataSource2;
        GoogleServicesDataSource[] googleServicesDataSourceArr = {googleServicesDataSource, googleServicesDataSource2};
        $VALUES = googleServicesDataSourceArr;
        $ENTRIES = new asp(googleServicesDataSourceArr);
    }

    public GoogleServicesDataSource() {
        throw null;
    }

    public static GoogleServicesDataSource valueOf(String str) {
        return (GoogleServicesDataSource) Enum.valueOf(GoogleServicesDataSource.class, str);
    }

    public static GoogleServicesDataSource[] values() {
        return (GoogleServicesDataSource[]) $VALUES.clone();
    }
}
