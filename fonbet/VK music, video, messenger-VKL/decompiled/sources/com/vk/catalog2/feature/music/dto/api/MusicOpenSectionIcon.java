package com.vk.catalog2.feature.music.dto.api;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicOpenSectionIcon.kt */
/* loaded from: classes16.dex */
public final class MusicOpenSectionIcon {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicOpenSectionIcon[] $VALUES;
    public static final MusicOpenSectionIcon ADD;
    public static final a Companion;
    public static final MusicOpenSectionIcon DEFAULT;
    private final String iconName;
    private final int iconRes;

    /* compiled from: MusicOpenSectionIcon.kt */
    public static final class a {
    }

    static {
        MusicOpenSectionIcon musicOpenSectionIcon = new MusicOpenSectionIcon("DEFAULT", 0, null, 0);
        DEFAULT = musicOpenSectionIcon;
        MusicOpenSectionIcon musicOpenSectionIcon2 = new MusicOpenSectionIcon("ADD", 1, "add", R.drawable.vk_icon_add_outline_28);
        ADD = musicOpenSectionIcon2;
        MusicOpenSectionIcon[] musicOpenSectionIconArr = {musicOpenSectionIcon, musicOpenSectionIcon2};
        $VALUES = musicOpenSectionIconArr;
        $ENTRIES = new asp(musicOpenSectionIconArr);
        Companion = new a();
    }

    public MusicOpenSectionIcon(String str, int i, String str2, int i2) {
        this.iconName = str2;
        this.iconRes = i2;
    }

    public static MusicOpenSectionIcon valueOf(String str) {
        return (MusicOpenSectionIcon) Enum.valueOf(MusicOpenSectionIcon.class, str);
    }

    public static MusicOpenSectionIcon[] values() {
        return (MusicOpenSectionIcon[]) $VALUES.clone();
    }

    public final int h() {
        return this.iconRes;
    }
}
