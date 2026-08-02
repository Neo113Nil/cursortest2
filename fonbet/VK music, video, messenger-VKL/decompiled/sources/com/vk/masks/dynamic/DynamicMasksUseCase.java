package com.vk.masks.dynamic;

import xsna.asp;
import xsna.hqo;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DynamicMasksUseCase.kt */
/* loaded from: classes3.dex */
public final class DynamicMasksUseCase implements hqo {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DynamicMasksUseCase[] $VALUES;
    public static final DynamicMasksUseCase CameraInit;
    public static final DynamicMasksUseCase CameraInitAndMaskPreselected;
    public static final DynamicMasksUseCase MasksClicked;

    static {
        DynamicMasksUseCase dynamicMasksUseCase = new DynamicMasksUseCase("CameraInit", 0);
        CameraInit = dynamicMasksUseCase;
        DynamicMasksUseCase dynamicMasksUseCase2 = new DynamicMasksUseCase("CameraInitAndMaskPreselected", 1);
        CameraInitAndMaskPreselected = dynamicMasksUseCase2;
        DynamicMasksUseCase dynamicMasksUseCase3 = new DynamicMasksUseCase("MasksClicked", 2);
        MasksClicked = dynamicMasksUseCase3;
        DynamicMasksUseCase[] dynamicMasksUseCaseArr = {dynamicMasksUseCase, dynamicMasksUseCase2, dynamicMasksUseCase3};
        $VALUES = dynamicMasksUseCaseArr;
        $ENTRIES = new asp(dynamicMasksUseCaseArr);
    }

    public DynamicMasksUseCase() {
        throw null;
    }

    public static DynamicMasksUseCase valueOf(String str) {
        return (DynamicMasksUseCase) Enum.valueOf(DynamicMasksUseCase.class, str);
    }

    public static DynamicMasksUseCase[] values() {
        return (DynamicMasksUseCase[]) $VALUES.clone();
    }
}
