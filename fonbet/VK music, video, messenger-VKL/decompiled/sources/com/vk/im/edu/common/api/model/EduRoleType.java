package com.vk.im.edu.common.api.model;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EduRoleType.kt */
/* loaded from: classes2.dex */
public final class EduRoleType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EduRoleType[] $VALUES;
    public static final EduRoleType ADMIN;
    public static final a Companion;
    public static final EduRoleType EMPLOYEE;
    public static final EduRoleType PARENT;
    public static final EduRoleType STUDENT;
    public static final EduRoleType TEACHER;
    public static final EduRoleType UNKNOWN;
    private final String roleCode;

    /* compiled from: EduRoleType.kt */
    public static final class a {
    }

    static {
        EduRoleType eduRoleType = new EduRoleType("ADMIN", 0, "admin");
        ADMIN = eduRoleType;
        EduRoleType eduRoleType2 = new EduRoleType("EMPLOYEE", 1, "employee");
        EMPLOYEE = eduRoleType2;
        EduRoleType eduRoleType3 = new EduRoleType("TEACHER", 2, "teacher");
        TEACHER = eduRoleType3;
        EduRoleType eduRoleType4 = new EduRoleType("PARENT", 3, "parent");
        PARENT = eduRoleType4;
        EduRoleType eduRoleType5 = new EduRoleType("STUDENT", 4, "student");
        STUDENT = eduRoleType5;
        EduRoleType eduRoleType6 = new EduRoleType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5, "unknown");
        UNKNOWN = eduRoleType6;
        EduRoleType[] eduRoleTypeArr = {eduRoleType, eduRoleType2, eduRoleType3, eduRoleType4, eduRoleType5, eduRoleType6};
        $VALUES = eduRoleTypeArr;
        $ENTRIES = new asp(eduRoleTypeArr);
        Companion = new a();
    }

    public EduRoleType(String str, int i, String str2) {
        this.roleCode = str2;
    }

    public static EduRoleType valueOf(String str) {
        return (EduRoleType) Enum.valueOf(EduRoleType.class, str);
    }

    public static EduRoleType[] values() {
        return (EduRoleType[]) $VALUES.clone();
    }
}
