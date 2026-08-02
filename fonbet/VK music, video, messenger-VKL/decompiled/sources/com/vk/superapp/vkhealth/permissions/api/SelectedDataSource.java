package com.vk.superapp.vkhealth.permissions.api;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectedDataSource.kt */
/* loaded from: classes6.dex */
public final class SelectedDataSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SelectedDataSource[] $VALUES;
    public static final SelectedDataSource GOOGLE_FIT;
    public static final SelectedDataSource HEALTH_CONNECT;
    public static final SelectedDataSource HUAWEI_HEALTH;
    public static final SelectedDataSource UNKNOWN;

    static {
        SelectedDataSource selectedDataSource = new SelectedDataSource("GOOGLE_FIT", 0);
        GOOGLE_FIT = selectedDataSource;
        SelectedDataSource selectedDataSource2 = new SelectedDataSource("HEALTH_CONNECT", 1);
        HEALTH_CONNECT = selectedDataSource2;
        SelectedDataSource selectedDataSource3 = new SelectedDataSource(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        UNKNOWN = selectedDataSource3;
        SelectedDataSource selectedDataSource4 = new SelectedDataSource("HUAWEI_HEALTH", 3);
        HUAWEI_HEALTH = selectedDataSource4;
        SelectedDataSource[] selectedDataSourceArr = {selectedDataSource, selectedDataSource2, selectedDataSource3, selectedDataSource4};
        $VALUES = selectedDataSourceArr;
        $ENTRIES = new asp(selectedDataSourceArr);
    }

    public SelectedDataSource() {
        throw null;
    }

    public static SelectedDataSource valueOf(String str) {
        return (SelectedDataSource) Enum.valueOf(SelectedDataSource.class, str);
    }

    public static SelectedDataSource[] values() {
        return (SelectedDataSource[]) $VALUES.clone();
    }
}
