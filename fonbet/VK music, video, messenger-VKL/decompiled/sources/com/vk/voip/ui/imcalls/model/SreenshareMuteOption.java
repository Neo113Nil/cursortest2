package com.vk.voip.ui.imcalls.model;

import org.webrtc.PeerConnectionFactory;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CallSettings.kt */
/* loaded from: classes7.dex */
public final class SreenshareMuteOption {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SreenshareMuteOption[] $VALUES;
    public static final a Companion;
    public static final SreenshareMuteOption Disabled;
    public static final SreenshareMuteOption DisabledPermanent;
    public static final SreenshareMuteOption Enabled;

    /* compiled from: CallSettings.kt */
    public static final class a {

        /* compiled from: CallSettings.kt */
        /* renamed from: com.vk.voip.ui.imcalls.model.SreenshareMuteOption$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2062a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SreenshareMuteOption.values().length];
                try {
                    iArr[SreenshareMuteOption.Disabled.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SreenshareMuteOption.DisabledPermanent.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SreenshareMuteOption.Enabled.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    static {
        SreenshareMuteOption sreenshareMuteOption = new SreenshareMuteOption(PeerConnectionFactory.TRIAL_ENABLED, 0);
        Enabled = sreenshareMuteOption;
        SreenshareMuteOption sreenshareMuteOption2 = new SreenshareMuteOption("Disabled", 1);
        Disabled = sreenshareMuteOption2;
        SreenshareMuteOption sreenshareMuteOption3 = new SreenshareMuteOption("DisabledPermanent", 2);
        DisabledPermanent = sreenshareMuteOption3;
        SreenshareMuteOption[] sreenshareMuteOptionArr = {sreenshareMuteOption, sreenshareMuteOption2, sreenshareMuteOption3};
        $VALUES = sreenshareMuteOptionArr;
        $ENTRIES = new asp(sreenshareMuteOptionArr);
        Companion = new a();
    }

    public SreenshareMuteOption() {
        throw null;
    }

    public static SreenshareMuteOption valueOf(String str) {
        return (SreenshareMuteOption) Enum.valueOf(SreenshareMuteOption.class, str);
    }

    public static SreenshareMuteOption[] values() {
        return (SreenshareMuteOption[]) $VALUES.clone();
    }
}
