package com.blaze.blazesdk.style.shared.models;

import androidx.annotation.Keep;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/blaze/blazesdk/style/shared/models/BlazeObjectYPosition;", "", "<init>", "(Ljava/lang/String;I)V", "BOTTOM_TO_TOP", "TOP_TO_TOP", "BOTTOM_TO_BOTTOM", "TOP_TO_BOTTOM", "CENTER_TO_TOP", "CENTER_Y", "CENTER_TO_BOTTOM", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeObjectYPosition {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BlazeObjectYPosition[] $VALUES;
    public static final BlazeObjectYPosition BOTTOM_TO_TOP = new BlazeObjectYPosition("BOTTOM_TO_TOP", 0);
    public static final BlazeObjectYPosition TOP_TO_TOP = new BlazeObjectYPosition("TOP_TO_TOP", 1);
    public static final BlazeObjectYPosition BOTTOM_TO_BOTTOM = new BlazeObjectYPosition("BOTTOM_TO_BOTTOM", 2);
    public static final BlazeObjectYPosition TOP_TO_BOTTOM = new BlazeObjectYPosition("TOP_TO_BOTTOM", 3);
    public static final BlazeObjectYPosition CENTER_TO_TOP = new BlazeObjectYPosition("CENTER_TO_TOP", 4);
    public static final BlazeObjectYPosition CENTER_Y = new BlazeObjectYPosition("CENTER_Y", 5);
    public static final BlazeObjectYPosition CENTER_TO_BOTTOM = new BlazeObjectYPosition("CENTER_TO_BOTTOM", 6);

    private static final /* synthetic */ BlazeObjectYPosition[] $values() {
        return new BlazeObjectYPosition[]{BOTTOM_TO_TOP, TOP_TO_TOP, BOTTOM_TO_BOTTOM, TOP_TO_BOTTOM, CENTER_TO_TOP, CENTER_Y, CENTER_TO_BOTTOM};
    }

    static {
        BlazeObjectYPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private BlazeObjectYPosition(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BlazeObjectYPosition valueOf(String str) {
        return (BlazeObjectYPosition) Enum.valueOf(BlazeObjectYPosition.class, str);
    }

    public static BlazeObjectYPosition[] values() {
        return (BlazeObjectYPosition[]) $VALUES.clone();
    }
}
