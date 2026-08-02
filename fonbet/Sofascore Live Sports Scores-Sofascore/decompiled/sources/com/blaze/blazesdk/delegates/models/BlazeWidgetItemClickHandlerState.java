package com.blaze.blazesdk.delegates.models;

import androidx.annotation.Keep;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/delegates/models/BlazeWidgetItemClickHandlerState;", "", "<init>", "(Ljava/lang/String;I)V", "HANDLED_BY_APP", "SDK_SHOULD_HANDLE", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BlazeWidgetItemClickHandlerState {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BlazeWidgetItemClickHandlerState[] $VALUES;

    @Keep
    public static final BlazeWidgetItemClickHandlerState HANDLED_BY_APP = new BlazeWidgetItemClickHandlerState("HANDLED_BY_APP", 0);

    @Keep
    public static final BlazeWidgetItemClickHandlerState SDK_SHOULD_HANDLE = new BlazeWidgetItemClickHandlerState("SDK_SHOULD_HANDLE", 1);

    private static final /* synthetic */ BlazeWidgetItemClickHandlerState[] $values() {
        return new BlazeWidgetItemClickHandlerState[]{HANDLED_BY_APP, SDK_SHOULD_HANDLE};
    }

    static {
        BlazeWidgetItemClickHandlerState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private BlazeWidgetItemClickHandlerState(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BlazeWidgetItemClickHandlerState valueOf(String str) {
        return (BlazeWidgetItemClickHandlerState) Enum.valueOf(BlazeWidgetItemClickHandlerState.class, str);
    }

    public static BlazeWidgetItemClickHandlerState[] values() {
        return (BlazeWidgetItemClickHandlerState[]) $VALUES.clone();
    }
}
