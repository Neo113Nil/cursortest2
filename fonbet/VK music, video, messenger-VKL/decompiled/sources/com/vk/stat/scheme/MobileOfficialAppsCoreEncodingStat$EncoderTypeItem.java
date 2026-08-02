package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsCoreEncodingStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsCoreEncodingStat$EncoderTypeItem {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsCoreEncodingStat$EncoderTypeItem[] $VALUES;

    @pmi0("hw")
    public static final MobileOfficialAppsCoreEncodingStat$EncoderTypeItem HW;

    @pmi0("sw")
    public static final MobileOfficialAppsCoreEncodingStat$EncoderTypeItem SW;

    static {
        MobileOfficialAppsCoreEncodingStat$EncoderTypeItem mobileOfficialAppsCoreEncodingStat$EncoderTypeItem = new MobileOfficialAppsCoreEncodingStat$EncoderTypeItem("HW", 0);
        HW = mobileOfficialAppsCoreEncodingStat$EncoderTypeItem;
        MobileOfficialAppsCoreEncodingStat$EncoderTypeItem mobileOfficialAppsCoreEncodingStat$EncoderTypeItem2 = new MobileOfficialAppsCoreEncodingStat$EncoderTypeItem("SW", 1);
        SW = mobileOfficialAppsCoreEncodingStat$EncoderTypeItem2;
        MobileOfficialAppsCoreEncodingStat$EncoderTypeItem[] mobileOfficialAppsCoreEncodingStat$EncoderTypeItemArr = {mobileOfficialAppsCoreEncodingStat$EncoderTypeItem, mobileOfficialAppsCoreEncodingStat$EncoderTypeItem2};
        $VALUES = mobileOfficialAppsCoreEncodingStat$EncoderTypeItemArr;
        $ENTRIES = new asp(mobileOfficialAppsCoreEncodingStat$EncoderTypeItemArr);
    }

    private MobileOfficialAppsCoreEncodingStat$EncoderTypeItem(String str, int i) {
    }

    public static MobileOfficialAppsCoreEncodingStat$EncoderTypeItem valueOf(String str) {
        return (MobileOfficialAppsCoreEncodingStat$EncoderTypeItem) Enum.valueOf(MobileOfficialAppsCoreEncodingStat$EncoderTypeItem.class, str);
    }

    public static MobileOfficialAppsCoreEncodingStat$EncoderTypeItem[] values() {
        return (MobileOfficialAppsCoreEncodingStat$EncoderTypeItem[]) $VALUES.clone();
    }
}
