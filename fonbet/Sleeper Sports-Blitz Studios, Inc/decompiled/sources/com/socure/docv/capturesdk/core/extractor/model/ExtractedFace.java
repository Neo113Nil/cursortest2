package com.socure.docv.capturesdk.core.extractor.model;

import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.face.Face;
import kotlin.Metadata;

/* compiled from: ExtractedFace.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/socure/docv/capturesdk/core/extractor/model/ExtractedFace;", "Lcom/socure/docv/capturesdk/core/extractor/model/BaseExtractedData;", "()V", OptionalModuleUtils.FACE, "Lcom/google/mlkit/vision/face/Face;", "getFace$capturesdk_productionRelease", "()Lcom/google/mlkit/vision/face/Face;", "setFace$capturesdk_productionRelease", "(Lcom/google/mlkit/vision/face/Face;)V", "rotZAxis", "", "getRotZAxis$capturesdk_productionRelease", "()F", "setRotZAxis$capturesdk_productionRelease", "(F)V", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ExtractedFace extends BaseExtractedData {
    public static final int $stable = 8;
    private Face face;
    private float rotZAxis;

    /* renamed from: getFace$capturesdk_productionRelease, reason: from getter */
    public final Face getFace() {
        return this.face;
    }

    public final void setFace$capturesdk_productionRelease(Face face) {
        this.face = face;
    }

    /* renamed from: getRotZAxis$capturesdk_productionRelease, reason: from getter */
    public final float getRotZAxis() {
        return this.rotZAxis;
    }

    public final void setRotZAxis$capturesdk_productionRelease(float f) {
        this.rotZAxis = f;
    }
}
