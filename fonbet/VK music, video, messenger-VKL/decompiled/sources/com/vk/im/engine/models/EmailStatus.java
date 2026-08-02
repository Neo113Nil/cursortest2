package com.vk.im.engine.models;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import xsna.asp;
import xsna.bpn0;
import xsna.jg0;
import xsna.lhg;
import xsna.on00;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EmailStatus.kt */
/* loaded from: classes2.dex */
public final class EmailStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EmailStatus[] $VALUES;
    public static final EmailStatus CONFIRMED;
    public static final a Companion;
    public static final EmailStatus NEED_CONFIRMATION;
    public static final EmailStatus UNKNOWN;
    private static final Lazy<Map<Integer, EmailStatus>> values$delegate;
    private final int id;

    /* compiled from: EmailStatus.kt */
    public static final class a {
        public static EmailStatus a(int i) {
            Object obj = ((Map) EmailStatus.values$delegate.getValue()).get(Integer.valueOf(i));
            if (obj != null) {
                return (EmailStatus) obj;
            }
            throw new IllegalArgumentException(lhg.a(i, "Unknown id: ").toString());
        }
    }

    static {
        EmailStatus emailStatus = new EmailStatus(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
        UNKNOWN = emailStatus;
        EmailStatus emailStatus2 = new EmailStatus("CONFIRMED", 1, 1);
        CONFIRMED = emailStatus2;
        EmailStatus emailStatus3 = new EmailStatus("NEED_CONFIRMATION", 2, 2);
        NEED_CONFIRMATION = emailStatus3;
        EmailStatus[] emailStatusArr = {emailStatus, emailStatus2, emailStatus3};
        $VALUES = emailStatusArr;
        $ENTRIES = new asp(emailStatusArr);
        Companion = new a();
        values$delegate = new bpn0(new jg0(17));
    }

    public EmailStatus(String str, int i, int i2) {
        this.id = i2;
    }

    public static LinkedHashMap h() {
        EmailStatus[] values = values();
        int e = on00.e(values.length);
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (EmailStatus emailStatus : values) {
            linkedHashMap.put(Integer.valueOf(emailStatus.id), emailStatus);
        }
        return linkedHashMap;
    }

    public static EmailStatus valueOf(String str) {
        return (EmailStatus) Enum.valueOf(EmailStatus.class, str);
    }

    public static EmailStatus[] values() {
        return (EmailStatus[]) $VALUES.clone();
    }

    public final int j() {
        return this.id;
    }
}
