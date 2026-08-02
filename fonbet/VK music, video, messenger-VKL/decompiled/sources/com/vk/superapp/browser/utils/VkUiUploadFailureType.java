package com.vk.superapp.browser.utils;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkUiRxClipEvent.kt */
/* loaded from: classes6.dex */
public final class VkUiUploadFailureType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkUiUploadFailureType[] $VALUES;
    public static final VkUiUploadFailureType CANCELLED;
    public static final VkUiUploadFailureType DELETED;
    public static final VkUiUploadFailureType ERROR;

    static {
        VkUiUploadFailureType vkUiUploadFailureType = new VkUiUploadFailureType("CANCELLED", 0);
        CANCELLED = vkUiUploadFailureType;
        VkUiUploadFailureType vkUiUploadFailureType2 = new VkUiUploadFailureType("DELETED", 1);
        DELETED = vkUiUploadFailureType2;
        VkUiUploadFailureType vkUiUploadFailureType3 = new VkUiUploadFailureType("ERROR", 2);
        ERROR = vkUiUploadFailureType3;
        VkUiUploadFailureType[] vkUiUploadFailureTypeArr = {vkUiUploadFailureType, vkUiUploadFailureType2, vkUiUploadFailureType3};
        $VALUES = vkUiUploadFailureTypeArr;
        $ENTRIES = new asp(vkUiUploadFailureTypeArr);
    }

    public VkUiUploadFailureType() {
        throw null;
    }

    public static VkUiUploadFailureType valueOf(String str) {
        return (VkUiUploadFailureType) Enum.valueOf(VkUiUploadFailureType.class, str);
    }

    public static VkUiUploadFailureType[] values() {
        return (VkUiUploadFailureType[]) $VALUES.clone();
    }
}
