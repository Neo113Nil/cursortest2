package com.vk.im.engine.models;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import xsna.asp;
import xsna.bpn0;
import xsna.f84;
import xsna.lhg;
import xsna.on00;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VerificationStatus.kt */
/* loaded from: classes2.dex */
public final class VerificationStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VerificationStatus[] $VALUES;
    public static final a Companion;
    public static final VerificationStatus UNVERIFIED;
    public static final VerificationStatus VERIFIED;
    public static final VerificationStatus VERIFIED_CHANGE_DATA;
    private static final Lazy<Map<Integer, VerificationStatus>> values$delegate;
    private final int id;

    /* compiled from: VerificationStatus.kt */
    public static final class a {
        public static VerificationStatus a(int i) {
            Object obj = ((Map) VerificationStatus.values$delegate.getValue()).get(Integer.valueOf(i));
            if (obj != null) {
                return (VerificationStatus) obj;
            }
            throw new IllegalArgumentException(lhg.a(i, "Unknown id: ").toString());
        }
    }

    static {
        VerificationStatus verificationStatus = new VerificationStatus("VERIFIED", 0, 0);
        VERIFIED = verificationStatus;
        VerificationStatus verificationStatus2 = new VerificationStatus("VERIFIED_CHANGE_DATA", 1, 1);
        VERIFIED_CHANGE_DATA = verificationStatus2;
        VerificationStatus verificationStatus3 = new VerificationStatus("UNVERIFIED", 2, 2);
        UNVERIFIED = verificationStatus3;
        VerificationStatus[] verificationStatusArr = {verificationStatus, verificationStatus2, verificationStatus3};
        $VALUES = verificationStatusArr;
        $ENTRIES = new asp(verificationStatusArr);
        Companion = new a();
        values$delegate = new bpn0(new f84(25));
    }

    public VerificationStatus(String str, int i, int i2) {
        this.id = i2;
    }

    public static LinkedHashMap h() {
        VerificationStatus[] values = values();
        int e = on00.e(values.length);
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (VerificationStatus verificationStatus : values) {
            linkedHashMap.put(Integer.valueOf(verificationStatus.id), verificationStatus);
        }
        return linkedHashMap;
    }

    public static VerificationStatus valueOf(String str) {
        return (VerificationStatus) Enum.valueOf(VerificationStatus.class, str);
    }

    public static VerificationStatus[] values() {
        return (VerificationStatus[]) $VALUES.clone();
    }

    public final int j() {
        return this.id;
    }
}
