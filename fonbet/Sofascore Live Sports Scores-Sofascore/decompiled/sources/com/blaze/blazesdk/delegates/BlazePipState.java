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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/delegates/BlazePipState;", "", "<init>", "(Ljava/lang/String;I)V", "ON", "OFF", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazePipState {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BlazePipState[] $VALUES;
    public static final BlazePipState ON = new BlazePipState("ON", 0);
    public static final BlazePipState OFF = new BlazePipState("OFF", 1);

    private static final /* synthetic */ BlazePipState[] $values() {
        return new BlazePipState[]{ON, OFF};
    }

    static {
        BlazePipState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private BlazePipState(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BlazePipState valueOf(String str) {
        return (BlazePipState) Enum.valueOf(BlazePipState.class, str);
    }

    public static BlazePipState[] values() {
        return (BlazePipState[]) $VALUES.clone();
    }
}
