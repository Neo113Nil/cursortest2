package com.vk.auth.emailactualization;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EmailActualizationMetadataResult.kt */
/* loaded from: classes15.dex */
public final class EmailActualizationMetadataResult {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EmailActualizationMetadataResult[] $VALUES;
    public static final EmailActualizationMetadataResult ERROR;
    public static final EmailActualizationMetadataResult SUCCESS;

    static {
        EmailActualizationMetadataResult emailActualizationMetadataResult = new EmailActualizationMetadataResult("SUCCESS", 0);
        SUCCESS = emailActualizationMetadataResult;
        EmailActualizationMetadataResult emailActualizationMetadataResult2 = new EmailActualizationMetadataResult("ERROR", 1);
        ERROR = emailActualizationMetadataResult2;
        EmailActualizationMetadataResult[] emailActualizationMetadataResultArr = {emailActualizationMetadataResult, emailActualizationMetadataResult2};
        $VALUES = emailActualizationMetadataResultArr;
        $ENTRIES = new asp(emailActualizationMetadataResultArr);
    }

    public EmailActualizationMetadataResult() {
        throw null;
    }

    public static EmailActualizationMetadataResult valueOf(String str) {
        return (EmailActualizationMetadataResult) Enum.valueOf(EmailActualizationMetadataResult.class, str);
    }

    public static EmailActualizationMetadataResult[] values() {
        return (EmailActualizationMetadataResult[]) $VALUES.clone();
    }
}
