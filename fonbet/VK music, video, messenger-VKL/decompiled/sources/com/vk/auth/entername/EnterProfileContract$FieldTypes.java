package com.vk.auth.entername;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EnterProfileContract.kt */
/* loaded from: classes15.dex */
public final class EnterProfileContract$FieldTypes {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EnterProfileContract$FieldTypes[] $VALUES;
    public static final EnterProfileContract$FieldTypes BIRTHDAY;
    public static final EnterProfileContract$FieldTypes FIRST_NAME;
    public static final EnterProfileContract$FieldTypes GENDER;
    public static final EnterProfileContract$FieldTypes LAST_NAME;

    static {
        EnterProfileContract$FieldTypes enterProfileContract$FieldTypes = new EnterProfileContract$FieldTypes("FIRST_NAME", 0);
        FIRST_NAME = enterProfileContract$FieldTypes;
        EnterProfileContract$FieldTypes enterProfileContract$FieldTypes2 = new EnterProfileContract$FieldTypes("LAST_NAME", 1);
        LAST_NAME = enterProfileContract$FieldTypes2;
        EnterProfileContract$FieldTypes enterProfileContract$FieldTypes3 = new EnterProfileContract$FieldTypes(CommonConstant.RETKEY.GENDER, 2);
        GENDER = enterProfileContract$FieldTypes3;
        EnterProfileContract$FieldTypes enterProfileContract$FieldTypes4 = new EnterProfileContract$FieldTypes("BIRTHDAY", 3);
        BIRTHDAY = enterProfileContract$FieldTypes4;
        EnterProfileContract$FieldTypes[] enterProfileContract$FieldTypesArr = {enterProfileContract$FieldTypes, enterProfileContract$FieldTypes2, enterProfileContract$FieldTypes3, enterProfileContract$FieldTypes4};
        $VALUES = enterProfileContract$FieldTypesArr;
        $ENTRIES = new asp(enterProfileContract$FieldTypesArr);
    }

    public EnterProfileContract$FieldTypes() {
        throw null;
    }

    public static EnterProfileContract$FieldTypes valueOf(String str) {
        return (EnterProfileContract$FieldTypes) Enum.valueOf(EnterProfileContract$FieldTypes.class, str);
    }

    public static EnterProfileContract$FieldTypes[] values() {
        return (EnterProfileContract$FieldTypes[]) $VALUES.clone();
    }
}
