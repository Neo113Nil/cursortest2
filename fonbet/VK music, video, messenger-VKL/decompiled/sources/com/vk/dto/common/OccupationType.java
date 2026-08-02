package com.vk.dto.common;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OccupationType.kt */
/* loaded from: classes18.dex */
public final class OccupationType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OccupationType[] $VALUES;
    public static final a Companion;
    public static final OccupationType SCHOOL;
    public static final OccupationType UNIVERSITY;
    public static final OccupationType UNKNOWN;
    public static final OccupationType WORK;
    private static final OccupationType[] values;
    private final int id;

    /* compiled from: OccupationType.kt */
    public static final class a {
        public static OccupationType a(int i) {
            OccupationType occupationType;
            OccupationType[] occupationTypeArr = OccupationType.values;
            int length = occupationTypeArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    occupationType = null;
                    break;
                }
                occupationType = occupationTypeArr[i2];
                if (occupationType.i() == i) {
                    break;
                }
                i2++;
            }
            return occupationType == null ? OccupationType.UNKNOWN : occupationType;
        }
    }

    static {
        OccupationType occupationType = new OccupationType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
        UNKNOWN = occupationType;
        OccupationType occupationType2 = new OccupationType("WORK", 1, 1);
        WORK = occupationType2;
        OccupationType occupationType3 = new OccupationType("SCHOOL", 2, 2);
        SCHOOL = occupationType3;
        OccupationType occupationType4 = new OccupationType("UNIVERSITY", 3, 3);
        UNIVERSITY = occupationType4;
        OccupationType[] occupationTypeArr = {occupationType, occupationType2, occupationType3, occupationType4};
        $VALUES = occupationTypeArr;
        $ENTRIES = new asp(occupationTypeArr);
        Companion = new a();
        values = values();
    }

    public OccupationType(String str, int i, int i2) {
        this.id = i2;
    }

    public static OccupationType valueOf(String str) {
        return (OccupationType) Enum.valueOf(OccupationType.class, str);
    }

    public static OccupationType[] values() {
        return (OccupationType[]) $VALUES.clone();
    }

    public final int i() {
        return this.id;
    }
}
