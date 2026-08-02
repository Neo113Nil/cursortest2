package com.vk.httpexecutor.core.knet;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KnetExecutorType.kt */
/* loaded from: classes.dex */
public final class KnetExecutorType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ KnetExecutorType[] $VALUES;
    public static final KnetExecutorType CRONET_H2;
    public static final KnetExecutorType CRONET_QUIC;
    public static final a Companion;
    public static final KnetExecutorType OKHTTP;
    private static final KnetExecutorType[] VALUES;
    private final String id;

    /* compiled from: KnetExecutorType.kt */
    public static final class a {
    }

    static {
        KnetExecutorType knetExecutorType = new KnetExecutorType("OKHTTP", 0, "okhttp");
        OKHTTP = knetExecutorType;
        KnetExecutorType knetExecutorType2 = new KnetExecutorType("CRONET_H2", 1, "cronet_h2");
        CRONET_H2 = knetExecutorType2;
        KnetExecutorType knetExecutorType3 = new KnetExecutorType("CRONET_QUIC", 2, "cronet_quic");
        CRONET_QUIC = knetExecutorType3;
        KnetExecutorType[] knetExecutorTypeArr = {knetExecutorType, knetExecutorType2, knetExecutorType3};
        $VALUES = knetExecutorTypeArr;
        $ENTRIES = new asp(knetExecutorTypeArr);
        Companion = new a();
        VALUES = values();
    }

    public KnetExecutorType(String str, int i, String str2) {
        this.id = str2;
    }

    public static KnetExecutorType valueOf(String str) {
        return (KnetExecutorType) Enum.valueOf(KnetExecutorType.class, str);
    }

    public static KnetExecutorType[] values() {
        return (KnetExecutorType[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }
}
