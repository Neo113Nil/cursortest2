package com.vk.toggle.features;

import com.vk.toggle.b;
import xsna.asp;
import xsna.gd6;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MoneyFeatures.kt */
/* loaded from: classes11.dex */
public final class MoneyFeatures implements gd6 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MoneyFeatures[] $VALUES;
    public static final MoneyFeatures FEATURE_MONEY_AD_CHOICES_ENTRY_HASH;
    private final String key = "money_ad_choices_entry_hash";

    static {
        MoneyFeatures moneyFeatures = new MoneyFeatures();
        FEATURE_MONEY_AD_CHOICES_ENTRY_HASH = moneyFeatures;
        MoneyFeatures[] moneyFeaturesArr = {moneyFeatures};
        $VALUES = moneyFeaturesArr;
        $ENTRIES = new asp(moneyFeaturesArr);
    }

    public static zrp<MoneyFeatures> i() {
        return $ENTRIES;
    }

    public static MoneyFeatures valueOf(String str) {
        return (MoneyFeatures) Enum.valueOf(MoneyFeatures.class, str);
    }

    public static MoneyFeatures[] values() {
        return (MoneyFeatures[]) $VALUES.clone();
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
