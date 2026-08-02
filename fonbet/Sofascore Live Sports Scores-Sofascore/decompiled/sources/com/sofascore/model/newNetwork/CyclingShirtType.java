package com.sofascore.model.newNetwork;

import defpackage.gz8;
import defpackage.jp5;
import defpackage.q5h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/sofascore/model/newNetwork/CyclingShirtType;", "", "<init>", "(Ljava/lang/String;I)V", "General", "Sprint", "Climb", "Young", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CyclingShirtType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ CyclingShirtType[] $VALUES;

    @q5h("general")
    public static final CyclingShirtType General = new CyclingShirtType("General", 0);

    @q5h("sprint")
    public static final CyclingShirtType Sprint = new CyclingShirtType("Sprint", 1);

    @q5h("climb")
    public static final CyclingShirtType Climb = new CyclingShirtType("Climb", 2);

    @q5h("young")
    public static final CyclingShirtType Young = new CyclingShirtType("Young", 3);

    private static final /* synthetic */ CyclingShirtType[] $values() {
        return new CyclingShirtType[]{General, Sprint, Climb, Young};
    }

    static {
        CyclingShirtType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private CyclingShirtType(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static CyclingShirtType valueOf(String str) {
        return (CyclingShirtType) Enum.valueOf(CyclingShirtType.class, str);
    }

    public static CyclingShirtType[] values() {
        return (CyclingShirtType[]) $VALUES.clone();
    }
}
