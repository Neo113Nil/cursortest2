package com.socure.docv.capturesdk.core.extractor.model;

import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import kotlin.Metadata;

/* compiled from: BaseExtractedData.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/socure/docv/capturesdk/core/extractor/model/BaseExtractedData;", "", "()V", "scanType", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "getScanType", "()Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "setScanType", "(Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;)V", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class BaseExtractedData {
    public static final int $stable = 8;
    private ScanType scanType;

    public final ScanType getScanType() {
        return this.scanType;
    }

    public final void setScanType(ScanType scanType) {
        this.scanType = scanType;
    }
}
