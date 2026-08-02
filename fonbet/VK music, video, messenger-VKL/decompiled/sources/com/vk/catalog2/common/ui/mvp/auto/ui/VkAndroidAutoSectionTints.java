package com.vk.catalog2.common.ui.mvp.auto.ui;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkAndroidAutoSectionTints.kt */
/* loaded from: classes16.dex */
public final class VkAndroidAutoSectionTints {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkAndroidAutoSectionTints[] $VALUES;
    public static final VkAndroidAutoSectionTints AUDIO_OFFLINE;
    public static final VkAndroidAutoSectionTints MY_ALBUMS;
    public static final VkAndroidAutoSectionTints MY_AUDIOS;
    public static final VkAndroidAutoSectionTints MY_PLAYLISTS;
    private final String section;
    private final int tint = -1;

    static {
        VkAndroidAutoSectionTints vkAndroidAutoSectionTints = new VkAndroidAutoSectionTints("MY_AUDIOS", 0, "audios");
        MY_AUDIOS = vkAndroidAutoSectionTints;
        VkAndroidAutoSectionTints vkAndroidAutoSectionTints2 = new VkAndroidAutoSectionTints("AUDIO_OFFLINE", 1, "audio_offline");
        AUDIO_OFFLINE = vkAndroidAutoSectionTints2;
        VkAndroidAutoSectionTints vkAndroidAutoSectionTints3 = new VkAndroidAutoSectionTints("MY_PLAYLISTS", 2, "my_playlists");
        MY_PLAYLISTS = vkAndroidAutoSectionTints3;
        VkAndroidAutoSectionTints vkAndroidAutoSectionTints4 = new VkAndroidAutoSectionTints("MY_ALBUMS", 3, "my_albums");
        MY_ALBUMS = vkAndroidAutoSectionTints4;
        VkAndroidAutoSectionTints[] vkAndroidAutoSectionTintsArr = {vkAndroidAutoSectionTints, vkAndroidAutoSectionTints2, vkAndroidAutoSectionTints3, vkAndroidAutoSectionTints4};
        $VALUES = vkAndroidAutoSectionTintsArr;
        $ENTRIES = new asp(vkAndroidAutoSectionTintsArr);
    }

    public VkAndroidAutoSectionTints(String str, int i, String str2) {
        this.section = str2;
    }

    public static zrp<VkAndroidAutoSectionTints> h() {
        return $ENTRIES;
    }

    public static VkAndroidAutoSectionTints valueOf(String str) {
        return (VkAndroidAutoSectionTints) Enum.valueOf(VkAndroidAutoSectionTints.class, str);
    }

    public static VkAndroidAutoSectionTints[] values() {
        return (VkAndroidAutoSectionTints[]) $VALUES.clone();
    }

    public final String i() {
        return this.section;
    }

    public final int j() {
        return this.tint;
    }
}
