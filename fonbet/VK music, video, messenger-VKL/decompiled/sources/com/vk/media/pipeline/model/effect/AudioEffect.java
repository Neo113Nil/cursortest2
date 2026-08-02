package com.vk.media.pipeline.model.effect;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioEffect.kt */
/* loaded from: classes3.dex */
public final class AudioEffect {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioEffect[] $VALUES;
    public static final AudioEffect BALLOON;
    public static final AudioEffect CATHEDRAL;
    public static final AudioEffect DEFAULT;
    public static final AudioEffect ECHO;
    public static final AudioEffect EVIL;
    public static final AudioEffect GIANT;
    public static final AudioEffect HALL;
    public static final AudioEffect ROBOT;
    public static final AudioEffect SQUIRREL;

    static {
        AudioEffect audioEffect = new AudioEffect("DEFAULT", 0);
        DEFAULT = audioEffect;
        AudioEffect audioEffect2 = new AudioEffect("HALL", 1);
        HALL = audioEffect2;
        AudioEffect audioEffect3 = new AudioEffect("ECHO", 2);
        ECHO = audioEffect3;
        AudioEffect audioEffect4 = new AudioEffect("CATHEDRAL", 3);
        CATHEDRAL = audioEffect4;
        AudioEffect audioEffect5 = new AudioEffect("ROBOT", 4);
        ROBOT = audioEffect5;
        AudioEffect audioEffect6 = new AudioEffect("GIANT", 5);
        GIANT = audioEffect6;
        AudioEffect audioEffect7 = new AudioEffect("SQUIRREL", 6);
        SQUIRREL = audioEffect7;
        AudioEffect audioEffect8 = new AudioEffect("BALLOON", 7);
        BALLOON = audioEffect8;
        AudioEffect audioEffect9 = new AudioEffect("EVIL", 8);
        EVIL = audioEffect9;
        AudioEffect[] audioEffectArr = {audioEffect, audioEffect2, audioEffect3, audioEffect4, audioEffect5, audioEffect6, audioEffect7, audioEffect8, audioEffect9};
        $VALUES = audioEffectArr;
        $ENTRIES = new asp(audioEffectArr);
    }

    public AudioEffect() {
        throw null;
    }

    public static AudioEffect valueOf(String str) {
        return (AudioEffect) Enum.valueOf(AudioEffect.class, str);
    }

    public static AudioEffect[] values() {
        return (AudioEffect[]) $VALUES.clone();
    }
}
