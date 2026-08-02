package com.vk.media.utils;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PreviewRetrieveOption.kt */
/* loaded from: classes3.dex */
public final class PreviewRetrieveOption {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PreviewRetrieveOption[] $VALUES;
    public static final PreviewRetrieveOption OPTION_CLOSEST;
    public static final PreviewRetrieveOption OPTION_CLOSEST_SYNC;
    public static final PreviewRetrieveOption OPTION_NEXT_SYNC;
    public static final PreviewRetrieveOption OPTION_PREVIOUS_SYNC;
    private final int option;

    static {
        PreviewRetrieveOption previewRetrieveOption = new PreviewRetrieveOption("OPTION_PREVIOUS_SYNC", 0, 0);
        OPTION_PREVIOUS_SYNC = previewRetrieveOption;
        PreviewRetrieveOption previewRetrieveOption2 = new PreviewRetrieveOption("OPTION_NEXT_SYNC", 1, 1);
        OPTION_NEXT_SYNC = previewRetrieveOption2;
        PreviewRetrieveOption previewRetrieveOption3 = new PreviewRetrieveOption("OPTION_CLOSEST_SYNC", 2, 2);
        OPTION_CLOSEST_SYNC = previewRetrieveOption3;
        PreviewRetrieveOption previewRetrieveOption4 = new PreviewRetrieveOption("OPTION_CLOSEST", 3, 3);
        OPTION_CLOSEST = previewRetrieveOption4;
        PreviewRetrieveOption[] previewRetrieveOptionArr = {previewRetrieveOption, previewRetrieveOption2, previewRetrieveOption3, previewRetrieveOption4};
        $VALUES = previewRetrieveOptionArr;
        $ENTRIES = new asp(previewRetrieveOptionArr);
    }

    public PreviewRetrieveOption(String str, int i, int i2) {
        this.option = i2;
    }

    public static PreviewRetrieveOption valueOf(String str) {
        return (PreviewRetrieveOption) Enum.valueOf(PreviewRetrieveOption.class, str);
    }

    public static PreviewRetrieveOption[] values() {
        return (PreviewRetrieveOption[]) $VALUES.clone();
    }

    public final int h() {
        return this.option;
    }
}
