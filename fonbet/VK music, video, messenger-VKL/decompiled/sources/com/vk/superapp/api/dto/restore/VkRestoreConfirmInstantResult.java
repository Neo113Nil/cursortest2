package com.vk.superapp.api.dto.restore;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkRestoreConfirmInstantResult.kt */
/* loaded from: classes6.dex */
public final class VkRestoreConfirmInstantResult {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkRestoreConfirmInstantResult[] $VALUES;
    public static final VkRestoreConfirmInstantResult ALREADY_CONFIRMED;
    public static final a Companion;
    public static final VkRestoreConfirmInstantResult SUCCESS;
    private final int code;

    /* compiled from: VkRestoreConfirmInstantResult.kt */
    public static final class a {
    }

    static {
        VkRestoreConfirmInstantResult vkRestoreConfirmInstantResult = new VkRestoreConfirmInstantResult("SUCCESS", 0, 1);
        SUCCESS = vkRestoreConfirmInstantResult;
        VkRestoreConfirmInstantResult vkRestoreConfirmInstantResult2 = new VkRestoreConfirmInstantResult("ALREADY_CONFIRMED", 1, 2);
        ALREADY_CONFIRMED = vkRestoreConfirmInstantResult2;
        VkRestoreConfirmInstantResult[] vkRestoreConfirmInstantResultArr = {vkRestoreConfirmInstantResult, vkRestoreConfirmInstantResult2};
        $VALUES = vkRestoreConfirmInstantResultArr;
        $ENTRIES = new asp(vkRestoreConfirmInstantResultArr);
        Companion = new a();
    }

    public VkRestoreConfirmInstantResult(String str, int i, int i2) {
        this.code = i2;
    }

    public static VkRestoreConfirmInstantResult valueOf(String str) {
        return (VkRestoreConfirmInstantResult) Enum.valueOf(VkRestoreConfirmInstantResult.class, str);
    }

    public static VkRestoreConfirmInstantResult[] values() {
        return (VkRestoreConfirmInstantResult[]) $VALUES.clone();
    }

    public final int h() {
        return this.code;
    }
}
