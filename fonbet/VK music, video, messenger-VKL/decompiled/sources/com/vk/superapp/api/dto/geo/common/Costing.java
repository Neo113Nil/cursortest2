package com.vk.superapp.api.dto.geo.common;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Costing.kt */
/* loaded from: classes6.dex */
public final class Costing {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Costing[] $VALUES;

    @pmi0("auto")
    public static final Costing AUTO;

    @pmi0("bicycle")
    public static final Costing BICYCLE;

    @pmi0("pedestrian")
    public static final Costing PEDESTRIAN;

    @pmi0("taxi")
    public static final Costing TAXI;

    @pmi0("truck")
    public static final Costing TRUCK;

    static {
        Costing costing = new Costing("AUTO", 0);
        AUTO = costing;
        Costing costing2 = new Costing("TRUCK", 1);
        TRUCK = costing2;
        Costing costing3 = new Costing("PEDESTRIAN", 2);
        PEDESTRIAN = costing3;
        Costing costing4 = new Costing("BICYCLE", 3);
        BICYCLE = costing4;
        Costing costing5 = new Costing("TAXI", 4);
        TAXI = costing5;
        Costing[] costingArr = {costing, costing2, costing3, costing4, costing5};
        $VALUES = costingArr;
        $ENTRIES = new asp(costingArr);
    }

    private Costing(String str, int i) {
    }

    public static Costing valueOf(String str) {
        return (Costing) Enum.valueOf(Costing.class, str);
    }

    public static Costing[] values() {
        return (Costing[]) $VALUES.clone();
    }
}
