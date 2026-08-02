package com.vk.toggle.features;

import com.vk.toggle.b;
import xsna.asp;
import xsna.gd6;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NoobFeatures.kt */
/* loaded from: classes11.dex */
public final class NoobFeatures implements gd6 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NoobFeatures[] $VALUES;
    private final String key;

    static {
        NoobFeatures[] noobFeaturesArr = new NoobFeatures[0];
        $VALUES = noobFeaturesArr;
        $ENTRIES = new asp(noobFeaturesArr);
    }

    public static zrp<NoobFeatures> i() {
        return $ENTRIES;
    }

    public static NoobFeatures valueOf(String str) {
        return (NoobFeatures) Enum.valueOf(NoobFeatures.class, str);
    }

    public static NoobFeatures[] values() {
        return (NoobFeatures[]) $VALUES.clone();
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
