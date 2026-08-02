package com.vk.stat.scheme;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$PostingFileType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsFeedStat$PostingFileType[] $VALUES;

    @pmi0("document")
    public static final MobileOfficialAppsFeedStat$PostingFileType DOCUMENT;

    @pmi0("photo")
    public static final MobileOfficialAppsFeedStat$PostingFileType PHOTO;

    @pmi0("video")
    public static final MobileOfficialAppsFeedStat$PostingFileType VIDEO;

    static {
        MobileOfficialAppsFeedStat$PostingFileType mobileOfficialAppsFeedStat$PostingFileType = new MobileOfficialAppsFeedStat$PostingFileType("PHOTO", 0);
        PHOTO = mobileOfficialAppsFeedStat$PostingFileType;
        MobileOfficialAppsFeedStat$PostingFileType mobileOfficialAppsFeedStat$PostingFileType2 = new MobileOfficialAppsFeedStat$PostingFileType(SignalingProtocol.MEDIA_OPTION_VIDEO, 1);
        VIDEO = mobileOfficialAppsFeedStat$PostingFileType2;
        MobileOfficialAppsFeedStat$PostingFileType mobileOfficialAppsFeedStat$PostingFileType3 = new MobileOfficialAppsFeedStat$PostingFileType("DOCUMENT", 2);
        DOCUMENT = mobileOfficialAppsFeedStat$PostingFileType3;
        MobileOfficialAppsFeedStat$PostingFileType[] mobileOfficialAppsFeedStat$PostingFileTypeArr = {mobileOfficialAppsFeedStat$PostingFileType, mobileOfficialAppsFeedStat$PostingFileType2, mobileOfficialAppsFeedStat$PostingFileType3};
        $VALUES = mobileOfficialAppsFeedStat$PostingFileTypeArr;
        $ENTRIES = new asp(mobileOfficialAppsFeedStat$PostingFileTypeArr);
    }

    private MobileOfficialAppsFeedStat$PostingFileType(String str, int i) {
    }

    public static MobileOfficialAppsFeedStat$PostingFileType valueOf(String str) {
        return (MobileOfficialAppsFeedStat$PostingFileType) Enum.valueOf(MobileOfficialAppsFeedStat$PostingFileType.class, str);
    }

    public static MobileOfficialAppsFeedStat$PostingFileType[] values() {
        return (MobileOfficialAppsFeedStat$PostingFileType[]) $VALUES.clone();
    }
}
