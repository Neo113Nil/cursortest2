package com.vk.push.core.data.repository;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CrashReporterRepository.kt */
/* loaded from: classes.dex */
public final class IssueKey {
    private static final /* synthetic */ IssueKey[] $VALUES;
    public static final IssueKey DEVICE_ID_ERROR;
    public static final IssueKey EXPIRED_TIME_FIELD_NULL;
    public static final IssueKey FAILED_TO_DELIVER_PUSH;
    public static final IssueKey FILE_DATA_STORE_MIGRATION_ERROR;
    public static final IssueKey FILE_DATA_STORE_PARSE_ERROR;
    public static final IssueKey FILE_DATA_STORE_READ_ERROR;
    public static final IssueKey FILE_DATA_STORE_WRITE_ERROR;
    public static final IssueKey FILE_MIGRATION_ERROR;
    public static final IssueKey MESSAGE_RECEIVED;
    public static final IssueKey OMICRON_EARLY_FEATURE_ACCESS;
    public static final IssueKey OMICRON_PARSE_ERROR;
    public static final IssueKey PLAIN_TOKEN;
    public static final IssueKey SSL_PINNING_FAILED;
    public static final IssueKey TOKEN_INVALIDATED;
    public static final IssueKey WORK_MANAGER_GET_INSTANCE_ERROR;

    static {
        IssueKey issueKey = new IssueKey("PLAIN_TOKEN", 0);
        PLAIN_TOKEN = issueKey;
        IssueKey issueKey2 = new IssueKey("TOKEN_INVALIDATED", 1);
        TOKEN_INVALIDATED = issueKey2;
        IssueKey issueKey3 = new IssueKey("MESSAGE_RECEIVED", 2);
        MESSAGE_RECEIVED = issueKey3;
        IssueKey issueKey4 = new IssueKey("DEVICE_ID_ERROR", 3);
        DEVICE_ID_ERROR = issueKey4;
        IssueKey issueKey5 = new IssueKey("OMICRON_EARLY_FEATURE_ACCESS", 4);
        OMICRON_EARLY_FEATURE_ACCESS = issueKey5;
        IssueKey issueKey6 = new IssueKey("OMICRON_PARSE_ERROR", 5);
        OMICRON_PARSE_ERROR = issueKey6;
        IssueKey issueKey7 = new IssueKey("EXPIRED_TIME_FIELD_NULL", 6);
        EXPIRED_TIME_FIELD_NULL = issueKey7;
        IssueKey issueKey8 = new IssueKey("FAILED_TO_DELIVER_PUSH", 7);
        FAILED_TO_DELIVER_PUSH = issueKey8;
        IssueKey issueKey9 = new IssueKey("FILE_DATA_STORE_READ_ERROR", 8);
        FILE_DATA_STORE_READ_ERROR = issueKey9;
        IssueKey issueKey10 = new IssueKey("FILE_DATA_STORE_WRITE_ERROR", 9);
        FILE_DATA_STORE_WRITE_ERROR = issueKey10;
        IssueKey issueKey11 = new IssueKey("FILE_DATA_STORE_MIGRATION_ERROR", 10);
        FILE_DATA_STORE_MIGRATION_ERROR = issueKey11;
        IssueKey issueKey12 = new IssueKey("FILE_DATA_STORE_PARSE_ERROR", 11);
        FILE_DATA_STORE_PARSE_ERROR = issueKey12;
        IssueKey issueKey13 = new IssueKey("FILE_MIGRATION_ERROR", 12);
        FILE_MIGRATION_ERROR = issueKey13;
        IssueKey issueKey14 = new IssueKey("WORK_MANAGER_GET_INSTANCE_ERROR", 13);
        WORK_MANAGER_GET_INSTANCE_ERROR = issueKey14;
        IssueKey issueKey15 = new IssueKey("SSL_PINNING_FAILED", 14);
        SSL_PINNING_FAILED = issueKey15;
        $VALUES = new IssueKey[]{issueKey, issueKey2, issueKey3, issueKey4, issueKey5, issueKey6, issueKey7, issueKey8, issueKey9, issueKey10, issueKey11, issueKey12, issueKey13, issueKey14, issueKey15};
    }

    public IssueKey() {
        throw null;
    }

    public static IssueKey valueOf(String str) {
        return (IssueKey) Enum.valueOf(IssueKey.class, str);
    }

    public static IssueKey[] values() {
        return (IssueKey[]) $VALUES.clone();
    }
}
