package com.vk.voip.dto.profiles;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VoipSex.kt */
/* loaded from: classes7.dex */
public final class VoipSex {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VoipSex[] $VALUES;
    public static final VoipSex FEMALE;
    public static final VoipSex MALE;
    public static final VoipSex UNKNOWN;

    static {
        VoipSex voipSex = new VoipSex("MALE", 0);
        MALE = voipSex;
        VoipSex voipSex2 = new VoipSex("FEMALE", 1);
        FEMALE = voipSex2;
        VoipSex voipSex3 = new VoipSex(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        UNKNOWN = voipSex3;
        VoipSex[] voipSexArr = {voipSex, voipSex2, voipSex3};
        $VALUES = voipSexArr;
        $ENTRIES = new asp(voipSexArr);
    }

    public VoipSex() {
        throw null;
    }

    public static VoipSex valueOf(String str) {
        return (VoipSex) Enum.valueOf(VoipSex.class, str);
    }

    public static VoipSex[] values() {
        return (VoipSex[]) $VALUES.clone();
    }
}
