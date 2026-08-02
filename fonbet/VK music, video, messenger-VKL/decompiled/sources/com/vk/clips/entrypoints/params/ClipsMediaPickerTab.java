package com.vk.clips.entrypoints.params;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsMediaPickerTab.kt */
/* loaded from: classes16.dex */
public final class ClipsMediaPickerTab {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsMediaPickerTab[] $VALUES;
    public static final ClipsMediaPickerTab Drafts;
    public static final ClipsMediaPickerTab Gallery;
    private final String key;

    static {
        ClipsMediaPickerTab clipsMediaPickerTab = new ClipsMediaPickerTab("Gallery", 0, "gallery");
        Gallery = clipsMediaPickerTab;
        ClipsMediaPickerTab clipsMediaPickerTab2 = new ClipsMediaPickerTab("Drafts", 1, "drafts");
        Drafts = clipsMediaPickerTab2;
        ClipsMediaPickerTab[] clipsMediaPickerTabArr = {clipsMediaPickerTab, clipsMediaPickerTab2};
        $VALUES = clipsMediaPickerTabArr;
        $ENTRIES = new asp(clipsMediaPickerTabArr);
    }

    public ClipsMediaPickerTab(String str, int i, String str2) {
        this.key = str2;
    }

    public static zrp<ClipsMediaPickerTab> h() {
        return $ENTRIES;
    }

    public static ClipsMediaPickerTab valueOf(String str) {
        return (ClipsMediaPickerTab) Enum.valueOf(ClipsMediaPickerTab.class, str);
    }

    public static ClipsMediaPickerTab[] values() {
        return (ClipsMediaPickerTab[]) $VALUES.clone();
    }

    public final String i() {
        return this.key;
    }
}
