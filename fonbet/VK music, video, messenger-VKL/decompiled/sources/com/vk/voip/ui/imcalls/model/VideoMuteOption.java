package com.vk.voip.ui.imcalls.model;

import org.webrtc.PeerConnectionFactory;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CallSettings.kt */
/* loaded from: classes7.dex */
public final class VideoMuteOption {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoMuteOption[] $VALUES;
    public static final a Companion;
    public static final VideoMuteOption DisabledOnJoin;
    public static final VideoMuteOption DisabledPermanent;
    public static final VideoMuteOption Enabled;

    /* compiled from: CallSettings.kt */
    public static final class a {

        /* compiled from: CallSettings.kt */
        /* renamed from: com.vk.voip.ui.imcalls.model.VideoMuteOption$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2063a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VideoMuteOption.values().length];
                try {
                    iArr[VideoMuteOption.DisabledOnJoin.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VideoMuteOption.DisabledPermanent.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[VideoMuteOption.Enabled.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    static {
        VideoMuteOption videoMuteOption = new VideoMuteOption(PeerConnectionFactory.TRIAL_ENABLED, 0);
        Enabled = videoMuteOption;
        VideoMuteOption videoMuteOption2 = new VideoMuteOption("DisabledOnJoin", 1);
        DisabledOnJoin = videoMuteOption2;
        VideoMuteOption videoMuteOption3 = new VideoMuteOption("DisabledPermanent", 2);
        DisabledPermanent = videoMuteOption3;
        VideoMuteOption[] videoMuteOptionArr = {videoMuteOption, videoMuteOption2, videoMuteOption3};
        $VALUES = videoMuteOptionArr;
        $ENTRIES = new asp(videoMuteOptionArr);
        Companion = new a();
    }

    public VideoMuteOption() {
        throw null;
    }

    public static VideoMuteOption valueOf(String str) {
        return (VideoMuteOption) Enum.valueOf(VideoMuteOption.class, str);
    }

    public static VideoMuteOption[] values() {
        return (VideoMuteOption[]) $VALUES.clone();
    }
}
