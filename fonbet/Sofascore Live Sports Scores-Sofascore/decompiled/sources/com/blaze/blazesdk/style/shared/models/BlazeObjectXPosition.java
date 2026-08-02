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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/blaze/blazesdk/style/shared/models/BlazeObjectXPosition;", "", "<init>", "(Ljava/lang/String;I)V", "START_TO_START", "START_TO_END", "END_TO_START", "END_TO_END", "CENTER_X", "CENTER_TO_START", "CENTER_TO_END", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeObjectXPosition {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BlazeObjectXPosition[] $VALUES;
    public static final BlazeObjectXPosition START_TO_START = new BlazeObjectXPosition("START_TO_START", 0);
    public static final BlazeObjectXPosition START_TO_END = new BlazeObjectXPosition("START_TO_END", 1);
    public static final BlazeObjectXPosition END_TO_START = new BlazeObjectXPosition("END_TO_START", 2);
    public static final BlazeObjectXPosition END_TO_END = new BlazeObjectXPosition("END_TO_END", 3);
    public static final BlazeObjectXPosition CENTER_X = new BlazeObjectXPosition("CENTER_X", 4);
    public static final BlazeObjectXPosition CENTER_TO_START = new BlazeObjectXPosition("CENTER_TO_START", 5);
    public static final BlazeObjectXPosition CENTER_TO_END = new BlazeObjectXPosition("CENTER_TO_END", 6);

    private static final /* synthetic */ BlazeObjectXPosition[] $values() {
        return new BlazeObjectXPosition[]{START_TO_START, START_TO_END, END_TO_START, END_TO_END, CENTER_X, CENTER_TO_START, CENTER_TO_END};
    }

    static {
        BlazeObjectXPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private BlazeObjectXPosition(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BlazeObjectXPosition valueOf(String str) {
        return (BlazeObjectXPosition) Enum.valueOf(BlazeObjectXPosition.class, str);
    }

    public static BlazeObjectXPosition[] values() {
        return (BlazeObjectXPosition[]) $VALUES.clone();
    }
}
