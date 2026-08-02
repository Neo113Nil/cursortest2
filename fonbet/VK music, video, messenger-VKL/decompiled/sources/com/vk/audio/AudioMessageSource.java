package com.vk.audio;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class AudioMessageSource {
    private static final /* synthetic */ AudioMessageSource[] $VALUES;
    public static final AudioMessageSource HANDS_FREE;
    public static final AudioMessageSource PUSH_TO_TALK;
    public static final AudioMessageSource RAISE_TO_TALK;

    static {
        AudioMessageSource audioMessageSource = new AudioMessageSource("PUSH_TO_TALK", 0);
        PUSH_TO_TALK = audioMessageSource;
        AudioMessageSource audioMessageSource2 = new AudioMessageSource("RAISE_TO_TALK", 1);
        RAISE_TO_TALK = audioMessageSource2;
        AudioMessageSource audioMessageSource3 = new AudioMessageSource("HANDS_FREE", 2);
        HANDS_FREE = audioMessageSource3;
        $VALUES = new AudioMessageSource[]{audioMessageSource, audioMessageSource2, audioMessageSource3};
    }

    public AudioMessageSource() {
        throw null;
    }

    public static AudioMessageSource valueOf(String str) {
        return (AudioMessageSource) Enum.valueOf(AudioMessageSource.class, str);
    }

    public static AudioMessageSource[] values() {
        return (AudioMessageSource[]) $VALUES.clone();
    }
}
