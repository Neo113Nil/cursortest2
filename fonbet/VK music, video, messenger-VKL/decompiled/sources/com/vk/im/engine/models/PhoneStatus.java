package com.vk.im.engine.models;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import xsna.asp;
import xsna.bpn0;
import xsna.lhg;
import xsna.on00;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhoneStatus.kt */
/* loaded from: classes2.dex */
public final class PhoneStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PhoneStatus[] $VALUES;
    public static final a Companion;
    public static final PhoneStatus UNKNOWN;
    public static final PhoneStatus VALIDATED;
    public static final PhoneStatus WAITING;
    private static final Lazy<Map<Integer, PhoneStatus>> values$delegate;
    private final int id;

    /* compiled from: PhoneStatus.kt */
    public static final class a {
        public static PhoneStatus a(int i) {
            Object obj = ((Map) PhoneStatus.values$delegate.getValue()).get(Integer.valueOf(i));
            if (obj != null) {
                return (PhoneStatus) obj;
            }
            throw new IllegalArgumentException(lhg.a(i, "Unknown id: ").toString());
        }
    }

    static {
        PhoneStatus phoneStatus = new PhoneStatus(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
        UNKNOWN = phoneStatus;
        PhoneStatus phoneStatus2 = new PhoneStatus("VALIDATED", 1, 1);
        VALIDATED = phoneStatus2;
        PhoneStatus phoneStatus3 = new PhoneStatus("WAITING", 2, 2);
        WAITING = phoneStatus3;
        PhoneStatus[] phoneStatusArr = {phoneStatus, phoneStatus2, phoneStatus3};
        $VALUES = phoneStatusArr;
        $ENTRIES = new asp(phoneStatusArr);
        Companion = new a();
        values$delegate = new bpn0(new com.vk.movika.sdk.base.model.props.a(21));
    }

    public PhoneStatus(String str, int i, int i2) {
        this.id = i2;
    }

    public static LinkedHashMap h() {
        PhoneStatus[] values = values();
        int e = on00.e(values.length);
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (PhoneStatus phoneStatus : values) {
            linkedHashMap.put(Integer.valueOf(phoneStatus.id), phoneStatus);
        }
        return linkedHashMap;
    }

    public static PhoneStatus valueOf(String str) {
        return (PhoneStatus) Enum.valueOf(PhoneStatus.class, str);
    }

    public static PhoneStatus[] values() {
        return (PhoneStatus[]) $VALUES.clone();
    }

    public final int j() {
        return this.id;
    }
}
