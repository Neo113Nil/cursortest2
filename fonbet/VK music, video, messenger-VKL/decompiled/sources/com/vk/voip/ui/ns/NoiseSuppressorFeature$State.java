package com.vk.voip.ui.ns;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NoiseSuppressorFeature.kt */
/* loaded from: classes7.dex */
public final class NoiseSuppressorFeature$State {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NoiseSuppressorFeature$State[] $VALUES;
    public static final NoiseSuppressorFeature$State AUTO;
    public static final NoiseSuppressorFeature$State NONE;
    public static final NoiseSuppressorFeature$State PLATFORM;
    private final int nameId;
    private final int shortNameId;

    static {
        NoiseSuppressorFeature$State noiseSuppressorFeature$State = new NoiseSuppressorFeature$State("NONE", 0, R.string.voip_ns_state_none, R.string.voip_ns_state_none_short);
        NONE = noiseSuppressorFeature$State;
        NoiseSuppressorFeature$State noiseSuppressorFeature$State2 = new NoiseSuppressorFeature$State("PLATFORM", 1, R.string.voip_ns_state_platform, R.string.voip_ns_state_platform_short);
        PLATFORM = noiseSuppressorFeature$State2;
        NoiseSuppressorFeature$State noiseSuppressorFeature$State3 = new NoiseSuppressorFeature$State("AUTO", 2, R.string.voip_ns_state_auto, R.string.voip_ns_state_auto_short);
        AUTO = noiseSuppressorFeature$State3;
        NoiseSuppressorFeature$State[] noiseSuppressorFeature$StateArr = {noiseSuppressorFeature$State, noiseSuppressorFeature$State2, noiseSuppressorFeature$State3};
        $VALUES = noiseSuppressorFeature$StateArr;
        $ENTRIES = new asp(noiseSuppressorFeature$StateArr);
    }

    public NoiseSuppressorFeature$State(String str, int i, int i2, int i3) {
        this.nameId = i2;
        this.shortNameId = i3;
    }

    public static NoiseSuppressorFeature$State valueOf(String str) {
        return (NoiseSuppressorFeature$State) Enum.valueOf(NoiseSuppressorFeature$State.class, str);
    }

    public static NoiseSuppressorFeature$State[] values() {
        return (NoiseSuppressorFeature$State[]) $VALUES.clone();
    }

    public final int h() {
        return this.nameId;
    }

    public final int i() {
        return this.shortNameId;
    }
}
