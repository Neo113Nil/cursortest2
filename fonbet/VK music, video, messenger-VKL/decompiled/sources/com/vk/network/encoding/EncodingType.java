package com.vk.network.encoding;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EncodingMetricsDelegate.kt */
/* loaded from: classes3.dex */
public final class EncodingType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EncodingType[] $VALUES;
    public static final EncodingType GZIP;
    public static final EncodingType ZSTD;

    static {
        EncodingType encodingType = new EncodingType("GZIP", 0);
        GZIP = encodingType;
        EncodingType encodingType2 = new EncodingType("ZSTD", 1);
        ZSTD = encodingType2;
        EncodingType[] encodingTypeArr = {encodingType, encodingType2};
        $VALUES = encodingTypeArr;
        $ENTRIES = new asp(encodingTypeArr);
    }

    public EncodingType() {
        throw null;
    }

    public static EncodingType valueOf(String str) {
        return (EncodingType) Enum.valueOf(EncodingType.class, str);
    }

    public static EncodingType[] values() {
        return (EncodingType[]) $VALUES.clone();
    }
}
