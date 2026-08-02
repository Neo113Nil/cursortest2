package com.vk.music.stickyplayer.presentation.components;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BigPlayerScaffold.kt */
/* loaded from: classes3.dex */
public final class BigPlayerBottomSheetValue {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BigPlayerBottomSheetValue[] $VALUES;
    public static final BigPlayerBottomSheetValue Collapsed;
    public static final BigPlayerBottomSheetValue Expanded;

    static {
        BigPlayerBottomSheetValue bigPlayerBottomSheetValue = new BigPlayerBottomSheetValue("Collapsed", 0);
        Collapsed = bigPlayerBottomSheetValue;
        BigPlayerBottomSheetValue bigPlayerBottomSheetValue2 = new BigPlayerBottomSheetValue("Expanded", 1);
        Expanded = bigPlayerBottomSheetValue2;
        BigPlayerBottomSheetValue[] bigPlayerBottomSheetValueArr = {bigPlayerBottomSheetValue, bigPlayerBottomSheetValue2};
        $VALUES = bigPlayerBottomSheetValueArr;
        $ENTRIES = new asp(bigPlayerBottomSheetValueArr);
    }

    public BigPlayerBottomSheetValue() {
        throw null;
    }

    public static BigPlayerBottomSheetValue valueOf(String str) {
        return (BigPlayerBottomSheetValue) Enum.valueOf(BigPlayerBottomSheetValue.class, str);
    }

    public static BigPlayerBottomSheetValue[] values() {
        return (BigPlayerBottomSheetValue[]) $VALUES.clone();
    }
}
