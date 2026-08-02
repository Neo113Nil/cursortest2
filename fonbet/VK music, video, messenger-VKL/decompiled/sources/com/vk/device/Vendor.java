package com.vk.device;

import android.os.Build;
import com.huawei.hms.android.SystemUtils;
import xsna.asp;
import xsna.brm0;
import xsna.drm0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Vendor.kt */
/* loaded from: classes18.dex */
public final class Vendor {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Vendor[] $VALUES;
    public static final Vendor AMAZON;
    public static final a Companion;
    public static final Vendor HONOR;
    public static final Vendor HUAWEI;
    public static final Vendor ONE_PLUS;
    public static final Vendor OPPO;
    public static final Vendor REALME;
    public static final Vendor SAMSUNG;
    public static final Vendor XIAOMI;
    private final String tag;

    /* compiled from: Vendor.kt */
    public static final class a {
    }

    static {
        Vendor vendor = new Vendor("SAMSUNG", 0, "samsung");
        SAMSUNG = vendor;
        Vendor vendor2 = new Vendor(SystemUtils.PRODUCT_HUAWEI, 1, "huawei");
        HUAWEI = vendor2;
        Vendor vendor3 = new Vendor(SystemUtils.PRODUCT_HONOR, 2, "honor");
        HONOR = vendor3;
        Vendor vendor4 = new Vendor("ONE_PLUS", 3, "onePlus");
        ONE_PLUS = vendor4;
        Vendor vendor5 = new Vendor("OPPO", 4, "oppo");
        OPPO = vendor5;
        Vendor vendor6 = new Vendor("XIAOMI", 5, "xiaomi");
        XIAOMI = vendor6;
        Vendor vendor7 = new Vendor("REALME", 6, "realme");
        REALME = vendor7;
        Vendor vendor8 = new Vendor("AMAZON", 7, "amazon");
        AMAZON = vendor8;
        Vendor[] vendorArr = {vendor, vendor2, vendor3, vendor4, vendor5, vendor6, vendor7, vendor8};
        $VALUES = vendorArr;
        $ENTRIES = new asp(vendorArr);
        Companion = new a();
    }

    public Vendor(String str, int i, String str2) {
        this.tag = str2;
    }

    public static Vendor valueOf(String str) {
        return (Vendor) Enum.valueOf(Vendor.class, str);
    }

    public static Vendor[] values() {
        return (Vendor[]) $VALUES.clone();
    }

    public final boolean a(boolean z) {
        return z ? brm0.w(this.tag, Build.MANUFACTURER, true) : drm0.D(Build.MANUFACTURER, this.tag, true);
    }
}
