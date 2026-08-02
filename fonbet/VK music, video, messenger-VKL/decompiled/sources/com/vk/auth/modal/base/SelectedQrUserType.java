package com.vk.auth.modal.base;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectedQrUserType.kt */
/* loaded from: classes15.dex */
public final class SelectedQrUserType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SelectedQrUserType[] $VALUES;
    public static final SelectedQrUserType BANNED;
    public static final SelectedQrUserType DELETED;
    public static final SelectedQrUserType NORMAL;
    public static final SelectedQrUserType UNAVAILABLE;

    static {
        SelectedQrUserType selectedQrUserType = new SelectedQrUserType("NORMAL", 0);
        NORMAL = selectedQrUserType;
        SelectedQrUserType selectedQrUserType2 = new SelectedQrUserType("DELETED", 1);
        DELETED = selectedQrUserType2;
        SelectedQrUserType selectedQrUserType3 = new SelectedQrUserType("BANNED", 2);
        BANNED = selectedQrUserType3;
        SelectedQrUserType selectedQrUserType4 = new SelectedQrUserType("UNAVAILABLE", 3);
        UNAVAILABLE = selectedQrUserType4;
        SelectedQrUserType[] selectedQrUserTypeArr = {selectedQrUserType, selectedQrUserType2, selectedQrUserType3, selectedQrUserType4};
        $VALUES = selectedQrUserTypeArr;
        $ENTRIES = new asp(selectedQrUserTypeArr);
    }

    public SelectedQrUserType() {
        throw null;
    }

    public static SelectedQrUserType valueOf(String str) {
        return (SelectedQrUserType) Enum.valueOf(SelectedQrUserType.class, str);
    }

    public static SelectedQrUserType[] values() {
        return (SelectedQrUserType[]) $VALUES.clone();
    }
}
