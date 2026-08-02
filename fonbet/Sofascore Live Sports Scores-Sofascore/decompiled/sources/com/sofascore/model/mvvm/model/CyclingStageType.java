package com.sofascore.model.mvvm.model;

import defpackage.gz8;
import defpackage.jp5;
import defpackage.q5h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/sofascore/model/mvvm/model/CyclingStageType;", "", "<init>", "(Ljava/lang/String;I)V", "Flat", "Hilly", "TimeTrial", "Mountain", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CyclingStageType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ CyclingStageType[] $VALUES;

    @q5h("flat")
    public static final CyclingStageType Flat = new CyclingStageType("Flat", 0);

    @q5h("intermediate")
    public static final CyclingStageType Hilly = new CyclingStageType("Hilly", 1);

    @q5h("timetrial")
    public static final CyclingStageType TimeTrial = new CyclingStageType("TimeTrial", 2);

    @q5h("highmountain")
    public static final CyclingStageType Mountain = new CyclingStageType("Mountain", 3);

    private static final /* synthetic */ CyclingStageType[] $values() {
        return new CyclingStageType[]{Flat, Hilly, TimeTrial, Mountain};
    }

    static {
        CyclingStageType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private CyclingStageType(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static CyclingStageType valueOf(String str) {
        return (CyclingStageType) Enum.valueOf(CyclingStageType.class, str);
    }

    public static CyclingStageType[] values() {
        return (CyclingStageType[]) $VALUES.clone();
    }
}
