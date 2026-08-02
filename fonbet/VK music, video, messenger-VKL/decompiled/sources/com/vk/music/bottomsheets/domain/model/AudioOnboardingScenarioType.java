package com.vk.music.bottomsheets.domain.model;

import java.util.Locale;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioOnboardingScenarioType.kt */
/* loaded from: classes3.dex */
public final class AudioOnboardingScenarioType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioOnboardingScenarioType[] $VALUES;
    public static final AudioOnboardingScenarioType CA1;
    public static final AudioOnboardingScenarioType CA2;
    public static final AudioOnboardingScenarioType CA3;
    public static final AudioOnboardingScenarioType CA4;
    public static final a Companion;
    private final String type;

    /* compiled from: AudioOnboardingScenarioType.kt */
    public static final class a {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static AudioOnboardingScenarioType a(String str) {
            String upperCase = str != null ? str.toUpperCase(Locale.ROOT) : null;
            if (upperCase != null) {
                switch (upperCase.hashCode()) {
                    case 66451:
                        if (upperCase.equals("CA1")) {
                            return AudioOnboardingScenarioType.CA1;
                        }
                        break;
                    case 66452:
                        if (upperCase.equals("CA2")) {
                            return AudioOnboardingScenarioType.CA2;
                        }
                        break;
                    case 66453:
                        if (upperCase.equals("CA3")) {
                            return AudioOnboardingScenarioType.CA3;
                        }
                        break;
                    case 66454:
                        if (upperCase.equals("CA4")) {
                            return AudioOnboardingScenarioType.CA4;
                        }
                        break;
                }
            }
            return null;
        }
    }

    static {
        AudioOnboardingScenarioType audioOnboardingScenarioType = new AudioOnboardingScenarioType("CA1", 0, "CA1");
        CA1 = audioOnboardingScenarioType;
        AudioOnboardingScenarioType audioOnboardingScenarioType2 = new AudioOnboardingScenarioType("CA2", 1, "CA2");
        CA2 = audioOnboardingScenarioType2;
        AudioOnboardingScenarioType audioOnboardingScenarioType3 = new AudioOnboardingScenarioType("CA3", 2, "CA3");
        CA3 = audioOnboardingScenarioType3;
        AudioOnboardingScenarioType audioOnboardingScenarioType4 = new AudioOnboardingScenarioType("CA4", 3, "CA4");
        CA4 = audioOnboardingScenarioType4;
        AudioOnboardingScenarioType[] audioOnboardingScenarioTypeArr = {audioOnboardingScenarioType, audioOnboardingScenarioType2, audioOnboardingScenarioType3, audioOnboardingScenarioType4};
        $VALUES = audioOnboardingScenarioTypeArr;
        $ENTRIES = new asp(audioOnboardingScenarioTypeArr);
        Companion = new a();
    }

    public AudioOnboardingScenarioType(String str, int i, String str2) {
        this.type = str2;
    }

    public static AudioOnboardingScenarioType valueOf(String str) {
        return (AudioOnboardingScenarioType) Enum.valueOf(AudioOnboardingScenarioType.class, str);
    }

    public static AudioOnboardingScenarioType[] values() {
        return (AudioOnboardingScenarioType[]) $VALUES.clone();
    }

    public final String h() {
        return this.type;
    }
}
