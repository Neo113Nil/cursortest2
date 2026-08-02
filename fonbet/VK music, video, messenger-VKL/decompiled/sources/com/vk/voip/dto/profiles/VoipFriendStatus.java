package com.vk.voip.dto.profiles;

import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VoipFriendStatus.kt */
/* loaded from: classes7.dex */
public final class VoipFriendStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VoipFriendStatus[] $VALUES;
    public static final VoipFriendStatus FOLLOWING;
    public static final VoipFriendStatus FRIENDS;
    public static final VoipFriendStatus INCOME_FRIENDSHIP_REQUEST;
    public static final VoipFriendStatus NOT_FRIENDS;
    private final int value;

    static {
        VoipFriendStatus voipFriendStatus = new VoipFriendStatus("NOT_FRIENDS", 0, 0);
        NOT_FRIENDS = voipFriendStatus;
        VoipFriendStatus voipFriendStatus2 = new VoipFriendStatus("FOLLOWING", 1, 1);
        FOLLOWING = voipFriendStatus2;
        VoipFriendStatus voipFriendStatus3 = new VoipFriendStatus("INCOME_FRIENDSHIP_REQUEST", 2, 2);
        INCOME_FRIENDSHIP_REQUEST = voipFriendStatus3;
        VoipFriendStatus voipFriendStatus4 = new VoipFriendStatus(Privacy.FRIENDS, 3, 2);
        FRIENDS = voipFriendStatus4;
        VoipFriendStatus[] voipFriendStatusArr = {voipFriendStatus, voipFriendStatus2, voipFriendStatus3, voipFriendStatus4};
        $VALUES = voipFriendStatusArr;
        $ENTRIES = new asp(voipFriendStatusArr);
    }

    public VoipFriendStatus(String str, int i, int i2) {
        this.value = i2;
    }

    public static VoipFriendStatus valueOf(String str) {
        return (VoipFriendStatus) Enum.valueOf(VoipFriendStatus.class, str);
    }

    public static VoipFriendStatus[] values() {
        return (VoipFriendStatus[]) $VALUES.clone();
    }

    public final int h() {
        return this.value;
    }
}
