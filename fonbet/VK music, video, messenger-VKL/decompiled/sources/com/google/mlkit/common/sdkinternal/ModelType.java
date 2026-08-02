package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes13.dex */
public final class ModelType {

    @NonNull
    public static final ModelType BASE;

    @NonNull
    public static final ModelType CUSTOM;

    @NonNull
    public static final ModelType DIGITAL_INK;

    @NonNull
    public static final ModelType ENTITY_EXTRACTION;

    @NonNull
    public static final ModelType IMAGE_CAPTIONING;

    @NonNull
    public static final ModelType TOXICITY_DETECTION;

    @NonNull
    public static final ModelType TRANSLATE;

    @NonNull
    public static final ModelType UNKNOWN;
    private static final /* synthetic */ ModelType[] zza;

    static {
        ModelType modelType = new ModelType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        UNKNOWN = modelType;
        ModelType modelType2 = new ModelType("BASE", 1);
        BASE = modelType2;
        ModelType modelType3 = new ModelType("TRANSLATE", 2);
        TRANSLATE = modelType3;
        ModelType modelType4 = new ModelType("ENTITY_EXTRACTION", 3);
        ENTITY_EXTRACTION = modelType4;
        ModelType modelType5 = new ModelType("CUSTOM", 4);
        CUSTOM = modelType5;
        ModelType modelType6 = new ModelType("DIGITAL_INK", 5);
        DIGITAL_INK = modelType6;
        ModelType modelType7 = new ModelType("TOXICITY_DETECTION", 6);
        TOXICITY_DETECTION = modelType7;
        ModelType modelType8 = new ModelType("IMAGE_CAPTIONING", 7);
        IMAGE_CAPTIONING = modelType8;
        zza = new ModelType[]{modelType, modelType2, modelType3, modelType4, modelType5, modelType6, modelType7, modelType8};
    }

    @NonNull
    public static ModelType[] values() {
        return (ModelType[]) zza.clone();
    }
}
