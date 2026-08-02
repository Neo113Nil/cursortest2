package com.vk.stat.scheme;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$VideoTypeItem {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsVideoStat$VideoTypeItem[] $VALUES;

    @pmi0("clip")
    public static final MobileOfficialAppsVideoStat$VideoTypeItem CLIP;

    @pmi0("video")
    public static final MobileOfficialAppsVideoStat$VideoTypeItem VIDEO;

    static {
        MobileOfficialAppsVideoStat$VideoTypeItem mobileOfficialAppsVideoStat$VideoTypeItem = new MobileOfficialAppsVideoStat$VideoTypeItem(SignalingProtocol.MEDIA_OPTION_VIDEO, 0);
        VIDEO = mobileOfficialAppsVideoStat$VideoTypeItem;
        MobileOfficialAppsVideoStat$VideoTypeItem mobileOfficialAppsVideoStat$VideoTypeItem2 = new MobileOfficialAppsVideoStat$VideoTypeItem("CLIP", 1);
        CLIP = mobileOfficialAppsVideoStat$VideoTypeItem2;
        MobileOfficialAppsVideoStat$VideoTypeItem[] mobileOfficialAppsVideoStat$VideoTypeItemArr = {mobileOfficialAppsVideoStat$VideoTypeItem, mobileOfficialAppsVideoStat$VideoTypeItem2};
        $VALUES = mobileOfficialAppsVideoStat$VideoTypeItemArr;
        $ENTRIES = new asp(mobileOfficialAppsVideoStat$VideoTypeItemArr);
    }

    private MobileOfficialAppsVideoStat$VideoTypeItem(String str, int i) {
    }

    public static MobileOfficialAppsVideoStat$VideoTypeItem valueOf(String str) {
        return (MobileOfficialAppsVideoStat$VideoTypeItem) Enum.valueOf(MobileOfficialAppsVideoStat$VideoTypeItem.class, str);
    }

    public static MobileOfficialAppsVideoStat$VideoTypeItem[] values() {
        return (MobileOfficialAppsVideoStat$VideoTypeItem[]) $VALUES.clone();
    }
}
