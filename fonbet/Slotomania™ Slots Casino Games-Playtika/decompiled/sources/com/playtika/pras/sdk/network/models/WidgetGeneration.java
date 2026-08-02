package com.playtika.pras.sdk.network.models;

/* loaded from: classes4.dex */
public enum WidgetGeneration {
    GEN_4(4),
    GEN_5(5),
    GEN_6(6);

    private final int value;

    WidgetGeneration(int i) {
        this.value = i;
    }

    public static WidgetGeneration fromInt(int i) {
        return i != 4 ? i != 5 ? i != 6 ? GEN_4 : GEN_6 : GEN_5 : GEN_4;
    }

    public int getValue() {
        return this.value;
    }
}
