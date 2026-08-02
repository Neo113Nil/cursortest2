package com.sofascore.model.mvvm.model;

import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/StageType;", "", "<init>", "(Ljava/lang/String;I)V", "MY_STAGE", "MY_UNIQUE_STAGE", "MUTED", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StageType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ StageType[] $VALUES;
    public static final StageType MY_STAGE = new StageType("MY_STAGE", 0);
    public static final StageType MY_UNIQUE_STAGE = new StageType("MY_UNIQUE_STAGE", 1);
    public static final StageType MUTED = new StageType("MUTED", 2);

    private static final /* synthetic */ StageType[] $values() {
        return new StageType[]{MY_STAGE, MY_UNIQUE_STAGE, MUTED};
    }

    static {
        StageType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private StageType(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static StageType valueOf(String str) {
        return (StageType) Enum.valueOf(StageType.class, str);
    }

    public static StageType[] values() {
        return (StageType[]) $VALUES.clone();
    }
}
