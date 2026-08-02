package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes13.dex */
public final class BaseModel {

    @NonNull
    public static final BaseModel ENTITY_EXTRACTION;

    @NonNull
    public static final BaseModel IMAGE_CAPTIONING;

    @NonNull
    public static final BaseModel TOXICITY_DETECTION;

    @NonNull
    public static final BaseModel TRANSLATE;

    @NonNull
    public static final BaseModel zza;

    @NonNull
    public static final BaseModel zzb;
    private static final /* synthetic */ BaseModel[] zzc;

    static {
        BaseModel baseModel = new BaseModel("FACE_DETECTION", 0);
        zza = baseModel;
        BaseModel baseModel2 = new BaseModel("SMART_REPLY", 1);
        zzb = baseModel2;
        BaseModel baseModel3 = new BaseModel("TRANSLATE", 2);
        TRANSLATE = baseModel3;
        BaseModel baseModel4 = new BaseModel("ENTITY_EXTRACTION", 3);
        ENTITY_EXTRACTION = baseModel4;
        BaseModel baseModel5 = new BaseModel("TOXICITY_DETECTION", 4);
        TOXICITY_DETECTION = baseModel5;
        BaseModel baseModel6 = new BaseModel("IMAGE_CAPTIONING", 5);
        IMAGE_CAPTIONING = baseModel6;
        zzc = new BaseModel[]{baseModel, baseModel2, baseModel3, baseModel4, baseModel5, baseModel6};
    }

    @NonNull
    public static BaseModel[] values() {
        return (BaseModel[]) zzc.clone();
    }
}
