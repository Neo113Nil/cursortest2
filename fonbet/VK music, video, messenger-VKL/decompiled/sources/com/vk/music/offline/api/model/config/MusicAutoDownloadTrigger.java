package com.vk.music.offline.api.model.config;

import com.ironsource.C4217a2;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutoDownloadConfig.kt */
/* loaded from: classes.dex */
public final class MusicAutoDownloadTrigger {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicAutoDownloadTrigger[] $VALUES;
    public static final a Companion;
    public static final MusicAutoDownloadTrigger DISABLED;
    public static final MusicAutoDownloadTrigger LISTENING;
    private final String value;

    /* compiled from: AutoDownloadConfig.kt */
    public static final class a {
    }

    static {
        MusicAutoDownloadTrigger musicAutoDownloadTrigger = new MusicAutoDownloadTrigger("LISTENING", 0, "listening");
        LISTENING = musicAutoDownloadTrigger;
        MusicAutoDownloadTrigger musicAutoDownloadTrigger2 = new MusicAutoDownloadTrigger("DISABLED", 1, C4217a2.e);
        DISABLED = musicAutoDownloadTrigger2;
        MusicAutoDownloadTrigger[] musicAutoDownloadTriggerArr = {musicAutoDownloadTrigger, musicAutoDownloadTrigger2};
        $VALUES = musicAutoDownloadTriggerArr;
        $ENTRIES = new asp(musicAutoDownloadTriggerArr);
        Companion = new a();
    }

    public MusicAutoDownloadTrigger(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<MusicAutoDownloadTrigger> h() {
        return $ENTRIES;
    }

    public static MusicAutoDownloadTrigger valueOf(String str) {
        return (MusicAutoDownloadTrigger) Enum.valueOf(MusicAutoDownloadTrigger.class, str);
    }

    public static MusicAutoDownloadTrigger[] values() {
        return (MusicAutoDownloadTrigger[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }
}
