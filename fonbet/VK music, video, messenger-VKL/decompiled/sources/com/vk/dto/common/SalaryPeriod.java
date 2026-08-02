package com.vk.dto.common;

import java.util.Locale;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClassifiedJob.kt */
/* loaded from: classes18.dex */
public final class SalaryPeriod {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SalaryPeriod[] $VALUES;
    public static final a Companion;
    public static final SalaryPeriod DAILY;
    public static final SalaryPeriod HOURLY;
    public static final SalaryPeriod MONTHLY;
    public static final SalaryPeriod NONE;
    private final String serverName;

    /* compiled from: ClassifiedJob.kt */
    public static final class a {
        public static SalaryPeriod a(String str) {
            if (str == null) {
                return SalaryPeriod.NONE;
            }
            String lowerCase = str.toLowerCase(Locale.getDefault());
            SalaryPeriod salaryPeriod = SalaryPeriod.MONTHLY;
            if (lowerCase.equals(salaryPeriod.h())) {
                return salaryPeriod;
            }
            SalaryPeriod salaryPeriod2 = SalaryPeriod.DAILY;
            if (lowerCase.equals(salaryPeriod2.h())) {
                return salaryPeriod2;
            }
            SalaryPeriod salaryPeriod3 = SalaryPeriod.HOURLY;
            return lowerCase.equals(salaryPeriod3.h()) ? salaryPeriod3 : SalaryPeriod.NONE;
        }
    }

    static {
        SalaryPeriod salaryPeriod = new SalaryPeriod("MONTHLY", 0, "monthly");
        MONTHLY = salaryPeriod;
        SalaryPeriod salaryPeriod2 = new SalaryPeriod("DAILY", 1, "daily");
        DAILY = salaryPeriod2;
        SalaryPeriod salaryPeriod3 = new SalaryPeriod("HOURLY", 2, "hourly");
        HOURLY = salaryPeriod3;
        SalaryPeriod salaryPeriod4 = new SalaryPeriod("NONE", 3, "none");
        NONE = salaryPeriod4;
        SalaryPeriod[] salaryPeriodArr = {salaryPeriod, salaryPeriod2, salaryPeriod3, salaryPeriod4};
        $VALUES = salaryPeriodArr;
        $ENTRIES = new asp(salaryPeriodArr);
        Companion = new a();
    }

    public SalaryPeriod(String str, int i, String str2) {
        this.serverName = str2;
    }

    public static SalaryPeriod valueOf(String str) {
        return (SalaryPeriod) Enum.valueOf(SalaryPeriod.class, str);
    }

    public static SalaryPeriod[] values() {
        return (SalaryPeriod[]) $VALUES.clone();
    }

    public final String h() {
        return this.serverName;
    }
}
