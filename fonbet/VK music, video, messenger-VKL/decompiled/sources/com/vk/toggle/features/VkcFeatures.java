package com.vk.toggle.features;

import com.vk.toggle.b;
import xsna.asp;
import xsna.gd6;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkcFeatures.kt */
/* loaded from: classes11.dex */
public final class VkcFeatures implements gd6 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkcFeatures[] $VALUES;
    public static final VkcFeatures HOST_PUSHES;
    public static final VkcFeatures MIGRATION_USERS_GET_TO_ACC_GET;
    public static final VkcFeatures MIGRATION_USERS_GET_TO_ACC_GET_3;
    public static final VkcFeatures REFRESH_TRUSTED_HASHES;
    private final String key;

    static {
        VkcFeatures vkcFeatures = new VkcFeatures("REFRESH_TRUSTED_HASHES", 0, "sak_refresh_th");
        REFRESH_TRUSTED_HASHES = vkcFeatures;
        VkcFeatures vkcFeatures2 = new VkcFeatures("MIGRATION_USERS_GET_TO_ACC_GET", 1, "sak_migr_users_get_android_2");
        MIGRATION_USERS_GET_TO_ACC_GET = vkcFeatures2;
        VkcFeatures vkcFeatures3 = new VkcFeatures("MIGRATION_USERS_GET_TO_ACC_GET_3", 2, "sak_migr_users_get_android_3");
        MIGRATION_USERS_GET_TO_ACC_GET_3 = vkcFeatures3;
        VkcFeatures vkcFeatures4 = new VkcFeatures("HOST_PUSHES", 3, "sak_host_pushes");
        HOST_PUSHES = vkcFeatures4;
        VkcFeatures[] vkcFeaturesArr = {vkcFeatures, vkcFeatures2, vkcFeatures3, vkcFeatures4};
        $VALUES = vkcFeaturesArr;
        $ENTRIES = new asp(vkcFeaturesArr);
    }

    public VkcFeatures(String str, int i, String str2) {
        this.key = str2;
    }

    public static zrp<VkcFeatures> i() {
        return $ENTRIES;
    }

    public static VkcFeatures valueOf(String str) {
        return (VkcFeatures) Enum.valueOf(VkcFeatures.class, str);
    }

    public static VkcFeatures[] values() {
        return (VkcFeatures[]) $VALUES.clone();
    }

    @Override // com.vk.toggle.b.a
    public final String getKey() {
        return this.key;
    }

    @Override // xsna.gd6, com.vk.toggle.b.a
    public final boolean h() {
        return b.A.a(this);
    }
}
