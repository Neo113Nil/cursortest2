package com.unity3d.services.core.network.model;

import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/unity3d/services/core/network/model/BodyType;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "STRING", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BodyType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BodyType[] $VALUES;
    public static final BodyType UNKNOWN = new BodyType("UNKNOWN", 0);
    public static final BodyType STRING = new BodyType("STRING", 1);

    private static final /* synthetic */ BodyType[] $values() {
        return new BodyType[]{UNKNOWN, STRING};
    }

    static {
        BodyType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private BodyType(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BodyType valueOf(String str) {
        return (BodyType) Enum.valueOf(BodyType.class, str);
    }

    public static BodyType[] values() {
        return (BodyType[]) $VALUES.clone();
    }
}
