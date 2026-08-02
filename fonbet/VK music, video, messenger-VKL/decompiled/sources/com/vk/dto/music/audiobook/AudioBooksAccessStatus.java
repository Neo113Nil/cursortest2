package com.vk.dto.music.audiobook;

import com.coremedia.iso.boxes.FreeBox;
import com.ironsource.X3;
import java.util.Iterator;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioBooksAccessStatus.kt */
/* loaded from: classes18.dex */
public final class AudioBooksAccessStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioBooksAccessStatus[] $VALUES;
    public static final a Companion;
    public static final AudioBooksAccessStatus FREE;
    public static final AudioBooksAccessStatus PAID;
    public static final AudioBooksAccessStatus STARTED;
    private final String value;

    /* compiled from: AudioBooksAccessStatus.kt */
    public static final class a {
        public static AudioBooksAccessStatus a(String str) {
            Object obj;
            Iterator<E> it = AudioBooksAccessStatus.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((AudioBooksAccessStatus) obj).i(), str)) {
                    break;
                }
            }
            AudioBooksAccessStatus audioBooksAccessStatus = (AudioBooksAccessStatus) obj;
            return audioBooksAccessStatus == null ? AudioBooksAccessStatus.PAID : audioBooksAccessStatus;
        }
    }

    static {
        AudioBooksAccessStatus audioBooksAccessStatus = new AudioBooksAccessStatus("FREE", 0, FreeBox.TYPE);
        FREE = audioBooksAccessStatus;
        AudioBooksAccessStatus audioBooksAccessStatus2 = new AudioBooksAccessStatus("PAID", 1, "paid");
        PAID = audioBooksAccessStatus2;
        AudioBooksAccessStatus audioBooksAccessStatus3 = new AudioBooksAccessStatus(SignalingProtocol.STATE_STARTED, 2, X3.i.d0);
        STARTED = audioBooksAccessStatus3;
        AudioBooksAccessStatus[] audioBooksAccessStatusArr = {audioBooksAccessStatus, audioBooksAccessStatus2, audioBooksAccessStatus3};
        $VALUES = audioBooksAccessStatusArr;
        $ENTRIES = new asp(audioBooksAccessStatusArr);
        Companion = new a();
    }

    public AudioBooksAccessStatus(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<AudioBooksAccessStatus> h() {
        return $ENTRIES;
    }

    public static AudioBooksAccessStatus valueOf(String str) {
        return (AudioBooksAccessStatus) Enum.valueOf(AudioBooksAccessStatus.class, str);
    }

    public static AudioBooksAccessStatus[] values() {
        return (AudioBooksAccessStatus[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }
}
