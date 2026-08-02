package com.vk.dto.music.audiobook;

import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioBooksChapterProgressStatus.kt */
/* loaded from: classes18.dex */
public final class AudioBooksChapterProgressStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioBooksChapterProgressStatus[] $VALUES;
    public static final a Companion;
    public static final AudioBooksChapterProgressStatus DONE;
    public static final AudioBooksChapterProgressStatus IN_PROGRESS;
    public static final AudioBooksChapterProgressStatus UNREAD;
    private final String value;

    /* compiled from: AudioBooksChapterProgressStatus.kt */
    public static final class a {
        public static AudioBooksChapterProgressStatus a(String str) {
            Object obj;
            Iterator<E> it = AudioBooksChapterProgressStatus.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((AudioBooksChapterProgressStatus) obj).i(), str)) {
                    break;
                }
            }
            AudioBooksChapterProgressStatus audioBooksChapterProgressStatus = (AudioBooksChapterProgressStatus) obj;
            return audioBooksChapterProgressStatus == null ? AudioBooksChapterProgressStatus.UNREAD : audioBooksChapterProgressStatus;
        }
    }

    static {
        AudioBooksChapterProgressStatus audioBooksChapterProgressStatus = new AudioBooksChapterProgressStatus("UNREAD", 0, "unread");
        UNREAD = audioBooksChapterProgressStatus;
        AudioBooksChapterProgressStatus audioBooksChapterProgressStatus2 = new AudioBooksChapterProgressStatus("IN_PROGRESS", 1, "in_progress");
        IN_PROGRESS = audioBooksChapterProgressStatus2;
        AudioBooksChapterProgressStatus audioBooksChapterProgressStatus3 = new AudioBooksChapterProgressStatus("DONE", 2, "done");
        DONE = audioBooksChapterProgressStatus3;
        AudioBooksChapterProgressStatus[] audioBooksChapterProgressStatusArr = {audioBooksChapterProgressStatus, audioBooksChapterProgressStatus2, audioBooksChapterProgressStatus3};
        $VALUES = audioBooksChapterProgressStatusArr;
        $ENTRIES = new asp(audioBooksChapterProgressStatusArr);
        Companion = new a();
    }

    public AudioBooksChapterProgressStatus(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<AudioBooksChapterProgressStatus> h() {
        return $ENTRIES;
    }

    public static AudioBooksChapterProgressStatus valueOf(String str) {
        return (AudioBooksChapterProgressStatus) Enum.valueOf(AudioBooksChapterProgressStatus.class, str);
    }

    public static AudioBooksChapterProgressStatus[] values() {
        return (AudioBooksChapterProgressStatus[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }
}
