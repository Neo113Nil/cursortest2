package com.vk.music.playlist.display.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LoadPlaylistState.kt */
/* loaded from: classes3.dex */
public final class LoadPlaylistStateValue {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LoadPlaylistStateValue[] $VALUES;
    public static final LoadPlaylistStateValue COMPLETED;
    public static final LoadPlaylistStateValue ERROR;
    public static final LoadPlaylistStateValue LOADING;
    public static final LoadPlaylistStateValue REFRESHING;

    static {
        LoadPlaylistStateValue loadPlaylistStateValue = new LoadPlaylistStateValue("LOADING", 0);
        LOADING = loadPlaylistStateValue;
        LoadPlaylistStateValue loadPlaylistStateValue2 = new LoadPlaylistStateValue("REFRESHING", 1);
        REFRESHING = loadPlaylistStateValue2;
        LoadPlaylistStateValue loadPlaylistStateValue3 = new LoadPlaylistStateValue("COMPLETED", 2);
        COMPLETED = loadPlaylistStateValue3;
        LoadPlaylistStateValue loadPlaylistStateValue4 = new LoadPlaylistStateValue("ERROR", 3);
        ERROR = loadPlaylistStateValue4;
        LoadPlaylistStateValue[] loadPlaylistStateValueArr = {loadPlaylistStateValue, loadPlaylistStateValue2, loadPlaylistStateValue3, loadPlaylistStateValue4};
        $VALUES = loadPlaylistStateValueArr;
        $ENTRIES = new asp(loadPlaylistStateValueArr);
    }

    public LoadPlaylistStateValue() {
        throw null;
    }

    public static LoadPlaylistStateValue valueOf(String str) {
        return (LoadPlaylistStateValue) Enum.valueOf(LoadPlaylistStateValue.class, str);
    }

    public static LoadPlaylistStateValue[] values() {
        return (LoadPlaylistStateValue[]) $VALUES.clone();
    }
}
