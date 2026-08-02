package com.vk.stat.scheme;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsSharingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsSharingStat$SharingItemType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsSharingStat$SharingItemType[] $VALUES;

    @pmi0("call_long")
    public static final MobileOfficialAppsSharingStat$SharingItemType CALL_LONG;

    @pmi0("call_short")
    public static final MobileOfficialAppsSharingStat$SharingItemType CALL_SHORT;

    @pmi0("clip")
    public static final MobileOfficialAppsSharingStat$SharingItemType CLIP;

    @pmi0("clip_playlist")
    public static final MobileOfficialAppsSharingStat$SharingItemType CLIP_PLAYLIST;

    @pmi0("episode")
    public static final MobileOfficialAppsSharingStat$SharingItemType EPISODE;

    @pmi0("unknown")
    public static final MobileOfficialAppsSharingStat$SharingItemType UNKNOWN;

    @pmi0("video")
    public static final MobileOfficialAppsSharingStat$SharingItemType VIDEO;

    @pmi0("video_playlist")
    public static final MobileOfficialAppsSharingStat$SharingItemType VIDEO_PLAYLIST;

    static {
        MobileOfficialAppsSharingStat$SharingItemType mobileOfficialAppsSharingStat$SharingItemType = new MobileOfficialAppsSharingStat$SharingItemType(SignalingProtocol.MEDIA_OPTION_VIDEO, 0);
        VIDEO = mobileOfficialAppsSharingStat$SharingItemType;
        MobileOfficialAppsSharingStat$SharingItemType mobileOfficialAppsSharingStat$SharingItemType2 = new MobileOfficialAppsSharingStat$SharingItemType("CLIP", 1);
        CLIP = mobileOfficialAppsSharingStat$SharingItemType2;
        MobileOfficialAppsSharingStat$SharingItemType mobileOfficialAppsSharingStat$SharingItemType3 = new MobileOfficialAppsSharingStat$SharingItemType("VIDEO_PLAYLIST", 2);
        VIDEO_PLAYLIST = mobileOfficialAppsSharingStat$SharingItemType3;
        MobileOfficialAppsSharingStat$SharingItemType mobileOfficialAppsSharingStat$SharingItemType4 = new MobileOfficialAppsSharingStat$SharingItemType("EPISODE", 3);
        EPISODE = mobileOfficialAppsSharingStat$SharingItemType4;
        MobileOfficialAppsSharingStat$SharingItemType mobileOfficialAppsSharingStat$SharingItemType5 = new MobileOfficialAppsSharingStat$SharingItemType("CLIP_PLAYLIST", 4);
        CLIP_PLAYLIST = mobileOfficialAppsSharingStat$SharingItemType5;
        MobileOfficialAppsSharingStat$SharingItemType mobileOfficialAppsSharingStat$SharingItemType6 = new MobileOfficialAppsSharingStat$SharingItemType("CALL_LONG", 5);
        CALL_LONG = mobileOfficialAppsSharingStat$SharingItemType6;
        MobileOfficialAppsSharingStat$SharingItemType mobileOfficialAppsSharingStat$SharingItemType7 = new MobileOfficialAppsSharingStat$SharingItemType("CALL_SHORT", 6);
        CALL_SHORT = mobileOfficialAppsSharingStat$SharingItemType7;
        MobileOfficialAppsSharingStat$SharingItemType mobileOfficialAppsSharingStat$SharingItemType8 = new MobileOfficialAppsSharingStat$SharingItemType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 7);
        UNKNOWN = mobileOfficialAppsSharingStat$SharingItemType8;
        MobileOfficialAppsSharingStat$SharingItemType[] mobileOfficialAppsSharingStat$SharingItemTypeArr = {mobileOfficialAppsSharingStat$SharingItemType, mobileOfficialAppsSharingStat$SharingItemType2, mobileOfficialAppsSharingStat$SharingItemType3, mobileOfficialAppsSharingStat$SharingItemType4, mobileOfficialAppsSharingStat$SharingItemType5, mobileOfficialAppsSharingStat$SharingItemType6, mobileOfficialAppsSharingStat$SharingItemType7, mobileOfficialAppsSharingStat$SharingItemType8};
        $VALUES = mobileOfficialAppsSharingStat$SharingItemTypeArr;
        $ENTRIES = new asp(mobileOfficialAppsSharingStat$SharingItemTypeArr);
    }

    private MobileOfficialAppsSharingStat$SharingItemType(String str, int i) {
    }

    public static MobileOfficialAppsSharingStat$SharingItemType valueOf(String str) {
        return (MobileOfficialAppsSharingStat$SharingItemType) Enum.valueOf(MobileOfficialAppsSharingStat$SharingItemType.class, str);
    }

    public static MobileOfficialAppsSharingStat$SharingItemType[] values() {
        return (MobileOfficialAppsSharingStat$SharingItemType[]) $VALUES.clone();
    }
}
