package com.vk.toggle.data;

import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicVideoAutoDownloadConfig.kt */
/* loaded from: classes6.dex */
public final class MusicAutoDownloadTrigger {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicAutoDownloadTrigger[] $VALUES;
    public static final a Companion;
    public static final MusicAutoDownloadTrigger LISTENING;
    private final String value = "listening";

    /* compiled from: MusicVideoAutoDownloadConfig.kt */
    public static final class a {
        public static MusicAutoDownloadTrigger a(String str) {
            Object obj;
            Iterator<E> it = MusicAutoDownloadTrigger.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((MusicAutoDownloadTrigger) obj).i(), str)) {
                    break;
                }
            }
            MusicAutoDownloadTrigger musicAutoDownloadTrigger = (MusicAutoDownloadTrigger) obj;
            return musicAutoDownloadTrigger == null ? MusicAutoDownloadTrigger.LISTENING : musicAutoDownloadTrigger;
        }
    }

    static {
        MusicAutoDownloadTrigger musicAutoDownloadTrigger = new MusicAutoDownloadTrigger();
        LISTENING = musicAutoDownloadTrigger;
        MusicAutoDownloadTrigger[] musicAutoDownloadTriggerArr = {musicAutoDownloadTrigger};
        $VALUES = musicAutoDownloadTriggerArr;
        $ENTRIES = new asp(musicAutoDownloadTriggerArr);
        Companion = new a();
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
