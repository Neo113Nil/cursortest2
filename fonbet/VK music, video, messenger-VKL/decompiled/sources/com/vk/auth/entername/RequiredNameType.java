package com.vk.auth.entername;

import com.vk.superapp.core.api.models.SignUpField;
import java.util.List;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RequiredNameType.kt */
/* loaded from: classes15.dex */
public final class RequiredNameType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RequiredNameType[] $VALUES;
    public static final a Companion;
    public static final RequiredNameType FIRST_AND_LAST_NAME;
    public static final RequiredNameType FULL_NAME;
    public static final RequiredNameType WITHOUT_NAME;

    /* compiled from: RequiredNameType.kt */
    public static final class a {
        public static RequiredNameType a(List list) {
            return list.contains(SignUpField.FIRST_LAST_NAME) ? RequiredNameType.FIRST_AND_LAST_NAME : list.contains(SignUpField.NAME) ? RequiredNameType.FULL_NAME : RequiredNameType.WITHOUT_NAME;
        }
    }

    static {
        RequiredNameType requiredNameType = new RequiredNameType("WITHOUT_NAME", 0);
        WITHOUT_NAME = requiredNameType;
        RequiredNameType requiredNameType2 = new RequiredNameType("FULL_NAME", 1);
        FULL_NAME = requiredNameType2;
        RequiredNameType requiredNameType3 = new RequiredNameType("FIRST_AND_LAST_NAME", 2);
        FIRST_AND_LAST_NAME = requiredNameType3;
        RequiredNameType[] requiredNameTypeArr = {requiredNameType, requiredNameType2, requiredNameType3};
        $VALUES = requiredNameTypeArr;
        $ENTRIES = new asp(requiredNameTypeArr);
        Companion = new a();
    }

    public RequiredNameType() {
        throw null;
    }

    public static RequiredNameType valueOf(String str) {
        return (RequiredNameType) Enum.valueOf(RequiredNameType.class, str);
    }

    public static RequiredNameType[] values() {
        return (RequiredNameType[]) $VALUES.clone();
    }
}
