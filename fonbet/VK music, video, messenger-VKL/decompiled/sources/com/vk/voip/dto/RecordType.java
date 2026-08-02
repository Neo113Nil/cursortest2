package com.vk.voip.dto;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RecordType.kt */
/* loaded from: classes7.dex */
public final class RecordType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RecordType[] $VALUES;
    public static final RecordType NOTHING;
    public static final RecordType RECORD;
    public static final RecordType STREAM;

    static {
        RecordType recordType = new RecordType("NOTHING", 0);
        NOTHING = recordType;
        RecordType recordType2 = new RecordType("STREAM", 1);
        STREAM = recordType2;
        RecordType recordType3 = new RecordType("RECORD", 2);
        RECORD = recordType3;
        RecordType[] recordTypeArr = {recordType, recordType2, recordType3};
        $VALUES = recordTypeArr;
        $ENTRIES = new asp(recordTypeArr);
    }

    public RecordType() {
        throw null;
    }

    public static RecordType valueOf(String str) {
        return (RecordType) Enum.valueOf(RecordType.class, str);
    }

    public static RecordType[] values() {
        return (RecordType[]) $VALUES.clone();
    }
}
