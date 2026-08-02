package com.vk.im.engine.models;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import xsna.asp;
import xsna.bpn0;
import xsna.g13;
import xsna.lhg;
import xsna.on00;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SourceType.kt */
/* loaded from: classes2.dex */
public final class SourceType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SourceType[] $VALUES;
    public static final a Companion;
    public static final SourceType GROUP;
    public static final SourceType UNKNOWN;
    public static final SourceType USER;
    private static final Lazy<Map<Integer, SourceType>> values$delegate;
    private final int typeAsInt;

    /* compiled from: SourceType.kt */
    public static final class a {
        public static SourceType a(int i) {
            Object obj = ((Map) SourceType.values$delegate.getValue()).get(Integer.valueOf(i));
            if (obj != null) {
                return (SourceType) obj;
            }
            throw new IllegalArgumentException(lhg.a(i, "Unknown typeAsInt value: ").toString());
        }
    }

    static {
        SourceType sourceType = new SourceType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
        UNKNOWN = sourceType;
        SourceType sourceType2 = new SourceType("USER", 1, 1);
        USER = sourceType2;
        SourceType sourceType3 = new SourceType("GROUP", 2, 2);
        GROUP = sourceType3;
        SourceType[] sourceTypeArr = {sourceType, sourceType2, sourceType3};
        $VALUES = sourceTypeArr;
        $ENTRIES = new asp(sourceTypeArr);
        Companion = new a();
        values$delegate = new bpn0(new g13(22));
    }

    public SourceType(String str, int i, int i2) {
        this.typeAsInt = i2;
    }

    public static LinkedHashMap h() {
        SourceType[] values = values();
        int e = on00.e(values.length);
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (SourceType sourceType : values) {
            linkedHashMap.put(Integer.valueOf(sourceType.typeAsInt), sourceType);
        }
        return linkedHashMap;
    }

    public static SourceType valueOf(String str) {
        return (SourceType) Enum.valueOf(SourceType.class, str);
    }

    public static SourceType[] values() {
        return (SourceType[]) $VALUES.clone();
    }

    public final int j() {
        return this.typeAsInt;
    }
}
