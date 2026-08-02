package com.vk.core.apps;

import com.huawei.hms.android.SystemUtils;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import kotlin.Lazy;
import xsna.asp;
import xsna.bpn0;
import xsna.s12;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkBuildAppStore.kt */
/* loaded from: classes.dex */
public final class VkBuildAppStore {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkBuildAppStore[] $VALUES;
    public static final VkBuildAppStore ARTEL_ROM;
    public static final VkBuildAppStore BEELINE_RETAIL;
    public static final a Companion;
    private static final Lazy<VkBuildAppStore> DEFAULT$delegate;
    public static final VkBuildAppStore DNS_ROM;
    public static final VkBuildAppStore GAIA;
    public static final VkBuildAppStore GOOGLE;
    public static final VkBuildAppStore HAIER_ROM;
    public static final VkBuildAppStore HARPER_ROM;
    public static final VkBuildAppStore HIER_ROM;
    public static final VkBuildAppStore HIPER_ROM;
    public static final VkBuildAppStore HUAWEI;
    public static final VkBuildAppStore KION;
    public static final VkBuildAppStore KIVI_ROM;
    public static final VkBuildAppStore KVANT_ROM;
    public static final VkBuildAppStore MISTORE;
    public static final VkBuildAppStore MOVIX_ROM;
    public static final VkBuildAppStore QUANTUM;
    public static final VkBuildAppStore ROMBICA_ROM;
    public static final VkBuildAppStore RUSTORE;
    public static final VkBuildAppStore SALUT_DEVICES;
    public static final VkBuildAppStore SAMSUNG_KIDS_ROM;
    public static final VkBuildAppStore SBERBOX;
    public static final VkBuildAppStore SHARKS_TRAID;
    public static final VkBuildAppStore SMALL_STORE;
    public static final VkBuildAppStore SMOTRESHKA;
    public static final VkBuildAppStore TANIX_ROM;
    public static final VkBuildAppStore WILDRED_ROM;
    public static final VkBuildAppStore WINK;
    public static final VkBuildAppStore XIAOMI_ROM;
    public static final VkBuildAppStore YANDEX;
    public static final VkBuildAppStore YANDEX_STATION;
    public static final VkBuildAppStore ZEASN_ROM;
    private final String serializeName;

    /* compiled from: VkBuildAppStore.kt */
    public static final class a {
    }

