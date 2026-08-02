package com.vk.dto.music.audiobook;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioBookPersonRole.kt */
/* loaded from: classes18.dex */
public final class AudioBookPersonRole {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioBookPersonRole[] $VALUES;
    public static final AudioBookPersonRole AUTHOR;
    public static final a Companion;
    public static final AudioBookPersonRole NARRATOR;
    private final String value;

    /* compiled from: AudioBookPersonRole.kt */
    public static final class a {
    }

    static {
        AudioBookPersonRole audioBookPersonRole = new AudioBookPersonRole("AUTHOR", 0, "author");
        AUTHOR = audioBookPersonRole;
        AudioBookPersonRole audioBookPersonRole2 = new AudioBookPersonRole("NARRATOR", 1, "narrator");
        NARRATOR = audioBookPersonRole2;
        AudioBookPersonRole[] audioBookPersonRoleArr = {audioBookPersonRole, audioBookPersonRole2};
        $VALUES = audioBookPersonRoleArr;
        $ENTRIES = new asp(audioBookPersonRoleArr);
        Companion = new a();
    }

    public AudioBookPersonRole(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<AudioBookPersonRole> h() {
        return $ENTRIES;
    }

    public static AudioBookPersonRole valueOf(String str) {
        return (AudioBookPersonRole) Enum.valueOf(AudioBookPersonRole.class, str);
    }

    public static AudioBookPersonRole[] values() {
        return (AudioBookPersonRole[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }
}
