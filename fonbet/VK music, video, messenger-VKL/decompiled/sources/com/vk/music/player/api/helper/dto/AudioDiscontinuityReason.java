package com.vk.music.player.api.helper.dto;

import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioDiscontinuityReason.kt */
/* loaded from: classes3.dex */
public final class AudioDiscontinuityReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioDiscontinuityReason[] $VALUES;
    public static final AudioDiscontinuityReason AUTO_TRANSITION;
    public static final AudioDiscontinuityReason INTERNAL;
    public static final AudioDiscontinuityReason REMOVE;
    public static final AudioDiscontinuityReason SEEK;
    public static final AudioDiscontinuityReason SEEK_ADJUSTMENT;
    public static final AudioDiscontinuityReason SILENCE_SKIP;
    public static final AudioDiscontinuityReason SKIP;

    static {
        AudioDiscontinuityReason audioDiscontinuityReason = new AudioDiscontinuityReason("AUTO_TRANSITION", 0);
        AUTO_TRANSITION = audioDiscontinuityReason;
        AudioDiscontinuityReason audioDiscontinuityReason2 = new AudioDiscontinuityReason("SEEK", 1);
        SEEK = audioDiscontinuityReason2;
        AudioDiscontinuityReason audioDiscontinuityReason3 = new AudioDiscontinuityReason("SEEK_ADJUSTMENT", 2);
        SEEK_ADJUSTMENT = audioDiscontinuityReason3;
        AudioDiscontinuityReason audioDiscontinuityReason4 = new AudioDiscontinuityReason(BatchApiRequest.FIELD_VALUE_ON_ERROR_SKIP, 3);
        SKIP = audioDiscontinuityReason4;
        AudioDiscontinuityReason audioDiscontinuityReason5 = new AudioDiscontinuityReason(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE, 4);
        REMOVE = audioDiscontinuityReason5;
        AudioDiscontinuityReason audioDiscontinuityReason6 = new AudioDiscontinuityReason("INTERNAL", 5);
        INTERNAL = audioDiscontinuityReason6;
        AudioDiscontinuityReason audioDiscontinuityReason7 = new AudioDiscontinuityReason("SILENCE_SKIP", 6);
        SILENCE_SKIP = audioDiscontinuityReason7;
        AudioDiscontinuityReason[] audioDiscontinuityReasonArr = {audioDiscontinuityReason, audioDiscontinuityReason2, audioDiscontinuityReason3, audioDiscontinuityReason4, audioDiscontinuityReason5, audioDiscontinuityReason6, audioDiscontinuityReason7};
        $VALUES = audioDiscontinuityReasonArr;
        $ENTRIES = new asp(audioDiscontinuityReasonArr);
    }

    public AudioDiscontinuityReason() {
        throw null;
    }

    public static AudioDiscontinuityReason valueOf(String str) {
        return (AudioDiscontinuityReason) Enum.valueOf(AudioDiscontinuityReason.class, str);
    }

    public static AudioDiscontinuityReason[] values() {
        return (AudioDiscontinuityReason[]) $VALUES.clone();
    }
}
