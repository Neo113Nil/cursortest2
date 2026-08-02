package com.vk.voip.ui.imcalls.model;

import org.webrtc.PeerConnectionFactory;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CallSettings.kt */
/* loaded from: classes7.dex */
public final class AudioMuteOption {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioMuteOption[] $VALUES;
    public static final a Companion;
    public static final AudioMuteOption Enabled;
    public static final AudioMuteOption MutedOnJoin;
    public static final AudioMuteOption MutedPermanent;

    /* compiled from: CallSettings.kt */
    public static final class a {

        /* compiled from: CallSettings.kt */
        /* renamed from: com.vk.voip.ui.imcalls.model.AudioMuteOption$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2061a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AudioMuteOption.values().length];
                try {
                    iArr[AudioMuteOption.MutedOnJoin.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AudioMuteOption.MutedPermanent.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AudioMuteOption.Enabled.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    static {
        AudioMuteOption audioMuteOption = new AudioMuteOption(PeerConnectionFactory.TRIAL_ENABLED, 0);
        Enabled = audioMuteOption;
        AudioMuteOption audioMuteOption2 = new AudioMuteOption("MutedOnJoin", 1);
        MutedOnJoin = audioMuteOption2;
        AudioMuteOption audioMuteOption3 = new AudioMuteOption("MutedPermanent", 2);
        MutedPermanent = audioMuteOption3;
        AudioMuteOption[] audioMuteOptionArr = {audioMuteOption, audioMuteOption2, audioMuteOption3};
        $VALUES = audioMuteOptionArr;
        $ENTRIES = new asp(audioMuteOptionArr);
        Companion = new a();
    }

    public AudioMuteOption() {
        throw null;
    }

    public static AudioMuteOption valueOf(String str) {
        return (AudioMuteOption) Enum.valueOf(AudioMuteOption.class, str);
    }

    public static AudioMuteOption[] values() {
        return (AudioMuteOption[]) $VALUES.clone();
    }
}
