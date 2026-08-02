package com.vk.clips.viewer.api.domain.subs;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsSubsSetting.kt */
/* loaded from: classes17.dex */
public final class ClipsSubsSetting {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsSubsSetting[] $VALUES;
    public static final ClipsSubsSetting ALWAYS;
    public static final a Companion;
    public static final ClipsSubsSetting NEVER;
    public static final ClipsSubsSetting SOUND_OFF;
    private final String value;

    /* compiled from: ClipsSubsSetting.kt */
    public static final class a {
    }

    static {
        ClipsSubsSetting clipsSubsSetting = new ClipsSubsSetting("NEVER", 0, "never");
        NEVER = clipsSubsSetting;
        ClipsSubsSetting clipsSubsSetting2 = new ClipsSubsSetting("ALWAYS", 1, "always");
        ALWAYS = clipsSubsSetting2;
        ClipsSubsSetting clipsSubsSetting3 = new ClipsSubsSetting("SOUND_OFF", 2, "sound_off");
        SOUND_OFF = clipsSubsSetting3;
        ClipsSubsSetting[] clipsSubsSettingArr = {clipsSubsSetting, clipsSubsSetting2, clipsSubsSetting3};
        $VALUES = clipsSubsSettingArr;
        $ENTRIES = new asp(clipsSubsSettingArr);
        Companion = new a();
    }

    public ClipsSubsSetting(String str, int i, String str2) {
        this.value = str2;
    }

    public static ClipsSubsSetting valueOf(String str) {
        return (ClipsSubsSetting) Enum.valueOf(ClipsSubsSetting.class, str);
    }

    public static ClipsSubsSetting[] values() {
        return (ClipsSubsSetting[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
