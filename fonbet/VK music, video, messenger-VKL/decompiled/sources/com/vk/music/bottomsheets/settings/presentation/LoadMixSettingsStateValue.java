package com.vk.music.bottomsheets.settings.presentation;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LoadMixSettingsStateValue.kt */
/* loaded from: classes3.dex */
public final class LoadMixSettingsStateValue {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LoadMixSettingsStateValue[] $VALUES;
    public static final LoadMixSettingsStateValue COMPLETED;
    public static final LoadMixSettingsStateValue ERROR;
    public static final LoadMixSettingsStateValue LOADING;

    static {
        LoadMixSettingsStateValue loadMixSettingsStateValue = new LoadMixSettingsStateValue("LOADING", 0);
        LOADING = loadMixSettingsStateValue;
        LoadMixSettingsStateValue loadMixSettingsStateValue2 = new LoadMixSettingsStateValue("COMPLETED", 1);
        COMPLETED = loadMixSettingsStateValue2;
        LoadMixSettingsStateValue loadMixSettingsStateValue3 = new LoadMixSettingsStateValue("ERROR", 2);
        ERROR = loadMixSettingsStateValue3;
        LoadMixSettingsStateValue[] loadMixSettingsStateValueArr = {loadMixSettingsStateValue, loadMixSettingsStateValue2, loadMixSettingsStateValue3};
        $VALUES = loadMixSettingsStateValueArr;
        $ENTRIES = new asp(loadMixSettingsStateValueArr);
    }

    public LoadMixSettingsStateValue() {
        throw null;
    }

    public static LoadMixSettingsStateValue valueOf(String str) {
        return (LoadMixSettingsStateValue) Enum.valueOf(LoadMixSettingsStateValue.class, str);
    }

    public static LoadMixSettingsStateValue[] values() {
        return (LoadMixSettingsStateValue[]) $VALUES.clone();
    }
}
