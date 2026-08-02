package com.vk.stat.scheme;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsStoriesStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsStoriesStat$PermissionAccessStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsStoriesStat$PermissionAccessStatus[] $VALUES;

    @pmi0("authorized")
    public static final MobileOfficialAppsStoriesStat$PermissionAccessStatus AUTHORIZED;

    @pmi0("denied")
    public static final MobileOfficialAppsStoriesStat$PermissionAccessStatus DENIED;

    @pmi0("limited")
    public static final MobileOfficialAppsStoriesStat$PermissionAccessStatus LIMITED;

    @pmi0("not_determined")
    public static final MobileOfficialAppsStoriesStat$PermissionAccessStatus NOT_DETERMINED;

    @pmi0(SignalingProtocol.KEY_RESTRICTED)
    public static final MobileOfficialAppsStoriesStat$PermissionAccessStatus RESTRICTED;

    static {
        MobileOfficialAppsStoriesStat$PermissionAccessStatus mobileOfficialAppsStoriesStat$PermissionAccessStatus = new MobileOfficialAppsStoriesStat$PermissionAccessStatus("NOT_DETERMINED", 0);
        NOT_DETERMINED = mobileOfficialAppsStoriesStat$PermissionAccessStatus;
        MobileOfficialAppsStoriesStat$PermissionAccessStatus mobileOfficialAppsStoriesStat$PermissionAccessStatus2 = new MobileOfficialAppsStoriesStat$PermissionAccessStatus("RESTRICTED", 1);
        RESTRICTED = mobileOfficialAppsStoriesStat$PermissionAccessStatus2;
        MobileOfficialAppsStoriesStat$PermissionAccessStatus mobileOfficialAppsStoriesStat$PermissionAccessStatus3 = new MobileOfficialAppsStoriesStat$PermissionAccessStatus("DENIED", 2);
        DENIED = mobileOfficialAppsStoriesStat$PermissionAccessStatus3;
        MobileOfficialAppsStoriesStat$PermissionAccessStatus mobileOfficialAppsStoriesStat$PermissionAccessStatus4 = new MobileOfficialAppsStoriesStat$PermissionAccessStatus("AUTHORIZED", 3);
        AUTHORIZED = mobileOfficialAppsStoriesStat$PermissionAccessStatus4;
        MobileOfficialAppsStoriesStat$PermissionAccessStatus mobileOfficialAppsStoriesStat$PermissionAccessStatus5 = new MobileOfficialAppsStoriesStat$PermissionAccessStatus("LIMITED", 4);
        LIMITED = mobileOfficialAppsStoriesStat$PermissionAccessStatus5;
        MobileOfficialAppsStoriesStat$PermissionAccessStatus[] mobileOfficialAppsStoriesStat$PermissionAccessStatusArr = {mobileOfficialAppsStoriesStat$PermissionAccessStatus, mobileOfficialAppsStoriesStat$PermissionAccessStatus2, mobileOfficialAppsStoriesStat$PermissionAccessStatus3, mobileOfficialAppsStoriesStat$PermissionAccessStatus4, mobileOfficialAppsStoriesStat$PermissionAccessStatus5};
        $VALUES = mobileOfficialAppsStoriesStat$PermissionAccessStatusArr;
        $ENTRIES = new asp(mobileOfficialAppsStoriesStat$PermissionAccessStatusArr);
    }

    private MobileOfficialAppsStoriesStat$PermissionAccessStatus(String str, int i) {
    }

    public static MobileOfficialAppsStoriesStat$PermissionAccessStatus valueOf(String str) {
        return (MobileOfficialAppsStoriesStat$PermissionAccessStatus) Enum.valueOf(MobileOfficialAppsStoriesStat$PermissionAccessStatus.class, str);
    }

    public static MobileOfficialAppsStoriesStat$PermissionAccessStatus[] values() {
        return (MobileOfficialAppsStoriesStat$PermissionAccessStatus[]) $VALUES.clone();
    }
}
