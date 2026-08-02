package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import spay.sdk.domain.model.FraudMonInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@KeepForSdk
/* loaded from: classes9.dex */
public final class k {

    @NonNull
    @KeepForSdk
    public static final k BASE;

    @NonNull
    @KeepForSdk
    public static final k CUSTOM;

    @NonNull
    @KeepForSdk
    public static final k DIGITAL_INK;

    @NonNull
    @KeepForSdk
    public static final k DIGITAL_INK_SEGMENTATION;

    @NonNull
    @KeepForSdk
    public static final k ENTITY_EXTRACTION;

    @NonNull
    @KeepForSdk
    public static final k IMAGE_CAPTIONING;

    @NonNull
    @KeepForSdk
    public static final k TOXICITY_DETECTION;

    @NonNull
    @KeepForSdk
    public static final k TRANSLATE;

    @NonNull
    @KeepForSdk
    public static final k UNKNOWN;
    private static final /* synthetic */ k[] zza;

    static {
        k kVar = new k(FraudMonInfo.UNKNOWN, 0);
        UNKNOWN = kVar;
        k kVar2 = new k("BASE", 1);
        BASE = kVar2;
        k kVar3 = new k("TRANSLATE", 2);
        TRANSLATE = kVar3;
        k kVar4 = new k("ENTITY_EXTRACTION", 3);
        ENTITY_EXTRACTION = kVar4;
        k kVar5 = new k("CUSTOM", 4);
        CUSTOM = kVar5;
        k kVar6 = new k("DIGITAL_INK", 5);
        DIGITAL_INK = kVar6;
        k kVar7 = new k("DIGITAL_INK_SEGMENTATION", 6);
        DIGITAL_INK_SEGMENTATION = kVar7;
        k kVar8 = new k("TOXICITY_DETECTION", 7);
        TOXICITY_DETECTION = kVar8;
        k kVar9 = new k("IMAGE_CAPTIONING", 8);
        IMAGE_CAPTIONING = kVar9;
        zza = new k[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9};
    }

    @NonNull
    public static k[] values() {
        return (k[]) zza.clone();
    }
}
