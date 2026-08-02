package com.blaze.blazesdk.delegates;

import androidx.annotation.Keep;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/delegates/BlazeCastingState;", "", "<init>", "(Ljava/lang/String;I)V", "ON", "OFF", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeCastingState {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BlazeCastingState[] $VALUES;
    public static final BlazeCastingState ON = new BlazeCastingState("ON", 0);
    public static final BlazeCastingState OFF = new BlazeCastingState("OFF", 1);

    private static final /* synthetic */ BlazeCastingState[] $values() {
        return new BlazeCastingState[]{ON, OFF};
    }

    static {
        BlazeCastingState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private BlazeCastingState(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BlazeCastingState valueOf(String str) {
        return (BlazeCastingState) Enum.valueOf(BlazeCastingState.class, str);
    }

    public static BlazeCastingState[] values() {
        return (BlazeCastingState[]) $VALUES.clone();
    }
}
