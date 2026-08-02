package com.vk.dto.stickers.images;

import java.util.LinkedHashMap;
import java.util.Map;
import xsna.asp;
import xsna.on00;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageFormat.kt */
/* loaded from: classes18.dex */
public final class FormatType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FormatType[] $VALUES;
    public static final a Companion;
    public static final FormatType PNG;
    public static final FormatType WEBP;
    private static final Map<String, FormatType> map;
    private final String value;

    /* compiled from: ImageFormat.kt */
    public static final class a {
    }

    static {
        FormatType formatType = new FormatType("PNG", 0, "png");
        PNG = formatType;
        FormatType formatType2 = new FormatType("WEBP", 1, "webp");
        WEBP = formatType2;
        FormatType[] formatTypeArr = {formatType, formatType2};
        $VALUES = formatTypeArr;
        $ENTRIES = new asp(formatTypeArr);
        Companion = new a();
        FormatType[] values = values();
        int e = on00.e(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (FormatType formatType3 : values) {
            linkedHashMap.put(formatType3.value, formatType3);
        }
        map = linkedHashMap;
    }

    public FormatType(String str, int i, String str2) {
        this.value = str2;
    }

    public static FormatType valueOf(String str) {
        return (FormatType) Enum.valueOf(FormatType.class, str);
    }

    public static FormatType[] values() {
        return (FormatType[]) $VALUES.clone();
    }
}