    static {
        VkBuildAppStore vkBuildAppStore = new VkBuildAppStore("GOOGLE", 0, AndroidStaticDeviceInfoDataSource.STORE_GOOGLE);
        GOOGLE = vkBuildAppStore;
        VkBuildAppStore vkBuildAppStore2 = new VkBuildAppStore(SystemUtils.PRODUCT_HUAWEI, 1, "huawei");
        HUAWEI = vkBuildAppStore2;
        VkBuildAppStore vkBuildAppStore3 = new VkBuildAppStore("RUSTORE", 2, "rustore");
        RUSTORE = vkBuildAppStore3;
        VkBuildAppStore vkBuildAppStore4 = new VkBuildAppStore("MISTORE", 3, "mistore");
        MISTORE = vkBuildAppStore4;
        VkBuildAppStore vkBuildAppStore5 = new VkBuildAppStore("SBERBOX", 4, "sberbox");
        SBERBOX = vkBuildAppStore5;
        VkBuildAppStore vkBuildAppStore6 = new VkBuildAppStore("KION", 5, "kion");
        KION = vkBuildAppStore6;
        VkBuildAppStore vkBuildAppStore7 = new VkBuildAppStore("WINK", 6, "wink");
        WINK = vkBuildAppStore7;
        VkBuildAppStore vkBuildAppStore8 = new VkBuildAppStore("YANDEX", 7, "yandex");
        YANDEX = vkBuildAppStore8;
        VkBuildAppStore vkBuildAppStore9 = new VkBuildAppStore("XIAOMI_ROM", 8, "xiaomi_rom");
        XIAOMI_ROM = vkBuildAppStore9;
        VkBuildAppStore vkBuildAppStore10 = new VkBuildAppStore("WILDRED_ROM", 9, "wildred_rom");
        WILDRED_ROM = vkBuildAppStore10;
        VkBuildAppStore vkBuildAppStore11 = new VkBuildAppStore("KVANT_ROM", 10, "kvant_rom");
        KVANT_ROM = vkBuildAppStore11;
        VkBuildAppStore vkBuildAppStore12 = new VkBuildAppStore("HIPER_ROM", 11, "hiper_rom");
        HIPER_ROM = vkBuildAppStore12;
        VkBuildAppStore vkBuildAppStore13 = new VkBuildAppStore("HIER_ROM", 12, "hier_rom");
        HIER_ROM = vkBuildAppStore13;
        VkBuildAppStore vkBuildAppStore14 = new VkBuildAppStore("ZEASN_ROM", 13, "zeasn_rom");
        ZEASN_ROM = vkBuildAppStore14;
        VkBuildAppStore vkBuildAppStore15 = new VkBuildAppStore("MOVIX_ROM", 14, "movix_rom");
        MOVIX_ROM = vkBuildAppStore15;
        VkBuildAppStore vkBuildAppStore16 = new VkBuildAppStore("ROMBICA_ROM", 15, "rombica_rom");
        ROMBICA_ROM = vkBuildAppStore16;
        VkBuildAppStore vkBuildAppStore17 = new VkBuildAppStore("HARPER_ROM", 16, "harper_rom");
        HARPER_ROM = vkBuildAppStore17;
        VkBuildAppStore vkBuildAppStore18 = new VkBuildAppStore("ARTEL_ROM", 17, "artel_rom");
        ARTEL_ROM = vkBuildAppStore18;
        VkBuildAppStore vkBuildAppStore19 = new VkBuildAppStore("HAIER_ROM", 18, "haier_rom");
        HAIER_ROM = vkBuildAppStore19;
        VkBuildAppStore vkBuildAppStore20 = new VkBuildAppStore("TANIX_ROM", 19, "tanix_rom");
        TANIX_ROM = vkBuildAppStore20;
        VkBuildAppStore vkBuildAppStore21 = new VkBuildAppStore("SHARKS_TRAID", 20, "sharks_traid");
        SHARKS_TRAID = vkBuildAppStore21;
        VkBuildAppStore vkBuildAppStore22 = new VkBuildAppStore("SALUT_DEVICES", 21, "salut_devices");
        SALUT_DEVICES = vkBuildAppStore22;
        VkBuildAppStore vkBuildAppStore23 = new VkBuildAppStore("BEELINE_RETAIL", 22, "beeline_retail");
        BEELINE_RETAIL = vkBuildAppStore23;
        VkBuildAppStore vkBuildAppStore24 = new VkBuildAppStore("SMOTRESHKA", 23, "smotreshka");
        SMOTRESHKA = vkBuildAppStore24;
        VkBuildAppStore vkBuildAppStore25 = new VkBuildAppStore("QUANTUM", 24, "quantum_rom");
        QUANTUM = vkBuildAppStore25;
        VkBuildAppStore vkBuildAppStore26 = new VkBuildAppStore("YANDEX_STATION", 25, "yandex_station");
        YANDEX_STATION = vkBuildAppStore26;
        VkBuildAppStore vkBuildAppStore27 = new VkBuildAppStore("SMALL_STORE", 26, "small");
        SMALL_STORE = vkBuildAppStore27;
        VkBuildAppStore vkBuildAppStore28 = new VkBuildAppStore("DNS_ROM", 27, "dns_rom");
        DNS_ROM = vkBuildAppStore28;
        VkBuildAppStore vkBuildAppStore29 = new VkBuildAppStore("KIVI_ROM", 28, "kivi_rom");
        KIVI_ROM = vkBuildAppStore29;
        VkBuildAppStore vkBuildAppStore30 = new VkBuildAppStore("SAMSUNG_KIDS_ROM", 29, "samsung_kids_rom");
        SAMSUNG_KIDS_ROM = vkBuildAppStore30;
        VkBuildAppStore vkBuildAppStore31 = new VkBuildAppStore("GAIA", 30, "gaia");
        GAIA = vkBuildAppStore31;
        VkBuildAppStore[] vkBuildAppStoreArr = {vkBuildAppStore, vkBuildAppStore2, vkBuildAppStore3, vkBuildAppStore4, vkBuildAppStore5, vkBuildAppStore6, vkBuildAppStore7, vkBuildAppStore8, vkBuildAppStore9, vkBuildAppStore10, vkBuildAppStore11, vkBuildAppStore12, vkBuildAppStore13, vkBuildAppStore14, vkBuildAppStore15, vkBuildAppStore16, vkBuildAppStore17, vkBuildAppStore18, vkBuildAppStore19, vkBuildAppStore20, vkBuildAppStore21, vkBuildAppStore22, vkBuildAppStore23, vkBuildAppStore24, vkBuildAppStore25, vkBuildAppStore26, vkBuildAppStore27, vkBuildAppStore28, vkBuildAppStore29, vkBuildAppStore30, vkBuildAppStore31};
        $VALUES = vkBuildAppStoreArr;
        $ENTRIES = new asp(vkBuildAppStoreArr);
        Companion = new a();
        DEFAULT$delegate = new bpn0(new s12(15));
    }

    public VkBuildAppStore(String str, int i, String str2) {
        this.serializeName = str2;
    }

    public static VkBuildAppStore valueOf(String str) {
        return (VkBuildAppStore) Enum.valueOf(VkBuildAppStore.class, str);
    }

    public static VkBuildAppStore[] values() {
        return (VkBuildAppStore[]) $VALUES.clone();
    }

    public final String i() {
        return this.serializeName;
    }
}
