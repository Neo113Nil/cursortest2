package com.vk.im.engine.models.education;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.text.SimpleDateFormat;
import java.util.Locale;
import xsna.asp;
import xsna.zrp;

/* compiled from: EduScheduleOnDayModel.kt */
/* loaded from: classes2.dex */
public final class EduScheduleOnDayModel {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EduScheduleOnDayModel.kt */
    public static final class ScheduleDayType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ScheduleDayType[] $VALUES;
        public static final a Companion;
        public static final ScheduleDayType FRIDAY;
        public static final ScheduleDayType MONDAY;
        public static final ScheduleDayType SATURDAY;
        public static final ScheduleDayType SUNDAY;
        public static final ScheduleDayType THURSDAY;
        public static final ScheduleDayType TUESDAY;
        public static final ScheduleDayType UNKNOWN;
        public static final ScheduleDayType WEDNESDAY;
        private final int code;

        /* compiled from: EduScheduleOnDayModel.kt */
        public static final class a {
        }

        static {
            ScheduleDayType scheduleDayType = new ScheduleDayType("MONDAY", 0, 0);
            MONDAY = scheduleDayType;
            ScheduleDayType scheduleDayType2 = new ScheduleDayType("TUESDAY", 1, 1);
            TUESDAY = scheduleDayType2;
            ScheduleDayType scheduleDayType3 = new ScheduleDayType("WEDNESDAY", 2, 2);
            WEDNESDAY = scheduleDayType3;
            ScheduleDayType scheduleDayType4 = new ScheduleDayType("THURSDAY", 3, 3);
            THURSDAY = scheduleDayType4;
            ScheduleDayType scheduleDayType5 = new ScheduleDayType("FRIDAY", 4, 4);
            FRIDAY = scheduleDayType5;
            ScheduleDayType scheduleDayType6 = new ScheduleDayType("SATURDAY", 5, 5);
            SATURDAY = scheduleDayType6;
            ScheduleDayType scheduleDayType7 = new ScheduleDayType("SUNDAY", 6, 6);
            SUNDAY = scheduleDayType7;
            ScheduleDayType scheduleDayType8 = new ScheduleDayType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 7, -1);
            UNKNOWN = scheduleDayType8;
            ScheduleDayType[] scheduleDayTypeArr = {scheduleDayType, scheduleDayType2, scheduleDayType3, scheduleDayType4, scheduleDayType5, scheduleDayType6, scheduleDayType7, scheduleDayType8};
            $VALUES = scheduleDayTypeArr;
            $ENTRIES = new asp(scheduleDayTypeArr);
            Companion = new a();
        }

        public ScheduleDayType(String str, int i, int i2) {
            this.code = i2;
        }

        public static ScheduleDayType valueOf(String str) {
            return (ScheduleDayType) Enum.valueOf(ScheduleDayType.class, str);
        }

        public static ScheduleDayType[] values() {
            return (ScheduleDayType[]) $VALUES.clone();
        }
    }

    static {
        new SimpleDateFormat("H:mm", Locale.getDefault());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EduScheduleOnDayModel)) {
            return false;
        }
        ((EduScheduleOnDayModel) obj).getClass();
        return true;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "EduScheduleOnDayModel(day=null, isEnabled=false, modeSwitchTillMs=0, startTimeMs=0, endTimeMs=0, isSilenceModeEnabled=false, silenceModeTillMs=null, silenceTillDate=null)";
    }
}
