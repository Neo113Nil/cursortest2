package com.vk.mail.auth.contract.result.userblockstatus;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MailUserBlockedStatus.kt */
/* loaded from: classes3.dex */
public final class MailUserBlockedStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MailUserBlockedStatus[] $VALUES;
    public static final MailUserBlockedStatus BLOCKED;
    public static final a Companion;
    public static final MailUserBlockedStatus ERROR;
    public static final MailUserBlockedStatus NORMAL;
    public static final MailUserBlockedStatus NOT_FOUND;
    private final String status;

    /* compiled from: MailUserBlockedStatus.kt */
    public static final class a {
    }

    static {
        MailUserBlockedStatus mailUserBlockedStatus = new MailUserBlockedStatus("NOT_FOUND", 0, "notfound");
        NOT_FOUND = mailUserBlockedStatus;
        MailUserBlockedStatus mailUserBlockedStatus2 = new MailUserBlockedStatus("ERROR", 1, "error");
        ERROR = mailUserBlockedStatus2;
        MailUserBlockedStatus mailUserBlockedStatus3 = new MailUserBlockedStatus("NORMAL", 2, "normal");
        NORMAL = mailUserBlockedStatus3;
        MailUserBlockedStatus mailUserBlockedStatus4 = new MailUserBlockedStatus("BLOCKED", 3, "blocked");
        BLOCKED = mailUserBlockedStatus4;
        MailUserBlockedStatus[] mailUserBlockedStatusArr = {mailUserBlockedStatus, mailUserBlockedStatus2, mailUserBlockedStatus3, mailUserBlockedStatus4};
        $VALUES = mailUserBlockedStatusArr;
        $ENTRIES = new asp(mailUserBlockedStatusArr);
        Companion = new a();
    }

    public MailUserBlockedStatus(String str, int i, String str2) {
        this.status = str2;
    }

    public static MailUserBlockedStatus valueOf(String str) {
        return (MailUserBlockedStatus) Enum.valueOf(MailUserBlockedStatus.class, str);
    }

    public static MailUserBlockedStatus[] values() {
        return (MailUserBlockedStatus[]) $VALUES.clone();
    }
}
