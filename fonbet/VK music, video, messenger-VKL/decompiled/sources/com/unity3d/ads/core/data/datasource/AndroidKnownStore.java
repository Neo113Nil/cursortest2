package com.unity3d.ads.core.data.datasource;

import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AndroidKnownStore.kt */
/* loaded from: classes14.dex */
public final class AndroidKnownStore {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AndroidKnownStore[] $VALUES;
    private final String packageName;
    public static final AndroidKnownStore GOOGLE = new AndroidKnownStore("GOOGLE", 0, "com.android.vending");
    public static final AndroidKnownStore GOOGLE_MARKET = new AndroidKnownStore("GOOGLE_MARKET", 1, "com.google.market");
    public static final AndroidKnownStore AMAZON = new AndroidKnownStore("AMAZON", 2, "com.amazon.venezia");
    public static final AndroidKnownStore SAMSUNG = new AndroidKnownStore("SAMSUNG", 3, "com.sec.android.app.samsungapps");
    public static final AndroidKnownStore XIAOMI = new AndroidKnownStore("XIAOMI", 4, "com.xiaomi.market");
    public static final AndroidKnownStore HUAWEI = new AndroidKnownStore(SystemUtils.PRODUCT_HUAWEI, 5, "com.huawei.appmarket");
    public static final AndroidKnownStore OPPO = new AndroidKnownStore("OPPO", 6, "com.oppo.market");
    public static final AndroidKnownStore VIVO = new AndroidKnownStore("VIVO", 7, "com.bbk.appstore");
    public static final AndroidKnownStore UNKNOWN = new AndroidKnownStore(GrsBaseInfo.CountryCodeSource.UNKNOWN, 8, "unknown");

    private static final /* synthetic */ AndroidKnownStore[] $values() {
        return new AndroidKnownStore[]{GOOGLE, GOOGLE_MARKET, AMAZON, SAMSUNG, XIAOMI, HUAWEI, OPPO, VIVO, UNKNOWN};
    }

    static {
        AndroidKnownStore[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private AndroidKnownStore(String str, int i, String str2) {
        this.packageName = str2;
    }

    public static zrp<AndroidKnownStore> getEntries() {
        return $ENTRIES;
    }

    public static AndroidKnownStore valueOf(String str) {
        return (AndroidKnownStore) Enum.valueOf(AndroidKnownStore.class, str);
    }

    public static AndroidKnownStore[] values() {
        return (AndroidKnownStore[]) $VALUES.clone();
    }

    public final String getPackageName() {
        return this.packageName;
    }
}
