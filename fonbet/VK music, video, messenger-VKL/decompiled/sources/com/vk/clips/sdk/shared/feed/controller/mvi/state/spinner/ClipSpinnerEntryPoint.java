package com.vk.clips.sdk.shared.feed.controller.mvi.state.spinner;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipSpinnerEntryPoint.kt */
/* loaded from: classes17.dex */
public final class ClipSpinnerEntryPoint {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipSpinnerEntryPoint[] $VALUES;
    public static final ClipSpinnerEntryPoint InlineNpsSendResult;
    public static final ClipSpinnerEntryPoint MenuActions;

    static {
        ClipSpinnerEntryPoint clipSpinnerEntryPoint = new ClipSpinnerEntryPoint("MenuActions", 0);
        MenuActions = clipSpinnerEntryPoint;
        ClipSpinnerEntryPoint clipSpinnerEntryPoint2 = new ClipSpinnerEntryPoint("InlineNpsSendResult", 1);
        InlineNpsSendResult = clipSpinnerEntryPoint2;
        ClipSpinnerEntryPoint[] clipSpinnerEntryPointArr = {clipSpinnerEntryPoint, clipSpinnerEntryPoint2};
        $VALUES = clipSpinnerEntryPointArr;
        $ENTRIES = new asp(clipSpinnerEntryPointArr);
    }

    public ClipSpinnerEntryPoint() {
        throw null;
    }

    public static ClipSpinnerEntryPoint valueOf(String str) {
        return (ClipSpinnerEntryPoint) Enum.valueOf(ClipSpinnerEntryPoint.class, str);
    }

    public static ClipSpinnerEntryPoint[] values() {
        return (ClipSpinnerEntryPoint[]) $VALUES.clone();
    }
}
