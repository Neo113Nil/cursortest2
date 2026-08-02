package com.vk.im.engine.models.users;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.rl3;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserDeactivationStatus.kt */
/* loaded from: classes2.dex */
public final class UserDeactivationStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UserDeactivationStatus[] $VALUES;
    public static final UserDeactivationStatus BANNED;
    public static final a Companion;
    public static final UserDeactivationStatus DELETED;
    public static final UserDeactivationStatus UNKNOWN;
    private final int code;

    /* compiled from: UserDeactivationStatus.kt */
    public static final class a {
        public static UserDeactivationStatus a(Integer num) {
            UserDeactivationStatus userDeactivationStatus = (UserDeactivationStatus) rl3.S(num.intValue(), UserDeactivationStatus.values());
            return userDeactivationStatus == null ? UserDeactivationStatus.UNKNOWN : userDeactivationStatus;
        }
    }

    static {
        UserDeactivationStatus userDeactivationStatus = new UserDeactivationStatus(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
        UNKNOWN = userDeactivationStatus;
        UserDeactivationStatus userDeactivationStatus2 = new UserDeactivationStatus("DELETED", 1, 1);
        DELETED = userDeactivationStatus2;
        UserDeactivationStatus userDeactivationStatus3 = new UserDeactivationStatus("BANNED", 2, 2);
        BANNED = userDeactivationStatus3;
        UserDeactivationStatus[] userDeactivationStatusArr = {userDeactivationStatus, userDeactivationStatus2, userDeactivationStatus3};
        $VALUES = userDeactivationStatusArr;
        $ENTRIES = new asp(userDeactivationStatusArr);
        Companion = new a();
    }

    public UserDeactivationStatus(String str, int i, int i2) {
        this.code = i2;
    }

    public static UserDeactivationStatus valueOf(String str) {
        return (UserDeactivationStatus) Enum.valueOf(UserDeactivationStatus.class, str);
    }

    public static UserDeactivationStatus[] values() {
        return (UserDeactivationStatus[]) $VALUES.clone();
    }

    public final int h() {
        return this.code;
    }
}
