package com.vk.dto.clips.morphing;

import com.vk.media.pipeline.model.effect.AudioEffect;
import java.util.Iterator;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioMorphingEffects.kt */
/* loaded from: classes18.dex */
public final class AudioEffectType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioEffectType[] $VALUES;
    public static final AudioEffectType BALLOON;
    public static final AudioEffectType CATHEDRAL;
    public static final a Companion;
    public static final AudioEffectType DEFAULT;
    public static final AudioEffectType ECHO;
    public static final AudioEffectType EVIL;
    public static final AudioEffectType GIANT;
    public static final AudioEffectType HALL;
    public static final AudioEffectType ROBOT;
    public static final AudioEffectType SQUIRREL;

    /* compiled from: AudioMorphingEffects.kt */
    public static final class a {
        public static AudioEffectType a(String str) {
            Object obj;
            Iterator<E> it = AudioEffectType.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String name = ((AudioEffectType) next).name();
                Locale locale = Locale.ROOT;
                if (name.toLowerCase(locale).equals(str != null ? str.toLowerCase(locale) : null)) {
                    obj = next;
                    break;
                }
            }
            AudioEffectType audioEffectType = (AudioEffectType) obj;
            return audioEffectType == null ? AudioEffectType.DEFAULT : audioEffectType;
        }
    }

    /* compiled from: AudioMorphingEffects.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioEffectType.values().length];
            try {
                iArr[AudioEffectType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioEffectType.HALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioEffectType.ECHO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AudioEffectType.CATHEDRAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AudioEffectType.ROBOT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AudioEffectType.GIANT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AudioEffectType.SQUIRREL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AudioEffectType.BALLOON.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AudioEffectType.EVIL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        AudioEffectType audioEffectType = new AudioEffectType("DEFAULT", 0);
        DEFAULT = audioEffectType;
        AudioEffectType audioEffectType2 = new AudioEffectType("HALL", 1);
        HALL = audioEffectType2;
        AudioEffectType audioEffectType3 = new AudioEffectType("ECHO", 2);
        ECHO = audioEffectType3;
        AudioEffectType audioEffectType4 = new AudioEffectType("CATHEDRAL", 3);
        CATHEDRAL = audioEffectType4;
        AudioEffectType audioEffectType5 = new AudioEffectType("ROBOT", 4);
        ROBOT = audioEffectType5;
        AudioEffectType audioEffectType6 = new AudioEffectType("GIANT", 5);
        GIANT = audioEffectType6;
        AudioEffectType audioEffectType7 = new AudioEffectType("SQUIRREL", 6);
        SQUIRREL = audioEffectType7;
        AudioEffectType audioEffectType8 = new AudioEffectType("BALLOON", 7);
        BALLOON = audioEffectType8;
        AudioEffectType audioEffectType9 = new AudioEffectType("EVIL", 8);
        EVIL = audioEffectType9;
        AudioEffectType[] audioEffectTypeArr = {audioEffectType, audioEffectType2, audioEffectType3, audioEffectType4, audioEffectType5, audioEffectType6, audioEffectType7, audioEffectType8, audioEffectType9};
        $VALUES = audioEffectTypeArr;
        $ENTRIES = new asp(audioEffectTypeArr);
        Companion = new a();
    }

    public AudioEffectType() {
        throw null;
    }

    public static zrp<AudioEffectType> h() {
        return $ENTRIES;
    }

    public static AudioEffectType valueOf(String str) {
        return (AudioEffectType) Enum.valueOf(AudioEffectType.class, str);
    }

    public static AudioEffectType[] values() {
        return (AudioEffectType[]) $VALUES.clone();
    }

    public final AudioEffect i() {
        switch (b.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return AudioEffect.DEFAULT;
            case 2:
                return AudioEffect.HALL;
            case 3:
                return AudioEffect.ECHO;
            case 4:
                return AudioEffect.CATHEDRAL;
            case 5:
                return AudioEffect.ROBOT;
            case 6:
                return AudioEffect.GIANT;
            case 7:
                return AudioEffect.SQUIRREL;
            case 8:
                return AudioEffect.BALLOON;
            case 9:
                return AudioEffect.EVIL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
